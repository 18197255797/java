package package11;
public class CityRunnable implements Runnable {
    String name;
    CityRunnable(String name){
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
    public static void main(String[] args) {
        CityRunnable c1=new CityRunnable("北京");
        CityRunnable c2=new CityRunnable("上海");
        new Thread(c1).start();
        new Thread(c2).start();
    }
}
