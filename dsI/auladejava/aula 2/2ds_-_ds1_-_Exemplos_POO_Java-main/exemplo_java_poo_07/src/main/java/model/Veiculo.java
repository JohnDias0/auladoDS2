package model;

public class Veiculo {
	public String modelo; 
	public int velocidade;
	
	public Veiculo(String modelo,int v) { 
		this.modelo= modelo;
		this.velocidade= v;
	}
	 public void setVelocidade(int v){
         velocidade= v;
         System.out.println("vruum");
  }
  public int getVelocidade(){
           return velocidade;
  }
  public void carbrand(){
		 System.out.println("Marca do seu Veiculo");
	 }
}
