class Two extends Thread {
  public void run() {
    try {
      while (true) {
        Numbers a = Numbers.makeInstance();
        int wait = (int) (Math.random() * 400 + 100);
        System.out.println("Two will wait: " + wait + " " + a);
        sleep(wait);
      }
    } catch (InterruptedException  e) {
      return;
    }
  }
}
