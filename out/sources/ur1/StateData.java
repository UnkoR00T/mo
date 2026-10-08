package ur1;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;
import r54.LocalDocumentNotification;
import r54.LocalVehicleNotification;
import vr1.DocumentListItem;

/* JADX INFO: renamed from: ur1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J¢\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b/\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b5\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u00107R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010\u001dR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b8\u0010\u001d¨\u0006?"}, d2 = {"Lur1/c;", "", "Lhz/b;", "dataInputError", "Lg30/v;", "sheetValue", "Lvr1/b;", "selectedItem", "", "Lr54/a;", "localDocumentNotifications", "Lr54/d;", "localVehicleNotifications", "Lrq0/b;", "documentList", "Ljava/time/LocalDate;", "documentFormattedDate", "insuranceDate", "technicalExaminationDate", "", "registerNo", "Ly30/n$b$b;", "selectedItemSwitch", "nextCheck", "<init>", "(Lhz/b;Lg30/v;Lvr1/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/String;Ly30/n$b$b;Ljava/lang/String;)V", "a", "(Lhz/b;Lg30/v;Lvr1/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/String;Ly30/n$b$b;Ljava/lang/String;)Lur1/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "c", "()Lhz/b;", "b", "Lg30/v;", "m", "()Lg30/v;", "Lvr1/b;", "k", "()Lvr1/b;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "e", "h", "f", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "i", "n", "j", "Ljava/lang/String;", "Ly30/n$b$b;", "l", "()Ly30/n$b$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b dataInputError;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g30.v sheetValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentListItem selectedItem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LocalDocumentNotification> localDocumentNotifications;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LocalVehicleNotification> localVehicleNotifications;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<rq0.b> documentList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate documentFormattedDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate insuranceDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate technicalExaminationDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registerNo;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final y30.n.Switch.EnumC5973b selectedItemSwitch;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextCheck;

    /* JADX WARN: Multi-variable type inference failed */
    public StateData(hz.b bVar, g30.v vVar, DocumentListItem documentListItem, List<LocalDocumentNotification> list, List<LocalVehicleNotification> list2, List<? extends rq0.b> list3, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str, y30.n.Switch.EnumC5973b enumC5973b, String str2) {
        this.dataInputError = bVar;
        this.sheetValue = vVar;
        this.selectedItem = documentListItem;
        this.localDocumentNotifications = list;
        this.localVehicleNotifications = list2;
        this.documentList = list3;
        this.documentFormattedDate = localDate;
        this.insuranceDate = localDate2;
        this.technicalExaminationDate = localDate3;
        this.registerNo = str;
        this.selectedItemSwitch = enumC5973b;
        this.nextCheck = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StateData b(StateData stateData, hz.b bVar, g30.v vVar, DocumentListItem documentListItem, List list, List list2, List list3, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str, y30.n.Switch.EnumC5973b enumC5973b, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = stateData.dataInputError;
        }
        if ((i15 & 2) != 0) {
            vVar = stateData.sheetValue;
        }
        if ((i15 & 4) != 0) {
            documentListItem = stateData.selectedItem;
        }
        if ((i15 & 8) != 0) {
            list = stateData.localDocumentNotifications;
        }
        if ((i15 & 16) != 0) {
            list2 = stateData.localVehicleNotifications;
        }
        if ((i15 & 32) != 0) {
            list3 = stateData.documentList;
        }
        if ((i15 & 64) != 0) {
            localDate = stateData.documentFormattedDate;
        }
        if ((i15 & 128) != 0) {
            localDate2 = stateData.insuranceDate;
        }
        if ((i15 & 256) != 0) {
            localDate3 = stateData.technicalExaminationDate;
        }
        if ((i15 & 512) != 0) {
            str = stateData.registerNo;
        }
        if ((i15 & 1024) != 0) {
            enumC5973b = stateData.selectedItemSwitch;
        }
        if ((i15 & 2048) != 0) {
            str2 = stateData.nextCheck;
        }
        y30.n.Switch.EnumC5973b enumC5973b2 = enumC5973b;
        String str3 = str2;
        LocalDate localDate4 = localDate3;
        String str4 = str;
        LocalDate localDate5 = localDate;
        LocalDate localDate6 = localDate2;
        List list4 = list2;
        List list5 = list3;
        return stateData.a(bVar, vVar, documentListItem, list, list4, list5, localDate5, localDate6, localDate4, str4, enumC5973b2, str3);
    }

    public final StateData a(hz.b dataInputError, g30.v sheetValue, DocumentListItem selectedItem, List<LocalDocumentNotification> localDocumentNotifications, List<LocalVehicleNotification> localVehicleNotifications, List<? extends rq0.b> documentList, LocalDate documentFormattedDate, LocalDate insuranceDate, LocalDate technicalExaminationDate, String registerNo, y30.n.Switch.EnumC5973b selectedItemSwitch, String nextCheck) {
        return new StateData(dataInputError, sheetValue, selectedItem, localDocumentNotifications, localVehicleNotifications, documentList, documentFormattedDate, insuranceDate, technicalExaminationDate, registerNo, selectedItemSwitch, nextCheck);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hz.b getDataInputError() {
        return this.dataInputError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getDocumentFormattedDate() {
        return this.documentFormattedDate;
    }

    public final List<rq0.b> e() {
        return this.documentList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateData)) {
            return false;
        }
        StateData stateData = (StateData) other;
        return fr.t.c(this.dataInputError, stateData.dataInputError) && this.sheetValue == stateData.sheetValue && fr.t.c(this.selectedItem, stateData.selectedItem) && fr.t.c(this.localDocumentNotifications, stateData.localDocumentNotifications) && fr.t.c(this.localVehicleNotifications, stateData.localVehicleNotifications) && fr.t.c(this.documentList, stateData.documentList) && fr.t.c(this.documentFormattedDate, stateData.documentFormattedDate) && fr.t.c(this.insuranceDate, stateData.insuranceDate) && fr.t.c(this.technicalExaminationDate, stateData.technicalExaminationDate) && fr.t.c(this.registerNo, stateData.registerNo) && this.selectedItemSwitch == stateData.selectedItemSwitch && fr.t.c(this.nextCheck, stateData.nextCheck);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getInsuranceDate() {
        return this.insuranceDate;
    }

    public final List<LocalDocumentNotification> g() {
        return this.localDocumentNotifications;
    }

    public final List<LocalVehicleNotification> h() {
        return this.localVehicleNotifications;
    }

    public int hashCode() {
        int iHashCode = ((this.dataInputError.hashCode() * 31) + this.sheetValue.hashCode()) * 31;
        DocumentListItem documentListItem = this.selectedItem;
        int iHashCode2 = (((((((iHashCode + (documentListItem == null ? 0 : documentListItem.hashCode())) * 31) + this.localDocumentNotifications.hashCode()) * 31) + this.localVehicleNotifications.hashCode()) * 31) + this.documentList.hashCode()) * 31;
        LocalDate localDate = this.documentFormattedDate;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.insuranceDate;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.technicalExaminationDate;
        return ((((((iHashCode4 + (localDate3 != null ? localDate3.hashCode() : 0)) * 31) + this.registerNo.hashCode()) * 31) + this.selectedItemSwitch.hashCode()) * 31) + this.nextCheck.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getNextCheck() {
        return this.nextCheck;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getRegisterNo() {
        return this.registerNo;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final DocumentListItem getSelectedItem() {
        return this.selectedItem;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final y30.n.Switch.EnumC5973b getSelectedItemSwitch() {
        return this.selectedItemSwitch;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final g30.v getSheetValue() {
        return this.sheetValue;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final LocalDate getTechnicalExaminationDate() {
        return this.technicalExaminationDate;
    }

    public String toString() {
        return "StateData(dataInputError=" + this.dataInputError + ", sheetValue=" + this.sheetValue + ", selectedItem=" + this.selectedItem + ", localDocumentNotifications=" + this.localDocumentNotifications + ", localVehicleNotifications=" + this.localVehicleNotifications + ", documentList=" + this.documentList + ", documentFormattedDate=" + this.documentFormattedDate + ", insuranceDate=" + this.insuranceDate + ", technicalExaminationDate=" + this.technicalExaminationDate + ", registerNo=" + this.registerNo + ", selectedItemSwitch=" + this.selectedItemSwitch + ", nextCheck=" + this.nextCheck + ')';
    }

    public /* synthetic */ StateData(hz.b bVar, g30.v vVar, DocumentListItem documentListItem, List list, List list2, List list3, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str, y30.n.Switch.EnumC5973b enumC5973b, String str2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? g30.v.HIDDEN : vVar, (i15 & 4) != 0 ? null : documentListItem, (i15 & 8) != 0 ? pq.v.n() : list, (i15 & 16) != 0 ? pq.v.n() : list2, list3, (i15 & 64) != 0 ? null : localDate, (i15 & 128) != 0 ? null : localDate2, (i15 & 256) != 0 ? null : localDate3, (i15 & 512) != 0 ? "" : str, (i15 & 1024) != 0 ? y30.n.Switch.EnumC5973b.LEFT : enumC5973b, str2);
    }
}
