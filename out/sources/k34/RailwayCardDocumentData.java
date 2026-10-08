package k34;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.z, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lk34/z;", "", "Lk34/c;", "dataHeader", "Lk34/y;", "dataContainer", "", "photo", "Ler0/h;", "status", "<init>", "(Lk34/c;Lk34/y;Ljava/lang/String;Ler0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/c;", "b", "()Lk34/c;", "Lk34/y;", "()Lk34/y;", "c", "Ljava/lang/String;", "getPhoto", "d", "Ler0/h;", "getStatus", "()Ler0/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RailwayCardDocumentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataHeaderStandardModel dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RailwayCardDataModel dataContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er0.h status;

    public RailwayCardDocumentData(DataHeaderStandardModel dataHeaderStandardModel, RailwayCardDataModel railwayCardDataModel, String str, er0.h hVar) {
        this.dataHeader = dataHeaderStandardModel;
        this.dataContainer = railwayCardDataModel;
        this.photo = str;
        this.status = hVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RailwayCardDataModel getDataContainer() {
        return this.dataContainer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DataHeaderStandardModel getDataHeader() {
        return this.dataHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayCardDocumentData)) {
            return false;
        }
        RailwayCardDocumentData railwayCardDocumentData = (RailwayCardDocumentData) other;
        return fr.t.c(this.dataHeader, railwayCardDocumentData.dataHeader) && fr.t.c(this.dataContainer, railwayCardDocumentData.dataContainer) && fr.t.c(this.photo, railwayCardDocumentData.photo) && this.status == railwayCardDocumentData.status;
    }

    public int hashCode() {
        int iHashCode = ((this.dataHeader.hashCode() * 31) + this.dataContainer.hashCode()) * 31;
        String str = this.photo;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "RailwayCardDocumentData(dataHeader=" + this.dataHeader + ", dataContainer=" + this.dataContainer + ", photo=" + this.photo + ", status=" + this.status + ")";
    }

    public /* synthetic */ RailwayCardDocumentData(DataHeaderStandardModel dataHeaderStandardModel, RailwayCardDataModel railwayCardDataModel, String str, er0.h hVar, int i15, fr.k kVar) {
        this(dataHeaderStandardModel, railwayCardDataModel, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? er0.h.INACTIVE : hVar);
    }
}
