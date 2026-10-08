package wa3;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ra3.SetupData;
import v93.Country;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001SBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\u00020\u001a*\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d*\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010)\u001a\u00020(*\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030G8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010+\u001a\b\u0012\u0004\u0012\u00020,0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lwa3/p0;", "Ll00/g;", "Lwa3/k;", "Lwa3/e;", "Lwa3/n;", "", "Lyy/a;", "stateMachineFactory", "Lxa3/i;", "mapper", "Lx93/d;", "travelAbroadServiceInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVmsFactory", "Lib4/c;", "genericDomainErrorMapper", "Lwa3/j;", "data", "<init>", "(Lyy/a;Lxa3/i;Lx93/d;Lac4/a;Lhb4/d;Lib4/c;Lwa3/j;)V", "Lk10/c0;", "Lwa3/k$a;", "Lwa3/e$c;", "action", "Lwa3/k$a$a;", "T9", "(Lk10/c0;Lwa3/e$c;)Lwa3/k$a$a;", "", "Lv93/c;", "S9", "(Ljava/util/List;Lwa3/e$c;)Ljava/util/List;", "G9", "(Ljava/util/List;)Ljava/util/List;", "", "searchQuery", "H9", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Ldx/b;", "Lhb4/c;", "Q9", "(Ldx/b;)Lhb4/c;", "state", "Lwa3/n$a;", "C9", "(Lwa3/k;)Lwa3/n$a;", "Loq/i0;", "I9", "(Lwa3/j;)V", "b", "Lxa3/i;", "c", "Lx93/d;", "d", "Lac4/a;", "e", "Lhb4/d;", "f", "Lib4/c;", "Lwa3/m;", "g", "Lwa3/m;", "initialState", "Lxw/b;", "Lwa3/e$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "l", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends l00.g<wa3.k, wa3.e> implements wa3.n, zx.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f211670l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f211671m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f211672n;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xa3.i mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x93.d travelAbroadServiceInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVmsFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wa3.m initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wa3.e.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<wa3.k, wa3.e> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<wa3.n.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwa3/p0$a;", "", "<init>", "()V", "Lgu/b;", "SEARCH_DEBOUNCE", "J", "a", "()J", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final long a() {
            return p0.f211672n;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<wa3.n.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f211682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f211683b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f211684a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f211685b;

            /* JADX INFO: renamed from: wa3.p0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5575a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f211686d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f211687e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f211688f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f211690h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f211691j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f211692k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f211693l;

                public C5575a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f211686d = obj;
                    this.f211687e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p0 p0Var) {
                this.f211684a = hVar;
                this.f211685b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5575a c5575a;
                if (eVar instanceof C5575a) {
                    c5575a = (C5575a) eVar;
                    int i15 = c5575a.f211687e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5575a.f211687e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5575a = new C5575a(eVar);
                    }
                } else {
                    c5575a = new C5575a(eVar);
                }
                Object obj2 = c5575a.f211686d;
                Object objE = uq.b.e();
                int i16 = c5575a.f211687e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f211684a;
                    wa3.n.a aVarC9 = this.f211685b.C9((wa3.k) obj);
                    c5575a.f211688f = vq.j.a(obj);
                    c5575a.f211690h = vq.j.a(c5575a);
                    c5575a.f211691j = vq.j.a(obj);
                    c5575a.f211692k = vq.j.a(hVar);
                    c5575a.f211693l = 0;
                    c5575a.f211687e = 1;
                    if (hVar.F(aVarC9, c5575a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, p0 p0Var) {
            this.f211682a = gVar;
            this.f211683b = p0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super wa3.n.a> hVar, tq.e eVar) {
            Object objA = this.f211682a.a(new a(hVar, this.f211683b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwa3/e$b;", "<unused var>", "Lwa3/k;", "Loq/i0;", "<anonymous>", "(Lwa3/e$b;Lwa3/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<wa3.e.b, wa3.k, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211694e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f211694e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                wa3.e.a.C5565a c5565a = wa3.e.a.C5565a.f211609a;
                this.f211694e = 1;
                if (p0Var.F(c5565a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.e.b bVar, wa3.k kVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwa3/m;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<wa3.m>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211697f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwa3/k;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends wa3.k>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f211699e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f211700f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<wa3.m> f211701g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, k10.c0<wa3.m> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f211700f = p0Var;
                this.f211701g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(p0 p0Var, dx.b bVar, wa3.m mVar) {
                return new Error(p0Var.Q9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wa3.k.a.Screen Y(List list, p0 p0Var, wa3.m mVar) {
                return new wa3.k.a.Screen(new wa3.k.a.ContentData(null, list, p0Var.G9(list), list, 1, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f211699e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.d dVar = this.f211700f.travelAbroadServiceInteractor;
                    this.f211699e = 1;
                    obj = dVar.a(this);
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
                k10.c0<wa3.m> c0Var = this.f211701g;
                final p0 p0Var = this.f211700f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: wa3.q0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.d.a.X(p0Var, bVar, (m) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: wa3.r0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.d.a.Y(list, p0Var, (m) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f211700f, this.f211701g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends wa3.k>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211697f;
            Object objE = uq.b.e();
            int i15 = this.f211696e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, c0Var, null);
            this.f211697f = vq.j.a(c0Var);
            this.f211696e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<wa3.m> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = p0.this.new d(eVar);
            dVar.f211697f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/d;", "<unused var>", "Lk10/c0;", "Lwa3/l;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<wa3.d, k10.c0<Error>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211703f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.m O(Error error) {
            return wa3.m.f211643a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211703f;
            uq.b.e();
            if (this.f211702e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: wa3.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f211703f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwa3/c;", "<unused var>", "Lwa3/l;", "Loq/i0;", "<anonymous>", "(Lwa3/c;Lwa3/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<wa3.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211704e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f211704e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                wa3.e.a.C5565a c5565a = wa3.e.a.C5565a.f211609a;
                this.f211704e = 1;
                if (p0Var.F(c5565a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.c cVar, Error error, tq.e<? super oq.i0> eVar) {
            return p0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwa3/e$d;", "action", "Lwa3/k$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwa3/e$d;Lwa3/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<wa3.e.OnCountryClicked, wa3.k.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211707f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wa3.e.OnCountryClicked onCountryClicked = (wa3.e.OnCountryClicked) this.f211707f;
            Object objE = uq.b.e();
            int i15 = this.f211706e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = p0.this;
                wa3.e.a.GoToCountryDetails goToCountryDetails = new wa3.e.a.GoToCountryDetails(new SetupData(onCountryClicked.getIsoCode(), onCountryClicked.getIsSubscribed()));
                this.f211707f = vq.j.a(onCountryClicked);
                this.f211706e = 1;
                if (p0Var.F(goToCountryDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.e.OnCountryClicked onCountryClicked, wa3.k.a aVar, tq.e<? super oq.i0> eVar) {
            g gVar = p0.this.new g(eVar);
            gVar.f211707f = onCountryClicked;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/e$f;", "action", "Lk10/c0;", "Lwa3/k$a$b;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/e$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<wa3.e.OnTabSelected, k10.c0<wa3.k.a.Screen>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211711g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Screen O(wa3.e.OnTabSelected onTabSelected, wa3.k.a.Screen screen) {
            return screen.b(wa3.k.a.ContentData.b(screen.getContentData(), onTabSelected.getSelectedTab(), null, null, null, 14, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wa3.e.OnTabSelected onTabSelected = (wa3.e.OnTabSelected) this.f211710f;
            k10.c0 c0Var = (k10.c0) this.f211711g;
            uq.b.e();
            if (this.f211709e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wa3.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.h.O(onTabSelected, (k.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.e.OnTabSelected onTabSelected, k10.c0<wa3.k.a.Screen> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            h hVar = new h(eVar);
            hVar.f211710f = onTabSelected;
            hVar.f211711g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/e$e;", "<unused var>", "Lk10/c0;", "Lwa3/k$a$b;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/e$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<wa3.e.C5566e, k10.c0<wa3.k.a.Screen>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211713f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Search O(wa3.k.a.Screen screen) {
            return new wa3.k.a.Search("", screen.getContentData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211713f;
            uq.b.e();
            if (this.f211712e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: wa3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.i.O((k.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.e.C5566e c5566e, k10.c0<wa3.k.a.Screen> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            i iVar = new i(eVar);
            iVar.f211713f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/e$c;", "action", "Lk10/c0;", "Lwa3/k$a$b;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/e$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<wa3.e.OnChangeSubscriptionStatus, k10.c0<wa3.k.a.Screen>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211716g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Screen O(p0 p0Var, k10.c0 c0Var, wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus, wa3.k.a.Screen screen) {
            return screen.b(p0Var.T9(c0Var, onChangeSubscriptionStatus));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus = (wa3.e.OnChangeSubscriptionStatus) this.f211715f;
            final k10.c0 c0Var = (k10.c0) this.f211716g;
            uq.b.e();
            if (this.f211714e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.b(new er.l() { // from class: wa3.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.j.O(p0Var, c0Var, onChangeSubscriptionStatus, (k.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus, k10.c0<wa3.k.a.Screen> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            j jVar = p0.this.new j(eVar);
            jVar.f211715f = onChangeSubscriptionStatus;
            jVar.f211716g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/f;", "<unused var>", "Lk10/c0;", "Lwa3/k$a$c;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<wa3.f, k10.c0<wa3.k.a.Search>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211719f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Screen O(wa3.k.a.Search search) {
            return new wa3.k.a.Screen(wa3.k.a.ContentData.b(search.getContentData(), null, null, null, search.getContentData().d(), 7, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f211719f;
            uq.b.e();
            if (this.f211718e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: wa3.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.k.O((k.a.Search) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.f fVar, k10.c0<wa3.k.a.Search> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            k kVar = new k(eVar);
            kVar.f211719f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/h;", "action", "Lk10/c0;", "Lwa3/k$a$c;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<OnSearchQueryChanged, k10.c0<wa3.k.a.Search>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211721f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211722g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Search O(OnSearchQueryChanged onSearchQueryChanged, wa3.k.a.Search search) {
            return wa3.k.a.Search.c(search, onSearchQueryChanged.getQuery(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnSearchQueryChanged onSearchQueryChanged = (OnSearchQueryChanged) this.f211721f;
            k10.c0 c0Var = (k10.c0) this.f211722g;
            uq.b.e();
            if (this.f211720e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.d9(new OnSearchQueryApply(onSearchQueryChanged.getQuery()));
            return c0Var.b(new er.l() { // from class: wa3.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.l.O(onSearchQueryChanged, (k.a.Search) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnSearchQueryChanged onSearchQueryChanged, k10.c0<wa3.k.a.Search> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            l lVar = p0.this.new l(eVar);
            lVar.f211721f = onSearchQueryChanged;
            lVar.f211722g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/g;", "action", "Lk10/c0;", "Lwa3/k$a$c;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<OnSearchQueryApply, k10.c0<wa3.k.a.Search>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211726g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Search O(List list, wa3.k.a.Search search) {
            return wa3.k.a.Search.c(search, null, wa3.k.a.ContentData.b(search.getContentData(), null, null, null, list, 7, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnSearchQueryApply onSearchQueryApply = (OnSearchQueryApply) this.f211725f;
            k10.c0 c0Var = (k10.c0) this.f211726g;
            Object objE = uq.b.e();
            int i15 = this.f211724e;
            if (i15 == 0) {
                oq.u.b(obj);
                long jA = p0.f211670l.a();
                this.f211725f = onSearchQueryApply;
                this.f211726g = c0Var;
                this.f211724e = 1;
                if (ju.z0.c(jA, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final List listH9 = p0.this.H9(((wa3.k.a.Search) c0Var.a()).getContentData().d(), onSearchQueryApply.getQuery());
            return c0Var.b(new er.l() { // from class: wa3.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.m.O(listH9, (k.a.Search) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnSearchQueryApply onSearchQueryApply, k10.c0<wa3.k.a.Search> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            m mVar = p0.this.new m(eVar);
            mVar.f211725f = onSearchQueryApply;
            mVar.f211726g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/i;", "<unused var>", "Lk10/c0;", "Lwa3/k$a$c;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<wa3.i, k10.c0<wa3.k.a.Search>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211729f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Search O(k10.c0 c0Var, wa3.k.a.Search search) {
            return search.b("", wa3.k.a.ContentData.b(((wa3.k.a.Search) c0Var.a()).getContentData(), null, null, null, ((wa3.k.a.Search) c0Var.a()).getContentData().d(), 7, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f211729f;
            uq.b.e();
            if (this.f211728e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: wa3.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.n.O(c0Var, (k.a.Search) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.i iVar, k10.c0<wa3.k.a.Search> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            n nVar = new n(eVar);
            nVar.f211729f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwa3/e$c;", "action", "Lk10/c0;", "Lwa3/k$a$c;", "state", "Lk10/l;", "Lwa3/k;", "<anonymous>", "(Lwa3/e$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<wa3.e.OnChangeSubscriptionStatus, k10.c0<wa3.k.a.Search>, tq.e<? super k10.l<? extends wa3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f211731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211732g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wa3.k.a.Search O(p0 p0Var, k10.c0 c0Var, wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus, wa3.k.a.Search search) {
            return wa3.k.a.Search.c(search, null, p0Var.T9(c0Var, onChangeSubscriptionStatus), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus = (wa3.e.OnChangeSubscriptionStatus) this.f211731f;
            final k10.c0 c0Var = (k10.c0) this.f211732g;
            uq.b.e();
            if (this.f211730e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.b(new er.l() { // from class: wa3.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.o.O(p0Var, c0Var, onChangeSubscriptionStatus, (k.a.Search) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus, k10.c0<wa3.k.a.Search> c0Var, tq.e<? super k10.l<? extends wa3.k>> eVar) {
            o oVar = p0.this.new o(eVar);
            oVar.f211731f = onChangeSubscriptionStatus;
            oVar.f211732g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f211672n = gu.d.q(400, gu.e.MILLISECONDS);
    }

    public p0(yy.a aVar, xa3.i iVar, x93.d dVar, ac4.a aVar2, hb4.d dVar2, ib4.c cVar, wa3.j jVar) {
        this.mapper = iVar;
        this.travelAbroadServiceInteractor = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.errorVmsFactory = dVar2;
        this.genericDomainErrorMapper = cVar;
        wa3.m mVar = wa3.m.f211643a;
        this.initialState = mVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(mVar, new er.l() { // from class: wa3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.J9(this.f211620a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), C9(mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wa3.n.a C9(wa3.k state) {
        return this.mapper.b(new xa3.i.Params(state, b9(wa3.e.b.f211611a), b9(wa3.e.C5566e.f211616a), b9(wa3.f.f211619a), new er.l() { // from class: wa3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.D9(this.f211618a, (String) obj);
            }
        }, b9(wa3.i.f211625a), new er.p() { // from class: wa3.g0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p0.E9(this.f211622a, (String) obj, ((Boolean) obj2).booleanValue());
            }
        }, new er.l() { // from class: wa3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.F9(this.f211624a, (k.a.ContentData.InterfaceC5568a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(p0 p0Var, String str) {
        p0Var.d9(new OnSearchQueryChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(p0 p0Var, String str, boolean z15) {
        p0Var.d9(new wa3.e.OnCountryClicked(str, z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(p0 p0Var, wa3.k.a.ContentData.InterfaceC5568a interfaceC5568a) {
        p0Var.d9(new wa3.e.OnTabSelected(interfaceC5568a));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Country> G9(List<Country> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Country) obj).getIsSubscribed()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Country> H9(List<Country> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (fu.r.b0(((Country) obj).getName(), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(final p0 p0Var, k10.v vVar) {
        vVar.c(fr.q0.c(wa3.k.class), new er.l() { // from class: wa3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.K9(this.f211626a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(wa3.m.class), new er.l() { // from class: wa3.j0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.L9(this.f211630a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: wa3.k0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.M9(this.f211640a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(wa3.k.a.class), new er.l() { // from class: wa3.l0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.N9(this.f211642a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(wa3.k.a.Screen.class), new er.l() { // from class: wa3.m0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.O9(this.f211644a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(wa3.k.a.Search.class), new er.l() { // from class: wa3.n0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.P9(this.f211664a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(p0 p0Var, k10.z zVar) {
        c cVar = p0Var.new c(null);
        zVar.x(fr.q0.c(wa3.e.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(p0 p0Var, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(wa3.d.class), oVar, eVar);
        zVar.x(fr.q0.c(wa3.c.class), oVar, p0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(p0 p0Var, k10.z zVar) {
        g gVar = p0Var.new g(null);
        zVar.x(fr.q0.c(wa3.e.OnCountryClicked.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(p0 p0Var, k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(wa3.e.OnTabSelected.class), oVar, hVar);
        zVar.v(fr.q0.c(wa3.e.C5566e.class), oVar, new i(null));
        zVar.v(fr.q0.c(wa3.e.OnChangeSubscriptionStatus.class), oVar, p0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(p0 p0Var, k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(wa3.f.class), oVar, kVar);
        zVar.v(fr.q0.c(OnSearchQueryChanged.class), oVar, p0Var.new l(null));
        zVar.v(fr.q0.c(OnSearchQueryApply.class), oVar, p0Var.new m(null));
        zVar.v(fr.q0.c(wa3.i.class), oVar, new n(null));
        zVar.v(fr.q0.c(wa3.e.OnChangeSubscriptionStatus.class), oVar, p0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c Q9(dx.b bVar) {
        return this.errorVmsFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: wa3.o0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.R9(this.f211667a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(p0 p0Var, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            p0Var.d9(wa3.d.f211607a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            p0Var.d9(wa3.c.f211603a);
        }
        return oq.i0.f148189a;
    }

    private final List<Country> S9(List<Country> list, wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus) {
        List<Country> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        for (Country countryB : list2) {
            if (fr.t.c(countryB.getIsoCode(), onChangeSubscriptionStatus.getIsoCode()) && countryB.getIsSubscribed() != onChangeSubscriptionStatus.getIsSubscribed()) {
                countryB = Country.b(countryB, null, null, onChangeSubscriptionStatus.getIsSubscribed(), null, 11, null);
            }
            arrayList.add(countryB);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wa3.k.a.ContentData T9(k10.c0<? extends wa3.k.a> c0Var, wa3.e.OnChangeSubscriptionStatus onChangeSubscriptionStatus) {
        List<Country> listH9;
        wa3.k.a.ContentData contentData = c0Var.a().getContentData();
        List<Country> listS9 = S9(contentData.d(), onChangeSubscriptionStatus);
        List<Country> listG9 = G9(listS9);
        wa3.k.a aVarA = c0Var.a();
        if (aVarA instanceof wa3.k.a.Search) {
            listH9 = H9(listS9, ((wa3.k.a.Search) aVarA).getSearchQuery());
        } else {
            if (!(aVarA instanceof wa3.k.a.Screen)) {
                throw new oq.p();
            }
            listH9 = listS9;
        }
        return wa3.k.a.ContentData.b(contentData, null, listS9, listG9, listH9, 1, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(wa3.e.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public void P5(wa3.j data) {
        if (data instanceof wa3.j.CountryToUpdateSubscriptionStatus) {
            wa3.j.CountryToUpdateSubscriptionStatus countryToUpdateSubscriptionStatus = (wa3.j.CountryToUpdateSubscriptionStatus) data;
            d9(new wa3.e.OnChangeSubscriptionStatus(countryToUpdateSubscriptionStatus.getIsoCode(), countryToUpdateSubscriptionStatus.getIsSubscribed()));
        }
    }

    @Override // zx.b
    public xw.b<wa3.e.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<wa3.k, wa3.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<wa3.n.a> getState() {
        return this.state;
    }
}
