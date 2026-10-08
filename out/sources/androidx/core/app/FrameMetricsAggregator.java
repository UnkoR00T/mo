package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11809a;

    private static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static HandlerThread f11810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Handler f11811f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f11813b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f11814c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f11815d = new WindowOnFrameMetricsAvailableListenerC0254a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0254a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0254a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i15) {
                a aVar = a.this;
                if ((aVar.f11812a & 1) != 0) {
                    aVar.f(aVar.f11813b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f11812a & 2) != 0) {
                    aVar2.f(aVar2.f11813b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f11812a & 4) != 0) {
                    aVar3.f(aVar3.f11813b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f11812a & 8) != 0) {
                    aVar4.f(aVar4.f11813b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f11812a & 16) != 0) {
                    aVar5.f(aVar5.f11813b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f11812a & 64) != 0) {
                    aVar6.f(aVar6.f11813b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f11812a & 32) != 0) {
                    aVar7.f(aVar7.f11813b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f11812a & 128) != 0) {
                    aVar8.f(aVar8.f11813b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f11812a & 256) != 0) {
                    aVar9.f(aVar9.f11813b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i15) {
            this.f11812a = i15;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f11810e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f11810e = handlerThread;
                handlerThread.start();
                f11811f = new Handler(f11810e.getLooper());
            }
            for (int i15 = 0; i15 <= 8; i15++) {
                SparseIntArray[] sparseIntArrayArr = this.f11813b;
                if (sparseIntArrayArr[i15] == null && (this.f11812a & (1 << i15)) != 0) {
                    sparseIntArrayArr[i15] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f11815d, f11811f);
            this.f11814c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f11813b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference<Activity> weakReference : this.f11814c) {
                if (weakReference.get() == activity) {
                    this.f11814c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f11815d);
            return this.f11813b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f11813b;
            this.f11813b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f11814c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f11814c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f11815d);
                    this.f11814c.remove(size);
                }
            }
            return this.f11813b;
        }

        void f(SparseIntArray sparseIntArray, long j15) {
            if (sparseIntArray != null) {
                int i15 = (int) ((500000 + j15) / 1000000);
                if (j15 >= 0) {
                    sparseIntArray.put(i15, sparseIntArray.get(i15) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public void a(Activity activity) {
            throw null;
        }

        public SparseIntArray[] b() {
            throw null;
        }

        public SparseIntArray[] c(Activity activity) {
            throw null;
        }

        public SparseIntArray[] d() {
            throw null;
        }

        public SparseIntArray[] e() {
            throw null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f11809a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f11809a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f11809a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f11809a.d();
    }

    public SparseIntArray[] e() {
        return this.f11809a.e();
    }

    public FrameMetricsAggregator(int i15) {
        this.f11809a = new a(i15);
    }
}
