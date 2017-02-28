import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //read file, make new states and write to new text file
        Build b = new Build();
        b.readFile("sampleNFA.txt");
        b.makeNewStates();

    }

}
