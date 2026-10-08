package k;

import ju.d2;
import ju.p0;
import ju.z0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006)"}, d2 = {"Lk/e0;", "", "Lju/p0;", "scope", "", "timeout", "", "startTimeoutOnCreation", "Lkotlin/Function0;", "Loq/i0;", "callback", "<init>", "(Lju/p0;JZLer/a;)V", "k", "()V", "Lk/d0;", "h", "()Lk/d0;", "i", "()Z", "j", "a", "Lju/p0;", "b", "J", "c", "Z", "d", "Ler/a;", "e", "Ljava/lang/Object;", "lock", "", "f", "I", "count", "Lju/d2;", "g", "Lju/d2;", "timeoutJob", "closed", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long timeout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean startTimeoutOnCreation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> callback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int count;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d2 timeoutJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lk/e0$a;", "Lk/d0;", "<init>", "(Lk/e0;)V", "", "b", "()Z", "Liu/a;", "a", "Liu/a;", "_released", "released", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final iu.a _released = iu.b.a(false);

        public a() {
        }

        @Override // k.d0
        public boolean a() {
            return this._released.b();
        }

        @Override // k.d0
        public boolean b() {
            if (!this._released.a(false, true)) {
                return false;
            }
            e0.this.j();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107046e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f107046e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.callback.a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e0.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107048e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f107048e;
            if (i15 == 0) {
                oq.u.b(obj);
                long j15 = e0.this.timeout;
                this.f107048e = 1;
                if (z0.b(j15, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            Object obj2 = e0.this.lock;
            e0 e0Var = e0.this;
            synchronized (obj2) {
                if (!e0Var.closed && e0Var.count == 0) {
                    e0Var.timeoutJob = null;
                    e0Var.closed = true;
                    i0 i0Var = i0.f148189a;
                    e0.this.callback.a();
                    return i0.f148189a;
                }
                return i0.f148189a;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e0.this.new c(eVar);
        }
    }

    public e0(p0 p0Var, long j15, boolean z15, er.a<i0> aVar) {
        this.scope = p0Var;
        this.timeout = j15;
        this.startTimeoutOnCreation = z15;
        this.callback = aVar;
        Object obj = new Object();
        this.lock = obj;
        if (z15) {
            synchronized (obj) {
                k();
                i0 i0Var = i0.f148189a;
            }
        }
    }

    private final void k() {
        this.timeoutJob = ju.k.d(this.scope, null, null, new c(null), 3, null);
    }

    public final d0 h() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return null;
                }
                int i15 = this.count + 1;
                this.count = i15;
                if (i15 == 1) {
                    d2 d2Var = this.timeoutJob;
                    if (d2Var != null) {
                        d2.a.a(d2Var, null, 1, null);
                    }
                    this.timeoutJob = null;
                }
                i0 i0Var = i0.f148189a;
                return new a();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean i() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return false;
                }
                this.closed = true;
                d2 d2Var = this.timeoutJob;
                if (d2Var != null) {
                    d2.a.a(d2Var, null, 1, null);
                }
                this.timeoutJob = null;
                i0 i0Var = i0.f148189a;
                ju.k.d(this.scope, null, null, new b(null), 3, null);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void j() {
        synchronized (this.lock) {
            try {
                int i15 = this.count - 1;
                this.count = i15;
                if (i15 == 0 && !this.closed) {
                    k();
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
