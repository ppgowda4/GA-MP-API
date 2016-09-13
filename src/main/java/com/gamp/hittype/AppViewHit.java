package com.gamp.hittype;

import com.gamp.transport.GoogleAnalyticsRequest;

/**
 * GA request to track application page view (for mobile or desktop apps).
 *
 * <p>For more information, see <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#apptracking">GA Parameters Reference</a></p>
 *
 * @author Punith
 */
public class AppViewHit extends GoogleAnalyticsRequest<AppViewHit> {
    public AppViewHit() {
        this(null);
    }

    public AppViewHit(String contentDescription) {
        this(null, null, contentDescription);
    }

    public AppViewHit(String applicationName, String applicationVersion, String contentDescription) {
        super("appview");
        applicationName(applicationName);
        applicationVersion(applicationVersion);
        contentDescription(contentDescription);
    }

}
