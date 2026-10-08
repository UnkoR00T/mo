package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La44/j1;", "Lwz3/g;", "Lg34/c;", "identityManager", "Lq34/z0;", "getPeselFromPersonalIdCertificateUC", "<init>", "(Lg34/c;Lq34/z0;)V", "Lwz3/g$a;", "params", "Lwz3/g$b;", "d", "(Lwz3/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg34/c;", "b", "Lq34/z0;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j1 implements wz3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.z0 getPeselFromPersonalIdCertificateUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3112g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3114j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3112g = obj;
            this.f3114j |= PKIFailureInfo.systemUnavail;
            return j1.this.c(null, this);
        }
    }

    public j1(g34.c cVar, q34.z0 z0Var) {
        this.identityManager = cVar;
        this.getPeselFromPersonalIdCertificateUC = z0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r12 == r1) goto L33;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(wz3.g.Params r11, tq.e<? super wz3.g.b> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.j1.c(wz3.g$a, tq.e):java.lang.Object");
    }
}
