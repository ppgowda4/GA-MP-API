package com.gamp.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.gamp.config.GoogleAnalyticsConfig;
import com.gamp.transport.AwtRequestParameterDiscoverer;
import com.gamp.transport.DefaultRequest;

public class AwtRequestParameterDiscovererTest {

    @Test
    public void testDiscoverParameters() throws Exception {
        AwtRequestParameterDiscoverer discoverer = new AwtRequestParameterDiscoverer();
        DefaultRequest request = new DefaultRequest();

        GoogleAnalyticsConfig config = new GoogleAnalyticsConfig();

        assertNull(config.getUserAgent());
        assertNull(request.userLanguage());
        assertNull(request.documentEncoding());
        assertNull(request.screenColors());
        assertNull(request.screenResolution());

        discoverer.discoverParameters(config, request);

        assertNotNull(config.getUserAgent());
        assertNotNull(request.userLanguage());
        assertNotNull(request.documentEncoding());
        assertNotNull(request.screenColors());
        assertNotNull(request.screenResolution());
    }

}
