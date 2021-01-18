
package ruletka;


public class Ruletka {
    private int Konto;
    private int spinCount;
    
    public Ruletka(int Konto) {
        this.Konto = Konto;
        this.spinCount = 0;
    }
    
    public void turn() {
        int spinNumber = spin();
        System.out.println(toString());
        System.out.println(" Vyhravajuce čislo je " + spinNumber);
    }
    
    private int spin() {
    this.spinCount++;
    return (int) (Math.floor(Math.random()*100)%38);
    }
    
    public String toString() {
        return ("Ruleta Hra:\n" + 
                "Konto = €" + this.Konto + "\n" +
                "Počet hier " + this.spinCount);
    }

    public static void main(String[] args) {
        Ruletka rg1 = new Ruletka(10);
        rg1.turn();
        rg1.turn();
        rg1.turn();
    
    }
    
}
