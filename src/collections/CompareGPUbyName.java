package collections;

import java.util.Comparator;

public class CompareGPUbyName implements Comparator<GPU> {
    @Override
    public int compare(GPU o1, GPU o2) {
        return o1.compareTo(o2);
    }
}
