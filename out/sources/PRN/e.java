package PRN;

import android.content.Context;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.v1;
import p071kotlin.Metadata;
import v.i1;
import v.j1;
import v.x2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00140+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00101R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00109R\u001b\u0010>\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\b<\u0010=R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"LPRN/e;", "Lv/l0;", "Lv/l0$a;", "Loq/k;", "Lh/z;", "lazyCameraPipe", "Landroid/content/Context;", "context", "Lv/i1;", "threadConfig", "Le/y;", "camera2InteropCallbacks", "Lo/s;", "availableCamerasSelector", "Lb0/m;", "streamSpecsCalculator", "Lo/e0;", "cameraXConfig", "<init>", "(Loq/k;Landroid/content/Context;Lv/i1;Le/y;Lo/s;Lb0/m;Lo/e0;)V", "", "", "cameraIds", "", "k", "(Ljava/util/List;)Ljava/util/Set;", "Loq/i0;", "e", "(Ljava/util/List;)V", "d", "(Ljava/util/List;)Ljava/util/List;", "cameraId", "Lv/n0;", "a", "(Ljava/lang/String;)Lv/n0;", "c", "()Ljava/util/Set;", "Lp/a;", "g", "()Lp/a;", "", "f", "()Ljava/lang/Object;", "Lv/x2;", "Lo/p;", "b", "()Lv/x2;", "shutdown", "()V", "Loq/k;", "Lo/s;", "Lb0/m;", "Lo/e0;", "LPRN/c;", "LPRN/c;", "cameraCoordinator", "LPRN/l0;", "LPRN/l0;", "pipeCameraPresenceObservable", "Ld/a;", "l", "()Ld/a;", "appComponent", "h", "Ljava/util/Set;", "availableCameraIds", "i", "Ljava/lang/Object;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShutdown", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements v.l0, v.l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k<h.z> lazyCameraPipe;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o.s availableCamerasSelector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0.m streamSpecsCalculator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o.e0 cameraXConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c cameraCoordinator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l0 pipeCameraPresenceObservable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k appComponent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Set<String> availableCameraIds = pq.e1.e();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isShutdown = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    public e(oq.k<? extends h.z> kVar, final Context context, final i1 i1Var, final e.y yVar, o.s sVar, b0.m mVar, o.e0 e0Var) {
        List<String> listN;
        this.lazyCameraPipe = kVar;
        this.availableCamerasSelector = sVar;
        this.streamSpecsCalculator = mVar;
        this.cameraXConfig = e0Var;
        this.cameraCoordinator = new c((h.z) kVar.getValue(), ((h.z) kVar.getValue()).a());
        this.appComponent = oq.l.a(new er.a() { // from class: PRN.d
            @Override // er.a
            public final Object a() {
                return e.j(context, i1Var, this, yVar);
            }
        });
        List listD = h.p.d(l().b(), null, 1, null);
        if (listD != null) {
            List list = listD;
            listN = new ArrayList<>(pq.v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listN.add(((h.v) it.next()).getValue());
            }
        } else {
            listN = pq.v.n();
        }
        this.pipeCameraPresenceObservable = new l0(h.p.c(this.lazyCameraPipe.getValue().a(), null, 1, null), ju.q0.a(v1.b(i1Var.b())), listN, context);
        e(listN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.a j(Context context, i1 i1Var, e eVar, e.y yVar) {
        k.h hVar = k.h.f107050a;
        Trace.beginSection("CameraFactoryAdapter#appComponent");
        k.w wVar = new k.w();
        k.c0 c0Var = k.c0.f107031a;
        long jA = wVar.a();
        d.a aVarBuild = d.u.a().a(new d.b(context, i1Var, eVar.lazyCameraPipe.getValue(), yVar, eVar.cameraCoordinator, eVar.cameraXConfig)).build();
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(k.i.c(wVar.a() - jA) / 1000000.0d)}, 1));
        }
        Trace.endSection();
        return aVarBuild;
    }

    private final Set<String> k(List<String> cameraIds) {
        return new LinkedHashSet(f.a.a(l().b(), f.b.INSTANCE.b(l(), this.availableCamerasSelector, pq.v.f1(cameraIds), this.streamSpecsCalculator)));
    }

    private final d.a l() {
        return (d.a) this.appComponent.getValue();
    }

    @Override // v.l0
    public v.n0 a(String cameraId) throws j1 {
        if (this.isShutdown.get()) {
            throw new j1("CameraFactory has been shut down.");
        }
        return l().c().b(new d.m(h.v.b(cameraId), null)).a(this.streamSpecsCalculator).build().a();
    }

    @Override // v.l0
    public x2<List<o.p>> b() {
        return this.pipeCameraPresenceObservable;
    }

    @Override // v.l0
    public Set<String> c() {
        synchronized (this.lock) {
            if (this.isShutdown.get()) {
                return pq.e1.e();
            }
            return new LinkedHashSet(this.availableCameraIds);
        }
    }

    @Override // v.l0.a
    public List<String> d(List<String> cameraIds) {
        return this.isShutdown.get() ? pq.v.n() : pq.v.f1(k(cameraIds));
    }

    @Override // v.p0
    public void e(List<String> cameraIds) {
        if (this.isShutdown.get()) {
            return;
        }
        Set<String> setK = k(cameraIds);
        synchronized (this.lock) {
            try {
                if (this.isShutdown.get()) {
                    return;
                }
                if (fr.t.c(this.availableCameraIds, setK)) {
                    return;
                }
                e.c cVar = e.c.f45719a;
                if (o.e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                    Objects.toString(this.availableCameraIds);
                    Objects.toString(setK);
                }
                this.availableCameraIds = setK;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.l0
    public Object f() {
        return l();
    }

    @Override // v.l0
    public p.a g() {
        return this.cameraCoordinator;
    }

    @Override // v.l0
    public void shutdown() {
        if (this.isShutdown.getAndSet(true)) {
            return;
        }
        this.cameraCoordinator.i();
        this.pipeCameraPresenceObservable.g();
        if (this.lazyCameraPipe.c()) {
            this.lazyCameraPipe.getValue().shutdown();
        }
    }
}
