package jogo;

import java.util.LinkedList;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

import api.FX_CG_2D_API;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex_04_JOGO extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage cena) throws Exception {
		final int largura = 600, altura = 400, fps = 100;
		new FX_CG_2D_API("Exemplo_1", cena, 100, 600, 400) {
			// Variáveis de controle do "jogo"
			boolean colidindo = false;
			boolean up = false;
			boolean down = false;
			boolean left = false;
			boolean right = false;

			// posição do personagem
			double x = 10;
			double y = 10;

			// controle de colisões
			LinkedList<Rectangle2D> colisores;
			Rectangle2D personagem;
			Rectangle2D linhaCima1;
			Rectangle2D linhaCima2;
			Rectangle2D linhaVertical1;
			Rectangle2D linhaVertical2;
			Rectangle2D linhaBaixo1;
			Rectangle2D linhaBaixo2;

			Rectangle2D linhaVertical3;
			Rectangle2D linhaVertical4;

			Rectangle2D linhaCima3;
			Rectangle2D linhaCima4;

			Rectangle2D linhaVertical5;
			Rectangle2D linhaVertical6;

			Rectangle2D linhaBaixo3;
			Rectangle2D linhaBaixo4;

			Rectangle2D linhaVertical7;
			Rectangle2D linhaVertical8;

			Rectangle2D linhaCima5;
			Rectangle2D linhaCima6;

			@Override
			public void teclaPressionada(KeyEvent e) {
				if (e.getCode() == KeyCode.UP) {
					up = true;
				}

				if (e.getCode() == KeyCode.DOWN) {
					down = true;
				}

				if (e.getCode() == KeyCode.LEFT) {
					left = true;
				}

				if (e.getCode() == KeyCode.RIGHT) {
					right = true;
				}

			}

			@Override
			public void teclaLiberada(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getCode() == KeyCode.UP) {
					up = false;
				}

				if (e.getCode() == KeyCode.DOWN) {
					down = false;
				}

				if (e.getCode() == KeyCode.LEFT) {
					left = false;
				}

				if (e.getCode() == KeyCode.RIGHT) {
					right = false;
				}
			}

			@Override
			public void teclaDigitada(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void movimentoDoMousePressionado(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void movimentoDoMouse(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void desenhar() {

				// limpando a tela
				preenchimento(Color.WHITE);
				retangulo(0, 0, larguraTela(), alturaTela(), Estilo.PREENCHIDO);

				preenchimento(Color.BLACK);
				// Rectangle2D linhaCima1 = new Rectangle2D(10, 10, 120, 5);
				retangulo(linhaCima1, Estilo.PREENCHIDO);

				// Rectangle2D linhaCima2 = new Rectangle2D(10, 30, 100, 5);
				retangulo(linhaCima2, Estilo.PREENCHIDO);

				retangulo(linhaCima3, Estilo.PREENCHIDO);
				retangulo(linhaCima4, Estilo.PREENCHIDO);

				retangulo(linhaCima5, Estilo.PREENCHIDO);
				retangulo(linhaCima6, Estilo.PREENCHIDO);

//				preenchimento(Color.GREEN);
				// Rectangle2D linhaVertical1 = new Rectangle2D(130, 10, 5, 100);
				retangulo(linhaVertical1, Estilo.PREENCHIDO);

				// Rectangle2D linhaVertical2 = new Rectangle2D(110, 30, 5, 100);
				retangulo(linhaVertical2, Estilo.PREENCHIDO);

				retangulo(linhaVertical3, Estilo.PREENCHIDO);
				retangulo(linhaVertical4, Estilo.PREENCHIDO);

				retangulo(linhaVertical5, Estilo.PREENCHIDO);
				retangulo(linhaVertical6, Estilo.PREENCHIDO);

				retangulo(linhaVertical7, Estilo.PREENCHIDO);
				retangulo(linhaVertical8, Estilo.PREENCHIDO);

//				preenchimento(Color.BLUE);
//				Rectangle2D linhaBaixo1 = new Rectangle2D(110, 130, 140, 5);
				retangulo(linhaBaixo1, Estilo.PREENCHIDO);

				// Rectangle2D linhaBaixo2 = new Rectangle2D(130, 110, 120, 5);
				retangulo(linhaBaixo2, Estilo.PREENCHIDO);

				retangulo(linhaBaixo3, Estilo.PREENCHIDO);

				retangulo(linhaBaixo4, Estilo.PREENCHIDO);

				// desenhaPersonagem();

				for (Rectangle2D colisor : colisores) {
					colidindo = colisao(personagem, colisor);
					if (!colidindo) {
						desenhaPersonagem();
					} else {
//						texto("COLIDIU", 200, 300, 50);
						x--;
						personagem = new Rectangle2D(x, y, 15, 15);
						colidindo = colisao(personagem, colisor);
					}
					if (colidindo) {
						x++;
						y--;
						personagem = new Rectangle2D(x, y, 15, 15);
						colidindo = colisao(personagem, colisor);
						if (colidindo) {
							y++;
							x++;
							personagem = new Rectangle2D(x, y, 15, 15);
							colidindo = colisao(personagem, colisor);
							if (colidindo) {
								x--;
								y++;
							}
						}
					}
				}
			}

			public void desenhaPersonagem() {
				personagem = new Rectangle2D(x, y, 15, 15);
				empilhar();
				preenchimento(Color.YELLOW);
				contorno(Color.BLACK);
				retangulo(personagem, Estilo.PREENCHIDO);
				retangulo(personagem, Estilo.LINHAS);
				desempilhar();
			}

			@Override
			public void cliqueDoMouse(MouseEvent e) {
				System.out.println(e.getSceneX() + " " + e.getSceneY());

			}

			@Override
			public void atualizar() {
				if (x > largura || x < 0) {
					x = 10;
				}

				if (y > altura || y < 0) {
					y = 10;
				}

				if (up && !colidindo) {
					y--;
				}

				if (down && !colidindo) {
					y++;
				}

				if (right && !colidindo) {
					x++;
				}

				if (left && !colidindo) {
					x--;
				}
			}

			@Override
			public void acaoAoSair() {
				System.out.println("Saindo...");

			}

			@Override
			public void acaoAoIniciar() {
				System.out.println("Iniciando...");
				personagem = new Rectangle2D(x, y, 15, 15);
				colisores = new LinkedList<Rectangle2D>();

				linhaCima1 = new Rectangle2D(10, 10, 120, 5);
				linhaCima2 = new Rectangle2D(10, 30, 100, 5);
				linhaVertical1 = new Rectangle2D(130, 10, 5, 100);
				linhaVertical2 = new Rectangle2D(110, 30, 5, 106);
				linhaBaixo1 = new Rectangle2D(110, 130, 140, 5);
				linhaBaixo2 = new Rectangle2D(130, 110, 141, 5);

				linhaVertical3 = new Rectangle2D(271, 110, 5, 100);
				linhaVertical4 = new Rectangle2D(250, 130, 5, 100);

				linhaCima3 = new Rectangle2D(270, 208, 50, 5);
				linhaCima4 = new Rectangle2D(250, 227, 90, 5);

				linhaVertical5 = new Rectangle2D(318, 111, 5, 100);
				linhaVertical6 = new Rectangle2D(340, 137, 5, 95);

				linhaBaixo3 = new Rectangle2D(343, 137, 50, 5);
				linhaBaixo4 = new Rectangle2D(320, 110, 100, 5);

				// mais uma verticalll
				linhaVertical7 = new Rectangle2D(418, 110, 5, 100);
				linhaVertical8 = new Rectangle2D(392, 137, 5, 95);

				linhaCima5 = new Rectangle2D(421, 207, 120, 5);
				linhaCima6 = new Rectangle2D(393, 230, 150, 5);

				colisores.add(linhaCima1);
				colisores.add(linhaCima2);
				colisores.add(linhaVertical1);
				colisores.add(linhaVertical2);
				colisores.add(linhaBaixo1);
				colisores.add(linhaBaixo2);

				colisores.add(linhaVertical3);
				colisores.add(linhaVertical4);

				colisores.add(linhaCima3);
				colisores.add(linhaCima4);

				colisores.add(linhaVertical5);
				colisores.add(linhaVertical6);

				colisores.add(linhaBaixo3);
				colisores.add(linhaBaixo4);

				colisores.add(linhaVertical7);
				colisores.add(linhaVertical8);

				colisores.add(linhaCima5);
				colisores.add(linhaCima6);

			}
		};
	}

}
