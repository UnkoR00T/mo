package d1;

import android.os.Build;
import android.view.View;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R$\u00105\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Ld1/s1;", "Lj6/a1$b;", "Ljava/lang/Runnable;", "Lj6/y;", "Landroid/view/View$OnAttachStateChangeListener;", "Ld1/e4;", "composeInsets", "<init>", "(Ld1/e4;)V", "Lj6/a1;", "animation", "Loq/i0;", "d", "(Lj6/a1;)V", "Lj6/a1$a;", "bounds", "f", "(Lj6/a1;Lj6/a1$a;)Lj6/a1$a;", "Lj6/f1;", "insets", "", "runningAnimations", "e", "(Lj6/f1;Ljava/util/List;)Lj6/f1;", "c", "Landroid/view/View;", "view", "b", "(Landroid/view/View;Lj6/f1;)Lj6/f1;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "Ld1/e4;", "getComposeInsets", "()Ld1/e4;", "", "Z", "getPrepared", "()Z", "setPrepared", "(Z)V", "prepared", "getRunningAnimation", "setRunningAnimation", "runningAnimation", "Lj6/f1;", "getSavedInsets", "()Lj6/f1;", "setSavedInsets", "(Lj6/f1;)V", "savedInsets", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s1 extends j6.a1.b implements Runnable, j6.y, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e4 composeInsets;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean prepared;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean runningAnimation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private j6.f1 savedInsets;

    public s1(e4 e4Var) {
        super(!e4Var.getConsumes() ? 1 : 0);
        this.composeInsets = e4Var;
    }

    @Override // j6.y
    public j6.f1 b(View view, j6.f1 insets) {
        this.savedInsets = insets;
        this.composeInsets.u(insets);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.t(insets);
            e4.s(this.composeInsets, insets, 0, 2, null);
        }
        return this.composeInsets.getConsumes() ? j6.f1.f99644b : insets;
    }

    @Override // j6.a1.b
    public void c(j6.a1 animation) {
        this.prepared = false;
        this.runningAnimation = false;
        j6.f1 f1Var = this.savedInsets;
        if (animation.b() > 0 && f1Var != null) {
            this.composeInsets.t(f1Var);
            this.composeInsets.u(f1Var);
            e4.s(this.composeInsets, f1Var, 0, 2, null);
        }
        this.savedInsets = null;
        super.c(animation);
    }

    @Override // j6.a1.b
    public void d(j6.a1 animation) {
        this.prepared = true;
        this.runningAnimation = true;
        super.d(animation);
    }

    @Override // j6.a1.b
    public j6.f1 e(j6.f1 insets, List<j6.a1> runningAnimations) {
        e4.s(this.composeInsets, insets, 0, 2, null);
        return this.composeInsets.getConsumes() ? j6.f1.f99644b : insets;
    }

    @Override // j6.a1.b
    public j6.a1.a f(j6.a1 animation, j6.a1.a bounds) {
        this.prepared = false;
        return super.f(animation, bounds);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v15) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            j6.f1 f1Var = this.savedInsets;
            if (f1Var != null) {
                this.composeInsets.t(f1Var);
                e4.s(this.composeInsets, f1Var, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }
}
