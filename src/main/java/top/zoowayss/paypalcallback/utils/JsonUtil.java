package top.zoowayss.paypalcallback.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @Author: <a href="https://github.com/zoowayss">zoowayss</a>
 * @Date: 2024/4/7 13:40
 */

public class JsonUtil {

    /**
     * 格式化输出JSON字符串
     * @return 格式化后的JSON字符串
     */
    public static String toPrettyFormat(String json) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(jsonObject);
    }


    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30,\"car\":null}";
        System.out.println(toPrettyFormat(json));
    }
}
