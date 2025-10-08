import java.util.Arrays;
import java.util.Collections;

public class OrdenarNomes {
    public static void main(String[] args) {
       
        String[] nomes = {"Gabriel", "Ana", "João", "Mariana", "Pedro", "Carla"};
       
        Arrays.sort(nomes); 
        System.out.println("Nomes em ordem crescente (A-Z):");
        for (String nome : nomes) {
            System.out.println(nome);
        }

      
    
        Arrays.sort(nomes, Collections.reverseOrder()); 
        System.out.println("Nomes em ordem decrescente (Z-A):");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}