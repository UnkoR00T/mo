package uu1;

import fr.q0;
import k10.v;
import k10.z;
import mu.b0;
import mu.p0;
import mu.r0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou1.DrivingLicenceData;
import p071kotlin.Metadata;
import w20.BaseDocumentScreenState;
import wu1.TextData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u0011\u001a\u0004\b+\u0010,R&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170/8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\u0011\u001a\u0004\b2\u00103R&\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001206058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010?\u001a\b\u0012\u0004\u0012\u00020<058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:¨\u0006@"}, d2 = {"Luu1/q;", "Ll00/g;", "Luu1/c;", "", "Luu1/e;", "Lvu1/b;", "drivingLicenceHistoricDocumentDetailsMapper", "Lmx/c;", "labelProvider", "Lyy/a;", "stateMachineFactory", "Lou1/f;", "scope", "<init>", "(Lvu1/b;Lmx/c;Lyy/a;Lou1/f;)V", "Loq/i0;", "p9", "()V", "Lwu1/b;", "data", "q9", "(Lwu1/b;)V", "state", "Luu1/e$a;", "n9", "(Luu1/c;)Luu1/e$a;", "b", "Lvu1/b;", "c", "Lmx/c;", "d", "Luu1/c;", "initialState", "Lxw/b;", "Luu1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lmu/b0;", "Lg20/a;", "h", "Lmu/b0;", "l9", "()Lmu/b0;", "bottomSheetState", "Lw20/a;", "j", "m9", "screenState", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vu1.b drivingLicenceHistoricDocumentDetailsMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uu1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b0<g20.a<TextData>> bottomSheetState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b0<BaseDocumentScreenState> screenState;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, q.class, "onBottomSheetClosed", "onBottomSheetClosed()V", 0);
        }

        public final void E() {
            ((q) this.f66391b).p9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f201492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f201493b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f201494a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f201495b;

            /* JADX INFO: renamed from: uu1.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5233a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f201496d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f201497e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f201498f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f201500h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f201501j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f201502k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f201503l;

                public C5233a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f201496d = obj;
                    this.f201497e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f201494a = hVar;
                this.f201495b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5233a c5233a;
                if (eVar instanceof C5233a) {
                    c5233a = (C5233a) eVar;
                    int i15 = c5233a.f201497e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5233a.f201497e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5233a = new C5233a(eVar);
                    }
                } else {
                    c5233a = new C5233a(eVar);
                }
                Object obj2 = c5233a.f201496d;
                Object objE = uq.b.e();
                int i16 = c5233a.f201497e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f201494a;
                    e.Data dataN9 = this.f201495b.n9((State) obj);
                    c5233a.f201498f = vq.j.a(obj);
                    c5233a.f201500h = vq.j.a(c5233a);
                    c5233a.f201501j = vq.j.a(obj);
                    c5233a.f201502k = vq.j.a(hVar);
                    c5233a.f201503l = 0;
                    c5233a.f201497e = 1;
                    if (hVar.F(dataN9, c5233a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f201492a = gVar;
            this.f201493b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f201492a.a(new a(hVar, this.f201493b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luu1/a;", "<unused var>", "Luu1/c;", "Loq/i0;", "<anonymous>", "(Luu1/a;Luu1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<uu1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f201504e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f201504e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<uu1.b> bVarY1 = q.this.Y1();
                uu1.b.a aVar = uu1.b.a.f201463a;
                this.f201504e = 1;
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
        public final Object w(uu1.a aVar, State state, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    public q(vu1.b bVar, mx.c cVar, yy.a aVar, DrivingLicenceData drivingLicenceData) {
        this.drivingLicenceHistoricDocumentDetailsMapper = bVar;
        this.labelProvider = cVar;
        State state = new State(drivingLicenceData);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: uu1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f201483a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), n9(state));
        this.bottomSheetState = r0.a(g20.a.C1572a.f69798a);
        this.screenState = r0.a(new BaseDocumentScreenState(null, c70.a.f23835a.a().m(), null, null, 5, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data n9(final State state) {
        return this.drivingLicenceHistoricDocumentDetailsMapper.b(new vu1.b.Params(state, new er.a() { // from class: uu1.n
            @Override // er.a
            public final Object a() {
                return q.o9(this.f201480a, state);
            }
        }, b9(uu1.a.f201462a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public static final i0 o9(q qVar, State state) {
        Label labelC;
        Label labelC2 = qVar.labelProvider.c(iu1.a.K);
        String strH = state.getPickedDocument().getScope().getData().h();
        if (strH == null) {
            labelC = qVar.labelProvider.c(iu1.a.K0);
        } else {
            if (strH.length() == 0) {
                strH = null;
            }
            if (strH == null || (labelC = mx.b.b(strH, "bottomSheetContent")) == null) {
                labelC = qVar.labelProvider.c(iu1.a.K0);
            }
        }
        qVar.q9(new TextData(labelC2, labelC, new a(qVar)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p9() {
        T().setValue(g20.a.C1572a.f69798a);
    }

    private final void q9(TextData data) {
        T().setValue(new g20.a.Expanded(data));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final q qVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: uu1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f201482a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        zVar.x(q0.c(uu1.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<uu1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // uu1.e
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public b0<g20.a<TextData>> T() {
        return this.bottomSheetState;
    }

    @Override // uu1.e
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public b0<BaseDocumentScreenState> L8() {
        return this.screenState;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DrivingLicenceData drivingLicenceData) {
        super.P5(drivingLicenceData);
    }
}
