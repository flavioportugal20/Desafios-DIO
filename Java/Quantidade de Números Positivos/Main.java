import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cont = 0;
		int totalEntradas = 6;
		for(int i=0; i<totalEntradas; i++) {
			double entrada = Double.parseDouble(ler(br));
			if (entrada>0) {
				cont++;
			}
		}
		System.out.printf("%d valores positivos", cont);
		br.close();
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

}