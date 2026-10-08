package a52;

import androidx.p016lifecycle.u0;
import e52.CommitmentVariantEntryData;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.List;
import mu.p0;
import mu.r0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y52.StampDutyCommitmentTypeData;
import y52.StampDutyCommitmentVariantData;
import zr0.BECommitmentType;
import zr0.BEStampDutyAmount;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001MB;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R&\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"La52/x;", "Ll00/g;", "La52/b;", "La52/a;", "La52/c;", "", "Lyy/a;", "stateMachineFactory", "Lb52/c;", "mapper", "Lfs0/b;", "getCommitmentTypesUC", "Lib4/c;", "genericDomainErrorMapper", "Lb52/b;", "commitmentPagingItemMapper", "Lw52/a;", "commitmentTypesContract", "<init>", "(Lyy/a;Lb52/c;Lfs0/b;Lib4/c;Lb52/b;Lw52/a;)V", "state", "La52/c$a;", "D9", "(La52/b;)La52/c$a;", "", "commitmentTypeName", "Lmu/g;", "Lja/n0;", "Lzr0/a;", "A9", "(Ljava/lang/String;)Lmu/g;", "pagingSourceData", "Ln50/k;", "C9", "(Lja/n0;)Lja/n0;", "b", "Lb52/c;", "c", "Lfs0/b;", "d", "Lib4/c;", "e", "Lb52/b;", "f", "Lw52/a;", "Lxw/b;", "La52/a$j;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/b0;", "h", "Lmu/b0;", "_commitmentPagingData", "j", "Lmu/g;", "m6", "()Lmu/g;", "commitmentPagingData", "La52/b$a;", "k", "La52/b$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "n", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<a52.b, a52.a> implements a52.c, zx.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f3582n = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3583p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f3584q = gu.d.q(300, gu.e.MILLISECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b52.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fs0.b getCommitmentTypesUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b52.b commitmentPagingItemMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w52.a commitmentTypesContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a52.a.j> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<n0<BECommitmentType>> _commitmentPagingData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<n50.k>> commitmentPagingData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a52.b.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<a52.b, a52.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<a52.c.a> state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"La52/x$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "FIRST_PAGE_INDEX", "Lgu/b;", "DEFAULT_SEARCH_DEBOUNCE_DURATION", "J", "MIN_QUERY_CHAR_NUMBER", "MAX_QUERY_CHAR_NUMBER", "", "FORBIDDEN_QUERY_CHARS", "Ljava/lang/String;", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a52.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La52/x$a$a;", "", "<init>", "()V", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class C0060a extends Throwable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0060a f3596a = new C0060a();

            private C0060a() {
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"a52/x$b", "Lja/x0;", "", "Lzr0/a;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends x0<Integer, BECommitmentType> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3598c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f3599d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f3600e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f3601f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f3603h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f3601f = obj;
                this.f3603h |= PKIFailureInfo.systemUnavail;
                return b.this.g(null, this);
            }
        }

        b(String str) {
            this.f3598c = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ja.x0
        public Object g(x0.a<Integer> aVar, tq.e<? super x0.b<Integer, BECommitmentType>> eVar) throws Throwable {
            a aVar2;
            int i15;
            if (eVar instanceof a) {
                aVar2 = (a) eVar;
                int i16 = aVar2.f3603h;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f3603h = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object obj = aVar2.f3601f;
            Object objE = uq.b.e();
            int i17 = aVar2.f3603h;
            if (i17 == 0) {
                oq.u.b(obj);
                Integer numA = aVar.a();
                int iIntValue = numA != null ? numA.intValue() : 0;
                fs0.b bVar = x.this.getCommitmentTypesUC;
                fs0.b.Params params = new fs0.b.Params(this.f3598c, iIntValue);
                aVar2.f3599d = vq.j.a(aVar);
                aVar2.f3600e = iIntValue;
                aVar2.f3603h = 1;
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
                i15 = aVar2.f3600e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                xVar.d9(new a52.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                return new x0.b.a(new Throwable());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            if (list.isEmpty() && i15 == 0) {
                return new x0.b.C2395b(list, null, null);
            }
            return list.isEmpty() ? new x0.b.a(a.C0060a.f3596a) : new x0.b.C2395b(list, null, vq.b.e(i15 + 1));
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer d(PagingState<Integer, BECommitmentType> state) {
            Integer numH;
            int iIntValue;
            Integer numI;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition != null) {
                x0.b.C2395b<Integer, BECommitmentType> c2395bC = state.c(anchorPosition.intValue());
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzr0/a;", "commitmentType", "Ln50/k;", "<anonymous>", "(Lzr0/a;)Ln50/k;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<BECommitmentType, tq.e<? super n50.k>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3605f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(x xVar, BECommitmentType bECommitmentType) {
            xVar.d9(new a52.a.OnCommitmentTypeSelected(bECommitmentType));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BECommitmentType bECommitmentType = (BECommitmentType) this.f3605f;
            uq.b.e();
            if (this.f3604e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b52.b bVar = x.this.commitmentPagingItemMapper;
            final x xVar = x.this;
            return bVar.b(new b52.b.Params(bECommitmentType, new er.l() { // from class: a52.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.c.O(xVar, (BECommitmentType) obj2);
                }
            }));
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(BECommitmentType bECommitmentType, tq.e<? super n50.k> eVar) {
            return ((c) v(bECommitmentType, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = x.this.new c(eVar);
            cVar.f3605f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<n0<n50.k>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f3607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f3608b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f3609a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f3610b;

            /* JADX INFO: renamed from: a52.x$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0061a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f3611d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f3612e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f3613f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f3615h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f3616j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f3617k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f3618l;

                public C0061a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f3611d = obj;
                    this.f3612e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f3609a = hVar;
                this.f3610b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0061a c0061a;
                if (eVar instanceof C0061a) {
                    c0061a = (C0061a) eVar;
                    int i15 = c0061a.f3612e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0061a.f3612e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0061a = new C0061a(eVar);
                    }
                } else {
                    c0061a = new C0061a(eVar);
                }
                Object obj2 = c0061a.f3611d;
                Object objE = uq.b.e();
                int i16 = c0061a.f3612e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f3609a;
                    n0 n0VarC9 = this.f3610b.C9((n0) obj);
                    c0061a.f3613f = vq.j.a(obj);
                    c0061a.f3615h = vq.j.a(c0061a);
                    c0061a.f3616j = vq.j.a(obj);
                    c0061a.f3617k = vq.j.a(hVar);
                    c0061a.f3618l = 0;
                    c0061a.f3612e = 1;
                    if (hVar.F(n0VarC9, c0061a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public d(mu.g gVar, x xVar) {
            this.f3607a = gVar;
            this.f3608b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<n50.k>> hVar, tq.e eVar) {
            Object objA = this.f3607a.a(new a(hVar, this.f3608b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<a52.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f3619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f3620b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f3621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f3622b;

            /* JADX INFO: renamed from: a52.x$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0062a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f3623d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f3624e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f3625f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f3627h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f3628j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f3629k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f3630l;

                public C0062a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f3623d = obj;
                    this.f3624e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f3621a = hVar;
                this.f3622b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0062a c0062a;
                if (eVar instanceof C0062a) {
                    c0062a = (C0062a) eVar;
                    int i15 = c0062a.f3624e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0062a.f3624e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0062a = new C0062a(eVar);
                    }
                } else {
                    c0062a = new C0062a(eVar);
                }
                Object obj2 = c0062a.f3623d;
                Object objE = uq.b.e();
                int i16 = c0062a.f3624e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f3621a;
                    a52.c.a aVarD9 = this.f3622b.D9((a52.b) obj);
                    c0062a.f3625f = vq.j.a(obj);
                    c0062a.f3627h = vq.j.a(c0062a);
                    c0062a.f3628j = vq.j.a(obj);
                    c0062a.f3629k = vq.j.a(hVar);
                    c0062a.f3630l = 0;
                    c0062a.f3624e = 1;
                    if (hVar.F(aVarD9, c0062a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public e(mu.g gVar, x xVar) {
            this.f3619a = gVar;
            this.f3620b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super a52.c.a> hVar, tq.e eVar) {
            Object objA = this.f3619a.a(new a(hVar, this.f3620b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La52/a$e;", "<unused var>", "La52/b;", "Loq/i0;", "<anonymous>", "(La52/a$e;La52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<a52.a.e, a52.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3631e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3631e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                a52.a.j.b bVar = a52.a.j.b.f3517a;
                this.f3631e = 1;
                if (xVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.e eVar, a52.b bVar, tq.e<? super oq.i0> eVar2) {
            return x.this.new f(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La52/a$f;", "<unused var>", "La52/b;", "Loq/i0;", "<anonymous>", "(La52/a$f;La52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a52.a.f, a52.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3633e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3633e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                a52.a.j.c cVar = a52.a.j.c.f3518a;
                this.f3633e = 1;
                if (xVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.f fVar, a52.b bVar, tq.e<? super oq.i0> eVar) {
            return x.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La52/a$a;", "<unused var>", "La52/b;", "Loq/i0;", "<anonymous>", "(La52/a$a;La52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a52.a.C0055a, a52.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3635e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3635e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                a52.a.j.C0056a c0056a = a52.a.j.C0056a.f3516a;
                this.f3635e = 1;
                if (xVar.F(c0056a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.C0055a c0055a, a52.b bVar, tq.e<? super oq.i0> eVar) {
            return x.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$g;", "action", "La52/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(La52/a$g;La52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a52.a.Error, a52.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3638f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(x xVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                xVar.d9(a52.a.f.f3512a);
            } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                xVar.d9(a52.a.h.f3514a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                xVar.d9(a52.a.f.f3512a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.a.Error error = (a52.a.Error) this.f3638f;
            Object objE = uq.b.e();
            int i15 = this.f3637e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                ib4.c cVar = x.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final x xVar2 = x.this;
                a52.a.j.Error error2 = new a52.a.j.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: a52.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.i.O(xVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f3638f = vq.j.a(error);
                this.f3637e = 1;
                if (xVar.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.Error error, a52.b bVar, tq.e<? super oq.i0> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f3638f = error;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La52/b$a;", "it", "Loq/i0;", "<anonymous>", "(La52/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<a52.b.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3640e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f3642a;

            a(x xVar) {
                this.f3642a = xVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BECommitmentType> n0Var, tq.e<? super oq.i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f3642a._commitmentPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return oq.i0.f148189a;
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3640e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarA = ja.d.a(x.this.A9(null), u0.a(x.this));
                a aVar = new a(x.this);
                this.f3640e = 1;
                if (gVarA.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(a52.b.a aVar, tq.e<? super oq.i0> eVar) {
            return ((j) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return x.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La52/a$h;", "<unused var>", "La52/b$a;", "Loq/i0;", "<anonymous>", "(La52/a$h;La52/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a52.a.h, a52.b.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3643e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f3645a;

            a(x xVar) {
                this.f3645a = xVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BECommitmentType> n0Var, tq.e<? super oq.i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f3645a._commitmentPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return oq.i0.f148189a;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3643e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarA = ja.d.a(x.this.A9(null), u0.a(x.this));
                a aVar = new a(x.this);
                this.f3643e = 1;
                if (gVarA.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.h hVar, a52.b.a aVar, tq.e<? super oq.i0> eVar) {
            return x.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La52/a$p;", "<unused var>", "Lk10/c0;", "La52/b$a;", "state", "Lk10/l;", "La52/b;", "<anonymous>", "(La52/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a52.a.p, k10.c0<a52.b.a>, tq.e<? super k10.l<? extends a52.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3647f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a52.b.C0057b O(a52.b.a aVar) {
            return a52.b.C0057b.f3532a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f3647f;
            uq.b.e();
            if (this.f3646e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: a52.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.O((b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.p pVar, k10.c0<a52.b.a> c0Var, tq.e<? super k10.l<? extends a52.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f3647f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La52/a$q;", "<unused var>", "Lk10/c0;", "La52/b$a;", "state", "Lk10/l;", "La52/b;", "<anonymous>", "(La52/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a52.a.q, k10.c0<a52.b.a>, tq.e<? super k10.l<? extends a52.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3649f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a52.b.WithData O(a52.b.a aVar) {
            return new a52.b.WithData(null, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f3649f;
            uq.b.e();
            if (this.f3648e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: a52.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.m.O((b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.q qVar, k10.c0<a52.b.a> c0Var, tq.e<? super k10.l<? extends a52.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f3649f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La52/a$d;", "action", "Lk10/c0;", "La52/b$c;", "state", "Lk10/l;", "La52/b;", "<anonymous>", "(La52/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a52.a.ChangeSearchActiveState, k10.c0<a52.b.WithData>, tq.e<? super k10.l<? extends a52.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3652g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a52.b.WithData O(a52.a.ChangeSearchActiveState changeSearchActiveState, a52.b.WithData withData) {
            return a52.b.WithData.b(withData, null, changeSearchActiveState.getSearchActiveState(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a52.a.ChangeSearchActiveState changeSearchActiveState = (a52.a.ChangeSearchActiveState) this.f3651f;
            k10.c0 c0Var = (k10.c0) this.f3652g;
            uq.b.e();
            if (this.f3650e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a52.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.n.O(changeSearchActiveState, (b.WithData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.ChangeSearchActiveState changeSearchActiveState, k10.c0<a52.b.WithData> c0Var, tq.e<? super k10.l<? extends a52.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f3651f = changeSearchActiveState;
            nVar.f3652g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La52/b$c;", "state", "Loq/i0;", "<anonymous>", "(La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3654f;

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.b.WithData withData = (a52.b.WithData) this.f3654f;
            uq.b.e();
            if (this.f3653e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (withData.getQuery().length() == 0) {
                x.this.d9(new a52.a.GetNewPagingDataWithDebounce(null));
            } else {
                int length = withData.getQuery().length();
                if (3 <= length && length < 251) {
                    String query = withData.getQuery();
                    for (int i15 = 0; i15 < query.length(); i15++) {
                        if (fu.r.c0("<>()%#@”‘|&", query.charAt(i15), false, 2, null)) {
                            x.this.d9(a52.a.o.f3526a);
                        }
                    }
                    x.this.d9(new a52.a.GetNewPagingDataWithDebounce(withData.getQuery()));
                } else if (withData.getQuery().length() > 250) {
                    x.this.d9(a52.a.o.f3526a);
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            return ((o) v(withData, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o oVar = x.this.new o(eVar);
            oVar.f3654f = obj;
            return oVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La52/a$c;", "action", "Lk10/c0;", "La52/b$c;", "state", "Lk10/l;", "La52/b;", "<anonymous>", "(La52/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a52.a.ChangeQuery, k10.c0<a52.b.WithData>, tq.e<? super k10.l<? extends a52.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3658g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a52.b.WithData O(a52.a.ChangeQuery changeQuery, a52.b.WithData withData) {
            return a52.b.WithData.b(withData, changeQuery.getQuery(), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a52.a.ChangeQuery changeQuery = (a52.a.ChangeQuery) this.f3657f;
            k10.c0 c0Var = (k10.c0) this.f3658g;
            uq.b.e();
            if (this.f3656e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a52.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.p.O(changeQuery, (b.WithData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.ChangeQuery changeQuery, k10.c0<a52.b.WithData> c0Var, tq.e<? super k10.l<? extends a52.b>> eVar) {
            p pVar = new p(eVar);
            pVar.f3657f = changeQuery;
            pVar.f3658g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"La52/a$l;", "<unused var>", "Lk10/c0;", "La52/b$c;", "state", "Lk10/l;", "La52/b;", "<anonymous>", "(La52/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a52.a.l, k10.c0<a52.b.WithData>, tq.e<? super k10.l<? extends a52.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3660f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a52.b.WithData O(a52.b.WithData withData) {
            return a52.b.WithData.b(withData, "", false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f3660f;
            uq.b.e();
            if (this.f3659e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: a52.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.q.O((b.WithData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.l lVar, k10.c0<a52.b.WithData> c0Var, tq.e<? super k10.l<? extends a52.b>> eVar) {
            q qVar = new q(eVar);
            qVar.f3660f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$b;", "<unused var>", "La52/b$c;", "state", "Loq/i0;", "<anonymous>", "(La52/a$b;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a52.a.b, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3662f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.b.WithData withData = (a52.b.WithData) this.f3662f;
            uq.b.e();
            if (this.f3661e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (withData.getIsSearchActive()) {
                x.this.d9(new a52.a.ChangeSearchActiveState(false));
            } else {
                x.this.d9(a52.a.C0055a.f3507a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.b bVar, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            r rVar = x.this.new r(eVar);
            rVar.f3662f = withData;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$h;", "<unused var>", "La52/b$c;", "state", "Loq/i0;", "<anonymous>", "(La52/a$h;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a52.a.h, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3665f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f3667a;

            a(x xVar) {
                this.f3667a = xVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BECommitmentType> n0Var, tq.e<? super oq.i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f3667a._commitmentPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return oq.i0.f148189a;
            }
        }

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.b.WithData withData = (a52.b.WithData) this.f3665f;
            Object objE = uq.b.e();
            int i15 = this.f3664e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                String query = withData.getQuery();
                if (query.length() == 0) {
                    query = null;
                }
                mu.g gVarA = ja.d.a(xVar.A9(query), u0.a(x.this));
                a aVar = new a(x.this);
                this.f3665f = vq.j.a(withData);
                this.f3664e = 1;
                if (gVarA.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.h hVar, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            s sVar = x.this.new s(eVar);
            sVar.f3665f = withData;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$i;", "action", "La52/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La52/a$i;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a52.a.GetNewPagingDataWithDebounce, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3669f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f3671a;

            a(x xVar) {
                this.f3671a = xVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BECommitmentType> n0Var, tq.e<? super oq.i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f3671a._commitmentPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return oq.i0.f148189a;
            }
        }

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (r8.a(r2, r7) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f3669f
                a52.a$i r0 = (a52.a.GetNewPagingDataWithDebounce) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f3668e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L5e
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto L34
            L22:
                oq.u.b(r8)
                long r5 = a52.x.s9()
                r7.f3669f = r0
                r7.f3668e = r4
                java.lang.Object r8 = ju.z0.c(r5, r7)
                if (r8 != r1) goto L34
                goto L5d
            L34:
                a52.x r8 = a52.x.this
                java.lang.String r2 = r0.getCommitmentTypeName()
                mu.g r8 = a52.x.v9(r8, r2)
                a52.x r2 = a52.x.this
                ju.p0 r2 = androidx.p016lifecycle.u0.a(r2)
                mu.g r8 = ja.d.a(r8, r2)
                a52.x$t$a r2 = new a52.x$t$a
                a52.x r4 = a52.x.this
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f3669f = r0
                r7.f3668e = r3
                java.lang.Object r8 = r8.a(r2, r7)
                if (r8 != r1) goto L5e
            L5d:
                return r1
            L5e:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: a52.x.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.GetNewPagingDataWithDebounce getNewPagingDataWithDebounce, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            t tVar = x.this.new t(eVar);
            tVar.f3669f = getNewPagingDataWithDebounce;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La52/a$o;", "<unused var>", "La52/b$c;", "Loq/i0;", "<anonymous>", "(La52/a$o;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a52.a.o, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3672e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object value;
            uq.b.e();
            if (this.f3672e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            mu.b0 b0Var = x.this._commitmentPagingData;
            do {
                value = b0Var.getValue();
            } while (!b0Var.s(value, n0.Companion.f(n0.INSTANCE, pq.v.n(), 0, 0, 6, null)));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.o oVar, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            return x.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$m;", "action", "La52/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La52/a$m;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a52.a.SaveCommitmentTypes, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3675f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.a.SaveCommitmentTypes saveCommitmentTypes = (a52.a.SaveCommitmentTypes) this.f3675f;
            uq.b.e();
            if (this.f3674e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.commitmentTypesContract.X7(new StampDutyCommitmentTypeData(saveCommitmentTypes.getCommitmentType().getName(), saveCommitmentTypes.getCommitmentType().getCode()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.SaveCommitmentTypes saveCommitmentTypes, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            v vVar = x.this.new v(eVar);
            vVar.f3675f = saveCommitmentTypes;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$n;", "action", "La52/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La52/a$n;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<a52.a.SaveCommitmentVariants, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3678f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.a.SaveCommitmentVariants saveCommitmentVariants = (a52.a.SaveCommitmentVariants) this.f3678f;
            uq.b.e();
            if (this.f3677e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.commitmentTypesContract.T3(new StampDutyCommitmentVariantData(saveCommitmentVariants.getStampDutyCommitmentVariantData().getDescription(), saveCommitmentVariants.getStampDutyCommitmentVariantData().getAmount(), false));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.SaveCommitmentVariants saveCommitmentVariants, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            w wVar = x.this.new w(eVar);
            wVar.f3678f = saveCommitmentVariants;
            return wVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: a52.x$x, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$k;", "action", "La52/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La52/a$k;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class C0063x extends vq.k implements er.q<a52.a.OnCommitmentTypeSelected, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3681f;

        C0063x(tq.e<? super C0063x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.a.OnCommitmentTypeSelected onCommitmentTypeSelected = (a52.a.OnCommitmentTypeSelected) this.f3681f;
            uq.b.e();
            if (this.f3680e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(new a52.a.SaveCommitmentTypes(onCommitmentTypeSelected.getCommitmentType()));
            if (onCommitmentTypeSelected.getCommitmentType().c().size() == 1) {
                x.this.d9(new a52.a.SaveCommitmentVariants((BEStampDutyAmount) pq.v.l0(onCommitmentTypeSelected.getCommitmentType().c())));
                x.this.d9(a52.a.s.f3530a);
            } else {
                x.this.d9(new a52.a.ToCommitmentVariant(onCommitmentTypeSelected.getCommitmentType().c()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.OnCommitmentTypeSelected onCommitmentTypeSelected, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            C0063x c0063x = x.this.new C0063x(eVar);
            c0063x.f3681f = onCommitmentTypeSelected;
            return c0063x.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La52/a$r;", "action", "La52/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La52/a$r;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<a52.a.ToCommitmentVariant, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f3684f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a52.a.ToCommitmentVariant toCommitmentVariant = (a52.a.ToCommitmentVariant) this.f3684f;
            Object objE = uq.b.e();
            int i15 = this.f3683e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                a52.a.j.ToCommitmentVariant toCommitmentVariant2 = new a52.a.j.ToCommitmentVariant(new CommitmentVariantEntryData(toCommitmentVariant.a()));
                this.f3684f = vq.j.a(toCommitmentVariant);
                this.f3683e = 1;
                if (xVar.F(toCommitmentVariant2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.ToCommitmentVariant toCommitmentVariant, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            y yVar = x.this.new y(eVar);
            yVar.f3684f = toCommitmentVariant;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"La52/a$s;", "<unused var>", "La52/b$c;", "Loq/i0;", "<anonymous>", "(La52/a$s;La52/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<a52.a.s, a52.b.WithData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3686e;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f3686e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                a52.a.j.f fVar = a52.a.j.f.f3521a;
                this.f3686e = 1;
                if (xVar.F(fVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a52.a.s sVar, a52.b.WithData withData, tq.e<? super oq.i0> eVar) {
            return x.this.new z(eVar).J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, b52.c cVar, fs0.b bVar, ib4.c cVar2, b52.b bVar2, w52.a aVar2) {
        this.mapper = cVar;
        this.getCommitmentTypesUC = bVar;
        this.genericDomainErrorMapper = cVar2;
        this.commitmentPagingItemMapper = bVar2;
        this.commitmentTypesContract = aVar2;
        mu.b0<n0<BECommitmentType>> b0VarA = r0.a(n0.INSTANCE.c());
        this._commitmentPagingData = b0VarA;
        this.commitmentPagingData = new d(b0VarA, this);
        a52.b.a aVar3 = a52.b.a.f3531a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: a52.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f3581a, (k10.v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), D9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<BECommitmentType>> A9(final String commitmentTypeName) {
        return new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: a52.v
            @Override // er.a
            public final Object a() {
                return x.B9(this.f3579a, commitmentTypeName);
            }
        }, 2, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 B9(x xVar, String str) {
        return xVar.new b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<n50.k> C9(n0<BECommitmentType> pagingSourceData) {
        return ja.u0.c(pagingSourceData, new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a52.c.a D9(a52.b state) {
        return this.mapper.b(new b52.c.Params(state, b9(a52.a.C0055a.f3507a), b9(a52.a.b.f3508a), b9(a52.a.e.f3511a), b9(a52.a.f.f3512a), new er.l() { // from class: a52.o
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9(this.f3573a, (String) obj);
            }
        }, b9(a52.a.l.f3523a), new er.l() { // from class: a52.p
            @Override // er.l
            public final Object b(Object obj) {
                return x.F9(this.f3574a, ((Boolean) obj).booleanValue());
            }
        }, b9(a52.a.q.f3528a), b9(a52.a.p.f3527a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(x xVar, String str) {
        xVar.d9(new a52.a.ChangeQuery(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(x xVar, boolean z15) {
        xVar.d9(new a52.a.ChangeSearchActiveState(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(a52.b.class), new er.l() { // from class: a52.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f3575a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a52.b.a.class), new er.l() { // from class: a52.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(this.f3576a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(a52.b.WithData.class), new er.l() { // from class: a52.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.K9(this.f3577a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(x xVar, k10.z zVar) {
        f fVar = xVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a52.a.e.class), oVar, fVar);
        zVar.x(q0.c(a52.a.f.class), oVar, xVar.new g(null));
        zVar.x(q0.c(a52.a.C0055a.class), oVar, xVar.new h(null));
        zVar.x(q0.c(a52.a.Error.class), oVar, xVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(x xVar, k10.z zVar) {
        zVar.C(xVar.new j(null));
        k kVar = xVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a52.a.h.class), oVar, kVar);
        zVar.v(q0.c(a52.a.p.class), oVar, new l(null));
        zVar.v(q0.c(a52.a.q.class), oVar, new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final x xVar, k10.z zVar) {
        r rVar = xVar.new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a52.a.b.class), oVar, rVar);
        zVar.x(q0.c(a52.a.h.class), oVar, xVar.new s(null));
        zVar.x(q0.c(a52.a.GetNewPagingDataWithDebounce.class), oVar, xVar.new t(null));
        zVar.x(q0.c(a52.a.o.class), oVar, xVar.new u(null));
        zVar.x(q0.c(a52.a.SaveCommitmentTypes.class), oVar, xVar.new v(null));
        zVar.x(q0.c(a52.a.SaveCommitmentVariants.class), oVar, xVar.new w(null));
        zVar.x(q0.c(a52.a.OnCommitmentTypeSelected.class), oVar, xVar.new C0063x(null));
        zVar.x(q0.c(a52.a.ToCommitmentVariant.class), oVar, xVar.new y(null));
        zVar.x(q0.c(a52.a.s.class), oVar, xVar.new z(null));
        zVar.v(q0.c(a52.a.ChangeSearchActiveState.class), oVar, new n(null));
        zVar.N(new er.l() { // from class: a52.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9((b.WithData) obj);
            }
        }, new er.l() { // from class: a52.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.M9(this.f3578a, (k10.x) obj);
            }
        });
        zVar.v(q0.c(a52.a.ChangeQuery.class), oVar, new p(null));
        zVar.v(q0.c(a52.a.l.class), oVar, new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L9(a52.b.WithData withData) {
        return withData.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(x xVar, k10.x xVar2) {
        xVar2.C(xVar.new o(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w52.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<a52.a.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<a52.b, a52.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<a52.c.a> getState() {
        return this.state;
    }

    @Override // a52.c
    public mu.g<n0<n50.k>> m6() {
        return this.commitmentPagingData;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a52.a.j jVar, tq.e<? super oq.i0> eVar) {
        return super.F(jVar, eVar);
    }
}
