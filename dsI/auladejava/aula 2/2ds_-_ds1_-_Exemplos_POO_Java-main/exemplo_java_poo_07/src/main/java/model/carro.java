package model;

public class carro extends Veiculo{ //A classe carro é uma classe filha de Veiculo 
	 public int marcha;

	 public carro(String modelo,int v, int marcha) { //Os métodos  modelo e velocidades exportados 
		 super (modelo,v); //é usada para se referir à classe pai 
	 }
	 public void setVelocidade(int v) { //o método setVelocidade foi reescrito 
     velocidade= v;

     if(velocidade>=20 && velocidade<40){
         marcha=2;
         
   }
     if(velocidade<20) {
       marcha=1;
       
     }	
	 if(velocidade>=40){
         marcha=3;
         }
      }
	 public void passmarc() {
		 System.out.println(marcha);
		 }
	 public void carbrand(){ // Ocorre a sobrebosição dos método carbrand 
		 System.out.println("A marca do seu carro é um corsa");
	 }
		 
	 
}
