package qr;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oq.r;
import p071kotlin.Metadata;
import pq.v;
import pr.i3;
import pr.y3;
import st.e1;
import st.h2;
import st.l2;
import st.t0;
import vr.c1;
import vr.t1;
import vr.u1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0011*\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010'\u001a\u0019\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010/\u001a\u0004\u0018\u00010.*\u0004\u0018\u00010.2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u00100\"\u001a\u00103\u001a\u0004\u0018\u00010\u001b*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lvr/h;", "", "u", "(Lvr/h;)Ljava/lang/String;", "Lst/e1;", "type", "Lvr/b;", "descriptor", "", "Ljava/lang/reflect/Method;", "p", "(Lst/e1;Lvr/b;)Ljava/util/List;", "n", "(Lst/e1;)Ljava/util/List;", "Lqr/h;", "", "expectedArgsSize", "", "isDefault", "Loq/i0;", "g", "(Lqr/h;ILvr/b;Z)V", "Ljava/lang/reflect/Member;", "member", "Lkotlin/Function1;", "Lvr/e;", "isSpecificClass", "Lst/t0;", "r", "(Lvr/b;Ljava/lang/reflect/Member;Ler/l;)Ljava/util/List;", "a", "(Ljava/lang/reflect/Member;)Z", "M", "i", "(Lqr/h;Lvr/b;Z)Lqr/h;", "q", "(Lvr/b;)Z", "Ljava/lang/Class;", "m", "(Ljava/lang/Class;Lvr/b;)Ljava/lang/reflect/Method;", "k", "s", "(Lst/t0;)Ljava/lang/Class;", "Lvr/m;", "t", "(Lvr/m;)Ljava/lang/Class;", "", "h", "(Ljava/lang/Object;Lvr/b;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    private static final boolean a(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !dr.a.e(declaringClass).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h<?> hVar, int i15, vr.b bVar, boolean z15) {
        if (j.a(hVar) == i15) {
            return;
        }
        throw new i3("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i15 + "\nCalling: " + bVar + "\nParameter types: " + hVar.a() + ")\nDefault: " + z15);
    }

    public static final Object h(Object obj, vr.b bVar) {
        t0 t0VarL;
        Class<?> clsS;
        Method methodM;
        return (((bVar instanceof z0) && dt.k.e((u1) bVar)) || (t0VarL = l(bVar)) == null || (clsS = s(t0VarL)) == null || (methodM = m(clsS, bVar)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x004d->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends Member> h<M> i(h<? extends M> hVar, vr.b bVar, boolean z15) {
        List<t1> listL;
        Iterator<T> it;
        t0 t0VarF;
        if (!dt.k.a(bVar)) {
            List<c1> listB0 = bVar.B0();
            if ((listB0 instanceof Collection) && listB0.isEmpty()) {
                listL = bVar.l();
                if (!(listL instanceof Collection)) {
                    it = listL.iterator();
                    while (it.hasNext()) {
                        if (dt.k.h(((t1) it.next()).getType())) {
                        }
                    }
                    t0VarF = bVar.f();
                    if (t0VarF != null) {
                    }
                }
                it = listL.iterator();
                while (it.hasNext()) {
                    if (dt.k.h(((t1) it.next()).getType())) {
                    }
                }
                t0VarF = bVar.f();
                if (t0VarF != null) {
                }
            }
            Iterator<T> it4 = listB0.iterator();
            while (it4.hasNext()) {
                if (dt.k.h(((c1) it4.next()).getType())) {
                }
            }
            listL = bVar.l();
            if (!(listL instanceof Collection) && listL.isEmpty()) {
                t0VarF = bVar.f();
                return t0VarF != null ? hVar : hVar;
            }
            it = listL.iterator();
            while (it.hasNext()) {
                if (dt.k.h(((t1) it.next()).getType())) {
                }
            }
            t0VarF = bVar.f();
            if ((t0VarF != null || !dt.k.c(t0VarF)) && !q(bVar)) {
            }
        }
        return new n(bVar, hVar, z15);
    }

    public static /* synthetic */ h j(h hVar, vr.b bVar, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return i(hVar, bVar, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method k(Class<?> cls, vr.b bVar) {
        try {
            return cls.getDeclaredMethod("box-impl", m(cls, bVar).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new i3("No box method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    private static final t0 l(vr.b bVar) {
        c1 c1VarR = bVar.R();
        c1 c1VarN = bVar.N();
        if (c1VarR != null) {
            return c1VarR.getType();
        }
        if (c1VarN == null) {
            return null;
        }
        if (bVar instanceof vr.l) {
            return c1VarN.getType();
        }
        vr.m mVarB = bVar.b();
        vr.e eVar = mVarB instanceof vr.e ? (vr.e) mVarB : null;
        if (eVar != null) {
            return eVar.t();
        }
        return null;
    }

    public static final Method m(Class<?> cls, vr.b bVar) {
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new i3("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    public static final List<Method> n(e1 e1Var) {
        List<String> listO = o(h2.a(e1Var));
        if (listO == null) {
            return null;
        }
        List<String> list = listO;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        Class<?> clsQ = y3.q((vr.e) e1Var.T0().c());
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it4.next(), null));
        }
        return arrayList2;
    }

    private static final List<String> o(e1 e1Var) {
        Collection collectionE;
        if (!dt.k.i(e1Var)) {
            return null;
        }
        Iterable<r> iterableC = ht.e.t((vr.e) e1Var.T0().c()).c();
        ArrayList arrayList = new ArrayList();
        for (r rVar : iterableC) {
            zs.f fVar = (zs.f) rVar.a();
            List<String> listO = o((e1) rVar.b());
            if (listO != null) {
                List<String> list = listO;
                collectionE = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionE.add(fVar.j() + '-' + ((String) it.next()));
                }
            } else {
                collectionE = v.e(fVar.j());
            }
            v.D(arrayList, collectionE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> p(e1 e1Var, vr.b bVar) {
        Method methodM;
        List<Method> listN = n(e1Var);
        if (listN != null) {
            return listN;
        }
        Class<?> clsS = s(e1Var);
        if (clsS == null || (methodM = m(clsS, bVar)) == null) {
            return null;
        }
        return v.e(methodM);
    }

    private static final boolean q(vr.b bVar) {
        t0 t0VarL = l(bVar);
        return t0VarL != null && dt.k.h(t0VarL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<t0> r(vr.b bVar, Member member, er.l<? super vr.e, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        c1 c1VarR = bVar.R();
        t0 type = c1VarR != null ? c1VarR.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (bVar instanceof vr.l) {
            vr.e eVarI0 = ((vr.l) bVar).i0();
            if (eVarI0.E()) {
                arrayList.add(((vr.e) eVarI0.b()).t());
            }
        } else {
            vr.m mVarB = bVar.b();
            if ((mVarB instanceof vr.e) && lVar.b(mVarB).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((vr.e) mVarB).t());
                } else {
                    arrayList.add(xt.d.B(((vr.e) mVarB).t()));
                }
            }
        }
        Iterator<T> it = bVar.l().iterator();
        while (it.hasNext()) {
            arrayList.add(((t1) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> s(t0 t0Var) {
        t0 t0VarJ;
        Class<?> clsT = t(t0Var.T0().c());
        if (clsT == null) {
            return null;
        }
        if (l2.l(t0Var) && ((t0VarJ = dt.k.j(t0Var)) == null || l2.l(t0VarJ) || sr.j.t0(t0VarJ))) {
            return null;
        }
        return clsT;
    }

    public static final Class<?> t(vr.m mVar) {
        if (!(mVar instanceof vr.e) || !dt.k.b(mVar)) {
            return null;
        }
        vr.e eVar = (vr.e) mVar;
        Class<?> clsQ = y3.q(eVar);
        if (clsQ != null) {
            return clsQ;
        }
        throw new i3("Class object for the class " + eVar.getName() + " cannot be found (classId=" + ht.e.n((vr.h) mVar) + ')');
    }

    public static final String u(vr.h hVar) {
        return ys.b.b(ht.e.n(hVar).b());
    }
}
