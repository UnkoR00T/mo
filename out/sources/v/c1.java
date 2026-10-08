package v;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 k2\u00020\u0001:\u0003>@<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010\u001cJ\u001d\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b(\u0010&J%\u0010/\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000b¢\u0006\u0004\b1\u0010\u001cJ\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u0002062\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u000b2\u0006\u00103\u001a\u000206¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u001c\u0010H\u001a\b\u0012\u0002\b\u0003\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010P\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u00060SR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u0002020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020b0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010`R&\u0010j\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0f0e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lv/c1;", "", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutor", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V", "", "Lo/p;", "newFilteredIdentifiers", "Loq/i0;", "E", "(Ljava/util/List;)V", "", "addedCameras", "removedCameras", ip.a.f96138c, "(Ljava/util/Set;Ljava/util/Set;)V", "", "systemCameraId", "y", "(Ljava/lang/String;)V", "Lv/m0;", "cameraInfoInternal", "M", "(Lv/m0;)V", "T", "()V", "", "attemptsLeft", "initialIds", "J", "(ILjava/util/List;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "w", "addedIds", "z", "(Ljava/util/Set;)V", "removedIds", "B", "Lv/k1;", "cameraValidator", "Lv/l0;", "cameraFactory", "Lv/h1;", "cameraRepository", "R", "(Lv/k1;Lv/l0;Lv/h1;)V", "Q", "Lv/i2;", "listener", "v", "(Lv/i2;)V", "Lo/r;", "executor", "t", "(Lo/r;Ljava/util/concurrent/Executor;)V", "F", "(Lo/r;)V", "a", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "c", "Ljava/lang/Object;", "observerLock", "d", "retryLock", "Ljava/util/concurrent/ScheduledFuture;", "e", "Ljava/util/concurrent/ScheduledFuture;", "retryScanFuture", "f", "Lv/l0;", "g", "Lv/h1;", "Lv/x2;", "h", "Lv/x2;", "sourcePresenceObservable", "i", "Lv/k1;", "Lv/c1$c;", "j", "Lv/c1$c;", "sourceObserver", "k", "Ljava/util/List;", "currentFilteredIds", "Ljava/util/concurrent/atomic/AtomicBoolean;", "l", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMonitoring", "Ljava/util/concurrent/CopyOnWriteArrayList;", "m", "Ljava/util/concurrent/CopyOnWriteArrayList;", "dependentInternalListeners", "Lv/c1$b;", "n", "publicApiListeners", "", "Landroidx/lifecycle/c0;", "Lo/t;", "o", "Ljava/util/Map;", "cameraStateObservers", "p", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Executor backgroundExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService scheduledExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ScheduledFuture<?> retryScanFuture;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private l0 cameraFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private h1 cameraRepository;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private x2<List<o.p>> sourcePresenceObservable;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private k1 cameraValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object observerLock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object retryLock = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c sourceObserver = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private volatile List<o.p> currentFilteredIds = pq.v.n();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isMonitoring = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<i2> dependentInternalListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<ListenerWrapper> publicApiListeners = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<String, androidx.p016lifecycle.c0<o.t>> cameraStateObservers = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v.c1$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lv/c1$b;", "", "Lo/r;", "listener", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lo/r;Ljava/util/concurrent/Executor;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo/r;", "b", "()Lo/r;", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class ListenerWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o.r listener;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Executor executor;

        public ListenerWrapper(o.r rVar, Executor executor) {
            this.listener = rVar;
            this.executor = executor;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Executor getExecutor() {
            return this.executor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o.r getListener() {
            return this.listener;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListenerWrapper)) {
                return false;
            }
            ListenerWrapper listenerWrapper = (ListenerWrapper) other;
            return fr.t.c(this.listener, listenerWrapper.listener) && fr.t.c(this.executor, listenerWrapper.executor);
        }

        public int hashCode() {
            return (this.listener.hashCode() * 31) + this.executor.hashCode();
        }

        public String toString() {
            return "ListenerWrapper(listener=" + this.listener + ", executor=" + this.executor + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv/c1$c;", "Lv/x2$a;", "", "Lo/p;", "<init>", "(Lv/c1;)V", "rawCameraIdentifiers", "Loq/i0;", "b", "(Ljava/util/List;)V", "", "t", "onError", "(Ljava/lang/Throwable;)V", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class c implements x2.a<List<? extends o.p>> {
        public c() {
        }

        @Override // v.x2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<o.p> rawCameraIdentifiers) {
            l0 l0Var;
            h1 h1Var;
            k1 k1Var;
            List<String> listN;
            if (!c1.this.isMonitoring.get() || (l0Var = c1.this.cameraFactory) == null || (h1Var = c1.this.cameraRepository) == null || (k1Var = c1.this.cameraValidator) == null) {
                return;
            }
            if (rawCameraIdentifiers != null) {
                List<o.p> list = rawCameraIdentifiers;
                listN = new ArrayList<>(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listN.add(((o.p) it.next()).b());
                }
            } else {
                listN = pq.v.n();
            }
            if (l0Var instanceof l0.a) {
                try {
                    List list2 = c1.this.currentFilteredIds;
                    List<String> listD = ((l0.a) l0Var).d(listN);
                    ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                    Iterator<T> it4 = listD.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(o.p.a.d((String) it4.next(), null, null, 6, null));
                    }
                    Set<o.p> setJ = pq.e1.j(pq.v.k1(list2), pq.v.k1(arrayList));
                    if (!setJ.isEmpty() && k1Var.c(h1Var.m(), setJ)) {
                        o.e1.o("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                        return;
                    }
                } catch (Exception e15) {
                    o.e1.p("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e15);
                }
            }
            try {
                l0Var.e(listN);
                Set<String> setC = l0Var.c();
                ArrayList arrayList2 = new ArrayList(pq.v.y(setC, 10));
                Iterator<T> it5 = setC.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(o.p.a.d((String) it5.next(), null, null, 6, null));
                }
                if (fr.t.c(arrayList2, c1.this.currentFilteredIds)) {
                    return;
                }
                c1.this.E(arrayList2);
            } catch (Exception e16) {
                o.e1.p("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e16);
            }
        }

        @Override // v.x2.a
        public void onError(Throwable t15) {
            if (c1.this.isMonitoring.get()) {
                o.e1.d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t15);
                x2 x2Var = c1.this.sourcePresenceObservable;
                if (x2Var != null) {
                    x2Var.b();
                }
            }
        }
    }

    public c1(Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.backgroundExecutor = executor;
        this.scheduledExecutor = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().b(set);
    }

    private final void B(final Set<o.p> removedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: v.q0
                @Override // java.lang.Runnable
                public final void run() {
                    c1.C(listenerWrapper, removedIds);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().a(set);
    }

    private final void D(Set<o.p> addedCameras, Set<o.p> removedCameras) {
        if (!addedCameras.isEmpty()) {
            o.e1.e("CameraPresencePrvdr", "Notifying " + addedCameras.size() + " cameras added.");
            z(addedCameras);
        }
        if (removedCameras.isEmpty()) {
            return;
        }
        o.e1.e("CameraPresencePrvdr", "Notifying " + removedCameras.size() + " cameras removed.");
        B(removedCameras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(List<o.p> newFilteredIdentifiers) {
        List listF1 = pq.v.f1(this.currentFilteredIds);
        if (fr.t.c(newFilteredIdentifiers, listF1)) {
            return;
        }
        synchronized (this.retryLock) {
            try {
                if (this.retryScanFuture != null) {
                    o.e1.a("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                    this.retryScanFuture.cancel(false);
                    this.retryScanFuture = null;
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        List list = listF1;
        Set setK1 = pq.v.k1(list);
        List<o.p> list2 = newFilteredIdentifiers;
        Set setK2 = pq.v.k1(list2);
        Set<o.p> setJ = pq.e1.j(setK2, setK1);
        Set<o.p> setJ2 = pq.e1.j(setK1, setK2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(pq.v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o.p) it.next()).b());
        }
        try {
            Iterator<T> it4 = setJ2.iterator();
            while (it4.hasNext()) {
                H(((o.p) it4.next()).b());
            }
            h1 h1Var = this.cameraRepository;
            if (h1Var != null) {
                o.e1.a("CameraPresencePrvdr", "Updating CameraRepository...");
                h1Var.g(arrayList2);
                arrayList.add(h1Var);
                o.e1.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!this.dependentInternalListeners.isEmpty()) {
                o.e1.a("CameraPresencePrvdr", "Updating " + this.dependentInternalListeners.size() + " dependent listeners...");
                for (i2 i2Var : this.dependentInternalListeners) {
                    i2Var.g(arrayList2);
                    arrayList.add(i2Var);
                }
            }
            this.currentFilteredIds = newFilteredIdentifiers;
            Iterator<T> it5 = setJ.iterator();
            while (it5.hasNext()) {
                y(((o.p) it5.next()).b());
            }
            D(setJ, setJ2);
        } catch (Exception e15) {
            o.e1.d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e15);
            ArrayList arrayList3 = new ArrayList(pq.v.y(list, 10));
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((o.p) it6.next()).b());
            }
            for (i2 i2Var2 : pq.v.T(arrayList)) {
                try {
                    i2Var2.g(arrayList3);
                } catch (Exception e16) {
                    o.e1.d("CameraPresencePrvdr", "Failed to rollback listener: " + i2Var2, e16);
                }
            }
            Iterator<T> it7 = setJ2.iterator();
            while (it7.hasNext()) {
                y(((o.p) it7.next()).b());
            }
            Iterator<T> it8 = setJ.iterator();
            while (it8.hasNext()) {
                H(((o.p) it8.next()).b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(o.r rVar, ListenerWrapper listenerWrapper) {
        return fr.t.c(listenerWrapper.getListener(), rVar);
    }

    private final void H(String systemCameraId) {
        synchronized (this.observerLock) {
            final androidx.p016lifecycle.c0<o.t> c0VarRemove = this.cameraStateObservers.remove(systemCameraId);
            h1 h1Var = this.cameraRepository;
            if (c0VarRemove != null && h1Var != null) {
                try {
                    final n0 n0VarL = h1Var.l(systemCameraId);
                    z.a.d().execute(new Runnable() { // from class: v.t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1.I(n0VarL, c0VarRemove);
                        }
                    });
                    o.e1.a("CameraPresencePrvdr", "Removed state observer for: " + systemCameraId);
                } catch (IllegalArgumentException unused) {
                }
            }
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(n0 n0Var, androidx.p016lifecycle.c0 c0Var) {
        n0Var.o().d().n(c0Var);
    }

    private final void J(final int attemptsLeft, final List<o.p> initialIds) {
        if (attemptsLeft > 0 && this.isMonitoring.get()) {
            this.retryScanFuture = this.scheduledExecutor.schedule(new Runnable() { // from class: v.b1
                @Override // java.lang.Runnable
                public final void run() {
                    c1.K(this.f202507a, initialIds, attemptsLeft);
                }
            }, attemptsLeft == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (attemptsLeft <= 0) {
            o.e1.o("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(final c1 c1Var, final List list, final int i15) {
        c1Var.backgroundExecutor.execute(new Runnable() { // from class: v.s0
            @Override // java.lang.Runnable
            public final void run() {
                c1.L(this.f202839a, list, i15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(c1 c1Var, List list, int i15) {
        if (c1Var.isMonitoring.get() && fr.t.c(c1Var.currentFilteredIds, list)) {
            o.e1.a("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i15);
            x2<List<o.p>> x2Var = c1Var.sourcePresenceObservable;
            if (x2Var != null) {
                x2Var.b();
            }
            c1Var.J(i15 - 1, list);
        }
    }

    private final void M(final m0 cameraInfoInternal) {
        final String strI = cameraInfoInternal.i();
        if (this.isMonitoring.get()) {
            synchronized (this.observerLock) {
                if (this.cameraStateObservers.containsKey(strI)) {
                    return;
                }
                final androidx.p016lifecycle.c0<o.t> c0Var = new androidx.p016lifecycle.c0() { // from class: v.w0
                    @Override // androidx.p016lifecycle.c0
                    public final void a(Object obj) {
                        c1.N(this.f202895a, strI, (o.t) obj);
                    }
                };
                z.a.d().execute(new Runnable() { // from class: v.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1.P(cameraInfoInternal, c0Var);
                    }
                });
                this.cameraStateObservers.put(strI, c0Var);
                o.e1.a("CameraPresencePrvdr", "Registered state observer for camera: " + strI);
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(final c1 c1Var, String str, o.t tVar) {
        if (!c1Var.isMonitoring.get()) {
            o.e1.a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if (tVar.b() != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Camera ");
            sb5.append(str);
            sb5.append(" state changed to ");
            sb5.append(tVar.c());
            sb5.append(" with error: ");
            o.t.a aVarB = tVar.b();
            sb5.append(aVarB != null ? Integer.valueOf(aVarB.d()) : null);
            sb5.append(". Triggering refresh.");
            o.e1.o("CameraPresencePrvdr", sb5.toString());
            c1Var.backgroundExecutor.execute(new Runnable() { // from class: v.z0
                @Override // java.lang.Runnable
                public final void run() {
                    c1.O(this.f202937a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c1 c1Var) {
        c1Var.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(m0 m0Var, androidx.p016lifecycle.c0 c0Var) {
        m0Var.d().j(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(c1 c1Var) {
        Iterator<T> it = c1Var.currentFilteredIds.iterator();
        while (it.hasNext()) {
            c1Var.y(((o.p) it.next()).b());
        }
    }

    private final void T() {
        synchronized (this.retryLock) {
            try {
                ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                o.e1.a("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                J(3, this.currentFilteredIds);
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(c1 c1Var, o.r rVar) {
        Set<o.p> setK1 = pq.v.k1(c1Var.currentFilteredIds);
        if (setK1.isEmpty()) {
            return;
        }
        rVar.b(setK1);
    }

    private final void w() {
        synchronized (this.observerLock) {
            if (this.cameraStateObservers.isEmpty()) {
                return;
            }
            Map mapU = pq.v0.u(this.cameraStateObservers);
            this.cameraStateObservers.clear();
            oq.i0 i0Var = oq.i0.f148189a;
            h1 h1Var = this.cameraRepository;
            if (h1Var != null) {
                LinkedHashSet<n0> linkedHashSetM = h1Var.m();
                final ArrayList arrayList = new ArrayList();
                for (n0 n0Var : linkedHashSetM) {
                    m0 m0VarO = n0Var != null ? n0Var.o() : null;
                    if (m0VarO != null) {
                        arrayList.add(m0VarO);
                    }
                }
                o.e1.a("CameraPresencePrvdr", "Clearing all " + mapU.size() + " state observers.");
                for (Map.Entry entry : mapU.entrySet()) {
                    final String str = (String) entry.getKey();
                    final androidx.p016lifecycle.c0 c0Var = (androidx.p016lifecycle.c0) entry.getValue();
                    z.a.d().execute(new Runnable() { // from class: v.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c1.x(arrayList, c0Var, str);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(List list, androidx.p016lifecycle.c0 c0Var, String str) {
        Object next;
        androidx.p016lifecycle.y<o.t> yVarD;
        try {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((m0) next).i(), str));
            m0 m0Var = (m0) next;
            if (m0Var == null || (yVarD = m0Var.d()) == null) {
                return;
            }
            yVarD.n(c0Var);
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void y(String systemCameraId) {
        h1 h1Var = this.cameraRepository;
        if (h1Var == null) {
            return;
        }
        try {
            M(h1Var.l(systemCameraId).o());
        } catch (IllegalArgumentException unused) {
            o.e1.o("CameraPresencePrvdr", "CameraInternal not found for " + systemCameraId + ". Cannot setup state observer.");
        }
    }

    private final void z(final Set<o.p> addedIds) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: v.u0
                @Override // java.lang.Runnable
                public final void run() {
                    c1.A(listenerWrapper, addedIds);
                }
            });
        }
    }

    public final void F(final o.r listener) {
        pq.v.J(this.publicApiListeners, new er.l() { // from class: v.y0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(c1.G(listener, (c1.ListenerWrapper) obj));
            }
        });
    }

    public final void Q() {
        if (!this.isMonitoring.getAndSet(false)) {
            o.e1.a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        o.e1.e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.retryLock) {
            try {
                ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.retryScanFuture = null;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        x2<List<o.p>> x2Var = this.sourcePresenceObservable;
        if (x2Var != null) {
            x2Var.c(this.sourceObserver);
        }
        w();
        this.cameraValidator = null;
        this.dependentInternalListeners.clear();
        this.publicApiListeners.clear();
        this.currentFilteredIds = pq.v.n();
        this.cameraFactory = null;
        this.cameraRepository = null;
    }

    public final void R(k1 cameraValidator, l0 cameraFactory, h1 cameraRepository) {
        if (this.isMonitoring.compareAndSet(false, true)) {
            o.e1.e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.cameraValidator = cameraValidator;
            Set<String> setC = cameraFactory.c();
            ArrayList arrayList = new ArrayList(pq.v.y(setC, 10));
            Iterator<T> it = setC.iterator();
            while (it.hasNext()) {
                arrayList.add(o.p.a.d((String) it.next(), null, null, 6, null));
            }
            this.currentFilteredIds = arrayList;
            this.cameraFactory = cameraFactory;
            this.cameraRepository = cameraRepository;
            this.sourcePresenceObservable = cameraFactory.b();
            this.backgroundExecutor.execute(new Runnable() { // from class: v.r0
                @Override // java.lang.Runnable
                public final void run() {
                    c1.S(this.f202832a);
                }
            });
            x2<List<o.p>> x2Var = this.sourcePresenceObservable;
            if (x2Var != null) {
                x2Var.a(z.a.f(this.backgroundExecutor), this.sourceObserver);
            }
        }
    }

    public final void t(final o.r listener, Executor executor) {
        this.publicApiListeners.add(new ListenerWrapper(listener, executor));
        executor.execute(new Runnable() { // from class: v.v0
            @Override // java.lang.Runnable
            public final void run() {
                c1.u(this.f202884a, listener);
            }
        });
    }

    public final void v(i2 listener) {
        this.dependentInternalListeners.add(listener);
    }
}
