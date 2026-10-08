package ou;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.t0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00060\u0000j\u0002`\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b \u0010\u0010J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004R\u0011\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000,8\u0002X\u0082\u0004R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040,8\u0002X\u0082\u0004¨\u00060"}, d2 = {"Lou/p;", "", "<init>", "()V", "Lou/y;", "u", "()Lou/y;", "Lkotlinx/coroutines/internal/Node;", "current", "i", "(Lou/p;)Lou/p;", "next", "Loq/i0;", "k", "(Lou/p;)V", "g", "()Lou/p;", "node", "", "e", "(Lou/p;)Z", "", "permissionsBitmask", "c", "(Lou/p;I)Z", "forbiddenElementsBit", "f", "(I)V", "d", "(Lou/p;Lou/p;)Z", "s", "()Z", "t", "", "toString", "()Ljava/lang/String;", "r", "isRemoved", "l", "()Ljava/lang/Object;", "m", "nextNode", "n", "prevNode", "Liu/e;", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f150062a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f150063b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f150064c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    private final p g() {
        p pVar;
        Object obj;
        while (true) {
            p pVar2 = (p) f150063b.get(this);
            pVar = pVar2;
            while (true) {
                p pVar3 = null;
                while (true) {
                    obj = f150062a.get(pVar);
                    if (obj == this) {
                        if (pVar2 != pVar && !androidx.concurrent.futures.b.a(f150063b, this, pVar2, pVar)) {
                            break;
                        }
                        break;
                    }
                    if (r()) {
                        return null;
                    }
                    if (!(obj instanceof y)) {
                        pVar3 = pVar;
                        pVar = (p) obj;
                    } else {
                        if (pVar3 != null) {
                            break;
                        }
                        pVar = (p) f150063b.get(pVar);
                    }
                }
                if (!androidx.concurrent.futures.b.a(f150062a, pVar3, pVar, ((y) obj).ref)) {
                    break;
                }
                pVar = pVar3;
            }
        }
        return pVar;
    }

    private final p i(p current) {
        while (current.r()) {
            current = (p) f150063b.get(current);
        }
        return current;
    }

    private final void k(p next) {
        p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f150063b;
        do {
            pVar = (p) atomicReferenceFieldUpdater.get(next);
            if (l() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f150063b, next, pVar, this));
        if (r()) {
            next.g();
        }
    }

    private final y u() {
        y yVar = (y) f150064c.get(this);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        f150064c.set(this, yVar2);
        return yVar2;
    }

    public final boolean c(p node, int permissionsBitmask) {
        p pVarN;
        do {
            pVarN = n();
            if (pVarN instanceof n) {
                return (((n) pVarN).forbiddenElementsBitmask & permissionsBitmask) == 0 && pVarN.c(node, permissionsBitmask);
            }
        } while (!pVarN.d(node, this));
        return true;
    }

    public final boolean d(p node, p next) {
        f150063b.set(node, this);
        f150062a.set(node, next);
        if (!androidx.concurrent.futures.b.a(f150062a, this, next, node)) {
            return false;
        }
        node.k(next);
        return true;
    }

    public final boolean e(p node) {
        f150063b.set(node, this);
        f150062a.set(node, this);
        while (l() == this) {
            if (androidx.concurrent.futures.b.a(f150062a, this, this, node)) {
                node.k(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int forbiddenElementsBit) {
        c(new n(forbiddenElementsBit), forbiddenElementsBit);
    }

    public final Object l() {
        return f150062a.get(this);
    }

    public final p m() {
        p pVar;
        Object objL = l();
        y yVar = objL instanceof y ? (y) objL : null;
        return (yVar == null || (pVar = yVar.ref) == null) ? (p) objL : pVar;
    }

    public final p n() {
        p pVarG = g();
        return pVarG == null ? i((p) f150063b.get(this)) : pVarG;
    }

    public boolean r() {
        return l() instanceof y;
    }

    public boolean s() {
        return t() == null;
    }

    public final p t() {
        Object objL;
        p pVar;
        do {
            objL = l();
            if (objL instanceof y) {
                return ((y) objL).ref;
            }
            if (objL == this) {
                return (p) objL;
            }
            pVar = (p) objL;
        } while (!androidx.concurrent.futures.b.a(f150062a, this, objL, pVar.u()));
        pVar.g();
        return null;
    }

    public String toString() {
        return new fr.f0(this) { // from class: ou.p.a
            @Override // mr.m
            public Object get() {
                return t0.a(this.f66391b);
            }
        } + '@' + t0.b(this);
    }
}
