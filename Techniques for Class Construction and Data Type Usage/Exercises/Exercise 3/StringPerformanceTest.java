public class StringPerformanceTest {
	public static void main(String args[]) {
		//số lần thực hiện phép nối xâu
		int interactions = 100000;
		
		//đo thời gian nối xâu với String
		long startTime = System.currentTimeMillis();
		String result = "";
		for (int i = 0; i < interactions; i++) 
			result += "a";
		long endTime = System.currentTimeMillis();
		System.out.println("Thời gian nối xâu với String: " + (endTime - startTime) + "ms");
		//
		
		//đo thời gian nối xâu vói StringBuffer
		startTime = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < interactions; i++)
			stringBuffer.append("a");
		endTime = System.currentTimeMillis();
		System.out.println("Thời gian nối xâu với StringBuffer: " + (endTime - startTime) + "ms");
		//
	}
}