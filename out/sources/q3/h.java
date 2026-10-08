package q3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0082\u00012\u00020\u0001:\u0001;B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J;\u00101\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010M\u001a\n J*\u0004\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010BR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010&R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010&R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010>R\u0016\u0010`\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010b\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010_\u001a\u0004\bb\u0010\u0018\"\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010_R\u0016\u0010h\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010_R\u001a\u0010k\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010>\u001a\u0004\bj\u0010@R*\u0010p\u001a\u00020l2\u0006\u0010m\u001a\u00020l8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010&\u001a\u0004\bF\u0010o\"\u0004\bK\u0010\u0010R.\u0010v\u001a\u0004\u0018\u00010q2\b\u0010m\u001a\u0004\u0018\u00010q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\b=\u0010t\"\u0004\bA\u0010uR*\u0010\r\u001a\u00020\f2\u0006\u0010m\u001a\u00020\f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bw\u0010&\u001a\u0004\bU\u0010o\"\u0004\bx\u0010\u0010R*\u0010~\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u00108\u001a\u0004\b{\u0010|\"\u0004\bO\u0010}R\u0016\u0010\u007f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010_R0\u0010\u0084\u0001\u001a\u00030\u0080\u00012\u0007\u0010m\u001a\u00030\u0080\u00018\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\b\u001e\u0010>\u001a\u0005\b\u0081\u0001\u0010@\"\u0006\b\u0082\u0001\u0010\u0083\u0001R-\u0010\u0087\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0085\u0001\u00108\u001a\u0005\b\u0086\u0001\u0010|\"\u0004\bi\u0010}R.\u0010\u008a\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u00108\u001a\u0005\b\u0088\u0001\u0010|\"\u0005\b\u0089\u0001\u0010}R.\u0010\u008e\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u00108\u001a\u0005\b\u008c\u0001\u0010|\"\u0005\b\u008d\u0001\u0010}R,\u0010\u0090\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u008f\u0001\u00108\u001a\u0004\b>\u0010|\"\u0004\bX\u0010}R.\u0010\u0092\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u00108\u001a\u0005\b\u0091\u0001\u0010|\"\u0005\b\u008b\u0001\u0010}R.\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0007\u0010m\u001a\u00030\u0093\u00018\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b5\u0010>\u001a\u0004\bg\u0010@\"\u0005\be\u0010\u0083\u0001R.\u0010\u0095\u0001\u001a\u00030\u0093\u00012\u0007\u0010m\u001a\u00030\u0093\u00018\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b8\u0010>\u001a\u0004\b\u001e\u0010@\"\u0005\bw\u0010\u0083\u0001R-\u0010\u0098\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0096\u0001\u00108\u001a\u0005\b\u0097\u0001\u0010|\"\u0004\b\u001d\u0010}R,\u0010\u0099\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\bc\u00108\u001a\u0004\b\\\u0010|\"\u0005\b\u0085\u0001\u0010}R,\u0010\u009a\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b&\u00108\u001a\u0004\ba\u0010|\"\u0005\b\u008f\u0001\u0010}R\u001c\u0010\u009b\u0001\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\r\n\u0004\b>\u0010_\u001a\u0005\b\u0096\u0001\u0010\u0018R%\u0010\u009c\u0001\u001a\u00020y2\u0006\u0010m\u001a\u00020y8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010|\"\u0004\bz\u0010}R&\u0010\u009e\u0001\u001a\u00020\u00162\u0006\u0010m\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b\u009d\u0001\u0010\u0018\"\u0004\br\u0010dR5\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010m\u001a\u0005\u0018\u00010\u009f\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b \u0001\u0010¡\u0001\u001a\u0005\b;\u0010¢\u0001\"\u0005\b^\u0010£\u0001¨\u0006¤\u0001"}, d2 = {"Lq3/h;", "Lq3/d;", "Landroidx/compose/ui/graphics/layer/view/a;", "layerContainer", "", "ownerId", "Ln3/i1;", "canvasHolder", "Lp3/a;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/a;JLn3/i1;Lp3/a;)V", "Lq3/b;", "compositingStrategy", "Loq/i0;", "R", "(I)V", "Y", "()V", "Landroid/graphics/Paint;", "T", "()Landroid/graphics/Paint;", "", "V", "()Z", "W", "U", "X", "", "x", "y", "Lc5/r;", "size", "m", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lq3/c;", "layer", "Lkotlin/Function1;", "Lp3/f;", "block", "k", "(Lc5/d;Lc5/t;Lq3/c;Ler/l;)V", "Ln3/h1;", "canvas", "E", "(Ln3/h1;)V", "Landroid/graphics/Matrix;", "F", "()Landroid/graphics/Matrix;", "h", "b", "Landroidx/compose/ui/graphics/layer/view/a;", "c", "J", "getOwnerId", "()J", "d", "Ln3/i1;", "getCanvasHolder", "()Ln3/i1;", "Lq3/s;", "e", "Lq3/s;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "f", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "i", "Landroid/graphics/Picture;", "picture", "j", "Lp3/a;", "pictureDrawScope", "pictureCanvasHolder", "l", "n", "o", "Z", "clipBoundsInvalidated", "p", "isInvalidated", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Z)V", "q", "outlineIsProvided", "r", "clipToBounds", "s", "getLayerId", "layerId", "Ln3/a1;", "value", "t", "()I", "blendMode", "Ln3/n1;", "u", "Ln3/n1;", "()Ln3/n1;", "(Ln3/n1;)V", "colorFilter", "v", "O", "", "w", "a", "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "Lm3/e;", "getPivotOffset-F1C5BW0", "K", "(J)V", "pivotOffset", "z", "A", "scaleX", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, ip.a.f96138c, "scaleY", "B", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "N", "translationX", "C", "translationY", "Q", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "G", "M", "rotationX", "rotationY", "rotationZ", "supportsSoftwareRendering", "cameraDistance", ip.a.f96137b, "clip", "Ln3/u2;", "renderEffect", "Ln3/u2;", "()Ln3/u2;", "(Ln3/u2;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements d {
    public static final int L = 8;
    private static final boolean M = !r.f164089a.a();
    private static final Canvas N = new a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float shadowElevation;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long spotShadowColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final boolean supportsSoftwareRendering;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.graphics.layer.view.a layerContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i1 canvasHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s viewLayer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Rect clipRect;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Picture picture;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p3.a pictureDrawScope;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i1 pictureCanvasHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int x;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int y;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean clipBoundsInvalidated;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"q3/h$a", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Canvas {
        a() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public h(androidx.compose.ui.graphics.layer.view.a aVar, long j15, i1 i1Var, p3.a aVar2) {
        this.layerContainer = aVar;
        this.ownerId = j15;
        this.canvasHolder = i1Var;
        s sVar = new s(aVar, i1Var, aVar2);
        this.viewLayer = sVar;
        this.resources = aVar.getResources();
        this.clipRect = new Rect();
        boolean z15 = M;
        this.picture = z15 ? new Picture() : null;
        this.pictureDrawScope = z15 ? new p3.a() : null;
        this.pictureCanvasHolder = z15 ? new i1() : null;
        aVar.addView(sVar);
        sVar.setClipBounds(null);
        this.size = c5.r.INSTANCE.a();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = a1.INSTANCE.B();
        this.compositingStrategy = b.INSTANCE.a();
        this.alpha = 1.0f;
        this.pivotOffset = m3.e.INSTANCE.c();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion = Color.INSTANCE;
        this.ambientShadowColor = companion.a();
        this.spotShadowColor = companion.a();
        this.supportsSoftwareRendering = z15;
    }

    private final void R(int compositingStrategy) {
        s sVar = this.viewLayer;
        b.Companion companion = b.INSTANCE;
        boolean z15 = true;
        if (b.e(compositingStrategy, companion.c())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (b.e(compositingStrategy, companion.b())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z15 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        sVar.setCanUseCompositingLayer$ui_graphics(z15);
    }

    private final Paint T() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final void U() {
        try {
            i1 i1Var = this.canvasHolder;
            Canvas canvas = N;
            Canvas internalCanvas = i1Var.getAndroidCanvas().getInternalCanvas();
            i1Var.getAndroidCanvas().b(canvas);
            e0 androidCanvas = i1Var.getAndroidCanvas();
            androidx.compose.ui.graphics.layer.view.a aVar = this.layerContainer;
            s sVar = this.viewLayer;
            aVar.a(androidCanvas, sVar, sVar.getDrawingTime());
            i1Var.getAndroidCanvas().b(internalCanvas);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean V() {
        return b.e(getCompositingStrategy(), b.INSTANCE.c()) || W();
    }

    private final boolean W() {
        return (a1.E(getBlendMode(), a1.INSTANCE.B()) && getColorFilter() == null) ? false : true;
    }

    private final void X() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            s sVar = this.viewLayer;
            if (!S() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            sVar.setClipBounds(rect);
        }
    }

    private final void Y() {
        if (V()) {
            R(b.INSTANCE.c());
        } else {
            R(getCompositingStrategy());
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
        this.viewLayer.setElevation(f15);
    }

    @Override // q3.d
    public void C(float f15) {
        this.rotationZ = f15;
        this.viewLayer.setRotation(f15);
    }

    @Override // q3.d
    public void D(float f15) {
        this.scaleY = f15;
        this.viewLayer.setScaleY(f15);
    }

    @Override // q3.d
    public void E(h1 canvas) {
        X();
        Canvas canvasD = f0.d(canvas);
        if (canvasD.isHardwareAccelerated()) {
            androidx.compose.ui.graphics.layer.view.a aVar = this.layerContainer;
            s sVar = this.viewLayer;
            aVar.a(canvas, sVar, sVar.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                canvasD.drawPicture(picture);
            }
        }
    }

    @Override // q3.d
    public Matrix F() {
        return this.viewLayer.getMatrix();
    }

    @Override // q3.d
    /* JADX INFO: renamed from: G, reason: from getter */
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // q3.d
    public void H(boolean z15) {
        this.isInvalidated = z15;
    }

    @Override // q3.d
    public void I(Outline outline, long outlineSize) {
        boolean zD = this.viewLayer.d(outline);
        if (S() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (zD) {
            return;
        }
        this.viewLayer.invalidate();
        U();
    }

    @Override // q3.d
    /* JADX INFO: renamed from: J, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // q3.d
    public void K(long j15) {
        this.pivotOffset = j15;
        if ((9223372034707292159L & j15) != 9205357640488583168L) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j15 >> 32)));
            this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                t.f164104a.a(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.viewLayer.setPivotY(((int) (BodyPartID.bodyIdMax & this.size)) / 2.0f);
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
        this.viewLayer.setTranslationX(f15);
    }

    @Override // q3.d
    public void O(int i15) {
        this.compositingStrategy = i15;
        Y();
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

    public boolean S() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
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
        T().setColorFilter(n1Var != null ? g0.b(n1Var) : null);
        Y();
    }

    @Override // q3.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // q3.d
    public void f(int i15) {
        this.blendMode = i15;
        T().setXfermode(new PorterDuffXfermode(d0.b(i15)));
        Y();
    }

    @Override // q3.d
    public void g(float f15) {
        this.alpha = f15;
        this.viewLayer.setAlpha(f15);
    }

    @Override // q3.d
    public void h() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // q3.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // q3.d
    public void j(float f15) {
        this.translationY = f15;
        this.viewLayer.setTranslationY(f15);
    }

    @Override // q3.d
    public void k(c5.d density, c5.t layoutDirection, c layer, er.l<? super p3.f, i0> block) {
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.c(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            U();
            Picture picture = this.picture;
            if (picture != null) {
                long j15 = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j15 >> 32), (int) (j15 & BodyPartID.bodyIdMax));
                try {
                    i1 i1Var = this.pictureCanvasHolder;
                    if (i1Var != null) {
                        Canvas internalCanvas = i1Var.getAndroidCanvas().getInternalCanvas();
                        i1Var.getAndroidCanvas().b(canvasBeginRecording);
                        e0 androidCanvas = i1Var.getAndroidCanvas();
                        p3.a aVar = this.pictureDrawScope;
                        if (aVar != null) {
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
                        }
                        i1Var.getAndroidCanvas().b(internalCanvas);
                        i0 i0Var = i0.f148189a;
                    }
                    picture.endRecording();
                } catch (Throwable th5) {
                    picture.endRecording();
                    throw th5;
                }
            }
        }
    }

    @Override // q3.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // q3.d
    public void m(int x15, int y15, long size) {
        if (c5.r.e(this.size, size)) {
            int i15 = this.x;
            if (i15 != x15) {
                this.viewLayer.offsetLeftAndRight(x15 - i15);
            }
            int i16 = this.y;
            if (i16 != y15) {
                this.viewLayer.offsetTopAndBottom(y15 - i16);
            }
        } else {
            if (S()) {
                this.clipBoundsInvalidated = true;
            }
            int i17 = (int) (size >> 32);
            int i18 = (int) (BodyPartID.bodyIdMax & size);
            this.viewLayer.layout(x15, y15, x15 + i17, y15 + i18);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i17 / 2.0f);
                this.viewLayer.setPivotY(i18 / 2.0f);
            }
        }
        this.x = x15;
        this.y = y15;
    }

    @Override // q3.d
    public void o(u2 u2Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            u.f164105a.a(this.viewLayer, u2Var);
        }
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
            t.f164104a.b(this.viewLayer, o1.j(j15));
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
        this.viewLayer.setScaleX(f15);
    }

    @Override // q3.d
    /* JADX INFO: renamed from: t */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // q3.d
    public void u(boolean z15) {
        boolean z16 = false;
        this.clipToBounds = z15 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        s sVar = this.viewLayer;
        if (z15 && this.outlineIsProvided) {
            z16 = true;
        }
        sVar.setClipToOutline(z16);
    }

    @Override // q3.d
    public void v(long j15) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j15;
            t.f164104a.c(this.viewLayer, o1.j(j15));
        }
    }

    @Override // q3.d
    public void w(float f15) {
        this.viewLayer.setCameraDistance(f15 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // q3.d
    public void x(float f15) {
        this.rotationX = f15;
        this.viewLayer.setRotationX(f15);
    }

    @Override // q3.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // q3.d
    public void z(float f15) {
        this.rotationY = f15;
        this.viewLayer.setRotationY(f15);
    }

    public /* synthetic */ h(androidx.compose.ui.graphics.layer.view.a aVar, long j15, i1 i1Var, p3.a aVar2, int i15, fr.k kVar) {
        this(aVar, j15, (i15 & 4) != 0 ? new i1() : i1Var, (i15 & 8) != 0 ? new p3.a() : aVar2);
    }
}
