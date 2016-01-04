package com.ppgfalcon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ppgfalcon.config.GoogleAnalyticsConfig;

public class GoogleAnalyticsConfigTest {

    @Test
    public void testDefaultConfig() throws Exception {
        GoogleAnalyticsConfig config = new GoogleAnalyticsConfig();

        assertEquals("googleanalytics-thread-{0}", config.getThreadNameFormat());
        assertEquals(1, config.getMaxThreads());
        assertEquals("http://www.google-analytics.com/collect", config.getHttpUrl());
        assertEquals("https://ssl.google-analytics.com/collect", config.getHttpsUrl());
        assertEquals(8080, config.getProxyPort());
        assertEquals(true, config.isDiscoverRequestParameters());
        assertEquals(false, config.isGatherStats());
    }
}
