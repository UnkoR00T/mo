package a8;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f4742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f4743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4744d;

    public w2() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f4741a) {
            try {
                if (this.f4742b == null) {
                    zj.p.w(this.f4744d == 0 && this.f4743c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f4743c = handlerThread;
                    handlerThread.start();
                    this.f4742b = this.f4743c.getLooper();
                }
                this.f4744d++;
                looper = this.f4742b;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f4741a) {
            try {
                zj.p.w(this.f4744d > 0);
                int i15 = this.f4744d - 1;
                this.f4744d = i15;
                if (i15 == 0 && (handlerThread = this.f4743c) != null) {
                    handlerThread.quit();
                    this.f4743c = null;
                    this.f4742b = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public w2(Looper looper) {
        this.f4741a = new Object();
        this.f4742b = looper;
        this.f4743c = null;
        this.f4744d = 0;
    }
}
