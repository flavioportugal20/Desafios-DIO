import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Locale;

public class Main{	

    public static void main(String[] args) throws IOException {      
      Locale.setDefault(new Locale("pt", "BR"));
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int resto = 0;
	    int valor = Integer.parseInt(st.nextToken());
	    if(validarValor(valor)){
		    List<Integer> notas = Arrays.asList(100, 50, 20, 10, 5, 2, 1);
		    System.out.println(valor);
		    for(Integer item : notas){
		    	int totalNota = valor / item;
		    	System.out.printf("%d nota(s) de R$ %.2f\n", totalNota, (float)item);
		    	valor -= item * totalNota;
		    }
	    }
	    
      br.close();    
    } 
    
    static boolean validarValor(int N) {
		if (N > 0 && N < 1000000) {
			return true;
		}
		System.out.println("O Valor deve ser (0 < N < 1000000), insira novamente o Valor!");
		return false;
	}	
}