package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;
import o.e1;
import o.t0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Window f9434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t0.j f9435b;

    class a implements t0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f9436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ValueAnimator f9437b;

        a() {
        }

        @Override // o.t0.j
        public void a(long j15, final t0.k kVar) {
            e1.a("ScreenFlashView", "ScreenFlash#apply");
            this.f9436a = s.this.getBrightness();
            s.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f9437b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            s sVar = s.this;
            Objects.requireNonNull(kVar);
            this.f9437b = sVar.e(new Runnable() { // from class: androidx.camera.view.r
                @Override // java.lang.Runnable
                public final void run() {
                    kVar.a();
                }
            });
        }

        @Override // o.t0.j
        public void clear() {
            e1.a("ScreenFlashView", "ScreenFlash#clear");
            ValueAnimator valueAnimator = this.f9437b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f9437b = null;
            }
            s.this.setAlpha(0.0f);
            s.this.setBrightness(this.f9436a);
        }
    }

    class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f9439a;

        b(Runnable runnable) {
            this.f9439a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e1.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f9439a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public s(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(s sVar, ValueAnimator valueAnimator) {
        sVar.getClass();
        e1.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        sVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator e(Runnable runnable) {
        e1.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s.a(this.f9432a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    private void f(Window window) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("updateScreenFlash: is new window null = ");
        sb5.append(window == null);
        sb5.append(",  is new window same as previous = ");
        sb5.append(window == this.f9434a);
        e1.a("ScreenFlashView", sb5.toString());
        if (this.f9434a != window) {
            this.f9435b = window == null ? null : new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f9434a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        e1.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f15) {
        if (this.f9434a == null) {
            e1.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f15)) {
            e1.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f9434a.getAttributes();
        attributes.screenBrightness = f15;
        this.f9434a.setAttributes(attributes);
        e1.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(t0.j jVar) {
        e1.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public t0.j getScreenFlash() {
        return this.f9435b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(androidx.camera.view.a aVar) {
        y.w.b();
    }

    public void setScreenFlashWindow(Window window) {
        y.w.b();
        f(window);
        this.f9434a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i15) {
        this(context, attributeSet, i15, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i15, int i16) {
        super(context, attributeSet, i15, i16);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
