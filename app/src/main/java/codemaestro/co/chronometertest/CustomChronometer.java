package codemaestro.co.chronometertest;

import android.content.Context;
import android.os.SystemClock;
import android.widget.Chronometer;

public class CustomChronometer extends Chronometer implements Chronometer.OnChronometerTickListener {
    public CustomChronometer(Context context) {
        super(context);
    }

    @Override
    public void setBase(long base) {
        super.setBase(base);
    }

    @Override
    public void onChronometerTick(Chronometer chronometer) {

    }
}
