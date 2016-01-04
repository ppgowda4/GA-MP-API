package com.ppgfalcon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ppgfalcon.hittype.AppViewHit;
import com.ppgfalcon.hittype.EventHit;
import com.ppgfalcon.hittype.ExceptionHit;
import com.ppgfalcon.hittype.ItemHit;
import com.ppgfalcon.hittype.PageViewHit;
import com.ppgfalcon.hittype.ScreenViewHit;
import com.ppgfalcon.hittype.SocialHit;
import com.ppgfalcon.hittype.TimingHit;
import com.ppgfalcon.hittype.TransactionHit;

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
