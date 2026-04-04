public class array {

	public static void main(String[] args) {
		char [] letras = { 'A', 'B', 'C'};
		
		for(int i = 0; i< letras.length; i++) {
            if(i < letras.length - 1)
			    System.out.print(letras[i] + "-");
            else
                System.out.print(letras[i]);
		}
	}
}