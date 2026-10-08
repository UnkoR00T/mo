package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c5.t;
import com.google.accompanist.drawablepainter.DrawablePainter;
import lr.m;
import n3.f0;
import n3.g0;
import n3.h1;
import n3.n1;
import oq.k;
import oq.l;
import oq.p;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.u4;
import p3.f;
import xe.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0007*\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010/\u001a\u00020)2\u0006\u0010!\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010,¨\u00067"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/a;", "Lm2/u4;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "Loq/i0;", "c", "()V", "d", "e", "", "alpha", "", "a", "(F)Z", "Ln3/n1;", "colorFilter", "b", "(Ln3/n1;)Z", "Lc5/t;", "layoutDirection", "f", "(Lc5/t;)Z", "Lp3/f;", "n", "(Lp3/f;)V", "h", "Landroid/graphics/drawable/Drawable;", "v", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", "j", "Lm2/a3;", "u", "()I", "x", "(I)V", "drawInvalidateTick", "Lm3/k;", "k", "w", "()J", "y", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "l", "Loq/k;", "t", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "intrinsicSize", "drawablepainter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DrawablePainter extends androidx.compose.ui.graphics.painter.a implements u4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Drawable drawable;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a3 drawableIntrinsicSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a3 drawInvalidateTick = c6.e(0, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k callback = l.a(new er.a() { // from class: xe.a
        @Override // er.a
        public final Object a() {
            return DrawablePainter.s(this.f218105a);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28855a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28855a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/google/accompanist/drawablepainter/DrawablePainter$b", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Drawable;", "d", "Loq/i0;", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Ljava/lang/Runnable;", "what", "", "time", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "drawablepainter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Drawable.Callback {
        b() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable d15) {
            DrawablePainter.this.x(DrawablePainter.this.u() + 1);
            DrawablePainter drawablePainter = DrawablePainter.this;
            drawablePainter.y(c.e(drawablePainter.getDrawable()));
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable d15, Runnable what, long time) {
            c.f().postAtTime(what, time);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable d15, Runnable what) {
            c.f().removeCallbacks(what);
        }
    }

    public DrawablePainter(Drawable drawable) {
        this.drawable = drawable;
        this.drawableIntrinsicSize = c6.e(m3.k.c(c.e(drawable)), null, 2, null);
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b s(DrawablePainter drawablePainter) {
        return drawablePainter.new b();
    }

    private final Drawable.Callback t() {
        return (Drawable.Callback) this.callback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int u() {
        return ((Number) this.drawInvalidateTick.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long w() {
        return ((m3.k) this.drawableIntrinsicSize.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i15) {
        this.drawInvalidateTick.setValue(Integer.valueOf(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(long j15) {
        this.drawableIntrinsicSize.setValue(m3.k.c(j15));
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean a(float alpha) {
        this.drawable.setAlpha(m.n(hr.a.d(alpha * GF2Field.MASK), 0, GF2Field.MASK));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean b(n1 colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? g0.b(colorFilter) : null);
        return true;
    }

    @Override // p076m2.u4
    public void c() {
        this.drawable.setCallback(t());
        this.drawable.setVisible(true, true);
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // p076m2.u4
    public void d() {
        e();
    }

    @Override // p076m2.u4
    public void e() {
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean f(t layoutDirection) {
        Drawable drawable = this.drawable;
        int i15 = a.f28855a[layoutDirection.ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i16 = 0;
        } else if (i15 != 2) {
            throw new p();
        }
        return drawable.setLayoutDirection(i16);
    }

    @Override // androidx.compose.ui.graphics.painter.a
    /* JADX INFO: renamed from: l */
    public long getIntrinsicSize() {
        return w();
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected void n(f fVar) {
        h1 h1VarF = fVar.getDrawContext().f();
        u();
        try {
            h1VarF.q();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 < 28 || i15 >= 31 || !ke.a.a(this.drawable)) {
                this.drawable.setBounds(0, 0, hr.a.d(m3.k.i(fVar.a())), hr.a.d(m3.k.g(fVar.a())));
            } else {
                h1VarF.f(m3.k.i(fVar.a()) / m3.k.i(getIntrinsicSize()), m3.k.g(fVar.a()) / m3.k.g(getIntrinsicSize()));
            }
            this.drawable.draw(f0.d(h1VarF));
        } finally {
            h1VarF.j();
        }
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }
}
