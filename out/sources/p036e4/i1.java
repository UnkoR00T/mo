package p036e4;

import er.l;
import er.p;
import f3.m;
import fr.t;
import fr.w;
import g4.g;
import g4.v0;
import ju.d2;
import ju.p0;
import ju.z0;
import o4.f;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR.\u0010R\u001a\u0004\u0018\u00010\u000e2\b\u0010N\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010H\u001a\u0004\bP\u0010J\"\u0004\bQ\u0010LR#\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010N\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Le4/i1;", "Lf3/m$c;", "Lg4/v0;", "", "minDurationMs", "", "minFractionVisible", "Le4/a0;", "viewportBounds", "Lkotlin/Function0;", "Loq/i0;", "callback", "<init>", "(JFLe4/a0;Ler/a;)V", "Lo4/f;", "bounds", "viewport", "o3", "(FLo4/f;Lo4/f;)V", "x3", "()V", "n3", "y3", "p3", "z3", "W2", "Y2", "X2", "T0", "r", "J", "getMinDurationMs", "()J", "u3", "(J)V", "s", "F", "r3", "()F", "v3", "(F)V", "t", "Ler/a;", "getCallback", "()Ler/a;", "s3", "(Ler/a;)V", "Lg4/g$a;", "v", "Lg4/g$a;", "getHandle", "()Lg4/g$a;", "setHandle", "(Lg4/g$a;)V", "handle", "Lju/d2;", "w", "Lju/d2;", "getJob", "()Lju/d2;", "setJob", "(Lju/d2;)V", "job", "", "x", "Z", "getLastResult", "()Z", "setLastResult", "(Z)V", "lastResult", "y", "Lo4/f;", "getLastBounds", "()Lo4/f;", "setLastBounds", "(Lo4/f;)V", "lastBounds", "value", "z", "q3", "t3", "lastViewport", "Lkotlin/Function1;", "A", "Ler/l;", "getRectChanged", "()Ler/l;", "rectChanged", "Le4/a0;", "getViewportBounds", "()Le4/a0;", "w3", "(Le4/a0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i1 extends m.c implements v0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final l<f, i0> rectChanged = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long minDurationMs;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float minFractionVisible;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> callback;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private g.a handle;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private d2 job;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean lastResult;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private f lastBounds;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private f lastViewport;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/f;", "bounds", "Loq/i0;", "c", "(Lo4/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<f, i0> {
        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(f fVar) {
            i1 i1Var = i1.this;
            i1Var.o3(i1Var.getMinFractionVisible(), fVar, i1.this.getLastViewport());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f47277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i1 f47278g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j15, i1 i1Var, e<? super b> eVar) {
            super(2, eVar);
            this.f47277f = j15;
            this.f47278g = i1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f47276e;
            if (i15 == 0) {
                u.b(obj);
                long j15 = this.f47277f;
                this.f47276e = 1;
                if (z0.b(j15, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            this.f47278g.y3();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f47277f, this.f47278g, eVar);
        }
    }

    public i1(long j15, float f15, a0 a0Var, er.a<i0> aVar) {
        this.minDurationMs = j15;
        this.minFractionVisible = f15;
        this.callback = aVar;
    }

    @Override // g4.v0
    public void T0() {
        z3();
    }

    @Override // f3.m.c
    public void W2() {
        g.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        z3();
        this.handle = n1.a(this, 0L, 0L, this.rectChanged);
    }

    @Override // f3.m.c
    public void X2() {
        g.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // f3.m.c
    public void Y2() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        t3(null);
    }

    public final void n3() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
    }

    public final void o3(float minFractionVisible, f bounds, f viewport) {
        this.lastBounds = bounds;
        float fA = viewport != null ? bounds.a(viewport) : bounds.c();
        boolean z15 = fA > minFractionVisible || fA == 1.0f;
        if (z15 && !this.lastResult) {
            x3();
        } else if (!z15 && this.lastResult) {
            n3();
        }
        this.lastResult = z15;
    }

    public final void p3() {
        f fVar = this.lastBounds;
        if (fVar != null) {
            o3(this.minFractionVisible, fVar, this.lastViewport);
        }
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final f getLastViewport() {
        return this.lastViewport;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final void s3(er.a<i0> aVar) {
        this.callback = aVar;
    }

    public final void t3(f fVar) {
        if (t.c(this.lastViewport, fVar)) {
            return;
        }
        this.lastViewport = fVar;
        p3();
    }

    public final void u3(long j15) {
        this.minDurationMs = j15;
    }

    public final void v3(float f15) {
        this.minFractionVisible = f15;
    }

    public final void w3(a0 a0Var) {
        z3();
    }

    public final void x3() {
        long j15 = this.minDurationMs;
        if (j15 == 0) {
            y3();
            return;
        }
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.job = ju.k.d(M2(), null, null, new b(j15, this, null), 3, null);
    }

    public final void y3() {
        g.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.callback.a();
    }

    public final void z3() {
        t3(null);
    }
}
