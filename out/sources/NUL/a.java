package NUL;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f261a;

    public a(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f261a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f261a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f261a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f261a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f261a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f261a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f261a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f261a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f261a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f261a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f261a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f261a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f261a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return y5.a.h(this.f261a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f261a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f261a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f261a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i15) {
        return this.f261a.setLevel(i15);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j15) {
        scheduleSelf(runnable, j15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        this.f261a.setAlpha(i15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z15) {
        y5.a.j(this.f261a, z15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i15) {
        this.f261a.setChangingConfigurations(i15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f261a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z15) {
        this.f261a.setDither(z15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z15) {
        this.f261a.setFilterBitmap(z15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f15, float f16) {
        y5.a.k(this.f261a, f15, f16);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i15, int i16, int i17, int i18) {
        y5.a.l(this.f261a, i15, i16, i17, i18);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f261a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i15) {
        y5.a.n(this.f261a, i15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        y5.a.o(this.f261a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        y5.a.p(this.f261a, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z15, boolean z16) {
        return super.setVisible(z15, z16) || this.f261a.setVisible(z15, z16);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
