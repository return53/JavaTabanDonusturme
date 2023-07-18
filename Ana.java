package soyutCalisma;

public class Ana {

	public static void main(String[] args) {
		
		//ikilik binary		
		Ikilik ikilik = new Ikilik();
		
		String binary = ikilik.toBinary("110101");
		System.out.println(binary);
		
		String octal = ikilik.toOctal("110101");
		System.out.println(octal);
		
		String decimal = ikilik.toDecimal("110101");
		System.out.println(decimal);
		
		String hexaDecimal = ikilik.toHexadecimal("110101");
		System.out.println(hexaDecimal);
		
		// sekizlik octal
		System.out.println("\n");		
		Sekizlik sekizlik = new Sekizlik();
		
		binary = sekizlik.toBinary("65");
		System.out.println(binary);
		
		octal = sekizlik.toOctal("65");
		System.out.println(octal);
		
		decimal = sekizlik.toDecimal("65");
		System.out.println(decimal);
		
		hexaDecimal = sekizlik.toHexadecimal("65");
		System.out.println(hexaDecimal);
		
		// onluk decimal
		System.out.println("\n");		
		Onluk onluk = new Onluk();
		
		binary = onluk.toBinary("53");
		System.out.println(binary);
		
		octal = onluk.toOctal("53");
		System.out.println(octal);
		
		decimal = onluk.toDecimal("53");
		System.out.println(decimal);
		
		hexaDecimal = onluk.toHexadecimal("53");
		System.out.println(hexaDecimal);
		
		// onaltılık hexadecimal
		System.out.println("\n");		
		OnAltilik onaltilik = new OnAltilik();
		
		binary = onaltilik.toBinary("35");
		System.out.println(binary);
		
		octal = onaltilik.toOctal("35");
		System.out.println(octal);
		
		decimal = onaltilik.toDecimal("35");
		System.out.println(decimal);
		
		hexaDecimal = onaltilik.toHexadecimal("35");
		System.out.println(hexaDecimal);

	}

}
