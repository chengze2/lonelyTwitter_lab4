package ca.ualberta.cs.lonelytwitter;

/**
 * Represent a normal tweet
 *
 * @author Chengzeli
 * @version 1.5
 * @see Tweet
 */

import java.util.Date;

public class NormalTweet extends Tweet {
    /**
     * Constructs a normal tweet object
     * @param message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a normal tweet object
     * @param message tweet message
     * @param date tweet date
     */

    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
