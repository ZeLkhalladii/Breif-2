package breif2;

public class AbstractEmployees {
    public static void main(String[] args) {
        EmployeFixe empFix = new EmployeFixe();
        EmployeCommission EmpCom = new EmployeCommission();
        EmployeeTauxHairaire EmpHour = new EmployeeTauxHairaire();

        empFix.salaire = 340;
        empFix.salaire();


        EmpCom.setVentes(12);
        EmpCom.setSalaire(340);
        EmpCom.salaire();

        

        EmpHour.setHours(14);
        EmpHour.setSalaire(340);
        EmpHour.salaire();

        }
}
