package p101pRn;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l2 extends n2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile l2 f153772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f153773d = new Executor() { // from class: pRn.j2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            l2.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f153774e = new Executor() { // from class: pRn.k2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            l2.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n2 f153775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2 f153776b;

    private l2() {
        m2 m2Var = new m2();
        this.f153776b = m2Var;
        this.f153775a = m2Var;
    }

    public static Executor f() {
        return f153774e;
    }

    public static l2 g() {
        if (f153772c != null) {
            return f153772c;
        }
        synchronized (l2.class) {
            try {
                if (f153772c == null) {
                    f153772c = new l2();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f153772c;
    }

    @Override // p101pRn.n2
    public void a(Runnable runnable) {
        this.f153775a.a(runnable);
    }

    @Override // p101pRn.n2
    public boolean b() {
        return this.f153775a.b();
    }

    @Override // p101pRn.n2
    public void c(Runnable runnable) {
        this.f153775a.c(runnable);
    }
}
