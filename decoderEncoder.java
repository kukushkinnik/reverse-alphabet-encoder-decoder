import java.util.Scanner;

public  class  Test {

    final static char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S','T', 'U','V','W','X','Y','Z',
    'a','b','c','d','e','f','g','h', 'i','j', 'k','l', 'm', 
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    final static char[] reversedAlphabet = {'Z','Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q',
     'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A',
     'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n',
     'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";

        System.out.println("Reverse Alphabet Encoder - Decoder");
        System.out.println("List of commands: ");
        System.out.println("1.Encode - encodes given word or sentence");
        System.out.println("2.Decode - decodes given word or setence");

        while(true) {
            String command = scanner.nextLine();

            if(command.equals("end")) {
                break;
            }

            if(command.equalsIgnoreCase("encode")) {
                System.out.print("Please give a word to encode: ");
                word = scanner.nextLine();
               String encodedWord =  encoderDecoder(word);
               System.out.println("Encoded word is " + encodedWord);
               System.out.println();
            }

            if(command.equalsIgnoreCase("decode")) {
                System.out.print("Please give a word to decode: ");
                word = scanner.nextLine();
               String decodedWord =  encoderDecoder(word);
               System.out.println("Decoded word is " + decodedWord);
               System.out.println();
            }
        }    
    }
    

    public static String encoderDecoder(String message) {
        char[] lettersFromWord = message.toCharArray();
        String target = "";
        for (int i = 0;i < lettersFromWord.length; i++) {
            for (int j = 0; j < reversedAlphabet.length; j++) {
                if(lettersFromWord[i] == alphabet[j]) {
                    target += reversedAlphabet[j];
                }
            }
        }
        return target;        
    }
}
