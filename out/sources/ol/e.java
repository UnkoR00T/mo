package ol;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f146565d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f146566e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f146567a = i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f146568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f146569c;

    e() {
    }

    private synchronized long a(int i15) {
        if (c(i15)) {
            return (long) Math.min(Math.pow(2.0d, this.f146569c) + this.f146567a.e(), f146566e);
        }
        return f146565d;
    }

    private static boolean c(int i15) {
        if (i15 != 429) {
            return i15 >= 500 && i15 < 600;
        }
        return true;
    }

    private static boolean d(int i15) {
        return (i15 >= 200 && i15 < 300) || i15 == 401 || i15 == 404;
    }

    private synchronized void e() {
        this.f146569c = 0;
    }

    public synchronized boolean b() {
        return this.f146569c == 0 || this.f146567a.a() > this.f146568b;
    }

    public synchronized void f(int i15) {
        if (d(i15)) {
            e();
            return;
        }
        this.f146569c++;
        this.f146568b = this.f146567a.a() + a(i15);
    }
}
