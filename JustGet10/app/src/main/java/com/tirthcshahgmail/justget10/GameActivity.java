package com.tirthcshahgmail.justget10;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GameActivity extends Activity {
    Button[][] bt = new Button[6][6];
    Matrix m6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setB6();
        setB6L();
        m6 = new Matrix(6, 6, 4);
        displayMatrix();
    }

    public void setB6() {
        bt[0][0] = (Button) findViewById(R.id.b600);
        bt[0][1] = (Button) findViewById(R.id.b601);
        bt[0][2] = (Button) findViewById(R.id.b602);
        bt[0][3] = (Button) findViewById(R.id.b603);
        bt[0][4] = (Button) findViewById(R.id.b604);
        bt[0][5] = (Button) findViewById(R.id.b605);
        bt[1][0] = (Button) findViewById(R.id.b610);
        bt[1][1] = (Button) findViewById(R.id.b611);
        bt[1][2] = (Button) findViewById(R.id.b612);
        bt[1][3] = (Button) findViewById(R.id.b613);
        bt[1][4] = (Button) findViewById(R.id.b614);
        bt[1][5] = (Button) findViewById(R.id.b615);
        bt[2][0] = (Button) findViewById(R.id.b620);
        bt[2][1] = (Button) findViewById(R.id.b621);
        bt[2][2] = (Button) findViewById(R.id.b622);
        bt[2][3] = (Button) findViewById(R.id.b623);
        bt[2][4] = (Button) findViewById(R.id.b624);
        bt[2][5] = (Button) findViewById(R.id.b625);
        bt[3][0] = (Button) findViewById(R.id.b630);
        bt[3][1] = (Button) findViewById(R.id.b631);
        bt[3][2] = (Button) findViewById(R.id.b632);
        bt[3][3] = (Button) findViewById(R.id.b633);
        bt[3][4] = (Button) findViewById(R.id.b634);
        bt[3][5] = (Button) findViewById(R.id.b635);
        bt[4][0] = (Button) findViewById(R.id.b640);
        bt[4][1] = (Button) findViewById(R.id.b641);
        bt[4][2] = (Button) findViewById(R.id.b642);
        bt[4][3] = (Button) findViewById(R.id.b643);
        bt[4][4] = (Button) findViewById(R.id.b644);
        bt[4][5] = (Button) findViewById(R.id.b645);
        bt[5][0] = (Button) findViewById(R.id.b650);
        bt[5][1] = (Button) findViewById(R.id.b651);
        bt[5][2] = (Button) findViewById(R.id.b652);
        bt[5][3] = (Button) findViewById(R.id.b653);
        bt[5][4] = (Button) findViewById(R.id.b654);
        bt[5][5] = (Button) findViewById(R.id.b655);

    }

    public void setB6L() {
        bt[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(0, 0);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(0, 1);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(0, 2);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(0, 3);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(0, 4);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[0][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(0, 5);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(1, 0);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(1, 1);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(1, 2);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(1, 3);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(1, 4);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[1][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(1, 5);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(2, 0);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(2, 1);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(2, 2);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(2, 3);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[2][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(2, 4);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[2][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(2, 5);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(3, 0);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(3, 1);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(3, 2);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(3, 3);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[3][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(3, 4);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[3][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(3, 5);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(4, 0);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(4, 1);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(4, 2);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[4][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(4, 3);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(4, 4);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[4][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(4, 5);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[5][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(5, 0);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(5, 1);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(5, 2);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(5, 3);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(5, 4);
                if (a) {
                    displayMatrix();
                }
            }
        });
        bt[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = m6.play(5, 5);
                if (a) {
                    displayMatrix();
                }
            }
        });


    }

    private void displayMatrix() {
        int[][] grid=m6.getGrid();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                displayButton(grid[i][j],bt[i][j]);
            }
        }
    }

    private void displayButton(int i, Button button) {
        switch (i){
            case 0:
                button.setText(m6.value+"");

                break;

            case 1:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ff89d33d"));
                button.setTextColor(Color.parseColor("#ff20b200"));
                break;
            case 2:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ff0a9fd3"));
                button.setTextColor(Color.parseColor("#ff0c6eb2"));
                break;
            case 3:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#fff4be41"));
                button.setTextColor(Color.parseColor("#ffed7409"));
                break;
            case 4:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffe43713"));
                button.setTextColor(Color.parseColor("#fff4ab94"));
                break;
            case 5:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ff009d0c"));
                button.setTextColor(Color.parseColor("#ff67c66c"));
                break;
            case 6:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ff680ec8"));
                button.setTextColor(Color.parseColor("#ffa288c6"));
                break;
            case 7:
                button.setText(i + "");
                button.setBackgroundColor(Color.parseColor("#ffdd3aa7"));
                button.setTextColor(Color.parseColor("#ffdd9bc5"));
                break;
            case 8:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffdd0944"));
                button.setTextColor(Color.parseColor("#ffdd7b99"));
                break;
            case 9:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffede02a"));
                button.setTextColor(Color.parseColor("#ffb55309"));
                break;
            case 10:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ff404040"));
                button.setTextColor(Color.parseColor("#ffbcba46"));
                break;
            case 11:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffffff"));
                button.setTextColor(Color.parseColor("#"));
                break;
            case 12:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffffff"));
                button.setTextColor(Color.parseColor("#"));
                break;
            case 13:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffffff"));
                button.setTextColor(Color.parseColor("#"));
                break;
            case 14:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffffff"));
                button.setTextColor(Color.parseColor("#"));
                break;
            case 15:
                button.setText(i+"");
                button.setBackgroundColor(Color.parseColor("#ffffff"));
                button.setTextColor(Color.parseColor("#"));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
