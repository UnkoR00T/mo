package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uk.a f73306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final nk.k<a0, nk.p> f73307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nk.j<nk.p> f73308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.c<y, nk.o> f73309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nk.b<nk.o> f73310e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f73311a;

        static {
            int[] iArr = new int[sk.i0.values().length];
            f73311a = iArr;
            try {
                iArr[sk.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73311a[sk.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73311a[sk.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73311a[sk.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        uk.a aVarE = nk.t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f73306a = aVarE;
        f73307b = nk.k.a(new j(), a0.class, nk.p.class);
        f73308c = nk.j.a(new k(), aVarE, nk.p.class);
        f73309d = nk.c.a(new l(), y.class, nk.o.class);
        f73310e = nk.b.a(new nk.b.InterfaceC3378b() { // from class: gk.b0
            @Override // nk.b.InterfaceC3378b
            public final fk.g a(nk.q qVar, fk.y yVar) {
                return c0.b((nk.o) qVar, yVar);
            }
        }, aVarE, nk.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y b(nk.o oVar, fk.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            sk.r rVarB0 = sk.r.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (rVarB0.Z() == 0) {
                return y.a(e(oVar.e()), uk.b.a(rVarB0.Y().C(), fk.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(nk.i.a());
    }

    public static void d(nk.i iVar) {
        iVar.h(f73307b);
        iVar.g(f73308c);
        iVar.f(f73309d);
        iVar.e(f73310e);
    }

    private static a0.a e(sk.i0 i0Var) throws GeneralSecurityException {
        int i15 = a.f73311a[i0Var.ordinal()];
        if (i15 == 1) {
            return a0.a.f73302b;
        }
        if (i15 == 2 || i15 == 3) {
            return a0.a.f73303c;
        }
        if (i15 == 4) {
            return a0.a.f73304d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.h());
    }
}
