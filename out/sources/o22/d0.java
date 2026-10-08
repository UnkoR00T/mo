package o22;

import d12.OAuthWebViewData;
import eo0.EdeliveryDraftMessageResponse;
import eo0.Recipient;
import eo0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import q22.EdorMessageSetupData;
import r22.State;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BË\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\b\b\u0001\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020\u0002H\u0002¢\u0006\u0004\b:\u0010;J(\u0010@\u001a\u00020?2\u0006\u00108\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b@\u0010AJ \u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0082@¢\u0006\u0004\bG\u0010HJ \u0010I\u001a\u00020F2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0082@¢\u0006\u0004\bI\u0010HJ\u0017\u0010K\u001a\u00020J2\u0006\u00108\u001a\u00020\u0002H\u0002¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020F2\u0006\u0010C\u001a\u00020BH\u0082@¢\u0006\u0004\bM\u0010NJH\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00020S2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020O2\u0006\u0010E\u001a\u00020D2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020?0P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020?0PH\u0082@¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020?H\u0082@¢\u0006\u0004\bV\u0010WJ\u001e\u0010[\u001a\u0004\u0018\u00010?*\u00020X2\u0006\u0010Z\u001a\u00020YH\u0082@¢\u0006\u0004\b[\u0010\\J\u001b\u0010]\u001a\u00020?*\u00020X2\u0006\u0010>\u001a\u00020\u0003H\u0002¢\u0006\u0004\b]\u0010^J\u0013\u0010`\u001a\u00020?*\u00020_H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020F2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0013\u0010f\u001a\u00020_*\u00020\u0002H\u0002¢\u0006\u0004\bf\u0010gR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R'\u0010\u009d\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R,\u0010£\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u009e\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R%\u00108\u001a\t\u0012\u0004\u0012\u0002090¤\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001f\u0010³\u0001\u001a\u0005\u0018\u00010°\u0001*\u00030¯\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001¨\u0006´\u0001"}, d2 = {"Lo22/d0;", "Ll00/g;", "Lo22/b;", "Lo22/a;", "Lo22/c;", "", "Lyy/a;", "stateMachineFactory", "Lp22/d;", "mapper", "Lc12/g;", "dialogMapper", "Lt02/g;", "formValidationUseCase", "Lr02/e;", "pickPhotoFromGalleryUC", "Lr02/f;", "takePhotoWithSizeValidationUC", "Lr02/c;", "generateNewCameraPhotoNameUC", "Ls22/k;", "filePickerErrorMapper", "Lr02/d;", "pickFileUseCase", "Lr02/a;", "checkFileNameUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lp02/b;", "createDraftUC", "Lp02/j0;", "removeEdorAttachmentUC", "Lp02/r0;", "uploadEdorAttachmentUC", "Lb12/c;", "electronicDeliveryErrorMapper", "Lmx/c;", "labelProvider", "Lx02/d;", "getMessageServiceTypeUC", "Lp02/f;", "editEdorDraftUC", "Li70/e;", "snackBarManager", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lc12/k;", "saveDraftErrorMessageMapper", "Lp22/a;", "edorMessageFormInitialStateMapper", "Lq22/a;", "setupData", "<init>", "(Lyy/a;Lp22/d;Lc12/g;Lt02/g;Lr02/e;Lr02/f;Lr02/c;Ls22/k;Lr02/d;Lr02/a;Lac4/a;Lp02/b;Lp02/j0;Lp02/r0;Lb12/c;Lmx/c;Lx02/d;Lp02/f;Li70/e;La14/m;Lyw/b;Lc12/k;Lp22/a;Lq22/a;)V", "state", "Lo22/c$a;", "ga", "(Lo22/b;)Lo22/c$a;", "Leo0/g0;", "messageId", "retryAction", "Loq/i0;", "pa", "(Lo22/b;Ljava/lang/String;Lo22/a;Ltq/e;)Ljava/lang/Object;", "", "value", "", "validateNotEmpty", "Lt50/e;", "za", "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "wa", "Lhz/b;", "ua", "(Lo22/b;)Lhz/b;", "va", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lk10/c0;", "Lkotlin/Function0;", "onValidFormAction", "onInvalidFormAction", "Lk10/l;", "xa", "(Lk10/c0;ZLer/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "ra", "(Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "Lo22/a$m;", "fromAction", "da", "(Ldx/b;Lo22/a$m;Ltq/e;)Ljava/lang/Object;", "aa", "(Ldx/b;Lo22/a;)V", "Lo02/c;", "oa", "(Lo02/c;)V", "Lhz/g;", "validatorResponse", "na", "(Lhz/g;)Lt50/e;", "Y9", "(Lo22/b;)Lo02/c;", "b", "Lp22/d;", "c", "Lc12/g;", "d", "Lt02/g;", "e", "Lr02/e;", "f", "Lr02/f;", "g", "Lr02/c;", "h", "Ls22/k;", "j", "Lr02/d;", "k", "Lr02/a;", "l", "Lac4/a;", "m", "Lp02/b;", "n", "Lp02/j0;", "p", "Lp02/r0;", "q", "Lb12/c;", "r", "Lmx/c;", "s", "Lx02/d;", "t", "Lp02/f;", "v", "Li70/e;", "w", "La14/m;", "x", "Lyw/b;", "y", "Lc12/k;", "z", "Lq22/a;", "A", "Lo22/b;", "initialState", "Lxw/b;", "Lo22/a$i;", "B", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "C", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", ip.a.f96138c, "Lmu/p0;", "getState", "()Lmu/p0;", "Leo0/v;", "E", "Loq/k;", "X9", "()Leo0/v;", "emptyDraft", "Lo02/b$f;", "Lfo0/j;", "Z9", "(Lo02/b$f;)Ljava/lang/String;", "threadId", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<o22.b, o22.a> implements o22.c, zx.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final o22.b initialState;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final xw.b<o22.a.i> navAction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final k10.t<o22.b, o22.a> stateMachine;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final mu.p0<o22.c.Data> state;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final oq.k emptyDraft;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p22.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c12.g dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t02.g formValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r02.e pickPhotoFromGalleryUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r02.f takePhotoWithSizeValidationUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r02.c generateNewCameraPhotoNameUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s22.k filePickerErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r02.d pickFileUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final r02.a checkFileNameUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p02.b createDraftUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p02.j0 removeEdorAttachmentUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p02.r0 uploadEdorAttachmentUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final x02.d getMessageServiceTypeUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p02.f editEdorDraftUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final i70.e snackBarManager;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final c12.k saveDraftErrorMessageMapper;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final EdorMessageSetupData setupData;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f141128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f141129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f141130h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f141132k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f141130h = obj;
            this.f141132k |= PKIFailureInfo.systemUnavail;
            return d0.this.pa(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f141134e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f141136g;

        a0(tq.e<? super a0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f141134e = obj;
            this.f141136g |= PKIFailureInfo.systemUnavail;
            return d0.this.va(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<o22.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f141137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f141138b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f141139a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f141140b;

            /* JADX INFO: renamed from: o22.d0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3487a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f141141d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f141142e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f141143f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f141145h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f141146j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f141147k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f141148l;

                public C3487a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f141141d = obj;
                    this.f141142e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, d0 d0Var) {
                this.f141139a = hVar;
                this.f141140b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3487a c3487a;
                if (eVar instanceof C3487a) {
                    c3487a = (C3487a) eVar;
                    int i15 = c3487a.f141142e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3487a.f141142e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3487a = new C3487a(eVar);
                    }
                } else {
                    c3487a = new C3487a(eVar);
                }
                Object obj2 = c3487a.f141141d;
                Object objE = uq.b.e();
                int i16 = c3487a.f141142e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f141139a;
                    o22.c.Data dataGa = this.f141140b.ga((o22.b) obj);
                    c3487a.f141143f = vq.j.a(obj);
                    c3487a.f141145h = vq.j.a(c3487a);
                    c3487a.f141146j = vq.j.a(obj);
                    c3487a.f141147k = vq.j.a(hVar);
                    c3487a.f141148l = 0;
                    c3487a.f141142e = 1;
                    if (hVar.F(dataGa, c3487a) == objE) {
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

        public b(mu.g gVar, d0 d0Var) {
            this.f141137a = gVar;
            this.f141138b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super o22.c.Data> hVar, tq.e eVar) {
            Object objA = this.f141137a.a(new a(hVar, this.f141138b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f141150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141151f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f141153h;

        b0(tq.e<? super b0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f141151f = obj;
            this.f141153h |= PKIFailureInfo.systemUnavail;
            return d0.this.wa(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$b;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<o22.a.CaseSignChange, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141154e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141155f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141156g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o22.b O(o22.a.CaseSignChange caseSignChange, t50.e eVar, o22.b bVar) {
            return o22.b.b(bVar, null, null, null, eo0.j.b(caseSignChange.getValue()), null, null, eVar, null, null, null, null, 1975, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o22.a.CaseSignChange caseSignChange = (o22.a.CaseSignChange) this.f141155f;
            k10.c0 c0Var = (k10.c0) this.f141156g;
            Object objE = uq.b.e();
            int i15 = this.f141154e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                String value = caseSignChange.getValue();
                this.f141155f = caseSignChange;
                this.f141156g = c0Var;
                this.f141154e = 1;
                obj = d0Var.va(value, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final t50.e eVar = (t50.e) obj;
            return c0Var.b(new er.l() { // from class: o22.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.c.O(caseSignChange, eVar, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.CaseSignChange caseSignChange, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            c cVar = d0.this.new c(eVar);
            cVar.f141155f = caseSignChange;
            cVar.f141156g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f141160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f141161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f141162h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f141163j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f141164k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f141166m;

        c0(tq.e<? super c0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f141164k = obj;
            this.f141166m |= PKIFailureInfo.systemUnavail;
            return d0.this.xa(null, false, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$y;", "<unused var>", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$y;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<o22.a.y, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141168f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f141168f;
            Object objE = uq.b.e();
            int i15 = this.f141167e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            er.a aVarB9 = d0.this.b9(o22.a.h.f141052a);
            d0 d0Var = d0.this;
            er.a aVar = new er.a() { // from class: o22.f0
                @Override // er.a
                public final Object a() {
                    return d0.d.O();
                }
            };
            this.f141168f = vq.j.a(c0Var);
            this.f141167e = 1;
            Object objXa = d0Var.xa(c0Var, true, aVarB9, aVar, this);
            return objXa == objE ? objE : objXa;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.y yVar, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            d dVar = d0.this.new d(eVar);
            dVar.f141168f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: o22.d0$d0, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3488d0 extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f141170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f141171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141172f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f141174h;

        C3488d0(tq.e<? super C3488d0> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f141172f = obj;
            this.f141174h |= PKIFailureInfo.systemUnavail;
            return d0.this.za(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$j;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<o22.a.OnBottomSheetStateChanged, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141176f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141177g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o22.b O(o22.a.OnBottomSheetStateChanged onBottomSheetStateChanged, o22.b bVar) {
            return o22.b.b(bVar, null, null, null, null, null, null, null, null, null, onBottomSheetStateChanged.getValue(), null, 1535, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o22.a.OnBottomSheetStateChanged onBottomSheetStateChanged = (o22.a.OnBottomSheetStateChanged) this.f141176f;
            k10.c0 c0Var = (k10.c0) this.f141177g;
            uq.b.e();
            if (this.f141175e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o22.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.e.O(onBottomSheetStateChanged, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f141176f = onBottomSheetStateChanged;
            eVar2.f141177g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$m;", "action", "Lo22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo22/a$m;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<o22.a.OnPickerActionSelected, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141179f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f141181a;

            static {
                int[] iArr = new int[t22.a.values().length];
                try {
                    iArr[t22.a.PICK_FILE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t22.a.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[t22.a.TAKE_PHOTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f141181a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.OnPickerActionSelected onPickerActionSelected = (o22.a.OnPickerActionSelected) this.f141179f;
            uq.b.e();
            if (this.f141178e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f141181a[onPickerActionSelected.getPickerAction().ordinal()];
            if (i15 == 1) {
                d0.this.d9(new o22.a.PickFile(onPickerActionSelected));
            } else if (i15 == 2) {
                d0.this.d9(new o22.a.PickPhoto(onPickerActionSelected));
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                d0.this.d9(new o22.a.TakePhoto(onPickerActionSelected));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.OnPickerActionSelected onPickerActionSelected, o22.b bVar, tq.e<? super oq.i0> eVar) {
            f fVar = d0.this.new f(eVar);
            fVar.f141179f = onPickerActionSelected;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$o;", "action", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$o;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<o22.a.PickFile, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141184g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f141186e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f141187f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f141188g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f141189h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f141190j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d0 f141191k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ o22.b f141192l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ o22.a.PickFile f141193m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.b bVar, o22.a.PickFile pickFile, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f141191k = d0Var;
                this.f141192l = bVar;
                this.f141193m = pickFile;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
            
                if (r1.da(r4, r3, r7) == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f141190j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r7.f141187f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r7.f141186e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto L9d
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    oq.u.b(r8)
                    goto L50
                L27:
                    oq.u.b(r8)
                    o22.d0 r8 = r7.f141191k
                    r02.d r8 = o22.d0.D9(r8)
                    r02.d$a r1 = new r02.d$a
                    o22.b r4 = r7.f141192l
                    r22.c$a r4 = r4.j()
                    java.lang.Object r4 = r4.d()
                    java.util.List r4 = (java.util.List) r4
                    r5 = 1307470632(0x4dee6b28, float:5.0E8)
                    r6 = 1279179808(0x4c3ebc20, float:5.0E7)
                    r1.<init>(r5, r6, r4)
                    r7.f141190j = r3
                    java.lang.Object r8 = r8.i(r1, r7)
                    if (r8 != r0) goto L50
                    goto L80
                L50:
                    dx.i r8 = (dx.i) r8
                    o22.d0 r1 = r7.f141191k
                    o22.a$o r3 = r7.f141193m
                    boolean r4 = r8 instanceof dx.i.Left
                    if (r4 == 0) goto L81
                    r4 = r8
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    o22.a$m r3 = r3.getFromAction()
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f141186e = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f141187f = r8
                    r8 = 0
                    r7.f141188g = r8
                    r7.f141189h = r8
                    r7.f141190j = r2
                    java.lang.Object r8 = o22.d0.L9(r1, r4, r3, r7)
                    if (r8 != r0) goto L9d
                L80:
                    return r0
                L81:
                    boolean r0 = r8 instanceof dx.i.Right
                    if (r0 == 0) goto La0
                    dx.i$c r8 = (dx.i.Right) r8
                    java.lang.Object r8 = r8.b()
                    r02.d$b r8 = (r02.d.Result) r8
                    o22.a$x r0 = new o22.a$x
                    zz.a r8 = r8.getFile()
                    o22.a$m r2 = r3.getFromAction()
                    r0.<init>(r8, r2)
                    o22.d0.v9(r1, r0)
                L9d:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                La0:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o22.d0.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f141191k, this.f141192l, this.f141193m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.PickFile pickFile = (o22.a.PickFile) this.f141183f;
            o22.b bVar = (o22.b) this.f141184g;
            Object objE = uq.b.e();
            int i15 = this.f141182e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, bVar, pickFile, null);
                this.f141183f = vq.j.a(pickFile);
                this.f141184g = vq.j.a(bVar);
                this.f141182e = 1;
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
        public final Object w(o22.a.PickFile pickFile, o22.b bVar, tq.e<? super oq.i0> eVar) {
            g gVar = d0.this.new g(eVar);
            gVar.f141183f = pickFile;
            gVar.f141184g = bVar;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$p;", "action", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$p;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<o22.a.PickPhoto, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141196g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f141198e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f141199f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f141200g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f141201h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f141202j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d0 f141203k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ o22.b f141204l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ o22.a.PickPhoto f141205m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.b bVar, o22.a.PickPhoto pickPhoto, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f141203k = d0Var;
                this.f141204l = bVar;
                this.f141205m = pickPhoto;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
            
                if (r1.da(r4, r3, r7) == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f141202j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r7.f141199f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r7.f141198e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto L9d
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    oq.u.b(r8)
                    goto L50
                L27:
                    oq.u.b(r8)
                    o22.d0 r8 = r7.f141203k
                    r02.e r8 = o22.d0.E9(r8)
                    r02.e$b r1 = new r02.e$b
                    o22.b r4 = r7.f141204l
                    r22.c$a r4 = r4.j()
                    java.lang.Object r4 = r4.d()
                    java.util.List r4 = (java.util.List) r4
                    r5 = 1279179808(0x4c3ebc20, float:5.0E7)
                    r6 = 1307470632(0x4dee6b28, float:5.0E8)
                    r1.<init>(r5, r6, r4)
                    r7.f141202j = r3
                    java.lang.Object r8 = r8.g(r1, r7)
                    if (r8 != r0) goto L50
                    goto L80
                L50:
                    dx.i r8 = (dx.i) r8
                    o22.d0 r1 = r7.f141203k
                    o22.a$p r3 = r7.f141205m
                    boolean r4 = r8 instanceof dx.i.Left
                    if (r4 == 0) goto L81
                    r4 = r8
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    o22.a$m r3 = r3.getFromAction()
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f141198e = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f141199f = r8
                    r8 = 0
                    r7.f141200g = r8
                    r7.f141201h = r8
                    r7.f141202j = r2
                    java.lang.Object r8 = o22.d0.L9(r1, r4, r3, r7)
                    if (r8 != r0) goto L9d
                L80:
                    return r0
                L81:
                    boolean r0 = r8 instanceof dx.i.Right
                    if (r0 == 0) goto La0
                    dx.i$c r8 = (dx.i.Right) r8
                    java.lang.Object r8 = r8.b()
                    r02.e$c r8 = (r02.e.Result) r8
                    o22.a$x r0 = new o22.a$x
                    zz.a r8 = r8.getImageFile()
                    o22.a$m r2 = r3.getFromAction()
                    r0.<init>(r8, r2)
                    o22.d0.v9(r1, r0)
                L9d:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                La0:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: o22.d0.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f141203k, this.f141204l, this.f141205m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.PickPhoto pickPhoto = (o22.a.PickPhoto) this.f141195f;
            o22.b bVar = (o22.b) this.f141196g;
            Object objE = uq.b.e();
            int i15 = this.f141194e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, bVar, pickPhoto, null);
                this.f141195f = vq.j.a(pickPhoto);
                this.f141196g = vq.j.a(bVar);
                this.f141194e = 1;
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
        public final Object w(o22.a.PickPhoto pickPhoto, o22.b bVar, tq.e<? super oq.i0> eVar) {
            h hVar = d0.this.new h(eVar);
            hVar.f141195f = pickPhoto;
            hVar.f141196g = bVar;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$t;", "action", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$t;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<o22.a.TakePhoto, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141208g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f141210e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f141211f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f141212g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f141213h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f141214j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d0 f141215k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ o22.b f141216l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ o22.a.TakePhoto f141217m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.b bVar, o22.a.TakePhoto takePhoto, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f141215k = d0Var;
                this.f141216l = bVar;
                this.f141217m = takePhoto;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
            
                if (r1.da(r4, r3, r8) == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r8.f141214j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r8.f141211f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r8.f141210e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r9)
                    goto Lb2
                L1b:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L23:
                    oq.u.b(r9)
                    goto L65
                L27:
                    oq.u.b(r9)
                    o22.d0 r9 = r8.f141215k
                    r02.f r9 = o22.d0.I9(r9)
                    r02.f$a r1 = new r02.f$a
                    o22.d0 r4 = r8.f141215k
                    r02.c r4 = o22.d0.B9(r4)
                    gz.b$a$a r5 = gz.b.a.C1792a.f78542a
                    java.lang.String r4 = r4.b(r5)
                    o22.b r5 = r8.f141216l
                    r22.c$a r5 = r5.j()
                    java.lang.Object r5 = r5.d()
                    java.util.List r5 = (java.util.List) r5
                    float r5 = m02.d.c(r5)
                    zb4.a r6 = new zb4.a
                    r7 = 1307470632(0x4dee6b28, float:5.0E8)
                    r6.<init>(r5, r7)
                    r5 = 1279179808(0x4c3ebc20, float:5.0E7)
                    r1.<init>(r4, r5, r6)
                    r8.f141214j = r3
                    java.lang.Object r9 = r9.d(r1, r8)
                    if (r9 != r0) goto L65
                    goto L95
                L65:
                    dx.i r9 = (dx.i) r9
                    o22.d0 r1 = r8.f141215k
                    o22.a$t r3 = r8.f141217m
                    boolean r4 = r9 instanceof dx.i.Left
                    if (r4 == 0) goto L96
                    r4 = r9
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    o22.a$m r3 = r3.getFromAction()
                    java.lang.Object r9 = vq.j.a(r9)
                    r8.f141210e = r9
                    java.lang.Object r9 = vq.j.a(r4)
                    r8.f141211f = r9
                    r9 = 0
                    r8.f141212g = r9
                    r8.f141213h = r9
                    r8.f141214j = r2
                    java.lang.Object r9 = o22.d0.L9(r1, r4, r3, r8)
                    if (r9 != r0) goto Lb2
                L95:
                    return r0
                L96:
                    boolean r0 = r9 instanceof dx.i.Right
                    if (r0 == 0) goto Lb5
                    dx.i$c r9 = (dx.i.Right) r9
                    java.lang.Object r9 = r9.b()
                    r02.f$b r9 = (r02.f.Result) r9
                    o22.a$x r0 = new o22.a$x
                    zz.a r9 = r9.getImageFile()
                    o22.a$m r2 = r3.getFromAction()
                    r0.<init>(r9, r2)
                    o22.d0.v9(r1, r0)
                Lb2:
                    oq.i0 r9 = oq.i0.f148189a
                    return r9
                Lb5:
                    oq.p r9 = new oq.p
                    r9.<init>()
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: o22.d0.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f141215k, this.f141216l, this.f141217m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.TakePhoto takePhoto = (o22.a.TakePhoto) this.f141207f;
            o22.b bVar = (o22.b) this.f141208g;
            Object objE = uq.b.e();
            int i15 = this.f141206e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, bVar, takePhoto, null);
                this.f141207f = vq.j.a(takePhoto);
                this.f141208g = vq.j.a(bVar);
                this.f141206e = 1;
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
        public final Object w(o22.a.TakePhoto takePhoto, o22.b bVar, tq.e<? super oq.i0> eVar) {
            i iVar = d0.this.new i(eVar);
            iVar.f141207f = takePhoto;
            iVar.f141208g = bVar;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$x;", "action", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$x;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<o22.a.ValidateFileName, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141220g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f141222e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f141223f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f141224g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f141225h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f141226j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d0 f141227k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ o22.a.ValidateFileName f141228l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ o22.b f141229m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.a.ValidateFileName validateFileName, o22.b bVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f141227k = d0Var;
                this.f141228l = validateFileName;
                this.f141229m = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f141226j;
                if (i15 == 0) {
                    oq.u.b(obj);
                    r02.a aVar = this.f141227k.checkFileNameUseCase;
                    y0 y0Var = y0.E_DELIVERY;
                    FilePickerMetadata metadata = this.f141228l.getPickedFile().getMetadata();
                    List<m02.c> listD = this.f141229m.j().d();
                    ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((m02.c) it.next()).getMetadata().getName());
                    }
                    dx.i<dx.b, oq.i0> iVarI = aVar.i(new r02.a.Params(y0Var, metadata, arrayList));
                    d0 d0Var = this.f141227k;
                    o22.a.ValidateFileName validateFileName = this.f141228l;
                    if (iVarI instanceof dx.i.Left) {
                        dx.b bVar = (dx.b) ((dx.i.Left) iVarI).b();
                        o22.a.OnPickerActionSelected fromAction = validateFileName.getFromAction();
                        this.f141222e = vq.j.a(iVarI);
                        this.f141223f = vq.j.a(bVar);
                        this.f141224g = 0;
                        this.f141225h = 0;
                        this.f141226j = 1;
                        if (d0Var.da(bVar, fromAction, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (!(iVarI instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        d0Var.d9(new o22.a.OnFilePicked(validateFileName.getPickedFile(), validateFileName.getFromAction()));
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f141227k, this.f141228l, this.f141229m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.ValidateFileName validateFileName = (o22.a.ValidateFileName) this.f141219f;
            o22.b bVar = (o22.b) this.f141220g;
            Object objE = uq.b.e();
            int i15 = this.f141218e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, validateFileName, bVar, null);
                this.f141219f = vq.j.a(validateFileName);
                this.f141220g = vq.j.a(bVar);
                this.f141218e = 1;
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
        public final Object w(o22.a.ValidateFileName validateFileName, o22.b bVar, tq.e<? super oq.i0> eVar) {
            j jVar = d0.this.new j(eVar);
            jVar.f141219f = validateFileName;
            jVar.f141220g = bVar;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$l;", "action", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$l;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<o22.a.OnFilePicked, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141231f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141232g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leo0/g0;", "messageId", "Loq/i0;", "<anonymous>", "(Leo0/g0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<eo0.g0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f141234e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f141235f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d0 f141236g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ o22.a.OnFilePicked f141237h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.a.OnFilePicked onFilePicked, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f141236g = d0Var;
                this.f141237h = onFilePicked;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(eo0.g0 g0Var, tq.e<? super oq.i0> eVar) {
                return M(g0Var.getValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                String str = (String) this.f141235f;
                uq.b.e();
                if (this.f141234e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f141236g.d9(new o22.a.UploadFile(this.f141237h.getPickedFile(), str, null));
                return oq.i0.f148189a;
            }

            public final Object M(String str, tq.e<? super oq.i0> eVar) {
                return ((a) v(eo0.g0.a(str), eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f141236g, this.f141237h, eVar);
                aVar.f141235f = ((eo0.g0) obj).getValue();
                return aVar;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.OnFilePicked onFilePicked = (o22.a.OnFilePicked) this.f141231f;
            o22.b bVar = (o22.b) this.f141232g;
            uq.b.e();
            if (this.f141230e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String messageId = bVar.getMessageId();
            if (messageId != null) {
                d0.this.d9(new o22.a.UploadFile(onFilePicked.getPickedFile(), messageId, null));
            } else {
                d0.this.d9(new o22.a.CreateDraft(new a(d0.this, onFilePicked, null)));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.OnFilePicked onFilePicked, o22.b bVar, tq.e<? super oq.i0> eVar) {
            k kVar = d0.this.new k(eVar);
            kVar.f141231f = onFilePicked;
            kVar.f141232g = bVar;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$r;", "action", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$r;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<o22.a.r, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f141239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f141240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f141241h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f141242j;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leo0/g0;", "messageId", "Loq/i0;", "<anonymous>", "(Leo0/g0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<eo0.g0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f141244e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f141245f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d0 f141246g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ o22.b f141247h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ o22.a.r f141248j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.b bVar, o22.a.r rVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f141246g = d0Var;
                this.f141247h = bVar;
                this.f141248j = rVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(eo0.g0 g0Var, tq.e<? super oq.i0> eVar) {
                return M(g0Var.getValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                String str = (String) this.f141245f;
                Object objE = uq.b.e();
                int i15 = this.f141244e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    d0 d0Var = this.f141246g;
                    o22.b bVar = this.f141247h;
                    o22.a.r rVar = this.f141248j;
                    this.f141245f = vq.j.a(str);
                    this.f141244e = 1;
                    if (d0Var.pa(bVar, str, rVar, this) == objE) {
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

            public final Object M(String str, tq.e<? super oq.i0> eVar) {
                return ((a) v(eo0.g0.a(str), eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f141246g, this.f141247h, this.f141248j, eVar);
                aVar.f141245f = ((eo0.g0) obj).getValue();
                return aVar;
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.r rVar = (o22.a.r) this.f141241h;
            o22.b bVar = (o22.b) this.f141242j;
            Object objE = uq.b.e();
            int i15 = this.f141240g;
            if (i15 == 0) {
                oq.u.b(obj);
                String messageId = bVar.getMessageId();
                if (messageId != null) {
                    d0 d0Var = d0.this;
                    this.f141241h = rVar;
                    this.f141242j = bVar;
                    this.f141238e = vq.j.a(messageId);
                    this.f141239f = 0;
                    this.f141240g = 1;
                    if (d0Var.pa(bVar, messageId, rVar, this) == objE) {
                        return objE;
                    }
                } else {
                    d0.this.d9(new o22.a.CreateDraft(new a(d0.this, bVar, rVar, null)));
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
        public final Object w(o22.a.r rVar, o22.b bVar, tq.e<? super oq.i0> eVar) {
            l lVar = d0.this.new l(eVar);
            lVar.f141241h = rVar;
            lVar.f141242j = bVar;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$a;", "<unused var>", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$a;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<o22.a.C3485a, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141250f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.b bVar = (o22.b) this.f141250f;
            Object objE = uq.b.e();
            int i15 = this.f141249e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                d0Var.oa(d0Var.Y9(bVar));
                xw.b<o22.a.i> bVarY1 = d0.this.Y1();
                o22.a.i.C3486a c3486a = o22.a.i.C3486a.f141053a;
                this.f141250f = vq.j.a(bVar);
                this.f141249e = 1;
                if (bVarY1.F(c3486a, this) == objE) {
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
        public final Object w(o22.a.C3485a c3485a, o22.b bVar, tq.e<? super oq.i0> eVar) {
            m mVar = d0.this.new m(eVar);
            mVar.f141250f = bVar;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$w;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<o22.a.w, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141253f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V(d0 d0Var) {
            d0Var.d9(new o22.a.Error(d0Var.saveDraftErrorMessageMapper.b(new c12.k.Params(new er.a() { // from class: o22.i0
                @Override // er.a
                public final Object a() {
                    return d0.n.X();
                }
            }, d0Var.b9(o22.a.q.f141067a)))));
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f141253f;
            Object objE = uq.b.e();
            int i15 = this.f141252e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            er.a aVarB9 = d0.this.b9(o22.a.r.f141068a);
            final d0 d0Var = d0.this;
            er.a aVar = new er.a() { // from class: o22.h0
                @Override // er.a
                public final Object a() {
                    return d0.n.V(d0Var);
                }
            };
            this.f141253f = vq.j.a(c0Var);
            this.f141252e = 1;
            Object objXa = d0Var.xa(c0Var, false, aVarB9, aVar, this);
            return objXa == objE ? objE : objXa;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.w wVar, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            n nVar = d0.this.new n(eVar);
            nVar.f141253f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$d;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<o22.a.CreateDraft, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141257g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lo22/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends o22.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f141259e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f141260f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f141261g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f141262h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f141263j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f141264k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f141265l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f141266m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ d0 f141267n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ o22.a.CreateDraft f141268p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<o22.b> f141269q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.a.CreateDraft createDraft, k10.c0<o22.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f141267n = d0Var;
                this.f141268p = createDraft;
                this.f141269q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o22.b V(EdeliveryDraftMessageResponse edeliveryDraftMessageResponse, o22.b bVar) {
                return o22.b.b(bVar, edeliveryDraftMessageResponse.getDraftDetails().getMessageId(), null, null, null, null, null, null, null, null, null, null, 2046, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f141266m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p02.b bVar = this.f141267n.createDraftUC;
                    p02.b.Params params = new p02.b.Params(this.f141267n.X9());
                    this.f141266m = 1;
                    obj = bVar.e(params, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f141261g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                d0 d0Var = this.f141267n;
                o22.a.CreateDraft createDraft = this.f141268p;
                k10.c0<o22.b> c0Var = this.f141269q;
                if (iVar instanceof dx.i.Left) {
                    d0Var.aa((dx.b) ((dx.i.Left) iVar).b(), createDraft);
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final EdeliveryDraftMessageResponse edeliveryDraftMessageResponse = (EdeliveryDraftMessageResponse) ((dx.i.Right) iVar).b();
                k10.l<o22.b> lVarB = c0Var.b(new er.l() { // from class: o22.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.o.a.V(edeliveryDraftMessageResponse, (b) obj2);
                    }
                });
                er.p<eo0.g0, tq.e<? super oq.i0>, Object> pVarA = createDraft.a();
                eo0.g0 g0VarA = eo0.g0.a(edeliveryDraftMessageResponse.getDraftDetails().getMessageId());
                this.f141259e = vq.j.a(iVar);
                this.f141260f = vq.j.a(edeliveryDraftMessageResponse);
                this.f141261g = lVarB;
                this.f141262h = vq.j.a(lVarB);
                this.f141263j = 0;
                this.f141264k = 0;
                this.f141265l = 0;
                this.f141266m = 2;
                return pVarA.B(g0VarA, this) == objE ? objE : lVarB;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f141267n, this.f141268p, this.f141269q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<o22.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.CreateDraft createDraft = (o22.a.CreateDraft) this.f141256f;
            k10.c0 c0Var = (k10.c0) this.f141257g;
            Object objE = uq.b.e();
            int i15 = this.f141255e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, createDraft, c0Var, null);
            this.f141256f = vq.j.a(createDraft);
            this.f141257g = vq.j.a(c0Var);
            this.f141255e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.CreateDraft createDraft, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            o oVar = d0.this.new o(eVar);
            oVar.f141256f = createDraft;
            oVar.f141257g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$v;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<o22.a.UploadFile, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141272g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lo22/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends o22.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f141274e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f141275f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f141276g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f141277h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f141278j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f141279k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f141280l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ d0 f141281m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ o22.a.UploadFile f141282n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<o22.b> f141283p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.a.UploadFile uploadFile, k10.c0<o22.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f141281m = d0Var;
                this.f141282n = uploadFile;
                this.f141283p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o22.b V(t50.e eVar, o22.a.UploadFile uploadFile, String str, o22.b bVar) {
                return o22.b.b(bVar, null, null, null, null, null, eVar, null, null, null, null, new State.Field(pq.v.M0(bVar.j().d(), new m02.c.PickedFileData(uploadFile.getPickedFile(), str, null)), null, 2, null), 991, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<o22.b> c0Var;
                final o22.a.UploadFile uploadFile;
                final String str;
                Object objE = uq.b.e();
                int i15 = this.f141280l;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p02.r0 r0Var = this.f141281m.uploadEdorAttachmentUC;
                    p02.r0.Params params = new p02.r0.Params(this.f141282n.getMessageId(), this.f141282n.getPickedFile(), null);
                    this.f141280l = 1;
                    obj = r0Var.e(params, this);
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
                    str = (String) this.f141277h;
                    uploadFile = (o22.a.UploadFile) this.f141276g;
                    c0Var = (k10.c0) this.f141275f;
                    oq.u.b(obj);
                }
                final t50.e eVar = (t50.e) obj;
                return c0Var.b(new er.l() { // from class: o22.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.p.a.V(eVar, uploadFile, str, (b) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                k10.c0<o22.b> c0Var2 = this.f141283p;
                d0 d0Var = this.f141281m;
                o22.a.UploadFile uploadFile2 = this.f141282n;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    Object objC = c0Var2.c();
                    d0Var.aa(bVar, uploadFile2);
                    return objC;
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                String value = ((eo0.y) ((dx.i.Right) iVar).b()).getValue();
                d0Var.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                String contentValue = c0Var2.a().getContentValue();
                this.f141274e = vq.j.a(iVar);
                this.f141275f = c0Var2;
                this.f141276g = uploadFile2;
                this.f141277h = value;
                this.f141278j = 0;
                this.f141279k = 0;
                this.f141280l = 2;
                obj = d0Var.wa(contentValue, false, this);
                if (obj != objE) {
                    c0Var = c0Var2;
                    uploadFile = uploadFile2;
                    str = value;
                    final t50.e eVar2 = (t50.e) obj;
                    return c0Var.b(new er.l() { // from class: o22.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.p.a.V(eVar2, uploadFile, str, (b) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f141281m, this.f141282n, this.f141283p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<o22.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.UploadFile uploadFile = (o22.a.UploadFile) this.f141271f;
            k10.c0 c0Var = (k10.c0) this.f141272g;
            Object objE = uq.b.e();
            int i15 = this.f141270e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, uploadFile, c0Var, null);
            this.f141271f = vq.j.a(uploadFile);
            this.f141272g = vq.j.a(c0Var);
            this.f141270e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.UploadFile uploadFile, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            p pVar = d0.this.new p(eVar);
            pVar.f141271f = uploadFile;
            pVar.f141272g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$k;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<o22.a.OnDeleteFile, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f141284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f141285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f141286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f141287h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f141288j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lo22/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends o22.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f141290e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f141291f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ o22.a.OnDeleteFile f141292g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f141293h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<o22.b> f141294j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, o22.a.OnDeleteFile onDeleteFile, String str, k10.c0<o22.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f141291f = d0Var;
                this.f141292g = onDeleteFile;
                this.f141293h = str;
                this.f141294j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o22.b V(o22.a.OnDeleteFile onDeleteFile, o22.b bVar) {
                List<m02.c> listD = bVar.j().d();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (!eo0.y.d(((m02.c) obj).getAttachmentId(), onDeleteFile.getFile().getAttachmentId())) {
                        arrayList.add(obj);
                    }
                }
                return o22.b.b(bVar, null, null, null, null, null, null, null, null, null, null, new State.Field(arrayList, null, 2, null), 1023, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f141290e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p02.j0 j0Var = this.f141291f.removeEdorAttachmentUC;
                    p02.j0.Params params = new p02.j0.Params(this.f141293h, this.f141292g.getFile().getAttachmentId(), null);
                    this.f141290e = 1;
                    obj = j0Var.i(params, this);
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
                k10.c0<o22.b> c0Var = this.f141294j;
                d0 d0Var = this.f141291f;
                final o22.a.OnDeleteFile onDeleteFile = this.f141292g;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    Object objC = c0Var.c();
                    d0Var.aa(bVar, onDeleteFile);
                    return objC;
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                return c0Var.b(new er.l() { // from class: o22.l0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.q.a.V(onDeleteFile, (b) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f141291f, this.f141292g, this.f141293h, this.f141294j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<o22.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.OnDeleteFile onDeleteFile = (o22.a.OnDeleteFile) this.f141287h;
            k10.c0 c0Var = (k10.c0) this.f141288j;
            Object objE = uq.b.e();
            int i15 = this.f141286g;
            if (i15 == 0) {
                oq.u.b(obj);
                String messageId = ((o22.b) c0Var.a()).getMessageId();
                if (messageId != null) {
                    d0 d0Var = d0.this;
                    ac4.a aVar = d0Var.callActionWithLoaderUseCase;
                    a aVar2 = new a(d0Var, onDeleteFile, messageId, c0Var, null);
                    this.f141287h = vq.j.a(onDeleteFile);
                    this.f141288j = c0Var;
                    this.f141284e = vq.j.a(messageId);
                    this.f141285f = 0;
                    this.f141286g = 1;
                    obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return c0Var.c();
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.OnDeleteFile onDeleteFile, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            q qVar = d0.this.new q(eVar);
            qVar.f141287h = onDeleteFile;
            qVar.f141288j = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$g;", "action", "Lo22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo22/a$g;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<o22.a.GoToAuthorization, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141296f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(d0 d0Var, o22.a.GoToAuthorization goToAuthorization) {
            d0Var.d9(goToAuthorization.getAction());
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o22.a.GoToAuthorization goToAuthorization = (o22.a.GoToAuthorization) this.f141296f;
            Object objE = uq.b.e();
            int i15 = this.f141295e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o22.a.i> bVarY1 = d0.this.Y1();
                final d0 d0Var = d0.this;
                o22.a.i.GoToAuthorization goToAuthorization2 = new o22.a.i.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: o22.m0
                    @Override // er.a
                    public final Object a() {
                        return d0.r.O(d0Var, goToAuthorization);
                    }
                }));
                this.f141296f = vq.j.a(goToAuthorization);
                this.f141295e = 1;
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
        public final Object w(o22.a.GoToAuthorization goToAuthorization, o22.b bVar, tq.e<? super oq.i0> eVar) {
            r rVar = d0.this.new r(eVar);
            rVar.f141296f = goToAuthorization;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$e;", "action", "Lo22/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo22/a$e;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<o22.a.Error, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141299f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.a.Error error = (o22.a.Error) this.f141299f;
            Object objE = uq.b.e();
            int i15 = this.f141298e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o22.a.i> bVarY1 = d0.this.Y1();
                o22.a.i.GoToError goToError = new o22.a.i.GoToError(error.getErrorData());
                this.f141299f = vq.j.a(error);
                this.f141298e = 1;
                if (bVarY1.F(goToError, this) == objE) {
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
        public final Object w(o22.a.Error error, o22.b bVar, tq.e<? super oq.i0> eVar) {
            s sVar = d0.this.new s(eVar);
            sVar.f141299f = error;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo22/a$f;", "<unused var>", "Lo22/b;", "Loq/i0;", "<anonymous>", "(Lo22/a$f;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<o22.a.f, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141301e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f141301e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.f fVar, o22.b bVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$n;", "<unused var>", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<o22.a.n, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141304f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o22.b O(o22.b bVar) {
            return o22.b.b(bVar, null, null, null, null, null, null, null, null, null, null, null, 1791, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f141304f;
            uq.b.e();
            if (this.f141303e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o22.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.u.O((b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.n nVar, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            u uVar = new u(eVar);
            uVar.f141304f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo22/a$q;", "<unused var>", "Lo22/b;", "Loq/i0;", "<anonymous>", "(Lo22/a$q;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<o22.a.q, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141305e;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f141305e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o22.a.i> bVarY1 = d0.this.Y1();
                o22.a.i.e eVar = o22.a.i.e.f141057a;
                this.f141305e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(o22.a.q qVar, o22.b bVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new v(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo22/a$h;", "<unused var>", "Lo22/b;", "state", "Loq/i0;", "<anonymous>", "(Lo22/a$h;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<o22.a.h, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141308f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o22.b bVar = (o22.b) this.f141308f;
            Object objE = uq.b.e();
            int i15 = this.f141307e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                d0Var.oa(d0Var.Y9(bVar));
                xw.b<o22.a.i> bVarY1 = d0.this.Y1();
                o22.a.i.d dVar = o22.a.i.d.f141056a;
                this.f141308f = vq.j.a(bVar);
                this.f141307e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(o22.a.h hVar, o22.b bVar, tq.e<? super oq.i0> eVar) {
            w wVar = d0.this.new w(eVar);
            wVar.f141308f = bVar;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo22/a$s;", "<unused var>", "Lo22/b;", "Loq/i0;", "<anonymous>", "(Lo22/a$s;Lo22/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<o22.a.s, o22.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141310e;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f141310e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                this.f141310e = 1;
                if (d0Var.ra(this) == objE) {
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
        public final Object w(o22.a.s sVar, o22.b bVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new x(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$u;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<o22.a.TitleChange, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141314g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o22.b O(o22.a.TitleChange titleChange, t50.e eVar, o22.b bVar) {
            return o22.b.b(bVar, null, titleChange.getValue(), null, null, eVar, null, null, null, null, null, null, 2029, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o22.a.TitleChange titleChange = (o22.a.TitleChange) this.f141313f;
            k10.c0 c0Var = (k10.c0) this.f141314g;
            Object objE = uq.b.e();
            int i15 = this.f141312e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                String value = titleChange.getValue();
                this.f141313f = titleChange;
                this.f141314g = c0Var;
                this.f141312e = 1;
                obj = d0Var.za(value, true, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final t50.e eVar = (t50.e) obj;
            return c0Var.b(new er.l() { // from class: o22.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.y.O(titleChange, eVar, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.TitleChange titleChange, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            y yVar = d0.this.new y(eVar);
            yVar.f141313f = titleChange;
            yVar.f141314g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo22/a$c;", "action", "Lk10/c0;", "Lo22/b;", "state", "Lk10/l;", "<anonymous>", "(Lo22/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<o22.a.ContentChange, k10.c0<o22.b>, tq.e<? super k10.l<? extends o22.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f141316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f141317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f141318g;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o22.b O(o22.a.ContentChange contentChange, t50.e eVar, k10.c0 c0Var, d0 d0Var, o22.b bVar) {
            return o22.b.b(bVar, null, null, contentChange.getValue(), null, null, eVar, null, null, null, null, State.Field.b(((o22.b) c0Var.a()).j(), null, d0Var.ua((o22.b) c0Var.a()), 1, null), 987, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o22.a.ContentChange contentChange = (o22.a.ContentChange) this.f141317f;
            final k10.c0 c0Var = (k10.c0) this.f141318g;
            Object objE = uq.b.e();
            int i15 = this.f141316e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                String value = contentChange.getValue();
                this.f141317f = contentChange;
                this.f141318g = c0Var;
                this.f141316e = 1;
                obj = d0Var.wa(value, false, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final t50.e eVar = (t50.e) obj;
            final d0 d0Var2 = d0.this;
            return c0Var.b(new er.l() { // from class: o22.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.z.O(contentChange, eVar, c0Var, d0Var2, (b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o22.a.ContentChange contentChange, k10.c0<o22.b> c0Var, tq.e<? super k10.l<o22.b>> eVar) {
            z zVar = d0.this.new z(eVar);
            zVar.f141317f = contentChange;
            zVar.f141318g = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public d0(yy.a aVar, p22.d dVar, c12.g gVar, t02.g gVar2, r02.e eVar, r02.f fVar, r02.c cVar, s22.k kVar, r02.d dVar2, r02.a aVar2, ac4.a aVar3, p02.b bVar, p02.j0 j0Var, p02.r0 r0Var, b12.c cVar2, mx.c cVar3, x02.d dVar3, p02.f fVar2, i70.e eVar2, a14.m mVar, yw.b bVar2, c12.k kVar2, p22.a aVar4, EdorMessageSetupData edorMessageSetupData) {
        this.mapper = dVar;
        this.dialogMapper = gVar;
        this.formValidationUseCase = gVar2;
        this.pickPhotoFromGalleryUC = eVar;
        this.takePhotoWithSizeValidationUC = fVar;
        this.generateNewCameraPhotoNameUC = cVar;
        this.filePickerErrorMapper = kVar;
        this.pickFileUseCase = dVar2;
        this.checkFileNameUseCase = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.createDraftUC = bVar;
        this.removeEdorAttachmentUC = j0Var;
        this.uploadEdorAttachmentUC = r0Var;
        this.electronicDeliveryErrorMapper = cVar2;
        this.labelProvider = cVar3;
        this.getMessageServiceTypeUC = dVar3;
        this.editEdorDraftUC = fVar2;
        this.snackBarManager = eVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.saveDraftErrorMessageMapper = kVar2;
        this.setupData = edorMessageSetupData;
        o22.b bVarB = aVar4.b(new p22.a.Params(edorMessageSetupData.getStartContract().v6().getEntryPoint(), edorMessageSetupData.getMessageFormContract().I1()));
        this.initialState = bVarB;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVarB, new er.l() { // from class: o22.s
            @Override // er.l
            public final Object b(Object obj) {
                return d0.sa(this.f141373a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), ga(bVarB));
        this.emptyDraft = oq.l.a(new er.a() { // from class: o22.t
            @Override // er.a
            public final Object a() {
                return d0.W9(this.f141375a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eo0.v W9(d0 d0Var) {
        List<Recipient> listN;
        o02.b.AddRecipients addRecipientsH6 = d0Var.setupData.getAddRecipientContract().H6();
        if (addRecipientsH6 == null || (listN = addRecipientsH6.a()) == null) {
            listN = pq.v.n();
        }
        return new eo0.v(null, listN, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eo0.v X9() {
        return (eo0.v) this.emptyDraft.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o02.c Y9(o22.b bVar) {
        return new o02.c(bVar.getTitleValue(), bVar.getContentValue(), bVar.getCaseSignValue(), bVar.getMessageId(), bVar.j().d(), null);
    }

    private final String Z9(o02.b.Start start) {
        z02.a entryPoint = start.getEntryPoint();
        if (entryPoint instanceof z02.a.ForwardMessage) {
            return ((z02.a.ForwardMessage) start.getEntryPoint()).getMessageDetails().getDeliveryMessage().getThreadId();
        }
        if (entryPoint instanceof z02.a.Reply) {
            return ((z02.a.Reply) start.getEntryPoint()).getMessageDetails().getDeliveryMessage().getThreadId();
        }
        if (entryPoint instanceof z02.a.EditDraft) {
            return ((z02.a.EditDraft) start.getEntryPoint()).getMessageDetails().getDeliveryMessage().getThreadId();
        }
        if (fr.t.c(entryPoint, z02.a.c.f231893a)) {
            return null;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aa(dx.b bVar, o22.a aVar) {
        this.electronicDeliveryErrorMapper.c(new b12.c.Params(bVar, b9(new o22.a.GoToAuthorization(aVar)), new er.a() { // from class: o22.a0
            @Override // er.a
            public final Object a() {
                return d0.ba();
            }
        }, b9(aVar), new er.l() { // from class: o22.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ca(this.f141089a, (jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(d0 d0Var, jb4.b bVar) {
        d0Var.d9(new o22.a.Error(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object da(dx.b bVar, final o22.a.OnPickerActionSelected onPickerActionSelected, tq.e<? super oq.i0> eVar) {
        s22.k.a fileOrPhotoPicker;
        Object goToError;
        if ((bVar instanceof dx.b.Business) && ((dx.b.Business) bVar).getType() == n02.a.REFRESH_TOKEN_EXPIRED) {
            d9(new o22.a.GoToAuthorization(onPickerActionSelected));
            return oq.i0.f148189a;
        }
        s22.k kVar = this.filePickerErrorMapper;
        boolean z15 = onPickerActionSelected.getPickerAction() == t22.a.TAKE_PHOTO;
        if (z15) {
            fileOrPhotoPicker = new s22.k.a.Camera(bVar, new er.a() { // from class: o22.c0
                @Override // er.a
                public final Object a() {
                    return d0.ea(this.f141101a, onPickerActionSelected);
                }
            }, b9(o22.a.f.f141050a));
        } else {
            if (z15) {
                throw new oq.p();
            }
            fileOrPhotoPicker = new s22.k.a.FileOrPhotoPicker(bVar, new er.a() { // from class: o22.q
                @Override // er.a
                public final Object a() {
                    return d0.fa(this.f141364a, onPickerActionSelected);
                }
            });
        }
        s22.k.b bVarB = kVar.b(fileOrPhotoPicker);
        if (bVarB == null) {
            return null;
        }
        if (bVarB instanceof s22.k.b.Dialog) {
            goToError = new o22.a.i.ShowDialog(((s22.k.b.Dialog) bVarB).getData());
        } else {
            if (!(bVarB instanceof s22.k.b.FullPage)) {
                throw new oq.p();
            }
            goToError = new o22.a.i.GoToError(((s22.k.b.FullPage) bVarB).getData());
        }
        Object objF = F(goToError, eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(d0 d0Var, o22.a.OnPickerActionSelected onPickerActionSelected) {
        d0Var.d9(onPickerActionSelected);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(d0 d0Var, o22.a.OnPickerActionSelected onPickerActionSelected) {
        d0Var.d9(onPickerActionSelected);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o22.c.Data ga(o22.b state) {
        return this.mapper.b(new p22.d.Params(state, b9(o22.a.C3485a.f141045a), b9(o22.a.s.f141069a), new er.l() { // from class: o22.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ha(this.f141376a, (String) obj);
            }
        }, new er.l() { // from class: o22.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ia(this.f141377a, (String) obj);
            }
        }, new er.l() { // from class: o22.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ja(this.f141378a, (String) obj);
            }
        }, b9(o22.a.y.f141077a), b9(o22.a.n.f141064a), new er.l() { // from class: o22.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ka(this.f141379a, (m02.c) obj);
            }
        }, new er.l() { // from class: o22.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.la(this.f141380a, (g30.v) obj);
            }
        }, new er.l() { // from class: o22.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ma(this.f141381a, (t22.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(d0 d0Var, String str) {
        d0Var.d9(new o22.a.TitleChange(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(d0 d0Var, String str) {
        d0Var.d9(new o22.a.ContentChange(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(d0 d0Var, String str) {
        d0Var.d9(new o22.a.CaseSignChange(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(d0 d0Var, m02.c cVar) {
        d0Var.d9(new o22.a.OnDeleteFile(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(d0 d0Var, g30.v vVar) {
        d0Var.d9(new o22.a.OnBottomSheetStateChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(d0 d0Var, t22.a aVar) {
        d0Var.d9(new o22.a.OnPickerActionSelected(aVar));
        return oq.i0.f148189a;
    }

    private final t50.e na(hz.g validatorResponse) {
        if (validatorResponse instanceof hz.g.b) {
            return new t50.e.Default(null, 1, null);
        }
        if (validatorResponse instanceof hz.g.Invalid) {
            return new t50.e.Error(((hz.g.Invalid) validatorResponse).b().getErrorMessage());
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oa(o02.c cVar) {
        this.setupData.getMessageFormContract().r6(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object pa(o22.b bVar, String str, o22.a aVar, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar2;
        List<Recipient> listN;
        o22.a aVar3;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f141132k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f141132k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object objE = aVar2.f141130h;
        Object objE2 = uq.b.e();
        int i16 = aVar2.f141132k;
        if (i16 == 0) {
            oq.u.b(objE);
            String titleValue = bVar.getTitleValue();
            String contentValue = bVar.getContentValue();
            String strZ9 = Z9(this.setupData.getStartContract().v6());
            String caseSignValue = bVar.getCaseSignValue();
            o02.b.AddRecipients addRecipientsH6 = this.setupData.getAddRecipientContract().H6();
            if (addRecipientsH6 == null || (listN = addRecipientsH6.a()) == null) {
                listN = pq.v.n();
            }
            eo0.v vVar = new eo0.v(titleValue, listN, caseSignValue, contentValue, strZ9, null, null);
            p02.f fVar = this.editEdorDraftUC;
            p02.f.Params params = new p02.f.Params(str, vVar, null);
            aVar2.f141126d = vq.j.a(bVar);
            aVar2.f141127e = vq.j.a(str);
            aVar3 = aVar;
            aVar2.f141128f = aVar3;
            aVar2.f141129g = vq.j.a(vVar);
            aVar2.f141132k = 1;
            objE = fVar.e(params, aVar2);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar3 = (o22.a) aVar2.f141128f;
            oq.u.b(objE);
        }
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            aa((dx.b) ((dx.i.Left) iVar).b(), aVar3);
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            ((eo0.g0) ((dx.i.Right) iVar).b()).getValue();
            this.snackBarManager.y(new p50.a.DefaultWithIcon(this.labelProvider.c(e02.a.f46537g4), false, null, null, 14, null));
            oq.i0 i0Var = oq.i0.f148189a;
            d9(o22.a.q.f141067a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ra(tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(new o22.a.i.ShowDialog(this.dialogMapper.b(new c12.g.Params(b9(o22.a.q.f141067a), this.getMessageServiceTypeUC.b(new x02.d.Params(this.setupData.getStartContract(), this.setupData.getMessageTypeContract())), b9(o22.a.w.f141074a)))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 sa(final d0 d0Var, k10.v vVar) {
        vVar.c(fr.q0.c(o22.b.class), new er.l() { // from class: o22.p
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ta(this.f141359a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ta(d0 d0Var, k10.z zVar) {
        m mVar = d0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(o22.a.C3485a.class), oVar, mVar);
        zVar.x(fr.q0.c(o22.a.Error.class), oVar, d0Var.new s(null));
        zVar.x(fr.q0.c(o22.a.f.class), oVar, d0Var.new t(null));
        zVar.v(fr.q0.c(o22.a.n.class), oVar, new u(null));
        zVar.x(fr.q0.c(o22.a.q.class), oVar, d0Var.new v(null));
        zVar.x(fr.q0.c(o22.a.h.class), oVar, d0Var.new w(null));
        zVar.x(fr.q0.c(o22.a.s.class), oVar, d0Var.new x(null));
        zVar.v(fr.q0.c(o22.a.TitleChange.class), oVar, d0Var.new y(null));
        zVar.v(fr.q0.c(o22.a.ContentChange.class), oVar, d0Var.new z(null));
        zVar.v(fr.q0.c(o22.a.CaseSignChange.class), oVar, d0Var.new c(null));
        zVar.v(fr.q0.c(o22.a.y.class), oVar, d0Var.new d(null));
        zVar.v(fr.q0.c(o22.a.OnBottomSheetStateChanged.class), oVar, new e(null));
        zVar.x(fr.q0.c(o22.a.OnPickerActionSelected.class), oVar, d0Var.new f(null));
        zVar.x(fr.q0.c(o22.a.PickFile.class), oVar, d0Var.new g(null));
        zVar.x(fr.q0.c(o22.a.PickPhoto.class), oVar, d0Var.new h(null));
        zVar.x(fr.q0.c(o22.a.TakePhoto.class), oVar, d0Var.new i(null));
        zVar.x(fr.q0.c(o22.a.ValidateFileName.class), oVar, d0Var.new j(null));
        zVar.x(fr.q0.c(o22.a.OnFilePicked.class), oVar, d0Var.new k(null));
        zVar.x(fr.q0.c(o22.a.r.class), oVar, d0Var.new l(null));
        zVar.v(fr.q0.c(o22.a.w.class), oVar, d0Var.new n(null));
        zVar.v(fr.q0.c(o22.a.CreateDraft.class), oVar, d0Var.new o(null));
        zVar.v(fr.q0.c(o22.a.UploadFile.class), oVar, d0Var.new p(null));
        zVar.v(fr.q0.c(o22.a.OnDeleteFile.class), oVar, d0Var.new q(null));
        zVar.x(fr.q0.c(o22.a.GoToAuthorization.class), oVar, d0Var.new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b ua(o22.b state) {
        return (state.j().d().isEmpty() && state.getContentValue().length() == 0) ? new hz.b.Invalid(this.labelProvider.c(e02.a.f46535g2)) : hz.b.C2039b.f86846c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object va(String str, tq.e<? super t50.e> eVar) throws Throwable {
        a0 a0Var;
        if (eVar instanceof a0) {
            a0Var = (a0) eVar;
            int i15 = a0Var.f141136g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                a0Var.f141136g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                a0Var = new a0(eVar);
            }
        } else {
            a0Var = new a0(eVar);
        }
        Object objQ = a0Var.f141134e;
        Object objE = uq.b.e();
        int i16 = a0Var.f141136g;
        if (i16 == 0) {
            oq.u.b(objQ);
            t02.g gVar = this.formValidationUseCase;
            t02.g.b.a aVar = new t02.g.b.a(str);
            a0Var.f141133d = vq.j.a(str);
            a0Var.f141136g = 1;
            objQ = gVar.q(aVar, a0Var);
            if (objQ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objQ);
        }
        return na((hz.g) objQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wa(String str, boolean z15, tq.e<? super t50.e> eVar) throws Throwable {
        b0 b0Var;
        if (eVar instanceof b0) {
            b0Var = (b0) eVar;
            int i15 = b0Var.f141153h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                b0Var.f141153h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                b0Var = new b0(eVar);
            }
        } else {
            b0Var = new b0(eVar);
        }
        Object objQ = b0Var.f141151f;
        Object objE = uq.b.e();
        int i16 = b0Var.f141153h;
        if (i16 == 0) {
            oq.u.b(objQ);
            t02.g gVar = this.formValidationUseCase;
            t02.g.b.Content content = new t02.g.b.Content(str, z15);
            b0Var.f141149d = vq.j.a(str);
            b0Var.f141150e = z15;
            b0Var.f141153h = 1;
            objQ = gVar.q(content, b0Var);
            if (objQ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objQ);
        }
        return na((hz.g) objQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0149  */
    /* JADX WARN: Code duplicated, block: B:44:0x015f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0163  */
    /* JADX WARN: Code duplicated, block: B:48:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object xa(k10.c0<o22.b> c0Var, boolean z15, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, tq.e<? super k10.l<o22.b>> eVar) throws Throwable {
        c0 c0Var2;
        er.a<oq.i0> aVar3;
        k10.c0<o22.b> c0Var3;
        er.a<oq.i0> aVar4;
        t50.e eVar2;
        er.a<oq.i0> aVar5;
        er.a<oq.i0> aVar6;
        t50.e eVar3;
        Object objVa;
        t50.e eVar4;
        final t50.e eVar5;
        er.a<oq.i0> aVar7;
        er.a<oq.i0> aVar8;
        final k10.c0<o22.b> c0Var4;
        Iterator it;
        Object next;
        final Map.Entry entry;
        boolean z16 = z15;
        if (eVar instanceof c0) {
            c0Var2 = (c0) eVar;
            int i15 = c0Var2.f141166m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0Var2.f141166m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0Var2 = new c0(eVar);
            }
        } else {
            c0Var2 = new c0(eVar);
        }
        Object objZa = c0Var2.f141164k;
        Object objE = uq.b.e();
        int i16 = c0Var2.f141166m;
        if (i16 == 0) {
            oq.u.b(objZa);
            String titleValue = c0Var.a().getTitleValue();
            c0Var2.f141158d = c0Var;
            aVar3 = aVar;
            c0Var2.f141159e = aVar3;
            c0Var2.f141160f = aVar2;
            c0Var2.f141163j = z16;
            c0Var2.f141166m = 1;
            objZa = za(titleValue, z16, c0Var2);
            if (objZa != objE) {
                c0Var3 = c0Var;
                aVar4 = aVar2;
            }
            return objE;
        }
        if (i16 == 1) {
            z16 = c0Var2.f141163j;
            aVar4 = (er.a) c0Var2.f141160f;
            aVar3 = (er.a) c0Var2.f141159e;
            c0Var3 = (k10.c0) c0Var2.f141158d;
            oq.u.b(objZa);
        } else {
            if (i16 == 2) {
                z16 = c0Var2.f141163j;
                eVar2 = (t50.e) c0Var2.f141161g;
                aVar5 = (er.a) c0Var2.f141160f;
                aVar6 = (er.a) c0Var2.f141159e;
                k10.c0<o22.b> c0Var5 = (k10.c0) c0Var2.f141158d;
                oq.u.b(objZa);
                c0Var3 = c0Var5;
                eVar3 = (t50.e) objZa;
                String caseSignValue = c0Var3.a().getCaseSignValue();
                c0Var2.f141158d = c0Var3;
                c0Var2.f141159e = aVar6;
                c0Var2.f141160f = aVar5;
                c0Var2.f141161g = eVar2;
                c0Var2.f141162h = eVar3;
                c0Var2.f141163j = z16;
                c0Var2.f141166m = 3;
                objVa = va(caseSignValue, c0Var2);
                if (objVa != objE) {
                    objZa = objVa;
                    eVar4 = eVar3;
                    eVar5 = eVar2;
                    aVar7 = aVar5;
                    aVar8 = aVar6;
                    c0Var4 = c0Var3;
                }
                return objE;
            }
            if (i16 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar4 = (t50.e) c0Var2.f141162h;
            t50.e eVar6 = (t50.e) c0Var2.f141161g;
            aVar7 = (er.a) c0Var2.f141160f;
            aVar8 = (er.a) c0Var2.f141159e;
            k10.c0<o22.b> c0Var6 = (k10.c0) c0Var2.f141158d;
            oq.u.b(objZa);
            c0Var4 = c0Var6;
            eVar5 = eVar6;
        }
        final t50.e eVar7 = (t50.e) objZa;
        final hz.b bVarUa = ua(c0Var4.a());
        it = v0.l(oq.y.a(d12.a.TITTLE, eVar5), oq.y.a(d12.a.CONTENT_TEXT, eVar4), oq.y.a(d12.a.CASE_SIGN, eVar7), oq.y.a(d12.a.ATTACHMENTS, bVarUa)).entrySet().iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Map.Entry) next).getValue() instanceof t50.e.Error));
        entry = (Map.Entry) next;
        if (entry == null) {
            aVar8.a();
        } else {
            aVar7.a();
        }
        final t50.e eVar8 = eVar4;
        return c0Var4.b(new er.l() { // from class: o22.r
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ya(c0Var4, bVarUa, entry, eVar5, eVar8, eVar7, (b) obj);
            }
        });
        t50.e eVar9 = (t50.e) objZa;
        String contentValue = c0Var3.a().getContentValue();
        boolean z17 = c0Var3.a().j().d().isEmpty() && z16;
        c0Var2.f141158d = c0Var3;
        c0Var2.f141159e = aVar3;
        c0Var2.f141160f = aVar4;
        c0Var2.f141161g = eVar9;
        c0Var2.f141163j = z16;
        c0Var2.f141166m = 2;
        Object objWa = wa(contentValue, z17, c0Var2);
        if (objWa != objE) {
            er.a<oq.i0> aVar9 = aVar4;
            eVar2 = eVar9;
            objZa = objWa;
            aVar5 = aVar9;
            aVar6 = aVar3;
            eVar3 = (t50.e) objZa;
            String caseSignValue2 = c0Var3.a().getCaseSignValue();
            c0Var2.f141158d = c0Var3;
            c0Var2.f141159e = aVar6;
            c0Var2.f141160f = aVar5;
            c0Var2.f141161g = eVar2;
            c0Var2.f141162h = eVar3;
            c0Var2.f141163j = z16;
            c0Var2.f141166m = 3;
            objVa = va(caseSignValue2, c0Var2);
            if (objVa != objE) {
                objZa = objVa;
                eVar4 = eVar3;
                eVar5 = eVar2;
                aVar7 = aVar5;
                aVar8 = aVar6;
                c0Var4 = c0Var3;
                final t50.e eVar10 = (t50.e) objZa;
                final hz.b bVarUa2 = ua(c0Var4.a());
                it = v0.l(oq.y.a(d12.a.TITTLE, eVar5), oq.y.a(d12.a.CONTENT_TEXT, eVar4), oq.y.a(d12.a.CASE_SIGN, eVar10), oq.y.a(d12.a.ATTACHMENTS, bVarUa2)).entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Map.Entry) next).getValue() instanceof t50.e.Error));
                entry = (Map.Entry) next;
                if (entry == null) {
                    aVar8.a();
                } else {
                    aVar7.a();
                }
                final t50.e eVar11 = eVar4;
                return c0Var4.b(new er.l() { // from class: o22.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.ya(c0Var4, bVarUa2, entry, eVar5, eVar11, eVar10, (b) obj);
                    }
                });
            }
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o22.b ya(k10.c0 c0Var, hz.b bVar, Map.Entry entry, t50.e eVar, t50.e eVar2, t50.e eVar3, o22.b bVar2) {
        return o22.b.b(bVar2, null, null, null, null, eVar, eVar2, eVar3, null, entry != null ? (d12.a) entry.getKey() : null, null, State.Field.b(((o22.b) c0Var.a()).j(), null, bVar, 1, null), 655, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object za(String str, boolean z15, tq.e<? super t50.e> eVar) throws Throwable {
        C3488d0 c3488d0;
        if (eVar instanceof C3488d0) {
            c3488d0 = (C3488d0) eVar;
            int i15 = c3488d0.f141174h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3488d0.f141174h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3488d0 = new C3488d0(eVar);
            }
        } else {
            c3488d0 = new C3488d0(eVar);
        }
        Object objQ = c3488d0.f141172f;
        Object objE = uq.b.e();
        int i16 = c3488d0.f141174h;
        if (i16 == 0) {
            oq.u.b(objQ);
            t02.g gVar = this.formValidationUseCase;
            t02.g.b.c cVar = new t02.g.b.c(str, z15);
            c3488d0.f141170d = vq.j.a(str);
            c3488d0.f141171e = z15;
            c3488d0.f141174h = 1;
            objQ = gVar.q(cVar, c3488d0);
            if (objQ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objQ);
        }
        return na((hz.g) objQ);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: V9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(o22.a.i iVar, tq.e<? super oq.i0> eVar) {
        return super.F(iVar, eVar);
    }

    @Override // zx.b
    public xw.b<o22.a.i> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<o22.b, o22.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<o22.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: qa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(EdorMessageSetupData edorMessageSetupData) {
        super.P5(edorMessageSetupData);
    }
}
