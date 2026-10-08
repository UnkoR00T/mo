package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltz3/g;", "Ltz3/f;", "Ltz3/v;", "getAsyncDownloadTaskDataUC", "Lmz3/a0;", "updateDocumentDownloadStatusUseCase", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lqz3/b;", "asyncDownloadInteractor", "<init>", "(Ltz3/v;Lmz3/a0;Lmz3/q;Lqz3/b;)V", "Ltz3/f$a;", "params", "Loq/i0;", "d", "(Ltz3/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Ltz3/v;", "b", "Lmz3/a0;", "c", "Lmz3/q;", "Lqz3/b;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v getAsyncDownloadTaskDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.a0 updateDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qz3.b asyncDownloadInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int B;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f193079h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f193080j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f193081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f193082l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f193083m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f193084n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f193085p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f193086q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f193087r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f193088s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f193089t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f193090v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f193091w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f193092x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f193093y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f193094z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193094z = obj;
            this.B |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(v vVar, mz3.a0 a0Var, mz3.q qVar, qz3.b bVar) {
        this.getAsyncDownloadTaskDataUC = vVar;
        this.updateDocumentDownloadStatusUseCase = a0Var;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.asyncDownloadInteractor = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0228  */
    /* JADX WARN: Code duplicated, block: B:31:0x027a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0287  */
    /* JADX WARN: Code duplicated, block: B:73:0x04da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x028d -> B:37:0x02a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0499 -> B:67:0x04a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x04bb -> B:71:0x04c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(tz3.f.Params r24, tq.e<? super oq.i0> r25) {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.g.c(tz3.f$a, tq.e):java.lang.Object");
    }
}
