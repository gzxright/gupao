package strategy;

public class Expletive implements Unfiltereder{
    @Override
    public String unfiltered(String str) {
        return str.replaceAll("shit","*").replaceAll("fuck","*");
    }
}
