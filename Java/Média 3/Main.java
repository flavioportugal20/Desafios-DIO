import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
    double mediaPonderada, exame, mediaFinal;
    float[] pesos = {2.0f, 3.0f, 4.0f, 1.0f};
	float[] notas = new float[pesos.length];
    StringTokenizer stNotas = lerST(br);
    
    int i = 0;
		while (stNotas.hasMoreTokens()) {
		  if (i >= notas.length) {
				System.out.println("Quantidade de notas diferente da quantidade de pesos!");
				return;
			}
			notas[i] = Float.valueOf(stNotas.nextToken());
			i++;
		}
    
    mediaPonderada = calcularMediaPonderada(notas, pesos);
    System.out.printf("Media: %.1f\n" , mediaPonderada);

    if (mediaPonderada >= 7.0) {
      System.out.printf("Aluno aprovado.\n");
    } else if (mediaPonderada < 5.0) {
      System.out.println("Aluno reprovado.\n");
    }else if (mediaPonderada >= 5.0 && mediaPonderada <= 6.9) {

      System.out.printf("Aluno em exame.\n");
      exame = Double.valueOf(ler(br));
      System.out.printf("Nota do exame: %.1f\n", exame);

      mediaFinal = (mediaPonderada + exame) / 2;

      if (mediaFinal >= 5.0) {
        System.out.printf("Aluno aprovado.\n");
      } else if (mediaFinal < 5.0) {
        System.out.printf("Aluno reprovado\n");
      }      
      System.out.printf("Media final: %.1f\n", mediaFinal);
    }

    br.close();
  }
  
  static float calcularMediaPonderada(float[] notas, float[] pesos) {
		float somaNotasXPesos = 0.0f;
		float totalPesos = 0.0f;
		for (int i=0; i<pesos.length; i++) {
			somaNotasXPesos += notas[i] * pesos[i];
			totalPesos += pesos[i];
		}
		return somaNotasXPesos / totalPesos;
	}
	
	static String ler(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine()).nextToken();
	}
	
	static StringTokenizer lerST(BufferedReader br) throws IOException {
		return new StringTokenizer(br.readLine());
	}

}