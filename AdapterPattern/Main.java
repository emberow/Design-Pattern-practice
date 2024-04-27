package AdapterPattern;


public class Main {

    public static void main(String[] args){
        BlackMan blackMan = new BlackMan("Jack");
        blackMan.helloEnglish();
        blackMan.selfIntroEnglish();

        BlackmanTranslator blackmanTranslator = new BlackmanTranslator(blackMan.name);

        blackmanTranslator.hello();
        blackmanTranslator.selfIntro();
    }
}
