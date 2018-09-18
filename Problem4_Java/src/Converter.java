public class Converter {
    private String string;

    Converter(){
    }

    Converter(String newString){
        this.string = newString;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int toDecimal(){
        return Integer.parseInt(this.getString(),2);
    }

    public boolean isBinary(){
        for (int i = 0; i < this.getString().length(); ++i){
            if (this.getString().charAt(i) != '1' && this.getString().charAt(i) != '0') return false;
        }
        return true;
    }
}
