package cv2;

import bu2.VerifiedStatus;
import fr.q0;
import java.time.LocalDate;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u0018*\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0013*\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lcv2/o;", "Ll00/g;", "Lcv2/f;", "", "Lcv2/h;", "Lyy/a;", "stateMachineFactory", "Lev2/f;", "mapper", "Lev2/a;", "verifiedStatusDateMapper", "Lcv2/g;", "setupContract", "<init>", "(Lyy/a;Lev2/f;Lev2/a;Lcv2/g;)V", "state", "Lcv2/h$a;", "q9", "(Lcv2/f;)Lcv2/h$a;", "Ljava/time/LocalDate;", "date", "Loq/i0;", "s9", "(Ljava/time/LocalDate;)V", "Lfv2/a;", "p9", "(Ljava/time/LocalDate;)Lfv2/a;", "w9", "(Lcv2/f;)Ljava/time/LocalDate;", "b", "Lev2/f;", "c", "Lev2/a;", "d", "Lcv2/g;", "e", "Lcv2/f;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lcv2/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ev2.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ev2.a verifiedStatusDateMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g setupContract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cv2.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f38293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f38294b;

        /* JADX INFO: renamed from: cv2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0810a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f38295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f38296b;

            /* JADX INFO: renamed from: cv2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0811a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f38297d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f38298e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f38299f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f38301h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f38302j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f38303k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f38304l;

                public C0811a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f38297d = obj;
                    this.f38298e |= PKIFailureInfo.systemUnavail;
                    return C0810a.this.F(null, this);
                }
            }

            public C0810a(mu.h hVar, o oVar) {
                this.f38295a = hVar;
                this.f38296b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0811a c0811a;
                if (eVar instanceof C0811a) {
                    c0811a = (C0811a) eVar;
                    int i15 = c0811a.f38298e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0811a.f38298e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0811a = new C0811a(eVar);
                    }
                } else {
                    c0811a = new C0811a(eVar);
                }
                Object obj2 = c0811a.f38297d;
                Object objE = uq.b.e();
                int i16 = c0811a.f38298e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f38295a;
                    h.Data dataQ9 = this.f38296b.q9((State) obj);
                    c0811a.f38299f = vq.j.a(obj);
                    c0811a.f38301h = vq.j.a(c0811a);
                    c0811a.f38302j = vq.j.a(obj);
                    c0811a.f38303k = vq.j.a(hVar);
                    c0811a.f38304l = 0;
                    c0811a.f38298e = 1;
                    if (hVar.F(dataQ9, c0811a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f38293a = gVar;
            this.f38294b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f38293a.a(new C0810a(hVar, this.f38294b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lcv2/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38306f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(o oVar, VerifiedStatus verifiedStatus, State state) {
            return State.b(state, oVar.p9(verifiedStatus != null ? verifiedStatus.getPickedDate() : null), verifiedStatus != null ? verifiedStatus.getPickedDate() : null, null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f38306f;
            Object objE = uq.b.e();
            int i15 = this.f38305e;
            if (i15 == 0) {
                oq.u.b(obj);
                g gVar = o.this.setupContract;
                this.f38306f = c0Var;
                this.f38305e = 1;
                obj = gVar.b(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final o oVar = o.this;
            final VerifiedStatus verifiedStatus = (VerifiedStatus) obj;
            return c0Var.b(new er.l() { // from class: cv2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.b.O(oVar, verifiedStatus, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = o.this.new b(eVar);
            bVar.f38306f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcv2/d;", "action", "Lk10/c0;", "Lcv2/f;", "state", "Lk10/l;", "<anonymous>", "(Lcv2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnRadioButtonClick, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38310g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, o oVar, OnRadioButtonClick onRadioButtonClick, State state) {
            LocalDate selectedDate = ((State) c0Var.a()).getSelectedDate();
            if (selectedDate == null) {
                selectedDate = oVar.verifiedStatusDateMapper.d().toLocalDate();
            }
            return state.a(onRadioButtonClick.getId(), selectedDate, oVar.verifiedStatusDateMapper.c(selectedDate));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnRadioButtonClick onRadioButtonClick = (OnRadioButtonClick) this.f38309f;
            final c0 c0Var = (c0) this.f38310g;
            uq.b.e();
            if (this.f38308e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o oVar = o.this;
            return c0Var.b(new er.l() { // from class: cv2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O(c0Var, oVar, onRadioButtonClick, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnRadioButtonClick onRadioButtonClick, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f38309f = onRadioButtonClick;
            cVar.f38310g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcv2/e;", "action", "Lk10/c0;", "Lcv2/f;", "state", "Lk10/l;", "<anonymous>", "(Lcv2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SetDate, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38314g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetDate setDate, o oVar, State state) {
            return State.b(state, null, setDate.getDate(), oVar.verifiedStatusDateMapper.c(setDate.getDate()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetDate setDate = (SetDate) this.f38313f;
            c0 c0Var = (c0) this.f38314g;
            uq.b.e();
            if (this.f38312e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o oVar = o.this;
            return c0Var.b(new er.l() { // from class: cv2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O(setDate, oVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetDate setDate, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f38313f = setDate;
            dVar.f38314g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcv2/b;", "<unused var>", "Lcv2/f;", "state", "Loq/i0;", "<anonymous>", "(Lcv2/b;Lcv2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<cv2.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38317f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(o oVar, LocalDate localDate) {
            oVar.s9(localDate);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f38317f;
            Object objE = uq.b.e();
            int i15 = this.f38316e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cv2.a> bVarY1 = o.this.Y1();
                LocalDate selectedDate = state.getSelectedDate();
                if (selectedDate == null) {
                    selectedDate = o.this.verifiedStatusDateMapper.d().toLocalDate();
                }
                LocalDate localDateA = o.this.verifiedStatusDateMapper.a();
                LocalDate localDateB = o.this.verifiedStatusDateMapper.b();
                final o oVar = o.this;
                cv2.a.OpenDatePicker openDatePicker = new cv2.a.OpenDatePicker(selectedDate, localDateA, localDateB, new er.l() { // from class: cv2.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.e.O(oVar, (LocalDate) obj2);
                    }
                });
                this.f38317f = vq.j.a(state);
                this.f38316e = 1;
                if (bVarY1.F(openDatePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cv2.b bVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f38317f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcv2/c;", "<unused var>", "Lcv2/f;", "state", "Loq/i0;", "<anonymous>", "(Lcv2/c;Lcv2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<cv2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38320f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (r7.F(r2, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f38320f
                cv2.f r0 = (cv2.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f38319e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L5c
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L45
            L22:
                oq.u.b(r7)
                cv2.o r7 = cv2.o.this
                cv2.g r7 = cv2.o.j9(r7)
                bu2.e r2 = new bu2.e
                cv2.o r5 = cv2.o.this
                java.time.LocalDate r5 = cv2.o.o9(r5, r0)
                r2.<init>(r5)
                java.lang.Object r5 = vq.j.a(r0)
                r6.f38320f = r5
                r6.f38319e = r4
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r1) goto L45
                goto L5b
            L45:
                cv2.o r7 = cv2.o.this
                xw.b r7 = r7.Y1()
                cv2.a$b r2 = cv2.a.b.f38266a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f38320f = r0
                r6.f38319e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L5c
            L5b:
                return r1
            L5c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cv2.o.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cv2.c cVar, State state, tq.e<? super i0> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f38320f = state;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, ev2.f fVar, ev2.a aVar2, g gVar) {
        this.mapper = fVar;
        this.verifiedStatusDateMapper = aVar2;
        this.setupContract = gVar;
        State state = new State(fv2.a.C1518a.f67636a, null, aVar2.c(aVar2.d().toLocalDate()));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: cv2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f38285a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fv2.a p9(LocalDate localDate) {
        return localDate == null ? fv2.a.C1518a.f67636a : fv2.a.b.f67637a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data q9(State state) {
        return this.mapper.b(new ev2.f.Params(state, new er.l() { // from class: cv2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.r9(this.f38283a, (fv2.a) obj);
            }
        }, b9(cv2.b.f38267a), b9(cv2.c.f38268a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(o oVar, fv2.a aVar) {
        oVar.d9(new OnRadioButtonClick(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s9(LocalDate date) {
        d9(new SetDate(date));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: cv2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f38284a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        zVar.A(oVar.new b(null));
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnRadioButtonClick.class), oVar2, cVar);
        zVar.v(q0.c(SetDate.class), oVar2, oVar.new d(null));
        zVar.x(q0.c(cv2.b.class), oVar2, oVar.new e(null));
        zVar.x(q0.c(cv2.c.class), oVar2, oVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalDate w9(State state) {
        fv2.a selectedRadioButtonId = state.getSelectedRadioButtonId();
        if (selectedRadioButtonId instanceof fv2.a.C1518a) {
            return null;
        }
        if (selectedRadioButtonId instanceof fv2.a.b) {
            return state.getSelectedDate();
        }
        throw new oq.p();
    }

    @Override // zx.b
    public xw.b<cv2.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(g gVar) {
        super.P5(gVar);
    }
}
