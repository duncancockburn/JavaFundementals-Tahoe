package subclasses;

public class Challange {
    public static void main(String[] args)
    {
        Challange obj=new Challange();
        String word = "Quora";
        System.out.println("Reverse of \'"+word+"\' is \'"+obj.reverse(word)+"\'");
    }


    public String reverse(String word) {
        if ((word==null)||(word.length() <= 1) )
            return word;
        return reverse(word.substring(1)) + word.charAt(0);
    }


}
