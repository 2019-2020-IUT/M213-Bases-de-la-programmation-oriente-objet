package ip;

public class IP {
	private String ip;

	public IP(String s) {
		if (ipValide(s))
			ip = s;
	}
	
	public String getIP() {
		return ip;
	}
	
	public IP getPasserelle(IP masque) {
		String ipPass = "";
		
		switch (masque.ip) {
		case "255.0.0.0" :  
			ipPass = this.ip.substring(0, this.ip.indexOf(".")+1)+"255.255.255"; 
			break;
		case "255.255.0.0" : 
			ipPass = this.ip.substring(0, this.ip.indexOf(".")+1);
			String temp = ip.substring(ip.indexOf(".")+1);
			ipPass += temp.substring(0, temp.indexOf(".")+1)+"255.255"; 
			break;
		case "255.255.255.0" : 
			ipPass = this.ip.substring(0, ip.lastIndexOf(".")+1)+"255"; 
			break;
		}
		
		return new IP(ipPass);
	}

	public String toString() {
		return ip;
	}
	
	public static boolean ipValide(String ip) {
		if (ip.substring(0, 1).equals(".") || ip.substring(ip.length()-1).equals(".")) {
			System.out.println("Bad first or last character");
			return false;
		}
		
		String[] ipSep = ip.split("\\.");
		if (ipSep.length != 4) {
			System.out.println("Bad ip length "+ipSep.length);
			return false;
		}
		for (String s : ipSep) {
			if (s.length() == 0) {
				System.out.println("Empty ip field");
				return false;
			}
			
			int num = Integer.parseInt(s);
			if ((num<0) || (num>255)) {
				System.out.println("Bad ip field");
				return false;
			}
		}
		return true;
	}

}
