# chapter6labs
Questions to answer:

### Why doesn't the integer change after the method call? 
Because Java passes primitive types by value — the method receives a copy of the integer, so changes made inside the method do not affect the original variable.

## Why does the array change after the method call?
Because arrays are objects in Java, and Java passes object references by value. So the method receives a copy of the reference, but it still points to the same array in memory. Changes to the array’s contents affect the original.

## What happens when you try to access y outside the loop?
You get a compile-time error because y is declared inside the loop block. Its scope is limited to that block, so it’s not accessible outside the loop.
