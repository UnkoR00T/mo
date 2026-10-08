package p136y9;

import android.os.Bundle;
import ba.c0;
import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import mu.b0;
import mu.i;
import mu.p0;
import mu.r0;
import oq.i0;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R*\u0010-\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R#\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0.8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b$\u00100R#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0.8\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b'\u00100¨\u00063"}, d2 = {"Ly9/u1;", "", "<init>", "()V", "Ly9/w;", "backStackEntry", "Loq/i0;", "k", "(Ly9/w;)V", "l", "Ly9/y0;", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "b", "(Ly9/y0;Landroid/os/Bundle;)Ly9/w;", "popUpTo", "", "saveState", "h", "(Ly9/w;Z)V", "i", "g", "entry", "f", "j", "Lba/c0;", "a", "Lba/c0;", "backStackLock", "Lmu/b0;", "", "Lmu/b0;", "_backStack", "", "c", "_transitionsInProgress", "value", "d", "Z", "e", "()Z", "m", "(Z)V", "isNavigating", "Lmu/p0;", "Lmu/p0;", "()Lmu/p0;", "backStack", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 backStackLock = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0<List<w>> _backStack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<Set<w>> _transitionsInProgress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isNavigating;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<List<w>> backStack;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<Set<w>> transitionsInProgress;

    public u1() {
        b0<List<w>> b0VarA = r0.a(v.n());
        this._backStack = b0VarA;
        b0<Set<w>> b0VarA2 = r0.a(e1.e());
        this._transitionsInProgress = b0VarA2;
        this.backStack = i.b(b0VarA);
        this.transitionsInProgress = i.b(b0VarA2);
    }

    public abstract w b(y0 destination, Bundle arguments);

    public final p0<List<w>> c() {
        return this.backStack;
    }

    public final p0<Set<w>> d() {
        return this.transitionsInProgress;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void f(w entry) {
        b0<Set<w>> b0Var = this._transitionsInProgress;
        b0Var.setValue(e1.k(b0Var.getValue(), entry));
    }

    public void g(w backStackEntry) {
        int iNextIndex;
        synchronized (this.backStackLock) {
            try {
                List listI1 = v.i1(c().getValue());
                ListIterator listIterator = listI1.listIterator(listI1.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (t.c(((w) listIterator.previous()).getId(), backStackEntry.getId())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                listI1.set(iNextIndex, backStackEntry);
                this._backStack.setValue(listI1);
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void h(w popUpTo, boolean saveState) {
        synchronized (this.backStackLock) {
            try {
                b0 b0Var = this._backStack;
                Iterable iterable = (Iterable) this._backStack.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (t.c((w) obj, popUpTo)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                b0Var.setValue(arrayList);
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void i(w popUpTo, boolean saveState) {
        w wVarPrevious;
        Set<w> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((w) it.next()) == popUpTo) {
                    List<w> value2 = this.backStack.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it4 = value2.iterator();
                    while (it4.hasNext()) {
                        if (((w) it4.next()) == popUpTo) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        b0<Set<w>> b0Var = this._transitionsInProgress;
        b0Var.setValue(e1.m(b0Var.getValue(), popUpTo));
        List<w> value3 = this.backStack.getValue();
        ListIterator<w> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                wVarPrevious = null;
                break;
            }
            wVarPrevious = listIterator.previous();
            w wVar = wVarPrevious;
            if (!t.c(wVar, popUpTo) && this.backStack.getValue().lastIndexOf(wVar) < this.backStack.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        w wVar2 = wVarPrevious;
        if (wVar2 != null) {
            b0<Set<w>> b0Var2 = this._transitionsInProgress;
            b0Var2.setValue(e1.m(b0Var2.getValue(), wVar2));
        }
        h(popUpTo, saveState);
    }

    public void j(w entry) {
        b0<Set<w>> b0Var = this._transitionsInProgress;
        b0Var.setValue(e1.m(b0Var.getValue(), entry));
    }

    public void k(w backStackEntry) {
        synchronized (this.backStackLock) {
            this._backStack.setValue(v.M0((Collection) this._backStack.getValue(), backStackEntry));
            i0 i0Var = i0.f148189a;
        }
    }

    public void l(w backStackEntry) {
        Set<w> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((w) it.next()) == backStackEntry) {
                    List<w> value2 = this.backStack.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it4 = value2.iterator();
                        while (it4.hasNext()) {
                            if (((w) it4.next()) == backStackEntry) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        w wVar = (w) v.z0(this.backStack.getValue());
        if (wVar != null) {
            b0<Set<w>> b0Var = this._transitionsInProgress;
            b0Var.setValue(e1.m(b0Var.getValue(), wVar));
        }
        b0<Set<w>> b0Var2 = this._transitionsInProgress;
        b0Var2.setValue(e1.m(b0Var2.getValue(), backStackEntry));
        k(backStackEntry);
    }

    public final void m(boolean z15) {
        this.isNavigating = z15;
    }
}
