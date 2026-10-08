package cr1;

import er.q;
import fr.q0;
import java.time.OffsetTime;
import k10.c0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import n70.TimeResult;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ww.NavigationTimePickerDialogData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcr1/i;", "Ll00/g;", "Lcr1/e;", "Lcr1/d;", "Lcr1/f;", "", "Lyy/a;", "stateMachineFactory", "Lcr1/a;", "mapper", "<init>", "(Lyy/a;Lcr1/a;)V", "state", "Lcr1/f$a;", "k9", "(Lcr1/e;)Lcr1/f$a;", "b", "Lcr1/a;", "getMapper", "()Lcr1/a;", "c", "Lcr1/e;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lcr1/d$b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends l00.g<State, cr1.d> implements f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cr1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, cr1.d> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cr1.d.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f37329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f37330b;

        /* JADX INFO: renamed from: cr1.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0778a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f37331a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f37332b;

            /* JADX INFO: renamed from: cr1.i$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0779a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f37333d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f37334e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f37335f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f37337h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f37338j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f37339k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f37340l;

                public C0779a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f37333d = obj;
                    this.f37334e |= PKIFailureInfo.systemUnavail;
                    return C0778a.this.F(null, this);
                }
            }

            public C0778a(mu.h hVar, i iVar) {
                this.f37331a = hVar;
                this.f37332b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0779a c0779a;
                if (eVar instanceof C0779a) {
                    c0779a = (C0779a) eVar;
                    int i15 = c0779a.f37334e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0779a.f37334e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0779a = new C0779a(eVar);
                    }
                } else {
                    c0779a = new C0779a(eVar);
                }
                Object obj2 = c0779a.f37333d;
                Object objE = uq.b.e();
                int i16 = c0779a.f37334e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f37331a;
                    f.Data dataK9 = this.f37332b.k9((State) obj);
                    c0779a.f37335f = vq.j.a(obj);
                    c0779a.f37337h = vq.j.a(c0779a);
                    c0779a.f37338j = vq.j.a(obj);
                    c0779a.f37339k = vq.j.a(hVar);
                    c0779a.f37340l = 0;
                    c0779a.f37334e = 1;
                    if (hVar.F(dataK9, c0779a) == objE) {
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

        public a(mu.g gVar, i iVar) {
            this.f37329a = gVar;
            this.f37330b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f37329a.a(new C0778a(hVar, this.f37330b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcr1/d$c;", "action", "Lk10/c0;", "Lcr1/e;", "state", "Lk10/l;", "<anonymous>", "(Lcr1/d$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<cr1.d.SetTime, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f37343g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, cr1.d.SetTime setTime, State state) {
            return ((State) c0Var.a()).a(setTime.getTime().a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cr1.d.SetTime setTime = (cr1.d.SetTime) this.f37342f;
            final c0 c0Var = (c0) this.f37343g;
            uq.b.e();
            if (this.f37341e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: cr1.j
                @Override // er.l
                public final Object b(Object obj2) {
                    return i.b.O(c0Var, setTime, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cr1.d.SetTime setTime, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f37342f = setTime;
            bVar.f37343g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcr1/d$a;", "<unused var>", "Lcr1/e;", "Loq/i0;", "<anonymous>", "(Lcr1/d$a;Lcr1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<cr1.d.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37344e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f37344e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<cr1.d.b> bVarY1 = i.this.Y1();
                cr1.d.b.a aVar = cr1.d.b.a.f37311a;
                this.f37344e = 1;
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
        public final Object w(cr1.d.a aVar, State state, tq.e<? super i0> eVar) {
            return i.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcr1/d$d;", "action", "Lcr1/e;", "state", "Loq/i0;", "<anonymous>", "(Lcr1/d$d;Lcr1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<cr1.d.C0777d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37347f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(i iVar, TimeResult timeResult) {
            iVar.d9(new cr1.d.SetTime(timeResult));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OffsetTime date;
            OffsetTime date2;
            State state = (State) this.f37347f;
            Object objE = uq.b.e();
            int i15 = this.f37346e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<cr1.d.b> bVarY1 = i.this.Y1();
                Label labelB = mx.b.b("title", "");
                fz.b.OffsetTime selectedTime = state.getSelectedTime();
                int minute = 0;
                int hour = (selectedTime == null || (date2 = selectedTime.getDate()) == null) ? 0 : date2.getHour();
                fz.b.OffsetTime selectedTime2 = state.getSelectedTime();
                if (selectedTime2 != null && (date = selectedTime2.getDate()) != null) {
                    minute = date.getMinute();
                }
                Label labelB2 = mx.b.b("Confirm", "");
                Label labelB3 = mx.b.b("Cancel", "");
                final i iVar = i.this;
                cr1.d.b.OpenTimePicker openTimePicker = new cr1.d.b.OpenTimePicker(new NavigationTimePickerDialogData(labelB, hour, minute, labelB2, labelB3, new er.l() { // from class: cr1.k
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i.d.O(iVar, (TimeResult) obj2);
                    }
                }));
                this.f37347f = vq.j.a(state);
                this.f37346e = 1;
                if (bVarY1.F(openTimePicker, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cr1.d.C0777d c0777d, State state, tq.e<? super i0> eVar) {
            d dVar = i.this.new d(eVar);
            dVar.f37347f = state;
            return dVar.J(i0.f148189a);
        }
    }

    public i(yy.a aVar, cr1.a aVar2) {
        this.mapper = aVar2;
        State state = new State(null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: cr1.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.m9(this.f37322a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(State state) {
        return this.mapper.b(new cr1.a.Params(state, b9(cr1.d.C0777d.f37316a), b9(cr1.d.a.f37310a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final i iVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: cr1.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.n9(this.f37323a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(i iVar, z zVar) {
        b bVar = new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.v(q0.c(cr1.d.SetTime.class), oVar, bVar);
        zVar.x(q0.c(cr1.d.a.class), oVar, iVar.new c(null));
        zVar.x(q0.c(cr1.d.C0777d.class), oVar, iVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<cr1.d.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, cr1.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
