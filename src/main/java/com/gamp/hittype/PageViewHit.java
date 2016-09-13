package com.gamp.hittype;

import com.gamp.transport.GoogleAnalyticsRequest;

/**
 * GA request to track a typical web page view
 *
 * <p>For more information, see <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#content">GA Parameters Reference</a></p>
 *
 * @author Punith
 */
public class PageViewHit extends GoogleAnalyticsRequest<PageViewHit> {
    public PageViewHit() {
        this(null, null, null);
    }

    public PageViewHit(String url, String title) {
        this(url, title, null);
    }

    public PageViewHit(String url, String title, String description) {
        super("pageview");
        documentUrl(url);
        documentTitle(title);
        contentDescription(description);
    }
}
