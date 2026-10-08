package w33;

import d60.ScrollControllerData;
import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.Arrays;
import java.util.List;
import k23.BusinessDetailsData;
import k23.DetailsModel;
import k23.OtherReportData;
import k23.PlaceOfPurchaseData;
import k23.ProductData;
import k23.ReportLocationDescription;
import k23.UserDocumentData;
import k23.k;
import k23.m;
import k23.o;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import r30.CheckBoxRowData;
import st3.AddressData;
import st3.AddressTerytDetail;
import tt0.BEReportCategory;
import tt0.BEReportSubCategory;
import v33.g;
import v33.i;
import w30.CheckBoxSingleData;
import x33.SummaryContentData;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001JB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J'\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00122\u0006\u00100\u001a\u00020/2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J#\u0010<\u001a\u0004\u0018\u00010\u00182\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020#2\b\b\u0001\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ-\u0010E\u001a\u00020#2\b\b\u0001\u0010?\u001a\u00020>2\u0012\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020C0B\"\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0018\u0010H\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lw33/c;", "Lxw/f;", "Lw33/c$a;", "Lv33/i$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lez/e;Lu04/a;)V", "Ltt0/g;", "reportCategoryModel", "Ltt0/h;", "reportSubType", "Lk23/g;", "detailsModel", "", "Lwx/i;", "files", "Lkotlin/Function0;", "Loq/i0;", "onMoreFilesClicked", "Ln30/b;", "i", "(Ltt0/g;Ltt0/h;Lk23/g;Ljava/util/List;Ler/a;)Ln30/b;", "Lk23/j;", "productData", "s", "(Lk23/j;)Ln30/b;", "Lk23/i;", "placeOfPurchaseData", "r", "(Lk23/i;)Ln30/b;", "Lmx/a;", "nameTitle", "Lk23/b;", "data", "h", "(Lmx/a;Lk23/b;)Ln30/b;", "Lst3/b;", "address", "Lk23/l;", "locationDescription", "q", "(Lst3/b;Lk23/l;)Ln30/b;", "", "testTag", "Ln50/g;", "f", "(Ljava/lang/String;Lst3/b;)Ljava/util/List;", "Lk23/h;", "report", "l", "(Lk23/h;)Ln30/b;", "Lk23/k;", "providedMethodOfContact", "Lk23/n;", "userDocumentData", "m", "(Lk23/k;Lk23/n;)Ln30/b;", "", "stringId", "z", "(I)Lmx/a;", "", "", "arg", "E", "(I[Ljava/lang/Object;)Lmx/a;", "params", "u", "(Lw33/c$a;)Lv33/i$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "c", "Lu04/a;", "getCommonEndpoints", "()Lu04/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: w33.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u0019\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u001d\u0010$R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b!\u0010$¨\u0006&"}, d2 = {"Lw33/c$a;", "", "Lv33/g;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onOpenUrl", "Lkotlin/Function0;", "onSendReport", "onBack", "onCloseClick", "", "onStatementCheckedClicked", "onMoreFilesClicked", "<init>", "(Lv33/g;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lv33/g;", "g", "()Lv33/g;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "e", "()Ler/a;", "f", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOpenUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendReport;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementCheckedClicked;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreFilesClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, l<? super String, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Boolean, i0> lVar2, er.a<i0> aVar4) {
            this.state = gVar;
            this.onOpenUrl = lVar;
            this.onSendReport = aVar;
            this.onBack = aVar2;
            this.onCloseClick = aVar3;
            this.onStatementCheckedClicked = lVar2;
            this.onMoreFilesClicked = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final er.a<i0> c() {
            return this.onMoreFilesClicked;
        }

        public final l<String, i0> d() {
            return this.onOpenUrl;
        }

        public final er.a<i0> e() {
            return this.onSendReport;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onOpenUrl, params.onOpenUrl) && t.c(this.onSendReport, params.onSendReport) && t.c(this.onBack, params.onBack) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onStatementCheckedClicked, params.onStatementCheckedClicked) && t.c(this.onMoreFilesClicked, params.onMoreFilesClicked);
        }

        public final l<Boolean, i0> f() {
            return this.onStatementCheckedClicked;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final g getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onOpenUrl.hashCode()) * 31) + this.onSendReport.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onStatementCheckedClicked.hashCode()) * 31) + this.onMoreFilesClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onOpenUrl=" + this.onOpenUrl + ", onSendReport=" + this.onSendReport + ", onBack=" + this.onBack + ", onCloseClick=" + this.onCloseClick + ", onStatementCheckedClicked=" + this.onStatementCheckedClicked + ", onMoreFilesClicked=" + this.onMoreFilesClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f210195a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.CARRIAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f210195a = iArr;
        }
    }

    public c(mx.c cVar, e eVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.commonEndpoints = aVar;
    }

    private final Label E(int stringId, Object... arg) {
        return this.labelProvider.e(stringId, Arrays.copyOf(arg, arg.length));
    }

    private final List<DefaultSingleCardData> f(String testTag, AddressData address) {
        AddressTerytDetail street;
        AddressTerytDetail city;
        AddressTerytDetail community;
        AddressTerytDetail county;
        AddressTerytDetail province;
        return v.q(new DefaultSingleCardData(testTag + "_province", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.N), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d((address == null || (province = address.getProvince()) == null) ? null : province.getName(), "province"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_county", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80163o), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d((address == null || (county = address.getCounty()) == null) ? null : county.getName(), "county"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_community", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80151k), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d((address == null || (community = address.getCommunity()) == null) ? null : community.getName(), "community"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_city", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80145i), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d((address == null || (city = address.getCity()) == null) ? null : city.getName(), "city"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_postcode", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.M), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address != null ? address.getPostalCode() : null, "postcode"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_street", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.W), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d((address == null || (street = address.getStreet()) == null) ? null : street.getName(), "street"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_building_number", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80130d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address != null ? address.getBuildingNumber() : null, "building_number"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(testTag + "_apartment_number", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80124b), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(address != null ? address.getApartmentNumber() : null, "apartment_number"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
    }

    private final CardListData h(Label nameTitle, BusinessDetailsData data) {
        return new CardListData(v.L0(v.e(new DefaultSingleCardData("card" + nameTitle.getTag(), null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(nameTitle, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(data.getNameOrPlace(), "name"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), f(nameTitle.getTag(), data.getAddress())), null, false, null, null, 30, null);
    }

    private final CardListData i(BEReportCategory reportCategoryModel, BEReportSubCategory reportSubType, DetailsModel detailsModel, List<? extends wx.i> files, er.a<i0> onMoreFilesClicked) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("reportCategory", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80168p1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(reportCategoryModel.getName(), "reportCategory"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("reportCategory", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80162n1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(reportSubType != null ? reportSubType.getName() : null, "reportCategory"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData("description", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80159m1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(detailsModel.getDescription(), "description"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(h23.b.f80169q), null, null, 0, 0, null, 62, null);
        fz.b.OffsetDateTime offsetDateTimeC = detailsModel.c();
        return new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData("date", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(offsetDateTimeC != null ? this.dateFormatter.d(offsetDateTimeC, fz.c.DOTTED_PLUS_HOUR) : null, "date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("attachments", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80127c), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(files.isEmpty() ? mx.b.b("-", "attachments") : mx.b.b(String.valueOf(files.size()), "attachments"), null, null, 0, 0, null, 62, null)), null, 4, null), null, !files.isEmpty() ? new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(h23.b.G), null, 2, null), d.a.f107773a, null, onMoreFilesClicked, 35, null)) : null, null, 2814, null)), null, false, null, null, 30, null);
    }

    private final CardListData l(OtherReportData report) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("institution_name", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80186v1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(report.getInstitutionName(), "institution_name"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("report_number", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80189w1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(report.getReportNumber(), "report_number"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(h23.b.f80183u1), null, null, 0, 0, null, 62, null);
        fz.b.LocalDate reportDate = report.getReportDate();
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData("report_date", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(reportDate != null ? this.dateFormatter.d(reportDate, fz.c.DOTTED) : null, "report_date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01eb  */
    private final CardListData m(k providedMethodOfContact, UserDocumentData userDocumentData) {
        List listN;
        if (t.c(providedMethodOfContact, k.a.f107699a)) {
            return null;
        }
        if (!(providedMethodOfContact instanceof k.Data)) {
            throw new p();
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("firstname", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.A), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(userDocumentData != null ? userDocumentData.getFirstName() : null, ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("lastname", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.F), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(userDocumentData != null ? userDocumentData.getSurname() : null, ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        k.Data data = (k.Data) providedMethodOfContact;
        String edorAddress = data.getEdorAddress();
        List listS = v.s(defaultSingleCardData, defaultSingleCardData2, edorAddress != null ? new DefaultSingleCardData("edorAddress", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80175s), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(edorAddress, ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null) : null);
        k.Data.PhoneAndEmail phoneAndEmail = data.getPhoneAndEmail();
        if (phoneAndEmail != null) {
            SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(h23.b.J), null, null, 0, 0, null, 62, null);
            PhoneNumber phoneNumber = phoneAndEmail.getPhoneNumber();
            listN = v.q(new DefaultSingleCardData("phoneNumber", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(phoneNumber != null ? phoneNumber.f() : null, ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("emailAddress", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80181u), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(c0.e(phoneAndEmail.getEmail()), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
            if (listN == null) {
                listN = v.n();
            }
        } else {
            listN = v.n();
        }
        return new CardListData(v.A(v.q(listS, listN)), null, false, null, null, 30, null);
    }

    private final CardListData q(AddressData address, ReportLocationDescription locationDescription) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f210195a[locationDescription.getType().ordinal()];
        if (i16 == 1) {
            i15 = h23.b.f80180t1;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = h23.b.f80177s1;
        }
        return new CardListData(v.L0(v.r(new DefaultSingleCardData("location_description", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(i15), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(locationDescription.getName(), "location_description"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), f("location", address)), null, false, null, null, 30, null);
    }

    private final CardListData r(PlaceOfPurchaseData placeOfPurchaseData) {
        return new CardListData(v.e(new DefaultSingleCardData("webside", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.f80198z1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(placeOfPurchaseData.getWebAddress(), "productName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    private final CardListData s(ProductData productData) {
        return new CardListData(v.q(new DefaultSingleCardData("productName", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.C1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(productData.getName(), "productName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("batchNumber", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.A1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(productData.getBatchNumber(), "batchNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("expiryDate", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(h23.b.B1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(productData.getExpiryDate(), "expiryDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, boolean z15) {
        params.f().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x() {
        return i0.f148189a;
    }

    private final Label z(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public i.a b(final Params params) {
        r30.b error;
        g state = params.getState();
        if (state instanceof g.c.SendingReportError) {
            return new i.a.Error(params.a(), ((g.c.SendingReportError) state).getErrorVMSAdapter());
        }
        boolean z15 = state instanceof g.c.Dialog;
        if (!z15 && !(state instanceof g.c.Screen) && !(state instanceof g.c.SendingReport)) {
            if (state instanceof g.Success) {
                return new i.a.Success(new er.a() { // from class: w33.b
                    @Override // er.a
                    public final Object a() {
                        return c.x();
                    }
                }, new BaseScaffoldData(null, null, null, null, null, null, 63, null), new IconPageData(j.b.c.f164688d, E(h23.b.f80153k1, ((g.Success) state).getResponse().getInitiativeNumber()), null, null, new SummaryContentData(z(h23.b.f80156l1), mx.b.b(((g.Success) params.getState()).getResponse().getCurrentUnitName(), "UnitName"), new d40.b.C0864b(null, h23.a.f80120a, d40.i.C0865i.f39712e, null, null, null, 41, null)), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(z(h23.b.f80148j), null, 2, null), d.a.f107773a, null, params.b(), 35, null), null, null, 6, null), true, 12, null));
            }
            throw new p();
        }
        g.c.Dialog dialog = z15 ? (g.c.Dialog) state : null;
        cb4.i dialogVMSAdapter = dialog != null ? dialog.getDialogVMSAdapter() : null;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), z(h23.b.X), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(((g.c) params.getState()).getForm().m(), false, false, 6, null), 29, null);
        Label labelZ = z(h23.b.M1);
        Label labelZ2 = z(h23.b.f80165o1);
        Label labelZ3 = z(h23.b.f80174r1);
        Label labelZ4 = z(h23.b.f80171q1);
        LinkData.EnumC5775a enumC5775a = LinkData.EnumC5775a.WEBSITE;
        c30.b.c cVar = new c30.b.c(null, null, null, labelZ3, null, null, new c30.a.Link(new LinkData("summary_info", labelZ4, this.commonEndpoints.g0(), enumC5775a, false, params.d(), 16, null)), 55, null);
        g.c cVar2 = (g.c) state;
        DetailsModel detailsModel = cVar2.getForm().getDetailsModel();
        CardListData cardListDataI = detailsModel != null ? i(cVar2.getForm().getReportCategoryModel(), cVar2.getForm().getReportSubType(), detailsModel, cVar2.getForm().d(), params.c()) : null;
        Label labelZ5 = z(h23.b.D1);
        ProductData productData = cVar2.getForm().getProductData();
        CardListData cardListDataS = productData != null ? s(productData) : null;
        Label labelZ6 = z(h23.b.f80195y1);
        PlaceOfPurchaseData placeOfPurchaseData = cVar2.getForm().getPlaceOfPurchaseData();
        CardListData cardListDataR = placeOfPurchaseData != null ? r(placeOfPurchaseData) : null;
        PlaceOfPurchaseData placeOfPurchaseData2 = cVar2.getForm().getPlaceOfPurchaseData();
        o webAddressAnswer = placeOfPurchaseData2 != null ? placeOfPurchaseData2.getWebAddressAnswer() : null;
        o oVar = o.YES;
        if (webAddressAnswer != oVar) {
            cardListDataR = null;
        }
        Label labelZ7 = z(h23.b.H1);
        BusinessDetailsData sellerData = cVar2.getForm().getSellerData();
        CardListData cardListDataH = sellerData != null ? h(z(h23.b.G1), sellerData) : null;
        PlaceOfPurchaseData placeOfPurchaseData3 = cVar2.getForm().getPlaceOfPurchaseData();
        if ((placeOfPurchaseData3 != null ? placeOfPurchaseData3.getWebAddressAnswer() : null) != oVar) {
            cardListDataH = null;
        }
        Label labelZ8 = z(h23.b.F1);
        BusinessDetailsData sellerData2 = cVar2.getForm().getSellerData();
        CardListData cardListDataH2 = sellerData2 != null ? h(z(h23.b.E1), sellerData2) : null;
        PlaceOfPurchaseData placeOfPurchaseData4 = cVar2.getForm().getPlaceOfPurchaseData();
        if ((placeOfPurchaseData4 != null ? placeOfPurchaseData4.getWebAddressAnswer() : null) != o.NO) {
            cardListDataH2 = null;
        }
        Label labelZ9 = z(h23.b.J1);
        BusinessDetailsData supplierData = cVar2.getForm().getSupplierData();
        CardListData cardListDataH3 = supplierData != null ? h(z(h23.b.I1), supplierData) : null;
        Label labelZ10 = z(h23.b.L);
        ReportLocationDescription locationDescription = cVar2.getForm().getLocationDescription();
        CardListData cardListDataQ = locationDescription != null ? q(cVar2.getForm().getPlace(), locationDescription) : null;
        Label labelZ11 = z(h23.b.f80192x1);
        OtherReportData otherReportData = cVar2.getForm().getOtherReportData();
        CardListData cardListDataL = otherReportData != null ? l(otherReportData) : null;
        CardListData cardListData = cardListDataR;
        Label labelZ12 = z(h23.b.L1);
        k providedMethodOfContact = cVar2.getForm().getProvidedMethodOfContact();
        CardListData cardListDataM = providedMethodOfContact != null ? m(providedMethodOfContact, cVar2.getForm().getUserDocumentData()) : null;
        CardListData cardListData2 = cardListDataH;
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(z(h23.b.S), null, 2, null), d.a.f107773a, null, params.e(), 35, null);
        Label labelZ13 = z(h23.b.T);
        g.a aVar = g.a.f203523a;
        boolean showStatementError = cVar2.getForm().getShowStatementError();
        if (showStatementError) {
            error = new r30.b.Error(null, z(h23.b.U), 1, null);
        } else {
            if (showStatementError) {
                throw new p();
            }
            error = r30.b.a.f171263a;
        }
        return new i.a.Summary(params.a(), dialogVMSAdapter, baseScaffoldData, labelZ, cVar, buttonData, labelZ2, cardListDataI, labelZ10, cardListDataQ, labelZ11, cardListDataL, labelZ5, cardListDataS, labelZ6, cardListData, labelZ7, cardListData2, labelZ8, cardListDataH2, labelZ9, cardListDataH3, labelZ12, cardListDataM, labelZ13, new CheckBoxSingleData(new CheckBoxRowData(null, cVar2.getForm().getIsStatementChecked(), new l() { // from class: w33.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.v(params, ((Boolean) obj).booleanValue());
            }
        }, z(h23.b.K1), null, null, new r30.d.Link(new LinkData("summary_statement_link", z(h23.b.B), this.commonEndpoints.k(), enumC5775a, false, params.d(), 16, null)), null, 177, null), error, null, false, aVar, 12, null));
    }
}
