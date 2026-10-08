package p056h1;

import c3.l;
import c5.d;
import ju.d2;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import u0.AnimationState;
import u0.e2;
import u0.m;
import u0.o;
import u0.p;
import u0.q1;
import u0.s3;
import u0.y2;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lh1/n1;", "", "<init>", "()V", "", "delta", "Lc5/d;", "density", "Lju/p0;", "coroutineScope", "Loq/i0;", "e", "(FLc5/d;Lju/p0;)V", "d", "Lju/d2;", "a", "Lju/d2;", "getJob$foundation", "()Lju/d2;", "setJob$foundation", "(Lju/d2;)V", "job", "Lu0/n;", "Lu0/p;", "b", "Lu0/n;", "_scrollDeltaBetweenPasses", "()F", "scrollDeltaBetweenPasses", "", "c", "()Z", "isActive", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d2 job;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AnimationState<Float, p> _scrollDeltaBetweenPasses;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79495e;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f79495e;
            if (i15 == 0) {
                u.b(obj);
                AnimationState animationState = n1.this._scrollDeltaBetweenPasses;
                Float fD = vq.b.d(0.0f);
                q1 q1VarJ = m.j(0.0f, 400.0f, vq.b.d(0.5f), 1, null);
                this.f79495e = 1;
                if (e2.y(animationState, fD, q1VarJ, true, null, this, 8, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return n1.this.new a(eVar);
        }
    }

    public n1() {
        y2<Float, p> y2VarP = s3.P(fr.m.f66405a);
        Float fValueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = o.d(y2VarP, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    public final float b() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final boolean c() {
        return !(this._scrollDeltaBetweenPasses.getValue().floatValue() == 0.0f);
    }

    public final void d() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this._scrollDeltaBetweenPasses = new AnimationState<>(s3.P(fr.m.f66405a), Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
    }

    public final void e(float delta, d density, p0 coroutineScope) {
        if (delta <= density.l2(o1.f79497a)) {
            return;
        }
        l.Companion companion = l.INSTANCE;
        l lVarD = companion.d();
        er.l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
        l lVarE = companion.e(lVarD);
        try {
            float fFloatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            d2 d2Var = this.job;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            if (this._scrollDeltaBetweenPasses.getIsRunning()) {
                this._scrollDeltaBetweenPasses = o.g(this._scrollDeltaBetweenPasses, fFloatValue - delta, 0.0f, 0L, 0L, false, 30, null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(s3.P(fr.m.f66405a), Float.valueOf(-delta), null, 0L, 0L, false, 60, null);
            }
            this.job = ju.k.d(coroutineScope, null, null, new a(null), 3, null);
            i0 i0Var = i0.f148189a;
        } finally {
            companion.l(lVarD, lVarE, lVarG);
        }
    }
}
