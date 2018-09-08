package com.example.dlarb.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(this, "메뉴1번 클릭", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu2:
                Toast.makeText(this, "메뉴2번 클릭", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu3:
                Toast.makeText(this, "메뉴3번 클릭", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    TextView btn_0;
    TextView btn_1;
    TextView btn_2;
    TextView btn_3;
    TextView btn_4;
    TextView btn_5;
    TextView btn_6;
    TextView btn_7;
    TextView btn_8;
    TextView btn_9;
    TextView c;
    TextView dev;
    TextView mul;
    TextView adding;
    TextView sub;
    TextView outcome;
    TextView dot;
    TextView del;
    TextView outcome1;
    TextView outcome2;
    int a;
    TextView res;
    String str3;
    int b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sub = (TextView) findViewById(R.id.sub);
        dev = (TextView) findViewById(R.id.devide);
        mul = (TextView) findViewById(R.id.multiply);
        c = (TextView) findViewById(R.id.c);
        outcome1 = (TextView) findViewById(R.id.outcome2);
        outcome = (TextView) findViewById(R.id.outcome);
        adding = (TextView) findViewById(R.id.add);
        btn_0 = (TextView) findViewById(R.id.btn_0);
        btn_1 = (TextView) findViewById(R.id.btn_1);
        btn_2 = (TextView) findViewById(R.id.btn_2);
        btn_3 = (TextView) findViewById(R.id.btn_3);
        btn_4 = (TextView) findViewById(R.id.btn_4);
        btn_5 = (TextView) findViewById(R.id.btn_5);
        btn_6 = (TextView) findViewById(R.id.btn_6);
        btn_7 = (TextView) findViewById(R.id.btn_7);
        btn_8 = (TextView) findViewById(R.id.btn_8);
        btn_9 = (TextView) findViewById(R.id.btn_9);
        dot = (TextView) findViewById(R.id.dot);
        del = (TextView) findViewById(R.id.delete);
        outcome2 = (TextView) findViewById(R.id.outcome3);
        a = 0;
        res = (TextView) findViewById(R.id.result);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "0");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "0");
                }
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "1");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "1");
                }
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "2");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "2");
                }
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "3");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "3");
                }
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "4");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "4");
                }
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "5");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "5");
                }
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "6");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "6");
                }
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "7");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "7");
                }
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "8");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "8");
                }
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + "9");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + "9");
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    outcome.setText(str1 + ".");
                } else {
                    String str2 = outcome.getText().toString();
                    outcome.setText(str2 + ".");
                }
            }
        });


        adding.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                String str1 = outcome.getText().toString();
                outcome2.setText(str1);
                outcome1.setText("＋");
                outcome.setText("");
                a = 1;
                b = 0;
            }
        });

        sub.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                String str1 = outcome.getText().toString();
                outcome2.setText(str1);
                outcome1.setText("－");
                outcome.setText("");
                b = 0;
                a = 2;
            }
        });

        mul.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                String str1 = outcome.getText().toString();
                outcome2.setText(str1);
                outcome1.setText("×");
                outcome.setText("");
                b = 0;
                a = 3;
            }
        });

        dev.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                String str1 = outcome.getText().toString();
                outcome2.setText(str1);
                outcome1.setText("÷");
                outcome.setText("");
                b = 0;
                a = 4;
            }
        });

        c.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                String str1 = null;
                String str2 = null;
                a = 0;
                b = 0;
                outcome.setText("");
                outcome1.setText("");
                outcome2.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                if (a == 0) {
                    String str1 = outcome.getText().toString();
                    if (str1.length() > 0) {
                        str1 = str1.substring(0, str1.length() - 1);
                        outcome.setText(str1);
                    }
                } else {
                    String str2 = outcome.getText().toString();
                    if (str2.length() > 0) {
                        str2 = str2.substring(0, str2.length() - 1);
                        outcome.setText(str2);
                    }
                }
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = outcome2.getText().toString();
                String str2 = outcome.getText().toString();
                b++;
                if (a == 0) {
                } else if (b > 1) {
                    Double int1 = Double.valueOf(str3);
                    Double int2 = Double.valueOf(str2);
                    Double int3;
                    outcome1.setText("");
                    outcome2.setText("");
                    switch (a) {
                        case 1:
                            int3 = int1 + int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                        case 2:
                            int3 = int1 - int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                        case 3:
                            int3 = int1 * int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                        case 4:
                            int3 = int1 / int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                    }
                } else if (b == 1) {
                    Double int1 = Double.valueOf(str1);
                    Double int2 = Double.valueOf(str2);
                    Double int3;
                    str3 = str2;
                    outcome1.setText("");
                    outcome2.setText("");
                    switch (a) {
                        case 1:
                            int3 = int1 + int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                        case 2:
                            int3 = int1 - int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                        case 3:
                            int3 = int1 * int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                        case 4:
                            int3 = int1 / int2;
                            str1 = Double.toString(Math.round(int3 * 100d) / 100d);
                            outcome.setText(str1);
                            break;
                    }
                }
            }
        });
    }
}
