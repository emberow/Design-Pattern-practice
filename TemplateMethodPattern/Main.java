package TemplateMethodPattern;

public class Main {

    public static void main(String[] args){
        SoftwareManager softwareManager = new SoftwareManager();
        softwareManager.completeSoftware();
        softwareManager.redoSoftware();
    }
}
