public class Numbers {
  static int nextAvailableNumber = 6;
  int id = 0;
  private Numbers() {
    this.id = Numbers.nextAvailableNumber++;
  }
  public static Numbers singleton = null;
  public static Numbers makeInstance() {
    if (Numbers.singleton == null)
      Numbers.singleton = new Numbers();
    return Numbers.singleton;
  }
  public String toString() {
    return "I am number: " + this.id;
  }
}
