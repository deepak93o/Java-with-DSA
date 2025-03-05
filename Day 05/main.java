class method {
    int add(int a , int b){
        int ans = a+b;
        return ans;
    }
}

public class Main {
    public static void main(String[] args){
        method obj = new method();
        System.out.println(obj.add(3, 6));
    }
}