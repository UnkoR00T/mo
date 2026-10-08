package ok;

import com.google.crypto.tink.shaded.protobuf.b0;
import fk.y;
import java.security.GeneralSecurityException;
import nk.t;
import sk.i0;
import sk.u;
import sk.v;

/* JADX INFO: loaded from: classes4.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uk.a f146445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final nk.k<l, nk.p> f146446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final nk.j<nk.p> f146447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final nk.c<i, nk.o> f146448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final nk.b<nk.o> f146449e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f146450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f146451b;

        static {
            int[] iArr = new int[i0.values().length];
            f146451b = iArr;
            try {
                iArr[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f146451b[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f146451b[i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f146451b[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f146450a = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f146450a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f146450a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f146450a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f146450a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        uk.a aVarE = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f146445a = aVarE;
        f146446b = nk.k.a(new gk.j(), l.class, nk.p.class);
        f146447c = nk.j.a(new gk.k(), aVarE, nk.p.class);
        f146448d = nk.c.a(new gk.l(), i.class, nk.o.class);
        f146449e = nk.b.a(new nk.b.InterfaceC3378b() { // from class: ok.m
            @Override // nk.b.InterfaceC3378b
            public final fk.g a(nk.q qVar, y yVar) {
                return n.b((nk.o) qVar, yVar);
            }
        }, aVarE, nk.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i b(nk.o oVar, y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v vVarE0 = v.e0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (vVarE0.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return i.c().e(l.a().c(vVarE0.a0().size()).d(vVarE0.b0().a0()).b(e(vVarE0.b0().Z())).e(f(oVar.e())).a()).d(uk.b.a(vVarE0.a0().C(), y.b(yVar))).c(oVar.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(nk.i.a());
    }

    public static void d(nk.i iVar) {
        iVar.h(f146446b);
        iVar.g(f146447c);
        iVar.f(f146448d);
        iVar.e(f146449e);
    }

    private static l.c e(u uVar) throws GeneralSecurityException {
        int i15 = a.f146450a[uVar.ordinal()];
        if (i15 == 1) {
            return l.c.f146434b;
        }
        if (i15 == 2) {
            return l.c.f146435c;
        }
        if (i15 == 3) {
            return l.c.f146436d;
        }
        if (i15 == 4) {
            return l.c.f146437e;
        }
        if (i15 == 5) {
            return l.c.f146438f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.h());
    }

    private static l.d f(i0 i0Var) throws GeneralSecurityException {
        int i15 = a.f146451b[i0Var.ordinal()];
        if (i15 == 1) {
            return l.d.f146440b;
        }
        if (i15 == 2) {
            return l.d.f146441c;
        }
        if (i15 == 3) {
            return l.d.f146442d;
        }
        if (i15 == 4) {
            return l.d.f146443e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.h());
    }
}
