package chap17_generic.clazz;

import java.util.HashMap;
import java.util.Map;

public class GroupA implements Group {
	private Map<String, String> memMap = new HashMap<String, String>();

	public GroupA() {
		this.memMap.put("전두하", "조장");
		this.memMap.put("신민규", "조원");
		this.memMap.put("김이슬", "조장");
		this.memMap.put("성지민", "조장");
	}
	
}