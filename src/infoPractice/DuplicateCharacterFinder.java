package infoPractice;

public class DuplicateCharacterFinder {
    public static void findDuplicatesUsingTwoLoops(String input) {
        char[] ch = input.toCharArray();
        
        //int length = characters.length;

        System.out.print("Duplicate Characters using Two Loops: ");
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.print(ch[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String input = "programmingisthekeyofsuccess";
        findDuplicatesUsingTwoLoops(input);
    }
}
