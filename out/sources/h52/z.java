package h52;

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
import y52.StampDutyInstitutionsData;
import zr0.BEInstitution;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001PBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00160\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010C\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR&\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030D8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lh52/z;", "Ll00/g;", "Lh52/g;", "Lh52/f;", "Lh52/h;", "", "Lyy/a;", "stateMachineFactory", "Li52/e;", "mapper", "Lfs0/c;", "getInstitutionsUC", "Lib4/c;", "genericDomainErrorMapper", "Li52/b;", "institutionPagingItemMapper", "Li52/d;", "stampDutyPaymentsInstitutionDialogMapper", "Lw52/c;", "institutionsContract", "<init>", "(Lyy/a;Li52/e;Lfs0/c;Lib4/c;Li52/b;Li52/d;Lw52/c;)V", "Lja/n0;", "Lzr0/c;", "pagingData", "Ln50/k;", "C9", "(Lja/n0;)Lja/n0;", "state", "Lh52/h$a;", "D9", "(Lh52/g;)Lh52/h$a;", "", "city", "Lmu/g;", "A9", "(Ljava/lang/String;)Lmu/g;", "b", "Li52/e;", "c", "Lfs0/c;", "d", "Lib4/c;", "e", "Li52/b;", "f", "Li52/d;", "g", "Lw52/c;", "Lmu/b0;", "h", "Lmu/b0;", "_institutionsPagingData", "j", "Lmu/g;", "y8", "()Lmu/g;", "institutionsPagingData", "k", "Lh52/g;", "initialState", "Lxw/b;", "Lh52/f$j;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "p", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, h52.f> implements h52.h, zx.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f81080p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f81081q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f81082r = gu.d.q(300, gu.e.MILLISECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i52.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fs0.c getInstitutionsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i52.b institutionPagingItemMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i52.d stampDutyPaymentsInstitutionDialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w52.c institutionsContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<n0<BEInstitution>> _institutionsPagingData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<n50.k>> institutionsPagingData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h52.f.j> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, h52.f> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<h52.h.Data> state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh52/z$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "FIRST_PAGE_INDEX", "Lgu/b;", "DEFAULT_SEARCH_DEBOUNCE_DURATION", "J", "MIN_QUERY_CHAR_NUMBER", "MAX_QUERY_CHAR_NUMBER", "", "FORBIDDEN_QUERY_CHARS", "Ljava/lang/String;", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: h52.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh52/z$a$a;", "", "<init>", "()V", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private static final class C1867a extends Throwable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1867a f81095a = new C1867a();

            private C1867a() {
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"h52/z$b", "Lja/x0;", "", "Lzr0/c;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/Integer;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends x0<Integer, BEInstitution> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81097c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f81098d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f81099e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f81100f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f81102h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f81100f = obj;
                this.f81102h |= PKIFailureInfo.systemUnavail;
                return b.this.g(null, this);
            }
        }

        b(String str) {
            this.f81097c = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ja.x0
        public Object g(x0.a<Integer> aVar, tq.e<? super x0.b<Integer, BEInstitution>> eVar) throws Throwable {
            a aVar2;
            int i15;
            if (eVar instanceof a) {
                aVar2 = (a) eVar;
                int i16 = aVar2.f81102h;
                if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f81102h = i16 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object obj = aVar2.f81100f;
            Object objE = uq.b.e();
            int i17 = aVar2.f81102h;
            if (i17 == 0) {
                oq.u.b(obj);
                Integer numA = aVar.a();
                int iIntValue = numA != null ? numA.intValue() : 0;
                fs0.c cVar = z.this.getInstitutionsUC;
                fs0.c.Params params = new fs0.c.Params(z.this.institutionsContract.J8(), this.f81097c, iIntValue);
                aVar2.f81098d = vq.j.a(aVar);
                aVar2.f81099e = iIntValue;
                aVar2.f81102h = 1;
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
                i15 = aVar2.f81099e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            z zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                zVar.d9(new h52.f.Error((dx.b) ((dx.i.Left) iVar).b()));
                return new x0.b.a(new Throwable());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            if (list.isEmpty() && i15 == 0) {
                return new x0.b.C2395b(list, null, null);
            }
            return list.isEmpty() ? new x0.b.a(a.C1867a.f81095a) : new x0.b.C2395b(list, null, vq.b.e(i15 + 1));
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer d(PagingState<Integer, BEInstitution> state) {
            Integer numH;
            int iIntValue;
            Integer numI;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition != null) {
                x0.b.C2395b<Integer, BEInstitution> c2395bC = state.c(anchorPosition.intValue());
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzr0/c;", "institution", "Ln50/k;", "<anonymous>", "(Lzr0/c;)Ln50/k;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<BEInstitution, tq.e<? super n50.k>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81104f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(z zVar, BEInstitution bEInstitution) {
            zVar.d9(new h52.f.ShowConfirmInstitutionDialog(bEInstitution));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BEInstitution bEInstitution = (BEInstitution) this.f81104f;
            uq.b.e();
            if (this.f81103e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            i52.b bVar = z.this.institutionPagingItemMapper;
            final z zVar = z.this;
            return bVar.b(new i52.b.Params(bEInstitution, new er.l() { // from class: h52.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.c.O(zVar, (BEInstitution) obj2);
                }
            }));
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(BEInstitution bEInstitution, tq.e<? super n50.k> eVar) {
            return ((c) v(bEInstitution, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = z.this.new c(eVar);
            cVar.f81104f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<n0<n50.k>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f81106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f81107b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f81108a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f81109b;

            /* JADX INFO: renamed from: h52.z$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1868a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f81110d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f81111e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f81112f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f81114h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f81115j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f81116k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f81117l;

                public C1868a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f81110d = obj;
                    this.f81111e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f81108a = hVar;
                this.f81109b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1868a c1868a;
                if (eVar instanceof C1868a) {
                    c1868a = (C1868a) eVar;
                    int i15 = c1868a.f81111e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1868a.f81111e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1868a = new C1868a(eVar);
                    }
                } else {
                    c1868a = new C1868a(eVar);
                }
                Object obj2 = c1868a.f81110d;
                Object objE = uq.b.e();
                int i16 = c1868a.f81111e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f81108a;
                    n0 n0VarC9 = this.f81109b.C9((n0) obj);
                    c1868a.f81112f = vq.j.a(obj);
                    c1868a.f81114h = vq.j.a(c1868a);
                    c1868a.f81115j = vq.j.a(obj);
                    c1868a.f81116k = vq.j.a(hVar);
                    c1868a.f81117l = 0;
                    c1868a.f81111e = 1;
                    if (hVar.F(n0VarC9, c1868a) == objE) {
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

        public d(mu.g gVar, z zVar) {
            this.f81106a = gVar;
            this.f81107b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<n50.k>> hVar, tq.e eVar) {
            Object objA = this.f81106a.a(new a(hVar, this.f81107b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<h52.h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f81118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f81119b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f81120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f81121b;

            /* JADX INFO: renamed from: h52.z$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1869a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f81122d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f81123e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f81124f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f81126h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f81127j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f81128k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f81129l;

                public C1869a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f81122d = obj;
                    this.f81123e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f81120a = hVar;
                this.f81121b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1869a c1869a;
                if (eVar instanceof C1869a) {
                    c1869a = (C1869a) eVar;
                    int i15 = c1869a.f81123e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1869a.f81123e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1869a = new C1869a(eVar);
                    }
                } else {
                    c1869a = new C1869a(eVar);
                }
                Object obj2 = c1869a.f81122d;
                Object objE = uq.b.e();
                int i16 = c1869a.f81123e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f81120a;
                    h52.h.Data dataD9 = this.f81121b.D9((State) obj);
                    c1869a.f81124f = vq.j.a(obj);
                    c1869a.f81126h = vq.j.a(c1869a);
                    c1869a.f81127j = vq.j.a(obj);
                    c1869a.f81128k = vq.j.a(hVar);
                    c1869a.f81129l = 0;
                    c1869a.f81123e = 1;
                    if (hVar.F(dataD9, c1869a) == objE) {
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

        public e(mu.g gVar, z zVar) {
            this.f81118a = gVar;
            this.f81119b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h52.h.Data> hVar, tq.e eVar) {
            Object objA = this.f81118a.a(new a(hVar, this.f81119b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh52/f$p;", "<unused var>", "Lh52/g;", "Loq/i0;", "<anonymous>", "(Lh52/f$p;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h52.f.p, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81130e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81130e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                h52.f.j.C1866f c1866f = h52.f.j.C1866f.f81041a;
                this.f81130e = 1;
                if (zVar.F(c1866f, this) == objE) {
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
        public final Object w(h52.f.p pVar, State state, tq.e<? super i0> eVar) {
            return z.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh52/f$k;", "action", "Lh52/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh52/f$k;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<h52.f.OnInstitutionConfirmed, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81133f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h52.f.OnInstitutionConfirmed onInstitutionConfirmed = (h52.f.OnInstitutionConfirmed) this.f81133f;
            uq.b.e();
            if (this.f81132e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(new h52.f.SaveInstitutionData(onInstitutionConfirmed.getInstitution()));
            z.this.d9(h52.f.p.f81047a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.OnInstitutionConfirmed onInstitutionConfirmed, State state, tq.e<? super i0> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f81133f = onInstitutionConfirmed;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh52/g;", "it", "Loq/i0;", "<anonymous>", "(Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81135e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f81137a;

            a(z zVar) {
                this.f81137a = zVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BEInstitution> n0Var, tq.e<? super i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f81137a._institutionsPagingData;
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
            int i15 = this.f81135e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarA = ja.d.a(z.this.A9(null), u0.a(z.this));
                a aVar = new a(z.this);
                this.f81135e = 1;
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((h) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh52/f$d;", "action", "Lk10/c0;", "Lh52/g;", "state", "Lk10/l;", "<anonymous>", "(Lh52/f$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<h52.f.ChangeSearchActiveState, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f81140g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h52.f.ChangeSearchActiveState changeSearchActiveState, State state) {
            return State.b(state, null, changeSearchActiveState.getSearchActiveState(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h52.f.ChangeSearchActiveState changeSearchActiveState = (h52.f.ChangeSearchActiveState) this.f81139f;
            k10.c0 c0Var = (k10.c0) this.f81140g;
            uq.b.e();
            if (this.f81138e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h52.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.O(changeSearchActiveState, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.ChangeSearchActiveState changeSearchActiveState, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f81139f = changeSearchActiveState;
            iVar.f81140g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh52/g;", "state", "Loq/i0;", "<anonymous>", "(Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81142f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f81142f;
            uq.b.e();
            if (this.f81141e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (state.getQuery().length() == 0) {
                z.this.d9(new h52.f.GetNewPagingDataWithDebounce(null));
            } else {
                int length = state.getQuery().length();
                if (3 <= length && length < 251) {
                    String query = state.getQuery();
                    for (int i15 = 0; i15 < query.length(); i15++) {
                        if (fu.r.c0("<>()%#@”‘|&", query.charAt(i15), false, 2, null)) {
                            z.this.d9(h52.f.n.f81045a);
                        }
                    }
                    z.this.d9(new h52.f.GetNewPagingDataWithDebounce(state.getQuery()));
                } else if (state.getQuery().length() > 250) {
                    z.this.d9(h52.f.n.f81045a);
                }
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((j) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f81142f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh52/f$c;", "action", "Lk10/c0;", "Lh52/g;", "state", "Lk10/l;", "<anonymous>", "(Lh52/f$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<h52.f.ChangeQuery, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f81146g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h52.f.ChangeQuery changeQuery, State state) {
            return State.b(state, changeQuery.getQuery(), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h52.f.ChangeQuery changeQuery = (h52.f.ChangeQuery) this.f81145f;
            k10.c0 c0Var = (k10.c0) this.f81146g;
            uq.b.e();
            if (this.f81144e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h52.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.k.O(changeQuery, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.ChangeQuery changeQuery, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = new k(eVar);
            kVar.f81145f = changeQuery;
            kVar.f81146g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lh52/f$l;", "<unused var>", "Lk10/c0;", "Lh52/g;", "state", "Lk10/l;", "<anonymous>", "(Lh52/f$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<h52.f.l, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81148f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, "", false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f81148f;
            uq.b.e();
            if (this.f81147e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: h52.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.l.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.l lVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar2 = new l(eVar);
            lVar2.f81148f = c0Var;
            return lVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh52/f$o;", "action", "Lh52/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh52/f$o;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<h52.f.ShowConfirmInstitutionDialog, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81150f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h52.f.ShowConfirmInstitutionDialog showConfirmInstitutionDialog = (h52.f.ShowConfirmInstitutionDialog) this.f81150f;
            Object objE = uq.b.e();
            int i15 = this.f81149e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<h52.f.j> bVarY1 = z.this.Y1();
                h52.f.j.ShowConfirmInstitutionDialog showConfirmInstitutionDialog2 = new h52.f.j.ShowConfirmInstitutionDialog(z.this.stampDutyPaymentsInstitutionDialogMapper.b(new i52.d.Params(z.this.b9(new h52.f.OnInstitutionConfirmed(showConfirmInstitutionDialog.getInstitution())))));
                this.f81150f = vq.j.a(showConfirmInstitutionDialog);
                this.f81149e = 1;
                if (bVarY1.F(showConfirmInstitutionDialog2, this) == objE) {
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
        public final Object w(h52.f.ShowConfirmInstitutionDialog showConfirmInstitutionDialog, State state, tq.e<? super i0> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f81150f = showConfirmInstitutionDialog;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh52/f$a;", "<unused var>", "Lh52/g;", "Loq/i0;", "<anonymous>", "(Lh52/f$a;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<h52.f.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81152e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81152e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                h52.f.j.a aVar = h52.f.j.a.f81036a;
                this.f81152e = 1;
                if (zVar.F(aVar, this) == objE) {
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
        public final Object w(h52.f.a aVar, State state, tq.e<? super i0> eVar) {
            return z.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh52/f$b;", "<unused var>", "Lh52/g;", "state", "Loq/i0;", "<anonymous>", "(Lh52/f$b;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<h52.f.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81155f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f81155f;
            uq.b.e();
            if (this.f81154e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (state.getIsSearchActive()) {
                z.this.d9(new h52.f.ChangeSearchActiveState(false));
            } else {
                z.this.d9(h52.f.a.f81027a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.b bVar, State state, tq.e<? super i0> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f81155f = state;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh52/f$e;", "<unused var>", "Lh52/g;", "Loq/i0;", "<anonymous>", "(Lh52/f$e;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<h52.f.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81157e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81157e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                h52.f.j.b bVar = h52.f.j.b.f81037a;
                this.f81157e = 1;
                if (zVar.F(bVar, this) == objE) {
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
        public final Object w(h52.f.e eVar, State state, tq.e<? super i0> eVar2) {
            return z.this.new p(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh52/f$f;", "<unused var>", "Lh52/g;", "Loq/i0;", "<anonymous>", "(Lh52/f$f;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<h52.f.C1865f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81159e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81159e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                h52.f.j.c cVar = h52.f.j.c.f81038a;
                this.f81159e = 1;
                if (zVar.F(cVar, this) == objE) {
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
        public final Object w(h52.f.C1865f c1865f, State state, tq.e<? super i0> eVar) {
            return z.this.new q(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh52/f$h;", "<unused var>", "Lh52/g;", "state", "Loq/i0;", "<anonymous>", "(Lh52/f$h;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<h52.f.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81162f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f81164a;

            a(z zVar) {
                this.f81164a = zVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BEInstitution> n0Var, tq.e<? super i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f81164a._institutionsPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return i0.f148189a;
            }
        }

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f81162f;
            Object objE = uq.b.e();
            int i15 = this.f81161e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                String query = state.getQuery();
                if (query.length() == 0) {
                    query = null;
                }
                mu.g gVarA = ja.d.a(zVar.A9(query), u0.a(z.this));
                a aVar = new a(z.this);
                this.f81162f = vq.j.a(state);
                this.f81161e = 1;
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
        public final Object w(h52.f.h hVar, State state, tq.e<? super i0> eVar) {
            r rVar = z.this.new r(eVar);
            rVar.f81162f = state;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh52/f$g;", "action", "Lh52/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh52/f$g;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<h52.f.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81166f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(z zVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                zVar.d9(h52.f.C1865f.f81032a);
            } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                zVar.d9(h52.f.h.f81034a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                zVar.d9(h52.f.C1865f.f81032a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h52.f.Error error = (h52.f.Error) this.f81166f;
            Object objE = uq.b.e();
            int i15 = this.f81165e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                ib4.c cVar = z.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final z zVar2 = z.this;
                h52.f.j.Error error2 = new h52.f.j.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: h52.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.s.O(zVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f81166f = vq.j.a(error);
                this.f81165e = 1;
                if (zVar.F(error2, this) == objE) {
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
        public final Object w(h52.f.Error error, State state, tq.e<? super i0> eVar) {
            s sVar = z.this.new s(eVar);
            sVar.f81166f = error;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh52/f$i;", "action", "Lh52/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh52/f$i;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<h52.f.GetNewPagingDataWithDebounce, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81169f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f81171a;

            a(z zVar) {
                this.f81171a = zVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<BEInstitution> n0Var, tq.e<? super i0> eVar) {
                Object value;
                mu.b0 b0Var = this.f81171a._institutionsPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return i0.f148189a;
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
                java.lang.Object r0 = r7.f81169f
                h52.f$i r0 = (h52.f.GetNewPagingDataWithDebounce) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f81168e
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
                long r5 = h52.z.p9()
                r7.f81169f = r0
                r7.f81168e = r4
                java.lang.Object r8 = ju.z0.c(r5, r7)
                if (r8 != r1) goto L34
                goto L5d
            L34:
                h52.z r8 = h52.z.this
                java.lang.String r2 = r0.getCity()
                mu.g r8 = h52.z.u9(r8, r2)
                h52.z r2 = h52.z.this
                ju.p0 r2 = androidx.p016lifecycle.u0.a(r2)
                mu.g r8 = ja.d.a(r8, r2)
                h52.z$t$a r2 = new h52.z$t$a
                h52.z r4 = h52.z.this
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f81169f = r0
                r7.f81168e = r3
                java.lang.Object r8 = r8.a(r2, r7)
                if (r8 != r1) goto L5e
            L5d:
                return r1
            L5e:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: h52.z.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.GetNewPagingDataWithDebounce getNewPagingDataWithDebounce, State state, tq.e<? super i0> eVar) {
            t tVar = z.this.new t(eVar);
            tVar.f81169f = getNewPagingDataWithDebounce;
            return tVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh52/f$n;", "<unused var>", "Lh52/g;", "Loq/i0;", "<anonymous>", "(Lh52/f$n;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<h52.f.n, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81172e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object value;
            uq.b.e();
            if (this.f81172e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            mu.b0 b0Var = z.this._institutionsPagingData;
            do {
                value = b0Var.getValue();
            } while (!b0Var.s(value, n0.Companion.f(n0.INSTANCE, pq.v.n(), 0, 0, 6, null)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.n nVar, State state, tq.e<? super i0> eVar) {
            return z.this.new u(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh52/f$m;", "action", "Lh52/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh52/f$m;Lh52/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<h52.f.SaveInstitutionData, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81175f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h52.f.SaveInstitutionData saveInstitutionData = (h52.f.SaveInstitutionData) this.f81175f;
            uq.b.e();
            if (this.f81174e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.institutionsContract.L1(new StampDutyInstitutionsData(saveInstitutionData.getInstitution().getName(), saveInstitutionData.getInstitution().getId()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h52.f.SaveInstitutionData saveInstitutionData, State state, tq.e<? super i0> eVar) {
            v vVar = z.this.new v(eVar);
            vVar.f81175f = saveInstitutionData;
            return vVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, i52.e eVar, fs0.c cVar, ib4.c cVar2, i52.b bVar, i52.d dVar, w52.c cVar3) {
        this.mapper = eVar;
        this.getInstitutionsUC = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.institutionPagingItemMapper = bVar;
        this.stampDutyPaymentsInstitutionDialogMapper = dVar;
        this.institutionsContract = cVar3;
        mu.b0<n0<BEInstitution>> b0VarA = r0.a(n0.INSTANCE.c());
        this._institutionsPagingData = b0VarA;
        this.institutionsPagingData = new d(b0VarA, this);
        State state = new State("", false);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: h52.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.H9(this.f81079a, (k10.v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), D9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<BEInstitution>> A9(final String city) {
        return new l0(new m0(10, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: h52.x
            @Override // er.a
            public final Object a() {
                return z.B9(this.f81077a, city);
            }
        }, 2, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 B9(z zVar, String str) {
        return zVar.new b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<n50.k> C9(n0<BEInstitution> pagingData) {
        return ja.u0.c(pagingData, new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h52.h.Data D9(State state) {
        return this.mapper.b(new i52.e.Params(state, b9(h52.f.b.f81028a), b9(h52.f.e.f81031a), new er.l() { // from class: h52.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.E9(this.f81073a, (String) obj);
            }
        }, b9(h52.f.l.f81043a), new er.l() { // from class: h52.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.F9(this.f81074a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(z zVar, String str) {
        zVar.d9(new h52.f.ChangeQuery(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(z zVar, boolean z15) {
        zVar.d9(new h52.f.ChangeSearchActiveState(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: h52.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.I9(this.f81075a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(final z zVar, k10.z zVar2) {
        n nVar = zVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(h52.f.a.class), oVar, nVar);
        zVar2.x(q0.c(h52.f.b.class), oVar, zVar.new o(null));
        zVar2.x(q0.c(h52.f.e.class), oVar, zVar.new p(null));
        zVar2.x(q0.c(h52.f.C1865f.class), oVar, zVar.new q(null));
        zVar2.x(q0.c(h52.f.h.class), oVar, zVar.new r(null));
        zVar2.x(q0.c(h52.f.Error.class), oVar, zVar.new s(null));
        zVar2.x(q0.c(h52.f.GetNewPagingDataWithDebounce.class), oVar, zVar.new t(null));
        zVar2.x(q0.c(h52.f.n.class), oVar, zVar.new u(null));
        zVar2.x(q0.c(h52.f.SaveInstitutionData.class), oVar, zVar.new v(null));
        zVar2.x(q0.c(h52.f.p.class), oVar, zVar.new f(null));
        zVar2.x(q0.c(h52.f.OnInstitutionConfirmed.class), oVar, zVar.new g(null));
        zVar2.C(zVar.new h(null));
        zVar2.v(q0.c(h52.f.ChangeSearchActiveState.class), oVar, new i(null));
        zVar2.N(new er.l() { // from class: h52.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.J9((State) obj);
            }
        }, new er.l() { // from class: h52.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.K9(this.f81076a, (k10.x) obj);
            }
        });
        zVar2.v(q0.c(h52.f.ChangeQuery.class), oVar, new k(null));
        zVar2.v(q0.c(h52.f.l.class), oVar, new l(null));
        zVar2.x(q0.c(h52.f.ShowConfirmInstitutionDialog.class), oVar, zVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J9(State state) {
        return state.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(z zVar, k10.x xVar) {
        xVar.C(zVar.new j(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w52.c cVar) {
        super.P5(cVar);
    }

    @Override // zx.b
    public xw.b<h52.f.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, h52.f> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h52.h.Data> getState() {
        return this.state;
    }

    @Override // h52.h
    public mu.g<n0<n50.k>> y8() {
        return this.institutionsPagingData;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(h52.f.j jVar, tq.e<? super i0> eVar) {
        return super.F(jVar, eVar);
    }
}
