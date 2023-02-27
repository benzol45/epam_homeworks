import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;


public class LoggerLesson {
    private static final Logger logger = LoggerFactory.getLogger(LoggerLesson.class);

    public static void main(String[] args) {
        while (true) {
            logger.info("Message for logging at time: {}", LocalDateTime.now());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
