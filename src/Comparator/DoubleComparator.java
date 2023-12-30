package Comparator;

import Types.DoubleType;

import java.io.Serializable;

/**
 * Сравнение объектов типа Float
 */
public class DoubleComparator implements Comparator, Serializable {
    @Override
    public double compare(Object o1, Object o2) {
        return ((DoubleType)o1).getDoubleTypeValue() - ((DoubleType)o2).getDoubleTypeValue();
    }
}
