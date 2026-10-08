package z6;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import r0.l1;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ThreadLocal<b> f233108j = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f233113e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f233117i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1<c, Long> f233109a = new l1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<c> f233110b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6272b f233111c = new C6272b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f233112d = new Runnable() { // from class: z6.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f233107a.f233111c.a();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f233114f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f233115g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f233116h = 1.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z6.b$b, reason: collision with other inner class name */
    class C6272b {
        private C6272b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            b.this.f233114f = SystemClock.uptimeMillis();
            b bVar = b.this;
            bVar.f(bVar.f233114f);
            if (b.this.f233110b.size() > 0) {
                b.this.f233113e.a(b.this.f233112d);
            }
        }
    }

    interface c {
        boolean a(long j15);
    }

    public class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ValueAnimator.DurationScaleChangeListener f233119a;

        public d() {
        }

        @Override // z6.b.e
        public boolean a() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f233119a);
            this.f233119a = null;
            return zUnregisterDurationScaleChangeListener;
        }

        @Override // z6.b.e
        public boolean b() {
            if (this.f233119a != null) {
                return true;
            }
            ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: z6.c
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f15) {
                    b.this.f233116h = f15;
                }
            };
            this.f233119a = durationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
        }
    }

    public interface e {
        boolean a();

        boolean b();
    }

    static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f233121a = Choreographer.getInstance();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Looper f233122b = Looper.myLooper();

        f() {
        }

        @Override // z6.h
        public void a(final Runnable runnable) {
            this.f233121a.postFrameCallback(new Choreographer.FrameCallback() { // from class: z6.d
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j15) {
                    runnable.run();
                }
            });
        }

        @Override // z6.h
        public boolean b() {
            return Thread.currentThread() == this.f233122b.getThread();
        }
    }

    public b(h hVar) {
        this.f233113e = hVar;
    }

    private void e() {
        if (this.f233115g) {
            for (int size = this.f233110b.size() - 1; size >= 0; size--) {
                if (this.f233110b.get(size) == null) {
                    this.f233110b.remove(size);
                }
            }
            if (this.f233110b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.f233117i.a();
            }
            this.f233115g = false;
        }
    }

    static b h() {
        ThreadLocal<b> threadLocal = f233108j;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new f()));
        }
        return threadLocal.get();
    }

    private boolean i(c cVar, long j15) {
        Long l15 = this.f233109a.get(cVar);
        if (l15 == null) {
            return true;
        }
        if (l15.longValue() >= j15) {
            return false;
        }
        this.f233109a.remove(cVar);
        return true;
    }

    void d(c cVar, long j15) {
        if (this.f233110b.size() == 0) {
            this.f233113e.a(this.f233112d);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f233116h = ValueAnimator.getDurationScale();
                if (this.f233117i == null) {
                    this.f233117i = new d();
                }
                this.f233117i.b();
            }
        }
        if (!this.f233110b.contains(cVar)) {
            this.f233110b.add(cVar);
        }
        if (j15 > 0) {
            this.f233109a.put(cVar, Long.valueOf(SystemClock.uptimeMillis() + j15));
        }
    }

    void f(long j15) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i15 = 0; i15 < this.f233110b.size(); i15++) {
            c cVar = this.f233110b.get(i15);
            if (cVar != null && i(cVar, jUptimeMillis)) {
                cVar.a(j15);
            }
        }
        e();
    }

    public float g() {
        return this.f233116h;
    }

    boolean j() {
        return this.f233113e.b();
    }

    void k(c cVar) {
        this.f233109a.remove(cVar);
        int iIndexOf = this.f233110b.indexOf(cVar);
        if (iIndexOf >= 0) {
            this.f233110b.set(iIndexOf, null);
            this.f233115g = true;
        }
    }
}
