package dh;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class jb implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f41953h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f41956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f41957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f41958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f41959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f41960g;

    private jb(String str) {
        this.f41959f = 2147483647L;
        this.f41960g = -2147483648L;
        this.f41954a = str;
    }

    private final void b() {
        this.f41955b = 0;
        this.f41956c = 0.0d;
        this.f41957d = 0L;
        this.f41959f = 2147483647L;
        this.f41960g = -2147483648L;
    }

    public static jb r(String str) {
        jc.a();
        if (!jc.b()) {
            return hb.f41880j;
        }
        Map map = f41953h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new jb("detectorTaskWithResource#run"));
        }
        return (jb) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j15 = this.f41957d;
        if (j15 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        p(j15);
    }

    public jb h() {
        this.f41957d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void m(long j15) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j16 = this.f41958e;
        if (j16 != 0 && jElapsedRealtimeNanos - j16 >= 1000000) {
            b();
        }
        this.f41958e = jElapsedRealtimeNanos;
        this.f41955b++;
        this.f41956c += j15;
        this.f41959f = Math.min(this.f41959f, j15);
        this.f41960g = Math.max(this.f41960g, j15);
        if (this.f41955b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f41954a, Long.valueOf(j15), Integer.valueOf(this.f41955b), Long.valueOf(this.f41959f), Long.valueOf(this.f41960g), Integer.valueOf((int) (this.f41956c / ((double) this.f41955b))));
            jc.a();
        }
        if (this.f41955b % 500 == 0) {
            b();
        }
    }

    public void p(long j15) {
        m((SystemClock.elapsedRealtimeNanos() / 1000) - j15);
    }
}
