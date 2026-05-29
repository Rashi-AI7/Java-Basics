package Heap;
import java.util.*;

//N points in a 2D plane are given, if we are at origin print the nearest k cars.
class NearbyCars{
static class Point implements Comparable<Point>{
    int x;
    int y;
    int distSq;
    int idx;

    Point(int x, int y, int distSq, int idx){
        this.x = x;
        this.y = y;
        this.distSq = distSq;
        this.idx = idx;
    }

    @Override
    public int compareTo(Point p2){
        return this.distSq - p2.distSq;
    }
}

    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k=2;

        PriorityQueue <Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }
        for(int i=0; i<k; i++){
            System.out.println("C" + pq.remove().idx);
        }
    }
}

// import java.util.*;

// class NearbyCars {
//     static class Point implements Comparable<Point> {
//         int x, y, distSq, idx;

//         Point(int x, int y, int idx) {
//             this.x = x;
//             this.y = y;
//             this.idx = idx;
//             this.distSq = x * x + y * y;
//         }

//         @Override
//         public int compareTo(Point other) {
//             return Integer.compare(this.distSq, other.distSq);
//         }
//     }

//     public static void main(String[] args) {
//         int[][] pts = {{3, 3}, {5, -1}, {-2, 4}};
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>();
//         for (int i = 0; i < pts.length; i++) {
//             pq.add(new Point(pts[i][0], pts[i][1], i));
//         }

//         for (int i = 0; i < k; i++) {
//             Point p = pq.poll();
//             System.out.println("Car " + p.idx + " at (" + p.x + ", " + p.y + ")");
//         }
//     }
// }
