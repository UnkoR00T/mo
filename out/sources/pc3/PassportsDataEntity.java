package pc3;

import fr.k;
import fr.t;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pc3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpc3/a;", "", "", "id", "", "lastUpdateTimestamp", "", "passportData", "<init>", "(IJ[B)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "J", "()J", "c", "[B", "()[B", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportsDataEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lastUpdateTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] passportData;

    public PassportsDataEntity(int i15, long j15, byte[] bArr) {
        this.id = i15;
        this.lastUpdateTimestamp = j15;
        this.passportData = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getPassportData() {
        return this.passportData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportsDataEntity)) {
            return false;
        }
        PassportsDataEntity passportsDataEntity = (PassportsDataEntity) other;
        return this.id == passportsDataEntity.id && this.lastUpdateTimestamp == passportsDataEntity.lastUpdateTimestamp && t.c(this.passportData, passportsDataEntity.passportData);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + Long.hashCode(this.lastUpdateTimestamp)) * 31) + Arrays.hashCode(this.passportData);
    }

    public String toString() {
        return "PassportsDataEntity(id=" + this.id + ", lastUpdateTimestamp=" + this.lastUpdateTimestamp + ", passportData=" + Arrays.toString(this.passportData) + ')';
    }

    public /* synthetic */ PassportsDataEntity(int i15, long j15, byte[] bArr, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, j15, bArr);
    }
}
