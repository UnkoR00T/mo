package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.v0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Ljo0/v0;", "", "Ljo0/w0;", "labelType", "", "messageLocation", "<init>", "(Ljo0/w0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljo0/w0;", "()Ljo0/w0;", "b", "Ljava/lang/String;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LabelDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("labelType")
    private final w0 labelType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("messageLocation")
    private final String messageLocation;

    /* JADX WARN: Multi-variable type inference failed */
    public LabelDtoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w0 getLabelType() {
        return this.labelType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessageLocation() {
        return this.messageLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelDtoDto)) {
            return false;
        }
        LabelDtoDto labelDtoDto = (LabelDtoDto) other;
        return this.labelType == labelDtoDto.labelType && fr.t.c(this.messageLocation, labelDtoDto.messageLocation);
    }

    public int hashCode() {
        w0 w0Var = this.labelType;
        int iHashCode = (w0Var == null ? 0 : w0Var.hashCode()) * 31;
        String str = this.messageLocation;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LabelDtoDto(labelType=" + this.labelType + ", messageLocation=" + this.messageLocation + ')';
    }

    public LabelDtoDto(w0 w0Var, String str) {
        this.labelType = w0Var;
        this.messageLocation = str;
    }

    public /* synthetic */ LabelDtoDto(w0 w0Var, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : w0Var, (i15 & 2) != 0 ? null : str);
    }
}
