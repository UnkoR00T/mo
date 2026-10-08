package k34;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk34/b;", "", "Lk34/a;", "advocateCardDataModel", "Lk34/c;", "dataHeader", "<init>", "(Lk34/a;Lk34/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/a;", "()Lk34/a;", "b", "Lk34/c;", "()Lk34/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvocateDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdvocateCardDataModel advocateCardDataModel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataHeaderStandardModel dataHeader;

    public AdvocateDataModel(AdvocateCardDataModel advocateCardDataModel, DataHeaderStandardModel dataHeaderStandardModel) {
        this.advocateCardDataModel = advocateCardDataModel;
        this.dataHeader = dataHeaderStandardModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AdvocateCardDataModel getAdvocateCardDataModel() {
        return this.advocateCardDataModel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DataHeaderStandardModel getDataHeader() {
        return this.dataHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvocateDataModel)) {
            return false;
        }
        AdvocateDataModel advocateDataModel = (AdvocateDataModel) other;
        return fr.t.c(this.advocateCardDataModel, advocateDataModel.advocateCardDataModel) && fr.t.c(this.dataHeader, advocateDataModel.dataHeader);
    }

    public int hashCode() {
        return (this.advocateCardDataModel.hashCode() * 31) + this.dataHeader.hashCode();
    }

    public String toString() {
        return "AdvocateDataModel(advocateCardDataModel=" + this.advocateCardDataModel + ", dataHeader=" + this.dataHeader + ")";
    }
}
