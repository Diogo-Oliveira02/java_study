public class ListarAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[4];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Leao();
        animais[3] = new Hipopotamo();

        for (Animal animal : animais) {
            animal.eat();
            animal.roam();
            System.out.println();
        }
    }
    
    
}
