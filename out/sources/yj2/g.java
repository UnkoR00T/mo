package yj2;

import mz3.a0;
import mz3.l;
import mz3.m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lyj2/g;", "Lyj2/f;", "Lmz3/i;", "deleteAllSpecificDocumentsDownloadStatusesUC", "Lmz3/l;", "getAllDocumentsDownloadStatusesUC", "Lmz3/m;", "getAllDownloadTaskDataUC", "Lmz3/a0;", "updateDocumentDownloadStatusUseCase", "<init>", "(Lmz3/i;Lmz3/l;Lmz3/m;Lmz3/a0;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmz3/i;", "b", "Lmz3/l;", "c", "Lmz3/m;", "d", "Lmz3/a0;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.i deleteAllSpecificDocumentsDownloadStatusesUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l getAllDocumentsDownloadStatusesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m getAllDownloadTaskDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a0 updateDocumentDownloadStatusUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f227384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f227385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f227386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f227387h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f227388j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f227389k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f227390l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f227391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f227392n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f227393p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f227394q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f227395r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f227396s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f227397t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f227398v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f227400x;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227398v = obj;
            this.f227400x |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(mz3.i iVar, l lVar, m mVar, a0 a0Var) {
        this.deleteAllSpecificDocumentsDownloadStatusesUC = iVar;
        this.getAllDocumentsDownloadStatusesUC = lVar;
        this.getAllDownloadTaskDataUC = mVar;
        this.updateDocumentDownloadStatusUseCase = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0163  */
    /* JADX WARN: Code duplicated, block: B:50:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0223 A[PHI: r1 r4 r5 r6 r9
      0x0223: PHI (r1v16 java.util.Map) = (r1v15 java.util.Map), (r1v18 java.util.Map) binds: [B:49:0x0179, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r4v10 java.util.Set) = (r4v8 java.util.Set), (r4v12 java.util.Set) binds: [B:49:0x0179, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r5v10 gz.b$a$a) = (r5v8 gz.b$a$a), (r5v12 gz.b$a$a) binds: [B:49:0x0179, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r6v5 java.util.Iterator) = (r6v3 java.util.Iterator), (r6v7 java.util.Iterator) binds: [B:49:0x0179, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r9v13 int) = (r9v11 int), (r9v15 int) binds: [B:49:0x0179, B:61:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0179 -> B:62:0x0223). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x017b -> B:51:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r21, tq.e<? super oq.i0> r22) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yj2.g.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
