import java.util.LinkedList;
import java.util.Scanner;

public class SearchString {
    public static LinkedList<Character> searchSubstring(String str){
        LinkedList<Character>  max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); i++){
            if (list.size() > 1 && str.charAt(i) <= list.getLast() && list.contains(str.charAt(i))){
                list.clear();
            } //đổi && thành & sẽ lỗi, list không rỗng thì mới check các điều kiên sau đó

            list.add(str.charAt(i));

            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        return max;
    }
    //Độ phức tạp của thuật toán là O(n)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String testString = scanner.nextLine();

        for (Character ch: searchSubstring(testString)) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
