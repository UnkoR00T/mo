package be;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f18838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f18839b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).c();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v<?> vVar, boolean z15) {
        try {
            if (this.f18838a || z15) {
                this.f18839b.obtainMessage(1, vVar).sendToTarget();
            } else {
                this.f18838a = true;
                vVar.c();
                this.f18838a = false;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
