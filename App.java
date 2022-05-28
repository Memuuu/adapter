package adapter;

public class App {
    public static void main(String[] args) throws Exception {
            
        System.out.println("Adapter");

        Sql sql = new Sql();
        sql.setTC(132123);

        sql.getTC();


        Adapter oracle = new Adapter();

        oracle.setTC(513332);
        oracle.setAd("edseke");

        oracle.veritabaniSorgu(1221);
            
    }
}
   