public class App {
    public static void main(String[] args) throws Exception {
        StudentDB stdDBObj = new StudentDB();
        stdDBObj.insertName("Faisal Jan");
        stdDBObj.insertName("Abdul Basit");
        stdDBObj.insertName("Karim");
        stdDBObj.insertName("Muneeb");
        // System.out.print(stdDBObj.search("Faisal"));
        // System.out.println(stdDBObj.getName(0));
        stdDBObj.showNames();
        stdDBObj.delete(1);
        stdDBObj.showNames();
    }
}
