package zc;

import android.view.View;
import ed.g0;
import ju.d2;
import ju.g1;
import ju.p0;
import ju.w0;
import ju.w1;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lzc/u;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lju/w0;", "Lzc/i;", "job", "Lzc/s;", "b", "(Lju/w0;)Lzc/s;", "Loq/i0;", "a", "()V", "Lzc/t;", "request", "c", "(Lzc/t;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "Lzc/s;", "currentDisposable", "Lju/d2;", "Lju/d2;", "pendingClear", "d", "Lzc/t;", "currentRequest", "", "e", "Z", "isRestart", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private s currentDisposable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d2 pendingClear;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t currentRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isRestart;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234211e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f234211e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.c(null);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new a(eVar);
        }
    }

    public u(View view) {
        this.view = view;
    }

    public final synchronized void a() {
        try {
            d2 d2Var = this.pendingClear;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.pendingClear = ju.k.d(w1.f105795a, g1.c().d2(), null, new a(null), 2, null);
            this.currentDisposable = null;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized s b(w0<? extends i> job) {
        s sVar = this.currentDisposable;
        if (sVar != null && g0.i() && this.isRestart) {
            this.isRestart = false;
            sVar.b(job);
            return sVar;
        }
        d2 d2Var = this.pendingClear;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.pendingClear = null;
        s sVar2 = new s(this.view, job);
        this.currentDisposable = sVar2;
        return sVar2;
    }

    public final void c(t request) {
        t tVar = this.currentRequest;
        if (tVar != null) {
            tVar.d();
        }
        this.currentRequest = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v15) {
        t tVar = this.currentRequest;
        if (tVar == null) {
            return;
        }
        this.isRestart = true;
        tVar.e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v15) {
        t tVar = this.currentRequest;
        if (tVar != null) {
            tVar.d();
        }
    }
}
