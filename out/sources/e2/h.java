package e2;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import b1.n;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 02\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"JK\u0010\u0016\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0,¢\u0006\u0004\b\u0016\u0010.J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u001eJ-\u00100\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u001eR\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010<R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010>¨\u0006?"}, d2 = {"Le2/h;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bounded", "Loq/i0;", "c", "(Z)V", "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lb1/n$b;", "interaction", "Lm3/k;", "size", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "(Lb1/n$b;ZJIJFLer/a;)V", "e", "f", "(JIJF)V", "d", "Le2/k;", "a", "Le2/k;", "ripple", "Ljava/lang/Boolean;", "", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Ler/a;", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46898g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f46899h = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f46900j = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private k ripple;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Boolean bounded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Long lastRippleStateChangeTimeMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Runnable resetRippleRunnable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onInvalidateRipple;

    public h(Context context) {
        super(context);
    }

    private final void c(boolean bounded) {
        k kVar = new k(bounded);
        setBackground(kVar);
        this.ripple = kVar;
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l15 = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l15 != null ? l15.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f46899h : f46900j;
            k kVar = this.ripple;
            if (kVar != null) {
                kVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: e2.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.setRippleState$lambda$1(this.f46896a);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(h hVar) {
        k kVar = hVar.ripple;
        if (kVar != null) {
            kVar.setState(f46900j);
        }
        hVar.resetRippleRunnable = null;
    }

    public final void b(n.b interaction, boolean bounded, long size, int radius, long color, float alpha, er.a<i0> onInvalidateRipple) {
        if (this.ripple == null || !t.c(Boolean.valueOf(bounded), this.bounded)) {
            c(bounded);
            this.bounded = Boolean.valueOf(bounded);
        }
        k kVar = this.ripple;
        this.onInvalidateRipple = onInvalidateRipple;
        f(size, radius, color, alpha);
        if (bounded) {
            kVar.setHotspot(m3.e.m(interaction.getPressPosition()), m3.e.n(interaction.getPressPosition()));
        } else {
            kVar.setHotspot(kVar.getBounds().centerX(), kVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.resetRippleRunnable.run();
        } else {
            k kVar = this.ripple;
            if (kVar != null) {
                kVar.setState(f46900j);
            }
        }
        k kVar2 = this.ripple;
        if (kVar2 == null) {
            return;
        }
        kVar2.setVisible(false, false);
        unscheduleDrawable(kVar2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            d();
        }
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long size, int radius, long color, float alpha) {
        k kVar = this.ripple;
        if (kVar == null) {
            return;
        }
        if (kVar.getRadius() != radius) {
            kVar.setRadius(radius);
        }
        kVar.b(color, alpha);
        Rect rect = new Rect(0, 0, hr.a.d(m3.k.i(size)), hr.a.d(m3.k.g(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        kVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        er.a<i0> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l15, int t15, int r15, int b15) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
