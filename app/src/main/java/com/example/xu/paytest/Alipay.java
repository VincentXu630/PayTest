package com.example.xu.paytest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;


/**
 * Created by xu on 2016/10/11.
 */

public class Alipay {
    public static final String PARTNER = "";

    // 商户收款账号
    public static final String SELLER = "";

    // 商户私钥，pkcs8格式
    public static final String RSA_PRIVATE = "";

    AlertDialog.Builder alert = new AlertDialog.Builder(this);

    protected void payStart(){
/*        if (TextUtils.isEmpty(PARTNER) || TextUtils.isEmpty(RSA_PRIVATE) || TextUtils.isEmpty(SELLER)) {
            new AlertDialog.Builder(this).setTitle("警告").setMessage("需要配置PARTNER | RSA_PRIVATE | SELLER")
                    .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialoginterface, int i) {
                            //
                            finish();
                        }
                    }).show();*/
            return;
        }
    }


}
