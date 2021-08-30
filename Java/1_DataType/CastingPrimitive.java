public class CastingPrimitive {

	public static void main(String[] args) {
		// 기본형 형변환 (정수, 실수, 문자, 논리)
		// 형변환 (데이터 type변환)
		byte b1 = 100;
		int i1 = 200;
		
		i1 = b1; //가능: int(큼) <-- byte (작음)
		// 자동으로 byte에 들어있던 100데이터가 int로 변환돼 저장됨.
		// 자동 데이터 변환(자동형변환)

		b1 = i1; //불가능: int(큼) --> byte (작음)
		b1 = (byte)i1;	//강제형변환
		// 강제로 int에 들어있던 100데이터가 byte로 변환돼 저장됨.
		// 강제 데이터 변환(강제형변환)
		// 강제 형변환은 범위에 있는 값만 가능하다.
	}
}
