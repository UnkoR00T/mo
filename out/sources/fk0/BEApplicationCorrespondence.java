package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lfk0/g;", "", "Lfk0/b;", "correspondenceAddress", "Lfk0/l;", "postOfficeBoxAddress", "", "recipientName", "<init>", "(Lfk0/b;Lfk0/l;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfk0/b;", "()Lfk0/b;", "b", "Lfk0/l;", "()Lfk0/l;", "c", "Ljava/lang/String;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEApplicationCorrespondence {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicationAddress correspondenceAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicationPostOfficeBox postOfficeBoxAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String recipientName;

    public BEApplicationCorrespondence(BEApplicationAddress bEApplicationAddress, BEApplicationPostOfficeBox bEApplicationPostOfficeBox, String str) {
        this.correspondenceAddress = bEApplicationAddress;
        this.postOfficeBoxAddress = bEApplicationPostOfficeBox;
        this.recipientName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEApplicationAddress getCorrespondenceAddress() {
        return this.correspondenceAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEApplicationPostOfficeBox getPostOfficeBoxAddress() {
        return this.postOfficeBoxAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRecipientName() {
        return this.recipientName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEApplicationCorrespondence)) {
            return false;
        }
        BEApplicationCorrespondence bEApplicationCorrespondence = (BEApplicationCorrespondence) other;
        return fr.t.c(this.correspondenceAddress, bEApplicationCorrespondence.correspondenceAddress) && fr.t.c(this.postOfficeBoxAddress, bEApplicationCorrespondence.postOfficeBoxAddress) && fr.t.c(this.recipientName, bEApplicationCorrespondence.recipientName);
    }

    public int hashCode() {
        BEApplicationAddress bEApplicationAddress = this.correspondenceAddress;
        int iHashCode = (bEApplicationAddress == null ? 0 : bEApplicationAddress.hashCode()) * 31;
        BEApplicationPostOfficeBox bEApplicationPostOfficeBox = this.postOfficeBoxAddress;
        int iHashCode2 = (iHashCode + (bEApplicationPostOfficeBox == null ? 0 : bEApplicationPostOfficeBox.hashCode())) * 31;
        String str = this.recipientName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BEApplicationCorrespondence(correspondenceAddress=" + this.correspondenceAddress + ", postOfficeBoxAddress=" + this.postOfficeBoxAddress + ", recipientName=" + this.recipientName + ')';
    }
}
