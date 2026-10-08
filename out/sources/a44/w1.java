package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"La44/w1;", "Lq34/v1;", "Lq34/k0;", "getDocumentsIdsUseCase", "Lq34/l0;", "getDocumentsSerialNumberUseCase", "Lkr0/c;", "bEGetDocumentsStatusesLegacyUC", "Lp34/a;", "documentsRepository", "Ls54/g;", "removeNotificationsForDocumentUC", "Lu34/b;", "documentsSummaryLocalRepository", "<init>", "(Lq34/k0;Lq34/l0;Lkr0/c;Lp34/a;Ls54/g;Lu34/b;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lq34/k0;", "b", "Lq34/l0;", "c", "Lkr0/c;", "d", "Lp34/a;", "e", "Ls54/g;", "f", "Lu34/b;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w1 implements q34.v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q34.k0 getDocumentsIdsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.l0 getDocumentsSerialNumberUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kr0.c bEGetDocumentsStatusesLegacyUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s54.g removeNotificationsForDocumentUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int A;
        int B;
        int C;
        int D;
        /* synthetic */ Object E;
        int G;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3326h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f3327j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f3328k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f3329l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f3330m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3331n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f3332p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3333q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3334r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3335s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3336t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f3337v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f3338w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f3339x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f3340y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f3341z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.E = obj;
            this.G |= PKIFailureInfo.systemUnavail;
            return w1.this.c(null, this);
        }
    }

    public w1(q34.k0 k0Var, q34.l0 l0Var, kr0.c cVar, p34.a aVar, s54.g gVar, u34.b bVar) {
        this.getDocumentsIdsUseCase = k0Var;
        this.getDocumentsSerialNumberUseCase = l0Var;
        this.bEGetDocumentsStatusesLegacyUC = cVar;
        this.documentsRepository = aVar;
        this.removeNotificationsForDocumentUC = gVar;
        this.documentsSummaryLocalRepository = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0592  */
    /* JADX WARN: Code duplicated, block: B:109:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:113:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0348  */
    /* JADX WARN: Code duplicated, block: B:69:0x037a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:95:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:97:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:99:0x04f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x05d7 -> B:131:0x077d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0745 -> B:129:0x0751). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0769 -> B:131:0x077d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r30, tq.e<? super dx.i<? extends dx.b, oq.i0>> r31) {
        /*
            Method dump skipped, instruction units count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.w1.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
