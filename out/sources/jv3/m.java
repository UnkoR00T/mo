package jv3;

import fr.q0;
import k10.c0;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import mu.p0;
import mz3.y;
import mz3.z;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J!\u00107\u001a\u0004\u0018\u0001062\u0006\u00103\u001a\u00020*2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR \u0010_\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030`8\u0014X\u0094\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010&\u001a\b\u0012\u0004\u0012\u00020'0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j¨\u0006k"}, d2 = {"Ljv3/m;", "Ll00/g;", "Ljv3/c;", "Ljv3/a;", "Ljv3/d;", "Lgv3/b;", "Lyy/a;", "stateMachineFactory", "Lkv3/e;", "screenMapper", "Lmz3/y;", "terminateDocumentDownloadUC", "Lmz3/s;", "monitorDocumentsDownloadStatusUC", "Lmz3/f;", "checkDocumentLoaderDownloadStatusUC", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/j;", "generateDocumentsAsyncUseCase", "Lmz3/p;", "getDocumentAsyncDownloadTaskDataUC", "Lkv3/d;", "documentDownloadLoaderErrorMapper", "Lkv3/b;", "documentDownloadLoaderDialogMapper", "Li70/e;", "globalSnackBarManager", "Lmx/c;", "labelProvider", "Luh0/b;", "asyncTerminateMainDocumentDownloadUC", "Liv3/a;", "documentDownloadLoaderInteractor", "Lgv3/b$b;", "setupData", "<init>", "(Lyy/a;Lkv3/e;Lmz3/y;Lmz3/s;Lmz3/f;Lmz3/z;Lmz3/j;Lmz3/p;Lkv3/d;Lkv3/b;Li70/e;Lmx/c;Luh0/b;Liv3/a;Lgv3/b$b;)V", "state", "Ljv3/d$a;", "D9", "(Ljv3/c;)Ljv3/d$a;", "Llz3/i;", "taskData", "Ldx/b;", "error", "Loq/i0;", "C9", "(Llz3/i;Ldx/b;)V", "F9", "()V", "downloadTaskData", "Lrq0/b;", "documentType", "", "B9", "(Llz3/i;Lrq0/b;)Ljava/lang/String;", "b", "Lkv3/e;", "c", "Lmz3/y;", "d", "Lmz3/s;", "e", "Lmz3/f;", "f", "Lmz3/z;", "g", "Lmz3/j;", "h", "Lmz3/p;", "j", "Lkv3/d;", "k", "Lkv3/b;", "l", "Li70/e;", "m", "Lmx/c;", "n", "Luh0/b;", "p", "Liv3/a;", "q", "Lgv3/b$b;", "Ljv3/c$a;", "r", "Ljv3/c$a;", "initialState", "Lxw/b;", "Lgv3/b$a;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<jv3.c, jv3.a> implements jv3.d, gv3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kv3.e screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y terminateDocumentDownloadUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.s monitorDocumentsDownloadStatusUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mz3.f checkDocumentLoaderDownloadStatusUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz3.j generateDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mz3.p getDocumentAsyncDownloadTaskDataUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final kv3.d documentDownloadLoaderErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final kv3.b documentDownloadLoaderDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final uh0.b asyncTerminateMainDocumentDownloadUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final iv3.a documentDownloadLoaderInteractor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final gv3.b.DocumentDownloadSetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final jv3.c.a initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gv3.b.a> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<jv3.c, jv3.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0<jv3.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106144a;

        static {
            int[] iArr = new int[lz3.d.values().length];
            try {
                iArr[lz3.d.FIRST_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz3.d.DOCUMENT_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f106144a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<jv3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f106145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f106146b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f106147a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f106148b;

            /* JADX INFO: renamed from: jv3.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2519a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f106149d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f106150e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f106151f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f106153h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f106154j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f106155k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f106156l;

                public C2519a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f106149d = obj;
                    this.f106150e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f106147a = hVar;
                this.f106148b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2519a c2519a;
                if (eVar instanceof C2519a) {
                    c2519a = (C2519a) eVar;
                    int i15 = c2519a.f106150e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2519a.f106150e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2519a = new C2519a(eVar);
                    }
                } else {
                    c2519a = new C2519a(eVar);
                }
                Object obj2 = c2519a.f106149d;
                Object objE = uq.b.e();
                int i16 = c2519a.f106150e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f106147a;
                    jv3.d.a aVarD9 = this.f106148b.D9((jv3.c) obj);
                    c2519a.f106151f = vq.j.a(obj);
                    c2519a.f106153h = vq.j.a(c2519a);
                    c2519a.f106154j = vq.j.a(obj);
                    c2519a.f106155k = vq.j.a(hVar);
                    c2519a.f106156l = 0;
                    c2519a.f106150e = 1;
                    if (hVar.F(aVarD9, c2519a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f106145a = gVar;
            this.f106146b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super jv3.d.a> hVar, tq.e eVar) {
            Object objA = this.f106145a.a(new a(hVar, this.f106146b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljv3/a$b;", "action", "Ljv3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljv3/a$b;Ljv3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<jv3.a.Close, jv3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106158f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jv3.a.Close close = (jv3.a.Close) this.f106158f;
            Object objE = uq.b.e();
            int i15 = this.f106157e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                gv3.b.a.Close close2 = new gv3.b.a.Close(close.getDownloadFinishedAndCanGoToDocument());
                this.f106158f = vq.j.a(close);
                this.f106157e = 1;
                if (mVar.F(close2, this) == objE) {
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
        public final Object w(jv3.a.Close close, jv3.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = m.this.new c(eVar);
            cVar2.f106158f = close;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljv3/a$d;", "action", "Ljv3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljv3/a$d;Ljv3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<jv3.a.GoToDocument, jv3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106161f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106163a;

            static {
                int[] iArr = new int[lz3.d.values().length];
                try {
                    iArr[lz3.d.DOCUMENT_UPDATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f106163a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jv3.a.GoToDocument goToDocument = (jv3.a.GoToDocument) this.f106161f;
            Object objE = uq.b.e();
            int i15 = this.f106160e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (goToDocument.getShowSnackBar()) {
                    int i16 = a.f106163a[goToDocument.getDownloadMethod().ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        m.this.F9();
                    }
                }
                m mVar = m.this;
                gv3.b.a.LoadDocument loadDocument = new gv3.b.a.LoadDocument(mVar.setupData.getDocumentIID());
                this.f106161f = vq.j.a(goToDocument);
                this.f106160e = 1;
                if (mVar.F(loadDocument, this) == objE) {
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
        public final Object w(jv3.a.GoToDocument goToDocument, jv3.c cVar, tq.e<? super i0> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f106161f = goToDocument;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljv3/a$f;", "action", "Ljv3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljv3/a$f;Ljv3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<jv3.a.ShowError, jv3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f106166g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f106167h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f106168j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f106169k;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, jv3.a.ShowError showError, z.b bVar) {
            mVar.d9(new jv3.a.UpdateDocument(showError.getDocumentId(), bVar));
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
        
            if (r5.F(r2, r11) == r1) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jv3.m.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.ShowError showError, jv3.c cVar, tq.e<? super i0> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f106169k = showError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljv3/c$a;", "it", "Loq/i0;", "<anonymous>", "(Ljv3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<jv3.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106171e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f106171e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m.this.d9(jv3.a.C2516a.f106086a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(jv3.c.a aVar, tq.e<? super i0> eVar) {
            return ((f) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljv3/a$a;", "<unused var>", "Lk10/c0;", "Ljv3/c$a;", "state", "Lk10/l;", "Ljv3/c;", "<anonymous>", "(Ljv3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<jv3.a.C2516a, c0<jv3.c.a>, tq.e<? super k10.l<? extends jv3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f106175g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f106176h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f106177j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f106178k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f106179l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f106180m;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jv3.c.Loader V(String str, DownloadTaskData downloadTaskData, jv3.c.a aVar) {
            return new jv3.c.Loader(str, downloadTaskData, true, false, 8, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jv3.c.Loader X(String str, DownloadTaskData downloadTaskData, jv3.c.a aVar) {
            return new jv3.c.Loader(str, downloadTaskData, false, false, 8, null);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0113  */
        /* JADX WARN: Code duplicated, block: B:31:0x011b  */
        /* JADX WARN: Code duplicated, block: B:33:0x012b  */
        /* JADX WARN: Code duplicated, block: B:35:0x012f  */
        /* JADX WARN: Code duplicated, block: B:37:0x013f  */
        /* JADX WARN: Code duplicated, block: B:39:0x0151  */
        /* JADX WARN: Code duplicated, block: B:41:0x0159  */
        /* JADX WARN: Code duplicated, block: B:43:0x0163  */
        /* JADX WARN: Code duplicated, block: B:45:0x016b  */
        /* JADX WARN: Code duplicated, block: B:47:0x0175  */
        /* JADX WARN: Code duplicated, block: B:49:0x017b  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objC;
            Object objB;
            m mVar;
            final DownloadTaskData downloadTaskData;
            int i15;
            dx.i iVar;
            int i16;
            String str;
            Object objC2;
            final String str2;
            m mVar2;
            dx.i iVar2;
            mz3.f.b bVar;
            c0 c0Var = (c0) this.f106180m;
            Object objE = uq.b.e();
            int i17 = this.f106179l;
            if (i17 == 0) {
                oq.u.b(obj);
                mz3.p pVar = m.this.getDocumentAsyncDownloadTaskDataUC;
                mz3.p.Params params = new mz3.p.Params(m.this.setupData.getDocumentType());
                this.f106180m = c0Var;
                this.f106179l = 1;
                objC = pVar.c(params, this);
                if (objC != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
                objC = obj;
            } else {
                if (i17 == 2) {
                    int i18 = this.f106178k;
                    int i19 = this.f106177j;
                    DownloadTaskData downloadTaskData2 = (DownloadTaskData) this.f106175g;
                    mVar = (m) this.f106174f;
                    dx.i iVar3 = (dx.i) this.f106173e;
                    oq.u.b(obj);
                    iVar = iVar3;
                    i16 = i19;
                    i15 = i18;
                    downloadTaskData = downloadTaskData2;
                    objB = obj;
                    str = (String) ((dx.i) objB).a();
                    mz3.f fVar = mVar.checkDocumentLoaderDownloadStatusUC;
                    mz3.f.Params params2 = new mz3.f.Params(mVar.setupData.getDocumentType(), mVar.setupData.getDocumentIID());
                    this.f106180m = c0Var;
                    this.f106173e = vq.j.a(iVar);
                    this.f106174f = mVar;
                    this.f106175g = downloadTaskData;
                    this.f106176h = str;
                    this.f106177j = i16;
                    this.f106178k = i15;
                    this.f106179l = 3;
                    objC2 = fVar.c(params2, this);
                    if (objC2 != objE) {
                        str2 = str;
                        mVar2 = mVar;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.f106176h;
                downloadTaskData = (DownloadTaskData) this.f106175g;
                mVar2 = (m) this.f106174f;
                oq.u.b(obj);
                objC2 = obj;
            }
            iVar2 = (dx.i) objC2;
            if (iVar2 instanceof dx.i.Left) {
                mVar2.C9(downloadTaskData, (dx.b) ((dx.i.Left) iVar2).b());
                return c0Var.c();
            }
            if (iVar2 instanceof dx.i.Right) {
                throw new oq.p();
            }
            bVar = (mz3.f.b) ((dx.i.Right) iVar2).b();
            if (fr.t.c(bVar, mz3.f.b.a.f129689a)) {
                mVar2.d9(new jv3.a.GoToDocument(downloadTaskData.getDocumentDownloadMethod(), false, 2, null));
                return c0Var.c();
            }
            if (fr.t.c(bVar, mz3.f.b.c.f129691a)) {
                return c0Var.d(new er.l() { // from class: jv3.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.g.V(str2, downloadTaskData, (c.a) obj2);
                    }
                });
            }
            if (fr.t.c(bVar, mz3.f.b.C3229b.f129690a)) {
                return c0Var.d(new er.l() { // from class: jv3.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.g.X(str2, downloadTaskData, (c.a) obj2);
                    }
                });
            }
            throw new oq.p();
            dx.i iVar4 = (dx.i) objC;
            m mVar3 = m.this;
            if (iVar4 instanceof dx.i.Left) {
                mVar3.d9(new jv3.a.ShowError(null, new jv3.b.InitializationError((dx.b) ((dx.i.Left) iVar4).b())));
                return c0Var.c();
            }
            if (!(iVar4 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            DownloadTaskData downloadTaskData3 = (DownloadTaskData) ((dx.i.Right) iVar4).b();
            iv3.a aVar = mVar3.documentDownloadLoaderInteractor;
            rq0.b documentType = mVar3.setupData.getDocumentType();
            this.f106180m = c0Var;
            this.f106173e = vq.j.a(iVar4);
            this.f106174f = mVar3;
            this.f106175g = downloadTaskData3;
            this.f106177j = 0;
            this.f106178k = 0;
            this.f106179l = 2;
            objB = aVar.b(documentType, this);
            if (objB != objE) {
                mVar = mVar3;
                downloadTaskData = downloadTaskData3;
                i15 = 0;
                iVar = iVar4;
                i16 = 0;
                str = (String) ((dx.i) objB).a();
                mz3.f fVar2 = mVar.checkDocumentLoaderDownloadStatusUC;
                mz3.f.Params params3 = new mz3.f.Params(mVar.setupData.getDocumentType(), mVar.setupData.getDocumentIID());
                this.f106180m = c0Var;
                this.f106173e = vq.j.a(iVar);
                this.f106174f = mVar;
                this.f106175g = downloadTaskData;
                this.f106176h = str;
                this.f106177j = i16;
                this.f106178k = i15;
                this.f106179l = 3;
                objC2 = fVar2.c(params3, this);
                if (objC2 != objE) {
                    str2 = str;
                    mVar2 = mVar;
                    iVar2 = (dx.i) objC2;
                    if (iVar2 instanceof dx.i.Left) {
                        mVar2.C9(downloadTaskData, (dx.b) ((dx.i.Left) iVar2).b());
                        return c0Var.c();
                    }
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    bVar = (mz3.f.b) ((dx.i.Right) iVar2).b();
                    if (fr.t.c(bVar, mz3.f.b.a.f129689a)) {
                        mVar2.d9(new jv3.a.GoToDocument(downloadTaskData.getDocumentDownloadMethod(), false, 2, null));
                        return c0Var.c();
                    }
                    if (fr.t.c(bVar, mz3.f.b.c.f129691a)) {
                        return c0Var.d(new er.l() { // from class: jv3.o
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.g.V(str2, downloadTaskData, (c.a) obj2);
                            }
                        });
                    }
                    if (fr.t.c(bVar, mz3.f.b.C3229b.f129690a)) {
                        return c0Var.d(new er.l() { // from class: jv3.p
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.g.X(str2, downloadTaskData, (c.a) obj2);
                            }
                        });
                    }
                    throw new oq.p();
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.C2516a c2516a, c0<jv3.c.a> c0Var, tq.e<? super k10.l<? extends jv3.c>> eVar) {
            g gVar = m.this.new g(eVar);
            gVar.f106180m = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljv3/a$i;", "action", "Ljv3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljv3/a$i;Ljv3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<jv3.a.UpdateDocument, jv3.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106183f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jv3.a.UpdateDocument updateDocument = (jv3.a.UpdateDocument) this.f106183f;
            Object objE = uq.b.e();
            int i15 = this.f106182e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = m.this.updateDocumentAsyncUC;
                z.Params params = new z.Params(m.this.setupData.getDocumentType(), updateDocument.getUpdateMethodType(), updateDocument.getDocumentId(), false, 8, null);
                this.f106183f = vq.j.a(updateDocument);
                this.f106182e = 1;
                if (zVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            m.this.d9(jv3.a.C2516a.f106086a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.UpdateDocument updateDocument, jv3.c.a aVar, tq.e<? super i0> eVar) {
            h hVar = m.this.new h(eVar);
            hVar.f106183f = updateDocument;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljv3/a$c;", "<unused var>", "Ljv3/c$a;", "Loq/i0;", "<anonymous>", "(Ljv3/a$c;Ljv3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<jv3.a.c, jv3.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106185e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f106185e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.j jVar = m.this.generateDocumentsAsyncUseCase;
                mz3.j.a.DownloadDocuments downloadDocuments = new mz3.j.a.DownloadDocuments(lz3.d.FIRST_DOWNLOAD, pq.v.e(m.this.setupData.getDocumentType()));
                this.f106185e = 1;
                if (jVar.c(downloadDocuments, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            m.this.d9(jv3.a.C2516a.f106086a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.c cVar, jv3.c.a aVar, tq.e<? super i0> eVar) {
            return m.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrq0/b;", "<unused var>", "Ljv3/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lrq0/b;Ljv3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<rq0.b, jv3.c.Loader, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f106189g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f106190h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f106191j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f106192k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f106193l;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106195a;

            static {
                int[] iArr = new int[lz3.d.values().length];
                try {
                    iArr[lz3.d.FIRST_DOWNLOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz3.d.DOCUMENT_UPDATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f106195a = iArr;
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:37:0x010f  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m mVar;
            dx.i iVar;
            Object objB;
            jv3.c.Loader loader = (jv3.c.Loader) this.f106193l;
            Object objE = uq.b.e();
            int i15 = this.f106192k;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.f fVar = m.this.checkDocumentLoaderDownloadStatusUC;
                mz3.f.Params params = new mz3.f.Params(m.this.setupData.getDocumentType(), m.this.setupData.getDocumentIID());
                this.f106193l = loader;
                this.f106192k = 1;
                obj = fVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) this.f106189g;
                oq.u.b(obj);
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                objB = vq.b.a(false);
            } else {
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVar).b();
            }
            mVar.d9(new jv3.a.Close(((Boolean) objB).booleanValue()));
            return i0.f148189a;
            dx.i iVar2 = (dx.i) obj;
            m mVar2 = m.this;
            if (iVar2 instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                if (loader.getTerminated()) {
                    int i16 = a.f106195a[loader.getTaskData().getDocumentDownloadMethod().ordinal()];
                    if (i16 == 1) {
                        iv3.a aVar = mVar2.documentDownloadLoaderInteractor;
                        rq0.b documentType = mVar2.setupData.getDocumentType();
                        String strB9 = mVar2.B9(loader.getTaskData(), mVar2.setupData.getDocumentType());
                        this.f106193l = vq.j.a(loader);
                        this.f106187e = vq.j.a(iVar2);
                        this.f106188f = vq.j.a(bVar);
                        this.f106189g = mVar2;
                        this.f106190h = 0;
                        this.f106191j = 0;
                        this.f106192k = 2;
                        obj = aVar.a(strB9, documentType, this);
                        if (obj != objE) {
                            mVar = mVar2;
                            iVar = (dx.i) obj;
                            if (iVar instanceof dx.i.Left) {
                                objB = vq.b.a(false);
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVar).b();
                            }
                            mVar.d9(new jv3.a.Close(((Boolean) objB).booleanValue()));
                        }
                        return objE;
                    }
                    if (i16 != 2 && i16 != 3) {
                        throw new oq.p();
                    }
                    mVar2.d9(new jv3.a.GoToDocument(loader.getTaskData().getDocumentDownloadMethod(), false));
                } else {
                    mVar2.C9(loader.getTaskData(), bVar);
                }
            } else {
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                mz3.f.b bVar2 = (mz3.f.b) ((dx.i.Right) iVar2).b();
                if (fr.t.c(bVar2, mz3.f.b.a.f129689a)) {
                    mVar2.d9(new jv3.a.GoToDocument(loader.getTaskData().getDocumentDownloadMethod(), false, 2, null));
                } else if (fr.t.c(bVar2, mz3.f.b.c.f129691a)) {
                    mVar2.d9(jv3.a.h.f106095a);
                } else if (!fr.t.c(bVar2, mz3.f.b.C3229b.f129690a)) {
                    throw new oq.p();
                }
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(rq0.b bVar, jv3.c.Loader loader, tq.e<? super i0> eVar) {
            j jVar = m.this.new j(eVar);
            jVar.f106193l = loader;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljv3/a$h;", "<unused var>", "Lk10/c0;", "Ljv3/c$b;", "state", "Lk10/l;", "Ljv3/c;", "<anonymous>", "(Ljv3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<jv3.a.h, c0<jv3.c.Loader>, tq.e<? super k10.l<? extends jv3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106197f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jv3.c.Loader O(jv3.c.Loader loader) {
            return jv3.c.Loader.b(loader, null, null, true, false, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f106197f;
            uq.b.e();
            if (this.f106196e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jv3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.k.O((c.Loader) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.h hVar, c0<jv3.c.Loader> c0Var, tq.e<? super k10.l<? extends jv3.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f106197f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljv3/a$e;", "<unused var>", "Lk10/c0;", "Ljv3/c$b;", "state", "Lk10/l;", "Ljv3/c;", "<anonymous>", "(Ljv3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<jv3.a.e, c0<jv3.c.Loader>, tq.e<? super k10.l<? extends jv3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106199f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jv3.c.Loader V(c0 c0Var, jv3.c.Loader loader) {
            return jv3.c.Loader.b((jv3.c.Loader) c0Var.a(), null, null, false, true, 7, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jv3.c.Loader X(c0 c0Var, jv3.c.Loader loader) {
            return jv3.c.Loader.b((jv3.c.Loader) c0Var.a(), null, null, false, true, 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
        
            if (r6.c(r2, r5) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00cb, code lost:
        
            if (r6 == r1) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jv3.m.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.e eVar, c0<jv3.c.Loader> c0Var, tq.e<? super k10.l<? extends jv3.c>> eVar2) {
            l lVar = m.this.new l(eVar2);
            lVar.f106199f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: jv3.m$m, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljv3/a$g;", "<unused var>", "Ljv3/c$b;", "Loq/i0;", "<anonymous>", "(Ljv3/a$g;Ljv3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2520m extends vq.k implements er.q<jv3.a.g, jv3.c.Loader, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106201e;

        C2520m(tq.e<? super C2520m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f106201e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                gv3.b.a.ShowDialog showDialog = new gv3.b.a.ShowDialog(mVar.documentDownloadLoaderDialogMapper.b(new kv3.b.Params(m.this.b9(jv3.a.e.f106091a))));
                this.f106201e = 1;
                if (mVar.F(showDialog, this) == objE) {
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
        public final Object w(jv3.a.g gVar, jv3.c.Loader loader, tq.e<? super i0> eVar) {
            return m.this.new C2520m(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljv3/a$i;", "action", "Lk10/c0;", "Ljv3/c$b;", "state", "Lk10/l;", "Ljv3/c;", "<anonymous>", "(Ljv3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<jv3.a.UpdateDocument, c0<jv3.c.Loader>, tq.e<? super k10.l<? extends jv3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f106205g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jv3.c.Loader O(c0 c0Var, jv3.c.Loader loader) {
            return jv3.c.Loader.b((jv3.c.Loader) c0Var.a(), null, null, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jv3.a.UpdateDocument updateDocument = (jv3.a.UpdateDocument) this.f106204f;
            final c0 c0Var = (c0) this.f106205g;
            Object objE = uq.b.e();
            int i15 = this.f106203e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = m.this.updateDocumentAsyncUC;
                z.Params params = new z.Params(m.this.setupData.getDocumentType(), updateDocument.getUpdateMethodType(), m.this.B9(((jv3.c.Loader) c0Var.a()).getTaskData(), m.this.setupData.getDocumentType()), false, 8, null);
                this.f106204f = vq.j.a(updateDocument);
                this.f106205g = c0Var;
                this.f106203e = 1;
                if (zVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: jv3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.n.O(c0Var, (c.Loader) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.UpdateDocument updateDocument, c0<jv3.c.Loader> c0Var, tq.e<? super k10.l<? extends jv3.c>> eVar) {
            n nVar = m.this.new n(eVar);
            nVar.f106204f = updateDocument;
            nVar.f106205g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljv3/a$c;", "<unused var>", "Lk10/c0;", "Ljv3/c$b;", "state", "Lk10/l;", "Ljv3/c;", "<anonymous>", "(Ljv3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<jv3.a.c, c0<jv3.c.Loader>, tq.e<? super k10.l<? extends jv3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106208f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jv3.c.Loader O(c0 c0Var, jv3.c.Loader loader) {
            return jv3.c.Loader.b((jv3.c.Loader) c0Var.a(), null, null, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f106208f;
            Object objE = uq.b.e();
            int i15 = this.f106207e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.j jVar = m.this.generateDocumentsAsyncUseCase;
                mz3.j.a.DownloadDocuments downloadDocuments = new mz3.j.a.DownloadDocuments(lz3.d.FIRST_DOWNLOAD, pq.v.e(m.this.setupData.getDocumentType()));
                this.f106208f = c0Var;
                this.f106207e = 1;
                if (jVar.c(downloadDocuments, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: jv3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.o.O(c0Var, (c.Loader) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jv3.a.c cVar, c0<jv3.c.Loader> c0Var, tq.e<? super k10.l<? extends jv3.c>> eVar) {
            o oVar = m.this.new o(eVar);
            oVar.f106208f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, kv3.e eVar, y yVar, mz3.s sVar, mz3.f fVar, z zVar, mz3.j jVar, mz3.p pVar, kv3.d dVar, kv3.b bVar, i70.e eVar2, mx.c cVar, uh0.b bVar2, iv3.a aVar2, gv3.b.DocumentDownloadSetupData documentDownloadSetupData) {
        this.screenMapper = eVar;
        this.terminateDocumentDownloadUC = yVar;
        this.monitorDocumentsDownloadStatusUC = sVar;
        this.checkDocumentLoaderDownloadStatusUC = fVar;
        this.updateDocumentAsyncUC = zVar;
        this.generateDocumentsAsyncUseCase = jVar;
        this.getDocumentAsyncDownloadTaskDataUC = pVar;
        this.documentDownloadLoaderErrorMapper = dVar;
        this.documentDownloadLoaderDialogMapper = bVar;
        this.globalSnackBarManager = eVar2;
        this.labelProvider = cVar;
        this.asyncTerminateMainDocumentDownloadUC = bVar2;
        this.documentDownloadLoaderInteractor = aVar2;
        this.setupData = documentDownloadSetupData;
        jv3.c.a aVar3 = jv3.c.a.f106103a;
        this.initialState = aVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: jv3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.G9(this.f106125a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), D9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String B9(DownloadTaskData downloadTaskData, rq0.b documentType) {
        TaskIncludedDocumentData taskIncludedDocumentData = downloadTaskData.d().get(documentType);
        if (taskIncludedDocumentData != null) {
            return taskIncludedDocumentData.getMainDocumentId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C9(DownloadTaskData taskData, dx.b error) {
        jv3.b downloadError;
        int i15 = a.f106144a[taskData.getDocumentDownloadMethod().ordinal()];
        if (i15 == 1) {
            downloadError = new jv3.b.DownloadError(error);
        } else if (i15 == 2) {
            downloadError = new jv3.b.UpdateError(error, z.b.DOWNLOAD);
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            downloadError = new jv3.b.UpdateError(error, z.b.UPDATE);
        }
        d9(new jv3.a.ShowError(B9(taskData, this.setupData.getDocumentType()), downloadError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jv3.d.a D9(jv3.c state) {
        return this.screenMapper.b(new kv3.e.Params(state, b9(jv3.a.g.f106094a), b9(new jv3.a.Close(false))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9() {
        this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(this.labelProvider.c(fv3.a.f67642e), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final m mVar, k10.v vVar) {
        vVar.c(q0.c(jv3.c.class), new er.l() { // from class: jv3.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.H9(this.f106122a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(jv3.c.a.class), new er.l() { // from class: jv3.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.I9(this.f106123a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(jv3.c.Loader.class), new er.l() { // from class: jv3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.J9(this.f106124a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(m mVar, k10.z zVar) {
        c cVar = mVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jv3.a.Close.class), oVar, cVar);
        zVar.x(q0.c(jv3.a.GoToDocument.class), oVar, mVar.new d(null));
        zVar.x(q0.c(jv3.a.ShowError.class), oVar, mVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(m mVar, k10.z zVar) {
        zVar.C(mVar.new f(null));
        g gVar = mVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(jv3.a.C2516a.class), oVar, gVar);
        zVar.x(q0.c(jv3.a.UpdateDocument.class), oVar, mVar.new h(null));
        zVar.x(q0.c(jv3.a.c.class), oVar, mVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(m mVar, k10.z zVar) {
        k10.k.s(zVar, (mu.g) mVar.monitorDocumentsDownloadStatusUC.a(gz.b.a.C1792a.f78542a), null, mVar.new j(null), 2, null);
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(jv3.a.h.class), oVar, kVar);
        zVar.v(q0.c(jv3.a.e.class), oVar, mVar.new l(null));
        zVar.x(q0.c(jv3.a.g.class), oVar, mVar.new C2520m(null));
        zVar.v(q0.c(jv3.a.UpdateDocument.class), oVar, mVar.new n(null));
        zVar.v(q0.c(jv3.a.c.class), oVar, mVar.new o(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gv3.b.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(gv3.b.DocumentDownloadSetupData documentDownloadSetupData) {
        super.P5(documentDownloadSetupData);
    }

    @Override // zx.b
    public xw.b<gv3.b.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<jv3.c, jv3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<jv3.d.a> getState() {
        return this.state;
    }
}
