package PRN;

import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;
import v.h1;
import v.i2;
import v.j1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R*\u0010-\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b,\u0010\u000b\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u000fR4\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0.8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u00100\u0012\u0004\b5\u0010\u000b\u001a\u0004\b1\u00102\"\u0004\b3\u00104R:\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u00108\u0012\u0004\b=\u0010\u000b\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010?\u0012\u0004\bC\u0010\u000b\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0014R(\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110E8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010\u0014R(\u0010M\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010I\u0012\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010\u001fR(\u0010U\u001a\u00020N8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010O\u0012\u0004\bT\u0010\u000b\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006V"}, d2 = {"LPRN/c;", "Lp/a;", "Lv/i2;", "Lh/z;", "cameraPipe", "Lh/p;", "cameraDevices", "<init>", "(Lh/z;Lh/p;)V", "Loq/i0;", "j", "()V", "Lv/h1;", "repository", "b", "(Lv/h1;)V", "", "", "cameraIds", "g", "(Ljava/util/List;)V", "Lo/q;", "cameraInfo", "e", "(Lo/q;)V", "c", "", "f", "()I", "cameraOperatingMode", "h", "(I)V", "i", "a", "Lh/z;", "Lh/p;", "", "Ljava/lang/Object;", "lock", "d", "Lv/h1;", "getCameraRepository", "()Lv/h1;", "setCameraRepository", "getCameraRepository$annotations", "cameraRepository", "", "Lh/v;", "Ljava/util/Set;", "getConcurrentCameraIdsSet", "()Ljava/util/Set;", "setConcurrentCameraIdsSet", "(Ljava/util/Set;)V", "getConcurrentCameraIdsSet$annotations", "concurrentCameraIdsSet", "", "Ljava/util/Map;", "getConcurrentCameraIdMap", "()Ljava/util/Map;", "setConcurrentCameraIdMap", "(Ljava/util/Map;)V", "getConcurrentCameraIdMap$annotations", "concurrentCameraIdMap", "Ljava/util/List;", "getActiveConcurrentCameraInfosList", "()Ljava/util/List;", "setActiveConcurrentCameraInfosList", "getActiveConcurrentCameraInfosList$annotations", "activeConcurrentCameraInfosList", "", "getPendingCameraIds", "setPendingCameraIds", "pendingCameraIds", "I", "getConcurrentMode", "setConcurrentMode", "getConcurrentMode$annotations", "concurrentMode", "", "Z", "getConcurrentModeOn", "()Z", "setConcurrentModeOn", "(Z)V", "getConcurrentModeOn$annotations", "concurrentModeOn", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements p.a, i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private h.z cameraPipe;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.p cameraDevices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private h1 cameraRepository;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int concurrentMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean concurrentModeOn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Set<? extends Set<h.v>> concurrentCameraIdsSet = pq.e1.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Map<String, ? extends List<String>> concurrentCameraIdMap = pq.v0.i();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<? extends o.q> activeConcurrentCameraInfosList = pq.v.n();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<String> pendingCameraIds = new ArrayList();

    public c(h.z zVar, h.p pVar) {
        this.cameraPipe = zVar;
        this.cameraDevices = pVar;
    }

    private final void j() {
        l lVar;
        synchronized (this.lock) {
            try {
                if (!this.activeConcurrentCameraInfosList.isEmpty() && !this.pendingCameraIds.isEmpty()) {
                    List<? extends o.q> list = this.activeConcurrentCameraInfosList;
                    ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            if (fr.t.c(pq.v.k1(arrayList), pq.v.k1(this.pendingCameraIds))) {
                                this.pendingCameraIds.clear();
                                List<? extends o.q> list2 = this.activeConcurrentCameraInfosList;
                                synchronized (this.lock) {
                                    h1 h1Var = this.cameraRepository;
                                    if (h1Var == null) {
                                        e.c cVar = e.c.f45719a;
                                        if (o.e1.g("CXCP")) {
                                            c2.e(e.c.TRUNCATED_TAG, "Coordinator has not been initialized with a CameraRepository.");
                                        }
                                        return;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        try {
                                            v.n0 n0VarL = h1Var.l(k.INSTANCE.a((o.q) it4.next()));
                                            lVar = n0VarL instanceof l ? (l) n0VarL : null;
                                        } catch (IllegalArgumentException unused) {
                                        }
                                        if (lVar != null) {
                                            arrayList2.add(lVar);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(pq.v.y(arrayList2, 10));
                                    Iterator it5 = arrayList2.iterator();
                                    while (it5.hasNext()) {
                                        h.s.b bVarY = ((l) it5.next()).y();
                                        if (bVarY == null) {
                                            throw new IllegalStateException("Every CameraInternal instance is expected to have a deferred CameraGraph config");
                                        }
                                        arrayList3.add(bVarY);
                                    }
                                    h.z zVar = this.cameraPipe;
                                    if (zVar == null) {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    List<h.s> listE = zVar.e(new h.s.a(arrayList3));
                                    if (listE.size() != arrayList3.size()) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    for (oq.r rVar : pq.v.p1(arrayList2, listE)) {
                                        ((l) rVar.a()).z((h.s) rVar.b());
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        String strA = k.INSTANCE.a((o.q) it.next());
                        h.v vVarA = strA != null ? h.v.a(strA) : null;
                        if (vVarA == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(vVarA.getValue());
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p.a
    public void b(h1 repository) throws j1 {
        List<String> listN;
        synchronized (this.lock) {
            this.cameraRepository = repository;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        List listD = h.p.d(this.cameraDevices, null, 1, null);
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
        g(listN);
    }

    @Override // p.a
    public void c(o.q cameraInfo) {
        synchronized (this.lock) {
            try {
                if (this.concurrentModeOn) {
                    List<String> list = this.pendingCameraIds;
                    String strA = k.INSTANCE.a(cameraInfo);
                    h.v vVarA = strA != null ? h.v.a(strA) : null;
                    if (vVarA == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    list.remove(vVarA.getValue());
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p.a
    public void e(o.q cameraInfo) {
        synchronized (this.lock) {
            try {
                if (this.concurrentModeOn) {
                    List<String> list = this.pendingCameraIds;
                    String strA = k.INSTANCE.a(cameraInfo);
                    h.v vVarA = strA != null ? h.v.a(strA) : null;
                    if (vVarA == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    list.add(vVarA.getValue());
                    j();
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p.a
    public int f() {
        int i15;
        synchronized (this.lock) {
            i15 = this.concurrentMode;
        }
        return i15;
    }

    @Override // v.i2
    public void g(List<String> cameraIds) throws j1 {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> setE = h.p.e(this.cameraDevices, null, 1, null);
            if (setE == null) {
                setE = pq.e1.e();
            }
            for (Set set : setE) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(pq.v.y(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h.v) it.next()).getValue());
                }
                Set setK1 = pq.v.k1(arrayList);
                if (cameraIds.containsAll(setK1)) {
                    List listF1 = pq.v.f1(set);
                    if (listF1.size() >= 2) {
                        String value = ((h.v) listF1.get(0)).getValue();
                        String value2 = ((h.v) listF1.get(1)).getValue();
                        try {
                            if (f.a.b(value, this.cameraDevices) && f.a.b(value2, this.cameraDevices)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(value)) {
                                    linkedHashMap.put(value, new ArrayList());
                                }
                                ((List) linkedHashMap.get(value)).add(value2);
                                if (!linkedHashMap.containsKey(value2)) {
                                    linkedHashMap.put(value2, new ArrayList());
                                }
                                ((List) linkedHashMap.get(value2)).add(value);
                            }
                        } catch (o.c1 e15) {
                            e.c cVar = e.c.f45719a;
                            if (o.e1.k("CXCP")) {
                                c2.g(e.c.TRUNCATED_TAG, "Skipping incompatible concurrent pair: " + set + " due to " + e15.getMessage());
                            }
                        }
                    }
                } else {
                    e.c cVar2 = e.c.f45719a;
                    if (o.e1.k("CXCP")) {
                        c2.g(e.c.TRUNCATED_TAG, "Failed to retrieve concurrent camera: " + setK1 + " from " + cameraIds);
                    }
                }
            }
            synchronized (this.lock) {
                this.concurrentCameraIdsSet = linkedHashSet;
                this.concurrentCameraIdMap = linkedHashMap;
                oq.i0 i0Var = oq.i0.f148189a;
            }
        } catch (Exception e16) {
            throw new j1("Failed to retrieve concurrent camera id info for camera-pipe.", e16);
        }
    }

    @Override // p.a
    public void h(int cameraOperatingMode) {
        h1 h1Var;
        synchronized (this.lock) {
            this.concurrentMode = cameraOperatingMode;
            h1Var = this.cameraRepository;
        }
        if (h1Var == null) {
            return;
        }
        boolean z15 = cameraOperatingMode == 2;
        this.concurrentModeOn = z15;
        if (!z15) {
            this.activeConcurrentCameraInfosList = pq.v.n();
        }
        for (v.n0 n0Var : h1Var.m()) {
            l lVar = n0Var instanceof l ? (l) n0Var : null;
            if (lVar != null) {
                if (cameraOperatingMode == 1) {
                    lVar.A(true);
                } else if (cameraOperatingMode == 2) {
                    lVar.A(false);
                }
            }
        }
    }

    public void i() {
        this.cameraPipe = null;
        this.concurrentModeOn = false;
        synchronized (this.lock) {
            this.cameraRepository = null;
            this.concurrentCameraIdsSet = pq.e1.e();
            this.concurrentCameraIdMap = pq.v0.i();
            this.activeConcurrentCameraInfosList = pq.v.n();
            this.concurrentMode = 0;
            this.pendingCameraIds.clear();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }
}
