package soyutCalisma;

public class Onluk implements Fonksiyonlar{
	
	int taban = 10;

	@Override
	public String toBinary(String sayi) {
		
		int decimal = Integer.parseInt(sayi, taban);
        return Integer.toBinaryString(decimal);
        
	}

	@Override
	public String toOctal(String sayi) {
		
		int decimal = Integer.parseInt(sayi, taban);
        return Integer.toOctalString(decimal);
        
	}

	@Override
	public String toDecimal(String sayi) {
		
        return sayi;
		
	}

	@Override
	public String toHexadecimal(String sayi) {
		
		int decimal = Integer.parseInt(sayi, taban);
        return Integer.toHexString(decimal);
        
	}

}