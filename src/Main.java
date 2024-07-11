import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmploeeBook[] emploee = new EmploeeBook[10];
        List <EmploeeBook> emploees = new ArrayList<>();
        emploees.add(new EmploeeBook("Ivanov Ivan Ivanovich", "1", 86811));
        emploees.add(new EmploeeBook("Petrov Petr Petrovich", "2", 80000));
        emploees.add(2, new EmploeeBook("Ivanov Petr Ivanovich", "3", 79500));
        emploees.add(3, new EmploeeBook("Ivanov Ivan Petrovich", "4", 74000));
        emploees.add(4, new EmploeeBook("Kumov Ivan Vasilievich", "5", 84667));
        emploees.add(5, new EmploeeBook("Sizov Petr Olegovich", "5", 73000));
        emploees.add(6, new EmploeeBook("Shlikov Oleg Petrovich", "4", 125400));
        emploees.add(7, new EmploeeBook("Krotov Oleg Ivanovich", "3", 95640));
        emploees.add(8, new EmploeeBook("Vasin Alex Ivanovich", "2", 99800));
        emploees.add(9, new EmploeeBook("Vasin Alex Petrovich", "1", 88500));

        int salaryMinId = 0, salaryMaxId = 0;

        EmploeeService service = new EmploeeService();
        salaryMinId = EmploeeService.getMinSalaryId(emploees);  //
        System.out.println("\nMinId = " + salaryMinId + ", pipl = " + emploees.get(salaryMinId));//.getId()
        System.out.println("emploees length = " + emploees.size());
        EmploeeService.deleteEmploee(emploees, 5);//emploees = (List<EmploeeBook>)
        EmploeeService.deleteEmploee(emploees, 8);
        EmploeeService.deleteEmploee(emploees, 2);
        EmploeeService.deleteEmploee(emploees, 8);
        EmploeeService.deleteEmploee(emploees, 0);
        System.out.println("emploees length = " + emploees.size());

        System.out.println();
        salaryMinId = service.getMinSalaryId(emploees);
        System.out.println("MinId = " + salaryMinId + ", pipl = " + emploees.get(salaryMinId));

        System.out.println();
        for (int i = 0; i < emploees.size(); i++) {
            if (emploees.get(i) != null) {
                System.out.println(emploees.get(i) + ", id = " + emploees.get(i).getId());
            }
        }

        System.out.println();
        EmploeeBook newWrite = new EmploeeBook("Kukin Vasili Kimovich", "4", 100500);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Kukin Sasha Kimovich", "2", 99000);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Kukin Andry Kimovich", "1", 50000);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Kukin Evgeny Kimovich", "5", 13200);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Kukin Maga Kimovich", "1", 16200);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Kukin Nikolay Kimovich", "2", 105000);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Kukin Max Kimovich", "3", 100500);
        EmploeeService.addNewEmploee(emploees, newWrite);
        System.out.print("\nFree cell(s): ");
        boolean isFreeCells = true;
        for (int i = 0; i < emploees.size(); i++) {
            if (emploees.get(i) == null) {
                isFreeCells = false;
                System.out.print(i + ", ");
            }
        }
        if (isFreeCells) {
            System.out.println("No existing free cells, must create new.");
        }
        System.out.println();
        for (int i = 0; i < emploees.size(); i++) {
            if (emploees.get(i) != null) {
                System.out.println(emploees.get(i) + ", id = " + emploees.get(i).getId());
            }
        }
        System.out.println(emploees.size());
    }
}
