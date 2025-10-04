public class Con_Overloding {
    Con_Overloding(){
        System.out.println("excuted");
    }
    Con_Overloding(int i){
System.out.println("Con_Overloding(int i) excuted");
    }
    Con_Overloding(int i,int j){
        System.out.println("Con_Overloding(int i,int j)excuted");
    }
    public static void main(String[] args) {
        new Con_Overloding();
        new Con_Overloding(10);
        new Con_Overloding(20,40);
    }
}
