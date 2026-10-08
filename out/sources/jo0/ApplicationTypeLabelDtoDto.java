package jo0;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Ljo0/n;", "", "Ljo0/k;", "applicationType", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljo0/k;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljo0/k;", "()Ljo0/k;", "b", "Ljava/lang/String;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicationTypeLabelDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicationType")
    private final k applicationType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c(AnnotatedPrivateKey.LABEL)
    private final String label;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplicationTypeLabelDtoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getApplicationType() {
        return this.applicationType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationTypeLabelDtoDto)) {
            return false;
        }
        ApplicationTypeLabelDtoDto applicationTypeLabelDtoDto = (ApplicationTypeLabelDtoDto) other;
        return this.applicationType == applicationTypeLabelDtoDto.applicationType && fr.t.c(this.label, applicationTypeLabelDtoDto.label);
    }

    public int hashCode() {
        k kVar = this.applicationType;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        String str = this.label;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationTypeLabelDtoDto(applicationType=" + this.applicationType + ", label=" + this.label + ')';
    }

    public ApplicationTypeLabelDtoDto(k kVar, String str) {
        this.applicationType = kVar;
        this.label = str;
    }

    public /* synthetic */ ApplicationTypeLabelDtoDto(k kVar, String str, int i15, fr.k kVar2) {
        this((i15 & 1) != 0 ? null : kVar, (i15 & 2) != 0 ? null : str);
    }
}
