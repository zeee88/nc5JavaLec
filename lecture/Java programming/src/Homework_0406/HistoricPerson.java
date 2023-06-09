package Homework_0406;

public class HistoricPerson {

//	2. HistoricPerson이란 클래스를 만들고 String name; String achievement; String country; 를 멤버변수로 만들고
//	   getter/setter 메소드를 생성합니다. getPersonInfo(String achievement); 매개변수로 받아온 업적에 해당하는 역사적 인물의
//	    정보를 리턴하는 기능을 만들고 
	
	
	private String name;
	private String achievement;
	private String country;
	

	
	public HistoricPerson(String name, String achievement, String country) {
		this.name = name;
		this.achievement = achievement;
		this.country = country;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	@Override
	public String toString() {
		return "HistoricPerson [name=" + name + ", achievement=" + achievement + ", country=" + country + "]";
	}

	
//	4. HistoricPerson에 getSameCountryPerson(String country)를 만들고
//    2번에서 만든 List를 스트림으로 변환하고 사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력하세요. 
	
	public boolean getSameCountryPerson(String country) {
		if(this.getCountry().equals(country)) {
			return true;
		}
		
		return false;
	}
	
	
	
//	클래스 안에 있는 모든 정보를 다 출력하려면 타입을 클래스명으로 설정
	
	
	//방법1
//	public HistoricPerson getPersonInfo(String achievement) {
//		if(achievement.equals(this.achievement)) {
//			return new HistoricPerson(this.name, this.achievement, this.country);
//		}else
//			return new HistoricPerson("","","");
//		
//	}
	
	//방법 1-1
//	public HistoricPerson getPerInfo(String achievement) {
//				if(this.achievement.equals(achievement)) {
//					return this;
//				}
//				return null;
//	}
	
	
	
	//방법2
//	public boolean getPersonInfo(String achievement) {
//		if(achievement.equals(this.achievement)) {
//			return true;
//		}else
//			return false;
//	}
	
	
	
	
	
	
}
