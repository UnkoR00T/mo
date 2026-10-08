package yr;

import st.p2;
import vr.h1;
import vr.k1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rt.n nVar, vr.m mVar, wr.h hVar, zs.f fVar, p2 p2Var, boolean z15, int i15, h1 h1Var, k1 k1Var) {
        super(nVar, mVar, hVar, fVar, p2Var, z15, i15, h1Var, k1Var);
        if (nVar == null) {
            m0(0);
        }
        if (mVar == null) {
            m0(1);
        }
        if (hVar == null) {
            m0(2);
        }
        if (fVar == null) {
            m0(3);
        }
        if (p2Var == null) {
            m0(4);
        }
        if (h1Var == null) {
            m0(5);
        }
        if (k1Var == null) {
            m0(6);
        }
    }

    private static /* synthetic */ void m0(int i15) {
        Object[] objArr = new Object[3];
        switch (i15) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // yr.m
    public String toString() {
        String str = "";
        String str2 = B() ? "reified " : "";
        if (q() != p2.INVARIANT) {
            str = q() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
