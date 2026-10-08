package f03;

import bh0.RegisteredAddress;
import bh0.RegisteredAddressDetails;
import bh0.TimelineEvent;
import fr.q0;
import h03.HistoryItem;
import h03.HistoryPayload;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BY\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020+H\u0096\u0001¢\u0006\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR&\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030M8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010Z¨\u0006\\"}, d2 = {"Lf03/u;", "Ll00/g;", "Lf03/j;", "Lf03/i;", "Lf03/k;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "snackBarManagerStateHolder", "La14/w;", "openUrlIntentUseCase", "Lch0/e;", "getRegisteredAddressDetailsUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lg03/e;", "mapper", "Lib4/c;", "errorMapper", "Ld03/b;", "isRegisteredAddressOutdatedUC", "Ld03/c;", "shouldDisplayOutdatedAlert", "Ld03/a;", "blockDisplayOutdatedAlert", "<init>", "(Lyy/a;Li70/n;La14/w;Lch0/e;Lac4/a;Lg03/e;Lib4/c;Ld03/b;Ld03/c;Ld03/a;)V", "state", "Lf03/k$a;", "D9", "(Lf03/j;)Lf03/k$a;", "Lk10/c0;", "Lk10/l;", "z9", "(Lk10/c0;)Lk10/l;", "Ldx/b;", "domainError", "Ljb4/b;", "B9", "(Ldx/b;)Ljb4/b;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Li70/n;", "c", "La14/w;", "d", "Lch0/e;", "e", "Lac4/a;", "f", "Lg03/e;", "g", "Lib4/c;", "h", "Ld03/b;", "j", "Ld03/c;", "k", "Ld03/a;", "Lxw/b;", "Lf03/i$d;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lf03/j$b;", "m", "Lf03/j$b;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<j, i> implements k, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ch0.e getRegisteredAddressDetailsUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g03.e mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d03.b isRegisteredAddressOutdatedUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d03.c shouldDisplayOutdatedAlert;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d03.a blockDisplayOutdatedAlert;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final j.b initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<j, i> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f54649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f54650b;

        /* JADX INFO: renamed from: f03.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1294a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f54651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f54652b;

            /* JADX INFO: renamed from: f03.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1295a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f54653d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f54654e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f54655f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f54657h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f54658j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f54659k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f54660l;

                public C1295a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f54653d = obj;
                    this.f54654e |= PKIFailureInfo.systemUnavail;
                    return C1294a.this.F(null, this);
                }
            }

            public C1294a(mu.h hVar, u uVar) {
                this.f54651a = hVar;
                this.f54652b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1295a c1295a;
                if (eVar instanceof C1295a) {
                    c1295a = (C1295a) eVar;
                    int i15 = c1295a.f54654e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1295a.f54654e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1295a = new C1295a(eVar);
                    }
                } else {
                    c1295a = new C1295a(eVar);
                }
                Object obj2 = c1295a.f54653d;
                Object objE = uq.b.e();
                int i16 = c1295a.f54654e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f54651a;
                    k.a aVarD9 = this.f54652b.D9((j) obj);
                    c1295a.f54655f = vq.j.a(obj);
                    c1295a.f54657h = vq.j.a(c1295a);
                    c1295a.f54658j = vq.j.a(obj);
                    c1295a.f54659k = vq.j.a(hVar);
                    c1295a.f54660l = 0;
                    c1295a.f54654e = 1;
                    if (hVar.F(aVarD9, c1295a) == objE) {
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
            this.f54649a = gVar;
            this.f54650b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k.a> hVar, tq.e eVar) {
            Object objA = this.f54649a.a(new C1294a(hVar, this.f54650b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf03/i$d;", "action", "Lk10/c0;", "Lf03/j;", "state", "Lk10/l;", "<anonymous>", "(Lf03/i$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i.d, c0<j>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f54663g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i.d dVar = (i.d) this.f54662f;
            c0 c0Var = (c0) this.f54663g;
            Object objE = uq.b.e();
            int i15 = this.f54661e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<i.d> bVarY1 = u.this.Y1();
                this.f54662f = vq.j.a(dVar);
                this.f54663g = c0Var;
                this.f54661e = 1;
                if (bVarY1.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return u.this.z9(c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i.d dVar, c0<j> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f54662f = dVar;
            bVar.f54663g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf03/i$e;", "action", "Lf03/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf03/i$e;Lf03/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<i.OpenUrl, j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54666f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i.OpenUrl openUrl = (i.OpenUrl) this.f54666f;
            Object objE = uq.b.e();
            int i15 = this.f54665e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f54666f = vq.j.a(openUrl);
                this.f54665e = 1;
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i.OpenUrl openUrl, j jVar, tq.e<? super i0> eVar) {
            c cVar = u.this.new c(eVar);
            cVar.f54666f = openUrl;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf03/j$b;", "it", "Loq/i0;", "<anonymous>", "(Lf03/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<j.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54668e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f54668e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(i.c.f54599a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(j.b bVar, tq.e<? super i0> eVar) {
            return ((d) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf03/i$c;", "<unused var>", "Lk10/c0;", "Lf03/j$b;", "state", "Lk10/l;", "Lf03/j;", "<anonymous>", "(Lf03/i$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<i.c, c0<j.b>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54671f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lf03/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends j>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f54673e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f54674f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f54675g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f54676h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f54677j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f54678k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f54679l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f54680m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f54681n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ u f54682p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ c0<j.b> f54683q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, c0<j.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f54682p = uVar;
                this.f54683q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final j.Empty X(RegisteredAddressDetails registeredAddressDetails, j.b bVar) {
                return new j.Empty(registeredAddressDetails);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final j.Initialized Y(RegisteredAddressDetails registeredAddressDetails, boolean z15, boolean z16, j.b bVar) {
                return new j.Initialized(z15, z16, registeredAddressDetails, registeredAddressDetails.getPermanentAddress(), y30.n.Switch.EnumC5973b.LEFT, false, 32, null);
            }

            /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
            /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
            /* JADX WARN: Code duplicated, block: B:42:0x011a  */
            /* JADX WARN: Code duplicated, block: B:46:0x0126  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v13 */
            /* JADX WARN: Type inference failed for: r14v23, types: [int] */
            /* JADX WARN: Type inference failed for: r14v38 */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                u uVar;
                c0<j.b> c0Var;
                final RegisteredAddressDetails registeredAddressDetails;
                ?? r15;
                int i15;
                final RegisteredAddressDetails registeredAddressDetails2;
                int i16;
                int i17;
                int i18;
                Object objA;
                ?? r16;
                c0<j.b> c0Var2;
                Boolean bool;
                boolean zBooleanValue;
                Object objE = uq.b.e();
                int i19 = this.f54681n;
                if (i19 == 0) {
                    oq.u.b(obj);
                    ch0.e eVar = this.f54682p.getRegisteredAddressDetailsUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f54681n = 1;
                    obj = eVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i19 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i19 == 2) {
                        i17 = this.f54679l;
                        i18 = this.f54678k;
                        registeredAddressDetails = (RegisteredAddressDetails) this.f54676h;
                        uVar = (u) this.f54675g;
                        c0Var = (c0) this.f54674f;
                        iVar = (dx.i) this.f54673e;
                        oq.u.b(obj);
                        bool = (Boolean) ((dx.i) obj).a();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        int i25 = i18;
                        i15 = i17;
                        registeredAddressDetails2 = registeredAddressDetails;
                        i16 = i25;
                        r15 = zBooleanValue;
                        d03.c cVar = uVar.shouldDisplayOutdatedAlert;
                        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                        this.f54673e = vq.j.a(iVar);
                        this.f54674f = c0Var;
                        this.f54675g = registeredAddressDetails2;
                        this.f54676h = null;
                        this.f54677j = null;
                        this.f54678k = i16;
                        this.f54679l = i15;
                        this.f54680m = r15;
                        this.f54681n = 3;
                        objA = cVar.a(c1792a2, this);
                        if (objA != objE) {
                            r16 = r15;
                            obj = objA;
                            c0Var2 = c0Var;
                        }
                        return objE;
                    }
                    if (i19 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i26 = this.f54680m;
                    registeredAddressDetails2 = (RegisteredAddressDetails) this.f54675g;
                    c0Var2 = (c0) this.f54674f;
                    oq.u.b(obj);
                    r16 = i26;
                }
                final boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                final boolean z15 = r16 != 0;
                return c0Var2.d(new er.l() { // from class: f03.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.e.a.Y(registeredAddressDetails2, z15, zBooleanValue2, (j.b) obj2);
                    }
                });
                iVar = (dx.i) obj;
                uVar = this.f54682p;
                c0Var = this.f54683q;
                if (iVar instanceof dx.i.Left) {
                    uVar.d9(new i.d.Error(uVar.B9((dx.b) ((dx.i.Left) iVar).b())));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                registeredAddressDetails = (RegisteredAddressDetails) ((dx.i.Right) iVar).b();
                if (registeredAddressDetails.getTemporaryAddress() == null && registeredAddressDetails.getPermanentAddress() == null) {
                    return c0Var.d(new er.l() { // from class: f03.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.e.a.X(registeredAddressDetails, (j.b) obj2);
                        }
                    });
                }
                RegisteredAddress permanentAddress = registeredAddressDetails.getPermanentAddress();
                if (permanentAddress != null) {
                    d03.b bVar = uVar.isRegisteredAddressOutdatedUC;
                    d03.b.Params params = new d03.b.Params(permanentAddress);
                    this.f54673e = vq.j.a(iVar);
                    this.f54674f = c0Var;
                    this.f54675g = uVar;
                    this.f54676h = registeredAddressDetails;
                    this.f54677j = vq.j.a(permanentAddress);
                    this.f54678k = 0;
                    this.f54679l = 0;
                    this.f54680m = 0;
                    this.f54681n = 2;
                    obj = bVar.e(params, this);
                    if (obj != objE) {
                        i17 = 0;
                        i18 = 0;
                        bool = (Boolean) ((dx.i) obj).a();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        int i27 = i18;
                        i15 = i17;
                        registeredAddressDetails2 = registeredAddressDetails;
                        i16 = i27;
                        r15 = zBooleanValue;
                        d03.c cVar2 = uVar.shouldDisplayOutdatedAlert;
                        gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                        this.f54673e = vq.j.a(iVar);
                        this.f54674f = c0Var;
                        this.f54675g = registeredAddressDetails2;
                        this.f54676h = null;
                        this.f54677j = null;
                        this.f54678k = i16;
                        this.f54679l = i15;
                        this.f54680m = r15;
                        this.f54681n = 3;
                        objA = cVar2.a(c1792a3, this);
                        if (objA != objE) {
                            r16 = r15;
                            obj = objA;
                            c0Var2 = c0Var;
                            final boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                            if (r16 != 0) {
                            }
                            return c0Var2.d(new er.l() { // from class: f03.w
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return u.e.a.Y(registeredAddressDetails2, z15, zBooleanValue3, (j.b) obj2);
                                }
                            });
                        }
                    }
                } else {
                    r15 = 0;
                    i15 = 0;
                    registeredAddressDetails2 = registeredAddressDetails;
                    i16 = 0;
                    d03.c cVar3 = uVar.shouldDisplayOutdatedAlert;
                    gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                    this.f54673e = vq.j.a(iVar);
                    this.f54674f = c0Var;
                    this.f54675g = registeredAddressDetails2;
                    this.f54676h = null;
                    this.f54677j = null;
                    this.f54678k = i16;
                    this.f54679l = i15;
                    this.f54680m = r15;
                    this.f54681n = 3;
                    objA = cVar3.a(c1792a4, this);
                    if (objA != objE) {
                        r16 = r15;
                        obj = objA;
                        c0Var2 = c0Var;
                        final boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        if (r16 != 0) {
                        }
                        return c0Var2.d(new er.l() { // from class: f03.w
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.e.a.Y(registeredAddressDetails2, z15, zBooleanValue4, (j.b) obj2);
                            }
                        });
                    }
                }
                return objE;
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f54682p, this.f54683q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends j>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f54671f;
            Object objE = uq.b.e();
            int i15 = this.f54670e;
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
            this.f54671f = vq.j.a(c0Var);
            this.f54670e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i.c cVar, c0<j.b> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f54671f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf03/i$a;", "action", "Lk10/c0;", "Lf03/j$c;", "state", "Lk10/l;", "Lf03/j;", "<anonymous>", "(Lf03/i$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i.ChangeSwitchItem, c0<j.Initialized>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f54686g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f54687a;

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
                f54687a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Initialized O(i.ChangeSwitchItem changeSwitchItem, c0 c0Var, j.Initialized initialized) {
            RegisteredAddress permanentAddress;
            y30.n.Switch.EnumC5973b item = changeSwitchItem.getItem();
            int i15 = a.f54687a[changeSwitchItem.getItem().ordinal()];
            if (i15 == 1) {
                permanentAddress = ((j.Initialized) c0Var.a()).getAddressDetails().getPermanentAddress();
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                permanentAddress = ((j.Initialized) c0Var.a()).getAddressDetails().getTemporaryAddress();
            }
            return j.Initialized.b(initialized, false, false, null, permanentAddress, item, true, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final i.ChangeSwitchItem changeSwitchItem = (i.ChangeSwitchItem) this.f54685f;
            final c0 c0Var = (c0) this.f54686g;
            uq.b.e();
            if (this.f54684e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: f03.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(changeSwitchItem, c0Var, (j.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i.ChangeSwitchItem changeSwitchItem, c0<j.Initialized> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            f fVar = new f(eVar);
            fVar.f54685f = changeSwitchItem;
            fVar.f54686g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf03/i$b;", "<unused var>", "Lk10/c0;", "Lf03/j$c;", "state", "Lk10/l;", "Lf03/j;", "<anonymous>", "(Lf03/i$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<i.b, c0<j.Initialized>, tq.e<? super k10.l<? extends j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54689f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j.Initialized O(boolean z15, j.Initialized initialized) {
            return j.Initialized.b(initialized, false, z15, null, null, null, false, 61, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r6 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f54689f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f54688e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L4b
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
                f03.u r6 = f03.u.this
                d03.a r6 = f03.u.r9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f54689f = r0
                r5.f54688e = r4
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L38
                goto L4a
            L38:
                f03.u r6 = f03.u.this
                d03.c r6 = f03.u.v9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f54689f = r0
                r5.f54688e = r3
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                f03.y r1 = new f03.y
                r1.<init>()
                k10.l r6 = r0.b(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f03.u.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i.b bVar, c0<j.Initialized> c0Var, tq.e<? super k10.l<? extends j>> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f54689f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, i70.n nVar, a14.w wVar, ch0.e eVar, ac4.a aVar2, g03.e eVar2, ib4.c cVar, d03.b bVar, d03.c cVar2, d03.a aVar3) {
        this.snackBarManagerStateHolder = nVar;
        this.openUrlIntentUseCase = wVar;
        this.getRegisteredAddressDetailsUC = eVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.mapper = eVar2;
        this.errorMapper = cVar;
        this.isRegisteredAddressOutdatedUC = bVar;
        this.shouldDisplayOutdatedAlert = cVar2;
        this.blockDisplayOutdatedAlert = aVar3;
        j.b bVar2 = j.b.f54606a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: f03.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.I9(this.f54627a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), D9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j A9(j jVar, j jVar2) {
        return j.Initialized.b((j.Initialized) jVar, false, false, null, null, null, false, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b B9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: f03.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.C9(this.f54635a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(u uVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            uVar.d9(i.d.a.f54600a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            uVar.d9(i.c.f54599a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.a D9(j state) {
        return this.mapper.b(new g03.e.Params(state, b9(i.d.a.f54600a), new er.l() { // from class: f03.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f54631a, (RegisteredAddressDetails) obj);
            }
        }, b9(i.d.C1292d.f54603a), new er.l() { // from class: f03.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f54632a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, new er.l() { // from class: f03.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f54633a, (String) obj);
            }
        }, b9(i.b.f54598a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(u uVar, RegisteredAddressDetails registeredAddressDetails) {
        boolean dataIncomplete = registeredAddressDetails.getTimeline().getDataIncomplete();
        List<TimelineEvent> listB = registeredAddressDetails.getTimeline().b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        for (TimelineEvent timelineEvent : listB) {
            arrayList.add(new HistoryItem(timelineEvent.getPeriod(), timelineEvent.getType(), timelineEvent.getAddress()));
        }
        uVar.d9(new i.d.GoToAddressHistory(new HistoryPayload(dataIncomplete, arrayList)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(u uVar, y30.n.Switch.EnumC5973b enumC5973b) {
        uVar.d9(new i.ChangeSwitchItem(enumC5973b));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(u uVar, String str) {
        uVar.d9(new i.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(j.class), new er.l() { // from class: f03.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f54628a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(j.b.class), new er.l() { // from class: f03.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f54629a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(j.Initialized.class), new er.l() { // from class: f03.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f54630a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(i.d.class), oVar, bVar);
        zVar.x(q0.c(i.OpenUrl.class), oVar, uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, k10.z zVar) {
        zVar.C(uVar.new d(null));
        e eVar = uVar.new e(null);
        zVar.v(q0.c(i.c.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(i.ChangeSwitchItem.class), oVar, fVar);
        zVar.v(q0.c(i.b.class), oVar, uVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<j> z9(c0<j> state) {
        final j jVarA = state.a();
        return jVarA instanceof j.Initialized ? state.b(new er.l() { // from class: f03.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.A9(jVarA, (j) obj);
            }
        }) : state.c();
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<i.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<j, i> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
