package w7;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements h {
    protected h0() {
    }

    @Override // w7.h
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // w7.h
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // w7.h
    public long c() {
        return System.nanoTime();
    }

    @Override // w7.h
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // w7.h
    public p e(Looper looper, Handler.Callback callback) {
        return new i0(new Handler(looper, callback));
    }

    @Override // w7.h
    public void f() {
    }
}
