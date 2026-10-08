package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AnimatorSet f35886b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f35886b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean H(View view, View view2, boolean z15, boolean z16) {
        AnimatorSet animatorSet = this.f35886b;
        boolean z17 = animatorSet != null;
        if (z17) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetJ = J(view, view2, z15, z17);
        this.f35886b = animatorSetJ;
        animatorSetJ.addListener(new a());
        this.f35886b.start();
        if (!z16) {
            this.f35886b.end();
        }
        return true;
    }

    protected abstract AnimatorSet J(View view, View view2, boolean z15, boolean z16);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
