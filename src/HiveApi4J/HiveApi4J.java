package HiveApi4J;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HiveApi4J {

	public static String PlayerAllTimeStatics(String PlayerName) {
		String in;
		in = "game/all/all/" + PlayerName;
		return get(in);

	}

	public static String PlayerMonthlyStatics(String PlayerName, int month, int year) {
		String in;
		in = "game/monthly/player/all/" + PlayerName + "/" + year + "/" + month;
		return get(in);
	}

	public static String MonthlyLeaderBoard(String game, int year, int month) {
		String in;
		in = "game/monthly/" + game + "/" + year + "/" + month + "/100/0";
		return get(in);
	}

	public static String AllTimeLeaderBoard(String game) {
		String in;
		in = "game/all/" + game;
		return get(in);
	}

	public static String GlobalStatistics() {
		String in;
		in = "global/statistics";
		return get(in);
	}

	public static String map(String game) {
		String in;
		in = "game/map/" + game;
		return get(in);
	}

	public static String get(String in) {
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL("https://api.playhive.com/v0/" + in).openConnection();
			connection.setRequestMethod("GET");
			int responseCode = connection.getResponseCode();

			if (responseCode == 200) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line;
				StringBuilder response = new StringBuilder();

				while ((line = reader.readLine()) != null) {
					response.append(line);
				}
				reader.close();

				return response.toString();
			} else {
				return "Error :responce code[" + responseCode + "]";
			}

		} catch (Exception e) {
			return "Error : " + e.toString();
		}

	}

	public static String Convert2LV(int XP) {
		if (XP == 0) {
			return "{\"level\": \"0\", \"prestage\": 0}";
		}

		int pre = 0;
		int lv = 0;
		while (XP > 566100) {
			XP = XP - 566100;
			pre++;
		}

		lv = illdie(XP);
		return "{\"level\": \"" + lv + "\", \"prestage\": " + pre + "}";

	}

	public static void main(String[] args) {
		System.out.println(Convert2LV(222697));
	}

	private static int illdie(int XP) {	
        if (XP == 0) return 0;
        else if (XP <= 150) return 1;
        else if (XP <= 450) return 2;
        else if (XP <= 900) return 3;
        else if (XP <= 1500) return 4;
        else if (XP <= 2250) return 5;
        else if (XP <= 3150) return 6;
        else if (XP <= 4200) return 7;
        else if (XP <= 5400) return 8;
        else if (XP <= 6750) return 9;
        else if (XP <= 8250) return 10;
        else if (XP <= 9900) return 11;
        else if (XP <= 11700) return 12;
        else if (XP <= 13650) return 13;
        else if (XP <= 15750) return 14;
        else if (XP <= 18000) return 15;
        else if (XP <= 20400) return 16;
        else if (XP <= 22950) return 17;
        else if (XP <= 25650) return 18;
        else if (XP <= 28500) return 19;
        else if (XP <= 31500) return 20;
        else if (XP <= 34650) return 21;
        else if (XP <= 37950) return 22;
        else if (XP <= 41400) return 23;
        else if (XP <= 45000) return 24;
        else if (XP <= 48750) return 25;
        else if (XP <= 52650) return 26;
        else if (XP <= 56700) return 27;
        else if (XP <= 60900) return 28;
        else if (XP <= 65250) return 29;
        else if (XP <= 69750) return 30;
        else if (XP <= 74400) return 31;
        else if (XP <= 79200) return 32;
        else if (XP <= 84150) return 33;
        else if (XP <= 89250) return 34;
        else if (XP <= 94500) return 35;
        else if (XP <= 99900) return 36;
        else if (XP <= 105450) return 37;
        else if (XP <= 111150) return 38;
        else if (XP <= 117000) return 39;
        else if (XP <= 123000) return 40;
        else if (XP <= 129150) return 41;
        else if (XP <= 135450) return 42;
        else if (XP <= 141900) return 43;
        else if (XP <= 148500) return 44;
        else if (XP <= 155250) return 45;
        else if (XP <= 162150) return 46;
        else if (XP <= 169200) return 47;
        else if (XP <= 176400) return 48;
        else if (XP <= 183750) return 49;
        else if (XP <= 191250) return 50;
        else if (XP <= 198900) return 51;
        else if (XP <= 206550) return 52;
        else if (XP <= 214200) return 53;
        else if (XP <= 221850) return 54;
        else if (XP <= 229500) return 55;
        else if (XP <= 237150) return 56;
        else if (XP <= 244800) return 57;
        else if (XP <= 252450) return 58;
        else if (XP <= 260100) return 59;
        else if (XP <= 267750) return 60;
        else if (XP <= 275400) return 61;
        else if (XP <= 283050) return 62;
        else if (XP <= 290700) return 63;
        else if (XP <= 298350) return 64;
        else if (XP <= 306000) return 65;
        else if (XP <= 313650) return 66;
        else if (XP <= 321300) return 67;
        else if (XP <= 328950) return 68;
        else if (XP <= 336600) return 69;
        else if (XP <= 344250) return 70;
        else if (XP <= 351900) return 71;
        else if (XP <= 359550) return 72;
        else if (XP <= 367200) return 73;
        else if (XP <= 374850) return 74;
        else if (XP <= 382500) return 75;
        else if (XP <= 390150) return 76;
        else if (XP <= 397800) return 77;
        else if (XP <= 405450) return 78;
        else if (XP <= 413100) return 79;
        else if (XP <= 420750) return 80;
        else if (XP <= 428400) return 81;
        else if (XP <= 436050) return 82;
        else if (XP <= 443700) return 83;
        else if (XP <= 451350) return 84;
        else if (XP <= 459000) return 85;
        else if (XP <= 466650) return 86;
        else if (XP <= 474300) return 87;
        else if (XP <= 481950) return 88;
        else if (XP <= 489600) return 89;
        else if (XP <= 497250) return 90;
        else if (XP <= 504900) return 91;
        else if (XP <= 512550) return 92;
        else if (XP <= 520200) return 93;
        else if (XP <= 527850) return 94;
        else if (XP <= 535500) return 95;
        else if (XP <= 543150) return 96;
        else if (XP <= 550800) return 97;
        else if (XP <= 558450) return 98;
        else if (XP <= 566100) return 99;
        else if (XP == 566100) return 100;
        return 0;
	}
}
