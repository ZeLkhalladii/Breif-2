package breif2;

public abstract class Employee{
    double salaire;

    public void slaire(){
        System.out.println(salaire);
    }

    public abstract void salaire();
}



class EmployeFixe extends Employee{
    double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public void salaire() {
        System.out.println("le salaire EmployeFixe est: " + this.salaire);
    }
}
class EmployeCommission  extends Employee{
    double salaire;
    int ventes;
    int Commission = 12*(10/100);


    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire + (double) this.ventes *((double) Commission);
    }

    public int getVentes() {
        return ventes;
    }

    public void setVentes(int ventes) {
        this.ventes = ventes;
    }

    @Override
    public void salaire() {
        System.out.println("le salaire EmployeCommission est: " + this.salaire + " avec " + ventes + " ventes");
    }
}
class EmployeeTauxHairaire extends Employee{
    double salaire;
    int hours;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire * (double) this.hours;
    }

    @Override
    public void salaire(){
        System.out.println("le salaire EmployeeTauxHairaire est: " + this.salaire + " de " + hours + " hours");
    }
}