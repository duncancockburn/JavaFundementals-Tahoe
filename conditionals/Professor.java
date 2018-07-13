package conditionals;

public class Professor {

            private int ID;
            private int age;
            private String name;
            private static int professorCount;

            public Professor(int age, String name) {
                this.ID = professorCount;
                this.age = age;
                this.name = name;
                professorCount++;
            }

            public Professor(String name) {
                this.ID = professorCount;
                this.name = name;
                professorCount++;
            }

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }