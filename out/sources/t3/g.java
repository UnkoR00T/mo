package t3;

import fr.t;
import fr.w;
import java.util.List;
import n3.m2;
import n3.p2;
import n3.t0;
import n3.u0;
import p071kotlin.Metadata;
import p3.Stroke;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R6\u0010+\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u00103\u001a\u00020,2\u0006\u0010\r\u001a\u00020,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R*\u0010;\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R.\u0010=\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b4\u0010\u0018\"\u0004\b<\u0010\u001aR*\u0010A\u001a\u00020>2\u0006\u0010\r\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010.\u001a\u0004\b?\u00100\"\u0004\b@\u00102R*\u0010E\u001a\u00020B2\u0006\u0010\r\u001a\u00020B8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\bC\u00100\"\u0004\bD\u00102R*\u0010H\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\bF\u0010 \"\u0004\bG\u0010\"R*\u0010K\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R*\u0010N\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001e\u001a\u0004\bL\u0010 \"\u0004\bM\u0010\"R*\u0010Q\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001e\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"R\u0016\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010SR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010SR\u0016\u0010V\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010SR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010[R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010[R\u001b\u0010b\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010`\u001a\u0004\b-\u0010aR\u0014\u0010d\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010c¨\u0006e"}, d2 = {"Lt3/g;", "Lt3/l;", "<init>", "()V", "Loq/i0;", "w", "x", "Lp3/f;", "a", "(Lp3/f;)V", "", "toString", "()Ljava/lang/String;", "value", "b", "Ljava/lang/String;", "getName", "k", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/c;", "c", "Landroidx/compose/ui/graphics/c;", "e", "()Landroidx/compose/ui/graphics/c;", "i", "(Landroidx/compose/ui/graphics/c;)V", "fill", "", "d", "F", "getFillAlpha", "()F", "j", "(F)V", "fillAlpha", "", "Lt3/h;", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "l", "(Ljava/util/List;)V", "pathData", "Ln3/o2;", "f", "I", "getPathFillType-Rg-k1Os", "()I", "m", "(I)V", "pathFillType", "g", "getStrokeAlpha", "o", "strokeAlpha", "h", "getStrokeLineWidth", "s", "strokeLineWidth", "n", "stroke", "Ln3/a3;", "getStrokeLineCap-KaPHkGw", "p", "strokeLineCap", "Ln3/b3;", "getStrokeLineJoin-LxFBmk8", "q", "strokeLineJoin", "getStrokeLineMiter", "r", "strokeLineMiter", "getTrimPathStart", "v", "trimPathStart", "getTrimPathEnd", "t", "trimPathEnd", "getTrimPathOffset", "u", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Lp3/k;", "Lp3/k;", "strokeStyle", "Ln3/m2;", "Ln3/m2;", "path", "renderPath", "_tmpPath", "Ln3/p2;", "Loq/k;", "()Ln3/p2;", "pathMeasure", "()Ln3/m2;", "tmpPath", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.c fill;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float fillAlpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends h> pathData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int pathFillType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float strokeAlpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float strokeLineWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.c stroke;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int strokeLineCap;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int strokeLineJoin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float strokeLineMiter;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float trimPathStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float trimPathEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float trimPathOffset;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isPathDirty;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isStrokeDirty;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isTrimPathDirty;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Stroke strokeStyle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final m2 path;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private m2 renderPath;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private m2 _tmpPath;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final oq.k pathMeasure;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln3/p2;", "c", "()Ln3/p2;"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.a<p2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f187289b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2 a() {
            return t0.a();
        }
    }

    public g() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = o.d();
        this.pathFillType = o.a();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = o.b();
        this.strokeLineJoin = o.c();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        m2 m2VarA = u0.a();
        this.path = m2VarA;
        this.renderPath = m2VarA;
        this.pathMeasure = oq.l.b(oq.o.NONE, a.f187289b);
    }

    private final p2 f() {
        return (p2) this.pathMeasure.getValue();
    }

    private final m2 h() {
        m2 m2Var = this._tmpPath;
        if (m2Var != null) {
            return m2Var;
        }
        m2 m2VarA = u0.a();
        this._tmpPath = m2VarA;
        return m2VarA;
    }

    private final void w() {
        k.c(this.pathData, this.path);
        x();
    }

    private final void x() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (t.c(this.renderPath, this.path)) {
            this.renderPath = u0.a();
        } else {
            int iQ = this.renderPath.q();
            this.renderPath.l();
            this.renderPath.i(iQ);
        }
        f().c(this.path, false);
        float fA = f().a();
        float f15 = this.trimPathStart;
        float f16 = this.trimPathOffset;
        float f17 = ((f15 + f16) % 1.0f) * fA;
        float f18 = ((this.trimPathEnd + f16) % 1.0f) * fA;
        if (f17 <= f18) {
            f().b(f17, f18, this.renderPath, true);
            return;
        }
        m2 m2VarH = h();
        m2VarH.reset();
        f().b(f17, fA, m2VarH, true);
        m2.g(this.renderPath, m2VarH, 0L, 2, null);
        m2VarH.reset();
        f().b(0.0f, f18, m2VarH, true);
        m2.g(this.renderPath, m2VarH, 0L, 2, null);
    }

    @Override // t3.l
    public void a(p3.f fVar) {
        Stroke stroke;
        if (this.isPathDirty) {
            w();
        } else if (this.isTrimPathDirty) {
            x();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        androidx.compose.ui.graphics.c cVar = this.fill;
        if (cVar != null) {
            p3.f.M0(fVar, this.renderPath, cVar, this.fillAlpha, null, null, 0, 56, null);
        }
        androidx.compose.ui.graphics.c cVar2 = this.stroke;
        if (cVar2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke3;
                this.isStrokeDirty = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            p3.f.M0(fVar, this.renderPath, cVar2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final androidx.compose.ui.graphics.c getFill() {
        return this.fill;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.graphics.c getStroke() {
        return this.stroke;
    }

    public final void i(androidx.compose.ui.graphics.c cVar) {
        this.fill = cVar;
        c();
    }

    public final void j(float f15) {
        this.fillAlpha = f15;
        c();
    }

    public final void k(String str) {
        this.name = str;
        c();
    }

    public final void l(List<? extends h> list) {
        this.pathData = list;
        this.isPathDirty = true;
        c();
    }

    public final void m(int i15) {
        this.pathFillType = i15;
        this.renderPath.i(i15);
        c();
    }

    public final void n(androidx.compose.ui.graphics.c cVar) {
        this.stroke = cVar;
        c();
    }

    public final void o(float f15) {
        this.strokeAlpha = f15;
        c();
    }

    public final void p(int i15) {
        this.strokeLineCap = i15;
        this.isStrokeDirty = true;
        c();
    }

    public final void q(int i15) {
        this.strokeLineJoin = i15;
        this.isStrokeDirty = true;
        c();
    }

    public final void r(float f15) {
        this.strokeLineMiter = f15;
        this.isStrokeDirty = true;
        c();
    }

    public final void s(float f15) {
        this.strokeLineWidth = f15;
        this.isStrokeDirty = true;
        c();
    }

    public final void t(float f15) {
        this.trimPathEnd = f15;
        this.isTrimPathDirty = true;
        c();
    }

    public String toString() {
        return this.path.toString();
    }

    public final void u(float f15) {
        this.trimPathOffset = f15;
        this.isTrimPathDirty = true;
        c();
    }

    public final void v(float f15) {
        this.trimPathStart = f15;
        this.isTrimPathDirty = true;
        c();
    }
}
