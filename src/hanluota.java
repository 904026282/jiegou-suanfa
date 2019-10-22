public class hanluota {
    public static void main(String[] args) {
        start(3,'a','b','c');
    }
    public static void start(int i,char from,char in,char to){
        if(i==1){
            System.out.println(from+"到"+to);
        }else {
            start(i-1,from,to,in);
            System.out.println(from+"到"+to);
            start(i-1,in,from,to);
        }
    }
}
