package j91;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lj91/l;", "Ll00/g;", "Lj91/c;", "", "Lj91/d;", "Lyy/a;", "stateMachineFactory", "Lk91/b;", "mapper", "Ll91/a;", "setupData", "<init>", "(Lyy/a;Lk91/b;Ll91/a;)V", "state", "Lj91/d$a;", "l9", "(Lj91/c;)Lj91/d$a;", "b", "Lk91/b;", "c", "Ll91/a;", "d", "Lj91/c;", "initialState", "Lxw/b;", "Lj91/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k91.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l91.a setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j91.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f100439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f100440b;

        /* JADX INFO: renamed from: j91.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2358a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f100441a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f100442b;

            /* JADX INFO: renamed from: j91.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2359a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f100443d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100444e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f100445f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f100447h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f100448j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f100449k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f100450l;

                public C2359a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100443d = obj;
                    this.f100444e |= PKIFailureInfo.systemUnavail;
                    return C2358a.this.F(null, this);
                }
            }

            public C2358a(mu.h hVar, l lVar) {
                this.f100441a = hVar;
                this.f100442b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2359a c2359a;
                if (eVar instanceof C2359a) {
                    c2359a = (C2359a) eVar;
                    int i15 = c2359a.f100444e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2359a.f100444e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2359a = new C2359a(eVar);
                    }
                } else {
                    c2359a = new C2359a(eVar);
                }
                Object obj2 = c2359a.f100443d;
                Object objE = uq.b.e();
                int i16 = c2359a.f100444e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f100441a;
                    d.Data dataL9 = this.f100442b.l9((State) obj);
                    c2359a.f100445f = vq.j.a(obj);
                    c2359a.f100447h = vq.j.a(c2359a);
                    c2359a.f100448j = vq.j.a(obj);
                    c2359a.f100449k = vq.j.a(hVar);
                    c2359a.f100450l = 0;
                    c2359a.f100444e = 1;
                    if (hVar.F(dataL9, c2359a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f100439a = gVar;
            this.f100440b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f100439a.a(new C2358a(hVar, this.f100440b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj91/b;", "action", "Lj91/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj91/b;Lj91/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<j91.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100452f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j91.b bVar = (j91.b) this.f100452f;
            Object objE = uq.b.e();
            int i15 = this.f100451e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<j91.b> bVarY1 = l.this.Y1();
                this.f100452f = vq.j.a(bVar);
                this.f100451e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(j91.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = l.this.new b(eVar);
            bVar2.f100452f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj91/a;", "action", "Lj91/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lj91/a;Lj91/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<DiscountPicked, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100455f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f100457a;

            static {
                int[] iArr = new int[i61.l.values().length];
                try {
                    iArr[i61.l.SCHOOL_AGED_CHILDREN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i61.l.TEMPORARY_PASSPORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i61.l.KDR_OWNERS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i61.l.TECHNICAL_ISSUE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i61.l.CHILD_TREATED_ABROAD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f100457a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        
            if (r9.F(r2, r8) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        
            if (r9.F(r2, r8) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        
            if (r9.F(r2, r8) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
        
            if (r9.F(r2, r8) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f100455f
                j91.a r0 = (j91.DiscountPicked) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f100454e
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L25
                if (r2 == r6) goto L18
                if (r2 == r5) goto L18
                if (r2 == r4) goto L18
                if (r2 != r3) goto L1d
            L18:
                oq.u.b(r9)
                goto Lb3
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                oq.u.b(r9)
                j91.l r9 = j91.l.this
                l91.a r9 = j91.l.j9(r9)
                l91.a$a r2 = new l91.a$a
                i61.l r7 = r0.getDiscountType()
                r2.<init>(r7)
                r9.R1(r2)
                i61.l r9 = r0.getDiscountType()
                int[] r2 = j91.l.c.a.f100457a
                int r9 = r9.ordinal()
                r9 = r2[r9]
                if (r9 == r6) goto L9c
                if (r9 == r5) goto L9c
                if (r9 == r4) goto L85
                if (r9 == r3) goto L6e
                r2 = 5
                if (r9 != r2) goto L68
                j91.l r9 = j91.l.this
                xw.b r9 = r9.Y1()
                j91.b$c r2 = j91.b.c.f100415a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f100455f = r0
                r8.f100454e = r3
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto Lb3
                goto Lb2
            L68:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            L6e:
                j91.l r9 = j91.l.this
                xw.b r9 = r9.Y1()
                j91.b$e r2 = j91.b.e.f100417a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f100455f = r0
                r8.f100454e = r4
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto Lb3
                goto Lb2
            L85:
                j91.l r9 = j91.l.this
                xw.b r9 = r9.Y1()
                j91.b$d r2 = j91.b.d.f100416a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f100455f = r0
                r8.f100454e = r5
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto Lb3
                goto Lb2
            L9c:
                j91.l r9 = j91.l.this
                xw.b r9 = r9.Y1()
                j91.b$f r2 = j91.b.f.f100418a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f100455f = r0
                r8.f100454e = r6
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto Lb3
            Lb2:
                return r1
            Lb3:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: j91.l.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(DiscountPicked discountPicked, State state, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f100455f = discountPicked;
            return cVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, k91.b bVar, l91.a aVar2) {
        this.mapper = bVar;
        this.setupData = aVar2;
        State state = new State(aVar2.r2().getPassportTypeWithPlace());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: j91.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f100432a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(State state) {
        return this.mapper.b(new k91.b.Params(state, b9(j91.b.a.f100413a), b9(j91.b.C2357b.f100414a), new er.l() { // from class: j91.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f100430a, (i61.l) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, i61.l lVar2) {
        lVar.d9(new DiscountPicked(lVar2));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: j91.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f100431a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(j91.b.class), oVar, bVar);
        zVar.x(q0.c(DiscountPicked.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<j91.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(l91.a aVar) {
        super.P5(aVar);
    }
}
