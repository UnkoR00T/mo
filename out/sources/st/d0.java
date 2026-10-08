package st;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class d0 {
    private static /* synthetic */ void a(int i15) {
        String str = i15 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i15 != 4 ? 3 : 2];
        switch (i15) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i15 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i15 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i15 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static i2 b(List<vr.m1> list, g2 g2Var, vr.m mVar, List<vr.m1> list2) {
        if (list == null) {
            a(0);
        }
        if (g2Var == null) {
            a(1);
        }
        if (mVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        i2 i2VarC = c(list, g2Var, mVar, list2, null);
        if (i2VarC != null) {
            return i2VarC;
        }
        throw new AssertionError("Substitution failed");
    }

    public static i2 c(List<vr.m1> list, g2 g2Var, vr.m mVar, List<vr.m1> list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (g2Var == null) {
            a(6);
        }
        if (mVar == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i15 = 0;
        for (vr.m1 m1Var : list) {
            yr.t0 t0VarW0 = yr.t0.W0(mVar, m1Var.getAnnotations(), m1Var.B(), m1Var.q(), m1Var.getName(), i15, vr.h1.f208052a, m1Var.P());
            map.put(m1Var.o(), new f2(t0VarW0.t()));
            map2.put(m1Var, t0VarW0);
            list2.add(t0VarW0);
            i15++;
        }
        y1 y1VarJ = y1.j(map);
        i2 i2VarI = i2.i(g2Var, y1VarJ);
        i2 i2VarI2 = i2.i(g2Var.h(), y1VarJ);
        for (vr.m1 m1Var2 : list) {
            yr.t0 t0Var = (yr.t0) map2.get(m1Var2);
            for (t0 t0Var2 : m1Var2.getUpperBounds()) {
                vr.h hVarC = t0Var2.T0().c();
                t0 t0VarQ = (((hVarC instanceof vr.m1) && xt.d.p((vr.m1) hVarC)) ? i2VarI : i2VarI2).q(t0Var2, p2.OUT_VARIANCE);
                if (t0VarQ == null) {
                    return null;
                }
                if (t0VarQ != t0Var2 && zArr != null) {
                    zArr[0] = true;
                }
                t0Var.S0(t0VarQ);
            }
            t0Var.b1();
        }
        return i2VarI;
    }
}
