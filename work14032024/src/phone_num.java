import java.util.*;

public class phone_num {
    private Map<String, List<String>> num_second;
    public phone_num() {
        num_second = new HashMap<>();
    }
    public void add(String second, String num) {
        num_second.computeIfAbsent(second, k -> new ArrayList<>()).add(num);
    }
    public List<String> get(String second) {
        return num_second.getOrDefault(second, Collections.emptyList());
    }
    public static void main(String[] args) {
        phone_num guide = new phone_num();
        guide.add("Иванов", "123-456");
        guide.add("Иванов", "256-159");
        guide.add("Петров", "789-012");
        guide.add("Сидоров", "345-678");
        System.out.println("Телефоны по фамилии Иванов:");
        List<String> num_Ivanov = guide.get("Иванов");
        for (String num : num_Ivanov) {
            System.out.println(num);
        }
        System.out.println("\nТелефоны по фамилии Петров:");
        List<String> num_Petrov = guide.get("Петров");
        for (String num : num_Petrov) {
            System.out.println(num);
        }
        System.out.println("\nТелефоны по фамилии Сидоров:");
        List<String> num_Cidorov = guide.get("Сидоров");
        for (String num : num_Cidorov) {
            System.out.println(num);
        }
    }
}