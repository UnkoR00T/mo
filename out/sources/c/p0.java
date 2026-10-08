package c;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import io.sentry.android.core.c2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0012\u001a\u00020\u000b2\u001e\u0010\u0011\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001e"}, d2 = {"Lc/p0;", "Lc/m0;", "Landroidx/camera/camera2/compat/quirk/a;", "cameraQuirks", "Lh/p;", "cameraDevices", "Lf/j;", "intrinsicZoomCalculator", "<init>", "(Landroidx/camera/camera2/compat/quirk/a;Lh/p;Lf/j;)V", "Lh/q0;", "", "g", "(Lh/q0;)Ljava/lang/Boolean;", "Lkotlin/Function1;", "Ltq/e;", "", "frameMetadata", "a", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "b", "()Z", "Landroidx/camera/camera2/compat/quirk/a;", "Lh/p;", "c", "Lf/j;", "d", "Loq/k;", "e", "hasUwCameraUnderexposedFlashCaptureQuirk", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.a cameraQuirks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.p cameraDevices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f.j intrinsicZoomCalculator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k hasUwCameraUnderexposedFlashCaptureQuirk = oq.l.a(new er.a() { // from class: c.o0
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(p0.f(this.f22258a));
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f22263d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22265f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22263d = obj;
            this.f22265f |= PKIFailureInfo.systemUnavail;
            return p0.this.a(null, this);
        }
    }

    public p0(androidx.camera.camera2.compat.quirk.a aVar, h.p pVar, f.j jVar) {
        this.cameraQuirks = aVar;
        this.cameraDevices = pVar;
        this.intrinsicZoomCalculator = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        return ((Boolean) this.hasUwCameraUnderexposedFlashCaptureQuirk.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(p0 p0Var) {
        return p0Var.cameraQuirks.b().a(UltraWideFlashCaptureUnderexposureQuirk.class);
    }

    private final Boolean g(h.q0 q0Var) {
        String str = (String) q0Var.I(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str == null) {
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "isUltraWideCamera: could not get active physical camera ID to identify if it's ultra wide camera.");
            }
            return null;
        }
        h.x xVarH = h.p.h(this.cameraDevices, h.v.b(str), null, 2, null);
        if (xVarH == null) {
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "isUltraWideCamera: failed to get CameraMetadata for " + str);
            }
            return null;
        }
        Float fA = this.intrinsicZoomCalculator.a(xVarH);
        if (fA != null) {
            float fFloatValue = fA.floatValue();
            k.k.f107055a.a();
            return Boolean.valueOf(fFloatValue < 1.0f);
        }
        if (k.k.f107055a.d()) {
            c2.g("CXCP", "isUltraWideCamera: could not calculate intrinsic zoom ratio.");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c.m0
    public Object a(er.l<? super tq.e<? super h.q0>, ? extends Object> lVar, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f22265f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f22265f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f22263d;
        Object objE = uq.b.e();
        int i16 = aVar.f22265f;
        if (i16 == 0) {
            oq.u.b(objB);
            k.k kVar = k.k.f107055a;
            if (kVar.a()) {
                e();
            }
            if (!e()) {
                return vq.b.a(true);
            }
            if (Build.VERSION.SDK_INT < 29) {
                if (kVar.d()) {
                    c2.g("CXCP", "shouldUseTorchAsFlash: API level is too low to know if it's ultra wide camera, defaulting to workaround for safety.");
                }
                return vq.b.a(true);
            }
            aVar.f22265f = 1;
            objB = lVar.b(aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        h.q0 q0Var = (h.q0) objB;
        if (q0Var != null) {
            Boolean boolG = g(q0Var);
            return vq.b.a(boolG != null ? boolG.booleanValue() : true);
        }
        if (k.k.f107055a.d()) {
            c2.g("CXCP", "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety.");
        }
        return vq.b.a(true);
    }

    @Override // c.m0
    public boolean b() {
        return !e();
    }
}
