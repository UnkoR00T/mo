package fr3;

import android.graphics.Bitmap;
import cb4.DialogData;
import cr3.Document;
import cr3.WruDocumentData;
import cr3.WruDocumentItem;
import fr.q0;
import hr3.LicenceCode;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.CancellationException;
import mu.p0;
import mu.r0;
import n20.State;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u008c\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u008d\u0001B\u0083\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+H\u0082@¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b2\u00103J\"\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003052\n\u0010'\u001a\u0006\u0012\u0002\b\u000304H\u0082@¢\u0006\u0004\b6\u00107J*\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003052\n\u0010'\u001a\u0006\u0012\u0002\b\u0003042\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;J#\u0010@\u001a\u00020-2\u0006\u0010=\u001a\u00020<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b@\u0010AJ\u001a\u0010B\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+H\u0082@¢\u0006\u0004\bB\u0010/J$\u0010H\u001a\u00020-*\u00020C2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0082@¢\u0006\u0004\bH\u0010IJ\u0018\u0010K\u001a\u00020J2\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\bK\u0010LJ\u0018\u0010O\u001a\u00020-2\u0006\u0010N\u001a\u00020MH\u0096\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020-H\u0096\u0001¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010w\u001a\b\u0012\u0004\u0012\u00020r0q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR,\u0010}\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040x8\u0014X\u0094\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R#\u0010'\u001a\b\u0012\u0004\u0012\u00020(0~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u0001008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u00103¨\u0006\u008e\u0001"}, d2 = {"Lfr3/y;", "Ll00/g;", "Ln20/b;", "Lfr3/c;", "Ln20/a;", "Lfr3/d;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lgr3/k;", "wruScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "Ldr3/a;", "checkAndGetWruDocumentDataUseCase", "snackBarManagerStateHolder", "Lb00/c;", "imageConverter", "Lez/a;", "currentTimeProvider", "Lmx/c;", "labelProvider", "Lar3/a;", "wruContainersInteractor", "Ldr3/b;", "wruDocumentGetOfflineStatusUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lwz/a;", "barcodeGenerator", "Lhr3/d;", "licenceCode", "<init>", "(Ln20/j;Lgr3/k;Lib4/c;Ldr3/a;Li70/n;Lb00/c;Lez/a;Lmx/c;Lar3/a;Ldr3/b;Lac4/a;Lmz3/z;Lmz3/w;Lwz/a;Lhr3/d;)V", "state", "Lfr3/d$a;", "R9", "(Ln20/b;)Lfr3/d$a;", "", "documentId", "Loq/i0;", "L9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Ljava/time/OffsetDateTime;", "D9", "()Lmu/g;", "Lk10/c0;", "Lk10/l;", "I9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lcr3/e;", "localDocumentData", "P9", "(Lk10/c0;Lcr3/e;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lfr3/a;", "closeAction", "M9", "(Ldx/b;Lfr3/a;)V", "E9", "Lfr3/c$b;", "", "licenceType", "Lcb4/d;", "refreshDialogData", "K9", "(Lfr3/c$b;ILcb4/d;Ltq/e;)Ljava/lang/Object;", "Lfr3/b;", "G9", "(Lcr3/e;Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lgr3/k;", "c", "Lib4/c;", "d", "Ldr3/a;", "e", "Li70/n;", "f", "Lb00/c;", "g", "Lez/a;", "h", "Lmx/c;", "j", "Lar3/a;", "k", "Ldr3/b;", "l", "Lac4/a;", "m", "Lmz3/z;", "n", "Lmz3/w;", "p", "Lwz/a;", "q", "Lhr3/d;", "J9", "()Lhr3/d;", "Lmu/b0;", "Lhr3/e;", "r", "Lmu/b0;", "H9", "()Lmu/b0;", "bottomSheetState", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lfr3/a$g;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Li70/p;", "snackBarVisibilityState", "w", "a", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<State<fr3.c>, n20.a> implements fr3.d, zx.d, i70.n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f66642x = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gr3.k wruScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dr3.a checkAndGetWruDocumentDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ar3.a wruContainersInteractor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final dr3.b wruDocumentGetOfflineStatusUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final LicenceCode licenceCode;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<hr3.e> bottomSheetState = r0.a(hr3.e.a.f86454a);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<fr3.c>, n20.a> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<fr3.d.a> state;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.g> navAction;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "Ljava/time/OffsetDateTime;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<mu.h<? super OffsetDateTime>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f66662f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:11:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f66662f
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f66661e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1f
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                oq.u.b(r8)
                goto L39
            L1f:
                oq.u.b(r8)
            L22:
                tq.i r8 = r7.getContext()
                boolean r8 = ju.g2.n(r8)
                if (r8 == 0) goto L4e
                r7.f66662f = r0
                r7.f66661e = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L39
                goto L4d
            L39:
                fr3.y r8 = fr3.y.this
                ez.a r8 = fr3.y.v9(r8)
                java.time.OffsetDateTime r8 = r8.f()
                r7.f66662f = r0
                r7.f66661e = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L22
            L4d:
                return r1
            L4e:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fr3.y.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super OffsetDateTime> hVar, tq.e<? super i0> eVar) {
            return ((b) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = y.this.new b(eVar);
            bVar.f66662f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66664e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f66666g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f66666g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f66664e;
            if (i15 == 0) {
                oq.u.b(obj);
                ar3.a aVar = y.this.wruContainersInteractor;
                String str = this.f66666g;
                int licenceCode = y.this.getLicenceCode().getLicenceCode();
                this.f66664e = 1;
                obj = aVar.i(str, licenceCode, this);
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
            y yVar = y.this;
            if (iVar instanceof dx.i.Left) {
                y.N9(yVar, (dx.b) ((dx.i.Left) iVar).b(), null, 2, null);
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                yVar.d9(a.C1485a.f66566a);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return y.this.new c(this.f66666g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f66669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f66670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f66671h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f66672j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f66673k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f66674l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f66675m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f66676n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f66678q;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f66676n = obj;
            this.f66678q |= PKIFailureInfo.systemUnavail;
            return y.this.G9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f66681f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f66682g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f66683h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f66684j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f66685k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f66686l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f66687m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f66688n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f66690q;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f66688n = obj;
            this.f66690q |= PKIFailureInfo.systemUnavail;
            return y.this.I9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f66693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f66694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f66695h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f66696j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f66697k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f66698l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66700n;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f66698l = obj;
            this.f66700n |= PKIFailureInfo.systemUnavail;
            return y.this.L9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f66703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f66704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f66705h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f66706j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f66707k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f66708l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f66709m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66710n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f66711p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66713r;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f66711p = obj;
            this.f66713r |= PKIFailureInfo.systemUnavail;
            return y.this.P9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements mu.g<fr3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f66714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f66715b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f66716a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f66717b;

            /* JADX INFO: renamed from: fr3.y$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1489a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f66718d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f66719e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f66720f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f66722h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f66723j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f66724k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f66725l;

                public C1489a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f66718d = obj;
                    this.f66719e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar) {
                this.f66716a = hVar;
                this.f66717b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1489a c1489a;
                if (eVar instanceof C1489a) {
                    c1489a = (C1489a) eVar;
                    int i15 = c1489a.f66719e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1489a.f66719e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1489a = new C1489a(eVar);
                    }
                } else {
                    c1489a = new C1489a(eVar);
                }
                Object obj2 = c1489a.f66718d;
                Object objE = uq.b.e();
                int i16 = c1489a.f66719e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f66716a;
                    fr3.d.a aVarR9 = this.f66717b.R9((State) obj);
                    c1489a.f66720f = vq.j.a(obj);
                    c1489a.f66722h = vq.j.a(c1489a);
                    c1489a.f66723j = vq.j.a(obj);
                    c1489a.f66724k = vq.j.a(hVar);
                    c1489a.f66725l = 0;
                    c1489a.f66719e = 1;
                    if (hVar.F(aVarR9, c1489a) == objE) {
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
            this.f66714a = gVar;
            this.f66715b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fr3.d.a> hVar, tq.e eVar) {
            Object objA = this.f66714a.a(new a(hVar, this.f66715b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr3/a$a;", "<unused var>", "Lfr3/c;", "state", "Loq/i0;", "<anonymous>", "(Lfr3/a$a;Lfr3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<a.C1485a, fr3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66727f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr3.c cVar = (fr3.c) this.f66727f;
            Object objE = uq.b.e();
            int i15 = this.f66726e;
            if (i15 == 0) {
                oq.u.b(obj);
                fr3.c.Initialized initialized = cVar instanceof fr3.c.Initialized ? (fr3.c.Initialized) cVar : null;
                if (fr.t.c(initialized != null ? vq.b.a(initialized.getIsBottomSheetVisible()) : null, vq.b.a(true))) {
                    y.this.d9(a.f.f66572a);
                } else {
                    xw.b<a.g> bVarY1 = y.this.Y1();
                    a.g.C1486a c1486a = a.g.C1486a.f66573a;
                    this.f66727f = vq.j.a(cVar);
                    this.f66726e = 1;
                    if (bVarY1.F(c1486a, this) == objE) {
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
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.C1485a c1485a, fr3.c cVar, tq.e<? super i0> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f66727f = cVar;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr3/a$c;", "action", "Lfr3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfr3/a$c;Lfr3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.Error, fr3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66730f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.Error error = (a.Error) this.f66730f;
            Object objE = uq.b.e();
            int i15 = this.f66729e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.g> bVarY1 = y.this.Y1();
                a.g.Error error2 = new a.g.Error(error.getErrorData());
                this.f66730f = vq.j.a(error);
                this.f66729e = 1;
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
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.Error error, fr3.c cVar, tq.e<? super i0> eVar) {
            j jVar = y.this.new j(eVar);
            jVar.f66730f = error;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfr3/c$a;", "state", "Lk10/l;", "Lfr3/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<fr3.c.a>, tq.e<? super k10.l<? extends fr3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f66733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66734g;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fr3.c.C1487c V(fr3.c.a aVar) {
            return fr3.c.C1487c.f66595a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fr3.c.C1487c X(fr3.c.a aVar) {
            return fr3.c.C1487c.f66595a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        
            if (r8.F(r3, r7) == r1) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f66734g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f66733f
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L2a
                if (r2 == r3) goto L22
                if (r2 != r4) goto L1a
                java.lang.Object r1 = r7.f66732e
                rq0.b$e r1 = (rq0.b.e) r1
                oq.u.b(r8)
                goto L7f
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                java.lang.Object r2 = r7.f66732e
                rq0.b$e r2 = (rq0.b.e) r2
                oq.u.b(r8)
                goto L57
            L2a:
                oq.u.b(r8)
                rq0.b$e$a r8 = rq0.b.e.INSTANCE
                fr3.y r2 = fr3.y.this
                hr3.d r2 = r2.getLicenceCode()
                int r2 = r2.getLicenceCode()
                rq0.b$e r2 = r8.a(r2)
                if (r2 == 0) goto L9c
                fr3.y r8 = fr3.y.this
                mz3.w r8 = fr3.y.x9(r8)
                mz3.w$a r5 = new mz3.w$a
                r5.<init>(r2)
                r7.f66734g = r0
                r7.f66732e = r2
                r7.f66733f = r3
                java.lang.Object r8 = r8.c(r5, r7)
                if (r8 != r1) goto L57
                goto L7e
            L57:
                mz3.w$b r8 = (mz3.w.b) r8
                boolean r3 = r8 instanceof mz3.w.b.NotReady
                if (r3 == 0) goto L84
                fr3.y r8 = fr3.y.this
                xw.b r8 = r8.Y1()
                fr3.a$g$d r3 = new fr3.a$g$d
                gv3.b$b r5 = new gv3.b$b
                r6 = 0
                r5.<init>(r2, r6, r4, r6)
                r3.<init>(r5)
                r7.f66734g = r0
                java.lang.Object r2 = vq.j.a(r2)
                r7.f66732e = r2
                r7.f66733f = r4
                java.lang.Object r8 = r8.F(r3, r7)
                if (r8 != r1) goto L7f
            L7e:
                return r1
            L7f:
                k10.l r8 = r0.c()
                return r8
            L84:
                mz3.w$b$b r1 = mz3.w.b.C3231b.f129717a
                boolean r8 = fr.t.c(r8, r1)
                if (r8 == 0) goto L96
                fr3.z r8 = new fr3.z
                r8.<init>()
                k10.l r8 = r0.d(r8)
                return r8
            L96:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            L9c:
                fr3.a0 r8 = new fr3.a0
                r8.<init>()
                k10.l r8 = r0.d(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: fr3.y.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fr3.c.a> c0Var, tq.e<? super k10.l<? extends fr3.c>> eVar) {
            return ((k) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            k kVar = y.this.new k(eVar);
            kVar.f66734g = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr3/c$c;", "it", "Loq/i0;", "<anonymous>", "(Lfr3/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<fr3.c.C1487c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66736e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f66736e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(a.d.f66569a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(fr3.c.C1487c c1487c, tq.e<? super i0> eVar) {
            return ((l) v(c1487c, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return y.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfr3/a$d;", "<unused var>", "Lk10/c0;", "Lfr3/c$c;", "state", "Lk10/l;", "Lfr3/c;", "<anonymous>", "(Lfr3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<fr3.a.d, k10.c0<fr3.c.C1487c>, tq.e<? super k10.l<? extends fr3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66739f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfr3/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fr3.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f66741e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y f66742f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<fr3.c.C1487c> f66743g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, k10.c0<fr3.c.C1487c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66742f = yVar;
                this.f66743g = c0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f66741e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                y yVar = this.f66742f;
                k10.c0<fr3.c.C1487c> c0Var = this.f66743g;
                this.f66741e = 1;
                Object objI9 = yVar.I9(c0Var, this);
                return objI9 == objE ? objE : objI9;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f66742f, this.f66743g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fr3.c>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66739f;
            Object objE = uq.b.e();
            int i15 = this.f66738e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y.this, c0Var, null);
            this.f66739f = vq.j.a(c0Var);
            this.f66738e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fr3.a.d dVar, k10.c0<fr3.c.C1487c> c0Var, tq.e<? super k10.l<? extends fr3.c>> eVar) {
            m mVar = y.this.new m(eVar);
            mVar.f66739f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfr3/a$d;", "<unused var>", "Lk10/c0;", "Lfr3/c$b;", "state", "Lk10/l;", "Lfr3/c;", "<anonymous>", "(Lfr3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<fr3.a.d, k10.c0<fr3.c.Initialized>, tq.e<? super k10.l<? extends fr3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66745f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfr3/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fr3.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f66747e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y f66748f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<fr3.c.Initialized> f66749g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, k10.c0<fr3.c.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66748f = yVar;
                this.f66749g = c0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f66747e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                y yVar = this.f66748f;
                k10.c0<fr3.c.Initialized> c0Var = this.f66749g;
                this.f66747e = 1;
                Object objI9 = yVar.I9(c0Var, this);
                return objI9 == objE ? objE : objI9;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f66748f, this.f66749g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fr3.c>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66745f;
            Object objE = uq.b.e();
            int i15 = this.f66744e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y.this, c0Var, null);
            this.f66745f = vq.j.a(c0Var);
            this.f66744e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fr3.a.d dVar, k10.c0<fr3.c.Initialized> c0Var, tq.e<? super k10.l<? extends fr3.c>> eVar) {
            n nVar = y.this.new n(eVar);
            nVar.f66745f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/time/OffsetDateTime;", "currentDateTime", "Lk10/c0;", "Lfr3/c$b;", "state", "Lk10/l;", "Lfr3/c;", "<anonymous>", "(Ljava/time/OffsetDateTime;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<OffsetDateTime, k10.c0<fr3.c.Initialized>, tq.e<? super k10.l<? extends fr3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66752g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fr3.c.Initialized O(OffsetDateTime offsetDateTime, fr3.c.Initialized initialized) {
            return fr3.c.Initialized.b(initialized, null, offsetDateTime, null, null, null, null, false, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OffsetDateTime offsetDateTime = (OffsetDateTime) this.f66751f;
            k10.c0 c0Var = (k10.c0) this.f66752g;
            uq.b.e();
            if (this.f66750e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: fr3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.o.O(offsetDateTime, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OffsetDateTime offsetDateTime, k10.c0<fr3.c.Initialized> c0Var, tq.e<? super k10.l<? extends fr3.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f66751f = offsetDateTime;
            oVar.f66752g = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfr3/a$i;", "action", "Lk10/c0;", "Lfr3/c$b;", "state", "Lk10/l;", "Lfr3/c;", "<anonymous>", "(Lfr3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<a.ShowBottomSheet, k10.c0<fr3.c.Initialized>, tq.e<? super k10.l<? extends fr3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66755g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fr3.c.Initialized O(fr3.c.Initialized initialized) {
            return fr3.c.Initialized.b(initialized, null, null, null, null, null, null, true, null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ShowBottomSheet showBottomSheet = (a.ShowBottomSheet) this.f66754f;
            k10.c0 c0Var = (k10.c0) this.f66755g;
            Object objE = uq.b.e();
            int i15 = this.f66753e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.b0<hr3.e> b0VarT = y.this.T();
                hr3.e wruBottomSheetState = showBottomSheet.getWruBottomSheetState();
                this.f66754f = vq.j.a(showBottomSheet);
                this.f66755g = c0Var;
                this.f66753e = 1;
                if (b0VarT.F(wruBottomSheetState, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: fr3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.p.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowBottomSheet showBottomSheet, k10.c0<fr3.c.Initialized> c0Var, tq.e<? super k10.l<? extends fr3.c>> eVar) {
            p pVar = y.this.new p(eVar);
            pVar.f66754f = showBottomSheet;
            pVar.f66755g = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfr3/a$f;", "<unused var>", "Lk10/c0;", "Lfr3/c$b;", "state", "Lk10/l;", "Lfr3/c;", "<anonymous>", "(Lfr3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<a.f, k10.c0<fr3.c.Initialized>, tq.e<? super k10.l<? extends fr3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66758f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fr3.c.Initialized O(fr3.c.Initialized initialized) {
            return fr3.c.Initialized.b(initialized, null, null, null, null, null, null, false, null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f66758f;
            Object objE = uq.b.e();
            int i15 = this.f66757e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.b0<hr3.e> b0VarT = y.this.T();
                hr3.e.a aVar = hr3.e.a.f86454a;
                this.f66758f = c0Var;
                this.f66757e = 1;
                if (b0VarT.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: fr3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.q.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.f fVar, k10.c0<fr3.c.Initialized> c0Var, tq.e<? super k10.l<? extends fr3.c>> eVar) {
            q qVar = y.this.new q(eVar);
            qVar.f66758f = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr3/a$e;", "action", "Lfr3/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lfr3/a$e;Lfr3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<a.GotToVerification, fr3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66762g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.GotToVerification gotToVerification = (a.GotToVerification) this.f66761f;
            fr3.c.Initialized initialized = (fr3.c.Initialized) this.f66762g;
            Object objE = uq.b.e();
            int i15 = this.f66760e;
            if (i15 == 0) {
                oq.u.b(obj);
                DialogData refreshDialogData = gotToVerification.getRefreshDialogData();
                int licenceType = gotToVerification.getLicenceType();
                y yVar = y.this;
                this.f66761f = vq.j.a(gotToVerification);
                this.f66762g = vq.j.a(initialized);
                this.f66760e = 1;
                if (yVar.K9(initialized, licenceType, refreshDialogData, this) == objE) {
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
        public final Object w(a.GotToVerification gotToVerification, fr3.c.Initialized initialized, tq.e<? super i0> eVar) {
            r rVar = y.this.new r(eVar);
            rVar.f66761f = gotToVerification;
            rVar.f66762g = initialized;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr3/a$k;", "action", "Lfr3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfr3/a$k;Lfr3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<a.ShowDialog, fr3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66765f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ShowDialog showDialog = (a.ShowDialog) this.f66765f;
            Object objE = uq.b.e();
            int i15 = this.f66764e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.g> bVarY1 = y.this.Y1();
                a.g.ShowDialog showDialog2 = new a.g.ShowDialog(showDialog.getDialogData());
                this.f66765f = vq.j.a(showDialog);
                this.f66764e = 1;
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
        public final Object w(a.ShowDialog showDialog, fr3.c.Initialized initialized, tq.e<? super i0> eVar) {
            s sVar = y.this.new s(eVar);
            sVar.f66765f = showDialog;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr3/a$b;", "<unused var>", "Lfr3/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lfr3/a$b;Lfr3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<a.b, fr3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66768f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr3.c.Initialized initialized = (fr3.c.Initialized) this.f66768f;
            Object objE = uq.b.e();
            int i15 = this.f66767e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                Document document = initialized.getLocalDocumentData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                this.f66768f = vq.j.a(initialized);
                this.f66767e = 1;
                if (yVar.E9(documentId, this) == objE) {
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
        public final Object w(a.b bVar, fr3.c.Initialized initialized, tq.e<? super i0> eVar) {
            t tVar = y.this.new t(eVar);
            tVar.f66768f = initialized;
            return tVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfr3/a$j;", "<unused var>", "Lfr3/c$b;", "Loq/i0;", "<anonymous>", "(Lfr3/a$j;Lfr3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<a.j, fr3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f66771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f66772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f66773h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f66774j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f66775k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f66776l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f66777m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66778n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f66779p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f66780q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66781r;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [dx.j, int, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
        	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
        	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
        	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
        	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i left;
            Object objB;
            y yVar;
            ex.b bVar;
            Object objE = uq.b.e();
            ?? r15 = this.f66781r;
            try {
                try {
                    if (r15 == 0) {
                        oq.u.b(obj);
                        y yVar2 = y.this;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        ex.a aVar = new ex.a();
                        rq0.b.e eVarA = rq0.b.e.INSTANCE.a(yVar2.getLicenceCode().getLicenceCode());
                        if (eVarA == null) {
                            aVar.b(new dx.b.Generic(new Error("Couldn't get DocumentType from licenseCode: " + yVar2.getLicenceCode())));
                            throw new oq.g();
                        }
                        ar3.a aVar2 = yVar2.wruContainersInteractor;
                        er.a<i0> aVarB9 = yVar2.b9(a.b.f66567a);
                        this.f66770e = yVar2;
                        this.f66771f = jVarA;
                        this.f66772g = vq.j.a(aVar);
                        this.f66773h = vq.j.a(aVar);
                        this.f66774j = vq.j.a(eVarA);
                        this.f66775k = aVar;
                        this.f66776l = 0;
                        this.f66777m = 0;
                        this.f66778n = 0;
                        this.f66779p = 0;
                        this.f66780q = 0;
                        this.f66781r = 1;
                        Object objF = aVar2.f(eVarA, aVarB9, this);
                        if (objF == objE) {
                            return objE;
                        }
                        yVar = yVar2;
                        obj = objF;
                        bVar = aVar;
                    } else {
                        if (r15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) this.f66775k;
                        yVar = (y) this.f66770e;
                        try {
                            oq.u.b(obj);
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    }
                    dx.i iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Right) {
                        yVar.d9(new a.ShowDialog((DialogData) ((dx.i.Right) iVar).b()));
                    }
                    left = new dx.i.Right((DialogData) bVar.a(iVar));
                } catch (Exception e16) {
                    px.f fVar = px.f.f163100a;
                    String message = e16.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e16, px.c.a(r15));
                    dx.i iVarA = r15.a(e16);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVarA).b();
                    }
                    left = new dx.i.Left(objB);
                }
            } catch (ex.c e17) {
                left = new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
            y yVar3 = y.this;
            if (left instanceof dx.i.Left) {
                y.N9(yVar3, (dx.b) ((dx.i.Left) left).b(), null, 2, null);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.j jVar, fr3.c.Initialized initialized, tq.e<? super i0> eVar) {
            return y.this.new u(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr3/a$l;", "action", "Lfr3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfr3/a$l;Lfr3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<a.ShowSnackBar, fr3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66784f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.ShowSnackBar showSnackBar = (a.ShowSnackBar) this.f66784f;
            uq.b.e();
            if (this.f66783e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.y(new p50.a.DefaultWithIcon(showSnackBar.getValue(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a.ShowSnackBar showSnackBar, fr3.c.Initialized initialized, tq.e<? super i0> eVar) {
            v vVar = y.this.new v(eVar);
            vVar.f66784f = showSnackBar;
            return vVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr3/a$h;", "<unused var>", "Lfr3/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lfr3/a$h;Lfr3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<a.h, fr3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66787f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr3.c.Initialized initialized = (fr3.c.Initialized) this.f66787f;
            Object objE = uq.b.e();
            int i15 = this.f66786e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                Document document = initialized.getLocalDocumentData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                this.f66787f = vq.j.a(initialized);
                this.f66786e = 1;
                if (yVar.L9(documentId, this) == objE) {
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
        public final Object w(a.h hVar, fr3.c.Initialized initialized, tq.e<? super i0> eVar) {
            w wVar = y.this.new w(eVar);
            wVar.f66787f = initialized;
            return wVar.J(i0.f148189a);
        }
    }

    public y(n20.j jVar, gr3.k kVar, ib4.c cVar, dr3.a aVar, i70.n nVar, b00.c cVar2, ez.a aVar2, mx.c cVar3, ar3.a aVar3, dr3.b bVar, ac4.a aVar4, mz3.z zVar, mz3.w wVar, wz.a aVar5, LicenceCode licenceCode) {
        this.wruScreenMapper = kVar;
        this.genericDomainErrorMapper = cVar;
        this.checkAndGetWruDocumentDataUseCase = aVar;
        this.snackBarManagerStateHolder = nVar;
        this.imageConverter = cVar2;
        this.currentTimeProvider = aVar2;
        this.labelProvider = cVar3;
        this.wruContainersInteractor = aVar3;
        this.wruDocumentGetOfflineStatusUseCase = bVar;
        this.callActionWithLoaderUseCase = aVar4;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar;
        this.barcodeGenerator = aVar5;
        this.licenceCode = licenceCode;
        fr3.c.a aVar6 = fr3.c.a.f66586a;
        this.stateMachine = jVar.a(aVar6, new er.l() { // from class: fr3.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.W9(this.f66640a, (k10.v) obj);
            }
        });
        this.state = a9(new h(e9().getState(), this), R9(new State<>(aVar6, null, 2, null)));
        this.navAction = new xw.b<>();
    }

    private final mu.g<OffsetDateTime> D9() {
        return mu.i.I(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E9(String str, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(str, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x011d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0157  */
    /* JADX WARN: Code duplicated, block: B:42:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b7 -> B:43:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0108 -> B:43:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x010a -> B:43:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0157 -> B:39:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x016c -> B:43:0x016e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x00fd
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object G9(cr3.WruDocumentData r22, tq.e<? super fr3.AdditionalParametersBitmaps> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr3.y.G9(cr3.e, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x0107  */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017a, code lost:
    
        if (r14 == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I9(k10.c0<?> r13, tq.e<? super k10.l<? extends fr3.c>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr3.y.I9(k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K9(fr3.c.Initialized initialized, int i15, DialogData dialogData, tq.e<? super i0> eVar) {
        if (initialized.getDocumentStatus().e()) {
            Object objF = Y1().F(new a.g.GotToVerification(i15), eVar);
            return objF == uq.b.e() ? objF : i0.f148189a;
        }
        d9(new a.ShowDialog(dialogData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x010b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:40:0x0147  */
    /* JADX WARN: Code duplicated, block: B:42:0x014b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0158  */
    /* JADX WARN: Code duplicated, block: B:45:0x0169  */
    /* JADX WARN: Code duplicated, block: B:47:0x016d  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0140, code lost:
    
        if (F(r8, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x019d, code lost:
    
        if (r6.F(r12, r2) == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L9(java.lang.String r18, tq.e<? super oq.i0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr3.y.L9(java.lang.String, tq.e):java.lang.Object");
    }

    private final void M9(final dx.b domainError, final a closeAction) {
        d9(new a.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: fr3.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.O9(domainError, closeAction, this, (ib4.c.b) obj);
            }
        }, 2, null))));
    }

    static /* synthetic */ void N9(y yVar, dx.b bVar, a aVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar = null;
        }
        yVar.M9(bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(dx.b bVar, a aVar, y yVar, ib4.c.b bVar2) {
        if (bVar2 instanceof ib4.c.b.a.Primary) {
            if (bVar instanceof dx.b.Business) {
                if (((dx.b.Business) bVar).getType() == br3.a.LICENCE_NOT_FOUND) {
                    if (aVar != null) {
                        yVar.d9(aVar);
                    } else {
                        yVar.d9(a.d.f66569a);
                    }
                } else if (aVar != null) {
                    yVar.d9(aVar);
                }
            } else if (aVar != null) {
                yVar.d9(aVar);
            }
        } else if ((bVar2 instanceof ib4.c.b.a.Close) || (bVar2 instanceof ib4.c.b.AbstractC2161b.a) || (bVar2 instanceof ib4.c.b.a.Secondary)) {
            if (aVar != null) {
                yVar.d9(aVar);
            }
        } else {
            if (!(bVar2 instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            yVar.d9(a.h.f66578a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x017a  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P9(k10.c0<?> c0Var, WruDocumentData wruDocumentData, tq.e<? super k10.l<? extends fr3.c>> eVar) throws Throwable {
        g gVar;
        k10.c0<?> c0Var2;
        WruDocumentData wruDocumentData2;
        k10.c0<?> c0Var3;
        cr3.b bVar;
        int i15;
        int i16;
        WruDocumentData wruDocumentData3;
        dx.i iVar;
        Bitmap bitmap;
        String photo;
        int i17;
        dx.i iVar2;
        Object objB;
        WruDocumentData wruDocumentData4;
        k10.c0<?> c0Var4;
        Bitmap bitmap2;
        Object objG9;
        int i18;
        k10.c0<?> c0Var5;
        Bitmap bitmap3;
        Bitmap bitmap4;
        cr3.b bVar2;
        AdditionalParametersBitmaps additionalParametersBitmaps;
        Object objH;
        final Bitmap bitmap5;
        final AdditionalParametersBitmaps additionalParametersBitmaps2;
        final WruDocumentData wruDocumentData5;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i19 = gVar.f66713r;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f66713r = i19 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objE = gVar.f66711p;
        Object objE2 = uq.b.e();
        int i25 = gVar.f66713r;
        Bitmap bitmap6 = null;
        if (i25 == 0) {
            oq.u.b(objE);
            dr3.b bVar3 = this.wruDocumentGetOfflineStatusUseCase;
            LicenceCode licenceCode = this.licenceCode;
            List<WruDocumentItem> listC = wruDocumentData.getScope().c();
            Document document = wruDocumentData.getDocument();
            dr3.b.Params params = new dr3.b.Params(licenceCode, document != null ? document.getDocumentId() : null, listC);
            c0Var2 = c0Var;
            gVar.f66701d = c0Var2;
            wruDocumentData2 = wruDocumentData;
            gVar.f66702e = wruDocumentData2;
            gVar.f66713r = 1;
            objE = bVar3.e(params, gVar);
            if (objE != objE2) {
            }
            return objE2;
        }
        if (i25 == 1) {
            WruDocumentData wruDocumentData6 = (WruDocumentData) gVar.f66702e;
            k10.c0<?> c0Var6 = (k10.c0) gVar.f66701d;
            oq.u.b(objE);
            wruDocumentData2 = wruDocumentData6;
            c0Var2 = c0Var6;
        } else {
            if (i25 == 2) {
                i15 = gVar.f66709m;
                i16 = gVar.f66708l;
                bVar = (cr3.b) gVar.f66704g;
                iVar = (dx.i) gVar.f66703f;
                wruDocumentData3 = (WruDocumentData) gVar.f66702e;
                c0Var3 = (k10.c0) gVar.f66701d;
                oq.u.b(objE);
                bitmap = (Bitmap) ((dx.i) objE).a();
                photo = wruDocumentData3.getUserDocumentData().getPhoto();
                if (photo != null) {
                    b00.c cVar = this.imageConverter;
                    gVar.f66701d = c0Var3;
                    gVar.f66702e = wruDocumentData3;
                    gVar.f66703f = vq.j.a(iVar);
                    gVar.f66704g = bVar;
                    gVar.f66705h = vq.j.a(photo);
                    gVar.f66706j = bitmap;
                    gVar.f66708l = i16;
                    gVar.f66709m = i15;
                    gVar.f66710n = 0;
                    gVar.f66713r = 3;
                    objB = cVar.b(photo, gVar);
                    if (objB != objE2) {
                        i17 = i16;
                        iVar2 = iVar;
                        wruDocumentData4 = wruDocumentData3;
                        c0Var4 = c0Var3;
                        bitmap2 = bitmap;
                        objE = objB;
                        wruDocumentData3 = wruDocumentData4;
                        c0Var3 = c0Var4;
                        bitmap6 = (Bitmap) ((dx.i) objE).a();
                        bitmap = bitmap2;
                        gVar.f66701d = c0Var3;
                        gVar.f66702e = wruDocumentData3;
                        gVar.f66703f = vq.j.a(iVar2);
                        gVar.f66704g = bVar;
                        gVar.f66705h = bitmap6;
                        gVar.f66706j = bitmap;
                        gVar.f66708l = i17;
                        gVar.f66709m = i15;
                        gVar.f66713r = 4;
                        objG9 = G9(wruDocumentData3, gVar);
                        if (objG9 != objE2) {
                            i18 = i17;
                            c0Var5 = c0Var3;
                            bitmap3 = bitmap;
                            objE = objG9;
                            bitmap4 = bitmap6;
                            bVar2 = bVar;
                            additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                            ar3.a aVar = this.wruContainersInteractor;
                            LicenceCode licenceCode2 = this.licenceCode;
                            gVar.f66701d = c0Var5;
                            gVar.f66702e = wruDocumentData3;
                            gVar.f66703f = vq.j.a(iVar2);
                            gVar.f66704g = bVar2;
                            gVar.f66705h = bitmap4;
                            gVar.f66706j = additionalParametersBitmaps;
                            gVar.f66707k = bitmap3;
                            gVar.f66708l = i18;
                            gVar.f66709m = i15;
                            gVar.f66713r = 5;
                            objH = aVar.h(licenceCode2, gVar);
                            if (objH != objE2) {
                                bitmap5 = bitmap3;
                                additionalParametersBitmaps2 = additionalParametersBitmaps;
                                objE = objH;
                                wruDocumentData5 = wruDocumentData3;
                            }
                        }
                    }
                } else {
                    i17 = i16;
                    iVar2 = iVar;
                    gVar.f66701d = c0Var3;
                    gVar.f66702e = wruDocumentData3;
                    gVar.f66703f = vq.j.a(iVar2);
                    gVar.f66704g = bVar;
                    gVar.f66705h = bitmap6;
                    gVar.f66706j = bitmap;
                    gVar.f66708l = i17;
                    gVar.f66709m = i15;
                    gVar.f66713r = 4;
                    objG9 = G9(wruDocumentData3, gVar);
                    if (objG9 != objE2) {
                        i18 = i17;
                        c0Var5 = c0Var3;
                        bitmap3 = bitmap;
                        objE = objG9;
                        bitmap4 = bitmap6;
                        bVar2 = bVar;
                        additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                        ar3.a aVar2 = this.wruContainersInteractor;
                        LicenceCode licenceCode3 = this.licenceCode;
                        gVar.f66701d = c0Var5;
                        gVar.f66702e = wruDocumentData3;
                        gVar.f66703f = vq.j.a(iVar2);
                        gVar.f66704g = bVar2;
                        gVar.f66705h = bitmap4;
                        gVar.f66706j = additionalParametersBitmaps;
                        gVar.f66707k = bitmap3;
                        gVar.f66708l = i18;
                        gVar.f66709m = i15;
                        gVar.f66713r = 5;
                        objH = aVar2.h(licenceCode3, gVar);
                        if (objH != objE2) {
                            bitmap5 = bitmap3;
                            additionalParametersBitmaps2 = additionalParametersBitmaps;
                            objE = objH;
                            wruDocumentData5 = wruDocumentData3;
                        }
                    }
                }
                return objE2;
            }
            if (i25 == 3) {
                i15 = gVar.f66709m;
                i17 = gVar.f66708l;
                bitmap2 = (Bitmap) gVar.f66706j;
                bVar = (cr3.b) gVar.f66704g;
                iVar2 = (dx.i) gVar.f66703f;
                wruDocumentData4 = (WruDocumentData) gVar.f66702e;
                c0Var4 = (k10.c0) gVar.f66701d;
                oq.u.b(objE);
                wruDocumentData3 = wruDocumentData4;
                c0Var3 = c0Var4;
                bitmap6 = (Bitmap) ((dx.i) objE).a();
                bitmap = bitmap2;
                gVar.f66701d = c0Var3;
                gVar.f66702e = wruDocumentData3;
                gVar.f66703f = vq.j.a(iVar2);
                gVar.f66704g = bVar;
                gVar.f66705h = bitmap6;
                gVar.f66706j = bitmap;
                gVar.f66708l = i17;
                gVar.f66709m = i15;
                gVar.f66713r = 4;
                objG9 = G9(wruDocumentData3, gVar);
                if (objG9 != objE2) {
                    i18 = i17;
                    c0Var5 = c0Var3;
                    bitmap3 = bitmap;
                    objE = objG9;
                    bitmap4 = bitmap6;
                    bVar2 = bVar;
                    additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                    ar3.a aVar3 = this.wruContainersInteractor;
                    LicenceCode licenceCode4 = this.licenceCode;
                    gVar.f66701d = c0Var5;
                    gVar.f66702e = wruDocumentData3;
                    gVar.f66703f = vq.j.a(iVar2);
                    gVar.f66704g = bVar2;
                    gVar.f66705h = bitmap4;
                    gVar.f66706j = additionalParametersBitmaps;
                    gVar.f66707k = bitmap3;
                    gVar.f66708l = i18;
                    gVar.f66709m = i15;
                    gVar.f66713r = 5;
                    objH = aVar3.h(licenceCode4, gVar);
                    if (objH != objE2) {
                        bitmap5 = bitmap3;
                        additionalParametersBitmaps2 = additionalParametersBitmaps;
                        objE = objH;
                        wruDocumentData5 = wruDocumentData3;
                    }
                }
                return objE2;
            }
            if (i25 == 4) {
                i15 = gVar.f66709m;
                int i26 = gVar.f66708l;
                bitmap3 = (Bitmap) gVar.f66706j;
                Bitmap bitmap7 = (Bitmap) gVar.f66705h;
                bVar = (cr3.b) gVar.f66704g;
                iVar2 = (dx.i) gVar.f66703f;
                WruDocumentData wruDocumentData7 = (WruDocumentData) gVar.f66702e;
                c0Var5 = (k10.c0) gVar.f66701d;
                oq.u.b(objE);
                bitmap4 = bitmap7;
                wruDocumentData3 = wruDocumentData7;
                i18 = i26;
                bVar2 = bVar;
                additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                ar3.a aVar4 = this.wruContainersInteractor;
                LicenceCode licenceCode5 = this.licenceCode;
                gVar.f66701d = c0Var5;
                gVar.f66702e = wruDocumentData3;
                gVar.f66703f = vq.j.a(iVar2);
                gVar.f66704g = bVar2;
                gVar.f66705h = bitmap4;
                gVar.f66706j = additionalParametersBitmaps;
                gVar.f66707k = bitmap3;
                gVar.f66708l = i18;
                gVar.f66709m = i15;
                gVar.f66713r = 5;
                objH = aVar4.h(licenceCode5, gVar);
                if (objH != objE2) {
                    bitmap5 = bitmap3;
                    additionalParametersBitmaps2 = additionalParametersBitmaps;
                    objE = objH;
                    wruDocumentData5 = wruDocumentData3;
                }
                return objE2;
            }
            if (i25 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap5 = (Bitmap) gVar.f66707k;
            AdditionalParametersBitmaps additionalParametersBitmaps3 = (AdditionalParametersBitmaps) gVar.f66706j;
            bitmap4 = (Bitmap) gVar.f66705h;
            bVar2 = (cr3.b) gVar.f66704g;
            WruDocumentData wruDocumentData8 = (WruDocumentData) gVar.f66702e;
            k10.c0<?> c0Var7 = (k10.c0) gVar.f66701d;
            oq.u.b(objE);
            c0Var5 = c0Var7;
            wruDocumentData5 = wruDocumentData8;
            additionalParametersBitmaps2 = additionalParametersBitmaps3;
        }
        final Bitmap bitmap8 = bitmap4;
        final cr3.b bVar4 = bVar2;
        final String str = (String) ((dx.i) objE).a();
        return c0Var5.d(new er.l() { // from class: fr3.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.Q9(wruDocumentData5, this, bitmap5, bitmap8, bVar4, str, additionalParametersBitmaps2, obj);
            }
        });
        dx.i iVar3 = (dx.i) objE;
        if (iVar3 instanceof dx.i.Left) {
            N9(this, (dx.b) ((dx.i.Left) iVar3).b(), null, 2, null);
            return c0Var2.c();
        }
        if (!(iVar3 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        cr3.b bVar5 = (cr3.b) ((dx.i.Right) iVar3).b();
        String documentLogo = wruDocumentData2.getScope().getDocumentLogo();
        if (documentLogo != null) {
            b00.c cVar2 = this.imageConverter;
            gVar.f66701d = c0Var2;
            gVar.f66702e = wruDocumentData2;
            gVar.f66703f = vq.j.a(iVar3);
            gVar.f66704g = bVar5;
            gVar.f66705h = vq.j.a(documentLogo);
            gVar.f66708l = 0;
            gVar.f66709m = 0;
            gVar.f66710n = 0;
            gVar.f66713r = 2;
            Object objB2 = cVar2.b(documentLogo, gVar);
            if (objB2 != objE2) {
                c0Var3 = c0Var2;
                i15 = 0;
                wruDocumentData3 = wruDocumentData2;
                iVar = iVar3;
                objE = objB2;
                bVar = bVar5;
                i16 = 0;
                bitmap = (Bitmap) ((dx.i) objE).a();
                photo = wruDocumentData3.getUserDocumentData().getPhoto();
                if (photo != null) {
                    b00.c cVar3 = this.imageConverter;
                    gVar.f66701d = c0Var3;
                    gVar.f66702e = wruDocumentData3;
                    gVar.f66703f = vq.j.a(iVar);
                    gVar.f66704g = bVar;
                    gVar.f66705h = vq.j.a(photo);
                    gVar.f66706j = bitmap;
                    gVar.f66708l = i16;
                    gVar.f66709m = i15;
                    gVar.f66710n = 0;
                    gVar.f66713r = 3;
                    objB = cVar3.b(photo, gVar);
                    if (objB != objE2) {
                        i17 = i16;
                        iVar2 = iVar;
                        wruDocumentData4 = wruDocumentData3;
                        c0Var4 = c0Var3;
                        bitmap2 = bitmap;
                        objE = objB;
                        wruDocumentData3 = wruDocumentData4;
                        c0Var3 = c0Var4;
                        bitmap6 = (Bitmap) ((dx.i) objE).a();
                        bitmap = bitmap2;
                        gVar.f66701d = c0Var3;
                        gVar.f66702e = wruDocumentData3;
                        gVar.f66703f = vq.j.a(iVar2);
                        gVar.f66704g = bVar;
                        gVar.f66705h = bitmap6;
                        gVar.f66706j = bitmap;
                        gVar.f66708l = i17;
                        gVar.f66709m = i15;
                        gVar.f66713r = 4;
                        objG9 = G9(wruDocumentData3, gVar);
                        if (objG9 != objE2) {
                            i18 = i17;
                            c0Var5 = c0Var3;
                            bitmap3 = bitmap;
                            objE = objG9;
                            bitmap4 = bitmap6;
                            bVar2 = bVar;
                            additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                            ar3.a aVar5 = this.wruContainersInteractor;
                            LicenceCode licenceCode6 = this.licenceCode;
                            gVar.f66701d = c0Var5;
                            gVar.f66702e = wruDocumentData3;
                            gVar.f66703f = vq.j.a(iVar2);
                            gVar.f66704g = bVar2;
                            gVar.f66705h = bitmap4;
                            gVar.f66706j = additionalParametersBitmaps;
                            gVar.f66707k = bitmap3;
                            gVar.f66708l = i18;
                            gVar.f66709m = i15;
                            gVar.f66713r = 5;
                            objH = aVar5.h(licenceCode6, gVar);
                            if (objH != objE2) {
                                bitmap5 = bitmap3;
                                additionalParametersBitmaps2 = additionalParametersBitmaps;
                                objE = objH;
                                wruDocumentData5 = wruDocumentData3;
                                final Bitmap bitmap9 = bitmap4;
                                final cr3.b bVar6 = bVar2;
                                final String str2 = (String) ((dx.i) objE).a();
                                return c0Var5.d(new er.l() { // from class: fr3.v
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return y.Q9(wruDocumentData5, this, bitmap5, bitmap9, bVar6, str2, additionalParametersBitmaps2, obj);
                                    }
                                });
                            }
                        }
                    }
                } else {
                    i17 = i16;
                    iVar2 = iVar;
                    gVar.f66701d = c0Var3;
                    gVar.f66702e = wruDocumentData3;
                    gVar.f66703f = vq.j.a(iVar2);
                    gVar.f66704g = bVar;
                    gVar.f66705h = bitmap6;
                    gVar.f66706j = bitmap;
                    gVar.f66708l = i17;
                    gVar.f66709m = i15;
                    gVar.f66713r = 4;
                    objG9 = G9(wruDocumentData3, gVar);
                    if (objG9 != objE2) {
                        i18 = i17;
                        c0Var5 = c0Var3;
                        bitmap3 = bitmap;
                        objE = objG9;
                        bitmap4 = bitmap6;
                        bVar2 = bVar;
                        additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                        ar3.a aVar6 = this.wruContainersInteractor;
                        LicenceCode licenceCode7 = this.licenceCode;
                        gVar.f66701d = c0Var5;
                        gVar.f66702e = wruDocumentData3;
                        gVar.f66703f = vq.j.a(iVar2);
                        gVar.f66704g = bVar2;
                        gVar.f66705h = bitmap4;
                        gVar.f66706j = additionalParametersBitmaps;
                        gVar.f66707k = bitmap3;
                        gVar.f66708l = i18;
                        gVar.f66709m = i15;
                        gVar.f66713r = 5;
                        objH = aVar6.h(licenceCode7, gVar);
                        if (objH != objE2) {
                            bitmap5 = bitmap3;
                            additionalParametersBitmaps2 = additionalParametersBitmaps;
                            objE = objH;
                            wruDocumentData5 = wruDocumentData3;
                            final Bitmap bitmap10 = bitmap4;
                            final cr3.b bVar7 = bVar2;
                            final String str3 = (String) ((dx.i) objE).a();
                            return c0Var5.d(new er.l() { // from class: fr3.v
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return y.Q9(wruDocumentData5, this, bitmap5, bitmap10, bVar7, str3, additionalParametersBitmaps2, obj);
                                }
                            });
                        }
                    }
                }
            }
        } else {
            c0Var3 = c0Var2;
            bVar = bVar5;
            i15 = 0;
            i16 = 0;
            wruDocumentData3 = wruDocumentData2;
            iVar = iVar3;
            bitmap = null;
            photo = wruDocumentData3.getUserDocumentData().getPhoto();
            if (photo != null) {
                b00.c cVar4 = this.imageConverter;
                gVar.f66701d = c0Var3;
                gVar.f66702e = wruDocumentData3;
                gVar.f66703f = vq.j.a(iVar);
                gVar.f66704g = bVar;
                gVar.f66705h = vq.j.a(photo);
                gVar.f66706j = bitmap;
                gVar.f66708l = i16;
                gVar.f66709m = i15;
                gVar.f66710n = 0;
                gVar.f66713r = 3;
                objB = cVar4.b(photo, gVar);
                if (objB != objE2) {
                    i17 = i16;
                    iVar2 = iVar;
                    wruDocumentData4 = wruDocumentData3;
                    c0Var4 = c0Var3;
                    bitmap2 = bitmap;
                    objE = objB;
                    wruDocumentData3 = wruDocumentData4;
                    c0Var3 = c0Var4;
                    bitmap6 = (Bitmap) ((dx.i) objE).a();
                    bitmap = bitmap2;
                    gVar.f66701d = c0Var3;
                    gVar.f66702e = wruDocumentData3;
                    gVar.f66703f = vq.j.a(iVar2);
                    gVar.f66704g = bVar;
                    gVar.f66705h = bitmap6;
                    gVar.f66706j = bitmap;
                    gVar.f66708l = i17;
                    gVar.f66709m = i15;
                    gVar.f66713r = 4;
                    objG9 = G9(wruDocumentData3, gVar);
                    if (objG9 != objE2) {
                        i18 = i17;
                        c0Var5 = c0Var3;
                        bitmap3 = bitmap;
                        objE = objG9;
                        bitmap4 = bitmap6;
                        bVar2 = bVar;
                        additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                        ar3.a aVar7 = this.wruContainersInteractor;
                        LicenceCode licenceCode8 = this.licenceCode;
                        gVar.f66701d = c0Var5;
                        gVar.f66702e = wruDocumentData3;
                        gVar.f66703f = vq.j.a(iVar2);
                        gVar.f66704g = bVar2;
                        gVar.f66705h = bitmap4;
                        gVar.f66706j = additionalParametersBitmaps;
                        gVar.f66707k = bitmap3;
                        gVar.f66708l = i18;
                        gVar.f66709m = i15;
                        gVar.f66713r = 5;
                        objH = aVar7.h(licenceCode8, gVar);
                        if (objH != objE2) {
                            bitmap5 = bitmap3;
                            additionalParametersBitmaps2 = additionalParametersBitmaps;
                            objE = objH;
                            wruDocumentData5 = wruDocumentData3;
                            final Bitmap bitmap11 = bitmap4;
                            final cr3.b bVar8 = bVar2;
                            final String str4 = (String) ((dx.i) objE).a();
                            return c0Var5.d(new er.l() { // from class: fr3.v
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return y.Q9(wruDocumentData5, this, bitmap5, bitmap11, bVar8, str4, additionalParametersBitmaps2, obj);
                                }
                            });
                        }
                    }
                }
            } else {
                i17 = i16;
                iVar2 = iVar;
                gVar.f66701d = c0Var3;
                gVar.f66702e = wruDocumentData3;
                gVar.f66703f = vq.j.a(iVar2);
                gVar.f66704g = bVar;
                gVar.f66705h = bitmap6;
                gVar.f66706j = bitmap;
                gVar.f66708l = i17;
                gVar.f66709m = i15;
                gVar.f66713r = 4;
                objG9 = G9(wruDocumentData3, gVar);
                if (objG9 != objE2) {
                    i18 = i17;
                    c0Var5 = c0Var3;
                    bitmap3 = bitmap;
                    objE = objG9;
                    bitmap4 = bitmap6;
                    bVar2 = bVar;
                    additionalParametersBitmaps = (AdditionalParametersBitmaps) objE;
                    ar3.a aVar8 = this.wruContainersInteractor;
                    LicenceCode licenceCode9 = this.licenceCode;
                    gVar.f66701d = c0Var5;
                    gVar.f66702e = wruDocumentData3;
                    gVar.f66703f = vq.j.a(iVar2);
                    gVar.f66704g = bVar2;
                    gVar.f66705h = bitmap4;
                    gVar.f66706j = additionalParametersBitmaps;
                    gVar.f66707k = bitmap3;
                    gVar.f66708l = i18;
                    gVar.f66709m = i15;
                    gVar.f66713r = 5;
                    objH = aVar8.h(licenceCode9, gVar);
                    if (objH != objE2) {
                        bitmap5 = bitmap3;
                        additionalParametersBitmaps2 = additionalParametersBitmaps;
                        objE = objH;
                        wruDocumentData5 = wruDocumentData3;
                        final Bitmap bitmap12 = bitmap4;
                        final cr3.b bVar9 = bVar2;
                        final String str5 = (String) ((dx.i) objE).a();
                        return c0Var5.d(new er.l() { // from class: fr3.v
                            @Override // er.l
                            public final Object b(Object obj) {
                                return y.Q9(wruDocumentData5, this, bitmap5, bitmap12, bVar9, str5, additionalParametersBitmaps2, obj);
                            }
                        });
                    }
                }
            }
        }
        return objE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fr3.c.Initialized Q9(WruDocumentData wruDocumentData, y yVar, Bitmap bitmap, Bitmap bitmap2, cr3.b bVar, String str, AdditionalParametersBitmaps additionalParametersBitmaps, Object obj) {
        return new fr3.c.Initialized(wruDocumentData, yVar.currentTimeProvider.f(), bitmap, bitmap2, bVar, str, false, additionalParametersBitmaps, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fr3.d.a R9(State<fr3.c> state) {
        return this.wruScreenMapper.b(new gr3.k.Params(state, b9(a.C1485a.f66566a), new er.p() { // from class: fr3.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return y.S9(this.f66623a, ((Integer) obj).intValue(), (DialogData) obj2);
            }
        }, b9(a.h.f66578a), b9(a.j.f66580a), new er.l() { // from class: fr3.p
            @Override // er.l
            public final Object b(Object obj) {
                return y.T9(this.f66624a, (n20.a) obj);
            }
        }, new er.l() { // from class: fr3.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.U9(this.f66625a, (hr3.e) obj);
            }
        }, b9(a.f.f66572a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(y yVar, int i15, DialogData dialogData) {
        yVar.d9(new a.GotToVerification(i15, dialogData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(y yVar, n20.a aVar) {
        yVar.d9(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(y yVar, hr3.e eVar) {
        yVar.d9(new a.ShowBottomSheet(eVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(final y yVar, k10.v vVar) {
        vVar.c(q0.c(fr3.c.class), new er.l() { // from class: fr3.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.X9(this.f66626a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fr3.c.a.class), new er.l() { // from class: fr3.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.Y9(this.f66627a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fr3.c.C1487c.class), new er.l() { // from class: fr3.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.Z9(this.f66628a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fr3.c.Initialized.class), new er.l() { // from class: fr3.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.aa(this.f66629a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9(y yVar, k10.z zVar) {
        i iVar = yVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.C1485a.class), oVar, iVar);
        zVar.x(q0.c(a.Error.class), oVar, yVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y9(y yVar, k10.z zVar) {
        zVar.A(yVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z9(y yVar, k10.z zVar) {
        zVar.C(yVar.new l(null));
        m mVar = yVar.new m(null);
        zVar.v(q0.c(a.d.class), k10.o.CANCEL_PREVIOUS, mVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 aa(y yVar, k10.z zVar) {
        k10.k.m(zVar, yVar.D9(), null, new o(null), 2, null);
        p pVar = yVar.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.ShowBottomSheet.class), oVar, pVar);
        zVar.v(q0.c(a.f.class), oVar, yVar.new q(null));
        zVar.x(q0.c(a.GotToVerification.class), oVar, yVar.new r(null));
        zVar.x(q0.c(a.ShowDialog.class), oVar, yVar.new s(null));
        zVar.x(q0.c(a.b.class), oVar, yVar.new t(null));
        zVar.x(q0.c(a.j.class), oVar, yVar.new u(null));
        zVar.x(q0.c(a.ShowSnackBar.class), oVar, yVar.new v(null));
        zVar.x(q0.c(a.h.class), oVar, yVar.new w(null));
        zVar.v(q0.c(a.d.class), oVar, yVar.new n(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.g gVar, tq.e<? super i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // fr3.d
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public mu.b0<hr3.e> T() {
        return this.bottomSheetState;
    }

    /* JADX INFO: renamed from: J9, reason: from getter */
    public final LicenceCode getLicenceCode() {
        return this.licenceCode;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: V9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(LicenceCode licenceCode) {
        super.P5(licenceCode);
    }

    @Override // zx.b
    public xw.b<a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<fr3.c>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fr3.d.a> getState() {
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
