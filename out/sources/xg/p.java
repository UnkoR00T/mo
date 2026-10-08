package xg;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class p extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f218461a;

    public p(Looper looper) {
        super(looper);
        this.f218461a = Looper.getMainLooper();
    }

    public p(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f218461a = Looper.getMainLooper();
    }
}
