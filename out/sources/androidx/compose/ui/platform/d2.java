package androidx.compose.ui.platform;

import android.content.Context;
import p071kotlin.Metadata;
import p076m2.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/d2;", "Lf3/o;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lju/d2;", "e", "()Lju/d2;", "a", "Landroid/content/Context;", "Lju/p0;", "b", "Lju/p0;", "getCoroutineScope", "()Lju/p0;", "c", "(Lju/p0;)V", "coroutineScope", "", "<set-?>", "Lm2/x2;", "()F", "d", "(F)V", "_scaleFactor", "Lju/d2;", "getJob", "setJob", "(Lju/d2;)V", "job", "Z", "scaleFactor", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d2 implements f3.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ju.p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p076m2.x2 _scaleFactor = x3.a(1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ju.d2 job;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ mu.p0<Float> f10446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d2 f10447g;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.d2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "Loq/i0;", "a", "(FLtq/e;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        static final class C0225a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d2 f10448a;

            C0225a(d2 d2Var) {
                this.f10448a = d2Var;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((Number) obj).floatValue(), eVar);
            }

            public final Object a(float f15, tq.e<? super oq.i0> eVar) {
                this.f10448a.d(f15);
                return oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(mu.p0<Float> p0Var, d2 d2Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f10446f = p0Var;
            this.f10447g = d2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f10445e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.p0<Float> p0Var = this.f10446f;
                C0225a c0225a = new C0225a(this.f10447g);
                this.f10445e = 1;
                if (p0Var.a(c0225a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f10446f, this.f10447g, eVar);
        }
    }

    public d2(Context context) {
        this.applicationContext = context;
    }

    private final float b() {
        return this._scaleFactor.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(float f15) {
        this._scaleFactor.p(f15);
    }

    private final ju.d2 e() {
        mu.p0 p0VarF = s3.f(this.applicationContext);
        d(((Number) p0VarF.getValue()).floatValue());
        ju.p0 p0Var = this.coroutineScope;
        if (p0Var != null) {
            return ju.k.d(p0Var, null, null, new a(p0VarF, this, null), 3, null);
        }
        throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
    }

    @Override // tq.i
    public /* bridge */ tq.i D1(tq.i.c<?> cVar) {
        return f3.o.a.c(this, cVar);
    }

    @Override // f3.o
    public float Z() {
        if (this.job == null) {
            this.job = e();
        }
        return b();
    }

    public final void c(ju.p0 p0Var) {
        this.coroutineScope = p0Var;
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends tq.i.b> E m(tq.i.c<E> cVar) {
        return (E) f3.o.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ tq.i n0(tq.i iVar) {
        return f3.o.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
        return (R) f3.o.a.a(this, r15, pVar);
    }
}
