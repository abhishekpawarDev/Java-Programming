public class variablemultiplearguments {
    public int sum(int ... args){
        int s = 1;
        for(int x:args){
            s = s*x;
        }
        return s;
    }
    public static void main(String[] args) {
        variablemultiplearguments e = new variablemultiplearguments();
        int sum = e.sum(2,5,4);
        System.out.println(sum);
    }
}