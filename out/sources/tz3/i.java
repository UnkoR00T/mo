package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltz3/i;", "Lmz3/g;", "Lmz3/v;", "removeDocumentDownloadStatusUseCase", "Ltz3/f0;", "hasAnyAsyncDownloadErrorUC", "Lmz3/p;", "getDocumentAsyncDownloadTaskDataUC", "Lmz3/u;", "removeAsyncDownloadTaskUC", "Ltz3/l;", "deleteDocumentAsyncDownloadErrorUC", "<init>", "(Lmz3/v;Ltz3/f0;Lmz3/p;Lmz3/u;Ltz3/l;)V", "Lmz3/g$a;", "params", "Loq/i0;", "d", "(Lmz3/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/v;", "b", "Ltz3/f0;", "c", "Lmz3/p;", "Lmz3/u;", "e", "Ltz3/l;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements mz3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.v removeDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f0 hasAnyAsyncDownloadErrorUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz3.p getDocumentAsyncDownloadTaskDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.u removeAsyncDownloadTaskUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l deleteDocumentAsyncDownloadErrorUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f193148g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193150j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193148g = obj;
            this.f193150j |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    public i(mz3.v vVar, f0 f0Var, mz3.p pVar, mz3.u uVar, l lVar) {
        this.removeDocumentDownloadStatusUseCase = vVar;
        this.hasAnyAsyncDownloadErrorUC = f0Var;
        this.getDocumentAsyncDownloadTaskDataUC = pVar;
        this.removeAsyncDownloadTaskUC = uVar;
        this.deleteDocumentAsyncDownloadErrorUC = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x012b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0153, code lost:
    
        if (r13.c(r5, r0) == r1) goto L44;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(mz3.g.Params r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.i.c(mz3.g$a, tq.e):java.lang.Object");
    }
}
