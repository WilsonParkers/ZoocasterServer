package test;

import org.junit.Test;

import com.google.gson.Gson;
import com.graction.lumi.model.openData.IntegratedAirQualityModel;
import com.graction.lumi.model.openData.NearbyMsrtnModel;
import com.graction.lumi.model.openWeather.WeatherModel;
import com.graction.lumi.model.request.LatLonRequestModel;
import com.graction.lumi.net.CustomIntercepter;
import com.graction.lumi.net.Net;
import com.graction.lumi.net.OpenDataFactoryIm;
import com.graction.lumi.util.DataProvideManager;
import com.graction.lumi.util.DataProvideManager.Complete;
import com.graction.lumi.util.DataProvideManager.Execution;
import com.graction.lumi.util.gps.AddressManager;
import com.graction.lumi.util.gps.GoogleGeoManager;
import com.graction.lumi.util.log.HLogger;
import com.graction.lumi.util.log.HLogger.LogType;
import com.graction.lumi.util.parser.LenientGsonConverterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class TestRetrofit {

	@Test
	public void test() {
		// fail("Not yet implemented");
		test6();
	}

	private String lat = "37.4965952", lon = "126.7870738", gu;
	private DataProvideManager dataProvideManager;
	private HLogger logger = new HLogger(TestRetrofit.class);
	private IntegratedAirQualityModel integratedAirQualityModel;
	private WeatherModel weatherModel;

	private void test1() {
		String addr = GoogleGeoManager.getInstance().getAddress("37.566535", "126.97796919999996");
		String[] address = AddressManager.getInstance().extractAddress(addr);
		System.out.println(addr);
		System.out.println(address[0]);
		System.out.println(address[1]);
		System.out.println(address[2]);
		try {
			Net.getInstance().getOpenDataRetrofit()
					.selectIntegratedAirQuality(new LatLonRequestModel(address[2]).getMap())
					.enqueue(new Callback<IntegratedAirQualityModel>() {

						@Override
						public void onResponse(Call<IntegratedAirQualityModel> call,
								Response<IntegratedAirQualityModel> response) {
							if (response.isSuccessful()) {
								System.out.println("body : " + response.body());
							}
						}

						@Override
						public void onFailure(Call<IntegratedAirQualityModel> call, Throwable t) {
							System.out.println("error : " + t.getMessage());
						}
					});
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void test2() {
		System.out.println("test2");
		try {
			new Retrofit.Builder().baseUrl("http://openapi.airkorea.or.kr/")
					.addConverterFactory(LenientGsonConverterFactory.create())
					// .addConverterFactory(GsonConverterFactory.create())
					.client(createClient()).build().create(OpenDataFactoryIm.class)
					.selectIntegratedAirQuality(new LatLonRequestModel("종로구").getMap())
					.enqueue(new Callback<IntegratedAirQualityModel>() {

						@Override
						public void onResponse(Call<IntegratedAirQualityModel> call,
								Response<IntegratedAirQualityModel> response) {
							if (response.isSuccessful()) {
								System.out.println("body : " + response.body());
							}
							System.out.println("not success : " + response.body());
						}

						@Override
						public void onFailure(Call<IntegratedAirQualityModel> call, Throwable t) {
							System.out.println("error : " + t.getMessage());
						}
					});
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void test3() {
		try {
			Net.getInstance().getOpenDataRetrofit().selectIntegratedAirQuality(new LatLonRequestModel("종로구").getMap())
					.enqueue(new Callback<IntegratedAirQualityModel>() {

						@Override
						public void onResponse(Call<IntegratedAirQualityModel> call,
								Response<IntegratedAirQualityModel> response) {
							if (response.isSuccessful()) {
								System.out.println("body : " + response.body());
							}
							System.out.println("not success : " + response.body());
						}

						@Override
						public void onFailure(Call<IntegratedAirQualityModel> call, Throwable t) {
							System.out.println("error : " + t.getMessage());
						}
					});
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private OkHttpClient createClient() {
		OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
		okHttpClientBuilder.addInterceptor(new CustomIntercepter());
		return okHttpClientBuilder.build();
	}

	private void test4() {
		/*
		 *
		 * 서울 중구 double x = 126.97796919999996 , y = 37.566535;
		 */
		try {
			Net.getInstance().getOpenDataRetrofit()
					.selectNearByMsrtnList(
							new LatLonRequestModel("37.566535", "126.97796919999996", LatLonRequestModel.KEY_OPEN_DATA)
									.getMap())
					.enqueue(new Callback<NearbyMsrtnModel>() {

						@Override
						public void onResponse(Call<NearbyMsrtnModel> call, Response<NearbyMsrtnModel> response) {
							if (response.isSuccessful()) {
								System.out.println("body : " + response.body());
							}
						}

						@Override
						public void onFailure(Call<NearbyMsrtnModel> call, Throwable t) {
							System.err.println(t);
							System.err.println(t.getMessage());
							t.printStackTrace();
						}
					});
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void test5() {
		/*
		 * String lat = "37.566535" , lon = "126.97796919999996";
		 */
		gu = AddressManager.getInstance().extractAddress(GoogleGeoManager.getInstance().getAddress(lat, lon))[2];
		Execution execution = new Execution() {

			@Override
			public void execution() {
				try {
					Net.getInstance().getOpenDataRetrofit()
							.selectIntegratedAirQuality(new LatLonRequestModel(gu).getMap())
							.enqueue(new Callback<IntegratedAirQualityModel>() {

								@Override
								public void onResponse(Call<IntegratedAirQualityModel> call,
										Response<IntegratedAirQualityModel> response) {
									if (response.isSuccessful()) {
										integratedAirQualityModel = response.body();
										logger.log(LogType.INFO,
												"integratedAirQuality(HttpServletRequest request, HttpServletResponse response) - selectIntegratedAirQuality",
												"success response body : " + response.body());
										if (integratedAirQualityModel.getList() == null
												|| integratedAirQualityModel.getList().size() == 0)
											dataProvideManager.nextExecution();
										else
											dataProvideManager.complete();
									} else {
										dataProvideManager.nextExecution();
									}
								}

								@Override
								public void onFailure(Call<IntegratedAirQualityModel> call, Throwable t) {
									logger.log(LogType.ERROR,
											"integratedAirQuality(HttpServletRequest request, HttpServletResponse response) - selectIntegratedAirQuality",
											"onFailure", t);
									dataProvideManager.nextExecution();
								}
							});
				} catch (Exception e) {
					logger.log(LogType.ERROR,
							"integratedAirQuality(HttpServletRequest request, HttpServletResponse response) - selectIntegratedAirQuality",
							"Exception", e);
				}
			}

		};

		dataProvideManager = new DataProvideManager(execution, new Complete() {

			@Override
			public void complete() {
				try {
					// WriteManager.getInstance().write(httpServletResponse, new
					// Gson().toJson(integratedAirQualityModel));
					System.out.println(integratedAirQualityModel);
				} catch (Exception e) {
					logger.log(HLogger.LogType.ERROR,
							"void integratedAirQualityTest(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse)",
							"Thread sleep Exception", e);
					e.printStackTrace();
				}
			}
		});

		dataProvideManager.addExecution(new Execution() {

			@Override
			public void execution() {
				try {
					Net.getInstance().getOpenDataRetrofit()
							.selectNearByMsrtnList(
									new LatLonRequestModel(lat, lon, LatLonRequestModel.KEY_OPEN_DATA).getMap())
							.enqueue(new Callback<NearbyMsrtnModel>() {

								@Override
								public void onResponse(Call<NearbyMsrtnModel> call,
										Response<NearbyMsrtnModel> response) {
									if (response.isSuccessful()) {
										NearbyMsrtnModel nearbyMsrtnModel = response.body();
										logger.log(LogType.INFO,
												"integratedAirQuality(HttpServletRequest request, HttpServletResponse response) - selectNearByMsrtnList",
												"success response body : " + response.body());
										if (nearbyMsrtnModel.getList() == null
												|| nearbyMsrtnModel.getList().size() > 1) {
											gu = nearbyMsrtnModel.getList().get(0).getStationName();
											execution.execution();
										} else
											dataProvideManager.nextExecution();
									} else {
										dataProvideManager.nextExecution();
									}
								}

								@Override
								public void onFailure(Call<NearbyMsrtnModel> call, Throwable t) {
									logger.log(LogType.ERROR,
											"integratedAirQuality(HttpServletRequest request, HttpServletResponse response) - selectNearByMsrtnList",
											"onFailure", t);
									dataProvideManager.nextExecution();
								}
							});
				} catch (Exception e) {
					logger.log(LogType.ERROR,
							"integratedAirQuality(HttpServletRequest request, HttpServletResponse response) - selectNearByMsrtnList",
							"Exception", e);
				}
			}
		});

		try {
			dataProvideManager.execution();
		} catch (InterruptedException e) {
			logger.log(HLogger.LogType.ERROR,
					"void integratedAirQualityTest(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse)",
					"Thread sleep Exception", e);
		}
	}

	private void test6() {
		dataProvideManager = new DataProvideManager(new Execution() {

			@Override
			public void execution() {
				Net.getInstance().getOpenWeatherFactoryIm().selectWeather(new LatLonRequestModel(lat, lon).getMap())
						.enqueue(new Callback<WeatherModel>() {

							@Override
							public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
								if (response.isSuccessful()) {
									weatherModel = response.body();
									// weatherModel =
									// dataTableManager.insertWeatherData(lat,
									// lon, weatherModel);
									// weatherModel =
									// WeatherDataProvider.getInstance().setWeatherdata(weatherModel);
									logger.log(HLogger.LogType.INFO,
											"void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) - onResponse(Call<WeatherModel> call, Response<WeatherModel> response)",
											"current weather insert successful");
									dataProvideManager.complete();
								} else {
									logger.log(HLogger.LogType.WARN,
											"void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) - onResponse(Call<WeatherModel> call, Response<WeatherModel> response)",
											"current weather insert is not successful");
								}
							}

							@Override
							public void onFailure(Call<WeatherModel> call, Throwable t) {
								logger.log(HLogger.LogType.ERROR,
										"void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) - onFailure(Call<WeatherModel> call, Throwable t)",
										"error is not successful", t);
								dataProvideManager.complete();
							}
						});

			}
		}, new Complete() {

			@Override
			public void complete() {
				try {
					logger.log(HLogger.LogType.INFO,
							"void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse)",
							new Gson().toJson(weatherModel));
					// WriteManager.getInstance().write(httpServletResponse, new
					// Gson().toJson(weatherModel));
				} catch (Exception e) {
					logger.log(HLogger.LogType.ERROR,
							"void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse)",
							"Thread sleep Exception", e);
				}
			}
		});
		try {
			dataProvideManager.execution();
		} catch (InterruptedException e) {
			logger.log(HLogger.LogType.ERROR,
					"void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse)",
					"Thread sleep Exception", e);
		}
	}

	private void test7() {
		Net.getInstance().getOpenWeatherFactoryIm().selectWeather(new LatLonRequestModel(lat, lon).getMap()).enqueue(new Callback<WeatherModel>() {

			@Override
			public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
				if (response.isSuccessful()) {
					weatherModel = response.body();
					logger.log(HLogger.LogType.INFO, "void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) - onResponse(Call<WeatherModel> call, Response<WeatherModel> response)", "current weather insert successful");
					dataProvideManager.complete();
				} else {
					logger.log(HLogger.LogType.WARN, "void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) - onResponse(Call<WeatherModel> call, Response<WeatherModel> response)", "current weather insert is not successful");
				}
			}

			@Override
			public void onFailure(Call<WeatherModel> call, Throwable t) {
				logger.log(HLogger.LogType.ERROR, "void current_weather(HttpServletRequest httpServletRequest, final HttpServletResponse httpServletResponse) - onFailure(Call<WeatherModel> call, Throwable t)", "error is not successful", t);
				dataProvideManager.complete();
			}
		});
	}
}
