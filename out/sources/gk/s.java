package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uk.a f73386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final nk.k<q, nk.p> f73387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nk.j<nk.p> f73388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.c<o, nk.o> f73389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nk.b<nk.o> f73390e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f73391a;

        static {
            int[] iArr = new int[sk.i0.values().length];
            f73391a = iArr;
            try {
                iArr[sk.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73391a[sk.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73391a[sk.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73391a[sk.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        uk.a aVarE = nk.t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f73386a = aVarE;
        f73387b = nk.k.a(new j(), q.class, nk.p.class);
        f73388c = nk.j.a(new k(), aVarE, nk.p.class);
        f73389d = nk.c.a(new l(), o.class, nk.o.class);
        f73390e = nk.b.a(new nk.b.InterfaceC3378b() { // from class: gk.r
            @Override // nk.b.InterfaceC3378b
            public final fk.g a(nk.q qVar, fk.y yVar) {
                return s.b((nk.o) qVar, yVar);
            }
        }, aVarE, nk.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o b(nk.o oVar, fk.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            sk.l lVarB0 = sk.l.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (lVarB0.Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return o.a().e(q.a().c(lVarB0.Y().size()).b(12).d(16).e(e(oVar.e())).a()).d(uk.b.a(lVarB0.Y().C(), fk.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(nk.i.a());
    }

    public static void d(nk.i iVar) {
        iVar.h(f73387b);
        iVar.g(f73388c);
        iVar.f(f73389d);
        iVar.e(f73390e);
    }

    private static q.c e(sk.i0 i0Var) throws GeneralSecurityException {
        int i15 = a.f73391a[i0Var.ordinal()];
        if (i15 == 1) {
            return q.c.f73382b;
        }
        if (i15 == 2 || i15 == 3) {
            return q.c.f73383c;
        }
        if (i15 == 4) {
            return q.c.f73384d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.h());
    }
}
