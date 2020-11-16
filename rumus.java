public class rumus extends volumbola {
	private double hasil;
	double pi = 3.14;
	
	void show() {
		System.out.println("Rumusnya adalah (4/3)*pi*jari^3");
	}
	
	void nilai(double jari) {
	System.out.println("Hasilnya adalah: "+((4/3)*pi*jari*jari*jari));
	}
}