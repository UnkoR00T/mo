package nk;

import fk.v;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import sk.z;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qk.b.a f137050a = new b(null);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137051a;

        static {
            int[] iArr = new int[z.values().length];
            f137051a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137051a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137051a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class b implements qk.b.a {
        private b() {
        }

        @Override // qk.b.a
        public void a(int i15, long j15) {
        }

        @Override // qk.b.a
        public void b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static <P> qk.c a(v<P> vVar) {
        qk.c.b bVarA = qk.c.a();
        bVarA.d(vVar.d());
        Iterator<List<v.c<P>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c<P> cVar : it.next()) {
                bVarA.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            bVarA.e(vVar.e().d());
        }
        try {
            return bVarA.b();
        } catch (GeneralSecurityException e15) {
            throw new IllegalStateException(e15);
        }
    }

    private static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    private static fk.k c(z zVar) {
        int i15 = a.f137051a[zVar.ordinal()];
        if (i15 == 1) {
            return fk.k.f64360b;
        }
        if (i15 == 2) {
            return fk.k.f64361c;
        }
        if (i15 == 3) {
            return fk.k.f64362d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
