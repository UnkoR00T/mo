package t3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import fr.w;
import java.util.ArrayList;
import java.util.List;
import n3.g2;
import n3.m2;
import n3.u0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0006*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u00101\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R6\u00109\u001a\b\u0012\u0004\u0012\u000203022\f\u0010'\u001a\b\u0012\u0004\u0012\u000203028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010$\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010:\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R0\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010?8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\b\u001f\u0010A\"\u0004\b(\u0010BR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010@R*\u0010I\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010HR*\u0010P\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010S\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR*\u0010V\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010K\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR*\u0010Y\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010K\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR*\u0010\\\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010K\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR*\u0010_\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010K\u001a\u0004\b]\u0010M\"\u0004\b^\u0010OR*\u0010b\u001a\u00020J2\u0006\u0010'\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\b`\u0010M\"\u0004\ba\u0010OR\u0016\u0010c\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010)R\u0014\u0010d\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010+R\u0011\u0010f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010e¨\u0006g"}, d2 = {"Lt3/c;", "Lt3/l;", "<init>", "()V", "Landroidx/compose/ui/graphics/c;", "brush", "Loq/i0;", "l", "(Landroidx/compose/ui/graphics/c;)V", "Landroidx/compose/ui/graphics/Color;", "color", "m", "(J)V", "node", "n", "(Lt3/l;)V", "k", "x", "y", "", "index", "instance", "i", "(ILt3/l;)V", "Lp3/f;", "a", "(Lp3/f;)V", "", "toString", "()Ljava/lang/String;", "Ln3/g2;", "b", "[F", "groupMatrix", "", "c", "Ljava/util/List;", "children", "", "value", "d", "Z", "j", "()Z", "isTintable", "e", "J", "g", "()J", "tintColor", "", "Lt3/h;", "f", "getClipPathData", "()Ljava/util/List;", "o", "(Ljava/util/List;)V", "clipPathData", "isClipPathDirty", "Ln3/m2;", "h", "Ln3/m2;", "clipPath", "Lkotlin/Function1;", "Ler/l;", "()Ler/l;", "(Ler/l;)V", "invalidateListener", "wrappedListener", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", "F", "getRotation", "()F", "s", "(F)V", "rotation", "getPivotX", "q", "pivotX", "getPivotY", "r", "pivotY", "getScaleX", "t", "scaleX", "getScaleY", "u", "scaleY", "getTranslationX", "v", "translationX", "getTranslationY", "w", "translationY", "isMatrixDirty", "willClipPath", "()I", "numChildren", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float[] groupMatrix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<l> children;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isTintable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long tintColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<? extends h> clipPathData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isClipPathDirty;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private m2 clipPath;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private er.l<? super l, i0> invalidateListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final er.l<l, i0> wrappedListener;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float pivotX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float pivotY;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt3/l;", "node", "Loq/i0;", "c", "(Lt3/l;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.l<l, i0> {
        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(l lVar) {
            c(lVar);
            return i0.f148189a;
        }

        public final void c(l lVar) {
            c.this.n(lVar);
            er.l<l, i0> lVarB = c.this.b();
            if (lVarB != null) {
                lVarB.b(lVar);
            }
        }
    }

    public c() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.INSTANCE.h();
        this.clipPathData = o.d();
        this.isClipPathDirty = true;
        this.wrappedListener = new a();
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean h() {
        return !this.clipPathData.isEmpty();
    }

    private final void k() {
        this.isTintable = false;
        this.tintColor = Color.INSTANCE.h();
    }

    private final void l(androidx.compose.ui.graphics.c brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m(((SolidColor) brush).getValue());
            } else {
                k();
            }
        }
    }

    private final void m(long color) {
        if (this.isTintable && color != 16) {
            long j15 = this.tintColor;
            if (j15 == 16) {
                this.tintColor = color;
            } else {
                if (o.e(j15, color)) {
                    return;
                }
                k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(l node) {
        if (node instanceof g) {
            g gVar = (g) node;
            l(gVar.getFill());
            l(gVar.getStroke());
        } else if (node instanceof c) {
            c cVar = (c) node;
            if (cVar.isTintable && this.isTintable) {
                m(cVar.tintColor);
            } else {
                k();
            }
        }
    }

    private final void x() {
        if (h()) {
            m2 m2VarA = this.clipPath;
            if (m2VarA == null) {
                m2VarA = u0.a();
                this.clipPath = m2VarA;
            }
            k.c(this.clipPathData, m2VarA);
        }
    }

    private final void y() {
        float[] fArrC = this.groupMatrix;
        if (fArrC == null) {
            fArrC = g2.c(null, 1, null);
            this.groupMatrix = fArrC;
        } else {
            g2.i(fArrC);
        }
        float[] fArr = fArrC;
        g2.s(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        g2.m(fArr, this.rotation);
        g2.n(fArr, this.scaleX, this.scaleY, 1.0f);
        g2.s(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // t3.l
    public void a(p3.f fVar) {
        if (this.isMatrixDirty) {
            y();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            x();
            this.isClipPathDirty = false;
        }
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            p3.h transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.b(g2.a(fArr).getValues());
            }
            m2 m2Var = this.clipPath;
            if (h() && m2Var != null) {
                p3.h.k(transform, m2Var, 0, 2, null);
            }
            List<l> list = this.children;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                list.get(i15).a(fVar);
            }
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    @Override // t3.l
    public er.l<l, i0> b() {
        return this.invalidateListener;
    }

    @Override // t3.l
    public void d(er.l<? super l, i0> lVar) {
        this.invalidateListener = lVar;
    }

    public final int f() {
        return this.children.size();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public final void i(int index, l instance) {
        if (index < f()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        n(instance);
        instance.d(this.wrappedListener);
        c();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    public final void o(List<? extends h> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        c();
    }

    public final void p(String str) {
        this.name = str;
        c();
    }

    public final void q(float f15) {
        this.pivotX = f15;
        this.isMatrixDirty = true;
        c();
    }

    public final void r(float f15) {
        this.pivotY = f15;
        this.isMatrixDirty = true;
        c();
    }

    public final void s(float f15) {
        this.rotation = f15;
        this.isMatrixDirty = true;
        c();
    }

    public final void t(float f15) {
        this.scaleX = f15;
        this.isMatrixDirty = true;
        c();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("VGroup: ");
        sb5.append(this.name);
        List<l> list = this.children;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            l lVar = list.get(i15);
            sb5.append("\t");
            sb5.append(lVar.toString());
            sb5.append("\n");
        }
        return sb5.toString();
    }

    public final void u(float f15) {
        this.scaleY = f15;
        this.isMatrixDirty = true;
        c();
    }

    public final void v(float f15) {
        this.translationX = f15;
        this.isMatrixDirty = true;
        c();
    }

    public final void w(float f15) {
        this.translationY = f15;
        this.isMatrixDirty = true;
        c();
    }
}
