package jogo;

import api.FX_CG_2D_API;
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exemplo extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage cena) throws Exception {
		
			new FX_CG_2D_API("Exemplo_1", cena, 100, 600, 400) {
			
			double x = 0.0;
				
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
				retangulo(0, 0, larguraTela(), alturaTela(), Estilo.PREENCHIDO); //Garante que a tela será limpada de branco
				
				/*Método Contorno, que pode receber
				como parâmetros a cor desejada e a espessura da linha a
				ser usada. Para mudar a cor de preenchimento de uma
				forma, é disponibilizado o método preenchimento, que
				recebe como argumento a cor a ser utilizada.*/
				
				/*
				 Os métodos para renderizar formas no canvas são: circulo,
					retangulo, linha, ponto, texto e imagem.
					◦ Além disso, um método chamado colisao é fornecido, para tratar
					colisão entre formas retangulares, muito utilizado em jogos. 		 
				 */
				empilhar();
					 contorno(Color.BLUE);
					 ponto(50, 50);
				desempilhar();
				
				
				contorno(Color.RED);
				linha(100, 100, 300, 100);
				contorno(Color.GREEN);
				ponto(x,200);
				
//				linha(10, 30, 10, 10);
				
			}
			
			@Override
			public void cliqueDoMouse(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
