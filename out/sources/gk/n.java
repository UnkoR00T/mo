package gk;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uk.a f73360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final nk.k<i, nk.p> f73361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nk.j<nk.p> f73362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.c<g, nk.o> f73363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nk.b<nk.o> f73364e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f73365a;

        static {
            int[] iArr = new int[sk.i0.values().length];
            f73365a = iArr;
            try {
                iArr[sk.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73365a[sk.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73365a[sk.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73365a[sk.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        uk.a aVarE = nk.t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f73360a = aVarE;
        f73361b = nk.k.a(new j(), i.class, nk.p.class);
        f73362c = nk.j.a(new k(), aVarE, nk.p.class);
        f73363d = nk.c.a(new l(), g.class, nk.o.class);
        f73364e = nk.b.a(new nk.b.InterfaceC3378b() { // from class: gk.m
            @Override // nk.b.InterfaceC3378b
            public final fk.g a(nk.q qVar, fk.y yVar) {
                return n.b((nk.o) qVar, yVar);
            }
        }, aVarE, nk.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g b(nk.o oVar, fk.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            sk.i iVarD0 = sk.i.d0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (iVarD0.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return g.a().e(i.a().c(iVarD0.Z().size()).b(iVarD0.a0().Y()).d(16).e(e(oVar.e())).a()).d(uk.b.a(iVarD0.Z().C(), fk.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        d(nk.i.a());
    }

    public static void d(nk.i iVar) {
        iVar.h(f73361b);
        iVar.g(f73362c);
        iVar.f(f73363d);
        iVar.e(f73364e);
    }

    private static i.c e(sk.i0 i0Var) throws GeneralSecurityException {
        int i15 = a.f73365a[i0Var.ordinal()];
        if (i15 == 1) {
            return i.c.f73345b;
        }
        if (i15 == 2 || i15 == 3) {
            return i.c.f73346c;
        }
        if (i15 == 4) {
            return i.c.f73347d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.h());
    }
}
