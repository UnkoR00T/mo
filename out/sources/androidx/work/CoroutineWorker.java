package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.q;
import er.p;
import fr.t;
import ju.g1;
import ju.h2;
import ju.l0;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u00020\u00168\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/q;", "Landroidx/work/c$a;", "i", "()Lcom/google/common/util/concurrent/q;", "k", "(Ltq/e;)Ljava/lang/Object;", "Lub/k;", "m", "d", "Loq/i0;", "g", "()V", "e", "Landroidx/work/WorkerParameters;", "Lju/l0;", "f", "Lju/l0;", "l", "()Lju/l0;", "getCoroutineContext$annotations", "coroutineContext", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends androidx.work.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters params;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l0 coroutineContext;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/CoroutineWorker$a;", "Lju/l0;", "<init>", "()V", "Ltq/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loq/i0;", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "", "P1", "(Ltq/i;)Z", "d", "Lju/l0;", "getDispatcher", "()Lju/l0;", "dispatcher", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a extends l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13758c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final l0 dispatcher = g1.a();

        private a() {
        }

        @Override // ju.l0
        public void F1(i context, Runnable block) {
            dispatcher.F1(context, block);
        }

        @Override // ju.l0
        public boolean P1(i context) {
            return dispatcher.P1(context);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lub/k;", "<anonymous>", "(Lju/p0;)Lub/k;"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super ub.k>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13760e;

        b(e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f13760e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f13760e = 1;
            Object objM = coroutineWorker.m(this);
            return objM == objE ? objE : objM;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super ub.k> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return CoroutineWorker.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Landroidx/work/c$a;", "<anonymous>", "(Lju/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, e<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13762e;

        c(e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f13762e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f13762e = 1;
            Object objK = coroutineWorker.k(this);
            return objK == objE ? objE : objK;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super androidx.work.c.a> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return CoroutineWorker.this.new c(eVar);
        }
    }

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.params = workerParameters;
        this.coroutineContext = a.f13758c;
    }

    static /* synthetic */ Object n(CoroutineWorker coroutineWorker, e<? super ub.k> eVar) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // androidx.work.c
    public final q<ub.k> d() {
        return ub.u.k(getCoroutineContext().n0(h2.b(null, 1, null)), null, new b(null), 2, null);
    }

    @Override // androidx.work.c
    public final void g() {
        super.g();
    }

    @Override // androidx.work.c
    public final q<androidx.work.c.a> i() {
        return ub.u.k((!t.c(getCoroutineContext(), a.f13758c) ? getCoroutineContext() : this.params.d()).n0(h2.b(null, 1, null)), null, new c(null), 2, null);
    }

    public abstract Object k(e<? super androidx.work.c.a> eVar);

    /* JADX INFO: renamed from: l, reason: from getter */
    public l0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object m(e<? super ub.k> eVar) {
        return n(this, eVar);
    }
}
