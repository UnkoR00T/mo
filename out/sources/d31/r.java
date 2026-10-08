package d31;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010C\u001a\u00020@*\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Ld31/r;", "Ll00/g;", "Ld31/f;", "Ld31/c;", "Ld31/g;", "", "Lyy/a;", "stateMachineFactory", "Le31/a;", "mapper", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lac4/a;", "callActionWithLoaderUC", "Lv21/a;", "interactor", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lf31/a;", "infoPageType", "<init>", "(Lyy/a;Le31/a;Lq34/d;Lac4/a;Lv21/a;Lhb4/d;Lib4/c;Lf31/a;)V", "state", "Ld31/g$a;", "w9", "(Ld31/f;)Ld31/g$a;", "b", "Le31/a;", "c", "Lq34/d;", "d", "Lac4/a;", "e", "Lv21/a;", "f", "Lhb4/d;", "g", "Lib4/c;", "h", "Lf31/a;", "j", "Ld31/f;", "initialState", "Lxw/b;", "Ld31/c$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Ljb4/b;", "v9", "(Ldx/b;)Ljb4/b;", "errorData", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<d31.f, d31.c> implements d31.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e31.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q34.d checkServiceTemporaryInterruptionUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v21.a interactor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final f31.a infoPageType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d31.f initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d31.c.a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<d31.f, d31.c> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<d31.g.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39590a;

        static {
            int[] iArr = new int[f31.a.values().length];
            try {
                iArr[f31.a.Collision.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f31.a.VehicleBuy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39590a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<d31.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f39591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f39592b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f39593a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f39594b;

            /* JADX INFO: renamed from: d31.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0859a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f39595d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f39596e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f39597f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f39599h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f39600j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f39601k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f39602l;

                public C0859a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f39595d = obj;
                    this.f39596e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f39593a = hVar;
                this.f39594b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0859a c0859a;
                if (eVar instanceof C0859a) {
                    c0859a = (C0859a) eVar;
                    int i15 = c0859a.f39596e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0859a.f39596e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0859a = new C0859a(eVar);
                    }
                } else {
                    c0859a = new C0859a(eVar);
                }
                Object obj2 = c0859a.f39595d;
                Object objE = uq.b.e();
                int i16 = c0859a.f39596e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f39593a;
                    d31.g.a aVarW9 = this.f39594b.w9((d31.f) obj);
                    c0859a.f39597f = vq.j.a(obj);
                    c0859a.f39599h = vq.j.a(c0859a);
                    c0859a.f39600j = vq.j.a(obj);
                    c0859a.f39601k = vq.j.a(hVar);
                    c0859a.f39602l = 0;
                    c0859a.f39596e = 1;
                    if (hVar.F(aVarW9, c0859a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f39591a = gVar;
            this.f39592b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d31.g.a> hVar, tq.e eVar) {
            Object objA = this.f39591a.a(new a(hVar, this.f39592b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld31/c$b;", "<unused var>", "Ld31/f;", "Loq/i0;", "<anonymous>", "(Ld31/c$b;Ld31/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<d31.c.b, d31.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39603e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f39603e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                d31.c.a.C0852a c0852a = d31.c.a.C0852a.f39544a;
                this.f39603e = 1;
                if (rVar.F(c0852a, this) == objE) {
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
        public final Object w(d31.c.b bVar, d31.f fVar, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ld31/e;", "state", "Lk10/l;", "Ld31/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<d31.e>, tq.e<? super k10.l<? extends d31.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39606f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ld31/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends d31.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f39608e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f39609f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<d31.e> f39610g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<d31.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f39609f = rVar;
                this.f39610g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(r rVar, dx.b bVar, d31.e eVar) {
                return new Error(rVar.errorVMSFactory.a(rVar.v9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final d31.f.Initialized Y(k34.u uVar, d31.e eVar) {
                return new d31.f.Initialized(new d31.f.Initialized.InterfaceC0855a.Collision(uVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f39608e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v21.a aVar = this.f39609f.interactor;
                    this.f39608e = 1;
                    obj = aVar.b(this);
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
                c0<d31.e> c0Var = this.f39610g;
                final r rVar = this.f39609f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: d31.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.X(rVar, bVar, (e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final k34.u uVar = (k34.u) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: d31.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.a.Y(uVar, (e) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f39609f, this.f39610g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends d31.f>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f39606f;
            Object objE = uq.b.e();
            int i15 = this.f39605e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUC;
            a aVar2 = new a(r.this, c0Var, null);
            this.f39606f = vq.j.a(c0Var);
            this.f39605e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<d31.e> c0Var, tq.e<? super k10.l<? extends d31.f>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f39606f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld31/b;", "<unused var>", "Lk10/c0;", "Ld31/d;", "state", "Lk10/l;", "Ld31/f;", "<anonymous>", "(Ld31/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<d31.b, c0<Error>, tq.e<? super k10.l<? extends d31.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39612f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d31.e O(Error error) {
            return d31.e.f39550a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f39612f;
            uq.b.e();
            if (this.f39611e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d31.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d31.b bVar, c0<Error> c0Var, tq.e<? super k10.l<? extends d31.f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f39612f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld31/a;", "<unused var>", "Ld31/d;", "Loq/i0;", "<anonymous>", "(Ld31/a;Ld31/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<d31.a, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39613e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f39613e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(d31.c.b.f39547a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d31.a aVar, Error error, tq.e<? super i0> eVar) {
            return r.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld31/c$c;", "<unused var>", "Ld31/f$a;", "Loq/i0;", "<anonymous>", "(Ld31/c$c;Ld31/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<d31.c.C0854c, d31.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f39615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f39616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f39617g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f39618h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f39619j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f39619j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f39616f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r0 = r6.f39616f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r6.f39615e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto La0
            L2b:
                oq.u.b(r7)
                goto L48
            L2f:
                oq.u.b(r7)
                d31.r r7 = d31.r.this
                q34.d r7 = d31.r.p9(r7)
                q34.d$a r1 = new q34.d$a
                rq0.c r5 = rq0.c.VEHICLE_COLLISION
                r1.<init>(r5)
                r6.f39619j = r4
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L48
                goto L9f
            L48:
                dx.i r7 = (dx.i) r7
                d31.r r1 = d31.r.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                d31.c$a$b r4 = d31.c.a.b.f39545a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f39615e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f39616f = r7
                r6.f39617g = r5
                r6.f39618h = r5
                r6.f39619j = r3
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                d31.c$a$c r4 = new d31.c$a$c
                r4.<init>(r3)
                java.lang.Object r7 = vq.j.a(r7)
                r6.f39615e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f39616f = r7
                r6.f39617g = r5
                r6.f39618h = r5
                r6.f39619j = r2
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            La3:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: d31.r.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d31.c.C0854c c0854c, d31.f.Initialized initialized, tq.e<? super i0> eVar) {
            return r.this.new g(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, e31.a aVar2, q34.d dVar, ac4.a aVar3, v21.a aVar4, hb4.d dVar2, ib4.c cVar, f31.a aVar5) {
        d31.f initialized;
        this.mapper = aVar2;
        this.checkServiceTemporaryInterruptionUC = dVar;
        this.callActionWithLoaderUC = aVar3;
        this.interactor = aVar4;
        this.errorVMSFactory = dVar2;
        this.errorMapper = cVar;
        this.infoPageType = aVar5;
        int i15 = a.f39590a[aVar5.ordinal()];
        if (i15 == 1) {
            initialized = d31.e.f39550a;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            initialized = new d31.f.Initialized(d31.f.Initialized.InterfaceC0855a.b.f39555a);
        }
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: d31.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f39578a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), w9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(r rVar, z zVar) {
        zVar.A(rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(d31.b.class), oVar, eVar);
        zVar.x(q0.c(d31.a.class), oVar, rVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, z zVar) {
        g gVar = rVar.new g(null);
        zVar.x(q0.c(d31.c.C0854c.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(r rVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            rVar.d9(d31.a.f39542a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            rVar.d9(d31.b.f39543a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b v9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: d31.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.m9(this.f39577a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d31.g.a w9(d31.f state) {
        return this.mapper.b(new e31.a.Params(state, b9(d31.c.b.f39547a), b9(d31.c.C0854c.f39548a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(d31.f.class), new er.l() { // from class: d31.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f39573a, (z) obj);
            }
        });
        vVar.c(q0.c(d31.e.class), new er.l() { // from class: d31.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f39574a, (z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: d31.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f39575a, (z) obj);
            }
        });
        vVar.c(q0.c(d31.f.Initialized.class), new er.l() { // from class: d31.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f39576a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, z zVar) {
        c cVar = rVar.new c(null);
        zVar.x(q0.c(d31.c.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d31.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<d31.f, d31.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d31.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(d31.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(f31.a aVar) {
        super.P5(aVar);
    }
}
