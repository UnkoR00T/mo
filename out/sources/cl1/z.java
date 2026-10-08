package cl1;

import fr.q0;
import il0.BeChildAndParentsData;
import ju3.ChildData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u0016048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010=\u001a\u00020:*\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcl1/z;", "Ll00/g;", "Lcl1/k;", "", "Lcl1/l;", "Lyy/a;", "stateMachineFactory", "Lel1/a;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lsl0/c;", "getChildAndParentsDataUC", "Lhb4/d;", "errorVMSFactory", "Lel1/e;", "errorMapper", "Ldl1/a;", "contract", "<init>", "(Lyy/a;Lel1/a;Lac4/a;Lsl0/c;Lhb4/d;Lel1/e;Ldl1/a;)V", "state", "Lcl1/l$a;", "u9", "(Lcl1/k;)Lcl1/l$a;", "b", "Lel1/a;", "c", "Lac4/a;", "d", "Lsl0/c;", "e", "Lhb4/d;", "f", "Lel1/e;", "Lcl1/j;", "g", "Lcl1/j;", "initialState", "Lxw/b;", "Lcl1/d;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Ljb4/b;", "t9", "(Ldx/b;)Ljb4/b;", "errorData", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<k, Object> implements l, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final el1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sl0.c getChildAndParentsDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final el1.e errorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Loading initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cl1.d> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<k, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<l.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28136a;

        static {
            int[] iArr = new int[el1.e.a.values().length];
            try {
                iArr[el1.e.a.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[el1.e.a.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[el1.e.a.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28136a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<l.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f28137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f28138b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f28139a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f28140b;

            /* JADX INFO: renamed from: cl1.z$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0720a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f28141d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f28142e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f28143f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f28145h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f28146j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f28147k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f28148l;

                public C0720a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f28141d = obj;
                    this.f28142e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f28139a = hVar;
                this.f28140b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0720a c0720a;
                if (eVar instanceof C0720a) {
                    c0720a = (C0720a) eVar;
                    int i15 = c0720a.f28142e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0720a.f28142e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0720a = new C0720a(eVar);
                    }
                } else {
                    c0720a = new C0720a(eVar);
                }
                Object obj2 = c0720a.f28141d;
                Object objE = uq.b.e();
                int i16 = c0720a.f28142e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f28139a;
                    l.a aVarU9 = this.f28140b.u9((k) obj);
                    c0720a.f28143f = vq.j.a(obj);
                    c0720a.f28145h = vq.j.a(c0720a);
                    c0720a.f28146j = vq.j.a(obj);
                    c0720a.f28147k = vq.j.a(hVar);
                    c0720a.f28148l = 0;
                    c0720a.f28142e = 1;
                    if (hVar.F(aVarU9, c0720a) == objE) {
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

        public b(mu.g gVar, z zVar) {
            this.f28137a = gVar;
            this.f28138b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l.a> hVar, tq.e eVar) {
            Object objA = this.f28137a.a(new a(hVar, this.f28138b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcl1/e;", "<unused var>", "Lcl1/k;", "Loq/i0;", "<anonymous>", "(Lcl1/e;Lcl1/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<cl1.e, k, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28149e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f28149e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                cl1.d.a aVar = cl1.d.a.f28082a;
                this.f28149e = 1;
                if (zVar.F(aVar, this) == objE) {
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
        public final Object w(cl1.e eVar, k kVar, tq.e<? super i0> eVar2) {
            return z.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcl1/f;", "<unused var>", "Lcl1/k;", "Loq/i0;", "<anonymous>", "(Lcl1/f;Lcl1/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<cl1.f, k, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28151e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f28151e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                cl1.d.b bVar = cl1.d.b.f28083a;
                this.f28151e = 1;
                if (zVar.F(bVar, this) == objE) {
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
        public final Object w(cl1.f fVar, k kVar, tq.e<? super i0> eVar) {
            return z.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcl1/j;", "state", "Lk10/l;", "Lcl1/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28154f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcl1/k;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends k>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28156e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f28157f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f28158g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f28157f = zVar;
                this.f28158g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(z zVar, dx.b bVar, Loading loading) {
                return new Error(loading.getData(), zVar.errorVMSFactory.a(zVar.t9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final k.Initialized Y(BeChildAndParentsData beChildAndParentsData, Loading loading) {
                return new k.Initialized(beChildAndParentsData);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f28156e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    sl0.c cVar = this.f28157f.getChildAndParentsDataUC;
                    Data data = this.f28158g.a().getData();
                    sl0.c.Params params = new sl0.c.Params(data.getFirstName(), data.getLastName(), data.getPesel(), null);
                    this.f28156e = 1;
                    obj = cVar.c(params, this);
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
                k10.c0<Loading> c0Var = this.f28158g;
                final z zVar = this.f28157f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: cl1.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.e.a.X(zVar, bVar, (Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BeChildAndParentsData beChildAndParentsData = (BeChildAndParentsData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: cl1.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.e.a.Y(beChildAndParentsData, (Loading) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f28157f, this.f28158g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends k>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f28154f;
            Object objE = uq.b.e();
            int i15 = this.f28153e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, null);
            this.f28154f = vq.j.a(c0Var);
            this.f28153e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends k>> eVar) {
            return ((e) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f28154f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcl1/c;", "<unused var>", "Lk10/c0;", "Lcl1/i;", "state", "Lk10/l;", "Lcl1/k;", "<anonymous>", "(Lcl1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<cl1.c, k10.c0<Error>, tq.e<? super k10.l<? extends k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28160f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f28160f;
            uq.b.e();
            if (this.f28159e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cl1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cl1.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends k>> eVar) {
            f fVar = new f(eVar);
            fVar.f28160f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcl1/a;", "<unused var>", "Lcl1/i;", "Loq/i0;", "<anonymous>", "(Lcl1/a;Lcl1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<cl1.a, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28161e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f28161e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                cl1.d.a aVar = cl1.d.a.f28082a;
                this.f28161e = 1;
                if (zVar.F(aVar, this) == objE) {
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
        public final Object w(cl1.a aVar, Error error, tq.e<? super i0> eVar) {
            return z.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcl1/b;", "<unused var>", "Lcl1/i;", "Loq/i0;", "<anonymous>", "(Lcl1/b;Lcl1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<cl1.b, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28163e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f28163e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                cl1.d.c cVar = cl1.d.c.f28084a;
                this.f28163e = 1;
                if (zVar.F(cVar, this) == objE) {
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
        public final Object w(cl1.b bVar, Error error, tq.e<? super i0> eVar) {
            return z.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcl1/g;", "<unused var>", "Lcl1/k$a;", "state", "Loq/i0;", "<anonymous>", "(Lcl1/g;Lcl1/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<cl1.g, k.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f28166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dl1.a f28167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ z f28168h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(dl1.a aVar, z zVar, tq.e<? super i> eVar) {
            super(3, eVar);
            this.f28167g = aVar;
            this.f28168h = zVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k.Initialized initialized = (k.Initialized) this.f28166f;
            Object objE = uq.b.e();
            int i15 = this.f28165e;
            if (i15 == 0) {
                oq.u.b(obj);
                this.f28167g.j(initialized.getData());
                z zVar = this.f28168h;
                cl1.d.C0717d c0717d = cl1.d.C0717d.f28085a;
                this.f28166f = vq.j.a(initialized);
                this.f28165e = 1;
                if (zVar.F(c0717d, this) == objE) {
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
        public final Object w(cl1.g gVar, k.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = new i(this.f28167g, this.f28168h, eVar);
            iVar.f28166f = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, el1.a aVar2, ac4.a aVar3, sl0.c cVar, hb4.d dVar, el1.e eVar, final dl1.a aVar4) {
        this.mapper = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.getChildAndParentsDataUC = cVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = eVar;
        ChildData childData = aVar4.c().getChildData();
        Loading loading = new Loading(new Data(childData.getFirstName(), childData.getSurname(), childData.getPesel(), null));
        this.initialState = loading;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(loading, new er.l() { // from class: cl1.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.w9(this.f28125a, aVar4, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), u9(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(dl1.a aVar, z zVar, k10.z zVar2) {
        i iVar = new i(aVar, zVar, null);
        zVar2.x(q0.c(cl1.g.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(z zVar, el1.e.a aVar) {
        int i15 = a.f28136a[aVar.ordinal()];
        if (i15 == 1) {
            zVar.d9(cl1.c.f28081a);
        } else if (i15 == 2) {
            zVar.d9(cl1.a.f28076a);
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            zVar.d9(cl1.b.f28079a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b t9(dx.b bVar) {
        return this.errorMapper.b(new el1.e.Params(bVar, new er.l() { // from class: cl1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.m9(this.f28124a, (el1.e.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.a u9(k state) {
        return this.mapper.b(new el1.a.Params(state, b9(cl1.e.f28086a), b9(cl1.f.f28088a), b9(cl1.g.f28090a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final z zVar, final dl1.a aVar, k10.v vVar) {
        vVar.c(q0.c(k.class), new er.l() { // from class: cl1.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.x9(this.f28119a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: cl1.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.y9(this.f28120a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: cl1.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.z9(this.f28121a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(k.Initialized.class), new er.l() { // from class: cl1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.A9(aVar, zVar, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(z zVar, k10.z zVar2) {
        c cVar = zVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(cl1.e.class), oVar, cVar);
        zVar2.x(q0.c(cl1.f.class), oVar, zVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(z zVar, k10.z zVar2) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(cl1.c.class), oVar, fVar);
        zVar2.x(q0.c(cl1.a.class), oVar, zVar.new g(null));
        zVar2.x(q0.c(cl1.b.class), oVar, zVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<cl1.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<k, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(cl1.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(dl1.a aVar) {
        super.P5(aVar);
    }
}
