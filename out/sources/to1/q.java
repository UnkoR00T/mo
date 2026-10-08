package to1;

import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wo1.DeveloperSampleContentA;
import wo1.DeveloperSampleContentB;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u0016028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lto1/q;", "Ll00/g;", "Lto1/g;", "", "Lto1/h;", "Lyy/a;", "stateMachineFactory", "Lto1/i;", "mapper", "Lwo1/f;", "saveSampleContentAUC", "Lwo1/g;", "saveSampleContentBUC", "Lwo1/d;", "getSampleContentBUC", "Lwo1/e;", "observeInternalIdsUC", "Lwo1/a;", "deleteSampleContentsUC", "<init>", "(Lyy/a;Lto1/i;Lwo1/f;Lwo1/g;Lwo1/d;Lwo1/e;Lwo1/a;)V", "state", "Lto1/h$a;", "n9", "(Lto1/g;)Lto1/h$a;", "b", "Lto1/i;", "c", "Lwo1/f;", "d", "Lwo1/g;", "e", "Lwo1/d;", "f", "Lwo1/e;", "g", "Lwo1/a;", "Lxw/b;", "Lto1/d;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements h, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wo1.f saveSampleContentAUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wo1.g saveSampleContentBUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wo1.d getSampleContentBUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wo1.e observeInternalIdsUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wo1.a deleteSampleContentsUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<to1.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<h.a> state = a9(new a(e9().getState(), this), n9(new State(null, null, 3, null)));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f191335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f191336b;

        /* JADX INFO: renamed from: to1.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5000a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f191337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f191338b;

            /* JADX INFO: renamed from: to1.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5001a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f191339d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f191340e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f191341f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f191343h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f191344j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f191345k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f191346l;

                public C5001a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f191339d = obj;
                    this.f191340e |= PKIFailureInfo.systemUnavail;
                    return C5000a.this.F(null, this);
                }
            }

            public C5000a(mu.h hVar, q qVar) {
                this.f191337a = hVar;
                this.f191338b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5001a c5001a;
                if (eVar instanceof C5001a) {
                    c5001a = (C5001a) eVar;
                    int i15 = c5001a.f191340e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5001a.f191340e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5001a = new C5001a(eVar);
                    }
                } else {
                    c5001a = new C5001a(eVar);
                }
                Object obj2 = c5001a.f191339d;
                Object objE = uq.b.e();
                int i16 = c5001a.f191340e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f191337a;
                    h.a aVarN9 = this.f191338b.n9((State) obj);
                    c5001a.f191341f = vq.j.a(obj);
                    c5001a.f191343h = vq.j.a(c5001a);
                    c5001a.f191344j = vq.j.a(obj);
                    c5001a.f191345k = vq.j.a(hVar);
                    c5001a.f191346l = 0;
                    c5001a.f191340e = 1;
                    if (hVar.F(aVarN9, c5001a) == objE) {
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
            this.f191335a = gVar;
            this.f191336b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.a> hVar, tq.e eVar) {
            Object objA = this.f191335a.a(new C5000a(hVar, this.f191336b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lto1/a;", "<unused var>", "Lto1/g;", "Loq/i0;", "<anonymous>", "(Lto1/a;Lto1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<to1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191347e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191347e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<to1.d> bVarY1 = q.this.Y1();
                to1.d.a aVar = to1.d.a.f191296a;
                this.f191347e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(to1.a aVar, State state, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "ids", "Lk10/c0;", "Lto1/g;", "state", "Lk10/l;", "<anonymous>", "(Ljava/util/List;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<List<? extends String>, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f191351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k10.z<State, State, Object> f191352h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k10.z<State, State, Object> zVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f191352h = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, String.valueOf(list), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final List list = (List) this.f191350f;
            k10.c0 c0Var = (k10.c0) this.f191351g;
            uq.b.e();
            if (this.f191349e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            px.f.f163100a.b("Current id list: " + list, px.c.a(this.f191352h));
            return c0Var.b(new er.l() { // from class: to1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(list, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(List<String> list, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(this.f191352h, eVar);
            cVar.f191350f = list;
            cVar.f191351g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lto1/e;", "<unused var>", "Lk10/c0;", "Lto1/g;", "state", "Lk10/l;", "<anonymous>", "(Lto1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<to1.e, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191354f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(dx.b bVar, State state) {
            return State.b(state, null, bVar.toString(), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, "insertDataA success", 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f191354f;
            Object objE = uq.b.e();
            int i15 = this.f191353e;
            if (i15 == 0) {
                oq.u.b(obj);
                wo1.f fVar = q.this.saveSampleContentAUC;
                wo1.f.Params params = new wo1.f.Params(new DeveloperSampleContentA("internalIdContentA", "secretData", "secretData"));
                this.f191354f = c0Var;
                this.f191353e = 1;
                obj = fVar.d(params, this);
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
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.b(new er.l() { // from class: to1.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.d.V(bVar, (State) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.b(new er.l() { // from class: to1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(to1.e eVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            d dVar = q.this.new d(eVar2);
            dVar.f191354f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lto1/f;", "<unused var>", "Lk10/c0;", "Lto1/g;", "state", "Lk10/l;", "<anonymous>", "(Lto1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<to1.f, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191357f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(dx.b bVar, State state) {
            return State.b(state, null, bVar.toString(), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, "insertDataB success", 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f191357f;
            Object objE = uq.b.e();
            int i15 = this.f191356e;
            if (i15 == 0) {
                oq.u.b(obj);
                wo1.g gVar = q.this.saveSampleContentBUC;
                wo1.g.Params params = new wo1.g.Params(new DeveloperSampleContentB("internalIdContentB", "secretData0", "secretData1", "secretData2", "secretData3"));
                this.f191357f = c0Var;
                this.f191356e = 1;
                obj = gVar.d(params, this);
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
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.b(new er.l() { // from class: to1.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.e.V(bVar, (State) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.b(new er.l() { // from class: to1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(to1.f fVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f191357f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lto1/c;", "<unused var>", "Lk10/c0;", "Lto1/g;", "state", "Lk10/l;", "<anonymous>", "(Lto1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<to1.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191360f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(dx.b bVar, State state) {
            return State.b(state, null, bVar.toString(), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(List list, State state) {
            return State.b(state, null, "list of B: " + list, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f191360f;
            Object objE = uq.b.e();
            int i15 = this.f191359e;
            if (i15 == 0) {
                oq.u.b(obj);
                wo1.d dVar = q.this.getSampleContentBUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f191360f = c0Var;
                this.f191359e = 1;
                obj = dVar.a(c1792a, this);
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
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.b(new er.l() { // from class: to1.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.f.V(bVar, (State) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final List list = (List) ((dx.i.Right) iVar).b();
            return c0Var.b(new er.l() { // from class: to1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.X(list, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(to1.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f191360f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lto1/b;", "<unused var>", "Lk10/c0;", "Lto1/g;", "state", "Lk10/l;", "<anonymous>", "(Lto1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<to1.b, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191363f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(dx.b bVar, State state) {
            return State.b(state, null, bVar.toString(), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, "table is cleared", 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f191363f;
            Object objE = uq.b.e();
            int i15 = this.f191362e;
            if (i15 == 0) {
                oq.u.b(obj);
                wo1.a aVar = q.this.deleteSampleContentsUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f191363f = c0Var;
                this.f191362e = 1;
                obj = aVar.a(c1792a, this);
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
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.b(new er.l() { // from class: to1.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.g.V(bVar, (State) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.b(new er.l() { // from class: to1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.X((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(to1.b bVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f191363f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, i iVar, wo1.f fVar, wo1.g gVar, wo1.d dVar, wo1.e eVar, wo1.a aVar2) {
        this.mapper = iVar;
        this.saveSampleContentAUC = fVar;
        this.saveSampleContentBUC = gVar;
        this.getSampleContentBUC = dVar;
        this.observeInternalIdsUC = eVar;
        this.deleteSampleContentsUC = aVar2;
        this.stateMachine = aVar.a(new State(null, null, 3, null), new er.l() { // from class: to1.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f191324a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.a n9(State state) {
        return this.mapper.b(new i.Params(state, b9(to1.e.f191297a), b9(to1.f.f191298a), b9(to1.c.f191294a), b9(to1.b.f191292a), b9(to1.a.f191291a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: to1.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f191325a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(q qVar, k10.z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(to1.a.class), oVar, bVar);
        k10.k.m(zVar, qVar.observeInternalIdsUC.b(gz.b.a.C1792a.f78542a), null, new c(zVar, null), 2, null);
        zVar.v(q0.c(to1.e.class), oVar, qVar.new d(null));
        zVar.v(q0.c(to1.f.class), oVar, qVar.new e(null));
        zVar.v(q0.c(to1.c.class), oVar, qVar.new f(null));
        zVar.v(q0.c(to1.b.class), oVar, qVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<to1.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
