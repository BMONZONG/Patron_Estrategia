public class MallarDuck extends Duck {
    //La clase mallar esta generalizando de la clase duck


    @Override
    public void display() {
        System.out.println("Hola soy pato silvestre");
    }


    //A todas las las clases heredan de la clase madre hereda los objets
    //se esta supeditando de la clase madre
    @Override
    public String toString() {
        return "MallarDuck{}";
    }
}
