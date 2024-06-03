package Jun3;
import java.util.ArrayList;
import java.util.List;

class CityClass {
	
 private String cityName;
 public String getCityName() 
 {
  return cityName;
 }
 public void setCityName(String cityName) 
 {
  this.cityName = cityName;
 }
@Override
 public String toString() 
 {
  return cityName;
 }
}
class State {
  private String stateName;
  List<CityClass> citys;
  public String getStateName() 
  {
   return stateName;
  }
  public void setStateName(String stateName)
   {
     this.stateName = stateName;
   }
  public List<CityClass> getCities()
  {
  return citys;
  }
  public void setState(List<CityClass> citys) 
  {
  this.citys = citys;
  }
}
public class AssocationP {
public static void main(String[] args)
{
	State state = new State();
	state.setStateName("Madhya Pradesh");

	CityClass city1 = new CityClass();
	city1.setCityName("Indore");
	CityClass city2 = new CityClass();
	city2.setCityName("Bhopal");
	CityClass city3 = new CityClass();
	city3.setCityName("Jabalpur");
	List<CityClass> SL = new ArrayList<CityClass>();
		SL.add(city1);
		SL.add(city2);
		SL.add(city3);
		state.setState(SL);
		System.out.println(state.getCities()+" are cities in the state "+
			state.getStateName());
	}
}
