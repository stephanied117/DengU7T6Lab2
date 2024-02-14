import java.util.ArrayList;

public class Sort {

    // PART A. implementing insertion sort
    public static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int temp = elements[i];
            int tracker = i;
            while (tracker > 0 && temp < elements[tracker - 1]) {
                elements[tracker] = elements[tracker - 1];
                elements[tracker - 1] = temp;
                tracker--;
            }
        }
    }

    // PART B. sorting a word list
    public static void insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String temp = words.get(i);
            int tracker = i;
            while () {
                words.add(tracker, words.get(tracker - 1));
                words.add(tracker - 1, temp);
                tracker--;
            }
        }
    }
}
