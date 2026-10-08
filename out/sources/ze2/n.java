package ze2;

import bf2.SetupData;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lze2/n;", "Ll00/g;", "Lze2/e;", "", "Lze2/f;", "Lyy/a;", "stateMachineFactory", "Laf2/b;", "mapper", "Lze2/d;", "setupData", "<init>", "(Lyy/a;Laf2/b;Lze2/d;)V", "state", "Lze2/f$a;", "l9", "(Lze2/e;)Lze2/f$a;", "b", "Laf2/b;", "c", "Lze2/d;", "getSetupData", "()Lze2/d;", "Lxw/b;", "Lze2/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "e", "Lze2/e;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final af2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ze2.a> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f234765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f234766b;

        /* JADX INFO: renamed from: ze2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6324a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f234767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f234768b;

            /* JADX INFO: renamed from: ze2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6325a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f234769d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f234770e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f234771f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f234773h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f234774j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f234775k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f234776l;

                public C6325a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f234769d = obj;
                    this.f234770e |= PKIFailureInfo.systemUnavail;
                    return C6324a.this.F(null, this);
                }
            }

            public C6324a(mu.h hVar, n nVar) {
                this.f234767a = hVar;
                this.f234768b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6325a c6325a;
                if (eVar instanceof C6325a) {
                    c6325a = (C6325a) eVar;
                    int i15 = c6325a.f234770e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6325a.f234770e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6325a = new C6325a(eVar);
                    }
                } else {
                    c6325a = new C6325a(eVar);
                }
                Object obj2 = c6325a.f234769d;
                Object objE = uq.b.e();
                int i16 = c6325a.f234770e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f234767a;
                    f.Data dataL9 = this.f234768b.l9((State) obj);
                    c6325a.f234771f = vq.j.a(obj);
                    c6325a.f234773h = vq.j.a(c6325a);
                    c6325a.f234774j = vq.j.a(obj);
                    c6325a.f234775k = vq.j.a(hVar);
                    c6325a.f234776l = 0;
                    c6325a.f234770e = 1;
                    if (hVar.F(dataL9, c6325a) == objE) {
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
            this.f234765a = gVar;
            this.f234766b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f234765a.a(new C6324a(hVar, this.f234766b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lze2/b;", "<unused var>", "Lze2/e;", "Loq/i0;", "<anonymous>", "(Lze2/b;Lze2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ze2.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234777e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234777e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                ze2.a.C6323a c6323a = ze2.a.C6323a.f234738a;
                this.f234777e = 1;
                if (nVar.F(c6323a, this) == objE) {
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
        public final Object w(ze2.b bVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze2/c;", "action", "Lze2/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze2/c;Lze2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnShowLocalization, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234780f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnShowLocalization onShowLocalization = (OnShowLocalization) this.f234780f;
            Object objE = uq.b.e();
            int i15 = this.f234779e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                ze2.a.ToLocalizationMap toLocalizationMap = new ze2.a.ToLocalizationMap(new SetupData(onShowLocalization.getCoordinates()));
                this.f234780f = vq.j.a(onShowLocalization);
                this.f234779e = 1;
                if (nVar.F(toLocalizationMap, this) == objE) {
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
        public final Object w(OnShowLocalization onShowLocalization, State state, tq.e<? super i0> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f234780f = onShowLocalization;
            return cVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, af2.b bVar, SetupData setupData) {
        this.mapper = bVar;
        this.setupData = setupData;
        State state = new State(setupData.getIncident());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ze2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f234758a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(State state) {
        return this.mapper.b(new af2.b.Params(state, b9(ze2.b.f234741a), new er.l() { // from class: ze2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f234757a, (Coordinates) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, Coordinates coordinates) {
        nVar.d9(new OnShowLocalization(coordinates));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ze2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f234756a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ze2.b.class), oVar, bVar);
        zVar.x(q0.c(OnShowLocalization.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ze2.a> Y1() {
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
    public /* bridge */ Object F(ze2.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
