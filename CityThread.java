package package11;
public class CityThread extends Thread  {
    String name;
    CityThread(String name){
        this.name = name;
    }
    public void run() {
        int n;
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ":" + name);
            n = (int) (Math.random() * 1000);
            try {
                Thread.sleep(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        CityThread C1 = new CityThread("成都");
        CityThread C2 = new CityThread("深圳");
        C1.start();
        C2.start();
    }
}
