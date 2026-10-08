package kj3;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mj3.AbroadListPayload;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tj3.AbroadDetailsPayload;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lkj3/o;", "Ll00/g;", "Lkj3/e;", "", "Lkj3/f;", "Llj3/b;", "vehicleHistoryAbroadListMapper", "Lf01/b;", "launchNativeRatingUC", "Lyy/a;", "stateMachineFactory", "Lmj3/a;", "payload", "<init>", "(Llj3/b;Lf01/b;Lyy/a;Lmj3/a;)V", "state", "Lkj3/f$a;", "l9", "(Lkj3/e;)Lkj3/f$a;", "b", "Llj3/b;", "c", "Lf01/b;", "d", "Lmj3/a;", "e", "Lkj3/e;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lkj3/b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lj3.b vehicleHistoryAbroadListMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbroadListPayload payload;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kj3.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f111260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f111261b;

        /* JADX INFO: renamed from: kj3.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2682a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f111262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f111263b;

            /* JADX INFO: renamed from: kj3.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2683a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f111264d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f111265e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f111266f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f111268h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f111269j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f111270k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f111271l;

                public C2683a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f111264d = obj;
                    this.f111265e |= PKIFailureInfo.systemUnavail;
                    return C2682a.this.F(null, this);
                }
            }

            public C2682a(mu.h hVar, o oVar) {
                this.f111262a = hVar;
                this.f111263b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2683a c2683a;
                if (eVar instanceof C2683a) {
                    c2683a = (C2683a) eVar;
                    int i15 = c2683a.f111265e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2683a.f111265e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2683a = new C2683a(eVar);
                    }
                } else {
                    c2683a = new C2683a(eVar);
                }
                Object obj2 = c2683a.f111264d;
                Object objE = uq.b.e();
                int i16 = c2683a.f111265e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f111262a;
                    f.Data dataL9 = this.f111263b.l9((State) obj);
                    c2683a.f111266f = vq.j.a(obj);
                    c2683a.f111268h = vq.j.a(c2683a);
                    c2683a.f111269j = vq.j.a(obj);
                    c2683a.f111270k = vq.j.a(hVar);
                    c2683a.f111271l = 0;
                    c2683a.f111265e = 1;
                    if (hVar.F(dataL9, c2683a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f111260a = gVar;
            this.f111261b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f111260a.a(new C2682a(hVar, this.f111261b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkj3/a;", "<unused var>", "Lkj3/e;", "Loq/i0;", "<anonymous>", "(Lkj3/a;Lkj3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<kj3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111272e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.c(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f111272e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                kj3.o r5 = kj3.o.this
                xw.b r5 = r5.Y1()
                kj3.b$b r1 = kj3.b.C2681b.f111231a
                r4.f111272e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                kj3.o r5 = kj3.o.this
                f01.b r5 = kj3.o.j9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f111272e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kj3.o.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kj3.a aVar, State state, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkj3/c;", "action", "Lkj3/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkj3/c;Lkj3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ShowDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f111275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f111277h;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowDetails showDetails = (ShowDetails) this.f111277h;
            Object objE = uq.b.e();
            int i15 = this.f111276g;
            if (i15 == 0) {
                u.b(obj);
                tj3.b.ServiceNoData error = showDetails.getAbroadDetailsPayload().getError();
                kj3.b abroadNoData = error != null ? new kj3.b.AbroadNoData(error) : new kj3.b.Details(showDetails.getAbroadDetailsPayload());
                xw.b<kj3.b> bVarY1 = o.this.Y1();
                this.f111277h = vq.j.a(showDetails);
                this.f111274e = vq.j.a(abroadNoData);
                this.f111275f = 0;
                this.f111276g = 1;
                if (bVarY1.F(abroadNoData, this) == objE) {
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
        public final Object w(ShowDetails showDetails, State state, tq.e<? super i0> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f111277h = showDetails;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkj3/d;", "<unused var>", "Lkj3/e;", "Loq/i0;", "<anonymous>", "(Lkj3/d;Lkj3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kj3.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111279e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111279e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<kj3.b> bVarY1 = o.this.Y1();
                kj3.b.d dVar = kj3.b.d.f111233a;
                this.f111279e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(kj3.d dVar, State state, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    public o(lj3.b bVar, f01.b bVar2, yy.a aVar, AbroadListPayload abroadListPayload) {
        this.vehicleHistoryAbroadListMapper = bVar;
        this.launchNativeRatingUC = bVar2;
        this.payload = abroadListPayload;
        State state = new State(false, abroadListPayload.getShowImportantInfo(), abroadListPayload.a(), 1, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: kj3.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f111252a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(State state) {
        return this.vehicleHistoryAbroadListMapper.b(new lj3.b.Params(state, b9(kj3.a.f111229a), new er.l() { // from class: kj3.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f111251a, (AbroadDetailsPayload) obj);
            }
        }, b9(kj3.d.f111235a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(o oVar, AbroadDetailsPayload abroadDetailsPayload) {
        oVar.d9(new ShowDetails(abroadDetailsPayload));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: kj3.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f111250a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(kj3.a.class), oVar2, bVar);
        zVar.x(q0.c(ShowDetails.class), oVar2, oVar.new c(null));
        zVar.x(q0.c(kj3.d.class), oVar2, oVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<kj3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AbroadListPayload abroadListPayload) {
        super.P5(abroadListPayload);
    }
}
