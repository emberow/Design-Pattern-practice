package Singleton;

public class SingleObject {
 
    //創建 SingleObject 的一個對象
    private static SingleObject instance = new SingleObject();
  
    //讓構造函數為 private，這樣該類就不會被實例化
    private SingleObject(){
        System.out.println("test成功");
    }
  
    //獲取唯一可用的對象
    public static SingleObject getInstance(){
       return instance;
    }

    
}
 