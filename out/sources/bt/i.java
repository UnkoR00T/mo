package bt;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends bt.a implements Serializable {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21423a;

        static {
            int[] iArr = new int[z.c.values().length];
            f21423a = iArr;
            try {
                iArr[z.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21423a[z.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends i, BuilderType extends b> extends bt.a.AbstractC0557a<BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private bt.d f21424a = bt.d.f21388a;

        protected b() {
        }

        @Override // 
        public BuilderType o() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final bt.d p() {
            return this.f21424a;
        }

        public abstract BuilderType q(MessageType messagetype);

        public final BuilderType s(bt.d dVar) {
            this.f21424a = dVar;
            return this;
        }
    }

    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h<e> f21425b = h.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21426c;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public h<e> v() {
            this.f21425b.q();
            this.f21426c = false;
            return this.f21425b;
        }

        private void w() {
            if (this.f21426c) {
                return;
            }
            this.f21425b = this.f21425b.clone();
            this.f21426c = true;
        }

        protected final void x(MessageType messagetype) {
            w();
            this.f21425b.r(((d) messagetype).f21427b);
        }
    }

    static final class e implements h.b<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j.b<?> f21432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f21433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final z.b f21434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f21435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f21436e;

        e(j.b<?> bVar, int i15, z.b bVar2, boolean z15, boolean z16) {
            this.f21432a = bVar;
            this.f21433b = i15;
            this.f21434c = bVar2;
            this.f21435d = z15;
            this.f21436e = z16;
        }

        @Override // bt.h.b
        public boolean C() {
            return this.f21435d;
        }

        @Override // bt.h.b
        public z.b E() {
            return this.f21434c;
        }

        @Override // bt.h.b
        public z.c L() {
            return this.f21434c.b();
        }

        @Override // bt.h.b
        public boolean M() {
            return this.f21436e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f21433b - eVar.f21433b;
        }

        public j.b<?> e() {
            return this.f21432a;
        }

        @Override // bt.h.b
        public int h() {
            return this.f21433b;
        }

        @Override // bt.h.b
        public q.a s3(q.a aVar, q qVar) {
            return ((b) aVar).q((i) qVar);
        }
    }

    public static class f<ContainingType extends q, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ContainingType f21437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Type f21438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final q f21439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f21440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Class f21441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Method f21442f;

        f(ContainingType containingtype, Type type, q qVar, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.E() == z.b.f21517n && qVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f21437a = containingtype;
            this.f21438b = type;
            this.f21439c = qVar;
            this.f21440d = eVar;
            this.f21441e = cls;
            if (j.a.class.isAssignableFrom(cls)) {
                this.f21442f = i.h(cls, "valueOf", Integer.TYPE);
            } else {
                this.f21442f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f21440d.C()) {
                return e(obj);
            }
            if (this.f21440d.L() != z.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f21437a;
        }

        public q c() {
            return this.f21439c;
        }

        public int d() {
            return this.f21440d.h();
        }

        Object e(Object obj) {
            return this.f21440d.L() == z.c.ENUM ? i.k(this.f21442f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f21440d.L() == z.c.ENUM ? Integer.valueOf(((j.a) obj).h()) : obj;
        }
    }

    protected i() {
    }

    static Method h(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e15) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb5 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb5.append("Generated message class \"");
            sb5.append(name);
            sb5.append("\" missing method \"");
            sb5.append(strValueOf);
            sb5.append("\".");
            throw new RuntimeException(sb5.toString(), e15);
        }
    }

    static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e15) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e15);
        } catch (InvocationTargetException e16) {
            Throwable cause = e16.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <ContainingType extends q, Type> f<ContainingType, Type> o(ContainingType containingtype, q qVar, j.b<?> bVar, int i15, z.b bVar2, boolean z15, Class cls) {
        return new f<>(containingtype, Collections.EMPTY_LIST, qVar, new e(bVar, i15, bVar2, true, z15), cls);
    }

    public static <ContainingType extends q, Type> f<ContainingType, Type> p(ContainingType containingtype, Type type, q qVar, j.b<?> bVar, int i15, z.b bVar2, Class cls) {
        return new f<>(containingtype, type, qVar, new e(bVar, i15, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends q> boolean s(h<e> hVar, MessageType messagetype, bt.e eVar, bt.f fVar, g gVar, int i15) throws k {
        boolean z15;
        boolean z16;
        Object objBuild;
        q qVar;
        int iB = z.b(i15);
        f fVarB = gVar.b(messagetype, z.a(i15));
        if (fVarB == null) {
            z16 = true;
            z15 = false;
        } else if (iB == h.l(fVarB.f21440d.E(), false)) {
            z16 = false;
            z15 = false;
        } else {
            e eVar2 = fVarB.f21440d;
            if (eVar2.f21435d && eVar2.f21434c.g() && iB == h.l(fVarB.f21440d.E(), true)) {
                z15 = true;
                z16 = false;
            } else {
                z16 = true;
                z15 = false;
            }
        }
        if (z16) {
            return eVar.P(i15, fVar);
        }
        if (z15) {
            int iJ = eVar.j(eVar.A());
            if (fVarB.f21440d.E() == z.b.f21520r) {
                while (eVar.e() > 0) {
                    j.a aVarA = fVarB.f21440d.e().a(eVar.n());
                    if (aVarA == null) {
                        return true;
                    }
                    hVar.a(fVarB.f21440d, fVarB.f(aVarA));
                }
            } else {
                while (eVar.e() > 0) {
                    hVar.a(fVarB.f21440d, h.u(eVar, fVarB.f21440d.E(), false));
                }
            }
            eVar.i(iJ);
        } else {
            int i16 = a.f21423a[fVarB.f21440d.L().ordinal()];
            if (i16 == 1) {
                q.a aVarB = (fVarB.f21440d.C() || (qVar = (q) hVar.h(fVarB.f21440d)) == null) ? null : qVar.b();
                if (aVarB == null) {
                    aVarB = fVarB.c().g();
                }
                if (fVarB.f21440d.E() == z.b.f21516m) {
                    eVar.r(fVarB.d(), aVarB, gVar);
                } else {
                    eVar.v(aVarB, gVar);
                }
                objBuild = aVarB.build();
            } else if (i16 != 2) {
                objBuild = h.u(eVar, fVarB.f21440d.E(), false);
            } else {
                int iN = eVar.n();
                j.a aVarA2 = fVarB.f21440d.e().a(iN);
                if (aVarA2 == null) {
                    fVar.o0(i15);
                    fVar.y0(iN);
                    return true;
                }
                objBuild = aVarA2;
            }
            if (fVarB.f21440d.C()) {
                hVar.a(fVarB.f21440d, fVarB.f(objBuild));
            } else {
                hVar.v(fVarB.f21440d, fVarB.f(objBuild));
            }
        }
        return true;
    }

    @Override // bt.q
    public s<? extends q> j() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected void n() {
    }

    protected boolean r(bt.e eVar, bt.f fVar, g gVar, int i15) {
        return eVar.P(i15, fVar);
    }

    public static abstract class d<MessageType extends d<MessageType>> extends i implements r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h<e> f21427b;

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<e, Object>> f21428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry<e, Object> f21429b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f21430c;

            /* synthetic */ a(d dVar, boolean z15, a aVar) {
                this(z15);
            }

            public void a(int i15, bt.f fVar) {
                while (true) {
                    Map.Entry<e, Object> entry = this.f21429b;
                    if (entry == null || entry.getKey().h() >= i15) {
                        return;
                    }
                    e key = this.f21429b.getKey();
                    if (this.f21430c && key.L() == z.c.MESSAGE && !key.C()) {
                        fVar.f0(key.h(), (q) this.f21429b.getValue());
                    } else {
                        h.z(key, this.f21429b.getValue(), fVar);
                    }
                    if (this.f21428a.hasNext()) {
                        this.f21429b = this.f21428a.next();
                    } else {
                        this.f21429b = null;
                    }
                }
            }

            private a(boolean z15) {
                Iterator<Map.Entry<e, Object>> itP = d.this.f21427b.p();
                this.f21428a = itP;
                if (itP.hasNext()) {
                    this.f21429b = itP.next();
                }
                this.f21430c = z15;
            }
        }

        protected d() {
            this.f21427b = h.t();
        }

        private void D(f<MessageType, ?> fVar) {
            if (fVar.b() != i()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> int A(f<MessageType, List<Type>> fVar) {
            D(fVar);
            return this.f21427b.j(fVar.f21440d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean B(f<MessageType, Type> fVar) {
            D(fVar);
            return this.f21427b.m(fVar.f21440d);
        }

        protected d<MessageType>.a C() {
            return new a(this, false, null);
        }

        @Override // bt.i
        protected void n() {
            this.f21427b.q();
        }

        @Override // bt.i
        protected boolean r(bt.e eVar, bt.f fVar, g gVar, int i15) {
            return i.s(this.f21427b, i(), eVar, fVar, gVar, i15);
        }

        protected boolean u() {
            return this.f21427b.n();
        }

        protected int v() {
            return this.f21427b.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type w(f<MessageType, Type> fVar) {
            D(fVar);
            Object objH = this.f21427b.h(fVar.f21440d);
            return objH == null ? fVar.f21438b : (Type) fVar.a(objH);
        }

        public final <Type> Type y(f<MessageType, List<Type>> fVar, int i15) {
            D(fVar);
            return (Type) fVar.e(this.f21427b.i(fVar.f21440d, i15));
        }

        protected d(c<MessageType, ?> cVar) {
            this.f21427b = cVar.v();
        }
    }

    protected i(b bVar) {
    }
}
