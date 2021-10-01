package jogo;

import api.FX_CG_2D_API;
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex_00 extends Application{

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
				
    			empilhar();
					 contorno(Color.BLUE);
					double p1 = 0.0;
					double p2 = 2.2;
					double p3 = 2.0;
					double p4 = 4.2;
					linha(0, 2 ,0, 2);
					desempilhar();
				
				
				
			}
			
			@Override
			public void cliqueDoMouse(MouseEvent e) {
				System.out.println(e.getSceneX() + " " + e.getSceneY());
				
			}
			
			@Override
			public void atualizar() {
				x=+0.1;
				
			}
			
			@Override
			public void acaoAoSair() {
//				texto("Saindo...", 500, 387, 10);
				
				System.out.println("Saindo...");
				
			}
			
			@Override
			public void acaoAoIniciar() {
				System.out.println("Iniciando...");
				
//				texto("Iniciando...", 500, 387, 10);
				
			}
		};
	}

}

//1° De 10 em 10 pixels, um ponto
//2° 4 pontos azuis na tela
