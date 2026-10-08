package PRN;

import android.content.Context;
import android.os.Trace;
import java.util.Arrays;
import java.util.Objects;
import p071kotlin.Metadata;
import v.i1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LPRN/g;", "Lv/l0$b;", "Lh/z;", "sharedCameraPipe", "Landroid/content/Context;", "sharedAppContext", "Lv/i1;", "sharedThreadConfig", "<init>", "(Lh/z;Landroid/content/Context;Lv/i1;)V", "context", "threadConfig", "Lk/i;", "openRetryMaxTimeout", "e", "(Landroid/content/Context;Lv/i1;Lk/i;)Lh/z;", "Lo/s;", "availableCamerasLimiter", "", "cameraOpenRetryMaxTimeoutInMs", "Lo/e0;", "cameraXConfig", "Lb0/m;", "streamSpecsCalculator", "Lv/l0;", "a", "(Landroid/content/Context;Lv/i1;Lo/s;JLo/e0;Lb0/m;)Lv/l0;", "Lh/z;", "b", "Landroid/content/Context;", "c", "Lv/i1;", "Le/y;", "d", "Le/y;", "sharedInteropCallbacks", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements v.l0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.z sharedCameraPipe;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context sharedAppContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i1 sharedThreadConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e.y sharedInteropCallbacks = new e.y();

    public g(h.z zVar, Context context, i1 i1Var) {
        this.sharedCameraPipe = zVar;
        this.sharedAppContext = context;
        this.sharedThreadConfig = i1Var;
    }

    private final h.z e(Context context, i1 threadConfig, k.i openRetryMaxTimeout) {
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection("Create CameraPipe");
            k.w wVar = new k.w();
            k.c0 c0Var = k.c0.f107031a;
            long jA = wVar.a();
            h.z zVarA = h.b0.a(new h.z.Config(y.e.f(context), new h.z.ThreadConfig(null, null, null, z.a.f(threadConfig.b()), null, null, null, 119, null), null, null, new h.z.CameraInteropConfig(this.sharedInteropCallbacks.get_deviceStateCallback(), this.sharedInteropCallbacks.b(), openRetryMaxTimeout, null), null, null, null, 236, null));
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(k.i.c(wVar.a() - jA) / 1000000.0d)}, 1));
            }
            return zVarA;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.z f(g gVar, Context context, i1 i1Var, k.i iVar) {
        if (gVar.sharedCameraPipe == null) {
            return gVar.e(context, i1Var, iVar);
        }
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(gVar.sharedCameraPipe);
        }
        return gVar.sharedCameraPipe;
    }

    @Override // v.l0.b
    public v.l0 a(final Context context, final i1 threadConfig, o.s availableCamerasLimiter, long cameraOpenRetryMaxTimeoutInMs, o.e0 cameraXConfig, b0.m streamSpecsCalculator) {
        final k.i iVarA = cameraOpenRetryMaxTimeoutInMs == -1 ? null : k.i.a(k.i.c(cameraOpenRetryMaxTimeoutInMs));
        oq.k kVarA = oq.l.a(new er.a() { // from class: PRN.f
            @Override // er.a
            public final Object a() {
                return g.f(this.f653a, context, threadConfig, iVarA);
            }
        });
        Context context2 = this.sharedAppContext;
        Context context3 = context2 == null ? context : context2;
        i1 i1Var = this.sharedThreadConfig;
        i1 i1Var2 = i1Var == null ? threadConfig : i1Var;
        e.y yVar = this.sharedInteropCallbacks;
        if (cameraXConfig == null) {
            cameraXConfig = new o.e0.a().a();
        }
        return new e(kVarA, context3, i1Var2, yVar, availableCamerasLimiter, streamSpecsCalculator, cameraXConfig);
    }
}
