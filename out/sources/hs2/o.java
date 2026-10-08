package hs2;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qv0.Violation;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lhs2/o;", "Ll00/g;", "Lhs2/e;", "", "Lhs2/f;", "Lyy/a;", "stateMachineFactory", "Ljs2/c;", "violationDetailsMapper", "<init>", "(Lyy/a;Ljs2/c;)V", "state", "Lhs2/f$a;", "k9", "(Lhs2/e;)Lhs2/f$a;", "Lqv0/g;", "data", "Loq/i0;", "l9", "(Lqv0/g;)V", "b", "Ljs2/c;", "Lhs2/e$b;", "c", "Lhs2/e$b;", "initialState", "Lxw/b;", "Lhs2/b;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<e, Object> implements f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final js2.c violationDetailsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hs2.b> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f86562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f86563b;

        /* JADX INFO: renamed from: hs2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2021a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f86564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f86565b;

            /* JADX INFO: renamed from: hs2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2022a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f86566d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f86567e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f86568f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f86570h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f86571j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f86572k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f86573l;

                public C2022a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f86566d = obj;
                    this.f86567e |= PKIFailureInfo.systemUnavail;
                    return C2021a.this.F(null, this);
                }
            }

            public C2021a(mu.h hVar, o oVar) {
                this.f86564a = hVar;
                this.f86565b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2022a c2022a;
                if (eVar instanceof C2022a) {
                    c2022a = (C2022a) eVar;
                    int i15 = c2022a.f86567e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2022a.f86567e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2022a = new C2022a(eVar);
                    }
                } else {
                    c2022a = new C2022a(eVar);
                }
                Object obj2 = c2022a.f86566d;
                Object objE = uq.b.e();
                int i16 = c2022a.f86567e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f86564a;
                    f.a aVarK9 = this.f86565b.k9((e) obj);
                    c2022a.f86568f = vq.j.a(obj);
                    c2022a.f86570h = vq.j.a(c2022a);
                    c2022a.f86571j = vq.j.a(obj);
                    c2022a.f86572k = vq.j.a(hVar);
                    c2022a.f86573l = 0;
                    c2022a.f86567e = 1;
                    if (hVar.F(aVarK9, c2022a) == objE) {
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
            this.f86562a = gVar;
            this.f86563b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.a> hVar, tq.e eVar) {
            Object objA = this.f86562a.a(new C2021a(hVar, this.f86563b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhs2/a;", "<unused var>", "Lhs2/e;", "Loq/i0;", "<anonymous>", "(Lhs2/a;Lhs2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<hs2.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86574e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f86574e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<hs2.b> bVarY1 = o.this.Y1();
                hs2.b.a aVar = hs2.b.a.f86536a;
                this.f86574e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(hs2.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return o.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhs2/d;", "<unused var>", "Lhs2/e;", "Loq/i0;", "<anonymous>", "(Lhs2/d;Lhs2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<hs2.d, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86576e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f86576e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<hs2.b> bVarY1 = o.this.Y1();
                hs2.b.C2019b c2019b = hs2.b.C2019b.f86537a;
                this.f86576e = 1;
                if (bVarY1.F(c2019b, this) == objE) {
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
        public final Object w(hs2.d dVar, e eVar, tq.e<? super i0> eVar2) {
            return o.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhs2/c;", "action", "Lk10/c0;", "Lhs2/e$b;", "state", "Lk10/l;", "Lhs2/e;", "<anonymous>", "(Lhs2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SetupViolationData, c0<e.b>, tq.e<? super k10.l<? extends e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86580g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e.DataSet O(SetupViolationData setupViolationData, e.b bVar) {
            return new e.DataSet(setupViolationData.getViolation());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetupViolationData setupViolationData = (SetupViolationData) this.f86579f;
            c0 c0Var = (c0) this.f86580g;
            uq.b.e();
            if (this.f86578e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: hs2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O(setupViolationData, (e.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetupViolationData setupViolationData, c0<e.b> c0Var, tq.e<? super k10.l<? extends e>> eVar) {
            d dVar = new d(eVar);
            dVar.f86579f = setupViolationData;
            dVar.f86580g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, js2.c cVar) {
        this.violationDetailsMapper = cVar;
        e.b bVar = e.b.f86541a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: hs2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f86555a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.a k9(e state) {
        return this.violationDetailsMapper.b(new js2.c.Params(state, b9(hs2.a.f86535a), b9(hs2.d.f86539a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final o oVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: hs2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.n9(this.f86556a, (z) obj);
            }
        });
        vVar.c(q0.c(e.b.class), new er.l() { // from class: hs2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hs2.a.class), oVar2, bVar);
        zVar.x(q0.c(hs2.d.class), oVar2, oVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(SetupViolationData.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hs2.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public void P5(Violation data) {
        d9(new SetupViolationData(data));
    }
}
