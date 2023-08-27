package Zoo;

import Zoo.ShelterWorker;

public class Animal {
    private int id;
    private String name;
    private int age;
    private String race;
    private ShelterWorker shelterWorker;


    public Animal(int id, String name, int age, String race) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.race=race;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public ShelterWorker getShelterWorker() {
        return shelterWorker;
    }

    public void setShelterWorker(ShelterWorker shelterWorker) {
        this.shelterWorker = shelterWorker;
    }

    @Override
    public String toString() {
        return "Zoo.Animal[" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", race=" + race +
                "]";
    }
}
