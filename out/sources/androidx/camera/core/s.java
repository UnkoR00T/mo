package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import o.w0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w0 f9327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f9328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9330h;

    s(o oVar, w0 w0Var) {
        this(oVar, null, w0Var);
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public int getHeight() {
        return this.f9330h;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public int l() {
        return this.f9329g;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public w0 v3() {
        return this.f9327e;
    }

    @Override // androidx.camera.core.e, androidx.camera.core.o
    public void y1(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, l(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f9326d) {
            this.f9328f = rect;
        }
    }

    public s(o oVar, Size size, w0 w0Var) {
        super(oVar);
        this.f9326d = new Object();
        if (size == null) {
            this.f9329g = super.l();
            this.f9330h = super.getHeight();
        } else {
            this.f9329g = size.getWidth();
            this.f9330h = size.getHeight();
        }
        this.f9327e = w0Var;
    }
}
