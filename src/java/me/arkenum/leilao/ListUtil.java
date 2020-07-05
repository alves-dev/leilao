package me.arkenum.leilao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtil {
    @SafeVarargs
    public static <T> ArrayList<T> listOf(T... values) {
        ArrayList<T> list = new ArrayList<T>();
        list.addAll(Arrays.asList(values));
        return list;
    }
}
