package org.yeeku.schedule;

import java.util.TimerTask;

import org.yeeku.service.AuctionManager;
import org.yeeku.exception.AuctionException;

public class CheckWiner extends TimerTask
{
	private AuctionManager mgr;
	public void setMgr(AuctionManager mgr)
	{
		this.mgr = mgr;
	}

	public void run()
	{
		System.out.println("---------------------");
		try
		{
			mgr.updateWiner();
		}
		catch (AuctionException ae)
		{
			ae.printStackTrace();
		}
	}
}
