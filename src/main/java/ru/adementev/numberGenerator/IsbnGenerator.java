package ru.adementev.numberGenerator;
import ru.adementev.logger.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;
/**
 * Created by Антон Дементьев on 06.09.2017.
 */
@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber() {
        String isbn="13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Сгенирирован ISBN: "+isbn);
        return isbn;
    }
}
