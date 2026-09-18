package Klassenhierarchie;

abstract class Saeugetier{
    public void atmen(){
        System.out.println("Das Saeugetier atmet.");
    }
}

class Hund extends Saeugetier{
    public void bellen(){
        System.out.println("Das Hund bellt.");
    }
}

class Mensch extends Saeugetier{
    public void sprechen(){
        System.out.println("Der Mensch spricht.");
    }
}

abstract class Katze extends Saeugetier{
    public void schnurren(){
        System.out.println("Die Katze schnurrt.");
    };
}

class Gepard extends Katze{
    public void superspeed(){
        System.out.println("Der Gepard ist sehr schnell.");
    }
}

class Tiger extends Katze{
    public void schwimmen(){
        System.out.println("Der Tiger kann schwimmen.");
    }
}

class Loewe extends Katze{
    public void bruellen(){
        System.out.println("Der Löwe brüllt.");
    }
}
public class Main {

    public static void main(String[] args) {
        Gepard gepard = new Gepard();
        gepard.atmen();
        gepard.superspeed();
        gepard.schnurren();


    }
}