package x62;

import androidx.p016lifecycle.u0;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou0.Ticket;
import p071kotlin.Metadata;
import s62.TicketDetailsDestinationParams;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001LB9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180!2\u0006\u0010 \u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R.\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lx62/x;", "Ll00/g;", "Lx62/d;", "Lx62/c;", "Lx62/e;", "", "Lyy/a;", "stateMachineFactory", "Lpu0/a;", "getTicketsUseCase", "Lf01/b;", "launchNativeRatingUC", "Ly62/d;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Ly62/a;", "ticketPagingMapper", "<init>", "(Lyy/a;Lpu0/a;Lf01/b;Ly62/d;Lib4/c;Ly62/a;)V", "state", "Lx62/e$a;", "y9", "(Lx62/d;)Lx62/e$a;", "Lja/n0;", "Lou0/b;", "pagingSourceData", "Lou0/a;", "status", "Lz62/a;", "w9", "(Lja/n0;Lou0/a;)Lja/n0;", "paymentStatus", "Lmu/g;", "u9", "(Lou0/a;Ltq/e;)Ljava/lang/Object;", "b", "Lpu0/a;", "c", "Lf01/b;", "d", "Ly62/d;", "e", "Lib4/c;", "f", "Ly62/a;", "Lx62/d$b;", "g", "Lx62/d$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lx62/c$f;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "k", "Lmu/g;", "y1", "()Lmu/g;", "A9", "(Lmu/g;)V", "ticketPagingDataFlow", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "m", "a", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<x62.d, x62.c> implements x62.e, zx.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f217053n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pu0.a getTicketsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y62.d mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y62.a ticketPagingMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x62.d.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<x62.d, x62.c> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x62.c.f> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private mu.g<n0<z62.a>> ticketPagingDataFlow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<x62.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n0<z62.a>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f217065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f217066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ou0.a f217067c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f217068a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f217069b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ou0.a f217070c;

            /* JADX INFO: renamed from: x62.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5792a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f217071d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f217072e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f217073f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f217075h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f217076j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f217077k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f217078l;

                public C5792a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f217071d = obj;
                    this.f217072e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar, ou0.a aVar) {
                this.f217068a = hVar;
                this.f217069b = xVar;
                this.f217070c = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5792a c5792a;
                if (eVar instanceof C5792a) {
                    c5792a = (C5792a) eVar;
                    int i15 = c5792a.f217072e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5792a.f217072e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5792a = new C5792a(eVar);
                    }
                } else {
                    c5792a = new C5792a(eVar);
                }
                Object obj2 = c5792a.f217071d;
                Object objE = uq.b.e();
                int i16 = c5792a.f217072e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f217068a;
                    n0 n0VarW9 = this.f217069b.w9((n0) obj, this.f217070c);
                    c5792a.f217073f = vq.j.a(obj);
                    c5792a.f217075h = vq.j.a(c5792a);
                    c5792a.f217076j = vq.j.a(obj);
                    c5792a.f217077k = vq.j.a(hVar);
                    c5792a.f217078l = 0;
                    c5792a.f217072e = 1;
                    if (hVar.F(n0VarW9, c5792a) == objE) {
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

        public b(mu.g gVar, x xVar, ou0.a aVar) {
            this.f217065a = gVar;
            this.f217066b = xVar;
            this.f217067c = aVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<z62.a>> hVar, tq.e eVar) {
            Object objA = this.f217065a.a(new a(hVar, this.f217066b, this.f217067c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"x62/x$c", "Lja/x0;", "", "Lou0/b;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends x0<Integer, Ticket> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ou0.a f217080c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f217081d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f217082e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f217083f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f217085h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f217083f = obj;
                this.f217085h |= PKIFailureInfo.systemUnavail;
                return c.this.g(null, this);
            }
        }

        c(ou0.a aVar) {
            this.f217080c = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ja.x0
        public Object g(x0.a<Integer> aVar, tq.e<? super x0.b<Integer, Ticket>> eVar) throws Throwable {
            a aVar2;
            int i15;
            if (eVar instanceof a) {
                aVar2 = (a) eVar;
                int i16 = aVar2.f217085h;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f217085h = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object obj = aVar2.f217083f;
            Object objE = uq.b.e();
            int i17 = aVar2.f217085h;
            if (i17 == 0) {
                oq.u.b(obj);
                Integer numA = aVar.a();
                int iIntValue = numA != null ? numA.intValue() : 1;
                pu0.a aVar3 = x.this.getTicketsUseCase;
                pu0.a.Params params = new pu0.a.Params(this.f217080c, iIntValue);
                aVar2.f217081d = vq.j.a(aVar);
                aVar2.f217082e = iIntValue;
                aVar2.f217085h = 1;
                Object objC = aVar3.c(params, aVar2);
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
                i15 = aVar2.f217082e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                xVar.d9(new x62.c.CustomError((dx.b) ((dx.i.Left) iVar).b()));
                return new x0.b.a(new Throwable());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            return list.isEmpty() ? new x0.b.a(Companion.C5791a.f217064a) : new x0.b.C2395b(list, null, vq.b.e(i15 + 1));
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer d(PagingState<Integer, Ticket> state) {
            Integer numH;
            int iIntValue;
            Integer numI;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition != null) {
                x0.b.C2395b<Integer, Ticket> c2395bC = state.c(anchorPosition.intValue());
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
    public static final class d implements mu.g<x62.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f217086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f217087b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f217088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f217089b;

            /* JADX INFO: renamed from: x62.x$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5793a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f217090d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f217091e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f217092f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f217094h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f217095j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f217096k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f217097l;

                public C5793a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f217090d = obj;
                    this.f217091e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f217088a = hVar;
                this.f217089b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5793a c5793a;
                if (eVar instanceof C5793a) {
                    c5793a = (C5793a) eVar;
                    int i15 = c5793a.f217091e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5793a.f217091e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5793a = new C5793a(eVar);
                    }
                } else {
                    c5793a = new C5793a(eVar);
                }
                Object obj2 = c5793a.f217090d;
                Object objE = uq.b.e();
                int i16 = c5793a.f217091e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f217088a;
                    x62.e.a aVarY9 = this.f217089b.y9((x62.d) obj);
                    c5793a.f217092f = vq.j.a(obj);
                    c5793a.f217094h = vq.j.a(c5793a);
                    c5793a.f217095j = vq.j.a(obj);
                    c5793a.f217096k = vq.j.a(hVar);
                    c5793a.f217097l = 0;
                    c5793a.f217091e = 1;
                    if (hVar.F(aVarY9, c5793a) == objE) {
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

        public d(mu.g gVar, x xVar) {
            this.f217086a = gVar;
            this.f217087b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super x62.e.a> hVar, tq.e eVar) {
            Object objA = this.f217086a.a(new a(hVar, this.f217087b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx62/c$a;", "action", "Lx62/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx62/c$a;Lx62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<x62.c.Back, x62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217099f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            if (r6.c(r2, r5) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f217099f
                x62.c$a r0 = (x62.c.Back) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f217098e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L55
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                goto L38
            L22:
                oq.u.b(r6)
                x62.x r6 = x62.x.this
                xw.b r6 = r6.Y1()
                x62.c$f$a r2 = x62.c.f.a.f216996a
                r5.f217099f = r0
                r5.f217098e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L38
                goto L54
            L38:
                boolean r6 = r0.getShowAppRating()
                if (r6 == 0) goto L55
                x62.x r6 = x62.x.this
                f01.b r6 = x62.x.q9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f217099f = r0
                r5.f217098e = r3
                java.lang.Object r6 = r6.c(r2, r5)
                if (r6 != r1) goto L55
            L54:
                return r1
            L55:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: x62.x.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.Back back, x62.d dVar, tq.e<? super i0> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f217099f = back;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx62/c$k;", "<unused var>", "Lx62/d;", "Loq/i0;", "<anonymous>", "(Lx62/c$k;Lx62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<x62.c.k, x62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217101e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f217101e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x62.c.f> bVarY1 = x.this.Y1();
                x62.c.f.d dVar = x62.c.f.d.f216999a;
                this.f217101e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(x62.c.k kVar, x62.d dVar, tq.e<? super i0> eVar) {
            return x.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lx62/c$h;", "<unused var>", "Lk10/c0;", "Lx62/d;", "state", "Lk10/l;", "<anonymous>", "(Lx62/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<x62.c.h, k10.c0<x62.d>, tq.e<? super k10.l<? extends x62.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217104f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x62.d.a O(x62.d dVar) {
            return x62.d.a.f217006a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f217104f;
            uq.b.e();
            if (this.f217103e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: x62.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.O((d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.h hVar, k10.c0<x62.d> c0Var, tq.e<? super k10.l<? extends x62.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f217104f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx62/c$e;", "action", "Lx62/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx62/c$e;Lx62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<x62.c.GetNewPagingData, x62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f217105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f217106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f217107g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x xVar;
            x62.c.GetNewPagingData getNewPagingData = (x62.c.GetNewPagingData) this.f217107g;
            Object objE = uq.b.e();
            int i15 = this.f217106f;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar2 = x.this;
                ou0.a paymentStatus = getNewPagingData.getPaymentStatus();
                this.f217107g = vq.j.a(getNewPagingData);
                this.f217105e = xVar2;
                this.f217106f = 1;
                Object objU9 = xVar2.u9(paymentStatus, this);
                if (objU9 == objE) {
                    return objE;
                }
                xVar = xVar2;
                obj = objU9;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar = (x) this.f217105e;
                oq.u.b(obj);
            }
            xVar.A9(ja.d.a((mu.g) obj, u0.a(x.this)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.GetNewPagingData getNewPagingData, x62.d dVar, tq.e<? super i0> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f217107g = getNewPagingData;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx62/c$c;", "action", "Lx62/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx62/c$c;Lx62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<x62.c.CustomError, x62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217110f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x62.c.CustomError customError = (x62.c.CustomError) this.f217110f;
            uq.b.e();
            if (this.f217109e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (customError.getDomainError() instanceof dx.b.g.c) {
                x.this.d9(x62.c.h.f217001a);
            } else {
                x.this.d9(new x62.c.GenericError(customError.getDomainError()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.CustomError customError, x62.d dVar, tq.e<? super i0> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f217110f = customError;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx62/c$d;", "action", "Lx62/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx62/c$d;Lx62/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<x62.c.GenericError, x62.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217113f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(x xVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    xVar.d9(new x62.c.Back(false));
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    xVar.d9(x62.c.g.f217000a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x62.c.GenericError genericError = (x62.c.GenericError) this.f217113f;
            Object objE = uq.b.e();
            int i15 = this.f217112e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x62.c.f> bVarY1 = x.this.Y1();
                ib4.c cVar = x.this.genericDomainErrorMapper;
                dx.b domainError = genericError.getDomainError();
                final x xVar = x.this;
                x62.c.f.GenericError genericError2 = new x62.c.f.GenericError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: x62.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.j.O(xVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f217113f = vq.j.a(genericError);
                this.f217112e = 1;
                if (bVarY1.F(genericError2, this) == objE) {
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
        public final Object w(x62.c.GenericError genericError, x62.d dVar, tq.e<? super i0> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f217113f = genericError;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx62/d$b;", "it", "Loq/i0;", "<anonymous>", "(Lx62/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<x62.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217115e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f217115e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(x62.c.g.f217000a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(x62.d.b bVar, tq.e<? super i0> eVar) {
            return ((k) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return x.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx62/c$g;", "<unused var>", "Lk10/c0;", "Lx62/d$b;", "state", "Lk10/l;", "Lx62/d;", "<anonymous>", "(Lx62/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<x62.c.g, k10.c0<x62.d.b>, tq.e<? super k10.l<? extends x62.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217118f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x62.d.Initialized O(x62.d.b bVar) {
            return new x62.d.Initialized(ou0.a.NOT_PAID);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f217118f;
            uq.b.e();
            if (this.f217117e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(new x62.c.GetNewPagingData(ou0.a.NOT_PAID));
            return c0Var.d(new er.l() { // from class: x62.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.O((d.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.g gVar, k10.c0<x62.d.b> c0Var, tq.e<? super k10.l<? extends x62.d>> eVar) {
            l lVar = x.this.new l(eVar);
            lVar.f217118f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lx62/c$b;", "action", "Lk10/c0;", "Lx62/d$c;", "state", "Lk10/l;", "Lx62/d;", "<anonymous>", "(Lx62/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<x62.c.ChangePaymentStatus, k10.c0<x62.d.Initialized>, tq.e<? super k10.l<? extends x62.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f217122g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x62.d.Initialized O(x62.c.ChangePaymentStatus changePaymentStatus, x62.d.Initialized initialized) {
            return initialized.a(changePaymentStatus.getPaymentStatus());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final x62.c.ChangePaymentStatus changePaymentStatus = (x62.c.ChangePaymentStatus) this.f217121f;
            k10.c0 c0Var = (k10.c0) this.f217122g;
            uq.b.e();
            if (this.f217120e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(new x62.c.GetNewPagingData(changePaymentStatus.getPaymentStatus()));
            return c0Var.b(new er.l() { // from class: x62.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.m.O(changePaymentStatus, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.ChangePaymentStatus changePaymentStatus, k10.c0<x62.d.Initialized> c0Var, tq.e<? super k10.l<? extends x62.d>> eVar) {
            m mVar = x.this.new m(eVar);
            mVar.f217121f = changePaymentStatus;
            mVar.f217122g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx62/c$g;", "<unused var>", "Lx62/d$c;", "state", "Loq/i0;", "<anonymous>", "(Lx62/c$g;Lx62/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<x62.c.g, x62.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217124e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217125f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x62.d.Initialized initialized = (x62.d.Initialized) this.f217125f;
            uq.b.e();
            if (this.f217124e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(new x62.c.ChangePaymentStatus(initialized.getPaymentStatus()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.g gVar, x62.d.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = x.this.new n(eVar);
            nVar.f217125f = initialized;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx62/c$j;", "action", "Lx62/d$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx62/c$j;Lx62/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<x62.c.ToDetails, x62.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217128f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x62.c.ToDetails toDetails = (x62.c.ToDetails) this.f217128f;
            Object objE = uq.b.e();
            int i15 = this.f217127e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x62.c.f> bVarY1 = x.this.Y1();
                x62.c.f.ToDetails toDetails2 = new x62.c.f.ToDetails(new TicketDetailsDestinationParams(toDetails.getPaymentStatus(), toDetails.getTicket()));
                this.f217128f = vq.j.a(toDetails);
                this.f217127e = 1;
                if (bVarY1.F(toDetails2, this) == objE) {
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
        public final Object w(x62.c.ToDetails toDetails, x62.d.Initialized initialized, tq.e<? super i0> eVar) {
            o oVar = x.this.new o(eVar);
            oVar.f217128f = toDetails;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx62/c$i;", "action", "Lx62/d$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx62/c$i;Lx62/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<x62.c.SwitchItemChanged, x62.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217131f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f217133a;

            static {
                int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
                try {
                    iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f217133a = iArr;
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ou0.a aVar;
            x62.c.SwitchItemChanged switchItemChanged = (x62.c.SwitchItemChanged) this.f217131f;
            uq.b.e();
            if (this.f217130e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x xVar = x.this;
            int i15 = a.f217133a[switchItemChanged.getControllerSwitchType().ordinal()];
            if (i15 == 1) {
                aVar = ou0.a.NOT_PAID;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                aVar = ou0.a.PAID;
            }
            xVar.d9(new x62.c.ChangePaymentStatus(aVar));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x62.c.SwitchItemChanged switchItemChanged, x62.d.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = x.this.new p(eVar);
            pVar.f217131f = switchItemChanged;
            return pVar.J(i0.f148189a);
        }
    }

    public x(yy.a aVar, pu0.a aVar2, f01.b bVar, y62.d dVar, ib4.c cVar, y62.a aVar3) {
        this.getTicketsUseCase = aVar2;
        this.launchNativeRatingUC = bVar;
        this.mapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.ticketPagingMapper = aVar3;
        x62.d.b bVar2 = x62.d.b.f217007a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: x62.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(this.f217044a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.ticketPagingDataFlow = mu.i.v();
        this.state = a9(new d(e9().getState(), this), y9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(x62.d.class), new er.l() { // from class: x62.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f217045a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(x62.d.b.class), new er.l() { // from class: x62.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9(this.f217046a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(x62.d.Initialized.class), new er.l() { // from class: x62.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.F9(this.f217047a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(x xVar, k10.z zVar) {
        e eVar = xVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(x62.c.Back.class), oVar, eVar);
        zVar.x(q0.c(x62.c.k.class), oVar, xVar.new f(null));
        zVar.v(q0.c(x62.c.h.class), oVar, new g(null));
        zVar.x(q0.c(x62.c.GetNewPagingData.class), oVar, xVar.new h(null));
        zVar.x(q0.c(x62.c.CustomError.class), oVar, xVar.new i(null));
        zVar.x(q0.c(x62.c.GenericError.class), oVar, xVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(x xVar, k10.z zVar) {
        zVar.C(xVar.new k(null));
        l lVar = xVar.new l(null);
        zVar.v(q0.c(x62.c.g.class), k10.o.CANCEL_PREVIOUS, lVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(x xVar, k10.z zVar) {
        m mVar = xVar.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(x62.c.ChangePaymentStatus.class), oVar, mVar);
        zVar.x(q0.c(x62.c.g.class), oVar, xVar.new n(null));
        zVar.x(q0.c(x62.c.ToDetails.class), oVar, xVar.new o(null));
        zVar.x(q0.c(x62.c.SwitchItemChanged.class), oVar, xVar.new p(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u9(final ou0.a aVar, tq.e<? super mu.g<n0<z62.a>>> eVar) {
        return new b(new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: x62.v
            @Override // er.a
            public final Object a() {
                return x.v9(this.f217049a, aVar);
            }
        }, 2, null).a(), this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 v9(x xVar, ou0.a aVar) {
        return xVar.new c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<z62.a> w9(n0<Ticket> pagingSourceData, ou0.a status) {
        return this.ticketPagingMapper.b(new y62.a.Params(pagingSourceData, status, b9(new x62.c.Back(false, 1, null)), new er.p() { // from class: x62.w
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return x.x9(this.f217051a, (ou0.a) obj, (Ticket) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(x xVar, ou0.a aVar, Ticket ticket) {
        xVar.d9(new x62.c.ToDetails(aVar, ticket));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x62.e.a y9(x62.d state) {
        return this.mapper.b(new y62.d.Params(state, b9(new x62.c.Back(false, 1, null)), b9(x62.c.k.f217005a), new er.l() { // from class: x62.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.z9(this.f217048a, (y30.n.Switch.EnumC5973b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(x xVar, y30.n.Switch.EnumC5973b enumC5973b) {
        xVar.d9(new x62.c.SwitchItemChanged(enumC5973b));
        return i0.f148189a;
    }

    public void A9(mu.g<n0<z62.a>> gVar) {
        this.ticketPagingDataFlow = gVar;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<x62.c.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<x62.d, x62.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<x62.e.a> getState() {
        return this.state;
    }

    @Override // x62.e
    public mu.g<n0<z62.a>> y1() {
        return this.ticketPagingDataFlow;
    }
}
