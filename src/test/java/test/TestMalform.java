package test;
import org.junit.Test;

import com.google.gson.Gson;
import com.graction.lumi.model.openData.IntegratedAirQualityModel;

public class TestMalform {

	@Test
	public void test() {
//		fail("Not yet implemented");
		String result = "{\"list\":[{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.4\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 17:00\",\"khaiGrade\":\"1\",\"khaiValue\":\"40\",\"mangName\":\"도시대기\",\"no2Grade\":\"1\",\"no2Value\":\"0.021\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.022\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"1\",\"pm10Value\":\"18\",\"pm10Value24\":\"24\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"1\",\"pm25Value\":\"5\",\"pm25Value24\":\"10\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.005\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.4\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 16:00\",\"khaiGrade\":\"1\",\"khaiValue\":\"43\",\"mangName\":\"도시대기\",\"no2Grade\":\"1\",\"no2Value\":\"0.020\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.026\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"1\",\"pm10Value\":\"20\",\"pm10Value24\":\"26\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"1\",\"pm25Value\":\"10\",\"pm25Value24\":\"12\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.005\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.4\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 15:00\",\"khaiGrade\":\"1\",\"khaiValue\":\"47\",\"mangName\":\"도시대기\",\"no2Grade\":\"1\",\"no2Value\":\"0.021\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.024\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"1\",\"pm10Value\":\"25\",\"pm10Value24\":\"28\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"1\",\"pm25Value\":\"9\",\"pm25Value24\":\"12\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.005\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.4\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 14:00\",\"khaiGrade\":\"1\",\"khaiValue\":\"48\",\"mangName\":\"도시대기\",\"no2Grade\":\"1\",\"no2Value\":\"0.020\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.025\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"1\",\"pm10Value\":\"26\",\"pm10Value24\":\"29\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"1\",\"pm25Value\":\"8\",\"pm25Value24\":\"13\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.006\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.5\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 13:00\",\"khaiGrade\":\"1\",\"khaiValue\":\"48\",\"mangName\":\"도시대기\",\"no2Grade\":\"1\",\"no2Value\":\"0.017\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.027\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"2\",\"pm10Value\":\"32\",\"pm10Value24\":\"29\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"1\",\"pm25Value\":\"13\",\"pm25Value24\":\"14\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.005\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.5\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 12:00\",\"khaiGrade\":\"1\",\"khaiValue\":\"50\",\"mangName\":\"도시대기\",\"no2Grade\":\"1\",\"no2Value\":\"0.022\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.022\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"2\",\"pm10Value\":\"32\",\"pm10Value24\":\"28\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"1\",\"pm25Value\":\"13\",\"pm25Value24\":\"15\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.006\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.5\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 11:00\",\"khaiGrade\":\"1\",\"khaiValue\":\"50\",\"mangName\":\"도시대기\",\"no2Grade\":\"1\",\"no2Value\":\"0.018\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.024\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"2\",\"pm10Value\":\"35\",\"pm10Value24\":\"27\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"2\",\"pm25Value\":\"16\",\"pm25Value24\":\"15\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.006\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.6\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 10:00\",\"khaiGrade\":\"2\",\"khaiValue\":\"54\",\"mangName\":\"도시대기\",\"no2Grade\":\"2\",\"no2Value\":\"0.033\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.013\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"2\",\"pm10Value\":\"31\",\"pm10Value24\":\"25\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"2\",\"pm25Value\":\"16\",\"pm25Value24\":\"15\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.006\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.6\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 09:00\",\"khaiGrade\":\"2\",\"khaiValue\":\"63\",\"mangName\":\"도시대기\",\"no2Grade\":\"2\",\"no2Value\":\"0.038\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.007\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"1\",\"pm10Value\":\"27\",\"pm10Value24\":\"24\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"2\",\"pm25Value\":\"17\",\"pm25Value24\":\"15\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.006\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"},{\"_returnType\":\"json\",\"coGrade\":\"1\",\"coValue\":\"0.6\",\"dataTerm\":\"\",\"dataTime\":\"2017-12-26 08:00\",\"khaiGrade\":\"2\",\"khaiValue\":\"58\",\"mangName\":\"도시대기\",\"no2Grade\":\"2\",\"no2Value\":\"0.035\",\"numOfRows\":\"10\",\"o3Grade\":\"1\",\"o3Value\":\"0.010\",\"pageNo\":\"1\",\"pm10Grade\":\"1\",\"pm10Grade1h\":\"1\",\"pm10Value\":\"22\",\"pm10Value24\":\"23\",\"pm25Grade\":\"1\",\"pm25Grade1h\":\"1\",\"pm25Value\":\"14\",\"pm25Value24\":\"14\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"\",\"sidoName\":\"\",\"so2Grade\":\"1\",\"so2Value\":\"0.005\",\"stationCode\":\"\",\"stationName\":\"\",\"totalCount\":\"\",\"ver\":\"\"}],\"parm\":{\"_returnType\":\"json\",\"coGrade\":\"\",\"coValue\":\"\",\"dataTerm\":\"DAILY\",\"dataTime\":\"\",\"khaiGrade\":\"\",\"khaiValue\":\"\",\"mangName\":\"\",\"no2Grade\":\"\",\"no2Value\":\"\",\"numOfRows\":\"10\",\"o3Grade\":\"\",\"o3Value\":\"\",\"pageNo\":\"1\",\"pm10Grade\":\"\",\"pm10Grade1h\":\"\",\"pm10Value\":\"\",\"pm10Value24\":\"\",\"pm25Grade\":\"\",\"pm25Grade1h\":\"\",\"pm25Value\":\"\",\"pm25Value24\":\"\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"B0HQD8ZLlW2LNyCNkg3pjKg5IyY/2oJ/m3b92Q/UuqW75TlkLEVOJxNzRHUEKtH/4i+Sl9DFQRbCpQstzRdNjg==\",\"sidoName\":\"\",\"so2Grade\":\"\",\"so2Value\":\"\",\"stationCode\":\"\",\"stationName\":\"종로구\",\"totalCount\":\"\",\"ver\":\"1.3\"},\"ArpltnInforInqireSvcVo\":{\"_returnType\":\"json\",\"coGrade\":\"\",\"coValue\":\"\",\"dataTerm\":\"DAILY\",\"dataTime\":\"\",\"khaiGrade\":\"\",\"khaiValue\":\"\",\"mangName\":\"\",\"no2Grade\":\"\",\"no2Value\":\"\",\"numOfRows\":\"10\",\"o3Grade\":\"\",\"o3Value\":\"\",\"pageNo\":\"1\",\"pm10Grade\":\"\",\"pm10Grade1h\":\"\",\"pm10Value\":\"\",\"pm10Value24\":\"\",\"pm25Grade\":\"\",\"pm25Grade1h\":\"\",\"pm25Value\":\"\",\"pm25Value24\":\"\",\"resultCode\":\"\",\"resultMsg\":\"\",\"rnum\":0,\"serviceKey\":\"B0HQD8ZLlW2LNyCNkg3pjKg5IyY/2oJ/m3b92Q/UuqW75TlkLEVOJxNzRHUEKtH/4i+Sl9DFQRbCpQstzRdNjg==\",\"sidoName\":\"\",\"so2Grade\":\"\",\"so2Value\":\"\",\"stationCode\":\"\",\"stationName\":\"종로구\",\"totalCount\":\"\",\"ver\":\"1.3\"},\"totalCount\":23}";
		Gson gson = new Gson();
		IntegratedAirQualityModel model = gson.fromJson(result, IntegratedAirQualityModel.class);
		System.out.println(model);
	}

}