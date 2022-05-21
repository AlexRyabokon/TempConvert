package org.newtheme;

import java.util.*;

    /*
    2.3 Напишите метод, который получает на вход коллекцию типа `К` (Generic) и возвращает
    `Map<K, Integer>`, где `K` — значение из массива,
    а `Integer` — количество вхождений в массив.
    То есть сигнатура метода выглядит так: `<K> Map<K, Integer> arrayToMap(K[] ks)`;
    * */

public class MapWork {

    public static <K, V> Map<V, Collection<K>> inverse(Map<? extends K, ? extends V> map) {
        Map<V, Collection<K>> resultMap = new HashMap<>();

        Set<K> keys = (Set<K>) map.keySet();
        for (K key : keys) {
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if (ks == null) {
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }
        return resultMap;
    }
}

class MapWorkRealization {
    public static void main(String[] args) {
        Map<Integer, String> resultMap = new HashMap<Integer, String>();
        resultMap.put(0, "Ivan");
        resultMap.put(1, "Anton");
        resultMap.put(2, "Gerogid");
        resultMap.put(3, "dn");
        System.out.println(resultMap);
        System.out.println();
        System.out.println(MapWork.inverse(resultMap));



    }

}