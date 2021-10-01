package jogo;

import api.FX_CG_2D_API;
import api.FX_CG_2D_API.Estilo;
import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex_01 extends Application{

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
                retangulo(0, 0, larguraTela(), alturaTela(), Estilo.PREENCHIDO);                           	
                                            
                linha(larguraTela()/2, 0, larguraTela()/2, alturaTela(), Estilo.PREENCHIDO); //Eixo y
                
                linha(0, alturaTela()/2, larguraTela(), alturaTela()/2, Estilo.PREENCHIDO); //Eixo x
	            
                empilhar();
                	contorno(3, Color.BLUE);
                	transladar(larguraTela()/2, alturaTela()/2);
                desempilhar();
                	
//                linha(10, 30, 10, 10);
                
                //pontos azuis na tela	
    			empilhar();
					 contorno(Color.BLUE);
					 ponto(317, 224);
					 ponto(354, 223);
					 ponto(317, 255);
					 ponto(354, 255);
				desempilhar();
				
				// Eixos
                linha(larguraTela()/2, 0, larguraTela()/2, alturaTela(), Estilo.PREENCHIDO);
                linha(0, alturaTela()/2, larguraTela(), alturaTela()/2, Estilo.PREENCHIDO);
                
              
	            
                empilhar();                	
                	transladar(larguraTela()/2, alturaTela()/2);
                	
                	// Riscos dos eixos
                	int resolucao = 30;
                    for(int i= -larguraTela()/2; i < larguraTela()/2; i+=resolucao){
                    	linha(i, -3, i, 3, Estilo.PREENCHIDO);
                    }
                    for(int i= -alturaTela()/2; i < alturaTela()/2; i+=resolucao){
                    	linha(-3, i, 3, i, Estilo.PREENCHIDO);
                    }
                   desempilhar();			ponto(200, 200);
				
									
				//Eixo X = 200(padrão), eixo y = 299 (padrão), criar um ponto a cada 10 pixels
				
			}
			
			@Override
			public void cliqueDoMouse(MouseEvent e) {
				System.out.println(e.getSceneX() + " " + e.getSceneY());
				
			}
			
			@Override
			public void atualizar() {
//				x=+0.1;
				
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
