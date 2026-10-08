package ij;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i15;
        if (Build.VERSION.SDK_INT < 31 || (i15 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i15 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, c6.a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
