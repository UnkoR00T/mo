package p42;

import androidx.p016lifecycle.u0;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.List;
import k10.t;
import k10.v;
import k10.z;
import mu.b0;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v60.PaymentStatusCardData;
import yr0.BEPaymentInfo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001BB1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00150\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001dR&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00120;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lp42/n;", "Ll00/g;", "Lp42/b;", "Lp42/a;", "Lp42/c;", "", "Lyy/a;", "stateMachineFactory", "Lq42/a;", "mapper", "Les0/f;", "getPaymentsUseCase", "Lh42/c;", "paymentInfoPagingItemMapper", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lyy/a;Lq42/a;Les0/f;Lh42/c;Lib4/c;)V", "Lp42/c$a;", "v9", "()Lp42/c$a;", "Lja/n0;", "Lyr0/h;", "pagingSourceData", "Lv60/a;", "u9", "(Lja/n0;)Lja/n0;", "Lmu/g;", "s9", "()Lmu/g;", "b", "Lq42/a;", "c", "Les0/f;", "d", "Lh42/c;", "e", "Lib4/c;", "Lxw/b;", "Lp42/a$c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/b0;", "g", "Lmu/b0;", "_historicPaymentsPagingData", "h", "Lmu/g;", "o5", "historicPaymentsPagingData", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "l", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<p42.b, p42.a> implements p42.c, zx.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f152941l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f152942m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q42.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final es0.f getPaymentsUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h42.c paymentInfoPagingItemMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p42.a.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b0<n0<BEPaymentInfo>> _historicPaymentsPagingData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<PaymentStatusCardData>> historicPaymentsPagingData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<p42.b, p42.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<p42.c.Data> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\t"}, d2 = {"Lp42/n$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "FIRST_PAGE_INDEX", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: p42.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp42/n$a$a;", "", "<init>", "()V", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class C3756a extends Throwable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3756a f152952a = new C3756a();

            private C3756a() {
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"p42/n$b", "Lja/x0;", "", "Lyr0/h;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends x0<Integer, BEPaymentInfo> {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f152954d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f152955e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f152956f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f152958h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f152956f = obj;
                this.f152958h |= PKIFailureInfo.systemUnavail;
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
                int i16 = aVar2.f152958h;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f152958h = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object obj = aVar2.f152956f;
            Object objE = uq.b.e();
            int i17 = aVar2.f152958h;
            if (i17 == 0) {
                u.b(obj);
                Integer numA = aVar.a();
                int iIntValue = numA != null ? numA.intValue() : 0;
                es0.f fVar = n.this.getPaymentsUseCase;
                es0.f.Params params = new es0.f.Params(yr0.g.HISTORIC, iIntValue);
                aVar2.f152954d = vq.j.a(aVar);
                aVar2.f152955e = iIntValue;
                aVar2.f152958h = 1;
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
                i15 = aVar2.f152955e;
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n nVar = n.this;
            if (iVar instanceof dx.i.Left) {
                nVar.d9(new p42.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                return new x0.b.a(new Throwable());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            if (list.isEmpty() && i15 == 0) {
                return new x0.b.C2395b(list, null, null);
            }
            return list.isEmpty() ? new x0.b.a(a.C3756a.f152952a) : new x0.b.C2395b(list, null, vq.b.e(i15 + 1));
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
        int f152959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f152960f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(n nVar, BEPaymentInfo bEPaymentInfo) {
            nVar.d9(new p42.a.NavigateToDetails(bEPaymentInfo));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BEPaymentInfo bEPaymentInfo = (BEPaymentInfo) this.f152960f;
            uq.b.e();
            if (this.f152959e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            h42.c cVar = n.this.paymentInfoPagingItemMapper;
            final n nVar = n.this;
            return cVar.b(new h42.c.Params(bEPaymentInfo, new er.l() { // from class: p42.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(nVar, (BEPaymentInfo) obj2);
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
            c cVar = n.this.new c(eVar);
            cVar.f152960f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<n0<PaymentStatusCardData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f152962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f152963b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f152964a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f152965b;

            /* JADX INFO: renamed from: p42.n$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3757a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f152966d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f152967e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f152968f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f152970h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f152971j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f152972k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f152973l;

                public C3757a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f152966d = obj;
                    this.f152967e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f152964a = hVar;
                this.f152965b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3757a c3757a;
                if (eVar instanceof C3757a) {
                    c3757a = (C3757a) eVar;
                    int i15 = c3757a.f152967e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3757a.f152967e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3757a = new C3757a(eVar);
                    }
                } else {
                    c3757a = new C3757a(eVar);
                }
                Object obj2 = c3757a.f152966d;
                Object objE = uq.b.e();
                int i16 = c3757a.f152967e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f152964a;
                    n0 n0VarU9 = this.f152965b.u9((n0) obj);
                    c3757a.f152968f = vq.j.a(obj);
                    c3757a.f152970h = vq.j.a(c3757a);
                    c3757a.f152971j = vq.j.a(obj);
                    c3757a.f152972k = vq.j.a(hVar);
                    c3757a.f152973l = 0;
                    c3757a.f152967e = 1;
                    if (hVar.F(n0VarU9, c3757a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, n nVar) {
            this.f152962a = gVar;
            this.f152963b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<PaymentStatusCardData>> hVar, tq.e eVar) {
            Object objA = this.f152962a.a(new a(hVar, this.f152963b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<p42.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f152974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f152975b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f152976a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f152977b;

            /* JADX INFO: renamed from: p42.n$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3758a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f152978d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f152979e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f152980f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f152982h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f152983j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f152984k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f152985l;

                public C3758a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f152978d = obj;
                    this.f152979e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f152976a = hVar;
                this.f152977b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3758a c3758a;
                if (eVar instanceof C3758a) {
                    c3758a = (C3758a) eVar;
                    int i15 = c3758a.f152979e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3758a.f152979e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3758a = new C3758a(eVar);
                    }
                } else {
                    c3758a = new C3758a(eVar);
                }
                Object obj2 = c3758a.f152978d;
                Object objE = uq.b.e();
                int i16 = c3758a.f152979e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f152976a;
                    p42.c.Data dataV9 = this.f152977b.v9();
                    c3758a.f152980f = vq.j.a(obj);
                    c3758a.f152982h = vq.j.a(c3758a);
                    c3758a.f152983j = vq.j.a(obj);
                    c3758a.f152984k = vq.j.a(hVar);
                    c3758a.f152985l = 0;
                    c3758a.f152979e = 1;
                    if (hVar.F(dataV9, c3758a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public e(mu.g gVar, n nVar) {
            this.f152974a = gVar;
            this.f152975b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p42.c.Data> hVar, tq.e eVar) {
            Object objA = this.f152974a.a(new a(hVar, this.f152975b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp42/a$a;", "<unused var>", "Lp42/b;", "Loq/i0;", "<anonymous>", "(Lp42/a$a;Lp42/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<p42.a.C3753a, p42.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152986e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f152986e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<p42.a.c> bVarY1 = n.this.Y1();
                p42.a.c.C3754a c3754a = p42.a.c.C3754a.f152919a;
                this.f152986e = 1;
                if (bVarY1.F(c3754a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p42.a.C3753a c3753a, p42.b bVar, tq.e<? super i0> eVar) {
            return n.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp42/a$b;", "action", "Lp42/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp42/a$b;Lp42/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<p42.a.Error, p42.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f152989f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(ib4.c.b bVar) {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p42.a.Error error = (p42.a.Error) this.f152989f;
            Object objE = uq.b.e();
            int i15 = this.f152988e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                p42.a.c.Error error2 = new p42.a.c.Error(n.this.genericDomainErrorMapper.b(new ib4.c.Params(error.getDomainError(), false, new er.l() { // from class: p42.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.g.O((ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f152989f = vq.j.a(error);
                this.f152988e = 1;
                if (nVar.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p42.a.Error error, p42.b bVar, tq.e<? super i0> eVar) {
            g gVar = n.this.new g(eVar);
            gVar.f152989f = error;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp42/b;", "it", "Loq/i0;", "<anonymous>", "(Lp42/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<p42.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152991e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f152993a;

            a(n nVar) {
                this.f152993a = nVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BEPaymentInfo> n0Var, tq.e<? super i0> eVar) {
                Object value;
                b0 b0Var = this.f152993a._historicPaymentsPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return i0.f148189a;
            }
        }

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f152991e;
            if (i15 == 0) {
                u.b(obj);
                mu.g gVarA = ja.d.a(n.this.s9(), u0.a(n.this));
                a aVar = new a(n.this);
                this.f152991e = 1;
                if (gVarA.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p42.b bVar, tq.e<? super i0> eVar) {
            return ((h) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp42/a$d;", "action", "Lp42/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp42/a$d;Lp42/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<p42.a.NavigateToDetails, p42.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f152994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f152995f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p42.a.NavigateToDetails navigateToDetails = (p42.a.NavigateToDetails) this.f152995f;
            Object objE = uq.b.e();
            int i15 = this.f152994e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                p42.a.c.NavigateToDetails navigateToDetails2 = new p42.a.c.NavigateToDetails(navigateToDetails.getPaymentInfo().getPaymentId());
                this.f152995f = vq.j.a(navigateToDetails);
                this.f152994e = 1;
                if (nVar.F(navigateToDetails2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p42.a.NavigateToDetails navigateToDetails, p42.b bVar, tq.e<? super i0> eVar) {
            i iVar = n.this.new i(eVar);
            iVar.f152995f = navigateToDetails;
            return iVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, q42.a aVar2, es0.f fVar, h42.c cVar, ib4.c cVar2) {
        this.mapper = aVar2;
        this.getPaymentsUseCase = fVar;
        this.paymentInfoPagingItemMapper = cVar;
        this.genericDomainErrorMapper = cVar2;
        b0<n0<BEPaymentInfo>> b0VarA = r0.a(n0.INSTANCE.c());
        this._historicPaymentsPagingData = b0VarA;
        this.historicPaymentsPagingData = new d(b0VarA, this);
        this.stateMachine = aVar.a(p42.b.f152923a, new er.l() { // from class: p42.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f152938a, (v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), v9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<BEPaymentInfo>> s9() {
        return new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: p42.m
            @Override // er.a
            public final Object a() {
                return n.t9(this.f152940a);
            }
        }, 2, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 t9(n nVar) {
        return nVar.new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<PaymentStatusCardData> u9(n0<BEPaymentInfo> pagingSourceData) {
        return ja.u0.c(pagingSourceData, new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p42.c.Data v9() {
        return this.mapper.b(new q42.a.Params(b9(p42.a.C3753a.f152917a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final n nVar, v vVar) {
        vVar.c(q0.c(p42.b.class), new er.l() { // from class: p42.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f152939a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, z zVar) {
        f fVar = nVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p42.a.C3753a.class), oVar, fVar);
        zVar.x(q0.c(p42.a.Error.class), oVar, nVar.new g(null));
        zVar.C(nVar.new h(null));
        zVar.x(q0.c(p42.a.NavigateToDetails.class), oVar, nVar.new i(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p42.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<p42.b, p42.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p42.c.Data> getState() {
        return this.state;
    }

    @Override // p42.c
    public mu.g<n0<PaymentStatusCardData>> o5() {
        return this.historicPaymentsPagingData;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p42.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
