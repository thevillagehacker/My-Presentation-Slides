public class Human implements java.io.Serializable {
  int    age;
  String name;
  String nickname;

  public Human(int age, String name, String nickname) {
    this.age    = age;
    this.name     = name;
    this.nickname = nickname;
  }

  public String toString() {
    return age + " " + name + " (" + nickname + ")";
  }
}

