package ex08.demoList;

public class Student {
    private int id;
    private String name;
    private String className;

    public Student() {
    }

    public Student(int id, String name, String className) {
        this.className = className;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    //Ham tao ma bam de so sanh doi tuong
    @Override
    public int hashCode() {
        return id;
    }

    //Ham so sanh doi tuong voi nhau
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return name.equals(s.getName());
    }
}
