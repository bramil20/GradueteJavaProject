import java.util.EnumSet;

public class TestLunaFish {

	public static void main(String[] args) {

		for (LunaFish cookies : LunaFish.values()){
			System.out.printf("%s\t %s\t  %s\n", cookies, cookies.getDesc(), cookies.getGrade());
		}
		
		System.out.println("\nSetting up the range\n");
		for (LunaFish cookies: EnumSet.range(LunaFish.medenoSrce, LunaFish.najlepseZelje))
			System.out.printf("%s\t %s\t  %s\n", cookies, cookies.getDesc(), cookies.getGrade());
		
	}

}
