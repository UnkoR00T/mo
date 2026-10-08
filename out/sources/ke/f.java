package ke;

import android.graphics.drawable.Drawable;
import be.v;

/* JADX INFO: loaded from: classes3.dex */
final class f extends e<Drawable> {
    private f(Drawable drawable) {
        super(drawable);
    }

    static v<Drawable> e(Drawable drawable) {
        if (drawable != null) {
            return new f(drawable);
        }
        return null;
    }

    @Override // be.v
    public void c() {
    }

    @Override // be.v
    public Class<Drawable> d() {
        return this.f110241a.getClass();
    }

    @Override // be.v
    public int getSize() {
        return Math.max(1, this.f110241a.getIntrinsicWidth() * this.f110241a.getIntrinsicHeight() * 4);
    }
}
