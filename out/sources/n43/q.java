package n43;

import f00.j0;
import f43.ChildStudent;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001CBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003088\u0014X\u0094\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Ln43/q;", "Ll00/g;", "Ln43/b;", "Ln43/a;", "Ln43/c;", "", "Lyy/a;", "stateMachineFactory", "Lp43/b;", "mapper", "Le43/a;", "interactor", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lo43/a;", "data", "<init>", "(Lyy/a;Lp43/b;Le43/a;Lhb4/d;Lib4/c;Lac4/a;Lo43/a;)V", "state", "Ln43/c$a;", "u9", "(Ln43/b;)Ln43/c$a;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "B9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Lp43/b;", "c", "Le43/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lo43/a;", "h", "Ln43/b;", "initialState", "Lxw/b;", "Ln43/a$a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<n43.b, n43.a> implements n43.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p43.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e43.a interactor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o43.a data;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n43.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n43.a.InterfaceC3266a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<n43.b, n43.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<n43.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ln43/q$a;", "Lf00/j0;", "Lo43/a;", "Ln43/q;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<o43.a, q> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n43.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f131766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f131767b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f131768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f131769b;

            /* JADX INFO: renamed from: n43.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3271a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f131770d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f131771e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f131772f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f131774h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f131775j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f131776k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f131777l;

                public C3271a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f131770d = obj;
                    this.f131771e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f131768a = hVar;
                this.f131769b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3271a c3271a;
                if (eVar instanceof C3271a) {
                    c3271a = (C3271a) eVar;
                    int i15 = c3271a.f131771e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3271a.f131771e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3271a = new C3271a(eVar);
                    }
                } else {
                    c3271a = new C3271a(eVar);
                }
                Object obj2 = c3271a.f131770d;
                Object objE = uq.b.e();
                int i16 = c3271a.f131771e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f131768a;
                    n43.c.a aVarU9 = this.f131769b.u9((n43.b) obj);
                    c3271a.f131772f = vq.j.a(obj);
                    c3271a.f131774h = vq.j.a(c3271a);
                    c3271a.f131775j = vq.j.a(obj);
                    c3271a.f131776k = vq.j.a(hVar);
                    c3271a.f131777l = 0;
                    c3271a.f131771e = 1;
                    if (hVar.F(aVarU9, c3271a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f131766a = gVar;
            this.f131767b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n43.c.a> hVar, tq.e eVar) {
            Object objA = this.f131766a.a(new a(hVar, this.f131767b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ln43/b$c;", "state", "Lk10/l;", "Ln43/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<n43.b.c>, tq.e<? super k10.l<? extends n43.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131779f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ln43/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends n43.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f131781e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q f131782f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<n43.b.c> f131783g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<n43.b.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f131782f = qVar;
                this.f131783g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final n43.b.ErrorLoadingList X(q qVar, dx.b bVar, n43.b.c cVar) {
                return new n43.b.ErrorLoadingList(qVar.errorVMSFactory.a(qVar.B9(bVar, qVar.b9(n43.a.d.f131730a), qVar.b9(n43.a.b.f131728a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final n43.b.DisplayingList Y(List list, n43.b.c cVar) {
                return new n43.b.DisplayingList(list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f131781e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    e43.a aVar = this.f131782f.interactor;
                    this.f131781e = 1;
                    obj = aVar.a(this);
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
                c0<n43.b.c> c0Var = this.f131783g;
                final q qVar = this.f131782f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: n43.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.c.a.X(qVar, bVar, (b.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List<ChildStudent> list = (List) ((dx.i.Right) iVar).b();
                qVar.data.G(list);
                return c0Var.d(new er.l() { // from class: n43.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.a.Y(list, (b.c) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f131782f, this.f131783g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends n43.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f131779f;
            Object objE = uq.b.e();
            int i15 = this.f131778e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.callActionWithLoaderUseCase;
            a aVar2 = new a(q.this, c0Var, null);
            this.f131779f = vq.j.a(c0Var);
            this.f131778e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<n43.b.c> c0Var, tq.e<? super k10.l<? extends n43.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f131779f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln43/a$b;", "<unused var>", "Ln43/b$a;", "Loq/i0;", "<anonymous>", "(Ln43/a$b;Ln43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n43.a.b, n43.b.DisplayingList, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131784e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f131784e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                n43.a.InterfaceC3266a.C3267a c3267a = n43.a.InterfaceC3266a.C3267a.f131726a;
                this.f131784e = 1;
                if (qVar.F(c3267a, this) == objE) {
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
        public final Object w(n43.a.b bVar, n43.b.DisplayingList displayingList, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln43/a$c;", "action", "Ln43/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln43/a$c;Ln43/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<n43.a.OnChildSelected, n43.b.DisplayingList, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131787f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n43.a.OnChildSelected onChildSelected = (n43.a.OnChildSelected) this.f131787f;
            Object objE = uq.b.e();
            int i15 = this.f131786e;
            if (i15 == 0) {
                oq.u.b(obj);
                q.this.data.h4(onChildSelected.getChild());
                q qVar = q.this;
                n43.a.InterfaceC3266a.ToChildDashboard toChildDashboard = new n43.a.InterfaceC3266a.ToChildDashboard(onChildSelected.getChild());
                this.f131787f = vq.j.a(onChildSelected);
                this.f131786e = 1;
                if (qVar.F(toChildDashboard, this) == objE) {
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
        public final Object w(n43.a.OnChildSelected onChildSelected, n43.b.DisplayingList displayingList, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f131787f = onChildSelected;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln43/a$d;", "<unused var>", "Lk10/c0;", "Ln43/b$b;", "state", "Lk10/l;", "Ln43/b;", "<anonymous>", "(Ln43/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n43.a.d, c0<n43.b.ErrorLoadingList>, tq.e<? super k10.l<? extends n43.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f131790f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n43.b.c O(n43.b.ErrorLoadingList errorLoadingList) {
            return n43.b.c.f131733a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f131790f;
            uq.b.e();
            if (this.f131789e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: n43.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O((b.ErrorLoadingList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n43.a.d dVar, c0<n43.b.ErrorLoadingList> c0Var, tq.e<? super k10.l<? extends n43.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f131790f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln43/a$b;", "<unused var>", "Ln43/b$b;", "Loq/i0;", "<anonymous>", "(Ln43/a$b;Ln43/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<n43.a.b, n43.b.ErrorLoadingList, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f131791e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f131791e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                n43.a.InterfaceC3266a.C3267a c3267a = n43.a.InterfaceC3266a.C3267a.f131726a;
                this.f131791e = 1;
                if (qVar.F(c3267a, this) == objE) {
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
        public final Object w(n43.a.b bVar, n43.b.ErrorLoadingList errorLoadingList, tq.e<? super i0> eVar) {
            return q.this.new g(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, p43.b bVar, e43.a aVar2, hb4.d dVar, ib4.c cVar, ac4.a aVar3, o43.a aVar4) {
        this.mapper = bVar;
        this.interactor = aVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.data = aVar4;
        n43.b.c cVar2 = n43.b.c.f131733a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: n43.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f131755a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), u9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(q qVar, z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(n43.a.d.class), oVar, fVar);
        zVar.x(q0.c(n43.a.b.class), oVar, qVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b B9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: n43.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9(aVar2, aVar, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            aVar.a();
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n43.c.a u9(n43.b state) {
        return this.mapper.b(new p43.b.Params(state, b9(n43.a.b.f131728a), new er.l() { // from class: n43.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f131749a, (ChildStudent) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(q qVar, ChildStudent childStudent) {
        qVar.d9(new n43.a.OnChildSelected(childStudent));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(n43.b.c.class), new er.l() { // from class: n43.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.y9(this.f131750a, (z) obj);
            }
        });
        vVar.c(q0.c(n43.b.DisplayingList.class), new er.l() { // from class: n43.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f131751a, (z) obj);
            }
        });
        vVar.c(q0.c(n43.b.ErrorLoadingList.class), new er.l() { // from class: n43.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.A9(this.f131752a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(q qVar, z zVar) {
        zVar.A(qVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, z zVar) {
        d dVar = qVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(n43.a.b.class), oVar, dVar);
        zVar.x(q0.c(n43.a.OnChildSelected.class), oVar, qVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<n43.a.InterfaceC3266a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<n43.b, n43.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n43.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(n43.a.InterfaceC3266a interfaceC3266a, tq.e<? super i0> eVar) {
        return super.F(interfaceC3266a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
