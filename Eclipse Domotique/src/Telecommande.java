public class Telecommande {

    private Lampe[] lampes;

    public Telecommande(){
        lampes = new Lampe[100];
    }
    public void activerLampe(int indiceLampe){
        lampes[indiceLampe].allumer();
    }

    public void ajouterLampe(Lampe lampe){
        try {
            int i = 0;
            while(lampes[i] != null){
                i++;
            }
            lampes[i] = lampe;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Vous avez dépassé la nombre de lampe maximum !");
        }
    }

    public void desactiverLampe(int indiceLampe){
        lampes[indiceLampe].eteindre();
    }

    public void activerTout(){
        for(int i = 0; i < lampes.length; i++){
            lampes[i].allumer();
        }
    }

    public Lampe[] getLampes(){
        return lampes;
    }

    public String toString() {
        throw new Error("Code à faire");
    }
}
