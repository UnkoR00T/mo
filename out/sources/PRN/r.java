package PRN;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import e.u2;
import h.InputRequest;
import h.g1;
import h.h1;
import h.i1;
import h.k1;
import h.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;
import v.n1;
import v.p1;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"LPRN/r;", "", "Le/b0;", "cameraProperties", "Ld/g0;", "useCaseGraphContext", "LPRN/x0;", "zslControl", "Le/u2;", "threads", "Lc/g0;", "templateParamsOverride", "<init>", "(Le/b0;Ld/g0;LPRN/x0;Le/u2;Lc/g0;)V", "Landroidx/camera/core/o;", "imageProxy", "Lh/g1$a;", "b", "(Landroidx/camera/core/o;)Lh/g1$a;", "Lv/n1;", "captureConfig", "Lh/k1;", "requestTemplate", "Lv/p1;", "sessionConfigOptions", "", "additionalListeners", "Lh/g1;", "d", "(Lv/n1;ILv/p1;Ljava/util/List;)Lh/g1;", "a", "Ld/g0;", "LPRN/x0;", "c", "Le/u2;", "Lc/g0;", "", "e", "Z", "isLegacyDevice", "f", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.g0 useCaseGraphContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x0 zslControl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c.g0 templateParamsOverride;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isLegacyDevice;

    /* JADX INFO: renamed from: PRN.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LPRN/r$a;", "", "<init>", "()V", "Lv/n1;", "Lh/k1;", "sessionTemplate", "", "isLegacyDevice", "a", "(Lv/n1;IZ)I", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a(n1 n1Var, int i15, boolean z15) {
            int i16;
            if (!k1.d(i15, k1.b(3)) || z15) {
                i16 = (n1Var.j() == -1 || n1Var.j() == 5) ? 2 : -1;
            } else {
                i16 = 4;
            }
            return i16 != -1 ? k1.b(i16) : k1.b(n1Var.j());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"PRN/r$b", "Lh/g1$a;", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/p0;", "result", "Loq/i0;", "K", "(Lh/i1;JLh/p0;)V", "Lh/h1;", "requestFailure", "p", "(Lh/i1;JLh/h1;)V", "Lh/g1;", "request", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lh/g1;)V", "totalCaptureResult", "a0", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements g1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference<androidx.camera.core.o> f761a;

        b(AtomicReference<androidx.camera.core.o> atomicReference) {
            this.f761a = atomicReference;
        }

        @Override // h.g1.a
        public void H(g1 request) {
            r.c(this.f761a);
        }

        @Override // h.g1.a
        public void K(i1 requestMetadata, long frameNumber, h.p0 result) {
            r.c(this.f761a);
        }

        @Override // h.g1.a
        public void a0(i1 requestMetadata, long frameNumber, h.p0 totalCaptureResult) {
            r.c(this.f761a);
        }

        @Override // h.g1.a
        public void p(i1 requestMetadata, long frameNumber, h1 requestFailure) {
            r.c(this.f761a);
        }
    }

    public r(e.b0 b0Var, d.g0 g0Var, x0 x0Var, u2 u2Var, c.g0 g0Var2) {
        this.useCaseGraphContext = g0Var;
        this.zslControl = x0Var;
        this.threads = u2Var;
        this.templateParamsOverride = g0Var2;
        this.isLegacyDevice = h.x.INSTANCE.l(b0Var.getMetadata());
    }

    private final g1.a b(androidx.camera.core.o imageProxy) {
        return new b(new AtomicReference(imageProxy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AtomicReference<androidx.camera.core.o> atomicReference) {
        androidx.camera.core.o andSet = atomicReference.getAndSet(null);
        if (andSet != null) {
            andSet.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g1 d(n1 captureConfig, int requestTemplate, p1 sessionConfigOptions, List<? extends g1.a> additionalListeners) {
        InputRequest inputRequest;
        androidx.camera.core.o oVarG;
        g1.a aVarB;
        List<u1> listH = captureConfig.h();
        if (listH.isEmpty()) {
            throw new IllegalStateException(("Attempted to issue a capture without surfaces using " + captureConfig).toString());
        }
        List<u1> list = listH;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        for (u1 u1Var : list) {
            q1 q1Var = this.useCaseGraphContext.h().get(u1Var);
            if (q1Var == null) {
                throw new IllegalStateException(("Attempted to issue a capture with an unrecognized surface: " + u1Var).toString());
            }
            arrayList.add(q1.a(q1Var.getValue()));
        }
        e.v vVar = new e.v();
        Iterator<T> it = captureConfig.c().iterator();
        while (it.hasNext()) {
            vVar.w((v.s) it.next(), this.threads.getSequentialExecutor());
        }
        p1 p1VarF = captureConfig.f();
        e.a.C1050a c1050a = new e.a.C1050a();
        c1050a.e(sessionConfigOptions);
        c1050a.e(p1VarF);
        p1.a<Integer> aVar = n1.f202707i;
        if (p1VarF.h(aVar)) {
            c1050a.g(CaptureRequest.JPEG_ORIENTATION, p1VarF.d(aVar));
        }
        p1.a<Integer> aVar2 = n1.f202708j;
        if (p1VarF.h(aVar2)) {
            c1050a.g(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) ((Number) p1VarF.d(aVar2)).intValue()));
        }
        int iB = k1.b(captureConfig.j());
        Object obj = null;
        if (captureConfig.j() != 5 || this.zslControl.getIsZslDisabledByUseCaseConfig() || this.zslControl.getIsZslDisabledByFlashMode() || (oVarG = this.zslControl.g()) == null) {
            inputRequest = 0;
        } else {
            v.c0 c0VarA = v.d0.a(oVarG.v3());
            if (c0VarA == null) {
                aVarB = null;
            } else {
                if (!(c0VarA instanceof s)) {
                    throw new IllegalStateException(("Unexpected capture result type: " + c0VarA.getClass()).toString());
                }
                Image imageM0 = oVarG.m0();
                if (imageM0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                n.a aVar3 = new n.a(imageM0);
                Object objC0 = ((s) c0VarA).c0(fr.q0.c(h.p0.class));
                if (objC0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                InputRequest inputRequest2 = new InputRequest(aVar3, (h.p0) objC0);
                aVarB = b(oVarG);
                obj = inputRequest2;
            }
            inputRequest = obj;
            obj = aVarB;
        }
        if (inputRequest == 0) {
            iB = INSTANCE.a(captureConfig, requestTemplate, this.isLegacyDevice);
        }
        Map mapO = pq.v0.o(this.templateParamsOverride.a(k1.a(iB)), e.b.b(c1050a.c()));
        List listC = pq.v.c();
        listC.add(vVar);
        if (obj != null) {
            listC.add(obj);
        }
        listC.addAll(additionalListeners);
        return new g1(arrayList, mapO, pq.v0.f(oq.y.a(e.u1.a(), captureConfig.i())), pq.v.a(listC), k1.a(iB), inputRequest, null);
    }
}
