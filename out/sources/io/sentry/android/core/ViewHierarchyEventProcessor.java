package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.b7;
import io.sentry.r6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f93745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.l f93746b = new io.sentry.android.core.internal.util.l(io.sentry.android.core.internal.util.f.b(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f93745a = (SentryAndroidOptions) io.sentry.util.v.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.p.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, io.sentry.v0 v0Var) {
        try {
            atomicReference.set(e(view, list));
            countDownLatch.countDown();
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "Failed to process view hierarchy.", th4);
        }
    }

    private static void c(View view, io.sentry.protocol.i0 i0Var, List<io.sentry.internal.viewhierarchy.a> list) {
        if (view instanceof ViewGroup) {
            Iterator<io.sentry.internal.viewhierarchy.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a(i0Var, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = viewGroup.getChildAt(i15);
                if (childAt != null) {
                    io.sentry.protocol.i0 i0VarF = f(childAt);
                    arrayList.add(i0VarF);
                    c(childAt, i0VarF, list);
                }
            }
            i0Var.o(arrayList);
        }
    }

    public static io.sentry.protocol.h0 d(Activity activity, final List<io.sentry.internal.viewhierarchy.a> list, io.sentry.util.thread.a aVar, io.sentry.v0 v0Var) {
        final io.sentry.v0 v0Var2;
        Throwable th4;
        if (activity == null) {
            v0Var.c(b7.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            v0Var.c(b7.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            v0Var.c(b7.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
            if (!aVar.a()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference(null);
                v0Var2 = v0Var;
                try {
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.h2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewHierarchyEventProcessor.a(atomicReference, viewPeekDecorView, list, countDownLatch, v0Var2);
                        }
                    });
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        return (io.sentry.protocol.h0) atomicReference.get();
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th4 = th;
                    v0Var2.b(b7.ERROR, "Failed to process view hierarchy.", th4);
                }
                return null;
            }
            try {
                return e(viewPeekDecorView, list);
            } catch (Throwable th6) {
                th4 = th6;
                v0Var2 = v0Var;
            }
        } catch (Throwable th7) {
            th = th7;
            v0Var2 = v0Var;
        }
        th4 = th;
        v0Var2.b(b7.ERROR, "Failed to process view hierarchy.", th4);
        return null;
    }

    public static io.sentry.protocol.h0 e(View view, List<io.sentry.internal.viewhierarchy.a> list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.h0 h0Var = new io.sentry.protocol.h0("android_view_system", arrayList);
        io.sentry.protocol.i0 i0VarF = f(view);
        arrayList.add(i0VarF);
        c(view, i0VarF, list);
        return h0Var;
    }

    private static io.sentry.protocol.i0 f(View view) {
        io.sentry.protocol.i0 i0Var = new io.sentry.protocol.i0();
        i0Var.s(io.sentry.android.core.internal.util.i.a(view));
        try {
            i0Var.q(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        i0Var.w(Double.valueOf(view.getX()));
        i0Var.x(Double.valueOf(view.getY()));
        i0Var.v(Double.valueOf(view.getWidth()));
        i0Var.p(Double.valueOf(view.getHeight()));
        i0Var.n(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            i0Var.u("visible");
        } else if (visibility == 4) {
            i0Var.u("invisible");
        } else if (visibility == 8) {
            i0Var.u("gone");
        }
        return i0Var;
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, io.sentry.j0 j0Var) {
        io.sentry.protocol.h0 h0VarD;
        if (r6Var.z0()) {
            if (!this.f93745a.isAttachViewHierarchy()) {
                this.f93745a.getLogger().c(b7.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return r6Var;
            }
            if (!io.sentry.util.m.i(j0Var)) {
                boolean zA = this.f93746b.a();
                this.f93745a.getBeforeViewHierarchyCaptureCallback();
                if (!zA && (h0VarD = d(b1.c().b(), this.f93745a.getViewHierarchyExporters(), this.f93745a.getThreadChecker(), this.f93745a.getLogger())) != null) {
                    j0Var.o(io.sentry.b.c(h0VarD));
                }
            }
        }
        return r6Var;
    }

    @Override // io.sentry.e0
    public io.sentry.protocol.c0 p(io.sentry.protocol.c0 c0Var, io.sentry.j0 j0Var) {
        return c0Var;
    }
}
