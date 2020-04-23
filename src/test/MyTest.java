package test;

public class MyTest {

    private String id;
    private String name;
    private String birth;
    private String company;

    public MyTest() {
    }

    public MyTest(String id) {
        this.id = id;
    }

    public MyTest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyTest(String id, String name, String birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public MyTest(String id, String name, String birth, String company) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.company = company;
    }
}