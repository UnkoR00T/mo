package ng0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lng0/v;", "Leg0/s;", "Lmg0/b;", "repository", "Ly80/a;", "getDocumentsStatusesUC", "Lng0/g;", "getDocumentParentIdWithoutActiveTaskUC", "<init>", "(Lmg0/b;Ly80/a;Lng0/g;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "Leg0/s$a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmg0/b;", "b", "Ly80/a;", "c", "Lng0/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements eg0.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mg0.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y80.a getDocumentsStatusesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g getDocumentParentIdWithoutActiveTaskUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int A;
        int B;
        int C;
        int D;
        /* synthetic */ Object E;
        int G;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f136108g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f136109h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f136110j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f136111k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f136112l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f136113m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f136114n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f136115p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f136116q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f136117r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f136118s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f136119t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f136120v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f136121w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f136122x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f136123y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f136124z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.E = obj;
            this.G |= PKIFailureInfo.systemUnavail;
            return v.this.c(null, this);
        }
    }

    public v(mg0.b bVar, y80.a aVar, g gVar) {
        this.repository = bVar;
        this.getDocumentsStatusesUC = aVar;
        this.getDocumentParentIdWithoutActiveTaskUC = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03de A[LOOP:2: B:95:0x03c1->B:100:0x03de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x03dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:97:0x03c9 A[Catch: Exception -> 0x009f, c -> 0x00a4, CancellationException -> 0x00a9, TryCatch #10 {c -> 0x00a4, CancellationException -> 0x00a9, Exception -> 0x009f, blocks: (B:15:0x0082, B:94:0x03b1, B:95:0x03c1, B:97:0x03c9, B:102:0x03e5, B:104:0x03e9, B:107:0x0403), top: B:140:0x0082 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x013b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:38:0x013b */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x013f: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:40:0x013f */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0143: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:42:0x0143 */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x02b7 -> B:67:0x0244). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r29, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<eg0.s.RefreshDocumentData>>> r30) {
        /*
            Method dump skipped, instruction units count: 1177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ng0.v.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
