package k0;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import v.j0;
import v.n1;
import v.z1;

/* JADX INFO: loaded from: classes.dex */
public class p extends z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.a f107180c;

    p(j0 j0Var, g.a aVar) {
        super(j0Var);
        this.f107180c = aVar;
    }

    private int n(n1 n1Var) {
        Integer num = (Integer) n1Var.f().f(n1.f202708j, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int o(n1 n1Var) {
        Integer num = (Integer) n1Var.f().f(n1.f202707i, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // v.z1, v.j0
    public com.google.common.util.concurrent.q<List<Void>> e(final List<n1> list, int i15, int i16) {
        i6.i.b(list.size() == 1, "Only support one capture config.");
        final com.google.common.util.concurrent.q<u.m> qVarI = i(i15, 1);
        return a0.f.c(Collections.singletonList(a0.d.a(qVarI).f(new a0.a() { // from class: k0.m
            @Override // a0.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return ((u.m) qVarI.get()).a();
            }
        }, z.a.a()).f(new a0.a() { // from class: k0.n
            @Override // a0.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                p pVar = this.f107177a;
                List list2 = list;
                return pVar.f107180c.a(pVar.n((n1) list2.get(0)), pVar.o((n1) list2.get(0)));
            }
        }, z.a.a()).f(new a0.a() { // from class: k0.o
            @Override // a0.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return ((u.m) qVarI.get()).b();
            }
        }, z.a.a())));
    }
}
