package u6;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122.\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001d\u001a\u00020\n2(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,¨\u0006."}, d2 = {"Lu6/y;", "T", "Lu6/r0;", "Ljava/io/File;", "file", "Lu6/l0;", "serializer", "Lu6/d0;", "coordinator", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Ljava/io/File;Lu6/l0;Lu6/d0;Ler/a;)V", "f", "()V", "g", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "Lu6/j0;", "", "Ltq/e;", "", "block", "d", "(Ler/q;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lu6/w0;", "b", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "close", "a", "Ljava/io/File;", "Lu6/l0;", "c", "Lu6/d0;", "()Lu6/d0;", "Ler/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Lsu/a;", "Lsu/a;", "transactionMutex", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y<T> implements r0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d0 coordinator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> onClose;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final su.a transactionMutex = su.g.b(false, 1, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<R> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f195763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f195765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y<T> f195766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195767h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y<T> yVar, tq.e<? super a> eVar) {
            super(eVar);
            this.f195766g = yVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195765f = obj;
            this.f195767h |= PKIFailureInfo.systemUnavail;
            return this.f195766g.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f195771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y<T> f195772h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f195773j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y<T> yVar, tq.e<? super b> eVar) {
            super(eVar);
            this.f195772h = yVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195771g = obj;
            this.f195773j |= PKIFailureInfo.systemUnavail;
            return this.f195772h.b(null, this);
        }
    }

    public y(File file, l0<T> l0Var, d0 d0Var, er.a<oq.i0> aVar) {
        this.file = file;
        this.serializer = l0Var;
        this.coordinator = d0Var;
        this.onClose = aVar;
    }

    private final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[Catch: all -> 0x00e0, IOException -> 0x00e3, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:34:0x00ab, B:36:0x00b1, B:39:0x00ba, B:40:0x00df, B:45:0x00e7, B:48:0x00ef, B:55:0x00fd, B:54:0x00fa), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[Catch: all -> 0x00e0, IOException -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:34:0x00ab, B:36:0x00b1, B:39:0x00ba, B:40:0x00df, B:45:0x00e7, B:48:0x00ef, B:55:0x00fd, B:54:0x00fa), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [su.a] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    @Override // u6.r0
    public Object b(er.p<? super w0<T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        ?? r15;
        ?? file;
        su.a aVar;
        a0 a0Var;
        Throwable th4;
        c cVar;
        ?? r16;
        ?? r17;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f195773j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f195773j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        Object obj = bVar.f195771g;
        Object objE = uq.b.e();
        int i16 = bVar.f195773j;
        try {
            try {
                try {
                    try {
                        try {
                            if (i16 == 0) {
                                oq.u.b(obj);
                                f();
                                g(this.file);
                                aVar = this.transactionMutex;
                                bVar.f195768d = pVar;
                                bVar.f195769e = aVar;
                                bVar.f195773j = 1;
                                if (aVar.h(null, bVar) != objE) {
                                }
                                r15 = aVar;
                                return objE;
                            }
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                cVar = (c) bVar.f195770f;
                                File file2 = (File) bVar.f195769e;
                                su.a aVar2 = (su.a) bVar.f195768d;
                                try {
                                    oq.u.b(obj);
                                    r16 = aVar2;
                                    r17 = file2;
                                    oq.i0 i0Var = oq.i0.f148189a;
                                    try {
                                        cVar.close();
                                        th = null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r17.exists() && !t.a(r17, this.file)) {
                                        throw new IOException("Unable to rename " + r17 + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                    oq.i0 i0Var2 = oq.i0.f148189a;
                                    r16.r(null);
                                    return oq.i0.f148189a;
                                } catch (Throwable th6) {
                                    th4 = th6;
                                    try {
                                        cVar.close();
                                    } catch (Throwable th7) {
                                        oq.c.a(th4, th7);
                                    }
                                    throw th4;
                                }
                            }
                            su.a aVar3 = (su.a) bVar.f195769e;
                            er.p<? super w0<T>, ? super tq.e<? super oq.i0>, ? extends Object> pVar2 = (er.p) bVar.f195768d;
                            oq.u.b(obj);
                            r15 = aVar3;
                            pVar = pVar2;
                            bVar.f195768d = r15;
                            bVar.f195769e = file;
                            bVar.f195770f = a0Var;
                            bVar.f195773j = 2;
                            if (pVar.B(a0Var, bVar) != objE) {
                                r16 = r15;
                                r17 = file;
                                cVar = a0Var;
                                oq.i0 i0Var3 = oq.i0.f148189a;
                                cVar.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r17.exists()) {
                                    throw new IOException("Unable to rename " + r17 + " to " + this.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                oq.i0 i0Var4 = oq.i0.f148189a;
                                r16.r(null);
                                return oq.i0.f148189a;
                            }
                            r15 = aVar;
                            return objE;
                        } catch (Throwable th8) {
                            th4 = th8;
                            cVar = a0Var;
                            cVar.close();
                            throw th4;
                        }
                        a0Var = new a0(file, this.serializer);
                    } catch (IOException e15) {
                        e = e15;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    r15 = aVar;
                    file = new File(this.file.getAbsolutePath() + ".tmp");
                } catch (Throwable th9) {
                    th = th9;
                    r15.r(null);
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                r15 = bVar;
                r15.r(null);
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            r15 = bVar;
            file = objE;
        }
    }

    @Override // u6.r0
    /* JADX INFO: renamed from: c, reason: from getter */
    public d0 getCoordinator() {
        return this.coordinator;
    }

    @Override // u6.c
    public void close() {
        this.closed.set(true);
        this.onClose.a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0075, blocks: (B:31:0x0074, B:40:0x0084, B:39:0x0081, B:36:0x007c), top: B:52:0x0022, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [er.q, er.q<? super u6.j0<T>, ? super java.lang.Boolean, ? super tq.e<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // u6.r0
    public <R> Object d(er.q<? super j0<T>, ? super Boolean, ? super tq.e<? super R>, ? extends Object> qVar, tq.e<? super R> eVar) throws Throwable {
        a aVar;
        Throwable th4;
        c cVar;
        ?? r15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f195767h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f195767h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        } else {
            aVar = new a(this, eVar);
        }
        Object obj = aVar.f195765f;
        Object objE = uq.b.e();
        int i16 = aVar.f195767h;
        try {
            if (i16 != 0) {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (er.q<? super j0<T>, ? super Boolean, ? super tq.e<? super R>, ? extends Object>) aVar.f195763d;
                cVar = (c) aVar.f195764e;
                try {
                    oq.u.b(obj);
                    r15 = qVar;
                    try {
                        cVar.close();
                        th = null;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r15 != 0) {
                        su.a.C4762a.c(this.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th6) {
                    th4 = th6;
                    try {
                        cVar.close();
                    } catch (Throwable th7) {
                        oq.c.a(th4, th7);
                    }
                    throw th4;
                }
            }
            oq.u.b(obj);
            f();
            boolean zB = su.a.C4762a.b(this.transactionMutex, null, 1, null);
            try {
                u uVar = new u(this.file, this.serializer);
                try {
                    Boolean boolA = vq.b.a(zB);
                    aVar.f195764e = uVar;
                    aVar.f195763d = zB;
                    aVar.f195767h = 1;
                    Object objW = qVar.w(uVar, boolA, aVar);
                    if (objW == objE) {
                        return objE;
                    }
                    obj = objW;
                    r15 = zB;
                    cVar = uVar;
                    cVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r15 != 0) {
                        su.a.C4762a.c(this.transactionMutex, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th8) {
                    th4 = th8;
                    qVar = zB;
                    cVar = uVar;
                    cVar.close();
                    throw th4;
                }
            } catch (Throwable th9) {
                th = th9;
                qVar = zB;
                if (qVar != 0) {
                    su.a.C4762a.c(this.transactionMutex, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            if (qVar != 0) {
                su.a.C4762a.c(this.transactionMutex, null, 1, null);
            }
            throw th;
        }
    }
}
