package n3;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0002\u0017$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010/¨\u00061"}, d2 = {"Ln3/i0;", "Ln3/x1;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "Loq/i0;", "g", "()V", "Landroid/content/Context;", "context", "j", "(Landroid/content/Context;)V", "k", "Landroidx/compose/ui/graphics/layer/view/a;", "i", "(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/a;", "Landroid/view/View;", "view", "", "h", "(Landroid/view/View;)J", "Lq3/c;", "c", "()Lq3/c;", "layer", "a", "(Lq3/c;)V", "Landroid/view/ViewGroup;", "", "b", "Ljava/lang/Object;", "lock", "Landroidx/compose/ui/graphics/layer/view/a;", "viewLayerContainer", "", "d", "Z", "componentCallbackRegistered", "Ls3/h;", "e", "Ls3/h;", "shadowCache", "Landroid/content/ComponentCallbacks2;", "f", "Landroid/content/ComponentCallbacks2;", "componentCallback", "()Ls3/h;", "shadowContext", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i0 implements x1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f130998h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup ownerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.layer.view.a viewLayerContainer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean componentCallbackRegistered;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private s3.h shadowCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2 componentCallback = new a();

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"n3/i0$a", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "Loq/i0;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ComponentCallbacks2 {
        a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            if (level >= 40) {
                i0.this.g();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"n3/i0$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loq/i0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v15) {
            i0.this.j(v15.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v15) {
            i0.this.k(v15.getContext());
            i0.this.g();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln3/i0$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f131007a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public i0(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            j(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        s3.h hVar = this.shadowCache;
        if (hVar != null) {
            hVar.a();
        }
        this.shadowCache = null;
    }

    private final long h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(view);
        }
        return -1L;
    }

    private final androidx.compose.ui.graphics.layer.view.a i(ViewGroup ownerView) {
        androidx.compose.ui.graphics.layer.view.a aVar = this.viewLayerContainer;
        if (aVar != null) {
            return aVar;
        }
        androidx.compose.ui.graphics.layer.view.b bVar = new androidx.compose.ui.graphics.layer.view.b(ownerView.getContext());
        ownerView.addView(bVar);
        this.viewLayerContainer = bVar;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Context context) {
        if (this.componentCallbackRegistered) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.componentCallback);
        this.componentCallbackRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Context context) {
        if (this.componentCallbackRegistered) {
            context.getApplicationContext().unregisterComponentCallbacks(this.componentCallback);
            this.componentCallbackRegistered = false;
        }
    }

    @Override // n3.x1
    public void a(q3.c layer) {
        synchronized (this.lock) {
            layer.I();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // n3.x1
    public s3.h b() {
        s3.h hVar = this.shadowCache;
        if (hVar != null) {
            return hVar;
        }
        s3.h hVarA = s3.b.a();
        this.shadowCache = hVarA;
        return hVarA;
    }

    @Override // n3.x1
    public q3.c c() {
        q3.d hVar;
        q3.c cVar;
        synchronized (this.lock) {
            try {
                long jH = h(this.ownerView);
                if (Build.VERSION.SDK_INT >= 29) {
                    hVar = new q3.g(jH, null, null, 6, null);
                } else if (f130998h) {
                    try {
                        hVar = new q3.f(this.ownerView, jH, null, null, 12, null);
                    } catch (Throwable unused) {
                        f130998h = false;
                        hVar = new q3.h(i(this.ownerView), jH, null, null, 12, null);
                    }
                } else {
                    hVar = new q3.h(i(this.ownerView), jH, null, null, 12, null);
                }
                cVar = new q3.c(hVar);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return cVar;
    }
}
