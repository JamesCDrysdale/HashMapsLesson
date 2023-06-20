# HashMaps

Duration - 30 minutes

## Context

- HashMaps are a Data structure - like Objects in JavaScript or dictionaries in Python. 
- Sometimes called associative arrays.
- They have key- value pairs
- We're going to take a look at how we can use these in our projects
- And explore some of the methods available to us
- We'll be able to retrieve data without worrying about the *order* of the data.

```js
  person = { name: "Jamie", occupation: "Puppy Trainer" }
```

1. Create a new project in IntelliJ and call it HashMapDemo.

2. Create a new Java class called HashMapDemo.

3. We will:

    a. Initialise a new empty HashMap

    b. Add items to the HashMap using .put method

```java
  // HashMapDemo.java

  public class HashMapDemo {
    public static void main(String[] args) {

      HashMap petSupplies = new HashMap();

      petSupplies.put("Chicken Kibbles", 1);
      petSupplies.put(6, "Tennis Balls");

      System.out.println(petSupplies.get(6)); // Tennis Balls
    }
  }
```

4. Ask class if they can identify what the issue with this is
 (If we look at the `problems` we can see an error:)

```
Note: HashMapDemo.java uses unchecked or unsafe operations.
```

We SHOULD specify the _types_ of the keys and values we are PUTting into the HashMap.

```java
  // HashMapDemo.java

  public class HashMapDemo {
    public static void main(String[] args) {

      HashMap<String, Integer> petSupplies = new HashMap<>(); // ADD TYPES IN HERE
        
      petSupplies.put("Chicken Kibbles", 1);  // UPDATE AS STRING MUST BE 1st ARG AND Integer 2nd
      petSupplies.put("Tennis Balls", 6);     // UPDATE THIS TOO

      System.out.println(petSupplies.get("Tennis Balls"));
    }
  }
```

## Keys

You can use any class as a key.

## Values

When you store a value in a HashMap, it will always store an object (aka an instance of a class), rather than a primitive type. Take a look at the following code.

```java

public class HashMapDemo {
  public static void main(String[] args) {
    
    HashMap<String, Integer> trainer = new HashMap<String, Integer>();

    trainer.put("Sandy", 52);
    trainer.put("Alex", 24);

    Integer sandyAge = trainer.get("Sandy");

    String output = "Sandy's has " + sandyAge.toString() + " years of experience training dogs.";
    System.out.println(output);
  }
}
```

- Because we use a full integer object, we can call `toString()` on it. (We couldn't if it was a primitive type!)

- What if we wanted to store more information about our trainer than their years of experience? Maybe we want to be able to include any qualifications they have earned or their favourite dog breed.
 
- We could do this by putting a class as a value. 

- Make a Trainer class with instance variables for yearsExperience, qualifications and favDogBreed. Then pass in a Trainer Object as the value.

## Methods

Let's take a look at some of the most common methods we can call on our HashMap:

```java
  trainer.put(key, value) // inserts a new entry into the HashMap
  trainer.get(key) // gets the value for the given key
  trainer.size() // returns the size of the HashMap as an integer
  trainer.clear() // clears all entries from the HashMap
  trainer.containsValue(value) // returns true if the HashMap contains the value
  trainer.remove(key) //removes the entry with the given key
```

### Task

1. Create a HashMap of keys and values for the populations of dogs in the UK for some of the most popular breed. Here is some sample data (don't forget to think about the types of your keys and values!):

```
LabradorRetreiver: 35,347
BorderCollie: 2,087
GermanShepherd: 6,837
Pug: 6,751
```

2. Output some values from the HashMap using `.get(key)` and `system.out.println()`.
3. Investigate the use of the `.values()` and `.keySet()` methods on HashMap.
4. Alongside the population, try to store the average size (e.g. small/medium/large) and favourite toy for each. (Feel free to make it up) Make a function that outputs: 

`There are ` + population + ` ` + breed + `'s in the UK. They tend to be` + size + ` sized and love to play with ` + toy + `'s.` 

Hint: you will want to create a Dog class.
