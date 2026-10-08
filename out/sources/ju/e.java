package ju;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000f\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lju/e;", "T", "", "", "Lju/w0;", "deferreds", "<init>", "([Lju/w0;)V", "", "c", "(Ltq/e;)Ljava/lang/Object;", "a", "[Lju/w0;", "Liu/c;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105675b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w0<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\"8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lju/e$a;", "Lju/i2;", "Lju/n;", "", "continuation", "<init>", "(Lju/e;Lju/n;)V", "", "cause", "Loq/i0;", "x", "(Ljava/lang/Throwable;)V", "e", "Lju/n;", "Lju/i1;", "f", "Lju/i1;", "A", "()Lju/i1;", ip.a.f96138c, "(Lju/i1;)V", "handle", "Lju/e$b;", "Lju/e;", "value", "z", "()Lju/e$b;", "C", "(Lju/e$b;)V", "disposer", "", "w", "()Z", "onCancelling", "Liu/e;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a extends i2 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f105677h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final n<List<? extends T>> continuation;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public i1 handle;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super List<? extends T>> nVar) {
            this.continuation = nVar;
        }

        public final i1 A() {
            i1 i1Var = this.handle;
            if (i1Var != null) {
                return i1Var;
            }
            return null;
        }

        public final void C(e<T>.b bVar) {
            f105677h.set(this, bVar);
        }

        public final void D(i1 i1Var) {
            this.handle = i1Var;
        }

        @Override // ju.i2
        public boolean w() {
            return false;
        }

        @Override // ju.i2
        public void x(Throwable cause) {
            if (cause != null) {
                Object objG = this.continuation.G(cause);
                if (objG != null) {
                    this.continuation.W(objG);
                    e<T>.b bVarZ = z();
                    if (bVarZ != null) {
                        bVarZ.a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.d().decrementAndGet(e.this) == 0) {
                n<List<? extends T>> nVar = this.continuation;
                w0[] w0VarArr = ((e) e.this).deferreds;
                ArrayList arrayList = new ArrayList(w0VarArr.length);
                for (w0 w0Var : w0VarArr) {
                    arrayList.add(w0Var.C());
                }
                nVar.i(oq.t.b(arrayList));
            }
        }

        public final e<T>.b z() {
            return (b) f105677h.get(this);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lju/e$b;", "Lju/m;", "", "Lju/e$a;", "Lju/e;", "nodes", "<init>", "(Lju/e;[Lju/e$a;)V", "Loq/i0;", "a", "()V", "", "cause", "e", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[Lju/e$a;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final e<T>.a[] nodes;

        public b(e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        public final void a() {
            for (e<T>.a aVar : this.nodes) {
                aVar.A().j();
            }
        }

        @Override // ju.m
        public void e(Throwable cause) {
            a();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(w0<? extends T>[] w0VarArr) {
        this.deferreds = w0VarArr;
        this.notCompletedCount$volatile = w0VarArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f105675b;
    }

    public final Object c(tq.e<? super List<? extends T>> eVar) {
        p pVar = new p(uq.b.c(eVar), 1);
        pVar.D();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i15 = 0; i15 < length; i15++) {
            w0 w0Var = this.deferreds[i15];
            w0Var.start();
            a aVar = new a(pVar);
            aVar.D(h2.m(w0Var, false, aVar, 1, null));
            oq.i0 i0Var = oq.i0.f148189a;
            aVarArr[i15] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i16 = 0; i16 < length; i16++) {
            aVarArr[i16].C(bVar);
        }
        if (pVar.r()) {
            bVar.a();
        } else {
            r.c(pVar, bVar);
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }
}
