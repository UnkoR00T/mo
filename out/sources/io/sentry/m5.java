package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class m5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m5 f95189d = new m5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f95190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f95191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f95192c = new io.sentry.util.a();

    private m5() {
    }

    public static m5 a() {
        return f95189d;
    }

    public void b(boolean z15) {
        g1 g1VarA = this.f95192c.a();
        try {
            if (!this.f95190a) {
                this.f95191b = Boolean.valueOf(z15);
                this.f95190a = true;
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }
}
