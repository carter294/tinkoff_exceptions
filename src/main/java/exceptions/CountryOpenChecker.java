package exceptions;

public class CountryOpenChecker {

    public static String getOpen (final Country country) throws NoSuchCountryException {
        switch (country) {
            case RUSSIA:
            case CHILI:
                return "open";
            case USA:
            case HUNGARY:
                return "limited open";
            // в enum Country нет элемента для которого бы вызов name() возвращал "СHINA" (строка, возвращаемая name(),
            // не равна "СHINA" с кириллической С в начале)
            case CHINA:
            case UK:
                return "closed";
            default:
                throw new exceptions.NoSuchCountryException();
        }
    }
}
