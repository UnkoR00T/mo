package lk;

import java.security.GeneralSecurityException;
import sk.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f118645a = new a().d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final j0 f118646b = j0.W();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final j0 f118647c = j0.W();

    static {
        try {
            a();
        } catch (GeneralSecurityException e15) {
            throw new ExceptionInInitializerError(e15);
        }
    }

    public static void a() {
        c.e();
        if (jk.a.a()) {
            return;
        }
        a.m(true);
    }
}
