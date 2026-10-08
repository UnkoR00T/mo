package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import j6.a1;
import j6.f1;
import j6.l0;
import j6.y;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110!¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020%2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0017¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b1\u00102R7\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R$\u0010C\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Landroidx/compose/ui/window/k;", "Landroidx/compose/ui/platform/b;", "", "Lj6/y;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "", "height", "r", "(Landroid/view/Window;I)I", "", "usePlatformDefaultWidth", "decorFitsSystemWindows", "Loq/i0;", "v", "(ZZ)V", "widthMeasureSpec", "heightMeasureSpec", "k", "(II)V", "changed", "left", "top", "right", "bottom", "j", "(ZIIII)V", "Lm2/v;", "parent", "Lkotlin/Function0;", "content", "u", "(Lm2/v;Ler/p;)V", "Landroid/view/View;", "Lj6/f1;", "insets", "b", "(Landroid/view/View;Lj6/f1;)Lj6/f1;", "Landroid/view/MotionEvent;", "event", "t", "(Landroid/view/MotionEvent;)Z", "c", "(Lm2/r;I)V", "Landroid/view/Window;", "s", "()Landroid/view/Window;", "<set-?>", "l", "Lm2/a3;", "getContent", "()Ler/p;", "setContent", "(Ler/p;)V", "m", "Z", "n", "p", "hasCalledSetLayout", "value", "q", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k extends androidx.compose.ui.platform.b implements y {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a3 content;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean decorFitsSystemWindows;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean hasCalledSetLayout;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/ui/window/k$a", "Lj6/a1$b;", "Lj6/a1;", "animation", "Lj6/a1$a;", "bounds", "f", "(Lj6/a1;Lj6/a1$a;)Lj6/a1$a;", "Lj6/f1;", "insets", "", "runningAnimations", "e", "(Lj6/f1;Ljava/util/List;)Lj6/f1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends a1.b {
        a() {
            super(1);
        }

        @Override // j6.a1.b
        public f1 e(f1 insets, List<a1> runningAnimations) {
            k kVar = k.this;
            if (!kVar.decorFitsSystemWindows) {
                View childAt = kVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, kVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, kVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return insets.n(iMax, iMax2, iMax3, iMax4);
                }
            }
            return insets;
        }

        @Override // j6.a1.b
        public a1.a f(a1 animation, a1.a bounds) {
            k kVar = k.this;
            if (!kVar.decorFitsSystemWindows) {
                View childAt = kVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, kVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, kVar.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return bounds.c(x5.h.c(iMax, iMax2, iMax3, iMax4));
                }
            }
            return bounds;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i15) {
            super(2);
            this.f11106c = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            k.this.c(rVar, g4.a(this.f11106c | 1));
        }
    }

    public k(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = c6.e(i.f11092a.a(), null, 2, null);
        l0.q0(this, this);
        l0.w0(this, new a());
    }

    private final er.p<p076m2.r, Integer, i0> getContent() {
        return (er.p) this.content.getValue();
    }

    private final int r(Window window, int height) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 30) {
            return d.f11087a.a(window);
        }
        return i15 < 32 ? f.f11089a.a(window) : height;
    }

    private final void setContent(er.p<? super p076m2.r, ? super Integer, i0> pVar) {
        this.content.setValue(pVar);
    }

    @Override // j6.y
    public f1 b(View v15, f1 insets) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return insets.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return insets;
    }

    @Override // androidx.compose.ui.platform.b
    public void c(p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1735448596);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1735448596, i16, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:506)");
            }
            getContent().B(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new b(i15));
        }
    }

    @Override // androidx.compose.ui.platform.b
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.b
    public void j(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i15 = right - left;
        int i16 = bottom - top;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i15 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i16 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // androidx.compose.ui.platform.b
    public void k(int widthMeasureSpec, int heightMeasureSpec) {
        int iR;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.k(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE && !this.usePlatformDefaultWidth && getWindow().getAttributes().height == -2) {
            iR = this.decorFitsSystemWindows ? r(getWindow(), size2) : size2 + 1;
        } else {
            iR = size2;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i15 = size - paddingLeft;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = iR - paddingTop;
        int i17 = i16 >= 0 ? i16 : 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode2 != 0) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, PKIFailureInfo.systemUnavail);
        }
        if (mode != 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, PKIFailureInfo.systemUnavail);
        }
        childAt.measure(widthMeasureSpec, heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, iMin);
        if (this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingTop <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().addFlags(PKIFailureInfo.systemUnavail);
        if (this.usePlatformDefaultWidth) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public Window getWindow() {
        return this.window;
    }

    public final boolean t(MotionEvent event) {
        View childAt;
        int iD;
        if (Math.abs(event.getX()) > Float.MAX_VALUE || Math.abs(event.getY()) > Float.MAX_VALUE || (childAt = getChildAt(0)) == null) {
            return false;
        }
        int left = getLeft() + childAt.getLeft();
        int width = childAt.getWidth() + left;
        int top = getTop() + childAt.getTop();
        int height = childAt.getHeight() + top;
        int iD2 = hr.a.d(event.getX());
        return left <= iD2 && iD2 <= width && top <= (iD = hr.a.d(event.getY())) && iD <= height;
    }

    public final void u(p076m2.v parent, er.p<? super p076m2.r, ? super Integer, i0> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        g();
    }

    public final void v(boolean usePlatformDefaultWidth, boolean decorFitsSystemWindows) {
        boolean z15 = (this.hasCalledSetLayout && usePlatformDefaultWidth == this.usePlatformDefaultWidth && decorFitsSystemWindows == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
        this.decorFitsSystemWindows = decorFitsSystemWindows;
        if (z15) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i15 = usePlatformDefaultWidth ? -2 : -1;
            if (i15 == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i15, -2);
            this.hasCalledSetLayout = true;
        }
    }
}
