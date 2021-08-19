package controller;

public class OperacoesController {
	
	public OperacoesController () {
	    super();
   }
   
//  Concatenar 32768 caracteres em uma unica variável string, uma a uma
//	medir o tempo que leva para realizar essa operação
	
     public void concatenaString() {
	     String sequencia = "";
	     double tempoInicial = System.nanoTime(); 
	     for (int i = 0 ; i < 32768 ; i++) {
	         sequencia = sequencia + "x" ;
	     }
	     double tempoFinal = System.nanoTime();
	     double tempoTotal = tempoFinal - tempoInicial;
	     // converter de ns para s. (dividir tempo total / 10^9)
	     tempoTotal = tempoTotal / Math.pow(10,  9);
	     
	     System.out.println("String ==>"+tempoTotal+"s. ");
     }
         public void concatenaBuffer() {
        	 StringBuffer buffer = new StringBuffer();
        	 double tempoInicial = System.nanoTime();
        	 for (int i = 0 ; i < 32768 ; i++) {
        		 buffer.append("x");
        		 
         }
         double tempoFinal = System.nanoTime();
         double tempoTotal = tempoFinal - tempoInicial;
         tempoTotal = tempoTotal / Math.pow(10,  9);
         
         System.out.println("Buffer ==>"+tempoTotal+"s. ");
         
//demonstração da string com split para frases
         
      }
         
      public void divideFrase(String frase) {
    	  String[] vetorFrase = frase.split(" ");
    	  
    	  //int tamanho = vetorFrase.length;
    	  //for (int i = 0 ; i < tamanho ; i++) {
    	  //	  System.out.println(vetorFrase[i]);
    	  
      //}
    	  int cont = 0;
      	  for (String palavra : vetorFrase) {
      		  System.out.print(cont+ " ");
      		  System.out.println(palavra);
      		  cont++;
      	  }
      	}
}
