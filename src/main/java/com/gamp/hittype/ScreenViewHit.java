package com.gamp.hittype;

import com.gamp.transport.GoogleAnalyticsRequest;

/**
 * GA request to track a typical mobile view
 *
 * <p>For more information, see <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#content">GA Parameters Reference</a></p>
 *
 * @author Punith
 */
public class ScreenViewHit extends GoogleAnalyticsRequest<ScreenViewHit> {
    public ScreenViewHit() {
        this(null, null, null);
    }

    public ScreenViewHit(String screenTiltle, String screenPath) {
        this(screenTiltle, screenPath, null);
    }

    public ScreenViewHit(String screenTiltle) {
        this(screenTiltle, null, null);
    }

    public ScreenViewHit(String screenTiltle, String screenPath, String description) {
        super("screenview");
        contentDescription(screenTiltle);
        documentHostName(screenTiltle);
        documentPath(screenPath);
        //contentDescription(description);
    }
}
