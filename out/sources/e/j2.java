package e;

import android.hardware.camera2.CaptureRequest;
import h.Result3A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v.j3;
import v.n3;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002hKBO\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0018\u001a\u00020\u0011*\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u0011*\u00020\u00112\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001f\u001a\u00020\u001e2\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\"\u0010#J-\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0 0\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020,*\b\u0012\u0004\u0012\u00020+0\u001aH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u0012H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\u000201*\u00020\u0011H\u0002¢\u0006\u0004\b2\u00103J,\u00107\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00112\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104H\u0082@¢\u0006\u0004\b7\u00108J?\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u001092\"\u0010<\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0;\u0012\u0006\u0012\u0004\u0018\u00010\u00140:H\u0002¢\u0006\u0004\b=\u0010>JS\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001a\"\u0004\b\u0000\u001092\u0006\u0010?\u001a\u00020$2(\u0010<\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001a0;\u0012\u0006\u0012\u0004\u0018\u00010\u00140:H\u0002¢\u0006\u0004\b@\u0010AJ=\u0010B\u001a\b\u0012\u0004\u0012\u00020!0 2\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010CJ=\u0010D\u001a\b\u0012\u0004\u0012\u00020!0 2\u0016\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\bD\u0010CJ/\u0010E\u001a\b\u0012\u0004\u0012\u00020!0 2\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bE\u0010FJ+\u0010K\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010G\u001a\u00020,2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0HH\u0016¢\u0006\u0004\bK\u0010LJ1\u0010P\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010N\u001a\u00020M2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\u0012H\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010S\u001a\b\u0012\u0004\u0012\u00020R0 H\u0016¢\u0006\u0004\bS\u0010TJ\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020R0 2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\b\u0012\u0004\u0012\u00020R0 H\u0016¢\u0006\u0004\bY\u0010TJC\u0010^\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0 0\u001a2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020+0\u001a2\u0006\u0010[\u001a\u00020$2\u0006\u0010\\\u001a\u00020$2\u0006\u0010]\u001a\u00020$H\u0016¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020,H\u0096@¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020!H\u0016¢\u0006\u0004\bb\u0010cJ\u0013\u0010e\u001a\u00020d*\u00020\u000bH\u0000¢\u0006\u0004\be\u0010fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010gR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010gR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010iR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010gR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010jR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010kR\u0016\u0010m\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010lR#\u0010s\u001a\n n*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR#\u0010v\u001a\n n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010p\u001a\u0004\bt\u0010uR#\u0010z\u001a\n n*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010p\u001a\u0004\bx\u0010yR \u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010|¨\u0006~"}, d2 = {"Le/j2;", "Le/f2;", "Lnq/a;", "Le/c0;", "capturePipelineProvider", "Le/l2;", "useCaseCameraStateProvider", "Ld/g0;", "useCaseGraphContext", "Le/r2;", "useCaseSurfaceManagerProvider", "Le/u2;", "threads", "Lo/e0;", "cameraXConfig", "<init>", "(Lnq/a;Lnq/a;Ld/g0;Lnq/a;Le/u2;Lo/e0;)V", "Le/j2$b;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "values", "Lv/p1$c;", "optionPriority", "R", "(Le/j2$b;Ljava/util/Map;Lv/p1$c;)Le/j2$b;", "", "keys", ip.a.f96137b, "(Le/j2$b;Ljava/util/List;)Le/j2$b;", "Le/f2$a;", "type", "Lju/w0;", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Le/f2$a;Ljava/util/Map;Lv/p1$c;Ltq/e;)Ljava/lang/Object;", "", "count", "", "message", "Ljava/lang/Void;", ip.a.f96138c, "(ILjava/lang/String;)Ljava/util/List;", "Lv/n1;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/util/List;)Z", "I", "(Ljava/util/Map;)Le/j2$b;", "Lv/t3;", "M", "(Le/j2$b;)Lv/t3;", "", "Lh/q1;", "streams", "N", "(Le/j2$b;Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Ltq/e;", "block", "J", "(Ler/l;)Lju/w0;", "size", "K", "(ILer/l;)Ljava/util/List;", "g", "(Ljava/util/Map;Le/f2$a;Lv/p1$c;)Lju/w0;", "l", "f", "(Ljava/util/List;Le/f2$a;)Lju/w0;", "isPrimary", "", "Lo/j2;", "runningUseCases", "a", "(ZLjava/util/Collection;)Lju/w0;", "Lv/p1;", "config", "tags", "m", "(Lv/p1;Ljava/util/Map;)Lju/w0;", "Lh/m1;", "i", "()Lju/w0;", "Lh/a;", "aeMode", "k", "(I)Lju/w0;", "e", "captureSequence", "captureMode", "flashType", "flashMode", "d", "(Ljava/util/List;III)Ljava/util/List;", "c", "(Ltq/e;)Ljava/lang/Object;", "close", "()V", "Lju/r0;", "C", "(Le/u2;)Lju/r0;", "Lnq/a;", "b", "Ld/g0;", "Le/u2;", "Lo/e0;", "Z", "closed", "kotlin.jvm.PlatformType", "h", "Loq/k;", "E", "()Le/c0;", "capturePipeline", "G", "()Le/r2;", "useCaseSurfaceManager", "j", "F", "()Le/l2;", "useCaseCameraState", "", "Ljava/util/Map;", "infoBundleMap", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j2 implements f2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ju.x<Result3A> f46048m = ju.z.a(new Result3A(Result3A.a.INSTANCE.d(), null, 2, null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ju.x<oq.i0> f46049n;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nq.a<c0> capturePipelineProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nq.a<l2> useCaseCameraStateProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d.g0 useCaseGraphContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nq.a<r2> useCaseSurfaceManagerProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o.e0 cameraXConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile boolean closed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k capturePipeline;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final oq.k useCaseSurfaceManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k useCaseCameraState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Map<f2.a, InfoBundle> infoBundleMap;

    /* JADX INFO: renamed from: e.j2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Le/j2$a;", "", "<init>", "()V", "Lv/j3;", "Ljava/util/concurrent/Executor;", "callbackExecutor", "Le/j2$b;", "h", "(Lv/j3;Ljava/util/concurrent/Executor;)Le/j2$b;", "Lv/p1;", "Le/a$a;", "c", "(Lv/p1;)Le/a$a;", "d", "(Lv/j3;)Le/a$a;", "", "", "f", "(Lv/j3;)Ljava/util/Map;", "", "Lh/g1$a;", "e", "(Lv/j3;Ljava/util/concurrent/Executor;)Ljava/util/Set;", "Lh/k1;", "g", "(Lv/j3;)I", "Lju/x;", "Lh/m1;", "submitFailedResult", "Lju/x;", "Loq/i0;", "canceledResult", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a.C1050a c(v.p1 p1Var) {
            a.C1050a c1050a = new a.C1050a();
            c1050a.e(p1Var);
            return c1050a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InfoBundle h(j3 j3Var, Executor executor) {
            return new InfoBundle(d(j3Var), f(j3Var), e(j3Var, executor), h.k1.a(g(j3Var)), null);
        }

        public final a.C1050a d(j3 j3Var) {
            a.C1050a c1050a = new a.C1050a();
            if (!fr.t.c(j3Var.e(), n3.f202727a)) {
                c1050a.g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, j3Var.e());
            }
            c1050a.e(j3Var.g());
            return c1050a;
        }

        public final Set<h.g1.a> e(j3 j3Var, Executor executor) {
            return pq.e1.g(v.INSTANCE.a(j3Var.k(), executor));
        }

        public final Map<String, Object> f(j3 j3Var) {
            return pq.v0.w(k2.a(j3Var.l().i()));
        }

        public final int g(j3 j3Var) {
            return h.k1.b(j3Var.q());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: e.j2$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Le/j2$b;", "", "Le/a$a;", "options", "", "", "tags", "", "Lh/g1$a;", "listeners", "Lh/k1;", "template", "<init>", "(Le/a$a;Ljava/util/Map;Ljava/util/Set;Lh/k1;Lfr/k;)V", "a", "(Le/a$a;Ljava/util/Map;Ljava/util/Set;Lh/k1;)Le/j2$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le/a$a;", "d", "()Le/a$a;", "b", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "Lh/k1;", "f", "()Lh/k1;", "g", "(Lh/k1;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class InfoBundle {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a.C1050a options;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> tags;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<h.g1.a> listeners;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private h.k1 template;

        public /* synthetic */ InfoBundle(a.C1050a c1050a, Map map, Set set, h.k1 k1Var, fr.k kVar) {
            this(c1050a, map, set, k1Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfoBundle b(InfoBundle infoBundle, a.C1050a c1050a, Map map, Set set, h.k1 k1Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                c1050a = infoBundle.options;
            }
            if ((i15 & 2) != 0) {
                map = infoBundle.tags;
            }
            if ((i15 & 4) != 0) {
                set = infoBundle.listeners;
            }
            if ((i15 & 8) != 0) {
                k1Var = infoBundle.template;
            }
            return infoBundle.a(c1050a, map, set, k1Var);
        }

        public final InfoBundle a(a.C1050a options, Map<String, Object> tags, Set<h.g1.a> listeners, h.k1 template) {
            return new InfoBundle(options, tags, listeners, template, null);
        }

        public final Set<h.g1.a> c() {
            return this.listeners;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a.C1050a getOptions() {
            return this.options;
        }

        public final Map<String, Object> e() {
            return this.tags;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBundle)) {
                return false;
            }
            InfoBundle infoBundle = (InfoBundle) other;
            return fr.t.c(this.options, infoBundle.options) && fr.t.c(this.tags, infoBundle.tags) && fr.t.c(this.listeners, infoBundle.listeners) && fr.t.c(this.template, infoBundle.template);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final h.k1 getTemplate() {
            return this.template;
        }

        public final void g(h.k1 k1Var) {
            this.template = k1Var;
        }

        public int hashCode() {
            int iHashCode = ((((this.options.hashCode() * 31) + this.tags.hashCode()) * 31) + this.listeners.hashCode()) * 31;
            h.k1 k1Var = this.template;
            return iHashCode + (k1Var == null ? 0 : h.k1.f(k1Var.getValue()));
        }

        public String toString() {
            return "InfoBundle(options=" + this.options + ", tags=" + this.tags + ", listeners=" + this.listeners + ", template=" + this.template + ')';
        }

        private InfoBundle(a.C1050a c1050a, Map<String, Object> map, Set<h.g1.a> set, h.k1 k1Var) {
            this.options = c1050a;
            this.tags = map;
            this.listeners = set;
            this.template = k1Var;
        }

        public /* synthetic */ InfoBundle(a.C1050a c1050a, Map map, Set set, h.k1 k1Var, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new a.C1050a() : c1050a, (i15 & 2) != 0 ? new LinkedHashMap() : map, (i15 & 4) != 0 ? new LinkedHashSet() : set, (i15 & 8) != 0 ? null : k1Var, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/w0;", "Lh/m1;", "<anonymous>", "()Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.l<tq.e<? super ju.w0<? extends Result3A>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f46065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46066f;

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
        
            if (r0 == r11) goto L55;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r26) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j2.c.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ju.w0<Result3A>> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lju/w0;", "Ljava/lang/Void;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.l<tq.e<? super List<? extends ju.w0<? extends Void>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46068e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<v.n1> f46070g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f46071h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f46072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f46073k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<v.n1> list, int i15, int i16, int i17, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f46070g = list;
            this.f46071h = i15;
            this.f46072j = i16;
            this.f46073k = i17;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46068e;
            if (i15 == 0) {
                oq.u.b(obj);
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
                if (j2.this.H(this.f46070g)) {
                    j2.this.D(this.f46070g.size(), "Capture request failed due to invalid surface");
                }
                j2 j2Var = j2.this;
                InfoBundle infoBundleI = j2Var.I(j2Var.infoBundleMap);
                j2 j2Var2 = j2.this;
                List<v.n1> list = this.f46070g;
                int i16 = this.f46071h;
                int i17 = this.f46072j;
                int i18 = this.f46073k;
                if (o.e1.f("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                }
                c0 c0VarE = j2Var2.E();
                int value = infoBundleI.getTemplate().getValue();
                a aVarC = infoBundleI.getOptions().c();
                this.f46068e = 1;
                obj = c0VarE.c(list, value, aVarC, i16, i17, i18, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (List) obj;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new d(this.f46070g, this.f46071h, this.f46072j, this.f46073k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super List<? extends ju.w0<Void>>> eVar) {
            return ((d) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/w0;", "Loq/i0;", "<anonymous>", "()Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.l<tq.e<? super ju.w0<? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46074e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f2.a f46076g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<CaptureRequest.Key<?>> f46077h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(f2.a aVar, List<? extends CaptureRequest.Key<?>> list, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f46076g = aVar;
            this.f46077h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46074e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            e.c cVar = e.c.f45719a;
            f2.a aVar = this.f46076g;
            List<CaptureRequest.Key<?>> list = this.f46077h;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                Objects.toString(aVar);
                Objects.toString(list);
            }
            Map map = j2.this.infoBundleMap;
            f2.a aVar2 = this.f46076g;
            Object obj2 = map.get(aVar2);
            if (obj2 == null) {
                InfoBundle infoBundle = new InfoBundle(null, null, null, null, 15, null);
                map.put(aVar2, infoBundle);
                obj2 = infoBundle;
            }
            j2.this.infoBundleMap.put(this.f46076g, j2.this.S((InfoBundle) obj2, this.f46077h));
            j2 j2Var = j2.this;
            InfoBundle infoBundleI = j2Var.I(j2Var.infoBundleMap);
            this.f46074e = 1;
            Object objO = j2.O(j2Var, infoBundleI, null, this, 1, null);
            return objO == objE ? objE : objO;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new e(this.f46076g, this.f46077h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ju.w0<oq.i0>> eVar) {
            return ((e) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class f extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l f46079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ju.x f46080g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(er.l lVar, ju.x xVar, tq.e eVar) {
            super(2, eVar);
            this.f46079f = lVar;
            this.f46080g = xVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46078e;
            if (i15 == 0) {
                oq.u.b(obj);
                er.l lVar = this.f46079f;
                this.f46078e = 1;
                obj = lVar.b(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            PRN.a0.s((ju.w0) obj, this.f46080g);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f46079f, this.f46080g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class g extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.l f46082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f46083g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(er.l lVar, List list, tq.e eVar) {
            super(2, eVar);
            this.f46082f = lVar;
            this.f46083g = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46081e;
            if (i15 == 0) {
                oq.u.b(obj);
                er.l lVar = this.f46082f;
                this.f46081e = 1;
                obj = lVar.b(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            List list = this.f46083g;
            int i16 = 0;
            for (Object obj2 : (Iterable) obj) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                PRN.a0.s((ju.w0) obj2, (ju.x) list.get(i16));
                i16 = i17;
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((g) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new g(this.f46082f, this.f46083g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/w0;", "Loq/i0;", "<anonymous>", "()Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements er.l<tq.e<? super ju.w0<? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46084e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f2.a f46086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<CaptureRequest.Key<?>, Object> f46087h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v.p1.c f46088j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(f2.a aVar, Map<CaptureRequest.Key<?>, ? extends Object> map, v.p1.c cVar, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f46086g = aVar;
            this.f46087h = map;
            this.f46088j = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46084e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            j2 j2Var = j2.this;
            f2.a aVar = this.f46086g;
            Map<CaptureRequest.Key<?>, Object> map = this.f46087h;
            v.p1.c cVar = this.f46088j;
            this.f46084e = 1;
            Object objL = j2Var.L(aVar, map, cVar, this);
            return objL == objE ? objE : objL;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new h(this.f46086g, this.f46087h, this.f46088j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ju.w0<oq.i0>> eVar) {
            return ((h) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/w0;", "Lh/m1;", "<anonymous>", "()Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class i extends vq.k implements er.l<tq.e<? super ju.w0<? extends Result3A>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46090f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f46092h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i15, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f46092h = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            int i15;
            Object objE = uq.b.e();
            int i16 = this.f46090f;
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                    }
                    j2 j2Var = j2.this;
                    int i17 = this.f46092h;
                    h.s sVarF = j2Var.useCaseGraphContext.f();
                    this.f46089e = i17;
                    this.f46090f = 1;
                    obj = sVarF.m3(this);
                    if (obj == objE) {
                        return objE;
                    }
                    i15 = i17;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i15 = this.f46089e;
                    oq.u.b(obj);
                }
                AutoCloseable autoCloseable = (AutoCloseable) obj;
                try {
                    ju.w0<Result3A> w0VarH = ((h.s.g) autoCloseable).h(h.a.d(i15));
                    cr.a.a(autoCloseable, null);
                    return w0VarH;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        cr.a.a(autoCloseable, th4);
                        throw th5;
                    }
                }
            } catch (CancellationException unused2) {
                e.c cVar2 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused3 = e.c.TRUNCATED_TAG;
                }
                return j2.f46048m;
            }
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new i(this.f46092h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ju.w0<Result3A>> eVar) {
            return ((i) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/w0;", "Lh/m1;", "<anonymous>", "()Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class j extends vq.k implements er.l<tq.e<? super ju.w0<? extends Result3A>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46093e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Exception {
            Object objE = uq.b.e();
            int i15 = this.f46093e;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                    }
                    h.s sVarF = j2.this.useCaseGraphContext.f();
                    this.f46093e = 1;
                    obj = sVarF.m3(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                AutoCloseable autoCloseable = (AutoCloseable) obj;
                try {
                    ju.w0<Result3A> w0VarP = ((h.s.g) autoCloseable).p();
                    cr.a.a(autoCloseable, null);
                    return w0VarP;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        cr.a.a(autoCloseable, th4);
                        throw th5;
                    }
                }
            } catch (CancellationException unused2) {
                e.c cVar2 = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused3 = e.c.TRUNCATED_TAG;
                }
                return j2.f46048m;
            }
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ju.w0<Result3A>> eVar) {
            return ((j) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46095e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f2.a f46097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<CaptureRequest.Key<?>, Object> f46098h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v.p1.c f46099j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(f2.a aVar, Map<CaptureRequest.Key<?>, ? extends Object> map, v.p1.c cVar, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f46097g = aVar;
            this.f46098h = map;
            this.f46099j = cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (((ju.w0) r7).I(r6) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f46095e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L3d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L32
            L1e:
                oq.u.b(r7)
                e.j2 r7 = e.j2.this
                e.f2$a r1 = r6.f46097g
                java.util.Map<android.hardware.camera2.CaptureRequest$Key<?>, java.lang.Object> r4 = r6.f46098h
                v.p1$c r5 = r6.f46099j
                r6.f46095e = r3
                java.lang.Object r7 = e.j2.y(r7, r1, r4, r5, r6)
                if (r7 != r0) goto L32
                goto L3c
            L32:
                ju.w0 r7 = (ju.w0) r7
                r6.f46095e = r2
                java.lang.Object r7 = r7.I(r6)
                if (r7 != r0) goto L3d
            L3c:
                return r0
            L3d:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j2.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((k) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return j2.this.new k(this.f46097g, this.f46098h, this.f46099j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/w0;", "Loq/i0;", "<anonymous>", "()Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class l extends vq.k implements er.l<tq.e<? super ju.w0<? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46100e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v.p1 f46102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f46103h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(v.p1 p1Var, Map<String, ? extends Object> map, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f46102g = p1Var;
            this.f46103h = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46100e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            j2.this.infoBundleMap.put(f2.a.CAMERA2_CAMERA_CONTROL, new InfoBundle(j2.INSTANCE.c(this.f46102g), pq.v0.w(this.f46103h), null, null, 12, null));
            j2 j2Var = j2.this;
            InfoBundle infoBundleI = j2Var.I(j2Var.infoBundleMap);
            this.f46100e = 1;
            Object objO = j2.O(j2Var, infoBundleI, null, this, 1, null);
            return objO == objE ? objE : objO;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return j2.this.new l(this.f46102g, this.f46103h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ju.w0<oq.i0>> eVar) {
            return ((l) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f46104d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46106f;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46104d = obj;
            this.f46106f |= PKIFailureInfo.systemUnavail;
            return j2.this.N(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/w0;", "Loq/i0;", "<anonymous>", "()Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class n extends vq.k implements er.l<tq.e<? super ju.w0<? extends oq.i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Collection<o.j2> f46108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f46109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ j2 f46110h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(Collection<? extends o.j2> collection, boolean z15, j2 j2Var, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f46108f = collection;
            this.f46109g = z15;
            this.f46110h = j2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46107e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            j3 j3VarN = new PRN.r0(this.f46108f, this.f46109g).n();
            if (j3VarN == null) {
                if (o.e1.f("CXCP")) {
                    String unused2 = e.c.TRUNCATED_TAG;
                }
                j3.b bVar = new j3.b();
                bVar.y(1);
                j3VarN = bVar.o();
            }
            if (o.e1.f("CXCP")) {
                String unused3 = e.c.TRUNCATED_TAG;
            }
            this.f46110h.infoBundleMap.put(f2.a.SESSION_CONFIG, j2.INSTANCE.h(j3VarN, this.f46110h.threads.getSequentialExecutor()));
            Set<h.q1> setG = this.f46110h.useCaseGraphContext.g(j3VarN.l().h());
            if (o.e1.f("CXCP")) {
                String unused4 = e.c.TRUNCATED_TAG;
            }
            j2 j2Var = this.f46110h;
            InfoBundle infoBundleI = j2Var.I(j2Var.infoBundleMap);
            this.f46107e = 1;
            Object objN = j2Var.N(infoBundleI, setG, this);
            return objN == objE ? objE : objN;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new n(this.f46108f, this.f46109g, this.f46110h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ju.w0<oq.i0>> eVar) {
            return ((n) M(eVar)).J(oq.i0.f148189a);
        }
    }

    static {
        ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
        ju.d2.a.a(xVarC, null, 1, null);
        f46049n = xVarC;
    }

    public j2(nq.a<c0> aVar, nq.a<l2> aVar2, d.g0 g0Var, nq.a<r2> aVar3, u2 u2Var, o.e0 e0Var) {
        this.capturePipelineProvider = aVar;
        this.useCaseCameraStateProvider = aVar2;
        this.useCaseGraphContext = g0Var;
        this.useCaseSurfaceManagerProvider = aVar3;
        this.threads = u2Var;
        this.cameraXConfig = e0Var;
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
        }
        this.capturePipeline = oq.l.a(new er.a() { // from class: e.g2
            @Override // er.a
            public final Object a() {
                return j2.B(this.f45821a);
            }
        });
        this.useCaseSurfaceManager = oq.l.a(new er.a() { // from class: e.h2
            @Override // er.a
            public final Object a() {
                return j2.Q(this.f46008a);
            }
        });
        this.useCaseCameraState = oq.l.a(new er.a() { // from class: e.i2
            @Override // er.a
            public final Object a() {
                return j2.P(this.f46038a);
            }
        });
        this.infoBundleMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 B(j2 j2Var) {
        return j2Var.capturePipelineProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ju.w0<Void>> D(int count, String message) {
        ArrayList arrayList = new ArrayList(count);
        for (int i15 = 0; i15 < count; i15++) {
            ju.x xVarC = ju.z.c(null, 1, null);
            xVarC.p(new o.v0(2, message, null));
            arrayList.add(xVarC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c0 E() {
        return (c0) this.capturePipeline.getValue();
    }

    private final l2 F() {
        return (l2) this.useCaseCameraState.getValue();
    }

    private final r2 G() {
        return (r2) this.useCaseSurfaceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H(List<v.n1> list) {
        for (v.n1 n1Var : list) {
            if (n1Var.h().isEmpty()) {
                return true;
            }
            Iterator<T> it = n1Var.h().iterator();
            while (it.hasNext()) {
                if (this.useCaseGraphContext.h().get((v.u1) it.next()) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoBundle I(Map<f2.a, InfoBundle> map) {
        InfoBundle infoBundle = new InfoBundle(null, null, null, h.k1.a(h.k1.b(1)), 7, null);
        Iterator<f2.a> it = f2.a.e().iterator();
        while (it.hasNext()) {
            InfoBundle infoBundle2 = map.get(it.next());
            if (infoBundle2 != null) {
                infoBundle.getOptions().e(infoBundle2.getOptions().a());
                infoBundle.e().putAll(infoBundle2.e());
                infoBundle.c().addAll(infoBundle2.c());
                h.k1 template = infoBundle2.getTemplate();
                if (template != null) {
                    infoBundle.g(h.k1.a(template.getValue()));
                }
            }
        }
        return infoBundle;
    }

    private final <T> ju.w0<T> J(er.l<? super tq.e<? super ju.w0<? extends T>>, ? extends Object> block) {
        ju.r0 r0VarC = C(this.threads);
        u2 u2Var = this.threads;
        ju.x xVarC = ju.z.c(null, 1, null);
        ju.k.d(u2Var.getSequentialScope(), null, r0VarC, new f(block, xVarC, null), 1, null);
        return xVarC;
    }

    private final <T> List<ju.w0<T>> K(int size, er.l<? super tq.e<? super List<? extends ju.w0<? extends T>>>, ? extends Object> block) {
        ju.r0 r0VarC = C(this.threads);
        u2 u2Var = this.threads;
        ArrayList arrayList = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(ju.z.c(null, 1, null));
        }
        ju.k.d(u2Var.getSequentialScope(), null, r0VarC, new g(block, arrayList, null), 1, null);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(f2.a aVar, Map<CaptureRequest.Key<?>, ? extends Object> map, v.p1.c cVar, tq.e<? super ju.w0<oq.i0>> eVar) {
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(aVar);
            Objects.toString(map);
            Objects.toString(cVar);
        }
        Map<f2.a, InfoBundle> map2 = this.infoBundleMap;
        InfoBundle infoBundle = map2.get(aVar);
        if (infoBundle == null) {
            InfoBundle infoBundle2 = new InfoBundle(null, null, null, null, 15, null);
            map2.put(aVar, infoBundle2);
            infoBundle = infoBundle2;
        }
        this.infoBundleMap.put(aVar, R(infoBundle, map, cVar));
        return O(this, I(this.infoBundleMap), null, eVar, 1, null);
    }

    private final t3 M(InfoBundle infoBundle) {
        v.w2 w2VarG = v.w2.g();
        for (Map.Entry<String, Object> entry : infoBundle.e().entrySet()) {
            w2VarG.h(entry.getKey(), entry.getValue());
        }
        return w2VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object N(InfoBundle infoBundle, Set<h.q1> set, tq.e<? super ju.w0<oq.i0>> eVar) throws Throwable {
        m mVar;
        ju.w0 w0Var;
        g.c cVarB;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f46106f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f46106f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        m mVar2 = mVar;
        Object objJ = mVar2.f46104d;
        Object objE = uq.b.e();
        int i16 = mVar2.f46106f;
        if (i16 == 0) {
            oq.u.b(objJ);
            if (this.closed) {
                w0Var = null;
            } else {
                o.e0 e0Var = this.cameraXConfig;
                if (e0Var != null && (cVarB = g.d.b(e0Var)) != null) {
                    g.d.a(cVarB, pq.v0.u(b.b(infoBundle.getOptions().c())));
                }
                E().d(infoBundle.getTemplate().getValue() != -1 ? infoBundle.getTemplate().getValue() : 1);
                l2 l2VarF = F();
                Map<CaptureRequest.Key<?>, ? extends Object> mapB = b.b(infoBundle.getOptions().c());
                Map<h.a1.a<?>, ? extends Object> mapF = pq.v0.f(oq.y.a(u1.a(), M(infoBundle)));
                h.k1 template = infoBundle.getTemplate();
                Set<h.g1.a> setC = infoBundle.c();
                mVar2.f46106f = 1;
                objJ = l2VarF.j(mapB, false, mapF, false, set, template, setC, mVar2);
                if (objJ == objE) {
                    return objE;
                }
            }
            if (w0Var == null) {
                return f46049n;
            }
            return w0Var;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oq.u.b(objJ);
        w0Var = (ju.w0) objJ;
        if (w0Var == null) {
            return f46049n;
        }
        return w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object O(j2 j2Var, InfoBundle infoBundle, Set set, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            set = null;
        }
        return j2Var.N(infoBundle, set, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l2 P(j2 j2Var) {
        return j2Var.useCaseCameraStateProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2 Q(j2 j2Var) {
        return j2Var.useCaseSurfaceManagerProvider.get();
    }

    private final InfoBundle R(InfoBundle infoBundle, Map<CaptureRequest.Key<?>, ? extends Object> map, v.p1.c cVar) {
        a.C1050a c1050a = new a.C1050a();
        c1050a.e(infoBundle.getOptions().a());
        c1050a.b(map, cVar);
        return InfoBundle.b(infoBundle, c1050a, pq.v0.w(infoBundle.e()), pq.v.j1(infoBundle.c()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoBundle S(InfoBundle infoBundle, List<? extends CaptureRequest.Key<?>> list) {
        a.C1050a c1050a = new a.C1050a();
        c1050a.e(infoBundle.getOptions().a());
        c1050a.f(list);
        return InfoBundle.b(infoBundle, c1050a, pq.v0.w(infoBundle.e()), pq.v.j1(infoBundle.c()), null, 8, null);
    }

    public final ju.r0 C(u2 u2Var) {
        return u2Var.g() ? ju.r0.UNDISPATCHED : ju.r0.DEFAULT;
    }

    @Override // e.f2
    public ju.w0<oq.i0> a(boolean isPrimary, Collection<? extends o.j2> runningUseCases) {
        ju.w0<oq.i0> w0VarJ = this.closed ? null : J(new n(runningUseCases, isPrimary, this, null));
        return w0VarJ == null ? f46049n : w0VarJ;
    }

    @Override // e.f2
    public Object c(tq.e<? super Boolean> eVar) {
        return G().k(eVar);
    }

    @Override // e.f2
    public void close() {
        this.closed = true;
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
        }
        F().e();
    }

    @Override // e.f2
    public List<ju.w0<Void>> d(List<v.n1> captureSequence, int captureMode, int flashType, int flashMode) {
        List<v.n1> list;
        List<ju.w0<Void>> listK;
        if (this.closed) {
            list = captureSequence;
            listK = null;
        } else {
            list = captureSequence;
            listK = K(captureSequence.size(), new d(list, captureMode, flashType, flashMode, null));
        }
        return listK == null ? D(list.size(), "Capture request is cancelled on closed CameraGraph") : listK;
    }

    @Override // e.f2
    public ju.w0<Result3A> e() {
        ju.w0<Result3A> w0VarJ = this.closed ? null : J(new c(null));
        return w0VarJ == null ? f46048m : w0VarJ;
    }

    @Override // e.f2
    public ju.w0<oq.i0> f(List<? extends CaptureRequest.Key<?>> keys, f2.a type) {
        ju.w0<oq.i0> w0VarJ = this.closed ? null : J(new e(type, keys, null));
        return w0VarJ == null ? f46049n : w0VarJ;
    }

    @Override // e.f2
    public ju.w0<oq.i0> g(Map<CaptureRequest.Key<?>, ? extends Object> values, f2.a type, v.p1.c optionPriority) {
        ju.w0<oq.i0> w0VarJ = !this.closed ? J(new h(type, values, optionPriority, null)) : null;
        return w0VarJ == null ? f46049n : w0VarJ;
    }

    @Override // e.f2
    public ju.w0<Result3A> i() {
        ju.w0<Result3A> w0VarJ = this.closed ? null : J(new j(null));
        return w0VarJ == null ? f46048m : w0VarJ;
    }

    @Override // e.f2
    public ju.w0<Result3A> k(int aeMode) {
        ju.w0<Result3A> w0VarJ = this.closed ? null : J(new i(aeMode, null));
        return w0VarJ == null ? f46048m : w0VarJ;
    }

    @Override // e.f2
    public ju.w0<oq.i0> l(Map<CaptureRequest.Key<?>, ? extends Object> values, f2.a type, v.p1.c optionPriority) {
        if (this.closed) {
            return f46049n;
        }
        this.threads.c();
        return ju.k.b(this.threads.getSequentialScope(), null, ju.r0.UNDISPATCHED, new k(type, values, optionPriority, null), 1, null);
    }

    @Override // e.f2
    public ju.w0<oq.i0> m(v.p1 config, Map<String, ? extends Object> tags) {
        ju.w0<oq.i0> w0VarJ = this.closed ? null : J(new l(config, tags, null));
        return w0VarJ == null ? f46049n : w0VarJ;
    }
}
