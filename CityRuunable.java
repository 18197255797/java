package package11;

public class CityRuunable implements Runnable {
    String name;
    public CityRuunable(String name) {
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
        CityRuunable c1 = new CityRuunable("上海");
        CityRuunable c2 = new CityRuunable("天津");
        new Thread(c1).start();
        new Thread(c2).start();
    }
}

