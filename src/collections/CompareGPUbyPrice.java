package collections;

import java.util.Comparator;

public class CompareGPUbyPrice implements Comparator<GPU> {
    @Override
    public int compare(GPU o1, GPU o2) {
        if(o1.getPrice()==o2.getPrice())return 0;
        else if(o1.getPrice()>o2.getPrice())return -1;
        else return 1;
    }
}
