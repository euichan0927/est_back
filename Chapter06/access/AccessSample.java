package Chapter06.access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessSample {
	private int number=1;
	int number2 = 2;
	protected int number3 = 3;
	public int number4 = 4;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		if(number2<0) {
			this.number2 = 0;
		}
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}
}
