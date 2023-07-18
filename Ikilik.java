package soyutCalisma;

public class Ikilik implements Fonksiyonlar{
	
	int taban = 2;

	@Override
	public String toBinary(String sayi) {
		
	return sayi;
		
	}

	@Override
	public String toOctal(String sayi) {

	int ondalıkSayi = Integer.parseInt(sayi, taban);
        return Integer.toOctalString(ondalıkSayi);
	    
	}

	@Override
	public String toDecimal(String sayi) {
		
	int ondalıkSayi = Integer.parseInt(sayi, taban);
        return Integer.toString(ondalıkSayi);		

	}

	@Override
	public String toHexadecimal(String sayi) {
		
	int ondalıkSayi = Integer.parseInt(sayi, taban);
        return Integer.toHexString(ondalıkSayi);
        
	}

}
