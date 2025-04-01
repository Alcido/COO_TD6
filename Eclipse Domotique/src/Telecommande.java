public class Telecommande {

    private ElectronicObject[] objets;

    public Telecommande(){
        objets = new ElectronicObject[100];
    }

    public void activerObjet(int indiceObjet){
        objets[indiceObjet].allumer();
    }

    public void ajouterObjet(ElectronicObject objet){
        try {
            int i = 0;
            while(objets[i] != null){
                i++;
            }
            objets[i] = objet;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Vous avez dépassé la nombre de lampe maximum !");
        }
    }

    public void desactiverObjet(int indiceObjet){
        objets[indiceObjet].eteindre();
    }

    public void activerTout(){
        for(int i = 0; i < objets.length; i++){
            objets[i].allumer();
        }
    }

    public ElectronicObject[] getObjets(){
        return objets;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        int i = 0;
        try {
            while (objets[i] != null) {
                s.append(objets[i].toString());
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //
        }
        return s.toString();
    }
}
