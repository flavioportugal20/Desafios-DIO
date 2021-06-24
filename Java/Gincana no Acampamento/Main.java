import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<List<Aluno>> listaGrupos = new ArrayList<>();

		String entrada = ler(br);
		while (!entrada.equals("0")) {

			final int N = parseInt(entrada);
			if (validarN(N)) {
				List<Aluno> grupo = gerarGrupo(br, N);
				listaGrupos.add(grupo);
			}
			entrada = ler(br);
		}

		listaGrupos.stream().map(grupo -> "Vencedor(a): ".concat(iniciarGincana(grupo))).forEach(System.out::println);

		br.close();
	}

	static List<Aluno> gerarGrupo(BufferedReader br, int N) throws IOException {
		List<Aluno> grupo = new ArrayList<Aluno>();
		int i = 0;
		while (i < N) {
			StringTokenizer linha = lerST(br);
			if (validarLinha(linha)) {

				String nome = linha.nextToken();
				if (!validarNome(nome)) {
					continue;
				}

				int valor = parseInt(linha.nextToken());
				if (!validarValor(valor)) {
					continue;
				}

				grupo.add(new Aluno(nome, valor));
				i++;
			}
		}
		return grupo;
	}

	static String iniciarGincana(List<Aluno> grupo) {
		if (grupo.isEmpty()) {
			return "Sem vencendor, grupo vazio!";
		}
		int totalValorPlacas = grupo.stream().map(Aluno::getValor).reduce(Integer::sum).orElse(0);
		int totalAlunos = grupo.size();
		int totalSomaPosicoes = IntStream.range(0, totalAlunos).sum();
		int passos = totalValorPlacas - totalSomaPosicoes;
		if (grupo.get(0).getValor() % 2 == 0) {
			passos++;
		}
		int posicaoDoVencedor = passos % totalAlunos;

		return grupo.get(posicaoDoVencedor).getNome();
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

	static boolean validarN(int N) {
		if (N >= 1 && N <= 100) {
			return true;
		}
		System.out.println("O N deve ser (1 ≤ N ≤ 100), insira novamente o um novo N!");
		return false;
	}

	static boolean validarLinha(StringTokenizer linha) {
		if (linha.countTokens() == 2) {
			return true;
		}
		System.out.println("Linha inválida, o Nome e Valor devem estar separados por um espaço!");
		return false;
	}

	static boolean validarNome(String nome) {
		if (nome.matches("[a-zA-Z_\s]+") && nome.length() <= 30) {
			return true;
		}
		System.out.println(
				"O Nome deve conter no máximo 30 caracteres, apenas letras maiúsculas e minúsculas, sem acentos, e o caractere “_”. !");
		return false;
	}

	static boolean validarValor(int valor) {
		if (valor >= 1 && valor <= 500) {
			return true;
		}
		System.out.println("O Valor deve ser (1 ≤ Valor ≤ 500), insira novamente o Nome e um novo Valor!");
		return false;
	}

}

class Aluno {

	private String nome;
	private Integer valor;

	public Aluno(String nome, Integer valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getValor() {
		return valor;
	}

}