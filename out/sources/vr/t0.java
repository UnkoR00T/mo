package vr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {
    public static final void a(p0 p0Var, zs.c cVar, Collection<o0> collection) {
        if (p0Var instanceof u0) {
            ((u0) p0Var).c(cVar, collection);
        } else {
            collection.addAll(p0Var.a(cVar));
        }
    }

    public static final boolean b(p0 p0Var, zs.c cVar) {
        return p0Var instanceof u0 ? ((u0) p0Var).b(cVar) : c(p0Var, cVar).isEmpty();
    }

    public static final List<o0> c(p0 p0Var, zs.c cVar) {
        ArrayList arrayList = new ArrayList();
        a(p0Var, cVar, arrayList);
        return arrayList;
    }
}
