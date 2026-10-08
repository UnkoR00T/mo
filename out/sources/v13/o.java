package v13;

import fr.q0;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001CBQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lv13/o;", "Ll00/g;", "Lv13/f;", "", "Lv13/g;", "Lyy/a;", "stateMachineFactory", "Lw13/b;", "mapper", "Lmx/c;", "labelProvider", "Ln13/c;", "getEmergencyBackpackDataUC", "Ln13/b;", "getEmergencyBackpackAddedItemsUC", "La14/a;", "addEventToCalendarUseCase", "Lez/a;", "currentTimeProvider", "Ln13/d;", "openEmergencyBackpackPdfUC", "Li70/e;", "globalSnackBarManager", "<init>", "(Lyy/a;Lw13/b;Lmx/c;Ln13/c;Ln13/b;La14/a;Lez/a;Ln13/d;Li70/e;)V", "state", "Lv13/g$a;", "r9", "(Lv13/f;)Lv13/g$a;", "b", "Lw13/b;", "c", "Lmx/c;", "d", "Ln13/c;", "e", "Ln13/b;", "f", "La14/a;", "g", "Lez/a;", "h", "Ln13/d;", "j", "Li70/e;", "k", "Lv13/f;", "initialState", "Lxw/b;", "Lv13/b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "p", "a", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements v13.g, zx.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f203223q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w13.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n13.c getEmergencyBackpackDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n13.b getEmergencyBackpackAddedItemsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.a addEventToCalendarUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n13.d openEmergencyBackpackPdfUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v13.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<v13.g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<v13.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f203236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f203237b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f203238a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f203239b;

            /* JADX INFO: renamed from: v13.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5286a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f203240d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f203241e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f203242f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f203244h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f203245j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f203246k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f203247l;

                public C5286a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f203240d = obj;
                    this.f203241e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f203238a = hVar;
                this.f203239b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5286a c5286a;
                if (eVar instanceof C5286a) {
                    c5286a = (C5286a) eVar;
                    int i15 = c5286a.f203241e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5286a.f203241e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5286a = new C5286a(eVar);
                    }
                } else {
                    c5286a = new C5286a(eVar);
                }
                Object obj2 = c5286a.f203240d;
                Object objE = uq.b.e();
                int i16 = c5286a.f203241e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f203238a;
                    v13.g.Data dataR9 = this.f203239b.r9((State) obj);
                    c5286a.f203242f = vq.j.a(obj);
                    c5286a.f203244h = vq.j.a(c5286a);
                    c5286a.f203245j = vq.j.a(obj);
                    c5286a.f203246k = vq.j.a(hVar);
                    c5286a.f203247l = 0;
                    c5286a.f203241e = 1;
                    if (hVar.F(dataR9, c5286a) == objE) {
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

        public b(mu.g gVar, o oVar) {
            this.f203236a = gVar;
            this.f203237b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v13.g.Data> hVar, tq.e eVar) {
            Object objA = this.f203236a.a(new a(hVar, this.f203237b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "result", "Lk10/c0;", "Lv13/f;", "state", "Lk10/l;", "<anonymous>", "(Ljava/util/List;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<List<? extends String>, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f203250g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, list, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list = (List) this.f203249f;
            c0 c0Var = (c0) this.f203250g;
            uq.b.e();
            if (this.f203248e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: v13.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O(list, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(List<String> list, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f203249f = list;
            cVar.f203250g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lv13/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203252f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(o oVar, State state) {
            return State.b(state, oVar.getEmergencyBackpackDataUC.b(gz.b.a.C1792a.f78542a), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f203252f;
            uq.b.e();
            if (this.f203251e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final o oVar = o.this;
            return c0Var.d(new er.l() { // from class: v13.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O(oVar, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f203252f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv13/e;", "action", "Lv13/f;", "state", "Loq/i0;", "<anonymous>", "(Lv13/e;Lv13/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ToGroup, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f203255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f203256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f203257h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f203258j;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object next;
            ToGroup toGroup = (ToGroup) this.f203257h;
            State state = (State) this.f203258j;
            Object objE = uq.b.e();
            int i15 = this.f203256g;
            if (i15 == 0) {
                u.b(obj);
                Iterator<T> it = state.d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    l13.a aVar = (l13.a) next;
                    if ((aVar instanceof l13.a.Group) && fr.t.c(((l13.a.Group) aVar).getGroupId(), toGroup.getData().getGroupId())) {
                        break;
                    }
                }
                l13.a aVar2 = (l13.a) next;
                if (aVar2 != null) {
                    xw.b<v13.b> bVarY1 = o.this.Y1();
                    v13.b.ToGroup toGroup2 = new v13.b.ToGroup((l13.a.Group) aVar2);
                    this.f203257h = vq.j.a(toGroup);
                    this.f203258j = vq.j.a(state);
                    this.f203254e = vq.j.a(aVar2);
                    this.f203255f = 0;
                    this.f203256g = 1;
                    if (bVarY1.F(toGroup2, this) == objE) {
                        return objE;
                    }
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
        public final Object w(ToGroup toGroup, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f203257h = toGroup;
            eVar2.f203258j = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv13/d;", "<unused var>", "Lv13/f;", "Loq/i0;", "<anonymous>", "(Lv13/d;Lv13/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<v13.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203260e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203260e;
            if (i15 == 0) {
                u.b(obj);
                a14.a aVar = o.this.addEventToCalendarUseCase;
                a14.a.Params params = new a14.a.Params(o.this.labelProvider.c(g13.c.f69736q0).getText(), ez.d.k(o.this.currentTimeProvider.f().plusMonths(3L)), null, true, null, null, 52, null);
                this.f203260e = 1;
                if (aVar.c(params, this) == objE) {
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
        public final Object w(v13.d dVar, State state, tq.e<? super i0> eVar) {
            return o.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv13/a;", "<unused var>", "Lv13/f;", "Loq/i0;", "<anonymous>", "(Lv13/a;Lv13/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203262e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203262e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<v13.b> bVarY1 = o.this.Y1();
                v13.b.a aVar = v13.b.a.f203200a;
                this.f203262e = 1;
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
        public final Object w(a aVar, State state, tq.e<? super i0> eVar) {
            return o.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv13/c;", "<unused var>", "Lv13/f;", "Loq/i0;", "<anonymous>", "(Lv13/c;Lv13/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<v13.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203264e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203264e;
            if (i15 == 0) {
                u.b(obj);
                n13.d dVar = o.this.openEmergencyBackpackPdfUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f203264e = 1;
                obj = dVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            o oVar = o.this;
            if (iVar instanceof dx.i.Left) {
                oVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(oVar.mapper.e(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v13.c cVar, State state, tq.e<? super i0> eVar) {
            return o.this.new h(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, w13.b bVar, mx.c cVar, n13.c cVar2, n13.b bVar2, a14.a aVar2, ez.a aVar3, n13.d dVar, i70.e eVar) {
        this.mapper = bVar;
        this.labelProvider = cVar;
        this.getEmergencyBackpackDataUC = cVar2;
        this.getEmergencyBackpackAddedItemsUC = bVar2;
        this.addEventToCalendarUseCase = aVar2;
        this.currentTimeProvider = aVar3;
        this.openEmergencyBackpackPdfUC = dVar;
        this.globalSnackBarManager = eVar;
        State state = new State(v.n(), v.n());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: v13.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f203219a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v13.g.Data r9(State state) {
        return this.mapper.b(new w13.b.Params(state, new er.l() { // from class: v13.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f203220a, (z13.a.Group) obj);
            }
        }, b9(v13.d.f203203a), b9(a.f203199a), b9(v13.c.f203202a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(o oVar, z13.a.Group group) {
        oVar.d9(new ToGroup(group));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: v13.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f203221a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        k10.k.m(zVar, oVar.getEmergencyBackpackAddedItemsUC.b(gz.b.a.C1792a.f78542a), null, new c(null), 2, null);
        zVar.A(oVar.new d(null));
        e eVar = oVar.new e(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ToGroup.class), oVar2, eVar);
        zVar.x(q0.c(v13.d.class), oVar2, oVar.new f(null));
        zVar.x(q0.c(a.class), oVar2, oVar.new g(null));
        zVar.x(q0.c(v13.c.class), oVar2, oVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<v13.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v13.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
