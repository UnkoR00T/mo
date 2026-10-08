package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltz3/c;", "Lmz3/c;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "asyncDownloadTasksDataSource", "Lmz3/x;", "startManageAsyncDownloadWorkerUseCase", "Ltz3/f0;", "hasAnyAsyncDownloadErrorUC", "Lmz3/u;", "removeAsyncDownloadTaskUC", "Lmz3/d;", "cancelAllAsyncDownloadWorkersUC", "<init>", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/a;Lmz3/x;Ltz3/f0;Lmz3/u;Lmz3/d;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "b", "Lmz3/x;", "c", "Ltz3/f0;", "d", "Lmz3/u;", "e", "Lmz3/d;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements mz3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.a asyncDownloadTasksDataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.x startManageAsyncDownloadWorkerUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f0 hasAnyAsyncDownloadErrorUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.u removeAsyncDownloadTaskUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mz3.d cancelAllAsyncDownloadWorkersUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f192942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f192943h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f192944j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f192945k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f192946l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f192948n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192946l = obj;
            this.f192948n |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(pl.gov.coi.mobywatel.technical.async.data.storage.a aVar, mz3.x xVar, f0 f0Var, mz3.u uVar, mz3.d dVar) {
        this.asyncDownloadTasksDataSource = aVar;
        this.startManageAsyncDownloadWorkerUseCase = xVar;
        this.hasAnyAsyncDownloadErrorUC = f0Var;
        this.removeAsyncDownloadTaskUC = uVar;
        this.cancelAllAsyncDownloadWorkersUC = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x010f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0120  */
    /* JADX WARN: Code duplicated, block: B:47:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0160 -> B:50:0x01c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01c2 -> B:50:0x01c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r22, tq.e<? super oq.i0> r23) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.c.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
