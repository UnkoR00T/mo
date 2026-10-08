package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class y0 extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f9093b;

    public y0(Context context, Resources resources) {
        super(resources);
        this.f9093b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i15) {
        Drawable drawableA = a(i15);
        Context context = this.f9093b.get();
        if (drawableA != null && context != null) {
            p0.g().w(context, i15, drawableA);
        }
        return drawableA;
    }
}
