package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltz3/g0;", "Ltz3/f0;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "asyncDownloadTasksDataSource", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "<init>", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/a;Lmz3/q;)V", "Ltz3/f0$a;", "params", "", "d", "(Ltz3/f0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "b", "Lmz3/q;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.a asyncDownloadTasksDataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f193101h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f193102j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f193103k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f193104l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f193105m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f193106n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f193107p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f193108q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f193109r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f193111t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193109r = obj;
            this.f193111t |= PKIFailureInfo.systemUnavail;
            return g0.this.c(null, this);
        }
    }

    public g0(pl.gov.coi.mobywatel.technical.async.data.storage.a aVar, mz3.q qVar) {
        this.asyncDownloadTasksDataSource = aVar;
        this.getDocumentDownloadStatusUseCase = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0126 -> B:37:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x015e -> B:54:0x0160). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(tz3.f0.Params r20, tq.e<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.g0.c(tz3.f0$a, tq.e):java.lang.Object");
    }
}
