package lesson5;

import ru.javawebinar.webapp.model.ContactType;
import ru.javawebinar.webapp.model.Resume;

import java.lang.reflect.Array;
import java.util.*;

/**
 * GKislin
 * 16.01.2015.
 */
public class Main {

    public static void main(String[] args) {
        Comparator<Resume> comparator = new Comparator<Resume>() {
            @Override
            public int compare(Resume o1, Resume o2) {
                System.out.println(this.getClass().getSimpleName());
                return 0;
            }
        };
        System.out.println(comparator);

        Resume R1 = new Resume("Полное Имя1", "location1");
        R1.addContact(ContactType.MAIL, "mail1@ya.ru");
        R1.addContact(ContactType.PHONE, "11111");
        Resume R2 = new Resume("Полное Имя2", null);
        R2.addContact(ContactType.SKYPE, "skype2");
        R2.addContact(ContactType.PHONE, "22222");
        Resume R3 = new Resume("Полное Имя3", null);

        Resume r2 = new Resume() {
            @Override
            public String getUuid() {
                return "uuid_R2";
            }
        };
        print(r2);
    }

    public static <T extends Resume> void print(T e) {
//
//        list.forEach(r -> System.out.println(r.getUuid()));
    }
}
