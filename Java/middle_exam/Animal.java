package middle_exam;

public class Animal {

    public String name;
    public int age;

    public Animal(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Animal{" + name + "," + age + "]";    
    }

}
