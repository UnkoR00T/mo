package p036e4;

import er.l;
import er.p;
import f3.m;
import fr.w;
import g4.g;
import g4.t1;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR$\u0010R\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR#\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\bW\u0010,\u001a\u0004\bX\u0010.R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010Z\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006`"}, d2 = {"Le4/v1;", "Lf3/m$c;", "Lg4/v0;", "Lg4/t1;", "", "minDurationMs", "", "minFractionVisible", "Le4/a0;", "viewportBounds", "Lkotlin/Function1;", "", "Loq/i0;", "callback", "<init>", "(JFLe4/a0;Ler/l;)V", "Lo4/f;", "bounds", "viewport", "n3", "(FLo4/f;Lo4/f;)V", "z3", "()V", "p3", "o3", "Y2", "A3", "W2", "X2", "T0", "I2", "r", "J", "r3", "()J", "w3", "(J)V", "s", "F", "s3", "()F", "x3", "(F)V", "t", "Ler/l;", "getCallback", "()Ler/l;", "u3", "(Ler/l;)V", "Lg4/g$a;", "v", "Lg4/g$a;", "getHandle", "()Lg4/g$a;", "setHandle", "(Lg4/g$a;)V", "handle", "Lju/d2;", "w", "Lju/d2;", "getJob", "()Lju/d2;", "setJob", "(Lju/d2;)V", "job", "x", "Z", "getLastResult", "()Z", "setLastResult", "(Z)V", "lastResult", "y", "getLastReportedResult", "setLastReportedResult", "lastReportedResult", "z", "Lo4/f;", "getLastBounds", "()Lo4/f;", "setLastBounds", "(Lo4/f;)V", "lastBounds", "A", "q3", "v3", "lastViewport", "B", "getRectChanged", "rectChanged", "value", "Le4/a0;", "t3", "()Le4/a0;", "y3", "(Le4/a0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1 extends m.c implements v0, t1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private f lastViewport;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final l<f, i0> rectChanged = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long minDurationMs;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float minFractionVisible;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private l<? super Boolean, i0> callback;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private g.a handle;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private d2 job;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean lastResult;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean lastReportedResult;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private f lastBounds;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47460e;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f47460e;
            if (i15 == 0) {
                u.b(obj);
                long minDurationMs = v1.this.getMinDurationMs();
                this.f47460e = 1;
                if (z0.b(minDurationMs, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            v1.this.z3();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return v1.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/f;", "bounds", "Loq/i0;", "c", "(Lo4/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements l<f, i0> {
        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(f fVar) {
            v1 v1Var = v1.this;
            v1Var.t3();
            v1Var.v3(null);
            v1 v1Var2 = v1.this;
            v1Var2.n3(v1Var2.getMinFractionVisible(), fVar, v1.this.getLastViewport());
        }
    }

    public v1(long j15, float f15, a0 a0Var, l<? super Boolean, i0> lVar) {
        this.minDurationMs = j15;
        this.minFractionVisible = f15;
        this.callback = lVar;
    }

    public final void A3() {
        if (this.lastViewport != null) {
            this.lastViewport = null;
            p3();
        }
    }

    @Override // g4.t1
    public void I2() {
        o3();
    }

    @Override // g4.v0
    public void T0() {
        A3();
    }

    @Override // f3.m.c
    public void W2() {
        g.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        this.handle = n1.a(this, 0L, 0L, this.rectChanged);
        A3();
    }

    @Override // f3.m.c
    public void X2() {
        g.a aVar = this.handle;
        if (aVar != null) {
            aVar.a();
        }
        o3();
    }

    @Override // f3.m.c
    public void Y2() {
        o3();
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        this.lastViewport = null;
    }

    public final void n3(float minFractionVisible, f bounds, f viewport) {
        this.lastBounds = bounds;
        float fA = viewport != null ? bounds.a(viewport) : bounds.c();
        boolean z15 = fA > minFractionVisible || fA == 1.0f;
        if (z15 != this.lastResult) {
            this.lastResult = z15;
            d2 d2Var = this.job;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.job = null;
            if (z15 != this.lastReportedResult) {
                if (!z15 || this.minDurationMs <= 0) {
                    z3();
                } else {
                    this.job = ju.k.d(M2(), null, null, new a(null), 3, null);
                }
            }
        }
    }

    public final void o3() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.job = null;
        this.lastResult = false;
        if (this.lastReportedResult) {
            z3();
        }
    }

    public final void p3() {
        f fVar = this.lastBounds;
        if (fVar != null) {
            n3(this.minFractionVisible, fVar, this.lastViewport);
        }
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final f getLastViewport() {
        return this.lastViewport;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    /* JADX INFO: renamed from: s3, reason: from getter */
    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final a0 t3() {
        return null;
    }

    public final void u3(l<? super Boolean, i0> lVar) {
        this.callback = lVar;
    }

    public final void v3(f fVar) {
        this.lastViewport = fVar;
    }

    public final void w3(long j15) {
        this.minDurationMs = j15;
    }

    public final void x3(float f15) {
        this.minFractionVisible = f15;
    }

    public final void y3(a0 a0Var) {
        A3();
    }

    public final void z3() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.job = null;
        this.callback.b(Boolean.valueOf(this.lastResult));
        this.lastReportedResult = this.lastResult;
    }
}
