import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	  
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int par = 0;
		int impar = 0; 
		int positvo = 0; 
		int negativo = 0;
		  
		for(int i=0; i<5; i++) {
			int x = Integer.parseInt(ler());
			if(x%2 == 0){
				par++;
			}else{
				impar++;
			}		    	
			if(x>0){
				positvo++;
			}else if(x<0){
				negativo++;
			}		    	  	
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positvo + " valor(es) positivo(s)");
		System.out.println(negativo+ " valor(es) negativo(s)");
		  
		br.close();      
	}
	
	static String ler() throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}
	
}