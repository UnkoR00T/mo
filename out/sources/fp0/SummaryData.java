package fp0;

import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;

/* JADX INFO: renamed from: fp0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jv\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b2\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b0\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b(\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\b,\u0010;¨\u0006<"}, d2 = {"Lfp0/j;", "", "Lfp0/k;", "violationTypeTag", "Lfp0/m;", "wasteTypeTag", "Lfp0/l;", "wasReported", "Lmx/a;", "officeReportedTo", "violationEntityName", "violationDescription", "Lwx/i$a;", "photo", "Lfp0/j$a;", "locationDetails", "Lfp0/a;", "applicantDetails", "", "imageMaxSide", "<init>", "(Lfp0/k;Lfp0/m;Lfp0/l;Lmx/a;Lmx/a;Lmx/a;Lwx/i$a;Lfp0/j$a;Lfp0/a;Ljava/lang/Integer;)V", "a", "(Lfp0/k;Lfp0/m;Lfp0/l;Lmx/a;Lmx/a;Lmx/a;Lwx/i$a;Lfp0/j$a;Lfp0/a;Ljava/lang/Integer;)Lfp0/j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfp0/k;", "j", "()Lfp0/k;", "b", "Lfp0/m;", "l", "()Lfp0/m;", "c", "Lfp0/l;", "k", "()Lfp0/l;", "d", "Lmx/a;", "f", "()Lmx/a;", "e", "i", "h", "g", "Lwx/i$a;", "()Lwx/i$a;", "Lfp0/j$a;", "()Lfp0/j$a;", "Lfp0/a;", "()Lfp0/a;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final k violationTypeTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final m wasteTypeTag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l wasReported;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label officeReportedTo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label violationEntityName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label violationDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.i.Image photo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationDetails locationDetails;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApplicantDetails applicantDetails;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer imageMaxSide;

    /* JADX INFO: renamed from: fp0.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u001e"}, d2 = {"Lfp0/j$a;", "", "", "streetNameAndNumber", "cityName", "postalCode", "voivodeshipName", "Lvy/c;", "coordinates", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvy/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "f", "Lvy/c;", "()Lvy/c;", "fullAddress", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String streetNameAndNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cityName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postalCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String voivodeshipName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Coordinates coordinates;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String fullAddress;

        public LocationDetails(String str, String str2, String str3, String str4, Coordinates coordinates) {
            this.streetNameAndNumber = str;
            this.cityName = str2;
            this.postalCode = str3;
            this.voivodeshipName = str4;
            this.coordinates = coordinates;
            List listQ = v.q(str, str3, str2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                if (!r.t0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            this.fullAddress = v.v0(arrayList, ", ", null, null, 0, null, null, 62, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCityName() {
            return this.cityName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFullAddress() {
            return this.fullAddress;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getStreetNameAndNumber() {
            return this.streetNameAndNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationDetails)) {
                return false;
            }
            LocationDetails locationDetails = (LocationDetails) other;
            return t.c(this.streetNameAndNumber, locationDetails.streetNameAndNumber) && t.c(this.cityName, locationDetails.cityName) && t.c(this.postalCode, locationDetails.postalCode) && t.c(this.voivodeshipName, locationDetails.voivodeshipName) && t.c(this.coordinates, locationDetails.coordinates);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getVoivodeshipName() {
            return this.voivodeshipName;
        }

        public int hashCode() {
            return (((((((this.streetNameAndNumber.hashCode() * 31) + this.cityName.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.voivodeshipName.hashCode()) * 31) + this.coordinates.hashCode();
        }

        public String toString() {
            return "LocationDetails(streetNameAndNumber=" + this.streetNameAndNumber + ", cityName=" + this.cityName + ", postalCode=" + this.postalCode + ", voivodeshipName=" + this.voivodeshipName + ", coordinates=" + this.coordinates + ")";
        }
    }

    public SummaryData(k kVar, m mVar, l lVar, Label label, Label label2, Label label3, wx.i.Image image, LocationDetails locationDetails, ApplicantDetails applicantDetails, Integer num) {
        this.violationTypeTag = kVar;
        this.wasteTypeTag = mVar;
        this.wasReported = lVar;
        this.officeReportedTo = label;
        this.violationEntityName = label2;
        this.violationDescription = label3;
        this.photo = image;
        this.locationDetails = locationDetails;
        this.applicantDetails = applicantDetails;
        this.imageMaxSide = num;
    }

    public static /* synthetic */ SummaryData b(SummaryData summaryData, k kVar, m mVar, l lVar, Label label, Label label2, Label label3, wx.i.Image image, LocationDetails locationDetails, ApplicantDetails applicantDetails, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            kVar = summaryData.violationTypeTag;
        }
        if ((i15 & 2) != 0) {
            mVar = summaryData.wasteTypeTag;
        }
        if ((i15 & 4) != 0) {
            lVar = summaryData.wasReported;
        }
        if ((i15 & 8) != 0) {
            label = summaryData.officeReportedTo;
        }
        if ((i15 & 16) != 0) {
            label2 = summaryData.violationEntityName;
        }
        if ((i15 & 32) != 0) {
            label3 = summaryData.violationDescription;
        }
        if ((i15 & 64) != 0) {
            image = summaryData.photo;
        }
        if ((i15 & 128) != 0) {
            locationDetails = summaryData.locationDetails;
        }
        if ((i15 & 256) != 0) {
            applicantDetails = summaryData.applicantDetails;
        }
        if ((i15 & 512) != 0) {
            num = summaryData.imageMaxSide;
        }
        ApplicantDetails applicantDetails2 = applicantDetails;
        Integer num2 = num;
        wx.i.Image image2 = image;
        LocationDetails locationDetails2 = locationDetails;
        Label label4 = label2;
        Label label5 = label3;
        return summaryData.a(kVar, mVar, lVar, label, label4, label5, image2, locationDetails2, applicantDetails2, num2);
    }

    public final SummaryData a(k violationTypeTag, m wasteTypeTag, l wasReported, Label officeReportedTo, Label violationEntityName, Label violationDescription, wx.i.Image photo, LocationDetails locationDetails, ApplicantDetails applicantDetails, Integer imageMaxSide) {
        return new SummaryData(violationTypeTag, wasteTypeTag, wasReported, officeReportedTo, violationEntityName, violationDescription, photo, locationDetails, applicantDetails, imageMaxSide);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ApplicantDetails getApplicantDetails() {
        return this.applicantDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getImageMaxSide() {
        return this.imageMaxSide;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocationDetails getLocationDetails() {
        return this.locationDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryData)) {
            return false;
        }
        SummaryData summaryData = (SummaryData) other;
        return t.c(this.violationTypeTag, summaryData.violationTypeTag) && t.c(this.wasteTypeTag, summaryData.wasteTypeTag) && this.wasReported == summaryData.wasReported && t.c(this.officeReportedTo, summaryData.officeReportedTo) && t.c(this.violationEntityName, summaryData.violationEntityName) && t.c(this.violationDescription, summaryData.violationDescription) && t.c(this.photo, summaryData.photo) && t.c(this.locationDetails, summaryData.locationDetails) && t.c(this.applicantDetails, summaryData.applicantDetails) && t.c(this.imageMaxSide, summaryData.imageMaxSide);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getOfficeReportedTo() {
        return this.officeReportedTo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final wx.i.Image getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Label getViolationDescription() {
        return this.violationDescription;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.violationTypeTag.hashCode() * 31) + this.wasteTypeTag.hashCode()) * 31) + this.wasReported.hashCode()) * 31) + this.officeReportedTo.hashCode()) * 31) + this.violationEntityName.hashCode()) * 31) + this.violationDescription.hashCode()) * 31) + this.photo.hashCode()) * 31) + this.locationDetails.hashCode()) * 31) + this.applicantDetails.hashCode()) * 31;
        Integer num = this.imageMaxSide;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Label getViolationEntityName() {
        return this.violationEntityName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k getViolationTypeTag() {
        return this.violationTypeTag;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final l getWasReported() {
        return this.wasReported;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final m getWasteTypeTag() {
        return this.wasteTypeTag;
    }

    public String toString() {
        return "SummaryData(violationTypeTag=" + this.violationTypeTag + ", wasteTypeTag=" + this.wasteTypeTag + ", wasReported=" + this.wasReported + ", officeReportedTo=" + this.officeReportedTo + ", violationEntityName=" + this.violationEntityName + ", violationDescription=" + this.violationDescription + ", photo=" + this.photo + ", locationDetails=" + this.locationDetails + ", applicantDetails=" + this.applicantDetails + ", imageMaxSide=" + this.imageMaxSide + ")";
    }
}
