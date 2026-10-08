package oj1;

import fr.q0;
import java.time.OffsetDateTime;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zp0.DefenceTrainingDay;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u0010?¨\u0006A"}, d2 = {"Loj1/s;", "Ll00/g;", "Loj1/i;", "", "Loj1/j;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lpj1/a;", "mapper", "La14/o;", "goToMapIntentUC", "snackBarManagerStateHolder", "La14/a;", "addEventToCalendarUseCase", "Loj1/h;", "setupData", "<init>", "(Lyy/a;Lpj1/a;La14/o;Li70/n;La14/a;Loj1/h;)V", "state", "Loj1/j$a;", "n9", "(Loj1/i;)Loj1/j$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lpj1/a;", "c", "La14/o;", "d", "Li70/n;", "e", "La14/a;", "f", "Loj1/h;", "g", "Loj1/i;", "initialState", "Lxw/b;", "Loj1/f;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<State, Object> implements j, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pj1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.o goToMapIntentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.a addEventToCalendarUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<f> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<j.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f146333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f146334b;

        /* JADX INFO: renamed from: oj1.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3636a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f146335a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f146336b;

            /* JADX INFO: renamed from: oj1.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3637a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f146337d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f146338e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f146339f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f146341h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f146342j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f146343k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f146344l;

                public C3637a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f146337d = obj;
                    this.f146338e |= PKIFailureInfo.systemUnavail;
                    return C3636a.this.F(null, this);
                }
            }

            public C3636a(mu.h hVar, s sVar) {
                this.f146335a = hVar;
                this.f146336b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3637a c3637a;
                if (eVar instanceof C3637a) {
                    c3637a = (C3637a) eVar;
                    int i15 = c3637a.f146338e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3637a.f146338e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3637a = new C3637a(eVar);
                    }
                } else {
                    c3637a = new C3637a(eVar);
                }
                Object obj2 = c3637a.f146337d;
                Object objE = uq.b.e();
                int i16 = c3637a.f146338e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f146335a;
                    j.Data dataN9 = this.f146336b.n9((State) obj);
                    c3637a.f146339f = vq.j.a(obj);
                    c3637a.f146341h = vq.j.a(c3637a);
                    c3637a.f146342j = vq.j.a(obj);
                    c3637a.f146343k = vq.j.a(hVar);
                    c3637a.f146344l = 0;
                    c3637a.f146338e = 1;
                    if (hVar.F(dataN9, c3637a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, s sVar) {
            this.f146333a = gVar;
            this.f146334b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.Data> hVar, tq.e eVar) {
            Object objA = this.f146333a.a(new C3636a(hVar, this.f146334b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loj1/e;", "<unused var>", "Loj1/i;", "Loq/i0;", "<anonymous>", "(Loj1/e;Loj1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<oj1.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146345e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146345e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                f.a aVar = f.a.f146307a;
                this.f146345e = 1;
                if (sVar.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oj1.e eVar, State state, tq.e<? super i0> eVar2) {
            return s.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loj1/g;", "<unused var>", "Loj1/i;", "state", "Loq/i0;", "<anonymous>", "(Loj1/g;Loj1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146348f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f146348f;
            Object objE = uq.b.e();
            int i15 = this.f146347e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.o oVar = s.this.goToMapIntentUC;
                a14.o.a.ByCoordinates byCoordinates = new a14.o.a.ByCoordinates(state.getRegistered().getUnit().getCoordinates(), state.getRegistered().getUnit().getName());
                this.f146348f = vq.j.a(state);
                this.f146347e = 1;
                obj = oVar.c(byCoordinates, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            s sVar = s.this;
            if (iVar instanceof dx.i.Left) {
                sVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(g gVar, State state, tq.e<? super i0> eVar) {
            c cVar = s.this.new c(eVar);
            cVar.f146348f = state;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loj1/g;", "<unused var>", "Loj1/i;", "state", "Loq/i0;", "<anonymous>", "(Loj1/g;Loj1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146351f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f146351f;
            Object objE = uq.b.e();
            int i15 = this.f146350e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.o oVar = s.this.goToMapIntentUC;
                a14.o.a.ByCoordinates byCoordinates = new a14.o.a.ByCoordinates(state.getRegistered().getUnit().getCoordinates(), state.getRegistered().getUnit().getName());
                this.f146351f = vq.j.a(state);
                this.f146350e = 1;
                obj = oVar.c(byCoordinates, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            s sVar = s.this;
            if (iVar instanceof dx.i.Left) {
                sVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(g gVar, State state, tq.e<? super i0> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f146351f = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loj1/d;", "<unused var>", "Loj1/i;", "state", "Loq/i0;", "<anonymous>", "(Loj1/d;Loj1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<oj1.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146354f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fz.b.OffsetDateTime endDate;
            OffsetDateTime date;
            fz.b.OffsetDateTime startDate;
            OffsetDateTime date2;
            State state = (State) this.f146354f;
            Object objE = uq.b.e();
            int i15 = this.f146353e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.a aVar = s.this.addEventToCalendarUseCase;
                String name = state.getRegistered().getTraining().getName();
                DefenceTrainingDay defenceTrainingDay = (DefenceTrainingDay) pq.v.n0(state.getRegistered().getTraining().a());
                long jK = (defenceTrainingDay == null || (startDate = defenceTrainingDay.getStartDate()) == null || (date2 = startDate.getDate()) == null) ? 0L : ez.d.k(date2);
                DefenceTrainingDay defenceTrainingDay2 = (DefenceTrainingDay) pq.v.z0(state.getRegistered().getTraining().a());
                a14.a.Params params = new a14.a.Params(name, jK, (defenceTrainingDay2 == null || (endDate = defenceTrainingDay2.getEndDate()) == null || (date = endDate.getDate()) == null) ? null : vq.b.f(ez.d.k(date)), false, null, state.getRegistered().getUnit().getAddress(), 16, null);
                this.f146354f = vq.j.a(state);
                this.f146353e = 1;
                obj = aVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            s sVar = s.this;
            if (iVar instanceof dx.i.Left) {
                sVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oj1.d dVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f146354f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, pj1.a aVar2, a14.o oVar, i70.n nVar, a14.a aVar3, SetupData setupData) {
        this.mapper = aVar2;
        this.goToMapIntentUC = oVar;
        this.snackBarManagerStateHolder = nVar;
        this.addEventToCalendarUseCase = aVar3;
        this.setupData = setupData;
        State state = new State(setupData.getRegistered());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: oj1.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.q9(this.f146323a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.Data n9(State state) {
        return this.mapper.b(new pj1.a.Params(state, new er.a() { // from class: oj1.p
            @Override // er.a
            public final Object a() {
                return s.o9();
            }
        }, b9(oj1.e.f146306a), b9(g.f146308a), b9(oj1.d.f146305a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: oj1.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.r9(this.f146322a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(oj1.e.class), oVar, bVar);
        zVar.x(q0.c(g.class), oVar, sVar.new c(null));
        zVar.x(q0.c(g.class), oVar, sVar.new d(null));
        zVar.x(q0.c(oj1.d.class), oVar, sVar.new e(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
