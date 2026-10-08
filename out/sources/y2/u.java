package y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.e6;
import p076m2.f4;
import p076m2.j2;
import p076m2.k1;
import p076m2.u4;
import p076m2.v4;
import r0.g1;
import r0.h1;
import r0.i1;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u0003J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\b(\u0010\u001fJ\u001b\u0010+\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0007¢\u0006\u0004\b/\u0010\u0003J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\u0003R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00101R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u0005058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00106R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00103R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00103R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00106R$\u0010?\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020=\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010>R$\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010C¨\u0006E"}, d2 = {"Ly2/u;", "Lo2/e;", "<init>", "()V", "Ln2/c;", "Lm2/v4;", "list", "Loq/i0;", "l", "(Ln2/c;)V", "", "instance", "s", "(Ljava/lang/Object;)V", "", "Lm2/u4;", "abandoning", "Le3/i;", "traceContext", "r", "(Ljava/util/Set;Le3/i;)V", "i", "b", "(Lm2/v4;)V", "c", "Lkotlin/Function0;", "effect", "g", "(Ler/a;)V", "Lm2/n;", "e", "(Lm2/n;)V", "a", "Lm2/f4;", "scope", "d", "(Lm2/f4;)V", "h", "f", "m", "k", "Lr0/h1;", "ignoreSet", "q", "(Lr0/h1;)V", "o", "()Lr0/h1;", "n", "j", "Ljava/util/Set;", "Le3/i;", "Ln2/c;", "remembering", "Lr0/u0;", "Lr0/u0;", "rememberSet", "currentRememberingList", "leaving", "sideEffects", "releasing", "Lr0/t0;", "Ly2/p;", "Lr0/t0;", "pausedPlaceholders", "Lm2/e6;", "Ljava/util/ArrayList;", "nestedRemembersLists", "Lr0/h1;", "ignoreLeavingSet", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements o2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Set<u4> abandoning;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e3.i traceContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n2.c<v4> remembering;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private u0<v4> rememberSet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private n2.c<v4> currentRememberingList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n2.c<Object> leaving;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n2.c<er.a<i0>> sideEffects;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private u0<p076m2.n> releasing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private t0<f4, p> pausedPlaceholders;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ArrayList<n2.c<v4>> nestedRemembersLists;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private h1<v4> ignoreLeavingSet;

    public u() {
        n2.c<v4> cVar = new n2.c<>(new v4[16], 0);
        this.remembering = cVar;
        this.rememberSet = i1.b();
        this.currentRememberingList = cVar;
        this.leaving = new n2.c<>(new Object[16], 0);
        this.sideEffects = new n2.c<>(new er.a[16], 0);
    }

    private final void l(n2.c<v4> list) {
        Set<u4> set = this.abandoning;
        if (set == null) {
            return;
        }
        v4[] v4VarArr = list.content;
        int size = list.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            v4 v4Var = v4VarArr[i15];
            u4 wrapped = v4Var.getWrapped();
            set.remove(wrapped);
            try {
                wrapped.c();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                e3.i iVar = this.traceContext;
                if (iVar != null) {
                    iVar.a(th4, v4Var);
                }
                throw th4;
            }
        }
    }

    private static final boolean p(v4 v4Var, n2.c<v4> cVar) {
        v4[] v4VarArr = cVar.content;
        int size = cVar.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            u4 wrapped = v4VarArr[i15].getWrapped();
            if (wrapped instanceof p) {
                n2.c<v4> cVarA = ((p) wrapped).a();
                if (cVarA.t(v4Var) || p(v4Var, cVarA)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void s(Object instance) {
        this.leaving.d(instance);
    }

    @Override // o2.e
    public void a(p076m2.n instance) {
        u0<p076m2.n> u0VarB = this.releasing;
        if (u0VarB == null) {
            u0VarB = i1.b();
            this.releasing = u0VarB;
        }
        u0VarB.x(instance);
        s(instance);
    }

    @Override // o2.e
    public void b(v4 instance) {
        this.currentRememberingList.d(instance);
        this.rememberSet.i(instance);
    }

    @Override // o2.e
    public void c(v4 instance) {
        if (!this.rememberSet.a(instance)) {
            h1<v4> h1Var = this.ignoreLeavingSet;
            if (h1Var == null || !h1Var.a(instance)) {
                s(instance);
                return;
            }
            return;
        }
        this.rememberSet.z(instance);
        if (!this.currentRememberingList.t(instance) && !this.remembering.t(instance)) {
            p(instance, this.remembering);
        }
        Set<u4> set = this.abandoning;
        if (set == null) {
            return;
        }
        set.add(instance.getWrapped());
    }

    @Override // o2.e
    public void d(f4 scope) {
        Set<u4> set = this.abandoning;
        if (set == null) {
            return;
        }
        p pVar = new p(set);
        t0<f4, p> t0VarC = this.pausedPlaceholders;
        if (t0VarC == null) {
            t0VarC = g1.c();
            this.pausedPlaceholders = t0VarC;
        }
        t0VarC.x(scope, pVar);
        this.currentRememberingList.d(p076m2.q.isLinkBufferComposerEnabled ? new j2(pVar, r2.j.e()) : new k1(pVar, -1));
    }

    @Override // o2.e
    public void e(p076m2.n instance) {
        s(instance);
    }

    @Override // o2.e
    public void f(f4 scope) {
        n2.c<v4> cVar;
        t0<f4, p> t0Var = this.pausedPlaceholders;
        if (t0Var == null || t0Var.e(scope) == null) {
            return;
        }
        ArrayList<n2.c<v4>> arrayList = this.nestedRemembersLists;
        if (arrayList != null && (cVar = (n2.c) e6.i(arrayList)) != null) {
            this.currentRememberingList = cVar;
        }
        t0Var.u(scope);
    }

    @Override // o2.e
    public void g(er.a<i0> effect) {
        this.sideEffects.d(effect);
    }

    @Override // o2.e
    public void h(f4 scope) {
        t0<f4, p> t0Var = this.pausedPlaceholders;
        p pVarE = t0Var != null ? t0Var.e(scope) : null;
        if (pVarE != null) {
            ArrayList<n2.c<v4>> arrayListC = this.nestedRemembersLists;
            if (arrayListC == null) {
                arrayListC = e6.c(null, 1, null);
                this.nestedRemembersLists = arrayListC;
            }
            e6.j(arrayListC, this.currentRememberingList);
            this.currentRememberingList = pVarE.a();
        }
    }

    public final void i() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.j();
        this.rememberSet.n();
        this.currentRememberingList = this.remembering;
        this.leaving.j();
        this.sideEffects.j();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    public final void j() {
        Set<u4> set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objA = b0.f223360a.a("Compose:abandons");
        try {
            Iterator<u4> it = set.iterator();
            while (it.hasNext()) {
                u4 next = it.next();
                it.remove();
                next.d();
            }
            i0 i0Var = i0.f148189a;
        } finally {
            b0.f223360a.b(objA);
        }
    }

    public final void k(p076m2.n instance) {
        if (this.leaving.t(instance)) {
            instance.i();
        }
    }

    public final void m() {
        Set<u4> set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            Object objA = b0.f223360a.a("Compose:onForgotten");
            try {
                u0<p076m2.n> u0Var = this.releasing;
                int size = this.leaving.getSize();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = this.leaving.content[size];
                    try {
                        if (obj instanceof v4) {
                            u4 wrapped = ((v4) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.e();
                        }
                        if (obj instanceof p076m2.n) {
                            if (u0Var == null || !u0Var.a((p076m2.n) obj)) {
                                ((p076m2.n) obj).i();
                            } else {
                                ((p076m2.n) obj).a();
                            }
                        }
                        i0 i0Var = i0.f148189a;
                    } catch (Throwable th4) {
                        e3.i iVar = this.traceContext;
                        if (iVar != null) {
                            iVar.a(th4, obj);
                        }
                        throw th4;
                    }
                }
                i0 i0Var2 = i0.f148189a;
                b0.f223360a.b(objA);
            } catch (Throwable th5) {
                b0.f223360a.b(objA);
                throw th5;
            }
        }
        if (this.remembering.getSize() != 0) {
            Object objA2 = b0.f223360a.a("Compose:onRemembered");
            try {
                l(this.remembering);
                i0 i0Var3 = i0.f148189a;
            } finally {
                b0.f223360a.b(objA2);
            }
        }
    }

    public final void n() {
        if (this.sideEffects.getSize() != 0) {
            Object objA = b0.f223360a.a("Compose:sideeffects");
            try {
                n2.c<er.a<i0>> cVar = this.sideEffects;
                er.a<i0>[] aVarArr = cVar.content;
                int size = cVar.getSize();
                for (int i15 = 0; i15 < size; i15++) {
                    aVarArr[i15].a();
                }
                this.sideEffects.j();
                i0 i0Var = i0.f148189a;
            } finally {
                b0.f223360a.b(objA);
            }
        }
    }

    public final h1<v4> o() {
        if (!this.rememberSet.f()) {
            return null;
        }
        u0<v4> u0Var = this.rememberSet;
        this.rememberSet = i1.b();
        this.remembering.j();
        return u0Var;
    }

    public final void q(h1<v4> ignoreSet) {
        this.ignoreLeavingSet = ignoreSet;
    }

    public final void r(Set<u4> abandoning, e3.i traceContext) {
        i();
        this.abandoning = abandoning;
        this.traceContext = traceContext;
    }
}
