package BuilderPattern.Abstract;

import BuilderPattern.MacbookPro;

public abstract class MacbookProBuilder {

    protected MacbookPro macbookPro;

    protected MacbookProBuilder(){
        macbookPro = new MacbookPro();
    }

    public abstract MacbookProBuilder buildCPU(MacbookPro.Processor processor);

    public abstract MacbookProBuilder buildMemory(MacbookPro.Memory size);

    public abstract MacbookProBuilder buildGraphics(MacbookPro.Graphics name);

    public abstract MacbookProBuilder buildStorage(MacbookPro.Storage size);

    public abstract MacbookProBuilder buildKeyboard(MacbookPro.Keyboard language);

    public MacbookPro build(){
        return macbookPro;
    }

}