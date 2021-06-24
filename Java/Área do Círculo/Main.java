import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			double raio = Double.valueOf(ler(br));
			Double area = 3.14159 * (Math.pow(raio, 2));
			System.out.printf("A=%.4f\n", area);
		} catch (NumberFormatException nfe) {
			System.out.println("Formato incorreto!");
		}

		br.close();
	}
	
	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}
}