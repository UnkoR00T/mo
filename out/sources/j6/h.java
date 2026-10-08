package j6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f99676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f99677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f99678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f99679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f99680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f99681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f99682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f99683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f99684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f99685j;

    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i15);
    }

    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i15);
    }

    public h(Context context, i iVar) {
        this(context, iVar, new b() { // from class: j6.f
            @Override // j6.h.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i15) {
                h.c(context2, iArr, motionEvent, i15);
            }
        }, new a() { // from class: j6.g
            @Override // j6.h.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i15) {
                return h.f(velocityTracker, motionEvent, i15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i15) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = o0.g(context, viewConfiguration, motionEvent.getDeviceId(), i15, motionEvent.getSource());
        iArr[1] = o0.f(context, viewConfiguration, motionEvent.getDeviceId(), i15, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i15) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f99683h == source && this.f99684i == deviceId && this.f99682g == i15) {
            return false;
        }
        this.f99678c.a(this.f99676a, this.f99685j, motionEvent, i15);
        this.f99683h = source;
        this.f99684i = deviceId;
        this.f99682g = i15;
        return true;
    }

    private float e(MotionEvent motionEvent, int i15) {
        if (this.f99680e == null) {
            this.f99680e = VelocityTracker.obtain();
        }
        return this.f99679d.a(this.f99680e, motionEvent, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i15) {
        i0.a(velocityTracker, motionEvent);
        i0.b(velocityTracker, 1000);
        return i0.d(velocityTracker, i15);
    }

    public void g(MotionEvent motionEvent, int i15) {
        boolean zD = d(motionEvent, i15);
        if (this.f99685j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f99680e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f99680e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i15) * this.f99677b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f99681f) && fSignum != 0.0f)) {
            this.f99677b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f99685j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i16 = iArr[1];
        float fMax = Math.max(-i16, Math.min(fE, i16));
        this.f99681f = this.f99677b.a(fMax) ? fMax : 0.0f;
    }

    h(Context context, i iVar, b bVar, a aVar) {
        this.f99682g = -1;
        this.f99683h = -1;
        this.f99684i = -1;
        this.f99685j = new int[]{Integer.MAX_VALUE, 0};
        this.f99676a = context;
        this.f99677b = iVar;
        this.f99678c = bVar;
        this.f99679d = aVar;
    }
}
