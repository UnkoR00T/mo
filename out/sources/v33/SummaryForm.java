package v33;

import java.util.List;
import k23.BusinessDetailsData;
import k23.DetailsModel;
import k23.OtherReportData;
import k23.PlaceOfPurchaseData;
import k23.ProductData;
import k23.ReportLocationDescription;
import k23.UserDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import tt0.BEReportCategory;
import tt0.BEReportSubCategory;

/* JADX INFO: renamed from: v33.h, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#JÔ\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bB\u0010J\u001a\u0004\bM\u0010LR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b0\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b4\u0010Q\u001a\u0004\b=\u0010RR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u001b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bK\u0010T\u001a\u0004\bW\u0010VR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b9\u0010YR\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bM\u0010Z\u001a\u0004\bS\u0010[¨\u0006\\"}, d2 = {"Lv33/h;", "", "Ltt0/g;", "reportCategoryModel", "Ltt0/h;", "reportSubType", "Lk23/g;", "detailsModel", "Lst3/b;", "place", "Lk23/h;", "otherReportData", "Lk23/k;", "providedMethodOfContact", "Lk23/j;", "productData", "Lk23/i;", "placeOfPurchaseData", "Lk23/b;", "sellerData", "supplierData", "Lk23/n;", "userDocumentData", "Lk23/l;", "locationDescription", "", "isStatementChecked", "showStatementError", "", "Lwx/i;", "files", "Ld60/j;", "Lv33/g$a;", "scrollInstance", "<init>", "(Ltt0/g;Ltt0/h;Lk23/g;Lst3/b;Lk23/h;Lk23/k;Lk23/j;Lk23/i;Lk23/b;Lk23/b;Lk23/n;Lk23/l;ZZLjava/util/List;Ld60/j;)V", "a", "(Ltt0/g;Ltt0/h;Lk23/g;Lst3/b;Lk23/h;Lk23/k;Lk23/j;Lk23/i;Lk23/b;Lk23/b;Lk23/n;Lk23/l;ZZLjava/util/List;Ld60/j;)Lv33/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ltt0/g;", "k", "()Ltt0/g;", "b", "Ltt0/h;", "l", "()Ltt0/h;", "c", "Lk23/g;", "()Lk23/g;", "d", "Lst3/b;", "g", "()Lst3/b;", "e", "Lk23/h;", "f", "()Lk23/h;", "Lk23/k;", "j", "()Lk23/k;", "Lk23/j;", "i", "()Lk23/j;", "h", "Lk23/i;", "()Lk23/i;", "Lk23/b;", "n", "()Lk23/b;", "p", "Lk23/n;", "q", "()Lk23/n;", "Lk23/l;", "()Lk23/l;", "m", "Z", "r", "()Z", "o", "Ljava/util/List;", "()Ljava/util/List;", "Ld60/j;", "()Ld60/j;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryForm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportCategory reportCategoryModel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportSubCategory reportSubType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DetailsModel detailsModel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressData place;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OtherReportData otherReportData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final k23.k providedMethodOfContact;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductData productData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlaceOfPurchaseData placeOfPurchaseData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final BusinessDetailsData sellerData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final BusinessDetailsData supplierData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserDocumentData userDocumentData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReportLocationDescription locationDescription;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isStatementChecked;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showStatementError;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<wx.i> files;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<g.a> scrollInstance;

    /* JADX WARN: Multi-variable type inference failed */
    public SummaryForm(BEReportCategory bEReportCategory, BEReportSubCategory bEReportSubCategory, DetailsModel detailsModel, AddressData addressData, OtherReportData otherReportData, k23.k kVar, ProductData productData, PlaceOfPurchaseData placeOfPurchaseData, BusinessDetailsData businessDetailsData, BusinessDetailsData businessDetailsData2, UserDocumentData userDocumentData, ReportLocationDescription reportLocationDescription, boolean z15, boolean z16, List<? extends wx.i> list, d60.j<g.a> jVar) {
        this.reportCategoryModel = bEReportCategory;
        this.reportSubType = bEReportSubCategory;
        this.detailsModel = detailsModel;
        this.place = addressData;
        this.otherReportData = otherReportData;
        this.providedMethodOfContact = kVar;
        this.productData = productData;
        this.placeOfPurchaseData = placeOfPurchaseData;
        this.sellerData = businessDetailsData;
        this.supplierData = businessDetailsData2;
        this.userDocumentData = userDocumentData;
        this.locationDescription = reportLocationDescription;
        this.isStatementChecked = z15;
        this.showStatementError = z16;
        this.files = list;
        this.scrollInstance = jVar;
    }

    public final SummaryForm a(BEReportCategory reportCategoryModel, BEReportSubCategory reportSubType, DetailsModel detailsModel, AddressData place, OtherReportData otherReportData, k23.k providedMethodOfContact, ProductData productData, PlaceOfPurchaseData placeOfPurchaseData, BusinessDetailsData sellerData, BusinessDetailsData supplierData, UserDocumentData userDocumentData, ReportLocationDescription locationDescription, boolean isStatementChecked, boolean showStatementError, List<? extends wx.i> files, d60.j<g.a> scrollInstance) {
        return new SummaryForm(reportCategoryModel, reportSubType, detailsModel, place, otherReportData, providedMethodOfContact, productData, placeOfPurchaseData, sellerData, supplierData, userDocumentData, locationDescription, isStatementChecked, showStatementError, files, scrollInstance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DetailsModel getDetailsModel() {
        return this.detailsModel;
    }

    public final List<wx.i> d() {
        return this.files;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ReportLocationDescription getLocationDescription() {
        return this.locationDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryForm)) {
            return false;
        }
        SummaryForm summaryForm = (SummaryForm) other;
        return fr.t.c(this.reportCategoryModel, summaryForm.reportCategoryModel) && fr.t.c(this.reportSubType, summaryForm.reportSubType) && fr.t.c(this.detailsModel, summaryForm.detailsModel) && fr.t.c(this.place, summaryForm.place) && fr.t.c(this.otherReportData, summaryForm.otherReportData) && fr.t.c(this.providedMethodOfContact, summaryForm.providedMethodOfContact) && fr.t.c(this.productData, summaryForm.productData) && fr.t.c(this.placeOfPurchaseData, summaryForm.placeOfPurchaseData) && fr.t.c(this.sellerData, summaryForm.sellerData) && fr.t.c(this.supplierData, summaryForm.supplierData) && fr.t.c(this.userDocumentData, summaryForm.userDocumentData) && fr.t.c(this.locationDescription, summaryForm.locationDescription) && this.isStatementChecked == summaryForm.isStatementChecked && this.showStatementError == summaryForm.showStatementError && fr.t.c(this.files, summaryForm.files) && fr.t.c(this.scrollInstance, summaryForm.scrollInstance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OtherReportData getOtherReportData() {
        return this.otherReportData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AddressData getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final PlaceOfPurchaseData getPlaceOfPurchaseData() {
        return this.placeOfPurchaseData;
    }

    public int hashCode() {
        int iHashCode = this.reportCategoryModel.hashCode() * 31;
        BEReportSubCategory bEReportSubCategory = this.reportSubType;
        int iHashCode2 = (iHashCode + (bEReportSubCategory == null ? 0 : bEReportSubCategory.hashCode())) * 31;
        DetailsModel detailsModel = this.detailsModel;
        int iHashCode3 = (iHashCode2 + (detailsModel == null ? 0 : detailsModel.hashCode())) * 31;
        AddressData addressData = this.place;
        int iHashCode4 = (iHashCode3 + (addressData == null ? 0 : addressData.hashCode())) * 31;
        OtherReportData otherReportData = this.otherReportData;
        int iHashCode5 = (iHashCode4 + (otherReportData == null ? 0 : otherReportData.hashCode())) * 31;
        k23.k kVar = this.providedMethodOfContact;
        int iHashCode6 = (iHashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        ProductData productData = this.productData;
        int iHashCode7 = (iHashCode6 + (productData == null ? 0 : productData.hashCode())) * 31;
        PlaceOfPurchaseData placeOfPurchaseData = this.placeOfPurchaseData;
        int iHashCode8 = (iHashCode7 + (placeOfPurchaseData == null ? 0 : placeOfPurchaseData.hashCode())) * 31;
        BusinessDetailsData businessDetailsData = this.sellerData;
        int iHashCode9 = (iHashCode8 + (businessDetailsData == null ? 0 : businessDetailsData.hashCode())) * 31;
        BusinessDetailsData businessDetailsData2 = this.supplierData;
        int iHashCode10 = (iHashCode9 + (businessDetailsData2 == null ? 0 : businessDetailsData2.hashCode())) * 31;
        UserDocumentData userDocumentData = this.userDocumentData;
        int iHashCode11 = (iHashCode10 + (userDocumentData == null ? 0 : userDocumentData.hashCode())) * 31;
        ReportLocationDescription reportLocationDescription = this.locationDescription;
        int iHashCode12 = (((((((iHashCode11 + (reportLocationDescription == null ? 0 : reportLocationDescription.hashCode())) * 31) + Boolean.hashCode(this.isStatementChecked)) * 31) + Boolean.hashCode(this.showStatementError)) * 31) + this.files.hashCode()) * 31;
        d60.j<g.a> jVar = this.scrollInstance;
        return iHashCode12 + (jVar != null ? jVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ProductData getProductData() {
        return this.productData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k23.k getProvidedMethodOfContact() {
        return this.providedMethodOfContact;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final BEReportCategory getReportCategoryModel() {
        return this.reportCategoryModel;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final BEReportSubCategory getReportSubType() {
        return this.reportSubType;
    }

    public final d60.j<g.a> m() {
        return this.scrollInstance;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final BusinessDetailsData getSellerData() {
        return this.sellerData;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getShowStatementError() {
        return this.showStatementError;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final BusinessDetailsData getSupplierData() {
        return this.supplierData;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final UserDocumentData getUserDocumentData() {
        return this.userDocumentData;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsStatementChecked() {
        return this.isStatementChecked;
    }

    public String toString() {
        return "SummaryForm(reportCategoryModel=" + this.reportCategoryModel + ", reportSubType=" + this.reportSubType + ", detailsModel=" + this.detailsModel + ", place=" + this.place + ", otherReportData=" + this.otherReportData + ", providedMethodOfContact=" + this.providedMethodOfContact + ", productData=" + this.productData + ", placeOfPurchaseData=" + this.placeOfPurchaseData + ", sellerData=" + this.sellerData + ", supplierData=" + this.supplierData + ", userDocumentData=" + this.userDocumentData + ", locationDescription=" + this.locationDescription + ", isStatementChecked=" + this.isStatementChecked + ", showStatementError=" + this.showStatementError + ", files=" + this.files + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ SummaryForm(BEReportCategory bEReportCategory, BEReportSubCategory bEReportSubCategory, DetailsModel detailsModel, AddressData addressData, OtherReportData otherReportData, k23.k kVar, ProductData productData, PlaceOfPurchaseData placeOfPurchaseData, BusinessDetailsData businessDetailsData, BusinessDetailsData businessDetailsData2, UserDocumentData userDocumentData, ReportLocationDescription reportLocationDescription, boolean z15, boolean z16, List list, d60.j jVar, int i15, fr.k kVar2) {
        this(bEReportCategory, bEReportSubCategory, detailsModel, addressData, otherReportData, kVar, productData, placeOfPurchaseData, businessDetailsData, businessDetailsData2, userDocumentData, reportLocationDescription, (i15 & PKIFailureInfo.certConfirmed) != 0 ? false : z15, (i15 & PKIFailureInfo.certRevoked) != 0 ? false : z16, list, jVar);
    }
}
