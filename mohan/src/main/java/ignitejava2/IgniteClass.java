package ignitejava2;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;

public class IgniteClass
{
	public static void main(String[] args)
	{
		Ignite ignite=Ignition.start();
		Ignition.setClientMode(true);
		IgniteConfiguration cfg=new IgniteConfiguration();
		cfg.setClientMode(true);
	}
}