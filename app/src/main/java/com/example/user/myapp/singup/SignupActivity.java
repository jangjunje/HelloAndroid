package com.example.user.myapp.singup;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.myapp.R;
import com.example.user.myapp.member.MeberServiceImpl;
import com.example.user.myapp.member.MemberService;
import com.example.user.myapp.member.MembereBean;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class SignupActivity extends Activity implements View.OnClickListener {

    EditText meditID;
    EditText meditPW;
    EditText meditName;
    EditText meditEmail;
    Button mbtnSingup;
    TextView mtextResult;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        meditID = (EditText) findViewById(R.id.editID);
        meditPW = (EditText) findViewById(R.id.editPW);
        meditName = (EditText) findViewById(R.id.editName);
        meditEmail = (EditText) findViewById(R.id.editEmail);
        mbtnSingup = (Button) findViewById(R.id.btnSingup);
        mtextResult= (TextView)findViewById(R.id.textResult);

        ((Button) findViewById(R.id.btnSingup)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String id = meditID.getText().toString();
        String pw = meditPW.getText().toString();
        String name = meditName.getText().toString();
        String email = meditEmail.getText().toString();

        MembereBean member = new MembereBean();
        MemberService service = new MeberServiceImpl();

        member.setId(id);
        member.setName(name);
        member.setPw(pw);
        member.setEmail(pw);

        String msg = service.signup(member);

        mtextResult.setText("회원가입결과 : " + msg);
        }
    }
}
