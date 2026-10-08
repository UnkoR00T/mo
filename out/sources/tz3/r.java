package tz3;

import fr0.DocumentTypeWithSubtype;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, d2 = {"Ltz3/r;", "Lmz3/j;", "Llr0/d;", "bEGenerateJuniorDocumentsAsyncUC", "Lkr0/b;", "bEGenerateDocumentsAsyncUC", "Lkr0/f;", "bEUpdateDocumentAsyncUC", "Lmz3/a;", "addSingleDocumentDownloadStatusUC", "Lmz3/x;", "startManageAsyncDownloadWorkerUseCase", "<init>", "(Llr0/d;Lkr0/b;Lkr0/f;Lmz3/a;Lmz3/x;)V", "Lrq0/b;", "Lfr0/j;", "e", "(Lrq0/b;)Lfr0/j;", "Lmz3/j$a;", "params", "Ldx/i;", "Ldx/b;", "Llz3/a;", "d", "(Lmz3/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Llr0/d;", "b", "Lkr0/b;", "c", "Lkr0/f;", "Lmz3/a;", "Lmz3/x;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements mz3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lr0.d bEGenerateJuniorDocumentsAsyncUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kr0.b bEGenerateDocumentsAsyncUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kr0.f bEUpdateDocumentAsyncUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.a addSingleDocumentDownloadStatusUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mz3.x startManageAsyncDownloadWorkerUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193245g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f193246h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f193247j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f193248k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f193249l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f193250m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f193251n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f193252p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f193253q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f193254r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f193255s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f193257v;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193255s = obj;
            this.f193257v |= PKIFailureInfo.systemUnavail;
            return r.this.c(null, this);
        }
    }

    public r(lr0.d dVar, kr0.b bVar, kr0.f fVar, mz3.a aVar, mz3.x xVar) {
        this.bEGenerateJuniorDocumentsAsyncUC = dVar;
        this.bEGenerateDocumentsAsyncUC = bVar;
        this.bEUpdateDocumentAsyncUC = fVar;
        this.addSingleDocumentDownloadStatusUC = aVar;
        this.startManageAsyncDownloadWorkerUseCase = xVar;
    }

    private final DocumentTypeWithSubtype e(rq0.b bVar) {
        return new DocumentTypeWithSubtype(bVar, bVar instanceof rq0.b.e ? String.valueOf(((rq0.b.e) bVar).getLicenceCode()) : null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x015f  */
    /* JADX WARN: Code duplicated, block: B:54:0x016c  */
    /* JADX WARN: Code duplicated, block: B:57:0x01be  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0200  */
    /* JADX WARN: Code duplicated, block: B:69:0x020e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x022c A[EDGE_INSN: B:83:0x022c->B:73:0x022c BREAK  A[LOOP:0: B:62:0x01ec->B:84:0x01ec], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01be -> B:58:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01c8 -> B:60:0x01d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(mz3.j.a r29, tq.e<? super dx.i<? extends dx.b, lz3.AsyncDocumentGenerationResponse>> r30) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.r.c(mz3.j$a, tq.e):java.lang.Object");
    }
}
