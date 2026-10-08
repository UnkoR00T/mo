package sv0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.i0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001b\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lsv0/i0;", "", "Lsv0/e;", "vehicleData", "", "Lsv0/v0;", "damages", "Lsv0/r;", "insurances", "Lsv0/w0;", "physicalOwners", "Lsv0/u0;", "companyOwner", "Lsv0/i0$a;", "statementImages", "<init>", "(Lsv0/e;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lsv0/u0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/e;", "f", "()Lsv0/e;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "e", "Lsv0/u0;", "()Lsv0/u0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementVehicleData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEVehicleData vehicleData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<v0> damages;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Insurance> insurances;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<VehiclePhysicalOwner> physicalOwners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleCompanyOwner companyOwner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StatementImage> statementImages;

    /* JADX INFO: renamed from: sv0.i0$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lsv0/i0$a;", "", "Lsv0/t0;", "original", "thumbnail", "<init>", "(Lsv0/t0;Lsv0/t0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/t0;", "()Lsv0/t0;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatementImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleCollisionUploadedFile original;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleCollisionUploadedFile thumbnail;

        public StatementImage(VehicleCollisionUploadedFile vehicleCollisionUploadedFile, VehicleCollisionUploadedFile vehicleCollisionUploadedFile2) {
            this.original = vehicleCollisionUploadedFile;
            this.thumbnail = vehicleCollisionUploadedFile2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VehicleCollisionUploadedFile getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final VehicleCollisionUploadedFile getThumbnail() {
            return this.thumbnail;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatementImage)) {
                return false;
            }
            StatementImage statementImage = (StatementImage) other;
            return fr.t.c(this.original, statementImage.original) && fr.t.c(this.thumbnail, statementImage.thumbnail);
        }

        public int hashCode() {
            return (this.original.hashCode() * 31) + this.thumbnail.hashCode();
        }

        public String toString() {
            return "StatementImage(original=" + this.original + ", thumbnail=" + this.thumbnail + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatementVehicleData(BEVehicleData bEVehicleData, List<? extends v0> list, List<Insurance> list2, List<VehiclePhysicalOwner> list3, VehicleCompanyOwner vehicleCompanyOwner, List<StatementImage> list4) {
        this.vehicleData = bEVehicleData;
        this.damages = list;
        this.insurances = list2;
        this.physicalOwners = list3;
        this.companyOwner = vehicleCompanyOwner;
        this.statementImages = list4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final VehicleCompanyOwner getCompanyOwner() {
        return this.companyOwner;
    }

    public final List<v0> b() {
        return this.damages;
    }

    public final List<Insurance> c() {
        return this.insurances;
    }

    public final List<VehiclePhysicalOwner> d() {
        return this.physicalOwners;
    }

    public final List<StatementImage> e() {
        return this.statementImages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementVehicleData)) {
            return false;
        }
        StatementVehicleData statementVehicleData = (StatementVehicleData) other;
        return fr.t.c(this.vehicleData, statementVehicleData.vehicleData) && fr.t.c(this.damages, statementVehicleData.damages) && fr.t.c(this.insurances, statementVehicleData.insurances) && fr.t.c(this.physicalOwners, statementVehicleData.physicalOwners) && fr.t.c(this.companyOwner, statementVehicleData.companyOwner) && fr.t.c(this.statementImages, statementVehicleData.statementImages);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEVehicleData getVehicleData() {
        return this.vehicleData;
    }

    public int hashCode() {
        int iHashCode = ((((((this.vehicleData.hashCode() * 31) + this.damages.hashCode()) * 31) + this.insurances.hashCode()) * 31) + this.physicalOwners.hashCode()) * 31;
        VehicleCompanyOwner vehicleCompanyOwner = this.companyOwner;
        return ((iHashCode + (vehicleCompanyOwner == null ? 0 : vehicleCompanyOwner.hashCode())) * 31) + this.statementImages.hashCode();
    }

    public String toString() {
        return "StatementVehicleData(vehicleData=" + this.vehicleData + ", damages=" + this.damages + ", insurances=" + this.insurances + ", physicalOwners=" + this.physicalOwners + ", companyOwner=" + this.companyOwner + ", statementImages=" + this.statementImages + ")";
    }
}
