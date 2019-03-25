import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        AbitList abits = new AbitList(new ArrayList<Abiturient>(Arrays.asList(
            new Abiturient(1, "Ivanov", "Ivan", "Ivanovich",
                    "Grodno","65346436", new int[] {1, 2, 3, 4, 5}),
            new Abiturient(2,"Sidorov","Sergey","Petrovich",
                    "Minsk","22141232", new int[] {3, 4, 5, 6, 7}),
            new Abiturient(3,"Pontar","Anna","Andreevna",
                    "Brest","21421422", new int[] {5, 6, 7, 8, 6}),
            new Abiturient(4,"Sterenkova","Vera","Vladimirovna",
                    "Gomel","24213123", new int[] {8, 9, 10, 9, 9})
        )));
        System.out.println(abits.getAbiturients());
        System.out.println(abits.badGrades());
        System.out.println(abits.enterAmount());
        System.out.println(abits.abiturientCount());
    }
}
