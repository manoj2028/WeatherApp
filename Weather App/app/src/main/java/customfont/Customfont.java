package customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ManojG on 5/30/2018.
 */


public class Customfont extends TextView {

    public Customfont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Customfont(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Customfont(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/Lato-Bold.ttf");
        setTypeface(tf ,1);

    }

}
