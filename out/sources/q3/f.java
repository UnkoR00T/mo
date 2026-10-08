package q3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import java.util.concurrent.atomic.AtomicBoolean;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001_B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J;\u00103\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001100H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010\u0018J\u000f\u0010=\u001a\u00020\u0011H\u0000¢\u0006\u0004\b=\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010?R\u0018\u0010K\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010LR\u0016\u0010P\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010'\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010?R*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\bN\u0010S\"\u0004\bT\u0010\u0013R*\u0010W\u001a\u00020U2\u0006\u0010R\u001a\u00020U8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010(\u001a\u0004\bF\u0010S\"\u0004\bH\u0010\u0013R.\u0010\\\u001a\u0004\u0018\u00010X2\b\u0010R\u001a\u0004\u0018\u00010X8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010Y\u001a\u0004\bB\u0010Z\"\u0004\bD\u0010[R*\u0010b\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010:\u001a\u0004\b_\u0010`\"\u0004\bI\u0010aR\u0016\u0010d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010OR*\u0010j\u001a\u00020e2\u0006\u0010R\u001a\u00020e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010?\u001a\u0004\bg\u0010A\"\u0004\bh\u0010iR*\u0010n\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010:\u001a\u0004\bl\u0010`\"\u0004\bm\u0010aR*\u0010r\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010:\u001a\u0004\bp\u0010`\"\u0004\bq\u0010aR*\u0010u\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010:\u001a\u0004\bs\u0010`\"\u0004\bt\u0010aR*\u0010w\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010:\u001a\u0004\b?\u0010`\"\u0004\bQ\u0010aR*\u0010{\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010:\u001a\u0004\by\u0010`\"\u0004\bz\u0010aR*\u0010~\u001a\u00020|2\u0006\u0010R\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b}\u0010?\u001a\u0004\bo\u0010A\"\u0004\bk\u0010iR+\u0010\u0080\u0001\u001a\u00020|2\u0006\u0010R\u001a\u00020|8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u007f\u0010?\u001a\u0004\b \u0010A\"\u0004\b}\u0010iR,\u0010\u0082\u0001\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001f\u0010:\u001a\u0005\b\u0081\u0001\u0010`\"\u0004\b\u001f\u0010aR,\u0010\u0084\u0001\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b \u0010:\u001a\u0004\bV\u0010`\"\u0005\b\u0083\u0001\u0010aR-\u0010\u0086\u0001\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0083\u0001\u0010:\u001a\u0004\bf\u0010`\"\u0005\b\u0085\u0001\u0010aR+\u0010\u0087\u0001\u001a\u00020]2\u0006\u0010R\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010:\u001a\u0004\bv\u0010`\"\u0004\b\u007f\u0010aR-\u0010\u008a\u0001\u001a\u00020\u00142\u0006\u0010R\u001a\u00020\u00148\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\bz\u0010O\u001a\u0005\b\u0088\u0001\u0010\u0016\"\u0005\bx\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010OR\u0017\u0010\u008c\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010OR&\u0010\u008d\u0001\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0004\b7\u0010O\u001a\u0005\b\u008d\u0001\u0010\u0016\"\u0006\b\u008e\u0001\u0010\u0089\u0001R*\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b>\u0010\u0092\u0001\"\u0005\bc\u0010\u0093\u0001R\u0015\u0010\u0094\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0016¨\u0006\u0095\u0001"}, d2 = {"Lq3/f;", "Lq3/d;", "Landroid/view/View;", "ownerView", "", "ownerId", "Ln3/i1;", "canvasHolder", "Lp3/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLn3/i1;Lp3/a;)V", "Landroid/graphics/Paint;", "V", "()Landroid/graphics/Paint;", "Lq3/b;", "compositingStrategy", "Loq/i0;", ip.a.f96137b, "(I)V", "", "W", "()Z", "X", "()V", "R", "Landroid/view/RenderNode;", "renderNode", "Y", "(Landroid/view/RenderNode;)V", "", "x", "y", "Lc5/r;", "size", "m", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lq3/c;", "layer", "Lkotlin/Function1;", "Lp3/f;", "block", "k", "(Lc5/d;Lc5/t;Lq3/c;Ler/l;)V", "Ln3/h1;", "canvas", "E", "(Ln3/h1;)V", "Landroid/graphics/Matrix;", "F", "()Landroid/graphics/Matrix;", "h", "T", "b", "J", "getOwnerId", "()J", "c", "Ln3/i1;", "d", "Lp3/a;", "e", "Landroid/view/RenderNode;", "f", "g", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "j", "value", "()I", "O", "Ln3/a1;", "l", "blendMode", "Ln3/n1;", "Ln3/n1;", "()Ln3/n1;", "(Ln3/n1;)V", "colorFilter", "", "n", "a", "()F", "(F)V", "alpha", "o", "shouldManuallySetCenterPivot", "Lm3/e;", "p", "getPivotOffset-F1C5BW0", "K", "(J)V", "pivotOffset", "q", "A", "s", "scaleX", "r", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, ip.a.f96138c, "scaleY", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "N", "translationX", "t", "translationY", "u", "Q", "B", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "v", "ambientShadowColor", "w", "spotShadowColor", "M", "rotationX", "z", "rotationY", "C", "rotationZ", "cameraDistance", "U", "(Z)V", "clip", "clipToBounds", "clipToOutline", "isInvalidated", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Ln3/u2;", "renderEffect", "Ln3/u2;", "()Ln3/u2;", "(Ln3/u2;)V", "hasDisplayList", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements d {
    private static boolean H;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean clipToOutline;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
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
    private long outlineSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;
    public static final int G = 8;
    private static final AtomicBoolean I = new AtomicBoolean(true);

    public f(View view, long j15, i1 i1Var, p3.a aVar) {
        this.ownerId = j15;
        this.canvasHolder = i1Var;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        c5.r.Companion companion = c5.r.INSTANCE;
        this.size = companion.a();
        this.outlineSize = companion.a();
        if (I.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            Y(renderNodeCreate);
            T();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (H) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        b.Companion companion2 = b.INSTANCE;
        S(companion2.a());
        this.compositingStrategy = companion2.a();
        this.blendMode = a1.INSTANCE.B();
        this.alpha = 1.0f;
        this.pivotOffset = m3.e.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion3 = Color.INSTANCE;
        this.ambientShadowColor = companion3.a();
        this.spotShadowColor = companion3.a();
        this.cameraDistance = 8.0f;
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

    private final void S(int compositingStrategy) {
        RenderNode renderNode = this.renderNode;
        b.Companion companion = b.INSTANCE;
        if (b.e(compositingStrategy, companion.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (b.e(compositingStrategy, companion.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint V() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean W() {
        return (!b.e(getCompositingStrategy(), b.INSTANCE.c()) && a1.E(getBlendMode(), a1.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void X() {
        if (W()) {
            S(b.INSTANCE.c());
        } else {
            S(getCompositingStrategy());
        }
    }

    private final void Y(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            p pVar = p.f164087a;
            pVar.c(renderNode, pVar.a(renderNode));
            pVar.d(renderNode, pVar.b(renderNode));
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
        this.renderNode.setRotation(f15);
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
        this.outlineSize = outlineSize;
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
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.renderNode.setPivotY(((int) (BodyPartID.bodyIdMax & this.size)) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
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

    public final void T() {
        o.f164086a.a(this.renderNode);
    }

    /* JADX INFO: renamed from: U, reason: from getter */
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
        if (n1Var == null) {
            X();
            return;
        }
        S(b.INSTANCE.c());
        RenderNode renderNode = this.renderNode;
        Paint paintV = V();
        paintV.setColorFilter(g0.b(n1Var));
        renderNode.setLayerPaint(paintV);
    }

    @Override // q3.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // q3.d
    public void f(int i15) {
        if (a1.E(this.blendMode, i15)) {
            return;
        }
        this.blendMode = i15;
        V().setXfermode(new PorterDuffXfermode(d0.b(i15)));
        X();
    }

    @Override // q3.d
    public void g(float f15) {
        this.alpha = f15;
        this.renderNode.setAlpha(f15);
    }

    @Override // q3.d
    public void h() {
        T();
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
        Canvas canvasStart = this.renderNode.start(Math.max((int) (this.size >> 32), (int) (this.outlineSize >> 32)), Math.max((int) (this.size & BodyPartID.bodyIdMax), (int) (this.outlineSize & BodyPartID.bodyIdMax)));
        try {
            i1 i1Var = this.canvasHolder;
            Canvas internalCanvas = i1Var.getAndroidCanvas().getInternalCanvas();
            i1Var.getAndroidCanvas().b(canvasStart);
            e0 androidCanvas = i1Var.getAndroidCanvas();
            p3.a aVar = this.canvasDrawScope;
            long jE = c5.s.e(this.size);
            c5.d density2 = aVar.getDrawContext().getDensity();
            c5.t layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
            h1 h1VarF = aVar.getDrawContext().f();
            long jA = aVar.getDrawContext().a();
            c graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
            p3.d drawContext = aVar.getDrawContext();
            drawContext.b(density);
            drawContext.d(layoutDirection);
            drawContext.e(androidCanvas);
            drawContext.g(jE);
            drawContext.i(layer);
            androidCanvas.q();
            try {
                block.b(aVar);
                androidCanvas.j();
                p3.d drawContext2 = aVar.getDrawContext();
                drawContext2.b(density2);
                drawContext2.d(layoutDirection2);
                drawContext2.e(h1VarF);
                drawContext2.g(jA);
                drawContext2.i(graphicsLayer);
                i1Var.getAndroidCanvas().b(internalCanvas);
                this.renderNode.end(canvasStart);
                H(false);
            } catch (Throwable th4) {
                androidCanvas.j();
                p3.d drawContext3 = aVar.getDrawContext();
                drawContext3.b(density2);
                drawContext3.d(layoutDirection2);
                drawContext3.e(h1VarF);
                drawContext3.g(jA);
                drawContext3.i(graphicsLayer);
                throw th4;
            }
        } catch (Throwable th5) {
            this.renderNode.end(canvasStart);
            throw th5;
        }
    }

    @Override // q3.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // q3.d
    public void m(int x15, int y15, long size) {
        int i15 = (int) (size >> 32);
        int i16 = (int) (BodyPartID.bodyIdMax & size);
        this.renderNode.setLeftTopRightBottom(x15, y15, x15 + i15, y15 + i16);
        if (c5.r.e(this.size, size)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(i15 / 2.0f);
            this.renderNode.setPivotY(i16 / 2.0f);
        }
        this.size = size;
    }

    @Override // q3.d
    public boolean n() {
        return this.renderNode.isValid();
    }

    @Override // q3.d
    public void o(u2 u2Var) {
    }

    @Override // q3.d
    /* JADX INFO: renamed from: p, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // q3.d
    public void q(long j15) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j15;
            p.f164087a.c(this.renderNode, o1.j(j15));
        }
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j15;
            p.f164087a.d(this.renderNode, o1.j(j15));
        }
    }

    @Override // q3.d
    public void w(float f15) {
        this.cameraDistance = f15;
        this.renderNode.setCameraDistance(-f15);
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

    public /* synthetic */ f(View view, long j15, i1 i1Var, p3.a aVar, int i15, fr.k kVar) {
        this(view, j15, (i15 & 4) != 0 ? new i1() : i1Var, (i15 & 8) != 0 ? new p3.a() : aVar);
    }
}
