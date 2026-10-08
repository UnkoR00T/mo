package rj;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends sj.o {
    public h(Context context) {
        super(new sj.p("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
}
