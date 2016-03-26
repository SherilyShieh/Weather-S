package com.shieh.sherily.weather_s.util;

/**
 * Created by sherily on 16/3/26.
 */
public interface HttpCallbackListener {

    public abstract void onFinish(String response);

    public abstract void onError(Exception e);

}
