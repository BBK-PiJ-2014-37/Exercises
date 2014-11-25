import java.util.*;
import java.lang.Math;

public class BinarySearch {

        public static int findBinary(Integer n, List<Integer> ls, int low, int high) {
                if (high < low) {
                        return -1;
                } else {
                        int mid = (low + high) / 2;
                        if (n.equals(ls.get(mid))) {
                                return mid;
                        } else if (n < ls.get(mid)) {
                                return findBinary(n, ls, low, mid-1);
                        } else {
                                return findBinary(n, ls, mid+1, high);
                        }
                } 
        }

        public static int find(int n, List<Integer> ls) {
                return findBinary(n, ls, 0, ls.size()-1);
        }

        public static void main (String[] args){
                List<Integer> ls = new ArrayList<Integer>();
                for(int i = 0; i < 1000; i++) {
                        ls.add(new Integer(3*i));
                }
                Collections.sort(ls);
                System.out.println("312 is in " + find(312, ls));
                System.out.println("560 is in " + find(560, ls));
        }
}

