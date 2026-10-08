package androidx.fragment.app;

import CON.BackEventCompat;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import fr.p0;
import j6.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\b%&'#()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006,"}, d2 = {"Landroidx/fragment/app/e;", "Landroidx/fragment/app/k0;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/k0$d;", "operations", "Loq/i0;", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/e$b;", "animationInfos", "F", "Landroidx/fragment/app/e$h;", "transitionInfos", "", "isPop", "firstOut", "lastIn", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/util/List;ZLandroidx/fragment/app/k0$d;Landroidx/fragment/app/k0$d;)V", "Lr0/a;", "", "Landroid/view/View;", "", "names", "J", "(Lr0/a;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", "d", "(Ljava/util/List;Z)V", "a", "b", "c", "e", "f", "g", "h", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends k0 {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/e$a;", "Landroidx/fragment/app/k0$b;", "Landroidx/fragment/app/e$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/e$b;)V", "Landroid/view/ViewGroup;", "container", "Loq/i0;", "d", "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/e$b;", "h", "()Landroidx/fragment/app/e$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class a extends k0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animationInfo;

        /* JADX INFO: renamed from: androidx.fragment.app.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/e$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Loq/i0;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AnimationAnimationListenerC0262a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0.d f12452a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f12453b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f12454c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f12455d;

            AnimationAnimationListenerC0262a(k0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f12452a = dVar;
                this.f12453b = viewGroup;
                this.f12454c = view;
                this.f12455d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                viewGroup.endViewTransition(view);
                aVar.getAnimationInfo().getOperation().e(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                final ViewGroup viewGroup = this.f12453b;
                final View view = this.f12454c;
                final a aVar = this.f12455d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.AnimationAnimationListenerC0262a.b(viewGroup, view, aVar);
                    }
                });
                if (FragmentManager.L0(2)) {
                    Objects.toString(this.f12452a);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (FragmentManager.L0(2)) {
                    Objects.toString(this.f12452a);
                }
            }
        }

        public a(b bVar) {
            this.animationInfo = bVar;
        }

        @Override // androidx.fragment.app.k0.b
        public void c(ViewGroup container) {
            k0.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().R;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().e(this);
            if (FragmentManager.L0(2)) {
                operation.toString();
            }
        }

        @Override // androidx.fragment.app.k0.b
        public void d(ViewGroup container) {
            if (this.animationInfo.b()) {
                this.animationInfo.getOperation().e(this);
                return;
            }
            Context context = container.getContext();
            k0.d operation = this.animationInfo.getOperation();
            View view = operation.getFragment().R;
            q.a aVarC = this.animationInfo.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f12654a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != k0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.animationInfo.getOperation().e(this);
                return;
            }
            container.startViewTransition(view);
            q.b bVar = new q.b(animation, container, view);
            bVar.setAnimationListener(new AnimationAnimationListenerC0262a(operation, container, view, this));
            view.startAnimation(bVar);
            if (FragmentManager.L0(2)) {
                operation.toString();
            }
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getAnimationInfo() {
            return this.animationInfo;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/e$b;", "Landroidx/fragment/app/e$f;", "Landroidx/fragment/app/k0$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/k0$d;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/q$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/q$a;", "b", "Z", "isAnimLoaded", "d", "Landroidx/fragment/app/q$a;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isAnimLoaded;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private q.a animation;

        public b(k0.d dVar, boolean z15) {
            super(dVar);
            this.isPop = z15;
        }

        public final q.a c(Context context) {
            if (this.isAnimLoaded) {
                return this.animation;
            }
            q.a aVarB = q.b(context, getOperation().getFragment(), getOperation().getFinalState() == k0.d.b.VISIBLE, this.isPop);
            this.animation = aVarB;
            this.isAnimLoaded = true;
            return aVarB;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/e$c;", "Landroidx/fragment/app/k0$b;", "Landroidx/fragment/app/e$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/e$b;)V", "Landroid/view/ViewGroup;", "container", "Loq/i0;", "f", "(Landroid/view/ViewGroup;)V", "LCON/b;", "backEvent", "e", "(LCON/b;Landroid/view/ViewGroup;)V", "d", "c", "Landroidx/fragment/app/e$b;", "h", "()Landroidx/fragment/app/e$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "b", "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends k0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b animatorInfo;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private AnimatorSet animator;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/e$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "Loq/i0;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f12461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f12462b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f12463c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k0.d f12464d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f12465e;

            a(ViewGroup viewGroup, View view, boolean z15, k0.d dVar, c cVar) {
                this.f12461a = viewGroup;
                this.f12462b = view;
                this.f12463c = z15;
                this.f12464d = dVar;
                this.f12465e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                this.f12461a.endViewTransition(this.f12462b);
                if (this.f12463c || this.f12464d.getFinalState() == k0.d.b.GONE) {
                    this.f12464d.getFinalState().e(this.f12462b, this.f12461a);
                }
                this.f12465e.getAnimatorInfo().getOperation().e(this.f12465e);
                if (FragmentManager.L0(2)) {
                    Objects.toString(this.f12464d);
                }
            }
        }

        public c(b bVar) {
            this.animatorInfo = bVar;
        }

        @Override // androidx.fragment.app.k0.b
        /* JADX INFO: renamed from: b */
        public boolean getIsSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.k0.b
        public void c(ViewGroup container) {
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            k0.d operation = this.animatorInfo.getOperation();
            if (operation.getIsSeeking()) {
                C0263e.f12467a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.L0(2)) {
                operation.toString();
                operation.getIsSeeking();
            }
        }

        @Override // androidx.fragment.app.k0.b
        public void d(ViewGroup container) {
            k0.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.L0(2)) {
                Objects.toString(operation);
            }
        }

        @Override // androidx.fragment.app.k0.b
        public void e(BackEventCompat backEvent, ViewGroup container) {
            k0.d operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().f12603p) {
                return;
            }
            if (FragmentManager.L0(2)) {
                operation.toString();
            }
            long jA = d.f12466a.a(animatorSet);
            long progress = (long) (backEvent.getProgress() * jA);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == jA) {
                progress = jA - 1;
            }
            if (FragmentManager.L0(2)) {
                animatorSet.toString();
                operation.toString();
            }
            C0263e.f12467a.b(animatorSet, progress);
        }

        @Override // androidx.fragment.app.k0.b
        public void f(ViewGroup container) {
            c cVar;
            if (this.animatorInfo.b()) {
                return;
            }
            q.a aVarC = this.animatorInfo.c(container.getContext());
            this.animator = aVarC != null ? aVarC.f12655b : null;
            k0.d operation = this.animatorInfo.getOperation();
            o fragment = operation.getFragment();
            boolean z15 = operation.getFinalState() == k0.d.b.GONE;
            View view = fragment.R;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z15, operation, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getAnimatorInfo() {
            return this.animatorInfo;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/e$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f12466a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/e$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "Loq/i0;", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0263e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0263e f12467a = new C0263e();

        private C0263e() {
        }

        public final void a(AnimatorSet animatorSet) {
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long time) {
            animatorSet.setCurrentPlayTime(time);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/e$f;", "", "Landroidx/fragment/app/k0$d;", "operation", "<init>", "(Landroidx/fragment/app/k0$d;)V", "a", "Landroidx/fragment/app/k0$d;", "()Landroidx/fragment/app/k0$d;", "", "b", "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k0.d operation;

        public f(k0.d dVar) {
            this.operation = dVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k0.d getOperation() {
            return this.operation;
        }

        public final boolean b() {
            View view = this.operation.getFragment().R;
            k0.d.b bVarA = view != null ? k0.d.b.INSTANCE.a(view) : null;
            k0.d.b finalState = this.operation.getFinalState();
            if (bVarA == finalState) {
                return true;
            }
            k0.d.b bVar = k0.d.b.VISIBLE;
            return (bVarA == bVar || finalState == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\bb\u0010T\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010TR\u0011\u0010i\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bh\u0010T¨\u0006j"}, d2 = {"Landroidx/fragment/app/e$g;", "Landroidx/fragment/app/k0$b;", "", "Landroidx/fragment/app/e$h;", "transitionInfos", "Landroidx/fragment/app/k0$d;", "firstOut", "lastIn", "Landroidx/fragment/app/f0;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Lr0/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/k0$d;Landroidx/fragment/app/k0$d;Landroidx/fragment/app/f0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lr0/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lr0/a;Lr0/a;Z)V", "Landroid/view/ViewGroup;", "container", "Loq/r;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/k0$d;Landroidx/fragment/app/k0$d;)Loq/r;", "enteringViews", "Lkotlin/Function0;", "Loq/i0;", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Ler/a;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "LCON/b;", "backEvent", "e", "(LCON/b;Landroid/view/ViewGroup;)V", "d", "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/k0$d;", "t", "()Landroidx/fragment/app/k0$d;", "u", "g", "Landroidx/fragment/app/f0;", "v", "()Landroidx/fragment/app/f0;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "i", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "Lr0/a;", "getSharedElementNameMapping", "()Lr0/a;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "Le6/d;", "q", "Le6/d;", "getTransitionSignal", "()Le6/d;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "getNoControllerReturned", ip.a.f96138c, "(Z)V", "noControllerReturned", "b", "isSeekingSupported", "x", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class g extends k0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<h> transitionInfos;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final k0.d firstOut;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final k0.d lastIn;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final f0 transitionImpl;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementFirstOutViews;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<View> sharedElementLastInViews;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final r0.a<String, String> sharedElementNameMapping;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> enteringNames;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<String> exitingNames;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final r0.a<String, View> firstOutViews;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final r0.a<String, View> lastInViews;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final boolean isPop;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final e6.d transitionSignal = new e6.d();

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Object controller;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean noControllerReturned;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends fr.w implements er.a<oq.i0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewGroup f12486c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f12487d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f12486c = viewGroup;
                this.f12487d = obj;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ oq.i0 a() {
                c();
                return oq.i0.f148189a;
            }

            public final void c() {
                g.this.getTransitionImpl().e(this.f12486c, this.f12487d);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends fr.w implements er.a<oq.i0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewGroup f12489c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f12490d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ p0<er.a<oq.i0>> f12491e;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "f", "()V"}, k = 3, mv = {1, 8, 0})
            static final class a extends fr.w implements er.a<oq.i0> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g f12492b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f12493c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ViewGroup f12494d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f12492b = gVar;
                    this.f12493c = obj;
                    this.f12494d = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void h(g gVar, ViewGroup viewGroup) {
                    Iterator<T> it = gVar.w().iterator();
                    while (it.hasNext()) {
                        k0.d operation = ((h) it.next()).getOperation();
                        View viewC0 = operation.getFragment().c0();
                        if (viewC0 != null) {
                            operation.getFinalState().e(viewC0, viewGroup);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void i(g gVar) {
                    FragmentManager.L0(2);
                    Iterator<T> it = gVar.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).getOperation().e(gVar);
                    }
                }

                @Override // er.a
                public /* bridge */ /* synthetic */ oq.i0 a() {
                    f();
                    return oq.i0.f148189a;
                }

                public final void f() {
                    List<h> listW = this.f12492b.w();
                    if (!(listW instanceof Collection) || !listW.isEmpty()) {
                        Iterator<T> it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).getOperation().getIsSeeking()) {
                                FragmentManager.L0(2);
                                e6.d dVar = new e6.d();
                                f0 transitionImpl = this.f12492b.getTransitionImpl();
                                o fragment = this.f12492b.w().get(0).getOperation().getFragment();
                                Object obj = this.f12493c;
                                final g gVar = this.f12492b;
                                transitionImpl.w(fragment, obj, dVar, new Runnable() { // from class: androidx.fragment.app.m
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        e.g.b.a.i(gVar);
                                    }
                                });
                                dVar.a();
                                return;
                            }
                        }
                    }
                    FragmentManager.L0(2);
                    f0 transitionImpl2 = this.f12492b.getTransitionImpl();
                    Object controller = this.f12492b.getController();
                    final g gVar2 = this.f12492b;
                    final ViewGroup viewGroup = this.f12494d;
                    transitionImpl2.d(controller, new Runnable() { // from class: androidx.fragment.app.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.b.a.h(gVar2, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, p0<er.a<oq.i0>> p0Var) {
                super(0);
                this.f12489c = viewGroup;
                this.f12490d = obj;
                this.f12491e = p0Var;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ oq.i0 a() {
                c();
                return oq.i0.f148189a;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.e$g$b$a] */
            public final void c() {
                FragmentManager.L0(2);
                g gVar = g.this;
                gVar.C(gVar.getTransitionImpl().j(this.f12489c, this.f12490d));
                if (g.this.getController() == null) {
                    FragmentManager.L0(2);
                    g.this.D(true);
                    return;
                }
                this.f12491e.f66410a = new a(g.this, this.f12490d, this.f12489c);
                if (FragmentManager.L0(2)) {
                    Objects.toString(g.this.getFirstOut());
                    Objects.toString(g.this.getLastIn());
                }
            }
        }

        public g(List<h> list, k0.d dVar, k0.d dVar2, f0 f0Var, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, r0.a<String, String> aVar, ArrayList<String> arrayList3, ArrayList<String> arrayList4, r0.a<String, View> aVar2, r0.a<String, View> aVar3, boolean z15) {
            this.transitionInfos = list;
            this.firstOut = dVar;
            this.lastIn = dVar2;
            this.transitionImpl = f0Var;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = arrayList;
            this.sharedElementLastInViews = arrayList2;
            this.sharedElementNameMapping = aVar;
            this.enteringNames = arrayList3;
            this.exitingNames = arrayList4;
            this.firstOutViews = aVar2;
            this.lastInViews = aVar3;
            this.isPop = z15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(k0.d dVar, g gVar) {
            if (FragmentManager.L0(2)) {
                Objects.toString(dVar);
            }
            dVar.e(gVar);
        }

        private final void B(ArrayList<View> enteringViews, ViewGroup container, er.a<oq.i0> executeTransition) {
            d0.e(enteringViews, 4);
            ArrayList<String> arrayListQ = this.transitionImpl.q(this.sharedElementLastInViews);
            if (FragmentManager.L0(2)) {
                for (View view : this.sharedElementFirstOutViews) {
                    Objects.toString(view);
                    j6.l0.E(view);
                }
                for (View view2 : this.sharedElementLastInViews) {
                    Objects.toString(view2);
                    j6.l0.E(view2);
                }
            }
            executeTransition.a();
            this.transitionImpl.y(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListQ, this.sharedElementNameMapping);
            d0.e(enteringViews, 0);
            this.transitionImpl.A(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        private final void n(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (q0.c(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = viewGroup.getChildAt(i15);
                if (childAt.getVisibility() == 0) {
                    n(transitioningViews, childAt);
                }
            }
        }

        private final oq.r<ArrayList<View>, Object> o(ViewGroup container, final k0.d lastIn, final k0.d firstOut) {
            lastIn = lastIn;
            firstOut = firstOut;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.transitionInfos.iterator();
            boolean z15 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && firstOut != null && lastIn != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    d0.a(lastIn.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    j6.b0.a(container, new Runnable() { // from class: androidx.fragment.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.p(lastIn, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        view2 = this.firstOutViews.get(this.exitingNames.get(0));
                        this.transitionImpl.v(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        final View view3 = this.lastInViews.get(this.enteringNames.get(0));
                        if (view3 != null) {
                            final f0 f0Var = this.transitionImpl;
                            j6.b0.a(container, new Runnable() { // from class: androidx.fragment.app.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.g.q(f0Var, view3, rect);
                                }
                            });
                            z15 = true;
                        }
                    }
                    this.transitionImpl.z(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    f0 f0Var2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    f0Var2.s(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Object objP = null;
            Object objP2 = null;
            for (h hVar : this.transitionInfos) {
                k0.d operation = hVar.getOperation();
                Object objH = this.transitionImpl.h(hVar.getTransition());
                if (objH != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    boolean z16 = z15;
                    n(arrayList2, operation.getFragment().R);
                    if (this.sharedElementTransition != null && (operation == firstOut || operation == lastIn)) {
                        if (operation == firstOut) {
                            arrayList2.removeAll(pq.v.k1(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(pq.v.k1(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.a(objH, view);
                    } else {
                        this.transitionImpl.b(objH, arrayList2);
                        this.transitionImpl.s(objH, objH, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == k0.d.b.GONE) {
                            operation.q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().R);
                            this.transitionImpl.r(objH, operation.getFragment().R, arrayList3);
                            j6.b0.a(container, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == k0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z16) {
                            this.transitionImpl.u(objH, rect);
                        }
                        if (FragmentManager.L0(2)) {
                            objH.toString();
                            Iterator<View> it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Objects.toString(it4.next());
                            }
                        }
                    } else {
                        this.transitionImpl.v(objH, view2);
                        if (FragmentManager.L0(2)) {
                            objH.toString();
                            Iterator<View> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Objects.toString(it5.next());
                            }
                        }
                    }
                    if (hVar.getIsOverlapAllowed()) {
                        objP = this.transitionImpl.p(objP, objH, null);
                    } else {
                        objP2 = this.transitionImpl.p(objP2, objH, null);
                    }
                    z15 = z16;
                }
            }
            Object objO = this.transitionImpl.o(objP, objP2, this.sharedElementTransition);
            if (FragmentManager.L0(2)) {
                Objects.toString(objO);
                container.toString();
            }
            return new oq.r<>(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(k0.d dVar, k0.d dVar2, g gVar) {
            d0.a(dVar.getFragment(), dVar2.getFragment(), gVar.isPop, gVar.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(f0 f0Var, View view, Rect rect) {
            f0Var.k(view, rect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList arrayList) {
            d0.e(arrayList, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(k0.d dVar, g gVar) {
            if (FragmentManager.L0(2)) {
                Objects.toString(dVar);
            }
            dVar.e(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(p0 p0Var) {
            er.a aVar = (er.a) p0Var.f66410a;
            if (aVar != null) {
                aVar.a();
            }
        }

        public final void C(Object obj) {
            this.controller = obj;
        }

        public final void D(boolean z15) {
            this.noControllerReturned = z15;
        }

        @Override // androidx.fragment.app.k0.b
        /* JADX INFO: renamed from: b */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.m()) {
                return false;
            }
            List<h> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.getTransition() == null || !this.transitionImpl.n(hVar.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.n(obj);
        }

        @Override // androidx.fragment.app.k0.b
        public void c(ViewGroup container) {
            this.transitionSignal.a();
        }

        @Override // androidx.fragment.app.k0.b
        public void d(ViewGroup container) {
            if (!container.isLaidOut() || this.noControllerReturned) {
                for (h hVar : this.transitionInfos) {
                    k0.d operation = hVar.getOperation();
                    if (FragmentManager.L0(2)) {
                        if (this.noControllerReturned) {
                            Objects.toString(operation);
                        } else {
                            container.toString();
                            Objects.toString(operation);
                        }
                    }
                    hVar.getOperation().e(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.c(obj);
                if (FragmentManager.L0(2)) {
                    Objects.toString(this.firstOut);
                    Objects.toString(this.lastIn);
                    return;
                }
                return;
            }
            oq.r<ArrayList<View>, Object> rVarO = o(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayListA = rVarO.a();
            Object objB = rVarO.b();
            List<h> list = this.transitionInfos;
            ArrayList<k0.d> arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).getOperation());
            }
            for (final k0.d dVar : arrayList) {
                this.transitionImpl.w(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.g.y(dVar, this);
                    }
                });
            }
            B(arrayListA, container, new a(container, objB));
            if (FragmentManager.L0(2)) {
                Objects.toString(this.firstOut);
                Objects.toString(this.lastIn);
            }
        }

        @Override // androidx.fragment.app.k0.b
        public void e(BackEventCompat backEvent, ViewGroup container) {
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.t(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.k0.b
        public void f(ViewGroup container) {
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    k0.d operation = ((h) it.next()).getOperation();
                    if (FragmentManager.L0(2)) {
                        container.toString();
                        Objects.toString(operation);
                    }
                }
                return;
            }
            if (x() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Objects.toString(this.sharedElementTransition);
                Objects.toString(this.firstOut);
                Objects.toString(this.lastIn);
            }
            if (getIsSeekingSupported() && x()) {
                final p0 p0Var = new p0();
                oq.r<ArrayList<View>, Object> rVarO = o(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListA = rVarO.a();
                Object objB = rVarO.b();
                List<h> list = this.transitionInfos;
                ArrayList<k0.d> arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((h) it4.next()).getOperation());
                }
                for (final k0.d dVar : arrayList) {
                    this.transitionImpl.x(dVar.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.z(p0Var);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.A(dVar, this);
                        }
                    });
                }
                B(arrayListA, container, new b(container, objB, p0Var));
            }
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final Object getController() {
            return this.controller;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final k0.d getFirstOut() {
            return this.firstOut;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final k0.d getLastIn() {
            return this.lastIn;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final f0 getTransitionImpl() {
            return this.transitionImpl;
        }

        public final List<h> w() {
            return this.transitionInfos;
        }

        public final boolean x() {
            List<h> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).getOperation().getFragment().f12603p) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/e$h;", "Landroidx/fragment/app/e$f;", "Landroidx/fragment/app/k0$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/k0$d;ZZ)V", "", "transition", "Landroidx/fragment/app/f0;", "d", "(Ljava/lang/Object;)Landroidx/fragment/app/f0;", "g", "()Z", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Landroidx/fragment/app/f0;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class h extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object transition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isOverlapAllowed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object sharedElementTransition;

        public h(k0.d dVar, boolean z15, boolean z16) {
            Object objU;
            super(dVar);
            k0.d.b finalState = dVar.getFinalState();
            k0.d.b bVar = k0.d.b.VISIBLE;
            if (finalState == bVar) {
                o fragment = dVar.getFragment();
                objU = z15 ? fragment.S() : fragment.B();
            } else {
                o fragment2 = dVar.getFragment();
                objU = z15 ? fragment2.U() : fragment2.E();
            }
            this.transition = objU;
            this.isOverlapAllowed = dVar.getFinalState() == bVar ? z15 ? dVar.getFragment().t() : dVar.getFragment().s() : true;
            this.sharedElementTransition = z16 ? z15 ? dVar.getFragment().W() : dVar.getFragment().V() : null;
        }

        private final f0 d(Object transition) {
            if (transition == null) {
                return null;
            }
            f0 f0Var = d0.PLATFORM_IMPL;
            if (f0Var != null && f0Var.g(transition)) {
                return f0Var;
            }
            f0 f0Var2 = d0.SUPPORT_IMPL;
            if (f0Var2 != null && f0Var2.g(transition)) {
                return f0Var2;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final f0 c() {
            f0 f0VarD = d(this.transition);
            f0 f0VarD2 = d(this.sharedElementTransition);
            if (f0VarD == null || f0VarD2 == null || f0VarD == f0VarD2) {
                return f0VarD == null ? f0VarD2 : f0VarD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean g() {
            return this.sharedElementTransition != null;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "entry", "", "c", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends fr.w implements er.l<Map.Entry<String, View>, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<String> f12498b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection) {
            super(1);
            this.f12498b = collection;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(Map.Entry<String, View> entry) {
            return Boolean.valueOf(pq.v.c0(this.f12498b, j6.l0.E(entry.getValue())));
        }
    }

    public e(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void F(List<b> animationInfos) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList2, ((b) it.next()).getOperation().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z15 = false;
        for (b bVar : animationInfos) {
            Context context = getContainer().getContext();
            k0.d operation = bVar.getOperation();
            q.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f12655b == null) {
                    arrayList.add(bVar);
                } else {
                    o fragment = operation.getFragment();
                    if (operation.f().isEmpty()) {
                        if (operation.getFinalState() == k0.d.b.GONE) {
                            operation.q(false);
                        }
                        operation.b(new c(bVar));
                        z15 = true;
                    } else if (FragmentManager.L0(2)) {
                        Objects.toString(fragment);
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            k0.d operation2 = bVar2.getOperation();
            o fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z15) {
                    operation2.b(new a(bVar2));
                } else if (FragmentManager.L0(2)) {
                    Objects.toString(fragment2);
                }
            } else if (FragmentManager.L0(2)) {
                Objects.toString(fragment2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(e eVar, k0.d dVar) {
        eVar.c(dVar);
    }

    private final void H(List<h> transitionInfos, boolean isPop, k0.d firstOut, k0.d lastIn) {
        Object objB;
        ArrayList arrayList;
        byte b15;
        ArrayList<String> arrayListY;
        int i15;
        String strB;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : transitionInfos) {
            if (!((h) obj).b()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((h) obj2).c() != null) {
                arrayList3.add(obj2);
            }
        }
        f0 f0Var = null;
        for (h hVar : arrayList3) {
            f0 f0VarC = hVar.c();
            if (f0Var != null && f0VarC != f0Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.getOperation().getFragment() + " returned Transition " + hVar.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            f0Var = f0VarC;
        }
        if (f0Var == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        r0.a aVar = new r0.a();
        ArrayList<String> arrayList6 = new ArrayList<>();
        ArrayList<String> arrayList7 = new ArrayList<>();
        r0.a<String, View> aVar2 = new r0.a<>();
        r0.a<String, View> aVar3 = new r0.a<>();
        Iterator it = arrayList3.iterator();
        ArrayList<String> arrayList8 = arrayList6;
        ArrayList<String> arrayListX = arrayList7;
        loop3: while (true) {
            objB = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop3;
                }
                h hVar2 = (h) it.next();
                if (!hVar2.g() || firstOut == null || lastIn == null) {
                    arrayList = arrayList3;
                } else {
                    objB = f0Var.B(f0Var.h(hVar2.getSharedElementTransition()));
                    arrayListX = lastIn.getFragment().X();
                    ArrayList<String> arrayListX2 = firstOut.getFragment().X();
                    ArrayList<String> arrayListY2 = firstOut.getFragment().Y();
                    int size = arrayListY2.size();
                    int i16 = 0;
                    while (true) {
                        b15 = -1;
                        if (i16 >= size) {
                            break;
                        }
                        ArrayList arrayList9 = arrayList3;
                        int iIndexOf = arrayListX.indexOf(arrayListY2.get(i16));
                        if (iIndexOf != -1) {
                            arrayListX.set(iIndexOf, arrayListX2.get(i16));
                        }
                        i16++;
                        arrayList3 = arrayList9;
                    }
                    arrayList = arrayList3;
                    arrayListY = lastIn.getFragment().Y();
                    oq.r rVarA = !isPop ? oq.y.a(firstOut.getFragment().F(), lastIn.getFragment().C()) : oq.y.a(firstOut.getFragment().C(), lastIn.getFragment().F());
                    s5.v vVar = (s5.v) rVarA.a();
                    s5.v vVar2 = (s5.v) rVarA.b();
                    int i17 = 0;
                    for (int size2 = arrayListX.size(); i17 < size2; size2 = size2) {
                        aVar.put(arrayListX.get(i17), arrayListY.get(i17));
                        i17++;
                        b15 = b15;
                    }
                    int i18 = 2;
                    if (FragmentManager.L0(2)) {
                        for (String str : arrayListY) {
                        }
                        for (String str2 : arrayListX) {
                        }
                    }
                    I(aVar2, firstOut.getFragment().R);
                    aVar2.o(arrayListX);
                    if (vVar != null) {
                        if (FragmentManager.L0(2)) {
                            firstOut.toString();
                        }
                        vVar.a(arrayListX, aVar2);
                        int size3 = arrayListX.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i19 = size3 - 1;
                                String str3 = arrayListX.get(size3);
                                View view = aVar2.get(str3);
                                if (view == null) {
                                    aVar.remove(str3);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                    if (!fr.t.c(str3, j6.l0.E(view))) {
                                        aVar.put(j6.l0.E(view), (String) aVar.remove(str3));
                                    }
                                }
                                if (i19 < 0) {
                                    break;
                                }
                                size3 = i19;
                                i18 = i15;
                            }
                        } else {
                            i15 = 2;
                        }
                    } else {
                        i15 = 2;
                        aVar.o(aVar2.keySet());
                    }
                    I(aVar3, lastIn.getFragment().R);
                    aVar3.o(arrayListY);
                    aVar3.o(aVar.values());
                    if (vVar2 != null) {
                        if (FragmentManager.L0(i15)) {
                            lastIn.toString();
                        }
                        vVar2.a(arrayListY, aVar3);
                        int size4 = arrayListY.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i25 = size4 - 1;
                                String str4 = arrayListY.get(size4);
                                View view2 = aVar3.get(str4);
                                if (view2 == null) {
                                    String strB2 = d0.b(aVar, str4);
                                    if (strB2 != null) {
                                        aVar.remove(strB2);
                                    }
                                } else if (!fr.t.c(str4, j6.l0.E(view2)) && (strB = d0.b(aVar, str4)) != null) {
                                    aVar.put(strB, j6.l0.E(view2));
                                }
                                if (i25 < 0) {
                                    break;
                                } else {
                                    size4 = i25;
                                }
                            }
                        }
                    } else {
                        d0.d(aVar, aVar3);
                    }
                    J(aVar2, aVar.keySet());
                    J(aVar3, aVar.values());
                    if (aVar.isEmpty()) {
                        break;
                    } else {
                        arrayList8 = arrayListY;
                    }
                }
                arrayList3 = arrayList;
            }
            Objects.toString(objB);
            firstOut.toString();
            lastIn.toString();
            arrayList4.clear();
            arrayList5.clear();
            arrayList8 = arrayListY;
            arrayList3 = arrayList;
        }
        ArrayList arrayList10 = arrayList3;
        if (objB == null) {
            if (arrayList10.isEmpty()) {
                return;
            }
            Iterator it4 = arrayList10.iterator();
            while (it4.hasNext()) {
                if (((h) it4.next()).getTransition() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList10, firstOut, lastIn, f0Var, objB, arrayList4, arrayList5, aVar, arrayList8, arrayListX, aVar2, aVar3, isPop);
        Iterator it5 = arrayList10.iterator();
        while (it5.hasNext()) {
            ((h) it5.next()).getOperation().b(gVar);
        }
    }

    private final void I(Map<String, View> namedViews, View view) {
        String strE = j6.l0.E(view);
        if (strE != null) {
            namedViews.put(strE, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = viewGroup.getChildAt(i15);
                if (childAt.getVisibility() == 0) {
                    I(namedViews, childAt);
                }
            }
        }
    }

    private final void J(r0.a<String, View> aVar, Collection<String> collection) {
        pq.v.O(aVar.entrySet(), new i(collection));
    }

    private final void K(List<? extends k0.d> operations) {
        o fragment = ((k0.d) pq.v.x0(operations)).getFragment();
        for (k0.d dVar : operations) {
            dVar.getFragment().Y.f12632c = fragment.Y.f12632c;
            dVar.getFragment().Y.f12633d = fragment.Y.f12633d;
            dVar.getFragment().Y.f12634e = fragment.Y.f12634e;
            dVar.getFragment().Y.f12635f = fragment.Y.f12635f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    @Override // androidx.fragment.app.k0
    public void d(List<? extends k0.d> operations, boolean isPop) {
        k0.d dVar;
        Object next;
        FragmentManager.L0(2);
        Iterator<T> it = operations.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            k0.d dVar2 = (k0.d) next;
            k0.d.b bVarA = k0.d.b.INSTANCE.a(dVar2.getFragment().R);
            k0.d.b bVar = k0.d.b.VISIBLE;
            if (bVarA == bVar && dVar2.getFinalState() != bVar) {
                break;
            }
        }
        k0.d dVar3 = (k0.d) next;
        ListIterator<? extends k0.d> listIterator = operations.listIterator(operations.size());
        while (listIterator.hasPrevious()) {
            k0.d dVarPrevious = listIterator.previous();
            k0.d dVar4 = dVarPrevious;
            k0.d.b bVarA2 = k0.d.b.INSTANCE.a(dVar4.getFragment().R);
            k0.d.b bVar2 = k0.d.b.VISIBLE;
            if (bVarA2 != bVar2 && dVar4.getFinalState() == bVar2) {
                dVar = dVarPrevious;
                break;
            }
        }
        k0.d dVar5 = dVar;
        if (FragmentManager.L0(2)) {
            Objects.toString(dVar3);
            Objects.toString(dVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        K(operations);
        for (final k0.d dVar6 : operations) {
            arrayList.add(new b(dVar6, isPop));
            boolean z15 = false;
            if (isPop) {
                if (dVar6 == dVar3) {
                    z15 = true;
                }
            } else if (dVar6 == dVar5) {
                z15 = true;
            }
            arrayList2.add(new h(dVar6, isPop, z15));
            dVar6.a(new Runnable() { // from class: e7.a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.e.G(this.f47901a, dVar6);
                }
            });
        }
        H(arrayList2, isPop, dVar3, dVar5);
        F(arrayList);
    }
}
