package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import ri.f;
import si.h;
import si.i;
import si.j;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f35888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f35889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f35890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f35891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f35892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f35893h;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f35894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f35895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f35896c;

        a(boolean z15, View view, View view2) {
            this.f35894a = z15;
            this.f35895b = view;
            this.f35896c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f35894a) {
                return;
            }
            this.f35895b.setVisibility(4);
            this.f35896c.setAlpha(1.0f);
            this.f35896c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f35894a) {
                this.f35895b.setVisibility(0);
                this.f35896c.setAlpha(0.0f);
                this.f35896c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f35898a;

        b(View view) {
            this.f35898a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35898a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zi.c f35900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f35901b;

        c(zi.c cVar, Drawable drawable) {
            this.f35900a = cVar;
            this.f35901b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35900a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f35900a.setCircularRevealOverlayDrawable(this.f35901b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zi.c f35903a;

        d(zi.c cVar) {
            this.f35903a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zi.c.e revealInfo = this.f35903a.getRevealInfo();
            revealInfo.f235323c = Float.MAX_VALUE;
            this.f35903a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f35905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f35906b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f35888c = new Rect();
        this.f35889d = new RectF();
        this.f35890e = new RectF();
        this.f35891f = new int[2];
    }

    private ViewGroup K(View view) {
        View viewFindViewById = view.findViewById(f.B);
        if (viewFindViewById != null) {
            return f0(viewFindViewById);
        }
        return ((view instanceof qj.b) || (view instanceof qj.a)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f15, float f16, float f17, float f18, RectF rectF) {
        float fS = S(eVar, iVar, f15, f17);
        float fS2 = S(eVar, iVar2, f16, f18);
        Rect rect = this.f35888c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f35889d;
        rectF2.set(rect);
        RectF rectF3 = this.f35890e;
        T(view, rectF3);
        rectF3.offset(fS, fS2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f35892g, this.f35893h);
    }

    private Pair<i, i> N(float f15, float f16, boolean z15, e eVar) {
        i iVarE;
        i iVarE2;
        if (f15 == 0.0f || f16 == 0.0f) {
            iVarE = eVar.f35905a.e("translationXLinear");
            iVarE2 = eVar.f35905a.e("translationYLinear");
        } else if ((!z15 || f16 >= 0.0f) && (z15 || f16 <= 0.0f)) {
            iVarE = eVar.f35905a.e("translationXCurveDownwards");
            iVarE2 = eVar.f35905a.e("translationYCurveDownwards");
        } else {
            iVarE = eVar.f35905a.e("translationXCurveUpwards");
            iVarE2 = eVar.f35905a.e("translationYCurveUpwards");
        }
        return new Pair<>(iVarE, iVarE2);
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f35889d;
        RectF rectF2 = this.f35890e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f35889d;
        RectF rectF2 = this.f35890e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f15;
        RectF rectF = this.f35889d;
        RectF rectF2 = this.f35890e;
        M(view, rectF);
        T(view2, rectF2);
        int i15 = jVar.f181935a & 7;
        if (i15 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i15 != 3) {
                if (i15 != 5) {
                    f15 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f15 + jVar.f181936b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f15 = fCenterX - fCenterX2;
        return f15 + jVar.f181936b;
    }

    private float R(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f15;
        RectF rectF = this.f35889d;
        RectF rectF2 = this.f35890e;
        M(view, rectF);
        T(view2, rectF2);
        int i15 = jVar.f181935a & 112;
        if (i15 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i15 != 48) {
                if (i15 != 80) {
                    f15 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f15 + jVar.f181937c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f15 = fCenterY - fCenterY2;
        return f15 + jVar.f181937c;
    }

    private float S(e eVar, i iVar, float f15, float f16) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarE = eVar.f35905a.e("expansion");
        return si.a.a(f15, f16, iVar.e().getInterpolation((((iVarE.c() + iVarE.d()) + 17) - jC) / jD));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f35891f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z15, boolean z16, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupK;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupK = K(view2)) != null) {
            if (z15) {
                if (!z16) {
                    si.d.f181922a.set(viewGroupK, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, si.d.f181922a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, si.d.f181922a, 0.0f);
            }
            eVar.f35905a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void V(View view, View view2, boolean z15, boolean z16, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof zi.c) {
            zi.c cVar = (zi.c) view2;
            int iD0 = d0(view);
            int i15 = 16777215 & iD0;
            if (z15) {
                if (!z16) {
                    cVar.setCircularRevealScrimColor(iD0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, zi.c.d.f235320a, i15);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, zi.c.d.f235320a, iD0);
            }
            objectAnimatorOfInt.setEvaluator(si.c.b());
            eVar.f35905a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void W(View view, View view2, boolean z15, e eVar, List<Animator> list) {
        float fQ = Q(view, view2, eVar.f35906b);
        float fR = R(view, view2, eVar.f35906b);
        Pair<i, i> pairN = N(fQ, fR, z15, eVar);
        i iVar = (i) pairN.first;
        i iVar2 = (i) pairN.second;
        Property property = View.TRANSLATION_X;
        if (!z15) {
            fQ = this.f35892g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fQ);
        Property property2 = View.TRANSLATION_Y;
        if (!z15) {
            fR = this.f35893h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fR);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void X(View view, View view2, boolean z15, boolean z16, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z15) {
            if (!z16) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        eVar.f35905a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y(View view, View view2, boolean z15, boolean z16, e eVar, float f15, float f16, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof zi.c) {
            zi.c cVar = (zi.c) view2;
            float fO = O(view, view2, eVar.f35906b);
            float fP = P(view, view2, eVar.f35906b);
            ((FloatingActionButton) view).h(this.f35888c);
            float fWidth = this.f35888c.width() / 2.0f;
            i iVarE = eVar.f35905a.e("expansion");
            if (z15) {
                if (!z16) {
                    cVar.setRevealInfo(new zi.c.e(fO, fP, fWidth));
                }
                if (z16) {
                    fWidth = cVar.getRevealInfo().f235323c;
                }
                animatorA = zi.a.a(cVar, fO, fP, fj.a.c(fO, fP, 0.0f, 0.0f, f15, f16));
                animatorA.addListener(new d(cVar));
                b0(view2, iVarE.c(), (int) fO, (int) fP, fWidth, list);
            } else {
                float f17 = cVar.getRevealInfo().f235323c;
                Animator animatorA2 = zi.a.a(cVar, fO, fP, fWidth);
                int i15 = (int) fO;
                int i16 = (int) fP;
                b0(view2, iVarE.c(), i15, i16, f17, list);
                a0(view2, iVarE.c(), iVarE.d(), eVar.f35905a.f(), i15, i16, fWidth, list);
                animatorA = animatorA2;
            }
            iVarE.a(animatorA);
            list.add(animatorA);
            list2.add(zi.a.b(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Z(View view, View view2, boolean z15, boolean z16, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof zi.c) && (view instanceof ImageView)) {
            zi.c cVar = (zi.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z15) {
                if (!z16) {
                    drawable.setAlpha(GF2Field.MASK);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, si.e.f181923a, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, si.e.f181923a, GF2Field.MASK);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f35905a.e("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(cVar, drawable));
        }
    }

    private void a0(View view, long j15, long j16, long j17, int i15, int i16, float f15, List<Animator> list) {
        long j18 = j15 + j16;
        if (j18 < j17) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i15, i16, f15, f15);
            animatorCreateCircularReveal.setStartDelay(j18);
            animatorCreateCircularReveal.setDuration(j17 - j18);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void b0(View view, long j15, int i15, int i16, float f15, List<Animator> list) {
        if (j15 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i15, i16, f15, f15);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j15);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void c0(View view, View view2, boolean z15, boolean z16, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        i iVar;
        i iVar2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fQ = Q(view, view2, eVar.f35906b);
        float fR = R(view, view2, eVar.f35906b);
        Pair<i, i> pairN = N(fQ, fR, z15, eVar);
        i iVar3 = (i) pairN.first;
        i iVar4 = (i) pairN.second;
        if (z15) {
            if (!z16) {
                view2.setTranslationX(-fQ);
                view2.setTranslationY(-fR);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            iVar = iVar4;
            iVar2 = iVar3;
            L(view2, eVar, iVar2, iVar, -fQ, -fR, 0.0f, 0.0f, rectF);
        } else {
            iVar = iVar4;
            iVar2 = iVar3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fQ);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fR);
        }
        iVar2.a(objectAnimatorOfFloat);
        iVar.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int d0(View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z15, boolean z16) {
        e eVarE0 = e0(view2.getContext(), z15);
        if (z15) {
            this.f35892g = view.getTranslationX();
            this.f35893h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        X(view, view2, z15, z16, eVarE0, arrayList, arrayList2);
        RectF rectF = this.f35889d;
        c0(view, view2, z15, z16, eVarE0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        W(view, view2, z15, eVarE0, arrayList);
        Z(view, view2, z15, z16, eVarE0, arrayList, arrayList2);
        Y(view, view2, z15, z16, eVarE0, fWidth, fHeight, arrayList, arrayList2);
        V(view, view2, z15, z16, eVarE0, arrayList, arrayList2);
        U(view, view2, z15, z16, eVarE0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        si.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z15, view2, view));
        int size = arrayList2.size();
        for (int i15 = 0; i15 < size; i15++) {
            animatorSet.addListener(arrayList2.get(i15));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    protected abstract e e0(Context context, boolean z15);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f11790h == 0) {
            fVar.f11790h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35888c = new Rect();
        this.f35889d = new RectF();
        this.f35890e = new RectF();
        this.f35891f = new int[2];
    }
}
