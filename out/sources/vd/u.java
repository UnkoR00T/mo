package vd;

/* JADX INFO: loaded from: classes3.dex */
public class u extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f206221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f206222b;

    public u() {
        this.f206221a = null;
    }

    void a(long j15) {
        this.f206222b = j15;
    }

    public u(k kVar) {
        this.f206221a = kVar;
    }

    public u(Throwable th4) {
        super(th4);
        this.f206221a = null;
    }
}
