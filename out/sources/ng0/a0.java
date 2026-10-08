package ng0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.z0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lng0/a0;", "Leg0/x;", "Lq34/z0;", "getPeselFromPersonalIdCertificateUC", "Lg14/a;", "getInfoFromPeselUC", "Leg0/l;", "getUserCertUC", "Lmg0/a;", "repository", "<init>", "(Lq34/z0;Lg14/a;Leg0/l;Lmg0/a;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lq34/z0;", "b", "Lg14/a;", "c", "Leg0/l;", "d", "Lmg0/a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements eg0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificateUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final eg0.l getUserCertUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mg0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135954g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f135956j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135954g = obj;
            this.f135956j |= PKIFailureInfo.systemUnavail;
            return a0.this.c(null, this);
        }
    }

    public a0(z0 z0Var, g14.a aVar, eg0.l lVar, mg0.a aVar2) {
        this.getPeselFromPersonalIdCertificateUC = z0Var;
        this.getInfoFromPeselUC = aVar;
        this.getUserCertUC = lVar;
        this.repository = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        if (r12 == r1) goto L35;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r11, tq.e<? super java.lang.Boolean> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ng0.a0.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
