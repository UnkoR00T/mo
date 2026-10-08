package gt2;

import bt2.PeselRestrictionHistoryChecksDetailsDestinationParams;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.time.LocalDate;
import mt2.PeselRestrictionHistoryFilterNavParams;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ts0.RestrictionCheck;
import ts0.RestrictionStatusChange;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001cBc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J;\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+J;\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR&\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030I8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR.\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010a\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lgt2/y;", "Ll00/g;", "Lgt2/d;", "Lgt2/c;", "Lgt2/e;", "", "Lyy/a;", "stateMachineFactory", "Lht2/c;", "mapper", "Lib4/c;", "genericDomainErrorHandler", "Lus0/g;", "getStatusChangesFirstPageUseCase", "Lus0/d;", "getChecksFirstPageUseCase", "Lus0/e;", "getChecksUseCase", "Lus0/h;", "getStatusChangesUseCase", "Lht2/d;", "peselRestrictionHistoryStatusChangesMapper", "Lht2/b;", "peselRestrictionHistoryChecksMapper", "Lvs2/a;", "peselRestrictionContainersInteractor", "Lmt2/b;", "setupData", "<init>", "(Lyy/a;Lht2/c;Lib4/c;Lus0/g;Lus0/d;Lus0/e;Lus0/h;Lht2/d;Lht2/b;Lvs2/a;Lmt2/b;)V", "state", "Lgt2/e$a;", "G9", "(Lgt2/d;)Lgt2/e$a;", "Ljava/time/LocalDate;", "dateFrom", "dateTo", "Liy/b0;", "userPesel", "Lmu/g;", "Lja/n0;", "Lit2/b;", "D9", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Liy/b0;)Lmu/g;", "A9", "data", "Loq/i0;", "K9", "(Lmt2/b;)V", "b", "Lht2/c;", "c", "Lib4/c;", "d", "Lus0/g;", "e", "Lus0/d;", "f", "Lus0/e;", "g", "Lus0/h;", "h", "Lht2/d;", "j", "Lht2/b;", "k", "Lvs2/a;", "l", "Lmt2/b;", "Lgt2/d$a;", "m", "Lgt2/d$a;", "initialState", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "p", "Lmu/g;", "A8", "()Lmu/g;", "J9", "(Lmu/g;)V", "checksPagingDataFlow", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lgt2/c$f;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "s", "a", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<gt2.d, gt2.c> implements gt2.e, zx.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f76837t = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ht2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final us0.g getStatusChangesFirstPageUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final us0.d getChecksFirstPageUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final us0.e getChecksUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final us0.h getStatusChangesUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ht2.d peselRestrictionHistoryStatusChangesMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ht2.b peselRestrictionHistoryChecksMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final vs2.a peselRestrictionContainersInteractor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private mt2.b setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final gt2.d.a initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<gt2.d, gt2.c> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private mu.g<n0<it2.b>> checksPagingDataFlow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<gt2.e.a> state;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gt2.c.f> navAction;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76854a;

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
            f76854a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<n0<it2.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f76855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f76856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iy.b0 f76857c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f76858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f76859b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iy.b0 f76860c;

            /* JADX INFO: renamed from: gt2.y$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1738a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f76861d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f76862e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f76863f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f76865h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f76866j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f76867k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f76868l;

                public C1738a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f76861d = obj;
                    this.f76862e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar, iy.b0 b0Var) {
                this.f76858a = hVar;
                this.f76859b = yVar;
                this.f76860c = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1738a c1738a;
                if (eVar instanceof C1738a) {
                    c1738a = (C1738a) eVar;
                    int i15 = c1738a.f76862e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1738a.f76862e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1738a = new C1738a(eVar);
                    }
                } else {
                    c1738a = new C1738a(eVar);
                }
                Object obj2 = c1738a.f76861d;
                Object objE = uq.b.e();
                int i16 = c1738a.f76862e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f76858a;
                    n0<it2.b> n0VarB = this.f76859b.peselRestrictionHistoryChecksMapper.b(new ht2.b.Params((n0) obj, this.f76860c, this.f76859b.new e()));
                    c1738a.f76863f = vq.j.a(obj);
                    c1738a.f76865h = vq.j.a(c1738a);
                    c1738a.f76866j = vq.j.a(obj);
                    c1738a.f76867k = vq.j.a(hVar);
                    c1738a.f76868l = 0;
                    c1738a.f76862e = 1;
                    if (hVar.F(n0VarB, c1738a) == objE) {
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

        public c(mu.g gVar, y yVar, iy.b0 b0Var) {
            this.f76855a = gVar;
            this.f76856b = yVar;
            this.f76857c = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<it2.b>> hVar, tq.e eVar) {
            Object objA = this.f76855a.a(new a(hVar, this.f76856b, this.f76857c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"gt2/y$d", "Lja/x0;", "", "Lts0/g;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/String;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends x0<String, RestrictionCheck> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalDate f76870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalDate f76871d;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f76872d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f76873e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f76874f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f76876h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f76874f = obj;
                this.f76876h |= PKIFailureInfo.systemUnavail;
                return d.this.g(null, this);
            }
        }

        d(LocalDate localDate, LocalDate localDate2) {
            this.f76870c = localDate;
            this.f76871d = localDate2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        
            if (r10 == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
        
            if (r10 == r1) goto L31;
         */
        @Override // ja.x0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(ja.x0.a<java.lang.String> r9, tq.e<? super ja.x0.b<java.lang.String, ts0.RestrictionCheck>> r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gt2.y.d.g(ja.x0$a, tq.e):java.lang.Object");
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String d(PagingState<String, RestrictionCheck> state) {
            x0.b.C2395b<String, RestrictionCheck> c2395bC;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition == null || (c2395bC = state.c(anchorPosition.intValue())) == null) {
                return null;
            }
            return c2395bC.h();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<RestrictionCheck, i0> {
        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(RestrictionCheck restrictionCheck) {
            c(restrictionCheck);
            return i0.f148189a;
        }

        public final void c(RestrictionCheck restrictionCheck) {
            y.this.d9(new gt2.c.ToRestrictionCheckDetails(restrictionCheck));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<n0<it2.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f76878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f76879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ iy.b0 f76880c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f76881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f76882b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ iy.b0 f76883c;

            /* JADX INFO: renamed from: gt2.y$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1739a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f76884d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f76885e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f76886f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f76888h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f76889j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f76890k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f76891l;

                public C1739a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f76884d = obj;
                    this.f76885e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar, iy.b0 b0Var) {
                this.f76881a = hVar;
                this.f76882b = yVar;
                this.f76883c = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1739a c1739a;
                if (eVar instanceof C1739a) {
                    c1739a = (C1739a) eVar;
                    int i15 = c1739a.f76885e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1739a.f76885e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1739a = new C1739a(eVar);
                    }
                } else {
                    c1739a = new C1739a(eVar);
                }
                Object obj2 = c1739a.f76884d;
                Object objE = uq.b.e();
                int i16 = c1739a.f76885e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f76881a;
                    n0<it2.b> n0VarB = this.f76882b.peselRestrictionHistoryStatusChangesMapper.b(new ht2.d.Params((n0) obj, this.f76883c));
                    c1739a.f76886f = vq.j.a(obj);
                    c1739a.f76888h = vq.j.a(c1739a);
                    c1739a.f76889j = vq.j.a(obj);
                    c1739a.f76890k = vq.j.a(hVar);
                    c1739a.f76891l = 0;
                    c1739a.f76885e = 1;
                    if (hVar.F(n0VarB, c1739a) == objE) {
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

        public f(mu.g gVar, y yVar, iy.b0 b0Var) {
            this.f76878a = gVar;
            this.f76879b = yVar;
            this.f76880c = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<it2.b>> hVar, tq.e eVar) {
            Object objA = this.f76878a.a(new a(hVar, this.f76879b, this.f76880c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"gt2/y$g", "Lja/x0;", "", "Lts0/m;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/String;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g extends x0<String, RestrictionStatusChange> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalDate f76893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalDate f76894d;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f76895d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f76896e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f76897f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f76899h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f76897f = obj;
                this.f76899h |= PKIFailureInfo.systemUnavail;
                return g.this.g(null, this);
            }
        }

        g(LocalDate localDate, LocalDate localDate2) {
            this.f76893c = localDate;
            this.f76894d = localDate2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        
            if (r10 == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
        
            if (r10 == r1) goto L31;
         */
        @Override // ja.x0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object g(ja.x0.a<java.lang.String> r9, tq.e<? super ja.x0.b<java.lang.String, ts0.RestrictionStatusChange>> r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gt2.y.g.g(ja.x0$a, tq.e):java.lang.Object");
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String d(PagingState<String, RestrictionStatusChange> state) {
            x0.b.C2395b<String, RestrictionStatusChange> c2395bC;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition == null || (c2395bC = state.c(anchorPosition.intValue())) == null) {
                return null;
            }
            return c2395bC.h();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements mu.g<gt2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f76900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f76901b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f76902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f76903b;

            /* JADX INFO: renamed from: gt2.y$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1740a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f76904d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f76905e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f76906f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f76908h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f76909j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f76910k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f76911l;

                public C1740a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f76904d = obj;
                    this.f76905e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar) {
                this.f76902a = hVar;
                this.f76903b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1740a c1740a;
                if (eVar instanceof C1740a) {
                    c1740a = (C1740a) eVar;
                    int i15 = c1740a.f76905e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1740a.f76905e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1740a = new C1740a(eVar);
                    }
                } else {
                    c1740a = new C1740a(eVar);
                }
                Object obj2 = c1740a.f76904d;
                Object objE = uq.b.e();
                int i16 = c1740a.f76905e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f76902a;
                    gt2.e.a aVarG9 = this.f76903b.G9((gt2.d) obj);
                    c1740a.f76906f = vq.j.a(obj);
                    c1740a.f76908h = vq.j.a(c1740a);
                    c1740a.f76909j = vq.j.a(obj);
                    c1740a.f76910k = vq.j.a(hVar);
                    c1740a.f76911l = 0;
                    c1740a.f76905e = 1;
                    if (hVar.F(aVarG9, c1740a) == objE) {
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

        public h(mu.g gVar, y yVar) {
            this.f76900a = gVar;
            this.f76901b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gt2.e.a> hVar, tq.e eVar) {
            Object objA = this.f76900a.a(new a(hVar, this.f76901b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgt2/c$b;", "action", "Lgt2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgt2/c$b;Lgt2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<gt2.c.Error, gt2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76913f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(y yVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    yVar.d9(gt2.c.a.f76763a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    yVar.d9(new gt2.c.OnRetryAction(null, 1, null));
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gt2.c.Error error = (gt2.c.Error) this.f76913f;
            Object objE = uq.b.e();
            int i15 = this.f76912e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gt2.c.f> bVarY1 = y.this.Y1();
                ib4.c cVar = y.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final y yVar = y.this;
                gt2.c.f.Error error2 = new gt2.c.f.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: gt2.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.i.O(yVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f76913f = vq.j.a(error);
                this.f76912e = 1;
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
        public final Object w(gt2.c.Error error, gt2.d dVar, tq.e<? super i0> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f76913f = error;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgt2/c$a;", "<unused var>", "Lgt2/d;", "Loq/i0;", "<anonymous>", "(Lgt2/c$a;Lgt2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<gt2.c.a, gt2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76915e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f76915e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gt2.c.f> bVarY1 = y.this.Y1();
                gt2.c.f.a aVar = gt2.c.f.a.f76770a;
                this.f76915e = 1;
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
        public final Object w(gt2.c.a aVar, gt2.d dVar, tq.e<? super i0> eVar) {
            return y.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgt2/c$i;", "action", "Lgt2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgt2/c$i;Lgt2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<gt2.c.Setup, gt2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76918f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gt2.c.Setup setup = (gt2.c.Setup) this.f76918f;
            uq.b.e();
            if (this.f76917e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            mt2.b peselRestrictionNavParams = setup.getPeselRestrictionNavParams();
            if (peselRestrictionNavParams instanceof mt2.b.FromFilter) {
                y.this.d9(new gt2.c.SetControllerStateAction(((mt2.b.FromFilter) setup.getPeselRestrictionNavParams()).getPeselRestrictionHistoryControllerState(), ((mt2.b.FromFilter) setup.getPeselRestrictionNavParams()).getFilterDateFrom(), ((mt2.b.FromFilter) setup.getPeselRestrictionNavParams()).getFilterDateTo()));
            } else {
                if (!(peselRestrictionNavParams instanceof mt2.b.FromRestrictionStatus)) {
                    throw new oq.p();
                }
                y.this.d9(new gt2.c.InitializeAction(((mt2.b.FromRestrictionStatus) setup.getPeselRestrictionNavParams()).getPeselRestrictionHistoryControllerState()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gt2.c.Setup setup, gt2.d dVar, tq.e<? super i0> eVar) {
            k kVar = y.this.new k(eVar);
            kVar.f76918f = setup;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgt2/c$e;", "action", "Lk10/c0;", "Lgt2/d$a;", "state", "Lk10/l;", "Lgt2/d;", "<anonymous>", "(Lgt2/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<gt2.c.InitializeAction, k10.c0<gt2.d.a>, tq.e<? super k10.l<? extends gt2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76922g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76924a;

            static {
                int[] iArr = new int[it2.a.values().length];
                try {
                    iArr[it2.a.CHECKS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[it2.a.STATUS_CHANGES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f76924a = iArr;
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gt2.d.Initialized V(y yVar, String str, gt2.c.InitializeAction initializeAction, gt2.d.a aVar) {
            yVar.J9(y.B9(yVar, null, null, iy.c0.g(str), 3, null));
            return new gt2.d.Initialized(initializeAction.getPeselRestrictionHistoryControllerState(), iy.c0.g(str), null, null, 12, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gt2.d.Initialized X(y yVar, String str, gt2.c.InitializeAction initializeAction, gt2.d.a aVar) {
            yVar.J9(y.E9(yVar, null, null, iy.c0.g(str), 3, null));
            return new gt2.d.Initialized(initializeAction.getPeselRestrictionHistoryControllerState(), iy.c0.g(str), null, null, 12, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gt2.c.InitializeAction initializeAction = (gt2.c.InitializeAction) this.f76921f;
            k10.c0 c0Var = (k10.c0) this.f76922g;
            Object objE = uq.b.e();
            int i15 = this.f76920e;
            if (i15 == 0) {
                oq.u.b(obj);
                vs2.a aVar = y.this.peselRestrictionContainersInteractor;
                this.f76921f = initializeAction;
                this.f76922g = c0Var;
                this.f76920e = 1;
                obj = aVar.f(this);
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
            final y yVar = y.this;
            if (iVar instanceof dx.i.Left) {
                yVar.d9(new gt2.c.Error((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final String str = (String) ((dx.i.Right) iVar).b();
            int i16 = a.f76924a[initializeAction.getPeselRestrictionHistoryControllerState().ordinal()];
            if (i16 == 1) {
                return c0Var.d(new er.l() { // from class: gt2.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.l.V(yVar, str, initializeAction, (d.a) obj2);
                    }
                });
            }
            if (i16 == 2) {
                return c0Var.d(new er.l() { // from class: gt2.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.l.X(yVar, str, initializeAction, (d.a) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(gt2.c.InitializeAction initializeAction, k10.c0<gt2.d.a> c0Var, tq.e<? super k10.l<? extends gt2.d>> eVar) {
            l lVar = y.this.new l(eVar);
            lVar.f76921f = initializeAction;
            lVar.f76922g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgt2/c$g;", "action", "Lgt2/d$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgt2/c$g;Lgt2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<gt2.c.OnRetryAction, gt2.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76926f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gt2.c.OnRetryAction onRetryAction = (gt2.c.OnRetryAction) this.f76926f;
            uq.b.e();
            if (this.f76925e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            it2.a peselRestrictionHistoryControllerState = onRetryAction.getPeselRestrictionHistoryControllerState();
            if (peselRestrictionHistoryControllerState != null) {
                y.this.d9(new gt2.c.InitializeAction(peselRestrictionHistoryControllerState));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gt2.c.OnRetryAction onRetryAction, gt2.d.a aVar, tq.e<? super i0> eVar) {
            m mVar = y.this.new m(eVar);
            mVar.f76926f = onRetryAction;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgt2/c$j;", "<unused var>", "Lgt2/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lgt2/c$j;Lgt2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<gt2.c.j, gt2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76929f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gt2.d.Initialized initialized = (gt2.d.Initialized) this.f76929f;
            Object objE = uq.b.e();
            int i15 = this.f76928e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gt2.c.f> bVarY1 = y.this.Y1();
                gt2.c.f.ToFilter toFilter = new gt2.c.f.ToFilter(new PeselRestrictionHistoryFilterNavParams(initialized.getPeselRestrictionHistoryControllerState(), initialized.getFilterDateFrom(), initialized.getFilterDateTo()));
                this.f76929f = vq.j.a(initialized);
                this.f76928e = 1;
                if (bVarY1.F(toFilter, this) == objE) {
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
        public final Object w(gt2.c.j jVar, gt2.d.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = y.this.new n(eVar);
            nVar.f76929f = initialized;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgt2/c$k;", "action", "Lgt2/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgt2/c$k;Lgt2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<gt2.c.ToRestrictionCheckDetails, gt2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76932f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gt2.c.ToRestrictionCheckDetails toRestrictionCheckDetails = (gt2.c.ToRestrictionCheckDetails) this.f76932f;
            Object objE = uq.b.e();
            int i15 = this.f76931e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gt2.c.f> bVarY1 = y.this.Y1();
                gt2.c.f.ToRestrictionCheckDetails toRestrictionCheckDetails2 = new gt2.c.f.ToRestrictionCheckDetails(new PeselRestrictionHistoryChecksDetailsDestinationParams(toRestrictionCheckDetails.getRestrictionCheck()));
                this.f76932f = vq.j.a(toRestrictionCheckDetails);
                this.f76931e = 1;
                if (bVarY1.F(toRestrictionCheckDetails2, this) == objE) {
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
        public final Object w(gt2.c.ToRestrictionCheckDetails toRestrictionCheckDetails, gt2.d.Initialized initialized, tq.e<? super i0> eVar) {
            o oVar = y.this.new o(eVar);
            oVar.f76932f = toRestrictionCheckDetails;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgt2/c$h;", "action", "Lgt2/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgt2/c$h;Lgt2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<gt2.c.SetControllerStateAction, gt2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76935f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76937a;

            static {
                int[] iArr = new int[it2.a.values().length];
                try {
                    iArr[it2.a.CHECKS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[it2.a.STATUS_CHANGES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f76937a = iArr;
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gt2.c.SetControllerStateAction setControllerStateAction = (gt2.c.SetControllerStateAction) this.f76935f;
            uq.b.e();
            if (this.f76934e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f76937a[setControllerStateAction.getPeselRestrictionHistoryControllerState().ordinal()];
            if (i15 == 1) {
                y.this.d9(new gt2.c.GetChecksAction(setControllerStateAction.getFilterDateFrom(), setControllerStateAction.getFilterDateTo()));
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                y.this.d9(new gt2.c.GetStatusChangesAction(setControllerStateAction.getFilterDateFrom(), setControllerStateAction.getFilterDateTo()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gt2.c.SetControllerStateAction setControllerStateAction, gt2.d.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = y.this.new p(eVar);
            pVar.f76935f = setControllerStateAction;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgt2/c$c;", "action", "Lk10/c0;", "Lgt2/d$b;", "state", "Lk10/l;", "Lgt2/d;", "<anonymous>", "(Lgt2/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<gt2.c.GetChecksAction, k10.c0<gt2.d.Initialized>, tq.e<? super k10.l<? extends gt2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76940g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gt2.d.Initialized O(y yVar, gt2.c.GetChecksAction getChecksAction, k10.c0 c0Var, gt2.d.Initialized initialized) {
            yVar.J9(yVar.A9(getChecksAction.getFilterDateFrom(), getChecksAction.getFilterDateTo(), ((gt2.d.Initialized) c0Var.a()).getUserPesel()));
            return gt2.d.Initialized.b(initialized, it2.a.CHECKS, null, getChecksAction.getFilterDateFrom(), getChecksAction.getFilterDateTo(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gt2.c.GetChecksAction getChecksAction = (gt2.c.GetChecksAction) this.f76939f;
            final k10.c0 c0Var = (k10.c0) this.f76940g;
            uq.b.e();
            if (this.f76938e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final y yVar = y.this;
            return c0Var.b(new er.l() { // from class: gt2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.q.O(yVar, getChecksAction, c0Var, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gt2.c.GetChecksAction getChecksAction, k10.c0<gt2.d.Initialized> c0Var, tq.e<? super k10.l<? extends gt2.d>> eVar) {
            q qVar = y.this.new q(eVar);
            qVar.f76939f = getChecksAction;
            qVar.f76940g = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgt2/c$d;", "action", "Lk10/c0;", "Lgt2/d$b;", "state", "Lk10/l;", "Lgt2/d;", "<anonymous>", "(Lgt2/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<gt2.c.GetStatusChangesAction, k10.c0<gt2.d.Initialized>, tq.e<? super k10.l<? extends gt2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76944g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gt2.d.Initialized O(y yVar, gt2.c.GetStatusChangesAction getStatusChangesAction, k10.c0 c0Var, gt2.d.Initialized initialized) {
            yVar.J9(yVar.D9(getStatusChangesAction.getFilterDateFrom(), getStatusChangesAction.getFilterDateTo(), ((gt2.d.Initialized) c0Var.a()).getUserPesel()));
            return gt2.d.Initialized.b(initialized, it2.a.STATUS_CHANGES, null, getStatusChangesAction.getFilterDateFrom(), getStatusChangesAction.getFilterDateTo(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gt2.c.GetStatusChangesAction getStatusChangesAction = (gt2.c.GetStatusChangesAction) this.f76943f;
            final k10.c0 c0Var = (k10.c0) this.f76944g;
            uq.b.e();
            if (this.f76942e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final y yVar = y.this;
            return c0Var.b(new er.l() { // from class: gt2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.r.O(yVar, getStatusChangesAction, c0Var, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gt2.c.GetStatusChangesAction getStatusChangesAction, k10.c0<gt2.d.Initialized> c0Var, tq.e<? super k10.l<? extends gt2.d>> eVar) {
            r rVar = y.this.new r(eVar);
            rVar.f76943f = getStatusChangesAction;
            rVar.f76944g = c0Var;
            return rVar.J(i0.f148189a);
        }
    }

    public y(yy.a aVar, ht2.c cVar, ib4.c cVar2, us0.g gVar, us0.d dVar, us0.e eVar, us0.h hVar, ht2.d dVar2, ht2.b bVar, vs2.a aVar2, mt2.b bVar2) {
        this.mapper = cVar;
        this.genericDomainErrorHandler = cVar2;
        this.getStatusChangesFirstPageUseCase = gVar;
        this.getChecksFirstPageUseCase = dVar;
        this.getChecksUseCase = eVar;
        this.getStatusChangesUseCase = hVar;
        this.peselRestrictionHistoryStatusChangesMapper = dVar2;
        this.peselRestrictionHistoryChecksMapper = bVar;
        this.peselRestrictionContainersInteractor = aVar2;
        this.setupData = bVar2;
        gt2.d.a aVar3 = gt2.d.a.f76784a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: gt2.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.L9(this.f76835a, (k10.v) obj);
            }
        });
        this.checksPagingDataFlow = mu.i.v();
        this.state = a9(new h(e9().getState(), this), G9(aVar3));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<it2.b>> A9(final LocalDate dateFrom, final LocalDate dateTo, iy.b0 userPesel) {
        return new c(new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: gt2.w
            @Override // er.a
            public final Object a() {
                return y.C9(this.f76832a, dateFrom, dateTo);
            }
        }, 2, null).a(), this, userPesel);
    }

    static /* synthetic */ mu.g B9(y yVar, LocalDate localDate, LocalDate localDate2, iy.b0 b0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            localDate = null;
        }
        if ((i15 & 2) != 0) {
            localDate2 = null;
        }
        return yVar.A9(localDate, localDate2, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 C9(y yVar, LocalDate localDate, LocalDate localDate2) {
        return yVar.new d(localDate, localDate2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<it2.b>> D9(final LocalDate dateFrom, final LocalDate dateTo, iy.b0 userPesel) {
        return new f(new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: gt2.v
            @Override // er.a
            public final Object a() {
                return y.F9(this.f76829a, dateFrom, dateTo);
            }
        }, 2, null).a(), this, userPesel);
    }

    static /* synthetic */ mu.g E9(y yVar, LocalDate localDate, LocalDate localDate2, iy.b0 b0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            localDate = null;
        }
        if ((i15 & 2) != 0) {
            localDate2 = null;
        }
        return yVar.D9(localDate, localDate2, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 F9(y yVar, LocalDate localDate, LocalDate localDate2) {
        return yVar.new g(localDate, localDate2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gt2.e.a G9(gt2.d state) {
        return this.mapper.b(new ht2.c.Params(state, b9(gt2.c.a.f76763a), new er.l() { // from class: gt2.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.H9(this.f76824a, (y30.n.Switch.EnumC5973b) obj);
            }
        }, b9(gt2.c.j.f76779a), new er.l() { // from class: gt2.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.I9(this.f76825a, (RestrictionCheck) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(y yVar, y30.n.Switch.EnumC5973b enumC5973b) {
        it2.a aVar;
        int i15 = b.f76854a[enumC5973b.ordinal()];
        if (i15 == 1) {
            aVar = it2.a.CHECKS;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            aVar = it2.a.STATUS_CHANGES;
        }
        yVar.d9(new gt2.c.SetControllerStateAction(aVar, null, null, 6, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(y yVar, RestrictionCheck restrictionCheck) {
        yVar.d9(new gt2.c.ToRestrictionCheckDetails(restrictionCheck));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(final y yVar, k10.v vVar) {
        vVar.c(q0.c(gt2.d.class), new er.l() { // from class: gt2.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.M9(this.f76826a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gt2.d.a.class), new er.l() { // from class: gt2.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.N9(this.f76827a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(gt2.d.Initialized.class), new er.l() { // from class: gt2.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.O9(this.f76828a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(y yVar, k10.z zVar) {
        i iVar = yVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gt2.c.Error.class), oVar, iVar);
        zVar.x(q0.c(gt2.c.a.class), oVar, yVar.new j(null));
        zVar.x(q0.c(gt2.c.Setup.class), oVar, yVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(y yVar, k10.z zVar) {
        l lVar = yVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(gt2.c.InitializeAction.class), oVar, lVar);
        zVar.x(q0.c(gt2.c.OnRetryAction.class), oVar, yVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(y yVar, k10.z zVar) {
        n nVar = yVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gt2.c.j.class), oVar, nVar);
        zVar.x(q0.c(gt2.c.ToRestrictionCheckDetails.class), oVar, yVar.new o(null));
        zVar.x(q0.c(gt2.c.SetControllerStateAction.class), oVar, yVar.new p(null));
        zVar.v(q0.c(gt2.c.GetChecksAction.class), oVar, yVar.new q(null));
        zVar.v(q0.c(gt2.c.GetStatusChangesAction.class), oVar, yVar.new r(null));
        return i0.f148189a;
    }

    @Override // gt2.e
    public mu.g<n0<it2.b>> A8() {
        return this.checksPagingDataFlow;
    }

    public void J9(mu.g<n0<it2.b>> gVar) {
        this.checksPagingDataFlow = gVar;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public void P5(mt2.b data) {
        this.setupData = data;
        d9(new gt2.c.Setup(data));
    }

    @Override // zx.b
    public xw.b<gt2.c.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<gt2.d, gt2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gt2.e.a> getState() {
        return this.state;
    }
}
