package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import o.h2;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Size f9421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    FrameLayout f9422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f9423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9424d = false;

    interface a {
        void a();
    }

    n(FrameLayout frameLayout, f fVar) {
        this.f9422b = frameLayout;
        this.f9423c = fVar;
    }

    Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f9423c.a(bitmapC, new Size(this.f9422b.getWidth(), this.f9422b.getHeight()), this.f9422b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f9424d = true;
        h();
    }

    abstract void g(h2 h2Var, a aVar);

    void h() {
        View viewB = b();
        if (viewB == null || !this.f9424d) {
            return;
        }
        this.f9423c.s(new Size(this.f9422b.getWidth(), this.f9422b.getHeight()), this.f9422b.getLayoutDirection(), viewB);
    }

    abstract com.google.common.util.concurrent.q<Void> i();
}
