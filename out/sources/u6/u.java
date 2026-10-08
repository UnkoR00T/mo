package u6;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lu6/u;", "T", "Lu6/j0;", "Ljava/io/File;", "file", "Lu6/l0;", "serializer", "<init>", "(Ljava/io/File;Lu6/l0;)V", "a", "(Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "close", "()V", "f", "Ljava/io/File;", "g", "()Ljava/io/File;", "b", "Lu6/l0;", "h", "()Lu6/l0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class u<T> implements j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0<T> serializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closed = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends vq.k implements er.l<tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u<T> f195743g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u<T> uVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f195743g = uVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            if (r7 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f195742f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r6.f195741e
                java.io.Closeable r0 = (java.io.Closeable) r0
                oq.u.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L88
            L18:
                r7 = move-exception
                goto L92
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.f195741e
                java.io.Closeable r1 = (java.io.Closeable) r1
                oq.u.b(r7)     // Catch: java.lang.Throwable -> L2b
                goto L50
            L2b:
                r7 = move-exception
                goto L54
            L2d:
                oq.u.b(r7)
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L5a
                u6.u<T> r1 = r6.f195743g     // Catch: java.io.FileNotFoundException -> L5a
                java.io.File r1 = r1.getFile()     // Catch: java.io.FileNotFoundException -> L5a
                r7.<init>(r1)     // Catch: java.io.FileNotFoundException -> L5a
                java.io.FileInputStream r1 = io.sentry.instrumentation.file.h.b.a(r7, r1)     // Catch: java.io.FileNotFoundException -> L5a
                u6.u<T> r7 = r6.f195743g     // Catch: java.io.FileNotFoundException -> L5a
                u6.l0 r7 = r7.h()     // Catch: java.lang.Throwable -> L2b
                r6.f195741e = r1     // Catch: java.lang.Throwable -> L2b
                r6.f195742f = r3     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r7 = r7.c(r1, r6)     // Catch: java.lang.Throwable -> L2b
                if (r7 != r0) goto L50
                goto L85
            L50:
                ar.b.a(r1, r4)     // Catch: java.io.FileNotFoundException -> L5a
                return r7
            L54:
                throw r7     // Catch: java.lang.Throwable -> L55
            L55:
                r3 = move-exception
                ar.b.a(r1, r7)     // Catch: java.io.FileNotFoundException -> L5a
                throw r3     // Catch: java.io.FileNotFoundException -> L5a
            L5a:
                u6.u<T> r7 = r6.f195743g
                java.io.File r7 = r7.getFile()
                boolean r7 = r7.exists()
                if (r7 == 0) goto Lab
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L8c
                u6.u<T> r1 = r6.f195743g     // Catch: java.lang.Exception -> L8c
                java.io.File r1 = r1.getFile()     // Catch: java.lang.Exception -> L8c
                r7.<init>(r1)     // Catch: java.lang.Exception -> L8c
                java.io.FileInputStream r7 = io.sentry.instrumentation.file.h.b.a(r7, r1)     // Catch: java.lang.Exception -> L8c
                u6.u<T> r1 = r6.f195743g     // Catch: java.lang.Exception -> L8c
                u6.l0 r1 = r1.h()     // Catch: java.lang.Throwable -> L8e
                r6.f195741e = r7     // Catch: java.lang.Throwable -> L8e
                r6.f195742f = r2     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r1 = r1.c(r7, r6)     // Catch: java.lang.Throwable -> L8e
                if (r1 != r0) goto L86
            L85:
                return r0
            L86:
                r0 = r7
                r7 = r1
            L88:
                ar.b.a(r0, r4)     // Catch: java.lang.Exception -> L8c
                goto Lb5
            L8c:
                r7 = move-exception
                goto L98
            L8e:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L92:
                throw r7     // Catch: java.lang.Throwable -> L93
            L93:
                r1 = move-exception
                ar.b.a(r0, r7)     // Catch: java.lang.Exception -> L8c
                throw r1     // Catch: java.lang.Exception -> L8c
            L98:
                boolean r0 = r7 instanceof java.io.FileNotFoundException
                if (r0 == 0) goto Laa
                u6.u<T> r0 = r6.f195743g
                java.io.File r0 = r0.getFile()
                java.lang.String r0 = r0.getParent()
                java.lang.Exception r7 = u6.q.c(r0, r7)
            Laa:
                throw r7
            Lab:
                u6.u<T> r7 = r6.f195743g
                u6.l0 r7 = r7.h()
                java.lang.Object r7 = r7.b()
            Lb5:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.u.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new a(this.f195743g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super T> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public u(File file, l0<T> l0Var) {
        this.file = file;
        this.serializer = l0Var;
    }

    static /* synthetic */ <T> Object i(u<T> uVar, tq.e<? super T> eVar) {
        uVar.f();
        return z.b(((u) uVar).file, new a(uVar, null), eVar);
    }

    @Override // u6.j0
    public Object a(tq.e<? super T> eVar) {
        return i(this, eVar);
    }

    @Override // u6.c
    public void close() {
        this.closed.set(true);
    }

    protected final void f() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final File getFile() {
        return this.file;
    }

    protected final l0<T> h() {
        return this.serializer;
    }
}
