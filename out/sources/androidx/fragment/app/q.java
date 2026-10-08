package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes3.dex */
class q {
    private static int a(o oVar, boolean z15, boolean z16) {
        if (z16) {
            return z15 ? oVar.P() : oVar.Q();
        }
        return z15 ? oVar.A() : oVar.D();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    @SuppressLint({"ResourceType"})
    static a b(Context context, o oVar, boolean z15, boolean z16) {
        Animator animatorLoadAnimator;
        int iL = oVar.L();
        int iA = a(oVar, z15, z16);
        oVar.E1(0, 0, 0, 0);
        ViewGroup viewGroup = oVar.P;
        if (viewGroup != null && viewGroup.getTag(d7.b.f40110c) != null) {
            oVar.P.setTag(d7.b.f40110c, null);
        }
        ViewGroup viewGroup2 = oVar.P;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationY0 = oVar.y0(iL, z15, iA);
        if (animationY0 != null) {
            return new a(animationY0);
        }
        Animator animatorZ0 = oVar.z0(iL, z15, iA);
        if (animatorZ0 != null) {
            return new a(animatorZ0);
        }
        if (iA == 0 && iL != 0) {
            iA = d(context, iL, z15);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e15) {
                    throw e15;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e16) {
                        if (zEquals) {
                            throw e16;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i15) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i15});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i15, boolean z15) {
        if (i15 == 4097) {
            return z15 ? d7.a.f40106e : d7.a.f40107f;
        }
        if (i15 == 8194) {
            return z15 ? d7.a.f40102a : d7.a.f40103b;
        }
        if (i15 == 8197) {
            return z15 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i15 == 4099) {
            return z15 ? d7.a.f40104c : d7.a.f40105d;
        }
        if (i15 != 4100) {
            return -1;
        }
        return z15 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f12654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f12655b;

        a(Animation animation) {
            this.f12654a = animation;
            this.f12655b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f12654a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f12655b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f12656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f12657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f12660e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f12660e = true;
            this.f12656a = viewGroup;
            this.f12657b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j15, Transformation transformation) {
            this.f12660e = true;
            if (this.f12658c) {
                return !this.f12659d;
            }
            if (!super.getTransformation(j15, transformation)) {
                this.f12658c = true;
                j6.b0.a(this.f12656a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12658c || !this.f12660e) {
                this.f12656a.endViewTransition(this.f12657b);
                this.f12659d = true;
            } else {
                this.f12660e = false;
                this.f12656a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j15, Transformation transformation, float f15) {
            this.f12660e = true;
            if (this.f12658c) {
                return !this.f12659d;
            }
            if (!super.getTransformation(j15, transformation, f15)) {
                this.f12658c = true;
                j6.b0.a(this.f12656a, this);
            }
            return true;
        }
    }
}
