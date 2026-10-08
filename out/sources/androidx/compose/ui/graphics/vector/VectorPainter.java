package androidx.compose.ui.graphics.vector;

import c5.t;
import fr.w;
import m3.k;
import n3.n1;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.x5;
import p3.d;
import p3.f;
import t3.c;
import t3.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010!\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00101R(\u00108\u001a\u0004\u0018\u00010\u000f2\b\u00103\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010;\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00138@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR$\u0010A\u001a\u00020<2\u0006\u00103\u001a\u00020<8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018¨\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/a;", "Lt3/c;", "root", "<init>", "(Lt3/c;)V", "Lp3/f;", "Loq/i0;", "n", "(Lp3/f;)V", "", "alpha", "", "a", "(F)Z", "Ln3/n1;", "colorFilter", "b", "(Ln3/n1;)Z", "Lm3/k;", "<set-?>", "h", "Lm2/a3;", "r", "()J", "w", "(J)V", "size", "j", "p", "()Z", "s", "(Z)V", "autoMirror", "Lt3/m;", "k", "Lt3/m;", "getVector$ui", "()Lt3/m;", "vector", "l", "q", "()Loq/i0;", "t", "(Loq/i0;)V", "drawInvalidation", "m", "F", "currentAlpha", "Ln3/n1;", "currentColorFilter", "value", "getIntrinsicColorFilter$ui", "()Ln3/n1;", "u", "(Ln3/n1;)V", "intrinsicColorFilter", "getViewportSize-NH-jbRc$ui", "x", "viewportSize", "", "getName$ui", "()Ljava/lang/String;", "v", "(Ljava/lang/String;)V", "name", "intrinsicSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VectorPainter extends androidx.compose.ui.graphics.painter.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f9984p = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a3 size;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a3 autoMirror;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final m vector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a3 drawInvalidation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float currentAlpha;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private n1 currentColorFilter;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<i0> {
        a() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            VectorPainter.this.t(i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final i0 q() {
        this.drawInvalidation.getValue();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(i0 i0Var) {
        this.drawInvalidation.setValue(i0Var);
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean a(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean b(n1 colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    /* JADX INFO: renamed from: l */
    public long getIntrinsicSize() {
        return r();
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected void n(f fVar) {
        m mVar = this.vector;
        n1 n1VarK = this.currentColorFilter;
        if (n1VarK == null) {
            n1VarK = mVar.k();
        }
        if (p() && fVar.getLayoutDirection() == t.Rtl) {
            long jY2 = fVar.y2();
            d drawContext = fVar.getDrawContext();
            long jA = drawContext.a();
            drawContext.f().q();
            try {
                drawContext.getTransform().h(-1.0f, 1.0f, jY2);
                mVar.i(fVar, this.currentAlpha, n1VarK);
                drawContext.f().j();
                drawContext.g(jA);
            } catch (Throwable th4) {
                drawContext.f().j();
                drawContext.g(jA);
                throw th4;
            }
        } else {
            mVar.i(fVar, this.currentAlpha, n1VarK);
        }
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((k) this.size.getValue()).getPackedValue();
    }

    public final void s(boolean z15) {
        this.autoMirror.setValue(Boolean.valueOf(z15));
    }

    public final void u(n1 n1Var) {
        this.vector.n(n1Var);
    }

    public final void v(String str) {
        this.vector.p(str);
    }

    public final void w(long j15) {
        this.size.setValue(k.c(j15));
    }

    public final void x(long j15) {
        this.vector.q(j15);
    }

    public VectorPainter(c cVar) {
        this.size = c6.e(k.c(k.INSTANCE.b()), null, 2, null);
        this.autoMirror = c6.e(Boolean.FALSE, null, 2, null);
        m mVar = new m(cVar);
        mVar.o(new a());
        this.vector = mVar;
        this.drawInvalidation = x5.i(i0.f148189a, x5.k());
        this.currentAlpha = 1.0f;
    }

    public /* synthetic */ VectorPainter(c cVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new c() : cVar);
    }
}
