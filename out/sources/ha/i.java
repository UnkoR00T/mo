package ha;

import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mu.b0;
import mu.p0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0017\u0010\u0011J%\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ'\u0010#\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020(0+8\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002000+8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b2\u0010.R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u001c\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R\u001c\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0017\u0010:\u0012\u0004\b;\u0010\u0003R\u0018\u0010>\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00180?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010G¨\u0006M"}, d2 = {"Lha/i;", "", "<init>", "()V", "", "direction", "Lha/e;", "j", "(I)Lha/e;", "", "Lha/g;", "i", "()Ljava/util/List;", "Loq/i0;", "g", "handler", "l", "(Lha/e;)V", "Lha/c;", "dispatcher", "priority", "a", "(Lha/c;Lha/e;I)V", "h", "Lha/h;", "input", "b", "(Lha/c;Lha/h;I)V", "Lha/b;", "event", "f", "(Lha/h;ILha/b;)V", "e", "Lha/l;", "onBackCompletedFallback", "d", "(Lha/h;ILha/l;)V", "c", "(Lha/h;I)V", "Lmu/b0;", "Lha/j;", "Lmu/b0;", "_transitionState", "Lmu/p0;", "Lmu/p0;", "getTransitionState", "()Lmu/p0;", "transitionState", "Lha/f;", "_history", "getHistory", "history", "Lpq/m;", "Lpq/m;", "overlayHandlers", "defaultHandlers", "Lha/e;", "inProgressHandler", "I", "getInProgressDirection$annotations", "inProgressDirection", "Lha/h;", "inProgressInput", "", "Ljava/util/Set;", "unspecifiedInputs", "k", "defaultInputs", "overlayInputs", "", "m", "Z", "hasEnabledDefaultHandlers", "n", "hasEnabledOverlayHandlers", "o", "hasEnabledAnyHandlers", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<j> _transitionState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<j> transitionState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<NavigationEventHistory> _history;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<NavigationEventHistory> history;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final pq.m<e<?>> overlayHandlers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pq.m<e<?>> defaultHandlers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private e<?> inProgressHandler;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int inProgressDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private h inProgressInput;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Set<h> unspecifiedInputs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Set<h> defaultInputs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Set<h> overlayInputs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledDefaultHandlers;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledOverlayHandlers;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledAnyHandlers;

    public i() {
        b0<j> b0VarA = r0.a(j.b.f82266b);
        this._transitionState = b0VarA;
        this.transitionState = mu.i.b(b0VarA);
        b0<NavigationEventHistory> b0VarA2 = r0.a(new NavigationEventHistory());
        this._history = b0VarA2;
        this.history = mu.i.b(b0VarA2);
        this.overlayHandlers = new pq.m<>();
        this.defaultHandlers = new pq.m<>();
        this.unspecifiedInputs = new LinkedHashSet();
        this.defaultInputs = new LinkedHashSet();
        this.overlayInputs = new LinkedHashSet();
    }

    private final List<g> i() {
        ArrayList arrayList = new ArrayList();
        for (e<?> eVar : this.overlayHandlers) {
            if (eVar.n() && !eVar.i().isEmpty()) {
                arrayList.addAll(eVar.i());
            }
        }
        for (e<?> eVar2 : this.defaultHandlers) {
            if (eVar2.n() && !eVar2.i().isEmpty()) {
                arrayList.addAll(eVar2.i());
            }
        }
        return arrayList;
    }

    private final e<?> j(int direction) {
        e<?> next;
        e<?> next2;
        e<?> eVar;
        e<?> next3;
        e<?> eVar2 = null;
        if (direction == -1) {
            Iterator<e<?>> it = this.overlayHandlers.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.n());
            e<?> eVar3 = next;
            if (eVar3 != null) {
                return eVar3;
            }
            for (e<?> eVar4 : this.defaultHandlers) {
                if (eVar4.n()) {
                    eVar2 = eVar4;
                    break;
                }
            }
            return eVar2;
        }
        if (direction == 0) {
            Iterator<e<?>> it4 = this.overlayHandlers.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
                eVar = next2;
                if (eVar.n()) {
                    break;
                }
            } while (!eVar.o());
            e<?> eVar5 = next2;
            if (eVar5 != null) {
                return eVar5;
            }
            for (e<?> eVar6 : this.defaultHandlers) {
                e<?> eVar7 = eVar6;
                if (eVar7.n() || eVar7.o()) {
                    eVar2 = eVar6;
                    break;
                }
            }
            return eVar2;
        }
        if (direction != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + direction + "'.").toString());
        }
        Iterator<e<?>> it5 = this.overlayHandlers.iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!next3.o());
        e<?> eVar8 = next3;
        if (eVar8 != null) {
            return eVar8;
        }
        for (e<?> eVar9 : this.defaultHandlers) {
            if (eVar9.o()) {
                eVar2 = eVar9;
                break;
            }
        }
        return eVar2;
    }

    static /* synthetic */ e k(i iVar, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = 0;
        }
        return iVar.j(i15);
    }

    public final void a(c dispatcher, e<?> handler, int priority) {
        if (handler.getDispatcher() != null) {
            throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
        }
        if (priority == 0) {
            this.overlayHandlers.addFirst(handler);
        } else {
            if (priority != 1) {
                throw new IllegalArgumentException("Unsupported priority value: " + priority);
            }
            this.defaultHandlers.addFirst(handler);
        }
        handler.z(dispatcher);
        g();
    }

    public final void b(c dispatcher, h input, int priority) {
        Set<h> set;
        boolean z15;
        if (input.getDispatcher() != null) {
            throw new IllegalArgumentException(("Input '" + input + "' is already added to dispatcher " + input.getDispatcher() + '.').toString());
        }
        if (priority != 0) {
            set = priority != 1 ? this.unspecifiedInputs : this.defaultInputs;
        } else {
            set = this.overlayInputs;
        }
        set.add(input);
        input.l(dispatcher);
        input.e(dispatcher);
        input.g(this.history.getValue());
        if (priority != 0) {
            z15 = priority != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers;
        } else {
            z15 = this.hasEnabledOverlayHandlers;
        }
        input.f(z15);
    }

    public final void c(h input, int direction) {
        if (t.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVarJ = this.inProgressHandler;
            if (eVarJ == null) {
                eVarJ = j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.e();
                }
            } else if (eVarJ != null) {
                eVarJ.a();
            }
            this._transitionState.setValue(j.b.f82266b);
        }
    }

    public final void d(h input, int direction, l onBackCompletedFallback) {
        if (t.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVarJ = this.inProgressHandler;
            if (eVarJ == null) {
                eVarJ = j(direction);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.f();
                }
            } else if (eVarJ != null) {
                eVarJ.b();
            } else if (onBackCompletedFallback != null) {
                onBackCompletedFallback.a();
            }
            this._transitionState.setValue(j.b.f82266b);
        }
    }

    public final void e(h input, int direction, NavigationEvent event) {
        if (t.c(input, this.inProgressInput) && direction == this.inProgressDirection) {
            e<?> eVarJ = this.inProgressHandler;
            if (eVarJ == null) {
                eVarJ = j(direction);
            }
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.g(event);
                }
            } else if (eVarJ != null) {
                eVarJ.c(event);
            }
            this._transitionState.setValue(new j.InProgress(event, direction));
        }
    }

    public final void f(h input, int direction, NavigationEvent event) {
        if (this.inProgressDirection != 0) {
            return;
        }
        e<?> eVarJ = j(direction);
        this.inProgressHandler = eVarJ;
        this.inProgressDirection = direction;
        this.inProgressInput = input;
        if (event != null) {
            if (direction != -1) {
                if (direction == 1 && eVarJ != null) {
                    eVarJ.h(event);
                }
            } else if (eVarJ != null) {
                eVarJ.d(event);
            }
            this._transitionState.setValue(new j.InProgress(event, direction));
        }
    }

    public final void g() {
        boolean z15;
        boolean z16;
        pq.m<e<?>> mVar = this.overlayHandlers;
        if (mVar == null || !mVar.isEmpty()) {
            Iterator<e<?>> it = mVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    e<?> next = it.next();
                    if (next.n() || next.o()) {
                        z15 = true;
                    }
                } else {
                    z15 = false;
                }
            }
        } else {
            z15 = false;
        }
        pq.m<e<?>> mVar2 = this.defaultHandlers;
        if (mVar2 == null || !mVar2.isEmpty()) {
            Iterator<e<?>> it4 = mVar2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    e<?> next2 = it4.next();
                    if (next2.n() || next2.o()) {
                        z16 = true;
                    }
                } else {
                    z16 = false;
                }
            }
        } else {
            z16 = false;
        }
        boolean z17 = z15 || z16;
        boolean z18 = this.hasEnabledOverlayHandlers != z15;
        boolean z19 = this.hasEnabledDefaultHandlers != z16;
        boolean z25 = this.hasEnabledAnyHandlers != z17;
        if (z18) {
            Iterator<h> it5 = this.overlayInputs.iterator();
            while (it5.hasNext()) {
                it5.next().f(z15);
            }
        }
        if (z19) {
            Iterator<h> it6 = this.defaultInputs.iterator();
            while (it6.hasNext()) {
                it6.next().f(z16);
            }
        }
        if (z25) {
            Iterator<h> it7 = this.unspecifiedInputs.iterator();
            while (it7.hasNext()) {
                it7.next().f(z17);
            }
        }
        this.hasEnabledOverlayHandlers = z15;
        this.hasEnabledDefaultHandlers = z16;
        this.hasEnabledAnyHandlers = z17;
        e<?> eVarK = this.inProgressHandler;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        l(eVarK);
    }

    public final void h(e<?> handler) {
        if (t.c(handler, this.inProgressHandler)) {
            int i15 = this.inProgressDirection;
            if (i15 == -1) {
                handler.a();
            } else if (i15 == 1) {
                handler.e();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(handler);
        this.defaultHandlers.remove(handler);
        handler.z(null);
        g();
    }

    public final void l(e<?> handler) {
        NavigationEventHistory navigationEventHistory;
        e<?> eVarK = this.inProgressHandler;
        if (eVarK == null) {
            eVarK = k(this, 0, 1, null);
        }
        if (t.c(eVarK, handler)) {
            if (eVarK == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(eVarK.j(), i(), eVarK.l());
            }
            if (t.c(this._history.getValue(), navigationEventHistory)) {
                return;
            }
            this._history.setValue(navigationEventHistory);
            Iterator<h> it = this.overlayInputs.iterator();
            while (it.hasNext()) {
                it.next().g(navigationEventHistory);
            }
            Iterator<h> it4 = this.defaultInputs.iterator();
            while (it4.hasNext()) {
                it4.next().g(navigationEventHistory);
            }
            Iterator<h> it5 = this.unspecifiedInputs.iterator();
            while (it5.hasNext()) {
                it5.next().g(navigationEventHistory);
            }
        }
    }
}
