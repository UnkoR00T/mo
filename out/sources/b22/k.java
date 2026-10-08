package b22;

import androidx.p016lifecycle.u0;
import d12.OAuthWebViewData;
import eo0.RecipientInfo;
import eo0.RecipientResult;
import eo0.SearchRequest;
import eo0.b1;
import fr.q0;
import ja.PagingState;
import ja.l0;
import ja.m0;
import ja.n0;
import ja.x0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.b0;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.IndexedValue;
import pq.v;
import y22.SetupData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 j2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001kB[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010#\u001a\u00020\u001e*\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u001e*\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010&J#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010-J#\u00100\u001a\b\u0012\u0004\u0012\u00020/0*2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b0\u00101J/\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000030*\"\b\b\u0000\u00102*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000*H\u0002¢\u0006\u0004\b4\u00101J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u00020\u0002H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR&\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010^\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030_8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR \u00105\u001a\b\u0012\u0004\u0012\u0002060e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lb22/k;", "Ll00/g;", "Lb22/b;", "Lb22/a;", "Lb22/c;", "", "Lyy/a;", "stateMachineFactory", "Lc22/a;", "mapper", "Lp02/a;", "advancedSearchRecipientUC", "Lb12/c;", "electronicDeliveryErrorMapper", "Lc12/j;", "resultWarningDialogMapper", "Lx02/b;", "addRecipientWithServiceTypeValidationUC", "Lb32/c;", "searchRecipientDialogMapper", "Lc22/g;", "singleCardResultMapper", "Lhb4/d;", "errorVMSFactory", "Lb22/l;", "setupData", "<init>", "(Lyy/a;Lc22/a;Lp02/a;Lb12/c;Lc12/j;Lx02/b;Lb32/c;Lc22/g;Lhb4/d;Lb22/l;)V", "Lb22/a$i;", "fromAction", "Loq/i0;", "A9", "(Lb22/a$i;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "retryAction", "E9", "(Ldx/b;Lb22/a;Ltq/e;)Ljava/lang/Object;", "G9", "(Ldx/b;Lb22/a;)V", "Leo0/w0;", "request", "Lmu/g;", "Lja/n0;", "Leo0/n0;", "C9", "(Leo0/w0;)Lmu/g;", "pagingSourceData", "Ln50/k;", "I9", "(Lja/n0;)Lja/n0;", "T", "Lpq/p0;", "P9", "state", "Lb22/c$a;", "J9", "(Lb22/b;)Lb22/c$a;", "b", "Lc22/a;", "c", "Lp02/a;", "d", "Lb12/c;", "e", "Lc12/j;", "f", "Lx02/b;", "g", "Lb32/c;", "h", "Lc22/g;", "j", "Lhb4/d;", "k", "Lb22/l;", "Lb22/b$b;", "l", "Lb22/b$b;", "initialState", "Lmu/b0;", "m", "Lmu/b0;", "_resultsPagingData", "n", "Lmu/g;", "z8", "()Lmu/g;", "resultsPagingData", "Lxw/b;", "Lb22/a$g;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "s", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<b22.b, a> implements b22.c, zx.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f16177t = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c22.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p02.a advancedSearchRecipientUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c12.j resultWarningDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x02.b addRecipientWithServiceTypeValidationUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b32.c searchRecipientDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c22.g singleCardResultMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final b22.b.Initialized initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final b0<n0<RecipientResult>> _resultsPagingData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mu.g<n0<n50.k>> resultsPagingData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.g> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<b22.b, a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<b22.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f16195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f16197h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f16198j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f16200l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16198j = obj;
            this.f16200l |= PKIFailureInfo.systemUnavail;
            return k.this.A9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"b22/k$c", "Lja/x0;", "", "Leo0/n0;", "Lja/y0;", "state", "j", "(Lja/y0;)Ljava/lang/String;", "Lja/x0$a;", "params", "Lja/x0$b;", "g", "(Lja/x0$a;Ltq/e;)Ljava/lang/Object;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends x0<String, RecipientResult> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SearchRequest f16202c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f16203d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f16204e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f16206g;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f16204e = obj;
                this.f16206g |= PKIFailureInfo.systemUnavail;
                return c.this.g(null, this);
            }
        }

        c(SearchRequest searchRequest) {
            this.f16202c = searchRequest;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // ja.x0
        public Object g(x0.a<String> aVar, tq.e<? super x0.b<String, RecipientResult>> eVar) throws Throwable {
            a aVar2;
            if (eVar instanceof a) {
                aVar2 = (a) eVar;
                int i15 = aVar2.f16206g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f16206g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar2 = new a(eVar);
                }
            } else {
                aVar2 = new a(eVar);
            }
            Object objG = aVar2.f16204e;
            Object objE = uq.b.e();
            int i16 = aVar2.f16206g;
            if (i16 == 0) {
                u.b(objG);
                p02.a aVar3 = k.this.advancedSearchRecipientUC;
                p02.a.Params params = new p02.a.Params(aVar.a(), this.f16202c);
                aVar2.f16203d = aVar;
                aVar2.f16206g = 1;
                objG = aVar3.g(params, aVar2);
                if (objG == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (x0.a) aVar2.f16203d;
                u.b(objG);
            }
            dx.i iVar = (dx.i) objG;
            k kVar = k.this;
            if (iVar instanceof dx.i.Left) {
                kVar.G9((dx.b) ((dx.i.Left) iVar).b(), new b22.a.FetchResults(aVar.a()));
                return new x0.b.a(new Throwable());
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List list = (List) ((dx.i.Right) iVar).b();
            RecipientResult recipientResult = (RecipientResult) v.n0(list);
            return new x0.b.C2395b(list, null, recipientResult != null ? recipientResult.getNextPageId() : null);
        }

        @Override // ja.x0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String d(PagingState<String, RecipientResult> state) {
            RecipientResult recipientResultB;
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition == null || (recipientResultB = state.b(anchorPosition.intValue())) == null) {
                return null;
            }
            return recipientResultB.getNextPageId();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpq/p0;", "Leo0/n0;", "item", "Ln50/k;", "<anonymous>", "(Lpq/p0;)Ln50/k;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<IndexedValue<? extends RecipientResult>, tq.e<? super n50.k>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16208f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(k kVar, RecipientInfo recipientInfo) {
            kVar.d9(new a.GoToResultDetails(recipientInfo));
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(k kVar, RecipientResult recipientResult) {
            kVar.d9(new a.RecipientClick(recipientResult));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            IndexedValue indexedValue = (IndexedValue) this.f16208f;
            uq.b.e();
            if (this.f16207e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            c22.g gVar = k.this.singleCardResultMapper;
            RecipientResult recipientResult = (RecipientResult) indexedValue.d();
            final k kVar = k.this;
            er.l lVar = new er.l() { // from class: b22.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.d.V(kVar, (RecipientInfo) obj2);
                }
            };
            final k kVar2 = k.this;
            return gVar.b(new c22.g.Params(recipientResult, lVar, new er.l() { // from class: b22.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.d.X(kVar2, (RecipientResult) obj2);
                }
            }, indexedValue.c()));
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(IndexedValue<RecipientResult> indexedValue, tq.e<? super n50.k> eVar) {
            return ((d) v(indexedValue, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = k.this.new d(eVar);
            dVar.f16208f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<n0<n50.k>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f16210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f16211b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f16212a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f16213b;

            /* JADX INFO: renamed from: b22.k$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0386a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f16214d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f16215e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f16216f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f16218h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f16219j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f16220k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f16221l;

                public C0386a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f16214d = obj;
                    this.f16215e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k kVar) {
                this.f16212a = hVar;
                this.f16213b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0386a c0386a;
                if (eVar instanceof C0386a) {
                    c0386a = (C0386a) eVar;
                    int i15 = c0386a.f16215e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0386a.f16215e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0386a = new C0386a(eVar);
                    }
                } else {
                    c0386a = new C0386a(eVar);
                }
                Object obj2 = c0386a.f16214d;
                Object objE = uq.b.e();
                int i16 = c0386a.f16215e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f16212a;
                    n0 n0VarI9 = this.f16213b.I9((n0) obj);
                    c0386a.f16216f = vq.j.a(obj);
                    c0386a.f16218h = vq.j.a(c0386a);
                    c0386a.f16219j = vq.j.a(obj);
                    c0386a.f16220k = vq.j.a(hVar);
                    c0386a.f16221l = 0;
                    c0386a.f16215e = 1;
                    if (hVar.F(n0VarI9, c0386a) == objE) {
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

        public e(mu.g gVar, k kVar) {
            this.f16210a = gVar;
            this.f16211b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0<n50.k>> hVar, tq.e eVar) {
            Object objA = this.f16210a.a(new a(hVar, this.f16211b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<b22.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f16222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f16223b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f16224a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f16225b;

            /* JADX INFO: renamed from: b22.k$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0387a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f16226d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f16227e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f16228f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f16230h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f16231j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f16232k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f16233l;

                public C0387a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f16226d = obj;
                    this.f16227e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k kVar) {
                this.f16224a = hVar;
                this.f16225b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0387a c0387a;
                if (eVar instanceof C0387a) {
                    c0387a = (C0387a) eVar;
                    int i15 = c0387a.f16227e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0387a.f16227e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0387a = new C0387a(eVar);
                    }
                } else {
                    c0387a = new C0387a(eVar);
                }
                Object obj2 = c0387a.f16226d;
                Object objE = uq.b.e();
                int i16 = c0387a.f16227e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f16224a;
                    b22.c.a aVarJ9 = this.f16225b.J9((b22.b) obj);
                    c0387a.f16228f = vq.j.a(obj);
                    c0387a.f16230h = vq.j.a(c0387a);
                    c0387a.f16231j = vq.j.a(obj);
                    c0387a.f16232k = vq.j.a(hVar);
                    c0387a.f16233l = 0;
                    c0387a.f16227e = 1;
                    if (hVar.F(aVarJ9, c0387a) == objE) {
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

        public f(mu.g gVar, k kVar) {
            this.f16222a = gVar;
            this.f16223b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super b22.c.a> hVar, tq.e eVar) {
            Object objA = this.f16222a.a(new a(hVar, this.f16223b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb22/a$a;", "<unused var>", "Lb22/b;", "Loq/i0;", "<anonymous>", "(Lb22/a$a;Lb22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.C0382a, b22.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16234e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f16234e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.g> bVarY1 = k.this.Y1();
                a.g.C0383a c0383a = a.g.C0383a.f16152a;
                this.f16234e = 1;
                if (bVarY1.F(c0383a, this) == objE) {
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
        public final Object w(a.C0382a c0382a, b22.b bVar, tq.e<? super i0> eVar) {
            return k.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb22/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lb22/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<b22.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16236e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f16236e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.d9(new a.FetchResults(null));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(b22.b.Initialized initialized, tq.e<? super i0> eVar) {
            return ((h) v(initialized, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return k.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb22/a$c;", "<unused var>", "Lb22/b$b;", "Loq/i0;", "<anonymous>", "(Lb22/a$c;Lb22/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<b22.a.FetchResults, b22.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16240g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f16242a;

            a(k kVar) {
                this.f16242a = kVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(n0<RecipientResult> n0Var, tq.e<? super i0> eVar) {
                Object value;
                b0 b0Var = this.f16242a._resultsPagingData;
                do {
                    value = b0Var.getValue();
                } while (!b0Var.s(value, n0Var));
                return i0.f148189a;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f16240g;
            if (i15 == 0) {
                u.b(obj);
                SearchRequest searchRequest = k.this.setupData.getSearchRequest();
                if (searchRequest != null) {
                    k kVar = k.this;
                    mu.g gVarA = ja.d.a(kVar.C9(searchRequest), u0.a(kVar));
                    a aVar = new a(kVar);
                    this.f16238e = vq.j.a(searchRequest);
                    this.f16239f = 0;
                    this.f16240g = 1;
                    if (gVarA.a(aVar, this) == objE) {
                        return objE;
                    }
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
        public final Object w(b22.a.FetchResults fetchResults, b22.b.Initialized initialized, tq.e<? super i0> eVar) {
            return k.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb22/a$d;", "action", "Lb22/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb22/a$d;Lb22/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.GoToAuthorization, b22.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16244f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(k kVar, a.GoToAuthorization goToAuthorization) {
            kVar.d9(goToAuthorization.getAction());
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.GoToAuthorization goToAuthorization = (a.GoToAuthorization) this.f16244f;
            Object objE = uq.b.e();
            int i15 = this.f16243e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.g> bVarY1 = k.this.Y1();
                final k kVar = k.this;
                a.g.GoToAuthorization goToAuthorization2 = new a.g.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: b22.o
                    @Override // er.a
                    public final Object a() {
                        return k.j.O(kVar, goToAuthorization);
                    }
                }));
                this.f16244f = vq.j.a(goToAuthorization);
                this.f16243e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
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
        public final Object w(a.GoToAuthorization goToAuthorization, b22.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = k.this.new j(eVar);
            jVar.f16244f = goToAuthorization;
            return jVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: b22.k$k, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb22/a$b;", "action", "Lk10/c0;", "Lb22/b$b;", "state", "Lk10/l;", "Lb22/b;", "<anonymous>", "(Lb22/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C0388k extends vq.k implements er.q<a.Error, c0<b22.b.Initialized>, tq.e<? super k10.l<? extends b22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f16248g;

        C0388k(tq.e<? super C0388k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b22.b.Error O(k kVar, a.Error error, b22.b.Initialized initialized) {
            return new b22.b.Error(null, kVar.errorVMSFactory.a(error.getErrorData()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.Error error = (a.Error) this.f16247f;
            c0 c0Var = (c0) this.f16248g;
            uq.b.e();
            if (this.f16246e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final k kVar = k.this;
            return c0Var.d(new er.l() { // from class: b22.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.C0388k.O(kVar, error, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.Error error, c0<b22.b.Initialized> c0Var, tq.e<? super k10.l<? extends b22.b>> eVar) {
            C0388k c0388k = k.this.new C0388k(eVar);
            c0388k.f16247f = error;
            c0388k.f16248g = c0Var;
            return c0388k.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb22/a$e;", "<unused var>", "Lb22/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lb22/a$e;Lb22/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.e, b22.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16252g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f16253h;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b22.b.Initialized initialized = (b22.b.Initialized) this.f16253h;
            Object objE = uq.b.e();
            int i15 = this.f16252g;
            if (i15 == 0) {
                u.b(obj);
                SearchRequest searchRequest = initialized.getSearchRequest();
                if (searchRequest != null) {
                    k kVar = k.this;
                    a.g.GoToDetails goToDetails = new a.g.GoToDetails(new SetupData(new y22.c.Query(searchRequest)));
                    this.f16253h = vq.j.a(initialized);
                    this.f16250e = vq.j.a(searchRequest);
                    this.f16251f = 0;
                    this.f16252g = 1;
                    if (kVar.F(goToDetails, this) == objE) {
                        return objE;
                    }
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
        public final Object w(a.e eVar, b22.b.Initialized initialized, tq.e<? super i0> eVar2) {
            l lVar = k.this.new l(eVar2);
            lVar.f16253h = initialized;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb22/a$f;", "action", "Lb22/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb22/a$f;Lb22/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a.GoToResultDetails, b22.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16256f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.GoToResultDetails goToResultDetails = (a.GoToResultDetails) this.f16256f;
            Object objE = uq.b.e();
            int i15 = this.f16255e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<a.g> bVarY1 = k.this.Y1();
                a.g.GoToDetails goToDetails = new a.g.GoToDetails(new SetupData(new y22.c.Result(goToResultDetails.getRecipientInfo())));
                this.f16256f = vq.j.a(goToResultDetails);
                this.f16255e = 1;
                if (bVarY1.F(goToDetails, this) == objE) {
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
        public final Object w(a.GoToResultDetails goToResultDetails, b22.b.Initialized initialized, tq.e<? super i0> eVar) {
            m mVar = k.this.new m(eVar);
            mVar.f16256f = goToResultDetails;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb22/a$i;", "action", "Lb22/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb22/a$i;Lb22/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a.SaveRecipient, b22.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16259f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.SaveRecipient saveRecipient = (a.SaveRecipient) this.f16259f;
            Object objE = uq.b.e();
            int i15 = this.f16258e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                this.f16259f = vq.j.a(saveRecipient);
                this.f16258e = 1;
                if (kVar.A9(saveRecipient, this) == objE) {
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
        public final Object w(a.SaveRecipient saveRecipient, b22.b.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = k.this.new n(eVar);
            nVar.f16259f = saveRecipient;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb22/a$h;", "action", "Lb22/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb22/a$h;Lb22/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<a.RecipientClick, b22.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f16261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f16263g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.RecipientClick recipientClick = (a.RecipientClick) this.f16263g;
            Object objE = uq.b.e();
            int i15 = this.f16262f;
            if (i15 == 0) {
                u.b(obj);
                RecipientInfo recipientInfo = recipientClick.getRecipientResult().getRecipientInfo();
                b1 warningType = recipientInfo != null ? recipientInfo.getWarningType() : null;
                if ((warningType instanceof b1.Blocking) || (warningType instanceof b1.NotBlocking)) {
                    xw.b<a.g> bVarY1 = k.this.Y1();
                    a.g.GoToDialog goToDialog = new a.g.GoToDialog(k.this.resultWarningDialogMapper.b(new c12.j.Params(warningType, k.this.b9(new a.SaveRecipient(recipientClick.getRecipientResult())))));
                    this.f16263g = vq.j.a(recipientClick);
                    this.f16261e = vq.j.a(warningType);
                    this.f16262f = 1;
                    if (bVarY1.F(goToDialog, this) == objE) {
                        return objE;
                    }
                } else {
                    if (warningType != null) {
                        throw new oq.p();
                    }
                    k.this.d9(new a.SaveRecipient(recipientClick.getRecipientResult()));
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
        public final Object w(a.RecipientClick recipientClick, b22.b.Initialized initialized, tq.e<? super i0> eVar) {
            o oVar = k.this.new o(eVar);
            oVar.f16263g = recipientClick;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lb22/a$c;", "<unused var>", "Lk10/c0;", "Lb22/b$a;", "state", "Lk10/l;", "Lb22/b;", "<anonymous>", "(Lb22/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.FetchResults, c0<b22.b.Error>, tq.e<? super k10.l<? extends b22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16266f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b22.b.Initialized O(c0 c0Var, b22.b.Error error) {
            return new b22.b.Initialized(((b22.b.Error) c0Var.a()).getSearchRequest());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f16266f;
            uq.b.e();
            if (this.f16265e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: b22.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.p.O(c0Var, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.FetchResults fetchResults, c0<b22.b.Error> c0Var, tq.e<? super k10.l<? extends b22.b>> eVar) {
            p pVar = new p(eVar);
            pVar.f16266f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n"}, d2 = {"", "T", "item", "Lpq/p0;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class q<T> extends vq.k implements er.p<T, tq.e<? super IndexedValue<? extends T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f16268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.n0 f16269g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(fr.n0 n0Var, tq.e<? super q> eVar) {
            super(2, eVar);
            this.f16269g = n0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object obj2 = this.f16268f;
            uq.b.e();
            if (this.f16267e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            fr.n0 n0Var = this.f16269g;
            int i15 = n0Var.f66407a;
            n0Var.f66407a = i15 + 1;
            return new IndexedValue(i15, obj2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(T t15, tq.e<? super IndexedValue<? extends T>> eVar) {
            return ((q) v(t15, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            q qVar = new q(this.f16269g, eVar);
            qVar.f16268f = obj;
            return qVar;
        }
    }

    public k(yy.a aVar, c22.a aVar2, p02.a aVar3, b12.c cVar, c12.j jVar, x02.b bVar, b32.c cVar2, c22.g gVar, hb4.d dVar, SetupData setupData) {
        this.mapper = aVar2;
        this.advancedSearchRecipientUC = aVar3;
        this.electronicDeliveryErrorMapper = cVar;
        this.resultWarningDialogMapper = jVar;
        this.addRecipientWithServiceTypeValidationUC = bVar;
        this.searchRecipientDialogMapper = cVar2;
        this.singleCardResultMapper = gVar;
        this.errorVMSFactory = dVar;
        this.setupData = setupData;
        b22.b.Initialized initialized = new b22.b.Initialized(setupData.getSearchRequest());
        this.initialState = initialized;
        b0<n0<RecipientResult>> b0VarA = r0.a(n0.INSTANCE.c());
        this._resultsPagingData = b0VarA;
        this.resultsPagingData = new e(b0VarA, this);
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: b22.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.L9(this.f16175a, (k10.v) obj);
            }
        });
        this.state = a9(new f(e9().getState(), this), J9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (E9(r2, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (r4.F(r6, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A9(b22.a.SaveRecipient r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b22.k.A9(b22.a$i, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mu.g<n0<RecipientResult>> C9(final SearchRequest request) {
        return new l0(new m0(20, 0, false, 0, 0, 0, 62, null), null, new er.a() { // from class: b22.g
            @Override // er.a
            public final Object a() {
                return k.D9(this.f16171a, request);
            }
        }, 2, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 D9(k kVar, SearchRequest searchRequest) {
        return kVar.new c(searchRequest);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    private final Object E9(dx.b bVar, a aVar, tq.e<? super i0> eVar) {
        boolean z15 = bVar instanceof dx.b.Business;
        if (z15) {
            dx.b.Business business = (dx.b.Business) bVar;
            if (business.getType() == n02.a.ADD_RECIPIENT_NO_EDOR_ADDRESS || business.getType() == n02.a.ADD_RECIPIENT_NO_EPUAP_ADDRESS || business.getType() == n02.a.ADD_RECIPIENT_E_PUAP) {
                d9(new a.ShowDialog(this.searchRecipientDialogMapper.b(new b32.c.Params(business))));
            } else {
                if (!z15 && ((dx.b.Business) bVar).getType() == n02.a.ADD_RECIPIENT_EXISTS) {
                    Object objF = Y1().F(a.g.e.f16156a, eVar);
                    return objF == uq.b.e() ? objF : i0.f148189a;
                }
                this.electronicDeliveryErrorMapper.c(new b12.c.Params(bVar, b9(new a.GoToAuthorization(aVar)), b9(a.C0382a.f16146a), b9(aVar), new er.l() { // from class: b22.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.F9(this.f16173a, (jb4.b) obj);
                    }
                }));
            }
        } else {
            if (!z15) {
            }
            this.electronicDeliveryErrorMapper.c(new b12.c.Params(bVar, b9(new a.GoToAuthorization(aVar)), b9(a.C0382a.f16146a), b9(aVar), new er.l() { // from class: b22.h
                @Override // er.l
                public final Object b(Object obj) {
                    return k.F9(this.f16173a, (jb4.b) obj);
                }
            }));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(k kVar, jb4.b bVar) {
        kVar.d9(new a.Error(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G9(dx.b bVar, a aVar) {
        this.electronicDeliveryErrorMapper.c(new b12.c.Params(bVar, b9(new a.GoToAuthorization(aVar)), b9(a.C0382a.f16146a), b9(aVar), new er.l() { // from class: b22.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.H9(this.f16174a, (jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(k kVar, jb4.b bVar) {
        kVar.d9(new a.Error(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0<n50.k> I9(n0<RecipientResult> pagingSourceData) {
        return ja.u0.c(P9(pagingSourceData), new d(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b22.c.a J9(b22.b state) {
        return this.mapper.b(new c22.a.Params(state, b9(a.e.f16150a), b9(a.C0382a.f16146a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(final k kVar, k10.v vVar) {
        vVar.c(q0.c(b22.b.class), new er.l() { // from class: b22.d
            @Override // er.l
            public final Object b(Object obj) {
                return k.M9(this.f16169a, (z) obj);
            }
        });
        vVar.c(q0.c(b22.b.Initialized.class), new er.l() { // from class: b22.e
            @Override // er.l
            public final Object b(Object obj) {
                return k.N9(this.f16170a, (z) obj);
            }
        });
        vVar.c(q0.c(b22.b.Error.class), new er.l() { // from class: b22.f
            @Override // er.l
            public final Object b(Object obj) {
                return k.O9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(k kVar, z zVar) {
        g gVar = kVar.new g(null);
        zVar.x(q0.c(a.C0382a.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(k kVar, z zVar) {
        zVar.C(kVar.new h(null));
        i iVar = kVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.FetchResults.class), oVar, iVar);
        zVar.x(q0.c(a.GoToAuthorization.class), oVar, kVar.new j(null));
        zVar.v(q0.c(a.Error.class), oVar, kVar.new C0388k(null));
        zVar.x(q0.c(a.e.class), oVar, kVar.new l(null));
        zVar.x(q0.c(a.GoToResultDetails.class), oVar, kVar.new m(null));
        zVar.x(q0.c(a.SaveRecipient.class), oVar, kVar.new n(null));
        zVar.x(q0.c(a.RecipientClick.class), oVar, kVar.new o(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(z zVar) {
        p pVar = new p(null);
        zVar.v(q0.c(a.FetchResults.class), k10.o.CANCEL_PREVIOUS, pVar);
        return i0.f148189a;
    }

    private final <T> n0<IndexedValue<T>> P9(n0<T> n0Var) {
        return ja.u0.c(n0Var, new q(new fr.n0(), null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.g gVar, tq.e<? super i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<b22.b, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<b22.c.a> getState() {
        return this.state;
    }

    @Override // b22.c
    public mu.g<n0<n50.k>> z8() {
        return this.resultsPagingData;
    }
}
