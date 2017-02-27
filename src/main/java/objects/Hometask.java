package objects;


public class Hometask {
    private int number;
    private String header;
    private String theme;
    private String textOfHometask;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTextOfHometask() {
        return textOfHometask;
    }

    public void setTextOfHometask(String textOfHometask) {
        this.textOfHometask = textOfHometask;
    }

    public String toString(){
        String out;
        System.out.println();
        out = "Number of HT: " + number + ", Theme: " + theme + ", Header: " + header + ", Text: " + textOfHometask;
        return out;
    }

}
