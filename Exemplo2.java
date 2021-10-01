package jogo;

import api.FX_CG_2D_API;
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exemplo2 extends Application{

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
				
				//Transaladar -> eixo x= 100, eixo y = 0
				//y cresce para baixo
				
				empilhar();
					transladar(100,100);
					retangulo(0,0,200,200,Estilo.PREENCHIDO);
				desempilhar();
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
