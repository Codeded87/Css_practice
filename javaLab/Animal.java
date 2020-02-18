

public class Animal {
 
 //defining a method speak
public  Animal speak() {
    return this;
 }
  
  
  //static Animal eat() {
//    return this;
  //}

public static void main(String args[]){


Animal obj = new Animal();
obj.speak(); // Animal {}


 speak = obj.speak;
//speak(); // undefined

//Animal.eat(); // class Animal
// eat = Animal.eat;
//eat(); // undefined

}
}