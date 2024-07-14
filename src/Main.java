import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //EmploeeBook[] emploee = new EmploeeBook[10];
        List <EmploeeBook> emploees = new ArrayList<>();
        emploees.add(new EmploeeBook("Ivanov Ivan Ivanovich", "1", 86811));
        emploees.add(new EmploeeBook("Petrov Petr Petrovich", "2", 80000));
        emploees.add(new EmploeeBook("Ivanov Petr Ivanovich", "3", 79500));
        emploees.add(new EmploeeBook("Ivanov Ivan Petrovich", "4", 74000));
        emploees.add(new EmploeeBook("Kumov Ivan Vasilievich", "5", 84667));
        emploees.add(new EmploeeBook("Sizov Petr Olegovich", "5", 73000));
        emploees.add(new EmploeeBook("Shlikov Oleg Petrovich", "4", 125400));
        emploees.add(new EmploeeBook("Krotov Oleg Ivanovich", "3", 95640));
        emploees.add(new EmploeeBook("Vasin Alex Ivanovich", "2", 99800));
        emploees.add(new EmploeeBook("Vasin Alex Petrovich", "1", 88500));
        EmploeeService.isAFreeCell(emploees);

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

        EmploeeService.isAFreeCell(emploees);

        //printName(emploees);

        System.out.println();
        salaryMinId = service.getMinSalaryId(emploees);
        System.out.println("MinId = " + salaryMinId + ", pipl = " + emploees.get(salaryMinId));

        //printName(emploees);

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
        newWrite = new EmploeeBook("Kukin Nikolay Kimovich", "2", 87000);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Kukin Max Kimovich", "3", 80000);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Igogoshin Egor Valerich", "4", 70000);
        EmploeeService.addNewEmploee(emploees, newWrite);
        newWrite = new EmploeeBook("Igogoshin Savr Valerich", "1", 110000);
        EmploeeService.addNewEmploee(emploees, newWrite);
        EmploeeService.isAFreeCell(emploees);

        //System.out.print("\nFree cell(s): ");

        EmploeeService.deleteEmploee(emploees, 6);
        EmploeeService.deleteEmploee(emploees, 9);
        EmploeeService.deleteEmploee(emploees, 3);

        EmploeeService.isAFreeCell(emploees);
    }
    public static void printName(List emploee) {
        List<EmploeeBook> emplo = new ArrayList<>();
        emplo = emploee;
        for (int j = 0; j < emplo.size(); j++) {
            if (emplo.get(j) != null) {
                System.out.println(emplo.get(j) + ", id = " + emplo.get(j).getId());
            }
        }
        System.out.println("ID size = " + emploee.size());
    }
}
