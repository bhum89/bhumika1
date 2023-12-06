class Main{
    public static void main(String[] args){
        GenericsClass<Integer> intobj=new GenericsClass<>(6);
        System.out.println("Generics class returns"+intobj.returnTheData());
         GenericsClass<String> stringobj=new GenericsClass<>("Hello");
        System.out.println("Generics class returns"+stringobj.returnTheData());
    }
}
class GenericsClass<T>{
    private T data;
    public GenericsClass(T data){
        this.data=data;
    }
    public T returnTheData(){
        return this.data;
    }
}
