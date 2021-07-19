import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
  public static void main(String[] args) throws IOException {
	  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int nColaborador = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int horasTrabalhadas = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    double valorHora = Double.parseDouble(st.nextToken());

    double salary = valorHora * horasTrabalhadas;
    System.out.println("NUMBER = " + nColaborador);
    System.out.printf("SALARY = U$ %.2f", salary);
    
    br.close();
  }
  
}