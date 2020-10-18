package collections;

import java.util.Comparator;

public class CompareGPUbyMemmory implements Comparator<GPU> {
    @Override
    public int compare(GPU o1, GPU o2) {
        if (o1.getMemmory() > o2.getMemmory())
            return 1;
        else if (o1.getMemmory() == o2.getMemmory())
            return 0;
        else return -1;
    }
}
