package com.ppgfalcon.transport;

import com.ppgfalcon.config.GoogleAnalyticsConfig;

/**
 * 
 * Mechanism to discover some default request parameters.
 * @author punith 
 */

public interface RequestParameterDiscoverer {
	public DefaultRequest discoverParameters(GoogleAnalyticsConfig config, DefaultRequest request);
}
