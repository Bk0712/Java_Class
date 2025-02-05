class Fruits{
    Fruits(){
        System.out.println("I am Fruit1 Constructor");
    }   
    Fruits(String name){
        System.out.println("Fruits Name is:"+name);
    }  
}

class Constructors{
    public static void main(String[] args){
        Fruits obj = new Fruits("orange");
        Fruits obj1=new Fruits();
    }
}