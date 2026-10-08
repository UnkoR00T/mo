package yu1;

import android.graphics.Bitmap;
import g70.ShortcutMoreData;
import g70.ShortcutMoreTransferData;
import h30.ButtonData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iq0.DashboardServiceEntry;
import iy.c0;
import j30.ButtonTextData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l60.KeyValueData;
import mx.Label;
import mz3.z;
import n20.State;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import oq.y;
import ou1.DrivingLicenceCategory;
import ou1.DrivingLicenceContainerData;
import ou1.DrivingLicenceData;
import ou1.DrivingLicenceFullData;
import p071kotlin.Metadata;
import pq.v0;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x40.LinkData;
import x50.NavigationButtonData;
import xu1.x;
import zu1.EmptyDrivingLicenceData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!Jk\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\"2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lyu1/w;", "Lxw/f;", "Lyu1/w$a;", "Lxu1/x$a;", "Lmx/c;", "labelProvider", "Lp20/c;", "giloshScreenMapper", "Lv20/a;", "documentValidityBannerMapper", "Lez/c;", "dateConverter", "Lyu1/g;", "bottomSheetMapper", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lp20/c;Lv20/a;Lez/c;Lyu1/g;Lu04/a;)V", "params", "Lxu1/w$a;", "documentState", "Lxu1/x$a$b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lyu1/w$a;Lxu1/w$a;)Lxu1/x$a$b;", "drivingLicenceMainState", "Lou1/f;", "selectedDrivingLicence", "Ly20/b;", "animationsState", "Lyu1/w$a$a;", "actionsHandler", "Lo20/k;", "z", "(Lxu1/w$a;Lou1/f;Ly20/b;Lyu1/w$a$a;)Lo20/k;", "", "Liq0/p;", "availableServices", "Lkotlin/Function0;", "Loq/i0;", "onGoToVerification", "onGoToPenaltyPoints", "onGoToVehicleCollision", "onGoToFines", "onDeleteDocument", "Lo50/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ljava/util/List;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)Ljava/util/List;", "Lou1/g;", "scopes", "", "x", "(Lou1/g;)Z", "Q", "(Lyu1/w$a;)Lxu1/x$a;", "a", "Lmx/c;", "b", "Lp20/c;", "c", "Lv20/a;", "d", "Lez/c;", "e", "Lyu1/g;", "f", "Lu04/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements xw.f<Params, x.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v20.a documentValidityBannerMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g bottomSheetMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: yu1.w$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lyu1/w$a;", "", "Lxu1/w;", "drivingLicenceMainState", "Ly20/b;", "animationsState", "Lyu1/w$a$a;", "actionsHandler", "<init>", "(Lxu1/w;Ly20/b;Lyu1/w$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxu1/w;", "c", "()Lxu1/w;", "b", "Ly20/b;", "()Ly20/b;", "Lyu1/w$a$a;", "()Lyu1/w$a$a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f229589d = y20.b.f223429b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final xu1.w drivingLicenceMainState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y20.b animationsState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ActionsHandler actionsHandler;

        /* JADX INFO: renamed from: yu1.w$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010+R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010+R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b4\u0010(R)\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b7\u0010+R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010+R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b0\u0010+R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b.\u0010(R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b6\u0010(R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b,\u0010(R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b8\u0010+¨\u00069"}, d2 = {"Lyu1/w$a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Ly30/n$b$b;", "onChangeTab", "Lmz3/z$b;", "onUpdateDrivingLicence", "", "onUrlClick", "onGoToPenaltyPoints", "onGoToVerification", "onGoToVehicleCollision", "onGoToFines", "", "Lg70/b;", "onGoToMoreDialog", "Ln20/a;", "onDispatchAction", "", "onDeleteDocument", "onCloseInfoBanner", "onGoToHistoricDocuments", "onCloseExpirationDateBanner", "Lxu1/w$a$a;", "onSetBottomSheetState", "<init>", "(Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Ler/l;", "()Ler/l;", "c", "n", "d", "o", "e", "j", "f", "l", "g", "k", "h", "i", "m", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionsHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<y30.n.Switch.EnumC5973b, i0> onChangeTab;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<z.b, i0> onUpdateDrivingLicence;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<String, i0> onUrlClick;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToPenaltyPoints;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToVerification;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToVehicleCollision;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToFines;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<List<ShortcutMoreTransferData>, i0> onGoToMoreDialog;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<n20.a, i0> onDispatchAction;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, i0> onDeleteDocument;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onCloseInfoBanner;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onGoToHistoricDocuments;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onCloseExpirationDateBanner;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<xu1.w.Initialized.InterfaceC5918a, i0> onSetBottomSheetState;

            /* JADX WARN: Multi-variable type inference failed */
            public ActionsHandler(er.a<i0> aVar, er.l<? super y30.n.Switch.EnumC5973b, i0> lVar, er.l<? super z.b, i0> lVar2, er.l<? super String, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.l<? super List<ShortcutMoreTransferData>, i0> lVar4, er.l<? super n20.a, i0> lVar5, er.l<? super Boolean, i0> lVar6, er.a<i0> aVar6, er.a<i0> aVar7, er.a<i0> aVar8, er.l<? super xu1.w.Initialized.InterfaceC5918a, i0> lVar7) {
                this.onBack = aVar;
                this.onChangeTab = lVar;
                this.onUpdateDrivingLicence = lVar2;
                this.onUrlClick = lVar3;
                this.onGoToPenaltyPoints = aVar2;
                this.onGoToVerification = aVar3;
                this.onGoToVehicleCollision = aVar4;
                this.onGoToFines = aVar5;
                this.onGoToMoreDialog = lVar4;
                this.onDispatchAction = lVar5;
                this.onDeleteDocument = lVar6;
                this.onCloseInfoBanner = aVar6;
                this.onGoToHistoricDocuments = aVar7;
                this.onCloseExpirationDateBanner = aVar8;
                this.onSetBottomSheetState = lVar7;
            }

            public final er.a<i0> a() {
                return this.onBack;
            }

            public final er.l<y30.n.Switch.EnumC5973b, i0> b() {
                return this.onChangeTab;
            }

            public final er.a<i0> c() {
                return this.onCloseExpirationDateBanner;
            }

            public final er.a<i0> d() {
                return this.onCloseInfoBanner;
            }

            public final er.l<Boolean, i0> e() {
                return this.onDeleteDocument;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionsHandler)) {
                    return false;
                }
                ActionsHandler actionsHandler = (ActionsHandler) other;
                return fr.t.c(this.onBack, actionsHandler.onBack) && fr.t.c(this.onChangeTab, actionsHandler.onChangeTab) && fr.t.c(this.onUpdateDrivingLicence, actionsHandler.onUpdateDrivingLicence) && fr.t.c(this.onUrlClick, actionsHandler.onUrlClick) && fr.t.c(this.onGoToPenaltyPoints, actionsHandler.onGoToPenaltyPoints) && fr.t.c(this.onGoToVerification, actionsHandler.onGoToVerification) && fr.t.c(this.onGoToVehicleCollision, actionsHandler.onGoToVehicleCollision) && fr.t.c(this.onGoToFines, actionsHandler.onGoToFines) && fr.t.c(this.onGoToMoreDialog, actionsHandler.onGoToMoreDialog) && fr.t.c(this.onDispatchAction, actionsHandler.onDispatchAction) && fr.t.c(this.onDeleteDocument, actionsHandler.onDeleteDocument) && fr.t.c(this.onCloseInfoBanner, actionsHandler.onCloseInfoBanner) && fr.t.c(this.onGoToHistoricDocuments, actionsHandler.onGoToHistoricDocuments) && fr.t.c(this.onCloseExpirationDateBanner, actionsHandler.onCloseExpirationDateBanner) && fr.t.c(this.onSetBottomSheetState, actionsHandler.onSetBottomSheetState);
            }

            public final er.l<n20.a, i0> f() {
                return this.onDispatchAction;
            }

            public final er.a<i0> g() {
                return this.onGoToFines;
            }

            public final er.a<i0> h() {
                return this.onGoToHistoricDocuments;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((((this.onBack.hashCode() * 31) + this.onChangeTab.hashCode()) * 31) + this.onUpdateDrivingLicence.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.onGoToPenaltyPoints.hashCode()) * 31) + this.onGoToVerification.hashCode()) * 31) + this.onGoToVehicleCollision.hashCode()) * 31) + this.onGoToFines.hashCode()) * 31) + this.onGoToMoreDialog.hashCode()) * 31) + this.onDispatchAction.hashCode()) * 31) + this.onDeleteDocument.hashCode()) * 31) + this.onCloseInfoBanner.hashCode()) * 31) + this.onGoToHistoricDocuments.hashCode()) * 31) + this.onCloseExpirationDateBanner.hashCode()) * 31) + this.onSetBottomSheetState.hashCode();
            }

            public final er.l<List<ShortcutMoreTransferData>, i0> i() {
                return this.onGoToMoreDialog;
            }

            public final er.a<i0> j() {
                return this.onGoToPenaltyPoints;
            }

            public final er.a<i0> k() {
                return this.onGoToVehicleCollision;
            }

            public final er.a<i0> l() {
                return this.onGoToVerification;
            }

            public final er.l<xu1.w.Initialized.InterfaceC5918a, i0> m() {
                return this.onSetBottomSheetState;
            }

            public final er.l<z.b, i0> n() {
                return this.onUpdateDrivingLicence;
            }

            public final er.l<String, i0> o() {
                return this.onUrlClick;
            }

            public String toString() {
                return "ActionsHandler(onBack=" + this.onBack + ", onChangeTab=" + this.onChangeTab + ", onUpdateDrivingLicence=" + this.onUpdateDrivingLicence + ", onUrlClick=" + this.onUrlClick + ", onGoToPenaltyPoints=" + this.onGoToPenaltyPoints + ", onGoToVerification=" + this.onGoToVerification + ", onGoToVehicleCollision=" + this.onGoToVehicleCollision + ", onGoToFines=" + this.onGoToFines + ", onGoToMoreDialog=" + this.onGoToMoreDialog + ", onDispatchAction=" + this.onDispatchAction + ", onDeleteDocument=" + this.onDeleteDocument + ", onCloseInfoBanner=" + this.onCloseInfoBanner + ", onGoToHistoricDocuments=" + this.onGoToHistoricDocuments + ", onCloseExpirationDateBanner=" + this.onCloseExpirationDateBanner + ", onSetBottomSheetState=" + this.onSetBottomSheetState + ')';
            }
        }

        public Params(xu1.w wVar, y20.b bVar, ActionsHandler actionsHandler) {
            this.drivingLicenceMainState = wVar;
            this.animationsState = bVar;
            this.actionsHandler = actionsHandler;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActionsHandler getActionsHandler() {
            return this.actionsHandler;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y20.b getAnimationsState() {
            return this.animationsState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final xu1.w getDrivingLicenceMainState() {
            return this.drivingLicenceMainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.drivingLicenceMainState, params.drivingLicenceMainState) && fr.t.c(this.animationsState, params.animationsState) && fr.t.c(this.actionsHandler, params.actionsHandler);
        }

        public int hashCode() {
            return (((this.drivingLicenceMainState.hashCode() * 31) + this.animationsState.hashCode()) * 31) + this.actionsHandler.hashCode();
        }

        public String toString() {
            return "Params(drivingLicenceMainState=" + this.drivingLicenceMainState + ", animationsState=" + this.animationsState + ", actionsHandler=" + this.actionsHandler + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229608a;

        static {
            int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
            try {
                iArr[y30.n.Switch.EnumC5973b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f229608a = iArr;
        }
    }

    public w(mx.c cVar, p20.c cVar2, v20.a aVar, ez.c cVar3, g gVar, u04.a aVar2) {
        this.labelProvider = cVar;
        this.giloshScreenMapper = cVar2;
        this.documentValidityBannerMapper = aVar;
        this.dateConverter = cVar3;
        this.bottomSheetMapper = gVar;
        this.commonEndpoints = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params.ActionsHandler actionsHandler) {
        actionsHandler.e().b(Boolean.TRUE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params.ActionsHandler actionsHandler) {
        actionsHandler.n().b(z.b.UPDATE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params.ActionsHandler actionsHandler) {
        actionsHandler.m().b(xu1.w.Initialized.InterfaceC5918a.b.STATUS_CHANGE_INFO);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params.ActionsHandler actionsHandler) {
        actionsHandler.n().b(z.b.DOWNLOAD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params.ActionsHandler actionsHandler) {
        actionsHandler.n().b(z.b.UPDATE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params.ActionsHandler actionsHandler) {
        actionsHandler.m().b(xu1.w.Initialized.InterfaceC5918a.b.TEMPORARY_DRIVING_LICENCE_VALIDITY);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(Params.ActionsHandler actionsHandler) {
        actionsHandler.m().b(xu1.w.Initialized.InterfaceC5918a.b.DIFFERENCES_BETWEEN_DIGITAL_AND_PHYSICAL);
        return i0.f148189a;
    }

    private final x.a.Initialized L(final Params params, xu1.w.Initialized documentState) {
        DrivingLicenceData drivingLicenceDataB;
        Label labelN;
        EmptyDrivingLicenceData emptyDrivingLicenceData;
        boolean z15;
        boolean z16;
        y30.n.Switch.EnumC5973b selectedType = documentState.getSelectedType();
        int[] iArr = b.f229608a;
        int i15 = iArr[selectedType.ordinal()];
        if (i15 == 1) {
            drivingLicenceDataB = documentState.getDrivingLicenceScopes().b();
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            drivingLicenceDataB = documentState.getDrivingLicenceScopes().f() ? documentState.getDrivingLicenceScopes().a() : (DrivingLicenceData) pq.v.n0(documentState.getDrivingLicenceScopes().c());
        }
        NavigationButtonData navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.getActionsHandler().a());
        String documentShortName = documentState.getDocumentShortName();
        if (documentShortName == null || (labelN = mx.b.b(documentShortName, "title")) == null) {
            labelN = this.labelProvider.c(iu1.a.J0).n("title");
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(navigationButtonData, labelN, null, null, null, 28, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: yu1.o
            @Override // er.a
            public final Object a() {
                return w.M(params);
            }
        })), null, null, 53, null);
        er.a<i0> aVarA = params.getActionsHandler().a();
        y30.n.Switch r15 = new y30.n.Switch(new y30.n.Switch.TabItem(this.labelProvider.c(iu1.a.f97171u0), y30.n.Switch.EnumC5973b.LEFT), new y30.n.Switch.TabItem(this.labelProvider.c(iu1.a.f97173v0), y30.n.Switch.EnumC5973b.RIGHT), documentState.getSelectedType(), false, params.getActionsHandler().b(), 8, null);
        boolean z17 = documentState.getDrivingLicenceScopes().f() || documentState.getDrivingLicenceScopes().h();
        if (documentState.getHasIDCard()) {
            emptyDrivingLicenceData = new EmptyDrivingLicenceData(this.labelProvider.c(iu1.a.f97151k0), this.labelProvider.c(iu1.a.f97149j0), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(iu1.a.f97150k), null, 2, null), k30.d.a.f107773a, k30.b.c.f107768a, new er.a() { // from class: yu1.p
                @Override // er.a
                public final Object a() {
                    return w.N(params);
                }
            }, 3, null));
            z15 = false;
        } else {
            z15 = false;
            emptyDrivingLicenceData = new EmptyDrivingLicenceData(this.labelProvider.c(iu1.a.f97169t0), this.labelProvider.c(iu1.a.f97167s0), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(iu1.a.f97130a), null, 2, null), k30.d.a.f107773a, k30.b.c.f107768a, new er.a() { // from class: yu1.q
                @Override // er.a
                public final Object a() {
                    return w.O(params);
                }
            }, 3, null));
        }
        EmptyDrivingLicenceData emptyDrivingLicenceData2 = emptyDrivingLicenceData;
        int i16 = iArr[documentState.getSelectedType().ordinal()];
        if (i16 == 1) {
            if (!documentState.getDrivingLicenceScopes().g()) {
                z16 = true;
            }
            return new x.a.Initialized(baseScaffoldData, this.bottomSheetMapper.b(new g.Params(documentState.getBottomSheetState(), params.getActionsHandler().m(), drivingLicenceDataB)), aVarA, r15, z17, emptyDrivingLicenceData2, z16, z(documentState, drivingLicenceDataB, params.getAnimationsState(), params.getActionsHandler()));
        }
        if (i16 != 2) {
            throw new oq.p();
        }
        z16 = z15;
        return new x.a.Initialized(baseScaffoldData, this.bottomSheetMapper.b(new g.Params(documentState.getBottomSheetState(), params.getActionsHandler().m(), drivingLicenceDataB)), aVarA, r15, z17, emptyDrivingLicenceData2, z16, z(documentState, drivingLicenceDataB, params.getAnimationsState(), params.getActionsHandler()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params) {
        params.getActionsHandler().m().b(xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params) {
        params.getActionsHandler().n().b(z.b.UPDATE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Params params) {
        params.getActionsHandler().e().b(Boolean.FALSE);
        return i0.f148189a;
    }

    private final List<SmallCardData> P(List<DashboardServiceEntry> availableServices, er.a<i0> onGoToVerification, er.a<i0> onGoToPenaltyPoints, er.a<i0> onGoToVehicleCollision, er.a<i0> onGoToFines, er.a<i0> onDeleteDocument) {
        Label labelC = this.labelProvider.c(iu1.a.f97174w);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        return pq.v.s(new SmallCardData(null, labelC, null, i15, cVar, false, onGoToVerification, 37, null), iq0.q.a(availableServices, rq0.c.PENALTY_POINTS) ? new SmallCardData(null, this.labelProvider.c(iu1.a.B), null, jz.a.f106840p0, cVar, false, onGoToPenaltyPoints, 37, null) : null, iq0.q.a(availableServices, rq0.c.VEHICLE_COLLISION) ? new SmallCardData(null, this.labelProvider.c(iu1.a.C), null, jz.a.B0, cVar, false, onGoToVehicleCollision, 37, null) : null, iq0.q.a(availableServices, rq0.c.FINES) ? new SmallCardData(null, this.labelProvider.c(iu1.a.A), null, jz.a.A0, cVar, false, onGoToFines, 37, null) : null, new SmallCardData(null, this.labelProvider.c(iu1.a.f97154m), null, jz.a.f106727a, o50.f.b.f142477a, false, onDeleteDocument, 37, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(Params params) {
        params.getActionsHandler().m().b(xu1.w.Initialized.InterfaceC5918a.C5919a.f221414a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(Params params, w wVar) {
        params.getActionsHandler().o().b(wVar.commonEndpoints.E());
        return i0.f148189a;
    }

    private final boolean x(DrivingLicenceFullData scopes) {
        List<DrivingLicenceData> listC = scopes.c();
        if (listC.isEmpty()) {
            listC = null;
        }
        List<DrivingLicenceData> list = listC;
        if (list != null) {
            List<DrivingLicenceData> listF0 = scopes.f() ? list : null;
            if (listF0 == null) {
                listF0 = pq.v.f0(list, 1);
            }
            if (listF0 != null && (!listF0.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    private final BaseDocumentData z(xu1.w.Initialized drivingLicenceMainState, DrivingLicenceData selectedDrivingLicence, y20.b animationsState, final Params.ActionsHandler actionsHandler) {
        ou1.b drivingLicenceStatus;
        o20.p pVar;
        String strB;
        String strA;
        if (selectedDrivingLicence == null) {
            return new BaseDocumentData(null, null, null, null, pq.v.n(), pq.v.n(), null, 71, null);
        }
        DrivingLicenceContainerData data = selectedDrivingLicence.getScope().getData();
        List listC = pq.v.c();
        listC.add(new o20.l.Shortcuts(new ShortcutsLayoutData(P(drivingLicenceMainState.c(), actionsHandler.l(), actionsHandler.j(), actionsHandler.k(), actionsHandler.g(), new er.a() { // from class: yu1.r
            @Override // er.a
            public final Object a() {
                return w.E(actionsHandler);
            }
        }), new ShortcutMoreData(this.labelProvider.c(iu1.a.f97176x), actionsHandler.i()))));
        y30.n.Switch.EnumC5973b selectedType = drivingLicenceMainState.getSelectedType();
        y30.n.Switch.EnumC5973b enumC5973b = y30.n.Switch.EnumC5973b.RIGHT;
        if (selectedType == enumC5973b && x(drivingLicenceMainState.getDrivingLicenceScopes())) {
            listC.add(new o20.l.SingleCardIconForward(jz.a.f106797j, this.labelProvider.c(iu1.a.f97133b0), actionsHandler.h()));
        }
        Label labelC = this.labelProvider.c(iu1.a.f97158o);
        LocalDate localDate = selectedDrivingLicence.getScope().getDataHeader().getTs().toLocalDate();
        listC.add(new o20.l.UpdateDataItem(labelC, mx.b.d(localDate != null ? this.dateConverter.a(localDate) : null, "lastUpdateDateValue"), this.labelProvider.c(iu1.a.f97138e), null, new er.a() { // from class: yu1.s
            @Override // er.a
            public final Object a() {
                return w.F(actionsHandler);
            }
        }, 8, null));
        List listI1 = pq.v.i1(pq.v.a(listC));
        boolean z15 = drivingLicenceMainState.getSelectedType() == enumC5973b;
        listI1.addAll(cv1.b.d(selectedDrivingLicence, z15, this.labelProvider, this.dateConverter, new er.a() { // from class: yu1.t
            @Override // er.a
            public final Object a() {
                return w.G(actionsHandler);
            }
        }));
        y30.n.Switch.EnumC5973b selectedType2 = drivingLicenceMainState.getSelectedType();
        int[] iArr = b.f229608a;
        int i15 = iArr[selectedType2.ordinal()];
        if (i15 == 1) {
            drivingLicenceStatus = drivingLicenceMainState.getDrivingLicenceStatus();
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            drivingLicenceStatus = drivingLicenceMainState.getTemporaryLicenceStatus();
        }
        p20.c cVar = this.giloshScreenMapper;
        List listQ = pq.v.q(new u2.Flag(e20.k.Poland, this.labelProvider.c(iu1.a.f97152l)), new u2.Hologram(null, null, 3, null));
        int i16 = iArr[drivingLicenceMainState.getSelectedType().ordinal()];
        if (i16 == 1) {
            pVar = o20.p.C3482p.f140921c;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            pVar = o20.p.q.f140930c;
        }
        o20.p pVar2 = pVar;
        Bitmap bitmap = drivingLicenceMainState.getBitmap();
        Label labelC2 = this.labelProvider.c(iu1.a.f97164r);
        boolean zE = drivingLicenceStatus.e();
        Label labelC3 = this.labelProvider.c(drivingLicenceStatus.e() ? iu1.a.f97160p : iu1.a.f97156n);
        Label labelC4 = this.labelProvider.c(iu1.a.f97144h);
        StringBuilder sb5 = new StringBuilder();
        String name = data.getName();
        if (name != null) {
            sb5.append(name);
        }
        String secondName = data.getSecondName();
        if (secondName != null) {
            if (data.getName() != null) {
                sb5.append(" ");
            }
            sb5.append(secondName);
            i0 i0Var = i0.f148189a;
        }
        i0 i0Var2 = i0.f148189a;
        KeyValueData keyValueData = new KeyValueData(mx.b.d(sb5.toString(), "firstNamesValue"), this.labelProvider.c(iu1.a.f97162q), false, 4, null);
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d(data.getSurname(), "surnameValue"), this.labelProvider.c(iu1.a.f97168t), false, 4, null);
        StringBuilder sb6 = new StringBuilder();
        LocalDate birthday = data.getBirthday();
        if (birthday != null && (strA = this.dateConverter.a(birthday)) != null) {
            sb6.append(strA);
        }
        String birthplace = data.getBirthplace();
        if (birthplace != null) {
            if (data.getBirthday() != null) {
                sb6.append(" ");
            }
            sb6.append(birthplace);
        }
        KeyValueData keyValueData3 = new KeyValueData(mx.b.d(sb6.toString(), "dateAndBirthPlaceValue"), this.labelProvider.c(iu1.a.D), false, 4, null);
        KeyValueData keyValueData4 = new KeyValueData(mx.b.d(c0.e(selectedDrivingLicence.getScope().getDataHeader().getPe()), "peselValue"), this.labelProvider.c(iu1.a.f97166s), true);
        List<DrivingLicenceCategory> listD = data.d();
        if (listD != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                String categoryName = ((DrivingLicenceCategory) it.next()).getCategoryName();
                if (categoryName != null) {
                    arrayList.add(categoryName);
                }
            }
            strB = cv1.b.b(arrayList);
        } else {
            strB = null;
        }
        DocumentGiloshData documentGiloshDataB = cVar.b(new p20.c.Params(listQ, new State(drivingLicenceMainState, animationsState), pVar2, bitmap, labelC2, null, null, zE, labelC3, labelC4, new er.a() { // from class: yu1.u
            @Override // er.a
            public final Object a() {
                return w.H(actionsHandler);
            }
        }, pq.v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, new KeyValueData(mx.b.d(strB, "categoriesGiloshValue"), this.labelProvider.c(iu1.a.f97134c), false, 4, null)), null, null, actionsHandler.f(), drivingLicenceMainState.getDocumentVMS(), 12384, null));
        List listC2 = pq.v.c();
        if (z15 && drivingLicenceMainState.getShowInfoBanner()) {
            listC2.add(new c30.b.c(null, null, null, this.labelProvider.c(iu1.a.f97147i0), actionsHandler.d(), null, null, 103, null));
        }
        if (((!drivingLicenceMainState.getShowExpirationDateBanner() || (!(z15 && drivingLicenceStatus.e()) && z15)) ? null : listC2) != null) {
            v20.a aVar = this.documentValidityBannerMapper;
            LocalDate expiredDate = selectedDrivingLicence.getScope().getData().getExpiredDate();
            Date dateF = expiredDate != null ? this.dateConverter.f(expiredDate) : null;
            int i17 = iu1.a.f97155m0;
            int i18 = iu1.a.f97157n0;
            int i19 = iu1.a.f97153l0;
            Integer numValueOf = Integer.valueOf(iu1.a.I0);
            if (!z15) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : iu1.a.f97159o0;
            er.a<i0> aVarC = actionsHandler.c();
            v20.a.b hideAfterExpiration = v20.a.b.C5289b.f203322a;
            if (!z15) {
                hideAfterExpiration = null;
            }
            if (hideAfterExpiration == null) {
                hideAfterExpiration = new v20.a.b.HideAfterExpiration(new ButtonTextData(null, this.labelProvider.c(iu1.a.f97144h), null, null, new er.a() { // from class: yu1.v
                    @Override // er.a
                    public final Object a() {
                        return w.I(actionsHandler);
                    }
                }, 13, null));
            }
            c30.b.C0606b c0606bB = !pq.v.q(ou1.b.INACTIVE, ou1.b.REVOKED).contains(drivingLicenceStatus) ? aVar.b(new v20.a.Params(dateF, i17, i19, i18, iIntValue, aVarC, hideAfterExpiration)) : null;
            if (c0606bB != null) {
                listC2.add(c0606bB);
                i0 i0Var3 = i0.f148189a;
            }
            i0 i0Var4 = i0.f148189a;
        }
        i0 i0Var5 = i0.f148189a;
        List listA = pq.v.a(listC2);
        List listC3 = pq.v.c();
        if (drivingLicenceMainState.getSelectedType() == y30.n.Switch.EnumC5973b.RIGHT) {
            listC3.add(new c30.b.c(null, null, null, this.labelProvider.c(iu1.a.f97181z0), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(iu1.a.f97140f), null, null, new er.a() { // from class: yu1.l
                @Override // er.a
                public final Object a() {
                    return w.J(actionsHandler);
                }
            }, 13, null)), 55, null));
        } else {
            listC3.add(new c30.b.c(null, null, null, this.labelProvider.c(iu1.a.S), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(iu1.a.f97140f), null, null, new er.a() { // from class: yu1.m
                @Override // er.a
                public final Object a() {
                    return w.K(actionsHandler);
                }
            }, 13, null)), 55, null));
        }
        listC3.add(new c30.b.c(null, null, null, this.labelProvider.c(iu1.a.f97141f0), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(iu1.a.f97139e0), this.commonEndpoints.E(), LinkData.EnumC5775a.WEBSITE, false, actionsHandler.o(), 17, null)), 55, null));
        return new BaseDocumentData(null, null, null, documentGiloshDataB, listI1, listA, pq.v.a(listC3), 7, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public x.a b(final Params params) {
        xu1.w drivingLicenceMainState = params.getDrivingLicenceMainState();
        if (drivingLicenceMainState instanceof xu1.w.Initialized) {
            return L(params, (xu1.w.Initialized) drivingLicenceMainState);
        }
        if (!(drivingLicenceMainState instanceof xu1.w.c)) {
            if (drivingLicenceMainState instanceof xu1.w.b) {
                return x.a.C5920a.f221423a;
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.getActionsHandler().a()), null, null, null, null, 30, null), null, v0.f(y.a(y3.a.O(y3.a.INSTANCE.o()), new er.a() { // from class: yu1.k
            @Override // er.a
            public final Object a() {
                return w.R(params);
            }
        })), null, null, 53, null);
        q40.j.b.C4090b c4090b = q40.j.b.C4090b.f164686d;
        Label labelC = this.labelProvider.c(iu1.a.f97165r0);
        Label labelC2 = this.labelProvider.c(iu1.a.f97161p0);
        k30.d.a aVar = k30.d.a.f107773a;
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.b.c cVar = k30.b.c.f107768a;
        return new x.a.NoData(baseScaffoldData, new IconPageData(c4090b, labelC, labelC2, null, null, new IconPageBottomContentData(new ButtonData(null, null, large, new k30.c.WithText(this.labelProvider.c(iu1.a.f97163q0), null, 2, null), aVar, cVar, new er.a() { // from class: yu1.n
            @Override // er.a
            public final Object a() {
                return w.S(params, this);
            }
        }, 3, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(iu1.a.f97148j), null, 2, null), new k30.d.Secondary(null, 1, null), cVar, params.getActionsHandler().a(), 3, null), null, 4, null), false, 72, null));
    }
}
