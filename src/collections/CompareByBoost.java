package collections;

import java.util.Comparator;

public class CompareByBoost implements Comparator<GPU> {
    @Override
    public int compare(GPU o1, GPU o2) {
        if (o1.isBoosted() > o2.isBoosted())
            return -1;
        else if (o1.isBoosted() == o2.isBoosted())
            return 0;
        else return 1;
    }
}
