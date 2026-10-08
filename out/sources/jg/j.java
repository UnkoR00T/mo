package jg;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.UserHandle;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f102508a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f102509b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static i1 f102510c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static HandlerThread f102511d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Executor f102512e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f102513f = false;

    public static j a(Context context) {
        synchronized (f102508a) {
            try {
                if (f102510c == null) {
                    if (!f102513f) {
                        f102513f = i.a(context.getPackageName());
                    }
                    f102510c = new i1(context.getApplicationContext(), f102513f ? b().getLooper() : context.getMainLooper(), f102512e);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f102510c;
    }

    public static HandlerThread b() {
        synchronized (f102508a) {
            try {
                HandlerThread handlerThread = f102511d;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return f102511d;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f102509b);
                f102511d = handlerThread2;
                handlerThread2.start();
                return f102511d;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected abstract gg.a c(f1 f1Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(String str, String str2, int i15, ServiceConnection serviceConnection, String str3, boolean z15, UserHandle userHandle) {
        e(new f1(str, str2, 4225, z15, userHandle), serviceConnection, str3);
    }

    protected abstract void e(f1 f1Var, ServiceConnection serviceConnection, String str);
}
