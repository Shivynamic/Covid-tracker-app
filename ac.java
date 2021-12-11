// Create a String request using Volley Library

String url = "https:// corona.lmao.ninja/v2/all";

StringRequest request
	= new StringRequest(
		Request.Method.GET,
		url,
		new Response.Listener() {
			@Override
			public void onResponse(
				String response)
			{
			}
		},
		new Response.ErrorListener() {
			@Override
			public void onErrorResponse(
				VolleyError error)
			{
			}
		});

RequestQueue requestQueue
	= Volley.newRequestQueue(this);
requestQueue.add(request);

/////////////
// Handle the JSON object and handle it inside try and catch

try {
	// Creating object of JSONObject
	JSONObject jsonObject
		= new JSONObject(
			response.toString());

	// Set the data in text view
	// which are available in JSON format
	// Note that the parameter
	// inside the getString() must match
	// with the name given in JSON format
	tvCases.setText(
		jsonObject.getString("cases"));
	tvRecovered.setText(
		jsonObject.getString("recovered"));
	tvCritical.setText(
		jsonObject.getString("critical"));
	tvActive.setText(
		jsonObject.getString("active"));
	tvTodayCases.setText(
		jsonObject.getString("todayCases"));
	tvTotalDeaths.setText(
		jsonObject.getString("deaths"));
	tvTodayDeaths.setText(
		jsonObject.getString("todayDeaths"));
	tvAffectedCountries.setText(
		jsonObject.getString("affectedCountries"));
}
catch (JSONException e) {
	e.printStackTrace();
}
