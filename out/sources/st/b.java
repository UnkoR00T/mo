package st;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rt.n nVar) {
        super(nVar);
        if (nVar == null) {
            I(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    private static /* synthetic */ void I(int i15) {
        String str = (i15 == 1 || i15 == 3 || i15 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 1 || i15 == 3 || i15 == 4) ? 2 : 3];
        if (i15 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i15 == 2) {
            objArr[0] = "classifier";
        } else if (i15 == 3 || i15 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i15 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i15 == 3 || i15 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i15 != 1) {
            if (i15 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i15 != 3 && i15 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i15 != 1 && i15 != 3 && i15 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: J */
    public abstract vr.e c();

    @Override // st.w
    protected boolean g(vr.h hVar) {
        if (hVar == null) {
            I(2);
        }
        return (hVar instanceof vr.e) && e(c(), hVar);
    }

    @Override // st.x1
    public sr.j i() {
        sr.j jVarM = ht.e.m(c());
        if (jVarM == null) {
            I(1);
        }
        return jVarM;
    }

    @Override // st.q
    protected t0 s() {
        if (sr.j.v0(c())) {
            return null;
        }
        return i().i();
    }

    @Override // st.q
    protected Collection<t0> t(boolean z15) {
        vr.m mVarB = c().b();
        if (!(mVarB instanceof vr.e)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                I(3);
            }
            return list;
        }
        cu.j jVar = new cu.j();
        vr.e eVar = (vr.e) mVarB;
        jVar.add(eVar.t());
        vr.e eVarR0 = eVar.r0();
        if (z15 && eVarR0 != null) {
            jVar.add(eVarR0.t());
        }
        return jVar;
    }
}
