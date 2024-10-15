public class Hello {
    public static void main(String[] args){//arguments, paramenters
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("Hello World!");
        sayHello("Wilson Cho");
    }

    public static void sayHello(String name){
        System.out.println("Hello Again! "+name);
    }
    
}