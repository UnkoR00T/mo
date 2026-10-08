package or;

import fr.q0;
import java.util.Iterator;
import java.util.List;
import mr.p;
import mr.q;
import p071kotlin.Metadata;
import pq.v;
import pr.f0;
import pr.i3;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmr/p;", "Lmr/c;", "b", "(Lmr/p;)Lmr/c;", "getJvmErasure$annotations", "(Lmr/p;)V", "jvmErasure", "Lmr/e;", "a", "(Lmr/e;)Lmr/c;", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final mr.c<?> a(mr.e eVar) {
        Object obj;
        mr.c<?> cVarB;
        if (eVar instanceof mr.c) {
            return (mr.c) eVar;
        }
        if (!(eVar instanceof q)) {
            throw new i3("Cannot calculate JVM erasure for type: " + eVar);
        }
        List<p> upperBounds = ((q) eVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            mr.e eVarD = ((p) next).getClassifier();
            f0 f0Var = eVarD instanceof f0 ? (f0) eVarD : null;
            if (f0Var != null && f0Var.T() != es.b.INTERFACE && f0Var.T() != es.b.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        p pVar = (p) obj;
        if (pVar == null) {
            pVar = (p) v.n0(upperBounds);
        }
        return (pVar == null || (cVarB = b(pVar)) == null) ? q0.c(Object.class) : cVarB;
    }

    public static final mr.c<?> b(p pVar) {
        mr.c<?> cVarA;
        mr.e eVarD = pVar.getClassifier();
        if (eVarD != null && (cVarA = a(eVarD)) != null) {
            return cVarA;
        }
        throw new i3("Cannot calculate JVM erasure for type: " + pVar);
    }
}
