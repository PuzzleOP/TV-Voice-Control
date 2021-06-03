package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class main
{
	static boolean allow = true;
	static InetAddress address;
	static SamsungRemote remote;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//ServerSocket ss = new ServerSocket(9115);
//
		//while (true)
		//{
//
	//		Socket s = ss.accept();
//
	//		InputStreamReader in = new InputStreamReader(s.getInputStream());
		//	BufferedReader bf = new BufferedReader(in);
//
	//		String str;
		//	str = bf.readLine();
//
	//		System.out.println(str);
			ExecuteCommand("mute");
		//}
	}

	static void ExecuteCommand(String message) throws IOException, InterruptedException
	{
		try {
			InetAddress address = InetAddress.getByName("192.168.0.18");
			SamsungRemote remote = new SamsungRemote(address);
			TVReply reply = remote.authenticate("Voice Recognition"); // Argument is the device name (displayed on television).
			if (reply == TVReply.ALLOWED) 
			{
				switch (message) 
				{
				case "unmute":
				case "mute":
					remote.keycode("KEY_MUTE");
					break;
				case "channel_up":
					remote.keycode("KEY_CHUP");
					break;
				case "channel_down":
					remote.keycode("KEY_CHDOWN");
					break;
				case "volume_up":
					remote.keycode("KEY_VOLUP");
					break;
				case "volume_down":
					remote.keycode("KEY_VOLDOWN");
					break;
				case "volume_up_10":
					for(int i = 0; i < 10; i++)
					{
						Thread.sleep(200);
						remote.keycode("KEY_VOLUP");
					}
					break;
				case "channel_up_10":
					for(int i = 0; i < 10; i++)
					{
						Thread.sleep(200);
						remote.keycode("KEY_CHUP");
					}
					break;
				case "volume_down_10":
					for(int i = 0; i < 10; i++)
					{
						Thread.sleep(200);
						remote.keycode("KEY_VOLDOWN");
					}
					break;
				case "channel_down_10":
					for(int i = 0; i < 10; i++)
					{
						Thread.sleep(100);
						remote.keycode("KEY_CHDOWN");
					}
					break;
				case "volume_up_20":
					for(int i = 0; i < 20; i++)
					{
						Thread.sleep(200);
						remote.keycode("KEY_VOLUP");
					}
					break;
				case "channel_up_20":
					for(int i = 0; i < 20; i++)
					{
						Thread.sleep(200);
						remote.keycode("KEY_CHUP");
					}
					break;
				case "volume_down_20":
					for(int i = 0; i < 20; i++)
					{
						Thread.sleep(200);
						remote.keycode("KEY_VOLDOWN");
					}
					break;
				case "channel_down_20":
					for(int i = 0; i < 20; i++)
					{
						Thread.sleep(200);
						remote.keycode("KEY_CHDOWN");
					}
					break;
				case "1":
					remote.keycode("KEY_1");
					break;
				case "2":
					remote.keycode("KEY_2");
					break;
				case "3":
					remote.keycode("KEY_3");
						break;
				case "4":
					remote.keycode("KEY_4");
					break;
				case "5":
					remote.keycode("KEY_5");
					break;
				case "6":
					remote.keycode("KEY_6");
						break;
				case "7":
					remote.keycode("KEY_7");
					break;
				case "8":
					remote.keycode("KEY_8");
					break;
				case "9":
					remote.keycode("KEY_9");
						break;
				case "0":
					remote.keycode("KEY_0");
					break;
				case "hdmi 1":
					remote.keycode("KEY_HDMI");
					break;
				case "hdmi 2":
					remote.keycode("KEY_HDMI1");
					break;
				case "hdmi 3":
					remote.keycode("KEY_HDMI2");
					break;
				case "hdmi 4":
					remote.keycode("KEY_HDMI3");
					break;
				case "hdmi 5":
					remote.keycode("KEY_HDMI4");
					break;
				case "guide":
					remote.keycode("KEY_GUIDE");
					break;
				case "ok":
					remote.keycode("KEY_ENTER");
					break;
				case "fox":
					remote.keycode("KEY_3");
					Thread.sleep(200);
					remote.keycode("KEY_3");
					Thread.sleep(200);
					remote.keycode("KEY_ENTER");
					break;

				}
			}
		}
		catch (IOException e) 
		{
			System.err.println(e.getMessage());
		}
	}

}
