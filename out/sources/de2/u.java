package de2;

import cb4.DialogData;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ze2.SetupData;
import zp0.BEReportedIncidents;
import zp0.BEReportedIncidentsReportedIncident;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bq\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\u00020,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0016\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002030/H\u0096\u0001¢\u0006\u0004\b4\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010R\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010Y\u001a\b\u0012\u0004\u0012\u00020T0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030^8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010'\u001a\b\u0012\u0004\u0012\u00020(0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010h¨\u0006i"}, d2 = {"Lde2/u;", "Ll00/g;", "Lde2/d;", "Lde2/a;", "Lde2/e;", "Lnx/b;", "", "Lyy/a;", "stateMachineFactory", "Lee2/b;", "mapper", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Laq0/c;", "beGetReportIncidentsUC", "Li70/n;", "snackBarManagerStateHolder", "Lac4/a;", "callActionWithLoaderUseCase", "Loz/q;", "ownerViewLifecycleManager", "La14/n;", "goToDeviceLocationSettingsUseCase", "Lae2/i;", "requestAllPermissionsToGetLocationUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "<init>", "(Lyy/a;Lee2/b;Lmx/c;Lhb4/d;Lib4/c;Laq0/c;Li70/n;Lac4/a;Loz/q;La14/n;Lae2/i;La14/m;Lcb4/j;)V", "Lcb4/d;", "C9", "()Lcb4/d;", "B9", "state", "Lde2/e$a;", "E9", "(Lde2/d;)Lde2/e$a;", "Ldx/b;", "Ljb4/b;", "G9", "(Ldx/b;)Ljb4/b;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lee2/b;", "c", "Lmx/c;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Laq0/c;", "g", "Li70/n;", "h", "Lac4/a;", "j", "Loz/q;", "k", "La14/n;", "l", "Lae2/i;", "m", "La14/m;", "n", "Lcb4/j;", "Loz/j;", "p", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lde2/a$d;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lde2/c;", "r", "Lde2/c;", "initialState", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<de2.d, de2.a> implements de2.e, nx.b, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ee2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final aq0.c beGetReportIncidentsUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ae2.i requestAllPermissionsToGetLocationUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<de2.a.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final de2.c initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<de2.d, de2.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<de2.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<de2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f41238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f41239b;

        /* JADX INFO: renamed from: de2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0922a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f41240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f41241b;

            /* JADX INFO: renamed from: de2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0923a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f41242d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f41243e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f41244f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f41246h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f41247j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f41248k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f41249l;

                public C0923a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f41242d = obj;
                    this.f41243e |= PKIFailureInfo.systemUnavail;
                    return C0922a.this.F(null, this);
                }
            }

            public C0922a(mu.h hVar, u uVar) {
                this.f41240a = hVar;
                this.f41241b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0923a c0923a;
                if (eVar instanceof C0923a) {
                    c0923a = (C0923a) eVar;
                    int i15 = c0923a.f41243e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0923a.f41243e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0923a = new C0923a(eVar);
                    }
                } else {
                    c0923a = new C0923a(eVar);
                }
                Object obj2 = c0923a.f41242d;
                Object objE = uq.b.e();
                int i16 = c0923a.f41243e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f41240a;
                    de2.e.a aVarE9 = this.f41241b.E9((de2.d) obj);
                    c0923a.f41244f = vq.j.a(obj);
                    c0923a.f41246h = vq.j.a(c0923a);
                    c0923a.f41247j = vq.j.a(obj);
                    c0923a.f41248k = vq.j.a(hVar);
                    c0923a.f41249l = 0;
                    c0923a.f41243e = 1;
                    if (hVar.F(aVarE9, c0923a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f41238a = gVar;
            this.f41239b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super de2.e.a> hVar, tq.e eVar) {
            Object objA = this.f41238a.a(new C0922a(hVar, this.f41239b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lde2/a$e;", "<unused var>", "Lde2/d;", "Loq/i0;", "<anonymous>", "(Lde2/a$e;Lde2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<de2.a.e, de2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41250e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f41250e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                de2.a.d.C0919a c0919a = de2.a.d.C0919a.f41176a;
                this.f41250e = 1;
                if (uVar.F(c0919a, this) == objE) {
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
        public final Object w(de2.a.e eVar, de2.d dVar, tq.e<? super i0> eVar2) {
            return u.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lde2/c;", "it", "Loq/i0;", "<anonymous>", "(Lde2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<de2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41252e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f41252e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(de2.a.h.f41182a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(de2.c cVar, tq.e<? super i0> eVar) {
            return ((c) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lde2/a$h;", "<unused var>", "Lk10/c0;", "Lde2/c;", "state", "Lk10/l;", "Lde2/d;", "<anonymous>", "(Lde2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<de2.a.h, k10.c0<de2.c>, tq.e<? super k10.l<? extends de2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41255f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lde2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends de2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f41257e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f41258f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<de2.c> f41259g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<de2.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f41258f = uVar;
                this.f41259g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final de2.d.Initialized V(BEReportedIncidents bEReportedIncidents, de2.c cVar) {
                return new de2.d.Initialized(bEReportedIncidents.a(), null, 2, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f41257e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    aq0.c cVar = this.f41258f.beGetReportIncidentsUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f41257e = 1;
                    obj = cVar.c(c1792a, this);
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
                u uVar = this.f41258f;
                k10.c0<de2.c> c0Var = this.f41259g;
                if (iVar instanceof dx.i.Left) {
                    uVar.d9(new de2.a.ShowInitializationError((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEReportedIncidents bEReportedIncidents = (BEReportedIncidents) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: de2.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.d.a.V(bEReportedIncidents, (c) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f41258f, this.f41259g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends de2.d>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f41255f;
            Object objE = uq.b.e();
            int i15 = this.f41254e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f41255f = vq.j.a(c0Var);
            this.f41254e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.h hVar, k10.c0<de2.c> c0Var, tq.e<? super k10.l<? extends de2.d>> eVar) {
            d dVar = u.this.new d(eVar);
            dVar.f41255f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lde2/a$j;", "action", "Lk10/c0;", "Lde2/c;", "state", "Lk10/l;", "Lde2/d;", "<anonymous>", "(Lde2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<de2.a.ShowInitializationError, k10.c0<de2.c>, tq.e<? super k10.l<? extends de2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f41262g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(u uVar, de2.a.ShowInitializationError showInitializationError, de2.c cVar) {
            return new Error(uVar.errorVMSFactory.a(uVar.G9(showInitializationError.getDomainError())));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final de2.a.ShowInitializationError showInitializationError = (de2.a.ShowInitializationError) this.f41261f;
            k10.c0 c0Var = (k10.c0) this.f41262g;
            uq.b.e();
            if (this.f41260e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: de2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(uVar, showInitializationError, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.ShowInitializationError showInitializationError, k10.c0<de2.c> c0Var, tq.e<? super k10.l<? extends de2.d>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f41261f = showInitializationError;
            eVar2.f41262g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnx/a;", "viewLifecycle", "Lk10/c0;", "Lde2/d$a;", "state", "Lk10/l;", "Lde2/d;", "<anonymous>", "(Lnx/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nx.a, k10.c0<de2.d.Initialized>, tq.e<? super k10.l<? extends de2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f41266g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final de2.c O(de2.d.Initialized initialized) {
            return de2.c.f41186a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f41265f;
            k10.c0 c0Var = (k10.c0) this.f41266g;
            uq.b.e();
            if (this.f41264e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return aVar == nx.a.STARTED ? c0Var.d(new er.l() { // from class: de2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O((d.Initialized) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, k10.c0<de2.d.Initialized> c0Var, tq.e<? super k10.l<? extends de2.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f41265f = aVar;
            fVar.f41266g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lde2/a$g;", "<unused var>", "Lde2/d$a;", "Loq/i0;", "<anonymous>", "(Lde2/a$g;Lde2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<de2.a.g, de2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f41267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f41268f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        
            if (r1.F(r3, r4) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f41268f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r4.f41267e
                ae2.i$a r0 = (ae2.i.a) r0
                oq.u.b(r5)
                goto L86
            L17:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1f:
                oq.u.b(r5)
                goto L37
            L23:
                oq.u.b(r5)
                de2.u r5 = de2.u.this
                ae2.i r5 = de2.u.x9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f41268f = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L37
                goto L85
            L37:
                ae2.i$a r5 = (ae2.i.a) r5
                boolean r1 = r5 instanceof ae2.i.a.NoPermissions
                if (r1 == 0) goto L56
                ae2.i$a$b r5 = (ae2.i.a.NoPermissions) r5
                boolean r5 = r5.getShouldShowRationale()
                if (r5 != 0) goto L86
                de2.u r5 = de2.u.this
                de2.a$i r0 = new de2.a$i
                de2.u r1 = de2.u.this
                cb4.d r1 = de2.u.o9(r1)
                r0.<init>(r1)
                de2.u.p9(r5, r0)
                goto L86
            L56:
                boolean r1 = r5 instanceof ae2.i.a.C0117a
                if (r1 == 0) goto L6b
                de2.u r5 = de2.u.this
                de2.a$i r0 = new de2.a$i
                de2.u r1 = de2.u.this
                cb4.d r1 = de2.u.n9(r1)
                r0.<init>(r1)
                de2.u.p9(r5, r0)
                goto L86
            L6b:
                ae2.i$a$c r1 = ae2.i.a.c.f5591a
                boolean r1 = fr.t.c(r5, r1)
                if (r1 == 0) goto L89
                de2.u r1 = de2.u.this
                de2.a$d$b r3 = de2.a.d.b.f41177a
                java.lang.Object r5 = vq.j.a(r5)
                r4.f41267e = r5
                r4.f41268f = r2
                java.lang.Object r5 = r1.F(r3, r4)
                if (r5 != r0) goto L86
            L85:
                return r0
            L86:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            L89:
                oq.p r5 = new oq.p
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: de2.u.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.g gVar, de2.d.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lde2/a$f;", "action", "Lde2/d$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lde2/a$f;Lde2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<de2.a.OnGoToIncidentDetails, de2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41271f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            de2.a.OnGoToIncidentDetails onGoToIncidentDetails = (de2.a.OnGoToIncidentDetails) this.f41271f;
            Object objE = uq.b.e();
            int i15 = this.f41270e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                de2.a.d.ToReportedIncidentDetails toReportedIncidentDetails = new de2.a.d.ToReportedIncidentDetails(new SetupData(onGoToIncidentDetails.getIncident()));
                this.f41271f = vq.j.a(onGoToIncidentDetails);
                this.f41270e = 1;
                if (uVar.F(toReportedIncidentDetails, this) == objE) {
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
        public final Object w(de2.a.OnGoToIncidentDetails onGoToIncidentDetails, de2.d.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f41271f = onGoToIncidentDetails;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lde2/a$c;", "<unused var>", "Lde2/d$a;", "Loq/i0;", "<anonymous>", "(Lde2/a$c;Lde2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<de2.a.c, de2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41273e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f41273e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = u.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            u uVar = u.this;
            if (iVarA instanceof dx.i.Left) {
                uVar.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(uVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            u.this.d9(de2.a.C0918a.f41173a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.c cVar, de2.d.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lde2/a$b;", "<unused var>", "Lde2/d$a;", "Loq/i0;", "<anonymous>", "(Lde2/a$b;Lde2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<de2.a.b, de2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41275e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f41275e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.n nVar = u.this.goToDeviceLocationSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f41275e = 1;
                obj = nVar.c(c1792a, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(uVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            u.this.d9(de2.a.C0918a.f41173a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.b bVar, de2.d.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lde2/a$i;", "action", "Lk10/c0;", "Lde2/d$a;", "state", "Lk10/l;", "Lde2/d;", "<anonymous>", "(Lde2/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<de2.a.ShowDialog, k10.c0<de2.d.Initialized>, tq.e<? super k10.l<? extends de2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f41279g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final de2.d.Initialized O(u uVar, de2.a.ShowDialog showDialog, de2.d.Initialized initialized) {
            return de2.d.Initialized.b(initialized, null, uVar.dialogVMSFactory.a(showDialog.getDialogData()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final de2.a.ShowDialog showDialog = (de2.a.ShowDialog) this.f41278f;
            k10.c0 c0Var = (k10.c0) this.f41279g;
            uq.b.e();
            if (this.f41277e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.b(new er.l() { // from class: de2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.k.O(uVar, showDialog, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.ShowDialog showDialog, k10.c0<de2.d.Initialized> c0Var, tq.e<? super k10.l<? extends de2.d>> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f41278f = showDialog;
            kVar.f41279g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lde2/a$a;", "<unused var>", "Lk10/c0;", "Lde2/d$a;", "state", "Lk10/l;", "Lde2/d;", "<anonymous>", "(Lde2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<de2.a.C0918a, k10.c0<de2.d.Initialized>, tq.e<? super k10.l<? extends de2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41282f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final de2.d.Initialized O(de2.d.Initialized initialized) {
            return de2.d.Initialized.b(initialized, null, null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f41282f;
            uq.b.e();
            if (this.f41281e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: de2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.l.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.C0918a c0918a, k10.c0<de2.d.Initialized> c0Var, tq.e<? super k10.l<? extends de2.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f41282f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lde2/a$h;", "<unused var>", "Lk10/c0;", "Lde2/b;", "state", "Lk10/l;", "Lde2/d;", "<anonymous>", "(Lde2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<de2.a.h, k10.c0<Error>, tq.e<? super k10.l<? extends de2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f41283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41284f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final de2.c O(Error error) {
            return de2.c.f41186a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f41284f;
            uq.b.e();
            if (this.f41283e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: de2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.m.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(de2.a.h hVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends de2.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f41284f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, ee2.b bVar, mx.c cVar, hb4.d dVar, ib4.c cVar2, aq0.c cVar3, i70.n nVar, ac4.a aVar2, oz.q qVar, a14.n nVar2, ae2.i iVar, a14.m mVar, cb4.j jVar) {
        this.mapper = bVar;
        this.labelProvider = cVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar2;
        this.beGetReportIncidentsUC = cVar3;
        this.snackBarManagerStateHolder = nVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.ownerViewLifecycleManager = qVar;
        this.goToDeviceLocationSettingsUseCase = nVar2;
        this.requestAllPermissionsToGetLocationUseCase = iVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.lifecycleConnector = qVar;
        de2.c cVar4 = de2.c.f41186a;
        this.initialState = cVar4;
        this.stateMachine = aVar.a(cVar4, new er.l() { // from class: de2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f41215a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), E9(cVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData B9() {
        return wd2.b.f212472a.a(this.labelProvider, b9(de2.a.b.f41174a), b9(de2.a.C0918a.f41173a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData C9() {
        return wd2.b.f212472a.b(this.labelProvider, b9(de2.a.c.f41175a), b9(de2.a.C0918a.f41173a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final de2.e.a E9(de2.d state) {
        return this.mapper.b(new ee2.b.Params(state, b9(de2.a.e.f41179a), b9(de2.a.g.f41181a), new er.l() { // from class: de2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f41216a, (BEReportedIncidentsReportedIncident) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(u uVar, BEReportedIncidentsReportedIncident bEReportedIncidentsReportedIncident) {
        uVar.d9(new de2.a.OnGoToIncidentDetails(bEReportedIncidentsReportedIncident));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b G9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: de2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f41220a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(u uVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            uVar.d9(de2.a.e.f41179a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            uVar.d9(de2.a.h.f41182a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(de2.d.class), new er.l() { // from class: de2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f41217a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(de2.c.class), new er.l() { // from class: de2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f41218a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(de2.d.Initialized.class), new er.l() { // from class: de2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9(this.f41219a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: de2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.N9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        zVar.x(q0.c(de2.a.e.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, k10.z zVar) {
        zVar.C(uVar.new c(null));
        d dVar = uVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(de2.a.h.class), oVar, dVar);
        zVar.v(q0.c(de2.a.ShowInitializationError.class), oVar, uVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(u uVar, k10.z zVar) {
        k10.k.m(zVar, mu.i.r(uVar.x8(), 1), null, new f(null), 2, null);
        g gVar = uVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(de2.a.g.class), oVar, gVar);
        zVar.x(q0.c(de2.a.OnGoToIncidentDetails.class), oVar, uVar.new h(null));
        zVar.x(q0.c(de2.a.c.class), oVar, uVar.new i(null));
        zVar.x(q0.c(de2.a.b.class), oVar, uVar.new j(null));
        zVar.v(q0.c(de2.a.ShowDialog.class), oVar, uVar.new k(null));
        zVar.v(q0.c(de2.a.C0918a.class), oVar, new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(k10.z zVar) {
        m mVar = new m(null);
        zVar.v(q0.c(de2.a.h.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(de2.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<de2.a.d> Y1() {
        return this.navAction;
    }

    @Override // de2.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<de2.d, de2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<de2.e.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
