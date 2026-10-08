package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uk.a f73354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final nk.k<i0, nk.p> f73355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nk.j<nk.p> f73356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.c<g0, nk.o> f73357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nk.b<nk.o> f73358e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f73359a;

        static {
            int[] iArr = new int[sk.i0.values().length];
            f73359a = iArr;
            try {
                iArr[sk.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73359a[sk.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73359a[sk.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73359a[sk.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        uk.a aVarE = nk.t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f73354a = aVarE;
        f73355b = nk.k.a(new j(), i0.class, nk.p.class);
        f73356c = nk.j.a(new k(), aVarE, nk.p.class);
        f73357d = nk.c.a(new l(), g0.class, nk.o.class);
        f73358e = nk.b.a(new nk.b.InterfaceC3378b() { // from class: gk.j0
            @Override // nk.b.InterfaceC3378b
            public final fk.g a(nk.q qVar, fk.y yVar) {
                return k0.b((nk.o) qVar, yVar);
            }
        }, aVarE, nk.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 b(nk.o oVar, fk.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            sk.k0 k0VarB0 = sk.k0.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (k0VarB0.Z() == 0) {
                return g0.a(e(oVar.e()), uk.b.a(k0VarB0.Y().C(), fk.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(nk.i.a());
    }

    public static void d(nk.i iVar) {
        iVar.h(f73355b);
        iVar.g(f73356c);
        iVar.f(f73357d);
        iVar.e(f73358e);
    }

    private static i0.a e(sk.i0 i0Var) throws GeneralSecurityException {
        int i15 = a.f73359a[i0Var.ordinal()];
        if (i15 == 1) {
            return i0.a.f73350b;
        }
        if (i15 == 2 || i15 == 3) {
            return i0.a.f73351c;
        }
        if (i15 == 4) {
            return i0.a.f73352d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.h());
    }
}
