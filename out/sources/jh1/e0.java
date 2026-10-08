package jh1;

import fr0.DocumentConfig;
import iq0.FeatureFlag;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u009b\u0002\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\b\b\u0001\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ \u0010Q\u001a\u00020P2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0082@¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020T2\u0006\u0010S\u001a\u00020\u0002H\u0002¢\u0006\u0004\bU\u0010VJ\u0018\u0010Y\u001a\u00020P2\u0006\u0010X\u001a\u00020WH\u0082@¢\u0006\u0004\bY\u0010ZJ \u0010^\u001a\u00020P2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b^\u0010_J,\u0010e\u001a\u00020d2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020a0`H\u0082@¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020P2\u0006\u0010g\u001a\u00020HH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020PH\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020PH\u0016¢\u0006\u0004\bl\u0010kJ\u0017\u0010o\u001a\u00020P2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020P2\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ\u0018\u0010w\u001a\u00020P2\u0006\u0010v\u001a\u00020uH\u0096\u0001¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020PH\u0096\u0001¢\u0006\u0004\by\u0010kR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010|R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010\u008d\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bw\u0010\u009e\u0001R\u0016\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010º\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R3\u0010Á\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030»\u00018\u0014X\u0094\u0004¢\u0006\u0017\n\u0006\b¼\u0001\u0010½\u0001\u0012\u0005\bÀ\u0001\u0010k\u001a\u0006\b¾\u0001\u0010¿\u0001R&\u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020N0Â\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R,\u0010S\u001a\t\u0012\u0004\u0012\u00020T0È\u00018\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\bÉ\u0001\u0010Ê\u0001\u0012\u0005\bÍ\u0001\u0010k\u001a\u0006\bË\u0001\u0010Ì\u0001¨\u0006Î\u0001"}, d2 = {"Ljh1/e0;", "Ll00/g;", "Ljh1/v;", "Ljh1/t;", "Ljh1/w;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "globalSnackBarManager", "Lug1/c;", "getDocumentNavigationUseCase", "Lkh1/e;", "documentsListMapper", "Lvh1/j;", "updateDialogMapper", "Lmz3/g;", "cleanupDocumentDownloadDataUC", "Lmz3/o;", "getDocumentAsyncDownloadErrorUC", "Lch1/n0;", "retryAsyncDownloadAfterErrorUC", "Lzg1/d;", "documentDownloadErrorDialogMapper", "Lib4/c;", "domainErrorMapper", "Lzg1/e;", "localNotificationRedirectionMapper", "Lch1/l0;", "monitorDocumentsDashboardStatusesUC", "Lch1/n;", "getDashboardAddedDocumentsStatusesUC", "Lc21/a;", "isChatBotFeatureFlagActiveUseCase", "Lh64/d;", "getFeatureFlagListFlowUC", "Lg02/a;", "isElectronicDeliveryFeatureFlagActiveUseCase", "Lch1/t;", "getDocumentsLayoutTypeDataStoreUseCase", "Lch1/x;", "getDocumentsOrderUseCase", "Lq34/z;", "forceFetchDocumentSummaryDataUC", "Lr34/f;", "monitorDocumentsConfigsUseCase", "Lr34/d;", "getSavedDocumentsConfigsUC", "Lkh1/g;", "logoutDialogMapper", "Lch1/b;", "checkWasUpdateRecommendationDisplayedUseCase", "Lh64/p;", "isUpdateRecommendedUseCase", "Lug1/e;", "setUpdateRecommendationDisplayedUseCase", "La14/q;", "goToStoreIntentUseCase", "Lmx/c;", "labelProvider", "Lch1/a;", "checkFeatureTemporaryInterruptionUC", "Lyg1/c;", "notificationInteractor", "Lyg1/a;", "dashboardContainersInteractor", "Lpq3/b;", "isWhatsNewFeatureFlagActiveUseCase", "Lpq3/c;", "shouldDisplayWhatsNewUseCase", "Lch1/d0;", "getStudentCardExpirationAlertUC", "Ljh1/u;", "contract", "<init>", "(Lyy/a;Li70/e;Lug1/c;Lkh1/e;Lvh1/j;Lmz3/g;Lmz3/o;Lch1/n0;Lzg1/d;Lib4/c;Lzg1/e;Lch1/l0;Lch1/n;Lc21/a;Lh64/d;Lg02/a;Lch1/t;Lch1/x;Lq34/z;Lr34/f;Lr34/d;Lkh1/g;Lch1/b;Lh64/p;Lug1/e;La14/q;Lmx/c;Lch1/a;Lyg1/c;Lyg1/a;Lpq3/b;Lpq3/c;Lch1/d0;Ljh1/u;)V", "Liq0/v;", "featureType", "Ljh1/t$s;", "navigateAction", "Loq/i0;", "W9", "(Liq0/v;Ljh1/t$s;Ltq/e;)Ljava/lang/Object;", "state", "Ljh1/w$a;", "Q9", "(Ljh1/v;)Ljh1/w$a;", "Lrq0/b;", "documentType", "X9", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "error", "action", "U9", "(Ldx/b;Ljh1/t;Ltq/e;)Ljava/lang/Object;", "", "Lk34/g;", "currentDocuments", "newDocuments", "Lah1/i;", "S9", "(Ljava/util/List;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "data", "Z9", "(Ljh1/u;)V", "n", "()V", "d", "Lr54/c;", "localNotificationItem", "Y9", "(Lr54/c;)V", "Lgx/b;", "globalEvent", "T9", "(Lgx/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "c", "Lug1/c;", "Lkh1/e;", "e", "Lvh1/j;", "f", "Lmz3/g;", "g", "Lmz3/o;", "h", "Lch1/n0;", "j", "Lzg1/d;", "k", "Lib4/c;", "l", "Lzg1/e;", "m", "Lch1/l0;", "Lch1/n;", "p", "Lc21/a;", "q", "Lh64/d;", "r", "Lg02/a;", "s", "Lch1/t;", "t", "Lch1/x;", "v", "Lq34/z;", "w", "Lr34/f;", "x", "Lr34/d;", "Lkh1/g;", "z", "Lch1/b;", "A", "Lh64/p;", "B", "Lug1/e;", "C", "La14/q;", ip.a.f96138c, "Lmx/c;", "E", "Lch1/a;", "F", "Lyg1/c;", "G", "Lyg1/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lpq3/b;", "I", "Lpq3/c;", "K", "Lch1/d0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Ljh1/u;", "Ljh1/v$b;", "O", "Ljh1/v$b;", "initialState", "Lk10/t;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "R", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "T", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 extends l00.g<jh1.v, jh1.t> implements jh1.w, zx.d, i70.e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final h64.p isUpdateRecommendedUseCase;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final ug1.e setUpdateRecommendationDisplayedUseCase;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final a14.q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final ch1.a checkFeatureTemporaryInterruptionUC;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final yg1.c notificationInteractor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final pq3.b isWhatsNewFeatureFlagActiveUseCase;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final pq3.c shouldDisplayWhatsNewUseCase;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final ch1.d0 getStudentCardExpirationAlertUC;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final SetupData contract;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final jh1.v.Initial initialState;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final k10.t<jh1.v, jh1.t> stateMachine;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final xw.b<jh1.t.s> navAction;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final mu.p0<jh1.w.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i70.e f102651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ug1.c getDocumentNavigationUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kh1.e documentsListMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vh1.j updateDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mz3.g cleanupDocumentDownloadDataUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz3.o getDocumentAsyncDownloadErrorUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ch1.n0 retryAsyncDownloadAfterErrorUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final zg1.d documentDownloadErrorDialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final zg1.e localNotificationRedirectionMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ch1.l0 monitorDocumentsDashboardStatusesUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ch1.n getDashboardAddedDocumentsStatusesUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final c21.a isChatBotFeatureFlagActiveUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final h64.d getFeatureFlagListFlowUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final g02.a isElectronicDeliveryFeatureFlagActiveUseCase;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ch1.t getDocumentsLayoutTypeDataStoreUseCase;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ch1.x getDocumentsOrderUseCase;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final q34.z forceFetchDocumentSummaryDataUC;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final r34.f monitorDocumentsConfigsUseCase;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final r34.d getSavedDocumentsConfigsUC;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final kh1.g logoutDialogMapper;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final ch1.b checkWasUpdateRecommendationDisplayedUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f102673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f102675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102676g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102678j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f102676g = obj;
            this.f102678j |= PKIFailureInfo.systemUnavail;
            return e0.this.S9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$a;", "<unused var>", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<jh1.t.a, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102680f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b(initialized, null, null, null, false, false, false, false, null, false, null, null, null, 3839, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102680f;
            uq.b.e();
            if (this.f102679e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jh1.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.a0.O((v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.a aVar, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            a0 a0Var = new a0(eVar);
            a0Var.f102680f = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f102681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f102684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f102685h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102686j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f102687k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f102689m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f102687k = obj;
            this.f102689m |= PKIFailureInfo.systemUnavail;
            return e0.this.W9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$b;", "<unused var>", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<jh1.t.b, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102691f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102692a;

            static {
                int[] iArr = new int[lh1.a.values().length];
                try {
                    iArr[lh1.a.COLLAPSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lh1.a.EXPANDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f102692a = iArr;
            }
        }

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(jh1.v.Initialized initialized) {
            lh1.a aVar;
            int i15 = a.f102692a[initialized.getBigCardsState().ordinal()];
            if (i15 == 1) {
                aVar = lh1.a.EXPANDED;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                aVar = lh1.a.COLLAPSED;
            }
            return jh1.v.Initialized.b(initialized, null, null, null, false, false, false, false, null, false, aVar, null, null, 3583, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102691f;
            uq.b.e();
            if (this.f102690e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jh1.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.b0.O((v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.b bVar, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            b0 b0Var = new b0(eVar);
            b0Var.f102691f = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f102693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102696g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102698j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f102696g = obj;
            this.f102698j |= PKIFailureInfo.systemUnavail;
            return e0.this.X9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$f;", "<unused var>", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<jh1.t.f, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102700f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b(initialized, null, null, null, false, false, false, false, null, false, null, ah1.i.a.f6358a, null, 3071, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102700f;
            uq.b.e();
            if (this.f102699e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jh1.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.c0.O((v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.f fVar, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            c0 c0Var2 = new c0(eVar);
            c0Var2.f102700f = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<jh1.w.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f102701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f102702b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f102703a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f102704b;

            /* JADX INFO: renamed from: jh1.e0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2425a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f102705d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f102706e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f102707f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f102709h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f102710j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f102711k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f102712l;

                public C2425a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f102705d = obj;
                    this.f102706e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, e0 e0Var) {
                this.f102703a = hVar;
                this.f102704b = e0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2425a c2425a;
                if (eVar instanceof C2425a) {
                    c2425a = (C2425a) eVar;
                    int i15 = c2425a.f102706e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2425a.f102706e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2425a = new C2425a(eVar);
                    }
                } else {
                    c2425a = new C2425a(eVar);
                }
                Object obj2 = c2425a.f102705d;
                Object objE = uq.b.e();
                int i16 = c2425a.f102706e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f102703a;
                    jh1.w.a aVarQ9 = this.f102704b.Q9((jh1.v) obj);
                    c2425a.f102707f = vq.j.a(obj);
                    c2425a.f102709h = vq.j.a(c2425a);
                    c2425a.f102710j = vq.j.a(obj);
                    c2425a.f102711k = vq.j.a(hVar);
                    c2425a.f102712l = 0;
                    c2425a.f102706e = 1;
                    if (hVar.F(aVarQ9, c2425a) == objE) {
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

        public d(mu.g gVar, e0 e0Var) {
            this.f102701a = gVar;
            this.f102702b = e0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super jh1.w.a> hVar, tq.e eVar) {
            Object objA = this.f102701a.a(new a(hVar, this.f102702b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "hasUnreadNotifications", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<Boolean, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f102714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102715g;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(boolean z15, jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b(initialized, null, null, null, false, false, z15, false, null, false, null, null, null, 4063, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f102714f;
            k10.c0 c0Var = (k10.c0) this.f102715g;
            uq.b.e();
            if (this.f102713e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jh1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.d0.O(z15, (v.Initialized) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            d0 d0Var = new d0(eVar);
            d0Var.f102714f = z15;
            d0Var.f102715g = c0Var;
            return d0Var.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$t;", "<unused var>", "Ljh1/v;", "Loq/i0;", "<anonymous>", "(Ljh1/t$t;Ljh1/v;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<jh1.t.C2428t, jh1.v, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102716e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lah1/b;", "layoutType", "Loq/i0;", "<anonymous>", "(Lah1/b;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ah1.b, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f102718e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f102719f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e0 f102720g;

            /* JADX INFO: renamed from: jh1.e0$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lk34/g;", "documents", "Loq/i0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 2, 0})
            static final class C2426a extends vq.k implements er.p<List<? extends k34.g>, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f102721e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f102722f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ e0 f102723g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ ah1.b f102724h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2426a(e0 e0Var, ah1.b bVar, tq.e<? super C2426a> eVar) {
                    super(2, eVar);
                    this.f102723g = e0Var;
                    this.f102724h = bVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    List list = (List) this.f102722f;
                    uq.b.e();
                    if (this.f102721e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    this.f102723g.d9(new jh1.t.SetupData(list, this.f102724h));
                    return oq.i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(List<? extends k34.g> list, tq.e<? super oq.i0> eVar) {
                    return ((C2426a) v(list, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    C2426a c2426a = new C2426a(this.f102723g, this.f102724h, eVar);
                    c2426a.f102722f = obj;
                    return c2426a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f102720g = e0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                ah1.b bVar = (ah1.b) this.f102719f;
                Object objE = uq.b.e();
                int i15 = this.f102718e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    mu.g<List<k34.g>> gVarH = this.f102720g.getDocumentsOrderUseCase.h(gz.b.a.C1792a.f78542a);
                    C2426a c2426a = new C2426a(this.f102720g, bVar, null);
                    this.f102719f = vq.j.a(bVar);
                    this.f102718e = 1;
                    if (mu.i.j(gVarH, c2426a, this) == objE) {
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
            public final Object B(ah1.b bVar, tq.e<? super oq.i0> eVar) {
                return ((a) v(bVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f102720g, eVar);
                aVar.f102719f = obj;
                return aVar;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102716e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVar = (mu.g) e0.this.getDocumentsLayoutTypeDataStoreUseCase.a(gz.b.a.C1792a.f78542a);
                a aVar = new a(e0.this, null);
                this.f102716e = 1;
                if (mu.i.j(gVar, aVar, this) == objE) {
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
        public final Object w(jh1.t.C2428t c2428t, jh1.v vVar, tq.e<? super oq.i0> eVar) {
            return e0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: jh1.e0$e0, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljh1/v$c;", "state", "Loq/i0;", "<anonymous>", "(Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2427e0 extends vq.k implements er.p<jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102726f;

        C2427e0(tq.e<? super C2427e0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jh1.v.Initialized initialized = (jh1.v.Initialized) this.f102726f;
            uq.b.e();
            if (this.f102725e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(jh1.t.e.f102934a);
            e0.this.d9(jh1.t.p.f102946a);
            if (initialized.getPendingLocalNotificationAction() == null) {
                e0.this.d9(jh1.t.d.f102933a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return ((C2427e0) v(initialized, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            C2427e0 c2427e0 = e0.this.new C2427e0(eVar);
            c2427e0.f102726f = obj;
            return c2427e0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh1/t$o;", "action", "Ljh1/v;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh1/t$o;Ljh1/v;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<jh1.t.HandelAppMenuItem, jh1.v, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102729f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102731a;

            static {
                int[] iArr = new int[ah1.a.EnumC0131a.values().length];
                try {
                    iArr[ah1.a.EnumC0131a.EDOR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ah1.a.EnumC0131a.NOTIFICATIONS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f102731a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r6.F(r2, r5) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (r6.F(r2, r5) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f102729f
                jh1.t$o r0 = (jh1.t.HandelAppMenuItem) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f102728e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L12
                if (r2 != r3) goto L16
            L12:
                oq.u.b(r6)
                goto L5d
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                ah1.a$a r6 = r0.getAppMenuItem()
                int[] r2 = jh1.e0.f.a.f102731a
                int r6 = r6.ordinal()
                r6 = r2[r6]
                if (r6 == r4) goto L4a
                if (r6 != r3) goto L44
                jh1.e0 r6 = jh1.e0.this
                jh1.t$s$k r2 = jh1.t.s.k.f102959a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f102729f = r0
                r5.f102728e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L5d
                goto L5c
            L44:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L4a:
                jh1.e0 r6 = jh1.e0.this
                jh1.t$s$j r2 = jh1.t.s.j.f102958a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f102729f = r0
                r5.f102728e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L5d
            L5c:
                return r1
            L5d:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.e0.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.HandelAppMenuItem handelAppMenuItem, jh1.v vVar, tq.e<? super oq.i0> eVar) {
            f fVar = e0.this.new f(eVar);
            fVar.f102729f = handelAppMenuItem;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$t;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$t;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<jh1.t.C2428t, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102732e;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f102732e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(jh1.t.d.f102933a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.C2428t c2428t, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new f0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$w;", "action", "Lk10/c0;", "Ljh1/v$b;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<jh1.t.SetupData, k10.c0<jh1.v.Initial>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f102736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f102737h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f102738j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f102739k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f102740l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f102741m;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v O(jh1.t.SetupData setupData, k10.c0 c0Var, Map map, boolean z15, boolean z16, boolean z17, Map map2, ah1.i iVar, jh1.v.Initial initial) {
            if (setupData.a().isEmpty()) {
                return new jh1.v.Empty(((jh1.v.Initial) c0Var.a()).getPendingLocalNotificationAction());
            }
            return new jh1.v.Initialized(setupData.a(), setupData.getLayoutType(), map, z15, z16, z17, false, map2, setupData.getLayoutType() == ah1.b.BigCards, lh1.a.COLLAPSED, iVar, ((jh1.v.Initial) c0Var.a()).getPendingLocalNotificationAction());
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:33:0x0104  */
        /* JADX WARN: Code duplicated, block: B:36:0x0125 A[LOOP:0: B:34:0x011f->B:36:0x0125, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:38:0x0136  */
        /* JADX WARN: Code duplicated, block: B:42:0x0159  */
        /* JADX WARN: Code duplicated, block: B:45:0x0165  */
        /* JADX WARN: Code duplicated, block: B:46:0x0170  */
        /* JADX WARN: Code duplicated, block: B:48:0x0174  */
        /* JADX WARN: Code duplicated, block: B:51:0x0187  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            boolean zBooleanValue;
            boolean z15;
            boolean z16;
            Map map;
            Object objC;
            Map map2;
            boolean z17;
            boolean z18;
            List list;
            Map mapI;
            Object objC2;
            final Map map3;
            final Map map4;
            final boolean z19;
            final boolean z25;
            final boolean z26;
            LinkedHashMap linkedHashMap;
            dx.i iVar;
            Object objB2;
            final jh1.t.SetupData setupData = (jh1.t.SetupData) this.f102740l;
            final k10.c0 c0Var = (k10.c0) this.f102741m;
            Object objE = uq.b.e();
            int i15 = this.f102739k;
            if (i15 == 0) {
                oq.u.b(obj);
                yg1.c cVar = e0.this.notificationInteractor;
                this.f102740l = setupData;
                this.f102741m = c0Var;
                this.f102739k = 1;
                obj = cVar.c(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    z16 = this.f102738j;
                    z15 = this.f102737h;
                    zBooleanValue = this.f102736g;
                    oq.u.b(obj);
                    map = (Map) obj;
                    r34.d dVar = e0.this.getSavedDocumentsConfigsUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f102740l = setupData;
                    this.f102741m = c0Var;
                    this.f102734e = map;
                    this.f102736g = zBooleanValue;
                    this.f102737h = z15;
                    this.f102738j = z16;
                    this.f102739k = 3;
                    objC = dVar.c(c1792a, this);
                    if (objC != objE) {
                        boolean z27 = zBooleanValue;
                        map2 = map;
                        obj = objC;
                        z17 = z15;
                        z18 = z27;
                        list = (List) ((dx.i) obj).a();
                        if (list != null) {
                            List list2 = list;
                            linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(list2, 10)), 16));
                            for (Object obj2 : list2) {
                                linkedHashMap.put(((DocumentConfig) obj2).getType(), obj2);
                            }
                            mapI = linkedHashMap;
                        } else {
                            mapI = pq.v0.i();
                        }
                        ch1.d0 d0Var = e0.this.getStudentCardExpirationAlertUC;
                        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                        this.f102740l = setupData;
                        this.f102741m = c0Var;
                        this.f102734e = map2;
                        this.f102735f = mapI;
                        this.f102736g = z18;
                        this.f102737h = z17;
                        this.f102738j = z16;
                        this.f102739k = 4;
                        objC2 = d0Var.c(c1792a2, this);
                        if (objC2 != objE) {
                            map3 = mapI;
                            obj = objC2;
                            map4 = map2;
                            z19 = z18;
                            z25 = z17;
                            z26 = z16;
                        }
                    }
                    return objE;
                }
                if (i15 == 3) {
                    z16 = this.f102738j;
                    z17 = this.f102737h;
                    z18 = this.f102736g;
                    map2 = (Map) this.f102734e;
                    oq.u.b(obj);
                    list = (List) ((dx.i) obj).a();
                    if (list != null) {
                        List list3 = list;
                        linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(list3, 10)), 16));
                        while (r13.hasNext()) {
                            linkedHashMap.put(((DocumentConfig) obj2).getType(), obj2);
                        }
                        mapI = linkedHashMap;
                    } else {
                        mapI = pq.v0.i();
                    }
                    ch1.d0 d0Var2 = e0.this.getStudentCardExpirationAlertUC;
                    gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                    this.f102740l = setupData;
                    this.f102741m = c0Var;
                    this.f102734e = map2;
                    this.f102735f = mapI;
                    this.f102736g = z18;
                    this.f102737h = z17;
                    this.f102738j = z16;
                    this.f102739k = 4;
                    objC2 = d0Var2.c(c1792a3, this);
                    if (objC2 != objE) {
                        map3 = mapI;
                        obj = objC2;
                        map4 = map2;
                        z19 = z18;
                        z25 = z17;
                        z26 = z16;
                    }
                    return objE;
                }
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z28 = this.f102738j;
                boolean z29 = this.f102737h;
                boolean z35 = this.f102736g;
                Map map5 = (Map) this.f102735f;
                Map map6 = (Map) this.f102734e;
                oq.u.b(obj);
                z19 = z35;
                map3 = map5;
                map4 = map6;
                z26 = z28;
                z25 = z29;
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                objB2 = ah1.i.a.f6358a;
            } else {
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                objB2 = ((dx.i.Right) iVar).b();
            }
            final ah1.i iVar2 = (ah1.i) objB2;
            return c0Var.d(new er.l() { // from class: jh1.f0
                @Override // er.l
                public final Object b(Object obj3) {
                    return e0.g.O(setupData, c0Var, map4, z26, z25, z19, map3, iVar2, (v.Initial) obj3);
                }
            });
            dx.i iVar3 = (dx.i) obj;
            if (iVar3 instanceof dx.i.Left) {
                objB = vq.b.a(false);
            } else {
                if (!(iVar3 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVar3).b();
            }
            zBooleanValue = ((Boolean) objB).booleanValue();
            g02.a aVar = e0.this.isElectronicDeliveryFeatureFlagActiveUseCase;
            gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
            boolean zBooleanValue2 = aVar.a(c1792a4).booleanValue();
            boolean zBooleanValue3 = e0.this.isChatBotFeatureFlagActiveUseCase.a(c1792a4).booleanValue();
            ch1.n nVar = e0.this.getDashboardAddedDocumentsStatusesUC;
            this.f102740l = setupData;
            this.f102741m = c0Var;
            this.f102736g = zBooleanValue;
            this.f102737h = zBooleanValue2;
            this.f102738j = zBooleanValue3;
            this.f102739k = 2;
            Object objC3 = nVar.c(c1792a4, this);
            if (objC3 != objE) {
                z15 = zBooleanValue2;
                obj = objC3;
                z16 = zBooleanValue3;
                map = (Map) obj;
                r34.d dVar2 = e0.this.getSavedDocumentsConfigsUC;
                gz.b.a.C1792a c1792a5 = gz.b.a.C1792a.f78542a;
                this.f102740l = setupData;
                this.f102741m = c0Var;
                this.f102734e = map;
                this.f102736g = zBooleanValue;
                this.f102737h = z15;
                this.f102738j = z16;
                this.f102739k = 3;
                objC = dVar2.c(c1792a5, this);
                if (objC != objE) {
                    boolean z210 = zBooleanValue;
                    map2 = map;
                    obj = objC;
                    z17 = z15;
                    z18 = z210;
                    list = (List) ((dx.i) obj).a();
                    if (list != null) {
                        List list4 = list;
                        linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(list4, 10)), 16));
                        while (r13.hasNext()) {
                            linkedHashMap.put(((DocumentConfig) obj2).getType(), obj2);
                        }
                        mapI = linkedHashMap;
                    } else {
                        mapI = pq.v0.i();
                    }
                    ch1.d0 d0Var3 = e0.this.getStudentCardExpirationAlertUC;
                    gz.b.a.C1792a c1792a6 = gz.b.a.C1792a.f78542a;
                    this.f102740l = setupData;
                    this.f102741m = c0Var;
                    this.f102734e = map2;
                    this.f102735f = mapI;
                    this.f102736g = z18;
                    this.f102737h = z17;
                    this.f102738j = z16;
                    this.f102739k = 4;
                    objC2 = d0Var3.c(c1792a6, this);
                    if (objC2 != objE) {
                        map3 = mapI;
                        obj = objC2;
                        map4 = map2;
                        z19 = z18;
                        z25 = z17;
                        z26 = z16;
                        iVar = (dx.i) obj;
                        if (iVar instanceof dx.i.Left) {
                            objB2 = ah1.i.a.f6358a;
                        } else {
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB2 = ((dx.i.Right) iVar).b();
                        }
                        final ah1.i iVar4 = (ah1.i) objB2;
                        return c0Var.d(new er.l() { // from class: jh1.f0
                            @Override // er.l
                            public final Object b(Object obj3) {
                                return e0.g.O(setupData, c0Var, map4, z26, z25, z19, map3, iVar4, (v.Initial) obj3);
                            }
                        });
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.SetupData setupData, k10.c0<jh1.v.Initial> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            g gVar = e0.this.new g(eVar);
            gVar.f102740l = setupData;
            gVar.f102741m = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$p;", "<unused var>", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.q<jh1.t.p, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102743e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102744f;

        g0(tq.e<? super g0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b(initialized, null, null, null, false, false, false, false, null, false, null, null, null, 2047, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102744f;
            uq.b.e();
            if (this.f102743e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            jh1.t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction = ((jh1.v.Initialized) c0Var.a()).getPendingLocalNotificationAction();
            if (pendingLocalNotificationAction != null) {
                e0.this.d9(pendingLocalNotificationAction);
            }
            return c0Var.b(new er.l() { // from class: jh1.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.g0.O((v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.p pVar, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            g0 g0Var = e0.this.new g0(eVar);
            g0Var.f102744f = c0Var;
            return g0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$v;", "action", "Lk10/c0;", "Ljh1/v$b;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<jh1.t.RedirectToDocumentFromLocalNotification, k10.c0<jh1.v.Initial>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102748g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initial O(jh1.t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification, jh1.v.Initial initial) {
            return initial.a(redirectToDocumentFromLocalNotification);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jh1.t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification = (jh1.t.RedirectToDocumentFromLocalNotification) this.f102747f;
            k10.c0 c0Var = (k10.c0) this.f102748g;
            uq.b.e();
            if (this.f102746e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jh1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.h.O(redirectToDocumentFromLocalNotification, (v.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification, k10.c0<jh1.v.Initial> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            h hVar = new h(eVar);
            hVar.f102747f = redirectToDocumentFromLocalNotification;
            hVar.f102748g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$e;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$e;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<jh1.t.e, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f102749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f102750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f102751g;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r4.c(r5, r6) == r0) goto L18;
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
                int r1 = r6.f102751g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L66
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L32
            L1e:
                oq.u.b(r7)
                jh1.e0 r7 = jh1.e0.this
                ch1.b r7 = jh1.e0.p9(r7)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r6.f102751g = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L32
                goto L65
            L32:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                jh1.e0 r1 = jh1.e0.this
                h64.p r1 = jh1.e0.L9(r1)
                gz.b$a$a r4 = gz.b.a.C1792a.f78542a
                java.lang.Object r1 = r1.a(r4)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L6d
                if (r7 != 0) goto L6d
                jh1.e0 r4 = jh1.e0.this
                ug1.e r4 = jh1.e0.E9(r4)
                ug1.e$a r5 = new ug1.e$a
                r5.<init>(r3)
                r6.f102749e = r7
                r6.f102750f = r1
                r6.f102751g = r2
                java.lang.Object r7 = r4.c(r5, r6)
                if (r7 != r0) goto L66
            L65:
                return r0
            L66:
                jh1.e0 r7 = jh1.e0.this
                jh1.t$y r0 = jh1.t.y.f102967a
                jh1.e0.o9(r7, r0)
            L6d:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.e0.h0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.e eVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar2) {
            return e0.this.new h0(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$c;", "action", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<jh1.t.ChangedDocumentConfig, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102755g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(jh1.t.ChangedDocumentConfig changedDocumentConfig, jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b(initialized, null, null, null, false, false, false, false, changedDocumentConfig.a(), false, null, null, null, 3967, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jh1.t.ChangedDocumentConfig changedDocumentConfig = (jh1.t.ChangedDocumentConfig) this.f102754f;
            k10.c0 c0Var = (k10.c0) this.f102755g;
            uq.b.e();
            if (this.f102753e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(((jh1.v.Initialized) c0Var.a()).e(), changedDocumentConfig.a()) ? c0Var.c() : c0Var.b(new er.l() { // from class: jh1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.i.O(changedDocumentConfig, (v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.ChangedDocumentConfig changedDocumentConfig, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            i iVar = new i(eVar);
            iVar.f102754f = changedDocumentConfig;
            iVar.f102755g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$d;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$d;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<jh1.t.d, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f102756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f102757f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f102758g;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r3.F(r4, r6) == r0) goto L19;
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
                int r1 = r6.f102758g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L64
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                boolean r1 = r6.f102756e
                oq.u.b(r7)
                goto L49
            L20:
                oq.u.b(r7)
                jh1.e0 r7 = jh1.e0.this
                pq3.b r7 = jh1.e0.M9(r7)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                java.lang.Object r7 = r7.a(r1)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                jh1.e0 r4 = jh1.e0.this
                pq3.c r4 = jh1.e0.F9(r4)
                r6.f102756e = r7
                r6.f102758g = r3
                java.lang.Object r1 = r4.c(r1, r6)
                if (r1 != r0) goto L46
                goto L63
            L46:
                r5 = r1
                r1 = r7
                r7 = r5
            L49:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r1 == 0) goto L64
                if (r7 == 0) goto L64
                jh1.e0 r3 = jh1.e0.this
                jh1.t$s$e r4 = jh1.t.s.e.f102953a
                r6.f102756e = r1
                r6.f102757f = r7
                r6.f102758g = r2
                java.lang.Object r7 = r3.F(r4, r6)
                if (r7 != r0) goto L64
            L63:
                return r0
            L64:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.e0.i0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.d dVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new i0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$w;", "action", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<jh1.t.SetupData, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102762g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Empty V(k10.c0 c0Var, jh1.v.Initialized initialized) {
            return new jh1.v.Empty(((jh1.v.Initialized) c0Var.a()).getPendingLocalNotificationAction());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized X(jh1.t.SetupData setupData, k10.c0 c0Var, ah1.i iVar, jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b(initialized, setupData.a(), setupData.getLayoutType(), null, false, false, false, (fr.t.c(((jh1.v.Initialized) c0Var.a()).d(), setupData.a()) && ((jh1.v.Initialized) c0Var.a()).getDocumentsLayoutType() == setupData.getLayoutType()) ? false : true, null, false, null, iVar, null, 3004, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jh1.t.SetupData setupData = (jh1.t.SetupData) this.f102761f;
            final k10.c0 c0Var = (k10.c0) this.f102762g;
            Object objE = uq.b.e();
            int i15 = this.f102760e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (setupData.a().isEmpty()) {
                    return c0Var.d(new er.l() { // from class: jh1.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return e0.j.V(c0Var, (v.Initialized) obj2);
                        }
                    });
                }
                e0 e0Var = e0.this;
                List<k34.g> listD = ((jh1.v.Initialized) c0Var.a()).d();
                List<k34.g> listA = setupData.a();
                this.f102761f = setupData;
                this.f102762g = c0Var;
                this.f102760e = 1;
                obj = e0Var.S9(listD, listA, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final ah1.i iVar = (ah1.i) obj;
            return c0Var.b(new er.l() { // from class: jh1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.j.X(setupData, c0Var, iVar, (v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.SetupData setupData, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            j jVar = e0.this.new j(eVar);
            jVar.f102761f = setupData;
            jVar.f102762g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$y;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$y;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.q<jh1.t.y, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102764e;

        j0(tq.e<? super j0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(e0 e0Var) {
            e0Var.d9(jh1.t.u.f102961a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102764e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                vh1.j jVar = e0.this.updateDialogMapper;
                final e0 e0Var2 = e0.this;
                jh1.t.s.ShowDialog showDialog = new jh1.t.s.ShowDialog(jVar.b(new vh1.j.Params(new er.a() { // from class: jh1.t0
                    @Override // er.a
                    public final Object a() {
                        return e0.j0.O(e0Var2);
                    }
                })));
                this.f102764e = 1;
                if (e0Var.F(showDialog, this) == objE) {
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
        public final Object w(jh1.t.y yVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new j0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Liq0/u;", "<unused var>", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljava/util/List;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<List<? extends FeatureFlag>, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102767f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(e0 e0Var, jh1.v.Initialized initialized) {
            c21.a aVar = e0Var.isChatBotFeatureFlagActiveUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            return jh1.v.Initialized.b(initialized, null, null, null, aVar.a(c1792a).booleanValue(), e0Var.isElectronicDeliveryFeatureFlagActiveUseCase.a(c1792a).booleanValue(), false, false, null, false, null, null, null, 4071, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f102767f;
            uq.b.e();
            if (this.f102766e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final e0 e0Var = e0.this;
            return c0Var.b(new er.l() { // from class: jh1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.k.O(e0Var, (v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(List<FeatureFlag> list, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            k kVar = e0.this.new k(eVar);
            kVar.f102767f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$u;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$u;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.q<jh1.t.u, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f102771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f102772h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102773j;

        k0(tq.e<? super k0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            if (r1.U9(r3, r4, r5) == r0) goto L17;
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
                int r1 = r5.f102773j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f102770f
                dx.b$c r0 = (dx.b.Business) r0
                java.lang.Object r0 = r5.f102769e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L77
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L3e
            L26:
                oq.u.b(r6)
                jh1.e0 r6 = jh1.e0.this
                a14.q r6 = jh1.e0.z9(r6)
                a14.q$a r1 = new a14.q$a
                r4 = 0
                r1.<init>(r4)
                r5.f102773j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L3e
                goto L6a
            L3e:
                dx.i r6 = (dx.i) r6
                jh1.e0 r1 = jh1.e0.this
                boolean r3 = r6 instanceof dx.i.Left
                if (r3 == 0) goto L6b
                r3 = r6
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b$c r3 = (dx.b.Business) r3
                jh1.t$u r4 = jh1.t.u.f102961a
                java.lang.Object r6 = vq.j.a(r6)
                r5.f102769e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f102770f = r6
                r6 = 0
                r5.f102771g = r6
                r5.f102772h = r6
                r5.f102773j = r2
                java.lang.Object r6 = jh1.e0.I9(r1, r3, r4, r5)
                if (r6 != r0) goto L77
            L6a:
                return r0
            L6b:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L7a
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                oq.i0 r6 = (oq.i0) r6
            L77:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L7a:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.e0.k0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.u uVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new k0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Loq/r;", "Lrq0/b;", "Llz3/h;", "value", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Loq/r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<oq.r<? extends rq0.b, ? extends lz3.h>, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102777g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102779a = new int[lz3.h.values().length];
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized V(k10.c0 c0Var, ah1.i iVar, jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b((jh1.v.Initialized) c0Var.a(), null, null, null, false, false, false, false, null, false, null, iVar, null, 3071, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized X(k10.c0 c0Var, ah1.i iVar, oq.r rVar, lz3.h hVar, jh1.v.Initialized initialized) {
            jh1.v.Initialized initialized2 = (jh1.v.Initialized) c0Var.a();
            Map mapW = pq.v0.w(initialized.g());
            mapW.put(rVar.c(), hVar);
            oq.i0 i0Var = oq.i0.f148189a;
            return jh1.v.Initialized.b(initialized2, null, null, mapW, false, false, false, false, null, false, null, iVar, null, 3067, null);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0070  */
        /* JADX WARN: Code duplicated, block: B:28:0x007a  */
        /* JADX WARN: Code duplicated, block: B:30:0x008b  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ah1.i iVar;
            final lz3.h hVar;
            int i15;
            Object objB;
            final oq.r rVar = (oq.r) this.f102776f;
            final k10.c0 c0Var = (k10.c0) this.f102777g;
            Object objE = uq.b.e();
            int i16 = this.f102775e;
            if (i16 == 0) {
                oq.u.b(obj);
                if (rVar.c() == rq0.b.d.STUDENT_CARD) {
                    ch1.d0 d0Var = e0.this.getStudentCardExpirationAlertUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f102776f = rVar;
                    this.f102777g = c0Var;
                    this.f102775e = 1;
                    obj = d0Var.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    iVar = ah1.i.a.f6358a;
                }
                hVar = (lz3.h) rVar.d();
                if (hVar == null) {
                    i15 = -1;
                } else {
                    i15 = a.f102779a[hVar.ordinal()];
                }
                if (i15 == -1) {
                    return c0Var.b(new er.l() { // from class: jh1.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return e0.l.X(c0Var, iVar, rVar, hVar, (v.Initialized) obj2);
                        }
                    });
                }
                e0.this.d9(jh1.t.q.f102947a);
                return c0Var.b(new er.l() { // from class: jh1.l0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.l.V(c0Var, iVar, (v.Initialized) obj2);
                    }
                });
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i iVar2 = (dx.i) obj;
            if (iVar2 instanceof dx.i.Left) {
                objB = ah1.i.a.f6358a;
            } else {
                if (!(iVar2 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVar2).b();
            }
            iVar = (ah1.i) objB;
            hVar = (lz3.h) rVar.d();
            if (hVar == null) {
                i15 = -1;
            } else {
                i15 = a.f102779a[hVar.ordinal()];
            }
            if (i15 == -1) {
                return c0Var.b(new er.l() { // from class: jh1.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.l.X(c0Var, iVar, rVar, hVar, (v.Initialized) obj2);
                    }
                });
            }
            e0.this.d9(jh1.t.q.f102947a);
            return c0Var.b(new er.l() { // from class: jh1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.l.V(c0Var, iVar, (v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(oq.r<? extends rq0.b, ? extends lz3.h> rVar, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            l lVar = e0.this.new l(eVar);
            lVar.f102776f = rVar;
            lVar.f102777g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$v;", "action", "Lk10/c0;", "Ljh1/v$a;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.q<jh1.t.RedirectToDocumentFromLocalNotification, k10.c0<jh1.v.Empty>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102782g;

        l0(tq.e<? super l0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Empty O(jh1.t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification, jh1.v.Empty empty) {
            return empty.a(redirectToDocumentFromLocalNotification);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jh1.t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification = (jh1.t.RedirectToDocumentFromLocalNotification) this.f102781f;
            k10.c0 c0Var = (k10.c0) this.f102782g;
            uq.b.e();
            if (this.f102780e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jh1.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.l0.O(redirectToDocumentFromLocalNotification, (v.Empty) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification, k10.c0<jh1.v.Empty> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            l0 l0Var = new l0(eVar);
            l0Var.f102781f = redirectToDocumentFromLocalNotification;
            l0Var.f102782g = c0Var;
            return l0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$q;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$q;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<jh1.t.q, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102783e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lk34/g;", "documents", "Loq/i0;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<List<? extends k34.g>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f102785e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f102786f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ e0 f102787g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f102787g = e0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                List list = (List) this.f102786f;
                uq.b.e();
                if (this.f102785e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f102787g.d9(new jh1.t.SetupDocuments(list));
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(List<? extends k34.g> list, tq.e<? super oq.i0> eVar) {
                return ((a) v(list, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f102787g, eVar);
                aVar.f102786f = obj;
                return aVar;
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102783e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g<List<k34.g>> gVarH = e0.this.getDocumentsOrderUseCase.h(gz.b.a.C1792a.f78542a);
                a aVar = new a(e0.this, null);
                this.f102783e = 1;
                if (mu.i.j(gVarH, aVar, this) == objE) {
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
        public final Object w(jh1.t.q qVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$h;", "<unused var>", "Ljh1/v$a;", "Loq/i0;", "<anonymous>", "(Ljh1/t$h;Ljh1/v$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.q<jh1.t.h, jh1.v.Empty, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102788e;

        m0(tq.e<? super m0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102788e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                jh1.t.s.g gVar = jh1.t.s.g.f102955a;
                this.f102788e = 1;
                if (e0Var.F(gVar, this) == objE) {
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
        public final Object w(jh1.t.h hVar, jh1.v.Empty empty, tq.e<? super oq.i0> eVar) {
            return e0.this.new m0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$x;", "action", "Lk10/c0;", "Ljh1/v$c;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<jh1.t.SetupDocuments, k10.c0<jh1.v.Initialized>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102791f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f102792g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(jh1.t.SetupDocuments setupDocuments, jh1.v.Initialized initialized) {
            return jh1.v.Initialized.b(initialized, setupDocuments.a(), null, null, false, false, false, false, null, false, null, null, null, 4094, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jh1.t.SetupDocuments setupDocuments = (jh1.t.SetupDocuments) this.f102791f;
            k10.c0 c0Var = (k10.c0) this.f102792g;
            uq.b.e();
            if (this.f102790e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jh1.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.n.O(setupDocuments, (v.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.SetupDocuments setupDocuments, k10.c0<jh1.v.Initialized> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            n nVar = new n(eVar);
            nVar.f102791f = setupDocuments;
            nVar.f102792g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljh1/t$w;", "action", "Lk10/c0;", "Ljh1/v$a;", "state", "Lk10/l;", "Ljh1/v;", "<anonymous>", "(Ljh1/t$w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n0 extends vq.k implements er.q<jh1.t.SetupData, k10.c0<jh1.v.Empty>, tq.e<? super k10.l<? extends jh1.v>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f102794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f102795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f102796h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f102798k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f102799l;

        n0(tq.e<? super n0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jh1.v.Initialized O(jh1.t.SetupData setupData, k10.c0 c0Var, Map map, boolean z15, boolean z16, boolean z17, ah1.i iVar, jh1.v.Empty empty) {
            return new jh1.v.Initialized(setupData.a(), setupData.getLayoutType(), map, z15, z16, z17, false, pq.v0.i(), setupData.getLayoutType() == ah1.b.BigCards, lh1.a.COLLAPSED, iVar, ((jh1.v.Empty) c0Var.a()).getPendingLocalNotificationAction());
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00de  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:37:0x010c  */
        /* JADX WARN: Code duplicated, block: B:39:0x0111  */
        /* JADX WARN: Code duplicated, block: B:41:0x011b  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            boolean z15;
            boolean z16;
            boolean z17;
            Map map;
            Object objC;
            final Map map2;
            final boolean z18;
            final boolean z19;
            final boolean z25;
            dx.i iVar;
            Object objB2;
            final jh1.t.SetupData setupData = (jh1.t.SetupData) this.f102798k;
            final k10.c0 c0Var = (k10.c0) this.f102799l;
            Object objE = uq.b.e();
            int i15 = this.f102797j;
            if (i15 == 0) {
                oq.u.b(obj);
                yg1.c cVar = e0.this.notificationInteractor;
                this.f102798k = setupData;
                this.f102799l = c0Var;
                this.f102797j = 1;
                obj = cVar.c(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    z17 = this.f102796h;
                    z16 = this.f102795g;
                    z15 = this.f102794f;
                    oq.u.b(obj);
                    map = (Map) obj;
                    ch1.d0 d0Var = e0.this.getStudentCardExpirationAlertUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f102798k = setupData;
                    this.f102799l = c0Var;
                    this.f102793e = map;
                    this.f102794f = z15;
                    this.f102795g = z16;
                    this.f102796h = z17;
                    this.f102797j = 3;
                    objC = d0Var.c(c1792a, this);
                    if (objC != objE) {
                        map2 = map;
                        obj = objC;
                        z18 = z15;
                        z19 = z16;
                        z25 = z17;
                    }
                    return objE;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z26 = this.f102796h;
                boolean z27 = this.f102795g;
                boolean z28 = this.f102794f;
                Map map3 = (Map) this.f102793e;
                oq.u.b(obj);
                z19 = z27;
                z18 = z28;
                map2 = map3;
                z25 = z26;
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                objB2 = ah1.i.a.f6358a;
            } else {
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                objB2 = ((dx.i.Right) iVar).b();
            }
            final ah1.i iVar2 = (ah1.i) objB2;
            return setupData.a().isEmpty() ? c0Var.c() : c0Var.d(new er.l() { // from class: jh1.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.n0.O(setupData, c0Var, map2, z25, z19, z18, iVar2, (v.Empty) obj2);
                }
            });
            dx.i iVar3 = (dx.i) obj;
            if (iVar3 instanceof dx.i.Left) {
                objB = vq.b.a(false);
            } else {
                if (!(iVar3 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVar3).b();
            }
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            g02.a aVar = e0.this.isElectronicDeliveryFeatureFlagActiveUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            boolean zBooleanValue2 = aVar.a(c1792a2).booleanValue();
            boolean zBooleanValue3 = e0.this.isChatBotFeatureFlagActiveUseCase.a(c1792a2).booleanValue();
            ch1.n nVar = e0.this.getDashboardAddedDocumentsStatusesUC;
            this.f102798k = setupData;
            this.f102799l = c0Var;
            this.f102794f = zBooleanValue;
            this.f102795g = zBooleanValue2;
            this.f102796h = zBooleanValue3;
            this.f102797j = 2;
            Object objC2 = nVar.c(c1792a2, this);
            if (objC2 != objE) {
                z15 = zBooleanValue;
                obj = objC2;
                z16 = zBooleanValue2;
                z17 = zBooleanValue3;
                map = (Map) obj;
                ch1.d0 d0Var2 = e0.this.getStudentCardExpirationAlertUC;
                gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                this.f102798k = setupData;
                this.f102799l = c0Var;
                this.f102793e = map;
                this.f102794f = z15;
                this.f102795g = z16;
                this.f102796h = z17;
                this.f102797j = 3;
                objC = d0Var2.c(c1792a3, this);
                if (objC != objE) {
                    map2 = map;
                    obj = objC;
                    z18 = z15;
                    z19 = z16;
                    z25 = z17;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        objB2 = ah1.i.a.f6358a;
                    } else {
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB2 = ((dx.i.Right) iVar).b();
                    }
                    final ah1.i iVar4 = (ah1.i) objB2;
                    if (setupData.a().isEmpty()) {
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.SetupData setupData, k10.c0<jh1.v.Empty> c0Var, tq.e<? super k10.l<? extends jh1.v>> eVar) {
            n0 n0Var = e0.this.new n0(eVar);
            n0Var.f102798k = setupData;
            n0Var.f102799l = c0Var;
            return n0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh1/t$v;", "event", "Ljh1/v$c;", "state", "Loq/i0;", "<anonymous>", "(Ljh1/t$v;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<jh1.t.RedirectToDocumentFromLocalNotification, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f102803g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f102804h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102805j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f102806k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f102807l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f102808m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f102809n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f102810p;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102812a;

            static {
                int[] iArr = new int[lz3.h.values().length];
                try {
                    iArr[lz3.h.CREATING_ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz3.h.NOT_READY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lz3.h.TAKES_TOO_LONG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[lz3.h.VALID.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[lz3.h.ALREADY_DOWNLOADED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[lz3.h.REVOKED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f102812a = iArr;
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:26:0x0099  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:36:0x0118  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
        
            if (r6.U9(r4, r0, r10) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
        
            if (r6.F(r7, r10) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x013c, code lost:
        
            if (r11.X9(r4, r10) == r2) goto L40;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 338
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.e0.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            o oVar = e0.this.new o(eVar);
            oVar.f102809n = redirectToDocumentFromLocalNotification;
            oVar.f102810p = initialized;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh1/t$h;", "event", "Ljh1/v$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh1/t$h;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<jh1.t.h, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f102815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f102816h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f102817j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f102818k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f102819l;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            if (r2.U9(r3, r0, r7) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
        
            if (r2.F(r5, r7) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f102819l
                jh1.t$h r0 = (jh1.t.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f102818k
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2f
                if (r2 == r5) goto L2b
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f102814f
                dx.b r0 = (dx.b) r0
            L22:
                java.lang.Object r0 = r7.f102813e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto La2
            L2b:
                oq.u.b(r8)
                goto L43
            L2f:
                oq.u.b(r8)
                jh1.e0 r8 = jh1.e0.this
                yg1.a r8 = jh1.e0.r9(r8)
                r7.f102819l = r0
                r7.f102818k = r5
                java.lang.Object r8 = r8.d(r7)
                if (r8 != r1) goto L43
                goto La1
            L43:
                dx.i r8 = (dx.i) r8
                jh1.e0 r2 = jh1.e0.this
                boolean r5 = r8 instanceof dx.i.Left
                r6 = 0
                if (r5 == 0) goto L74
                r3 = r8
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                java.lang.Object r5 = vq.j.a(r0)
                r7.f102819l = r5
                java.lang.Object r8 = vq.j.a(r8)
                r7.f102813e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f102814f = r8
                r7.f102815g = r6
                r7.f102816h = r6
                r7.f102818k = r4
                java.lang.Object r8 = jh1.e0.I9(r2, r3, r0, r7)
                if (r8 != r1) goto La2
                goto La1
            L74:
                boolean r4 = r8 instanceof dx.i.Right
                if (r4 == 0) goto La5
                r4 = r8
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                jh1.t$s$f r5 = jh1.t.s.f.f102954a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f102819l = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f102813e = r8
                r7.f102815g = r6
                r7.f102817j = r4
                r7.f102816h = r6
                r7.f102818k = r3
                java.lang.Object r8 = r2.F(r5, r7)
                if (r8 != r1) goto La2
            La1:
                return r1
            La2:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            La5:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.e0.p.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.h hVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            p pVar = e0.this.new p(eVar);
            pVar.f102819l = hVar;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$k;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$k;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<jh1.t.k, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102821e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102821e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                jh1.t.s.i iVar = jh1.t.s.i.f102957a;
                this.f102821e = 1;
                if (e0Var.F(iVar, this) == objE) {
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
        public final Object w(jh1.t.k kVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$i;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$i;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<jh1.t.i, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102823e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102823e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                jh1.t.s.ShowDialog showDialog = new jh1.t.s.ShowDialog(e0.this.logoutDialogMapper.b(new kh1.g.Params(e0.this.b9(jh1.t.r.f102948a))));
                this.f102823e = 1;
                if (e0Var.F(showDialog, this) == objE) {
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
        public final Object w(jh1.t.i iVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lrq0/b;", "Lfr0/g;", "configs", "Ljh1/v$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljava/util/Map;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<Map<rq0.b, ? extends DocumentConfig>, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102826f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Map map = (Map) this.f102826f;
            uq.b.e();
            if (this.f102825e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(new jh1.t.ChangedDocumentConfig(map));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Map<rq0.b, DocumentConfig> map, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            s sVar = e0.this.new s(eVar);
            sVar.f102826f = map;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh1/t$l;", "event", "Ljh1/v$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh1/t$l;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<jh1.t.GoToDocumentView, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f102830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f102831h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f102833k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f102834l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f102835m;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f102837a;

            static {
                int[] iArr = new int[lz3.h.values().length];
                try {
                    iArr[lz3.h.CREATING_ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lz3.h.NOT_READY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lz3.h.TAKES_TOO_LONG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[lz3.h.VALID.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[lz3.h.ALREADY_DOWNLOADED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[lz3.h.REVOKED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f102837a = iArr;
            }
        }

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:40:0x0126  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
        
            if (r2.X9(r5, r6) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
        
            if (r2.U9(r4, r0, r6) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
        
            if (r2.F(r5, r6) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x013f, code lost:
        
            if (r7.X9(r2, r6) == r1) goto L44;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jh1.e0.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.GoToDocumentView goToDocumentView, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            t tVar = e0.this.new t(eVar);
            tVar.f102835m = goToDocumentView;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh1/t$z;", "event", "Ljh1/v$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh1/t$z;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<jh1.t.StartGenerateDocument, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102839f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jh1.t.StartGenerateDocument startGenerateDocument = (jh1.t.StartGenerateDocument) this.f102839f;
            Object objE = uq.b.e();
            int i15 = this.f102838e;
            if (i15 == 0) {
                oq.u.b(obj);
                ch1.n0 n0Var = e0.this.retryAsyncDownloadAfterErrorUC;
                ch1.n0.Params params = new ch1.n0.Params(startGenerateDocument.getDocumentType());
                this.f102839f = vq.j.a(startGenerateDocument);
                this.f102838e = 1;
                if (n0Var.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            e0.this.d9(jh1.t.q.f102947a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.StartGenerateDocument startGenerateDocument, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            u uVar = e0.this.new u(eVar);
            uVar.f102839f = startGenerateDocument;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljh1/t$g;", "event", "Ljh1/v$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljh1/t$g;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<jh1.t.DocumentErrorDialogDismissed, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f102842f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jh1.t.DocumentErrorDialogDismissed documentErrorDialogDismissed = (jh1.t.DocumentErrorDialogDismissed) this.f102842f;
            Object objE = uq.b.e();
            int i15 = this.f102841e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.g gVar = e0.this.cleanupDocumentDownloadDataUC;
                mz3.g.Params params = new mz3.g.Params(documentErrorDialogDismissed.getDocumentType(), null, true);
                this.f102842f = vq.j.a(documentErrorDialogDismissed);
                this.f102841e = 1;
                if (gVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            e0.this.d9(jh1.t.q.f102947a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jh1.t.DocumentErrorDialogDismissed documentErrorDialogDismissed, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            v vVar = e0.this.new v(eVar);
            vVar.f102842f = documentErrorDialogDismissed;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$n;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$n;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<jh1.t.n, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102844e;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102844e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                jh1.t.s.k kVar = jh1.t.s.k.f102959a;
                this.f102844e = 1;
                if (e0Var.F(kVar, this) == objE) {
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
        public final Object w(jh1.t.n nVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new w(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$j;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$j;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<jh1.t.j, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102846e;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102846e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                iq0.v vVar = iq0.v.CHATBOT;
                jh1.t.s.h hVar = jh1.t.s.h.f102956a;
                this.f102846e = 1;
                if (e0Var.W9(vVar, hVar, this) == objE) {
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
        public final Object w(jh1.t.j jVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new x(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$m;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$m;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<jh1.t.m, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102848e;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102848e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                iq0.v vVar = iq0.v.ELECTRONIC_DELIVERY;
                jh1.t.s.j jVar = jh1.t.s.j.f102958a;
                this.f102848e = 1;
                if (e0Var.W9(vVar, jVar, this) == objE) {
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
        public final Object w(jh1.t.m mVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new y(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh1/t$r;", "<unused var>", "Ljh1/v$c;", "Loq/i0;", "<anonymous>", "(Ljh1/t$r;Ljh1/v$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<jh1.t.r, jh1.v.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102850e;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102850e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                jh1.t.s.b bVar = jh1.t.s.b.f102950a;
                this.f102850e = 1;
                if (e0Var.F(bVar, this) == objE) {
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
        public final Object w(jh1.t.r rVar, jh1.v.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return e0.this.new z(eVar).J(oq.i0.f148189a);
        }
    }

    public e0(yy.a aVar, i70.e eVar, ug1.c cVar, kh1.e eVar2, vh1.j jVar, mz3.g gVar, mz3.o oVar, ch1.n0 n0Var, zg1.d dVar, ib4.c cVar2, zg1.e eVar3, ch1.l0 l0Var, ch1.n nVar, c21.a aVar2, h64.d dVar2, g02.a aVar3, ch1.t tVar, ch1.x xVar, q34.z zVar, r34.f fVar, r34.d dVar3, kh1.g gVar2, ch1.b bVar, h64.p pVar, ug1.e eVar4, a14.q qVar, mx.c cVar3, ch1.a aVar4, yg1.c cVar4, yg1.a aVar5, pq3.b bVar2, pq3.c cVar5, ch1.d0 d0Var, SetupData setupData) {
        this.f102651b = eVar;
        this.getDocumentNavigationUseCase = cVar;
        this.documentsListMapper = eVar2;
        this.updateDialogMapper = jVar;
        this.cleanupDocumentDownloadDataUC = gVar;
        this.getDocumentAsyncDownloadErrorUC = oVar;
        this.retryAsyncDownloadAfterErrorUC = n0Var;
        this.documentDownloadErrorDialogMapper = dVar;
        this.domainErrorMapper = cVar2;
        this.localNotificationRedirectionMapper = eVar3;
        this.monitorDocumentsDashboardStatusesUC = l0Var;
        this.getDashboardAddedDocumentsStatusesUC = nVar;
        this.isChatBotFeatureFlagActiveUseCase = aVar2;
        this.getFeatureFlagListFlowUC = dVar2;
        this.isElectronicDeliveryFeatureFlagActiveUseCase = aVar3;
        this.getDocumentsLayoutTypeDataStoreUseCase = tVar;
        this.getDocumentsOrderUseCase = xVar;
        this.forceFetchDocumentSummaryDataUC = zVar;
        this.monitorDocumentsConfigsUseCase = fVar;
        this.getSavedDocumentsConfigsUC = dVar3;
        this.logoutDialogMapper = gVar2;
        this.checkWasUpdateRecommendationDisplayedUseCase = bVar;
        this.isUpdateRecommendedUseCase = pVar;
        this.setUpdateRecommendationDisplayedUseCase = eVar4;
        this.goToStoreIntentUseCase = qVar;
        this.labelProvider = cVar3;
        this.checkFeatureTemporaryInterruptionUC = aVar4;
        this.notificationInteractor = cVar4;
        this.dashboardContainersInteractor = aVar5;
        this.isWhatsNewFeatureFlagActiveUseCase = bVar2;
        this.shouldDisplayWhatsNewUseCase = cVar5;
        this.getStudentCardExpirationAlertUC = d0Var;
        this.contract = setupData;
        jh1.v.Initial initial = new jh1.v.Initial(null);
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: jh1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.aa(this.f102648a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), jh1.w.a.b.f102996a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jh1.w.a Q9(jh1.v state) {
        kh1.e eVar = this.documentsListMapper;
        er.a<oq.i0> aVarB9 = b9(jh1.t.k.f102940a);
        er.a<oq.i0> aVarB10 = b9(jh1.t.h.f102937a);
        return eVar.b(new kh1.e.DocumentsParams(state, b9(jh1.t.n.f102944a), b9(jh1.t.j.f102939a), b9(jh1.t.m.f102943a), new er.p() { // from class: jh1.x
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return e0.R9(this.f102999a, (rq0.b) obj, (lz3.h) obj2);
            }
        }, aVarB9, aVarB10, b9(jh1.t.a.f102930a), b9(jh1.t.b.f102931a), b9(jh1.t.f.f102935a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(e0 e0Var, rq0.b bVar, lz3.h hVar) {
        e0Var.d9(new jh1.t.GoToDocumentView(bVar, hVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S9(List<? extends k34.g> list, List<? extends k34.g> list2, tq.e<? super ah1.i> eVar) throws Throwable {
        a aVar;
        int i15;
        Object objB;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f102678j;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f102678j = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f102676g;
        Object objE = uq.b.e();
        int i17 = aVar.f102678j;
        if (i17 == 0) {
            oq.u.b(objC);
            List<? extends k34.g> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((k34.g) it.next()).getType() == rq0.b.d.STUDENT_CARD) {
                            List<? extends k34.g> list4 = list2;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator<T> it4 = list4.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (((k34.g) it4.next()).getType() == rq0.b.d.STUDENT_CARD) {
                                        }
                                    }
                                }
                            }
                            i15 = 1;
                            break;
                        }
                    }
                    i15 = 0;
                    break;
                }
            }
            i15 = 0;
            break;
            if (i15 == 0) {
                return ah1.i.a.f6358a;
            }
            ch1.d0 d0Var = this.getStudentCardExpirationAlertUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f102673d = vq.j.a(list);
            aVar.f102674e = vq.j.a(list2);
            aVar.f102675f = i15;
            aVar.f102678j = 1;
            objC = d0Var.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            objB = ah1.i.a.f6358a;
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            objB = ((dx.i.Right) iVar).b();
        }
        return (ah1.i) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U9(dx.b bVar, final jh1.t tVar, tq.e<? super oq.i0> eVar) {
        Object objF = F(new jh1.t.s.Error(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: jh1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.V9(tVar, this, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(jh1.t tVar, e0 e0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (!(bVar instanceof ib4.c.b.a.Primary)) {
                throw new oq.p();
            }
            if (tVar instanceof jh1.t.StartGenerateDocument) {
                e0Var.d9(tVar);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (F(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        if (F(r4, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W9(iq0.v r8, jh1.t.s r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.e0.W9(iq0.v, jh1.t$s, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r2.F(r10, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X9(rq0.b r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof jh1.e0.c
            if (r0 == 0) goto L13
            r0 = r10
            jh1.e0$c r0 = (jh1.e0.c) r0
            int r1 = r0.f102698j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f102698j = r1
            goto L18
        L13:
            jh1.e0$c r0 = new jh1.e0$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f102696g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f102698j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f102693d
            rq0.b r9 = (rq0.b) r9
            oq.u.b(r10)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f102695f
            zg1.d r9 = (zg1.d) r9
            java.lang.Object r2 = r0.f102694e
            jh1.e0 r2 = (jh1.e0) r2
            java.lang.Object r4 = r0.f102693d
            rq0.b r4 = (rq0.b) r4
            oq.u.b(r10)
            goto L67
        L48:
            oq.u.b(r10)
            zg1.d r10 = r8.documentDownloadErrorDialogMapper
            mz3.o r2 = r8.getDocumentAsyncDownloadErrorUC
            mz3.o$a r5 = new mz3.o$a
            r5.<init>(r9)
            r0.f102693d = r9
            r0.f102694e = r8
            r0.f102695f = r10
            r0.f102698j = r4
            java.lang.Object r2 = r2.c(r5, r0)
            if (r2 != r1) goto L63
            goto L9c
        L63:
            r4 = r9
            r9 = r10
            r10 = r2
            r2 = r8
        L67:
            dx.b$c r10 = (dx.b.Business) r10
            jh1.t$z r5 = new jh1.t$z
            r5.<init>(r4)
            er.a r5 = r8.b9(r5)
            jh1.t$g r6 = new jh1.t$g
            r6.<init>(r4)
            er.a r6 = r8.b9(r6)
            zg1.d$a r7 = new zg1.d$a
            r7.<init>(r10, r5, r6)
            cb4.d r9 = r9.b(r7)
            jh1.t$s$d r10 = new jh1.t$s$d
            r10.<init>(r9)
            java.lang.Object r9 = vq.j.a(r4)
            r0.f102693d = r9
            r9 = 0
            r0.f102694e = r9
            r0.f102695f = r9
            r0.f102698j = r3
            java.lang.Object r9 = r2.F(r10, r0)
            if (r9 != r1) goto L9d
        L9c:
            return r1
        L9d:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.e0.X9(rq0.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(final e0 e0Var, k10.v vVar) {
        vVar.c(fr.q0.c(jh1.v.class), new er.l() { // from class: jh1.y
            @Override // er.l
            public final Object b(Object obj) {
                return e0.ba(this.f103001a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jh1.v.Initial.class), new er.l() { // from class: jh1.z
            @Override // er.l
            public final Object b(Object obj) {
                return e0.ca(this.f103003a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jh1.v.Initialized.class), new er.l() { // from class: jh1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.da(this.f102638a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jh1.v.Empty.class), new er.l() { // from class: jh1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.ea(this.f102640a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(e0 e0Var, k10.z zVar) {
        e eVar = e0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(jh1.t.C2428t.class), oVar, eVar);
        zVar.x(fr.q0.c(jh1.t.HandelAppMenuItem.class), oVar, e0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(e0 e0Var, k10.z zVar) {
        g gVar = e0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jh1.t.SetupData.class), oVar, gVar);
        zVar.v(fr.q0.c(jh1.t.RedirectToDocumentFromLocalNotification.class), oVar, new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(e0 e0Var, k10.z zVar) {
        r34.f fVar = e0Var.monitorDocumentsConfigsUseCase;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        k10.k.s(zVar, (mu.g) fVar.a(c1792a), null, e0Var.new s(null), 2, null);
        k10.k.m(zVar, e0Var.notificationInteractor.b(), null, new d0(null), 2, null);
        zVar.C(e0Var.new C2427e0(null));
        f0 f0Var = e0Var.new f0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(jh1.t.C2428t.class), oVar, f0Var);
        zVar.v(fr.q0.c(jh1.t.p.class), oVar, e0Var.new g0(null));
        zVar.x(fr.q0.c(jh1.t.e.class), oVar, e0Var.new h0(null));
        zVar.x(fr.q0.c(jh1.t.d.class), oVar, e0Var.new i0(null));
        zVar.x(fr.q0.c(jh1.t.y.class), oVar, e0Var.new j0(null));
        zVar.x(fr.q0.c(jh1.t.u.class), oVar, e0Var.new k0(null));
        zVar.v(fr.q0.c(jh1.t.ChangedDocumentConfig.class), oVar, new i(null));
        zVar.v(fr.q0.c(jh1.t.SetupData.class), oVar, e0Var.new j(null));
        k10.k.m(zVar, (mu.g) e0Var.getFeatureFlagListFlowUC.a(c1792a), null, e0Var.new k(null), 2, null);
        k10.k.m(zVar, (mu.g) e0Var.monitorDocumentsDashboardStatusesUC.a(c1792a), null, e0Var.new l(null), 2, null);
        zVar.x(fr.q0.c(jh1.t.q.class), oVar, e0Var.new m(null));
        zVar.v(fr.q0.c(jh1.t.SetupDocuments.class), oVar, new n(null));
        zVar.x(fr.q0.c(jh1.t.RedirectToDocumentFromLocalNotification.class), oVar, e0Var.new o(null));
        zVar.x(fr.q0.c(jh1.t.h.class), oVar, e0Var.new p(null));
        zVar.x(fr.q0.c(jh1.t.k.class), oVar, e0Var.new q(null));
        zVar.x(fr.q0.c(jh1.t.i.class), oVar, e0Var.new r(null));
        zVar.x(fr.q0.c(jh1.t.GoToDocumentView.class), oVar, e0Var.new t(null));
        zVar.x(fr.q0.c(jh1.t.StartGenerateDocument.class), oVar, e0Var.new u(null));
        zVar.x(fr.q0.c(jh1.t.DocumentErrorDialogDismissed.class), oVar, e0Var.new v(null));
        zVar.x(fr.q0.c(jh1.t.n.class), oVar, e0Var.new w(null));
        zVar.x(fr.q0.c(jh1.t.j.class), oVar, e0Var.new x(null));
        zVar.x(fr.q0.c(jh1.t.m.class), oVar, e0Var.new y(null));
        zVar.x(fr.q0.c(jh1.t.r.class), oVar, e0Var.new z(null));
        zVar.v(fr.q0.c(jh1.t.a.class), oVar, new a0(null));
        zVar.v(fr.q0.c(jh1.t.b.class), oVar, new b0(null));
        zVar.v(fr.q0.c(jh1.t.f.class), oVar, new c0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(e0 e0Var, k10.z zVar) {
        l0 l0Var = new l0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jh1.t.RedirectToDocumentFromLocalNotification.class), oVar, l0Var);
        zVar.x(fr.q0.c(jh1.t.h.class), oVar, e0Var.new m0(null));
        zVar.v(fr.q0.c(jh1.t.SetupData.class), oVar, e0Var.new n0(null));
        return oq.i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.f102651b.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(jh1.t.s sVar, tq.e<? super oq.i0> eVar) {
        return super.F(sVar, eVar);
    }

    public void T9(gx.b globalEvent) {
        if (fr.t.c(globalEvent, tg1.a.C4953a.f190065a)) {
            y(new p50.a.DefaultWithIcon(this.labelProvider.c(sg1.a.f181488k0), false, null, null, 14, null));
        } else if (globalEvent instanceof tg1.a.NavigateToNotificationDocument) {
            Y9(((tg1.a.NavigateToNotificationDocument) globalEvent).getLocalNotificationItem());
        }
    }

    @Override // zx.b
    public xw.b<jh1.t.s> Y1() {
        return this.navAction;
    }

    public void Y9(r54.c localNotificationItem) {
        rq0.b bVarA;
        gx.b bVarB = this.localNotificationRedirectionMapper.b(new zg1.e.Params(localNotificationItem));
        if (bVarB == null || (bVarA = rq0.b.INSTANCE.a(localNotificationItem.getDocumentReferenceName())) == null) {
            return;
        }
        d9(new jh1.t.RedirectToDocumentFromLocalNotification(bVarA, bVarB));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Z9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        ah1.a.EnumC0131a navigateTo = data.getNavigateTo();
        if (navigateTo != null) {
            d9(new jh1.t.HandelAppMenuItem(navigateTo));
        }
    }

    @Override // jh1.w
    public void d() {
        d9(jh1.t.i.f102938a);
    }

    @Override // l00.g
    protected k10.t<jh1.v, jh1.t> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<jh1.w.a> getState() {
        return this.state;
    }

    @Override // jh1.w
    public void n() {
        d9(jh1.t.C2428t.f102960a);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.f102651b.y(snackBarData);
    }
}
