package huffman;

public class AnaSınıf {

	public static void main(String[] args) {
		Huffman hman;
		if(args.length==0){
			System.out.println("Kullanım:java AnaSınıf [girişdosyası] [çıkışdosyası]");
			hman = new Huffman();
		}
		else{
			hman=new Huffman(args[0]);
		}
		hman.printInput();
		hman.frequencyCalculate();
		hman.makeQueue();
		hman.buildTree();
		if(args.length==2)
			hman.makeOutputFile(args[1]);
		else
			hman.makeOutputFile("çıkış.txt");
		hman.printEncoded();
		System.out.println("Sıkıştırma oranı: "+hman.getRatio());
	}

}