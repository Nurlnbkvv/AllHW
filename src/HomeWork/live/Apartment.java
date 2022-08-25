import java.util.HashSet;
import java.util.Set;
class TheClass {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        if (hashSet.contains(30)) {
            hashSet.remove(0);
        }
        hashSet.add(30);
        hashSet.add(40);
        System.out.println(hashSet.size());
    }
}