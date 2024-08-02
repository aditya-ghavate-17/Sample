//this is extraaaaaa
package mappingexample177;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@Entity
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor

@Data
public class lombok {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int facultyCode;
	String facultyName;

	public lombok(String facultyName) {
		super();
		this.facultyName = facultyName;
	}

	public lombok(int facultyCode, String facultyName) {
		super();
		this.facultyCode = facultyCode;
		this.facultyName = facultyName;
	}

}
