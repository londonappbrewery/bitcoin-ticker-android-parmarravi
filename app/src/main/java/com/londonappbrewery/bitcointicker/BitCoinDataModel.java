package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by raviprmr21 on 27/5/17.
 */

public class BitCoinDataModel {

	// TODO: Declare the member variables here
	private String mPrice;

	// TODO: Create a WeatherDataModel from a JSON:
	public static BitCoinDataModel fromJson(JSONObject jsonObject) {
		try {
			BitCoinDataModel bitCoinData = new BitCoinDataModel();
			bitCoinData.mPrice = jsonObject.getString("last");
			Log.d("Bitcoin price:",bitCoinData.mPrice);
			return bitCoinData ;
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getPrice() {
		return mPrice;
	}
}
