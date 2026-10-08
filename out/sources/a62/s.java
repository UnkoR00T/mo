package a62;

import as0.BETransaction;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.List;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u42.TransactionDetailsNavParams;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001JB;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R.\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"La62/s;", "Ll00/g;", "La62/e;", "La62/c;", "La62/f;", "", "Lyy/a;", "stateMachineFactory", "Lb62/a;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lgs0/c;", "getTransactionsUseCase", "Lb62/c;", "paymentsTransactionsTimelineItemsMapper", "La62/d;", "setupData", "<init>", "(Lyy/a;Lb62/a;Lib4/c;Lgs0/c;Lb62/c;La62/d;)V", "state", "La62/f$a;", "w9", "(La62/e;)La62/f$a;", "", "paymentId", "Lmu/g;", "Lja/n0;", "Lc62/a;", "s9", "(Ljava/lang/String;)Lmu/g;", "Las0/a;", "pagingData", "u9", "(Lja/n0;)Lja/n0;", "b", "Lb62/a;", "c", "Lib4/c;", "d", "Lgs0/c;", "e", "Lb62/c;", "f", "La62/d;", "g", "La62/e;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "j", "Lmu/g;", "I4", "()Lmu/g;", "x9", "(Lmu/g;)V", "transactionsPagingDataFlow", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "La62/c$d;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "m", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<State, a62.c> implements a62.f, zx.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3901n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b62.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final gs0.c getTransactionsUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b62.c paymentsTransactionsTimelineItemsMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, a62.c> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private mu.g<n0<c62.a>> transactionsPagingDataFlow;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<a62.f.Data> state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a62.c.d> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n0<c62.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f3912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f3913b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f3914a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f3915b;

            /* JADX INFO: renamed from: a62.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0072a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f3916d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f3917e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f3918f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f3920h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f3921j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f3922k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f3923l;

                public C0072a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f3916d = obj;
                    this.f3917e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f3914a = hVar;
                this.f3915b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0072a c0072a;
                if (eVar instanceof C0072a) {
                    c0072a = (C0072a) eVar;
                    int i15 = c0072a.f3917e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0072a.f3917e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0072a = new C0072a(eVar);
                    }
                } else {
                    c0072a = new C0072a(eVar);
                }
                Object obj2 = c0072a.f3916d;
                Object objE = uq.b.e();
                int i16 = c0072a.f3917e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f3914a;
                    n0 n0VarU9 = this.f3915b.u9((n0) obj);
                    c0072a.f3918f = vq.j.a(obj);
                    c0072a.f3920h = vq.j.a(c0072a);
                    c0072a.f3921j = vq.j.a(obj);
                    c0072a.f3922k = vq.j.a(hVar);
                    c0072a.f3923l = 0;
                    c0072a.f3917e = 1;
                    if (hVar.F(n0VarU9, c0072a) == objE) {
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
            this.f3912a = gVar;
            this.f3913b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<c62.a>> hVar, tq.e eVar) {
            Object objA = this.f3912a.a(new a(hVar, this.f3913b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"a62/s$c", "Lja/x0;", "", "Las0/a;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends x0<Integer, BETransaction> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3925c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f3926d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f3927e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f3928f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f3930h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f3928f = obj;
                this.f3930h |= PKIFailureInfo.systemUnavail;
                return c.this.g(null, this);
            }
        }

        c(String str) {
            this.f3925c = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ja.x0
        public Object g(x0.a<Integer> aVar, tq.e<? super x0.b<Integer, BETransaction>> eVar) throws Throwable {
            a aVar2;
            int i15;
            if (eVar instanceof a) {
                aVar2 = (a) eVar;
                int i16 = aVar2.f3930h;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f3930h = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object obj = aVar2.f3928f;
            Object objE = uq.b.e();
            int i17 = aVar2.f3930h;
            if (i17 == 0) {
                oq.u.b(obj);
                Integer numA = aVar.a();
                int iIntValue = numA != null ? numA.intValue() : 0;
                gs0.c cVar = s.this.getTransactionsUseCase;
                gs0.c.Params params = new gs0.c.Params(this.f3925c, iIntValue, 10);
                aVar2.f3926d = vq.j.a(aVar);
                aVar2.f3927e = iIntValue;
                aVar2.f3930h = 1;
                Object objC = cVar.c(params, aVar2);
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
                i15 = aVar2.f3927e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            s sVar = s.this;
            String str = this.f3925c;
            if (iVar instanceof dx.i.Left) {
                sVar.d9(new a62.c.Error((dx.b) ((dx.i.Left) iVar).b(), sVar.b9(new a62.c.GetTransactions(str))));
                return new x0.b.a(new Throwable());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            return list.isEmpty() ? new x0.b.a(new Throwable()) : new x0.b.C2395b(list, null, vq.b.e(i15 + 1));
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer d(PagingState<Integer, BETransaction> state) {
            Integer numH;
            int iIntValue;
            Integer numI;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition != null) {
                x0.b.C2395b<Integer, BETransaction> c2395bC = state.c(anchorPosition.intValue());
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<a62.f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f3931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f3932b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f3933a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f3934b;

            /* JADX INFO: renamed from: a62.s$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0073a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f3935d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f3936e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f3937f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f3939h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f3940j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f3941k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f3942l;

                public C0073a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f3935d = obj;
                    this.f3936e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f3933a = hVar;
                this.f3934b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0073a c0073a;
                if (eVar instanceof C0073a) {
                    c0073a = (C0073a) eVar;
                    int i15 = c0073a.f3936e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0073a.f3936e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0073a = new C0073a(eVar);
                    }
                } else {
                    c0073a = new C0073a(eVar);
                }
                Object obj2 = c0073a.f3935d;
                Object objE = uq.b.e();
                int i16 = c0073a.f3936e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f3933a;
                    a62.f.Data dataW9 = this.f3934b.w9((State) obj);
                    c0073a.f3937f = vq.j.a(obj);
                    c0073a.f3939h = vq.j.a(c0073a);
                    c0073a.f3940j = vq.j.a(obj);
                    c0073a.f3941k = vq.j.a(hVar);
                    c0073a.f3942l = 0;
                    c0073a.f3936e = 1;
                    if (hVar.F(dataW9, c0073a) == objE) {
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

        public d(mu.g gVar, s sVar) {
            this.f3931a = gVar;
            this.f3932b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a62.f.Data> hVar, tq.e eVar) {
            Object objA = this.f3931a.a(new a(hVar, this.f3932b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La62/c$b;", "action", "La62/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(La62/c$b;La62/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a62.c.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3944f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s sVar, a62.c.Error error, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                sVar.d9(a62.c.a.f3871a);
            } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                error.b().a();
            } else if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a62.c.Error error = (a62.c.Error) this.f3944f;
            Object objE = uq.b.e();
            int i15 = this.f3943e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a62.c.d> bVarY1 = s.this.Y1();
                ib4.c cVar = s.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final s sVar = s.this;
                a62.c.d.Error error2 = new a62.c.d.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: a62.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.e.O(sVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f3944f = vq.j.a(error);
                this.f3943e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        public final Object w(a62.c.Error error, State state, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f3944f = error;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La62/c$a;", "<unused var>", "La62/e;", "Loq/i0;", "<anonymous>", "(La62/c$a;La62/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a62.c.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3946e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3946e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a62.c.d> bVarY1 = s.this.Y1();
                a62.c.d.a aVar = a62.c.d.a.f3875a;
                this.f3946e = 1;
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
        public final Object w(a62.c.a aVar, State state, tq.e<? super i0> eVar) {
            return s.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La62/e;", "state", "Loq/i0;", "<anonymous>", "(La62/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3949f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f3949f;
            uq.b.e();
            if (this.f3948e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(new a62.c.GetTransactions(state.getPaymentId()));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((g) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = s.this.new g(eVar);
            gVar.f3949f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La62/c$c;", "action", "La62/e;", "state", "Loq/i0;", "<anonymous>", "(La62/c$c;La62/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a62.c.GetTransactions, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3952f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a62.c.GetTransactions getTransactions = (a62.c.GetTransactions) this.f3952f;
            uq.b.e();
            if (this.f3951e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s sVar = s.this;
            sVar.x9(sVar.s9(getTransactions.getPaymentId()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a62.c.GetTransactions getTransactions, State state, tq.e<? super i0> eVar) {
            h hVar = s.this.new h(eVar);
            hVar.f3952f = getTransactions;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La62/c$e;", "action", "La62/e;", "state", "Loq/i0;", "<anonymous>", "(La62/c$e;La62/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a62.c.ToTransactionDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3955f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3956g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a62.c.ToTransactionDetails toTransactionDetails = (a62.c.ToTransactionDetails) this.f3955f;
            State state = (State) this.f3956g;
            Object objE = uq.b.e();
            int i15 = this.f3954e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a62.c.d> bVarY1 = s.this.Y1();
                a62.c.d.ToTransactionDetails toTransactionDetails2 = new a62.c.d.ToTransactionDetails(new TransactionDetailsNavParams(state.getPaymentId(), toTransactionDetails.getTransactionId()));
                this.f3955f = vq.j.a(toTransactionDetails);
                this.f3956g = vq.j.a(state);
                this.f3954e = 1;
                if (bVarY1.F(toTransactionDetails2, this) == objE) {
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
        public final Object w(a62.c.ToTransactionDetails toTransactionDetails, State state, tq.e<? super i0> eVar) {
            i iVar = s.this.new i(eVar);
            iVar.f3955f = toTransactionDetails;
            iVar.f3956g = state;
            return iVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, b62.a aVar2, ib4.c cVar, gs0.c cVar2, b62.c cVar3, SetupData setupData) {
        this.mapper = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.getTransactionsUseCase = cVar2;
        this.paymentsTransactionsTimelineItemsMapper = cVar3;
        this.setupData = setupData;
        State state = new State(setupData.getPaymentId());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: a62.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f3899a, (k10.v) obj);
            }
        });
        this.transactionsPagingDataFlow = mu.i.v();
        this.state = a9(new d(e9().getState(), this), w9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, z zVar) {
        e eVar = sVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a62.c.Error.class), oVar, eVar);
        zVar.x(q0.c(a62.c.a.class), oVar, sVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, z zVar) {
        zVar.C(sVar.new g(null));
        h hVar = sVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a62.c.GetTransactions.class), oVar, hVar);
        zVar.x(q0.c(a62.c.ToTransactionDetails.class), oVar, sVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<c62.a>> s9(final String paymentId) {
        return new b(new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: a62.p
            @Override // er.a
            public final Object a() {
                return s.t9(this.f3896a, paymentId);
            }
        }, 2, null).a(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 t9(s sVar, String str) {
        return sVar.new c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<c62.a> u9(n0<BETransaction> pagingData) {
        return this.paymentsTransactionsTimelineItemsMapper.b(new b62.c.Params(pagingData, new er.l() { // from class: a62.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f3898a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(s sVar, String str) {
        sVar.d9(new a62.c.ToTransactionDetails(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a62.f.Data w9(State state) {
        return this.mapper.b(new b62.a.Params(state, b9(a62.c.a.f3871a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: a62.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f3894a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: a62.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f3895a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // a62.f
    public mu.g<n0<c62.a>> I4() {
        return this.transactionsPagingDataFlow;
    }

    @Override // zx.b
    public xw.b<a62.c.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, a62.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a62.f.Data> getState() {
        return this.state;
    }

    public void x9(mu.g<n0<c62.a>> gVar) {
        this.transactionsPagingDataFlow = gVar;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
