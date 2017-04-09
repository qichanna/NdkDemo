package home.liqi.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEditText = (EditText) findViewById(R.id.str_count);
    }

    public void onTestLocalRefOverflow(View view) {
//        String[] strings = NativeMethods.getStrings(Integer.parseInt(mEditText.getText().toString()),"I Love You %d Year！！！");
//        for (String string : strings) {
//            System.out.println(string);
//        }
    }
}
