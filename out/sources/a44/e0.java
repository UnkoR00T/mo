package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La44/e0;", "Lq34/e0;", "Lg34/c;", "identityManager", "Lq34/j0;", "getDocumentValidityStatusUseCase", "<init>", "(Lg34/c;Lq34/j0;)V", "Lq34/e0$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lq34/e0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg34/c;", "b", "Lq34/j0;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 implements q34.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.c identityManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.j0 getDocumentValidityStatusUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3061h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f3062j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3064l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3062j = obj;
            this.f3064l |= PKIFailureInfo.systemUnavail;
            return e0.this.c(null, this);
        }
    }

    public e0(g34.c cVar, q34.j0 j0Var) {
        this.identityManager = cVar;
        this.getDocumentValidityStatusUseCase = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r10 == r1) goto L32;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(q34.e0.Params r9, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.e0.c(q34.e0$a, tq.e):java.lang.Object");
    }
}
