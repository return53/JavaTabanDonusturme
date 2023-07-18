package soyutCalisma;

public class Sekizlik implements Fonksiyonlar{
	
	int taban = 8;

	@Override
	public String toBinary(String sayi) {
		
		int decimal = Integer.parseInt(sayi, taban);
        return Integer.toBinaryString(decimal);

	}

	@Override
	public String toOctal(String sayi) {
		
		return sayi;

	}
	
	@Override
	public String toDecimal(String sayi) {
		
		int decimal = Integer.parseInt(sayi, taban);
        return Integer.toString(decimal);
        
	}

	@Override
	public String toHexadecimal(String sayi) {
		
		int decimal = Integer.parseInt(sayi, taban);
        return Integer.toHexString(decimal);

	}

}