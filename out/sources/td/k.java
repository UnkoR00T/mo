package td;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w0.k3;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    private static final Matrix B = new Matrix();
    private td.b A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f189604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f189605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f189606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RectF f189607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f189608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f189609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RectF f189610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f189611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f189612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f189613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f189614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Bitmap f189615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Canvas f189616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Rect f189617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private gd.a f189618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Matrix f189619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float[] f189620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Bitmap f189621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bitmap f189622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Canvas f189623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Canvas f189624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private gd.a f189625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private BlurMaskFilter f189626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f189627x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RenderNode f189628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private RenderNode f189629z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f189630a;

        static {
            int[] iArr = new int[c.values().length];
            f189630a = iArr;
            try {
                iArr[c.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f189630a[c.SAVE_LAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f189630a[c.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f189630a[c.RENDER_NODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f189631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x5.a f189632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f189633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public td.b f189634d;

        public b() {
            f();
        }

        public boolean a() {
            x5.a aVar = this.f189632b;
            return (aVar == null || aVar == x5.a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f189633c != null;
        }

        public boolean c() {
            return this.f189634d != null;
        }

        public boolean d() {
            return (e() || a() || c() || b()) ? false : true;
        }

        public boolean e() {
            return this.f189631a < 255;
        }

        public void f() {
            this.f189631a = GF2Field.MASK;
            this.f189632b = null;
            this.f189633c = null;
            this.f189634d = null;
        }
    }

    protected enum c {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    private RectF b(RectF rectF, td.b bVar) {
        if (this.f189608e == null) {
            this.f189608e = new RectF();
        }
        if (this.f189610g == null) {
            this.f189610g = new RectF();
        }
        this.f189608e.set(rectF);
        this.f189608e.offsetTo(rectF.left + bVar.f(), rectF.top + bVar.g());
        this.f189608e.inset(-bVar.h(), -bVar.h());
        this.f189610g.set(rectF);
        this.f189608e.union(this.f189610g);
        return this.f189608e;
    }

    private c c(Canvas canvas, b bVar) {
        if (bVar.d()) {
            return c.DIRECT;
        }
        if (!bVar.c()) {
            return c.SAVE_LAYER;
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 29 || !canvas.isHardwareAccelerated()) {
            return c.BITMAP;
        }
        return i15 <= 31 ? c.BITMAP : c.RENDER_NODE;
    }

    private void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    private boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    private void h(Canvas canvas, td.b bVar) {
        gd.a aVar;
        RectF rectF = this.f189607d;
        if (rectF == null || this.f189615l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, bVar);
        if (this.f189609f == null) {
            this.f189609f = new Rect();
        }
        this.f189609f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f189620q;
        float f15 = fArr != null ? fArr[0] : 1.0f;
        float f16 = fArr != null ? fArr[4] : 1.0f;
        if (this.f189611h == null) {
            this.f189611h = new RectF();
        }
        this.f189611h.set(rectFB.left * f15, rectFB.top * f16, rectFB.right * f15, rectFB.bottom * f16);
        if (this.f189612i == null) {
            this.f189612i = new Rect();
        }
        this.f189612i.set(0, 0, Math.round(this.f189611h.width()), Math.round(this.f189611h.height()));
        if (g(this.f189621r, this.f189611h)) {
            Bitmap bitmap = this.f189621r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f189622s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f189621r = a(this.f189611h, Bitmap.Config.ARGB_8888);
            this.f189622s = a(this.f189611h, Bitmap.Config.ALPHA_8);
            this.f189623t = new Canvas(this.f189621r);
            this.f189624u = new Canvas(this.f189622s);
        } else {
            Canvas canvas2 = this.f189623t;
            if (canvas2 == null || this.f189624u == null || (aVar = this.f189618o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f189612i, aVar);
            this.f189624u.drawRect(this.f189612i, this.f189618o);
        }
        if (this.f189622s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f189625v == null) {
            this.f189625v = new gd.a(1);
        }
        RectF rectF2 = this.f189607d;
        this.f189624u.drawBitmap(this.f189615l, Math.round((rectF2.left - rectFB.left) * f15), Math.round((rectF2.top - rectFB.top) * f16), (Paint) null);
        if (this.f189626w == null || this.f189627x != bVar.h()) {
            float fH = (bVar.h() * (f15 + f16)) / 2.0f;
            if (fH > 0.0f) {
                this.f189626w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f189626w = null;
            }
            this.f189627x = bVar.h();
        }
        this.f189625v.setColor(bVar.e());
        if (bVar.h() > 0.0f) {
            this.f189625v.setMaskFilter(this.f189626w);
        } else {
            this.f189625v.setMaskFilter(null);
        }
        this.f189625v.setFilterBitmap(true);
        this.f189623t.drawBitmap(this.f189622s, Math.round(bVar.f() * f15), Math.round(bVar.g() * f16), this.f189625v);
        canvas.drawBitmap(this.f189621r, this.f189612i, this.f189609f, this.f189614k);
    }

    private void i(Canvas canvas, td.b bVar) {
        if (this.f189628y == null || this.f189629z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f189620q;
        float f15 = fArr != null ? fArr[0] : 1.0f;
        float f16 = fArr != null ? fArr[4] : 1.0f;
        td.b bVar2 = this.A;
        if (bVar2 == null || !bVar.j(bVar2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.e(), PorterDuff.Mode.SRC_IN));
            if (bVar.h() > 0.0f) {
                float fH = (bVar.h() * (f15 + f16)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f189629z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.A = bVar;
        }
        RectF rectFB = b(this.f189607d, bVar);
        RectF rectF = new RectF(rectFB.left * f15, rectFB.top * f16, rectFB.right * f15, rectFB.bottom * f16);
        this.f189629z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f189629z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (bVar.f() * f15), (-rectF.top) + (bVar.g() * f16));
        recordingCanvasBeginRecording.drawRenderNode(this.f189628y);
        this.f189629z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f189629z);
        canvas.restore();
    }

    public void e() {
        if (this.f189604a == null || this.f189605b == null || this.f189620q == null || this.f189607d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i15 = a.f189630a[this.f189606c.ordinal()];
        if (i15 == 1 || i15 == 2) {
            this.f189604a.restore();
        } else if (i15 != 3) {
            if (i15 == 4) {
                if (this.f189628y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f189604a.save();
                Canvas canvas = this.f189604a;
                float[] fArr = this.f189620q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f189628y.endRecording();
                if (this.f189605b.c()) {
                    i(this.f189604a, this.f189605b.f189634d);
                }
                this.f189604a.drawRenderNode(this.f189628y);
                this.f189604a.restore();
            }
        } else {
            if (this.f189615l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f189605b.c()) {
                h(this.f189604a, this.f189605b.f189634d);
            }
            if (this.f189617n == null) {
                this.f189617n = new Rect();
            }
            this.f189617n.set(0, 0, (int) (this.f189607d.width() * this.f189620q[0]), (int) (this.f189607d.height() * this.f189620q[4]));
            this.f189604a.drawBitmap(this.f189615l, this.f189617n, this.f189607d, this.f189614k);
        }
        this.f189604a = null;
    }

    public boolean f() {
        return this.f189606c == c.RENDER_NODE;
    }

    public Canvas j(Canvas canvas, RectF rectF, b bVar) {
        if (this.f189604a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f189620q == null) {
            this.f189620q = new float[9];
        }
        if (this.f189619p == null) {
            this.f189619p = new Matrix();
        }
        canvas.getMatrix(this.f189619p);
        this.f189619p.getValues(this.f189620q);
        float[] fArr = this.f189620q;
        float f15 = fArr[0];
        float f16 = fArr[4];
        if (this.f189613j == null) {
            this.f189613j = new RectF();
        }
        this.f189613j.set(rectF.left * f15, rectF.top * f16, rectF.right * f15, rectF.bottom * f16);
        this.f189604a = canvas;
        this.f189605b = bVar;
        this.f189606c = c(canvas, bVar);
        if (this.f189607d == null) {
            this.f189607d = new RectF();
        }
        this.f189607d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f189614k == null) {
            this.f189614k = new gd.a();
        }
        this.f189614k.reset();
        int i15 = a.f189630a[this.f189606c.ordinal()];
        if (i15 == 1) {
            canvas.save();
            return canvas;
        }
        if (i15 == 2) {
            this.f189614k.setAlpha(bVar.f189631a);
            this.f189614k.setColorFilter(bVar.f189633c);
            if (bVar.a()) {
                x5.i.b(this.f189614k, bVar.f189632b);
            }
            m.m(canvas, rectF, this.f189614k);
            return canvas;
        }
        if (i15 == 3) {
            if (this.f189618o == null) {
                gd.a aVar = new gd.a();
                this.f189618o = aVar;
                aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f189615l, this.f189613j)) {
                Bitmap bitmap = this.f189615l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f189615l = a(this.f189613j, Bitmap.Config.ARGB_8888);
                this.f189616m = new Canvas(this.f189615l);
            } else {
                Canvas canvas2 = this.f189616m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(B);
                this.f189616m.drawRect(-1.0f, -1.0f, this.f189613j.width() + 1.0f, this.f189613j.height() + 1.0f, this.f189618o);
            }
            x5.i.b(this.f189614k, bVar.f189632b);
            this.f189614k.setColorFilter(bVar.f189633c);
            this.f189614k.setAlpha(bVar.f189631a);
            Canvas canvas3 = this.f189616m;
            canvas3.scale(f15, f16);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i15 != 4) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f189628y == null) {
            this.f189628y = k3.a("OffscreenLayer.main");
        }
        if (bVar.c() && this.f189629z == null) {
            this.f189629z = k3.a("OffscreenLayer.shadow");
            this.A = null;
        }
        if (bVar.a() || bVar.b()) {
            if (this.f189614k == null) {
                this.f189614k = new gd.a();
            }
            this.f189614k.reset();
            x5.i.b(this.f189614k, bVar.f189632b);
            this.f189614k.setColorFilter(bVar.f189633c);
            this.f189628y.setUseCompositingLayer(true, this.f189614k);
            if (bVar.c()) {
                RenderNode renderNode = this.f189629z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f189614k);
            }
        }
        this.f189628y.setAlpha(bVar.f189631a / 255.0f);
        if (bVar.c()) {
            RenderNode renderNode2 = this.f189629z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(bVar.f189631a / 255.0f);
        }
        this.f189628y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f189628y;
        RectF rectF2 = this.f189613j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f189628y.beginRecording((int) this.f189613j.width(), (int) this.f189613j.height());
        recordingCanvasBeginRecording.setMatrix(B);
        recordingCanvasBeginRecording.scale(f15, f16);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
