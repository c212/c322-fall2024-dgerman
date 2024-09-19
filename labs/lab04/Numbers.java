public class Numbers {
  static int nextAvailableNumber = 6;
  int id = 0;
  private Numbers() {

  }
  public static Numbers singleton = null;
  public static Numbers makeInstance() {
    if (Numbers.singleton == null)
      Numbers.singleton = new Numbers();
    return Numbers.singleton;
  }
}
