package Implementations;

/**
 * Clasa folosita pentru a vedea daca media numarului de ore suplimentare pentru angajati
 * este mai mare decat cea a managerilor.
 */
public class MostHardworkingEmployeeFinder implements Visitor {
    private static int employeeSum=0;
    private static int managerSum=0;
    private static int managerCount=0;
    private static int employeeCount=0;
    @Override
    public void visit(Employee employee) {
        employeeSum+=employee.getExtraHours();
        employeeCount++;
    }

    @Override
    public void visit(Manager manager) {
        managerSum+=manager.getExtraHours();
        managerCount++;
    }

    @Override
    public void visit(Intern intern) {
        System.out.println("Interns don't work extra hours");
    }

    public boolean isManagerHardWorking() {
        if(managerSum/managerCount>employeeSum/employeeCount)
            return true;
        return false;
    }
}
