package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltz3/d;", "Lmz3/d;", "Lmz3/m;", "getAllDownloadTaskDataUC", "Ltz3/h0;", "interruptDocumentsAsyncUseCase", "Luz3/a;", "asyncDownloadDocumentsManager", "<init>", "(Lmz3/m;Ltz3/h0;Luz3/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmz3/m;", "b", "Ltz3/h0;", "c", "Luz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements mz3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.m getAllDownloadTaskDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0 interruptDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uz3.a asyncDownloadDocumentsManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f193015h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193016j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f193017k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f193018l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f193020n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193018l = obj;
            this.f193020n |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(mz3.m mVar, h0 h0Var, uz3.a aVar) {
        this.getAllDownloadTaskDataUC = mVar;
        this.interruptDocumentsAsyncUseCase = h0Var;
        this.asyncDownloadDocumentsManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        if (r8.c(r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c8 -> B:31:0x00cb). Please report as a decompilation issue!!! */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.d.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
