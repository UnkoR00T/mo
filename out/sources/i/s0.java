package i;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.util.Size;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l.StreamGraph;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b&\u0010'J?\u00103\u001a\u0002022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020%2\u0006\u00105\u001a\u000202H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u0002020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010ER\u0014\u0010I\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010HR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00130J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010K¨\u0006M"}, d2 = {"Li/s0;", "Lh/e;", "Li/x0$d;", "Lk/z;", "threads", "Li/w1;", "camera2DeviceCache", "Li/f2;", "camera2MetadataCache", "Li/z1;", "camera2DeviceManager", "Lj/a$a;", "camera2CameraControllerComponent", "Landroid/content/Context;", "cameraPipeContext", "<init>", "(Lk/z;Li/w1;Li/f2;Li/z1;Lj/a$a;Landroid/content/Context;)V", "Lh/s$b;", "graphConfig", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "n", "(Lh/s$b;)Ljava/util/List;", "Lh/v;", "h", "()Ljava/util/List;", "", "d", "()Ljava/util/Set;", "cameraId", "Lh/x;", "a", "(Ljava/lang/String;)Lh/x;", "Lh/k0;", "c", "(Lh/s$b;Ltq/e;)Ljava/lang/Object;", "Lju/w0;", "Loq/i0;", "j", "()Lju/w0;", "Lh/m;", "cameraContext", "Lh/u;", "graphId", "Ll/i;", "graphListener", "Lh/p1;", "streamGraph", "Lh/s1;", "surfaceTracker", "Lh/n;", "i", "(Lh/m;Lh/u;Lh/s$b;Ll/i;Lh/p1;Lh/s1;)Lh/n;", "cameraController", "b", "(Lh/n;)V", "Lk/z;", "Li/w1;", "Li/f2;", "Li/z1;", "e", "Lj/a$a;", "f", "Landroid/content/Context;", "", "g", "Ljava/lang/Object;", "lock", "", "Ljava/util/Set;", "activeCameraControllers", "Lh/g;", "()Ljava/lang/String;", "id", "Lmu/g;", "()Lmu/g;", "cameraIds", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 implements h.e, Camera2CameraController.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w1 camera2DeviceCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f2 camera2MetadataCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1 camera2DeviceManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j.a.InterfaceC2306a camera2CameraControllerComponent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Context cameraPipeContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Set<h.n> activeCameraControllers = new LinkedHashSet();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f87408g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f87410j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87408g = obj;
            this.f87410j |= PKIFailureInfo.systemUnavail;
            return s0.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f87413g;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:19:0x0052  */
        /* JADX WARN: Code duplicated, block: B:28:0x008e  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            if (r8 == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        
            if (r8.I(r7) == r0) goto L30;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:23:0x0062). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f87413g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                oq.u.b(r8)
                goto Lab
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f87412f
                h.n r1 = (h.n) r1
                java.lang.Object r4 = r7.f87411e
                java.util.Iterator r4 = (java.util.Iterator) r4
                oq.u.b(r8)
                goto L62
            L27:
                oq.u.b(r8)
                i.s0 r8 = i.s0.this
                java.lang.Object r8 = i.s0.m(r8)
                i.s0 r1 = i.s0.this
                monitor-enter(r8)
                java.util.Set r1 = i.s0.k(r1)     // Catch: java.lang.Throwable -> Lae
                monitor-exit(r8)
                java.util.Iterator r8 = r1.iterator()
                r4 = r8
            L3d:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L8e
                java.lang.Object r8 = r4.next()
                r1 = r8
                h.n r1 = (h.n) r1
                k.k r8 = k.k.f107055a
                boolean r8 = r8.a()
                if (r8 == 0) goto L55
                java.util.Objects.toString(r1)
            L55:
                r7.f87411e = r4
                r7.f87412f = r1
                r7.f87413g = r3
                java.lang.Object r8 = r1.Z(r7)
                if (r8 != r0) goto L62
                goto Laa
            L62:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L3d
                k.k r8 = k.k.f107055a
                boolean r8 = r8.d()
                if (r8 == 0) goto L3d
                java.lang.String r8 = "CXCP"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Failed to await closure from "
                r5.append(r6)
                r5.append(r1)
                r1 = 33
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                io.sentry.android.core.c2.g(r8, r1)
                goto L3d
            L8e:
                k.k r8 = k.k.f107055a
                r8.a()
                i.s0 r8 = i.s0.this
                i.z1 r8 = i.s0.l(r8)
                ju.w0 r8 = r8.a(r3)
                r1 = 0
                r7.f87411e = r1
                r7.f87412f = r1
                r7.f87413g = r2
                java.lang.Object r8 = r8.I(r7)
                if (r8 != r0) goto Lab
            Laa:
                return r0
            Lab:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            Lae:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i.s0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return s0.this.new b(eVar);
        }
    }

    public s0(k.z zVar, w1 w1Var, f2 f2Var, z1 z1Var, j.a.InterfaceC2306a interfaceC2306a, Context context) {
        this.threads = zVar;
        this.camera2DeviceCache = w1Var;
        this.camera2MetadataCache = f2Var;
        this.camera2DeviceManager = z1Var;
        this.camera2CameraControllerComponent = interfaceC2306a;
        this.cameraPipeContext = context;
    }

    private final List<OutputConfiguration> n(h.s.b graphConfig) {
        OutputConfiguration outputConfiguration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<h.c0.a> it = graphConfig.r().iterator();
        while (it.hasNext()) {
            for (h.e1.a aVar : it.next().b()) {
                r.Companion companion = r.INSTANCE;
                Integer numValueOf = Integer.valueOf(aVar.getFormat());
                h.e1.d dVarD = h.e1.d.INSTANCE.d();
                h.e1.c mirrorMode = aVar.getMirrorMode();
                aVar.i();
                h.e1.b dynamicRangeProfile = aVar.getDynamicRangeProfile();
                h.e1.f streamUseCase = aVar.getStreamUseCase();
                List<h.e1.e> listE = aVar.e();
                Size size = aVar.getSize();
                String camera = aVar.getCamera();
                l3 l3VarB = r.Companion.b(companion, null, numValueOf, dVarD, mirrorMode, null, dynamicRangeProfile, streamUseCase, listE, size, false, 0, !(camera == null ? false : h.v.d(camera, graphConfig.getCamera())) ? aVar.getCamera() : null, 1536, null);
                if (l3VarB != null && (outputConfiguration = (OutputConfiguration) l3VarB.c0(fr.q0.c(OutputConfiguration.class))) != null) {
                    linkedHashSet.add(outputConfiguration);
                }
            }
        }
        return pq.v.f1(linkedHashSet);
    }

    @Override // h.e
    public h.x a(String cameraId) {
        return this.camera2MetadataCache.a(cameraId);
    }

    @Override // i.Camera2CameraController.d
    public void b(h.n cameraController) {
        if (k.k.f107055a.a()) {
            Objects.toString(cameraController);
        }
        synchronized (this.lock) {
            this.activeCameraControllers.remove(cameraController);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h.e
    public Object c(h.s.b bVar, tq.e<? super h.k0> eVar) throws Throwable {
        a aVar;
        l0.d dVar;
        h.s.b bVar2;
        SessionConfiguration sessionConfigurationA;
        b2 b2Var;
        Integer numE;
        CaptureRequest.Builder builderA;
        l0.d.a aVarA;
        Object key;
        Object value;
        CaptureRequest.Key key2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f87410j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f87410j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objU = aVar.f87408g;
        Object objE = uq.b.e();
        int i16 = aVar.f87410j;
        int sessionMode = 1;
        if (i16 == 0) {
            oq.u.b(objU);
            if (Build.VERSION.SDK_INT < 35) {
                return h.k0.c(h.k0.INSTANCE.b());
            }
            w1 w1Var = this.camera2DeviceCache;
            String camera = bVar.getCamera();
            aVar.f87405d = bVar;
            aVar.f87410j = 1;
            objU = w1Var.u(camera, aVar);
            if (objU != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            bVar = (h.s.b) aVar.f87405d;
            oq.u.b(objU);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionConfigurationA = r0.a(aVar.f87407f);
            dVar = (l0.d) aVar.f87406e;
            bVar2 = (h.s.b) aVar.f87405d;
            oq.u.b(objU);
        }
        b2Var = (b2) objU;
        numE = null;
        if (b2Var != null) {
            builderA = b2Var.a(bVar2.getSessionTemplate());
        } else {
            builderA = null;
        }
        if (builderA != null) {
            for (Map.Entry<?, Object> entry : bVar2.p().entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (key instanceof CaptureRequest.Key) {
                    key2 = (CaptureRequest.Key) key;
                } else {
                    key2 = null;
                }
                if (key2 != null) {
                    builderA.set(key2, value);
                }
            }
            w.l(sessionConfigurationA, builderA.build());
        }
        if (dVar != null && (aVarA = dVar.a(sessionConfigurationA)) != null) {
            numE = vq.b.e(aVarA.a());
        }
        return numE != null ? h.k0.c(h.k0.d(numE.intValue())) : h.k0.c(h.k0.INSTANCE.b());
        l0.d dVar2 = (l0.d) objU;
        int sessionMode2 = bVar.getSessionMode();
        h.s.e.Companion companion = h.s.e.INSTANCE;
        if (h.s.e.f(sessionMode2, companion.d())) {
            sessionMode = 0;
        } else if (!h.s.e.f(sessionMode2, companion.c())) {
            if (h.s.e.f(sessionMode2, companion.b())) {
                if (k.k.f107055a.c()) {
                    h.s.e.h(bVar.getSessionMode());
                }
                return h.k0.c(h.k0.INSTANCE.b());
            }
            sessionMode = bVar.getSessionMode();
        }
        SessionConfiguration sessionConfigurationF = m0.f(sessionMode, n(bVar));
        w1 w1Var2 = this.camera2DeviceCache;
        String camera2 = bVar.getCamera();
        aVar.f87405d = bVar;
        aVar.f87406e = dVar2;
        aVar.f87407f = sessionConfigurationF;
        aVar.f87410j = 2;
        Object objV = w1Var2.v(camera2, aVar);
        if (objV != objE) {
            dVar = dVar2;
            objU = objV;
            bVar2 = bVar;
            sessionConfigurationA = sessionConfigurationF;
            b2Var = (b2) objU;
            numE = null;
            if (b2Var != null) {
                builderA = b2Var.a(bVar2.getSessionTemplate());
            } else {
                builderA = null;
            }
            if (builderA != null) {
                while (r0.hasNext()) {
                    key = entry.getKey();
                    value = entry.getValue();
                    if (key instanceof CaptureRequest.Key) {
                        key2 = (CaptureRequest.Key) key;
                    } else {
                        key2 = null;
                    }
                    if (key2 != null) {
                        builderA.set(key2, value);
                    }
                }
                w.l(sessionConfigurationA, builderA.build());
            }
            if (dVar != null) {
                numE = vq.b.e(aVarA.a());
            }
            if (numE != null) {
            }
        }
        return objE;
    }

    @Override // h.e
    public Set<Set<h.v>> d() {
        return this.camera2DeviceCache.o();
    }

    @Override // h.e
    public String f() {
        return h.g.b("CXCP-Camera2");
    }

    @Override // h.e
    public mu.g<List<h.v>> g() {
        return this.camera2DeviceCache.t();
    }

    @Override // h.e
    public List<h.v> h() {
        return this.camera2DeviceCache.n();
    }

    @Override // h.e
    public h.n i(h.m cameraContext, h.u graphId, h.s.b graphConfig, l.i graphListener, h.p1 streamGraph, h.s1 surfaceTracker) {
        h.n nVarA = this.camera2CameraControllerComponent.a(new j.b(this, graphId, graphConfig, graphListener, (StreamGraph) streamGraph, surfaceTracker, this)).build().a();
        synchronized (this.lock) {
            this.activeCameraControllers.add(nVarA);
        }
        return nVarA;
    }

    @Override // h.e
    public ju.w0<oq.i0> j() {
        k.k.f107055a.a();
        this.camera2DeviceCache.B();
        return ju.k.b(this.threads.getCameraPipeScope(), null, null, new b(null), 3, null);
    }
}
