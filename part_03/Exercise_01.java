package part_03;

/**
  Write 3 classes.
 These classes can reside in the same file for ease and clarity.

  The first class (the controller) should have at least two methods,
 - one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects.

 Each class must have at least 3 variables all 3 variables in each class must be used and set.

 Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)
 .

 **/

class exeterController {
    public static void main(String[] args) {
        Student andrew = new Student(22,"andrew");
        Student saulot = new Student("Saulo");
        Student duncan = new Student(24,"Duncan");
        saulot.setAge(30);
        Professor ryan = new Professor(32,"Ryan");
        System.out.println(ryan.getAge());
        System.out.println(saulot.getID());
        System.out.println(duncan.getID());
        System.out.println(duncan.getStudentCounter());
        System.out.println(andrew.getStudentCounter());
    }
}



