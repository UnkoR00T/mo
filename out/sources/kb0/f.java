package kb0;

import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import e20.k;
import er.l;
import er.p;
import fr.t;
import g70.ShortcutMoreData;
import h30.ButtonData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb0.SetHologramTextThemeColor;
import l60.KeyValueData;
import lb0.m;
import lb0.n;
import mx.Label;
import n20.State;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o20.BaseDocumentData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import xf0.CategoryContainer;
import xf0.DrivingLicenceDataContainer;
import xf0.DrivingLicenceDocument;
import xf0.DrivingLicenceScope;
import xf0.MnemonicHeaderContainerDL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%J)\u0010+\u001a\u00020*2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b.\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lkb0/f;", "Lxw/f;", "Lkb0/f$a;", "Llb0/n$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Lp20/c;", "giloshMapper", "Lu04/a;", "commonEndpoints", "Lkb0/b;", "drivingLicenceHistoryMapper", "<init>", "(Lmx/c;Lez/c;Lp20/c;Lu04/a;Lkb0/b;)V", "Lxf0/c;", "data", "", "Ll60/c;", "q", "(Lxf0/c;)Ljava/util/List;", "params", "", "shouldShowHistory", "Lo20/l;", "h", "(Lxf0/c;Lkb0/f$a;Z)Ljava/util/List;", "Lo20/l$e;", "l", "(Lxf0/c;)Lo20/l$e;", "Lxf0/e;", "drivingLicence", "", "r", "(Lxf0/e;)Ljava/util/Collection;", "s", "(Lkb0/f$a;)Llb0/n$a;", "Lkotlin/Function0;", "Loq/i0;", "onDeleteAction", "onCancelAction", "Lcb4/d;", "v", "(Ler/a;Ler/a;)Lcb4/d;", "onUpdateAction", "x", "a", "Lmx/c;", "b", "Lez/c;", "c", "Lp20/c;", "d", "Lu04/a;", "e", "Lkb0/b;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, n.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final kb0.b drivingLicenceHistoryMapper;

    /* JADX INFO: renamed from: kb0.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\"\u0010.R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010.R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b3\u0010)R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b,\u0010)R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b/\u0010)R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b1\u0010.¨\u00066"}, d2 = {"Lkb0/f$a;", "", "Ln20/b;", "Llb0/m;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lo20/s2;", "documentVMS", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "onGoToInfoPageClick", "", "onReportMistakeClick", "onUpdateDocumentClick", "onDeleteClick", "onVerificationClick", "onVerificationClickShowExpiredDialog", "onDrivingLicenceHistoryAction", "Lxf0/c;", "onDrivingLicenceHistoryDetailsAction", "<init>", "(Ln20/b;Ler/a;Lo20/s2;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "l", "()Ln20/b;", "b", "Ler/a;", "c", "()Ler/a;", "Lo20/s2;", "()Lo20/s2;", "d", "Ler/l;", "()Ler/l;", "e", "g", "f", "h", "i", "j", "k", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<m> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToInfoPageClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onReportMistakeClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUpdateDocumentClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVerificationClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVerificationClickShowExpiredDialog;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDrivingLicenceHistoryAction;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DrivingLicenceDocument, i0> onDrivingLicenceHistoryDetailsAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<m> state, er.a<i0> aVar, s2 s2Var, l<? super n20.a, i0> lVar, er.a<i0> aVar2, l<? super String, i0> lVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7, l<? super DrivingLicenceDocument, i0> lVar3) {
            this.state = state;
            this.onBackAction = aVar;
            this.documentVMS = s2Var;
            this.dispatchAction = lVar;
            this.onGoToInfoPageClick = aVar2;
            this.onReportMistakeClick = lVar2;
            this.onUpdateDocumentClick = aVar3;
            this.onDeleteClick = aVar4;
            this.onVerificationClick = aVar5;
            this.onVerificationClickShowExpiredDialog = aVar6;
            this.onDrivingLicenceHistoryAction = aVar7;
            this.onDrivingLicenceHistoryDetailsAction = lVar3;
        }

        public final l<n20.a, i0> a() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final er.a<i0> d() {
            return this.onDeleteClick;
        }

        public final er.a<i0> e() {
            return this.onDrivingLicenceHistoryAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.documentVMS, params.documentVMS) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.onGoToInfoPageClick, params.onGoToInfoPageClick) && t.c(this.onReportMistakeClick, params.onReportMistakeClick) && t.c(this.onUpdateDocumentClick, params.onUpdateDocumentClick) && t.c(this.onDeleteClick, params.onDeleteClick) && t.c(this.onVerificationClick, params.onVerificationClick) && t.c(this.onVerificationClickShowExpiredDialog, params.onVerificationClickShowExpiredDialog) && t.c(this.onDrivingLicenceHistoryAction, params.onDrivingLicenceHistoryAction) && t.c(this.onDrivingLicenceHistoryDetailsAction, params.onDrivingLicenceHistoryDetailsAction);
        }

        public final l<DrivingLicenceDocument, i0> f() {
            return this.onDrivingLicenceHistoryDetailsAction;
        }

        public final er.a<i0> g() {
            return this.onGoToInfoPageClick;
        }

        public final l<String, i0> h() {
            return this.onReportMistakeClick;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.documentVMS.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.onGoToInfoPageClick.hashCode()) * 31) + this.onReportMistakeClick.hashCode()) * 31) + this.onUpdateDocumentClick.hashCode()) * 31) + this.onDeleteClick.hashCode()) * 31) + this.onVerificationClick.hashCode()) * 31) + this.onVerificationClickShowExpiredDialog.hashCode()) * 31) + this.onDrivingLicenceHistoryAction.hashCode()) * 31) + this.onDrivingLicenceHistoryDetailsAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.onUpdateDocumentClick;
        }

        public final er.a<i0> j() {
            return this.onVerificationClick;
        }

        public final er.a<i0> k() {
            return this.onVerificationClickShowExpiredDialog;
        }

        public final State<m> l() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", documentVMS=" + this.documentVMS + ", dispatchAction=" + this.dispatchAction + ", onGoToInfoPageClick=" + this.onGoToInfoPageClick + ", onReportMistakeClick=" + this.onReportMistakeClick + ", onUpdateDocumentClick=" + this.onUpdateDocumentClick + ", onDeleteClick=" + this.onDeleteClick + ", onVerificationClick=" + this.onVerificationClick + ", onVerificationClickShowExpiredDialog=" + this.onVerificationClickShowExpiredDialog + ", onDrivingLicenceHistoryAction=" + this.onDrivingLicenceHistoryAction + ", onDrivingLicenceHistoryDetailsAction=" + this.onDrivingLicenceHistoryDetailsAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109756a;

        static {
            int[] iArr = new int[vf0.c.values().length];
            try {
                iArr[vf0.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f109756a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f109757a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(-429191196);
            if (p076m2.t.k()) {
                p076m2.t.o(-429191196, i15, -1, "pl.gov.coi.mjunior.feature.drivinglicence.presentation.mapper.DrivingLicenceMapper.invoke.<anonymous> (DrivingLicenceMapper.kt:117)");
            }
            long hologramTextColor = ((SetHologramTextThemeColor) rVar.N(jb0.b.c())).getHologramTextColor();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(hologramTextColor);
        }
    }

    public f(mx.c cVar, ez.c cVar2, p20.c cVar3, u04.a aVar, kb0.b bVar) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.giloshMapper = cVar3;
        this.commonEndpoints = aVar;
        this.drivingLicenceHistoryMapper = bVar;
    }

    private final List<o20.l> h(DrivingLicenceDocument data, Params params, boolean shouldShowHistory) {
        er.a<i0> aVarK;
        MnemonicHeaderContainerDL mnemonicHeaderContainerDL;
        OffsetDateTime ts4;
        LocalDate localDate;
        Label labelC = this.labelProvider.c(fb0.a.Z);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar = o50.f.c.f142478a;
        vf0.c documentStatus = data.getDocumentStatus();
        vf0.c cVar2 = vf0.c.ACTIVE;
        boolean z15 = documentStatus == cVar2;
        if (z15) {
            aVarK = params.j();
        } else {
            if (z15) {
                throw new oq.p();
            }
            aVarK = params.k();
        }
        SmallCardData smallCardData = new SmallCardData(null, labelC, null, i15, cVar, false, aVarK, 37, null);
        SmallCardData smallCardData2 = new SmallCardData(null, this.labelProvider.c(fb0.a.R), null, jz.a.f106797j, cVar, false, params.e(), 37, null);
        if (!shouldShowHistory) {
            smallCardData2 = null;
        }
        o20.l.Shortcuts shortcuts = new o20.l.Shortcuts(new ShortcutsLayoutData(v.s(smallCardData, smallCardData2, new SmallCardData(null, this.labelProvider.c(fb0.a.f60729o), null, jz.a.f106727a, o50.f.b.f142477a, false, params.d(), 37, null)), new ShortcutMoreData(this.labelProvider.c(fb0.a.f60741x), new l() { // from class: kb0.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.i((List) obj);
            }
        })));
        Label labelC2 = this.labelProvider.c(fb0.a.f60735r);
        DrivingLicenceScope scopeData = data.getScopeData();
        List<o20.l> listT = v.t(shortcuts, new o20.l.UpdateDataItem(labelC2, mx.b.d((scopeData == null || (mnemonicHeaderContainerDL = scopeData.getMnemonicHeaderContainerDL()) == null || (ts4 = mnemonicHeaderContainerDL.getTs()) == null || (localDate = ts4.toLocalDate()) == null) ? null : this.dateConverter.a(localDate), "lastUpdateValue"), data.getDocumentStatus() == cVar2 ? this.labelProvider.c(fb0.a.f60715h) : null, null, params.i(), 8, null), l(data));
        listT.addAll(r(data.getScopeData()));
        return listT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(List list) {
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    private final o20.l.Section l(DrivingLicenceDocument data) {
        Label labelC;
        x0.Button button;
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        List<String> listK;
        MnemonicHeaderContainerDL mnemonicHeaderContainerDL;
        DrivingLicenceDataContainer drivingLicenceDataContainer2;
        DrivingLicenceDataContainer drivingLicenceDataContainer3;
        DrivingLicenceDataContainer drivingLicenceDataContainer4;
        DrivingLicenceDataContainer drivingLicenceDataContainer5;
        DrivingLicenceDataContainer drivingLicenceDataContainer6;
        DrivingLicenceDataContainer drivingLicenceDataContainer7;
        LocalDate releaseDate;
        DrivingLicenceDataContainer drivingLicenceDataContainer8;
        LocalDate expiredDate;
        Label labelC2 = this.labelProvider.c(fb0.a.J);
        Label labelC3 = this.labelProvider.c(fb0.a.G);
        DrivingLicenceScope scopeData = data.getScopeData();
        if (scopeData == null || (drivingLicenceDataContainer8 = scopeData.getDrivingLicenceDataContainer()) == null || (expiredDate = drivingLicenceDataContainer8.getExpiredDate()) == null || (labelC = mx.b.d(this.dateConverter.a(expiredDate), "expireDateValue")) == null) {
            labelC = this.labelProvider.c(fb0.a.K);
        }
        DefaultSingleCardData defaultSingleCardDataE = h.e(labelC3, labelC, null, 4, null);
        Label labelC4 = this.labelProvider.c(fb0.a.H);
        DrivingLicenceScope scopeData2 = data.getScopeData();
        DefaultSingleCardData defaultSingleCardDataE2 = h.e(labelC4, mx.b.d((scopeData2 == null || (drivingLicenceDataContainer7 = scopeData2.getDrivingLicenceDataContainer()) == null || (releaseDate = drivingLicenceDataContainer7.getReleaseDate()) == null) ? null : this.dateConverter.a(releaseDate), "releaseDateValue"), null, 4, null);
        SingleCardLabel singleCardLabelB = n50.l.b(this.labelProvider.c(fb0.a.I), null, null, 3, null);
        DrivingLicenceScope scopeData3 = data.getScopeData();
        Label labelD = mx.b.d((scopeData3 == null || (drivingLicenceDataContainer6 = scopeData3.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer6.getDocumentState(), "documentState  Value");
        DrivingLicenceScope scopeData4 = data.getScopeData();
        BodySection bodySection = new BodySection(singleCardLabelB, new n50.b.StatusBadge(new r50.a.WithIcon(null, labelD, null, 0, false, t.c((scopeData4 == null || (drivingLicenceDataContainer5 = scopeData4.getDrivingLicenceDataContainer()) == null) ? null : Boolean.valueOf(drivingLicenceDataContainer5.n()), Boolean.TRUE) ? r50.g.POSITIVE : r50.g.NEGATIVE, 13, null)), null, 4, null);
        DrivingLicenceScope scopeData5 = data.getScopeData();
        if (scopeData5 == null || (drivingLicenceDataContainer4 = scopeData5.getDrivingLicenceDataContainer()) == null) {
            button = null;
        } else {
            if (drivingLicenceDataContainer4.n() || !drivingLicenceDataContainer4.m()) {
                drivingLicenceDataContainer4 = null;
            }
            if (drivingLicenceDataContainer4 != null) {
                button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(fb0.a.f60723l), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: kb0.e
                    @Override // er.a
                    public final Object a() {
                        return f.m();
                    }
                }, 35, null));
            } else {
                button = null;
            }
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, button, null, 2815, null);
        Label labelC5 = this.labelProvider.c(fb0.a.F);
        DrivingLicenceScope scopeData6 = data.getScopeData();
        DefaultSingleCardData defaultSingleCardDataE3 = h.e(labelC5, mx.b.d((scopeData6 == null || (drivingLicenceDataContainer3 = scopeData6.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer3.getLongDocumentId(), "documentNumberValue"), null, 4, null);
        Label labelC6 = this.labelProvider.c(fb0.a.E);
        DrivingLicenceScope scopeData7 = data.getScopeData();
        DefaultSingleCardData defaultSingleCardDataE4 = h.e(labelC6, mx.b.d((scopeData7 == null || (drivingLicenceDataContainer2 = scopeData7.getDrivingLicenceDataContainer()) == null) ? null : drivingLicenceDataContainer2.getFormNumber(), "blankNumberValue"), null, 4, null);
        Label labelC7 = this.labelProvider.c(fb0.a.V);
        DrivingLicenceScope scopeData8 = data.getScopeData();
        DefaultSingleCardData defaultSingleCardDataE5 = h.e(labelC7, mx.b.d((scopeData8 == null || (mnemonicHeaderContainerDL = scopeData8.getMnemonicHeaderContainerDL()) == null) ? null : mnemonicHeaderContainerDL.getId(), "issuingAuthorityValue"), null, 4, null);
        Label labelC8 = this.labelProvider.c(fb0.a.O);
        DrivingLicenceScope scopeData9 = data.getScopeData();
        return new o20.l.Section(labelC2, v.q(defaultSingleCardDataE, defaultSingleCardDataE2, defaultSingleCardData, defaultSingleCardDataE3, defaultSingleCardDataE4, defaultSingleCardDataE5, h.e(labelC8, mx.b.d((scopeData9 == null || (drivingLicenceDataContainer = scopeData9.getDrivingLicenceDataContainer()) == null || (listK = drivingLicenceDataContainer.k()) == null) ? null : h.b(listK), "restrictionsValue"), null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    private final List<KeyValueData> q(DrivingLicenceDocument data) {
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        List<CategoryContainer> listC;
        MnemonicHeaderContainerDL mnemonicHeaderContainerDL;
        b0 pe4;
        DrivingLicenceDataContainer drivingLicenceDataContainer2;
        String birthplace;
        String upperCase;
        DrivingLicenceDataContainer drivingLicenceDataContainer3;
        LocalDate birthday;
        DrivingLicenceDataContainer drivingLicenceDataContainer4;
        String surname;
        DrivingLicenceDataContainer drivingLicenceDataContainer5;
        String name;
        DrivingLicenceScope scopeData = data.getScopeData();
        String strB = null;
        KeyValueData keyValueData = new KeyValueData(mx.b.d((scopeData == null || (drivingLicenceDataContainer5 = scopeData.getDrivingLicenceDataContainer()) == null || (name = drivingLicenceDataContainer5.getName()) == null) ? null : name.toUpperCase(Locale.ROOT), "firstNameValue"), this.labelProvider.c(fb0.a.f60737t), false, 4, null);
        DrivingLicenceScope scopeData2 = data.getScopeData();
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d((scopeData2 == null || (drivingLicenceDataContainer4 = scopeData2.getDrivingLicenceDataContainer()) == null || (surname = drivingLicenceDataContainer4.getSurname()) == null) ? null : surname.toUpperCase(Locale.ROOT), "surnameValue"), this.labelProvider.c(fb0.a.f60740w), false, 4, null);
        StringBuilder sb5 = new StringBuilder();
        DrivingLicenceScope scopeData3 = data.getScopeData();
        sb5.append((scopeData3 == null || (drivingLicenceDataContainer3 = scopeData3.getDrivingLicenceDataContainer()) == null || (birthday = drivingLicenceDataContainer3.getBirthday()) == null) ? null : this.dateConverter.a(birthday));
        DrivingLicenceScope scopeData4 = data.getScopeData();
        if (scopeData4 != null && (drivingLicenceDataContainer2 = scopeData4.getDrivingLicenceDataContainer()) != null && (birthplace = drivingLicenceDataContainer2.getBirthplace()) != null && (upperCase = birthplace.toUpperCase(Locale.ROOT)) != null) {
            sb5.append(" ");
            sb5.append(upperCase);
        }
        i0 i0Var = i0.f148189a;
        KeyValueData keyValueData3 = new KeyValueData(mx.b.d(sb5.toString(), "birthDateAndPlaceValue"), this.labelProvider.c(fb0.a.D), false, 4, null);
        DrivingLicenceScope scopeData5 = data.getScopeData();
        KeyValueData keyValueData4 = new KeyValueData(mx.b.d((scopeData5 == null || (mnemonicHeaderContainerDL = scopeData5.getMnemonicHeaderContainerDL()) == null || (pe4 = mnemonicHeaderContainerDL.getPe()) == null) ? null : c0.e(pe4), "peselValue"), this.labelProvider.c(fb0.a.f60739v), true);
        DrivingLicenceScope scopeData6 = data.getScopeData();
        if (scopeData6 != null && (drivingLicenceDataContainer = scopeData6.getDrivingLicenceDataContainer()) != null && (listC = drivingLicenceDataContainer.c()) != null) {
            List<CategoryContainer> list = listC;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CategoryContainer) it.next()).getCategoryName());
            }
            strB = h.b(arrayList);
        }
        return v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, new KeyValueData(mx.b.d(strB, "categoriesValue"), this.labelProvider.c(fb0.a.f60707d), false, 4, null));
    }

    private final Collection<o20.l> r(DrivingLicenceScope drivingLicence) {
        DrivingLicenceDataContainer drivingLicenceDataContainer;
        List<CategoryContainer> listC;
        ArrayList arrayList = new ArrayList();
        if (drivingLicence != null && (drivingLicenceDataContainer = drivingLicence.getDrivingLicenceDataContainer()) != null && (listC = drivingLicenceDataContainer.c()) != null) {
            arrayList.add(new o20.l.Section(this.labelProvider.c(fb0.a.f60707d), v.n()));
            List<CategoryContainer> list = listC;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                CategoryContainer categoryContainer = (CategoryContainer) obj;
                DefaultSingleCardData defaultSingleCardDataE = h.e(Label.f(this.labelProvider.c(fb0.a.N), String.valueOf(i15), null, 2, null), mx.b.d(this.dateConverter.a(categoryContainer.getFormReleaseDate()), "categoryAcquisitionDateValue" + i15), null, 4, null);
                DefaultSingleCardData defaultSingleCardDataE2 = h.e(Label.f(this.labelProvider.c(fb0.a.M), String.valueOf(i15), null, 2, null), mx.b.d(this.dateConverter.a(categoryContainer.getExpiredDate()), "categoryExpiryDateValue" + i15), null, 4, null);
                Label labelF = Label.f(this.labelProvider.c(fb0.a.O), String.valueOf(i15), null, 2, null);
                List<String> listB = categoryContainer.b();
                List listT = v.t(defaultSingleCardDataE, defaultSingleCardDataE2, h.e(labelF, mx.b.d(listB != null ? h.b(listB) : null, "categoryRestrictionsValue" + i15), null, 4, null));
                String categoryStatus = categoryContainer.getCategoryStatus();
                if (categoryStatus != null) {
                    listT.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(Label.f(this.labelProvider.c(fb0.a.P), String.valueOf(i15), null, 2, null), null, null, 3, null), new n50.b.StatusBadge(new r50.a.WithDot(null, mx.b.d(categoryStatus, "categoryStatusValue" + i15), null, 0, r50.f.NEGATIVE, 13, null)), null, 4, null), null, null, null, 3839, null));
                }
                arrayList2.add(new o20.l.Expandable(Label.f(this.labelProvider.e(fb0.a.L, mx.b.d(categoryContainer.getCategoryName(), "").getText()), String.valueOf(i15), null, 2, null), new CardListData(listT, null, false, null, null, 30, null)));
                i15 = i16;
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public n.a b(Params params) {
        m mVarD = params.l().d();
        if (mVarD instanceof m.ErrorLoading) {
            return new n.a.Error(((m.ErrorLoading) mVarD).getErrorVMSAdapter());
        }
        if (mVarD instanceof m.ErrorInitial) {
            return new n.a.Error(((m.ErrorInitial) mVarD).getErrorVMSAdapter());
        }
        if ((mVarD instanceof m.Initial) || (mVarD instanceof m.DeleteDocument)) {
            return n.a.c.f117526a;
        }
        if (mVarD instanceof m.g.ErrorUpdating) {
            return new n.a.Error(((m.g.ErrorUpdating) mVarD).getErrorVMSAdapter());
        }
        if ((mVarD instanceof m.g.Updating) || (mVarD instanceof m.g.Displaying)) {
            m.g gVar = (m.g) mVarD;
            return new n.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(fb0.a.Y), null, null, null, 28, null), null, null, null, null, 61, null), new BaseDocumentData(null, null, null, this.giloshMapper.b(new p20.c.Params(v.q(new u2.Flag(k.Poland, this.labelProvider.c(fb0.a.f60727n)), new u2.Hologram(null, c.f109757a, 1, null)), params.l(), o20.p.q.f140930c, gVar.getStateData().getImageBitmap(), this.labelProvider.c(fb0.a.f60738u), null, null, gVar.getStateData().getDrivingLicenceData().getDocumentStatus() == vf0.c.ACTIVE, b.f109756a[gVar.getStateData().getDrivingLicenceData().getDocumentStatus().ordinal()] == 1 ? this.labelProvider.c(fb0.a.f60736s) : this.labelProvider.c(fb0.a.f60733q), this.labelProvider.c(fb0.a.f60719j), params.i(), q(gVar.getStateData().getDrivingLicenceData()), null, null, params.a(), params.getDocumentVMS(), 12384, null)), h(gVar.getStateData().getDrivingLicenceData(), params, !gVar.getStateData().a().isEmpty()), v.e(new c30.b.c(null, null, null, this.labelProvider.c(fb0.a.f60722k0), null, null, null, 119, null)), v.q(new c30.b.c(null, null, null, this.labelProvider.c(fb0.a.X), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(fb0.a.f60717i), null, null, params.g(), 13, null)), 55, null), new c30.b.c(null, null, null, this.labelProvider.c(fb0.a.T), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(fb0.a.S), this.commonEndpoints.E(), LinkData.EnumC5775a.WEBSITE, false, params.h(), 17, null)), 55, null)), 7, null), gVar.getDialogVMSAdapter());
        }
        if (mVarD instanceof m.InfoPage) {
            return new n.a.InitializedInfoPage(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(fb0.a.f60721k), null, null, null, 28, null), null, null, null, null, 61, null), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(fb0.a.f60710e0)), new t40.a.C4874a(this.labelProvider.c(fb0.a.f60712f0)), new t40.a.C4874a(this.labelProvider.c(fb0.a.f60714g0)), new t40.a.C4874a(this.labelProvider.c(fb0.a.f60716h0)), new t40.a.C4874a(this.labelProvider.c(fb0.a.f60718i0)), new t40.a.C4874a(this.labelProvider.c(fb0.a.f60720j0)))), params.c());
        }
        if ((mVarD instanceof m.d.Details) || (mVarD instanceof m.d.List)) {
            return this.drivingLicenceHistoryMapper.b(new kb0.b.Params((m.d) mVarD, params.c(), params.f(), new er.a() { // from class: kb0.c
                @Override // er.a
                public final Object a() {
                    return f.u();
                }
            }));
        }
        throw new oq.p();
    }

    public final DialogData v(er.a<i0> onDeleteAction, er.a<i0> onCancelAction) {
        cb4.h.b bVar = cb4.h.b.f24985a;
        mx.c cVar = this.labelProvider;
        return new DialogData(bVar, cVar.e(fb0.a.B, cVar.c(fb0.a.C).getText()), this.labelProvider.c(fb0.a.A), new DialogButtonTextData(this.labelProvider.c(fb0.a.f60711f), null, onDeleteAction, 2, null), new DialogButtonTextData(this.labelProvider.c(fb0.a.f60705c), null, onCancelAction, 2, null), null, null, 96, null);
    }

    public final DialogData x(er.a<i0> onUpdateAction, er.a<i0> onCancelAction) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(fb0.a.f60743z), this.labelProvider.c(fb0.a.f60742y), new DialogButtonTextData(this.labelProvider.c(fb0.a.f60725m), null, onUpdateAction, 2, null), new DialogButtonTextData(this.labelProvider.c(fb0.a.f60705c), null, onCancelAction, 2, null), null, null, 96, null);
    }
}
