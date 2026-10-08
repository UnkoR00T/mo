package PRN;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import e.p1;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;
import v.g2;
import v.h2;
import v.j3;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R \u0010.\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b-\u0010\b\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010/R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/R*\u0010:\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u00104\u0012\u0004\b9\u0010\b\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"LPRN/d1;", "LPRN/x0;", "Le/b0;", "cameraProperties", "<init>", "(Le/b0;)V", "Loq/i0;", "r", "()V", "p", "Lv/j3$b;", "sessionConfigBuilder", "b", "(Lv/j3$b;)V", "Lv/u1;", "surface", "Lv/j3;", "sessionConfig", "", "c", "(Lv/u1;Lv/j3;)Z", "disabled", "f", "(Z)V", "d", "()Z", "e", "h", "Landroidx/camera/core/o;", "g", "()Landroidx/camera/core/o;", "a", "Le/b0;", "Lh/x;", "Lh/x;", "cameraMetadata", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "Loq/k;", "q", "()Landroid/hardware/camera2/params/StreamConfigurationMap;", "streamConfigurationMap", "Lf0/f;", "Lf0/f;", "getZslRingBuffer$camera_camera2", "()Lf0/f;", "getZslRingBuffer$camera_camera2$annotations", "zslRingBuffer", "Z", "isZslDisabledByUseCaseConfig", "isZslDisabledByFlashMode", "isZslDisabledByQuirks", "Landroidx/camera/core/r;", "Landroidx/camera/core/r;", "getReprocessingImageReader$camera_camera2", "()Landroidx/camera/core/r;", "setReprocessingImageReader$camera_camera2", "(Landroidx/camera/core/r;)V", "getReprocessingImageReader$camera_camera2$annotations", "reprocessingImageReader", "Lv/s;", "i", "Lv/s;", "metadataMatchingCaptureCallback", "j", "Lv/u1;", "reprocessingImageDeferrableSurface", "k", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e.b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.x cameraMetadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k streamConfigurationMap = oq.l.a(new er.a() { // from class: PRN.y0
        @Override // er.a
        public final Object a() {
            return d1.t(this.f842a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f0.f zslRingBuffer = new f0.f(3, new f0.c() { // from class: PRN.z0
        @Override // f0.c
        public final void a(Object obj) {
            d1.u((androidx.camera.core.o) obj);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isZslDisabledByUseCaseConfig;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isZslDisabledByFlashMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isZslDisabledByQuirks;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private androidx.camera.core.r reprocessingImageReader;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private v.s metadataMatchingCaptureCallback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private u1 reprocessingImageDeferrableSurface;

    public d1(e.b0 b0Var) {
        this.cameraProperties = b0Var;
        this.cameraMetadata = b0Var.getMetadata();
        this.isZslDisabledByQuirks = b.g.f15546a.c(ZslDisablerQuirk.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(d1 d1Var, g2 g2Var) {
        try {
            androidx.camera.core.o oVarC = g2Var.c();
            if (oVarC != null) {
                d1Var.zslRingBuffer.d(oVarC);
            }
        } catch (IllegalStateException unused) {
            e.c cVar = e.c.f45719a;
            if (o.e1.g("CXCP")) {
                c2.e(e.c.TRUNCATED_TAG, "Failed to acquire latest image");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(androidx.camera.core.r rVar) {
        rVar.j();
    }

    private final void p() {
        f0.f fVar = this.zslRingBuffer;
        while (!fVar.c()) {
            fVar.a().close();
        }
    }

    private final StreamConfigurationMap q() {
        return (StreamConfigurationMap) this.streamConfigurationMap.getValue();
    }

    private final void r() {
        u1 u1Var = this.reprocessingImageDeferrableSurface;
        if (u1Var != null) {
            final androidx.camera.core.r rVar = this.reprocessingImageReader;
            if (rVar != null) {
                u1Var.k().b(new Runnable() { // from class: PRN.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d1.s(rVar);
                    }
                }, z.a.d());
                rVar.e();
                this.reprocessingImageReader = null;
            }
            u1Var.d();
            this.reprocessingImageDeferrableSurface = null;
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(androidx.camera.core.r rVar) {
        rVar.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreamConfigurationMap t(d1 d1Var) {
        Object objJ = d1Var.cameraMetadata.J(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (objJ != null) {
            return (StreamConfigurationMap) objJ;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(androidx.camera.core.o oVar) {
        oVar.close();
    }

    @Override // PRN.x0
    public void a() {
        r();
    }

    @Override // PRN.x0
    public void b(j3.b sessionConfigBuilder) {
        r();
        if (this.isZslDisabledByUseCaseConfig) {
            sessionConfigBuilder.y(1);
            return;
        }
        if (this.isZslDisabledByQuirks) {
            sessionConfigBuilder.y(1);
            return;
        }
        if (!h.x.INSTANCE.h(this.cameraMetadata)) {
            e.c cVar = e.c.f45719a;
            if (o.e1.h("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            sessionConfigBuilder.y(1);
            return;
        }
        Iterator it = pq.n.n1(q().getInputSizes(34)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iA = p1.a((Size) next);
            do {
                Object next2 = it.next();
                int iA2 = p1.a((Size) next2);
                if (iA < iA2) {
                    next = next2;
                    iA = iA2;
                }
            } while (it.hasNext());
        }
        Size size = (Size) next;
        if (size == null) {
            e.c cVar2 = e.c.f45719a;
            if (o.e1.k("CXCP")) {
                c2.g(e.c.TRUNCATED_TAG, "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        e.c cVar3 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
            size.toString();
        }
        if (!pq.n.d0(q().getValidOutputFormatsForInput(34), 256)) {
            if (o.e1.k("CXCP")) {
                c2.g(e.c.TRUNCATED_TAG, "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        androidx.camera.core.q qVar = new androidx.camera.core.q(size.getWidth(), size.getHeight(), 34, 9);
        v.s sVarN = qVar.n();
        final androidx.camera.core.r rVar = new androidx.camera.core.r(qVar);
        qVar.f(new g2.a() { // from class: PRN.a1
            @Override // v.g2.a
            public final void a(g2 g2Var) {
                d1.n(this.f598a, g2Var);
            }
        }, z.a.c());
        Surface surface = rVar.getSurface();
        if (surface == null) {
            throw new IllegalStateException("Required value was null.");
        }
        h2 h2Var = new h2(surface, new Size(rVar.l(), rVar.getHeight()), 34);
        h2Var.k().b(new Runnable() { // from class: PRN.b1
            @Override // java.lang.Runnable
            public final void run() {
                d1.o(rVar);
            }
        }, z.a.d());
        sessionConfigBuilder.l(h2Var);
        sessionConfigBuilder.e(sVarN);
        sessionConfigBuilder.u(new InputConfiguration(rVar.l(), rVar.getHeight(), rVar.d()));
        this.metadataMatchingCaptureCallback = sVarN;
        this.reprocessingImageReader = rVar;
        this.reprocessingImageDeferrableSurface = h2Var;
    }

    @Override // PRN.x0
    public boolean c(u1 surface, j3 sessionConfig) {
        InputConfiguration inputConfigurationH = sessionConfig.h();
        return inputConfigurationH != null && surface.i() == inputConfigurationH.getFormat() && surface.h().getWidth() == inputConfigurationH.getWidth() && surface.h().getHeight() == inputConfigurationH.getHeight();
    }

    @Override // PRN.x0
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getIsZslDisabledByUseCaseConfig() {
        return this.isZslDisabledByUseCaseConfig;
    }

    @Override // PRN.x0
    public void e(boolean disabled) {
        this.isZslDisabledByFlashMode = disabled;
    }

    @Override // PRN.x0
    public void f(boolean disabled) {
        if (this.isZslDisabledByUseCaseConfig != disabled && disabled) {
            p();
        }
        this.isZslDisabledByUseCaseConfig = disabled;
    }

    @Override // PRN.x0
    public androidx.camera.core.o g() {
        try {
            return this.zslRingBuffer.a();
        } catch (NoSuchElementException unused) {
            e.c cVar = e.c.f45719a;
            if (!o.e1.k("CXCP")) {
                return null;
            }
            c2.g(e.c.TRUNCATED_TAG, "ZslControlImpl#dequeueImageFromBuffer: No such element");
            return null;
        }
    }

    @Override // PRN.x0
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsZslDisabledByFlashMode() {
        return this.isZslDisabledByFlashMode;
    }
}
