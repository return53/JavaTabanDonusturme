package soyutCalisma;


public class OnAltilik implements Fonksiyonlar{
	
	int taban = 16;

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
		
		int decimal = Integer.parseInt(sayi, taban);
	        return Integer.toString(decimal);
        
	}

	@Override
	public String toHexadecimal(String sayi) {
		
		return sayi;
		
	}

}
