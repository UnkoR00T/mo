package oe;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import ie.t;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set<Activity> f144982a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f144983b;

    class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f144984a;

        /* JADX INFO: renamed from: oe.h$a$a, reason: collision with other inner class name */
        class RunnableC3596a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f144986a;

            RunnableC3596a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f144986a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.b().h();
                h.this.f144983b = true;
                h.b(a.this.f144984a, this.f144986a);
                h.this.f144982a.clear();
            }
        }

        a(View view) {
            this.f144984a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            ve.l.u(new RunnableC3596a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // oe.i
    public void a(Activity activity) {
        if (!this.f144983b && this.f144982a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
