package druhypolrok.tyzden16;

public class zena extends entita {
	public zena(int vek, String meno, int vyska) {
		super(vek, meno, vyska);
	}

	public String getPohlavie() {
			return pohlavie;
		}

	private final String pohlavie = "ženské";
}

