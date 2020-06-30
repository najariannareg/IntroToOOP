class PatternFormatException extends Exception{
    PatternFormatException(String message){
        super(message);
    }
    PatternFormatException(){
        super("wrong pattern");
    }
}
