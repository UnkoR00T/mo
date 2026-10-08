package s64;

import iq0.TrustedCertificates;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ls64/l;", "Lh64/l;", "Ljq0/f;", "beGetTrustedCertificatesUseCase", "Lq64/c;", "trustedCertificatesCache", "<init>", "(Ljq0/f;Lq64/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Liq0/h0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljq0/f;", "b", "Lq64/c;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements h64.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jq0.f beGetTrustedCertificatesUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q64.c trustedCertificatesCache;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178522f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f178524h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178522f = obj;
            this.f178524h |= PKIFailureInfo.systemUnavail;
            return l.this.c(null, this);
        }
    }

    public l(jq0.f fVar, q64.c cVar) {
        this.beGetTrustedCertificatesUseCase = fVar;
        this.trustedCertificatesCache = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, TrustedCertificates>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178524h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178524h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f178522f;
        Object objE = uq.b.e();
        int i16 = aVar.f178524h;
        if (i16 == 0) {
            oq.u.b(objC);
            TrustedCertificates trustedCertificatesD = this.trustedCertificatesCache.d();
            if (trustedCertificatesD != null) {
                return new dx.i.Right(trustedCertificatesD);
            }
            jq0.f fVar = this.beGetTrustedCertificatesUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f178520d = vq.j.a(c1792a);
            aVar.f178521e = vq.j.a(trustedCertificatesD);
            aVar.f178524h = 1;
            objC = fVar.c(c1792a2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Right) {
            this.trustedCertificatesCache.c((TrustedCertificates) ((dx.i.Right) iVar).b());
        }
        return iVar;
    }
}
