package o24;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.d0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lo24/d0;", "", "Lo24/c0;", "onMissing", "Lo24/i;", "dataType", "", "defaultValue", "<init>", "(Lo24/c0;Lo24/i;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo24/c0;", "c", "()Lo24/c0;", "b", "Lo24/i;", "()Lo24/i;", "Ljava/lang/String;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MissingDocumentAttributeDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("onMissing")
    private final c0 onMissing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataType")
    private final i dataType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("defaultValue")
    private final String defaultValue;

    public MissingDocumentAttributeDto(c0 c0Var, i iVar, String str) {
        this.onMissing = c0Var;
        this.dataType = iVar;
        this.defaultValue = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0 getOnMissing() {
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
        i iVar = this.dataType;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.defaultValue;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MissingDocumentAttributeDto(onMissing=" + this.onMissing + ", dataType=" + this.dataType + ", defaultValue=" + this.defaultValue + ')';
    }
}
