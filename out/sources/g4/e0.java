package g4;

import androidx.compose.ui.node.NodeCoordinator;
import n3.b2;
import n3.m2;
import n3.n2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u0007*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ^\u00100\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b0\u00101J^\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0001\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b4\u00105JL\u00109\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b9\u0010:JL\u0010;\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b;\u0010<JD\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u00106\u001a\u00020\"2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b?\u0010@Jd\u0010H\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020\u000b2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.2\u0006\u0010G\u001a\u00020FH\u0096\u0001¢\u0006\u0004\bH\u0010IJT\u0010L\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bL\u0010MJT\u0010N\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\u0006\u00108\u001a\u0002072\b\b\u0001\u0010+\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bN\u0010OJL\u0010R\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u00020\"2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bR\u0010SJd\u0010X\u001a\u00020\u00072\u0006\u00103\u001a\u0002022\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010W\u001a\u00020V2\u0006\u00106\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\bX\u0010YJD\u0010\\\u001a\u00020\u00072\u0006\u0010[\u001a\u00020Z2\u0006\u00103\u001a\u0002022\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b\\\u0010]JD\u0010^\u001a\u00020\u00072\u0006\u0010[\u001a\u00020Z2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010+\u001a\u00020%2\u0006\u00108\u001a\u0002072\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b^\u0010_J\u0014\u0010a\u001a\u00020%*\u00020`H\u0097\u0001¢\u0006\u0004\ba\u0010bJ\u0014\u0010d\u001a\u00020%*\u00020cH\u0097\u0001¢\u0006\u0004\bd\u0010eJ\u0014\u0010g\u001a\u00020f*\u00020`H\u0097\u0001¢\u0006\u0004\bg\u0010hJ\u0014\u0010i\u001a\u00020f*\u00020cH\u0097\u0001¢\u0006\u0004\bi\u0010jJ\u0014\u0010k\u001a\u00020`*\u00020fH\u0097\u0001¢\u0006\u0004\bk\u0010lJ\u0014\u0010m\u001a\u00020`*\u00020%H\u0097\u0001¢\u0006\u0004\bm\u0010bJ\u0014\u0010n\u001a\u00020`*\u00020cH\u0097\u0001¢\u0006\u0004\bn\u0010eJ\u0014\u0010o\u001a\u00020c*\u00020%H\u0097\u0001¢\u0006\u0004\bo\u0010pJ\u0014\u0010q\u001a\u00020c*\u00020`H\u0097\u0001¢\u0006\u0004\bq\u0010pJ\u0014\u0010s\u001a\u00020\u0017*\u00020rH\u0097\u0001¢\u0006\u0004\bs\u0010tJ\u0014\u0010u\u001a\u00020r*\u00020\u0017H\u0097\u0001¢\u0006\u0004\bu\u0010tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020|8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0016\u0010Q\u001a\u00020\"8VX\u0096\u0005¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\f\u001a\u00020\u00178VX\u0096\u0005¢\u0006\u0007\u001a\u0005\bv\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00020%8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008a\u0001\u001a\u00020%8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0087\u0001¨\u0006\u008b\u0001"}, d2 = {"Lg4/e0;", "Lp3/f;", "Lp3/c;", "Lp3/a;", "canvasDrawScope", "<init>", "(Lp3/a;)V", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37089p, "()V", "Lq3/c;", "Lc5/r;", "size", "Lkotlin/Function1;", "block", "U1", "(Lq3/c;JLer/l;)V", "Lg4/q;", "Ln3/h1;", "canvas", "layer", "k", "(Lg4/q;Ln3/h1;Lq3/c;)V", "Lm3/k;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lf3/m$c;", "drawNode", "h", "(Ln3/h1;JLandroidx/compose/ui/node/NodeCoordinator;Lf3/m$c;Lq3/c;)V", "i", "(Ln3/h1;JLandroidx/compose/ui/node/NodeCoordinator;Lg4/q;Lq3/c;)V", "Landroidx/compose/ui/graphics/c;", "brush", "Lm3/e;", "start", "end", "", "strokeWidth", "Ln3/a3;", "cap", "Ln3/n2;", "pathEffect", "alpha", "Ln3/n1;", "colorFilter", "Ln3/a1;", "blendMode", "o2", "(Landroidx/compose/ui/graphics/c;JJFILn3/n2;FLn3/n1;I)V", "Landroidx/compose/ui/graphics/Color;", "color", "t0", "(JJJFILn3/n2;FLn3/n1;I)V", "topLeft", "Lp3/g;", "style", "m1", "(Landroidx/compose/ui/graphics/c;JJFLp3/g;Ln3/n1;I)V", "l1", "(JJJFLp3/g;Ln3/n1;I)V", "Ln3/b2;", "image", "a1", "(Ln3/b2;JFLp3/g;Ln3/n1;I)V", "Lc5/n;", "srcOffset", "srcSize", "dstOffset", "dstSize", "Ln3/v1;", "filterQuality", "u0", "(Ln3/b2;JJJJFLp3/g;Ln3/n1;II)V", "Lm3/a;", "cornerRadius", "S1", "(Landroidx/compose/ui/graphics/c;JJJFLp3/g;Ln3/n1;I)V", "D0", "(JJJJLp3/g;FLn3/n1;I)V", "radius", "center", "s1", "(JFJFLp3/g;Ln3/n1;I)V", "startAngle", "sweepAngle", "", "useCenter", "V", "(JFFZJJFLp3/g;Ln3/n1;I)V", "Ln3/m2;", "path", "c0", "(Ln3/m2;JFLp3/g;Ln3/n1;I)V", "g1", "(Ln3/m2;Landroidx/compose/ui/graphics/c;FLp3/g;Ln3/n1;I)V", "Lc5/h;", "l2", "(F)F", "Lc5/v;", "e1", "(J)F", "", "X0", "(F)I", "q2", "(J)I", "b2", "(I)F", "d2", "h0", "y0", "(F)J", "Z", "Lc5/k;", "B2", "(J)J", "a0", "a", "Lp3/a;", "getCanvasDrawScope", "()Lp3/a;", "b", "Lg4/q;", "Lp3/d;", "n2", "()Lp3/d;", "drawContext", "y2", "()J", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 implements p3.f, p3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p3.a canvasDrawScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private q drawNode;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<p3.f, oq.i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f70335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.l<p3.f, oq.i0> f70336d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q qVar, er.l<? super p3.f, oq.i0> lVar) {
            super(1);
            this.f70335c = qVar;
            this.f70336d = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(p3.f fVar) throws Throwable {
            c(fVar);
            return oq.i0.f148189a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [g4.q] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [g4.q] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [p3.d] */
        /* JADX WARN: Type inference failed for: r2v5 */
        public final void c(p3.f fVar) throws Throwable {
            ?? drawContext = e0.this.drawNode;
            e0.this.drawNode = this.f70335c;
            try {
                e0 e0Var = e0.this;
                c5.d density = fVar.getDrawContext().getDensity();
                c5.t layoutDirection = fVar.getDrawContext().getLayoutDirection();
                n3.h1 h1VarF = fVar.getDrawContext().f();
                long jA = fVar.getDrawContext().a();
                q3.c graphicsLayer = fVar.getDrawContext().getGraphicsLayer();
                er.l<p3.f, oq.i0> lVar = this.f70336d;
                c5.d density2 = e0Var.getDrawContext().getDensity();
                c5.t layoutDirection2 = e0Var.getDrawContext().getLayoutDirection();
                n3.h1 h1VarF2 = e0Var.getDrawContext().f();
                long jA2 = e0Var.getDrawContext().a();
                q3.c graphicsLayer2 = e0Var.getDrawContext().getGraphicsLayer();
                try {
                    drawContext = e0Var.getDrawContext();
                    drawContext.b(density);
                    drawContext.d(layoutDirection);
                    drawContext.e(h1VarF);
                    drawContext.g(jA);
                    drawContext.i(graphicsLayer);
                    h1VarF.q();
                    try {
                        lVar.b(e0Var);
                        h1VarF.j();
                        p3.d drawContext2 = e0Var.getDrawContext();
                        drawContext2.b(density2);
                        drawContext2.d(layoutDirection2);
                        drawContext2.e(h1VarF2);
                        drawContext2.g(jA2);
                        drawContext2.i(graphicsLayer2);
                        e0.this.drawNode = drawContext;
                    } catch (Throwable th4) {
                        drawContext = drawContext;
                        h1VarF.j();
                        p3.d drawContext3 = e0Var.getDrawContext();
                        drawContext3.b(density2);
                        drawContext3.d(layoutDirection2);
                        drawContext3.e(h1VarF2);
                        drawContext3.g(jA2);
                        drawContext3.i(graphicsLayer2);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    drawContext = drawContext;
                    e0.this.drawNode = drawContext;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                e0.this.drawNode = drawContext;
                throw th;
            }
        }
    }

    public e0(p3.a aVar) {
        this.canvasDrawScope = aVar;
    }

    @Override // c5.d
    public long B2(long j15) {
        return this.canvasDrawScope.B2(j15);
    }

    @Override // p3.f
    public void D0(long color, long topLeft, long size, long cornerRadius, p3.g style, float alpha, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.D0(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // p3.c
    public void H2() {
        n3.h1 h1VarF = getDrawContext().f();
        q qVar = this.drawNode;
        if (qVar == null) {
            d4.a.d("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new oq.g();
        }
        f3.m.c cVarB = f0.b(qVar);
        if (cVarB == 0) {
            NodeCoordinator nodeCoordinatorN = h.n(qVar, s0.a(4));
            if (nodeCoordinatorN.n3() == qVar.getNode()) {
                nodeCoordinatorN = nodeCoordinatorN.getWrapped();
            }
            nodeCoordinatorN.N3(h1VarF, getDrawContext().getGraphicsLayer());
            return;
        }
        int iA = s0.a(4);
        n2.c cVar = null;
        while (cVarB != 0) {
            if (cVarB instanceof q) {
                k((q) cVarB, h1VarF, getDrawContext().getGraphicsLayer());
            } else if ((cVarB.getKindSet() & iA) != 0 && (cVarB instanceof j)) {
                f3.m.c delegate = ((j) cVarB).getDelegate();
                int i15 = 0;
                cVarB = cVarB;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i15++;
                        if (i15 == 1) {
                            cVarB = delegate;
                        } else {
                            if (cVar == null) {
                                cVar = new n2.c(new f3.m.c[16], 0);
                            }
                            if (cVarB != 0) {
                                cVar.d(cVarB);
                                cVarB = 0;
                            }
                            cVar.d(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    cVarB = cVarB;
                }
                if (i15 == 1) {
                }
            }
            cVarB = h.l(cVar);
        }
    }

    @Override // p3.f
    public void S1(androidx.compose.ui.graphics.c brush, long topLeft, long size, long cornerRadius, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.S1(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // p3.f
    public void U1(q3.c cVar, long j15, er.l<? super p3.f, oq.i0> lVar) {
        cVar.F(this, getLayoutDirection(), j15, new a(this.drawNode, lVar));
    }

    @Override // p3.f
    public void V(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.V(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // c5.d
    public int X0(float f15) {
        return this.canvasDrawScope.X0(f15);
    }

    @Override // c5.l
    public long Z(float f15) {
        return this.canvasDrawScope.Z(f15);
    }

    @Override // p3.f
    public long a() {
        return this.canvasDrawScope.a();
    }

    @Override // c5.d
    public long a0(long j15) {
        return this.canvasDrawScope.a0(j15);
    }

    @Override // p3.f
    public void a1(b2 image, long topLeft, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.a1(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // c5.d
    public float b2(int i15) {
        return this.canvasDrawScope.b2(i15);
    }

    @Override // p3.f
    public void c0(m2 path, long color, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.c0(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // c5.d
    public float d2(float f15) {
        return this.canvasDrawScope.d2(f15);
    }

    @Override // c5.d
    public float e1(long j15) {
        return this.canvasDrawScope.e1(j15);
    }

    @Override // p3.f
    public void g1(m2 path, androidx.compose.ui.graphics.c brush, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.g1(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // c5.d
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // p3.f
    public c5.t getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    public final void h(n3.h1 canvas, long size, NodeCoordinator coordinator, f3.m.c drawNode, q3.c layer) {
        int iA = s0.a(4);
        f3.m.c cVarL = drawNode;
        n2.c cVar = null;
        while (cVarL != null) {
            if (cVarL instanceof q) {
                i(canvas, size, coordinator, (q) cVarL, layer);
            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof j)) {
                int i15 = 0;
                for (f3.m.c delegate = ((j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i15++;
                        if (i15 == 1) {
                            cVarL = delegate;
                        } else {
                            if (cVar == null) {
                                cVar = new n2.c(new f3.m.c[16], 0);
                            }
                            if (cVarL != null) {
                                cVar.d(cVarL);
                                cVarL = null;
                            }
                            cVar.d(delegate);
                        }
                    }
                }
                if (i15 == 1) {
                }
            }
            cVarL = h.l(cVar);
        }
    }

    @Override // c5.l
    public float h0(long j15) {
        return this.canvasDrawScope.h0(j15);
    }

    public final void i(n3.h1 canvas, long size, NodeCoordinator coordinator, q drawNode, q3.c layer) {
        q qVar = this.drawNode;
        this.drawNode = drawNode;
        p3.a aVar = this.canvasDrawScope;
        c5.t layoutDirection = coordinator.getLayoutDirection();
        c5.d density = aVar.getDrawContext().getDensity();
        c5.t layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
        n3.h1 h1VarF = aVar.getDrawContext().f();
        long jA = aVar.getDrawContext().a();
        q3.c graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
        p3.d drawContext = aVar.getDrawContext();
        drawContext.b(coordinator);
        drawContext.d(layoutDirection);
        drawContext.e(canvas);
        drawContext.g(size);
        drawContext.i(layer);
        canvas.q();
        try {
            drawNode.y(this);
            canvas.j();
            p3.d drawContext2 = aVar.getDrawContext();
            drawContext2.b(density);
            drawContext2.d(layoutDirection2);
            drawContext2.e(h1VarF);
            drawContext2.g(jA);
            drawContext2.i(graphicsLayer);
            this.drawNode = qVar;
        } catch (Throwable th4) {
            canvas.j();
            p3.d drawContext3 = aVar.getDrawContext();
            drawContext3.b(density);
            drawContext3.d(layoutDirection2);
            drawContext3.e(h1VarF);
            drawContext3.g(jA);
            drawContext3.i(graphicsLayer);
            throw th4;
        }
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    public final void k(q qVar, n3.h1 h1Var, q3.c cVar) {
        NodeCoordinator nodeCoordinatorN = h.n(qVar, s0.a(4));
        nodeCoordinatorN.getLayoutNode().n0().i(h1Var, c5.s.e(nodeCoordinatorN.b()), nodeCoordinatorN, qVar, cVar);
    }

    @Override // p3.f
    public void l1(long color, long topLeft, long size, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.l1(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // c5.d
    public float l2(float f15) {
        return this.canvasDrawScope.l2(f15);
    }

    @Override // p3.f
    public void m1(androidx.compose.ui.graphics.c brush, long topLeft, long size, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.m1(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // p3.f
    /* JADX INFO: renamed from: n2 */
    public p3.d getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // p3.f
    public void o2(androidx.compose.ui.graphics.c brush, long start, long end, float strokeWidth, int cap, n2 pathEffect, float alpha, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.o2(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // c5.d
    public int q2(long j15) {
        return this.canvasDrawScope.q2(j15);
    }

    @Override // p3.f
    public void s1(long color, float radius, long center, float alpha, p3.g style, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.s1(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // p3.f
    public void t0(long color, long start, long end, float strokeWidth, int cap, n2 pathEffect, float alpha, n3.n1 colorFilter, int blendMode) {
        this.canvasDrawScope.t0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // p3.f
    public void u0(b2 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, p3.g style, n3.n1 colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.u0(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // c5.d
    public long y0(float f15) {
        return this.canvasDrawScope.y0(f15);
    }

    @Override // p3.f
    public long y2() {
        return this.canvasDrawScope.y2();
    }

    public /* synthetic */ e0(p3.a aVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new p3.a() : aVar);
    }
}
