package Day_1208;

public class C03 {

	public static void main(String[] args) {
		/*Bir String icerisinde yinelenen karakterleri d�nd�ren bir kod yaz�niz.(m�lakat Sorusu)
		Input :
		String str=�Javaisalsoeasy�
		Output: a s   */
		
		String str="Javaisalsoeas";
		String yeni= "";
		
		for (int i = 0; i < str.length(); i++) {
			
			 if (!yeni.contains(str.substring(i, i + 1))) {//sonu� metni str'nin

	                yeni += str.substring(i, i + 1);
			}
			
			
		
		System.out.println(yeni);
	}

}
}
