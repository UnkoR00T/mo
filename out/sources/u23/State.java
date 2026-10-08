package u23;

import java.util.List;
import k23.DetailsModel;
import k23.OtherReportData;
import k23.Place;
import k23.Product;
import p071kotlin.Metadata;
import tt0.BEAttachmentsConfiguration;
import tt0.BEReportCategory;
import tt0.BEReportSubCategory;

/* JADX INFO: renamed from: u23.f0, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ \u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b/\u0010<R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b1\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bA\u0010F\u001a\u0004\b:\u0010GR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bD\u0010H\u001a\u0004\b7\u0010I¨\u0006J"}, d2 = {"Lu23/f0;", "", "Ltt0/g;", "selectedReportCategory", "Ltt0/h;", "selectedReportSubType", "Lk23/h;", "otherReportData", "Lk23/g;", "details", "Ltt0/b;", "attachmentsConfiguration", "", "Lwx/i;", "attachments", "Ldx/i;", "Loq/i0;", "", "edorAddressEither", "Lk23/k$b$a;", "phoneAndEmail", "Lk23/k;", "providedMethodOfContact", "Lk23/e;", "categoryProduct", "Lk23/d;", "categoryPlace", "<init>", "(Ltt0/g;Ltt0/h;Lk23/h;Lk23/g;Ltt0/b;Ljava/util/List;Ldx/i;Lk23/k$b$a;Lk23/k;Lk23/e;Lk23/d;)V", "a", "(Ltt0/g;Ltt0/h;Lk23/h;Lk23/g;Ltt0/b;Ljava/util/List;Ldx/i;Lk23/k$b$a;Lk23/k;Lk23/e;Lk23/d;)Lu23/f0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltt0/g;", "l", "()Ltt0/g;", "b", "Ltt0/h;", "m", "()Ltt0/h;", "c", "Lk23/h;", "i", "()Lk23/h;", "d", "Lk23/g;", "g", "()Lk23/g;", "e", "Ltt0/b;", "()Ltt0/b;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Ldx/i;", "h", "()Ldx/i;", "Lk23/k$b$a;", "j", "()Lk23/k$b$a;", "Lk23/k;", "k", "()Lk23/k;", "Lk23/e;", "()Lk23/e;", "Lk23/d;", "()Lk23/d;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportCategory selectedReportCategory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEReportSubCategory selectedReportSubType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OtherReportData otherReportData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DetailsModel details;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEAttachmentsConfiguration attachmentsConfiguration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<wx.i> attachments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final dx.i<oq.i0, String> edorAddressEither;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final k23.k.Data.PhoneAndEmail phoneAndEmail;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final k23.k providedMethodOfContact;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Product categoryProduct;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Place categoryPlace;

    public State() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, BEReportCategory bEReportCategory, BEReportSubCategory bEReportSubCategory, OtherReportData otherReportData, DetailsModel detailsModel, BEAttachmentsConfiguration bEAttachmentsConfiguration, List list, dx.i iVar, k23.k.Data.PhoneAndEmail phoneAndEmail, k23.k kVar, Product product, Place place, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEReportCategory = state.selectedReportCategory;
        }
        if ((i15 & 2) != 0) {
            bEReportSubCategory = state.selectedReportSubType;
        }
        if ((i15 & 4) != 0) {
            otherReportData = state.otherReportData;
        }
        if ((i15 & 8) != 0) {
            detailsModel = state.details;
        }
        if ((i15 & 16) != 0) {
            bEAttachmentsConfiguration = state.attachmentsConfiguration;
        }
        if ((i15 & 32) != 0) {
            list = state.attachments;
        }
        if ((i15 & 64) != 0) {
            iVar = state.edorAddressEither;
        }
        if ((i15 & 128) != 0) {
            phoneAndEmail = state.phoneAndEmail;
        }
        if ((i15 & 256) != 0) {
            kVar = state.providedMethodOfContact;
        }
        if ((i15 & 512) != 0) {
            product = state.categoryProduct;
        }
        if ((i15 & 1024) != 0) {
            place = state.categoryPlace;
        }
        Product product2 = product;
        Place place2 = place;
        k23.k.Data.PhoneAndEmail phoneAndEmail2 = phoneAndEmail;
        k23.k kVar2 = kVar;
        List list2 = list;
        dx.i iVar2 = iVar;
        BEAttachmentsConfiguration bEAttachmentsConfiguration2 = bEAttachmentsConfiguration;
        OtherReportData otherReportData2 = otherReportData;
        return state.a(bEReportCategory, bEReportSubCategory, otherReportData2, detailsModel, bEAttachmentsConfiguration2, list2, iVar2, phoneAndEmail2, kVar2, product2, place2);
    }

    public final State a(BEReportCategory selectedReportCategory, BEReportSubCategory selectedReportSubType, OtherReportData otherReportData, DetailsModel details, BEAttachmentsConfiguration attachmentsConfiguration, List<? extends wx.i> attachments, dx.i<oq.i0, String> edorAddressEither, k23.k.Data.PhoneAndEmail phoneAndEmail, k23.k providedMethodOfContact, Product categoryProduct, Place categoryPlace) {
        return new State(selectedReportCategory, selectedReportSubType, otherReportData, details, attachmentsConfiguration, attachments, edorAddressEither, phoneAndEmail, providedMethodOfContact, categoryProduct, categoryPlace);
    }

    public final List<wx.i> c() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEAttachmentsConfiguration getAttachmentsConfiguration() {
        return this.attachmentsConfiguration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Place getCategoryPlace() {
        return this.categoryPlace;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.selectedReportCategory, state.selectedReportCategory) && fr.t.c(this.selectedReportSubType, state.selectedReportSubType) && fr.t.c(this.otherReportData, state.otherReportData) && fr.t.c(this.details, state.details) && fr.t.c(this.attachmentsConfiguration, state.attachmentsConfiguration) && fr.t.c(this.attachments, state.attachments) && fr.t.c(this.edorAddressEither, state.edorAddressEither) && fr.t.c(this.phoneAndEmail, state.phoneAndEmail) && fr.t.c(this.providedMethodOfContact, state.providedMethodOfContact) && fr.t.c(this.categoryProduct, state.categoryProduct) && fr.t.c(this.categoryPlace, state.categoryPlace);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Product getCategoryProduct() {
        return this.categoryProduct;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DetailsModel getDetails() {
        return this.details;
    }

    public final dx.i<oq.i0, String> h() {
        return this.edorAddressEither;
    }

    public int hashCode() {
        BEReportCategory bEReportCategory = this.selectedReportCategory;
        int iHashCode = (bEReportCategory == null ? 0 : bEReportCategory.hashCode()) * 31;
        BEReportSubCategory bEReportSubCategory = this.selectedReportSubType;
        int iHashCode2 = (iHashCode + (bEReportSubCategory == null ? 0 : bEReportSubCategory.hashCode())) * 31;
        OtherReportData otherReportData = this.otherReportData;
        int iHashCode3 = (iHashCode2 + (otherReportData == null ? 0 : otherReportData.hashCode())) * 31;
        DetailsModel detailsModel = this.details;
        int iHashCode4 = (iHashCode3 + (detailsModel == null ? 0 : detailsModel.hashCode())) * 31;
        BEAttachmentsConfiguration bEAttachmentsConfiguration = this.attachmentsConfiguration;
        int iHashCode5 = (((iHashCode4 + (bEAttachmentsConfiguration == null ? 0 : bEAttachmentsConfiguration.hashCode())) * 31) + this.attachments.hashCode()) * 31;
        dx.i<oq.i0, String> iVar = this.edorAddressEither;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k23.k.Data.PhoneAndEmail phoneAndEmail = this.phoneAndEmail;
        int iHashCode7 = (iHashCode6 + (phoneAndEmail == null ? 0 : phoneAndEmail.hashCode())) * 31;
        k23.k kVar = this.providedMethodOfContact;
        return ((((iHashCode7 + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.categoryProduct.hashCode()) * 31) + this.categoryPlace.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final OtherReportData getOtherReportData() {
        return this.otherReportData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k23.k.Data.PhoneAndEmail getPhoneAndEmail() {
        return this.phoneAndEmail;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final k23.k getProvidedMethodOfContact() {
        return this.providedMethodOfContact;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final BEReportCategory getSelectedReportCategory() {
        return this.selectedReportCategory;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final BEReportSubCategory getSelectedReportSubType() {
        return this.selectedReportSubType;
    }

    public String toString() {
        return "State(selectedReportCategory=" + this.selectedReportCategory + ", selectedReportSubType=" + this.selectedReportSubType + ", otherReportData=" + this.otherReportData + ", details=" + this.details + ", attachmentsConfiguration=" + this.attachmentsConfiguration + ", attachments=" + this.attachments + ", edorAddressEither=" + this.edorAddressEither + ", phoneAndEmail=" + this.phoneAndEmail + ", providedMethodOfContact=" + this.providedMethodOfContact + ", categoryProduct=" + this.categoryProduct + ", categoryPlace=" + this.categoryPlace + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public State(BEReportCategory bEReportCategory, BEReportSubCategory bEReportSubCategory, OtherReportData otherReportData, DetailsModel detailsModel, BEAttachmentsConfiguration bEAttachmentsConfiguration, List<? extends wx.i> list, dx.i<oq.i0, String> iVar, k23.k.Data.PhoneAndEmail phoneAndEmail, k23.k kVar, Product product, Place place) {
        this.selectedReportCategory = bEReportCategory;
        this.selectedReportSubType = bEReportSubCategory;
        this.otherReportData = otherReportData;
        this.details = detailsModel;
        this.attachmentsConfiguration = bEAttachmentsConfiguration;
        this.attachments = list;
        this.edorAddressEither = iVar;
        this.phoneAndEmail = phoneAndEmail;
        this.providedMethodOfContact = kVar;
        this.categoryProduct = product;
        this.categoryPlace = place;
    }

    public /* synthetic */ State(BEReportCategory bEReportCategory, BEReportSubCategory bEReportSubCategory, OtherReportData otherReportData, DetailsModel detailsModel, BEAttachmentsConfiguration bEAttachmentsConfiguration, List list, dx.i iVar, k23.k.Data.PhoneAndEmail phoneAndEmail, k23.k kVar, Product product, Place place, int i15, fr.k kVar2) {
        this((i15 & 1) != 0 ? null : bEReportCategory, (i15 & 2) != 0 ? null : bEReportSubCategory, (i15 & 4) != 0 ? null : otherReportData, (i15 & 8) != 0 ? null : detailsModel, (i15 & 16) != 0 ? null : bEAttachmentsConfiguration, (i15 & 32) != 0 ? pq.v.n() : list, (i15 & 64) != 0 ? null : iVar, (i15 & 128) != 0 ? null : phoneAndEmail, (i15 & 256) != 0 ? null : kVar, (i15 & 512) != 0 ? new Product(null, null, null, 7, null) : product, (i15 & 1024) != 0 ? new Place(null, null, 3, null) : place);
    }
}
