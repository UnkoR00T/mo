package ch1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.l1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lch1/s;", "Lug1/c;", "Lj34/b;", "documentToNavigationMapper", "Lmz3/v;", "removeDocumentDownloadStatusUseCase", "Lq34/l1;", "isDocumentStoredByIdUC", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lyg1/a;", "dashboardContainersInteractor", "Lch1/l;", "getCertificateDeactivatedErrorForDocumentUC", "<init>", "(Lj34/b;Lmz3/v;Lq34/l1;Lmz3/q;Lyg1/a;Lch1/l;)V", "Lug1/c$a;", "params", "Ldx/i;", "Ldx/b;", "Lgx/b;", "d", "(Lug1/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj34/b;", "b", "Lmz3/v;", "c", "Lq34/l1;", "Lmz3/q;", "e", "Lyg1/a;", "f", "Lch1/l;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements ug1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j34.b documentToNavigationMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.v removeDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l1 isDocumentStoredByIdUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l getCertificateDeactivatedErrorForDocumentUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f27041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f27042g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f27043h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f27044j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f27045k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f27046l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f27047m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f27049p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f27047m = obj;
            this.f27049p |= PKIFailureInfo.systemUnavail;
            return s.this.c(null, this);
        }
    }

    public s(j34.b bVar, mz3.v vVar, l1 l1Var, mz3.q qVar, yg1.a aVar, l lVar) {
        this.documentToNavigationMapper = bVar;
        this.removeDocumentDownloadStatusUseCase = vVar;
        this.isDocumentStoredByIdUC = l1Var;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.dashboardContainersInteractor = aVar;
        this.getCertificateDeactivatedErrorForDocumentUC = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x015d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x017d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x0204 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:0: B:59:0x0181->B:82:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
    
        if (r1 == r3) goto L73;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(ug1.c.Params r20, tq.e<? super dx.i<? extends dx.b, ? extends gx.b>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.s.c(ug1.c$a, tq.e):java.lang.Object");
    }
}
