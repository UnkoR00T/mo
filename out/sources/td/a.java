package td;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends ValueAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f189572a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f189573b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Animator.AnimatorPauseListener> f189574c = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f189573b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f189574c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f189572a.add(animatorUpdateListener);
    }

    void b() {
        Iterator<Animator.AnimatorListener> it = this.f189573b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void c(boolean z15) {
        Iterator<Animator.AnimatorListener> it = this.f189573b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z15);
        }
    }

    void e() {
        Iterator<Animator.AnimatorPauseListener> it = this.f189574c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void g() {
        Iterator<Animator.AnimatorListener> it = this.f189573b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void i() {
        Iterator<Animator.AnimatorPauseListener> it = this.f189574c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    void j(boolean z15) {
        Iterator<Animator.AnimatorListener> it = this.f189573b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z15);
        }
    }

    void l() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f189572a.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f189573b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f189572a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f189573b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f189574c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f189572a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j15) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j15) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
