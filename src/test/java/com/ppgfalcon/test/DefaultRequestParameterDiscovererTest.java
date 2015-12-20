package com.ppgfalcon.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.ppgfalcon.config.GoogleAnalyticsConfig;
import com.ppgfalcon.transport.DefaultRequest;
import com.ppgfalcon.transport.DefaultRequestParameterDiscoverer;

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
