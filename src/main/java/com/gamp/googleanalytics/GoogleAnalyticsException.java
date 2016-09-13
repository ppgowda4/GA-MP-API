package com.gamp.googleanalytics;

/**
 * Any exception thrown (usually due to validation), it would be of this type.
 *
 * @author Punith
 */
public class GoogleAnalyticsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public GoogleAnalyticsException() {
        super();
    }

    public GoogleAnalyticsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GoogleAnalyticsException(String message) {
        super(message);
    }

    public GoogleAnalyticsException(Throwable cause) {
        super(cause);
    }
}
