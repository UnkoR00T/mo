package km;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f111381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f111382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111383c = -1;

    public a(Context context) {
        this.f111382b = u5.a.f(context, am.b.f7760a);
        this.f111381a = u5.a.f(context, am.b.f7761b);
    }

    public void a(int i15) {
        this.f111383c = i15;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f111382b.draw(canvas);
        canvas.drawColor(this.f111383c, PorterDuff.Mode.SRC_IN);
        this.f111381a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f111382b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i15, int i16, int i17, int i18) {
        this.f111382b.setBounds(i15, i16, i17, i18);
        this.f111381a.setBounds(i15, i16, i17, i18);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f111382b.setBounds(rect);
        this.f111381a.setBounds(rect);
    }
}
