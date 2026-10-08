package t33;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt0.BEReportCategoriesResponse;
import tt0.BEReportCategory;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lt33/s;", "Ll00/g;", "Lt33/b;", "Lt33/a;", "Lt33/c;", "", "Lyy/a;", "stateMachineFactory", "Lu33/b;", "mapper", "Lac4/a;", "loaderUC", "Lut0/b;", "fetchReportCategoriesUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lt33/d;", "contract", "<init>", "(Lyy/a;Lu33/b;Lac4/a;Lut0/b;Lhb4/d;Lib4/c;Lt33/d;)V", "Ldx/b;", "error", "Ljb4/b;", "t9", "(Ldx/b;)Ljb4/b;", "Lt33/c$a;", "v9", "(Lt33/b;)Lt33/c$a;", "b", "Lu33/b;", "c", "Lac4/a;", "d", "Lut0/b;", "e", "Lhb4/d;", "f", "Lib4/c;", "Lt33/b$b;", "g", "Lt33/b$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lt33/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<t33.b, t33.a> implements t33.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u33.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ut0.b fetchReportCategoriesUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t33.b.C4869b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<t33.b, t33.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<t33.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<t33.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<t33.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f187556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f187557b;

        /* JADX INFO: renamed from: t33.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4872a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f187558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f187559b;

            /* JADX INFO: renamed from: t33.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4873a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f187560d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f187561e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f187562f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f187564h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f187565j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f187566k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f187567l;

                public C4873a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f187560d = obj;
                    this.f187561e |= PKIFailureInfo.systemUnavail;
                    return C4872a.this.F(null, this);
                }
            }

            public C4872a(mu.h hVar, s sVar) {
                this.f187558a = hVar;
                this.f187559b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4873a c4873a;
                if (eVar instanceof C4873a) {
                    c4873a = (C4873a) eVar;
                    int i15 = c4873a.f187561e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4873a.f187561e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4873a = new C4873a(eVar);
                    }
                } else {
                    c4873a = new C4873a(eVar);
                }
                Object obj2 = c4873a.f187560d;
                Object objE = uq.b.e();
                int i16 = c4873a.f187561e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f187558a;
                    t33.c.a aVarV9 = this.f187559b.v9((t33.b) obj);
                    c4873a.f187562f = vq.j.a(obj);
                    c4873a.f187564h = vq.j.a(c4873a);
                    c4873a.f187565j = vq.j.a(obj);
                    c4873a.f187566k = vq.j.a(hVar);
                    c4873a.f187567l = 0;
                    c4873a.f187561e = 1;
                    if (hVar.F(aVarV9, c4873a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f187556a = gVar;
            this.f187557b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super t33.c.a> hVar, tq.e eVar) {
            Object objA = this.f187556a.a(new C4872a(hVar, this.f187557b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt33/a$c;", "action", "Lt33/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt33/a$c;Lt33/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<t33.a.c, t33.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187569f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t33.a.c cVar = (t33.a.c) this.f187569f;
            Object objE = uq.b.e();
            int i15 = this.f187568e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<t33.a.c> bVarY1 = s.this.Y1();
                this.f187569f = vq.j.a(cVar);
                this.f187568e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(t33.a.c cVar, t33.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = s.this.new b(eVar);
            bVar2.f187569f = cVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lt33/b$b;", "state", "Lk10/l;", "Lt33/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<t33.b.C4869b>, tq.e<? super k10.l<? extends t33.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187572f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lt33/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends t33.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f187574e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f187575f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<t33.b.C4869b> f187576g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, c0<t33.b.C4869b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f187575f = sVar;
                this.f187576g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final t33.b.LoadingError X(s sVar, dx.b bVar, t33.b.C4869b c4869b) {
                return new t33.b.LoadingError(sVar.errorVMSFactory.a(sVar.t9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final t33.b.Initialized Y(BEReportCategoriesResponse bEReportCategoriesResponse, t33.b.C4869b c4869b) {
                return new t33.b.Initialized(bEReportCategoriesResponse);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f187574e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ut0.b bVar = this.f187575f.fetchReportCategoriesUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f187574e = 1;
                    obj = bVar.c(c1792a, this);
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
                c0<t33.b.C4869b> c0Var = this.f187576g;
                final s sVar = this.f187575f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: t33.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.c.a.X(sVar, bVar2, (b.C4869b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEReportCategoriesResponse bEReportCategoriesResponse = (BEReportCategoriesResponse) ((dx.i.Right) iVar).b();
                return this.f187576g.d(new er.l() { // from class: t33.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.c.a.Y(bEReportCategoriesResponse, (b.C4869b) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f187575f, this.f187576g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends t33.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f187572f;
            Object objE = uq.b.e();
            int i15 = this.f187571e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.loaderUC;
            a aVar2 = new a(s.this, c0Var, null);
            this.f187572f = vq.j.a(c0Var);
            this.f187571e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<t33.b.C4869b> c0Var, tq.e<? super k10.l<? extends t33.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = s.this.new c(eVar);
            cVar.f187572f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt33/a$a;", "<unused var>", "Lt33/b$c;", "Loq/i0;", "<anonymous>", "(Lt33/a$a;Lt33/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<t33.a.C4867a, t33.b.LoadingError, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187577e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f187577e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(t33.a.c.C4868a.f187516a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t33.a.C4867a c4867a, t33.b.LoadingError loadingError, tq.e<? super i0> eVar) {
            return s.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt33/a$b;", "<unused var>", "Lk10/c0;", "Lt33/b$c;", "state", "Lk10/l;", "Lt33/b;", "<anonymous>", "(Lt33/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<t33.a.b, c0<t33.b.LoadingError>, tq.e<? super k10.l<? extends t33.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187580f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t33.b.C4869b O(t33.b.LoadingError loadingError) {
            return t33.b.C4869b.f187520a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f187580f;
            uq.b.e();
            if (this.f187579e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: t33.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O((b.LoadingError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t33.a.b bVar, c0<t33.b.LoadingError> c0Var, tq.e<? super k10.l<? extends t33.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f187580f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt33/a$d;", "action", "Lt33/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt33/a$d;Lt33/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<t33.a.SelectCategory, t33.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ t33.d f187583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ s f187584h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t33.d dVar, s sVar, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f187583g = dVar;
            this.f187584h = sVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t33.a.SelectCategory selectCategory = (t33.a.SelectCategory) this.f187582f;
            uq.b.e();
            if (this.f187581e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f187583g.G5(selectCategory.getCategory());
            this.f187584h.d9(t33.a.c.b.f187517a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t33.a.SelectCategory selectCategory, t33.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = new f(this.f187583g, this.f187584h, eVar);
            fVar.f187582f = selectCategory;
            return fVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, u33.b bVar, ac4.a aVar2, ut0.b bVar2, hb4.d dVar, ib4.c cVar, final t33.d dVar2) {
        this.mapper = bVar;
        this.loaderUC = aVar2;
        this.fetchReportCategoriesUC = bVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        t33.b.C4869b c4869b = t33.b.C4869b.f187520a;
        this.initialState = c4869b;
        this.stateMachine = aVar.a(c4869b, new er.l() { // from class: t33.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f187545a, dVar2, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), v9(c4869b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, z zVar) {
        zVar.A(sVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, z zVar) {
        d dVar = sVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t33.a.C4867a.class), oVar, dVar);
        zVar.v(q0.c(t33.a.b.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t33.d dVar, s sVar, z zVar) {
        f fVar = new f(dVar, sVar, null);
        zVar.x(q0.c(t33.a.SelectCategory.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b t9(dx.b error) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: t33.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f187544a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            sVar.d9(t33.a.b.f187515a);
        } else {
            sVar.d9(t33.a.C4867a.f187514a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t33.c.a v9(t33.b bVar) {
        return this.mapper.b(new u33.b.Params(bVar, new er.l() { // from class: t33.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f187538a, (BEReportCategory) obj);
            }
        }, b9(t33.a.c.C4868a.f187516a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, BEReportCategory bEReportCategory) {
        sVar.d9(new t33.a.SelectCategory(bEReportCategory));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final s sVar, final t33.d dVar, k10.v vVar) {
        vVar.c(q0.c(t33.b.class), new er.l() { // from class: t33.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f187539a, (z) obj);
            }
        });
        vVar.c(q0.c(t33.b.C4869b.class), new er.l() { // from class: t33.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f187540a, (z) obj);
            }
        });
        vVar.c(q0.c(t33.b.LoadingError.class), new er.l() { // from class: t33.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f187541a, (z) obj);
            }
        });
        vVar.c(q0.c(t33.b.Initialized.class), new er.l() { // from class: t33.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.C9(dVar, sVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        zVar.x(q0.c(t33.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<t33.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<t33.b, t33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<t33.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(t33.d dVar) {
        super.P5(dVar);
    }
}
