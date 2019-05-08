package sjzc.edu.cn.buding.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import sjzc.edu.cn.buding.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //界面控件初始化
        initView();
        //控件点击事件初始化
        initListener();

    }

    /**
     * 控件点击事件初始化
     */
    private void initListener() {
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
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        if (TextUtils.isEmpty(username) && TextUtils.isEmpty(password)){
            //跳转到登录
            Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();
            finish();
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
        btRegister = findViewById(R.id.bt_register);
    }
}
