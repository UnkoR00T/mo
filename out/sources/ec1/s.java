package ec1;

import f00.j0;
import fc1.CompanyNameContractData;
import fr.q0;
import hb1.CompanyNameForm;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lec1/s;", "Ll00/g;", "Lec1/b;", "Lec1/a;", "Lec1/c;", "", "Lyy/a;", "stateMachineFactory", "Lgc1/a;", "mapper", "Lob1/g;", "validateCompanyNameUseCase", "Lez/a;", "currentTimeProvider", "Lfc1/a;", "contract", "<init>", "(Lyy/a;Lgc1/a;Lob1/g;Lez/a;Lfc1/a;)V", "state", "Lec1/c$a;", "q9", "(Lec1/b;)Lec1/c$a;", "b", "Lgc1/a;", "c", "Lob1/g;", "d", "Lez/a;", "e", "Lfc1/a;", "f", "Lec1/b;", "initialState", "Lxw/b;", "Lec1/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<State, ec1.a> implements ec1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gc1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ob1.g validateCompanyNameUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fc1.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ec1.a.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, ec1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<ec1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lec1/s$a;", "Lf00/j0;", "Lfc1/a;", "Lec1/s;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<fc1.a, s> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ec1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f49388b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49389a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f49390b;

            /* JADX INFO: renamed from: ec1.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1167a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49391d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49392e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49393f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49395h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49396j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49397k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49398l;

                public C1167a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49391d = obj;
                    this.f49392e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f49389a = hVar;
                this.f49390b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1167a c1167a;
                if (eVar instanceof C1167a) {
                    c1167a = (C1167a) eVar;
                    int i15 = c1167a.f49392e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1167a.f49392e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1167a = new C1167a(eVar);
                    }
                } else {
                    c1167a = new C1167a(eVar);
                }
                Object obj2 = c1167a.f49391d;
                Object objE = uq.b.e();
                int i16 = c1167a.f49392e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f49389a;
                    ec1.c.Data dataQ9 = this.f49390b.q9((State) obj);
                    c1167a.f49393f = vq.j.a(obj);
                    c1167a.f49395h = vq.j.a(c1167a);
                    c1167a.f49396j = vq.j.a(obj);
                    c1167a.f49397k = vq.j.a(hVar);
                    c1167a.f49398l = 0;
                    c1167a.f49392e = 1;
                    if (hVar.F(dataQ9, c1167a) == objE) {
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

        public b(mu.g gVar, s sVar) {
            this.f49387a = gVar;
            this.f49388b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ec1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f49387a.a(new a(hVar, this.f49388b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lec1/a$a;", "<unused var>", "Lec1/b;", "Loq/i0;", "<anonymous>", "(Lec1/a$a;Lec1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ec1.a.C1164a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49399e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49399e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ec1.a.b> bVarY1 = s.this.Y1();
                ec1.a.b.C1165a c1165a = ec1.a.b.C1165a.f49311a;
                this.f49399e = 1;
                if (bVarY1.F(c1165a, this) == objE) {
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
        public final Object w(ec1.a.C1164a c1164a, State state, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lec1/a$d;", "action", "Lk10/c0;", "Lec1/b;", "state", "Lk10/l;", "<anonymous>", "(Lec1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ec1.a.OnFullNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49403g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ec1.a.OnFullNameChanged onFullNameChanged, State state) {
            return State.b(state, state.c().a(hz.b.d.f86848c, onFullNameChanged.getFullName()), null, null, null, null, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ec1.a.OnFullNameChanged onFullNameChanged = (ec1.a.OnFullNameChanged) this.f49402f;
            k10.c0 c0Var = (k10.c0) this.f49403g;
            uq.b.e();
            if (this.f49401e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ec1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(onFullNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ec1.a.OnFullNameChanged onFullNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f49402f = onFullNameChanged;
            dVar.f49403g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lec1/a$i;", "action", "Lk10/c0;", "Lec1/b;", "state", "Lk10/l;", "<anonymous>", "(Lec1/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ec1.a.OnShortNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49405f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49406g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ec1.a.OnShortNameChanged onShortNameChanged, State state) {
            return State.b(state, null, state.g().a(hz.b.d.f86848c, onShortNameChanged.getShortName()), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ec1.a.OnShortNameChanged onShortNameChanged = (ec1.a.OnShortNameChanged) this.f49405f;
            k10.c0 c0Var = (k10.c0) this.f49406g;
            uq.b.e();
            if (this.f49404e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ec1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(onShortNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ec1.a.OnShortNameChanged onShortNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f49405f = onShortNameChanged;
            eVar2.f49406g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lec1/a$f;", "<unused var>", "Lec1/b;", "Loq/i0;", "<anonymous>", "(Lec1/a$f;Lec1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ec1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49407e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s sVar, fz.b.LocalDate localDate) {
            sVar.d9(new ec1.a.OnLaunchDateChanged(localDate));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49407e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ec1.a.b> bVarY1 = s.this.Y1();
                LocalDate localDateC = s.this.currentTimeProvider.c();
                final s sVar = s.this;
                ec1.a.b.ShowDataPicker showDataPicker = new ec1.a.b.ShowDataPicker(new er.l() { // from class: ec1.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.f.O(sVar, (fz.b.LocalDate) obj2);
                    }
                }, localDateC);
                this.f49407e = 1;
                if (bVarY1.F(showDataPicker, this) == objE) {
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
        public final Object w(ec1.a.f fVar, State state, tq.e<? super i0> eVar) {
            return s.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lec1/a$e;", "action", "Lk10/c0;", "Lec1/b;", "state", "Lk10/l;", "<anonymous>", "(Lec1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ec1.a.OnLaunchDateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49411g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ec1.a.OnLaunchDateChanged onLaunchDateChanged, State state) {
            return State.b(state, null, null, new State.Field(null, onLaunchDateChanged.getLaunchDate().getDate(), 1, null), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ec1.a.OnLaunchDateChanged onLaunchDateChanged = (ec1.a.OnLaunchDateChanged) this.f49410f;
            k10.c0 c0Var = (k10.c0) this.f49411g;
            uq.b.e();
            if (this.f49409e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ec1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(onLaunchDateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ec1.a.OnLaunchDateChanged onLaunchDateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f49410f = onLaunchDateChanged;
            gVar.f49411g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lec1/a$g;", "action", "Lk10/c0;", "Lec1/b;", "state", "Lk10/l;", "<anonymous>", "(Lec1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ec1.a.OnNumberOfEmployeesChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49414g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ec1.a.OnNumberOfEmployeesChanged onNumberOfEmployeesChanged, State state) {
            return State.b(state, null, null, null, state.e().a(hz.b.C2039b.f86846c, onNumberOfEmployeesChanged.getNumberOfEmployees()), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ec1.a.OnNumberOfEmployeesChanged onNumberOfEmployeesChanged = (ec1.a.OnNumberOfEmployeesChanged) this.f49413f;
            k10.c0 c0Var = (k10.c0) this.f49414g;
            uq.b.e();
            if (this.f49412e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ec1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.h.O(onNumberOfEmployeesChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ec1.a.OnNumberOfEmployeesChanged onNumberOfEmployeesChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f49413f = onNumberOfEmployeesChanged;
            hVar.f49414g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lec1/a$h;", "<unused var>", "Lk10/c0;", "Lec1/b;", "state", "Lk10/l;", "<anonymous>", "(Lec1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ec1.a.h, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49416f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f49416f;
            uq.b.e();
            if (this.f49415e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ec1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ec1.a.h hVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f49416f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lec1/a$c;", "<unused var>", "Lk10/c0;", "Lec1/b;", "state", "Lk10/l;", "<anonymous>", "(Lec1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ec1.a.c, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f49418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f49419g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f49420h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f49421j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f49422k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f49423l;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.Field<String> fieldC = state.c();
            Object objJ = v0.j(map, d0.FULL_NAME);
            hz.b.Companion companion = hz.b.INSTANCE;
            State.Field fieldB = State.Field.b(fieldC, companion.a((hz.g) objJ), null, 2, null);
            State.Field fieldB2 = State.Field.b(state.g(), companion.a((hz.g) v0.j(map, d0.SHORT_NAME)), null, 2, null);
            State.Field fieldB3 = State.Field.b(state.e(), companion.a((hz.g) v0.j(map, d0.NUMBER_OF_EMPLOYEES)), null, 2, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return State.b(state, fieldB, fieldB2, null, fieldB3, entry != null ? (d0) entry.getKey() : null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f49423l;
            Object objE = uq.b.e();
            int i15 = this.f49422k;
            if (i15 == 0) {
                oq.u.b(obj);
                ob1.g gVar = s.this.validateCompanyNameUseCase;
                ob1.g.Params params = new ob1.g.Params(((State) c0Var.a()).c().d(), ((State) c0Var.a()).g().d(), ((State) c0Var.a()).e().d(), s.this.contract.q().getCitizenData().getFirstName(), s.this.contract.q().getCitizenData().getSecondName(), s.this.contract.q().getCitizenData().getSurname());
                this.f49423l = c0Var;
                this.f49422k = 1;
                obj = gVar.d(params, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f49418f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            s sVar = s.this;
            final Map map = (Map) obj;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() instanceof hz.g.Invalid) {
                        return c0Var.b(new er.l() { // from class: ec1.z
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return s.j.O(map, (State) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            sVar.contract.L6(new CompanyNameContractData(new CompanyNameForm(((State) c0Var.a()).c().d(), ((State) c0Var.a()).g().d(), ((State) c0Var.a()).d().d(), ((State) c0Var.a()).e().d())));
            xw.b<ec1.a.b> bVarY1 = sVar.Y1();
            ec1.a.b.C1166b c1166b = ec1.a.b.C1166b.f49312a;
            this.f49423l = vq.j.a(c0Var);
            this.f49417e = vq.j.a(map);
            this.f49418f = lVarC;
            this.f49419g = vq.j.a(lVarC);
            this.f49420h = 0;
            this.f49421j = 0;
            this.f49422k = 2;
            return bVarY1.F(c1166b, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ec1.a.c cVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = s.this.new j(eVar);
            jVar.f49423l = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, gc1.a aVar2, ob1.g gVar, ez.a aVar3, fc1.a aVar4) {
        CompanyNameForm companyNameForm;
        String numberOfEmployees;
        CompanyNameForm companyNameForm2;
        LocalDate launchDateFrom;
        CompanyNameForm companyNameForm3;
        String shortName;
        CompanyNameForm companyNameForm4;
        String fullName;
        this.mapper = aVar2;
        this.validateCompanyNameUseCase = gVar;
        this.currentTimeProvider = aVar3;
        this.contract = aVar4;
        CompanyNameContractData companyNameContractDataX4 = aVar4.X4();
        String str = "";
        State.Field field = new State.Field(null, (companyNameContractDataX4 == null || (companyNameForm4 = companyNameContractDataX4.getCompanyNameForm()) == null || (fullName = companyNameForm4.getFullName()) == null) ? "" : fullName, 1, null);
        CompanyNameContractData companyNameContractDataX5 = aVar4.X4();
        State.Field field2 = new State.Field(null, (companyNameContractDataX5 == null || (companyNameForm3 = companyNameContractDataX5.getCompanyNameForm()) == null || (shortName = companyNameForm3.getShortName()) == null) ? "" : shortName, 1, null);
        CompanyNameContractData companyNameContractDataX6 = aVar4.X4();
        State.Field field3 = new State.Field(null, (companyNameContractDataX6 == null || (companyNameForm2 = companyNameContractDataX6.getCompanyNameForm()) == null || (launchDateFrom = companyNameForm2.getLaunchDateFrom()) == null) ? aVar3.c() : launchDateFrom, 1, null);
        CompanyNameContractData companyNameContractDataX7 = aVar4.X4();
        if (companyNameContractDataX7 != null && (companyNameForm = companyNameContractDataX7.getCompanyNameForm()) != null && (numberOfEmployees = companyNameForm.getNumberOfEmployees()) != null) {
            str = numberOfEmployees;
        }
        State state = new State(field, field2, field3, new State.Field(null, str, 1, null), null, 16, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ec1.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f49378a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ec1.c.Data q9(State state) {
        return this.mapper.b(new gc1.a.Params(state, new er.l() { // from class: ec1.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.r9(this.f49374a, (String) obj);
            }
        }, new er.l() { // from class: ec1.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.s9(this.f49375a, (String) obj);
            }
        }, b9(ec1.a.f.f49319a), new er.l() { // from class: ec1.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.t9(this.f49376a, (String) obj);
            }
        }, b9(ec1.a.h.f49321a), b9(ec1.a.c.f49315a), b9(ec1.a.C1164a.f49310a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(s sVar, String str) {
        sVar.d9(new ec1.a.OnFullNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(s sVar, String str) {
        sVar.d9(new ec1.a.OnShortNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(s sVar, String str) {
        sVar.d9(new ec1.a.OnNumberOfEmployeesChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ec1.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f49377a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, k10.z zVar) {
        c cVar = sVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ec1.a.C1164a.class), oVar, cVar);
        zVar.v(q0.c(ec1.a.OnFullNameChanged.class), oVar, new d(null));
        zVar.v(q0.c(ec1.a.OnShortNameChanged.class), oVar, new e(null));
        zVar.x(q0.c(ec1.a.f.class), oVar, sVar.new f(null));
        zVar.v(q0.c(ec1.a.OnLaunchDateChanged.class), oVar, new g(null));
        zVar.v(q0.c(ec1.a.OnNumberOfEmployeesChanged.class), oVar, new h(null));
        zVar.v(q0.c(ec1.a.h.class), oVar, new i(null));
        zVar.v(q0.c(ec1.a.c.class), oVar, sVar.new j(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ec1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, ec1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ec1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
