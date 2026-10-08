package s64;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ls64/g;", "Lh64/g;", "Lr64/a;", "globalSearchRepository", "Ljq0/c;", "beGetGlobalSearchConfigUC", "Ljq0/d;", "beGetGlobalSearchTagsUC", "<init>", "(Lr64/a;Ljq0/c;Ljq0/d;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lr64/a;", "b", "Ljq0/c;", "c", "Ljq0/d;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements h64.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r64.a globalSearchRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jq0.c beGetGlobalSearchConfigUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jq0.d beGetGlobalSearchTagsUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f178487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f178488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f178489h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f178490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f178491k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f178492l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f178493m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f178494n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f178495p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f178497r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178495p = obj;
            this.f178497r |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(r64.a aVar, jq0.c cVar, jq0.d dVar) {
        this.globalSearchRepository = aVar;
        this.beGetGlobalSearchConfigUC = cVar;
        this.beGetGlobalSearchTagsUC = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x011e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x015c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0165  */
    /* JADX WARN: Code duplicated, block: B:49:0x0173  */
    /* JADX WARN: Code duplicated, block: B:51:0x0177  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b4, code lost:
    
        if (r15 == r1) goto L53;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r14, tq.e<? super dx.i<? extends dx.b, oq.i0>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s64.g.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
