package com.example.user.myapp.login;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.myapp.R;
import com.example.user.myapp.member.MemberDAO;
import com.example.user.myapp.member.MemberService;
import com.example.user.myapp.member.MemberServiceImpl;
import com.example.user.myapp.member.MembereBean;

import org.w3c.dom.Text;

public class LoginActivity extends Activity implements View.OnClickListener{
    EditText meditID;
    EditText meditPW;
    Button   mbtnLogin;
    TextView mtextResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        meditID   = (EditText) findViewById(R.id.editID);
        meditPW   = (EditText) findViewById(R.id.editPW);
        mbtnLogin = (Button) findViewById(R.id.btnLogin);
        mtextResult = (TextView) findViewById(R.id.textResult);
    }

    @Override
    public void onClick(View v) {
        MembereBean member = new MembereBean();
        MemberDAO dao = new MemberDAO(this.getApplicationContext());

        member.setId(meditID.getText().toString());
        member.setPw(meditPW.getText().toString());

        MemberService service = (MemberService) new MemberServiceImpl();
        MembereBean msg = service.login(member);

        mtextResult.setText("환영합니다. : " + msg + "님");
    }
}
