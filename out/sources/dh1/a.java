package dh1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.i0;
import q34.o1;
import r34.d;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldh1/a;", "", "Lgz/b$a$a;", "", "Lth1/a$a;", "Lr34/d;", "getSavedDocumentsConfigsUC", "Lq34/o1;", "loadAllDocumentsUseCase", "Lq34/i0;", "getDocumentInfoUC", "<init>", "(Lr34/d;Lq34/o1;Lq34/i0;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lr34/d;", "b", "Lq34/o1;", "c", "Lq34/i0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d getSavedDocumentsConfigsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o1 loadAllDocumentsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i0 getDocumentInfoUC;

    /* JADX INFO: renamed from: dh1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0929a extends vq.d {
        int A;
        int B;
        /* synthetic */ Object C;
        int E;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f42536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f42537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f42538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f42539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f42540h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f42541j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f42542k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f42543l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f42544m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f42545n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f42546p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f42547q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f42548r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f42549s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f42550t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f42551v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f42552w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f42553x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f42554y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f42555z;

        C0929a(e<? super C0929a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.C = obj;
            this.E |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(d dVar, o1 o1Var, i0 i0Var) {
        this.getSavedDocumentsConfigsUC = dVar;
        this.loadAllDocumentsUseCase = o1Var;
        this.getDocumentInfoUC = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0171 A[Catch: Exception -> 0x01f6, c -> 0x01fb, CancellationException -> 0x0200, TRY_ENTER, TryCatch #13 {c -> 0x01fb, CancellationException -> 0x0200, Exception -> 0x01f6, blocks: (B:57:0x01ee, B:59:0x01f2, B:53:0x0171, B:67:0x0215), top: B:139:0x01ee }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01de  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f2 A[Catch: Exception -> 0x01f6, c -> 0x01fb, CancellationException -> 0x0200, TryCatch #13 {c -> 0x01fb, CancellationException -> 0x0200, Exception -> 0x01f6, blocks: (B:57:0x01ee, B:59:0x01f2, B:53:0x0171, B:67:0x0215), top: B:139:0x01ee }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01e2 -> B:139:0x01ee). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(gz.b.a.C1792a r25, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<th1.a.DocumentItem>>> r26) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dh1.a.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
