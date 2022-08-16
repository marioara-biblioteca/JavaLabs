package clasa;

public class Main {
    public static void main(String[] args) {
        /*Shelf shelf=new Shelf("1");
        Book b1=new Book("Pride and Prejudice",350,shelf);
        //dupa ce nu mai exista nicio referinta catre obiectul carte, shelf inca va mai exista deoarece e transmis prin referinta
        //paginile vor disparea si ele
        //compunere-nu exita carte fara pagini
        //agregare cartea si shel-ul exista independent, pot exista una fara cealata
        */
        Animal a [] = new Animal[3];

        a[0] = new Wolf();    // Upcasting automat
        a[1] = new Snake();   // Upcasting automat
        a[2]=new Animal();
        for (int i = 0; i < a.length; i++) {
            a[i].eat(); // 1

            if (a[i] instanceof Wolf) {
                ((Wolf)a[i]).howl(); //downcast din animal la wolf pentru a putea fi apelat howl
            }

            if (a[i] instanceof Snake) {
                ((Snake)a[i]).hiss(); // 3
            }
        }
        Animal w=new Wolf();
        ((Wolf)w).howl();
    }
}