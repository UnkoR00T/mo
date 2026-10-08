package tv0;

import fr.t;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v;
import sv0.StatementVehicleData;
import sv0.Uploader;

/* JADX INFO: renamed from: tv0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jt\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b'\u00100R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b1\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b+\u00106¨\u00067"}, d2 = {"Ltv0/b;", "", "Ltv0/k;", "selectedVehicle", "Ltv0/l;", "selectedVehicleOwnerDetails", "Ltv0/h;", "selectedDamage", "Ltv0/f;", "personalData", "", "additionalVehicles", "Ltv0/b$a;", "vehiclePhotos", "Ltv0/m;", "vehiclesPages", "Lsv0/q0;", "configuration", "<init>", "(Ltv0/k;Ltv0/l;Ltv0/h;Ltv0/f;Ljava/util/List;Ljava/util/List;Ltv0/m;Lsv0/q0;)V", "a", "(Ltv0/k;Ltv0/l;Ltv0/h;Ltv0/f;Ljava/util/List;Ljava/util/List;Ltv0/m;Lsv0/q0;)Ltv0/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltv0/k;", "g", "()Ltv0/k;", "b", "Ltv0/l;", "h", "()Ltv0/l;", "c", "Ltv0/h;", "f", "()Ltv0/h;", "d", "Ltv0/f;", "e", "()Ltv0/f;", "Ljava/util/List;", "()Ljava/util/List;", "i", "Ltv0/m;", "j", "()Ltv0/m;", "Lsv0/q0;", "()Lsv0/q0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class YourDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEVehicleDataWithType selectedVehicle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l selectedVehicleOwnerDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h selectedDamage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPersonalData personalData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEVehicleDataWithType> additionalVehicles;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Photo> vehiclePhotos;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEVehiclesPages vehiclesPages;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uploader configuration;

    /* JADX INFO: renamed from: tv0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ltv0/b$a;", "", "Lwx/k$a;", "image", "", "originalLocalName", "originalUri", "Lsv0/i0$a;", "uploadedStatementImage", "<init>", "(Lwx/k$a;Ljava/lang/String;Ljava/lang/String;Lsv0/i0$a;)V", "a", "(Lwx/k$a;Ljava/lang/String;Ljava/lang/String;Lsv0/i0$a;)Ltv0/b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwx/k$a;", "c", "()Lwx/k$a;", "b", "Ljava/lang/String;", "d", "e", "Lsv0/i0$a;", "f", "()Lsv0/i0$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Photo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.k.Image image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String originalLocalName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String originalUri;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementVehicleData.StatementImage uploadedStatementImage;

        public Photo(wx.k.Image image, String str, String str2, StatementVehicleData.StatementImage statementImage) {
            this.image = image;
            this.originalLocalName = str;
            this.originalUri = str2;
            this.uploadedStatementImage = statementImage;
        }

        public static /* synthetic */ Photo b(Photo photo, wx.k.Image image, String str, String str2, StatementVehicleData.StatementImage statementImage, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                image = photo.image;
            }
            if ((i15 & 2) != 0) {
                str = photo.originalLocalName;
            }
            if ((i15 & 4) != 0) {
                str2 = photo.originalUri;
            }
            if ((i15 & 8) != 0) {
                statementImage = photo.uploadedStatementImage;
            }
            return photo.a(image, str, str2, statementImage);
        }

        public final Photo a(wx.k.Image image, String originalLocalName, String originalUri, StatementVehicleData.StatementImage uploadedStatementImage) {
            return new Photo(image, originalLocalName, originalUri, uploadedStatementImage);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final wx.k.Image getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getOriginalLocalName() {
            return this.originalLocalName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getOriginalUri() {
            return this.originalUri;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) other;
            return t.c(this.image, photo.image) && t.c(this.originalLocalName, photo.originalLocalName) && t.c(this.originalUri, photo.originalUri) && t.c(this.uploadedStatementImage, photo.uploadedStatementImage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final StatementVehicleData.StatementImage getUploadedStatementImage() {
            return this.uploadedStatementImage;
        }

        public int hashCode() {
            int iHashCode = ((((this.image.hashCode() * 31) + this.originalLocalName.hashCode()) * 31) + this.originalUri.hashCode()) * 31;
            StatementVehicleData.StatementImage statementImage = this.uploadedStatementImage;
            return iHashCode + (statementImage == null ? 0 : statementImage.hashCode());
        }

        public String toString() {
            return "Photo(image=" + this.image + ", originalLocalName=" + this.originalLocalName + ", originalUri=" + this.originalUri + ", uploadedStatementImage=" + this.uploadedStatementImage + ")";
        }
    }

    public YourDetails() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YourDetails b(YourDetails yourDetails, BEVehicleDataWithType bEVehicleDataWithType, l lVar, h hVar, BEPersonalData bEPersonalData, List list, List list2, BEVehiclesPages bEVehiclesPages, Uploader uploader, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEVehicleDataWithType = yourDetails.selectedVehicle;
        }
        if ((i15 & 2) != 0) {
            lVar = yourDetails.selectedVehicleOwnerDetails;
        }
        if ((i15 & 4) != 0) {
            hVar = yourDetails.selectedDamage;
        }
        if ((i15 & 8) != 0) {
            bEPersonalData = yourDetails.personalData;
        }
        if ((i15 & 16) != 0) {
            list = yourDetails.additionalVehicles;
        }
        if ((i15 & 32) != 0) {
            list2 = yourDetails.vehiclePhotos;
        }
        if ((i15 & 64) != 0) {
            bEVehiclesPages = yourDetails.vehiclesPages;
        }
        if ((i15 & 128) != 0) {
            uploader = yourDetails.configuration;
        }
        BEVehiclesPages bEVehiclesPages2 = bEVehiclesPages;
        Uploader uploader2 = uploader;
        List list3 = list;
        List list4 = list2;
        return yourDetails.a(bEVehicleDataWithType, lVar, hVar, bEPersonalData, list3, list4, bEVehiclesPages2, uploader2);
    }

    public final YourDetails a(BEVehicleDataWithType selectedVehicle, l selectedVehicleOwnerDetails, h selectedDamage, BEPersonalData personalData, List<BEVehicleDataWithType> additionalVehicles, List<Photo> vehiclePhotos, BEVehiclesPages vehiclesPages, Uploader configuration) {
        return new YourDetails(selectedVehicle, selectedVehicleOwnerDetails, selectedDamage, personalData, additionalVehicles, vehiclePhotos, vehiclesPages, configuration);
    }

    public final List<BEVehicleDataWithType> c() {
        return this.additionalVehicles;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Uploader getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEPersonalData getPersonalData() {
        return this.personalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YourDetails)) {
            return false;
        }
        YourDetails yourDetails = (YourDetails) other;
        return t.c(this.selectedVehicle, yourDetails.selectedVehicle) && t.c(this.selectedVehicleOwnerDetails, yourDetails.selectedVehicleOwnerDetails) && t.c(this.selectedDamage, yourDetails.selectedDamage) && t.c(this.personalData, yourDetails.personalData) && t.c(this.additionalVehicles, yourDetails.additionalVehicles) && t.c(this.vehiclePhotos, yourDetails.vehiclePhotos) && t.c(this.vehiclesPages, yourDetails.vehiclesPages) && t.c(this.configuration, yourDetails.configuration);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getSelectedDamage() {
        return this.selectedDamage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BEVehicleDataWithType getSelectedVehicle() {
        return this.selectedVehicle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l getSelectedVehicleOwnerDetails() {
        return this.selectedVehicleOwnerDetails;
    }

    public int hashCode() {
        BEVehicleDataWithType bEVehicleDataWithType = this.selectedVehicle;
        int iHashCode = (bEVehicleDataWithType == null ? 0 : bEVehicleDataWithType.hashCode()) * 31;
        l lVar = this.selectedVehicleOwnerDetails;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        h hVar = this.selectedDamage;
        int iHashCode3 = (((((((((iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.personalData.hashCode()) * 31) + this.additionalVehicles.hashCode()) * 31) + this.vehiclePhotos.hashCode()) * 31) + this.vehiclesPages.hashCode()) * 31;
        Uploader uploader = this.configuration;
        return iHashCode3 + (uploader != null ? uploader.hashCode() : 0);
    }

    public final List<Photo> i() {
        return this.vehiclePhotos;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final BEVehiclesPages getVehiclesPages() {
        return this.vehiclesPages;
    }

    public String toString() {
        return "YourDetails(selectedVehicle=" + this.selectedVehicle + ", selectedVehicleOwnerDetails=" + this.selectedVehicleOwnerDetails + ", selectedDamage=" + this.selectedDamage + ", personalData=" + this.personalData + ", additionalVehicles=" + this.additionalVehicles + ", vehiclePhotos=" + this.vehiclePhotos + ", vehiclesPages=" + this.vehiclesPages + ", configuration=" + this.configuration + ")";
    }

    public YourDetails(BEVehicleDataWithType bEVehicleDataWithType, l lVar, h hVar, BEPersonalData bEPersonalData, List<BEVehicleDataWithType> list, List<Photo> list2, BEVehiclesPages bEVehiclesPages, Uploader uploader) {
        this.selectedVehicle = bEVehicleDataWithType;
        this.selectedVehicleOwnerDetails = lVar;
        this.selectedDamage = hVar;
        this.personalData = bEPersonalData;
        this.additionalVehicles = list;
        this.vehiclePhotos = list2;
        this.vehiclesPages = bEVehiclesPages;
        this.configuration = uploader;
    }

    public /* synthetic */ YourDetails(BEVehicleDataWithType bEVehicleDataWithType, l lVar, h hVar, BEPersonalData bEPersonalData, List list, List list2, BEVehiclesPages bEVehiclesPages, Uploader uploader, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : bEVehicleDataWithType, (i15 & 2) != 0 ? null : lVar, (i15 & 4) != 0 ? null : hVar, (i15 & 8) != 0 ? new BEPersonalData(null, null, null, null, null, false, 31, null) : bEPersonalData, (i15 & 16) != 0 ? v.n() : list, (i15 & 32) != 0 ? v.n() : list2, (i15 & 64) != 0 ? BEVehiclesPages.INSTANCE.a() : bEVehiclesPages, (i15 & 128) != 0 ? null : uploader);
    }
}
