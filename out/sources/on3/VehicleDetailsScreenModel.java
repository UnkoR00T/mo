package on3;

import b30.AccordionData;
import fr.t;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: on3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b/\u00105R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bA\u00102R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u00102R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b1\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b;\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bC\u0010G\u001a\u0004\bJ\u0010IR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010IR\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\b+\u0010?R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b@\u0010PR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\b3\u0010PR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\bB\u0010PR\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\b6\u0010PR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bK\u0010P¨\u0006U"}, d2 = {"Lon3/d;", "", "Li50/a;", "scaffoldData", "", "Lc30/b;", "topAlertData", "Lon3/c;", "headerDetails", "Lh70/a;", "shortcutsLayoutData", "Ln50/g;", "updateVehicleDataSection", "Lmx/a;", "technicalExaminationSectionTitle", "Ln50/k;", "technicalExaminationSectionItems", "Lc30/b$c;", "vehicleBottomAlerts", "Lon3/a;", "bottomSheetModel", "", "bottomSheetVisible", "expirationInsuranceAlertVisible", "expirationTechnicalExamAlertVisible", "currentTime", "Lb30/a;", "technicalExaminationAccordionData", "insuranceAccordionData", "temporaryPermissionAccordionData", "registrationDocumentAccordionData", "vehicleDetailsAccordionData", "<init>", "(Li50/a;Ljava/util/List;Lon3/c;Lh70/a;Ln50/g;Lmx/a;Ljava/util/List;Ljava/util/List;Lon3/a;ZZZLmx/a;Lb30/a;Lb30/a;Lb30/a;Lb30/a;Lb30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Ljava/util/List;", "i", "()Ljava/util/List;", "c", "Lon3/c;", "()Lon3/c;", "d", "Lh70/a;", "f", "()Lh70/a;", "Ln50/g;", "j", "()Ln50/g;", "Lmx/a;", "getTechnicalExaminationSectionTitle", "()Lmx/a;", "g", "getTechnicalExaminationSectionItems", "h", "k", "Lon3/a;", "getBottomSheetModel", "()Lon3/a;", "Z", "getBottomSheetVisible", "()Z", "getExpirationInsuranceAlertVisible", "l", "getExpirationTechnicalExamAlertVisible", "m", "n", "Lb30/a;", "()Lb30/a;", "o", "p", "q", "r", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleDetailsScreenModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<c30.b> topAlertData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleDetailsHeaderModel headerDetails;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShortcutsLayoutData shortcutsLayoutData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefaultSingleCardData updateVehicleDataSection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label technicalExaminationSectionTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<k> technicalExaminationSectionItems;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<c30.b.c> vehicleBottomAlerts;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleDetailsBottomSheetModel bottomSheetModel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bottomSheetVisible;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean expirationInsuranceAlertVisible;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean expirationTechnicalExamAlertVisible;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label currentTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData technicalExaminationAccordionData;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData insuranceAccordionData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData temporaryPermissionAccordionData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData registrationDocumentAccordionData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData vehicleDetailsAccordionData;

    /* JADX WARN: Multi-variable type inference failed */
    public VehicleDetailsScreenModel(BaseScaffoldData baseScaffoldData, List<? extends c30.b> list, VehicleDetailsHeaderModel vehicleDetailsHeaderModel, ShortcutsLayoutData shortcutsLayoutData, DefaultSingleCardData defaultSingleCardData, Label label, List<? extends k> list2, List<c30.b.c> list3, VehicleDetailsBottomSheetModel vehicleDetailsBottomSheetModel, boolean z15, boolean z16, boolean z17, Label label2, AccordionData accordionData, AccordionData accordionData2, AccordionData accordionData3, AccordionData accordionData4, AccordionData accordionData5) {
        this.scaffoldData = baseScaffoldData;
        this.topAlertData = list;
        this.headerDetails = vehicleDetailsHeaderModel;
        this.shortcutsLayoutData = shortcutsLayoutData;
        this.updateVehicleDataSection = defaultSingleCardData;
        this.technicalExaminationSectionTitle = label;
        this.technicalExaminationSectionItems = list2;
        this.vehicleBottomAlerts = list3;
        this.bottomSheetModel = vehicleDetailsBottomSheetModel;
        this.bottomSheetVisible = z15;
        this.expirationInsuranceAlertVisible = z16;
        this.expirationTechnicalExamAlertVisible = z17;
        this.currentTime = label2;
        this.technicalExaminationAccordionData = accordionData;
        this.insuranceAccordionData = accordionData2;
        this.temporaryPermissionAccordionData = accordionData3;
        this.registrationDocumentAccordionData = accordionData4;
        this.vehicleDetailsAccordionData = accordionData5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleDetailsHeaderModel getHeaderDetails() {
        return this.headerDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AccordionData getInsuranceAccordionData() {
        return this.insuranceAccordionData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AccordionData getRegistrationDocumentAccordionData() {
        return this.registrationDocumentAccordionData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDetailsScreenModel)) {
            return false;
        }
        VehicleDetailsScreenModel vehicleDetailsScreenModel = (VehicleDetailsScreenModel) other;
        return t.c(this.scaffoldData, vehicleDetailsScreenModel.scaffoldData) && t.c(this.topAlertData, vehicleDetailsScreenModel.topAlertData) && t.c(this.headerDetails, vehicleDetailsScreenModel.headerDetails) && t.c(this.shortcutsLayoutData, vehicleDetailsScreenModel.shortcutsLayoutData) && t.c(this.updateVehicleDataSection, vehicleDetailsScreenModel.updateVehicleDataSection) && t.c(this.technicalExaminationSectionTitle, vehicleDetailsScreenModel.technicalExaminationSectionTitle) && t.c(this.technicalExaminationSectionItems, vehicleDetailsScreenModel.technicalExaminationSectionItems) && t.c(this.vehicleBottomAlerts, vehicleDetailsScreenModel.vehicleBottomAlerts) && t.c(this.bottomSheetModel, vehicleDetailsScreenModel.bottomSheetModel) && this.bottomSheetVisible == vehicleDetailsScreenModel.bottomSheetVisible && this.expirationInsuranceAlertVisible == vehicleDetailsScreenModel.expirationInsuranceAlertVisible && this.expirationTechnicalExamAlertVisible == vehicleDetailsScreenModel.expirationTechnicalExamAlertVisible && t.c(this.currentTime, vehicleDetailsScreenModel.currentTime) && t.c(this.technicalExaminationAccordionData, vehicleDetailsScreenModel.technicalExaminationAccordionData) && t.c(this.insuranceAccordionData, vehicleDetailsScreenModel.insuranceAccordionData) && t.c(this.temporaryPermissionAccordionData, vehicleDetailsScreenModel.temporaryPermissionAccordionData) && t.c(this.registrationDocumentAccordionData, vehicleDetailsScreenModel.registrationDocumentAccordionData) && t.c(this.vehicleDetailsAccordionData, vehicleDetailsScreenModel.vehicleDetailsAccordionData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ShortcutsLayoutData getShortcutsLayoutData() {
        return this.shortcutsLayoutData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AccordionData getTechnicalExaminationAccordionData() {
        return this.technicalExaminationAccordionData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AccordionData getTemporaryPermissionAccordionData() {
        return this.temporaryPermissionAccordionData;
    }

    public int hashCode() {
        int iHashCode = this.scaffoldData.hashCode() * 31;
        List<c30.b> list = this.topAlertData;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.headerDetails.hashCode()) * 31;
        ShortcutsLayoutData shortcutsLayoutData = this.shortcutsLayoutData;
        int iHashCode3 = (iHashCode2 + (shortcutsLayoutData == null ? 0 : shortcutsLayoutData.hashCode())) * 31;
        DefaultSingleCardData defaultSingleCardData = this.updateVehicleDataSection;
        return ((((((((((((((((((((((((((iHashCode3 + (defaultSingleCardData != null ? defaultSingleCardData.hashCode() : 0)) * 31) + this.technicalExaminationSectionTitle.hashCode()) * 31) + this.technicalExaminationSectionItems.hashCode()) * 31) + this.vehicleBottomAlerts.hashCode()) * 31) + this.bottomSheetModel.hashCode()) * 31) + Boolean.hashCode(this.bottomSheetVisible)) * 31) + Boolean.hashCode(this.expirationInsuranceAlertVisible)) * 31) + Boolean.hashCode(this.expirationTechnicalExamAlertVisible)) * 31) + this.currentTime.hashCode()) * 31) + this.technicalExaminationAccordionData.hashCode()) * 31) + this.insuranceAccordionData.hashCode()) * 31) + this.temporaryPermissionAccordionData.hashCode()) * 31) + this.registrationDocumentAccordionData.hashCode()) * 31) + this.vehicleDetailsAccordionData.hashCode();
    }

    public final List<c30.b> i() {
        return this.topAlertData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final DefaultSingleCardData getUpdateVehicleDataSection() {
        return this.updateVehicleDataSection;
    }

    public final List<c30.b.c> k() {
        return this.vehicleBottomAlerts;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AccordionData getVehicleDetailsAccordionData() {
        return this.vehicleDetailsAccordionData;
    }

    public String toString() {
        return "VehicleDetailsScreenModel(scaffoldData=" + this.scaffoldData + ", topAlertData=" + this.topAlertData + ", headerDetails=" + this.headerDetails + ", shortcutsLayoutData=" + this.shortcutsLayoutData + ", updateVehicleDataSection=" + this.updateVehicleDataSection + ", technicalExaminationSectionTitle=" + this.technicalExaminationSectionTitle + ", technicalExaminationSectionItems=" + this.technicalExaminationSectionItems + ", vehicleBottomAlerts=" + this.vehicleBottomAlerts + ", bottomSheetModel=" + this.bottomSheetModel + ", bottomSheetVisible=" + this.bottomSheetVisible + ", expirationInsuranceAlertVisible=" + this.expirationInsuranceAlertVisible + ", expirationTechnicalExamAlertVisible=" + this.expirationTechnicalExamAlertVisible + ", currentTime=" + this.currentTime + ", technicalExaminationAccordionData=" + this.technicalExaminationAccordionData + ", insuranceAccordionData=" + this.insuranceAccordionData + ", temporaryPermissionAccordionData=" + this.temporaryPermissionAccordionData + ", registrationDocumentAccordionData=" + this.registrationDocumentAccordionData + ", vehicleDetailsAccordionData=" + this.vehicleDetailsAccordionData + ')';
    }
}
