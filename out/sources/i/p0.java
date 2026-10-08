package i;

import android.os.Build;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ju.CoroutineName;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R.\u0010(\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u0010R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Li/p0;", "Li/n0;", "Lk/z;", "threads", "Lm/g;", "cameraPipeLifetime", "Lju/d2;", "cameraPipeJob", "<init>", "(Lk/z;Lm/g;Lju/d2;)V", "Lh/c;", "g", "()Lh/c;", "previousMode", "Loq/i0;", "i", "(Lh/c;)V", "Lh/s;", "cameraGraph", "a", "(Lh/s;)V", "Li/n0$a;", "listener", "b", "(Li/n0$a;)V", "c", "Lju/p0;", "Lju/p0;", "scope", "Lk/e;", "Lk/e;", "coroutineMutex", "", "Ljava/lang/Object;", "lock", "value", "d", "Lh/c;", "h", "setGlobalAudioRestrictionMode-3NUV5dA", "globalAudioRestrictionMode", "", "e", "Ljava/util/Map;", "audioRestrictionModeMap", "Ljava/util/concurrent/CopyOnWriteArrayList;", "f", "Ljava/util/concurrent/CopyOnWriteArrayList;", "activeListeners", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private h.c globalAudioRestrictionMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k.e coroutineMutex = new k.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<h.s, h.c> audioRestrictionModeMap = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<n0.a> activeListeners = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n0.a f87310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.c f87311g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0.a aVar, h.c cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f87310f = aVar;
            this.f87311g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87309e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f87310f.a(this.f87311g.getValue());
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f87310f, this.f87311g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87312e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.c f87314g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h.c cVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f87314g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f87312e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Iterator it = p0.this.activeListeners.iterator();
            while (it.hasNext()) {
                ((n0.a) it.next()).a(this.f87314g.getValue());
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return p0.this.new b(this.f87314g, eVar);
        }
    }

    public p0(k.z zVar, m.g gVar, ju.d2 d2Var) {
        this.scope = ju.q0.a(ju.z2.a(d2Var).n0(zVar.getLightweightDispatcher().n0(new CoroutineName("CXCP-AudioRestrictionControllerImpl"))));
        gVar.d(m.g.b.SCOPE, new Runnable() { // from class: i.o0
            @Override // java.lang.Runnable
            public final void run() {
                p0.e(this.f87282a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p0 p0Var) {
        ju.q0.d(p0Var.scope, null, 1, null);
    }

    private final h.c g() {
        Map<h.s, h.c> map = this.audioRestrictionModeMap;
        h.c.Companion companion = h.c.INSTANCE;
        if (!map.containsValue(h.c.d(companion.c()))) {
            h.c cVarH = h();
            if (!(cVarH == null ? false : h.c.g(cVarH.getValue(), companion.c()))) {
                if (!this.audioRestrictionModeMap.containsValue(h.c.d(companion.b()))) {
                    h.c cVarH2 = h();
                    if (!(cVarH2 == null ? false : h.c.g(cVarH2.getValue(), companion.b()))) {
                        if (!this.audioRestrictionModeMap.containsValue(h.c.d(companion.a()))) {
                            h.c cVarH3 = h();
                            if (!(cVarH3 != null ? h.c.g(cVarH3.getValue(), companion.a()) : false)) {
                                return null;
                            }
                        }
                        return h.c.d(companion.a());
                    }
                }
                return h.c.d(companion.b());
            }
        }
        return h.c.d(companion.c());
    }

    private final void i(h.c previousMode) {
        h.c cVarG = g();
        if (cVarG == null || fr.t.c(cVarG, previousMode)) {
            return;
        }
        k.m.e(this.coroutineMutex, this.scope, new b(cVarG, null));
    }

    @Override // i.n0
    public void a(h.s cameraGraph) {
        synchronized (this.lock) {
            h.c cVarG = g();
            this.audioRestrictionModeMap.remove(cameraGraph);
            i(cVarG);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    @Override // i.n0
    public void b(n0.a listener) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        synchronized (this.lock) {
            try {
                this.activeListeners.add(listener);
                h.c cVarG = g();
                if (cVarG != null) {
                    k.m.e(this.coroutineMutex, this.scope, new a(listener, cVarG, null));
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // i.n0
    public void c(n0.a listener) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        this.activeListeners.remove(listener);
    }

    public h.c h() {
        h.c cVar;
        synchronized (this.lock) {
            cVar = this.globalAudioRestrictionMode;
        }
        return cVar;
    }
}
