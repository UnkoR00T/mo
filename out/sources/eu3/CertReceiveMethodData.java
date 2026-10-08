package eu3;

import fr.t;
import iy.b0;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eu3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Leu3/b;", "", "Lmx/a;", "header", "", "officeName", "Liy/b0;", "edorAddress", "<init>", "(Lmx/a;Ljava/lang/String;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ljava/lang/String;", "c", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertReceiveMethodData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String officeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 edorAddress;

    public CertReceiveMethodData(Label label, String str, b0 b0Var) {
        this.header = label;
        this.officeName = str;
        this.edorAddress = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getEdorAddress() {
        return this.edorAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOfficeName() {
        return this.officeName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertReceiveMethodData)) {
            return false;
        }
        CertReceiveMethodData certReceiveMethodData = (CertReceiveMethodData) other;
        return t.c(this.header, certReceiveMethodData.header) && t.c(this.officeName, certReceiveMethodData.officeName) && t.c(this.edorAddress, certReceiveMethodData.edorAddress);
    }

    public int hashCode() {
        return (((this.header.hashCode() * 31) + this.officeName.hashCode()) * 31) + this.edorAddress.hashCode();
    }

    public String toString() {
        return "CertReceiveMethodData(header=" + this.header + ", officeName=" + this.officeName + ", edorAddress=" + this.edorAddress + ")";
    }
}
