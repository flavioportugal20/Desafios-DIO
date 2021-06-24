import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			int totalGrupo = parseInt(ler(br));		
			if(validarL(totalGrupo)) {
				int maiorVelocidade = 0;			
				StringTokenizer vi = lerST(br);
				
				if(validarVi(vi.countTokens()) && checkCadastroVelocidades(totalGrupo,vi.countTokens())) {
					
					while (vi.hasMoreTokens()) {
						int velocidade = Integer.valueOf(vi.nextToken());				
						maiorVelocidade = (maiorVelocidade < velocidade) ? velocidade: maiorVelocidade;	
					}					
					System.out.println(identificarNivel(maiorVelocidade));				
				}				
			}
		} while (br.ready());
	
		br.close();
	}

	static Integer identificarNivel(int velocidade) {
		if(velocidade >= 20) {
			return 3;
		}else if(velocidade < 20 && velocidade >= 10) {
			return 2;
		}else {
			return 1;
		}
	}

	static Integer parseInt(String numero) {
		try {
			return Integer.valueOf(numero);
		} catch (NumberFormatException nfe) {
			System.out.println("Formato de número incorreto!");
			return 0;
		}
	}

	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}

	static StringTokenizer lerST(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine());
	}

	static boolean checkCadastroVelocidades(int totalGrupo, int nVelocidades) {
		if (totalGrupo == nVelocidades) {
			return true;
		}
		System.out.println("A lista de velocidade não corresponde com o total de tartarugas no grupo!");
		return false;
	}
	
	static boolean validarL(int valor) {
		if (valor >= 1 && valor <= 500) {
			return true;
		}
		System.out.println("O Valor deve ser (1 ≤ L ≤ 500), insira novamente o valor!");
		return false;
	}
	
	static boolean validarVi(int valor) {
		if (valor >= 1 && valor <= 50) {
			return true;
		}
		System.out.println("O Valor deve ser (1 ≤ Vi ≤ 50), insira novamente o valor!");
		return false;
	}

}
