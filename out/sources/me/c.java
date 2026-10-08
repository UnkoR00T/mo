package me;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.List;
import ve.k;
import zd.l;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f125907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f125908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f125909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f125910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f125911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f125912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f125913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f125914h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Paint f125915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f125916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f125917l;

    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f125918a;

        a(g gVar) {
            this.f125918a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, yd.a aVar, l<Bitmap> lVar, int i15, int i16, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i15, i16, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f125916k == null) {
            this.f125916k = new Rect();
        }
        return this.f125916k;
    }

    private Paint h() {
        if (this.f125915j == null) {
            this.f125915j = new Paint(2);
        }
        return this.f125915j;
    }

    private void j() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f125917l;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.f125917l.get(i15).b(this);
            }
        }
    }

    private void l() {
        this.f125912f = 0;
    }

    private void n() {
        k.a(!this.f125910d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f125907a.f125918a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f125908b) {
                return;
            }
            this.f125908b = true;
            this.f125907a.f125918a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f125908b = false;
        this.f125907a.f125918a.s(this);
    }

    @Override // me.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f125912f++;
        }
        int i15 = this.f125913g;
        if (i15 == -1 || this.f125912f < i15) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f125907a.f125918a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f125910d) {
            return;
        }
        if (this.f125914h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f125914h = false;
        }
        canvas.drawBitmap(this.f125907a.f125918a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f125907a.f125918a.e();
    }

    public int f() {
        return this.f125907a.f125918a.f();
    }

    public int g() {
        return this.f125907a.f125918a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f125907a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f125907a.f125918a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f125907a.f125918a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f125907a.f125918a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f125908b;
    }

    public void k() {
        this.f125910d = true;
        this.f125907a.f125918a.a();
    }

    public void m(l<Bitmap> lVar, Bitmap bitmap) {
        this.f125907a.f125918a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f125914h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        h().setAlpha(i15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z15, boolean z16) {
        k.a(!this.f125910d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f125911e = z15;
        if (!z15) {
            o();
        } else if (this.f125909c) {
            n();
        }
        return super.setVisible(z15, z16);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f125909c = true;
        l();
        if (this.f125911e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f125909c = false;
        o();
    }

    c(a aVar) {
        this.f125911e = true;
        this.f125913g = -1;
        this.f125907a = (a) k.d(aVar);
    }
}
