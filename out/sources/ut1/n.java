package ut1;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lut1/n;", "Ll00/g;", "Lut1/f;", "", "Lut1/g;", "Lyy/a;", "stateMachineFactory", "Lut1/h;", "mapper", "Lut1/e;", "setupData", "<init>", "(Lyy/a;Lut1/h;Lut1/e;)V", "state", "Lut1/g$a;", "l9", "(Lut1/f;)Lut1/g$a;", "b", "Lut1/h;", "c", "Lut1/e;", "d", "Lut1/f;", "initialState", "Lxw/b;", "Lut1/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f201371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f201372b;

        /* JADX INFO: renamed from: ut1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5231a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f201373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f201374b;

            /* JADX INFO: renamed from: ut1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5232a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f201375d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f201376e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f201377f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f201379h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f201380j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f201381k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f201382l;

                public C5232a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f201375d = obj;
                    this.f201376e |= PKIFailureInfo.systemUnavail;
                    return C5231a.this.F(null, this);
                }
            }

            public C5231a(mu.h hVar, n nVar) {
                this.f201373a = hVar;
                this.f201374b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5232a c5232a;
                if (eVar instanceof C5232a) {
                    c5232a = (C5232a) eVar;
                    int i15 = c5232a.f201376e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5232a.f201376e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5232a = new C5232a(eVar);
                    }
                } else {
                    c5232a = new C5232a(eVar);
                }
                Object obj2 = c5232a.f201375d;
                Object objE = uq.b.e();
                int i16 = c5232a.f201376e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f201373a;
                    g.Data dataL9 = this.f201374b.l9((State) obj);
                    c5232a.f201377f = vq.j.a(obj);
                    c5232a.f201379h = vq.j.a(c5232a);
                    c5232a.f201380j = vq.j.a(obj);
                    c5232a.f201381k = vq.j.a(hVar);
                    c5232a.f201382l = 0;
                    c5232a.f201376e = 1;
                    if (hVar.F(dataL9, c5232a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f201371a = gVar;
            this.f201372b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f201371a.a(new C5231a(hVar, this.f201372b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lut1/c;", "<unused var>", "Lut1/f;", "Loq/i0;", "<anonymous>", "(Lut1/c;Lut1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f201383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f201384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f201385g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f201387a;

            static {
                int[] iArr = new int[kt1.c.values().length];
                try {
                    iArr[kt1.c.ID_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kt1.c.PASSPORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kt1.c.DRIVING_LICENCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f201387a = iArr;
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (r6.F(r1, r5) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            if (r1.F(r2, r5) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            if (r6.F(r1, r5) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f201385g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L11
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
            L11:
                oq.u.b(r6)
                goto L82
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r0 = r5.f201383e
                al0.o r0 = (al0.BankRestrictionPassport) r0
                goto L11
            L22:
                oq.u.b(r6)
                ut1.n r6 = ut1.n.this
                ut1.e r6 = ut1.n.i9(r6)
                kt1.c r6 = r6.getRestrictedDocumentType()
                int[] r1 = ut1.n.b.a.f201387a
                int r6 = r6.ordinal()
                r6 = r1[r6]
                if (r6 == r4) goto L75
                if (r6 == r3) goto L50
                if (r6 != r2) goto L4a
                ut1.n r6 = ut1.n.this
                ut1.d$a r1 = ut1.d.a.f201345a
                r5.f201385g = r2
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L82
                goto L81
            L4a:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L50:
                ut1.n r6 = ut1.n.this
                ut1.e r6 = ut1.n.i9(r6)
                al0.o r6 = r6.getPassport()
                if (r6 == 0) goto L82
                ut1.n r1 = ut1.n.this
                ut1.d$c r2 = new ut1.d$c
                r2.<init>(r6)
                java.lang.Object r6 = vq.j.a(r6)
                r5.f201383e = r6
                r6 = 0
                r5.f201384f = r6
                r5.f201385g = r3
                java.lang.Object r6 = r1.F(r2, r5)
                if (r6 != r0) goto L82
                goto L81
            L75:
                ut1.n r6 = ut1.n.this
                ut1.d$b r1 = ut1.d.b.f201346a
                r5.f201385g = r4
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L82
            L81:
                return r0
            L82:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ut1.n.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c cVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, h hVar, SetupData setupData) {
        this.mapper = hVar;
        this.setupData = setupData;
        State state = new State(setupData.getTitle(), setupData.getDescription());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ut1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f201364a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data l9(State state) {
        return this.mapper.b(new h.Params(state, b9(c.f201344a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ut1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f201363a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
