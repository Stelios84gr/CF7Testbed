package gr.aueb.cf.test;

public class TestMain {
    public static void main(String[] args) {
        BaseProcessor processor = new CustomProcessor();
        processor.processData("Hello");
    }
}