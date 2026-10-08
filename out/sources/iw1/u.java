package iw1;

import androidx.p016lifecycle.u0;
import fr.q0;
import gv1.DocumentActionAttribute;
import java.util.List;
import kw1.DynamicMultiDocumentSingleNav;
import mu.p0;
import mv1.Document;
import n20.State;
import o20.t2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wv1.BitmapsByFieldReference;
import wv1.DynamicDocumentBottomSheetData;
import zv1.SetupData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007Bq\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b%\u0010&J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J4\u00105\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u000103H\u0082@¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020*2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0018\u0010=\u001a\u00020*2\u0006\u0010<\u001a\u00020;H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b?\u0010@R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R,\u0010b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040]8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010i\u001a\b\u0012\u0004\u0012\u00020d0c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR \u0010#\u001a\b\u0012\u0004\u0012\u00020$0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020p0o8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010q¨\u0006s"}, d2 = {"Liw1/u;", "Ll00/g;", "Ln20/b;", "Liw1/b;", "Ln20/a;", "Liw1/c;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "snackBarManagerStateHolder", "Ljw1/b;", "dynamicMultiDocumentSingleScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "Lkv1/a;", "dynamicDocumentContainersInteractor", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lqv1/d;", "resetDynamicDocumentsDataSourceUC", "Lo20/t2$a;", "deps", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lh64/r;", "loadServicesUseCase", "Ltv1/a;", "dynamicDocumentBitmapDecoder", "<init>", "(Ln20/j;Li70/n;Ljw1/b;Lib4/c;Lkv1/a;La14/w;Li70/e;Lqv1/d;Lo20/t2$a;Lmz3/z;Lmz3/w;Lh64/r;Ltv1/a;)V", "state", "Liw1/c$a;", "G9", "(Ln20/b;)Liw1/c$a;", "Lgv1/c$a;", "actionType", "Liw1/b$b;", "Loq/i0;", "F9", "(Lgv1/c$a;Liw1/b$b;Ltq/e;)Ljava/lang/Object;", "Lrq0/b$c;", "dynamicDocumentType", "Lmz3/z$b;", "methodType", "Liw1/a;", "retryAction", "", "documentId", "S9", "(Lrq0/b$c;Lmz3/z$b;Liw1/a;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lkw1/a;", "data", "N9", "(Lkw1/a;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Li70/n;", "c", "Ljw1/b;", "d", "Lib4/c;", "e", "Lkv1/a;", "f", "La14/w;", "g", "Li70/e;", "h", "Lqv1/d;", "j", "Lo20/t2$a;", "k", "Lmz3/z;", "l", "Lmz3/w;", "m", "Lh64/r;", "n", "Ltv1/a;", "Liw1/b$a;", "p", "Liw1/b$a;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Liw1/a$h;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<State<iw1.b>, n20.a> implements iw1.c, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jw1.b dynamicMultiDocumentSingleScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qv1.d resetDynamicDocumentsDataSourceUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final tv1.a dynamicDocumentBitmapDecoder;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final iw1.b.a initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<iw1.b>, n20.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<iw1.a.h> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<iw1.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97341a;

        static {
            int[] iArr = new int[DocumentActionAttribute.a.values().length];
            try {
                iArr[DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_GRADUATION_PDF_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_PHD_PDF_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentActionAttribute.a.ELECTRONIC_DIPLOMA_DSC_PDF_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentActionAttribute.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f97341a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<iw1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f97342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f97343b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f97344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f97345b;

            /* JADX INFO: renamed from: iw1.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2284a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f97346d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f97347e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f97348f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f97350h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f97351j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f97352k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f97353l;

                public C2284a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f97346d = obj;
                    this.f97347e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f97344a = hVar;
                this.f97345b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2284a c2284a;
                if (eVar instanceof C2284a) {
                    c2284a = (C2284a) eVar;
                    int i15 = c2284a.f97347e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2284a.f97347e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2284a = new C2284a(eVar);
                    }
                } else {
                    c2284a = new C2284a(eVar);
                }
                Object obj2 = c2284a.f97346d;
                Object objE = uq.b.e();
                int i16 = c2284a.f97347e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f97344a;
                    iw1.c.a aVarG9 = this.f97345b.G9((State) obj);
                    c2284a.f97348f = vq.j.a(obj);
                    c2284a.f97350h = vq.j.a(c2284a);
                    c2284a.f97351j = vq.j.a(obj);
                    c2284a.f97352k = vq.j.a(hVar);
                    c2284a.f97353l = 0;
                    c2284a.f97347e = 1;
                    if (hVar.F(aVarG9, c2284a) == objE) {
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
            this.f97342a = gVar;
            this.f97343b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super iw1.c.a> hVar, tq.e eVar) {
            Object objA = this.f97342a.a(new a(hVar, this.f97343b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liw1/a$b;", "<unused var>", "Liw1/b;", "Loq/i0;", "<anonymous>", "(Liw1/a$b;Liw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<iw1.a.b, iw1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97354e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f97354e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iw1.a.h> bVarY1 = u.this.Y1();
                iw1.a.h.b bVar = iw1.a.h.b.f97267a;
                this.f97354e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(iw1.a.b bVar, iw1.b bVar2, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liw1/a$a;", "<unused var>", "Liw1/b;", "Loq/i0;", "<anonymous>", "(Liw1/a$a;Liw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<iw1.a.C2279a, iw1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97356e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f97356e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iw1.a.h> bVarY1 = u.this.Y1();
                iw1.a.h.C2280a c2280a = iw1.a.h.C2280a.f97266a;
                this.f97356e = 1;
                if (bVarY1.F(c2280a, this) == objE) {
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
        public final Object w(iw1.a.C2279a c2279a, iw1.b bVar, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$d;", "action", "Liw1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Liw1/a$d;Liw1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<iw1.a.Error, iw1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97359f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(u uVar, iw1.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    uVar.d9(iw1.a.C2279a.f97258a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    iw1.a retryAction = error.getRetryAction();
                    if (retryAction != null) {
                        uVar.d9(retryAction);
                    }
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final iw1.a.Error error = (iw1.a.Error) this.f97359f;
            Object objE = uq.b.e();
            int i15 = this.f97358e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iw1.a.h> bVarY1 = u.this.Y1();
                ib4.c cVar = u.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final u uVar = u.this;
                iw1.a.h.Error error2 = new iw1.a.h.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: iw1.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.e.O(uVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f97359f = vq.j.a(error);
                this.f97358e = 1;
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
        public final Object w(iw1.a.Error error, iw1.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f97359f = error;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liw1/a$j;", "action", "Lk10/c0;", "Liw1/b$a;", "state", "Lk10/l;", "Liw1/b;", "<anonymous>", "(Liw1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<iw1.a.Setup, k10.c0<iw1.b.a>, tq.e<? super k10.l<? extends iw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f97363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f97364h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f97365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f97366k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f97367l;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iw1.b.Initialized O(DynamicMultiDocumentSingleNav dynamicMultiDocumentSingleNav, List list, String str, BitmapsByFieldReference bitmapsByFieldReference, iw1.b.a aVar) {
            return new iw1.b.Initialized(dynamicMultiDocumentSingleNav.getDynamicDocumentType(), list, dynamicMultiDocumentSingleNav.getMultiDocumentData(), dynamicMultiDocumentSingleNav.getMainDocumentPhoto(), dynamicMultiDocumentSingleNav.getMainDocumentPesel(), null, null, str, bitmapsByFieldReference, 32, null);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0130  */
        /* JADX WARN: Code duplicated, block: B:41:0x0164  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
        
            if (r14.F(r4, r13) == r2) goto L40;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: iw1.u.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.Setup setup, k10.c0<iw1.b.a> c0Var, tq.e<? super k10.l<? extends iw1.b>> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f97366k = setup;
            fVar.f97367l = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$e;", "action", "Liw1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Liw1/a$e;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<iw1.a.HandleActionType, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f97371g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iw1.a.HandleActionType handleActionType = (iw1.a.HandleActionType) this.f97370f;
            iw1.b.Initialized initialized = (iw1.b.Initialized) this.f97371g;
            Object objE = uq.b.e();
            int i15 = this.f97369e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                DocumentActionAttribute.a actionType = handleActionType.getActionType();
                this.f97370f = vq.j.a(handleActionType);
                this.f97371g = vq.j.a(initialized);
                this.f97369e = 1;
                if (uVar.F9(actionType, initialized, this) == objE) {
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
        public final Object w(iw1.a.HandleActionType handleActionType, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f97370f = handleActionType;
            gVar.f97371g = initialized;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liw1/a$f;", "<unused var>", "Lk10/c0;", "Liw1/b$b;", "state", "Lk10/l;", "Liw1/b;", "<anonymous>", "(Liw1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<iw1.a.f, k10.c0<iw1.b.Initialized>, tq.e<? super k10.l<? extends iw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97374f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iw1.b.Initialized O(iw1.b.Initialized initialized) {
            return iw1.b.Initialized.b(initialized, null, null, null, null, null, g30.v.HIDDEN, null, null, null, 479, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f97374f;
            uq.b.e();
            if (this.f97373e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iw1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.f fVar, k10.c0<iw1.b.Initialized> c0Var, tq.e<? super k10.l<? extends iw1.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f97374f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liw1/a$k;", "action", "Lk10/c0;", "Liw1/b$b;", "state", "Lk10/l;", "Liw1/b;", "<anonymous>", "(Liw1/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<iw1.a.ShowBottomSheet, k10.c0<iw1.b.Initialized>, tq.e<? super k10.l<? extends iw1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f97377g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iw1.b.Initialized O(iw1.a.ShowBottomSheet showBottomSheet, iw1.b.Initialized initialized) {
            return iw1.b.Initialized.b(initialized, null, null, null, null, null, g30.v.EXPANDED, showBottomSheet.getBottomSheetData(), null, null, 415, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final iw1.a.ShowBottomSheet showBottomSheet = (iw1.a.ShowBottomSheet) this.f97376f;
            k10.c0 c0Var = (k10.c0) this.f97377g;
            uq.b.e();
            if (this.f97375e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iw1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.O(showBottomSheet, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.ShowBottomSheet showBottomSheet, k10.c0<iw1.b.Initialized> c0Var, tq.e<? super k10.l<? extends iw1.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f97376f = showBottomSheet;
            iVar.f97377g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$l;", "<unused var>", "Liw1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Liw1/a$l;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<iw1.a.l, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f97380g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f97381h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f97382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f97383k;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        
            if (r2.F(r5, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f97383k
                iw1.b$b r0 = (iw1.b.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f97382j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r7.f97379f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r7.f97378e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto L80
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                oq.u.b(r8)
                goto L4e
            L2a:
                oq.u.b(r8)
                iw1.u r8 = iw1.u.this
                kv1.a r8 = iw1.u.t9(r8)
                rq0.b$c r2 = r0.getDynamicDocumentType()
                iw1.u r5 = iw1.u.this
                iw1.a$c r6 = iw1.a.c.f97260a
                er.a r5 = iw1.u.q9(r5, r6)
                java.lang.Object r6 = vq.j.a(r0)
                r7.f97383k = r6
                r7.f97382j = r4
                java.lang.Object r8 = r8.f(r2, r5, r7)
                if (r8 != r1) goto L4e
                goto L7f
            L4e:
                dx.i r8 = (dx.i) r8
                iw1.u r2 = iw1.u.this
                boolean r4 = r8 instanceof dx.i.Right
                if (r4 == 0) goto L80
                r4 = r8
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                cb4.d r4 = (cb4.DialogData) r4
                iw1.a$h$f r5 = new iw1.a$h$f
                r5.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f97383k = r0
                r7.f97378e = r8
                java.lang.Object r8 = vq.j.a(r4)
                r7.f97379f = r8
                r8 = 0
                r7.f97380g = r8
                r7.f97381h = r8
                r7.f97382j = r3
                java.lang.Object r8 = r2.F(r5, r7)
                if (r8 != r1) goto L80
            L7f:
                return r1
            L80:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: iw1.u.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.l lVar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f97383k = initialized;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$q;", "action", "Liw1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Liw1/a$q;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<iw1.a.UpdateDocumentWithTimer, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f97387g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iw1.a.UpdateDocumentWithTimer updateDocumentWithTimer = (iw1.a.UpdateDocumentWithTimer) this.f97386f;
            iw1.b.Initialized initialized = (iw1.b.Initialized) this.f97387g;
            Object objE = uq.b.e();
            int i15 = this.f97385e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                rq0.b.c dynamicDocumentType = initialized.getDynamicDocumentType();
                mz3.z.b methodType = updateDocumentWithTimer.getMethodType();
                Document document = initialized.getMultiDocumentData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                this.f97386f = vq.j.a(updateDocumentWithTimer);
                this.f97387g = vq.j.a(initialized);
                this.f97385e = 1;
                if (uVar.S9(dynamicDocumentType, methodType, updateDocumentWithTimer, documentId, this) == objE) {
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
        public final Object w(iw1.a.UpdateDocumentWithTimer updateDocumentWithTimer, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f97386f = updateDocumentWithTimer;
            kVar.f97387g = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$p;", "<unused var>", "Liw1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Liw1/a$p;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<iw1.a.p, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97390f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f97392a;

            static {
                int[] iArr = new int[mv1.b.values().length];
                try {
                    iArr[mv1.b.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mv1.b.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[mv1.b.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[mv1.b.REVOKED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f97392a = iArr;
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(u uVar) {
            uVar.d9(new iw1.a.UpdateDocumentWithTimer(mz3.z.b.DOWNLOAD));
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X() {
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
        
            if (r3.F(r5, r21) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
        
            if (r3.F(r4, r21) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: iw1.u.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.p pVar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = u.this.new l(eVar);
            lVar.f97390f = initialized;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$i;", "action", "Liw1/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Liw1/a$i;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<iw1.a.OpenUrl, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97394f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iw1.a.OpenUrl openUrl = (iw1.a.OpenUrl) this.f97394f;
            Object objE = uq.b.e();
            int i15 = this.f97393e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f97394f = vq.j.a(openUrl);
                this.f97393e = 1;
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
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.OpenUrl openUrl, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            m mVar = u.this.new m(eVar);
            mVar.f97394f = openUrl;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$m;", "action", "Liw1/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Liw1/a$m;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<iw1.a.ShowGlobalSnackBar, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97397f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iw1.a.ShowGlobalSnackBar showGlobalSnackBar = (iw1.a.ShowGlobalSnackBar) this.f97397f;
            uq.b.e();
            if (this.f97396e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.globalSnackBarManager.y(new p50.a.Default(showGlobalSnackBar.getMessage(), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.ShowGlobalSnackBar showGlobalSnackBar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = u.this.new n(eVar);
            nVar.f97397f = showGlobalSnackBar;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liw1/a$o;", "<unused var>", "Liw1/b$b;", "Loq/i0;", "<anonymous>", "(Liw1/a$o;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<iw1.a.o, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f97401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f97402h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f97403j;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
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
                int r1 = r6.f97403j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f97400f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r0 = r6.f97400f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r6.f97399e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto L9a
            L2a:
                oq.u.b(r7)
                goto L42
            L2e:
                oq.u.b(r7)
                iw1.u r7 = iw1.u.this
                kv1.a r7 = iw1.u.t9(r7)
                rq0.c r1 = rq0.c.SAFE_BUS
                r6.f97403j = r4
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L42
                goto L99
            L42:
                dx.i r7 = (dx.i) r7
                iw1.u r1 = iw1.u.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L6f
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                iw1.a$h$d r4 = iw1.a.h.d.f97269a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f97399e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f97400f = r7
                r6.f97401g = r5
                r6.f97402h = r5
                r6.f97403j = r3
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto L9a
                goto L99
            L6f:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto L9d
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                iw1.a$h$f r4 = new iw1.a$h$f
                r4.<init>(r3)
                java.lang.Object r7 = vq.j.a(r7)
                r6.f97399e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f97400f = r7
                r6.f97401g = r5
                r6.f97402h = r5
                r6.f97403j = r2
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto L9a
            L99:
                return r0
            L9a:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L9d:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: iw1.u.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.o oVar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new o(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$c;", "<unused var>", "Liw1/b$b;", "state", "Loq/i0;", "<anonymous>", "(Liw1/a$c;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<iw1.a.c, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97406f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r7.a(r2, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f97406f
                iw1.b$b r0 = (iw1.b.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f97405e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L55
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L3e
            L22:
                oq.u.b(r7)
                iw1.u r7 = iw1.u.this
                kv1.a r7 = iw1.u.t9(r7)
                rq0.b$c r2 = r0.getDynamicDocumentType()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f97406f = r5
                r6.f97405e = r4
                java.lang.Object r7 = r7.n(r2, r6)
                if (r7 != r1) goto L3e
                goto L54
            L3e:
                iw1.u r7 = iw1.u.this
                qv1.d r7 = iw1.u.z9(r7)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f97406f = r0
                r6.f97405e = r3
                java.lang.Object r7 = r7.a(r2, r6)
                if (r7 != r1) goto L55
            L54:
                return r1
            L55:
                iw1.u r7 = iw1.u.this
                iw1.a$m r0 = new iw1.a$m
                iw1.u r1 = iw1.u.this
                jw1.b r1 = iw1.u.u9(r1)
                mx.a r1 = r1.f()
                r0.<init>(r1)
                iw1.u.r9(r7, r0)
                iw1.u r7 = iw1.u.this
                iw1.a$b r0 = iw1.a.b.f97259a
                iw1.u.r9(r7, r0)
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: iw1.u.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.c cVar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = u.this.new p(eVar);
            pVar.f97406f = initialized;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liw1/a$n;", "action", "Liw1/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Liw1/a$n;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<iw1.a.ShowSnackBar, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97409f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iw1.a.ShowSnackBar showSnackBar = (iw1.a.ShowSnackBar) this.f97409f;
            uq.b.e();
            if (this.f97408e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.y(new p50.a.Default(showSnackBar.getMessage(), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.ShowSnackBar showSnackBar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            q qVar = u.this.new q(eVar);
            qVar.f97409f = showSnackBar;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liw1/a$g;", "<unused var>", "Liw1/b$b;", "Loq/i0;", "<anonymous>", "(Liw1/a$g;Liw1/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<iw1.a.g, iw1.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97411e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f97411e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iw1.a.g gVar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
            return u.this.new r(eVar).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f97413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f97416g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f97417h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f97418j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f97419k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f97420l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f97421m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f97422n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f97424q;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f97422n = obj;
            this.f97424q |= PKIFailureInfo.systemUnavail;
            return u.this.S9(null, null, null, null, this);
        }
    }

    public u(n20.j jVar, i70.n nVar, jw1.b bVar, ib4.c cVar, kv1.a aVar, a14.w wVar, i70.e eVar, qv1.d dVar, t2.a aVar2, mz3.z zVar, mz3.w wVar2, h64.r rVar, tv1.a aVar3) {
        this.snackBarManagerStateHolder = nVar;
        this.dynamicMultiDocumentSingleScreenMapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.dynamicDocumentContainersInteractor = aVar;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.resetDynamicDocumentsDataSourceUC = dVar;
        this.deps = aVar2;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar2;
        this.loadServicesUseCase = rVar;
        this.dynamicDocumentBitmapDecoder = aVar3;
        iw1.b.a aVar4 = iw1.b.a.f97285a;
        this.initialState = aVar4;
        this.stateMachine = jVar.a(aVar4, new er.l() { // from class: iw1.k
            @Override // er.l
            public final Object b(Object obj) {
                return u.O9(this.f97315a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), G9(new State<>(aVar4, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F9(DocumentActionAttribute.a aVar, iw1.b.Initialized initialized, tq.e<? super i0> eVar) {
        int i15 = a.f97341a[aVar.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            Object objF = F(new iw1.a.h.ToDiplomaPdfList(new SetupData(initialized.getMultiDocumentData().getStatus().e(), initialized.getMultiDocumentData().getScope(), null)), eVar);
            return objF == uq.b.e() ? objF : i0.f148189a;
        }
        if (i15 == 4) {
            return i0.f148189a;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iw1.c.a G9(State<iw1.b> state) {
        jw1.b bVar = this.dynamicMultiDocumentSingleScreenMapper;
        er.a<i0> aVarB9 = b9(iw1.a.C2279a.f97258a);
        er.a<i0> aVarB10 = b9(iw1.a.g.f97265a);
        er.a<i0> aVarB11 = b9(iw1.a.p.f97283a);
        return bVar.b(new jw1.b.Params(state, new t2(this.deps, u0.a(this)), aVarB9, aVarB10, new er.a() { // from class: iw1.o
            @Override // er.a
            public final Object a() {
                return u.H9(this.f97319a);
            }
        }, new er.a() { // from class: iw1.p
            @Override // er.a
            public final Object a() {
                return u.I9(this.f97320a);
            }
        }, b9(iw1.a.o.f97282a), new er.l() { // from class: iw1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.J9(this.f97321a, (DocumentActionAttribute.a) obj);
            }
        }, aVarB11, new er.l() { // from class: iw1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.K9(this.f97322a, (String) obj);
            }
        }, new er.l() { // from class: iw1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f97323a, (n20.a) obj);
            }
        }, b9(iw1.a.l.f97279a), new er.l() { // from class: iw1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9(this.f97324a, (DynamicDocumentBottomSheetData) obj);
            }
        }, b9(iw1.a.f.f97264a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(u uVar) {
        uVar.d9(new iw1.a.UpdateDocumentWithTimer(mz3.z.b.DOWNLOAD));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(u uVar) {
        uVar.d9(new iw1.a.UpdateDocumentWithTimer(mz3.z.b.UPDATE));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(u uVar, DocumentActionAttribute.a aVar) {
        uVar.d9(new iw1.a.HandleActionType(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(u uVar, String str) {
        uVar.d9(new iw1.a.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(u uVar, n20.a aVar) {
        uVar.d9(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(u uVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData) {
        uVar.d9(new iw1.a.ShowBottomSheet(dynamicDocumentBottomSheetData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(iw1.b.class), new er.l() { // from class: iw1.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.P9(this.f97316a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(iw1.b.a.class), new er.l() { // from class: iw1.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.Q9(this.f97317a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(iw1.b.Initialized.class), new er.l() { // from class: iw1.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f97318a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(iw1.a.b.class), oVar, cVar);
        zVar.x(q0.c(iw1.a.C2279a.class), oVar, uVar.new d(null));
        zVar.x(q0.c(iw1.a.Error.class), oVar, uVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(u uVar, k10.z zVar) {
        f fVar = uVar.new f(null);
        zVar.v(q0.c(iw1.a.Setup.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(u uVar, k10.z zVar) {
        j jVar = uVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(iw1.a.l.class), oVar, jVar);
        zVar.x(q0.c(iw1.a.UpdateDocumentWithTimer.class), oVar, uVar.new k(null));
        zVar.x(q0.c(iw1.a.p.class), oVar, uVar.new l(null));
        zVar.x(q0.c(iw1.a.OpenUrl.class), oVar, uVar.new m(null));
        zVar.x(q0.c(iw1.a.ShowGlobalSnackBar.class), oVar, uVar.new n(null));
        zVar.x(q0.c(iw1.a.o.class), oVar, uVar.new o(null));
        zVar.x(q0.c(iw1.a.c.class), oVar, uVar.new p(null));
        zVar.x(q0.c(iw1.a.ShowSnackBar.class), oVar, uVar.new q(null));
        zVar.x(q0.c(iw1.a.g.class), oVar, uVar.new r(null));
        zVar.x(q0.c(iw1.a.HandleActionType.class), oVar, uVar.new g(null));
        zVar.v(q0.c(iw1.a.f.class), oVar, new h(null));
        zVar.v(q0.c(iw1.a.ShowBottomSheet.class), oVar, new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0152, code lost:
    
        if (F(r13, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bf, code lost:
    
        if (r11.F(r13, r2) == r3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S9(rq0.b.c r18, mz3.z.b r19, iw1.a r20, java.lang.String r21, tq.e<? super oq.i0> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iw1.u.S9(rq0.b$c, mz3.z$b, iw1.a, java.lang.String, tq.e):java.lang.Object");
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(iw1.a.h hVar, tq.e<? super i0> eVar) {
        return super.F(hVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public void P5(DynamicMultiDocumentSingleNav data) {
        d9(new iw1.a.Setup(data));
    }

    @Override // zx.b
    public xw.b<iw1.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<iw1.b>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<iw1.c.a> getState() {
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
