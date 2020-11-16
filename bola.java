import java.util.Scanner;
class bola {
	public static void main(String[] args){
	Double jari, rumus, hasil;
	
	rumus rum = new rumus();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Masukkan nilai r: ");
	jari = input.nextDouble();
	
	rum.r(jari);
	rum.show();
	rum.nilai(jari);
	}
}