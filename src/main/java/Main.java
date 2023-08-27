public class Main {
    public static void main(String[] args) {
        ShelterWorker shelterWorker=new ShelterWorker("Michał","Michalski",1);

        Animal animal1=new Animal(1,"reksio",3,"pies");
        Animal animal2=new Animal(2,"burek",5,"kaczka");
        Animal animal3=new Animal(3,"murek",4, "kot");

        shelterWorker.addAnimal(animal1);
        shelterWorker.addAnimal(animal2);
        shelterWorker.addAnimal(animal3);

        System.out.println(shelterWorker);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}
