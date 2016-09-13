package com.gamp.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.gamp.config.GoogleAnalyticsConfig;
import com.gamp.transport.DefaultRequest;
import com.gamp.transport.DefaultRequestParameterDiscoverer;

public class DefaultRequestParameterDiscovererTest {

    @Test
    public void testDiscoverParameters() throws Exception {
        DefaultRequestParameterDiscoverer discoverer = new DefaultRequestParameterDiscoverer();
        DefaultRequest request = new DefaultRequest();

        GoogleAnalyticsConfig config = new GoogleAnalyticsConfig();

        assertNull(config.getUserAgent());
        assertNull(request.userLanguage());
        assertNull(request.documentEncoding());

        discoverer.discoverParameters(config, request);

        assertNotNull(config.getUserAgent());
        assertNotNull(request.userLanguage());
        assertNotNull(request.documentEncoding());
    }

}
