package re;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import be.k;
import be.q;
import be.v;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import zd.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i<R> implements d, se.g, h {
    private static final boolean E = Log.isLoggable("GlideRequest", 2);
    private int A;
    private int B;
    private boolean C;
    private RuntimeException D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f173318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f173319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final we.c f173320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f173321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f<R> f173322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f173323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f173324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f173325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f173326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class<R> f173327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final re.a<?> f173328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f173329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f173330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f173331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final se.h<R> f173332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<f<R>> f173333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final te.c<? super R> f173334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Executor f173335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private v<R> f173336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private k.d f173337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f173338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile k f173339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f173340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f173341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f173342y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f173343z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private i(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, re.a<?> aVar, int i15, int i16, com.bumptech.glide.g gVar, se.h<R> hVar, f<R> fVar, List<f<R>> list, e eVar, k kVar, te.c<? super R> cVar, Executor executor) {
        this.f173319b = E ? String.valueOf(super.hashCode()) : null;
        this.f173320c = we.c.a();
        this.f173321d = obj;
        this.f173324g = context;
        this.f173325h = dVar;
        this.f173326i = obj2;
        this.f173327j = cls;
        this.f173328k = aVar;
        this.f173329l = i15;
        this.f173330m = i16;
        this.f173331n = gVar;
        this.f173332o = hVar;
        this.f173322e = fVar;
        this.f173333p = list;
        this.f173323f = eVar;
        this.f173339v = kVar;
        this.f173334q = cVar;
        this.f173335r = executor;
        this.f173340w = a.PENDING;
        if (this.D == null && dVar.g().a(com.bumptech.glide.c.C0739c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(q qVar, int i15) {
        boolean zB;
        this.f173320c.c();
        synchronized (this.f173321d) {
            try {
                qVar.k(this.D);
                int iH = this.f173325h.h();
                if (iH <= i15) {
                    c2.h("Glide", "Load failed for [" + this.f173326i + "] with dimensions [" + this.A + "x" + this.B + "]", qVar);
                    if (iH <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f173337t = null;
                this.f173340w = a.FAILED;
                x();
                boolean z15 = true;
                this.C = true;
                try {
                    List<f<R>> list = this.f173333p;
                    if (list != null) {
                        Iterator<f<R>> it = list.iterator();
                        zB = false;
                        while (it.hasNext()) {
                            zB |= it.next().b(qVar, this.f173326i, this.f173332o, t());
                        }
                    } else {
                        zB = false;
                    }
                    f<R> fVar = this.f173322e;
                    if (fVar == null || !fVar.b(qVar, this.f173326i, this.f173332o, t())) {
                        z15 = false;
                    }
                    if (!(zB | z15)) {
                        C();
                    }
                    this.C = false;
                    we.b.f("GlideRequest", this.f173318a);
                } catch (Throwable th4) {
                    this.C = false;
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private void B(v<R> vVar, R r15, zd.a aVar, boolean z15) {
        boolean z16;
        boolean z17;
        boolean zT = t();
        this.f173340w = a.COMPLETE;
        this.f173336s = vVar;
        if (this.f173325h.h() <= 3) {
            r15.getClass();
            Objects.toString(aVar);
            Objects.toString(this.f173326i);
            ve.g.a(this.f173338u);
        }
        y();
        boolean z18 = true;
        this.C = true;
        try {
            List<f<R>> list = this.f173333p;
            if (list != null) {
                z16 = false;
                for (f<R> fVar : list) {
                    R r16 = r15;
                    zd.a aVar2 = aVar;
                    boolean zA = fVar.a(r16, this.f173326i, this.f173332o, aVar2, zT) | z16;
                    if (fVar instanceof c) {
                        z17 = z15;
                        zA |= ((c) fVar).d(r16, this.f173326i, this.f173332o, aVar2, zT, z17);
                    } else {
                        z17 = z15;
                    }
                    aVar = aVar2;
                    z15 = z17;
                    z16 = zA;
                    r15 = r16;
                }
            } else {
                z16 = false;
            }
            R r17 = r15;
            zd.a aVar3 = aVar;
            f<R> fVar2 = this.f173322e;
            if (fVar2 == null || !fVar2.a(r17, this.f173326i, this.f173332o, aVar3, zT)) {
                z18 = false;
            }
            if (!(z18 | z16)) {
                this.f173332o.h(r17, this.f173334q.a(aVar3, zT));
            }
            this.C = false;
            we.b.f("GlideRequest", this.f173318a);
        } catch (Throwable th4) {
            this.C = false;
            throw th4;
        }
    }

    private void C() {
        if (m()) {
            Drawable drawableR = this.f173326i == null ? r() : null;
            if (drawableR == null) {
                drawableR = q();
            }
            if (drawableR == null) {
                drawableR = s();
            }
            this.f173332o.j(drawableR);
        }
    }

    private void k() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean l() {
        e eVar = this.f173323f;
        return eVar == null || eVar.d(this);
    }

    private boolean m() {
        e eVar = this.f173323f;
        return eVar == null || eVar.h(this);
    }

    private boolean n() {
        e eVar = this.f173323f;
        return eVar == null || eVar.k(this);
    }

    private void o() {
        k();
        this.f173320c.c();
        this.f173332o.a(this);
        k.d dVar = this.f173337t;
        if (dVar != null) {
            dVar.a();
            this.f173337t = null;
        }
    }

    private void p(Object obj) {
        List<f<R>> list = this.f173333p;
        if (list == null) {
            return;
        }
        for (f<R> fVar : list) {
            if (fVar instanceof c) {
                ((c) fVar).c(obj);
            }
        }
    }

    private Drawable q() {
        if (this.f173341x == null) {
            Drawable drawableP = this.f173328k.p();
            this.f173341x = drawableP;
            if (drawableP == null && this.f173328k.o() > 0) {
                this.f173341x = u(this.f173328k.o());
            }
        }
        return this.f173341x;
    }

    private Drawable r() {
        if (this.f173343z == null) {
            Drawable drawableQ = this.f173328k.q();
            this.f173343z = drawableQ;
            if (drawableQ == null && this.f173328k.s() > 0) {
                this.f173343z = u(this.f173328k.s());
            }
        }
        return this.f173343z;
    }

    private Drawable s() {
        if (this.f173342y == null) {
            Drawable drawableY = this.f173328k.y();
            this.f173342y = drawableY;
            if (drawableY == null && this.f173328k.z() > 0) {
                this.f173342y = u(this.f173328k.z());
            }
        }
        return this.f173342y;
    }

    private boolean t() {
        e eVar = this.f173323f;
        return eVar == null || !eVar.getRoot().b();
    }

    private Drawable u(int i15) {
        return ke.d.a(this.f173324g, i15, this.f173328k.H() != null ? this.f173328k.H() : this.f173324g.getTheme());
    }

    private void v(String str) {
    }

    private static int w(int i15, float f15) {
        return i15 == Integer.MIN_VALUE ? i15 : Math.round(f15 * i15);
    }

    private void x() {
        e eVar = this.f173323f;
        if (eVar != null) {
            eVar.e(this);
        }
    }

    private void y() {
        e eVar = this.f173323f;
        if (eVar != null) {
            eVar.c(this);
        }
    }

    public static <R> i<R> z(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, re.a<?> aVar, int i15, int i16, com.bumptech.glide.g gVar, se.h<R> hVar, f<R> fVar, List<f<R>> list, e eVar, k kVar, te.c<? super R> cVar, Executor executor) {
        return new i<>(context, dVar, obj, obj2, cls, aVar, i15, i16, gVar, hVar, fVar, list, eVar, kVar, cVar, executor);
    }

    @Override // re.d
    public boolean a() {
        boolean z15;
        synchronized (this.f173321d) {
            z15 = this.f173340w == a.COMPLETE;
        }
        return z15;
    }

    @Override // re.d
    public boolean b() {
        boolean z15;
        synchronized (this.f173321d) {
            z15 = this.f173340w == a.COMPLETE;
        }
        return z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // re.h
    public void c(v<?> vVar, zd.a aVar, boolean z15) {
        this.f173320c.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f173321d) {
                try {
                    this.f173337t = null;
                    if (vVar == null) {
                        d(new q("Expected to receive a Resource<R> with an object of " + this.f173327j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj == null || !this.f173327j.isAssignableFrom(obj.getClass())) {
                            this.f173336s = null;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Expected to receive an object of ");
                            sb5.append(this.f173327j);
                            sb5.append(" but instead got ");
                            sb5.append(obj != null ? obj.getClass() : "");
                            sb5.append("{");
                            sb5.append(obj);
                            sb5.append("} inside Resource{");
                            sb5.append(vVar);
                            sb5.append("}.");
                            sb5.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            d(new q(sb5.toString()));
                        } else if (n()) {
                            B(vVar, obj, aVar, z15);
                            return;
                        } else {
                            this.f173336s = null;
                            this.f173340w = a.COMPLETE;
                            we.b.f("GlideRequest", this.f173318a);
                        }
                        this.f173339v.k(vVar);
                    } catch (Throwable th4) {
                        vVar2 = vVar;
                        th = th4;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            if (vVar2 != null) {
                this.f173339v.k(vVar2);
            }
            throw th6;
        }
    }

    @Override // re.d
    public void clear() {
        synchronized (this.f173321d) {
            try {
                k();
                this.f173320c.c();
                a aVar = this.f173340w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                o();
                v<R> vVar = this.f173336s;
                if (vVar != null) {
                    this.f173336s = null;
                } else {
                    vVar = null;
                }
                if (l()) {
                    this.f173332o.d(s());
                }
                we.b.f("GlideRequest", this.f173318a);
                this.f173340w = aVar2;
                if (vVar != null) {
                    this.f173339v.k(vVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.h
    public void d(q qVar) {
        A(qVar, 5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // se.g
    public void e(int i15, int i16) throws Throwable {
        Object obj;
        i<R> iVar = this;
        iVar.f173320c.c();
        Object obj2 = iVar.f173321d;
        synchronized (obj2) {
            try {
                try {
                    boolean z15 = E;
                    if (z15) {
                        iVar.v("Got onSizeReady in " + ve.g.a(iVar.f173338u));
                    }
                    if (iVar.f173340w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        iVar.f173340w = aVar;
                        float fG = iVar.f173328k.G();
                        iVar.A = w(i15, fG);
                        iVar.B = w(i16, fG);
                        if (z15) {
                            iVar.v("finished setup for calling load in " + ve.g.a(iVar.f173338u));
                        }
                        try {
                            k kVar = iVar.f173339v;
                            com.bumptech.glide.d dVar = iVar.f173325h;
                            try {
                                Object obj3 = iVar.f173326i;
                                zd.f fVarF = iVar.f173328k.F();
                                try {
                                    int i17 = iVar.A;
                                    int i18 = iVar.B;
                                    Class<?> clsD = iVar.f173328k.D();
                                    Class<R> cls = iVar.f173327j;
                                    try {
                                        com.bumptech.glide.g gVar = iVar.f173331n;
                                        be.j jVarN = iVar.f173328k.n();
                                        Map<Class<?>, l<?>> mapI = iVar.f173328k.I();
                                        boolean zW = iVar.f173328k.W();
                                        boolean zR = iVar.f173328k.R();
                                        zd.h hVarV = iVar.f173328k.v();
                                        boolean zP = iVar.f173328k.P();
                                        boolean zK = iVar.f173328k.K();
                                        boolean zJ = iVar.f173328k.J();
                                        boolean zT = iVar.f173328k.t();
                                        Executor executor = iVar.f173335r;
                                        Object obj4 = obj2;
                                        try {
                                            iVar.f173337t = kVar.f(dVar, obj3, fVarF, i17, i18, clsD, cls, gVar, jVarN, mapI, zW, zR, hVarV, zP, zK, zJ, zT, iVar, executor);
                                            if (iVar.f173340w != aVar) {
                                                iVar.f173337t = null;
                                            }
                                            if (z15) {
                                                iVar.v("finished onSizeReady in " + ve.g.a(iVar.f173338u));
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj = obj2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = obj2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj = obj2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    obj = obj2;
                }
            } catch (Throwable th10) {
                th = th10;
                obj = iVar;
            }
        }
    }

    @Override // re.d
    public boolean f() {
        boolean z15;
        synchronized (this.f173321d) {
            z15 = this.f173340w == a.CLEARED;
        }
        return z15;
    }

    @Override // re.d
    public void g() {
        synchronized (this.f173321d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // re.h
    public Object h() {
        this.f173320c.c();
        return this.f173321d;
    }

    @Override // re.d
    public boolean i(d dVar) {
        int i15;
        int i16;
        Object obj;
        Class<R> cls;
        re.a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i17;
        int i18;
        Object obj2;
        Class<R> cls2;
        re.a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(dVar instanceof i)) {
            return false;
        }
        synchronized (this.f173321d) {
            try {
                i15 = this.f173329l;
                i16 = this.f173330m;
                obj = this.f173326i;
                cls = this.f173327j;
                aVar = this.f173328k;
                gVar = this.f173331n;
                List<f<R>> list = this.f173333p;
                size = list != null ? list.size() : 0;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        i iVar = (i) dVar;
        synchronized (iVar.f173321d) {
            try {
                i17 = iVar.f173329l;
                i18 = iVar.f173330m;
                obj2 = iVar.f173326i;
                cls2 = iVar.f173327j;
                aVar2 = iVar.f173328k;
                gVar2 = iVar.f173331n;
                List<f<R>> list2 = iVar.f173333p;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return i15 == i17 && i16 == i18 && ve.l.c(obj, obj2) && cls.equals(cls2) && ve.l.b(aVar, aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // re.d
    public boolean isRunning() {
        boolean z15;
        synchronized (this.f173321d) {
            try {
                a aVar = this.f173340w;
                z15 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15;
    }

    @Override // re.d
    public void j() {
        synchronized (this.f173321d) {
            try {
                k();
                this.f173320c.c();
                this.f173338u = ve.g.b();
                Object obj = this.f173326i;
                if (obj == null) {
                    if (ve.l.t(this.f173329l, this.f173330m)) {
                        this.A = this.f173329l;
                        this.B = this.f173330m;
                    }
                    A(new q("Received null model"), r() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f173340w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.f173336s, zd.a.MEMORY_CACHE, false);
                    return;
                }
                p(obj);
                this.f173318a = we.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f173340w = aVar3;
                if (ve.l.t(this.f173329l, this.f173330m)) {
                    e(this.f173329l, this.f173330m);
                } else {
                    this.f173332o.f(this);
                }
                a aVar4 = this.f173340w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m()) {
                    this.f173332o.c(s());
                }
                if (E) {
                    v("finished run method in " + ve.g.a(this.f173338u));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f173321d) {
            obj = this.f173326i;
            cls = this.f173327j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
