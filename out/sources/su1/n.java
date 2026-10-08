package su1;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou1.DrivingLicenceData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lsu1/n;", "Ll00/g;", "Lsu1/e;", "", "Lsu1/f;", "Ltu1/b;", "drivingLicenceHistoricDocumentMapper", "Lyy/a;", "stateMachineFactory", "Lsu1/d;", "data", "<init>", "(Ltu1/b;Lyy/a;Lsu1/d;)V", "state", "Lsu1/f$a;", "k9", "(Lsu1/e;)Lsu1/f$a;", "b", "Ltu1/b;", "c", "Lsu1/e;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsu1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tu1.b drivingLicenceHistoricDocumentMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<su1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f184404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f184405b;

        /* JADX INFO: renamed from: su1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4764a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f184406a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f184407b;

            /* JADX INFO: renamed from: su1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4765a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f184408d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f184409e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f184410f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f184412h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f184413j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f184414k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f184415l;

                public C4765a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f184408d = obj;
                    this.f184409e |= PKIFailureInfo.systemUnavail;
                    return C4764a.this.F(null, this);
                }
            }

            public C4764a(mu.h hVar, n nVar) {
                this.f184406a = hVar;
                this.f184407b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4765a c4765a;
                if (eVar instanceof C4765a) {
                    c4765a = (C4765a) eVar;
                    int i15 = c4765a.f184409e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4765a.f184409e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4765a = new C4765a(eVar);
                    }
                } else {
                    c4765a = new C4765a(eVar);
                }
                Object obj2 = c4765a.f184408d;
                Object objE = uq.b.e();
                int i16 = c4765a.f184409e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f184406a;
                    f.Data dataK9 = this.f184407b.k9((State) obj);
                    c4765a.f184410f = vq.j.a(obj);
                    c4765a.f184412h = vq.j.a(c4765a);
                    c4765a.f184413j = vq.j.a(obj);
                    c4765a.f184414k = vq.j.a(hVar);
                    c4765a.f184415l = 0;
                    c4765a.f184409e = 1;
                    if (hVar.F(dataK9, c4765a) == objE) {
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
            this.f184404a = gVar;
            this.f184405b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f184404a.a(new C4764a(hVar, this.f184405b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsu1/a;", "<unused var>", "Lsu1/e;", "Loq/i0;", "<anonymous>", "(Lsu1/a;Lsu1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<su1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184416e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f184416e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<su1.b> bVarY1 = n.this.Y1();
                su1.b.a aVar = su1.b.a.f184382a;
                this.f184416e = 1;
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
        public final Object w(su1.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsu1/c;", "action", "Lsu1/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsu1/c;Lsu1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OpenHistoricDocumentDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f184418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f184419f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenHistoricDocumentDetails openHistoricDocumentDetails = (OpenHistoricDocumentDetails) this.f184419f;
            Object objE = uq.b.e();
            int i15 = this.f184418e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<su1.b> bVarY1 = n.this.Y1();
                su1.b.GoToHistoricDocumentsDetails goToHistoricDocumentsDetails = new su1.b.GoToHistoricDocumentsDetails(openHistoricDocumentDetails.getPickedDocument());
                this.f184419f = vq.j.a(openHistoricDocumentDetails);
                this.f184418e = 1;
                if (bVarY1.F(goToHistoricDocumentsDetails, this) == objE) {
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
        public final Object w(OpenHistoricDocumentDetails openHistoricDocumentDetails, State state, tq.e<? super i0> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f184419f = openHistoricDocumentDetails;
            return cVar.J(i0.f148189a);
        }
    }

    public n(tu1.b bVar, yy.a aVar, SetupData setupData) {
        this.drivingLicenceHistoricDocumentMapper = bVar;
        State state = new State(null, setupData.a(), 1, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: su1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f184398a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(State state) {
        return this.drivingLicenceHistoricDocumentMapper.b(new tu1.b.Params(state, b9(su1.a.f184381a), new er.l() { // from class: su1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f184397a, (DrivingLicenceData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(n nVar, DrivingLicenceData drivingLicenceData) {
        nVar.d9(new OpenHistoricDocumentDetails(drivingLicenceData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: su1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f184396a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(su1.a.class), oVar, bVar);
        zVar.x(q0.c(OpenHistoricDocumentDetails.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<su1.b> Y1() {
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
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
