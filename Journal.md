# Journal
What did you accomplish in this phase, and what do you understand about how using an ArrayList differs from using a standard array for a registry like this?


In this phase I created the NeuralMod class, added instance variables, constructors, an arraylist to store the collection of mods, and toString method to print the mod's details.

A standard array has a fixed size established when created and to add an item you must manually track an index counter. While an ArrayList has dynamic sizing and has built-in methods for removing or searching. 



---------------



What does it mean for a class to have a “natural order,” and how does the Comparable interface enable this in your code?

"Natural order" refers to the logical, default way to sequence objects—such as numerical order for numbers or alphabetical order for strings. The Comparable interface enables this natural ordering by requiring a compareTo() method, which allows you to define how two objects compare to one another.



_______________



In what scenario would you use a Comparator instead of Comparable? How did you implement the reverse order (highest to lowest) for the compatibility rating?

You use Comparable when defining a single, default natural order directly inside a class, whereas a Comparator provides flexibility for sorting objects in multiple ways. In our program, we implemented Comparable to sort mods by speed, and used a Comparator via a lambda expression to handle custom sorting by compatibility, which leaves our program open to easily add sorting by other categories like name or status in the future.

To implement the reverse order, I added an overloaded sortRegistry method to the NeuralMod class that accepts a Comparator. In Main, I then used a lambda expression with this method to sort the mods by compatibility.



________________


How do you handle multi-level comparison logic within a single method? Describe the logic flow your program follows when it encounters two mods with the same speed and same compatibility.

Instead of evaluating everything at once the program uses if statements within the compareTo() method. It follows the rule, if the object is different, return the result, and if they are tied move to the next rule.
When the program encounters two mods with the same speed and compatibility:
1. Runs the speed check, if results are identical (0), then if statement evaluates to false, moves to next statement
2. Runs the compatibility check,  if results are identical (0), then if statement evaluates to false, moves to next statement
3. At the last fallback, alphabetical, it compares the two names, determines final sorted position.


_________________

What bugs or unexpected behaviors did you catch while testing your program? If you asked an AI tutor for feedback, what did it suggest, and did you choose to make any changes? Explain your reasoning.

The only bug that occurred during testing is that the program continued to sort by compatibility only. I realized that the sort using lambda was the last one continuing to run so I had to comment out this line so the multi sort registry could run. 

AI provide the following feedback that I implemented in the program:
1. Separate Concerns - Move registry list and sort methods into separate class. This follows the Single Responsibility Principle, keeping data model clean and collection management centralized.
2. Protect Registry List - Encapsulation - Return an unmodifiable view of the list to ensure an external class does not accidentally clear the registry or modify it
3. Add Input Validation - add validation checks to the constructor and setters to ensure data integrity therefor a negative speed or compatibility score over 100% cannot be passed 

I incorporated these improvements to make the program more robust and maintainable. Since these concepts align closely with lessons from our coursework, applying them was a great way to reinforce and build upon what I’ve learned so far.

