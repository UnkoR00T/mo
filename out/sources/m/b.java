package m;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ju.p0;
import k.z;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010'\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lm/b;", "Lh/h;", "Lh/g;", "defaultBackendId", "", "Lh/f;", "cameraBackends", "Landroid/content/Context;", "cameraPipeContext", "Lk/z;", "threads", "Lm/g;", "cameraPipeLifetime", "<init>", "(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Lk/z;Lm/g;Lfr/k;)V", "Loq/i0;", "d", "(Ltq/e;)Ljava/lang/Object;", "backendId", "Lh/e;", "a", "(Ljava/lang/String;)Lh/e;", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "Landroid/content/Context;", "Lk/z;", "", "e", "Ljava/lang/Object;", "lock", "", "f", "activeCameraBackends", "g", "Lh/e;", "getDefault", "()Lh/e;", "default", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements h.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String defaultBackendId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<h.g, h.f> cameraBackends;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context cameraPipeContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z threads;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<h.g, h.e> activeCameraBackends;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h.e default;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121788e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121788e;
            if (i15 == 0) {
                u.b(obj);
                b bVar = b.this;
                this.f121788e = 1;
                if (bVar.d(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new a(eVar);
        }
    }

    /* JADX INFO: renamed from: m.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lm/b$b;", "Lh/m;", "Landroid/content/Context;", "appContext", "Lk/z;", "threads", "Lh/h;", "cameraBackends", "<init>", "(Landroid/content/Context;Lk/z;Lh/h;)V", "a", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "b", "Lk/z;", "getThreads", "()Lk/z;", "c", "Lh/h;", "getCameraBackends", "()Lh/h;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2984b implements h.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context appContext;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final z threads;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final h.h cameraBackends;

        public C2984b(Context context, z zVar, h.h hVar) {
            this.appContext = context;
            this.threads = zVar;
            this.cameraBackends = hVar;
        }
    }

    public /* synthetic */ b(String str, Map map, Context context, z zVar, g gVar, fr.k kVar) {
        this(str, map, context, zVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar) {
        ju.j.b(null, bVar.new a(null), 1, null);
    }

    @Override // h.h
    public h.e a(String backendId) {
        synchronized (this.lock) {
            try {
                h.e eVar = this.activeCameraBackends.get(h.g.a(backendId));
                if (eVar != null) {
                    return eVar;
                }
                h.f fVar = this.cameraBackends.get(h.g.a(backendId));
                h.e eVarA = fVar != null ? fVar.a(new C2984b(this.cameraPipeContext, this.threads, this)) : null;
                if (eVarA != null) {
                    if (!h.g.d(backendId, eVarA.f())) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) h.g.f(backendId)) + " but it was actually " + ((Object) h.g.f(eVarA.f()))).toString());
                    }
                    this.activeCameraBackends.put(h.g.a(backendId), eVarA);
                }
                return eVarA;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public Object d(tq.e<? super i0> eVar) {
        k.k.f107055a.a();
        Map<h.g, h.e> map = this.activeCameraBackends;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<h.g, h.e>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().j());
        }
        Object objC = ju.f.c(arrayList, eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    @Override // h.h
    public h.e getDefault() {
        return this.default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(String str, Map<h.g, ? extends h.f> map, Context context, z zVar, g gVar) {
        this.defaultBackendId = str;
        this.cameraBackends = map;
        this.cameraPipeContext = context;
        this.threads = zVar;
        this.lock = new Object();
        this.activeCameraBackends = new LinkedHashMap();
        gVar.d(g.b.CAMERA, new Runnable() { // from class: m.a
            @Override // java.lang.Runnable
            public final void run() {
                b.c(this.f121780a);
            }
        });
        h.e eVarA = a(str);
        if (eVarA != null) {
            this.default = eVarA;
            return;
        }
        throw new IllegalStateException(("Failed to load the default backend for " + ((Object) h.g.f(str)) + "! Available backends are " + map.keySet()).toString());
    }
}
