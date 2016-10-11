package com.example.xu.paytest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button alipayButton;
    private Button wechatpayButton;

    private static final int ALIPAY_FLAG = 1;
    private static final int WECHATPAY_FLAG = 2;
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler(){
        public void handlerMessage(Message msg){
            switch (msg.what){
                case ALIPAY_FLAG:
                    //call the alipay function

                    break;
                case WECHATPAY_FLAG:
                    //call the wechatpay function

                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alipayButton = (Button)findViewById(R.id.alipayButton);
        wechatpayButton = (Button)findViewById(R.id.wechatpayButton);

        alipayButton.setOnClickListener(this);
        wechatpayButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.alipayButton:
                alipayThread();
                break;
            case R.id.wechatpayButton:
                wechatpayThread();
                break;
            default:
                break;
        }
    }

    protected void alipayThread(){
        new Thread(){
            @Override
            public void run(){
                Message message = new Message();
                message.what = ALIPAY_FLAG;
                handler.sendMessage(message);
            }
        }.start();
    }

    protected void wechatpayThread(){
        new Thread(){
            @Override
            public void run(){
                Message message = new Message();
                message.what = WECHATPAY_FLAG;
                handler.sendMessage(message);
            }
        }.start();
    }

}
