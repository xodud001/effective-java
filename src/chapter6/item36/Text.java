package chapter6.item36;

import java.util.EnumSet;
import java.util.Set;

//
public class Text {
    public enum Style{
        BOLD,
        ITALIC,
        UNDERLINE,
        STRIKETHROUGH
    }

    public void applyStyles(Set<Style> styles){

    }

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
