/*class Animal{
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
       
    public void display(){
        System.out.println("Name: "+ name +", age: "+ age );
    }
    
}
    class Dog extends Animal{
        String hobbies;

        public Dog(String hobbies, String age){
           thi;
        }
    }



}




public class inheritance {
    
}
*/
class Animal{
    public void sleep(){
        System.out.println("Animal is sleeping");
    
    }

}
class Dog extends Animal{
    String name;
    int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;

    }
    public  void bark(){
         System.out.println( name +" is barking " );
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog d1=new Dog("Tommy",3);
        d1.sleep();
        d1.bark();
        Animal a1=new Animal();
        a1.sleep();
    }
    
}