public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int startingCapacity) {
    data = new String[startingCapacity];
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
    if (size == data.length) {
      resize();
    }
    data[size] = item;
    size++;
    return true;
  }

  public String toString() {
    String text = "[";
    for (int i = 0; i < size; i++) {
      text += data[i] + ", ";
    }
    if (size > 0) {
      text += "\b\b";
    }
    text += "]";
    return text;
  }

  public String toStringDebug() {
    String text = toString() + "\b";
    for (int i = size; i < data.length; i++) {
      text += ", ";
      if (i == 0) {
        text += "\b\b";
      }
      text += "null";
    }
    return text + "]";
  }

  public String get(int ind) {
    if (ind >= size || ind < 0) {
      System.out.println("ERROR:...........................Index out of range");
      return null;
    }
    return data[ind];
  }

  public String set(int ind, String val) {
    if (ind >= size || ind < 0) {
      System.out.println("ERROR:...........................Index out of range");
      return null;
    }
    data[ind] = val;
    return "Item at index " + ind + " successfully set to " + val;
  }

  private void resize() {
    String[] temp = new String[data.length * 2 + 1];
    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public int indexOf(String arg) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(arg)) {
        return i;
      }
    }
    return -1;
  }

  public boolean contains(String arg) {
    return indexOf(arg) != -1;
  }

  public int lastIndexOf(String arg) {
    for (int i = 0; i < size; i++) {
      if (data[size-i-1].equals(arg)) {
        return size-i-1;
      }
    }
    return -1;
  }

  public void add(int index, String item) {
    if (size == data.length) {
      resize();
    }
    size++;
    for (int i = size - 1; i > index; i--) {
      data[i] = data[i-1];
    }
    data[index] = item;
  }

  public String remove(int index) {
    if (index >= size || index < 0) {
      System.out.println("ERROR:...........................Index out of range");
      return null;
    }
    String val = get(index);
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i+1];
    }
    size--;
    return val;
  }

  public boolean remove(String arg) {
    remove(indexOf(arg));
    return contains(arg);
  }
}
