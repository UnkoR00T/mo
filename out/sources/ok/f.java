package ok;

import com.google.crypto.tink.shaded.protobuf.b0;
import fk.y;
import java.security.GeneralSecurityException;
import nk.t;
import sk.i0;

/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uk.a f146408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final nk.k<d, nk.p> f146409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nk.j<nk.p> f146410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.c<ok.a, nk.o> f146411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nk.b<nk.o> f146412e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f146413a;

        static {
            int[] iArr = new int[i0.values().length];
            f146413a = iArr;
            try {
                iArr[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f146413a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f146413a[i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f146413a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        uk.a aVarE = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f146408a = aVarE;
        f146409b = nk.k.a(new gk.j(), d.class, nk.p.class);
        f146410c = nk.j.a(new gk.k(), aVarE, nk.p.class);
        f146411d = nk.c.a(new gk.l(), ok.a.class, nk.o.class);
        f146412e = nk.b.a(new nk.b.InterfaceC3378b() { // from class: ok.e
            @Override // nk.b.InterfaceC3378b
            public final fk.g a(nk.q qVar, y yVar) {
                return f.b((nk.o) qVar, yVar);
            }
        }, aVarE, nk.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ok.a b(nk.o oVar, y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            sk.a aVarD0 = sk.a.d0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (aVarD0.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return ok.a.c().e(d.a().b(aVarD0.Z().size()).c(aVarD0.a0().Y()).d(e(oVar.e())).a()).c(uk.b.a(aVarD0.Z().C(), y.b(yVar))).d(oVar.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(nk.i.a());
    }

    public static void d(nk.i iVar) {
        iVar.h(f146409b);
        iVar.g(f146410c);
        iVar.f(f146411d);
        iVar.e(f146412e);
    }

    private static d.c e(i0 i0Var) throws GeneralSecurityException {
        int i15 = a.f146413a[i0Var.ordinal()];
        if (i15 == 1) {
            return d.c.f146403b;
        }
        if (i15 == 2) {
            return d.c.f146404c;
        }
        if (i15 == 3) {
            return d.c.f146405d;
        }
        if (i15 == 4) {
            return d.c.f146406e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.h());
    }
}
