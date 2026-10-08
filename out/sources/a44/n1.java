package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La44/n1;", "Lq34/m1;", "Lg34/c;", "identityManager", "Lq34/e0;", "getCertificateSerialNumberUseCase", "<init>", "(Lg34/c;Lq34/e0;)V", "Lq34/m1$a;", "params", "", "d", "(Lq34/m1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg34/c;", "b", "Lq34/e0;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n1 implements q34.m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.e0 getCertificateSerialNumberUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3149g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3151j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3149g = obj;
            this.f3151j |= PKIFailureInfo.systemUnavail;
            return n1.this.c(null, this);
        }
    }

    public n1(g34.c cVar, q34.e0 e0Var) {
        this.identityManager = cVar;
        this.getCertificateSerialNumberUseCase = e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.m1.Params params, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        String str;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3151j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3151j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f3149g;
        Object objE = uq.b.e();
        int i16 = aVar.f3151j;
        boolean zC = false;
        if (i16 == 0) {
            oq.u.b(objC);
            rq0.b documentType = params.getDocumentType();
            if (documentType != null) {
                str = null;
                if (fr.t.c(g34.c.o(this.identityManager, false, 1, null), documentType)) {
                    q34.e0 e0Var = this.getCertificateSerialNumberUseCase;
                    q34.e0.Params params2 = new q34.e0.Params(documentType);
                    aVar.f3146d = params;
                    aVar.f3147e = vq.j.a(documentType);
                    aVar.f3148f = 0;
                    aVar.f3151j = 1;
                    objC = e0Var.c(params2, aVar);
                    if (objC == objE) {
                        return objE;
                    }
                } else if (str != null) {
                    zC = fr.t.c(str, iy.c0.e(params.getSerialNumber()));
                }
            }
            return vq.b.a(zC);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        params = (q34.m1.Params) aVar.f3146d;
        oq.u.b(objC);
        str = (String) ((dx.i) objC).a();
        if (str != null) {
            zC = fr.t.c(str, iy.c0.e(params.getSerialNumber()));
        }
        return vq.b.a(zC);
    }
}
