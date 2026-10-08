package v;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements o.o1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f202532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f202533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f202534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f202535d;

    public d1(long j15, int i15, Throwable th4) {
        this.f202534c = SystemClock.elapsedRealtime() - j15;
        this.f202533b = i15;
        if (th4 instanceof k1.a) {
            this.f202532a = 2;
            this.f202535d = th4;
            return;
        }
        if (!(th4 instanceof o.c1)) {
            this.f202532a = 0;
            this.f202535d = th4;
            return;
        }
        Throwable cause = th4.getCause();
        th4 = cause != null ? cause : th4;
        this.f202535d = th4;
        if (th4 instanceof o.u) {
            this.f202532a = 2;
        } else if (th4 instanceof IllegalArgumentException) {
            this.f202532a = 1;
        } else {
            this.f202532a = 0;
        }
    }

    @Override // o.o1.b
    public long a() {
        return this.f202534c;
    }

    @Override // o.o1.b
    public int b() {
        return this.f202532a;
    }

    @Override // o.o1.b
    public Throwable getCause() {
        return this.f202535d;
    }
}
