package tasks.interfaces;

public class Main {
    public static void main(String[] args) {
        Dog burek = new Dog();
        Dog cosiek = new Dog();

        Cat misiek = new Cat();

        IVoice[] voices = {burek, cosiek, misiek};
        
        for (IVoice voice : voices) {
            System.out.println(voice.getVoice());
        }
    }
}
