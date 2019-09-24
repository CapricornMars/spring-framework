package test.lihp;

import org.springframework.stereotype.Service;

/**
 * @author luoxin
 * @Description:
 * @date 2019/9/24 15:12
 */
@Service
public class CityService {
	private String name;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CityService{" +
				"name='" + name + '\'' +
				", location='" + location + '\'' +
				'}';
	}
}
