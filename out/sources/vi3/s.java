package vi3;

import ae3.b0;
import fr.q0;
import hi3.SearchInsuranceItem;
import hi3.SearchInsuranceModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k10.c0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.Insurance;
import sv0.InsuranceProviderData;
import xi3.InsuranceFieldsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BK\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020&2\b\u0010$\u001a\u0004\u0018\u00010\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u001e0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lvi3/s;", "Ll00/g;", "Lvi3/b;", "Lvi3/a;", "Lvi3/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lwi3/c;", "mapper", "Law0/t;", "getInsuranceProvidersUseCase", "Lae3/b0;", "validInsuranceNumberUseCase", "Lib4/c;", "genericDomainErrorMapper", "globalSnackBarManager", "Lxi3/b;", "mode", "<init>", "(Lyy/a;Lmx/c;Lwi3/c;Law0/t;Lae3/b0;Lib4/c;Li70/e;Lxi3/b;)V", "", "Lsv0/s;", "Lsv0/r;", "insurance", "x9", "(Ljava/util/List;Lsv0/r;)Lsv0/s;", "Lvi3/c$a;", "z9", "(Lvi3/b;)Lvi3/c$a;", "Lvi3/b$b;", "H9", "(Lvi3/b$b;)Lvi3/b$b;", "selectedInsuranceProvider", "insuranceProviders", "Lhi3/b;", "v9", "(Lsv0/s;Ljava/util/List;)Lhi3/b;", "Ldx/b;", "error", "closeAction", "Loq/i0;", "y9", "(Ldx/b;Lvi3/a;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lwi3/c;", "d", "Law0/t;", "e", "Lae3/b0;", "f", "Lib4/c;", "g", "Li70/e;", "Lvi3/b$a;", "h", "Lvi3/b$a;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lvi3/a$h;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<vi3.b, vi3.a> implements vi3.c, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wi3.c mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw0.t getInsuranceProvidersUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b0 validInsuranceNumberUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final vi3.b.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<vi3.b, vi3.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vi3.a.h> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<vi3.c.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207047e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f207049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ vi3.a f207050h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dx.b bVar, vi3.a aVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f207049g = bVar;
            this.f207050h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(s sVar, vi3.a aVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                sVar.d9(vi3.a.e.f206989a);
            } else if (aVar != null) {
                sVar.d9(aVar);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207047e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<vi3.a.h> bVarY1 = s.this.Y1();
                ib4.c cVar = s.this.genericDomainErrorMapper;
                dx.b bVar = this.f207049g;
                final s sVar = s.this;
                final vi3.a aVar = this.f207050h;
                vi3.a.h.Error error = new vi3.a.h.Error(cVar.b(new ib4.c.Params(bVar, false, new er.l() { // from class: vi3.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.a.V(sVar, aVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f207047e = 1;
                if (bVarY1.F(error, this) == objE) {
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

        public final tq.e<i0> N(tq.e<?> eVar) {
            return s.this.new a(this.f207049g, this.f207050h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<vi3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f207051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f207052b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f207053a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f207054b;

            /* JADX INFO: renamed from: vi3.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5421a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f207055d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f207056e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f207057f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f207059h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f207060j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f207061k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f207062l;

                public C5421a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f207055d = obj;
                    this.f207056e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f207053a = hVar;
                this.f207054b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5421a c5421a;
                if (eVar instanceof C5421a) {
                    c5421a = (C5421a) eVar;
                    int i15 = c5421a.f207056e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5421a.f207056e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5421a = new C5421a(eVar);
                    }
                } else {
                    c5421a = new C5421a(eVar);
                }
                Object obj2 = c5421a.f207055d;
                Object objE = uq.b.e();
                int i16 = c5421a.f207056e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f207053a;
                    vi3.c.a aVarZ9 = this.f207054b.z9((vi3.b) obj);
                    c5421a.f207057f = vq.j.a(obj);
                    c5421a.f207059h = vq.j.a(c5421a);
                    c5421a.f207060j = vq.j.a(obj);
                    c5421a.f207061k = vq.j.a(hVar);
                    c5421a.f207062l = 0;
                    c5421a.f207056e = 1;
                    if (hVar.F(aVarZ9, c5421a) == objE) {
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
            this.f207051a = gVar;
            this.f207052b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super vi3.c.a> hVar, tq.e eVar) {
            Object objA = this.f207051a.a(new a(hVar, this.f207052b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvi3/a$b;", "<unused var>", "Lvi3/b;", "Loq/i0;", "<anonymous>", "(Lvi3/a$b;Lvi3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<vi3.a.b, vi3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207063e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207063e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<vi3.a.h> bVarY1 = s.this.Y1();
                vi3.a.h.C5418a c5418a = vi3.a.h.C5418a.f206993a;
                this.f207063e = 1;
                if (bVarY1.F(c5418a, this) == objE) {
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
        public final Object w(vi3.a.b bVar, vi3.b bVar2, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvi3/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lvi3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<vi3.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207065e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f207065e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(vi3.a.e.f206989a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(vi3.b.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvi3/a$e;", "<unused var>", "Lk10/c0;", "Lvi3/b$a;", "state", "Lk10/l;", "Lvi3/b;", "<anonymous>", "(Lvi3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<vi3.a.e, c0<vi3.b.a>, tq.e<? super k10.l<? extends vi3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207068f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ xi3.b f207070h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(xi3.b bVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f207070h = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vi3.b.Initialized O(xi3.b bVar, List list, s sVar, vi3.b.a aVar) {
            if (fr.t.c(bVar, xi3.b.a.f219108a)) {
                return new vi3.b.Initialized(null, list, null, bVar, null, 21, null);
            }
            if (!(bVar instanceof xi3.b.Edit)) {
                throw new oq.p();
            }
            xi3.b.Edit edit = (xi3.b.Edit) bVar;
            InsuranceProviderData insuranceProviderDataX9 = sVar.x9(list, edit.getInsurance());
            InsuranceFieldsData.InterfaceC5853a.Input insuranceNumberField = new InsuranceFieldsData(null, null, null, 7, null).getInsuranceNumberField();
            iy.b0 insuranceNumber = edit.getInsurance().getInsuranceNumber();
            if (insuranceNumber == null) {
                insuranceNumber = iy.b0.INSTANCE.a();
            }
            return new vi3.b.Initialized(new InsuranceFieldsData(InsuranceFieldsData.InterfaceC5853a.Input.d(insuranceNumberField, null, null, insuranceNumber, 3, null), InsuranceFieldsData.InterfaceC5853a.CheckBox.d(new InsuranceFieldsData(null, null, null, 7, null).getStatementCheckBoxField(), null, null, true, 3, null), null, 4, null), list, insuranceProviderDataX9, edit, null, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f207068f;
            Object objE = uq.b.e();
            int i15 = this.f207067e;
            if (i15 == 0) {
                oq.u.b(obj);
                aw0.t tVar = s.this.getInsuranceProvidersUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f207068f = c0Var;
                this.f207067e = 1;
                obj = tVar.c(c1792a, this);
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
            final s sVar = s.this;
            final xi3.b bVar = this.f207070h;
            if (iVar instanceof dx.i.Left) {
                sVar.y9((dx.b) ((dx.i.Left) iVar).b(), vi3.a.b.f206986a);
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final List list = (List) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: vi3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(bVar, list, sVar, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vi3.a.e eVar, c0<vi3.b.a> c0Var, tq.e<? super k10.l<? extends vi3.b>> eVar2) {
            e eVar3 = s.this.new e(this.f207070h, eVar2);
            eVar3.f207068f = c0Var;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvi3/a$c;", "<unused var>", "Lvi3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lvi3/a$c;Lvi3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<vi3.a.c, vi3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207072f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vi3.b.Initialized initialized = (vi3.b.Initialized) this.f207072f;
            Object objE = uq.b.e();
            int i15 = this.f207071e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                vi3.a.h.ToSearch toSearch = new vi3.a.h.ToSearch(s.this.v9(initialized.getSelectedInsuranceProvider(), initialized.d()));
                this.f207072f = vq.j.a(initialized);
                this.f207071e = 1;
                if (sVar.F(toSearch, this) == objE) {
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
        public final Object w(vi3.a.c cVar, vi3.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = s.this.new f(eVar);
            fVar.f207072f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvi3/a$g;", "action", "Lk10/c0;", "Lvi3/b$b;", "state", "Lk10/l;", "Lvi3/b;", "<anonymous>", "(Lvi3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<vi3.a.InsuranceProviderChanged, c0<vi3.b.Initialized>, tq.e<? super k10.l<? extends vi3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207076g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vi3.b.Initialized O(vi3.a.InsuranceProviderChanged insuranceProviderChanged, c0 c0Var, vi3.b.Initialized initialized) {
            return vi3.b.Initialized.b(initialized, InsuranceFieldsData.b(((vi3.b.Initialized) c0Var.a()).getInsuranceFieldsData(), null, null, InsuranceFieldsData.InterfaceC5853a.DropDown.d(((vi3.b.Initialized) c0Var.a()).getInsuranceFieldsData().getInsuranceCompanyDropDownField(), null, hz.b.C2039b.f86846c, 1, null), 3, null), null, insuranceProviderChanged.getInsuranceProvider(), null, null, 26, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vi3.a.InsuranceProviderChanged insuranceProviderChanged = (vi3.a.InsuranceProviderChanged) this.f207075f;
            final c0 c0Var = (c0) this.f207076g;
            uq.b.e();
            if (this.f207074e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: vi3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(insuranceProviderChanged, c0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vi3.a.InsuranceProviderChanged insuranceProviderChanged, c0<vi3.b.Initialized> c0Var, tq.e<? super k10.l<? extends vi3.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f207075f = insuranceProviderChanged;
            gVar.f207076g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvi3/a$f;", "action", "Lk10/c0;", "Lvi3/b$b;", "state", "Lk10/l;", "Lvi3/b;", "<anonymous>", "(Lvi3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<vi3.a.InsuranceNumberChanged, c0<vi3.b.Initialized>, tq.e<? super k10.l<? extends vi3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207078f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207079g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vi3.b.Initialized O(c0 c0Var, vi3.a.InsuranceNumberChanged insuranceNumberChanged, vi3.b.Initialized initialized) {
            return vi3.b.Initialized.b(initialized, InsuranceFieldsData.b(((vi3.b.Initialized) c0Var.a()).getInsuranceFieldsData(), InsuranceFieldsData.InterfaceC5853a.Input.d(((vi3.b.Initialized) c0Var.a()).getInsuranceFieldsData().getInsuranceNumberField(), null, hz.b.C2039b.f86846c, iy.c0.g(iy.c0.e(insuranceNumberChanged.getInsuranceNumber()).toUpperCase(Locale.ROOT)), 1, null), null, null, 6, null), null, null, null, null, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vi3.a.InsuranceNumberChanged insuranceNumberChanged = (vi3.a.InsuranceNumberChanged) this.f207078f;
            final c0 c0Var = (c0) this.f207079g;
            uq.b.e();
            if (this.f207077e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: vi3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.h.O(c0Var, insuranceNumberChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vi3.a.InsuranceNumberChanged insuranceNumberChanged, c0<vi3.b.Initialized> c0Var, tq.e<? super k10.l<? extends vi3.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f207078f = insuranceNumberChanged;
            hVar.f207079g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvi3/a$i;", "action", "Lk10/c0;", "Lvi3/b$b;", "state", "Lk10/l;", "Lvi3/b;", "<anonymous>", "(Lvi3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<vi3.a.StatementCheckChanged, c0<vi3.b.Initialized>, tq.e<? super k10.l<? extends vi3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207082g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vi3.b.Initialized O(c0 c0Var, vi3.a.StatementCheckChanged statementCheckChanged, vi3.b.Initialized initialized) {
            return vi3.b.Initialized.b(initialized, InsuranceFieldsData.b(((vi3.b.Initialized) c0Var.a()).getInsuranceFieldsData(), null, InsuranceFieldsData.InterfaceC5853a.CheckBox.d(((vi3.b.Initialized) c0Var.a()).getInsuranceFieldsData().getStatementCheckBoxField(), null, hz.b.C2039b.f86846c, statementCheckChanged.getIsChecked(), 1, null), null, 5, null), null, null, null, null, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vi3.a.StatementCheckChanged statementCheckChanged = (vi3.a.StatementCheckChanged) this.f207081f;
            final c0 c0Var = (c0) this.f207082g;
            uq.b.e();
            if (this.f207080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: vi3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.i.O(c0Var, statementCheckChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vi3.a.StatementCheckChanged statementCheckChanged, c0<vi3.b.Initialized> c0Var, tq.e<? super k10.l<? extends vi3.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f207081f = statementCheckChanged;
            iVar.f207082g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvi3/a$a;", "<unused var>", "Lk10/c0;", "Lvi3/b$b;", "state", "Lk10/l;", "Lvi3/b;", "<anonymous>", "(Lvi3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<vi3.a.C5417a, c0<vi3.b.Initialized>, tq.e<? super k10.l<? extends vi3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f207083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f207084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f207085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f207086h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f207087j;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vi3.b.Initialized O(vi3.b.Initialized initialized, vi3.b.Initialized initialized2) {
            InsuranceFieldsData.b bVarD = initialized.getInsuranceFieldsData().d();
            return vi3.b.Initialized.b(initialized, null, null, null, null, bVarD != null ? new d60.j(bVarD) : null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15;
            c0 c0Var = (c0) this.f207087j;
            Object objE = uq.b.e();
            int i16 = this.f207086h;
            if (i16 == 0) {
                oq.u.b(obj);
                final vi3.b.Initialized initializedH9 = s.this.H9((vi3.b.Initialized) c0Var.a());
                if (!initializedH9.getInsuranceFieldsData().h()) {
                    return c0Var.b(new er.l() { // from class: vi3.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.j.O(initializedH9, (b.Initialized) obj2);
                        }
                    });
                }
                InsuranceProviderData selectedInsuranceProvider = initializedH9.getSelectedInsuranceProvider();
                if (selectedInsuranceProvider != null) {
                    s sVar = s.this;
                    mx.c cVar = sVar.labelProvider;
                    xi3.b mode = ((vi3.b.Initialized) c0Var.a()).getMode();
                    if (fr.t.c(mode, xi3.b.a.f219108a)) {
                        i15 = md3.b.U0;
                    } else {
                        if (!(mode instanceof xi3.b.Edit)) {
                            throw new oq.p();
                        }
                        i15 = md3.b.f125878z2;
                    }
                    sVar.y(new p50.a.Default(cVar.c(i15), false, null, 6, null));
                    xi3.b mode2 = ((vi3.b.Initialized) c0Var.a()).getMode();
                    xi3.b.Edit edit = mode2 instanceof xi3.b.Edit ? (xi3.b.Edit) mode2 : null;
                    Insurance insurance = edit != null ? edit.getInsurance() : null;
                    String insurerId = initializedH9.getSelectedInsuranceProvider().getInsurerId();
                    String insurerName = initializedH9.getSelectedInsuranceProvider().getInsurerName();
                    iy.b0 value = initializedH9.getInsuranceFieldsData().getInsuranceNumberField().getValue();
                    vi3.a.h.BackWithInsurance backWithInsurance = new vi3.a.h.BackWithInsurance(insurance, new Insurance(insurerId, insurerName, iy.c0.e(value).length() > 0 ? value : null, true));
                    this.f207087j = c0Var;
                    this.f207083e = vq.j.a(initializedH9);
                    this.f207084f = vq.j.a(selectedInsuranceProvider);
                    this.f207085g = 0;
                    this.f207086h = 1;
                    if (sVar.F(backWithInsurance, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vi3.a.C5417a c5417a, c0<vi3.b.Initialized> c0Var, tq.e<? super k10.l<? extends vi3.b>> eVar) {
            j jVar = s.this.new j(eVar);
            jVar.f207087j = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvi3/a$d;", "<unused var>", "Lvi3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lvi3/a$d;Lvi3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<vi3.a.d, vi3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207090f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vi3.b.Initialized initialized = (vi3.b.Initialized) this.f207090f;
            Object objE = uq.b.e();
            int i15 = this.f207089e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (initialized.getMode() instanceof xi3.b.Edit) {
                    s.this.y(new p50.a.Default(s.this.labelProvider.c(md3.b.f125710e2), false, null, 6, null));
                    xw.b<vi3.a.h> bVarY1 = s.this.Y1();
                    vi3.a.h.BackWithDeleteInsurance backWithDeleteInsurance = new vi3.a.h.BackWithDeleteInsurance(((xi3.b.Edit) initialized.getMode()).getInsurance());
                    this.f207090f = vq.j.a(initialized);
                    this.f207089e = 1;
                    if (bVarY1.F(backWithDeleteInsurance, this) == objE) {
                        return objE;
                    }
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
        public final Object w(vi3.a.d dVar, vi3.b.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = s.this.new k(eVar);
            kVar.f207090f = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, mx.c cVar, wi3.c cVar2, aw0.t tVar, b0 b0Var, ib4.c cVar3, i70.e eVar, final xi3.b bVar) {
        this.labelProvider = cVar;
        this.mapper = cVar2;
        this.getInsuranceProvidersUseCase = tVar;
        this.validInsuranceNumberUseCase = b0Var;
        this.genericDomainErrorMapper = cVar3;
        this.globalSnackBarManager = eVar;
        vi3.b.a aVar2 = vi3.b.a.f207001a;
        this.initialState = aVar2;
        this.stateMachine = aVar.a(aVar2, new er.l() { // from class: vi3.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.D9(this.f207033a, bVar, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), z9(aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, iy.b0 b0Var) {
        sVar.d9(new vi3.a.InsuranceNumberChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, boolean z15) {
        sVar.d9(new vi3.a.StatementCheckChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final s sVar, final xi3.b bVar, k10.v vVar) {
        vVar.c(q0.c(vi3.b.class), new er.l() { // from class: vi3.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.E9(this.f207027a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(vi3.b.a.class), new er.l() { // from class: vi3.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.F9(this.f207028a, bVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(vi3.b.Initialized.class), new er.l() { // from class: vi3.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.G9(this.f207030a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(s sVar, k10.z zVar) {
        c cVar = sVar.new c(null);
        zVar.x(q0.c(vi3.a.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(s sVar, xi3.b bVar, k10.z zVar) {
        zVar.C(sVar.new d(null));
        e eVar = sVar.new e(bVar, null);
        zVar.v(q0.c(vi3.a.e.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(s sVar, k10.z zVar) {
        f fVar = sVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(vi3.a.c.class), oVar, fVar);
        zVar.v(q0.c(vi3.a.InsuranceProviderChanged.class), oVar, new g(null));
        zVar.v(q0.c(vi3.a.InsuranceNumberChanged.class), oVar, new h(null));
        zVar.v(q0.c(vi3.a.StatementCheckChanged.class), oVar, new i(null));
        zVar.v(q0.c(vi3.a.C5417a.class), oVar, sVar.new j(null));
        zVar.x(q0.c(vi3.a.d.class), oVar, sVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vi3.b.Initialized H9(vi3.b.Initialized initialized) {
        String str;
        boolean z15;
        hz.b invalid;
        hz.b invalid2;
        InsuranceFieldsData insuranceFieldsData = initialized.getInsuranceFieldsData();
        InsuranceFieldsData.InterfaceC5853a.Input inputD = InsuranceFieldsData.InterfaceC5853a.Input.d(initialized.getInsuranceFieldsData().getInsuranceNumberField(), null, hz.b.INSTANCE.a(this.validInsuranceNumberUseCase.b(new b0.Params(dz.e.f(iy.c0.e(initialized.getInsuranceFieldsData().getInsuranceNumberField().getValue()))))), iy.c0.g(dz.e.f(iy.c0.e(initialized.getInsuranceFieldsData().getInsuranceNumberField().getValue()))), 1, null);
        InsuranceFieldsData.InterfaceC5853a.DropDown insuranceCompanyDropDownField = initialized.getInsuranceFieldsData().getInsuranceCompanyDropDownField();
        InsuranceProviderData selectedInsuranceProvider = initialized.getSelectedInsuranceProvider();
        String insurerId = selectedInsuranceProvider != null ? selectedInsuranceProvider.getInsurerId() : null;
        InsuranceProviderData selectedInsuranceProvider2 = initialized.getSelectedInsuranceProvider();
        List listQ = pq.v.q(insurerId, selectedInsuranceProvider2 != null ? selectedInsuranceProvider2.getInsurerName() : null);
        if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
            Iterator it = listQ.iterator();
            do {
                if (!it.hasNext()) {
                    z15 = true;
                    break;
                }
                str = (String) it.next();
                z15 = false;
            } while (!(str == null || fu.r.t0(str)));
        } else {
            z15 = true;
            break;
        }
        if (z15) {
            invalid = hz.b.d.f86848c;
        } else {
            if (z15) {
                throw new oq.p();
            }
            invalid = new hz.b.Invalid(this.labelProvider.c(md3.b.W2));
        }
        InsuranceFieldsData.InterfaceC5853a.DropDown dropDownD = InsuranceFieldsData.InterfaceC5853a.DropDown.d(insuranceCompanyDropDownField, null, invalid, 1, null);
        InsuranceFieldsData.InterfaceC5853a.CheckBox statementCheckBoxField = initialized.getInsuranceFieldsData().getStatementCheckBoxField();
        boolean isChecked = initialized.getInsuranceFieldsData().getStatementCheckBoxField().getIsChecked();
        if (isChecked) {
            invalid2 = hz.b.d.f86848c;
        } else {
            if (isChecked) {
                throw new oq.p();
            }
            invalid2 = new hz.b.Invalid(this.labelProvider.c(md3.b.f125703d3));
        }
        return vi3.b.Initialized.b(initialized, insuranceFieldsData.a(inputD, InsuranceFieldsData.InterfaceC5853a.CheckBox.d(statementCheckBoxField, null, invalid2, false, 5, null), dropDownD), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchInsuranceModel v9(InsuranceProviderData selectedInsuranceProvider, List<InsuranceProviderData> insuranceProviders) {
        mx.c cVar = this.labelProvider;
        Label labelC = cVar.c(md3.b.Z0);
        Label labelC2 = cVar.c(md3.b.V);
        List<InsuranceProviderData> list = insuranceProviders;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            InsuranceProviderData insuranceProviderData = (InsuranceProviderData) obj;
            Label labelB = mx.b.b(insuranceProviderData.getInsurerName(), "searchResult_" + i15);
            String additionalDescription = insuranceProviderData.getAdditionalDescription();
            arrayList.add(new SearchInsuranceItem(labelB, additionalDescription != null ? mx.b.b(additionalDescription, "additionalDescription" + i15) : null, fr.t.c(selectedInsuranceProvider, insuranceProviderData), b9(new vi3.a.InsuranceProviderChanged(insuranceProviderData))));
            i15 = i16;
        }
        return new SearchInsuranceModel(labelC, labelC2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InsuranceProviderData x9(List<InsuranceProviderData> list, Insurance insurance) {
        Object next;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            InsuranceProviderData insuranceProviderData = (InsuranceProviderData) next;
            if (fr.t.c(insuranceProviderData.getInsurerId(), insurance.getInsurerId()) && fr.t.c(insuranceProviderData.getInsurerName(), insurance.getInsurerName())) {
                return (InsuranceProviderData) next;
            }
        }
        next = null;
        return (InsuranceProviderData) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y9(dx.b error, vi3.a closeAction) {
        i00.a.a(this, new a(error, closeAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vi3.c.a z9(vi3.b bVar) {
        return this.mapper.b(new wi3.c.Params(bVar, b9(vi3.a.c.f206987a), new er.l() { // from class: vi3.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f207031a, (iy.b0) obj);
            }
        }, new er.l() { // from class: vi3.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f207032a, ((Boolean) obj).booleanValue());
            }
        }, b9(vi3.a.C5417a.f206985a), b9(vi3.a.b.f206986a), b9(vi3.a.d.f206988a)));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(xi3.b bVar) {
        super.P5(bVar);
    }

    @Override // zx.b
    public xw.b<vi3.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<vi3.b, vi3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<vi3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(vi3.a.h hVar, tq.e<? super i0> eVar) {
        return super.F(hVar, eVar);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
