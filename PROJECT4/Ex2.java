public class Ex2 {
    public static void main(String[] args) {
        int x;
        long x2;
        Long [] La = {4L, 5L, 6L};
        long [] la = {7L, 8L, 9L};
        int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}};
        String [] sNums = {"one", "two", "three"};
        Animal [] animals = {new Dog(), new Cat()};
        // legal 'for' declarations
        for(long y : la ) ; // loop thru an array of longs
        for(long lp : La); // autoboxing the Long objects into longs
        for(int[] n : twoDee); // loop thru the array of arrays
        for(int n2 : twoDee[2]); // loop thru the 3rd sub-array
        for(String s : sNums); // loop thru the array of Strings
        for(Object o : sNums); // set an Object ref to each String
        for(Animal a : animals); // set an Animal ref

        // ILLEGAL 'for' declarations
        for(long x3 : la); // x2 is already declared
        // need to create a new variable of type long
        for(int[] x3 : twoDee); // can't stuff an array into an int
        //the variable needs to be an array
        for(long x3 : la); // can't stuff a long into an int
        // variable needs to be of type long
        for(Animal d : animals); // you might get a Cat!
        //not all animals are dogs so tjhe variable needs to be of type Animal and not Dog

        //for(x2 : la);  x2 is already declared
        for(long x3 : la);
        // need to create a new variable of type long

        // for(int x2 : twoDee);  can't stuff an array into an int
        for(int[] x3 : twoDee);
        //the variable needs to be an array

        //for(int x3 : la);  can't stuff a long into an int
        for(long x3 : la);
        // variable needs to be of type long

        // for(Dog d : animals);  you might get a Cat!
        for(Animal d : animals);
        //not all animals are dogs so tjhe variable needs to be of type Animal and not Dog
    }

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
