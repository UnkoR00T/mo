package i61;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i61.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Li61/b;", "", "", "Li61/g;", "childPassportApplicationFiles", "", "isStatementChecked", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildDataApplicationAttachmentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildPassportApplicationFile> childPassportApplicationFiles;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isStatementChecked;

    public ChildDataApplicationAttachmentData(List<ChildPassportApplicationFile> list, Boolean bool) {
        this.childPassportApplicationFiles = list;
        this.isStatementChecked = bool;
    }

    public final List<ChildPassportApplicationFile> a() {
        return this.childPassportApplicationFiles;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getIsStatementChecked() {
        return this.isStatementChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildDataApplicationAttachmentData)) {
            return false;
        }
        ChildDataApplicationAttachmentData childDataApplicationAttachmentData = (ChildDataApplicationAttachmentData) other;
        return fr.t.c(this.childPassportApplicationFiles, childDataApplicationAttachmentData.childPassportApplicationFiles) && fr.t.c(this.isStatementChecked, childDataApplicationAttachmentData.isStatementChecked);
    }

    public int hashCode() {
        List<ChildPassportApplicationFile> list = this.childPassportApplicationFiles;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isStatementChecked;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ChildDataApplicationAttachmentData(childPassportApplicationFiles=" + this.childPassportApplicationFiles + ", isStatementChecked=" + this.isStatementChecked + ')';
    }
}
