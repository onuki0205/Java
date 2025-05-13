class Person{
  private String name;
  Person(String name){
    this.name = name;
  }
  public String introduction(){
    return "My name is " + name + ".";
  }
}

class Student extends Person{
  private String id;
  private String greeting;
  Student(String name,String id){
    super(name);
    this.id = id;
    this.greeting = "I am student. ";
  }

  public String introduction(){
    return greeting + super.introduction() + " My ID is " + id + ".";
  }
}

class EnglishPerson extends Person{
  private String greeting;
  EnglishPerson(String name){
    super(name);
    this.greeting = "How do you do? ";
  }

  public String introduction(){
    return greeting + super.introduction();
  }
}

class EnglishStudent extends Student{
  private String greeting;
  EnglishStudent(String name,String id){
    super(name,id);
    this.greeting = "How do you do? ";
  }

  public String introduction(){
    return greeting + super.introduction();
  }
}

class JapanesePerson extends Person{
  JapanesePerson(String name){
    super(name);
  }

  public String introduction(){
    return "Hajimemashite. " + super.introduction();
  }
}

class JapaneseStudent extends Student{
  JapaneseStudent(String name,String id){
    super(name,id);
  }

  public String introduction(){
    return "Hajimemashite. " + super.introduction();
  }
}

class TestGreeting{
  public static void main(String[] srgs){
    Person[] p = new Person[6];
    p[0] = new Person("Reo");
    p[1] = new Student("Pin","d112");
    p[2] = new EnglishPerson("Ken");
    p[3] = new EnglishStudent("Angela","l231");
    p[4] = new JapanesePerson("Shin");
    p[5] = new JapaneseStudent("Mina","s234");
    
    for (int i = 0; i < 6; i++){
      System.out.println(p[i].introduction());
    }

  }
}
