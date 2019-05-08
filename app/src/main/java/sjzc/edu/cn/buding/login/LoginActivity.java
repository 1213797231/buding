package sjzc.edu.cn.buding.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import sjzc.edu.cn.buding.R;
import sjzc.edu.cn.buding.modle.MainActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btLogin;
    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //界面控件初始化
        initView();
        //控件点击事件初始化
        initListener();
    }

    /**
     * 控件点击事件初始化
     */
    private void initListener() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

    }

    /**
     * 点击注册页面的逻辑处理
     */
    private void register() {
        //跳转到注册页面
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    /**
     * 处理登录界面的逻辑
     */
    private void login() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        if (TextUtils.isEmpty(username) && TextUtils.isEmpty(password)){
            //进行帐户密码的判定
            if (TextUtils.equals("123",username) && TextUtils.equals("123",password)){
                //跳转到登录页面
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }else{
            Toast.makeText(this,"用户名密码不能为空",Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 界面控件初始化
     */
    private void initView() {
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btLogin = findViewById(R.id.bt_login);
        btRegister = findViewById(R.id.bt_register);
    }
}
