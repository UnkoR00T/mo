package mw3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import er.l;
import fr.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lmw3/c;", "Lmw3/a;", "<init>", "()V", "Landroid/graphics/Matrix;", "startMatrix", "endMatrix", "Lkotlin/Function1;", "Loq/i0;", "onUpdate", "Lkotlin/Function0;", "onEnd", "a", "(Landroid/graphics/Matrix;Landroid/graphics/Matrix;Ler/l;Ler/a;)V", "cancel", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "matrixAnimator", "b", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements mw3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f128936b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f128937c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator matrixAnimator;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmw3/c$a;", "", "<init>", "()V", "", "MATRIX_ARRAY_SIZE", "I", "", "MATRIX_ANIMATION_DURATION", "J", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Loq/i0;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a f128939a;

        public b(er.a aVar) {
            this.f128939a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f128939a.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(float[] fArr, float[] fArr2, float[] fArr3, Matrix matrix, l lVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i15 = 0; i15 < 9; i15++) {
            float f15 = fArr2[i15];
            fArr[i15] = f15 + ((fArr3[i15] - f15) * fFloatValue);
        }
        matrix.setValues(fArr);
        lVar.b(new Matrix(matrix));
    }

    @Override // mw3.a
    public void a(Matrix startMatrix, Matrix endMatrix, final l<? super Matrix, i0> onUpdate, er.a<i0> onEnd) {
        final float[] fArr = new float[9];
        startMatrix.getValues(fArr);
        final float[] fArr2 = new float[9];
        endMatrix.getValues(fArr2);
        final float[] fArr3 = new float[9];
        final Matrix matrix = new Matrix();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(180L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mw3.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.c(fArr3, fArr, fArr2, matrix, onUpdate, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(onEnd));
        valueAnimatorOfFloat.start();
        this.matrixAnimator = valueAnimatorOfFloat;
    }

    @Override // mw3.a
    public void cancel() {
        ValueAnimator valueAnimator = this.matrixAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
