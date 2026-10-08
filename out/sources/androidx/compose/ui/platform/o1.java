package androidx.compose.ui.platform;

import android.os.Build;
import m3.MutableRect;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010$J!\u0010*\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\u0012J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\u0012J\u001f\u00101\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b5\u00106J9\u00107\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b<\u0010;R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010@R,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010AR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010BR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010CR\u0016\u0010E\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010DR\u0014\u0010G\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010FR$\u0010L\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u001f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b,\u0010D\"\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001a\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010UR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010WR\u0016\u0010[\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010CR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0016\u0010a\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010DR\u0016\u0010c\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010DR\"\u0010i\u001a\u00020d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bQ\u0010g\"\u0004\bZ\u0010hR\"\u0010k\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010D\u001a\u0004\bk\u0010l\"\u0004\b]\u0010KR\u0016\u0010n\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010DR \u0010s\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\u000b0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u0016¨\u0006v"}, d2 = {"Landroidx/compose/ui/platform/o1;", "Lg4/a1;", "", "Lq3/c;", "graphicsLayer", "Ln3/x1;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Ln3/h1;", "Loq/i0;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Lq3/c;Ln3/x1;Landroidx/compose/ui/platform/AndroidComposeView;Ler/p;Ler/a;)V", "s", "()V", "u", "Ln3/g2;", "o", "()[F", "n", "t", "Ln3/v2;", "scope", "f", "(Ln3/v2;)V", "Lm3/e;", "position", "", "g", "(J)Z", "Lc5/n;", "j", "(J)V", "Lc5/r;", "size", "e", "canvas", "parentLayer", "l", "(Ln3/h1;Lq3/c;)V", "k", "invalidate", "destroy", "point", "inverse", "d", "(JZ)J", "Lm3/c;", "rect", "c", "(Lm3/c;Z)V", "h", "(Ler/p;Ler/a;)V", "matrix", "b", "([F)V", "i", "a", "Lq3/c;", "Ln3/x1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "Ler/p;", "Ler/a;", "J", "Z", "isDestroyed", "[F", "matrixCache", "inverseMatrixCache", "value", "p", "(Z)V", "isDirty", "Lc5/d;", "Lc5/d;", "density", "Lc5/t;", "m", "Lc5/t;", "layoutDirection", "Lp3/a;", "Lp3/a;", "", "I", "mutatedFields", "Ln3/d3;", "q", "transformOrigin", "Ln3/i2;", "r", "Ln3/i2;", "outline", "isMatrixDirty", "isInverseMatrixDirty", "v", "isIdentity", "", "w", "F", "()F", "(F)V", "frameRate", "x", "isFrameRateFromParent", "()Z", "y", "drawnWithEnabledZ", "Lkotlin/Function1;", "Lp3/f;", "z", "Ler/l;", "recordLambda", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 implements g4.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private q3.c graphicsLayer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n3.x1 context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private er.p<? super n3.h1, ? super q3.c, oq.i0> drawBlock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.a<oq.i0> invalidateParentLayer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private n3.i2 outline;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseMatrixDirty;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float frameRate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean isFrameRateFromParent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithEnabledZ;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] matrixCache = n3.g2.c(null, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private c5.d density = c5.f.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private c5.t layoutDirection = c5.t.Ltr;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p3.a scope = new p3.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = n3.d3.INSTANCE.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isIdentity = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final er.l<p3.f, oq.i0> recordLambda = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<p3.f, oq.i0> {
        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(p3.f fVar) {
            c(fVar);
            return oq.i0.f148189a;
        }

        public final void c(p3.f fVar) {
            o1 o1Var = o1.this;
            n3.h1 h1VarF = fVar.getDrawContext().f();
            er.p pVar = o1Var.drawBlock;
            if (pVar != null) {
                pVar.B(h1VarF, fVar.getDrawContext().getGraphicsLayer());
            }
        }
    }

    public o1(q3.c cVar, n3.x1 x1Var, AndroidComposeView androidComposeView, er.p<? super n3.h1, ? super q3.c, oq.i0> pVar, er.a<oq.i0> aVar) {
        this.graphicsLayer = cVar;
        this.context = x1Var;
        this.ownerView = androidComposeView;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        long j15 = Integer.MAX_VALUE;
        this.size = c5.r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    private final float[] n() {
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = n3.g2.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrC[0])) {
                return null;
            }
            return fArrC;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrO = o();
        if (this.isIdentity) {
            return fArrO;
        }
        if (x1.a(fArrO, fArrC)) {
            return fArrC;
        }
        fArrC[0] = Float.NaN;
        return null;
    }

    private final float[] o() {
        t();
        return this.matrixCache;
    }

    private final void p(boolean z15) {
        if (z15 != this.isDirty) {
            this.isDirty = z15;
            this.ownerView.a1(this, z15);
        }
    }

    private final void s() {
        v3.f10811a.a(this.ownerView);
    }

    private final void t() {
        if (this.isMatrixDirty) {
            q3.c cVar = this.graphicsLayer;
            long jB = (cVar.getPivotOffset() & 9223372034707292159L) == 9205357640488583168L ? m3.l.b(c5.s.e(this.size)) : cVar.getPivotOffset();
            n3.g2.k(this.matrixCache, Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax)), cVar.y(), cVar.z(), 0.0f, cVar.q(), cVar.r(), cVar.s(), cVar.t(), cVar.u(), 0.0f, 1040, null);
            this.isMatrixDirty = false;
            this.isIdentity = n3.h2.a(this.matrixCache);
        }
    }

    private final void u() {
        er.a<oq.i0> aVar;
        n3.i2 i2Var = this.outline;
        if (i2Var == null) {
            return;
        }
        q3.e.b(this.graphicsLayer, i2Var);
        if (Build.VERSION.SDK_INT < 33) {
            if (((i2Var instanceof n3.i2.a) || ((i2Var instanceof n3.i2.c) && !m3.j.h(((n3.i2.c) i2Var).getRoundRect()))) && (aVar = this.invalidateParentLayer) != null) {
                aVar.a();
            }
        }
    }

    @Override // g4.a1
    public void b(float[] matrix) {
        n3.g2.p(matrix, o());
    }

    @Override // g4.a1
    public void c(MutableRect rect, boolean inverse) {
        float[] fArrN = inverse ? n() : o();
        if (this.isIdentity) {
            return;
        }
        if (fArrN == null) {
            rect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            n3.g2.h(fArrN, rect);
        }
    }

    @Override // g4.a1
    public long d(long point, boolean inverse) {
        float[] fArrO;
        if (inverse) {
            fArrO = n();
            if (fArrO == null) {
                return m3.e.INSTANCE.a();
            }
        } else {
            fArrO = o();
        }
        return this.isIdentity ? point : n3.g2.g(fArrO, point);
    }

    @Override // g4.a1
    public void destroy() {
        q(0.0f);
        r(false);
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        p(false);
        n3.x1 x1Var = this.context;
        if (x1Var != null) {
            x1Var.a(this.graphicsLayer);
            this.ownerView.g1(this);
        }
    }

    @Override // g4.a1
    public void e(long size) {
        if (c5.r.e(size, this.size)) {
            return;
        }
        if (this.ownerView.R0()) {
            this.ownerView.I(f3.k.INSTANCE.a());
        }
        this.size = size;
        invalidate();
    }

    @Override // g4.a1
    public void f(n3.v2 scope) {
        int iB;
        er.a<oq.i0> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i15 = mutatedFields & PKIFailureInfo.certConfirmed;
        if (i15 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.a0(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.b0(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.K(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.g0(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.h0(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.c0(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (aVar = this.invalidateParentLayer) != null) {
                aVar.a();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.L(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.e0(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.Y(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.W(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.X(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.graphicsLayer.N(scope.getCameraDistance());
        }
        if (i15 != 0) {
            if (n3.d3.e(this.transformOrigin, n3.d3.INSTANCE.a())) {
                this.graphicsLayer.S(m3.e.INSTANCE.b());
            } else {
                this.graphicsLayer.S(m3.e.e((((long) Float.floatToRawIntBits(n3.d3.g(this.transformOrigin) * ((int) (this.size & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(n3.d3.f(this.transformOrigin) * ((int) (this.size >> 32)))) << 32)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.O(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            q3.c cVar = this.graphicsLayer;
            scope.G();
            cVar.V(null);
        }
        if ((262144 & mutatedFields) != 0) {
            this.graphicsLayer.P(scope.getColorFilter());
        }
        if ((524288 & mutatedFields) != 0) {
            this.graphicsLayer.M(scope.getBlendMode());
        }
        if ((32768 & mutatedFields) != 0) {
            q3.c cVar2 = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            n3.u1.Companion companion = n3.u1.INSTANCE;
            if (n3.u1.e(compositingStrategy, companion.a())) {
                iB = q3.b.INSTANCE.a();
            } else if (n3.u1.e(compositingStrategy, companion.c())) {
                iB = q3.b.INSTANCE.c();
            } else {
                if (!n3.u1.e(compositingStrategy, companion.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = q3.b.INSTANCE.b();
            }
            cVar2.Q(iB);
        }
        boolean z15 = true;
        if ((mutatedFields & 7963) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (fr.t.c(this.outline, scope.getOutline())) {
            z15 = false;
        } else {
            this.outline = scope.getOutline();
            u();
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields != 0 || z15) {
            s();
            if (this.ownerView.R0()) {
                this.ownerView.I(getFrameRate());
            }
        }
    }

    @Override // g4.a1
    public boolean g(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & BodyPartID.bodyIdMax));
        if (this.graphicsLayer.getClip()) {
            return q2.c(this.graphicsLayer.o(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // g4.a1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo27getUnderlyingMatrixsQKQjiQ() {
        return o();
    }

    @Override // g4.a1
    public void h(er.p<? super n3.h1, ? super q3.c, oq.i0> drawBlock, er.a<oq.i0> invalidateParentLayer) {
        n3.x1 x1Var = this.context;
        if (x1Var == null) {
            d4.a.d("currently reuse is only supported when we manage the layer lifecycle");
            throw new oq.g();
        }
        if (!this.graphicsLayer.getIsReleased()) {
            d4.a.a("layer should have been released before reuse");
        }
        this.graphicsLayer = x1Var.c();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        n3.g2.i(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            n3.g2.i(fArr);
        }
        this.transformOrigin = n3.d3.INSTANCE.a();
        this.drawnWithEnabledZ = false;
        long j15 = Integer.MAX_VALUE;
        this.size = c5.r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // g4.a1
    public void i(float[] matrix) {
        float[] fArrN = n();
        if (fArrN != null) {
            n3.g2.p(matrix, fArrN);
        }
    }

    @Override // g4.a1
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        p(true);
    }

    @Override // g4.a1
    public void j(long position) {
        if (this.ownerView.R0()) {
            this.ownerView.I(f3.k.INSTANCE.a());
        }
        this.graphicsLayer.f0(position);
        s();
    }

    @Override // g4.a1
    public void k() {
        if (this.ownerView.R0() && getFrameRate() != 0.0f) {
            this.ownerView.I(getFrameRate());
        }
        if (this.isDirty) {
            if (!n3.d3.e(this.transformOrigin, n3.d3.INSTANCE.a()) && !c5.r.e(this.graphicsLayer.getSize(), this.size)) {
                q3.c cVar = this.graphicsLayer;
                float f15 = n3.d3.f(this.transformOrigin) * ((int) (this.size >> 32));
                cVar.S(m3.e.e((((long) Float.floatToRawIntBits(n3.d3.g(this.transformOrigin) * ((int) (this.size & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32)));
            }
            this.graphicsLayer.F(this.density, this.layoutDirection, this.size, this.recordLambda);
            p(false);
        }
    }

    @Override // g4.a1
    public void l(n3.h1 canvas, q3.c parentLayer) {
        k();
        this.drawnWithEnabledZ = this.graphicsLayer.v() > 0.0f;
        p3.d drawContext = this.scope.getDrawContext();
        drawContext.e(canvas);
        drawContext.i(parentLayer);
        q3.e.a(this.scope, this.graphicsLayer);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public float getFrameRate() {
        return this.frameRate;
    }

    public void q(float f15) {
        this.frameRate = f15;
    }

    public void r(boolean z15) {
        this.isFrameRateFromParent = z15;
    }
}
