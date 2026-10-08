package ok;

import java.security.GeneralSecurityException;
import sk.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f146452a = new k().d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final j0 f146453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final j0 f146454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final j0 f146455d;

    static {
        j0 j0VarW = j0.W();
        f146453b = j0VarW;
        f146454c = j0VarW;
        f146455d = j0VarW;
        try {
            a();
        } catch (GeneralSecurityException e15) {
            throw new ExceptionInInitializerError(e15);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (jk.a.a()) {
            return;
        }
        c.o(true);
    }
}
