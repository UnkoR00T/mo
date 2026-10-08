package e;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010+¨\u0006-"}, d2 = {"Le/z0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Landroid/view/Display;", "h", "()[Landroid/view/Display;", "Landroid/util/Size;", "f", "()Landroid/util/Size;", "g", "Loq/i0;", "l", "()V", "k", "", "skipStateOffDisplay", "i", "(Z)Landroid/view/Display;", "Lc/q;", "a", "Lc/q;", "maxPreviewSize", "Lc/j;", "b", "Lc/j;", "displaySizeCorrector", "c", "Ljava/lang/Object;", "lock", "d", "[Landroid/view/Display;", "displays", "Landroid/hardware/display/DisplayManager$DisplayListener;", "e", "Landroid/hardware/display/DisplayManager$DisplayListener;", "displayListener", "Landroid/hardware/display/DisplayManager;", "Landroid/hardware/display/DisplayManager;", "displayManager", "Landroid/util/Size;", "previewSize", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Size f46474i = new Size(1920, 1080);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Size f46475j = new Size(320, 240);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Size f46476k = new Size(640, 480);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile z0 f46477l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c.q maxPreviewSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c.j displaySizeCorrector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile Display[] displays;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DisplayManager.DisplayListener displayListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final DisplayManager displayManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile Size previewSize;

    /* JADX INFO: renamed from: e.z0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Le/z0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Le/z0;", "a", "(Landroid/content/Context;)Le/z0;", "Landroid/util/Size;", "MAX_PREVIEW_SIZE", "Landroid/util/Size;", "ABNORMAL_DISPLAY_SIZE_THRESHOLD", "FALLBACK_DISPLAY_SIZE", "instance", "Le/z0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final z0 a(Context context) {
            z0 z0Var;
            z0 z0Var2 = z0.f46477l;
            if (z0Var2 != null) {
                return z0Var2;
            }
            synchronized (this) {
                z0Var = z0.f46477l;
                if (z0Var == null) {
                    z0Var = new z0(y.e.f(context), null);
                    z0.f46477l = z0Var;
                }
            }
            return z0Var;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"e/z0$b", "Landroid/hardware/display/DisplayManager$DisplayListener;", "", "displayId", "Loq/i0;", "onDisplayAdded", "(I)V", "onDisplayRemoved", "onDisplayChanged", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int displayId) {
            Object obj = z0.this.lock;
            z0 z0Var = z0.this;
            synchronized (obj) {
                z0Var.displays = null;
                z0Var.previewSize = null;
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int displayId) {
            Object obj = z0.this.lock;
            z0 z0Var = z0.this;
            synchronized (obj) {
                z0Var.displays = null;
                z0Var.previewSize = null;
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int displayId) {
            Object obj = z0.this.lock;
            z0 z0Var = z0.this;
            synchronized (obj) {
                z0Var.displays = null;
                z0Var.previewSize = null;
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }
    }

    public /* synthetic */ z0(Context context, fr.k kVar) {
        this(context);
    }

    private final Size f() {
        Size sizeG = g();
        Size size = f46474i;
        if (f0.d.c(size, sizeG)) {
            sizeG = size;
        }
        return this.maxPreviewSize.a(sizeG);
    }

    private final Size g() {
        Point point = new Point();
        i(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (f0.d.c(size, f46475j)) {
            Size sizeA = this.displaySizeCorrector.a();
            if (sizeA == null) {
                sizeA = f46476k;
            }
            size = sizeA;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private final Display[] h() {
        synchronized (this.lock) {
            Display[] displayArr = this.displays;
            if (displayArr != null) {
                return displayArr;
            }
            Display[] displays = this.displayManager.getDisplays();
            this.displays = displays;
            return displays;
        }
    }

    public static /* synthetic */ Display j(z0 z0Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return z0Var.i(z15);
    }

    public final Display i(boolean skipStateOffDisplay) {
        Display[] displayArrH = h();
        if (displayArrH.length == 1) {
            return displayArrH[0];
        }
        int i15 = -1;
        Display display = null;
        Display display2 = null;
        int i16 = -1;
        for (Display display3 : displayArrH) {
            Point point = new Point();
            display3.getRealSize(point);
            int i17 = point.x;
            int i18 = point.y;
            if (i17 * i18 > i15) {
                display = display3;
                i15 = i17 * i18;
            }
            if (display3.getState() != 1) {
                int i19 = point.x;
                int i25 = point.y;
                if (i19 * i25 > i16) {
                    display2 = display3;
                    i16 = i19 * i25;
                }
            }
        }
        if (skipStateOffDisplay && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        throw new IllegalStateException(("No displays found from " + Arrays.toString(displayArrH) + '!').toString());
    }

    public final Size k() {
        synchronized (this.lock) {
            if (this.previewSize != null) {
                return this.previewSize;
            }
            this.previewSize = f();
            return this.previewSize;
        }
    }

    public final void l() {
        synchronized (this.lock) {
            this.previewSize = f();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private z0(Context context) {
        this.maxPreviewSize = new c.q(null, 1, 0 == true ? 1 : 0);
        this.displaySizeCorrector = new c.j();
        this.lock = new Object();
        b bVar = new b();
        this.displayListener = bVar;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(bVar, new Handler(Looper.getMainLooper()));
        this.displayManager = displayManager;
    }
}
