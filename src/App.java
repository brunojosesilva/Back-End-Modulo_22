import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        System.out.println("Digite nome e genero separado por -; Digite outro elemento separado por , ");
        Scanner scan = new Scanner(System.in);
        String nomes = scan.next();
        String[] vetorPrincipal = nomes.split(",");

        List<String> lines = Arrays.stream(vetorPrincipal).toList();
        List<String> vetorF = lines.stream()                
                .filter(line -> line.contains("-F"))
                .collect(Collectors.toList());

        System.out.println("Lista de nomes Femininos: ");
        System.out.println(vetorF);

        }
}