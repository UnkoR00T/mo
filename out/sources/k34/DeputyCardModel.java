package k34;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk34/e;", "", "Lk34/c;", "dataHeader", "Lk34/d;", "dataContainer", "<init>", "(Lk34/c;Lk34/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/c;", "b", "()Lk34/c;", "Lk34/d;", "()Lk34/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeputyCardModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataHeaderStandardModel dataHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeputyCardDataModel dataContainer;

    public DeputyCardModel(DataHeaderStandardModel dataHeaderStandardModel, DeputyCardDataModel deputyCardDataModel) {
        this.dataHeader = dataHeaderStandardModel;
        this.dataContainer = deputyCardDataModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DeputyCardDataModel getDataContainer() {
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
        if (!(other instanceof DeputyCardModel)) {
            return false;
        }
        DeputyCardModel deputyCardModel = (DeputyCardModel) other;
        return fr.t.c(this.dataHeader, deputyCardModel.dataHeader) && fr.t.c(this.dataContainer, deputyCardModel.dataContainer);
    }

    public int hashCode() {
        return (this.dataHeader.hashCode() * 31) + this.dataContainer.hashCode();
    }

    public String toString() {
        return "DeputyCardModel(dataHeader=" + this.dataHeader + ", dataContainer=" + this.dataContainer + ")";
    }
}
