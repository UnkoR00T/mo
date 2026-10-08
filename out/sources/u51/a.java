package u51;

import bl0.BEChildBirthChildData;
import bl0.BEChildBirthParents;
import bl0.BEChildBirthPlaceOfBirthOffices;
import bl0.BEChildBirthRegistration;
import bl0.d;
import bl0.g;
import bl0.m;
import bl0.s;
import fr.t;
import g51.ReceiveDocumentAddressData;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lu51/a;", "", "Lu51/a$a;", "c", "()Lu51/a$a;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: u51.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b,\u00109R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b0\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b.\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b7\u0010ER\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bG\u0010I\u001a\u0004\bC\u0010JR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010MR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bA\u0010N\u001a\u0004\b:\u0010O¨\u0006P"}, d2 = {"Lu51/a$a;", "", "Lbl0/h$a;", "applicantData", "Lbl0/e;", "parentData", "", "Lbl0/b;", "childData", "Lbl0/d;", "maritalStatusType", "Lf41/a$a;", "birthPlaceCity", "Lc41/a$a;", "birthPlaceType", "Lbl0/g;", "receivedDocumentsMethod", "Lbl0/s;", "typeAddressChild", "Lbl0/m;", "contactData", "Lq51/a$a;", "registeredAddress", "Lg51/a;", "receiveDocumentAddress", "Lbl0/f;", "registrationOffice", "Liy/b0;", "edorAddress", "<init>", "(Lbl0/h$a;Lbl0/e;Ljava/util/List;Lbl0/d;Lf41/a$a;Lc41/a$a;Lbl0/g;Lbl0/s;Lbl0/m;Lq51/a$a;Lg51/a;Lbl0/f;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbl0/h$a;", "()Lbl0/h$a;", "b", "Lbl0/e;", "h", "()Lbl0/e;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lbl0/d;", "g", "()Lbl0/d;", "e", "Lf41/a$a;", "()Lf41/a$a;", "f", "Lc41/a$a;", "()Lc41/a$a;", "Lbl0/g;", "j", "()Lbl0/g;", "Lbl0/s;", "m", "()Lbl0/s;", "i", "Lbl0/m;", "()Lbl0/m;", "Lq51/a$a;", "k", "()Lq51/a$a;", "Lg51/a;", "()Lg51/a;", "l", "Lbl0/f;", "()Lbl0/f;", "Liy/b0;", "()Liy/b0;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEChildBirthRegistration.BEApplicantData applicantData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEChildBirthParents parentData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEChildBirthChildData> childData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final d maritalStatusType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final f41.a.Data birthPlaceCity;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c41.a.InterfaceC0617a birthPlaceType;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final g receivedDocumentsMethod;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final s typeAddressChild;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final m contactData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final q51.a.Data registeredAddress;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReceiveDocumentAddressData receiveDocumentAddress;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEChildBirthPlaceOfBirthOffices registrationOffice;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 edorAddress;

        public Data(BEChildBirthRegistration.BEApplicantData bEApplicantData, BEChildBirthParents bEChildBirthParents, List<BEChildBirthChildData> list, d dVar, f41.a.Data data, c41.a.InterfaceC0617a interfaceC0617a, g gVar, s sVar, m mVar, q51.a.Data data2, ReceiveDocumentAddressData receiveDocumentAddressData, BEChildBirthPlaceOfBirthOffices bEChildBirthPlaceOfBirthOffices, b0 b0Var) {
            this.applicantData = bEApplicantData;
            this.parentData = bEChildBirthParents;
            this.childData = list;
            this.maritalStatusType = dVar;
            this.birthPlaceCity = data;
            this.birthPlaceType = interfaceC0617a;
            this.receivedDocumentsMethod = gVar;
            this.typeAddressChild = sVar;
            this.contactData = mVar;
            this.registeredAddress = data2;
            this.receiveDocumentAddress = receiveDocumentAddressData;
            this.registrationOffice = bEChildBirthPlaceOfBirthOffices;
            this.edorAddress = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEChildBirthRegistration.BEApplicantData getApplicantData() {
            return this.applicantData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final f41.a.Data getBirthPlaceCity() {
            return this.birthPlaceCity;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c41.a.InterfaceC0617a getBirthPlaceType() {
            return this.birthPlaceType;
        }

        public final List<BEChildBirthChildData> d() {
            return this.childData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final m getContactData() {
            return this.contactData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.applicantData, data.applicantData) && t.c(this.parentData, data.parentData) && t.c(this.childData, data.childData) && this.maritalStatusType == data.maritalStatusType && t.c(this.birthPlaceCity, data.birthPlaceCity) && t.c(this.birthPlaceType, data.birthPlaceType) && this.receivedDocumentsMethod == data.receivedDocumentsMethod && this.typeAddressChild == data.typeAddressChild && t.c(this.contactData, data.contactData) && t.c(this.registeredAddress, data.registeredAddress) && t.c(this.receiveDocumentAddress, data.receiveDocumentAddress) && t.c(this.registrationOffice, data.registrationOffice) && t.c(this.edorAddress, data.edorAddress);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b0 getEdorAddress() {
            return this.edorAddress;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d getMaritalStatusType() {
            return this.maritalStatusType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final BEChildBirthParents getParentData() {
            return this.parentData;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.applicantData.hashCode() * 31) + this.parentData.hashCode()) * 31) + this.childData.hashCode()) * 31) + this.maritalStatusType.hashCode()) * 31) + this.birthPlaceCity.hashCode()) * 31) + this.birthPlaceType.hashCode()) * 31) + this.receivedDocumentsMethod.hashCode()) * 31) + this.typeAddressChild.hashCode()) * 31) + this.contactData.hashCode()) * 31;
            q51.a.Data data = this.registeredAddress;
            int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
            ReceiveDocumentAddressData receiveDocumentAddressData = this.receiveDocumentAddress;
            int iHashCode3 = (((iHashCode2 + (receiveDocumentAddressData == null ? 0 : receiveDocumentAddressData.hashCode())) * 31) + this.registrationOffice.hashCode()) * 31;
            b0 b0Var = this.edorAddress;
            return iHashCode3 + (b0Var != null ? b0Var.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ReceiveDocumentAddressData getReceiveDocumentAddress() {
            return this.receiveDocumentAddress;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final g getReceivedDocumentsMethod() {
            return this.receivedDocumentsMethod;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final q51.a.Data getRegisteredAddress() {
            return this.registeredAddress;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final BEChildBirthPlaceOfBirthOffices getRegistrationOffice() {
            return this.registrationOffice;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final s getTypeAddressChild() {
            return this.typeAddressChild;
        }

        public String toString() {
            return "Data(applicantData=" + this.applicantData + ", parentData=" + this.parentData + ", childData=" + this.childData + ", maritalStatusType=" + this.maritalStatusType + ", birthPlaceCity=" + this.birthPlaceCity + ", birthPlaceType=" + this.birthPlaceType + ", receivedDocumentsMethod=" + this.receivedDocumentsMethod + ", typeAddressChild=" + this.typeAddressChild + ", contactData=" + this.contactData + ", registeredAddress=" + this.registeredAddress + ", receiveDocumentAddress=" + this.receiveDocumentAddress + ", registrationOffice=" + this.registrationOffice + ", edorAddress=" + this.edorAddress + ')';
        }
    }

    Data c();
}
