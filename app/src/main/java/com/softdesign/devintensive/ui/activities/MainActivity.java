package com.softdesign.devintensive.ui.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";

    protected EditText mEditText;
    protected Button mRedButton, mGreenButton;
    protected String mColorMode;



    /*
    метод вызывается при создании Activity (после изменения конфигурации или возврата к текущей активности после её уничтожения
    в данном методе инициируется / производится
    - UI пользовательский интерфейс (статика)
    - инициализация статических данных активности
    - связь данных со списками (инициализация адаптеров)
    !!! Не запускать длдительные операции по работе с данными в onCreate()
    @param savedInstanceState - объект со значениями сохраненными в Bundle - состоянии UI
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        mRedButton = (Button) findViewById(R.id.red_btn);
        mGreenButton = (Button) findViewById(R.id.green_btn);
        mEditText = (EditText) findViewById(R.id.textView);

        mRedButton.setOnClickListener(this);
        mGreenButton.setOnClickListener(this);


        if (savedInstanceState == null){
            // активити запускается первый раз
        }else{
            // активити запускается повторно
        }
    }


    /*
    метод вызывается при старте активности перед тем как UI станет доступен пользователю
    как правило в данном методе происходит регистрация подписи на события, остановка которых
    была произведена по onStop()
    */
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /*
    метод запускается когда активити становится доступна пользователю для взаимодействи
    в данном методе как правило происходит запуск анимаций, аудио, видео, запуск BroadcastReciver,
    необходимых для реализации UI логики/запуск выполнения потоков и т.п.
    метод должен быть максимально легковесным для максимальной отзывчивости UI
    */
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /*
    метод вызывается когда текущая активити теряет фокус но остается видимой
    (всплытие диалогового окна / частичное перекрытие другой активитисностью :)  )
    */
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /*
    метод вызывается когда активити становится невидимым для пользователя.
    в данном методе происходит отписка от событий, остановка сложных анимаций,
    сложные процессы по сохранению данных / прерывание запущенных потоков и т.д.
    */
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /*
    метод вызывается при окончании активити - когда это происходит из системы
    или после вызова метода finish()
     */
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /*
    метод вызывается при рестарте активити / возобновлении работы после вызова метода onStart()
    в даном методе реализуется специфическая бизнес-логика, которая должна быть реализована
    имеено при старте активити - например запросы к серверу которые необходимо вызвать при возвращении
    из другой активити ( обновление данных, подписка на определенные события инициализированные на
    другом зкране / специфическая бизнес-логика завязанная именно на перезапуске активити)
     */
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()){
            case R.id.green_btn:
                mEditText.setBackgroundColor(Color.GREEN);
                break;
            case R.id.red_btn:
                mEditText.setBackgroundColor(Color.RED);
                break;

        }

    }

}
