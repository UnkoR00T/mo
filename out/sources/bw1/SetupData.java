package bw1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bw1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lbw1/b;", "", "Lfv0/c;", "diplomaType", "Lfv0/b;", "diplomaSubtype", "", "diplomaUuid", "<init>", "(Lfv0/c;Lfv0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfv0/c;", "b", "()Lfv0/c;", "Lfv0/b;", "()Lfv0/b;", "c", "Ljava/lang/String;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fv0.c diplomaType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fv0.b diplomaSubtype;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String diplomaUuid;

    public SetupData(fv0.c cVar, fv0.b bVar, String str) {
        this.diplomaType = cVar;
        this.diplomaSubtype = bVar;
        this.diplomaUuid = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fv0.b getDiplomaSubtype() {
        return this.diplomaSubtype;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fv0.c getDiplomaType() {
        return this.diplomaType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDiplomaUuid() {
        return this.diplomaUuid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.diplomaType == setupData.diplomaType && this.diplomaSubtype == setupData.diplomaSubtype && t.c(this.diplomaUuid, setupData.diplomaUuid);
    }

    public int hashCode() {
        return (((this.diplomaType.hashCode() * 31) + this.diplomaSubtype.hashCode()) * 31) + this.diplomaUuid.hashCode();
    }

    public String toString() {
        return "SetupData(diplomaType=" + this.diplomaType + ", diplomaSubtype=" + this.diplomaSubtype + ", diplomaUuid=" + this.diplomaUuid + ')';
    }
}
