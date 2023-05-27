package familytree;

import java.util.List;

public class FamilyTree {
    public static void main(String[] args) {

        Person alexander = new Person("Alexander");
        Person maria = new Person("Maria");

        Person ivan = new Person("Ivan");
        Person olga = new Person("Olga");

        Person petr = new Person("Petr");
        Person anna = new Person("Anna");

        alexander.addChild(ivan);
        alexander.addChild(olga);

        maria.addChild(petr);
        maria.addChild(anna);

        // Выводим информацию о семейном древе
        printFamilyTree(alexander, 0);
    }

    public static void printFamilyTree(Person person, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(person.getName());
        List<Person> children = person.getChildren();
        for (Person child : children) {
            printFamilyTree(child, level + 1);
        }
    }
}
