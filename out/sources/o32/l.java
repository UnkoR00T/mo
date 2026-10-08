package o32;

import a14.w;
import a14.z;
import d12.OAuthWebViewData;
import eo0.DeliveryMessageDetails;
import eo0.c0;
import eo0.y0;
import fr.q0;
import k10.t;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.d0;
import p02.e0;
import p02.u;
import p02.v;
import p071kotlin.Metadata;
import wx.DomainFile;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B«\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0001\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103J^\u0010@\u001a\u00020=2\u0006\u00105\u001a\u0002042(\u0010;\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0807\u0012\u0006\u0012\u0004\u0018\u00010\u0005062\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<H\u0082@¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020=2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020=2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ>\u0010M\u001a\u00020=2\u0006\u0010J\u001a\u0002092\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<2\b\b\u0001\u0010L\u001a\u00020KH\u0082@¢\u0006\u0004\bM\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010w\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR \u0010~\u001a\b\u0012\u0004\u0012\u00020y0x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R+\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u007f8\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R%\u00100\u001a\t\u0012\u0004\u0012\u0002010\u0085\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008a\u0001"}, d2 = {"Lo32/l;", "Ll00/g;", "Lo32/b;", "Lo32/a;", "Lo32/c;", "", "Lyy/a;", "stateMachineFactory", "Lu04/a;", "commonEndpoints", "Lp32/f;", "mapper", "Lp02/v;", "getMessageTechnicalEvidenceUseCase", "Lb12/c;", "electronicDeliveryErrorMapper", "Lp02/d0;", "getUpoFileUseCase", "La14/z;", "saveDownloadedFileUseCase", "Lp02/e0;", "getUpoPreviewFileUseCase", "Lib4/c;", "genericDomainErrorMapper", "Li70/e;", "globalSnackBarManager", "Ll12/d;", "fileAccessPermissionDialogMapper", "Lp02/e;", "downloadTechnicalEvidencesFileUC", "Lp02/u;", "getMessageTechnicalEvidenceFileUC", "La14/d;", "copyToClipboardUseCase", "Lmx/c;", "labelProvider", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Ll12/b;", "attachmentTooBigToDownloadDialogMapper", "La14/w;", "openUrlIntentUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Leo0/m;", "details", "<init>", "(Lyy/a;Lu04/a;Lp32/f;Lp02/v;Lb12/c;Lp02/d0;La14/z;Lp02/e0;Lib4/c;Li70/e;Ll12/d;Lp02/e;Lp02/u;La14/d;Lmx/c;La14/m;Ll12/b;La14/w;Lac4/a;Leo0/m;)V", "state", "Lo32/c$a;", "L9", "(Lo32/b;)Lo32/c$a;", "Leo0/y0;", "serviceType", "Lkotlin/Function1;", "Ltq/e;", "Ldx/i;", "Ldx/b;", "Lwx/a;", "getFileUseCase", "Lkotlin/Function0;", "Loq/i0;", "onRefreshToken", "onRetry", "F9", "(Leo0/y0;Ler/l;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lu04/b;", "downloadStatus", "H9", "(Lu04/b;)V", "Lmx/a;", "message", "O9", "(Lmx/a;)V", "domainError", "", "snackbarTextRes", "J9", "(Ldx/b;Ler/a;Ler/a;ILtq/e;)Ljava/lang/Object;", "b", "Lu04/a;", "c", "Lp32/f;", "d", "Lp02/v;", "e", "Lb12/c;", "f", "Lp02/d0;", "g", "La14/z;", "h", "Lp02/e0;", "j", "Lib4/c;", "k", "Li70/e;", "l", "Ll12/d;", "m", "Lp02/e;", "n", "Lp02/u;", "p", "La14/d;", "q", "Lmx/c;", "r", "La14/m;", "s", "Ll12/b;", "t", "La14/w;", "v", "Lac4/a;", "w", "Leo0/m;", "x", "Lo32/b;", "initialState", "Lxw/b;", "Lo32/a$j;", "y", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "z", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "A", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, o32.a> implements o32.c, zx.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final p0<o32.c.Data> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p32.f mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v getMessageTechnicalEvidenceUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d0 getUpoFileUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z saveDownloadedFileUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e0 getUpoPreviewFileUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l12.d fileAccessPermissionDialogMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p02.e downloadTechnicalEvidencesFileUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final u getMessageTechnicalEvidenceFileUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final l12.b attachmentTooBigToDownloadDialogMapper;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final DeliveryMessageDetails details;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o32.a.j> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final t<State, o32.a> stateMachine;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141981a;

        static {
            int[] iArr = new int[u04.b.values().length];
            try {
                iArr[u04.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u04.b.FILE_NOT_SAVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u04.b.NOT_PERMISSION_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u04.b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f141981a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f141983f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f141984g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f141985h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f141986j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ y0 f141987k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ l f141988l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super dx.i<? extends dx.b, DomainFile>>, Object> f141989m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f141990n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f141991p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(y0 y0Var, l lVar, er.l<? super tq.e<? super dx.i<? extends dx.b, DomainFile>>, ? extends Object> lVar2, er.a<i0> aVar, er.a<i0> aVar2, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f141987k = y0Var;
            this.f141988l = lVar;
            this.f141989m = lVar2;
            this.f141990n = aVar;
            this.f141991p = aVar2;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0085  */
        /* JADX WARN: Code duplicated, block: B:24:0x0089  */
        /* JADX WARN: Code duplicated, block: B:27:0x0097  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r10 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
        
            if (r3.J9(r4, r5, r6, r7, r9) == r0) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r9.f141986j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r9.f141983f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r9.f141982e
                dx.i r0 = (dx.i) r0
                oq.u.b(r10)
                goto L94
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                oq.u.b(r10)
                goto L46
            L27:
                oq.u.b(r10)
                eo0.y0 r10 = r9.f141987k
                eo0.y0 r1 = eo0.y0.E_PUAP
                if (r10 != r1) goto L49
                o32.l r10 = r9.f141988l
                a14.z r10 = o32.l.A9(r10)
                a14.z$a r1 = new a14.z$a
                er.l<tq.e<? super dx.i<? extends dx.b, wx.a>>, java.lang.Object> r4 = r9.f141989m
                r1.<init>(r4)
                r9.f141986j = r3
                java.lang.Object r10 = r10.c(r1, r9)
                if (r10 != r0) goto L46
                goto L84
            L46:
                dx.i r10 = (dx.i) r10
                goto L54
            L49:
                dx.i$b r10 = new dx.i$b
                dx.b$e r1 = new dx.b$e
                r4 = 0
                r1.<init>(r4, r3, r4)
                r10.<init>(r1)
            L54:
                o32.l r3 = r9.f141988l
                er.a<oq.i0> r5 = r9.f141990n
                er.a<oq.i0> r6 = r9.f141991p
                boolean r1 = r10 instanceof dx.i.Left
                if (r1 == 0) goto L85
                r1 = r10
                dx.i$b r1 = (dx.i.Left) r1
                java.lang.Object r1 = r1.b()
                r4 = r1
                dx.b r4 = (dx.b) r4
                int r7 = e02.a.U1
                java.lang.Object r10 = vq.j.a(r10)
                r9.f141982e = r10
                java.lang.Object r10 = vq.j.a(r4)
                r9.f141983f = r10
                r10 = 0
                r9.f141984g = r10
                r9.f141985h = r10
                r9.f141986j = r2
                r8 = r9
                java.lang.Object r10 = o32.l.C9(r3, r4, r5, r6, r7, r8)
                if (r10 != r0) goto L94
            L84:
                return r0
            L85:
                boolean r0 = r10 instanceof dx.i.Right
                if (r0 == 0) goto L97
                dx.i$c r10 = (dx.i.Right) r10
                java.lang.Object r10 = r10.b()
                u04.b r10 = (u04.b) r10
                o32.l.B9(r3, r10)
            L94:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            L97:
                oq.p r10 = new oq.p
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o32.l.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new b(this.f141987k, this.f141988l, this.f141989m, this.f141990n, this.f141991p, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<c0, i0> {
        c() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(c0 c0Var) {
            c(c0Var.getValue());
            return i0.f148189a;
        }

        public final void c(String str) {
            l.this.d9(new o32.a.GetTechnicalEvidenceFile(str, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<o32.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f141993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f141994b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f141995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f141996b;

            /* JADX INFO: renamed from: o32.l$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3499a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f141997d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f141998e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f141999f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f142001h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f142002j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f142003k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f142004l;

                public C3499a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f141997d = obj;
                    this.f141998e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l lVar) {
                this.f141995a = hVar;
                this.f141996b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3499a c3499a;
                if (eVar instanceof C3499a) {
                    c3499a = (C3499a) eVar;
                    int i15 = c3499a.f141998e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3499a.f141998e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3499a = new C3499a(eVar);
                    }
                } else {
                    c3499a = new C3499a(eVar);
                }
                Object obj2 = c3499a.f141997d;
                Object objE = uq.b.e();
                int i16 = c3499a.f141998e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f141995a;
                    o32.c.Data dataL9 = this.f141996b.L9((State) obj);
                    c3499a.f141999f = vq.j.a(obj);
                    c3499a.f142001h = vq.j.a(c3499a);
                    c3499a.f142002j = vq.j.a(obj);
                    c3499a.f142003k = vq.j.a(hVar);
                    c3499a.f142004l = 0;
                    c3499a.f141998e = 1;
                    if (hVar.F(dataL9, c3499a) == objE) {
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

        public d(mu.g gVar, l lVar) {
            this.f141993a = gVar;
            this.f141994b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o32.c.Data> hVar, tq.e eVar) {
            Object objA = this.f141993a.a(new a(hVar, this.f141994b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$k;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$k;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<o32.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142006f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V() {
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(l lVar, jb4.b bVar) {
            lVar.d9(new o32.a.ShowError(bVar));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.OnError onError = (o32.a.OnError) this.f142006f;
            uq.b.e();
            if (this.f142005e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b12.c cVar = l.this.electronicDeliveryErrorMapper;
            er.a<i0> aVarB = onError.b();
            er.a aVarB9 = l.this.b9(new o32.a.Authorize(new OAuthWebViewData(onError.b())));
            dx.b error = onError.getError();
            er.a aVar = new er.a() { // from class: o32.m
                @Override // er.a
                public final Object a() {
                    return l.e.V();
                }
            };
            final l lVar = l.this;
            cVar.c(new b12.c.Params(error, aVarB9, aVar, aVarB, new er.l() { // from class: o32.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return l.e.X(lVar, (jb4.b) obj2);
                }
            }));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(o32.a.OnError onError, State state, tq.e<? super i0> eVar) {
            e eVar2 = l.this.new e(eVar);
            eVar2.f142006f = onError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$n;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$n;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<o32.a.ShowError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142009f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.ShowError showError = (o32.a.ShowError) this.f142009f;
            Object objE = uq.b.e();
            int i15 = this.f142008e;
            if (i15 == 0) {
                oq.u.b(obj);
                l lVar = l.this;
                o32.a.j.Error error = new o32.a.j.Error(showError.getData());
                this.f142009f = vq.j.a(showError);
                this.f142008e = 1;
                if (lVar.F(error, this) == objE) {
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
        public final Object w(o32.a.ShowError showError, State state, tq.e<? super i0> eVar) {
            f fVar = l.this.new f(eVar);
            fVar.f142009f = showError;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$m;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$m;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<o32.a.ShowDialog, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142012f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.ShowDialog showDialog = (o32.a.ShowDialog) this.f142012f;
            Object objE = uq.b.e();
            int i15 = this.f142011e;
            if (i15 == 0) {
                oq.u.b(obj);
                l lVar = l.this;
                o32.a.j.Dialog dialog = new o32.a.j.Dialog(showDialog.getDialogData());
                this.f142012f = vq.j.a(showDialog);
                this.f142011e = 1;
                if (lVar.F(dialog, this) == objE) {
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
        public final Object w(o32.a.ShowDialog showDialog, State state, tq.e<? super i0> eVar) {
            g gVar = l.this.new g(eVar);
            gVar.f142012f = showDialog;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$c;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$c;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<o32.a.CopyToClipboard, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142015f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.CopyToClipboard copyToClipboard = (o32.a.CopyToClipboard) this.f142015f;
            Object objE = uq.b.e();
            int i15 = this.f142014e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.d dVar = l.this.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(copyToClipboard.getValue(), copyToClipboard.getMessageLabel());
                this.f142015f = vq.j.a(copyToClipboard);
                this.f142014e = 1;
                if (dVar.c(params, this) == objE) {
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
        public final Object w(o32.a.CopyToClipboard copyToClipboard, State state, tq.e<? super i0> eVar) {
            h hVar = l.this.new h(eVar);
            hVar.f142015f = copyToClipboard;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$a;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$a;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<o32.a.Authorize, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142018f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.Authorize authorize = (o32.a.Authorize) this.f142018f;
            Object objE = uq.b.e();
            int i15 = this.f142017e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o32.a.j> bVarY1 = l.this.Y1();
                o32.a.j.GoToAuthorization goToAuthorization = new o32.a.j.GoToAuthorization(authorize.getOAuthWebViewData());
                this.f142018f = vq.j.a(authorize);
                this.f142017e = 1;
                if (bVarY1.F(goToAuthorization, this) == objE) {
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
        public final Object w(o32.a.Authorize authorize, State state, tq.e<? super i0> eVar) {
            i iVar = l.this.new i(eVar);
            iVar.f142018f = authorize;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$d;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$d;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<o32.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142021f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.d dVar = (o32.a.d) this.f142021f;
            Object objE = uq.b.e();
            int i15 = this.f142020e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = l.this.getMessageTechnicalEvidenceUseCase;
                v.Params params = new v.Params(l.this.details.getDeliveryMessage().getMessageId(), null);
                this.f142021f = dVar;
                this.f142020e = 1;
                obj = vVar.e(params, this);
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
            l lVar = l.this;
            if (iVar instanceof dx.i.Right) {
                lVar.d9(new o32.a.DownloadTechnicalEvidencesFile((DomainFile) ((dx.i.Right) iVar).b()));
            }
            l lVar2 = l.this;
            if (iVar instanceof dx.i.Left) {
                lVar2.d9(new o32.a.OnError((dx.b) ((dx.i.Left) iVar).b(), lVar2.b9(dVar)));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o32.a.d dVar, State state, tq.e<? super i0> eVar) {
            j jVar = l.this.new j(eVar);
            jVar.f142021f = dVar;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$l;", "action", "Lo32/b;", "state", "Loq/i0;", "<anonymous>", "(Lo32/a$l;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<o32.a.OpenUrl, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142024f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.OpenUrl openUrl = (o32.a.OpenUrl) this.f142024f;
            Object objE = uq.b.e();
            int i15 = this.f142023e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = l.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f142024f = vq.j.a(openUrl);
                this.f142023e = 1;
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
            l lVar = l.this;
            if (iVar instanceof dx.i.Left) {
                lVar.O9(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage());
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o32.a.OpenUrl openUrl, State state, tq.e<? super i0> eVar) {
            k kVar = l.this.new k(eVar);
            kVar.f142024f = openUrl;
            return kVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: o32.l$l, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$f;", "action", "Lo32/b;", "state", "Loq/i0;", "<anonymous>", "(Lo32/a$f;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3500l extends vq.k implements er.q<o32.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142028g;

        /* JADX INFO: renamed from: o32.l$l$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lwx/a;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends DomainFile>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f142030e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f142031f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ State f142032g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f142031f = lVar;
                this.f142032g = state;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f142030e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                d0 d0Var = this.f142031f.getUpoFileUseCase;
                d0.Params params = new d0.Params(this.f142032g.getDetails().getDeliveryMessage().getMessageId(), null);
                this.f142030e = 1;
                Object objE2 = d0Var.e(params, this);
                return objE2 == objE ? objE : objE2;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f142031f, this.f142032g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        C3500l(tq.e<? super C3500l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l lVar, o32.a.f fVar) {
            lVar.d9(fVar);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o32.a.f fVar = (o32.a.f) this.f142027f;
            State state = (State) this.f142028g;
            Object objE = uq.b.e();
            int i15 = this.f142026e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (state.getDetails().getAttachmentSumTooBigToDownload()) {
                    l.this.d9(new o32.a.ShowDialog(l.this.attachmentTooBigToDownloadDialogMapper.b(new l12.b.Params(l.this.b9(new o32.a.OpenUrl(l.this.commonEndpoints.M()))))));
                } else {
                    l lVar = l.this;
                    final l lVar2 = l.this;
                    er.a aVarB9 = lVar.b9(new o32.a.Authorize(new OAuthWebViewData(new er.a() { // from class: o32.o
                        @Override // er.a
                        public final Object a() {
                            return l.C3500l.O(lVar2, fVar);
                        }
                    })));
                    y0 serviceType = state.getDetails().getDeliveryMessage().getServiceType();
                    er.a aVarB10 = l.this.b9(o32.a.f.f141929a);
                    l lVar3 = l.this;
                    a aVar = new a(lVar3, state, null);
                    this.f142027f = vq.j.a(fVar);
                    this.f142028g = vq.j.a(state);
                    this.f142026e = 1;
                    if (lVar3.F9(serviceType, aVar, aVarB9, aVarB10, this) == objE) {
                        return objE;
                    }
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
        public final Object w(o32.a.f fVar, State state, tq.e<? super i0> eVar) {
            C3500l c3500l = l.this.new C3500l(eVar);
            c3500l.f142027f = fVar;
            c3500l.f142028g = state;
            return c3500l.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$g;", "action", "Lo32/b;", "state", "Loq/i0;", "<anonymous>", "(Lo32/a$g;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<o32.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142035g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lwx/a;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends DomainFile>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f142037e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f142038f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ State f142039g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f142038f = lVar;
                this.f142039g = state;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f142037e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                e0 e0Var = this.f142038f.getUpoPreviewFileUseCase;
                e0.Params params = new e0.Params(this.f142039g.getDetails().getDeliveryMessage().getMessageId(), null);
                this.f142037e = 1;
                Object objE2 = e0Var.e(params, this);
                return objE2 == objE ? objE : objE2;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f142038f, this.f142039g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l lVar, o32.a.g gVar) {
            lVar.d9(gVar);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o32.a.g gVar = (o32.a.g) this.f142034f;
            State state = (State) this.f142035g;
            Object objE = uq.b.e();
            int i15 = this.f142033e;
            if (i15 == 0) {
                oq.u.b(obj);
                l lVar = l.this;
                final l lVar2 = l.this;
                er.a aVarB9 = lVar.b9(new o32.a.Authorize(new OAuthWebViewData(new er.a() { // from class: o32.p
                    @Override // er.a
                    public final Object a() {
                        return l.m.O(lVar2, gVar);
                    }
                })));
                y0 serviceType = state.getDetails().getDeliveryMessage().getServiceType();
                er.a aVarB10 = l.this.b9(o32.a.g.f141930a);
                l lVar3 = l.this;
                a aVar = new a(lVar3, state, null);
                this.f142034f = vq.j.a(gVar);
                this.f142035g = vq.j.a(state);
                this.f142033e = 1;
                if (lVar3.F9(serviceType, aVar, aVarB9, aVarB10, this) == objE) {
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
        public final Object w(o32.a.g gVar, State state, tq.e<? super i0> eVar) {
            m mVar = l.this.new m(eVar);
            mVar.f142034f = gVar;
            mVar.f142035g = state;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$e;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$e;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<o32.a.DownloadTechnicalEvidencesFile, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142041f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.DownloadTechnicalEvidencesFile downloadTechnicalEvidencesFile = (o32.a.DownloadTechnicalEvidencesFile) this.f142041f;
            Object objE = uq.b.e();
            int i15 = this.f142040e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.e eVar = l.this.downloadTechnicalEvidencesFileUC;
                p02.e.Params params = new p02.e.Params(downloadTechnicalEvidencesFile.getFile());
                this.f142041f = downloadTechnicalEvidencesFile;
                this.f142040e = 1;
                obj = eVar.d(params, this);
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
            l lVar = l.this;
            if (iVar instanceof dx.i.Right) {
                lVar.H9((u04.b) ((dx.i.Right) iVar).b());
            }
            l lVar2 = l.this;
            if (iVar instanceof dx.i.Left) {
                new o32.a.OnError((dx.b) ((dx.i.Left) iVar).b(), lVar2.b9(downloadTechnicalEvidencesFile));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o32.a.DownloadTechnicalEvidencesFile downloadTechnicalEvidencesFile, State state, tq.e<? super i0> eVar) {
            n nVar = l.this.new n(eVar);
            nVar.f142041f = downloadTechnicalEvidencesFile;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo32/a$h;", "action", "Lo32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo32/a$h;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<o32.a.GetTechnicalEvidenceFile, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142044f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o32.a.GetTechnicalEvidenceFile getTechnicalEvidenceFile = (o32.a.GetTechnicalEvidenceFile) this.f142044f;
            Object objE = uq.b.e();
            int i15 = this.f142043e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = l.this.getMessageTechnicalEvidenceFileUC;
                u.Params params = new u.Params(getTechnicalEvidenceFile.getEvidenceId(), null);
                this.f142044f = getTechnicalEvidenceFile;
                this.f142043e = 1;
                obj = uVar.e(params, this);
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
            l lVar = l.this;
            if (iVar instanceof dx.i.Right) {
                lVar.d9(new o32.a.DownloadTechnicalEvidencesFile((DomainFile) ((dx.i.Right) iVar).b()));
            }
            l lVar2 = l.this;
            if (iVar instanceof dx.i.Left) {
                lVar2.d9(new o32.a.OnError((dx.b) ((dx.i.Left) iVar).b(), lVar2.b9(getTechnicalEvidenceFile)));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o32.a.GetTechnicalEvidenceFile getTechnicalEvidenceFile, State state, tq.e<? super i0> eVar) {
            o oVar = l.this.new o(eVar);
            oVar.f142044f = getTechnicalEvidenceFile;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo32/a$b;", "<unused var>", "Lo32/b;", "Loq/i0;", "<anonymous>", "(Lo32/a$b;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<o32.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142046e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142046e;
            if (i15 == 0) {
                oq.u.b(obj);
                l lVar = l.this;
                o32.a.j.C3498a c3498a = o32.a.j.C3498a.f141933a;
                this.f142046e = 1;
                if (lVar.F(c3498a, this) == objE) {
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
        public final Object w(o32.a.b bVar, State state, tq.e<? super i0> eVar) {
            return l.this.new p(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo32/a$i;", "<unused var>", "Lo32/b;", "Loq/i0;", "<anonymous>", "(Lo32/a$i;Lo32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<o32.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142048e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f142048e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = l.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            l lVar = l.this;
            if (iVarA instanceof dx.i.Left) {
                lVar.O9(lVar.labelProvider.c(e02.a.I4));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o32.a.i iVar, State state, tq.e<? super i0> eVar) {
            return l.this.new q(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, u04.a aVar2, p32.f fVar, v vVar, b12.c cVar, d0 d0Var, z zVar, e0 e0Var, ib4.c cVar2, i70.e eVar, l12.d dVar, p02.e eVar2, u uVar, a14.d dVar2, mx.c cVar3, a14.m mVar, l12.b bVar, w wVar, ac4.a aVar3, DeliveryMessageDetails deliveryMessageDetails) {
        this.commonEndpoints = aVar2;
        this.mapper = fVar;
        this.getMessageTechnicalEvidenceUseCase = vVar;
        this.electronicDeliveryErrorMapper = cVar;
        this.getUpoFileUseCase = d0Var;
        this.saveDownloadedFileUseCase = zVar;
        this.getUpoPreviewFileUseCase = e0Var;
        this.genericDomainErrorMapper = cVar2;
        this.globalSnackBarManager = eVar;
        this.fileAccessPermissionDialogMapper = dVar;
        this.downloadTechnicalEvidencesFileUC = eVar2;
        this.getMessageTechnicalEvidenceFileUC = uVar;
        this.copyToClipboardUseCase = dVar2;
        this.labelProvider = cVar3;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.attachmentTooBigToDownloadDialogMapper = bVar;
        this.openUrlIntentUseCase = wVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.details = deliveryMessageDetails;
        State state = new State(deliveryMessageDetails);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: o32.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.P9(this.f141958a, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), L9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F9(y0 y0Var, er.l<? super tq.e<? super dx.i<? extends dx.b, DomainFile>>, ? extends Object> lVar, er.a<i0> aVar, er.a<i0> aVar2, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(y0Var, this, lVar, aVar, aVar2, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H9(u04.b downloadStatus) {
        int i15 = a.f141981a[downloadStatus.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            O9(this.labelProvider.c(I9(downloadStatus)));
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            O9(this.labelProvider.c(I9(downloadStatus)));
            d9(new o32.a.ShowDialog(this.fileAccessPermissionDialogMapper.b(new l12.d.Params(b9(o32.a.i.f141932a)))));
        }
    }

    private static final int I9(u04.b bVar) {
        return a.f141981a[bVar.ordinal()] == 1 ? e02.a.V1 : e02.a.U1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J9(dx.b bVar, er.a<i0> aVar, final er.a<i0> aVar2, int i15, tq.e<? super i0> eVar) {
        if ((bVar instanceof dx.b.Business) && ((dx.b.Business) bVar).getType() == n02.a.REFRESH_TOKEN_EXPIRED) {
            aVar.a();
        } else {
            if (bVar instanceof dx.b.g.e) {
                Object objF = Y1().F(new o32.a.j.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: o32.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.K9(aVar2, (ib4.c.b) obj);
                    }
                }, 2, null))), eVar);
                return objF == uq.b.e() ? objF : i0.f148189a;
            }
            O9(this.labelProvider.c(i15));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(er.a aVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o32.c.Data L9(State state) {
        return this.mapper.b(new p32.f.Params(state, b9(o32.a.b.f141923a), b9(o32.a.d.f141926a), b9(o32.a.f.f141929a), b9(o32.a.g.f141930a), new c(), new er.l() { // from class: o32.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.M9(this.f141956a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(l lVar, String str) {
        lVar.d9(new o32.a.CopyToClipboard(str, lVar.labelProvider.c(e02.a.f46568m)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O9(Label message) {
        this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(message, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(final l lVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: o32.h
            @Override // er.l
            public final Object b(Object obj) {
                return l.Q9(this.f141955a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(l lVar, k10.z zVar) {
        i iVar = lVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o32.a.Authorize.class), oVar, iVar);
        zVar.x(q0.c(o32.a.d.class), oVar, lVar.new j(null));
        zVar.x(q0.c(o32.a.OpenUrl.class), oVar, lVar.new k(null));
        zVar.x(q0.c(o32.a.f.class), oVar, lVar.new C3500l(null));
        zVar.x(q0.c(o32.a.g.class), oVar, lVar.new m(null));
        zVar.x(q0.c(o32.a.DownloadTechnicalEvidencesFile.class), oVar, lVar.new n(null));
        zVar.x(q0.c(o32.a.GetTechnicalEvidenceFile.class), oVar, lVar.new o(null));
        zVar.x(q0.c(o32.a.b.class), oVar, lVar.new p(null));
        zVar.x(q0.c(o32.a.i.class), oVar, lVar.new q(null));
        zVar.x(q0.c(o32.a.OnError.class), oVar, lVar.new e(null));
        zVar.x(q0.c(o32.a.ShowError.class), oVar, lVar.new f(null));
        zVar.x(q0.c(o32.a.ShowDialog.class), oVar, lVar.new g(null));
        zVar.x(q0.c(o32.a.CopyToClipboard.class), oVar, lVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(o32.a.j jVar, tq.e<? super i0> eVar) {
        return super.F(jVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DeliveryMessageDetails deliveryMessageDetails) {
        super.P5(deliveryMessageDetails);
    }

    @Override // zx.b
    public xw.b<o32.a.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, o32.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o32.c.Data> getState() {
        return this.state;
    }
}
