package v;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0003\u001c\u0017\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010$\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006%"}, d2 = {"Lv/l1;", "Lv/k1;", "Landroid/content/Context;", "context", "Lo/s;", "availableCamerasSelector", "<init>", "(Landroid/content/Context;Lo/s;)V", "", "Lv/n0;", "cameras", "selector", "", "e", "(Ljava/util/Set;Lo/s;)Z", "Lv/l1$c;", "d", "()Lv/l1$c;", "f", "(Landroid/content/Context;)Z", "Lv/h1;", "cameraRepository", "Loq/i0;", "a", "(Lv/h1;)V", "currentCameras", "Lo/p;", "removedCameras", "c", "(Ljava/util/Set;Ljava/util/Set;)Z", "b", "Landroid/content/Context;", "Lo/s;", "Z", "isVirtualDevice", "Lv/l1$c;", "validationCriteria", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 implements k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o.s availableCamerasSelector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtualDevice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ValidationCriteria validationCriteria = d();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv/l1$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)I", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202667a = new a();

        private a() {
        }

        public final int a(Context context) {
            return context.getDeviceId();
        }
    }

    /* JADX INFO: renamed from: v.l1$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lv/l1$c;", "", "", "checkBack", "checkFront", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ValidationCriteria {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean checkBack;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean checkFront;

        public ValidationCriteria(boolean z15, boolean z16) {
            this.checkBack = z15;
            this.checkFront = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCheckBack() {
            return this.checkBack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCheckFront() {
            return this.checkFront;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationCriteria)) {
                return false;
            }
            ValidationCriteria validationCriteria = (ValidationCriteria) other;
            return this.checkBack == validationCriteria.checkBack && this.checkFront == validationCriteria.checkFront;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.checkBack) * 31) + Boolean.hashCode(this.checkFront);
        }

        public String toString() {
            return "ValidationCriteria(checkBack=" + this.checkBack + ", checkFront=" + this.checkFront + ')';
        }
    }

    public l1(Context context, o.s sVar) {
        this.context = context;
        this.availableCamerasSelector = sVar;
        this.isVirtualDevice = f(context);
    }

    private final ValidationCriteria d() {
        PackageManager packageManager = this.context.getPackageManager();
        o.s sVar = this.availableCamerasSelector;
        Integer numD = sVar != null ? sVar.d() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z15 = false;
        boolean z16 = zHasSystemFeature && (numD == null || numD.intValue() == 1);
        if (zHasSystemFeature2 && (numD == null || numD.intValue() == 0)) {
            z15 = true;
        }
        return new ValidationCriteria(z16, z15);
    }

    private final boolean e(Set<? extends n0> cameras, o.s selector) {
        try {
            selector.g(new LinkedHashSet<>(cameras));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private final boolean f(Context context) {
        return Build.VERSION.SDK_INT >= 34 && a.f202667a.a(context) != 0;
    }

    @Override // v.k1
    public void a(h1 cameraRepository) throws k1.a {
        if (this.isVirtualDevice) {
            o.e1.a("CameraValidator", "Virtual device with " + cameraRepository.m().size() + " cameras. Skipping validation.");
            return;
        }
        o.e1.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (this.validationCriteria.getCheckBack()) {
            try {
                o.s.f140123d.g(cameraRepository.m());
            } catch (RuntimeException e15) {
                e = e15;
                o.e1.p("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (this.validationCriteria.getCheckFront()) {
            try {
                o.s.f140122c.g(cameraRepository.m());
            } catch (RuntimeException e16) {
                o.e1.p("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e16);
                if (e == null) {
                    e = e16;
                }
            }
        }
        if (e != null) {
            throw new k1.a("Expected camera missing from device.", cameraRepository.m().size(), e);
        }
    }

    @Override // v.k1
    public boolean c(Set<? extends n0> currentCameras, Set<o.p> removedCameras) {
        if (this.isVirtualDevice || !(this.validationCriteria.getCheckBack() || this.validationCriteria.getCheckFront())) {
            return false;
        }
        boolean zE = e(currentCameras, o.s.f140123d);
        boolean zE2 = e(currentCameras, o.s.f140122c);
        Set<o.p> set = removedCameras;
        ArrayList arrayList = new ArrayList(pq.v.y(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((o.p) it.next()).b());
        }
        Set setK1 = pq.v.k1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : currentCameras) {
            if (!setK1.contains(((n0) obj).o().i())) {
                arrayList2.add(obj);
            }
        }
        Set<? extends n0> setK2 = pq.v.k1(arrayList2);
        return (this.validationCriteria.getCheckBack() && zE && !e(setK2, o.s.f140123d)) || (this.validationCriteria.getCheckFront() && zE2 && !e(setK2, o.s.f140122c));
    }
}
