package ke;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import be.r;
import be.v;
import ve.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T extends Drawable> implements v<T>, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f110241a;

    public e(T t15) {
        this.f110241a = (T) k.d(t15);
    }

    @Override // be.r
    public void a() {
        T t15 = this.f110241a;
        if (t15 instanceof BitmapDrawable) {
            ((BitmapDrawable) t15).getBitmap().prepareToDraw();
        } else if (t15 instanceof me.c) {
            ((me.c) t15).e().prepareToDraw();
        }
    }

    @Override // be.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f110241a.getConstantState();
        return constantState == null ? this.f110241a : (T) constantState.newDrawable();
    }
}
