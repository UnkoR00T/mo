package a61;

import fr.k;
import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a61.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"La61/a;", "", "", "id", "", "draftData", "<init>", "(I[B)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "[B", "()[B", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationDraftDataEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] draftData;

    public ChildPassportApplicationDraftDataEntity(int i15, byte[] bArr) {
        this.id = i15;
        this.draftData = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getDraftData() {
        return this.draftData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationDraftDataEntity)) {
            return false;
        }
        ChildPassportApplicationDraftDataEntity childPassportApplicationDraftDataEntity = (ChildPassportApplicationDraftDataEntity) other;
        return this.id == childPassportApplicationDraftDataEntity.id && t.c(this.draftData, childPassportApplicationDraftDataEntity.draftData);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + Arrays.hashCode(this.draftData);
    }

    public String toString() {
        return "ChildPassportApplicationDraftDataEntity(id=" + this.id + ", draftData=" + Arrays.toString(this.draftData) + ')';
    }

    public /* synthetic */ ChildPassportApplicationDraftDataEntity(int i15, byte[] bArr, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, bArr);
    }
}
