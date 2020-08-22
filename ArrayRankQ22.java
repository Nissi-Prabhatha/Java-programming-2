import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ArrayRankQ22
{
public static void transform(int[] arr)
{
Map<Integer, Integer> map = new TreeMap<>();

for (int i = 0; i < arr.length; i++) {
map.put(arr[i], i);
}

int rank = 1;

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
arr[entry.getValue()] = rank++;
}
}

public static void main(String[] args)
{
int[] A = { 10, 8, 15, 12, 6, 20, 1 };

transform(A);

System.out.println(Arrays.toString(A));
}
}