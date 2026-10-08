package ch1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.q1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lch1/o;", "Lch1/n;", "Lq34/q1;", "loadCachedAddedDocumentsUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lmz3/l;", "getAllDocumentsDownloadStatusesUC", "Lpx/d;", "remoteLogger", "<init>", "(Lq34/q1;Lq34/j0;Lmz3/q;Lmz3/l;Lpx/d;)V", "Lgz/b$a$a;", "params", "", "Lrq0/b;", "Llz3/h;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lq34/q1;", "b", "Lq34/j0;", "c", "Lmz3/q;", "d", "Lmz3/l;", "e", "Lpx/d;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q1 loadCachedAddedDocumentsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.j0 getDocumentValidityStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.l getAllDocumentsDownloadStatusesUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26961b;

        static {
            int[] iArr = new int[er0.h.values().length];
            try {
                iArr[er0.h.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[er0.h.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[er0.h.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[er0.h.ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26960a = iArr;
            int[] iArr2 = new int[lz3.h.values().length];
            try {
                iArr2[lz3.h.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lz3.h.TAKES_TOO_LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[lz3.h.CREATING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f26961b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f26964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f26965g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f26966h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f26967j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f26968k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f26969l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f26970m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f26971n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f26972p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f26973q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f26974r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f26975s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f26976t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f26977v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f26978w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f26979x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f26981z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26979x = obj;
            this.f26981z |= PKIFailureInfo.systemUnavail;
            return o.this.c(null, this);
        }
    }

    public o(q1 q1Var, q34.j0 j0Var, mz3.q qVar, mz3.l lVar, px.d dVar) {
        this.loadCachedAddedDocumentsUC = q1Var;
        this.getDocumentValidityStatusUseCase = j0Var;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.getAllDocumentsDownloadStatusesUC = lVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x014c  */
    /* JADX WARN: Code duplicated, block: B:32:0x019a  */
    /* JADX WARN: Code duplicated, block: B:35:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0213  */
    /* JADX WARN: Code duplicated, block: B:41:0x0226  */
    /* JADX WARN: Code duplicated, block: B:42:0x0245  */
    /* JADX WARN: Code duplicated, block: B:44:0x0253  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0255 -> B:80:0x0321). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x02cb -> B:52:0x02d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r22, tq.e<? super java.util.Map<rq0.b, ? extends lz3.h>> r23) {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.o.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
