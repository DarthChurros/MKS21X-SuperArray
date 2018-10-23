public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean add(String item) {
    data[size] = item;
    size++;
    return true;
  }

  public String toString() {
    String text = "[";
    for (int i = 0; i < size; i++) {
      text += data[i] + ", ";
    }
    text += "\b\b]";
    return text;
  }

  public String toStringDebug() {
    String text = toString() + "\b";
    for (int i = size; i < data.length; i++) {
      text += ", null";
    }
    return text + "]";
  }
}
