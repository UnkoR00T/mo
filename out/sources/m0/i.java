package m0;

import android.content.Context;
import com.google.common.util.concurrent.q;
import fr.t;
import fr.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.d0;
import o.d1;
import o.e0;
import o.h0;
import o.j2;
import o.o;
import o.p;
import o.r;
import o.s;
import o.u1;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p105prN.o2;
import v.c1;
import v.f0;
import v.m0;
import v.n0;
import v.y1;
import y.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0004J#\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010#\u001a\u00020\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H\u0017¢\u0006\u0004\b0\u0010\u0004J7\u00104\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u000f2\u0016\u00103\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010201\"\u0004\u0018\u000102H\u0017¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\u00052\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908H\u0017¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\u00020\u00052\f\u0010=\u001a\b\u0012\u0004\u0012\u00020908H\u0017¢\u0006\u0004\b>\u0010<R\u0014\u0010@\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R*\u0010H\u001a\u0004\u0018\u00010A8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b;\u0010B\u0012\u0004\bG\u0010\u0004\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010N\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010'0'0&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010JR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR*\u0010#\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bV\u0010W\u0012\u0004\b\\\u0010\u0004\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R \u0010a\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020^0]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010g\u001a\u0012\u0012\u0004\u0012\u00020c0bj\b\u0012\u0004\u0012\u00020c`d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010j\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR$\u0010l\u001a\u00020k2\u0006\u0010l\u001a\u00020k8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lm0/i;", "", "Lo/r;", "<init>", "()V", "Loq/i0;", "K", "Lo/d0;", "newCameraX", "Landroid/content/Context;", "newContext", "E", "(Lo/d0;Landroid/content/Context;)V", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lo/s;", "primaryCameraSelector", "secondaryCameraSelector", "Lo/h0;", "primaryCompositionSettings", "secondaryCompositionSettings", "Lo/u1;", "sessionConfig", "Lo/i;", "r", "(Landroidx/lifecycle/q;Lo/s;Lo/s;Lo/h0;Lo/h0;Lo/u1;)Lo/i;", "Loq/r;", "y", "(Lo/u1;Lo/s;Lo/s;)Loq/r;", "cameraSelector", "Lo/q;", "cameraInfo", "Lv/f0;", "u", "(Lo/s;Lo/q;)Lv/f0;", "context", "Lo/e0;", "cameraXConfig", "Lcom/google/common/util/concurrent/q;", "Ljava/lang/Void;", "z", "(Landroid/content/Context;Lo/e0;)Lcom/google/common/util/concurrent/q;", "t", "(Lo/e0;)V", "", "clearConfigProvider", "I", "(Z)Lcom/google/common/util/concurrent/q;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "", "Lo/j2;", "useCases", "q", "(Landroidx/lifecycle/q;Lo/s;[Lo/j2;)Lo/i;", "v", "(Lo/s;)Lo/q;", "", "Lo/p;", "addedCameraIds", "b", "(Ljava/util/Set;)V", "removedCameraIds", "a", "Ljava/lang/Object;", "lock", "Lo/e0$b;", "Lo/e0$b;", "x", "()Lo/e0$b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lo/e0$b;)V", "getCameraXConfigProvider$camera_lifecycle$annotations", "cameraXConfigProvider", "c", "Lcom/google/common/util/concurrent/q;", "cameraXInitializeFuture", "kotlin.jvm.PlatformType", "d", "cameraXShutdownFuture", "e", "Lo/d0;", "cameraX", "Lm0/k;", "f", "Lm0/k;", "lifecycleCameraRepository", "g", "Landroid/content/Context;", "getContext$camera_lifecycle", "()Landroid/content/Context;", "setContext$camera_lifecycle", "(Landroid/content/Context;)V", "getContext$camera_lifecycle$annotations", "", "Lv/e;", "h", "Ljava/util/Map;", "cameraInfoMap", "Ljava/util/HashSet;", "Lm0/k$a;", "Lkotlin/collections/HashSet;", "i", "Ljava/util/HashSet;", "lifecycleCameraKeys", "F", "()Z", "isInitialized", "", "cameraOperatingMode", "w", "()I", "G", "(I)V", "camera-lifecycle"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e0.b cameraXConfigProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q<Void> cameraXInitializeFuture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private d0 cameraX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private k lifecycleCameraRepository;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Context context;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private q<Void> cameraXShutdownFuture = a0.f.h(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<p, v.e> cameraInfoMap = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final HashSet<k.a> lifecycleCameraKeys = new HashSet<>();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements e0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0 f121959a;

        a(e0 e0Var) {
            this.f121959a = e0Var;
        }

        @Override // o.e0.b
        public final e0 getCameraXConfig() {
            return this.f121959a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"m0/i$b", "La0/c;", "Ljava/lang/Void;", "void", "Loq/i0;", "c", "(Ljava/lang/Void;)V", "", "t", "b", "(Ljava/lang/Throwable;)V", "camera-lifecycle"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a0.c<Void> {
        b() {
        }

        @Override // a0.c
        public void b(Throwable t15) {
            i.this.I(false);
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q A(d0 d0Var, Void r15) {
        return d0Var.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q B(er.l lVar, Object obj) {
        return (q) lVar.b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void C(i iVar, d0 d0Var, Context context, Void r15) {
        iVar.E(d0Var, y.e.f(context));
        return r15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void D(er.l lVar, Object obj) {
        return (Void) lVar.b(obj);
    }

    private final void E(d0 newCameraX, Context newContext) {
        c1 c1VarH;
        synchronized (this.lock) {
            this.cameraX = newCameraX;
            this.context = newContext;
            if (newCameraX != null && (c1VarH = newCameraX.h()) != null) {
                c1VarH.t(this, z.a.d());
                i0 i0Var = i0.f148189a;
            }
        }
    }

    private final boolean F() {
        return this.cameraX != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i15) {
        if (F()) {
            this.cameraX.i().g().h(i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(i iVar) {
        if (iVar.F()) {
            iVar.L();
            iVar.lifecycleCameraRepository.i(iVar.lifecycleCameraKeys);
        }
    }

    private final void K() {
        E(null, null);
    }

    private final o.i r(androidx.p016lifecycle.q lifecycleOwner, s primaryCameraSelector, s secondaryCameraSelector, h0 primaryCompositionSettings, h0 secondaryCompositionSettings, u1 sessionConfig) {
        n0 n0Var;
        v.e eVar;
        eb.a.c("CX:bindToLifecycle-internal");
        try {
            w.b();
            oq.r rVarY = y(sessionConfig, primaryCameraSelector, secondaryCameraSelector);
            s sVar = (s) rVarY.a();
            s sVar2 = (s) rVarY.b();
            n0 n0VarG = sVar.g(this.cameraX.j().m());
            n0VarG.t(true);
            v.e eVar2 = (v.e) v(sVar);
            if (sVar2 != null) {
                n0 n0VarG2 = sVar2.g(this.cameraX.j().m());
                n0VarG2.t(false);
                eVar = (v.e) v(sVar2);
                n0Var = n0VarG2;
            } else {
                n0Var = null;
                eVar = null;
            }
            p pVarE = p.a.e(eVar2, eVar);
            c cVarC = this.lifecycleCameraRepository.c(lifecycleOwner, pVarE);
            Collection<c> collectionE = this.lifecycleCameraRepository.e();
            for (j2 j2Var : sessionConfig.m()) {
                for (c cVar : collectionE) {
                    if (cVar.w(j2Var) && !t.c(cVar.u(), lifecycleOwner)) {
                        v0 v0Var = v0.f66418a;
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{j2Var}, 1)));
                    }
                }
            }
            if (cVarC == null) {
                cVarC = this.lifecycleCameraRepository.b(lifecycleOwner, this.cameraX.k().b(n0VarG, n0Var, eVar2, eVar, primaryCompositionSettings, secondaryCompositionSettings), this.cameraX.n());
            }
            if (!sessionConfig.m().isEmpty()) {
                this.lifecycleCameraRepository.a(cVarC, sessionConfig, this.cameraX.i().g());
                this.lifecycleCameraKeys.add(k.a.a(lifecycleOwner, pVarE));
            }
            eb.a.f();
            return cVarC;
        } catch (Throwable th4) {
            eb.a.f();
            throw th4;
        }
    }

    static /* synthetic */ o.i s(i iVar, androidx.p016lifecycle.q qVar, s sVar, s sVar2, h0 h0Var, h0 h0Var2, u1 u1Var, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            sVar2 = null;
        }
        s sVar3 = sVar2;
        if ((i15 & 8) != 0) {
            h0Var = h0.f139972d;
        }
        h0 h0Var3 = h0Var;
        if ((i15 & 16) != 0) {
            h0Var2 = h0.f139972d;
        }
        return iVar.r(qVar, sVar, sVar3, h0Var3, h0Var2, u1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f0 u(s cameraSelector, o.q cameraInfo) {
        f0 f0VarA;
        f0 f0Var = null;
        for (o oVar : cameraSelector.c()) {
            if (!t.c(oVar.a(), o.f140085a) && (f0VarA = y1.a(oVar.a()).a(cameraInfo, this.context)) != null) {
                if (f0Var != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                f0Var = f0VarA;
            }
        }
        return f0Var == null ? v.i0.a() : f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int w() {
        if (F()) {
            return this.cameraX.i().g().f();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oq.r<s, s> y(u1 sessionConfig, s primaryCameraSelector, s secondaryCameraSelector) {
        o cameraFilter = sessionConfig.getCameraFilter();
        if (cameraFilter == null) {
            return y.a(primaryCameraSelector, secondaryCameraSelector);
        }
        return y.a(s.a.c(primaryCameraSelector).a(cameraFilter).b(), secondaryCameraSelector != null ? s.a.c(secondaryCameraSelector).a(cameraFilter).b() : null);
    }

    public final void H(e0.b bVar) {
        this.cameraXConfigProvider = bVar;
    }

    public final q<Void> I(boolean clearConfigProvider) {
        q<Void> qVarH;
        w.f(new Runnable() { // from class: m0.h
            @Override // java.lang.Runnable
            public final void run() {
                i.J(this.f121949a);
            }
        });
        if (F()) {
            this.cameraX.h().F(this);
            qVarH = this.cameraX.s();
        } else {
            qVarH = a0.f.h(null);
        }
        synchronized (this.lock) {
            if (clearConfigProvider) {
                try {
                    this.cameraXConfigProvider = null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            this.cameraXInitializeFuture = null;
            this.cameraXShutdownFuture = qVarH;
            this.cameraInfoMap.clear();
            this.lifecycleCameraKeys.clear();
            i0 i0Var = i0.f148189a;
        }
        K();
        return qVarH;
    }

    public void L() {
        eb.a.c("CX:unbindAll");
        try {
            w.b();
            G(0);
            this.lifecycleCameraRepository.m(this.lifecycleCameraKeys);
            i0 i0Var = i0.f148189a;
        } finally {
            eb.a.f();
        }
    }

    @Override // o.r
    public void a(Set<p> removedCameraIds) {
        w.b();
        synchronized (this.lock) {
            try {
                for (p pVar : removedCameraIds) {
                    Set<p> setKeySet = this.cameraInfoMap.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setKeySet) {
                        if (t.c(((p) obj).a(), pVar.a())) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.cameraInfoMap.remove((p) it.next());
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.r
    public void b(Set<p> addedCameraIds) {
    }

    public o.i q(androidx.p016lifecycle.q lifecycleOwner, s cameraSelector, j2... useCases) {
        eb.a.c("CX:bindToLifecycle");
        try {
            if (w() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            G(1);
            o.i iVarS = s(this, lifecycleOwner, cameraSelector, null, null, null, new d1(pq.n.k0(useCases), null, null, 6, null), 28, null);
            eb.a.f();
            return iVarS;
        } catch (Throwable th4) {
            eb.a.f();
            throw th4;
        }
    }

    public final void t(e0 cameraXConfig) {
        eb.a.c("CX:configureInstanceInternal");
        try {
            synchronized (this.lock) {
                i6.i.g(cameraXConfig);
                i6.i.j(getCameraXConfigProvider() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                H(new a(cameraXConfig));
                i0 i0Var = i0.f148189a;
            }
            eb.a.f();
        } catch (Throwable th4) {
            eb.a.f();
            throw th4;
        }
    }

    public o.q v(s cameraSelector) {
        Object eVar;
        eb.a.c("CX:getCameraInfo");
        try {
            m0 m0VarO = cameraSelector.g(this.cameraX.j().m()).getCameraInfo();
            f0 f0VarU = u(cameraSelector, m0VarO);
            p pVarB = p.a.b(m0VarO.i(), null, f0VarU.b0());
            synchronized (this.lock) {
                try {
                    eVar = this.cameraInfoMap.get(pVarB);
                    if (eVar == null) {
                        eVar = new v.e(m0VarO, f0VarU);
                        this.cameraInfoMap.put(pVarB, eVar);
                    }
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            v.e eVar2 = (v.e) eVar;
            eb.a.f();
            return eVar2;
        } catch (Throwable th5) {
            eb.a.f();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final e0.b getCameraXConfigProvider() {
        return this.cameraXConfigProvider;
    }

    public final q<Void> z(final Context context, e0 cameraXConfig) {
        synchronized (this.lock) {
            try {
                this.lifecycleCameraRepository = j.a(y.e.e(context));
                q<Void> qVar = this.cameraXInitializeFuture;
                if (qVar != null) {
                    return qVar;
                }
                if (cameraXConfig != null) {
                    t(cameraXConfig);
                }
                final d0 d0Var = new d0(context, this.cameraXConfigProvider);
                a0.d dVarA = a0.d.a(this.cameraXShutdownFuture);
                final er.l lVar = new er.l() { // from class: m0.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.A(d0Var, (Void) obj);
                    }
                };
                a0.d dVarF = dVarA.f(new a0.a() { // from class: m0.e
                    @Override // a0.a
                    public final q apply(Object obj) {
                        return i.B(lVar, obj);
                    }
                }, z.a.a());
                final er.l lVar2 = new er.l() { // from class: m0.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.C(this.f121945a, d0Var, context, (Void) obj);
                    }
                };
                a0.d dVarE = dVarF.e(new o2() { // from class: m0.g
                    @Override // p105prN.o2
                    public final Object apply(Object obj) {
                        return i.D(lVar2, obj);
                    }
                }, z.a.a());
                this.cameraXInitializeFuture = dVarE;
                a0.f.b(dVarE, new b(), z.a.a());
                return a0.f.i(dVarE);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
