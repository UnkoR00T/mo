package dt;

import java.util.Collection;
import java.util.LinkedList;
import oq.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> b(Collection<? extends H> collection, er.l<? super H, ? extends vr.a> lVar) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        cu.k kVarA = cu.k.f37890c.a();
        while (!linkedList.isEmpty()) {
            Object objL0 = pq.v.l0(linkedList);
            cu.k kVarA2 = cu.k.f37890c.a();
            Collection<p001AuX.j> collectionP = o.p(objL0, linkedList, lVar, new q(kVarA2));
            if (collectionP.size() == 1 && kVarA2.isEmpty()) {
                kVarA.add(pq.v.O0(collectionP));
            } else {
                p001AuX.j jVar = (Object) o.L(collectionP, lVar);
                vr.a aVarB = lVar.b(jVar);
                for (p001AuX.j jVar2 : collectionP) {
                    if (!o.B(aVarB, lVar.b(jVar2))) {
                        kVarA2.add(jVar2);
                    }
                }
                if (!kVarA2.isEmpty()) {
                    kVarA.addAll(kVarA2);
                }
                kVarA.add(jVar);
            }
        }
        return kVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(cu.k kVar, Object obj) {
        kVar.add(obj);
        return i0.f148189a;
    }
}
