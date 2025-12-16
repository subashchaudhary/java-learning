package java8;

import java.util.Comparator;

public class IdComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return Integer.compare(o1.getEmpId(), o2.getEmpId());
    }
}
