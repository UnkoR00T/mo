package af;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cf.b<Executor> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final k f6139a = new k();
    }

    public static k a() {
        return a.f6139a;
    }

    public static Executor b() {
        return (Executor) cf.d.d(j.a());
    }

    @Override // nq.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
