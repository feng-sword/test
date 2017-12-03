public class Test1 {
    public static int test(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
        System.out.print("test");
    }
}
