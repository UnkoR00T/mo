package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0016\u0010\u0012J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ltz3/q;", "Ltz3/p;", "Lmz3/a0;", "updateDocumentDownloadStatusUseCase", "Lpx/d;", "remoteLogger", "Lqz3/b;", "asyncDownloadInteractor", "<init>", "(Lmz3/a0;Lpx/d;Lqz3/b;)V", "Lrq0/b;", "documentType", "Llz3/d;", "methodType", "", "documentIID", "Loq/i0;", "g", "(Lrq0/b;Llz3/d;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "k", "j", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "h", "Ltz3/p$a;", "params", "i", "(Ltz3/p$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/a0;", "b", "Lpx/d;", "c", "Lqz3/b;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.a0 updateDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qz3.b asyncDownloadInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193202a;

        static {
            int[] iArr = new int[lz3.d.values().length];
            try {
                iArr[lz3.d.DOCUMENT_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz3.d.FIRST_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f193202a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f193206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f193207h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f193209k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193207h = obj;
            this.f193209k |= PKIFailureInfo.systemUnavail;
            return q.this.g(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f193213g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193215j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193213g = obj;
            this.f193215j |= PKIFailureInfo.systemUnavail;
            return q.this.h(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f193220h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193221j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f193222k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f193224m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193222k = obj;
            this.f193224m |= PKIFailureInfo.systemUnavail;
            return q.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f193228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f193229h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f193231k;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193229h = obj;
            this.f193231k |= PKIFailureInfo.systemUnavail;
            return q.this.k(null, null, null, this);
        }
    }

    public q(mz3.a0 a0Var, px.d dVar, qz3.b bVar) {
        this.updateDocumentDownloadStatusUseCase = a0Var;
        this.remoteLogger = dVar;
        this.asyncDownloadInteractor = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        if (k(r7, r8, r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (j(r7, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(rq0.b r7, lz3.d r8, java.lang.String r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.q.g(rq0.b, lz3.d, java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(rq0.b bVar, lz3.d dVar, String str, tq.e<? super String> eVar) throws Throwable {
        c cVar;
        Object objB;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f193215j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f193215j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objE = cVar.f193213g;
        Object objE2 = uq.b.e();
        int i16 = cVar.f193215j;
        if (i16 == 0) {
            oq.u.b(objE);
            qz3.b bVar2 = this.asyncDownloadInteractor;
            cVar.f193210d = bVar;
            cVar.f193211e = dVar;
            cVar.f193212f = str;
            cVar.f193215j = 1;
            objE = bVar2.e(bVar, cVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f193212f;
            dVar = (lz3.d) cVar.f193211e;
            bVar = (rq0.b) cVar.f193210d;
            oq.u.b(objE);
        }
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            objB = vq.b.a(false);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVar).b();
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        if (zBooleanValue) {
            return bVar.getReferenceName() + dVar.name() + str;
        }
        if (zBooleanValue) {
            throw new oq.p();
        }
        return bVar.getReferenceName() + dVar.name();
    }

    private final Object j(rq0.b bVar, tq.e<? super oq.i0> eVar) {
        px.b.y5(this.remoteLogger, "FinishMultiDocumentDownloadUC error, onSavedFailure " + bVar, null, px.c.a(this), 2, null);
        Object objC = this.updateDocumentDownloadStatusUseCase.c(new mz3.a0.Params(bVar, lz3.h.CREATING_ERROR, null), eVar);
        return objC == uq.b.e() ? objC : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0114, code lost:
    
        if (r13.f(r12, r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(rq0.b r10, lz3.d r11, java.lang.String r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.q.k(rq0.b, lz3.d, java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    /* JADX WARN: Code duplicated, block: B:46:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (j(r2, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        if (j(r4, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013b, code lost:
    
        if (g(r5, r7, r8, r0) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0178, code lost:
    
        if (g(r2, r4, r5, r0) == r1) goto L59;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(tz3.p.Params r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.q.c(tz3.p$a, tq.e):java.lang.Object");
    }
}
