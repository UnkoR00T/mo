package oi3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ri3.SetupData;
import sv0.AutomaticReportInsurerDetails;
import sv0.AutomaticReportRequest;
import sv0.AutomaticReportSuccessResponse;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$*\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010K\u001a\b\u0012\u0004\u0012\u00020$0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Loi3/t;", "Ll00/g;", "Loi3/c;", "Loi3/a;", "Loi3/d;", "", "Lyy/a;", "stateMachineFactory", "Lpi3/d;", "mapper", "Lib4/c;", "domainErrorMapper", "Law0/c;", "getInsuranceProvidersAutomaticReportDetailsUC", "Lac4/a;", "loaderUseCase", "Lmx/c;", "labelProvider", "Law0/k;", "reportDamageToInsurerUC", "Loi3/b;", "setupData", "<init>", "(Lyy/a;Lpi3/d;Lib4/c;Law0/c;Lac4/a;Lmx/c;Law0/k;Loi3/b;)V", "Lsv0/a;", "insurer", "Lcb4/d;", "w9", "(Lsv0/a;)Lcb4/d;", "Ldx/b;", "error", "retryAction", "backAction", "Loq/i0;", "z9", "(Ldx/b;Loi3/a;Loi3/a;)V", "Loi3/d$a;", "A9", "(Loi3/c;)Loi3/d$a;", "b", "Lpi3/d;", "c", "Lib4/c;", "d", "Law0/c;", "e", "Lac4/a;", "f", "Lmx/c;", "g", "Law0/k;", "h", "Loi3/b;", "Loi3/c$a;", "j", "Loi3/c$a;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Loi3/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<oi3.c, oi3.a> implements oi3.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pi3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw0.c getInsuranceProvidersAutomaticReportDetailsUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final aw0.k reportDamageToInsurerUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oi3.c.a initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<oi3.c, oi3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<oi3.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<oi3.d.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146046e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f146048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ oi3.a f146049h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ oi3.a f146050j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dx.b bVar, oi3.a aVar, oi3.a aVar2, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f146048g = bVar;
            this.f146049h = aVar;
            this.f146050j = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(t tVar, oi3.a aVar, oi3.a aVar2, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
                tVar.d9(aVar);
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                if (aVar2 != null) {
                    tVar.d9(aVar2);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146046e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oi3.a.b> bVarY1 = t.this.Y1();
                ib4.c cVar = t.this.domainErrorMapper;
                dx.b bVar = this.f146048g;
                final t tVar = t.this;
                final oi3.a aVar = this.f146049h;
                final oi3.a aVar2 = this.f146050j;
                oi3.a.b.ShowError showError = new oi3.a.b.ShowError(cVar.b(new ib4.c.Params(bVar, false, new er.l() { // from class: oi3.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.a.V(tVar, aVar, aVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f146046e = 1;
                if (bVarY1.F(showError, this) == objE) {
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
            return t.this.new a(this.f146048g, this.f146049h, this.f146050j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<oi3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f146051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f146052b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f146053a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f146054b;

            /* JADX INFO: renamed from: oi3.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3633a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f146055d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f146056e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f146057f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f146059h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f146060j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f146061k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f146062l;

                public C3633a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f146055d = obj;
                    this.f146056e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f146053a = hVar;
                this.f146054b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3633a c3633a;
                if (eVar instanceof C3633a) {
                    c3633a = (C3633a) eVar;
                    int i15 = c3633a.f146056e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3633a.f146056e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3633a = new C3633a(eVar);
                    }
                } else {
                    c3633a = new C3633a(eVar);
                }
                Object obj2 = c3633a.f146055d;
                Object objE = uq.b.e();
                int i16 = c3633a.f146056e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f146053a;
                    oi3.d.a aVarA9 = this.f146054b.A9((oi3.c) obj);
                    c3633a.f146057f = vq.j.a(obj);
                    c3633a.f146059h = vq.j.a(c3633a);
                    c3633a.f146060j = vq.j.a(obj);
                    c3633a.f146061k = vq.j.a(hVar);
                    c3633a.f146062l = 0;
                    c3633a.f146056e = 1;
                    if (hVar.F(aVarA9, c3633a) == objE) {
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

        public b(mu.g gVar, t tVar) {
            this.f146051a = gVar;
            this.f146052b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super oi3.d.a> hVar, tq.e eVar) {
            Object objA = this.f146051a.a(new a(hVar, this.f146052b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loi3/a$b;", "action", "Loi3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Loi3/a$b;Loi3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<oi3.a.b, oi3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146064f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oi3.a.b bVar = (oi3.a.b) this.f146064f;
            Object objE = uq.b.e();
            int i15 = this.f146063e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oi3.a.b> bVarY1 = t.this.Y1();
                this.f146064f = vq.j.a(bVar);
                this.f146063e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(oi3.a.b bVar, oi3.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = t.this.new c(eVar);
            cVar2.f146064f = bVar;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loi3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Loi3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<oi3.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146066e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f146066e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(oi3.a.C3629a.f145999a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(oi3.c.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loi3/a$a;", "action", "Lk10/c0;", "Loi3/c$a;", "state", "Lk10/l;", "Loi3/c;", "<anonymous>", "(Loi3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<oi3.a.C3629a, c0<oi3.c.a>, tq.e<? super k10.l<? extends oi3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146070g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Loi3/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends oi3.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f146072e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f146073f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ oi3.a.C3629a f146074g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<oi3.c.a> f146075h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, oi3.a.C3629a c3629a, c0<oi3.c.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f146073f = tVar;
                this.f146074g = c3629a;
                this.f146075h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oi3.c.Initialized V(sv0.b bVar, oi3.c.a aVar) {
                return new oi3.c.Initialized(bVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f146072e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    aw0.c cVar = this.f146073f.getInsuranceProvidersAutomaticReportDetailsUC;
                    aw0.c.Params params = new aw0.c.Params(this.f146073f.setupData.getProcessId());
                    this.f146072e = 1;
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
                t tVar = this.f146073f;
                oi3.a.C3629a c3629a = this.f146074g;
                c0<oi3.c.a> c0Var = this.f146075h;
                if (iVar instanceof dx.i.Left) {
                    tVar.z9((dx.b) ((dx.i.Left) iVar).b(), c3629a, oi3.a.b.C3630a.f146000a);
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final sv0.b bVar = (sv0.b) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: oi3.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.e.a.V(bVar, (c.a) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f146073f, this.f146074g, this.f146075h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends oi3.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oi3.a.C3629a c3629a = (oi3.a.C3629a) this.f146069f;
            c0 c0Var = (c0) this.f146070g;
            Object objE = uq.b.e();
            int i15 = this.f146068e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.loaderUseCase;
            a aVar2 = new a(t.this, c3629a, c0Var, null);
            this.f146069f = vq.j.a(c3629a);
            this.f146070g = vq.j.a(c0Var);
            this.f146068e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oi3.a.C3629a c3629a, c0<oi3.c.a> c0Var, tq.e<? super k10.l<? extends oi3.c>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f146069f = c3629a;
            eVar2.f146070g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loi3/a$c;", "action", "Loi3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Loi3/a$c;Loi3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<oi3.a.OnGoToReportClicked, oi3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146077f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oi3.a.OnGoToReportClicked onGoToReportClicked = (oi3.a.OnGoToReportClicked) this.f146077f;
            uq.b.e();
            if (this.f146076e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new oi3.a.b.ShowDialog(t.this.w9(onGoToReportClicked.getInsurer())));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oi3.a.OnGoToReportClicked onGoToReportClicked, oi3.c.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f146077f = onGoToReportClicked;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loi3/a$d;", "action", "Loi3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Loi3/a$d;Loi3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<oi3.a.ReportToInsurer, oi3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146080f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f146082e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f146083f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ oi3.a.ReportToInsurer f146084g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, oi3.a.ReportToInsurer reportToInsurer, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f146083f = tVar;
                this.f146084g = reportToInsurer;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f146082e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    aw0.k kVar = this.f146083f.reportDamageToInsurerUC;
                    aw0.k.Params params = new aw0.k.Params(this.f146083f.setupData.getProcessId(), new AutomaticReportRequest(this.f146084g.getInsurer().getId()));
                    this.f146082e = 1;
                    obj = kVar.c(params, this);
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
                t tVar = this.f146083f;
                oi3.a.ReportToInsurer reportToInsurer = this.f146084g;
                if (iVar instanceof dx.i.Left) {
                    tVar.z9((dx.b) ((dx.i.Left) iVar).b(), reportToInsurer, null);
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    AutomaticReportSuccessResponse automaticReportSuccessResponse = (AutomaticReportSuccessResponse) ((dx.i.Right) iVar).b();
                    tVar.d9(new oi3.a.b.GoToReportSuccess(new SetupData(tVar.setupData.getProcessId(), automaticReportSuccessResponse, reportToInsurer.getInsurer().getShortName(), tVar.setupData.getStatus())));
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f146083f, this.f146084g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oi3.a.ReportToInsurer reportToInsurer = (oi3.a.ReportToInsurer) this.f146080f;
            Object objE = uq.b.e();
            int i15 = this.f146079e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = t.this.loaderUseCase;
                a aVar2 = new a(t.this, reportToInsurer, null);
                this.f146080f = vq.j.a(reportToInsurer);
                this.f146079e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(oi3.a.ReportToInsurer reportToInsurer, oi3.c.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f146080f = reportToInsurer;
            return gVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, pi3.d dVar, ib4.c cVar, aw0.c cVar2, ac4.a aVar2, mx.c cVar3, aw0.k kVar, SetupData setupData) {
        this.mapper = dVar;
        this.domainErrorMapper = cVar;
        this.getInsuranceProvidersAutomaticReportDetailsUC = cVar2;
        this.loaderUseCase = aVar2;
        this.labelProvider = cVar3;
        this.reportDamageToInsurerUC = kVar;
        this.setupData = setupData;
        oi3.c.a aVar3 = oi3.c.a.f146009a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: oi3.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.D9(this.f146031a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), A9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oi3.d.a A9(oi3.c cVar) {
        return this.mapper.b(new pi3.d.Params(cVar, b9(oi3.a.b.C3631b.f146001a), new er.l() { // from class: oi3.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f146027a, (AutomaticReportInsurerDetails) obj);
            }
        }, b9(oi3.a.b.C3630a.f146000a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, AutomaticReportInsurerDetails automaticReportInsurerDetails) {
        tVar.d9(new oi3.a.OnGoToReportClicked(automaticReportInsurerDetails));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(oi3.c.class), new er.l() { // from class: oi3.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f146028a, (z) obj);
            }
        });
        vVar.c(q0.c(oi3.c.a.class), new er.l() { // from class: oi3.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9(this.f146029a, (z) obj);
            }
        });
        vVar.c(q0.c(oi3.c.Initialized.class), new er.l() { // from class: oi3.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f146030a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(t tVar, z zVar) {
        c cVar = tVar.new c(null);
        zVar.x(q0.c(oi3.a.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(t tVar, z zVar) {
        zVar.C(tVar.new d(null));
        e eVar = tVar.new e(null);
        zVar.v(q0.c(oi3.a.C3629a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(t tVar, z zVar) {
        f fVar = tVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(oi3.a.OnGoToReportClicked.class), oVar, fVar);
        zVar.x(q0.c(oi3.a.ReportToInsurer.class), oVar, tVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData w9(AutomaticReportInsurerDetails insurer) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.e(md3.b.f125861x1, insurer.getShortName()), null, new DialogButtonTextData(this.labelProvider.c(md3.b.f125853w1), null, b9(new oi3.a.ReportToInsurer(insurer)), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.M), null, new er.a() { // from class: oi3.p
            @Override // er.a
            public final Object a() {
                return t.x9();
            }
        }, 2, null), null, new er.a() { // from class: oi3.q
            @Override // er.a
            public final Object a() {
                return t.y9();
            }
        }, 36, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z9(dx.b error, oi3.a retryAction, oi3.a backAction) {
        i00.a.a(this, new a(error, retryAction, backAction, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<oi3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<oi3.c, oi3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<oi3.d.a> getState() {
        return this.state;
    }
}
