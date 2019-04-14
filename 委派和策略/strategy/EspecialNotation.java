package strategy;

public class EspecialNotation implements Unfiltereder{
    @Override
    public String unfiltered(String str) {
        return str.replaceAll("%","*").replaceAll("_","*");
    }
}
