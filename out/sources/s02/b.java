package s02;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ls02/b;", "", "Lgz/b$a$a;", "Leo0/i0$a;", "Lj02/b;", "dataSource", "Ls02/g;", "refreshUseCase", "Ls02/f;", "isOwTokenExpiredUC", "Lmx/c;", "labelProvider", "<init>", "(Lj02/b;Ls02/g;Ls02/f;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lj02/b;", "b", "Ls02/g;", "c", "Ls02/f;", "Ldx/b$c;", "d", "Ldx/b$c;", "tokenNotProvidedError", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j02.b dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g refreshUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f isOwTokenExpiredUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business tokenNotProvidedError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f177078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f177079h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f177080j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f177081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f177082l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f177084n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177082l = obj;
            this.f177084n |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(j02.b bVar, g gVar, f fVar, mx.c cVar) {
        this.dataSource = bVar;
        this.refreshUseCase = gVar;
        this.isOwTokenExpiredUC = fVar;
        this.tokenNotProvidedError = new dx.b.Business(n02.a.OW_TOKEN_NOT_PROVIDED, null, cVar.c(e02.a.f46611t0), null, null, cVar.c(e02.a.f46550j), null, 90, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        if (r11 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r10, tq.e<? super dx.i<? extends dx.b, eo0.OwTokens.Access>> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s02.b.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
