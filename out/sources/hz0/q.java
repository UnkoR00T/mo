package hz0;

import ez0.PointDetailsEntryPointData;
import fr.q0;
import k10.c0;
import k10.z;
import kh0.BEBasicMeasurementPoint;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B3\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lhz0/q;", "Ll00/g;", "Lhz0/c;", "Lhz0/a;", "Lhz0/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "globalSnackBarManager", "Lmx/c;", "labelProvider", "Liz0/b;", "screenMapper", "Lhz0/b;", "listOfPoints", "<init>", "(Lyy/a;Li70/e;Lmx/c;Liz0/b;Lhz0/b;)V", "state", "Lhz0/d$a;", "o9", "(Lhz0/c;)Lhz0/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Li70/e;", "c", "Lmx/c;", "d", "Liz0/b;", "e", "Lhz0/b;", "f", "Lhz0/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lhz0/a$f;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, hz0.a> implements hz0.d, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iz0.b screenMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SearchSetupData listOfPoints;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, hz0.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hz0.a.f> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<hz0.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<hz0.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f86896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f86897b;

        /* JADX INFO: renamed from: hz0.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2042a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f86898a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f86899b;

            /* JADX INFO: renamed from: hz0.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2043a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f86900d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f86901e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f86902f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f86904h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f86905j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f86906k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f86907l;

                public C2043a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f86900d = obj;
                    this.f86901e |= PKIFailureInfo.systemUnavail;
                    return C2042a.this.F(null, this);
                }
            }

            public C2042a(mu.h hVar, q qVar) {
                this.f86898a = hVar;
                this.f86899b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2043a c2043a;
                if (eVar instanceof C2043a) {
                    c2043a = (C2043a) eVar;
                    int i15 = c2043a.f86901e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2043a.f86901e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2043a = new C2043a(eVar);
                    }
                } else {
                    c2043a = new C2043a(eVar);
                }
                Object obj2 = c2043a.f86900d;
                Object objE = uq.b.e();
                int i16 = c2043a.f86901e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f86898a;
                    hz0.d.Data dataO9 = this.f86899b.o9((State) obj);
                    c2043a.f86902f = vq.j.a(obj);
                    c2043a.f86904h = vq.j.a(c2043a);
                    c2043a.f86905j = vq.j.a(obj);
                    c2043a.f86906k = vq.j.a(hVar);
                    c2043a.f86907l = 0;
                    c2043a.f86901e = 1;
                    if (hVar.F(dataO9, c2043a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f86896a = gVar;
            this.f86897b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hz0.d.Data> hVar, tq.e eVar) {
            Object objA = this.f86896a.a(new C2042a(hVar, this.f86897b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhz0/a$d;", "<unused var>", "Lhz0/c;", "Loq/i0;", "<anonymous>", "(Lhz0/a$d;Lhz0/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<hz0.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86908e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f86908e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hz0.a.f> bVarY1 = q.this.Y1();
                hz0.a.f.C2041a c2041a = hz0.a.f.C2041a.f86859a;
                this.f86908e = 1;
                if (bVarY1.F(c2041a, this) == objE) {
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
        public final Object w(hz0.a.d dVar, State state, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhz0/a$a;", "<unused var>", "Lk10/c0;", "Lhz0/c;", "state", "Lk10/l;", "<anonymous>", "(Lhz0/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<hz0.a.C2040a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86911f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(State state) {
            return State.b(state, null, "", false, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, "", false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f86911f;
            uq.b.e();
            if (this.f86910e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((State) c0Var.a()).getIsActive()) {
                return c0Var.b(new er.l() { // from class: hz0.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.V((State) obj2);
                    }
                });
            }
            q.this.d9(hz0.a.d.f86857a);
            return c0Var.b(new er.l() { // from class: hz0.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(hz0.a.C2040a c2040a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f86911f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhz0/a$e;", "action", "Lhz0/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhz0/a$e;Lhz0/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<hz0.a.GoToPoint, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86914f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz0.a.GoToPoint goToPoint = (hz0.a.GoToPoint) this.f86914f;
            Object objE = uq.b.e();
            int i15 = this.f86913e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (goToPoint.getPointDetail().getQuality() == kh0.l.UNKNOWN) {
                    new hz0.a.ShowSnackBar(q.this.labelProvider.c(zx0.b.f238264q));
                } else {
                    xw.b<hz0.a.f> bVarY1 = q.this.Y1();
                    hz0.a.f.GoToPoint goToPoint2 = new hz0.a.f.GoToPoint(new PointDetailsEntryPointData(goToPoint.getPointDetail().getId(), ez0.a.SEARCH));
                    this.f86914f = vq.j.a(goToPoint);
                    this.f86913e = 1;
                    if (bVarY1.F(goToPoint2, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            i0 i0Var = i0.f148189a;
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hz0.a.GoToPoint goToPoint, State state, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f86914f = goToPoint;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhz0/a$g;", "action", "Lhz0/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhz0/a$g;Lhz0/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<hz0.a.ShowSnackBar, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86917f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz0.a.ShowSnackBar showSnackBar = (hz0.a.ShowSnackBar) this.f86917f;
            uq.b.e();
            if (this.f86916e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hz0.a.ShowSnackBar showSnackBar, State state, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f86917f = showSnackBar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhz0/a$c;", "action", "Lk10/c0;", "Lhz0/c;", "state", "Lk10/l;", "<anonymous>", "(Lhz0/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<hz0.a.ChangeQuery, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86921g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz0.a.ChangeQuery changeQuery, State state) {
            return State.b(state, null, changeQuery.getQuery(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz0.a.ChangeQuery changeQuery = (hz0.a.ChangeQuery) this.f86920f;
            c0 c0Var = (c0) this.f86921g;
            uq.b.e();
            if (this.f86919e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hz0.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(changeQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hz0.a.ChangeQuery changeQuery, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f86920f = changeQuery;
            fVar.f86921g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhz0/a$b;", "action", "Lk10/c0;", "Lhz0/c;", "state", "Lk10/l;", "<anonymous>", "(Lhz0/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<hz0.a.ChangeActiveState, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86924g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz0.a.ChangeActiveState changeActiveState, State state) {
            return State.b(state, null, null, changeActiveState.getIsActive(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz0.a.ChangeActiveState changeActiveState = (hz0.a.ChangeActiveState) this.f86923f;
            c0 c0Var = (c0) this.f86924g;
            uq.b.e();
            if (this.f86922e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hz0.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O(changeActiveState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hz0.a.ChangeActiveState changeActiveState, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f86923f = changeActiveState;
            gVar.f86924g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, i70.e eVar, mx.c cVar, iz0.b bVar, SearchSetupData searchSetupData) {
        this.globalSnackBarManager = eVar;
        this.labelProvider = cVar;
        this.screenMapper = bVar;
        this.listOfPoints = searchSetupData;
        State state = new State(searchSetupData.a(), "", false);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: hz0.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f86887a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz0.d.Data o9(State state) {
        iz0.b bVar = this.screenMapper;
        er.a<i0> aVarB9 = b9(hz0.a.d.f86857a);
        er.a<i0> aVarB10 = b9(hz0.a.C2040a.f86854a);
        return bVar.b(new iz0.b.Params(state, aVarB9, new er.l() { // from class: hz0.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f86884a, (String) obj);
            }
        }, new er.l() { // from class: hz0.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f86885a, ((Boolean) obj).booleanValue());
            }
        }, b9(new hz0.a.ChangeQuery("")), new er.l() { // from class: hz0.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f86886a, (BEBasicMeasurementPoint) obj);
            }
        }, aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(q qVar, String str) {
        qVar.d9(new hz0.a.ChangeQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(q qVar, boolean z15) {
        qVar.d9(new hz0.a.ChangeActiveState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, BEBasicMeasurementPoint bEBasicMeasurementPoint) {
        qVar.d9(new hz0.a.GoToPoint(bEBasicMeasurementPoint));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: hz0.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f86883a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hz0.a.d.class), oVar, bVar);
        zVar.v(q0.c(hz0.a.C2040a.class), oVar, qVar.new c(null));
        zVar.x(q0.c(hz0.a.GoToPoint.class), oVar, qVar.new d(null));
        zVar.x(q0.c(hz0.a.ShowSnackBar.class), oVar, qVar.new e(null));
        zVar.v(q0.c(hz0.a.ChangeQuery.class), oVar, new f(null));
        zVar.v(q0.c(hz0.a.ChangeActiveState.class), oVar, new g(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<hz0.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, hz0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<hz0.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SearchSetupData searchSetupData) {
        super.P5(searchSetupData);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
