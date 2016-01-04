# GA-MP-API
Google Analytics - Measurement Protocol

A interface/Java API for java based applications to connect google web analytics (Measurement Protocol).

Features
--------------
This library implements the measurement protocol with following features.

* Supports all parameters and hit types.
* Able to configure default parameters, which would be used for each request.
* Type safe data types as appropriate (String, Integer, Double and Boolean)
* Convenient hit specific request types for easy construction.
* Synchronous or Asynchronous Event Processing.
* Support for delayed request construction.
* Asynchronous processing uses Java Concurrent Executor Service.
* Uses the latest Apache Http Client (4.3) for high performing event posting.
* Event posting can be enabled/disabled at run time at configuration level.
* Supports connections via Proxy
* Gathers some basic information from the underlying Jvm (File Encoding, User Language, Screen Size, Color Depth etc)
* Validates the request and can throw exception or log warning if validation fails (still wip)
* Logging uses SLF4J api
* Gathers basic stats (number of events posted for each hit type) if requested in the configuration.
* Implementation is Thread Safe
* Jar files are OSGi ready, so could be used with Eclipse
* Build against Java 1.6
* Complete Measurement Protocol parameter information is made available as Javadocs

Examples
-------------

	GoogleAnalytics ga = new GoogleAnalytics("TRACKING_NO", isMobileApp, "APP_NAME", "APP_VERSION");
	if(isMobileApp) {
  		ga.post(new ScreenViewHit("SCREEN_TITLE", "SUB_SCREEN_TITLE"));
	} else {
  		ga.post(new PageViewHit("https://www.google.com", "Google Search"));
	}




<a rel="license" href="http://creativecommons.org/licenses/by/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">GA-MP-API</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="http://in.linkedin.com/in/punithgowdap" property="cc:attributionName" rel="cc:attributionURL">Punith P</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/4.0/">Creative Commons Attribution 4.0 International License</a>.<br />Based on a work at <a xmlns:dct="http://purl.org/dc/terms/" href="https://github.com/punithgowdap/GA-MP-API.git" rel="dct:source">https://github.com/punithgowdap/GA-MP-API.git</a>.
