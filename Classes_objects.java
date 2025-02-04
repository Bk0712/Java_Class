// #define classes and objects

class Animal{
    public static void dog(){
        System.out.println("Bow Bow.....!!");
        System.out.println("Meow Meow...!!");
    }
}

// public class Classes_objects{
//     public static void main(String[] args){
//         Animal obj=new Animal();
//         obj.dog();
//     }
// }

// class Animal{
//     public void cat() {
//         System.out.println("Meow Meow...!!");
//     }
// }

public class Classes_objects{
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.dog();
        Animal1 obj1=new Animal();
        obj1.cat();
    }
}