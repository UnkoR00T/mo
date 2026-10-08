package o12;

import eo0.DeliveryMessageDetails;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o12.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lo12/b;", "", "Leo0/r;", "directoryId", "", "directoryName", "Leo0/t;", "directoryType", "Leo0/m;", "messageDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Leo0/t;Leo0/m;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Leo0/t;", "()Leo0/t;", "d", "Leo0/m;", "()Leo0/m;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializedData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directoryId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String directoryName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final eo0.t directoryType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMessageDetails messageDetails;

    public /* synthetic */ InitializedData(String str, String str2, eo0.t tVar, DeliveryMessageDetails mVar, fr.k kVar) {
        this(str, str2, tVar, mVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDirectoryId() {
        return this.directoryId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDirectoryName() {
        return this.directoryName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final eo0.t getDirectoryType() {
        return this.directoryType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DeliveryMessageDetails getMessageDetails() {
        return this.messageDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializedData)) {
            return false;
        }
        InitializedData initializedData = (InitializedData) other;
        return eo0.r.d(this.directoryId, initializedData.directoryId) && fr.t.c(this.directoryName, initializedData.directoryName) && this.directoryType == initializedData.directoryType && fr.t.c(this.messageDetails, initializedData.messageDetails);
    }

    public int hashCode() {
        return (((((eo0.r.e(this.directoryId) * 31) + this.directoryName.hashCode()) * 31) + this.directoryType.hashCode()) * 31) + this.messageDetails.hashCode();
    }

    public String toString() {
        return "InitializedData(directoryId=" + ((Object) eo0.r.f(this.directoryId)) + ", directoryName=" + this.directoryName + ", directoryType=" + this.directoryType + ", messageDetails=" + this.messageDetails + ')';
    }

    private InitializedData(String str, String str2, eo0.t tVar, DeliveryMessageDetails mVar) {
        this.directoryId = str;
        this.directoryName = str2;
        this.directoryType = tVar;
        this.messageDetails = mVar;
    }
}
