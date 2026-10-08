package PRN;

import android.app.Application;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.Iterator;
import java.util.Objects;
import p071kotlin.Metadata;
import v.b3;
import v.d2;
import v.f2;
import v.j3;
import v.n1;
import v.p1;
import v.u1;
import v.u2;
import v.w3;
import v.x3;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u000e\u0011\u0012\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"LPRN/q;", "Lv/x3;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lv/x3$b;", "captureType", "", "captureMode", "Lv/p1;", "a", "(Lv/x3$b;I)Lv/p1;", "Le/z0;", "b", "Le/z0;", "displayInfoManager", "d", "c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e.z0 displayInfoManager;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LPRN/q$a;", "Lv/s;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "captureCallback", "<init>", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V", "a", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "f", "()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "b", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends v.s {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CameraCaptureSession.CaptureCallback captureCallback;

        /* JADX INFO: renamed from: PRN.q$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LPRN/q$a$a;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "captureCallback", "LPRN/q$a;", "a", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)LPRN/q$a;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final a a(CameraCaptureSession.CaptureCallback captureCallback) {
                return new a(captureCallback, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ a(CameraCaptureSession.CaptureCallback captureCallback, fr.k kVar) {
            this(captureCallback);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final CameraCaptureSession.CaptureCallback getCaptureCallback() {
            return this.captureCallback;
        }

        private a(CameraCaptureSession.CaptureCallback captureCallback) {
            this.captureCallback = captureCallback;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LPRN/q$b;", "Lv/n1$b;", "<init>", "()V", "Lv/w3;", "config", "Lv/n1$a;", "builder", "Loq/i0;", "a", "(Lv/w3;Lv/n1$a;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class b implements n1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b f749b = new b();

        /* JADX INFO: renamed from: PRN.q$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LPRN/q$b$a;", "", "<init>", "()V", "LPRN/q$b;", "INSTANCE", "LPRN/q$b;", "a", "()LPRN/q$b;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final b a() {
                return b.f749b;
            }

            private Companion() {
            }
        }

        @Override // v.n1.b
        public void a(w3<?> config, n1.a builder) {
            n1 n1VarU = config.U(null);
            p1 p1VarJ0 = z2.j0();
            int iJ = n1.b().j();
            if (n1VarU != null) {
                iJ = n1VarU.j();
                builder.a(n1VarU.c());
                p1VarJ0 = n1VarU.f();
                builder.s(n1VarU.l());
                builder.b(n1VarU.i());
                Iterator<T> it = n1VarU.h().iterator();
                while (it.hasNext()) {
                    builder.f((u1) it.next());
                }
            }
            builder.o(p1VarJ0);
            e.a aVar = new e.a(config);
            builder.r(aVar.j0(iJ));
            CameraCaptureSession.CaptureCallback captureCallbackP0 = e.a.p0(aVar, null, 1, null);
            if (captureCallbackP0 != null) {
                builder.c(a.INSTANCE.a(captureCallbackP0));
            }
            builder.e(aVar.i0());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LPRN/q$c;", "Lv/j3$e;", "<init>", "()V", "Landroid/util/Size;", "resolution", "Lv/w3;", "config", "Lv/j3$b;", "builder", "Loq/i0;", "a", "(Landroid/util/Size;Lv/w3;Lv/j3$b;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements j3.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f750a = new c();

        private c() {
        }

        @Override // v.j3.e
        public void a(Size resolution, w3<?> config, j3.b builder) {
            j3 j3VarQ = config.Q(null);
            p1 p1VarJ0 = z2.j0();
            int iQ = j3.b().q();
            if (j3VarQ != null) {
                iQ = j3VarQ.q();
                builder.b(j3VarQ.c());
                builder.d(j3VarQ.m());
                builder.c(j3VarQ.k());
                p1VarJ0 = j3VarQ.g();
            }
            builder.t(p1VarJ0);
            if (config instanceof b3) {
                c.b0.b(builder, resolution);
            }
            e.a aVar = new e.a(config);
            builder.y(aVar.j0(iQ));
            CameraDevice.StateCallback stateCallbackL0 = e.a.l0(aVar, null, 1, null);
            if (stateCallbackL0 != null) {
                builder.f(stateCallbackL0);
            }
            CameraCaptureSession.StateCallback stateCallbackR0 = e.a.r0(aVar, null, 1, null);
            if (stateCallbackR0 != null) {
                builder.k(stateCallbackR0);
            }
            CameraCaptureSession.CaptureCallback captureCallbackP0 = e.a.p0(aVar, null, 1, null);
            if (captureCallbackP0 != null) {
                builder.e(a.INSTANCE.a(captureCallbackP0));
            }
            builder.w(config.D());
            builder.z(config.y());
            u2 u2VarL0 = u2.l0();
            String strN0 = e.a.n0(aVar, null, 1, null);
            if (strN0 != null) {
                u2VarL0.m(e.a.f45702a0, strN0);
            }
            Long lT0 = e.a.t0(aVar, null, 1, null);
            if (lT0 != null) {
                u2VarL0.m(e.a.X, Long.valueOf(lT0.longValue()));
            }
            builder.g(u2VarL0);
            builder.g(aVar.i0());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LPRN/q$d;", "LPRN/q$b;", "<init>", "()V", "Lv/w3;", "config", "Lv/n1$a;", "builder", "Loq/i0;", "a", "(Lv/w3;Lv/n1$a;)V", "c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d f752d = new d();

        /* JADX INFO: renamed from: PRN.q$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LPRN/q$d$a;", "", "<init>", "()V", "LPRN/q$d;", "INSTANCE", "LPRN/q$d;", "a", "()LPRN/q$d;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final d a() {
                return d.f752d;
            }

            private Companion() {
            }
        }

        @Override // PRN.q.b, v.n1.b
        public void a(w3<?> config, n1.a builder) {
            super.a(config, builder);
            if (!(config instanceof d2)) {
                throw new IllegalArgumentException("config is not ImageCaptureConfig");
            }
            e.a.C1050a c1050a = new e.a.C1050a();
            c.m.a(c1050a, (d2) config);
            builder.e(c1050a.c());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f753a;

        static {
            int[] iArr = new int[x3.b.values().length];
            try {
                iArr[x3.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x3.b.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x3.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x3.b.METERING_REPEATING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x3.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x3.b.VIDEO_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f753a = iArr;
        }
    }

    public q(Context context) {
        this.displayInfoManager = e.z0.INSTANCE.a(context);
        if (context instanceof Application) {
            e.c cVar = e.c.f45719a;
            if (o.e1.h("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                context.toString();
            }
        }
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
        }
    }

    @Override // v.x3
    public p1 a(x3.b captureType, int captureMode) {
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(captureType);
        }
        u2 u2VarL0 = u2.l0();
        j3.b bVar = new j3.b();
        int[] iArr = e.f753a;
        switch (iArr[captureType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                bVar.y(1);
                break;
            case 6:
                bVar.y(b.g.f15546a.c(PreviewUnderExposureQuirk.class) != null ? 1 : 3);
                break;
            default:
                throw new oq.p();
        }
        u2VarL0.m(w3.A, bVar.o());
        n1.a aVar = new n1.a();
        switch (iArr[captureType.ordinal()]) {
            case 1:
                aVar.r(captureMode == 2 ? 5 : 2);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                aVar.r(1);
                break;
            case 6:
                aVar.r(b.g.f15546a.c(PreviewUnderExposureQuirk.class) != null ? 1 : 3);
                break;
            default:
                throw new oq.p();
        }
        u2VarL0.m(w3.B, aVar.h());
        u2VarL0.m(w3.D, captureType == x3.b.IMAGE_CAPTURE ? d.INSTANCE.a() : b.INSTANCE.a());
        u2VarL0.m(w3.C, c.f750a);
        if (captureType == x3.b.PREVIEW) {
            u2VarL0.m(f2.f202583w, this.displayInfoManager.k());
        }
        u2VarL0.m(f2.f202578r, Integer.valueOf(e.z0.j(this.displayInfoManager, false, 1, null).getRotation()));
        return z2.k0(u2VarL0);
    }
}
