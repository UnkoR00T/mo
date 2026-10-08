package b8;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e2 f17361c = new e2("");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e2 f17362d = new e2("preload");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f17364b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f17365a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            zj.p.w(this.f17365a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f17365a = logSessionId;
        }
    }

    public e2(String str) {
        this.f17363a = str;
        this.f17364b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
    }

    public synchronized LogSessionId a() {
        return ((a) zj.p.q(this.f17364b)).f17365a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) zj.p.q(this.f17364b)).a(logSessionId);
    }
}
