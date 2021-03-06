package com.graction.lumi.data;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Arrays;
import java.util.function.ToIntFunction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graction.lumi.data.DataStorage.Param;
import com.graction.lumi.model.db.RegionReservationTable;
import com.graction.lumi.util.StringUtil;
import com.graction.lumi.util.file.FileManager;
import com.graction.lumi.util.format.DateManager;

public class RequestToModelManager {
	private static final RequestToModelManager instance = new RequestToModelManager();
	
	public static RequestToModelManager getInstance() {
		return instance;
	}

	public RegionReservationTable requestRegionReservationTable(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		DateManager dateManager = DateManager.getInstance();
		String region = StringUtil.requestParamEncoding(request.getParameter(Param.PARAM_REGION))
				, fileInfo = FileManager.getInstance().insertfileInformation(request, response);
		String[] times = request.getParameter(Param.PARAM_TIME).split("-");
		int[] img_index = Arrays.stream(fileInfo.split(",")).mapToInt(new ToIntFunction<String>() {
			public int applyAsInt(String value) {
				return Integer.parseInt(value);
			};
		}).toArray();
		int idx = Integer.parseInt(StringUtil.getDefaultString(request.getParameter(Param.PARAM_INDEX),"0"))
			, background_index = img_index[0] != 0 ? img_index[0] : Integer.parseInt(StringUtil.getDefaultString(request.getParameter(Param.PARAM_BACKGROUND_INDEX),"0"))
			, character_index = img_index[1] != 0 ? img_index[1] : Integer.parseInt(StringUtil.getDefaultString(request.getParameter(Param.PARAM_CHARACTER_INDEX),"0"))
			, effect_index = img_index[2] != 0 ? img_index[2] : Integer.parseInt(StringUtil.getDefaultString(request.getParameter(Param.PARAM_EFFECT_INDEX),"0"))
			;
		return new RegionReservationTable(idx, background_index, character_index, effect_index, region, request.getParameter(Param.PARAM_PRIORITIZATION), new Timestamp(System.currentTimeMillis()), dateManager.stringToTimestamp(times[0]), dateManager.stringToTimestamp(times[1]));
	}
}
