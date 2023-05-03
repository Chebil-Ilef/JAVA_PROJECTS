ReferenceTest: int is passed by value
               whereas array are passed by reference
Init: Initilizing block : static (once) - instance (before every constr) - constructors(after inst)
       Understand the order of execution
Init1: extends Init 
       static (ALL once) - instance (before every constr ALL) - constructors(after inst FIRST)
       instance (before every constr ALL) - constructors(after inst SECOND)
AutoBox: Boxing, == , Equals
OverrCast: example of function overriding and casting variables
FinalizeExample: An object becomes eligible for garbage collection when no more reference variable 
references to it. Before the object is deleted by the garbage collector, Java provides you a 
mechanism to execute some code. This code is located in a method named finalize() that 
all classes inherit from class Object.

