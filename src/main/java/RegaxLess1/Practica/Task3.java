package RegaxLess1.Practica;

public class Task3 {
    public static void main(String[] args) {
        //с помощью вопросительного знака идёт управление модификатором. ?-ленивый, без ?-жадный.уберет текст, и не будет проверять каждый элемент
        String regex="(<p .+?>)(.+?</p>)";
        String input="<p>wqeqw few ewqw </p> <b> fweqw </b> fedqwkm <p id=\"p1\">dqwqw wqfgrf </p>" +
                "fdwqwd qwd <p>12eeed dqwq ";
        System.out.println(input.replaceAll(regex,"<p>$2"));
    }
}
