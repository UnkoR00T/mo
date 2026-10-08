package si;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f181930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f181931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f181932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f181933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f181934e;

    public i(long j15, long j16) {
        this.f181932c = null;
        this.f181933d = 0;
        this.f181934e = 1;
        this.f181930a = j15;
        this.f181931b = j16;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        iVar.f181933d = valueAnimator.getRepeatCount();
        iVar.f181934e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(f());
            valueAnimator.setRepeatMode(g());
        }
    }

    public long c() {
        return this.f181930a;
    }

    public long d() {
        return this.f181931b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f181932c;
        return timeInterpolator != null ? timeInterpolator : a.f181917b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && f() == iVar.f() && g() == iVar.g()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int f() {
        return this.f181933d;
    }

    public int g() {
        return this.f181934e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public i(long j15, long j16, TimeInterpolator timeInterpolator) {
        this.f181933d = 0;
        this.f181934e = 1;
        this.f181930a = j15;
        this.f181931b = j16;
        this.f181932c = timeInterpolator;
    }
}
