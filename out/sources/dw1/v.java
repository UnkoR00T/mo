package dw1;

import androidx.p016lifecycle.u0;
import cb4.DialogData;
import fr.q0;
import java.util.List;
import mu.p0;
import mv1.Document;
import mv1.DynamicDocumentData;
import n20.State;
import o20.t2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import wv1.BitmapsByFieldReference;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007B£\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\b\u0001\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020+H\u0016¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000200H\u0096\u0001¢\u0006\u0004\b7\u00108J*\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u0006\u0010:\u001a\u0002092\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;H\u0082@¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u0002002\u0006\u0010<\u001a\u00020>H\u0082@¢\u0006\u0004\bA\u0010BJ*\u0010G\u001a\u0002002\u0006\u0010:\u001a\u0002092\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0082@¢\u0006\u0004\bG\u0010HJ\u001e\u0010K\u001a\u0002002\f\u0010J\u001a\b\u0012\u0004\u0012\u0002000IH\u0082@¢\u0006\u0004\bK\u0010LJ$\u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u0002000M2\u0006\u0010:\u001a\u000209H\u0082@¢\u0006\u0004\bO\u0010PJ$\u0010U\u001a\u0002002\u0006\u0010R\u001a\u00020Q2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010SH\u0082@¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u00020W*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u000200H\u0002¢\u0006\u0004\bZ\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R2\u0010\u0088\u0001\u001a\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0083\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u008e\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b5\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R%\u0010<\u001a\t\u0012\u0004\u0012\u00020W0\u008f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bi\u0010\u0096\u0001¨\u0006\u0098\u0001"}, d2 = {"Ldw1/v;", "Ll00/g;", "Ln20/b;", "Ldw1/i;", "Ln20/a;", "Ldw1/j;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lpv1/e;", "getDynamicDocumentDataUseCase", "Lpv1/a;", "getByIdDynamicDocumentDataUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "domainErrorMapper", "Lkv1/a;", "dynamicDocumentContainersInteractor", "snackBarManagerStateHolder", "Lew1/e;", "dynamicDocumentScreenMapper", "La14/w;", "openUrlIntentUseCase", "Lez/c;", "dateConverter", "Lez/a;", "currentTimeProvider", "Lew1/b;", "dynamicDocumentDialogMapper", "Lo20/t2$a;", "deps", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lh64/r;", "loadServicesUseCase", "Ltv1/a;", "dynamicDocumentBitmapDecoder", "Ldw1/h;", "setupData", "<init>", "(Ln20/j;Lmx/c;Lpv1/e;Lpv1/a;Lac4/a;Lib4/c;Lkv1/a;Li70/n;Lew1/e;La14/w;Lez/c;Lez/a;Lew1/b;Lo20/t2$a;Lmz3/z;Lmz3/w;Lh64/r;Ltv1/a;Ldw1/h;)V", "data", "Loq/i0;", "R9", "(Ldw1/h;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "Lrq0/b$b;", "dynamicDocumentType", "Lk10/c0;", "state", "Lk10/l;", "Ldw1/i$a;", "E9", "(Lrq0/b$b;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "H9", "(Ldw1/i$a;Ltq/e;)Ljava/lang/Object;", "Lmz3/z$b;", "methodType", "", "documentId", "Y9", "(Lrq0/b$b;Lmz3/z$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onSuccess", "Q9", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "D9", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "Lwv1/c;", "error", "Ldw1/g;", "closeAction", "I9", "(Lwv1/c;Ldw1/g;Ltq/e;)Ljava/lang/Object;", "Ldw1/j$a;", "L9", "(Ln20/b;)Ldw1/j$a;", "S9", "b", "Lmx/c;", "c", "Lpv1/e;", "d", "Lpv1/a;", "e", "Lac4/a;", "f", "Lib4/c;", "g", "Lkv1/a;", "h", "Li70/n;", "j", "Lew1/e;", "k", "La14/w;", "l", "Lez/c;", "m", "Lez/a;", "n", "Lew1/b;", "p", "Lo20/t2$a;", "q", "Lmz3/z;", "r", "Lmz3/w;", "s", "Lh64/r;", "t", "Ltv1/a;", "v", "Ldw1/h;", "Ldw1/i$c;", "w", "Ldw1/i$c;", "initialState", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ldw1/g$g;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<State<dw1.i>, n20.a> implements dw1.j, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pv1.e getDynamicDocumentDataUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pv1.a getByIdDynamicDocumentDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ew1.e dynamicDocumentScreenMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ew1.b dynamicDocumentDialogMapper;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final tv1.a dynamicDocumentBitmapDecoder;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final dw1.h setupData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final dw1.i.c initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<dw1.i>, n20.a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dw1.g.InterfaceC1019g> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p0<dw1.j.a> state;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44830e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ rq0.b.EnumC4479b f44832g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rq0.b.EnumC4479b enumC4479b, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f44832g = enumC4479b;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String documentIID;
            Object objE = uq.b.e();
            int i15 = this.f44830e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            kv1.a aVar = v.this.dynamicDocumentContainersInteractor;
            dw1.h hVar = v.this.setupData;
            if (hVar instanceof dw1.h.DocumentByType) {
                documentIID = null;
            } else {
                if (!(hVar instanceof dw1.h.DocumentById)) {
                    throw new oq.p();
                }
                documentIID = ((dw1.h.DocumentById) v.this.setupData).getDocumentIID();
            }
            rq0.b.EnumC4479b enumC4479b = this.f44832g;
            this.f44830e = 1;
            Object objB = aVar.b(documentIID, enumC4479b, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new a(this.f44832g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f44833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f44834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f44835f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f44836g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f44837h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f44838j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f44839k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f44840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f44841m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f44842n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f44843p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f44844q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f44845r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f44846s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f44847t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f44848v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f44850x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f44848v = obj;
            this.f44850x |= PKIFailureInfo.systemUnavail;
            return v.this.E9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<i0> {
        c(Object obj) {
            super(0, obj, v.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f44851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f44852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f44853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f44854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f44855h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f44856j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f44858l;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f44856j = obj;
            this.f44858l |= PKIFailureInfo.systemUnavail;
            return v.this.Q9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44859e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dw1.h f44861g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(dw1.h hVar, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f44861g = hVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f44859e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(new dw1.g.Setup(this.f44861g.getDynamicDocumentType()));
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return v.this.new e(this.f44861g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<dw1.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f44863b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f44865b;

            /* JADX INFO: renamed from: dw1.v$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1022a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44866d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44867e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44868f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44870h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44871j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44872k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44873l;

                public C1022a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44866d = obj;
                    this.f44867e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f44864a = hVar;
                this.f44865b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1022a c1022a;
                if (eVar instanceof C1022a) {
                    c1022a = (C1022a) eVar;
                    int i15 = c1022a.f44867e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1022a.f44867e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1022a = new C1022a(eVar);
                    }
                } else {
                    c1022a = new C1022a(eVar);
                }
                Object obj2 = c1022a.f44866d;
                Object objE = uq.b.e();
                int i16 = c1022a.f44867e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f44864a;
                    dw1.j.a aVarL9 = this.f44865b.L9((State) obj);
                    c1022a.f44868f = vq.j.a(obj);
                    c1022a.f44870h = vq.j.a(c1022a);
                    c1022a.f44871j = vq.j.a(obj);
                    c1022a.f44872k = vq.j.a(hVar);
                    c1022a.f44873l = 0;
                    c1022a.f44867e = 1;
                    if (hVar.F(aVarL9, c1022a) == objE) {
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

        public f(mu.g gVar, v vVar) {
            this.f44862a = gVar;
            this.f44863b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dw1.j.a> hVar, tq.e eVar) {
            Object objA = this.f44862a.a(new a(hVar, this.f44863b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldw1/g$a;", "<unused var>", "Ldw1/i;", "Loq/i0;", "<anonymous>", "(Ldw1/g$a;Ldw1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dw1.g.a, dw1.i, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44874e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0061  */
        /* JADX WARN: Code duplicated, block: B:23:0x0065  */
        /* JADX WARN: Code duplicated, block: B:26:0x0073  */
        /* JADX WARN: Code duplicated, block: B:29:0x0080  */
        /* JADX WARN: Code duplicated, block: B:32:0x008d  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        
            if (r7.F(r1, r6) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
        
            if (r7.F(r1, r6) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
        
            if (r7.F(r1, r6) == r0) goto L38;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f44874e
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L26
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                oq.u.b(r7)
                goto La4
            L22:
                oq.u.b(r7)
                goto L4e
            L26:
                oq.u.b(r7)
                dw1.v r7 = dw1.v.this
                dw1.h r7 = dw1.v.x9(r7)
                boolean r1 = r7 instanceof dw1.h.DocumentById
                if (r1 == 0) goto L93
                dw1.v r7 = dw1.v.this
                kv1.a r7 = dw1.v.v9(r7)
                dw1.v r1 = dw1.v.this
                dw1.h r1 = dw1.v.x9(r1)
                dw1.h$a r1 = (dw1.h.DocumentById) r1
                rq0.b$b r1 = r1.getDynamicDocumentType()
                r6.f44874e = r5
                java.lang.Object r7 = r7.g(r1, r6)
                if (r7 != r0) goto L4e
                goto La3
            L4e:
                dx.i r7 = (dx.i) r7
                boolean r1 = r7 instanceof dx.i.Left
                if (r1 == 0) goto L61
                dx.i$b r7 = (dx.i.Left) r7
                java.lang.Object r7 = r7.b()
                dx.b r7 = (dx.b) r7
                java.lang.Boolean r7 = vq.b.a(r5)
                goto L6b
            L61:
                boolean r1 = r7 instanceof dx.i.Right
                if (r1 == 0) goto L8d
                dx.i$c r7 = (dx.i.Right) r7
                java.lang.Object r7 = r7.b()
            L6b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L80
                dw1.v r7 = dw1.v.this
                dw1.g$g$g r1 = dw1.g.InterfaceC1019g.C1020g.f44763a
                r6.f44874e = r4
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto La4
                goto La3
            L80:
                dw1.v r7 = dw1.v.this
                dw1.g$g$a r1 = dw1.g.InterfaceC1019g.a.f44756a
                r6.f44874e = r3
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto La4
                goto La3
            L8d:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L93:
                boolean r7 = r7 instanceof dw1.h.DocumentByType
                if (r7 == 0) goto La7
                dw1.v r7 = dw1.v.this
                dw1.g$g$a r1 = dw1.g.InterfaceC1019g.a.f44756a
                r6.f44874e = r2
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto La4
            La3:
                return r0
            La4:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            La7:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dw1.v.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.a aVar, dw1.i iVar, tq.e<? super i0> eVar) {
            return v.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldw1/g$c;", "<unused var>", "Ldw1/i;", "state", "Loq/i0;", "<anonymous>", "(Ldw1/g$c;Ldw1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dw1.g.c, dw1.i, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f44876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f44877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f44878g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f44879h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f44880j;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rq0.b.EnumC4479b dynamicDocumentType;
            v vVar;
            dw1.i iVar = (dw1.i) this.f44880j;
            Object objE = uq.b.e();
            int i15 = this.f44879h;
            if (i15 == 0) {
                oq.u.b(obj);
                if (fr.t.c(iVar, dw1.i.c.f44783a)) {
                    dynamicDocumentType = null;
                } else if (iVar instanceof dw1.i.Initialized) {
                    dynamicDocumentType = ((dw1.i.Initialized) iVar).getDynamicDocumentType();
                } else {
                    if (!(iVar instanceof dw1.i.Loading)) {
                        throw new oq.p();
                    }
                    dynamicDocumentType = ((dw1.i.Loading) iVar).getDynamicDocumentType();
                }
                if (dynamicDocumentType != null) {
                    v vVar2 = v.this;
                    this.f44880j = vq.j.a(iVar);
                    this.f44876e = vVar2;
                    this.f44877f = vq.j.a(dynamicDocumentType);
                    this.f44878g = 0;
                    this.f44879h = 1;
                    if (vVar2.D9(dynamicDocumentType, this) == objE) {
                        return objE;
                    }
                    vVar = vVar2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) this.f44876e;
            oq.u.b(obj);
            vVar.d9(dw1.g.a.f44750a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.c cVar, dw1.i iVar, tq.e<? super i0> eVar) {
            h hVar = v.this.new h(eVar);
            hVar.f44880j = iVar;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldw1/g$j;", "action", "Lk10/c0;", "Ldw1/i$c;", "state", "Lk10/l;", "Ldw1/i;", "<anonymous>", "(Ldw1/g$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<dw1.g.Setup, k10.c0<dw1.i.c>, tq.e<? super k10.l<? extends dw1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f44882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f44883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f44885h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dw1.i.Loading O(dw1.g.Setup setup, dw1.i.c cVar) {
            return new dw1.i.Loading(setup.getDynamicDocumentType());
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
        
            if (r3.F(r5, r8) == r2) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f44884g
                dw1.g$j r0 = (dw1.g.Setup) r0
                java.lang.Object r1 = r8.f44885h
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f44883f
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2b
                if (r3 == r5) goto L27
                if (r3 != r4) goto L1f
                java.lang.Object r0 = r8.f44882e
                java.lang.String r0 = (java.lang.String) r0
                oq.u.b(r9)
                goto L97
            L1f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L27:
                oq.u.b(r9)
                goto L4a
            L2b:
                oq.u.b(r9)
                dw1.v r9 = dw1.v.this
                mz3.w r9 = dw1.v.y9(r9)
                mz3.w$a r3 = new mz3.w$a
                rq0.b$b r6 = r0.getDynamicDocumentType()
                r3.<init>(r6)
                r8.f44884g = r0
                r8.f44885h = r1
                r8.f44883f = r5
                java.lang.Object r9 = r9.c(r3, r8)
                if (r9 != r2) goto L4a
                goto L96
            L4a:
                mz3.w$b r9 = (mz3.w.b) r9
                boolean r3 = r9 instanceof mz3.w.b.NotReady
                if (r3 == 0) goto La2
                dw1.v r9 = dw1.v.this
                dw1.h r9 = dw1.v.x9(r9)
                boolean r3 = r9 instanceof dw1.h.DocumentById
                if (r3 == 0) goto L67
                dw1.v r9 = dw1.v.this
                dw1.h r9 = dw1.v.x9(r9)
                dw1.h$a r9 = (dw1.h.DocumentById) r9
                java.lang.String r9 = r9.getDocumentIID()
                goto L6c
            L67:
                boolean r9 = r9 instanceof dw1.h.DocumentByType
                if (r9 == 0) goto L9c
                r9 = 0
            L6c:
                dw1.v r3 = dw1.v.this
                xw.b r3 = r3.Y1()
                dw1.g$g$e r5 = new dw1.g$g$e
                gv3.b$b r6 = new gv3.b$b
                rq0.b$b r7 = r0.getDynamicDocumentType()
                r6.<init>(r7, r9)
                r5.<init>(r6)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f44884g = r0
                r8.f44885h = r1
                java.lang.Object r9 = vq.j.a(r9)
                r8.f44882e = r9
                r8.f44883f = r4
                java.lang.Object r9 = r3.F(r5, r8)
                if (r9 != r2) goto L97
            L96:
                return r2
            L97:
                k10.l r9 = r1.c()
                return r9
            L9c:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            La2:
                mz3.w$b$b r2 = mz3.w.b.C3231b.f129717a
                boolean r9 = fr.t.c(r9, r2)
                if (r9 == 0) goto Lb4
                dw1.w r9 = new dw1.w
                r9.<init>()
                k10.l r9 = r1.d(r9)
                return r9
            Lb4:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: dw1.v.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.Setup setup, k10.c0<dw1.i.c> c0Var, tq.e<? super k10.l<? extends dw1.i>> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f44884g = setup;
            iVar.f44885h = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldw1/i$b;", "it", "Loq/i0;", "<anonymous>", "(Ldw1/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<dw1.i.Loading, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44887e;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f44887e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(dw1.g.d.f44753a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dw1.i.Loading loading, tq.e<? super i0> eVar) {
            return ((j) v(loading, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldw1/g$d;", "<unused var>", "Lk10/c0;", "Ldw1/i$b;", "state", "Lk10/l;", "Ldw1/i;", "<anonymous>", "(Ldw1/g$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dw1.g.d, k10.c0<dw1.i.Loading>, tq.e<? super k10.l<? extends dw1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44890f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ldw1/i$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends dw1.i.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f44892e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k10.c0<dw1.i.Loading> f44893f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ v f44894g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<dw1.i.Loading> c0Var, v vVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f44893f = c0Var;
                this.f44894g = vVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f44892e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                rq0.b.EnumC4479b dynamicDocumentType = this.f44893f.a().getDynamicDocumentType();
                v vVar = this.f44894g;
                k10.c0<dw1.i.Loading> c0Var = this.f44893f;
                this.f44892e = 1;
                Object objE9 = vVar.E9(dynamicDocumentType, c0Var, this);
                return objE9 == objE ? objE : objE9;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f44893f, this.f44894g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<dw1.i.Initialized>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f44890f;
            Object objE = uq.b.e();
            int i15 = this.f44889e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, v.this, null);
            this.f44890f = vq.j.a(c0Var);
            this.f44889e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.d dVar, k10.c0<dw1.i.Loading> c0Var, tq.e<? super k10.l<? extends dw1.i>> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f44890f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldw1/g$m;", "action", "Ldw1/i$a;", "state", "Loq/i0;", "<anonymous>", "(Ldw1/g$m;Ldw1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<dw1.g.UpdateDocumentWithTimer, dw1.i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44897g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f44899e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f44900f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ dw1.i.Initialized f44901g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ dw1.g.UpdateDocumentWithTimer f44902h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, dw1.i.Initialized initialized, dw1.g.UpdateDocumentWithTimer updateDocumentWithTimer, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f44900f = vVar;
                this.f44901g = initialized;
                this.f44902h = updateDocumentWithTimer;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                String documentId;
                Object objE = uq.b.e();
                int i15 = this.f44899e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v vVar = this.f44900f;
                    rq0.b.EnumC4479b dynamicDocumentType = this.f44901g.getDynamicDocumentType();
                    mz3.z.b methodType = this.f44902h.getMethodType();
                    dw1.h hVar = this.f44900f.setupData;
                    if (hVar instanceof dw1.h.DocumentById) {
                        documentId = ((dw1.h.DocumentById) this.f44900f.setupData).getDocumentIID();
                    } else {
                        if (!(hVar instanceof dw1.h.DocumentByType)) {
                            throw new oq.p();
                        }
                        Document document = this.f44901g.getData().getDocument();
                        documentId = document != null ? document.getDocumentId() : null;
                    }
                    this.f44899e = 1;
                    if (vVar.Y9(dynamicDocumentType, methodType, documentId, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f44900f, this.f44901g, this.f44902h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dw1.g.UpdateDocumentWithTimer updateDocumentWithTimer = (dw1.g.UpdateDocumentWithTimer) this.f44896f;
            dw1.i.Initialized initialized = (dw1.i.Initialized) this.f44897g;
            Object objE = uq.b.e();
            int i15 = this.f44895e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = v.this.callActionWithLoaderUseCase;
                a aVar2 = new a(v.this, initialized, updateDocumentWithTimer, null);
                this.f44896f = vq.j.a(updateDocumentWithTimer);
                this.f44897g = vq.j.a(initialized);
                this.f44895e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(dw1.g.UpdateDocumentWithTimer updateDocumentWithTimer, dw1.i.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = v.this.new l(eVar);
            lVar.f44896f = updateDocumentWithTimer;
            lVar.f44897g = initialized;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldw1/g$h;", "action", "Ldw1/i$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldw1/g$h;Ldw1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<dw1.g.OpenUrl, dw1.i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44904f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dw1.g.OpenUrl openUrl = (dw1.g.OpenUrl) this.f44904f;
            Object objE = uq.b.e();
            int i15 = this.f44903e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = v.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f44904f = vq.j.a(openUrl);
                this.f44903e = 1;
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
            v vVar = v.this;
            if (iVar instanceof dx.i.Left) {
                vVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.OpenUrl openUrl, dw1.i.Initialized initialized, tq.e<? super i0> eVar) {
            m mVar = v.this.new m(eVar);
            mVar.f44904f = openUrl;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldw1/g$d;", "<unused var>", "Lk10/c0;", "Ldw1/i$a;", "state", "Lk10/l;", "Ldw1/i;", "<anonymous>", "(Ldw1/g$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<dw1.g.d, k10.c0<dw1.i.Initialized>, tq.e<? super k10.l<? extends dw1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44907f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ldw1/i$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends dw1.i.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f44909e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k10.c0<dw1.i.Initialized> f44910f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ v f44911g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<dw1.i.Initialized> c0Var, v vVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f44910f = c0Var;
                this.f44911g = vVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f44909e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                rq0.b.EnumC4479b dynamicDocumentType = this.f44910f.a().getDynamicDocumentType();
                v vVar = this.f44911g;
                k10.c0<dw1.i.Initialized> c0Var = this.f44910f;
                this.f44909e = 1;
                Object objE9 = vVar.E9(dynamicDocumentType, c0Var, this);
                return objE9 == objE ? objE : objE9;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f44910f, this.f44911g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<dw1.i.Initialized>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f44907f;
            Object objE = uq.b.e();
            int i15 = this.f44906e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, v.this, null);
            this.f44907f = vq.j.a(c0Var);
            this.f44906e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.d dVar, k10.c0<dw1.i.Initialized> c0Var, tq.e<? super k10.l<? extends dw1.i>> eVar) {
            n nVar = v.this.new n(eVar);
            nVar.f44907f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldw1/g$f;", "<unused var>", "Ldw1/i$a;", "state", "Loq/i0;", "<anonymous>", "(Ldw1/g$f;Ldw1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<dw1.g.f, dw1.i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44913f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dw1.i.Initialized initialized = (dw1.i.Initialized) this.f44913f;
            Object objE = uq.b.e();
            int i15 = this.f44912e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                this.f44913f = vq.j.a(initialized);
                this.f44912e = 1;
                if (vVar.H9(initialized, this) == objE) {
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
        public final Object w(dw1.g.f fVar, dw1.i.Initialized initialized, tq.e<? super i0> eVar) {
            o oVar = v.this.new o(eVar);
            oVar.f44913f = initialized;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldw1/g$l;", "action", "Ldw1/i$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldw1/g$l;Ldw1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<dw1.g.ShowDialog, dw1.i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44916f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dw1.g.ShowDialog showDialog = (dw1.g.ShowDialog) this.f44916f;
            Object objE = uq.b.e();
            int i15 = this.f44915e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<dw1.g.InterfaceC1019g> bVarY1 = v.this.Y1();
                dw1.g.InterfaceC1019g.ShowDialog showDialog2 = new dw1.g.InterfaceC1019g.ShowDialog(showDialog.getModel());
                this.f44916f = vq.j.a(showDialog);
                this.f44915e = 1;
                if (bVarY1.F(showDialog2, this) == objE) {
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
        public final Object w(dw1.g.ShowDialog showDialog, dw1.i.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = v.this.new p(eVar);
            pVar.f44916f = showDialog;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldw1/g$k;", "<unused var>", "Ldw1/i$a;", "state", "Loq/i0;", "<anonymous>", "(Ldw1/g$k;Ldw1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<dw1.g.k, dw1.i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44919f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(v vVar) {
            vVar.d9(dw1.g.c.f44752a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dw1.i.Initialized initialized = (dw1.i.Initialized) this.f44919f;
            Object objE = uq.b.e();
            int i15 = this.f44918e;
            if (i15 == 0) {
                oq.u.b(obj);
                kv1.a aVar = v.this.dynamicDocumentContainersInteractor;
                rq0.b.EnumC4479b dynamicDocumentType = initialized.getDynamicDocumentType();
                final v vVar = v.this;
                er.a<i0> aVar2 = new er.a() { // from class: dw1.x
                    @Override // er.a
                    public final Object a() {
                        return v.q.O(vVar);
                    }
                };
                this.f44919f = vq.j.a(initialized);
                this.f44918e = 1;
                obj = aVar.f(dynamicDocumentType, aVar2, this);
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
            v vVar2 = v.this;
            if (iVar instanceof dx.i.Right) {
                vVar2.d9(new dw1.g.ShowDialog((DialogData) ((dx.i.Right) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.k kVar, dw1.i.Initialized initialized, tq.e<? super i0> eVar) {
            q qVar = v.this.new q(eVar);
            qVar.f44919f = initialized;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldw1/g$i;", "action", "Ldw1/i$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldw1/g$i;Ldw1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<dw1.g.RefreshDocumentsStatuses, dw1.i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44922f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(v vVar, dw1.g.RefreshDocumentsStatuses refreshDocumentsStatuses) {
            vVar.d9(refreshDocumentsStatuses.getSuccessAction());
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dw1.g.RefreshDocumentsStatuses refreshDocumentsStatuses = (dw1.g.RefreshDocumentsStatuses) this.f44922f;
            Object objE = uq.b.e();
            int i15 = this.f44921e;
            if (i15 == 0) {
                oq.u.b(obj);
                final v vVar = v.this;
                er.a aVar = new er.a() { // from class: dw1.y
                    @Override // er.a
                    public final Object a() {
                        return v.r.O(vVar, refreshDocumentsStatuses);
                    }
                };
                this.f44922f = vq.j.a(refreshDocumentsStatuses);
                this.f44921e = 1;
                if (vVar.Q9(aVar, this) == objE) {
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
        public final Object w(dw1.g.RefreshDocumentsStatuses refreshDocumentsStatuses, dw1.i.Initialized initialized, tq.e<? super i0> eVar) {
            r rVar = v.this.new r(eVar);
            rVar.f44922f = refreshDocumentsStatuses;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldw1/g$e;", "<unused var>", "Ldw1/i$a;", "Loq/i0;", "<anonymous>", "(Ldw1/g$e;Ldw1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<dw1.g.e, dw1.i.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f44924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f44925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f44926g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f44927h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f44928j;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        
            if (r1.F(r4, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f44928j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f44925f
                oq.i0 r0 = (oq.i0) r0
                java.lang.Object r0 = r5.f44924e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L7b
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L3a
            L26:
                oq.u.b(r6)
                dw1.v r6 = dw1.v.this
                kv1.a r6 = dw1.v.v9(r6)
                rq0.c r1 = rq0.c.SAFE_BUS
                r5.f44928j = r3
                java.lang.Object r6 = r6.d(r1, r5)
                if (r6 != r0) goto L3a
                goto L66
            L3a:
                dx.i r6 = (dx.i) r6
                dw1.v r1 = dw1.v.this
                boolean r3 = r6 instanceof dx.i.Left
                if (r3 == 0) goto L67
                r3 = r6
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                dw1.g$g$c r4 = dw1.g.InterfaceC1019g.c.f44758a
                java.lang.Object r6 = vq.j.a(r6)
                r5.f44924e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f44925f = r6
                r6 = 0
                r5.f44926g = r6
                r5.f44927h = r6
                r5.f44928j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L7b
            L66:
                return r0
            L67:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L7e
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                cb4.d r6 = (cb4.DialogData) r6
                dw1.g$l r0 = new dw1.g$l
                r0.<init>(r6)
                dw1.v.s9(r1, r0)
            L7b:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L7e:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dw1.v.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.e eVar, dw1.i.Initialized initialized, tq.e<? super i0> eVar2) {
            return v.this.new s(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldw1/g$b;", "<unused var>", "Lk10/c0;", "Ldw1/i$a;", "state", "Lk10/l;", "Ldw1/i;", "<anonymous>", "(Ldw1/g$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<dw1.g.b, k10.c0<dw1.i.Initialized>, tq.e<? super k10.l<? extends dw1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44931f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final dw1.i.Initialized O(dw1.i.Initialized initialized) {
            return dw1.i.Initialized.b(initialized, null, null, null, null, null, null, null, false, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f44931f;
            uq.b.e();
            if (this.f44930e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dw1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.t.O((i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dw1.g.b bVar, k10.c0<dw1.i.Initialized> c0Var, tq.e<? super k10.l<? extends dw1.i>> eVar) {
            t tVar = new t(eVar);
            tVar.f44931f = c0Var;
            return tVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class u extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f44932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f44933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f44934f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f44935g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f44936h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f44937j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f44938k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f44939l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f44940m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f44942p;

        u(tq.e<? super u> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f44940m = obj;
            this.f44942p |= PKIFailureInfo.systemUnavail;
            return v.this.Y9(null, null, null, this);
        }
    }

    public v(n20.j jVar, mx.c cVar, pv1.e eVar, pv1.a aVar, ac4.a aVar2, ib4.c cVar2, kv1.a aVar3, i70.n nVar, ew1.e eVar2, a14.w wVar, ez.c cVar3, ez.a aVar4, ew1.b bVar, t2.a aVar5, mz3.z zVar, mz3.w wVar2, h64.r rVar, tv1.a aVar6, dw1.h hVar) {
        this.labelProvider = cVar;
        this.getDynamicDocumentDataUseCase = eVar;
        this.getByIdDynamicDocumentDataUC = aVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.domainErrorMapper = cVar2;
        this.dynamicDocumentContainersInteractor = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.dynamicDocumentScreenMapper = eVar2;
        this.openUrlIntentUseCase = wVar;
        this.dateConverter = cVar3;
        this.currentTimeProvider = aVar4;
        this.dynamicDocumentDialogMapper = bVar;
        this.deps = aVar5;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar2;
        this.loadServicesUseCase = rVar;
        this.dynamicDocumentBitmapDecoder = aVar6;
        this.setupData = hVar;
        dw1.i.c cVar4 = dw1.i.c.f44783a;
        this.initialState = cVar4;
        this.stateMachine = jVar.a(cVar4, new er.l() { // from class: dw1.l
            @Override // er.l
            public final Object b(Object obj) {
                return v.T9(this.f44790a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new f(e9().getState(), this), L9(new State<>(cVar4, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(rq0.b.EnumC4479b enumC4479b, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(enumC4479b, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01af: MOVE (r6 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:51:0x01af */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:53:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b7: MOVE (r6 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:55:0x01b7 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0134: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:39:0x0134 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x013a: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:41:0x013a */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0140: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:43:0x0140 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0135: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:39:0x0134 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x013b: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:41:0x013a */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0141: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:43:0x0140 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 14441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object E9(rq0.b.EnumC4479b r21, k10.c0<?> r22, tq.e<? super k10.l<dw1.i.Initialized>> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw1.v.E9(rq0.b$b, k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw1.i.Initialized F9(v vVar, rq0.b.EnumC4479b enumC4479b, DynamicDocumentData dynamicDocumentData, mv1.b bVar, String str, List list, BitmapsByFieldReference bitmapsByFieldReference, Object obj) {
        return new dw1.i.Initialized(enumC4479b, dynamicDocumentData, bVar, vVar.currentTimeProvider.f(), str, list, bitmapsByFieldReference, false, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H9(dw1.i.Initialized initialized, tq.e<? super i0> eVar) {
        String documentIID;
        if (!initialized.getStatus().e()) {
            d9(new dw1.g.ShowDialog(this.dynamicDocumentDialogMapper.b(new ew1.c.Refresh(b9(new dw1.g.UpdateDocumentWithTimer(mz3.z.b.DOWNLOAD))))));
            return i0.f148189a;
        }
        dw1.h hVar = this.setupData;
        if (hVar instanceof dw1.h.DocumentById) {
            documentIID = ((dw1.h.DocumentById) hVar).getDocumentIID();
        } else {
            if (!(hVar instanceof dw1.h.DocumentByType)) {
                throw new oq.p();
            }
            documentIID = null;
        }
        Object objF = Y1().F(new dw1.g.InterfaceC1019g.GoToVerification(documentIID, initialized.getDynamicDocumentType()), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    private final Object I9(final wv1.c cVar, final dw1.g gVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new dw1.g.InterfaceC1019g.Error(this.domainErrorMapper.b(new ib4.c.Params(cVar.getDomainError(), false, new er.l() { // from class: dw1.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.K9(cVar, gVar, this, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    static /* synthetic */ Object J9(v vVar, wv1.c cVar, dw1.g gVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            gVar = null;
        }
        return vVar.I9(cVar, gVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(wv1.c cVar, dw1.g gVar, v vVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            dx.b domainError = cVar.getDomainError();
            if (domainError instanceof dx.b.Business) {
                dx.b.Business.a type = ((dx.b.Business) domainError).getType();
                if (type == lv1.b.REVOKE_DOCUMENT) {
                    if (gVar != null) {
                        vVar.d9(gVar);
                    } else {
                        vVar.d9(new dw1.g.RefreshDocumentsStatuses(dw1.g.d.f44753a));
                    }
                } else if (type == lv1.b.FAILED_LOADING) {
                    vVar.d9(dw1.g.c.f44752a);
                } else if (gVar != null) {
                    vVar.d9(gVar);
                }
            } else if (gVar != null) {
                vVar.d9(gVar);
            }
        } else if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.AbstractC2161b.a)) {
            if (gVar != null) {
                vVar.d9(gVar);
            }
        } else if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            if (cVar instanceof wv1.c.UpdateDocument) {
                vVar.d9(new dw1.g.UpdateDocumentWithTimer(((wv1.c.UpdateDocument) cVar).getUpdateMethodType()));
            } else {
                vVar.d9(dw1.g.d.f44753a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw1.j.a L9(State<dw1.i> state) {
        ew1.e eVar = this.dynamicDocumentScreenMapper;
        er.a<i0> aVarB9 = b9(dw1.g.a.f44750a);
        c cVar = new c(this);
        er.a<i0> aVarB10 = b9(dw1.g.f.f44755a);
        er.a<i0> aVarB11 = b9(dw1.g.k.f44767a);
        return eVar.b(new ew1.e.Params(state, new t2(this.deps, u0.a(this)), aVarB9, cVar, new er.a() { // from class: dw1.k
            @Override // er.a
            public final Object a() {
                return v.M9(this.f44789a);
            }
        }, new er.a() { // from class: dw1.m
            @Override // er.a
            public final Object a() {
                return v.N9(this.f44791a);
            }
        }, aVarB10, new er.l() { // from class: dw1.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.O9(this.f44792a, (String) obj);
            }
        }, aVarB11, b9(dw1.g.e.f44754a), new er.l() { // from class: dw1.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.P9(this.f44793a, (n20.a) obj);
            }
        }, b9(dw1.g.b.f44751a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(v vVar) {
        vVar.d9(new dw1.g.UpdateDocumentWithTimer(mz3.z.b.DOWNLOAD));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(v vVar) {
        vVar.d9(new dw1.g.UpdateDocumentWithTimer(mz3.z.b.UPDATE));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(v vVar, String str) {
        vVar.d9(new dw1.g.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(v vVar, n20.a aVar) {
        vVar.d9(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (J9(r7, r2, null, r4, 2, null) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q9(er.a<oq.i0> r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof dw1.v.d
            if (r0 == 0) goto L14
            r0 = r9
            dw1.v$d r0 = (dw1.v.d) r0
            int r1 = r0.f44858l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f44858l = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            dw1.v$d r0 = new dw1.v$d
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f44856j
            java.lang.Object r0 = uq.b.e()
            int r1 = r4.f44858l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L42
            if (r1 != r2) goto L3a
            java.lang.Object r8 = r4.f44853f
            dx.b r8 = (dx.b) r8
            java.lang.Object r8 = r4.f44852e
            dx.i r8 = (dx.i) r8
            java.lang.Object r8 = r4.f44851d
            er.a r8 = (er.a) r8
            oq.u.b(r9)
            goto La2
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            java.lang.Object r8 = r4.f44851d
            er.a r8 = (er.a) r8
            oq.u.b(r9)
            goto L5a
        L4a:
            oq.u.b(r9)
            kv1.a r9 = r7.dynamicDocumentContainersInteractor
            r4.f44851d = r8
            r4.f44858l = r3
            java.lang.Object r9 = r9.c(r4)
            if (r9 != r0) goto L5a
            goto L92
        L5a:
            dx.i r9 = (dx.i) r9
            boolean r1 = r9 instanceof dx.i.Left
            if (r1 == 0) goto L93
            r1 = r9
            dx.i$b r1 = (dx.i.Left) r1
            java.lang.Object r1 = r1.b()
            dx.b r1 = (dx.b) r1
            r3 = r2
            wv1.c$b r2 = new wv1.c$b
            r2.<init>(r1)
            java.lang.Object r8 = vq.j.a(r8)
            r4.f44851d = r8
            java.lang.Object r8 = vq.j.a(r9)
            r4.f44852e = r8
            java.lang.Object r8 = vq.j.a(r1)
            r4.f44853f = r8
            r8 = 0
            r4.f44854g = r8
            r4.f44855h = r8
            r4.f44858l = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            java.lang.Object r8 = J9(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto La2
        L92:
            return r0
        L93:
            boolean r0 = r9 instanceof dx.i.Right
            if (r0 == 0) goto La5
            dx.i$c r9 = (dx.i.Right) r9
            java.lang.Object r9 = r9.b()
            oq.i0 r9 = (oq.i0) r9
            r8.a()
        La2:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        La5:
            oq.p r8 = new oq.p
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dw1.v.Q9(er.a, tq.e):java.lang.Object");
    }

    private final void S9() {
        y(new p50.a.DefaultWithIcon(this.labelProvider.c(dv1.a.f44633f), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(dw1.i.class), new er.l() { // from class: dw1.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.U9(this.f44794a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(dw1.i.c.class), new er.l() { // from class: dw1.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.V9(this.f44795a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(dw1.i.Loading.class), new er.l() { // from class: dw1.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.W9(this.f44796a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(dw1.i.Initialized.class), new er.l() { // from class: dw1.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.X9(this.f44797a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(v vVar, k10.z zVar) {
        g gVar = vVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dw1.g.a.class), oVar, gVar);
        zVar.x(q0.c(dw1.g.c.class), oVar, vVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9(v vVar, k10.z zVar) {
        i iVar = vVar.new i(null);
        zVar.v(q0.c(dw1.g.Setup.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(v vVar, k10.z zVar) {
        zVar.C(vVar.new j(null));
        k kVar = vVar.new k(null);
        zVar.v(q0.c(dw1.g.d.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9(v vVar, k10.z zVar) {
        l lVar = vVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dw1.g.UpdateDocumentWithTimer.class), oVar, lVar);
        zVar.x(q0.c(dw1.g.OpenUrl.class), oVar, vVar.new m(null));
        zVar.v(q0.c(dw1.g.d.class), oVar, vVar.new n(null));
        zVar.x(q0.c(dw1.g.f.class), oVar, vVar.new o(null));
        zVar.x(q0.c(dw1.g.ShowDialog.class), oVar, vVar.new p(null));
        zVar.x(q0.c(dw1.g.k.class), oVar, vVar.new q(null));
        zVar.x(q0.c(dw1.g.RefreshDocumentsStatuses.class), oVar, vVar.new r(null));
        zVar.x(q0.c(dw1.g.e.class), oVar, vVar.new s(null));
        zVar.v(q0.c(dw1.g.b.class), oVar, new t(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x0135  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0131, code lost:
    
        if (F(r5, r3) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
    
        if (J9(r17, r1, null, r3, 2, null) == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d1, code lost:
    
        if (r5.F(r7, r3) == r6) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y9(rq0.b.EnumC4479b r18, mz3.z.b r19, java.lang.String r20, tq.e<? super oq.i0> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw1.v.Y9(rq0.b$b, mz3.z$b, java.lang.String, tq.e):java.lang.Object");
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(dw1.g.InterfaceC1019g interfaceC1019g, tq.e<? super i0> eVar) {
        return super.F(interfaceC1019g, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: R9, reason: merged with bridge method [inline-methods] */
    public void P5(dw1.h data) {
        i00.a.a(this, new e(data, null));
    }

    @Override // zx.b
    public xw.b<dw1.g.InterfaceC1019g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<dw1.i>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dw1.j.a> getState() {
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
