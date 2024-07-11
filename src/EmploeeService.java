import java.util.List;

public class EmploeeService {

    public static int getMinSalaryId(List temp) {
        EmploeeBook emploee;// = new EmploeeBook(null, null, 0);
        int minSalaryId = 0, minSalary = 0;
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
            if ((EmploeeBook) temp.get(i) != null) {
                emploee = (EmploeeBook) temp.get(i);
                if (emploee.getId() == id) {
                    if (emploee != null) {
                        temp.set(i, null);
                        System.out.println("Emploee with ID: " + id + " is deleted");
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
                System.out.println("Person with name " + name + " add at cell #" + i);
                break;
            }
        }
        if (!flag) {
            temp.add(name);
            System.out.println("Person with name " + name + " add at cell #" + temp.size());
        }
    }
}
