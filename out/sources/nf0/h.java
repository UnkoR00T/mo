package nf0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnf0/h;", "Ldf0/h;", "Ljf0/a;", "documentDownloadRepository", "Lmf0/a;", "downloadTaskDataRepository", "Lof0/a;", "asyncDownloadDocumentsManager", "<init>", "(Ljf0/a;Lmf0/a;Lof0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljf0/a;", "b", "Lmf0/a;", "c", "Lof0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements df0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jf0.a documentDownloadRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final of0.a asyncDownloadDocumentsManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135629g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135630h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f135631j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f135632k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f135633l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135634m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135635n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f135636p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f135637q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f135638r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f135639s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f135640t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f135641v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f135643x;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135641v = obj;
            this.f135643x |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(jf0.a aVar, mf0.a aVar2, of0.a aVar3) {
        this.documentDownloadRepository = aVar;
        this.downloadTaskDataRepository = aVar2;
        this.asyncDownloadDocumentsManager = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f0 A[Catch: Exception -> 0x0061, c -> 0x0064, CancellationException -> 0x0067, TryCatch #9 {Exception -> 0x0061, blocks: (B:14:0x0059, B:87:0x0270, B:89:0x0276, B:63:0x01be, B:65:0x01c4, B:67:0x01d3, B:80:0x0218, B:70:0x01e2, B:71:0x01ea, B:73:0x01f0, B:75:0x0202, B:91:0x0288, B:93:0x0290, B:96:0x029e, B:43:0x00ef), top: B:112:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0202 A[Catch: Exception -> 0x0061, c -> 0x0064, CancellationException -> 0x0067, TryCatch #9 {Exception -> 0x0061, blocks: (B:14:0x0059, B:87:0x0270, B:89:0x0276, B:63:0x01be, B:65:0x01c4, B:67:0x01d3, B:80:0x0218, B:70:0x01e2, B:71:0x01ea, B:73:0x01f0, B:75:0x0202, B:91:0x0288, B:93:0x0290, B:96:0x029e, B:43:0x00ef), top: B:112:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x020f A[LOOP:2: B:71:0x01ea->B:78:0x020f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(gz.b.a.C1792a r20, tq.e<? super dx.i<? extends dx.b, oq.i0>> r21) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nf0.h.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
