package back_bencher_codding;

public class StringRemoveReverse {
	public static void main(String[] args) {
		String aaa = "";
		String aa = "XMEXBIXN".toLowerCase();
		String name1 = "X".toLowerCase();
		String rev = aa.replaceAll(name1, "");
		System.out.println(rev);
		for (int i = rev.length() - 1; i >= 0; i--) {
			aaa = aaa + rev.charAt(i);

		}
		System.out.println(aaa);

	}

}
