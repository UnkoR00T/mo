package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Drawable f13529a;

    e() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i15) {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.setLevel(i15) : super.onLevelChange(i15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i15);
        } else {
            super.setChangingConfigurations(i15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i15, PorterDuff.Mode mode) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setColorFilter(i15, mode);
        } else {
            super.setColorFilter(i15, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setFilterBitmap(z15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f15, float f16) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.k(drawable, f15, f16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i15, int i16, int i17, int i18) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.l(drawable, i15, i16, i17, i18);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
