package OOPSinJAVA.Test;

import OOPSinJAVA.Relations.child;
import OOPSinJAVA.Relations.parent;


public class InheritanceClass {
    public static void main(String[] args) {
        parent parent = new parent();
        child child = new child();
        child.setAge(18);
        parent.setAge(44);
        child.setSurname("Dwivedi");

        System.out.println(child.getSurname());
        parent.eyeColor();
    }
}
