package i72;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Li72/p;", "Ll00/g;", "Li72/e;", "", "Li72/f;", "Lyy/a;", "stateMachineFactory", "Li72/h;", "mapper", "Li72/d;", "setupData", "<init>", "(Lyy/a;Li72/h;Li72/d;)V", "state", "Li72/f$a;", "l9", "(Li72/e;)Li72/f$a;", "b", "Li72/h;", "c", "Li72/d;", "d", "Li72/e;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Li72/c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final VoivodeshipPickerNavigationParams setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i72.c> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f89897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f89898b;

        /* JADX INFO: renamed from: i72.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2131a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f89899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f89900b;

            /* JADX INFO: renamed from: i72.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2132a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f89901d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f89902e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f89903f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f89905h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f89906j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f89907k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f89908l;

                public C2132a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f89901d = obj;
                    this.f89902e |= PKIFailureInfo.systemUnavail;
                    return C2131a.this.F(null, this);
                }
            }

            public C2131a(mu.h hVar, p pVar) {
                this.f89899a = hVar;
                this.f89900b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2132a c2132a;
                if (eVar instanceof C2132a) {
                    c2132a = (C2132a) eVar;
                    int i15 = c2132a.f89902e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2132a.f89902e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2132a = new C2132a(eVar);
                    }
                } else {
                    c2132a = new C2132a(eVar);
                }
                Object obj2 = c2132a.f89901d;
                Object objE = uq.b.e();
                int i16 = c2132a.f89902e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f89899a;
                    f.Data dataL9 = this.f89900b.l9((State) obj);
                    c2132a.f89903f = vq.j.a(obj);
                    c2132a.f89905h = vq.j.a(c2132a);
                    c2132a.f89906j = vq.j.a(obj);
                    c2132a.f89907k = vq.j.a(hVar);
                    c2132a.f89908l = 0;
                    c2132a.f89902e = 1;
                    if (hVar.F(dataL9, c2132a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f89897a = gVar;
            this.f89898b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f89897a.a(new C2131a(hVar, this.f89898b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li72/b;", "<unused var>", "Li72/e;", "Loq/i0;", "<anonymous>", "(Li72/b;Li72/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i72.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89909e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89909e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                i72.c.a aVar = i72.c.a.f89870a;
                this.f89909e = 1;
                if (pVar.F(aVar, this) == objE) {
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
        public final Object w(i72.b bVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li72/a;", "action", "Li72/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li72/a;Li72/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ChooseVoivodeship, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89912f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ChooseVoivodeship chooseVoivodeship = (ChooseVoivodeship) this.f89912f;
            Object objE = uq.b.e();
            int i15 = this.f89911e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                i72.c.GoBackWithResult goBackWithResult = new i72.c.GoBackWithResult(chooseVoivodeship.getVoivodeship());
                this.f89912f = vq.j.a(chooseVoivodeship);
                this.f89911e = 1;
                if (pVar.F(goBackWithResult, this) == objE) {
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
        public final Object w(ChooseVoivodeship chooseVoivodeship, State state, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f89912f = chooseVoivodeship;
            return cVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, h hVar, VoivodeshipPickerNavigationParams voivodeshipPickerNavigationParams) {
        this.mapper = hVar;
        this.setupData = voivodeshipPickerNavigationParams;
        String selectedVoivodeship = voivodeshipPickerNavigationParams.getSelectedVoivodeship();
        State state = new State(selectedVoivodeship == null ? hVar.e() : selectedVoivodeship);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: i72.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f89890a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(State state) {
        return this.mapper.b(new h.Params(state, new er.l() { // from class: i72.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f89888a, (String) obj);
            }
        }, b9(i72.b.f89869a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(p pVar, String str) {
        pVar.d9(new ChooseVoivodeship(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: i72.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f89889a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i72.b.class), oVar, bVar);
        zVar.x(q0.c(ChooseVoivodeship.class), oVar, pVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i72.c> Y1() {
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
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(i72.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(VoivodeshipPickerNavigationParams voivodeshipPickerNavigationParams) {
        super.P5(voivodeshipPickerNavigationParams);
    }
}
