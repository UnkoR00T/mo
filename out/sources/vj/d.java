package vj;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static c a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new h(new m(context));
    }
}
