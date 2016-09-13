package com.gamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gamp.hittype.PageViewHit;

public class GoogleAnalyticsRequestTest {

    @Test
    public void testRequestSetterGetter() throws Exception {
        PageViewHit request = new PageViewHit();

        assertEquals("1.2.3.4", request.userIp("1.2.3.4").userIp());
        assertEquals("Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.14",
                     request.userAgent("Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.14").userAgent());
    }

    @Test
    public void testExprimentArgs() throws Exception {
        PageViewHit pageViewHit = new PageViewHit().expirementId("1234567890").expirementVariant("some variation");
        assertEquals("1234567890", pageViewHit.expirementId());
        assertEquals("some variation", pageViewHit.expirementVariant());
    }
}
