package pr;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lpr/q2$a;", "", "isGetter", "Lqr/h;", "b", "(Lpr/q2$a;Z)Lqr/h;", "Lvr/z0;", "g", "(Lvr/z0;)Z", "", "f", "(Lpr/q2$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public static final qr.h<?> b(q2.a<?, ?> aVar, boolean z15) {
        n.e eVarC;
        Method methodC;
        qr.h aVar2;
        xs.a.c cVarG;
        qr.h cVar;
        Method methodM;
        if (g1.INSTANCE.a().f(aVar.e0().getSignature())) {
            return qr.l.f168184a;
        }
        p pVarF = u3.f161976a.f(aVar.e0().d0());
        if (pVarF instanceof p.c) {
            p.c cVar2 = (p.c) pVarF;
            xs.a.d dVarF = cVar2.getSignature();
            if (z15) {
                if (dVarF.K()) {
                    cVarG = dVarF.F();
                } else {
                    cVarG = null;
                }
            } else if (dVarF.L()) {
                cVarG = dVarF.G();
            } else {
                cVarG = null;
            }
            Method methodM2 = cVarG != null ? aVar.e0().getContainer().m(cVar2.getNameResolver().getString(cVarG.B()), cVar2.getNameResolver().getString(cVarG.A())) : null;
            if (methodM2 != null) {
                if (!Modifier.isStatic(methodM2.getModifiers())) {
                    cVar = aVar.b0() ? new qr.i.h.a(methodM2, f(aVar)) : new qr.i.h.e(methodM2);
                } else if (d(aVar)) {
                    cVar = aVar.b0() ? new qr.i.h.b(methodM2) : new qr.i.h.f(methodM2);
                } else {
                    cVar = aVar.b0() ? new qr.i.h.c(methodM2, false, f(aVar)) : new qr.i.h.g(methodM2);
                }
                aVar2 = cVar;
            } else if (dt.k.e(aVar.e0().d0()) && fr.t.c(aVar.e0().d0().h(), vr.t.f208079d)) {
                Class<?> clsT = qr.o.t(aVar.e0().d0().b());
                if (clsT == null || (methodM = qr.o.m(clsT, aVar.e0().d0())) == null) {
                    throw new i3("Underlying property of inline class " + aVar.e0() + " should have a field");
                }
                aVar2 = aVar.b0() ? new qr.k.a(methodM, f(aVar)) : new qr.k.b(methodM);
            } else {
                Field fieldM0 = aVar.e0().m0();
                if (fieldM0 == null) {
                    throw new i3("No accessors or field is found for property " + aVar.e0());
                }
                aVar2 = c(aVar, z15, fieldM0);
            }
        } else if (pVarF instanceof p.a) {
            aVar2 = c(aVar, z15, ((p.a) pVarF).getField());
        } else {
            if (!(pVarF instanceof p.b)) {
                if (!(pVarF instanceof p.d)) {
                    throw new oq.p();
                }
                if (z15) {
                    eVarC = ((p.d) pVarF).getGetterSignature();
                } else {
                    eVarC = ((p.d) pVarF).getSetterSignature();
                    if (eVarC == null) {
                        throw new i3("No setter found for property " + aVar.e0());
                    }
                }
                Method methodM3 = aVar.e0().getContainer().m(eVarC.c(), eVarC.b());
                if (methodM3 != null) {
                    Modifier.isStatic(methodM3.getModifiers());
                    return aVar.b0() ? new qr.i.h.a(methodM3, f(aVar)) : new qr.i.h.e(methodM3);
                }
                throw new i3("No accessor found for property " + aVar.e0());
            }
            if (z15) {
                methodC = ((p.b) pVarF).getGetterMethod();
            } else {
                p.b bVar = (p.b) pVarF;
                methodC = bVar.getSetterMethod();
                if (methodC == null) {
                    throw new i3("No source found for setter of Java method property: " + bVar.getGetterMethod());
                }
            }
            aVar2 = aVar.b0() ? new qr.i.h.a(methodC, f(aVar)) : new qr.i.h.e(methodC);
        }
        return qr.o.j(aVar2, aVar.d0(), false, 2, null);
    }

    private static final qr.i<Field> c(q2.a<?, ?> aVar, boolean z15, Field field) {
        if (g(aVar.e0().d0()) || !Modifier.isStatic(field.getModifiers())) {
            if (z15) {
                return aVar.b0() ? new qr.i.f.a(field, f(aVar)) : new qr.i.f.c(field);
            }
            return aVar.b0() ? new qr.i.g.a(field, e(aVar), f(aVar)) : new qr.i.g.c(field, e(aVar));
        }
        if (!d(aVar)) {
            return z15 ? new qr.i.f.e(field) : new qr.i.g.e(field, e(aVar));
        }
        if (z15) {
            return aVar.b0() ? new qr.i.f.b(field) : new qr.i.f.d(field);
        }
        return aVar.b0() ? new qr.i.g.b(field, e(aVar)) : new qr.i.g.d(field, e(aVar));
    }

    private static final boolean d(q2.a<?, ?> aVar) {
        return aVar.e0().d0().getAnnotations().d2(y3.j());
    }

    private static final boolean e(q2.a<?, ?> aVar) {
        return !st.l2.l(aVar.e0().d0().getType());
    }

    public static final Object f(q2.a<?, ?> aVar) {
        return aVar.e0().i0();
    }

    private static final boolean g(vr.z0 z0Var) {
        vr.m mVarB = z0Var.b();
        if (!dt.i.x(mVarB)) {
            return false;
        }
        vr.m mVarB2 = mVarB.b();
        if (dt.i.C(mVarB2) || dt.i.t(mVarB2)) {
            return (z0Var instanceof qt.n0) && ys.h.f(((qt.n0) z0Var).k0());
        }
        return true;
    }
}
