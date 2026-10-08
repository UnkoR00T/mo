package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m3.MutableRect;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002-1J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J7\u0010&\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010 J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010 J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010 J\u001f\u0010-\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J9\u00107\u001a\u00020\u00062\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0006032\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b%\u0010;J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010 J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010 R\u0017\u0010G\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010L\u001a\u00020H8\u0006¢\u0006\f\n\u0004\b%\u0010I\u001a\u0004\bJ\u0010KR,\u00104\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010MR\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010NR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010PR\u0016\u0010S\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010UR*\u0010[\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010R\u001a\u0004\bX\u0010\u000b\"\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u0016\u0010^\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010RR\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010`R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00010b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010o\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010R\u001a\u0004\bo\u0010\u000b\"\u0004\bp\u0010ZR\u0016\u0010t\u001a\u00020q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010RR\u001a\u0010z\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010s\u001a\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010{R\u0014\u0010\u007f\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020v8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010yR'\u0010\u0084\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010j\"\u0005\b\u0083\u0001\u0010lR\u001a\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/ui/platform/g3;", "Landroid/view/View;", "Lg4/a1;", "", "Ln3/v2;", "scope", "Loq/i0;", "f", "(Ln3/v2;)V", "", "hasOverlappingRendering", "()Z", "Lm3/e;", "position", "g", "(J)Z", "Lc5/r;", "size", "e", "(J)V", "Lc5/n;", "j", "Ln3/h1;", "canvas", "Lq3/c;", "parentLayer", "l", "(Ln3/h1;Lq3/c;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "k", "forceLayout", "point", "inverse", "d", "(JZ)J", "Lm3/c;", "rect", "c", "(Lm3/c;Z)V", "Lkotlin/Function2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "h", "(Ler/p;Ler/a;)V", "Ln3/g2;", "matrix", "([F)V", "i", "Ln3/k2;", "v", "()Ln3/k2;", "x", "w", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/m1;", "Landroidx/compose/ui/platform/m1;", "getContainer", "()Landroidx/compose/ui/platform/m1;", "container", "Ler/p;", "Ler/a;", "Landroidx/compose/ui/platform/g2;", "Landroidx/compose/ui/platform/g2;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "u", "setInvalidated", "(Z)V", "isInvalidated", "Ln3/k2;", "layerPaint", "drawnWithZ", "Ln3/i1;", "Ln3/i1;", "canvasHolder", "Landroidx/compose/ui/platform/z1;", "m", "Landroidx/compose/ui/platform/z1;", "matrixCache", "", "n", "F", "getFrameRate", "()F", "setFrameRate", "(F)V", "frameRate", "p", "isFrameRateFromParent", "setFrameRateFromParent", "Ln3/d3;", "q", "J", "mTransformOrigin", "mHasOverlappingRendering", "", "s", "getLayerId", "()J", "layerId", "I", "mutatedFields", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "setCameraDistancePx", "cameraDistancePx", "Ln3/m2;", "getManualClipPath", "()Ln3/m2;", "manualClipPath", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class g3 extends View implements g4.a1 {
    private static Field A;
    private static boolean B;
    private static boolean C;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f10568w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final er.p<View, Matrix, oq.i0> f10569x = b.f10590b;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final ViewOutlineProvider f10570y = new a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static Method f10571z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m1 container;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private er.p<? super n3.h1, ? super q3.c, oq.i0> drawBlock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private er.a<oq.i0> invalidateParentLayer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g2 outlineResolver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Rect clipBoundsCache;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private n3.k2 layerPaint;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final n3.i1 canvasHolder;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final z1<View> matrixCache;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float frameRate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isFrameRateFromParent;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long mTransformOrigin;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean mHasOverlappingRendering;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/g3$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Loq/i0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.set(((g3) view).outlineResolver.b());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Loq/i0;", "c", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.p<View, Matrix, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f10590b = new b();

        b() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(View view, Matrix matrix) {
            c(view, matrix);
            return oq.i0.f148189a;
        }

        public final void c(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.g3$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/g3$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "Loq/i0;", "d", "(Landroid/view/View;)V", "", "value", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Ler/p;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final boolean a() {
            return g3.B;
        }

        public final boolean b() {
            return g3.C;
        }

        public final void c(boolean z15) {
            g3.C = z15;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            try {
                if (!a()) {
                    g3.B = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        g3.f10571z = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        g3.A = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        g3.f10571z = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        g3.A = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = g3.f10571z;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = g3.A;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = g3.A;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = g3.f10571z;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/g3$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f10591a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    private final n3.m2 getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.e()) {
            return null;
        }
        return this.outlineResolver.d();
    }

    private final void setInvalidated(boolean z15) {
        if (z15 != this.isInvalidated) {
            this.isInvalidated = z15;
            this.ownerView.a1(this, z15);
        }
    }

    private final n3.k2 v() {
        n3.k2 k2Var = this.layerPaint;
        if (k2Var != null) {
            return k2Var;
        }
        n3.k2 k2VarA = n3.o0.a();
        this.layerPaint = k2VarA;
        return k2VarA;
    }

    private final void w() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void x() {
        setOutlineProvider(this.outlineResolver.b() != null ? f10570y : null);
    }

    @Override // g4.a1
    public void b(float[] matrix) {
        n3.g2.p(matrix, this.matrixCache.b(this));
    }

    @Override // g4.a1
    public void c(MutableRect rect, boolean inverse) {
        if (inverse) {
            this.matrixCache.f(this, rect);
        } else {
            this.matrixCache.d(this, rect);
        }
    }

    @Override // g4.a1
    public long d(long point, boolean inverse) {
        return inverse ? this.matrixCache.g(this, point) : this.matrixCache.e(this, point);
    }

    @Override // g4.a1
    public void destroy() {
        setInvalidated(false);
        this.ownerView.j1();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.g1(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z15;
        n3.i1 i1Var = this.canvasHolder;
        Canvas internalCanvas = i1Var.getAndroidCanvas().getInternalCanvas();
        i1Var.getAndroidCanvas().b(canvas);
        n3.e0 androidCanvas = i1Var.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z15 = false;
        } else {
            androidCanvas.q();
            this.outlineResolver.a(androidCanvas);
            z15 = true;
        }
        er.p<? super n3.h1, ? super q3.c, oq.i0> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.B(androidCanvas, null);
        }
        if (z15) {
            androidCanvas.j();
        }
        i1Var.getAndroidCanvas().b(internalCanvas);
        setInvalidated(false);
    }

    @Override // g4.a1
    public void e(long size) {
        int i15 = (int) (size >> 32);
        int i16 = (int) (size & BodyPartID.bodyIdMax);
        if (i15 == getWidth() && i16 == getHeight()) {
            return;
        }
        setPivotX(n3.d3.f(this.mTransformOrigin) * i15);
        setPivotY(n3.d3.g(this.mTransformOrigin) * i16);
        x();
        layout(getLeft(), getTop(), getLeft() + i15, getTop() + i16);
        w();
        this.matrixCache.c();
    }

    @Override // g4.a1
    public void f(n3.v2 scope) {
        er.a<oq.i0> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        if ((mutatedFields & PKIFailureInfo.certConfirmed) != 0) {
            long transformOrigin = scope.getTransformOrigin();
            this.mTransformOrigin = transformOrigin;
            setPivotX(n3.d3.f(transformOrigin) * getWidth());
            setPivotY(n3.d3.g(this.mTransformOrigin) * getHeight());
        }
        if ((mutatedFields & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((mutatedFields & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z15 = false;
        boolean z16 = getManualClipPath() != null;
        boolean z17 = scope.getClip() && scope.getShape() != n3.t2.a();
        if ((mutatedFields & 24576) != 0) {
            this.clipToBounds = scope.getClip() && scope.getShape() == n3.t2.a();
            w();
            setClipToOutline(z17);
        }
        boolean zG = this.outlineResolver.g(scope.getOutline(), scope.getAlpha(), z17, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.c()) {
            x();
        }
        boolean z18 = getManualClipPath() != null;
        if (z16 != z18 || (z18 && zG)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.a();
        }
        if ((mutatedFields & 7963) != 0) {
            this.matrixCache.c();
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 28) {
            if ((mutatedFields & 64) != 0) {
                h3.f10609a.a(this, n3.o1.j(scope.getAmbientShadowColor()));
            }
            if ((mutatedFields & 128) != 0) {
                h3.f10609a.b(this, n3.o1.j(scope.getSpotShadowColor()));
            }
        }
        Paint paintF = null;
        if (i15 >= 31 && (131072 & mutatedFields) != 0) {
            i3 i3Var = i3.f10623a;
            scope.G();
            i3Var.a(this, null);
        }
        boolean z19 = ((262144 & mutatedFields) == 0 && (524288 & mutatedFields) == 0) ? false : true;
        if ((mutatedFields & 32768) != 0 || z19) {
            int iC = z19 ? n3.u1.INSTANCE.c() : scope.getCompositingStrategy();
            n3.u1.Companion companion = n3.u1.INSTANCE;
            if (n3.u1.e(iC, companion.c())) {
                if (z19) {
                    n3.k2 k2VarV = v();
                    k2VarV.d(scope.getColorFilter());
                    k2VarV.f(scope.getBlendMode());
                    paintF = n3.o0.f(k2VarV);
                }
                setLayerType(2, paintF);
            } else {
                if (n3.u1.e(iC, companion.b())) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.mHasOverlappingRendering = z15;
            }
            z15 = true;
            this.mHasOverlappingRendering = z15;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // g4.a1
    public boolean g(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & position));
        if (this.clipToBounds) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final m1 getContainer() {
        return this.container;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.ownerView);
        }
        return -1L;
    }

    @Override // g4.a1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo27getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.b(this);
    }

    @Override // g4.a1
    public void h(er.p<? super n3.h1, ? super q3.c, oq.i0> drawBlock, er.a<oq.i0> invalidateParentLayer) {
        this.container.addView(this);
        this.matrixCache.h();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = n3.d3.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        setInvalidated(false);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // g4.a1
    public void i(float[] matrix) {
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            n3.g2.p(matrix, fArrA);
        }
    }

    @Override // android.view.View, g4.a1
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // g4.a1
    public void j(long position) {
        int i15 = c5.n.i(position);
        if (i15 != getLeft()) {
            offsetLeftAndRight(i15 - getLeft());
            this.matrixCache.c();
        }
        int iJ = c5.n.j(position);
        if (iJ != getTop()) {
            offsetTopAndBottom(iJ - getTop());
            this.matrixCache.c();
        }
    }

    @Override // g4.a1
    public void k() {
        if (!this.isInvalidated || C) {
            return;
        }
        INSTANCE.d(this);
        setInvalidated(false);
    }

    @Override // g4.a1
    public void l(n3.h1 canvas, q3.c parentLayer) {
        boolean z15 = getElevation() > 0.0f;
        this.drawnWithZ = z15;
        if (z15) {
            canvas.l();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.s();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l15, int t15, int r15, int b15) {
    }

    public final void setCameraDistancePx(float f15) {
        setCameraDistance(f15 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f15) {
        this.frameRate = f15;
    }

    public void setFrameRateFromParent(boolean z15) {
        this.isFrameRateFromParent = z15;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }
}
