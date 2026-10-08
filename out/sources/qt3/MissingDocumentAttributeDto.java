package qt3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: qt3.e0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0019"}, d2 = {"Lqt3/e0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lqt3/d0;", "a", "Lqt3/d0;", "c", "()Lqt3/d0;", "onMissing", "Lqt3/j;", "b", "Lqt3/j;", "()Lqt3/j;", "dataType", "Ljava/lang/String;", "defaultValue", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MissingDocumentAttributeDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("onMissing")
    private final d0 onMissing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataType")
    private final j dataType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("defaultValue")
    private final String defaultValue;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d0 getOnMissing() {
        return this.onMissing;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissingDocumentAttributeDto)) {
            return false;
        }
        MissingDocumentAttributeDto missingDocumentAttributeDto = (MissingDocumentAttributeDto) other;
        return this.onMissing == missingDocumentAttributeDto.onMissing && this.dataType == missingDocumentAttributeDto.dataType && fr.t.c(this.defaultValue, missingDocumentAttributeDto.defaultValue);
    }

    public int hashCode() {
        int iHashCode = this.onMissing.hashCode() * 31;
        j jVar = this.dataType;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.defaultValue;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MissingDocumentAttributeDto(onMissing=" + this.onMissing + ", dataType=" + this.dataType + ", defaultValue=" + this.defaultValue + ')';
    }
}
