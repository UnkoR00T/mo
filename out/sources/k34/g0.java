package k34;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lk34/g0;", "", "Lk34/t;", "dataHeader", "Lk34/h0;", "documentDataModel", "<init>", "(Lk34/t;Lk34/h0;)V", "a", "Lk34/t;", "()Lk34/t;", "b", "Lk34/h0;", "()Lk34/h0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdentityDataHeaderModel dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final VehicleDocumentDataModel documentDataModel;

    public g0(IdentityDataHeaderModel identityDataHeaderModel, VehicleDocumentDataModel vehicleDocumentDataModel) {
        this.dataHeader = identityDataHeaderModel;
        this.documentDataModel = vehicleDocumentDataModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IdentityDataHeaderModel getDataHeader() {
        return this.dataHeader;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleDocumentDataModel getDocumentDataModel() {
        return this.documentDataModel;
    }
}
