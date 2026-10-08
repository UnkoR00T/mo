package q3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import n3.a1;
import n3.d0;
import n3.e0;
import n3.f0;
import n3.g0;
import n3.h1;
import n3.i1;
import n3.n1;
import n3.o1;
import n3.u2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import w0.k3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J;\u0010/\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u001e\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010:R\u0018\u0010H\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010IR\u0016\u0010M\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010T\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bP\u00106\u001a\u0004\bQ\u0010R\"\u0004\bF\u0010SR*\u0010X\u001a\u00020U2\u0006\u0010O\u001a\u00020U8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\bA\u0010V\"\u0004\bE\u0010WR.\u0010^\u001a\u0004\u0018\u00010Y2\b\u0010O\u001a\u0004\u0018\u00010Y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b=\u0010\\\"\u0004\b?\u0010]R*\u0010c\u001a\u00020_2\u0006\u0010O\u001a\u00020_8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010:\u001a\u0004\b`\u0010<\"\u0004\ba\u0010bR*\u0010g\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bd\u00106\u001a\u0004\be\u0010R\"\u0004\bf\u0010SR*\u0010k\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u00106\u001a\u0004\bi\u0010R\"\u0004\bj\u0010SR*\u0010o\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u00106\u001a\u0004\bm\u0010R\"\u0004\bn\u0010SR*\u0010q\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u00106\u001a\u0004\b:\u0010R\"\u0004\bP\u0010SR*\u0010u\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u00106\u001a\u0004\bs\u0010R\"\u0004\bt\u0010SR*\u0010w\u001a\u00020v2\u0006\u0010O\u001a\u00020v8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010:\u001a\u0004\br\u0010<\"\u0004\bp\u0010bR*\u0010z\u001a\u00020v2\u0006\u0010O\u001a\u00020v8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010:\u001a\u0004\b\u001c\u0010<\"\u0004\by\u0010bR*\u0010}\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b{\u00106\u001a\u0004\b|\u0010R\"\u0004\b\u001b\u0010SR*\u0010\u007f\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u00106\u001a\u0004\bZ\u0010R\"\u0004\b~\u0010SR-\u0010\u0082\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0080\u0001\u00106\u001a\u0004\bl\u0010R\"\u0005\b\u0081\u0001\u0010SR,\u0010\u0083\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001b\u00106\u001a\u0004\bx\u0010R\"\u0005\b\u0080\u0001\u0010SR-\u0010\u0086\u0001\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b\u001c\u0010L\u001a\u0005\b\u0084\u0001\u0010\u0018\"\u0005\b{\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010LR\u0017\u0010\u0088\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010LR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\bt\u0010$\u001a\u0004\bK\u0010V\"\u0005\b\u0089\u0001\u0010WR'\u0010\u008a\u0001\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010L\u001a\u0005\b\u008a\u0001\u0010\u0018\"\u0006\b\u008b\u0001\u0010\u0085\u0001R5\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010O\u001a\u0005\u0018\u00010\u008c\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\b9\u0010\u008f\u0001\"\u0005\bh\u0010\u0090\u0001R\u0015\u0010\u0091\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u0018¨\u0006\u0092\u0001"}, d2 = {"Lq3/g;", "Lq3/d;", "", "ownerId", "Ln3/i1;", "canvasHolder", "Lp3/a;", "canvasDrawScope", "<init>", "(JLn3/i1;Lp3/a;)V", "Loq/i0;", "R", "()V", "Landroid/graphics/RenderNode;", "Lq3/b;", "compositingStrategy", ip.a.f96137b, "(Landroid/graphics/RenderNode;I)V", "X", "Landroid/graphics/Paint;", "U", "()Landroid/graphics/Paint;", "", "V", "()Z", "W", "", "x", "y", "Lc5/r;", "size", "m", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lq3/c;", "layer", "Lkotlin/Function1;", "Lp3/f;", "block", "k", "(Lc5/d;Lc5/t;Lq3/c;Ler/l;)V", "Ln3/h1;", "canvas", "E", "(Ln3/h1;)V", "Landroid/graphics/Matrix;", "F", "()Landroid/graphics/Matrix;", "h", "b", "J", "getOwnerId", "()J", "c", "Ln3/i1;", "d", "Lp3/a;", "e", "Landroid/graphics/RenderNode;", "renderNode", "Lm3/k;", "f", "g", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "", "value", "j", "a", "()F", "(F)V", "alpha", "Ln3/a1;", "()I", "(I)V", "blendMode", "Ln3/n1;", "l", "Ln3/n1;", "()Ln3/n1;", "(Ln3/n1;)V", "colorFilter", "Lm3/e;", "getPivotOffset-F1C5BW0", "K", "(J)V", "pivotOffset", "n", "A", "s", "scaleX", "o", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, ip.a.f96138c, "scaleY", "p", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "N", "translationX", "q", "translationY", "r", "Q", "B", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "t", "v", "spotShadowColor", "u", "M", "rotationX", "z", "rotationY", "w", "C", "rotationZ", "cameraDistance", "T", "(Z)V", "clip", "clipToBounds", "clipToOutline", "O", "isInvalidated", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Ln3/u2;", "renderEffect", "Ln3/u2;", "()Ln3/u2;", "(Ln3/u2;)V", "hasDisplayList", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i1 canvasHolder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p3.a canvasDrawScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Matrix matrix;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    public g(long j15, i1 i1Var, p3.a aVar) {
        this.ownerId = j15;
        this.canvasHolder = i1Var;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeA = k3.a("graphicsLayer");
        this.renderNode = renderNodeA;
        this.size = m3.k.INSTANCE.b();
        renderNodeA.setClipToBounds(false);
        b.Companion companion = b.INSTANCE;
        S(renderNodeA, companion.a());
        this.alpha = 1.0f;
        this.blendMode = a1.INSTANCE.B();
        this.pivotOffset = m3.e.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion2 = Color.INSTANCE;
        this.ambientShadowColor = companion2.a();
        this.spotShadowColor = companion2.a();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.a();
        this.isInvalidated = true;
    }

    private final void R() {
        boolean z15 = false;
        boolean z16 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z15 = true;
        }
        if (z16 != this.clipToBounds) {
            this.clipToBounds = z16;
            this.renderNode.setClipToBounds(z16);
        }
        if (z15 != this.clipToOutline) {
            this.clipToOutline = z15;
            this.renderNode.setClipToOutline(z15);
        }
    }

    private final void S(RenderNode renderNode, int i15) {
        b.Companion companion = b.INSTANCE;
        if (b.e(i15, companion.c())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.e(i15, companion.b())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint U() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean V() {
        if (b.e(getCompositingStrategy(), b.INSTANCE.c()) || W()) {
            return true;
        }
        b();
        return false;
    }

    private final boolean W() {
        return (a1.E(getBlendMode(), a1.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void X() {
        if (V()) {
            S(this.renderNode, b.INSTANCE.c());
        } else {
            S(this.renderNode, getCompositingStrategy());
        }
    }

    @Override // q3.d
    /* JADX INFO: renamed from: A, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // q3.d
    public void B(float f15) {
        this.shadowElevation = f15;
        this.renderNode.setElevation(f15);
    }

    @Override // q3.d
    public void C(float f15) {
        this.rotationZ = f15;
        this.renderNode.setRotationZ(f15);
    }

    @Override // q3.d
    public void D(float f15) {
        this.scaleY = f15;
        this.renderNode.setScaleY(f15);
    }

    @Override // q3.d
    public void E(h1 canvas) {
        f0.d(canvas).drawRenderNode(this.renderNode);
    }

    @Override // q3.d
    public Matrix F() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // q3.d
    public void H(boolean z15) {
        this.isInvalidated = z15;
    }

    @Override // q3.d
    public void I(Outline outline, long outlineSize) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        R();
    }

    @Override // q3.d
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // q3.d
    public void K(long j15) {
        this.pivotOffset = j15;
        if ((9223372034707292159L & j15) == 9205357640488583168L) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j15 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
        }
    }

    @Override // q3.d
    /* JADX INFO: renamed from: L, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // q3.d
    /* JADX INFO: renamed from: M, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // q3.d
    public void N(float f15) {
        this.translationX = f15;
        this.renderNode.setTranslationX(f15);
    }

    @Override // q3.d
    public void O(int i15) {
        this.compositingStrategy = i15;
        X();
    }

    @Override // q3.d
    /* JADX INFO: renamed from: P, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // q3.d
    /* JADX INFO: renamed from: Q, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // q3.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // q3.d
    public u2 b() {
        return null;
    }

    @Override // q3.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public n1 getColorFilter() {
        return this.colorFilter;
    }

    @Override // q3.d
    public void d(n1 n1Var) {
        this.colorFilter = n1Var;
        U().setColorFilter(n1Var != null ? g0.b(n1Var) : null);
        X();
    }

    @Override // q3.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // q3.d
    public void f(int i15) {
        this.blendMode = i15;
        U().setBlendMode(d0.a(i15));
        X();
    }

    @Override // q3.d
    public void g(float f15) {
        this.alpha = f15;
        this.renderNode.setAlpha(f15);
    }

    @Override // q3.d
    public void h() {
        this.renderNode.discardDisplayList();
    }

    @Override // q3.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // q3.d
    public void j(float f15) {
        this.translationY = f15;
        this.renderNode.setTranslationY(f15);
    }

    @Override // q3.d
    public void k(c5.d density, c5.t layoutDirection, c layer, er.l<? super p3.f, i0> block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            i1 i1Var = this.canvasHolder;
            Canvas internalCanvas = i1Var.getAndroidCanvas().getInternalCanvas();
            i1Var.getAndroidCanvas().b(recordingCanvasBeginRecording);
            e0 androidCanvas = i1Var.getAndroidCanvas();
            p3.d drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.b(density);
            drawContext.d(layoutDirection);
            drawContext.i(layer);
            drawContext.g(this.size);
            drawContext.e(androidCanvas);
            block.b(this.canvasDrawScope);
            i1Var.getAndroidCanvas().b(internalCanvas);
            this.renderNode.endRecording();
            H(false);
        } catch (Throwable th4) {
            this.renderNode.endRecording();
            throw th4;
        }
    }

    @Override // q3.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // q3.d
    public void m(int x15, int y15, long size) {
        this.renderNode.setPosition(x15, y15, ((int) (size >> 32)) + x15, ((int) (BodyPartID.bodyIdMax & size)) + y15);
        this.size = c5.s.e(size);
    }

    @Override // q3.d
    public boolean n() {
        return this.renderNode.hasDisplayList();
    }

    @Override // q3.d
    public void o(u2 u2Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            q.f164088a.a(this.renderNode, u2Var);
        }
    }

    @Override // q3.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // q3.d
    public void q(long j15) {
        this.ambientShadowColor = j15;
        this.renderNode.setAmbientShadowColor(o1.j(j15));
    }

    @Override // q3.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // q3.d
    public void s(float f15) {
        this.scaleX = f15;
        this.renderNode.setScaleX(f15);
    }

    @Override // q3.d
    /* JADX INFO: renamed from: t, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // q3.d
    public void u(boolean z15) {
        this.clip = z15;
        R();
    }

    @Override // q3.d
    public void v(long j15) {
        this.spotShadowColor = j15;
        this.renderNode.setSpotShadowColor(o1.j(j15));
    }

    @Override // q3.d
    public void w(float f15) {
        this.cameraDistance = f15;
        this.renderNode.setCameraDistance(f15);
    }

    @Override // q3.d
    public void x(float f15) {
        this.rotationX = f15;
        this.renderNode.setRotationX(f15);
    }

    @Override // q3.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // q3.d
    public void z(float f15) {
        this.rotationY = f15;
        this.renderNode.setRotationY(f15);
    }

    public /* synthetic */ g(long j15, i1 i1Var, p3.a aVar, int i15, fr.k kVar) {
        this(j15, (i15 & 2) != 0 ? new i1() : i1Var, (i15 & 4) != 0 ? new p3.a() : aVar);
    }
}
