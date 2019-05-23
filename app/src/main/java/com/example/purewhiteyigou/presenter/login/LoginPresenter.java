package com.example.purewhiteyigou.presenter.login;

import android.util.Log;

import com.example.purewhiteyigou.base.BasePresenter;
import com.example.purewhiteyigou.model.MyModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/23 0023
 * Time: 9:03
 * Describe: ${as}
 */
public class LoginPresenter extends BasePresenter<LoginView> {
    private MyModel myModel;
    public LoginPresenter(){
        myModel = new MyModel();
    }
    public void postUserKey(String appid,String pwd){
        Observable<ResponseBody> responseBodyObservable = myModel.postUserKey(appid, pwd);
        responseBodyObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                        Log.i("guochao","LoginPresenter:postAppKeyError"+e.getMessage());
                        if(isAttach()){
                            getView().failess("获取AppKey失败");
                        }
                    }

                    @Override
                    public void onNext(ResponseBody body) {

                        try {
                            String json = body.string();
                            JSONObject jsonObject = new JSONObject(json);
                            int code = jsonObject.getInt("code");
                            if(code==200){
                                JSONObject data = jsonObject.getJSONObject("data");
                                String appkey = data.getString("appkey");
                                if(isAttach()){
                                    getView().successAppKey(appkey);
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
    public void postLogin(String appkey,String phone,String pwd){
        Observable<ResponseBody> responseBodyObservable = myModel.postLogin(phone, pwd, appkey);
        responseBodyObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("guochao","LoginPresenter:postLoginError"+e.getMessage());


                    }

                    @Override
                    public void onNext(ResponseBody body) {

                        try {
                            String json = body.string();
                            JSONObject jsonObject = new JSONObject(json);
                            int code = jsonObject.getInt("code");
                            if(code==200){
                                String msg = jsonObject.getString("msg");
                                if(isAttach()){
                                    getView().success(msg);
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
    public void postRegister(String appkey,String phone,String pwd,String name){
        Observable<ResponseBody> responseBodyObservable = myModel.postRegisget(appkey,phone,pwd,name);
        responseBodyObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("guochao","LoginPresenter:postRegisterError"+e.getMessage());


                    }

                    @Override
                    public void onNext(ResponseBody body) {

                        try {
                            String json = body.string();
                            JSONObject jsonObject = new JSONObject(json);
                            int code = jsonObject.getInt("code");
                            if(code==200){
                                String msg = jsonObject.getString("msg");
                                if(isAttach()){
                                    getView().success(msg);
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}
