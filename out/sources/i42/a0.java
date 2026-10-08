package i42;

import androidx.p016lifecycle.u0;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.List;
import mu.p0;
import mu.r0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v60.PaymentStatusCardData;
import yr0.BEPaymentInfo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001ZBY\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0&H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR&\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0 0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010(R\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030N8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006["}, d2 = {"Li42/a0;", "Ll00/g;", "Li42/d;", "Li42/c;", "Li42/e;", "", "Lyy/a;", "stateMachineFactory", "Lj42/c;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lr44/d;", "hasAnyPaymentUseCase", "Lib4/c;", "genericDomainErrorMapper", "Les0/f;", "getPaymentsUseCase", "Lh42/c;", "paymentInfoPagingItemMapper", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lr44/e;", "resetWidgetUpdateTimeUC", "<init>", "(Lyy/a;Lj42/c;Lac4/a;Lr44/d;Lib4/c;Les0/f;Lh42/c;La14/w;Li70/e;Lr44/e;)V", "state", "Li42/e$a;", "D9", "(Li42/d;)Li42/e$a;", "Lja/n0;", "Lyr0/h;", "pagingSourceData", "Lv60/a;", "C9", "(Lja/n0;)Lja/n0;", "Lmu/g;", "A9", "()Lmu/g;", "b", "Lj42/c;", "c", "Lac4/a;", "d", "Lr44/d;", "e", "Lib4/c;", "f", "Les0/f;", "g", "Lh42/c;", "h", "La14/w;", "j", "Li70/e;", "k", "Lr44/e;", "Lxw/b;", "Li42/c$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/b0;", "m", "Lmu/b0;", "_pendingPaymentsPagingData", "n", "Lmu/g;", "U2", "pendingPaymentsPagingData", "Li42/d$a;", "p", "Li42/d$a;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "s", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<i42.d, i42.c> implements i42.e, zx.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a f89050s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f89051t = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j42.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r44.d hasAnyPaymentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final es0.f getPaymentsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h42.c paymentInfoPagingItemMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final r44.e resetWidgetUpdateTimeUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i42.c.e> navAction = new xw.b<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<n0<BEPaymentInfo>> _pendingPaymentsPagingData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<PaymentStatusCardData>> pendingPaymentsPagingData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i42.d.a initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<i42.d, i42.c> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<i42.e.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Li42/a0$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "FIRST_PAGE_INDEX", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: i42.a0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li42/a0$a$a;", "", "<init>", "()V", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class C2096a extends Throwable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2096a f89067a = new C2096a();

            private C2096a() {
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"i42/a0$b", "Lja/x0;", "", "Lyr0/h;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends x0<Integer, BEPaymentInfo> {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f89069d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f89070e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f89071f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f89073h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f89071f = obj;
                this.f89073h |= PKIFailureInfo.systemUnavail;
                return b.this.g(null, this);
            }
        }

        b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ja.x0
        public Object g(x0.a<Integer> aVar, tq.e<? super x0.b<Integer, BEPaymentInfo>> eVar) throws Throwable {
            a aVar2;
            int i15;
            if (eVar instanceof a) {
                aVar2 = (a) eVar;
                int i16 = aVar2.f89073h;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f89073h = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object obj = aVar2.f89071f;
            Object objE = uq.b.e();
            int i17 = aVar2.f89073h;
            if (i17 == 0) {
                oq.u.b(obj);
                Integer numA = aVar.a();
                int iIntValue = numA != null ? numA.intValue() : 0;
                es0.f fVar = a0.this.getPaymentsUseCase;
                es0.f.Params params = new es0.f.Params(yr0.g.PENDING, iIntValue);
                aVar2.f89069d = vq.j.a(aVar);
                aVar2.f89070e = iIntValue;
                aVar2.f89073h = 1;
                Object objC = fVar.c(params, aVar2);
                if (objC == objE) {
                    return objE;
                }
                int i18 = iIntValue;
                obj = objC;
                i15 = i18;
            } else {
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i15 = aVar2.f89070e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            a0 a0Var = a0.this;
            if (iVar instanceof dx.i.Left) {
                a0Var.d9(new i42.c.Error((dx.b) ((dx.i.Left) iVar).b(), i42.c.d.f89145a));
                return new x0.b.a(new Throwable());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            if (list.isEmpty() && i15 == 0) {
                return new x0.b.C2395b(list, null, null);
            }
            return list.isEmpty() ? new x0.b.a(a.C2096a.f89067a) : new x0.b.C2395b(list, null, vq.b.e(i15 + 1));
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer d(PagingState<Integer, BEPaymentInfo> state) {
            Integer numH;
            int iIntValue;
            Integer numI;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition != null) {
                x0.b.C2395b<Integer, BEPaymentInfo> c2395bC = state.c(anchorPosition.intValue());
                if (c2395bC != null && (numI = c2395bC.i()) != null) {
                    iIntValue = numI.intValue() + 1;
                } else if (c2395bC != null && (numH = c2395bC.h()) != null) {
                    iIntValue = numH.intValue() - 1;
                }
                return Integer.valueOf(iIntValue);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyr0/h;", "paymentInfo", "Lv60/a;", "<anonymous>", "(Lyr0/h;)Lv60/a;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<BEPaymentInfo, tq.e<? super PaymentStatusCardData>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89075f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(a0 a0Var, BEPaymentInfo bEPaymentInfo) {
            a0Var.d9(new i42.c.NavigateToDetails(bEPaymentInfo));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BEPaymentInfo bEPaymentInfo = (BEPaymentInfo) this.f89075f;
            uq.b.e();
            if (this.f89074e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h42.c cVar = a0.this.paymentInfoPagingItemMapper;
            final a0 a0Var = a0.this;
            return cVar.b(new h42.c.Params(bEPaymentInfo, new er.l() { // from class: i42.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.c.O(a0Var, (BEPaymentInfo) obj2);
                }
            }));
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(BEPaymentInfo bEPaymentInfo, tq.e<? super PaymentStatusCardData> eVar) {
            return ((c) v(bEPaymentInfo, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = a0.this.new c(eVar);
            cVar.f89075f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<n0<PaymentStatusCardData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f89077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f89078b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f89079a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f89080b;

            /* JADX INFO: renamed from: i42.a0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2097a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f89081d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f89082e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f89083f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f89085h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f89086j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f89087k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f89088l;

                public C2097a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f89081d = obj;
                    this.f89082e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a0 a0Var) {
                this.f89079a = hVar;
                this.f89080b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2097a c2097a;
                if (eVar instanceof C2097a) {
                    c2097a = (C2097a) eVar;
                    int i15 = c2097a.f89082e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2097a.f89082e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2097a = new C2097a(eVar);
                    }
                } else {
                    c2097a = new C2097a(eVar);
                }
                Object obj2 = c2097a.f89081d;
                Object objE = uq.b.e();
                int i16 = c2097a.f89082e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f89079a;
                    n0 n0VarC9 = this.f89080b.C9((n0) obj);
                    c2097a.f89083f = vq.j.a(obj);
                    c2097a.f89085h = vq.j.a(c2097a);
                    c2097a.f89086j = vq.j.a(obj);
                    c2097a.f89087k = vq.j.a(hVar);
                    c2097a.f89088l = 0;
                    c2097a.f89082e = 1;
                    if (hVar.F(n0VarC9, c2097a) == objE) {
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

        public d(mu.g gVar, a0 a0Var) {
            this.f89077a = gVar;
            this.f89078b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<PaymentStatusCardData>> hVar, tq.e eVar) {
            Object objA = this.f89077a.a(new a(hVar, this.f89078b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<i42.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f89089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f89090b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f89091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f89092b;

            /* JADX INFO: renamed from: i42.a0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2098a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f89093d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f89094e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f89095f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f89097h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f89098j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f89099k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f89100l;

                public C2098a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f89093d = obj;
                    this.f89094e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, a0 a0Var) {
                this.f89091a = hVar;
                this.f89092b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2098a c2098a;
                if (eVar instanceof C2098a) {
                    c2098a = (C2098a) eVar;
                    int i15 = c2098a.f89094e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2098a.f89094e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2098a = new C2098a(eVar);
                    }
                } else {
                    c2098a = new C2098a(eVar);
                }
                Object obj2 = c2098a.f89093d;
                Object objE = uq.b.e();
                int i16 = c2098a.f89094e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f89091a;
                    i42.e.a aVarD9 = this.f89092b.D9((i42.d) obj);
                    c2098a.f89095f = vq.j.a(obj);
                    c2098a.f89097h = vq.j.a(c2098a);
                    c2098a.f89098j = vq.j.a(obj);
                    c2098a.f89099k = vq.j.a(hVar);
                    c2098a.f89100l = 0;
                    c2098a.f89094e = 1;
                    if (hVar.F(aVarD9, c2098a) == objE) {
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

        public e(mu.g gVar, a0 a0Var) {
            this.f89089a = gVar;
            this.f89090b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super i42.e.a> hVar, tq.e eVar) {
            Object objA = this.f89089a.a(new a(hVar, this.f89090b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li42/c$a;", "<unused var>", "Li42/d;", "Loq/i0;", "<anonymous>", "(Li42/c$a;Li42/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i42.c.a, i42.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89101e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89101e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<i42.c.e> bVarY1 = a0.this.Y1();
                i42.c.e.a aVar = i42.c.e.a.f89146a;
                this.f89101e = 1;
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
        public final Object w(i42.c.a aVar, i42.d dVar, tq.e<? super i0> eVar) {
            return a0.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li42/c$i;", "<unused var>", "Li42/d;", "Loq/i0;", "<anonymous>", "(Li42/c$i;Li42/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i42.c.i, i42.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89103e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89103e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                i42.c.e.C2101e c2101e = i42.c.e.C2101e.f89150a;
                this.f89103e = 1;
                if (a0Var.F(c2101e, this) == objE) {
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
        public final Object w(i42.c.i iVar, i42.d dVar, tq.e<? super i0> eVar) {
            return a0.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li42/c$j;", "<unused var>", "Li42/d;", "Loq/i0;", "<anonymous>", "(Li42/c$j;Li42/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<i42.c.j, i42.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89105e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89105e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                i42.c.e.f fVar = i42.c.e.f.f89151a;
                this.f89105e = 1;
                if (a0Var.F(fVar, this) == objE) {
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
        public final Object w(i42.c.j jVar, i42.d dVar, tq.e<? super i0> eVar) {
            return a0.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li42/c$h;", "<unused var>", "Li42/d;", "Loq/i0;", "<anonymous>", "(Li42/c$h;Li42/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<i42.c.h, i42.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89107e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89107e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                i42.c.e.d dVar = i42.c.e.d.f89149a;
                this.f89107e = 1;
                if (a0Var.F(dVar, this) == objE) {
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
        public final Object w(i42.c.h hVar, i42.d dVar, tq.e<? super i0> eVar) {
            return a0.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li42/c$g;", "action", "Li42/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li42/c$g;Li42/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<i42.c.OpenUrlIntent, i42.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89110f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i42.c.OpenUrlIntent openUrlIntent = (i42.c.OpenUrlIntent) this.f89110f;
            Object objE = uq.b.e();
            int i15 = this.f89109e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = a0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrlIntent.getUrl(), false, 2, null);
                this.f89110f = vq.j.a(openUrlIntent);
                this.f89109e = 1;
                obj = wVar.c(params, this);
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
            a0 a0Var = a0.this;
            if (iVar instanceof dx.i.Left) {
                a0Var.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i42.c.OpenUrlIntent openUrlIntent, i42.d dVar, tq.e<? super i0> eVar) {
            j jVar = a0.this.new j(eVar);
            jVar.f89110f = openUrlIntent;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li42/c$c;", "action", "Li42/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li42/c$c;Li42/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<i42.c.Error, i42.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89113f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(a0 a0Var, i42.c.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    a0Var.d9(i42.c.a.f89141a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    a0Var.d9(error.getRetryAction());
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i42.c.Error error = (i42.c.Error) this.f89113f;
            Object objE = uq.b.e();
            int i15 = this.f89112e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                ib4.c cVar = a0.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final a0 a0Var2 = a0.this;
                i42.c.e.Error error2 = new i42.c.e.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: i42.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.k.O(a0Var2, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f89113f = vq.j.a(error);
                this.f89112e = 1;
                if (a0Var.F(error2, this) == objE) {
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
        public final Object w(i42.c.Error error, i42.d dVar, tq.e<? super i0> eVar) {
            k kVar = a0.this.new k(eVar);
            kVar.f89113f = error;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li42/d$a;", "it", "Loq/i0;", "<anonymous>", "(Li42/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<i42.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89115e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f89115e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(i42.c.b.f89142a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i42.d.a aVar, tq.e<? super i0> eVar) {
            return ((l) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Li42/c$b;", "action", "Lk10/c0;", "Li42/d$a;", "state", "Lk10/l;", "Li42/d;", "<anonymous>", "(Li42/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<i42.c.b, k10.c0<i42.d.a>, tq.e<? super k10.l<? extends i42.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f89119g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Li42/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends i42.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f89121e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f89122f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f89123g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f89124h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f89125j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f89126k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ a0 f89127l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ i42.c.b f89128m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<i42.d.a> f89129n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a0 a0Var, i42.c.b bVar, k10.c0<i42.d.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f89127l = a0Var;
                this.f89128m = bVar;
                this.f89129n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i42.d.b.C2102b X(i42.d.a aVar) {
                return i42.d.b.C2102b.f89161a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i42.d.b.a Y(i42.d.a aVar) {
                return i42.d.b.a.f89160a;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0091  */
            /* JADX WARN: Code duplicated, block: B:26:0x009b A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:27:0x009d  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                boolean z15;
                k10.c0<i42.d.a> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f89126k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    r44.d dVar = this.f89127l.hasAnyPaymentUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f89126k = 1;
                    obj = dVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z15 = this.f89125j;
                    c0Var = (k10.c0) this.f89122f;
                    oq.u.b(obj);
                }
                if (z15) {
                    return c0Var.d(new er.l() { // from class: i42.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return a0.m.a.X((d.a) obj2);
                        }
                    });
                }
                if (z15) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: i42.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return a0.m.a.Y((d.a) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                a0 a0Var = this.f89127l;
                i42.c.b bVar = this.f89128m;
                k10.c0<i42.d.a> c0Var2 = this.f89129n;
                if (iVar instanceof dx.i.Left) {
                    a0Var.d9(new i42.c.Error((dx.b) ((dx.i.Left) iVar).b(), bVar));
                    return c0Var2.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                r44.e eVar = a0Var.resetWidgetUpdateTimeUC;
                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                this.f89121e = vq.j.a(iVar);
                this.f89122f = c0Var2;
                this.f89123g = 0;
                this.f89125j = zBooleanValue;
                this.f89124h = 0;
                this.f89126k = 2;
                if (eVar.c(c1792a2, this) != objE) {
                    z15 = zBooleanValue;
                    c0Var = c0Var2;
                    if (z15) {
                        return c0Var.d(new er.l() { // from class: i42.d0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return a0.m.a.X((d.a) obj2);
                            }
                        });
                    }
                    if (z15) {
                        return c0Var.d(new er.l() { // from class: i42.e0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return a0.m.a.Y((d.a) obj2);
                            }
                        });
                    }
                    throw new oq.p();
                }
                return objE;
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f89127l, this.f89128m, this.f89129n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends i42.d>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i42.c.b bVar = (i42.c.b) this.f89118f;
            k10.c0 c0Var = (k10.c0) this.f89119g;
            Object objE = uq.b.e();
            int i15 = this.f89117e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = a0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(a0.this, bVar, c0Var, null);
            this.f89118f = vq.j.a(bVar);
            this.f89119g = vq.j.a(c0Var);
            this.f89117e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i42.c.b bVar, k10.c0<i42.d.a> c0Var, tq.e<? super k10.l<? extends i42.d>> eVar) {
            m mVar = a0.this.new m(eVar);
            mVar.f89118f = bVar;
            mVar.f89119g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li42/d$b$b;", "it", "Loq/i0;", "<anonymous>", "(Li42/d$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<i42.d.b.C2102b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89130e;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f89130e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(i42.c.d.f89145a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i42.d.b.C2102b c2102b, tq.e<? super i0> eVar) {
            return ((n) v(c2102b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a0.this.new n(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li42/c$d;", "<unused var>", "Li42/d$b$b;", "Loq/i0;", "<anonymous>", "(Li42/c$d;Li42/d$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<i42.c.d, i42.d.b.C2102b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89132e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a0 f89134a;

            a(a0 a0Var) {
                this.f89134a = a0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BEPaymentInfo> n0Var, tq.e<? super i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f89134a._pendingPaymentsPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return i0.f148189a;
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89132e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarA = ja.d.a(a0.this.A9(), u0.a(a0.this));
                a aVar = new a(a0.this);
                this.f89132e = 1;
                if (gVarA.a(aVar, this) == objE) {
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
        public final Object w(i42.c.d dVar, i42.d.b.C2102b c2102b, tq.e<? super i0> eVar) {
            return a0.this.new o(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li42/c$f;", "action", "Li42/d$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li42/c$f;Li42/d$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<i42.c.NavigateToDetails, i42.d.b.C2102b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89136f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i42.c.NavigateToDetails navigateToDetails = (i42.c.NavigateToDetails) this.f89136f;
            Object objE = uq.b.e();
            int i15 = this.f89135e;
            if (i15 == 0) {
                oq.u.b(obj);
                a0 a0Var = a0.this;
                i42.c.e.NavigateToDetails navigateToDetails2 = new i42.c.e.NavigateToDetails(navigateToDetails.getPaymentInfo().getPaymentId());
                this.f89136f = vq.j.a(navigateToDetails);
                this.f89135e = 1;
                if (a0Var.F(navigateToDetails2, this) == objE) {
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
        public final Object w(i42.c.NavigateToDetails navigateToDetails, i42.d.b.C2102b c2102b, tq.e<? super i0> eVar) {
            p pVar = a0.this.new p(eVar);
            pVar.f89136f = navigateToDetails;
            return pVar.J(i0.f148189a);
        }
    }

    public a0(yy.a aVar, j42.c cVar, ac4.a aVar2, r44.d dVar, ib4.c cVar2, es0.f fVar, h42.c cVar3, a14.w wVar, i70.e eVar, r44.e eVar2) {
        this.mapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.hasAnyPaymentUseCase = dVar;
        this.genericDomainErrorMapper = cVar2;
        this.getPaymentsUseCase = fVar;
        this.paymentInfoPagingItemMapper = cVar3;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.resetWidgetUpdateTimeUC = eVar2;
        mu.b0<n0<BEPaymentInfo>> b0VarA = r0.a(n0.INSTANCE.c());
        this._pendingPaymentsPagingData = b0VarA;
        this.pendingPaymentsPagingData = new d(b0VarA, this);
        i42.d.a aVar3 = i42.d.a.f89159a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: i42.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.G9(this.f89192a, (k10.v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), D9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<BEPaymentInfo>> A9() {
        return new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: i42.z
            @Override // er.a
            public final Object a() {
                return a0.B9(this.f89197a);
            }
        }, 2, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 B9(a0 a0Var) {
        return a0Var.new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<PaymentStatusCardData> C9(n0<BEPaymentInfo> pagingSourceData) {
        return ja.u0.c(pagingSourceData, new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i42.e.a D9(i42.d state) {
        return this.mapper.b(new j42.c.Params(state, b9(i42.c.a.f89141a), b9(i42.c.i.f89155a), b9(i42.c.j.f89156a), b9(i42.c.h.f89154a), new er.l() { // from class: i42.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.E9(this.f89196a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(a0 a0Var, String str) {
        a0Var.d9(new i42.c.OpenUrlIntent(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final a0 a0Var, k10.v vVar) {
        vVar.c(q0.c(i42.d.class), new er.l() { // from class: i42.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.H9(this.f89193a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(i42.d.a.class), new er.l() { // from class: i42.w
            @Override // er.l
            public final Object b(Object obj) {
                return a0.I9(this.f89194a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(i42.d.b.C2102b.class), new er.l() { // from class: i42.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.J9(this.f89195a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(a0 a0Var, k10.z zVar) {
        f fVar = a0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i42.c.a.class), oVar, fVar);
        zVar.x(q0.c(i42.c.i.class), oVar, a0Var.new g(null));
        zVar.x(q0.c(i42.c.j.class), oVar, a0Var.new h(null));
        zVar.x(q0.c(i42.c.h.class), oVar, a0Var.new i(null));
        zVar.x(q0.c(i42.c.OpenUrlIntent.class), oVar, a0Var.new j(null));
        zVar.x(q0.c(i42.c.Error.class), oVar, a0Var.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(a0 a0Var, k10.z zVar) {
        zVar.C(a0Var.new l(null));
        m mVar = a0Var.new m(null);
        zVar.v(q0.c(i42.c.b.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(a0 a0Var, k10.z zVar) {
        zVar.C(a0Var.new n(null));
        o oVar = a0Var.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i42.c.d.class), oVar2, oVar);
        zVar.x(q0.c(i42.c.NavigateToDetails.class), oVar2, a0Var.new p(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i42.e
    public mu.g<n0<PaymentStatusCardData>> U2() {
        return this.pendingPaymentsPagingData;
    }

    @Override // zx.b
    public xw.b<i42.c.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<i42.d, i42.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i42.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(i42.c.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
