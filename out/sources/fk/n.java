package fk;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sk.c0;
import sk.d0;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f64372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f64373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qk.a f64374c = qk.a.f167012b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64375a;

        static {
            int[] iArr = new int[sk.z.values().length];
            f64375a = iArr;
            try {
                iArr[sk.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64375a[sk.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64375a[sk.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f64376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k f64377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f64378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f64379d;

        /* synthetic */ b(g gVar, k kVar, int i15, boolean z15, a aVar) {
            this(gVar, kVar, i15, z15);
        }

        public g a() {
            return this.f64376a;
        }

        private b(g gVar, k kVar, int i15, boolean z15) {
            this.f64376a = gVar;
            this.f64377b = kVar;
            this.f64378c = i15;
            this.f64379d = z15;
        }
    }

    private n(c0 c0Var, List<b> list) {
        this.f64372a = c0Var;
        this.f64373b = list;
    }

    private static void a(sk.t tVar) throws GeneralSecurityException {
        if (tVar == null || tVar.Y().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void b(c0 c0Var) throws GeneralSecurityException {
        if (c0Var == null || c0Var.b0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(sk.t tVar, fk.a aVar, byte[] bArr) throws GeneralSecurityException {
        try {
            c0 c0VarG0 = c0.g0(aVar.decrypt(tVar.Y().C(), bArr), com.google.crypto.tink.shaded.protobuf.p.b());
            b(c0VarG0);
            return c0VarG0;
        } catch (b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static sk.t d(c0 c0Var, fk.a aVar, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrA = aVar.a(c0Var.toByteArray(), bArr);
        try {
            if (c0.g0(aVar.decrypt(bArrA, bArr), com.google.crypto.tink.shaded.protobuf.p.b()).equals(c0Var)) {
                return sk.t.Z().G(com.google.crypto.tink.shaded.protobuf.h.i(bArrA)).H(z.b(c0Var)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (b0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final n e(c0 c0Var) throws GeneralSecurityException {
        b(c0Var);
        return new n(c0Var, f(c0Var));
    }

    private static List<b> f(c0 c0Var) {
        ArrayList arrayList = new ArrayList(c0Var.b0());
        for (c0.c cVar : c0Var.c0()) {
            int iB0 = cVar.b0();
            try {
                arrayList.add(new b(nk.i.a().d(q(cVar), f.a()), m(cVar.d0()), iB0, iB0 == c0Var.d0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private <B> B g(g gVar, Class<B> cls) {
        try {
            return (B) x.c(gVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B j(c0.c cVar, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) x.g(cVar.a0(), cls);
        } catch (GeneralSecurityException e15) {
            if (e15.getMessage().contains("No key manager found for key type ") || e15.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <B, P> P l(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        z.d(this.f64372a);
        v.b bVarJ = v.j(cls2);
        bVarJ.e(this.f64374c);
        for (int i15 = 0; i15 < p(); i15++) {
            c0.c cVarA0 = this.f64372a.a0(i15);
            if (cVarA0.d0().equals(sk.z.ENABLED)) {
                Object objJ = j(cVarA0, cls2);
                Object objG = this.f64373b.get(i15) != null ? g(this.f64373b.get(i15).a(), cls2) : null;
                if (cVarA0.b0() == this.f64372a.d0()) {
                    bVarJ.b(objG, objJ, cVarA0);
                } else {
                    bVarJ.a(objG, objJ, cVarA0);
                }
            }
        }
        return (P) x.o(bVarJ.d(), cls);
    }

    private static k m(sk.z zVar) throws GeneralSecurityException {
        int i15 = a.f64375a[zVar.ordinal()];
        if (i15 == 1) {
            return k.f64360b;
        }
        if (i15 == 2) {
            return k.f64361c;
        }
        if (i15 == 3) {
            return k.f64362d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final n n(p pVar, fk.a aVar) {
        return o(pVar, aVar, new byte[0]);
    }

    public static final n o(p pVar, fk.a aVar, byte[] bArr) throws GeneralSecurityException {
        sk.t tVarA = pVar.a();
        a(tVarA);
        return e(c(tVarA, aVar, bArr));
    }

    private static nk.o q(c0.c cVar) {
        try {
            return nk.o.b(cVar.a0().b0(), cVar.a0().c0(), cVar.a0().a0(), cVar.c0(), cVar.c0() == i0.RAW ? null : Integer.valueOf(cVar.b0()));
        } catch (GeneralSecurityException e15) {
            throw new nk.s("Creating a protokey serialization failed", e15);
        }
    }

    c0 h() {
        return this.f64372a;
    }

    public d0 i() {
        return z.b(this.f64372a);
    }

    public <P> P k(Class<P> cls) throws GeneralSecurityException {
        Class<?> clsD = x.d(cls);
        if (clsD != null) {
            return (P) l(cls, clsD);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public int p() {
        return this.f64372a.b0();
    }

    public void r(q qVar, fk.a aVar) {
        s(qVar, aVar, new byte[0]);
    }

    public void s(q qVar, fk.a aVar, byte[] bArr) {
        qVar.a(d(this.f64372a, aVar, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
