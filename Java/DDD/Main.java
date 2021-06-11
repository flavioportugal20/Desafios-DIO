import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> destinations = new HashMap<>();
		destinations.put(61, "Brasilia");
		destinations.put(71, "Salvador");
		destinations.put(11, "Sao Paulo");
		destinations.put(21, "Rio de Janeiro");
		destinations.put(32, "Juiz de Fora");
		destinations.put(19, "Campinas");
		destinations.put(27, "Vitoria");
		destinations.put(31, "Belo Horizonte");

		StringTokenizer st = new StringTokenizer(br.readLine());
		int DDD = Integer.parseInt(st.nextToken());
		if (destinations.containsKey(DDD)) {
			System.out.println(destinations.get(DDD));
		} else {
			System.out.println("DDD nao cadastrado");
		}
		br.close();
	}

}