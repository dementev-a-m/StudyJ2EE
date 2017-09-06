package ru.adementev.numberGenerator;

import ru.adementev.logger.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by Антон Дементьев on 06.09.2017.
 */
@EightDigits
public class IssnGenerator implements NumberGenerator {
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber() {
        String issn="8-"+Math.abs(new Random().nextInt());
        logger.info("Сгенерирован ISSN: "+ issn);
        return issn;
    }
}
