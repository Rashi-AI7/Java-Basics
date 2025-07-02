import java.util.ArrayList;

public class arraylistsorting {
    public static void main(String[] args) {
        ArrayList <Integer> el = new ArrayList<>();
        el.add(23);
        el.add(12);
        el.add(67);
        el.add(7);
        el.add(56);
        el.add(10);
        for(int i=0; i<el.size(); i++){
            for(int j=0; j<el.size()-i-1; j++){
                if(el.get(j)>el.get(j+1)){
                    int temp = el.get(j);
                    el.set(j, el.get(j+1));
                    el.set(j+1, temp);
                    
                }
            }
        }
        for(Integer i : el){
            System.out.println(i);
        }
    }
}
