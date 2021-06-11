import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		Locale.setDefault(new Locale("en", "US"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), "\\.|-");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		br.close();
	}

}