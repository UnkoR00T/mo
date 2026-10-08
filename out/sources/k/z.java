package k;

import android.os.Handler;
import java.util.concurrent.Executor;
import ju.g3;
import ju.l0;
import ju.p0;
import ju.w0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b.\u0010+R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b/\u0010'R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0005028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00104R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b3\u00107R\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u0010'¨\u00068"}, d2 = {"Lk/z;", "", "Lju/p0;", "cameraPipeScope", "cameraPipeDispatchScope", "Ljava/util/concurrent/Executor;", "blockingExecutor", "Lju/l0;", "blockingDispatcher", "backgroundExecutor", "backgroundDispatcher", "lightweightExecutor", "lightweightDispatcher", "Lkotlin/Function0;", "Landroid/os/Handler;", "camera2Handler", "camera2Executor", "<init>", "(Lju/p0;Lju/p0;Ljava/util/concurrent/Executor;Lju/l0;Ljava/util/concurrent/Executor;Lju/l0;Ljava/util/concurrent/Executor;Lju/l0;Ler/a;Ler/a;)V", "T", "dispatcher", "Lkotlin/Function1;", "Ltq/e;", "block", "Lju/w0;", "m", "(Lju/l0;Ler/l;)Lju/w0;", "", "timeoutMs", "n", "(JLer/l;)Ljava/lang/Object;", "a", "Lju/p0;", "j", "()Lju/p0;", "b", "c", "Ljava/util/concurrent/Executor;", "getBlockingExecutor", "()Ljava/util/concurrent/Executor;", "d", "Lju/l0;", "g", "()Lju/l0;", "e", "getBackgroundExecutor", "f", "l", "h", "k", "Loq/k;", "i", "Loq/k;", "_camera2Handler", "_camera2Executor", "()Landroid/os/Handler;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 cameraPipeScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 cameraPipeDispatchScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor blockingExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l0 blockingDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Executor backgroundExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l0 backgroundDispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Executor lightweightExecutor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l0 lightweightDispatcher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Handler> _camera2Handler;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k<Executor> _camera2Executor;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class a<T> extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super T>, Object> f107123f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super tq.e<? super T>, ? extends Object> lVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f107123f = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f107122e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            er.l<tq.e<? super T>, Object> lVar = this.f107123f;
            this.f107122e = 1;
            Object objB = lVar.b(this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super T> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f107123f, eVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class b<T> extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107124e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super T>, Object> f107126g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f107127h;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super T>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f107128e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w0<T> f107129f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(w0<? extends T> w0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f107129f = w0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f107128e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                w0<T> w0Var = this.f107129f;
                this.f107128e = 1;
                Object objI = w0Var.I(this);
                return objI == objE ? objE : objI;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super T> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f107129f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.l<? super tq.e<? super T>, ? extends Object> lVar, long j15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f107126g = lVar;
            this.f107127h = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f107124e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            w0 w0VarM = zVar.m(zVar.getBackgroundDispatcher(), this.f107126g);
            long j15 = this.f107127h;
            a aVar = new a(w0VarM, null);
            this.f107124e = 1;
            Object objE2 = g3.e(j15, aVar, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super T> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new b(this.f107126g, this.f107127h, eVar);
        }
    }

    public z(p0 p0Var, p0 p0Var2, Executor executor, l0 l0Var, Executor executor2, l0 l0Var2, Executor executor3, l0 l0Var3, final er.a<? extends Handler> aVar, final er.a<? extends Executor> aVar2) {
        this.cameraPipeScope = p0Var;
        this.cameraPipeDispatchScope = p0Var2;
        this.blockingExecutor = executor;
        this.blockingDispatcher = l0Var;
        this.backgroundExecutor = executor2;
        this.backgroundDispatcher = l0Var2;
        this.lightweightExecutor = executor3;
        this.lightweightDispatcher = l0Var3;
        this._camera2Handler = oq.l.a(new er.a() { // from class: k.x
            @Override // er.a
            public final Object a() {
                return z.d(aVar);
            }
        });
        this._camera2Executor = oq.l.a(new er.a() { // from class: k.y
            @Override // er.a
            public final Object a() {
                return z.c(aVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor c(er.a aVar) {
        return (Executor) aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler d(er.a aVar) {
        return (Handler) aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> w0<T> m(l0 dispatcher, er.l<? super tq.e<? super T>, ? extends Object> block) {
        return ju.k.b(this.cameraPipeDispatchScope, dispatcher, null, new a(block, null), 2, null);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l0 getBackgroundDispatcher() {
        return this.backgroundDispatcher;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final l0 getBlockingDispatcher() {
        return this.blockingDispatcher;
    }

    public final Executor h() {
        return this._camera2Executor.getValue();
    }

    public final Handler i() {
        return this._camera2Handler.getValue();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final p0 getCameraPipeScope() {
        return this.cameraPipeScope;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final l0 getLightweightDispatcher() {
        return this.lightweightDispatcher;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Executor getLightweightExecutor() {
        return this.lightweightExecutor;
    }

    public final <T> T n(long timeoutMs, er.l<? super tq.e<? super T>, ? extends Object> block) {
        try {
            return (T) ju.i.e(this.blockingDispatcher, new b(block, timeoutMs, null));
        } catch (InterruptedException unused) {
            k.f107055a.c();
            return null;
        }
    }
}
