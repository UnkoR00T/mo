package bg;

import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19278b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f19277a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f19279c = a.f19280a;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19280a = new C0491a();

        /* JADX INFO: renamed from: bg.b$a$a, reason: collision with other inner class name */
        class C0491a implements a {
            C0491a() {
            }

            @Override // bg.b.a
            public void a(String str, String str2) {
                c2.g(str, str2);
            }
        }

        void a(String str, String str2);
    }

    public static void a(String str, String str2) {
        synchronized (f19277a) {
            try {
                if (f19278b <= 2) {
                    f19279c.a(str, str2);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
