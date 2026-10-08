package jg;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static t f102553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f102554c = new u(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f102555a;

    private t() {
    }

    public static synchronized t b() {
        try {
            if (f102553b == null) {
                f102553b = new t();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f102553b;
    }

    public u a() {
        return this.f102555a;
    }

    public final synchronized void c(u uVar) {
        try {
            if (uVar == null) {
                this.f102555a = f102554c;
                return;
            }
            u uVar2 = this.f102555a;
            if (uVar2 == null || uVar2.u() < uVar.u()) {
                this.f102555a = uVar;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
