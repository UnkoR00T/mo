package o12;

import d12.OAuthWebViewData;
import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import fr.q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mu.p0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.DomainFile;
import z02.MessageDetailsPayload;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B£\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0001\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0082@¢\u0006\u0004\b7\u00108JT\u0010E\u001a\u0002042\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002040A2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002040A2\u0006\u0010.\u001a\u00020DH\u0082@¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u0002042\u0006\u0010.\u001a\u00020DH\u0082@¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u0002042\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ;\u0010P\u001a\u0002042\u0006\u0010N\u001a\u00020M2\u0006\u0010B\u001a\u00020\u00032\f\u0010C\u001a\b\u0012\u0004\u0012\u0002040A2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002040AH\u0002¢\u0006\u0004\bP\u0010QJE\u0010T\u001a\u0002042\u0006\u0010N\u001a\u00020M2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002040A2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002040A2\b\b\u0001\u0010S\u001a\u00020R2\u0006\u0010.\u001a\u00020DH\u0002¢\u0006\u0004\bT\u0010UJ\u0013\u0010V\u001a\u00020R*\u00020IH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u0002042\u0006\u0010X\u001a\u00020*H\u0016¢\u0006\u0004\bY\u0010ZR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010\u0088\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0083\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R%\u0010.\u001a\t\u0012\u0004\u0012\u00020/0\u0090\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0095\u0001"}, d2 = {"Lo12/y;", "Ll00/g;", "Lo12/e;", "Lo12/a;", "Lo12/f;", "", "Lyy/a;", "stateMachineFactory", "Lp02/i;", "fetchMessageDetailsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lp02/d;", "downloadMessageAttachmentsUseCase", "Lp12/h;", "messageDetailsMapper", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Lp02/e0;", "getUpoPreviewFileUseCase", "Ll12/d;", "fileAccessPermissionDialogMapper", "Li70/e;", "globalSnackBarManager", "Ll12/f;", "forwardMessageDialogMapper", "La14/w;", "openUrlIntentUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Ll12/b;", "attachmentTooBigToDownloadDialogMapper", "Lhb4/d;", "errorVMSFactory", "Lp12/b;", "deleteEpuapMessageDialogMapper", "Lq02/d;", "deleteMessageUC", "Lz02/b;", "messageDetailsPayload", "<init>", "(Lyy/a;Lp02/i;Lac4/a;Lib4/c;Lp02/d;Lp12/h;Lmx/c;Lu04/a;Lp02/e0;Ll12/d;Li70/e;Ll12/f;La14/w;La14/m;Ll12/b;Lhb4/d;Lp12/b;Lq02/d;Lz02/b;)V", "state", "Lo12/f$a;", "Z9", "(Lo12/e;)Lo12/f$a;", "Lmx/a;", "message", "Loq/i0;", "ca", "(Lmx/a;)V", "T9", "(Ltq/e;)Ljava/lang/Object;", "Leo0/g0;", "messageId", "Leo0/r;", "directoryId", "Leo0/y;", "attachmentId", "", "fileName", "Lkotlin/Function0;", "onRefreshToken", "onRetry", "Lo12/e$a;", "R9", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ler/a;Ler/a;Lo12/e$a;Ltq/e;)Ljava/lang/Object;", "da", "(Lo12/e$a;Ltq/e;)Ljava/lang/Object;", "Lu04/b;", "downloadStatus", "U9", "(Lu04/b;)V", "Ldx/b;", "domainError", "onBack", "V9", "(Ldx/b;Lo12/a;Ler/a;Ler/a;)V", "", "snackbarTextRes", "X9", "(Ldx/b;Ler/a;Ler/a;ILo12/e$a;)V", "oa", "(Lu04/b;)I", "data", "ba", "(Lz02/b;)V", "b", "Lp02/i;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lp02/d;", "f", "Lp12/h;", "g", "Lmx/c;", "h", "Lu04/a;", "j", "Lp02/e0;", "k", "Ll12/d;", "l", "Li70/e;", "m", "Ll12/f;", "n", "La14/w;", "p", "La14/m;", "q", "Ll12/b;", "r", "Lhb4/d;", "s", "Lp12/b;", "t", "Lq02/d;", "v", "Lz02/b;", "Lo12/d;", "w", "Lo12/d;", "initialState", "Lk10/t;", "x", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lo12/a$l;", "y", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<o12.e, o12.a> implements o12.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p02.i fetchMessageDetailsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p02.d downloadMessageAttachmentsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p12.h messageDetailsMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p02.e0 getUpoPreviewFileUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l12.d fileAccessPermissionDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l12.f forwardMessageDialogMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final l12.b attachmentTooBigToDownloadDialogMapper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p12.b deleteEpuapMessageDialogMapper;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final q02.d deleteMessageUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final MessageDetailsPayload messageDetailsPayload;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final o12.d initialState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final k10.t<o12.e, o12.a> stateMachine;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o12.a.l> navAction;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p0<o12.f.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140381a;

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
            f140381a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$b;", "action", "Lo12/e$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lo12/a$b;Lo12/e$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<o12.a.b, o12.e.a.DeletingMessage, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140384g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f140386e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y f140387f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ o12.e.a.DeletingMessage f140388g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ o12.a.b f140389h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, o12.e.a.DeletingMessage deletingMessage, o12.a.b bVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f140387f = yVar;
                this.f140388g = deletingMessage;
                this.f140389h = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f140386e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    q02.d dVar = this.f140387f.deleteMessageUC;
                    q02.d.Params params = new q02.d.Params(this.f140387f.messageDetailsPayload.getMessage(), this.f140387f.messageDetailsPayload.getDirectoryType());
                    this.f140386e = 1;
                    obj = dVar.d(params, this);
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
                y yVar = this.f140387f;
                o12.e.a.DeletingMessage deletingMessage = this.f140388g;
                o12.a.b bVar = this.f140389h;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    if ((bVar2 instanceof dx.b.g.Http) && ((dx.b.g.Http) bVar2).getCode() == dx.b.g.Http.a.BAD_REQUEST) {
                        yVar.ca(yVar.labelProvider.c(e02.a.M2));
                        yVar.d9(new o12.a.DisplayMessage(deletingMessage.getData()));
                    } else {
                        yVar.V9(bVar2, bVar, yVar.b9(bVar), yVar.b9(new o12.a.DisplayMessage(deletingMessage.getData())));
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    yVar.ca(yVar.labelProvider.c(e02.a.X3));
                    yVar.d9(o12.a.C3475a.f140275a);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f140387f, this.f140388g, this.f140389h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.a.b bVar = (o12.a.b) this.f140383f;
            o12.e.a.DeletingMessage deletingMessage = (o12.e.a.DeletingMessage) this.f140384g;
            Object objE = uq.b.e();
            int i15 = this.f140382e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = y.this.callActionWithLoaderUseCase;
                a aVar2 = new a(y.this, deletingMessage, bVar, null);
                this.f140383f = vq.j.a(bVar);
                this.f140384g = vq.j.a(deletingMessage);
                this.f140382e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(o12.a.b bVar, o12.e.a.DeletingMessage deletingMessage, tq.e<? super oq.i0> eVar) {
            a0 a0Var = y.this.new a0(eVar);
            a0Var.f140383f = bVar;
            a0Var.f140384g = deletingMessage;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140390e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f140392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f140393h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f140394j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f140395k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f140396l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f140397m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ o12.e.a f140398n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, String str4, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, o12.e.a aVar3, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f140392g = str;
            this.f140393h = str2;
            this.f140394j = str3;
            this.f140395k = str4;
            this.f140396l = aVar;
            this.f140397m = aVar2;
            this.f140398n = aVar3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f140390e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.d dVar = y.this.downloadMessageAttachmentsUseCase;
                p02.d.Params params = new p02.d.Params(this.f140392g, this.f140393h, this.f140394j, this.f140395k, null);
                this.f140390e = 1;
                obj = dVar.f(params, this);
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
            er.a<oq.i0> aVar = this.f140396l;
            er.a<oq.i0> aVar2 = this.f140397m;
            o12.e.a aVar3 = this.f140398n;
            if (iVar instanceof dx.i.Left) {
                yVar.X9((dx.b) ((dx.i.Left) iVar).b(), aVar, aVar2, e02.a.U1, aVar3);
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                yVar.U9((u04.b) ((dx.i.Right) iVar).b());
                yVar.d9(new o12.a.DisplayMessage(aVar3.getData()));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return y.this.new b(this.f140392g, this.f140393h, this.f140394j, this.f140395k, this.f140396l, this.f140397m, this.f140398n, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo12/e$a$e;", "it", "Loq/i0;", "<anonymous>", "(Lo12/e$a$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.p<o12.e.a.ShowingUpoPreview, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140399e;

        b0(tq.e<? super b0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f140399e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(o12.a.s.f140301a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(o12.e.a.ShowingUpoPreview showingUpoPreview, tq.e<? super oq.i0> eVar) {
            return ((b0) v(showingUpoPreview, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y.this.new b0(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140401e;

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f140401e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.i iVar = y.this.fetchMessageDetailsUseCase;
                p02.i.Params params = new p02.i.Params(y.this.messageDetailsPayload);
                this.f140401e = 1;
                obj = iVar.f(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar2 = (dx.i) obj;
            y yVar = y.this;
            if (iVar2 instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                o12.a.f fVar = o12.a.f.f140281a;
                yVar.V9(bVar, fVar, yVar.b9(fVar), yVar.b9(o12.a.C3475a.f140275a));
            } else {
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                DeliveryMessageDetails deliveryMessageDetails = (DeliveryMessageDetails) ((dx.i.Right) iVar2).b();
                yVar.d9(new o12.a.DisplayMessage(new InitializedData(yVar.messageDetailsPayload.getDirectoryId(), yVar.messageDetailsPayload.getDirectoryName(), yVar.messageDetailsPayload.getDirectoryType(), deliveryMessageDetails, null)));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return y.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$s;", "<unused var>", "Lo12/e$a$e;", "state", "Loq/i0;", "<anonymous>", "(Lo12/a$s;Lo12/e$a$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<o12.a.s, o12.e.a.ShowingUpoPreview, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140404f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.e.a.ShowingUpoPreview showingUpoPreview = (o12.e.a.ShowingUpoPreview) this.f140404f;
            Object objE = uq.b.e();
            int i15 = this.f140403e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                this.f140404f = vq.j.a(showingUpoPreview);
                this.f140403e = 1;
                if (yVar.da(showingUpoPreview, this) == objE) {
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
        public final Object w(o12.a.s sVar, o12.e.a.ShowingUpoPreview showingUpoPreview, tq.e<? super oq.i0> eVar) {
            c0 c0Var = y.this.new c0(eVar);
            c0Var.f140404f = showingUpoPreview;
            return c0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.p<eo0.y, String, oq.i0> {
        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(eo0.y yVar, String str) {
            c(yVar.getValue(), str);
            return oq.i0.f148189a;
        }

        public final void c(String str, String str2) {
            y.this.d9(new o12.a.DownloadMessageAttachment(str, str2, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$k;", "action", "Lo12/e$a$e;", "state", "Loq/i0;", "<anonymous>", "(Lo12/a$k;Lo12/e$a$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<o12.a.GoToUpoPreview, o12.e.a.ShowingUpoPreview, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140409g;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.a.GoToUpoPreview goToUpoPreview = (o12.a.GoToUpoPreview) this.f140408f;
            o12.e.a.ShowingUpoPreview showingUpoPreview = (o12.e.a.ShowingUpoPreview) this.f140409g;
            Object objE = uq.b.e();
            int i15 = this.f140407e;
            if (i15 == 0) {
                oq.u.b(obj);
                y.this.d9(new o12.a.DisplayMessage(showingUpoPreview.getData()));
                xw.b<o12.a.l> bVarY1 = y.this.Y1();
                o12.a.l.GoToUpoPreview goToUpoPreview2 = new o12.a.l.GoToUpoPreview(goToUpoPreview.getDomainFile());
                this.f140408f = vq.j.a(goToUpoPreview);
                this.f140409g = vq.j.a(showingUpoPreview);
                this.f140407e = 1;
                if (bVarY1.F(goToUpoPreview2, this) == objE) {
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
        public final Object w(o12.a.GoToUpoPreview goToUpoPreview, o12.e.a.ShowingUpoPreview showingUpoPreview, tq.e<? super oq.i0> eVar) {
            d0 d0Var = y.this.new d0(eVar);
            d0Var.f140408f = goToUpoPreview;
            d0Var.f140409g = showingUpoPreview;
            return d0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140411e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o12.e.a f140413g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o12.e.a aVar, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f140413g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f140411e;
            if (i15 == 0) {
                oq.u.b(obj);
                p02.e0 e0Var = y.this.getUpoPreviewFileUseCase;
                p02.e0.Params params = new p02.e0.Params(this.f140413g.getData().getMessageDetails().getDeliveryMessage().getMessageId(), null);
                this.f140411e = 1;
                obj = e0Var.e(params, this);
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
            o12.e.a aVar = this.f140413g;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                o12.a.s sVar = o12.a.s.f140301a;
                yVar.X9(bVar, yVar.b9(new o12.a.GoToAuthorization(sVar)), yVar.b9(sVar), e02.a.Y3, aVar);
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                yVar.d9(new o12.a.GoToUpoPreview((DomainFile) ((dx.i.Right) iVar).b()));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return y.this.new e(this.f140413g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((e) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo12/e$a$c;", "state", "Loq/i0;", "<anonymous>", "(Lo12/e$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.p<o12.e.a.DownloadingAttachment, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140415f;

        e0(tq.e<? super e0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.e.a.DownloadingAttachment downloadingAttachment = (o12.e.a.DownloadingAttachment) this.f140415f;
            uq.b.e();
            if (this.f140414e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(new o12.a.DownloadMessageAttachment(downloadingAttachment.getAttachmentId(), downloadingAttachment.getFileName(), null));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(o12.e.a.DownloadingAttachment downloadingAttachment, tq.e<? super oq.i0> eVar) {
            return ((e0) v(downloadingAttachment, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e0 e0Var = y.this.new e0(eVar);
            e0Var.f140415f = obj;
            return e0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<o12.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f140417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f140418b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f140419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f140420b;

            /* JADX INFO: renamed from: o12.y$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3480a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f140421d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f140422e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f140423f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f140425h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f140426j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f140427k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f140428l;

                public C3480a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f140421d = obj;
                    this.f140422e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar) {
                this.f140419a = hVar;
                this.f140420b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3480a c3480a;
                if (eVar instanceof C3480a) {
                    c3480a = (C3480a) eVar;
                    int i15 = c3480a.f140422e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3480a.f140422e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3480a = new C3480a(eVar);
                    }
                } else {
                    c3480a = new C3480a(eVar);
                }
                Object obj2 = c3480a.f140421d;
                Object objE = uq.b.e();
                int i16 = c3480a.f140422e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f140419a;
                    o12.f.a aVarZ9 = this.f140420b.Z9((o12.e) obj);
                    c3480a.f140423f = vq.j.a(obj);
                    c3480a.f140425h = vq.j.a(c3480a);
                    c3480a.f140426j = vq.j.a(obj);
                    c3480a.f140427k = vq.j.a(hVar);
                    c3480a.f140428l = 0;
                    c3480a.f140422e = 1;
                    if (hVar.F(aVarZ9, c3480a) == objE) {
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

        public f(mu.g gVar, y yVar) {
            this.f140417a = gVar;
            this.f140418b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o12.f.a> hVar, tq.e eVar) {
            Object objA = this.f140417a.a(new a(hVar, this.f140418b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$d;", "action", "Lo12/e$a$c;", "state", "Loq/i0;", "<anonymous>", "(Lo12/a$d;Lo12/e$a$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<o12.a.DownloadMessageAttachment, o12.e.a.DownloadingAttachment, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140431g;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.a.DownloadMessageAttachment downloadMessageAttachment = (o12.a.DownloadMessageAttachment) this.f140430f;
            o12.e.a.DownloadingAttachment downloadingAttachment = (o12.e.a.DownloadingAttachment) this.f140431g;
            Object objE = uq.b.e();
            int i15 = this.f140429e;
            if (i15 == 0) {
                oq.u.b(obj);
                String messageId = downloadingAttachment.getData().getMessageDetails().getDeliveryMessage().getMessageId();
                String directoryId = downloadingAttachment.getData().getDirectoryId();
                String attachmentId = downloadMessageAttachment.getAttachmentId();
                String fileName = downloadMessageAttachment.getFileName();
                er.a aVarB9 = y.this.b9(new o12.a.DownloadMessageAttachment(downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null));
                er.a aVarB10 = y.this.b9(new o12.a.GoToAuthorization(new o12.a.DownloadMessageAttachment(downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null)));
                y yVar = y.this;
                this.f140430f = vq.j.a(downloadMessageAttachment);
                this.f140431g = vq.j.a(downloadingAttachment);
                this.f140429e = 1;
                if (yVar.R9(messageId, directoryId, attachmentId, fileName, aVarB10, aVarB9, downloadingAttachment, this) == objE) {
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
        public final Object w(o12.a.DownloadMessageAttachment downloadMessageAttachment, o12.e.a.DownloadingAttachment downloadingAttachment, tq.e<? super oq.i0> eVar) {
            f0 f0Var = y.this.new f0(eVar);
            f0Var.f140430f = downloadMessageAttachment;
            f0Var.f140431g = downloadingAttachment;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo12/a$a;", "<unused var>", "Lo12/e;", "Loq/i0;", "<anonymous>", "(Lo12/a$a;Lo12/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<o12.a.C3475a, o12.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140433e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f140433e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o12.a.l> bVarY1 = y.this.Y1();
                o12.a.l.C3476a c3476a = o12.a.l.C3476a.f140288a;
                this.f140433e = 1;
                if (bVarY1.F(c3476a, this) == objE) {
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
        public final Object w(o12.a.C3475a c3475a, o12.e eVar, tq.e<? super oq.i0> eVar2) {
            return y.this.new g(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$b;", "<unused var>", "Lk10/c0;", "Lo12/e$a$d;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<o12.a.b, k10.c0<o12.e.a.Error>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140436f;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.DeletingMessage O(k10.c0 c0Var, o12.e.a.Error error) {
            return new o12.e.a.DeletingMessage(((o12.e.a.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f140436f;
            uq.b.e();
            if (this.f140435e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o12.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.g0.O(c0Var, (e.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.b bVar, k10.c0<o12.e.a.Error> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            g0 g0Var = new g0(eVar);
            g0Var.f140436f = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$i;", "action", "Lo12/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo12/a$i;Lo12/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<o12.a.GoToAuthorization, o12.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140438f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(y yVar, o12.a.GoToAuthorization goToAuthorization) {
            yVar.d9(goToAuthorization.getAction());
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o12.a.GoToAuthorization goToAuthorization = (o12.a.GoToAuthorization) this.f140438f;
            Object objE = uq.b.e();
            int i15 = this.f140437e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o12.a.l> bVarY1 = y.this.Y1();
                final y yVar = y.this;
                o12.a.l.GoToAuthorization goToAuthorization2 = new o12.a.l.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: o12.z
                    @Override // er.a
                    public final Object a() {
                        return y.h.O(yVar, goToAuthorization);
                    }
                }));
                this.f140438f = vq.j.a(goToAuthorization);
                this.f140437e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
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
        public final Object w(o12.a.GoToAuthorization goToAuthorization, o12.e eVar, tq.e<? super oq.i0> eVar2) {
            h hVar = y.this.new h(eVar2);
            hVar.f140438f = goToAuthorization;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$d;", "action", "Lk10/c0;", "Lo12/e$a$d;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<o12.a.DownloadMessageAttachment, k10.c0<o12.e.a.Error>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140442g;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.DownloadingAttachment O(k10.c0 c0Var, o12.a.DownloadMessageAttachment downloadMessageAttachment, o12.e.a.Error error) {
            return new o12.e.a.DownloadingAttachment(((o12.e.a.Error) c0Var.a()).getData(), downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o12.a.DownloadMessageAttachment downloadMessageAttachment = (o12.a.DownloadMessageAttachment) this.f140441f;
            final k10.c0 c0Var = (k10.c0) this.f140442g;
            uq.b.e();
            if (this.f140440e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o12.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.h0.O(c0Var, downloadMessageAttachment, (e.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.DownloadMessageAttachment downloadMessageAttachment, k10.c0<o12.e.a.Error> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f140441f = downloadMessageAttachment;
            h0Var.f140442g = c0Var;
            return h0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$q;", "action", "Lo12/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo12/a$q;Lo12/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<o12.a.ShowDialog, o12.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140444f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.a.ShowDialog showDialog = (o12.a.ShowDialog) this.f140444f;
            Object objE = uq.b.e();
            int i15 = this.f140443e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o12.a.l> bVarY1 = y.this.Y1();
                o12.a.l.ShowNavigationDialog showNavigationDialog = new o12.a.l.ShowNavigationDialog(showDialog.getDialogData());
                this.f140444f = vq.j.a(showDialog);
                this.f140443e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(o12.a.ShowDialog showDialog, o12.e eVar, tq.e<? super oq.i0> eVar2) {
            i iVar = y.this.new i(eVar2);
            iVar.f140444f = showDialog;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$s;", "<unused var>", "Lk10/c0;", "Lo12/e$a$d;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<o12.a.s, k10.c0<o12.e.a.Error>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140447f;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.ShowingUpoPreview O(k10.c0 c0Var, o12.e.a.Error error) {
            return new o12.e.a.ShowingUpoPreview(((o12.e.a.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f140447f;
            uq.b.e();
            if (this.f140446e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o12.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.i0.O(c0Var, (e.a.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.s sVar, k10.c0<o12.e.a.Error> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f140447f = c0Var;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo12/a$c;", "action", "Lk10/c0;", "Lo12/e;", "state", "Lk10/l;", "<anonymous>", "(Lo12/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<o12.a.DisplayMessage, k10.c0<o12.e>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140450g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.Displaying O(o12.a.DisplayMessage displayMessage, o12.e eVar) {
            return new o12.e.a.Displaying(displayMessage.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o12.a.DisplayMessage displayMessage = (o12.a.DisplayMessage) this.f140449f;
            k10.c0 c0Var = (k10.c0) this.f140450g;
            uq.b.e();
            if (this.f140448e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o12.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.j.O(displayMessage, (e) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.DisplayMessage displayMessage, k10.c0<o12.e> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            j jVar = new j(eVar);
            jVar.f140449f = displayMessage;
            jVar.f140450g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo12/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo12/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<o12.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140451e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f140451e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(o12.a.f.f140281a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(o12.d dVar, tq.e<? super oq.i0> eVar) {
            return ((k) v(dVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo12/a$f;", "<unused var>", "Lo12/d;", "Loq/i0;", "<anonymous>", "(Lo12/a$f;Lo12/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<o12.a.f, o12.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140453e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f140453e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                this.f140453e = 1;
                if (yVar.T9(this) == objE) {
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
        public final Object w(o12.a.f fVar, o12.d dVar, tq.e<? super oq.i0> eVar) {
            return y.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$e;", "action", "Lk10/c0;", "Lo12/d;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<o12.a.Fail, k10.c0<o12.d>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140457g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error O(y yVar, o12.a.Fail fail, o12.d dVar) {
            return new Error(yVar.errorVMSFactory.a(fail.getErrorData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o12.a.Fail fail = (o12.a.Fail) this.f140456f;
            k10.c0 c0Var = (k10.c0) this.f140457g;
            uq.b.e();
            if (this.f140455e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final y yVar = y.this;
            return c0Var.d(new er.l() { // from class: o12.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.m.O(yVar, fail, (d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.Fail fail, k10.c0<o12.d> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            m mVar = y.this.new m(eVar);
            mVar.f140456f = fail;
            mVar.f140457g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$f;", "<unused var>", "Lk10/c0;", "Lo12/c;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<o12.a.f, k10.c0<Error>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140460f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.d O(Error error) {
            return o12.d.f140310a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f140460f;
            uq.b.e();
            if (this.f140459e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o12.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.n.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.f fVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            n nVar = new n(eVar);
            nVar.f140460f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$e;", "action", "Lk10/c0;", "Lo12/e$a;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<o12.a.Fail, k10.c0<o12.e.a>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140463g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.Error O(k10.c0 c0Var, y yVar, o12.a.Fail fail, o12.e.a aVar) {
            return new o12.e.a.Error(((o12.e.a) c0Var.a()).getData(), yVar.errorVMSFactory.a(fail.getErrorData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o12.a.Fail fail = (o12.a.Fail) this.f140462f;
            final k10.c0 c0Var = (k10.c0) this.f140463g;
            uq.b.e();
            if (this.f140461e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final y yVar = y.this;
            return c0Var.d(new er.l() { // from class: o12.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.o.O(c0Var, yVar, fail, (e.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.Fail fail, k10.c0<o12.e.a> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            o oVar = y.this.new o(eVar);
            oVar.f140462f = fail;
            oVar.f140463g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo12/a$p;", "<unused var>", "Lo12/e$a$b;", "Loq/i0;", "<anonymous>", "(Lo12/a$p;Lo12/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<o12.a.p, o12.e.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140465e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f140465e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(new o12.a.ShowDialog(y.this.deleteEpuapMessageDialogMapper.b(new p12.b.Params(y.this.b9(o12.a.b.f140276a)))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.p pVar, o12.e.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return y.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$m;", "action", "Lo12/e$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo12/a$m;Lo12/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<o12.a.OpenUrl, o12.e.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140468f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.a.OpenUrl openUrl = (o12.a.OpenUrl) this.f140468f;
            Object objE = uq.b.e();
            int i15 = this.f140467e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = y.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f140468f = vq.j.a(openUrl);
                this.f140467e = 1;
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
            y yVar = y.this;
            if (iVar instanceof dx.i.Left) {
                yVar.ca(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage());
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.OpenUrl openUrl, o12.e.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            q qVar = y.this.new q(eVar);
            qVar.f140468f = openUrl;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$h;", "<unused var>", "Lo12/e$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lo12/a$h;Lo12/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<o12.a.h, o12.e.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140471f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.e.a.Displaying displaying = (o12.e.a.Displaying) this.f140471f;
            Object objE = uq.b.e();
            int i15 = this.f140470e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                o12.a.l.MessageForm messageForm = new o12.a.l.MessageForm(new z02.a.ForwardMessage(displaying.getData().getDirectoryType(), displaying.getData().getDirectoryName(), displaying.getData().getDirectoryId(), DeliveryMessageDetails.b(displaying.getData().getMessageDetails(), null, null, pq.v.n(), null, false, 27, null), null, null));
                this.f140471f = vq.j.a(displaying);
                this.f140470e = 1;
                if (yVar.F(messageForm, this) == objE) {
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
        public final Object w(o12.a.h hVar, o12.e.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            r rVar = y.this.new r(eVar);
            rVar.f140471f = displaying;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$g;", "<unused var>", "Lo12/e$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lo12/a$g;Lo12/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<o12.a.g, o12.e.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f140473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f140474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140475g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00ce A[RETURN] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y yVar;
            o12.a.l.MessageForm messageForm;
            o12.e.a.Displaying displaying = (o12.e.a.Displaying) this.f140475g;
            Object objE = uq.b.e();
            int i15 = this.f140474f;
            if (i15 == 0) {
                oq.u.b(obj);
                List<DeliveryMessageDetailsAttachment> listD = displaying.getData().getMessageDetails().d();
                if ((listD instanceof Collection) && listD.isEmpty()) {
                    z02.a.ForwardMessage forwardMessage = new z02.a.ForwardMessage(displaying.getData().getDirectoryType(), displaying.getData().getDirectoryName(), displaying.getData().getDirectoryId(), displaying.getData().getMessageDetails(), null, null);
                    yVar = y.this;
                    messageForm = new o12.a.l.MessageForm(forwardMessage);
                    this.f140475g = vq.j.a(displaying);
                    this.f140473e = vq.j.a(forwardMessage);
                    this.f140474f = 1;
                    if (yVar.F(messageForm, this) == objE) {
                        return objE;
                    }
                } else {
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        if (((DeliveryMessageDetailsAttachment) it.next()).getTooBigToDownload()) {
                            y.this.d9(new o12.a.ShowDialog(y.this.forwardMessageDialogMapper.b(new l12.f.Params(y.this.b9(o12.a.h.f140283a), y.this.b9(new o12.a.OpenUrl(y.this.commonEndpoints.M()))))));
                        }
                    }
                    z02.a.ForwardMessage forwardMessage2 = new z02.a.ForwardMessage(displaying.getData().getDirectoryType(), displaying.getData().getDirectoryName(), displaying.getData().getDirectoryId(), displaying.getData().getMessageDetails(), null, null);
                    yVar = y.this;
                    messageForm = new o12.a.l.MessageForm(forwardMessage2);
                    this.f140475g = vq.j.a(displaying);
                    this.f140473e = vq.j.a(forwardMessage2);
                    this.f140474f = 1;
                    if (yVar.F(messageForm, this) == objE) {
                        return objE;
                    }
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
        public final Object w(o12.a.g gVar, o12.e.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            s sVar = y.this.new s(eVar);
            sVar.f140475g = displaying;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$r;", "action", "Lo12/e$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo12/a$r;Lo12/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<o12.a.ShowTechnicalDetails, o12.e.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140478f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.a.ShowTechnicalDetails showTechnicalDetails = (o12.a.ShowTechnicalDetails) this.f140478f;
            Object objE = uq.b.e();
            int i15 = this.f140477e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                o12.a.l.GoToTechnicalDetails goToTechnicalDetails = new o12.a.l.GoToTechnicalDetails(showTechnicalDetails.getDetails());
                this.f140478f = vq.j.a(showTechnicalDetails);
                this.f140477e = 1;
                if (yVar.F(goToTechnicalDetails, this) == objE) {
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
        public final Object w(o12.a.ShowTechnicalDetails showTechnicalDetails, o12.e.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            t tVar = y.this.new t(eVar);
            tVar.f140478f = showTechnicalDetails;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo12/a$n;", "<unused var>", "Lo12/e$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lo12/a$n;Lo12/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<o12.a.n, o12.e.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140481f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o12.e.a.Displaying displaying = (o12.e.a.Displaying) this.f140481f;
            Object objE = uq.b.e();
            int i15 = this.f140480e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o12.a.l> bVarY1 = y.this.Y1();
                o12.a.l.MessageForm messageForm = new o12.a.l.MessageForm(new z02.a.Reply(displaying.getData().getDirectoryName(), displaying.getData().getDirectoryType(), displaying.getData().getDirectoryId(), displaying.getData().getMessageDetails(), null));
                this.f140481f = vq.j.a(displaying);
                this.f140480e = 1;
                if (bVarY1.F(messageForm, this) == objE) {
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
        public final Object w(o12.a.n nVar, o12.e.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            u uVar = y.this.new u(eVar);
            uVar.f140481f = displaying;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo12/a$j;", "<unused var>", "Lo12/e$a$b;", "Loq/i0;", "<anonymous>", "(Lo12/a$j;Lo12/e$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<o12.a.j, o12.e.a.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140483e;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f140483e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = y.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            y yVar = y.this;
            if (iVarA instanceof dx.i.Left) {
                yVar.ca(yVar.labelProvider.c(e02.a.I4));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.j jVar, o12.e.a.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return y.this.new v(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$d;", "action", "Lk10/c0;", "Lo12/e$a$b;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<o12.a.DownloadMessageAttachment, k10.c0<o12.e.a.Displaying>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f140487g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.DownloadingAttachment O(k10.c0 c0Var, o12.a.DownloadMessageAttachment downloadMessageAttachment, o12.e.a.Displaying displaying) {
            return new o12.e.a.DownloadingAttachment(((o12.e.a.Displaying) c0Var.a()).getData(), downloadMessageAttachment.getAttachmentId(), downloadMessageAttachment.getFileName(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object next;
            final o12.a.DownloadMessageAttachment downloadMessageAttachment = (o12.a.DownloadMessageAttachment) this.f140486f;
            final k10.c0 c0Var = (k10.c0) this.f140487g;
            uq.b.e();
            if (this.f140485e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Iterator<T> it = ((o12.e.a.Displaying) c0Var.a()).getData().getMessageDetails().d().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!eo0.y.d(((DeliveryMessageDetailsAttachment) next).getAttachmentId(), downloadMessageAttachment.getAttachmentId()));
            DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment = (DeliveryMessageDetailsAttachment) next;
            if (deliveryMessageDetailsAttachment == null || !deliveryMessageDetailsAttachment.getTooBigToDownload()) {
                return c0Var.d(new er.l() { // from class: o12.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.w.O(c0Var, downloadMessageAttachment, (e.a.Displaying) obj2);
                    }
                });
            }
            y.this.d9(new o12.a.ShowDialog(y.this.attachmentTooBigToDownloadDialogMapper.b(new l12.b.Params(y.this.b9(new o12.a.OpenUrl(y.this.commonEndpoints.M()))))));
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.DownloadMessageAttachment downloadMessageAttachment, k10.c0<o12.e.a.Displaying> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            w wVar = y.this.new w(eVar);
            wVar.f140486f = downloadMessageAttachment;
            wVar.f140487g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$s;", "<unused var>", "Lk10/c0;", "Lo12/e$a$b;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<o12.a.s, k10.c0<o12.e.a.Displaying>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140490f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.ShowingUpoPreview O(k10.c0 c0Var, o12.e.a.Displaying displaying) {
            return new o12.e.a.ShowingUpoPreview(((o12.e.a.Displaying) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f140490f;
            uq.b.e();
            if (this.f140489e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o12.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.x.O(c0Var, (e.a.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.s sVar, k10.c0<o12.e.a.Displaying> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            x xVar = new x(eVar);
            xVar.f140490f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: o12.y$y, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo12/a$b;", "<unused var>", "Lk10/c0;", "Lo12/e$a$b;", "state", "Lk10/l;", "Lo12/e;", "<anonymous>", "(Lo12/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C3481y extends vq.k implements er.q<o12.a.b, k10.c0<o12.e.a.Displaying>, tq.e<? super k10.l<? extends o12.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f140492f;

        C3481y(tq.e<? super C3481y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o12.e.a.DeletingMessage O(k10.c0 c0Var, o12.e.a.Displaying displaying) {
            return new o12.e.a.DeletingMessage(((o12.e.a.Displaying) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f140492f;
            uq.b.e();
            if (this.f140491e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o12.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.C3481y.O(c0Var, (e.a.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o12.a.b bVar, k10.c0<o12.e.a.Displaying> c0Var, tq.e<? super k10.l<? extends o12.e>> eVar) {
            C3481y c3481y = new C3481y(eVar);
            c3481y.f140492f = c0Var;
            return c3481y.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo12/e$a$a;", "it", "Loq/i0;", "<anonymous>", "(Lo12/e$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.p<o12.e.a.DeletingMessage, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f140493e;

        z(tq.e<? super z> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f140493e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(o12.a.b.f140276a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(o12.e.a.DeletingMessage deletingMessage, tq.e<? super oq.i0> eVar) {
            return ((z) v(deletingMessage, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y.this.new z(eVar);
        }
    }

    public y(yy.a aVar, p02.i iVar, ac4.a aVar2, ib4.c cVar, p02.d dVar, p12.h hVar, mx.c cVar2, u04.a aVar3, p02.e0 e0Var, l12.d dVar2, i70.e eVar, l12.f fVar, a14.w wVar, a14.m mVar, l12.b bVar, hb4.d dVar3, p12.b bVar2, q02.d dVar4, MessageDetailsPayload messageDetailsPayload) {
        this.fetchMessageDetailsUseCase = iVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.downloadMessageAttachmentsUseCase = dVar;
        this.messageDetailsMapper = hVar;
        this.labelProvider = cVar2;
        this.commonEndpoints = aVar3;
        this.getUpoPreviewFileUseCase = e0Var;
        this.fileAccessPermissionDialogMapper = dVar2;
        this.globalSnackBarManager = eVar;
        this.forwardMessageDialogMapper = fVar;
        this.openUrlIntentUseCase = wVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.attachmentTooBigToDownloadDialogMapper = bVar;
        this.errorVMSFactory = dVar3;
        this.deleteEpuapMessageDialogMapper = bVar2;
        this.deleteMessageUC = dVar4;
        this.messageDetailsPayload = messageDetailsPayload;
        o12.d dVar5 = o12.d.f140310a;
        this.initialState = dVar5;
        this.stateMachine = aVar.a(dVar5, new er.l() { // from class: o12.o
            @Override // er.l
            public final Object b(Object obj) {
                return y.ea(this.f140351a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new f(e9().getState(), this), o12.f.a.c.f140329a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R9(String str, String str2, String str3, String str4, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, o12.e.a aVar3, tq.e<? super oq.i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new b(str, str2, str3, str4, aVar, aVar2, aVar3, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T9(tq.e<? super oq.i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new c(null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U9(u04.b downloadStatus) {
        int i15 = a.f140381a[downloadStatus.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            ca(this.labelProvider.c(oa(downloadStatus)));
        } else {
            if (i15 != 4) {
                throw new oq.p();
            }
            ca(this.labelProvider.c(oa(downloadStatus)));
            d9(new o12.a.ShowDialog(this.fileAccessPermissionDialogMapper.b(new l12.d.Params(b9(o12.a.j.f140285a)))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V9(dx.b domainError, o12.a onRefreshToken, final er.a<oq.i0> onRetry, final er.a<oq.i0> onBack) {
        if ((domainError instanceof dx.b.Business) && ((dx.b.Business) domainError).getType() == n02.a.REFRESH_TOKEN_EXPIRED) {
            d9(new o12.a.GoToAuthorization(onRefreshToken));
        } else {
            d9(new o12.a.Fail(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: o12.n
                @Override // er.l
                public final Object b(Object obj) {
                    return y.W9(onBack, onRetry, (ib4.c.b) obj);
                }
            }, 2, null))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            aVar.a();
        } else {
            if (!(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X9(dx.b domainError, er.a<oq.i0> onRefreshToken, final er.a<oq.i0> onRetry, int snackbarTextRes, final o12.e.a state) {
        if ((domainError instanceof dx.b.Business) && ((dx.b.Business) domainError).getType() == n02.a.REFRESH_TOKEN_EXPIRED) {
            d9(new o12.a.DisplayMessage(state.getData()));
            onRefreshToken.a();
        } else if (domainError instanceof dx.b.g.e) {
            d9(new o12.a.Fail(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: o12.m
                @Override // er.l
                public final Object b(Object obj) {
                    return y.Y9(this.f140345a, state, onRetry, (ib4.c.b) obj);
                }
            }, 2, null))));
        } else {
            ca(this.labelProvider.c(snackbarTextRes));
            d9(new o12.a.DisplayMessage(state.getData()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(y yVar, o12.e.a aVar, er.a aVar2, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            yVar.d9(new o12.a.DisplayMessage(aVar.getData()));
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o12.f.a Z9(o12.e state) {
        p12.h hVar = this.messageDetailsMapper;
        er.a<oq.i0> aVarB9 = b9(o12.a.C3475a.f140275a);
        er.a<oq.i0> aVarB10 = b9(o12.a.j.f140285a);
        return hVar.b(new p12.h.Params(state, aVarB9, new d(), b9(o12.a.s.f140301a), aVarB10, b9(o12.a.g.f140282a), b9(o12.a.n.f140296a), new er.l() { // from class: o12.l
            @Override // er.l
            public final Object b(Object obj) {
                return y.aa(this.f140343a, (DeliveryMessageDetails) obj);
            }
        }, b9(o12.a.p.f140298a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(y yVar, DeliveryMessageDetails deliveryMessageDetails) {
        yVar.d9(new o12.a.ShowTechnicalDetails(deliveryMessageDetails));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ca(Label message) {
        this.globalSnackBarManager.y(new p50.a.DefaultWithIcon(message, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object da(o12.e.a aVar, tq.e<? super oq.i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new e(aVar, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(final y yVar, k10.v vVar) {
        vVar.c(q0.c(o12.e.class), new er.l() { // from class: o12.p
            @Override // er.l
            public final Object b(Object obj) {
                return y.fa(this.f140352a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o12.d.class), new er.l() { // from class: o12.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.ga(this.f140353a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: o12.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.ha((k10.z) obj);
            }
        });
        vVar.c(q0.c(o12.e.a.class), new er.l() { // from class: o12.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.ia(this.f140354a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o12.e.a.Displaying.class), new er.l() { // from class: o12.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.ja(this.f140355a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o12.e.a.DeletingMessage.class), new er.l() { // from class: o12.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.ka(this.f140356a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o12.e.a.ShowingUpoPreview.class), new er.l() { // from class: o12.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.la(this.f140357a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o12.e.a.DownloadingAttachment.class), new er.l() { // from class: o12.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.ma(this.f140358a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o12.e.a.Error.class), new er.l() { // from class: o12.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.na((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(y yVar, k10.z zVar) {
        g gVar = yVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o12.a.C3475a.class), oVar, gVar);
        zVar.x(q0.c(o12.a.GoToAuthorization.class), oVar, yVar.new h(null));
        zVar.x(q0.c(o12.a.ShowDialog.class), oVar, yVar.new i(null));
        zVar.v(q0.c(o12.a.DisplayMessage.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(y yVar, k10.z zVar) {
        zVar.C(yVar.new k(null));
        l lVar = yVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o12.a.f.class), oVar, lVar);
        zVar.v(q0.c(o12.a.Fail.class), oVar, yVar.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(k10.z zVar) {
        n nVar = new n(null);
        zVar.v(q0.c(o12.a.f.class), k10.o.CANCEL_PREVIOUS, nVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(y yVar, k10.z zVar) {
        o oVar = yVar.new o(null);
        zVar.v(q0.c(o12.a.Fail.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(y yVar, k10.z zVar) {
        q qVar = yVar.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o12.a.OpenUrl.class), oVar, qVar);
        zVar.x(q0.c(o12.a.h.class), oVar, yVar.new r(null));
        zVar.x(q0.c(o12.a.g.class), oVar, yVar.new s(null));
        zVar.x(q0.c(o12.a.ShowTechnicalDetails.class), oVar, yVar.new t(null));
        zVar.x(q0.c(o12.a.n.class), oVar, yVar.new u(null));
        zVar.x(q0.c(o12.a.j.class), oVar, yVar.new v(null));
        zVar.v(q0.c(o12.a.DownloadMessageAttachment.class), oVar, yVar.new w(null));
        zVar.v(q0.c(o12.a.s.class), oVar, new x(null));
        zVar.v(q0.c(o12.a.b.class), oVar, new C3481y(null));
        zVar.x(q0.c(o12.a.p.class), oVar, yVar.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(y yVar, k10.z zVar) {
        zVar.C(yVar.new z(null));
        a0 a0Var = yVar.new a0(null);
        zVar.x(q0.c(o12.a.b.class), k10.o.CANCEL_PREVIOUS, a0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(y yVar, k10.z zVar) {
        zVar.C(yVar.new b0(null));
        c0 c0Var = yVar.new c0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o12.a.s.class), oVar, c0Var);
        zVar.x(q0.c(o12.a.GoToUpoPreview.class), oVar, yVar.new d0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(y yVar, k10.z zVar) {
        zVar.C(yVar.new e0(null));
        f0 f0Var = yVar.new f0(null);
        zVar.x(q0.c(o12.a.DownloadMessageAttachment.class), k10.o.CANCEL_PREVIOUS, f0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 na(k10.z zVar) {
        g0 g0Var = new g0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(o12.a.b.class), oVar, g0Var);
        zVar.v(q0.c(o12.a.DownloadMessageAttachment.class), oVar, new h0(null));
        zVar.v(q0.c(o12.a.s.class), oVar, new i0(null));
        return oq.i0.f148189a;
    }

    private final int oa(u04.b bVar) {
        return a.f140381a[bVar.ordinal()] == 1 ? e02.a.V1 : e02.a.U1;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: S9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(o12.a.l lVar, tq.e<? super oq.i0> eVar) {
        return super.F(lVar, eVar);
    }

    @Override // zx.b
    public xw.b<o12.a.l> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: ba, reason: merged with bridge method [inline-methods] */
    public void P5(MessageDetailsPayload data) {
        d9(new o12.a.Setup(data));
    }

    @Override // l00.g
    protected k10.t<o12.e, o12.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o12.f.a> getState() {
        return this.state;
    }
}
