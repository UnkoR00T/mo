package w24;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw24/d2;", "Lw24/c2;", "Lk24/b;", "getCertKeyPairUC", "Lw24/h1;", "getPeselFromPersonalIdCertificateUC", "Lk24/g;", "getMainCertificateTypeUC", "<init>", "(Lk24/b;Lw24/h1;Lk24/g;)V", "Lw24/c2$a;", "params", "", "d", "(Lw24/c2$a;Ltq/e;)Ljava/lang/Object;", "a", "Lk24/b;", "b", "Lw24/h1;", "c", "Lk24/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k24.b getCertKeyPairUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h1 getPeselFromPersonalIdCertificateUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k24.g getMainCertificateTypeUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209561d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209563f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f209564g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f209565h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f209566j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f209568l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209566j = obj;
            this.f209568l |= PKIFailureInfo.systemUnavail;
            return d2.this.c(null, this);
        }
    }

    public d2(k24.b bVar, h1 h1Var, k24.g gVar) {
        this.getCertKeyPairUC = bVar;
        this.getPeselFromPersonalIdCertificateUC = h1Var;
        this.getMainCertificateTypeUC = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
    
        if (r15 == r1) goto L45;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(w24.c2.Params r14, tq.e<? super java.lang.Boolean> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w24.d2.c(w24.c2$a, tq.e):java.lang.Object");
    }
}
