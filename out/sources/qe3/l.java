package qe3;

import er.p;
import er.q;
import fr.q0;
import iy.b0;
import iy.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import se3.InsuranceDetailsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lqe3/l;", "Ll00/g;", "Lqe3/c;", "", "Lqe3/d;", "Lyy/a;", "stateMachineFactory", "Lre3/b;", "mapper", "La14/d;", "copyToClipboardUseCase", "Lse3/a;", "setupData", "<init>", "(Lyy/a;Lre3/b;La14/d;Lse3/a;)V", "Lqe3/d$a;", "l9", "(Lqe3/c;)Lqe3/d$a;", "b", "Lre3/b;", "c", "La14/d;", "d", "Lse3/a;", "e", "Lqe3/c;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqe3/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final re3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InsuranceDetailsData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qe3.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f166285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f166286b;

        /* JADX INFO: renamed from: qe3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4169a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f166287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f166288b;

            /* JADX INFO: renamed from: qe3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4170a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f166289d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166290e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f166291f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f166293h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f166294j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f166295k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f166296l;

                public C4170a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f166289d = obj;
                    this.f166290e |= PKIFailureInfo.systemUnavail;
                    return C4169a.this.F(null, this);
                }
            }

            public C4169a(mu.h hVar, l lVar) {
                this.f166287a = hVar;
                this.f166288b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4170a c4170a;
                if (eVar instanceof C4170a) {
                    c4170a = (C4170a) eVar;
                    int i15 = c4170a.f166290e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4170a.f166290e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4170a = new C4170a(eVar);
                    }
                } else {
                    c4170a = new C4170a(eVar);
                }
                Object obj2 = c4170a.f166289d;
                Object objE = uq.b.e();
                int i16 = c4170a.f166290e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f166287a;
                    d.Data dataL9 = this.f166288b.l9((State) obj);
                    c4170a.f166291f = vq.j.a(obj);
                    c4170a.f166293h = vq.j.a(c4170a);
                    c4170a.f166294j = vq.j.a(obj);
                    c4170a.f166295k = vq.j.a(hVar);
                    c4170a.f166296l = 0;
                    c4170a.f166290e = 1;
                    if (hVar.F(dataL9, c4170a) == objE) {
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
            this.f166285a = gVar;
            this.f166286b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f166285a.a(new C4169a(hVar, this.f166286b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqe3/a;", "action", "Lqe3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqe3/a;Lqe3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<qe3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166298f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qe3.a aVar = (qe3.a) this.f166298f;
            Object objE = uq.b.e();
            int i15 = this.f166297e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<qe3.a> bVarY1 = l.this.Y1();
                this.f166298f = vq.j.a(aVar);
                this.f166297e = 1;
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
        public final Object w(qe3.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f166298f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqe3/b;", "action", "Lqe3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqe3/b;Lqe3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<OnCopyToClipboard, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166301f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnCopyToClipboard onCopyToClipboard = (OnCopyToClipboard) this.f166301f;
            Object objE = uq.b.e();
            int i15 = this.f166300e;
            if (i15 == 0) {
                u.b(obj);
                a14.d dVar = l.this.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(onCopyToClipboard.getValue(), onCopyToClipboard.getLabel());
                this.f166301f = vq.j.a(onCopyToClipboard);
                this.f166300e = 1;
                if (dVar.c(params, this) == objE) {
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
        public final Object w(OnCopyToClipboard onCopyToClipboard, State state, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f166301f = onCopyToClipboard;
            return cVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, re3.b bVar, a14.d dVar, InsuranceDetailsData insuranceDetailsData) {
        this.mapper = bVar;
        this.copyToClipboardUseCase = dVar;
        this.setupData = insuranceDetailsData;
        State state = new State(insuranceDetailsData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: qe3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f166277a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(State state) {
        return this.mapper.b(new re3.b.Params(state, b9(qe3.a.C4168a.f166263a), new p() { // from class: qe3.i
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return l.m9(this.f166275a, (b0) obj, (Label) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, b0 b0Var, Label label) {
        lVar.d9(new OnCopyToClipboard(c0.e(b0Var), label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qe3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f166276a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qe3.a.class), oVar, bVar);
        zVar.x(q0.c(OnCopyToClipboard.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qe3.a> Y1() {
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
    public /* bridge */ void P5(InsuranceDetailsData insuranceDetailsData) {
        super.P5(insuranceDetailsData);
    }
}
