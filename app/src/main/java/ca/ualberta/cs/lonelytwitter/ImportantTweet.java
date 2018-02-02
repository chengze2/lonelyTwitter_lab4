package ca.ualberta.cs.lonelytwitter;

/**
 * Represents a important tweet
 *
 * @author ChengzeLi
 * @version 1.5
 * @see Tweet
 */

import java.util.Date;

public class ImportantTweet extends Tweet {

    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs a important tweet object
     * @param message tweet message
     * @param date tweet date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
