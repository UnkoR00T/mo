package or;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import mr.g;
import mr.l;
import p071kotlin.Metadata;
import pr.c0;
import pr.y3;
import qr.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lmr/b;", "", "value", "a", "(Lmr/b;)Z", "b", "(Lmr/b;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final boolean a(mr.b<?> bVar) {
        h<?> hVarW;
        if (bVar instanceof mr.h) {
            l lVar = (l) bVar;
            Field fieldB = d.b(lVar);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = d.c(lVar);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = d.e((mr.h) bVar);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (bVar instanceof l) {
            l lVar2 = (l) bVar;
            Field fieldB2 = d.b(lVar2);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = d.c(lVar2);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (bVar instanceof l.b) {
            Field fieldB3 = d.b(((l.b) bVar).e0());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = d.d((g) bVar);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (bVar instanceof mr.h.a) {
            Field fieldB4 = d.b(((mr.h.a) bVar).e0());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = d.d((g) bVar);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(bVar instanceof g)) {
            throw new UnsupportedOperationException("Unknown callable: " + bVar + " (" + bVar.getClass() + ')');
        }
        g gVar = (g) bVar;
        Method methodD3 = d.d(gVar);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            c0<?> c0VarB = y3.b(bVar);
            Member memberB = (c0VarB == null || (hVarW = c0VarB.W()) == null) ? null : hVarW.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = d.a(gVar);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(mr.b<?> bVar, boolean z15) {
        h<?> hVarW;
        if (bVar instanceof mr.h) {
            l lVar = (l) bVar;
            Field fieldB = d.b(lVar);
            if (fieldB != null) {
                fieldB.setAccessible(z15);
            }
            Method methodC = d.c(lVar);
            if (methodC != null) {
                methodC.setAccessible(z15);
            }
            Method methodE = d.e((mr.h) bVar);
            if (methodE != null) {
                methodE.setAccessible(z15);
                return;
            }
            return;
        }
        if (bVar instanceof l) {
            l lVar2 = (l) bVar;
            Field fieldB2 = d.b(lVar2);
            if (fieldB2 != null) {
                fieldB2.setAccessible(z15);
            }
            Method methodC2 = d.c(lVar2);
            if (methodC2 != null) {
                methodC2.setAccessible(z15);
                return;
            }
            return;
        }
        if (bVar instanceof l.b) {
            Field fieldB3 = d.b(((l.b) bVar).e0());
            if (fieldB3 != null) {
                fieldB3.setAccessible(z15);
            }
            Method methodD = d.d((g) bVar);
            if (methodD != null) {
                methodD.setAccessible(z15);
                return;
            }
            return;
        }
        if (bVar instanceof mr.h.a) {
            Field fieldB4 = d.b(((mr.h.a) bVar).e0());
            if (fieldB4 != null) {
                fieldB4.setAccessible(z15);
            }
            Method methodD2 = d.d((g) bVar);
            if (methodD2 != null) {
                methodD2.setAccessible(z15);
                return;
            }
            return;
        }
        if (!(bVar instanceof g)) {
            throw new UnsupportedOperationException("Unknown callable: " + bVar + " (" + bVar.getClass() + ')');
        }
        g gVar = (g) bVar;
        Method methodD3 = d.d(gVar);
        if (methodD3 != null) {
            methodD3.setAccessible(z15);
        }
        c0<?> c0VarB = y3.b(bVar);
        Member memberB = (c0VarB == null || (hVarW = c0VarB.W()) == null) ? null : hVarW.b();
        AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor constructorA = d.a(gVar);
        if (constructorA != null) {
            constructorA.setAccessible(z15);
        }
    }
}
