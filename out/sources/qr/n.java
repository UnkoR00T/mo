package qr;

import fu.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.s0;
import pq.v;
import pr.g1;
import pr.y3;
import st.h2;
import st.t0;
import vr.c1;
import vr.t1;
import vr.w0;
import vr.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0015\u0017B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010)\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020'0*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010+R\u0014\u0010.\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010-¨\u0006/"}, d2 = {"Lqr/n;", "Ljava/lang/reflect/Member;", "M", "Lqr/h;", "Lvr/b;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lqr/h;Z)V", "", "index", "Llr/i;", "g", "(I)Llr/i;", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Z", "b", "Lqr/h;", "caller", "c", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "member", "Lqr/n$a;", "d", "Lqr/n$a;", "data", "e", "[Llr/i;", "slices", "f", "hasMfvcParameters", "Ljava/lang/reflect/Type;", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "()Z", "isBoundInstanceCallWithValueClasses", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n<M extends Member> implements h<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefault;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<M> caller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final M member;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lr.i[] slices;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasMfvcParameters;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqr/n$a;", "", "Llr/i;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(Llr/i;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "a", "Llr/i;", "()Llr/i;", "b", "[Ljava/util/List;", "c", "()[Ljava/util/List;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final lr.i argumentRange;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Method>[] unboxParameters;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Method box;

        public a(lr.i iVar, List<Method>[] listArr, Method method) {
            this.argumentRange = iVar;
            this.unboxParameters = listArr;
            this.box = method;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final lr.i getArgumentRange() {
            return this.argumentRange;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getBox() {
            return this.box;
        }

        public final List<Method>[] c() {
            return this.unboxParameters;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR'\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR \u0010#\u001a\b\u0012\u0004\u0012\u00020!0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b\u0014\u0010\u001fR\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010$R\u0014\u0010(\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lqr/n$b;", "Lqr/h;", "", "Lvr/z;", "descriptor", "Lpr/g1;", "container", "", "constructorDesc", "", "Lvr/w0;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lpr/g1;Ljava/lang/String;Ljava/util/List;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "constructorImpl", "b", "boxMethod", "c", "Ljava/util/List;", "parameterUnboxMethods", "Ljava/lang/Class;", "d", "g", "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "e", "parameterTypes", "()Ljava/lang/Void;", "member", "f", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method constructorImpl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method boxMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<List<Method>> parameterUnboxMethods;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<List<Class<?>>> originalParametersGroups;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<Type> parameterTypes;

        public b(z zVar, g1 g1Var, String str, List<? extends w0> list) {
            Collection collectionE;
            this.constructorImpl = g1Var.m("constructor-impl", str);
            this.boxMethod = g1Var.m("box-impl", r.O0(str, "V") + bs.f.f(g1Var.a()));
            List<? extends w0> list2 = list;
            ArrayList arrayList = new ArrayList(v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(o.p(h2.a(((w0) it.next()).getType()), zVar));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
            int i15 = 0;
            for (Object obj : list2) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                vr.e eVar = (vr.e) ((w0) obj).getType().T0().c();
                List<Method> list3 = this.parameterUnboxMethods.get(i15);
                if (list3 != null) {
                    List<Method> list4 = list3;
                    collectionE = new ArrayList(v.y(list4, 10));
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        collectionE.add(((Method) it4.next()).getReturnType());
                    }
                } else {
                    collectionE = v.e(y3.q(eVar));
                }
                arrayList2.add(collectionE);
                i15 = i16;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = v.A(arrayList2);
        }

        @Override // qr.h
        public List<Type> a() {
            return this.parameterTypes;
        }

        @Override // qr.h
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) e();
        }

        @Override // qr.h
        public /* bridge */ boolean c() {
            return d();
        }

        public boolean d() {
            return false;
        }

        public Void e() {
            return null;
        }

        @Override // qr.h
        /* JADX INFO: renamed from: f */
        public Type getReturnType() {
            return this.boxMethod.getReturnType();
        }

        public final List<List<Class<?>>> g() {
            return this.originalParametersGroups;
        }

        @Override // qr.h
        public Object v(Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionE;
            List<oq.r> listE1 = pq.n.E1(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (oq.r rVar : listE1) {
                Object objA = rVar.a();
                List list = (List) rVar.b();
                if (list != null) {
                    List list2 = list;
                    collectionE = new ArrayList(v.y(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = v.e(objA);
                }
                v.D(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[LOOP:1: B:25:0x006a->B:27:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    public n(vr.b bVar, h<? extends M> hVar, boolean z15) {
        Class clsS;
        a aVar;
        t0 t0VarJ;
        ArrayList arrayList;
        Iterator<T> it;
        this.isDefault = z15;
        boolean z16 = false;
        if (hVar instanceof i.h.c) {
            c1 c1VarR = bVar.R();
            c1VarR = c1VarR == null ? bVar.N() : c1VarR;
            t0 type = c1VarR != null ? c1VarR.getType() : null;
            if (type != null && dt.k.i(type)) {
                if (z15) {
                    List<t1> listL = bVar.l();
                    if (!(listL instanceof Collection) || !listL.isEmpty()) {
                        Iterator<T> it4 = listL.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (((t1) it4.next()).E0()) {
                                    List<Method> listN = o.n(h2.a(type));
                                    arrayList = new ArrayList(v.y(listN, 10));
                                    it = listN.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((i.h.c) hVar).getBoundReceiver(), null));
                                    }
                                    hVar = new i.h.d(((i.h) hVar).b(), arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    List<Method> listN2 = o.n(h2.a(type));
                    arrayList = new ArrayList(v.y(listN2, 10));
                    it = listN2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((i.h.c) hVar).getBoundReceiver(), null));
                    }
                    hVar = new i.h.d(((i.h) hVar).b(), arrayList.toArray(new Object[0]));
                }
            }
        }
        this.caller = (h<M>) hVar;
        this.member = (M) hVar.b();
        t0 t0VarF = bVar.f();
        boolean z17 = bVar instanceof z;
        Method methodK = ((z17 && ((z) bVar).u() && (t0VarJ = dt.k.j(t0VarF)) != null && sr.j.t0(t0VarJ)) || (clsS = o.s(t0VarF)) == null) ? null : o.k(clsS, bVar);
        if (dt.k.a(bVar)) {
            aVar = new a(lr.i.INSTANCE.a(), new List[0], methodK);
        } else {
            int i15 = -1;
            if ((!(hVar instanceof i.h.c) || hVar.getIsCallByToValueClassMangledMethod()) && !(hVar instanceof i.h.d)) {
                if (bVar instanceof vr.l) {
                    if (!(hVar instanceof g)) {
                        i15 = 0;
                    }
                } else if (bVar.N() == null || (hVar instanceof g) || dt.k.g(bVar.b())) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
            }
            int i16 = hVar instanceof i.h.d ? -hVar.l() : i15;
            List listR = o.r(bVar, hVar.b(), m.f168185a);
            Iterator it5 = listR.iterator();
            int size = 0;
            while (it5.hasNext()) {
                List<Method> listN3 = o.n(h2.a((t0) it5.next()));
                size += listN3 != null ? listN3.size() : 1;
            }
            int i17 = size + i16 + (this.isDefault ? ((size + 31) / 32) + 1 : 0) + ((z17 && ((z) bVar).u()) ? 1 : 0);
            o.g(this, i17, bVar, this.isDefault);
            lr.i iVarW = lr.m.w(Math.max(i15, 0), listR.size() + i15);
            List[] listArr = new List[i17];
            int i18 = 0;
            while (i18 < i17) {
                listArr[i18] = (i18 > iVarW.getLast() || iVarW.getFirst() > i18) ? null : o.p(h2.a((t0) listR.get(i18 - i15)), bVar);
                i18++;
            }
            aVar = new a(iVarW, listArr, methodK);
        }
        this.data = aVar;
        List listC = v.c();
        h<M> hVar2 = this.caller;
        int length = hVar2 instanceof i.h.d ? ((i.h.d) hVar2).getBoundReceiverComponents().length : hVar2 instanceof i.h.c ? 1 : 0;
        if (length > 0) {
            listC.add(lr.m.w(0, length));
        }
        List<Method>[] listArrC = aVar.c();
        int length2 = listArrC.length;
        int i19 = 0;
        while (i19 < length2) {
            List<Method> list = listArrC[i19];
            int size2 = (list != null ? list.size() : 1) + length;
            listC.add(lr.m.w(length, size2));
            i19++;
            length = size2;
        }
        this.slices = (lr.i[]) v.a(listC).toArray(new lr.i[0]);
        Iterable argumentRange = this.data.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            Iterator it6 = argumentRange.iterator();
            while (it6.hasNext()) {
                List<Method> list2 = this.data.c()[((s0) it6).nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z16 = true;
                    break;
                }
            }
        }
        this.hasMfvcParameters = z16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(vr.e eVar) {
        return dt.k.g(eVar);
    }

    @Override // qr.h
    public List<Type> a() {
        return this.caller.a();
    }

    @Override // qr.h
    public M b() {
        return this.member;
    }

    @Override // qr.h
    public boolean c() {
        return this.caller instanceof i.h.a;
    }

    @Override // qr.h
    /* JADX INFO: renamed from: f */
    public Type getReturnType() {
        return this.caller.getReturnType();
    }

    public final lr.i g(int index) {
        if (index >= 0) {
            lr.i[] iVarArr = this.slices;
            if (index < iVarArr.length) {
                return iVarArr[index];
            }
        }
        lr.i[] iVarArr2 = this.slices;
        if (iVarArr2.length == 0) {
            return new lr.i(index, index);
        }
        int length = (index - iVarArr2.length) + ((lr.i) pq.n.M0(iVarArr2)).getLast() + 1;
        return new lr.i(length, length);
    }

    @Override // qr.h
    public Object v(Object[] args) {
        Object objInvoke;
        Object objInvoke2;
        lr.i argumentRange = this.data.getArgumentRange();
        List<Method>[] listArrC = this.data.c();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listD = v.d(args.length);
                int first = argumentRange.getFirst();
                for (int i15 = 0; i15 < first; i15++) {
                    listD.add(args[i15]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = listArrC[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            List list2 = listD;
                            for (Method method : list) {
                                list2.add(obj != null ? method.invoke(obj, null) : y3.g(method.getReturnType()));
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int iV0 = pq.n.v0(args);
                if (last2 <= iV0) {
                    while (true) {
                        listD.add(args[last2]);
                        if (last2 == iV0) {
                            break;
                        }
                        last2++;
                    }
                }
                args = v.a(listD).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i16 = 0; i16 < length; i16++) {
                    int first3 = argumentRange.getFirst();
                    if (i16 > argumentRange.getLast() || first3 > i16) {
                        objInvoke2 = args[i16];
                    } else {
                        List<Method> list3 = listArrC[i16];
                        Method method2 = list3 != null ? (Method) v.P0(list3) : null;
                        objInvoke2 = args[i16];
                        if (method2 != null) {
                            objInvoke2 = objInvoke2 != null ? method2.invoke(objInvoke2, null) : y3.g(method2.getReturnType());
                        }
                    }
                    objArr[i16] = objInvoke2;
                }
                args = objArr;
            }
        }
        Object objV = this.caller.v(args);
        return (objV == uq.b.e() || box == null || (objInvoke = box.invoke(null, objV)) == null) ? objV : objInvoke;
    }
}
