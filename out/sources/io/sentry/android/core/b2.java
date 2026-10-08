package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f93763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f93764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f93765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f93766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f93767e;

    public void a(long j15, long j16, boolean z15, boolean z16) {
        this.f93767e += j15;
        if (z16) {
            this.f93766d += j16;
            this.f93764b++;
        } else if (z15) {
            this.f93765c += j16;
            this.f93763a++;
        }
    }

    public int b() {
        return this.f93764b;
    }

    public long c() {
        return this.f93766d;
    }

    public int d() {
        return this.f93763a;
    }

    public long e() {
        return this.f93765c;
    }

    public int f() {
        return this.f93763a + this.f93764b;
    }

    public long g() {
        return this.f93767e;
    }
}
