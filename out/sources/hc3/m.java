package hc3;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lhc3/m;", "Ll00/g;", "Lhc3/d;", "", "Lhc3/e;", "Lyy/a;", "stateMachineFactory", "Lic3/b;", "mapper", "<init>", "(Lyy/a;Lic3/b;)V", "state", "Lhc3/e$a;", "l9", "(Lhc3/d;)Lhc3/e$a;", "b", "Lic3/b;", "c", "Lhc3/d;", "initialState", "Lxw/b;", "Lhc3/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ic3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hc3.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f83279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f83280b;

        /* JADX INFO: renamed from: hc3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1917a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f83281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f83282b;

            /* JADX INFO: renamed from: hc3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1918a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f83283d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f83284e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f83285f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f83287h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f83288j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f83289k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f83290l;

                public C1918a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f83283d = obj;
                    this.f83284e |= PKIFailureInfo.systemUnavail;
                    return C1917a.this.F(null, this);
                }
            }

            public C1917a(mu.h hVar, m mVar) {
                this.f83281a = hVar;
                this.f83282b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1918a c1918a;
                if (eVar instanceof C1918a) {
                    c1918a = (C1918a) eVar;
                    int i15 = c1918a.f83284e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1918a.f83284e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1918a = new C1918a(eVar);
                    }
                } else {
                    c1918a = new C1918a(eVar);
                }
                Object obj2 = c1918a.f83283d;
                Object objE = uq.b.e();
                int i16 = c1918a.f83284e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f83281a;
                    e.Data dataL9 = this.f83282b.l9((d) obj);
                    c1918a.f83285f = vq.j.a(obj);
                    c1918a.f83287h = vq.j.a(c1918a);
                    c1918a.f83288j = vq.j.a(obj);
                    c1918a.f83289k = vq.j.a(hVar);
                    c1918a.f83290l = 0;
                    c1918a.f83284e = 1;
                    if (hVar.F(dataL9, c1918a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, m mVar) {
            this.f83279a = gVar;
            this.f83280b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f83279a.a(new C1917a(hVar, this.f83280b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhc3/c;", "action", "Lhc3/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhc3/c;Lhc3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<OnCardClick, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83292f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f83294a;

            static {
                int[] iArr = new int[jc3.a.values().length];
                try {
                    iArr[jc3.a.YOUR_TRIPS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[jc3.a.COUNTRIES_INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f83294a = iArr;
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r6.F(r2, r5) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r6.F(r2, r5) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f83292f
                hc3.c r0 = (hc3.OnCardClick) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f83291e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L12
                if (r2 != r3) goto L16
            L12:
                oq.u.b(r6)
                goto L5d
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                jc3.a r6 = r0.getCard()
                int[] r2 = hc3.m.b.a.f83294a
                int r6 = r6.ordinal()
                r6 = r2[r6]
                if (r6 == r4) goto L4a
                if (r6 != r3) goto L44
                hc3.m r6 = hc3.m.this
                hc3.a$b r2 = hc3.a.b.f83258a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f83292f = r0
                r5.f83291e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L5d
                goto L5c
            L44:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L4a:
                hc3.m r6 = hc3.m.this
                hc3.a$c r2 = hc3.a.c.f83259a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f83292f = r0
                r5.f83291e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L5d
            L5c:
                return r1
            L5d:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hc3.m.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCardClick onCardClick, d dVar, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f83292f = onCardClick;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhc3/b;", "<unused var>", "Lhc3/d;", "Loq/i0;", "<anonymous>", "(Lhc3/b;Lhc3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<hc3.b, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83295e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f83295e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                hc3.a.C1916a c1916a = hc3.a.C1916a.f83257a;
                this.f83295e = 1;
                if (mVar.F(c1916a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hc3.b bVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, ic3.b bVar) {
        this.mapper = bVar;
        d dVar = d.f83262a;
        this.initialState = dVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: hc3.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f83271a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(d state) {
        return this.mapper.b(new ic3.b.Params(state, new er.l() { // from class: hc3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f83273a, (jc3.a) obj);
            }
        }, b9(hc3.b.f83260a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, jc3.a aVar) {
        mVar.d9(new OnCardClick(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: hc3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f83272a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(OnCardClick.class), oVar, bVar);
        zVar.x(q0.c(hc3.b.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hc3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hc3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
