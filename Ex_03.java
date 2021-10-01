package jogo;

import api.FX_CG_2D_API;
import api.FX_CG_2D_API.Estilo;
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex_03 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage cena) throws Exception {

		new FX_CG_2D_API("Exemplo_1", cena, 100, 600, 400) {

			@Override
			public void teclaPressionada(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void teclaLiberada(KeyEvent e) {
				// TODO Auto-generated method stub

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

				preenchimento(Color.WHITE);
				retangulo(0, 0, larguraTela(), alturaTela(), Estilo.PREENCHIDO);

				preenchimento(Color.BLACK);

				//R, T, E
				empilhar();				
					escalar(2, 2);
					transladar(150, 20);
					rotacionar(60);
					retangulo(70.10, 20.30, 30.40, 40.10, Estilo.PREENCHIDO);
				desempilhar();
				
				//E, T, R
				empilhar();				
					rotacionar(60);
					transladar(150, 20);
					escalar(2, 2);
					retangulo(70.10, 20.30, 30.40, 40.10, Estilo.PREENCHIDO);
				desempilhar();
			}



			@Override
			public void cliqueDoMouse(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getSceneX() + " " + e.getSceneY());

			}

			@Override
			public void atualizar() {
//			 x+=0.1;

			}

			@Override
			public void acaoAoSair() {
				System.out.println("Saindo...");

			}

			@Override
			public void acaoAoIniciar() {
				System.out.println("Iniciando...");

			}
		};
	}

}
