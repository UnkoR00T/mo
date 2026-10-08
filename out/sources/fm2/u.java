package fm2;

import androidx.p016lifecycle.u0;
import du0.ArticleSummary;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.List;
import k10.c0;
import mu.p0;
import n50.DefaultSingleCardData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001DB1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R.\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010<R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lfm2/u;", "Ll00/g;", "Lfm2/d;", "Lfm2/c;", "Lfm2/e;", "", "Lyy/a;", "stateMachineFactory", "Lfu0/b;", "beGetArticlesUC", "Lib4/c;", "genericDomainErrorHandler", "Lgm2/c;", "pagingMapper", "Lgm2/a;", "mapper", "<init>", "(Lyy/a;Lfu0/b;Lib4/c;Lgm2/c;Lgm2/a;)V", "state", "Lfm2/e$a;", "x9", "(Lfm2/d;)Lfm2/e$a;", "Lmu/g;", "Lja/n0;", "Ln50/g;", "t9", "()Lmu/g;", "Ldu0/e;", "pagingSourceData", "v9", "(Lja/n0;)Lja/n0;", "b", "Lfu0/b;", "c", "Lib4/c;", "d", "Lgm2/c;", "e", "Lgm2/a;", "Lfm2/d$a;", "f", "Lfm2/d$a;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lfm2/c$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "j", "Lmu/g;", "D5", "z9", "(Lmu/g;)V", "articlePagingDataFlow", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "l", "a", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<fm2.d, fm2.c> implements fm2.e, zx.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f65408m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fu0.b beGetArticlesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final gm2.c pagingMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final gm2.a mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final fm2.d.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<fm2.d, fm2.c> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fm2.c.InterfaceC1450c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private mu.g<n0<DefaultSingleCardData>> articlePagingDataFlow;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<fm2.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n0<DefaultSingleCardData>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f65418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f65419b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f65420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f65421b;

            /* JADX INFO: renamed from: fm2.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1453a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f65422d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f65423e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f65424f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f65426h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f65427j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f65428k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f65429l;

                public C1453a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f65422d = obj;
                    this.f65423e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f65420a = hVar;
                this.f65421b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1453a c1453a;
                if (eVar instanceof C1453a) {
                    c1453a = (C1453a) eVar;
                    int i15 = c1453a.f65423e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1453a.f65423e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1453a = new C1453a(eVar);
                    }
                } else {
                    c1453a = new C1453a(eVar);
                }
                Object obj2 = c1453a.f65422d;
                Object objE = uq.b.e();
                int i16 = c1453a.f65423e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f65420a;
                    n0 n0VarV9 = this.f65421b.v9((n0) obj);
                    c1453a.f65424f = vq.j.a(obj);
                    c1453a.f65426h = vq.j.a(c1453a);
                    c1453a.f65427j = vq.j.a(obj);
                    c1453a.f65428k = vq.j.a(hVar);
                    c1453a.f65429l = 0;
                    c1453a.f65423e = 1;
                    if (hVar.F(n0VarV9, c1453a) == objE) {
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

        public b(mu.g gVar, u uVar) {
            this.f65418a = gVar;
            this.f65419b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<DefaultSingleCardData>> hVar, tq.e eVar) {
            Object objA = this.f65418a.a(new a(hVar, this.f65419b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fm2/u$c", "Lja/x0;", "", "Ldu0/e;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends x0<Integer, ArticleSummary> {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f65431d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f65432e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f65433f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f65435h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f65433f = obj;
                this.f65435h |= PKIFailureInfo.systemUnavail;
                return c.this.g(null, this);
            }
        }

        c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ja.x0
        public Object g(x0.a<Integer> aVar, tq.e<? super x0.b<Integer, ArticleSummary>> eVar) throws Throwable {
            a aVar2;
            int i15;
            if (eVar instanceof a) {
                aVar2 = (a) eVar;
                int i16 = aVar2.f65435h;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f65435h = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object obj = aVar2.f65433f;
            Object objE = uq.b.e();
            int i17 = aVar2.f65435h;
            if (i17 == 0) {
                oq.u.b(obj);
                Integer numA = aVar.a();
                int iIntValue = numA != null ? numA.intValue() : 0;
                fu0.b bVar = u.this.beGetArticlesUC;
                fu0.b.Params params = new fu0.b.Params(iIntValue);
                aVar2.f65431d = vq.j.a(aVar);
                aVar2.f65432e = iIntValue;
                aVar2.f65435h = 1;
                Object objC = bVar.c(params, aVar2);
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
                i15 = aVar2.f65432e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.d9(new fm2.c.Error((dx.b) ((dx.i.Left) iVar).b()));
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
        public Integer d(PagingState<Integer, ArticleSummary> state) {
            Integer numH;
            int iIntValue;
            Integer numI;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition != null) {
                x0.b.C2395b<Integer, ArticleSummary> c2395bC = state.c(anchorPosition.intValue());
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
    public static final class d implements mu.g<fm2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f65436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f65437b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f65438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f65439b;

            /* JADX INFO: renamed from: fm2.u$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1454a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f65440d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f65441e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f65442f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f65444h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f65445j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f65446k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f65447l;

                public C1454a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f65440d = obj;
                    this.f65441e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f65438a = hVar;
                this.f65439b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1454a c1454a;
                if (eVar instanceof C1454a) {
                    c1454a = (C1454a) eVar;
                    int i15 = c1454a.f65441e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1454a.f65441e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1454a = new C1454a(eVar);
                    }
                } else {
                    c1454a = new C1454a(eVar);
                }
                Object obj2 = c1454a.f65440d;
                Object objE = uq.b.e();
                int i16 = c1454a.f65441e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f65438a;
                    fm2.e.a aVarX9 = this.f65439b.x9((fm2.d) obj);
                    c1454a.f65442f = vq.j.a(obj);
                    c1454a.f65444h = vq.j.a(c1454a);
                    c1454a.f65445j = vq.j.a(obj);
                    c1454a.f65446k = vq.j.a(hVar);
                    c1454a.f65447l = 0;
                    c1454a.f65441e = 1;
                    if (hVar.F(aVarX9, c1454a) == objE) {
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

        public d(mu.g gVar, u uVar) {
            this.f65436a = gVar;
            this.f65437b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fm2.e.a> hVar, tq.e eVar) {
            Object objA = this.f65436a.a(new a(hVar, this.f65437b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfm2/c$a;", "<unused var>", "Lfm2/d;", "Loq/i0;", "<anonymous>", "(Lfm2/c$a;Lfm2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fm2.c.a, fm2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65448e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f65448e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fm2.c.InterfaceC1450c> bVarY1 = u.this.Y1();
                fm2.c.InterfaceC1450c.a aVar = fm2.c.InterfaceC1450c.a.f65375a;
                this.f65448e = 1;
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
        public final Object w(fm2.c.a aVar, fm2.d dVar, tq.e<? super i0> eVar) {
            return u.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfm2/c$b;", "action", "Lfm2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfm2/c$b;Lfm2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fm2.c.Error, fm2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65451f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(u uVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    uVar.d9(fm2.c.a.f65373a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    uVar.d9(fm2.c.e.f65379a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fm2.c.Error error = (fm2.c.Error) this.f65451f;
            Object objE = uq.b.e();
            int i15 = this.f65450e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fm2.c.InterfaceC1450c> bVarY1 = u.this.Y1();
                ib4.c cVar = u.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final u uVar = u.this;
                fm2.c.InterfaceC1450c.Error error2 = new fm2.c.InterfaceC1450c.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: fm2.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.f.O(uVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f65451f = vq.j.a(error);
                this.f65450e = 1;
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
        public final Object w(fm2.c.Error error, fm2.d dVar, tq.e<? super i0> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f65451f = error;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfm2/c$e;", "<unused var>", "Lk10/c0;", "Lfm2/d;", "state", "Lk10/l;", "<anonymous>", "(Lfm2/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<fm2.c.e, c0<fm2.d>, tq.e<? super k10.l<? extends fm2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65454f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fm2.d.a O(fm2.d dVar) {
            return fm2.d.a.f65380a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f65454f;
            uq.b.e();
            if (this.f65453e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fm2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O((d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fm2.c.e eVar, c0<fm2.d> c0Var, tq.e<? super k10.l<? extends fm2.d>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f65454f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfm2/d$a;", "state", "Lk10/l;", "Lfm2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<c0<fm2.d.a>, tq.e<? super k10.l<? extends fm2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65456f;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fm2.d.b O(fm2.d.a aVar) {
            return fm2.d.b.f65381a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f65456f;
            uq.b.e();
            if (this.f65455e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u uVar = u.this;
            uVar.z9(ja.d.a(uVar.t9(), u0.a(u.this)));
            return c0Var.d(new er.l() { // from class: fm2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O((d.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<fm2.d.a> c0Var, tq.e<? super k10.l<? extends fm2.d>> eVar) {
            return ((h) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f65456f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfm2/c$d;", "action", "Lfm2/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfm2/c$d;Lfm2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fm2.c.ToDetails, fm2.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65459f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fm2.c.ToDetails toDetails = (fm2.c.ToDetails) this.f65459f;
            Object objE = uq.b.e();
            int i15 = this.f65458e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fm2.c.InterfaceC1450c> bVarY1 = u.this.Y1();
                fm2.c.InterfaceC1450c.ToDetails toDetails2 = new fm2.c.InterfaceC1450c.ToDetails(toDetails.getArticleId());
                this.f65459f = vq.j.a(toDetails);
                this.f65458e = 1;
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
        public final Object w(fm2.c.ToDetails toDetails, fm2.d.b bVar, tq.e<? super i0> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f65459f = toDetails;
            return iVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, fu0.b bVar, ib4.c cVar, gm2.c cVar2, gm2.a aVar2) {
        this.beGetArticlesUC = bVar;
        this.genericDomainErrorHandler = cVar;
        this.pagingMapper = cVar2;
        this.mapper = aVar2;
        fm2.d.a aVar3 = fm2.d.a.f65380a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: fm2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.B9(this.f65401a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.articlePagingDataFlow = mu.i.v();
        this.state = a9(new d(e9().getState(), this), x9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(fm2.d.class), new er.l() { // from class: fm2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.C9(this.f65402a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fm2.d.a.class), new er.l() { // from class: fm2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f65403a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fm2.d.b.class), new er.l() { // from class: fm2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f65404a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(u uVar, k10.z zVar) {
        e eVar = uVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fm2.c.a.class), oVar, eVar);
        zVar.x(q0.c(fm2.c.Error.class), oVar, uVar.new f(null));
        zVar.v(q0.c(fm2.c.e.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(u uVar, k10.z zVar) {
        zVar.A(uVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(u uVar, k10.z zVar) {
        i iVar = uVar.new i(null);
        zVar.x(q0.c(fm2.c.ToDetails.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<DefaultSingleCardData>> t9() {
        return new b(new l0(new m0(20, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: fm2.t
            @Override // er.a
            public final Object a() {
                return u.u9(this.f65406a);
            }
        }, 2, null).a(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 u9(u uVar) {
        return uVar.new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<DefaultSingleCardData> v9(n0<ArticleSummary> pagingSourceData) {
        return this.pagingMapper.b(new gm2.c.Params(pagingSourceData, b9(fm2.c.a.f65373a), new er.l() { // from class: fm2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.w9(this.f65400a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(u uVar, String str) {
        uVar.d9(new fm2.c.ToDetails(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fm2.e.a x9(fm2.d state) {
        return this.mapper.b(new gm2.a.Params(state, new er.l() { // from class: fm2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(this.f65405a, (String) obj);
            }
        }, b9(fm2.c.a.f65373a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(u uVar, String str) {
        uVar.d9(new fm2.c.ToDetails(str));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // fm2.e
    public mu.g<n0<DefaultSingleCardData>> D5() {
        return this.articlePagingDataFlow;
    }

    @Override // zx.b
    public xw.b<fm2.c.InterfaceC1450c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<fm2.d, fm2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fm2.e.a> getState() {
        return this.state;
    }

    public void z9(mu.g<n0<DefaultSingleCardData>> gVar) {
        this.articlePagingDataFlow = gVar;
    }
}
