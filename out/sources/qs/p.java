package qs;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    private static final boolean a(r rVar) {
        zs.c cVarG;
        b0 b0Var = (b0) pq.v.R0(rVar.l());
        x type = b0Var != null ? b0Var.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i iVarD = jVar.d();
        return (iVarD instanceof g) && (cVarG = ((g) iVarD).g()) != null && fr.t.c(cVarG.a(), "java.lang.Object");
    }

    private static final boolean b(r rVar) {
        String strE = rVar.getName().e();
        int iHashCode = strE.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strE.equals("equals")) {
                    return a(rVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strE.equals("hashCode")) {
                return false;
            }
        } else if (!strE.equals("toString")) {
            return false;
        }
        return rVar.l().isEmpty();
    }

    public static final boolean c(q qVar) {
        return qVar.S().N() && (qVar instanceof r) && b((r) qVar);
    }
}
