import java.util.ArrayList;
import java.util.List;

public class EmploeeService {

    public static int getMinSalaryId(List temp) {
        EmploeeBook emploee;// = new EmploeeBook(null, null, 0);
        int minSalaryId = 0;
        double minSalary = 0;
        for (int i = 0; i < temp.size(); i++) {
            if ((EmploeeBook) temp.get(i) != null) {
                emploee = (EmploeeBook) temp.get(i);
                if (i == 0) {
                    minSalary = emploee.getSalary();
                }
                if (emploee != null) {
                    if (minSalary > emploee.getSalary()) {
                        minSalary = emploee.getSalary();
                        minSalaryId = emploee.getId();
                    }
                }
            }
        }
        return minSalaryId;
    }
    public static void deleteEmploee(List temp, int id) {
        EmploeeBook emploee;
        boolean flag = false;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) != null) {
                emploee = (EmploeeBook) temp.get(i);
                if (emploee.getId() == id) {
                    if (emploee != null) {
                        temp.set(i, null);
                        System.out.println("Emploee with ID: " + id + ", " + emploee.getEmploee() + ", is deleted");
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("There are no emploee with ID: " + id);
        }
    }
    public static void addNewEmploee(List temp, EmploeeBook name) {
        boolean flag = false;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == null) {
                flag = true;
                temp.set(i, name);
                if (flag) {
                    System.out.println("Person with name " + name + " add to cell #" + i);
                }
                break;
            }
        }
        if (!flag) {
            temp.add(name);
            System.out.println("No existing free cells, must create new.");
            System.out.println("Person with name " + name + " add to cell #" + (temp.size() - 1));
        }
    }
    public static void isAFreeCell(List temp) {
        boolean emptyCell = false;
        int totalEmploee = 0;
        List<Integer> freeCells = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == null) {
                emptyCell = true;
                freeCells.add(i);
            } else {
                totalEmploee++;
            }
        }
        if (emptyCell) {
            System.out.println("Free cell(s): " + freeCells);
        } else {
            System.out.println("There are no free cell(s)");
        }
        System.out.println("Total emploees: " + totalEmploee);
    }
}
