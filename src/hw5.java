import java.util.HashMap;
import java.util.TreeMap;

public class hw5 {
    public static void main(String[] args) {
        // 1. Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> indexesAndColors = new HashMap<>();
        // 2. Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!
        indexesAndColors.put(1, "red");
        indexesAndColors.put(2, "green");
        indexesAndColors.put(3, "blue");
        System.out.println("Colors: " + indexesAndColors);
        // 3. Изменить значения дописав восклицательные знаки.
        indexesAndColors.replaceAll((key, value) -> value + "!");
        System.out.println("Colors + !: " + indexesAndColors);
        // *Создать TreeMap, заполнить аналогично.
        TreeMap<Integer, String> treecolors = new TreeMap<>();
        treecolors.put(1, "red");
        treecolors.put(2, "green");
        treecolors.put(3, "blue");
        System.out.println("Tree Colors: " + treecolors);
        treecolors.replaceAll((key, value) -> value + "!");
        System.out.println("Tree Colors + !: " + treecolors);

    }
}
