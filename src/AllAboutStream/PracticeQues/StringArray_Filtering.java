package AllAboutStream.PracticeQues;
import java.util.Arrays;
public class StringArray_Filtering {
    public static void main(String[] args) {

//        we've to print only the String who contains special characters.
        String []na = {"asd", "ssdf@", "131!"};
        //ONE OF THE WAY TO USE STREAM FUNC : we simply pass the object here in the stream

        Arrays.stream(na)
                .filter(name -> containsSpecialCharacters(name))
                .forEach(System.out::println);
    }

    public static boolean containsSpecialCharacters(String input) {
        return input.matches(".*[^a-zA-Z0-9 ].*");
    }
}

