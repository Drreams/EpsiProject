package serietheque.tools;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import serietheque.exceptions.SerieInexistanteException;
import serietheque.metier.Saison;
import serietheque.metier.Serie;

public class TMDBAPI {
	public static void main(String args[]) throws IOException
	{
		
	}
	private static final String API_KEY = "963e30959e03e2668d9f098fb9daa538";
	private static final String SERIE_ENDPOINT_URL = "https://api.themoviedb.org/3/tv/%SERIE_ID%?api_key="+API_KEY+"&language=fr";
	private static final String SAISON_ENDPOINT_URL = "https://api.themoviedb.org/3/tv/%SERIE_ID%/season/%SAISON_ID%?api_key="+API_KEY+"&language=fr";

	
	
	@SuppressWarnings("deprecation")
	public static Serie getSerie(int serieId) throws SerieInexistanteException {
		String url = SERIE_ENDPOINT_URL.replaceAll("%SERIE_ID%", String.valueOf(serieId));

		/*String json = readUrl(url);
		JSONObject jo = (JSONObject) new JSONTokener(IOUtils.toString(new URL(url));
		Gson gson = new Gson();
		 */
		System.out.println(url);

		JsonElement root;

		try {
			root = new JsonParser().parse(readFileFromServer(url));
		}
		catch(IOException e) {
			throw new SerieInexistanteException();
		}

		JsonElement root;

		try {
			root = new JsonParser().parse(readFileFromServer(url));
		}
		catch(IOException e) {
			throw new SerieInexistanteException();
		}

		
		String titre = root.getAsJsonObject().get("name").getAsString();

		Serie s = new Serie(serieId, titre);

		/*
		// TODO : A compléter
		for(...) {
		    Saison saison = getSaison(serieId, ...);
			s.addSaison(saison);
		}
		 */

		return s;
	}

	@SuppressWarnings("deprecation")
	public static Saison getSaison(int serieId, int saisonId) {
		String url = SAISON_ENDPOINT_URL.replaceAll("%SERIE_ID%", String.valueOf(serieId));
		url=url.replaceAll("%SAISON_ID%", String.valueOf(saisonId));

		Saison s = new Saison();

		/*
		 * TODO : A compléter
		 *
		 *  for(...) {
		 *   Episode e = getSaison(saisonId, numero, titre);
		 *	s.addSaison(e);
		 * }
		 */
		return s;
	}

	@SuppressWarnings("resource")
	public static String readFileFromServer(String fileUrl) throws IOException{
		URL url = new URL(fileUrl);
		return new Scanner(url.openStream()).useDelimiter("\\A").next();

	}
}