import java.util.*;

public class AbitList {
    private ArrayList<Abiturient> abiturients;

    public AbitList(ArrayList<Abiturient> abits) {
        abiturients = abits;
    }

    public ArrayList<Abiturient> getAbiturients() {
        return abiturients;
    }

    public ArrayList<Abiturient> Example () {
        ArrayList<Abiturient> filtered = new ArrayList<>();

        for (Abiturient abit : getAbiturients()) {
            if(abit.getFirstname().startsWith("S")) {
                filtered.add(abit);
            }
        }
        return filtered;
    }

    public ArrayList<Abiturient> badGrades () {
        System.out.println();
        System.out.println("People with bad grades are:");
        ArrayList<Abiturient> filtered = new ArrayList<>();
        for (Abiturient abit : getAbiturients()) {
            for (int i = 0; i < 5; i++) {
                if(abit.getGrades()[i] < 4) {
                    filtered.add(abit);
                    break;
                }
            }
        }
        return filtered;
    }

    public ArrayList<Abiturient> enterAmount () {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the desired amount of grades ");
        int n = sc.nextInt();
        System.out.println("People with amount of grades which is more than was entered are:");
        ArrayList<Abiturient> filtered = new ArrayList<>();
        for (Abiturient abit : getAbiturients()) {
            int amount = 0;
            for (int i = 0; i < 5; i++) {
                amount += abit.getGrades()[i];
            }
            if(amount > n) filtered.add(abit);
        }
        return filtered;
    }

    public ArrayList<Abiturient> abiturientCount () {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the desired amount of abiturients ");
        int n = sc.nextInt();
        int[] amountFiltered = new int [5];
        int k=0;
        for (Abiturient abit : getAbiturients()) {
            int amount = 0;
            for (int i = 0; i < 5; i++) {
                amount += abit.getGrades()[i];
            }
            amountFiltered[k] = amount;
            k++;
        }
        Arrays.sort(amountFiltered);
        ArrayList<Abiturient> filtered = new ArrayList<>();
        k=4;
        int x=0;
        while (x < n) {
            for (Abiturient abit : getAbiturients()) {
                int amount = 0;
                for (int i = 0; i < 5; i++) {
                    amount += abit.getGrades()[i];
                }
                if (amount == amountFiltered[k]) {
                    filtered.add(abit);
                    k--;
                    x++;
                    break;
                }
            }
        }
        System.out.println(n+ " people with max amount of grades are:");
        return filtered;
    }

}
