package vr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wt.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r1<Type extends wt.j> {
    public /* synthetic */ r1(fr.k kVar) {
        this();
    }

    public abstract boolean a(zs.f fVar);

    public final <Other extends wt.k> r1<Other> b(er.l<? super Type, ? extends Other> lVar) {
        if (this instanceof a0) {
            a0 a0Var = (a0) this;
            return new a0(a0Var.c(), lVar.b(a0Var.d()));
        }
        if (!(this instanceof j0)) {
            throw new oq.p();
        }
        List<oq.r<zs.f, Type>> listC = ((j0) this).c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            oq.r rVar = (oq.r) it.next();
            arrayList.add(oq.y.a((zs.f) rVar.a(), lVar.b((wt.j) rVar.b())));
        }
        return new j0(arrayList);
    }

    private r1() {
    }
}
