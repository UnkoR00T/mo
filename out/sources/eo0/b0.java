package eo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001d\u0019 \u0017B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0017\u0010\u000f¨\u0006#"}, d2 = {"Leo0/b0;", "", "Leo0/b0$c;", "documentBody", "", "mailboxAddress", "Leo0/b0$d;", "documentData", "Leo0/f0;", "forwardDetails", "Lfo0/b;", "correlationId", "<init>", "(Leo0/b0$c;Ljava/lang/String;Leo0/b0$d;Leo0/f0;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/b0$c;", "b", "()Leo0/b0$c;", "Ljava/lang/String;", "e", "c", "Leo0/b0$d;", "()Leo0/b0$d;", "d", "Leo0/f0;", "()Leo0/f0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DocumentBody documentBody;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String mailboxAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DocumentData documentData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ForwardDetails forwardDetails;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String correlationId;

    /* JADX INFO: renamed from: eo0.b0$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001f"}, d2 = {"Leo0/b0$a;", "", "", "province", "county", "community", "city", "postalCode", "street", "buildingNumber", "apartmentNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "e", "c", "d", "f", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String province;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String county;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String community;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String city;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postalCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String street;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String buildingNumber;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String apartmentNumber;

        public AddressData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.province = str;
            this.county = str2;
            this.community = str3;
            this.city = str4;
            this.postalCode = str5;
            this.street = str6;
            this.buildingNumber = str7;
            this.apartmentNumber = str8;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApartmentNumber() {
            return this.apartmentNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBuildingNumber() {
            return this.buildingNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCommunity() {
            return this.community;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCounty() {
            return this.county;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressData)) {
                return false;
            }
            AddressData addressData = (AddressData) other;
            return fr.t.c(this.province, addressData.province) && fr.t.c(this.county, addressData.county) && fr.t.c(this.community, addressData.community) && fr.t.c(this.city, addressData.city) && fr.t.c(this.postalCode, addressData.postalCode) && fr.t.c(this.street, addressData.street) && fr.t.c(this.buildingNumber, addressData.buildingNumber) && fr.t.c(this.apartmentNumber, addressData.apartmentNumber);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getProvince() {
            return this.province;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getStreet() {
            return this.street;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.province.hashCode() * 31) + this.county.hashCode()) * 31) + this.community.hashCode()) * 31) + this.city.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
            String str = this.street;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.buildingNumber.hashCode()) * 31;
            String str2 = this.apartmentNumber;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AddressData(province=" + this.province + ", county=" + this.county + ", community=" + this.community + ", city=" + this.city + ", postalCode=" + this.postalCode + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", apartmentNumber=" + this.apartmentNumber + ")";
        }
    }

    /* JADX INFO: renamed from: eo0.b0$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Leo0/b0$b;", "", "", "id", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Attachment {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        public Attachment(String str, String str2) {
            this.id = str;
            this.fileName = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return fr.t.c(this.id, attachment.id) && fr.t.c(this.fileName, attachment.fileName);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.fileName.hashCode();
        }

        public String toString() {
            return "Attachment(id=" + this.id + ", fileName=" + this.fileName + ")";
        }
    }

    /* JADX INFO: renamed from: eo0.b0$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b!\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u0010R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001e\u0010$¨\u0006%"}, d2 = {"Leo0/b0$c;", "", "Leo0/a0;", "epuapApplicationType", "", "applicationName", "Leo0/b0$a;", "addressData", "title", "text", "", "Leo0/b0$b;", "attachments", "<init>", "(Leo0/a0;Ljava/lang/String;Leo0/b0$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/a0;", "d", "()Leo0/a0;", "b", "Ljava/lang/String;", "c", "Leo0/b0$a;", "()Leo0/b0$a;", "f", "e", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EpuapApplicationType epuapApplicationType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String applicationName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressData addressData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Attachment> attachments;

        public DocumentBody(EpuapApplicationType epuapApplicationType, String str, AddressData addressData, String str2, String str3, List<Attachment> list) {
            this.epuapApplicationType = epuapApplicationType;
            this.applicationName = str;
            this.addressData = addressData;
            this.title = str2;
            this.text = str3;
            this.attachments = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AddressData getAddressData() {
            return this.addressData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getApplicationName() {
            return this.applicationName;
        }

        public final List<Attachment> c() {
            return this.attachments;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EpuapApplicationType getEpuapApplicationType() {
            return this.epuapApplicationType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentBody)) {
                return false;
            }
            DocumentBody documentBody = (DocumentBody) other;
            return fr.t.c(this.epuapApplicationType, documentBody.epuapApplicationType) && fr.t.c(this.applicationName, documentBody.applicationName) && fr.t.c(this.addressData, documentBody.addressData) && fr.t.c(this.title, documentBody.title) && fr.t.c(this.text, documentBody.text) && fr.t.c(this.attachments, documentBody.attachments);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            EpuapApplicationType epuapApplicationType = this.epuapApplicationType;
            int iHashCode = (epuapApplicationType == null ? 0 : epuapApplicationType.hashCode()) * 31;
            String str = this.applicationName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AddressData addressData = this.addressData;
            int iHashCode3 = (((iHashCode2 + (addressData == null ? 0 : addressData.hashCode())) * 31) + this.title.hashCode()) * 31;
            String str2 = this.text;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.attachments.hashCode();
        }

        public String toString() {
            return "DocumentBody(epuapApplicationType=" + this.epuapApplicationType + ", applicationName=" + this.applicationName + ", addressData=" + this.addressData + ", title=" + this.title + ", text=" + this.text + ", attachments=" + this.attachments + ")";
        }
    }

    /* JADX INFO: renamed from: eo0.b0$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Leo0/b0$d;", "", "Leo0/b0$d$a;", "from", "Leo0/k0;", "to", "<init>", "(Leo0/b0$d$a;Leo0/k0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/b0$d$a;", "()Leo0/b0$d$a;", "b", "Leo0/k0;", "()Leo0/k0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final From from;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Recipient to;

        /* JADX INFO: renamed from: eo0.b0$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Leo0/b0$d$a;", "", "Liy/b0;", "email", "phone", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class From {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 email;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 phone;

            public From(iy.b0 b0Var, iy.b0 b0Var2) {
                this.email = b0Var;
                this.phone = b0Var2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final iy.b0 getEmail() {
                return this.email;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final iy.b0 getPhone() {
                return this.phone;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof From)) {
                    return false;
                }
                From from = (From) other;
                return fr.t.c(this.email, from.email) && fr.t.c(this.phone, from.phone);
            }

            public int hashCode() {
                return (this.email.hashCode() * 31) + this.phone.hashCode();
            }

            public String toString() {
                return "From(email=" + this.email + ", phone=" + this.phone + ")";
            }
        }

        public DocumentData(From from, Recipient recipient) {
            this.from = from;
            this.to = recipient;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final From getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Recipient getTo() {
            return this.to;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentData)) {
                return false;
            }
            DocumentData documentData = (DocumentData) other;
            return fr.t.c(this.from, documentData.from) && fr.t.c(this.to, documentData.to);
        }

        public int hashCode() {
            return (this.from.hashCode() * 31) + this.to.hashCode();
        }

        public String toString() {
            return "DocumentData(from=" + this.from + ", to=" + this.to + ")";
        }
    }

    public /* synthetic */ b0(DocumentBody documentBody, String str, DocumentData documentData, ForwardDetails forwardDetails, String str2, fr.k kVar) {
        this(documentBody, str, documentData, forwardDetails, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DocumentBody getDocumentBody() {
        return this.documentBody;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentData getDocumentData() {
        return this.documentData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ForwardDetails getForwardDetails() {
        return this.forwardDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMailboxAddress() {
        return this.mailboxAddress;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    public boolean equals(Object other) {
        boolean zB;
        if (this == other) {
            return true;
        }
        if (!(other instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) other;
        if (!fr.t.c(this.documentBody, b0Var.documentBody) || !fr.t.c(this.mailboxAddress, b0Var.mailboxAddress) || !fr.t.c(this.documentData, b0Var.documentData) || !fr.t.c(this.forwardDetails, b0Var.forwardDetails)) {
            return false;
        }
        String str = this.correlationId;
        String str2 = b0Var.correlationId;
        if (str == null) {
            if (str2 == null) {
                zB = true;
            } else {
                zB = false;
            }
        } else if (str2 == null) {
            zB = false;
        } else {
            zB = fo0.b.b(str, str2);
        }
        return zB;
    }

    public int hashCode() {
        int iHashCode = ((((this.documentBody.hashCode() * 31) + this.mailboxAddress.hashCode()) * 31) + this.documentData.hashCode()) * 31;
        ForwardDetails forwardDetails = this.forwardDetails;
        int iHashCode2 = (iHashCode + (forwardDetails == null ? 0 : forwardDetails.hashCode())) * 31;
        String str = this.correlationId;
        return iHashCode2 + (str != null ? fo0.b.c(str) : 0);
    }

    public String toString() {
        DocumentBody documentBody = this.documentBody;
        String str = this.mailboxAddress;
        DocumentData documentData = this.documentData;
        ForwardDetails forwardDetails = this.forwardDetails;
        String str2 = this.correlationId;
        return "EpuapSendMessageRequest(documentBody=" + documentBody + ", mailboxAddress=" + str + ", documentData=" + documentData + ", forwardDetails=" + forwardDetails + ", correlationId=" + (str2 == null ? "null" : fo0.b.d(str2)) + ")";
    }

    private b0(DocumentBody documentBody, String str, DocumentData documentData, ForwardDetails forwardDetails, String str2) {
        this.documentBody = documentBody;
        this.mailboxAddress = str;
        this.documentData = documentData;
        this.forwardDetails = forwardDetails;
        this.correlationId = str2;
    }
}
