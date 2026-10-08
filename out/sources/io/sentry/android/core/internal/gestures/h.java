package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.b7;
import io.sentry.q7;
import io.sentry.u8;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Window.Callback f93920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f93921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GestureDetectorCompat f93922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q7 f93923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f93924f;

    class a implements b {
        a() {
        }
    }

    interface b {
        default MotionEvent a(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(Window.Callback callback, Context context, g gVar, q7 q7Var) {
        this(callback, new GestureDetectorCompat(context, gVar, new Handler(Looper.getMainLooper())), gVar, q7Var, new a());
    }

    private void b(MotionEvent motionEvent) {
        this.f93922d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f93921c.k(motionEvent);
        }
    }

    public Window.Callback a() {
        return this.f93920b;
    }

    public void c() {
        this.f93921c.m(u8.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventA = this.f93924f.a(motionEvent);
            try {
                b(motionEventA);
            } catch (Throwable th4) {
                try {
                    if (this.f93923e != null) {
                        this.f93923e.getLogger().b(b7.ERROR, "Error dispatching touch event", th4);
                    }
                } finally {
                    motionEventA.recycle();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, q7 q7Var, b bVar) {
        super(callback);
        this.f93920b = callback;
        this.f93921c = gVar;
        this.f93923e = q7Var;
        this.f93922d = gestureDetectorCompat;
        this.f93924f = bVar;
    }
}
