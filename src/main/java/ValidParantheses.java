//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        String line;
//        Set<Character> set = new HashSet<>(Arrays.asList('{', '}', '(', ')', '[', ']'));
//
//        while ((line = reader.readLine()) != null) {
//            if (line.isEmpty() || line.equalsIgnoreCase("exit")) {
//                break; // Terminate the loop if the line is empty or "exit"
//            }
//
//            for (int i = 0; i < line.length (); i++) {
//                if (set.contains (line.charAt (i)) )
//                    sb.append(line);
//            }
//        }
//        String s = sb.toString();
//        System.out.println (isValid (s));
//    }
//
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char i : s.toCharArray()) {
//            if (i == '(' || i == '{' || i == '[') {
//                stack.push(i);
//            } else if (!stack.isEmpty()) {
//                char element = stack.pop();
//                if (element == '(' && i != ')') {
//                    return false;
//                } else if (element == '{' && i != '}') {
//                    return false;
//                } else if (element == '[' && i != ']') {
//                    return false;
//                }
//            } else {
//                return false;
//            }
//        }
//
//        return stack.isEmpty();
//    }
//}