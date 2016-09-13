package com.gamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gamp.hittype.AppViewHit;
import com.gamp.hittype.EventHit;
import com.gamp.hittype.ExceptionHit;
import com.gamp.hittype.ItemHit;
import com.gamp.hittype.PageViewHit;
import com.gamp.hittype.ScreenViewHit;
import com.gamp.hittype.SocialHit;
import com.gamp.hittype.TimingHit;
import com.gamp.hittype.TransactionHit;

public class HitTypesTest {

    @Test
    public void testHitTypes() throws Exception {
        assertEquals("item", new ItemHit().hitType());
        assertEquals("appview", new AppViewHit().hitType());
        assertEquals("event", new EventHit().hitType());
        assertEquals("exception", new ExceptionHit().hitType());
        assertEquals("pageview", new PageViewHit().hitType());
        assertEquals("screenview", new ScreenViewHit().hitType());
        assertEquals("social", new SocialHit().hitType());
        assertEquals("timing", new TimingHit().hitType());
        assertEquals("transaction", new TransactionHit().hitType());
    }
}
