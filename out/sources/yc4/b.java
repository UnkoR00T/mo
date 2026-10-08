package yc4;

import dx.i;
import java.security.cert.X509Certificate;
import k24.g;
import k34.u;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.z0;
import ry.CertKeyPair;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u001a\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006)"}, d2 = {"Lyc4/b;", "Lnv3/b;", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/g;", "getMainCertificateTypeUC", "Lk24/b;", "getCertKeyPairUC", "Lq34/z0;", "getPeselFromPersonalIdCertificateUC", "<init>", "(Lg34/c;Lc54/b;Lk24/g;Lk24/b;Lq34/z0;)V", "Lk34/u;", "Lpv3/a;", "e", "(Lk34/u;)Lpv3/a;", "f", "(Lpv3/a;)Lk34/u;", "", "withValidCert", "Ldx/i;", "Ldx/b;", "a", "(ZLtq/e;)Ljava/lang/Object;", "identityType", "Lry/c;", "c", "(Lpv3/a;Ltq/e;)Ljava/lang/Object;", "Ljava/security/cert/X509Certificate;", "x509Cert", "Lxw/g;", "b", "(Ljava/security/cert/X509Certificate;Ltq/e;)Ljava/lang/Object;", "Lg34/c;", "Lc54/b;", "Lk24/g;", "d", "Lk24/b;", "Lq34/z0;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements nv3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g getMainCertificateTypeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k24.b getCertKeyPairUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificateUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f226412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f226413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f226414c;

        static {
            int[] iArr = new int[f24.c.values().length];
            try {
                iArr[f24.c.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.c.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.c.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f226412a = iArr;
            int[] iArr2 = new int[pv3.a.values().length];
            try {
                iArr2[pv3.a.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[pv3.a.DIIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[pv3.a.STUDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f226413b = iArr2;
            int[] iArr3 = new int[u.values().length];
            try {
                iArr3[u.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[u.DIIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[u.STUDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f226414c = iArr3;
        }
    }

    /* JADX INFO: renamed from: yc4.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6069b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f226415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226416e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226418g;

        C6069b(e<? super C6069b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226416e = obj;
            this.f226418g |= PKIFailureInfo.systemUnavail;
            return b.this.a(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226420e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226422g;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226420e = obj;
            this.f226422g |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    public b(g34.c cVar, c54.b bVar, g gVar, k24.b bVar2, z0 z0Var) {
        this.identityManager = cVar;
        this.isFeatureEnabledUseCase = bVar;
        this.getMainCertificateTypeUC = gVar;
        this.getCertKeyPairUC = bVar2;
        this.getPeselFromPersonalIdCertificateUC = z0Var;
    }

    private final pv3.a e(u uVar) {
        int i15 = a.f226414c[uVar.ordinal()];
        if (i15 == 1) {
            return pv3.a.MOBYWATEL;
        }
        if (i15 == 2) {
            return pv3.a.DIIA;
        }
        if (i15 == 3) {
            return pv3.a.STUDENT;
        }
        throw new p();
    }

    private final u f(pv3.a aVar) {
        int i15 = a.f226413b[aVar.ordinal()];
        if (i15 == 1) {
            return u.MOBYWATEL;
        }
        if (i15 == 2) {
            return u.DIIA;
        }
        if (i15 == 3) {
            return u.STUDENT;
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv3.b
    public Object a(boolean z15, e<? super i<? extends dx.b, ? extends pv3.a>> eVar) throws Throwable {
        C6069b c6069b;
        pv3.a aVar;
        if (eVar instanceof C6069b) {
            c6069b = (C6069b) eVar;
            int i15 = c6069b.f226418g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c6069b.f226418g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c6069b = new C6069b(eVar);
            }
        } else {
            c6069b = new C6069b(eVar);
        }
        Object objC = c6069b.f226416e;
        Object objE = uq.b.e();
        int i16 = c6069b.f226418g;
        if (i16 == 0) {
            oq.u.b(objC);
            boolean zBooleanValue = this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new p();
                }
                i<dx.b, u> iVarG = this.identityManager.g(z15);
                if (iVarG instanceof i.Left) {
                    return iVarG;
                }
                if (iVarG instanceof i.Right) {
                    return new i.Right(e((u) ((i.Right) iVarG).b()));
                }
                throw new p();
            }
            g gVar = this.getMainCertificateTypeUC;
            g.Params params = new g.Params(z15);
            c6069b.f226415d = z15;
            c6069b.f226418g = 1;
            objC = gVar.c(params, c6069b);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        int i17 = a.f226412a[((f24.c) ((i.Right) iVar).b()).ordinal()];
        if (i17 == 1) {
            aVar = pv3.a.MOBYWATEL;
        } else if (i17 == 2) {
            aVar = pv3.a.DIIA;
        } else {
            if (i17 != 3) {
                throw new p();
            }
            aVar = pv3.a.STUDENT;
        }
        return new i.Right(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nv3.b
    public Object b(X509Certificate x509Certificate, e<? super i<? extends dx.b, xw.g>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f226422g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f226422g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f226420e;
        Object objE = uq.b.e();
        int i16 = cVar.f226422g;
        if (i16 == 0) {
            oq.u.b(objC);
            z0 z0Var = this.getPeselFromPersonalIdCertificateUC;
            z0.a.Cert cert = new z0.a.Cert(x509Certificate);
            cVar.f226419d = j.a(x509Certificate);
            cVar.f226422g = 1;
            objC = z0Var.c(cert, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(xw.g.b(xw.g.c(((z0.Result) ((i.Right) iVar).b()).getPesel())));
        }
        throw new p();
    }

    @Override // nv3.b
    public Object c(pv3.a aVar, e<? super i<? extends dx.b, CertKeyPair>> eVar) {
        f24.c cVar;
        boolean zBooleanValue = this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
        if (!zBooleanValue) {
            if (zBooleanValue) {
                throw new p();
            }
            return this.identityManager.m(f(aVar));
        }
        k24.b bVar = this.getCertKeyPairUC;
        int i15 = a.f226413b[aVar.ordinal()];
        if (i15 == 1) {
            cVar = f24.c.CITIZEN;
        } else if (i15 == 2) {
            cVar = f24.c.REFUGEE;
        } else {
            if (i15 != 3) {
                throw new p();
            }
            cVar = f24.c.UNIVERSITY;
        }
        return bVar.c(new k24.b.Params(cVar), eVar);
    }
}
