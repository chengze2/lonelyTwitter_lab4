package ca.ualberta.cs.lonelytwitter;

/**
 * Represents a tweet interface
 *
 * @author ChengzeLi
 * @version 1.5
 * @see Tweet
 * @see NormalTweet
 * @see ImportantTweet
 */

import java.util.Date;

public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
