package androidx.p016lifecycle;

import fr.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mu.b0;
import mu.r0;
import p009PRn.f1;
import p009PRn.g1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0002%\"B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t04j\b\u0012\u0004\u0012\u00020\t`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010<R$\u0010@\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010>\"\u0004\b?\u0010\r¨\u0006A"}, d2 = {"Landroidx/lifecycle/s;", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/q;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/q;Z)V", "(Landroidx/lifecycle/q;)V", "Landroidx/lifecycle/j$b;", "next", "Loq/i0;", "k", "(Landroidx/lifecycle/j$b;)V", "Landroidx/lifecycle/p;", "observer", "f", "(Landroidx/lifecycle/p;)Landroidx/lifecycle/j$b;", "l", "()V", "state", "m", "lifecycleOwner", "h", "e", "o", "", "methodName", "g", "(Ljava/lang/String;)V", "Landroidx/lifecycle/j$a;", "event", "i", "(Landroidx/lifecycle/j$a;)V", "a", "(Landroidx/lifecycle/p;)V", "d", "b", "Z", "LPRn/f1;", "Landroidx/lifecycle/s$b;", "c", "LPRn/f1;", "observerMap", "Landroidx/lifecycle/j$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Lmu/b0;", "j", "Lmu/b0;", "_currentStateFlow", "()Z", "isSynced", "()Landroidx/lifecycle/j$b;", "n", "currentState", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class s extends j {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceMainThread;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private f1<p, b> observerMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private j.b state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<q> lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int addingObserverCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean handlingEvent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean newEventOccurred;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ArrayList<j.b> parentStates;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b0<j.b> _currentStateFlow;

    /* JADX INFO: renamed from: androidx.lifecycle.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/s$a;", "", "<init>", "()V", "Landroidx/lifecycle/q;", "owner", "Landroidx/lifecycle/s;", "a", "(Landroidx/lifecycle/q;)Landroidx/lifecycle/s;", "Landroidx/lifecycle/j$b;", "state1", "state2", "b", "(Landroidx/lifecycle/j$b;Landroidx/lifecycle/j$b;)Landroidx/lifecycle/j$b;", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final s a(q owner) {
            return new s(owner, false, null);
        }

        public final j.b b(j.b state1, j.b state2) {
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/s$b;", "", "Landroidx/lifecycle/p;", "observer", "Landroidx/lifecycle/j$b;", "initialState", "<init>", "(Landroidx/lifecycle/p;Landroidx/lifecycle/j$b;)V", "Landroidx/lifecycle/q;", "owner", "Landroidx/lifecycle/j$a;", "event", "Loq/i0;", "a", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "Landroidx/lifecycle/j$b;", "b", "()Landroidx/lifecycle/j$b;", "setState", "(Landroidx/lifecycle/j$b;)V", "state", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/n;", "getLifecycleObserver", "()Landroidx/lifecycle/n;", "setLifecycleObserver", "(Landroidx/lifecycle/n;)V", "lifecycleObserver", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private j.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private n lifecycleObserver;

        public b(p pVar, j.b bVar) {
            this.lifecycleObserver = x.f(pVar);
            this.state = bVar;
        }

        public final void a(q owner, j.a event) {
            j.b bVarE = event.e();
            this.state = s.INSTANCE.b(this.state, bVarE);
            this.lifecycleObserver.m(owner, event);
            this.state = bVarE;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final j.b getState() {
            return this.state;
        }
    }

    public /* synthetic */ s(q qVar, boolean z15, k kVar) {
        this(qVar, z15);
    }

    private final void e(q lifecycleOwner) {
        Iterator<Map.Entry<p, b>> itDescendingIterator = this.observerMap.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<p, b> next = itDescendingIterator.next();
            p key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                j.a aVarA = j.a.INSTANCE.a(value.getState());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                m(aVarA.e());
                value.a(lifecycleOwner, aVarA);
                l();
            }
        }
    }

    private final j.b f(p observer) {
        b value;
        Map.Entry<p, b> entryL = this.observerMap.l(observer);
        j.b bVar = null;
        j.b state = (entryL == null || (value = entryL.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            ArrayList<j.b> arrayList = this.parentStates;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.b(companion.b(this.state, state), bVar);
    }

    private final void g(String methodName) {
        if (!this.enforceMainThread || v.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    private final void h(q lifecycleOwner) {
        g1<p, b>.d dVarG = this.observerMap.g();
        while (dVarG.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarG.next();
            p pVar = (p) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(pVar)) {
                m(bVar.getState());
                j.a aVarB = j.a.INSTANCE.b(bVar.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        j.b state = this.observerMap.e().getValue().getState();
        j.b state2 = this.observerMap.h().getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void k(j.b next) {
        if (this.state == next) {
            return;
        }
        t.a(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        o();
        this.handlingEvent = false;
        if (this.state == j.b.DESTROYED) {
            this.observerMap = new f1<>();
        }
    }

    private final void l() {
        ArrayList<j.b> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(j.b state) {
        this.parentStates.add(state);
    }

    private final void o() {
        q qVar = this.lifecycleOwner.get();
        if (qVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.newEventOccurred = false;
            if (this.state.compareTo(this.observerMap.e().getValue().getState()) < 0) {
                e(qVar);
            }
            Map.Entry<p, b> entryH = this.observerMap.h();
            if (!this.newEventOccurred && entryH != null && this.state.compareTo(entryH.getValue().getState()) > 0) {
                h(qVar);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    @Override // androidx.p016lifecycle.j
    public void a(p observer) {
        q qVar;
        g("addObserver");
        j.b bVar = this.state;
        j.b bVar2 = j.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = j.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.observerMap.j(observer, bVar3) == null && (qVar = this.lifecycleOwner.get()) != null) {
            boolean z15 = this.addingObserverCounter != 0 || this.handlingEvent;
            j.b bVarF = f(observer);
            this.addingObserverCounter++;
            while (bVar3.getState().compareTo(bVarF) < 0 && this.observerMap.contains(observer)) {
                m(bVar3.getState());
                j.a aVarB = j.a.INSTANCE.b(bVar3.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.a(qVar, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z15) {
                o();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.p016lifecycle.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public j.b getState() {
        return this.state;
    }

    @Override // androidx.p016lifecycle.j
    public void d(p observer) {
        g("removeObserver");
        this.observerMap.k(observer);
    }

    public void i(j.a event) {
        g("handleLifecycleEvent");
        k(event.e());
    }

    public void n(j.b bVar) {
        g("setCurrentState");
        k(bVar);
    }

    private s(q qVar, boolean z15) {
        this.enforceMainThread = z15;
        this.observerMap = new f1<>();
        j.b bVar = j.b.INITIALIZED;
        this.state = bVar;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(qVar);
        this._currentStateFlow = r0.a(bVar);
    }

    public s(q qVar) {
        this(qVar, true);
    }
}
