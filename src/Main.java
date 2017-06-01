import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;

        System.out.print("Input string length: ");
        int strlen = Integer.parseInt(reader.readLine());

        System.out.print("Input substring length(please, less, that string length): ");
        int substrlen = Integer.parseInt(reader.readLine());

        String[] str = new String[strlen];
        String[] substr = new String[substrlen];

        System.out.println("Input string(character-by-character):");
        for (int i = 0; i < strlen; i++) {
            str[i] = reader.readLine();
        }

        System.out.println("Input substring(character-by-character):");
        for (int i = 0; i < substrlen; i++) {
            substr[i] = reader.readLine();
        }

        for (int i = 0; i < strlen; i++) {
            if (substr[0].equals(str[i])) {
                b = (i+1);


                for (int j = 0; j < substrlen; j++) {
                    if(str[i+j].equals(substr[j])){
                        a++;
                    }
                }
            }
        }

        if(a==substr.length) {
            System.out.println("Success! String include substring.");
            System.out.println("Entrance index in string: " + b);
        }
        else
            System.out.println(-1);
    }

}
