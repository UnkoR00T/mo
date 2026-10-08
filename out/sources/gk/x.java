package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uk.a f73408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final nk.k<v, nk.p> f73409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nk.j<nk.p> f73410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.c<t, nk.o> f73411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nk.b<nk.o> f73412e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f73413a;

        static {
            int[] iArr = new int[sk.i0.values().length];
            f73413a = iArr;
            try {
                iArr[sk.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73413a[sk.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73413a[sk.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73413a[sk.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        uk.a aVarE = nk.t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f73408a = aVarE;
        f73409b = nk.k.a(new j(), v.class, nk.p.class);
        f73410c = nk.j.a(new k(), aVarE, nk.p.class);
        f73411d = nk.c.a(new l(), t.class, nk.o.class);
        f73412e = nk.b.a(new nk.b.InterfaceC3378b() { // from class: gk.w
            @Override // nk.b.InterfaceC3378b
            public final fk.g a(nk.q qVar, fk.y yVar) {
                return x.b((nk.o) qVar, yVar);
            }
        }, aVarE, nk.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t b(nk.o oVar, fk.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            sk.n nVarB0 = sk.n.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (nVarB0.Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return t.a().e(v.a().b(nVarB0.Y().size()).c(e(oVar.e())).a()).d(uk.b.a(nVarB0.Y().C(), fk.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        d(nk.i.a());
    }

    public static void d(nk.i iVar) {
        iVar.h(f73409b);
        iVar.g(f73410c);
        iVar.f(f73411d);
        iVar.e(f73412e);
    }

    private static v.c e(sk.i0 i0Var) throws GeneralSecurityException {
        int i15 = a.f73413a[i0Var.ordinal()];
        if (i15 == 1) {
            return v.c.f73404b;
        }
        if (i15 == 2 || i15 == 3) {
            return v.c.f73405c;
        }
        if (i15 == 4) {
            return v.c.f73406d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.h());
    }
}
