
public class Human implements java.io.Serializable {
  int    age;
  String name;
  String nickname;
  double weight;

  public Human(int age, String name, String nickname, double weight) {
    this.age    = age;
    this.name     = name;
    this.nickname = nickname;
    this.weight     = weight;
  }

  public String toString() {
    return age + " " + name + " (" + nickname + "): " + weight;
  }
}
