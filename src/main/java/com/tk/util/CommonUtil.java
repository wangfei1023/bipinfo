package com.tk.util;


import com.alibaba.fastjson.JSONObject;


/**
 * @author 
 */
public class CommonUtil {

    /**
     * return success code json
     *
     * @param returnData
     * @return
     */
    public static JSONObject successJson(Object returnData) {

    	 JSONObject jsonObject = new JSONObject();
         jsonObject.put("returnCode", Constants.SUCCESS_CODE);
         jsonObject.put("returnMsg", Constants.SUCCESS_MSG);
         if (null == returnData) {
             jsonObject.put("returnData", new JSONObject());
         } else {
             jsonObject.put("returnData", returnData);
         }
         return jsonObject;

    }

    /**
     * return error code json
     *
     * @param errorEnum
     * @return
     */
    public static JSONObject errorJson(ErrorEnum errorEnum) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("returnCode", errorEnum.getErrorCode());
        jsonObject.put("returnMsg", errorEnum.getErrorMsg());
        jsonObject.put("returnData", new JSONObject());
        return jsonObject;

    }


}
