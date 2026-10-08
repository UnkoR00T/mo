package pr;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b#\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0002B7\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010 J5\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0$2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010\u000f\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001f\u0010?\u001a\u0006\u0012\u0002\b\u00030\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R!\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010.R\u0014\u0010J\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010,R\u0014\u0010L\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010F¨\u0006M"}, d2 = {"Lpr/l1;", "Lpr/c0;", "", "Lmr/g;", "Lfr/o;", "Lpr/g1;", "container", "", "name", "signature", "Lvr/z;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lpr/g1;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(Lpr/g1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "x0", "(Lvr/z;)Lvr/z;", "Ljava/lang/reflect/Method;", "member", "", "y0", "(Ljava/lang/reflect/Method;)Z", "isCallByToValueClassMangledMethod", "Lqr/h;", "k0", "(Ljava/lang/reflect/Method;Z)Lqr/h;", "Lqr/i$h;", "j0", "(Ljava/lang/reflect/Method;)Lqr/i$h;", "i0", "Ljava/lang/reflect/Constructor;", "isDefault", "Lqr/i;", "h0", "(Ljava/lang/reflect/Constructor;Lvr/z;Z)Lqr/i;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "h", "Lpr/g1;", "V", "()Lpr/g1;", "j", "Ljava/lang/String;", "k", "Ljava/lang/Object;", "l", "Lpr/l3$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "m", "Loq/k;", "U", "()Lqr/h;", "caller", "n", "W", "defaultCaller", "v0", "()Ljava/lang/Object;", "b0", "()Z", "isBound", "getName", "p", "arity", "u", "isSuspend", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l1 extends c0<Object> implements fr.o<Object>, mr.g<Object>, er.a, er.l, er.b, er.c, er.d, er.e, er.f, er.g, er.h, er.i, er.j, er.k, er.p, er.m, er.n, er.o, er.q, er.r, er.s, er.t, er.u, er.v, er.w, mr.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f161881p = {fr.q0.j(new fr.h0(l1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g1 container;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l3.a descriptor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oq.k caller;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final oq.k defaultCaller;

    private l1(g1 g1Var, String str, String str2, vr.z zVar, Object obj) {
        this.container = g1Var;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = l3.c(zVar, new i1(this, str));
        oq.o oVar = oq.o.PUBLICATION;
        this.caller = oq.l.b(oVar, new j1(this));
        this.defaultCaller = oq.l.b(oVar, new k1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qr.h g0(l1 l1Var) {
        Object objD;
        qr.h<?> hVarJ0;
        n nVarG = u3.f161976a.g(l1Var.d0());
        if (nVarG instanceof n.d) {
            if (l1Var.a0()) {
                Class<?> clsA = l1Var.getContainer().a();
                List<mr.k> parameters = l1Var.getParameters();
                ArrayList arrayList = new ArrayList(pq.v.y(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mr.k) it.next()).getName());
                }
                return new qr.a(clsA, arrayList, qr.a.EnumC4247a.POSITIONAL_CALL, qr.a.b.KOTLIN, null, 16, null);
            }
            objD = l1Var.getContainer().h(((n.d) nVarG).b());
        } else if (nVarG instanceof n.e) {
            vr.z zVarD0 = l1Var.d0();
            if (dt.k.d(zVarD0.b()) && (zVarD0 instanceof vr.l) && ((vr.l) zVarD0).h0()) {
                return new qr.n.b(l1Var.d0(), l1Var.getContainer(), ((n.e) nVarG).b(), l1Var.d0().l());
            }
            n.e eVar = (n.e) nVarG;
            objD = l1Var.getContainer().m(eVar.c(), eVar.b());
        } else if (nVarG instanceof n.c) {
            objD = ((n.c) nVarG).getMethod();
        } else {
            if (!(nVarG instanceof n.b)) {
                if (!(nVarG instanceof n.a)) {
                    throw new oq.p();
                }
                List<Method> listD = ((n.a) nVarG).d();
                Class<?> clsA2 = l1Var.getContainer().a();
                List<Method> list = listD;
                ArrayList arrayList2 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((Method) it4.next()).getName());
                }
                return new qr.a(clsA2, arrayList2, qr.a.EnumC4247a.POSITIONAL_CALL, qr.a.b.JAVA, listD);
            }
            objD = ((n.b) nVarG).d();
        }
        if (objD instanceof Constructor) {
            hVarJ0 = l1Var.h0((Constructor) objD, l1Var.d0(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new i3("Could not compute caller for function: " + l1Var.d0() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            if (Modifier.isStatic(method.getModifiers())) {
                hVarJ0 = l1Var.d0().getAnnotations().H(y3.j()) != null ? l1Var.j0(method) : l1Var.k0(method, false);
            } else {
                hVarJ0 = l1Var.i0(method);
            }
        }
        return qr.o.j(hVarJ0, l1Var.d0(), false, 2, null);
    }

    private final qr.i<Constructor<?>> h0(Constructor<?> member, vr.z descriptor, boolean isDefault) {
        if (isDefault || !jt.b.f(descriptor)) {
            return b0() ? new qr.i.c(member, v0()) : new qr.i.e(member);
        }
        return b0() ? new qr.i.a(member, v0()) : new qr.i.b(member);
    }

    private final qr.i.h i0(Method member) {
        return b0() ? new qr.i.h.a(member, v0()) : new qr.i.h.e(member);
    }

    private final qr.i.h j0(Method member) {
        return b0() ? new qr.i.h.b(member) : new qr.i.h.f(member);
    }

    private final qr.h<?> k0(Method member, boolean isCallByToValueClassMangledMethod) {
        if (b0()) {
            return new qr.i.h.c(member, isCallByToValueClassMangledMethod, y0(member) ? this.rawBoundReceiver : v0());
        }
        return new qr.i.h.g(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qr.h t0(l1 l1Var) {
        GenericDeclaration genericDeclarationI;
        qr.h<?> hVarK0;
        u3 u3Var = u3.f161976a;
        n nVarG = u3Var.g(l1Var.d0());
        if (nVarG instanceof n.e) {
            vr.z zVarD0 = l1Var.d0();
            if (dt.k.d(zVarD0.b()) && (zVarD0 instanceof vr.l) && ((vr.l) zVarD0).h0()) {
                throw new i3(l1Var.d0().b() + " cannot have default arguments");
            }
            vr.z zVarX0 = l1Var.x0(l1Var.d0());
            if (zVarX0 != null) {
                n.e eVar = (n.e) u3Var.g(zVarX0);
                genericDeclarationI = l1Var.getContainer().j(eVar.c(), eVar.b(), true);
            } else {
                n.e eVar2 = (n.e) nVarG;
                genericDeclarationI = l1Var.getContainer().j(eVar2.c(), eVar2.b(), !Modifier.isStatic(l1Var.U().b().getModifiers()));
            }
        } else if (nVarG instanceof n.d) {
            if (l1Var.a0()) {
                Class<?> clsA = l1Var.getContainer().a();
                List<mr.k> parameters = l1Var.getParameters();
                ArrayList arrayList = new ArrayList(pq.v.y(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mr.k) it.next()).getName());
                }
                return new qr.a(clsA, arrayList, qr.a.EnumC4247a.CALL_BY_NAME, qr.a.b.KOTLIN, null, 16, null);
            }
            genericDeclarationI = l1Var.getContainer().i(((n.d) nVarG).b());
        } else {
            if (nVarG instanceof n.a) {
                List<Method> listD = ((n.a) nVarG).d();
                Class<?> clsA2 = l1Var.getContainer().a();
                List<Method> list = listD;
                ArrayList arrayList2 = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((Method) it4.next()).getName());
                }
                return new qr.a(clsA2, arrayList2, qr.a.EnumC4247a.CALL_BY_NAME, qr.a.b.JAVA, listD);
            }
            genericDeclarationI = null;
        }
        if (genericDeclarationI instanceof Constructor) {
            hVarK0 = l1Var.h0((Constructor) genericDeclarationI, l1Var.d0(), true);
        } else if (genericDeclarationI instanceof Method) {
            hVarK0 = (l1Var.d0().getAnnotations().H(y3.j()) == null || ((vr.e) l1Var.d0().b()).e0()) ? l1Var.k0((Method) genericDeclarationI, l1Var.U().c()) : l1Var.j0((Method) genericDeclarationI);
        } else {
            hVarK0 = null;
        }
        if (hVarK0 != null) {
            return qr.o.i(hVarK0, l1Var.d0(), true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.z u0(l1 l1Var, String str) {
        return l1Var.getContainer().k(str, l1Var.signature);
    }

    private final Object v0() {
        return qr.o.h(this.rawBoundReceiver, d0());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a A[EDGE_INSN: B:40:0x008a->B:32:0x008a BREAK  A[LOOP:0: B:18:0x0051->B:41:0x0051, LOOP_LABEL: LOOP:0: B:18:0x0051->B:41:0x0051], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:1: B:26:0x0076->B:44:?, LOOP_END, SYNTHETIC] */
    private final vr.z x0(vr.z descriptor) {
        Iterator<vr.b> it;
        vr.b next;
        List<vr.t1> listL;
        Iterator<T> it4;
        List<vr.t1> listL2 = descriptor.l();
        if (!(listL2 instanceof Collection) || !listL2.isEmpty()) {
            Iterator<T> it5 = listL2.iterator();
            while (it5.hasNext()) {
                if (((vr.t1) it5.next()).E0()) {
                }
            }
            if (dt.k.g(descriptor.b()) && Modifier.isStatic(U().b().getModifiers())) {
                it = ht.e.z(descriptor, false).iterator();
                loop0: while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    listL = next.l();
                    if ((listL instanceof Collection) || !listL.isEmpty()) {
                        it4 = listL.iterator();
                        while (it4.hasNext()) {
                            if (((vr.t1) it4.next()).E0()) {
                                break loop0;
                            }
                        }
                    }
                }
                if (next instanceof vr.z) {
                    return (vr.z) next;
                }
            }
        } else if (dt.k.g(descriptor.b())) {
            it = ht.e.z(descriptor, false).iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                listL = next.l();
                if (listL instanceof Collection) {
                }
                it4 = listL.iterator();
                while (it4.hasNext()) {
                    if (((vr.t1) it4.next()).E0()) {
                        break loop0;
                        break loop0;
                    }
                }
            }
            if (next instanceof vr.z) {
                return (vr.z) next;
            }
        }
        return null;
    }

    private final boolean y0(Method member) {
        st.t0 type;
        Class cls;
        vr.c1 c1VarN = d0().N();
        return (c1VarN == null || (type = c1VarN.getType()) == null || !dt.k.c(type) || (cls = (Class) pq.n.p0(member.getParameterTypes())) == null || !cls.isInterface()) ? false : true;
    }

    @Override // er.p
    public /* bridge */ Object B(Object obj, Object obj2) {
        return n0(obj, obj2);
    }

    @Override // er.s
    public /* bridge */ Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return q0(obj, obj2, obj3, obj4, obj5);
    }

    @Override // pr.c0
    public qr.h<?> U() {
        return (qr.h) this.caller.getValue();
    }

    @Override // pr.c0
    /* JADX INFO: renamed from: V, reason: from getter */
    public g1 getContainer() {
        return this.container;
    }

    @Override // pr.c0
    public qr.h<?> W() {
        return (qr.h) this.defaultCaller.getValue();
    }

    @Override // er.a
    public /* bridge */ Object a() {
        return l0();
    }

    @Override // er.l
    public /* bridge */ Object b(Object obj) {
        return m0(obj);
    }

    @Override // pr.c0
    public boolean b0() {
        return this.rawBoundReceiver != fr.f.f66389g;
    }

    public boolean equals(Object other) {
        l1 l1VarC = y3.c(other);
        return l1VarC != null && fr.t.c(getContainer(), l1VarC.getContainer()) && fr.t.c(getName(), l1VarC.getName()) && fr.t.c(this.signature, l1VarC.signature) && fr.t.c(this.rawBoundReceiver, l1VarC.rawBoundReceiver);
    }

    @Override // er.r
    public /* bridge */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        return p0(obj, obj2, obj3, obj4);
    }

    @Override // mr.b
    public String getName() {
        return d0().getName().e();
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // er.v
    public /* bridge */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return s0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public Object l0() {
        return v(new Object[0]);
    }

    public Object m0(Object obj) {
        return v(obj);
    }

    public Object n0(Object obj, Object obj2) {
        return v(obj, obj2);
    }

    @Override // er.t
    public /* bridge */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return r0(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public Object o0(Object obj, Object obj2, Object obj3) {
        return v(obj, obj2, obj3);
    }

    @Override // fr.o
    /* JADX INFO: renamed from: p */
    public int getArity() {
        return qr.j.a(U());
    }

    public Object p0(Object obj, Object obj2, Object obj3, Object obj4) {
        return v(obj, obj2, obj3, obj4);
    }

    public Object q0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return v(obj, obj2, obj3, obj4, obj5);
    }

    public Object r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return v(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public Object s0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return v(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public String toString() {
        return t3.f161969a.q(this);
    }

    @Override // mr.b
    public boolean u() {
        return d0().u();
    }

    @Override // er.q
    public /* bridge */ Object w(Object obj, Object obj2, Object obj3) {
        return o0(obj, obj2, obj3);
    }

    @Override // pr.c0
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public vr.z d0() {
        return (vr.z) this.descriptor.e(this, f161881p[0]);
    }

    /* synthetic */ l1(g1 g1Var, String str, String str2, vr.z zVar, Object obj, int i15, fr.k kVar) {
        this(g1Var, str, str2, zVar, (i15 & 16) != 0 ? fr.f.f66389g : obj);
    }

    public l1(g1 g1Var, String str, String str2, Object obj) {
        this(g1Var, str, str2, null, obj);
    }

    public l1(g1 g1Var, vr.z zVar) {
        this(g1Var, zVar.getName().e(), u3.f161976a.g(zVar).get_signature(), zVar, null, 16, null);
    }
}
