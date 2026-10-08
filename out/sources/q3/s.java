package q3;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import n3.e0;
import n3.h1;
import n3.i1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b$\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b'\u0010\u001d\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R*\u0010>\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u00105R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lq3/s;", "Landroid/view/View;", "ownerView", "Ln3/i1;", "canvasHolder", "Lp3/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;Ln3/i1;Lp3/a;)V", "Landroid/graphics/Outline;", "outline", "", "d", "(Landroid/graphics/Outline;)Z", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lq3/c;", "parentLayer", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "drawBlock", "c", "(Lc5/d;Lc5/t;Lq3/c;Ler/l;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Ln3/i1;", "getCanvasHolder", "()Ln3/i1;", "Lp3/a;", "Z", "setInvalidated", "(Z)V", "isInvalidated", "e", "Landroid/graphics/Outline;", "layerOutline", "value", "f", "getCanUseCompositingLayer$ui_graphics", "setCanUseCompositingLayer$ui_graphics", "canUseCompositingLayer", "g", "Lc5/d;", "h", "Lc5/t;", "j", "Ler/l;", "k", "Lq3/c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s extends View {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f164092m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ViewOutlineProvider f164093n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 canvasHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p3.a canvasDrawScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Outline layerOutline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean canUseCompositingLayer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private c5.d density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private c5.t layoutDirection;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private er.l<? super p3.f, i0> drawBlock;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private c parentLayer;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"q3/s$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Loq/i0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof s) || (outline2 = ((s) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public s(View view, i1 i1Var, p3.a aVar) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = i1Var;
        this.canvasDrawScope = aVar;
        setOutlineProvider(f164093n);
        this.canUseCompositingLayer = true;
        this.density = p3.e.a();
        this.layoutDirection = c5.t.Ltr;
        this.drawBlock = d.INSTANCE.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void c(c5.d density, c5.t layoutDirection, c parentLayer, er.l<? super p3.f, i0> drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public final boolean d(Outline outline) {
        this.layerOutline = outline;
        return m.f164084a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        i1 i1Var = this.canvasHolder;
        Canvas canvasA = i1Var.getAndroidCanvas().getInternalCanvas();
        i1Var.getAndroidCanvas().b(canvas);
        e0 e0VarA = i1Var.getAndroidCanvas();
        p3.a aVar = this.canvasDrawScope;
        c5.d dVar = this.density;
        c5.t tVar = this.layoutDirection;
        float width = getWidth();
        long jD = m3.k.d((((long) Float.floatToRawIntBits(getHeight())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32));
        c cVar = this.parentLayer;
        er.l<? super p3.f, i0> lVar = this.drawBlock;
        c5.d density = aVar.getDrawContext().getDensity();
        c5.t layoutDirection = aVar.getDrawContext().getLayoutDirection();
        h1 h1VarF = aVar.getDrawContext().f();
        long jA = aVar.getDrawContext().a();
        c cVarH = aVar.getDrawContext().getGraphicsLayer();
        p3.d dVarN2 = aVar.getDrawContext();
        dVarN2.b(dVar);
        dVarN2.d(tVar);
        dVarN2.e(e0VarA);
        dVarN2.g(jD);
        dVarN2.i(cVar);
        e0VarA.q();
        try {
            lVar.b(aVar);
            e0VarA.j();
            p3.d dVarN3 = aVar.getDrawContext();
            dVarN3.b(density);
            dVarN3.d(layoutDirection);
            dVarN3.e(h1VarF);
            dVarN3.g(jA);
            dVarN3.i(cVarH);
            i1Var.getAndroidCanvas().b(canvasA);
            this.isInvalidated = false;
        } catch (Throwable th4) {
            e0VarA.j();
            p3.d dVarN4 = aVar.getDrawContext();
            dVarN4.b(density);
            dVarN4.d(layoutDirection);
            dVarN4.e(h1VarF);
            dVarN4.g(jA);
            dVarN4.i(cVarH);
            throw th4;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    /* JADX INFO: renamed from: getCanUseCompositingLayer$ui_graphics, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final i1 getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l15, int t15, int r15, int b15) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z15) {
        if (this.canUseCompositingLayer != z15) {
            this.canUseCompositingLayer = z15;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z15) {
        this.isInvalidated = z15;
    }
}
