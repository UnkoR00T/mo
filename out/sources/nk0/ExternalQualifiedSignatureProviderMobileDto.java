package nk0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nk0.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"Lnk0/j;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "icon", "b", "id", "c", "Z", "()Z", "pushAuthorizationEnabled", "d", "subtitle", "e", "f", "title", "Lnk0/k;", "Lnk0/k;", "()Lnk0/k;", "temporaryInterruption", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalQualifiedSignatureProviderMobileDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("icon")
    private final String icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pushAuthorizationEnabled")
    private final boolean pushAuthorizationEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("temporaryInterruption")
    private final ExternalQualifiedSignatureProviderTemporaryInterruptionDto temporaryInterruption;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPushAuthorizationEnabled() {
        return this.pushAuthorizationEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ExternalQualifiedSignatureProviderTemporaryInterruptionDto getTemporaryInterruption() {
        return this.temporaryInterruption;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalQualifiedSignatureProviderMobileDto)) {
            return false;
        }
        ExternalQualifiedSignatureProviderMobileDto externalQualifiedSignatureProviderMobileDto = (ExternalQualifiedSignatureProviderMobileDto) other;
        return t.c(this.icon, externalQualifiedSignatureProviderMobileDto.icon) && t.c(this.id, externalQualifiedSignatureProviderMobileDto.id) && this.pushAuthorizationEnabled == externalQualifiedSignatureProviderMobileDto.pushAuthorizationEnabled && t.c(this.subtitle, externalQualifiedSignatureProviderMobileDto.subtitle) && t.c(this.title, externalQualifiedSignatureProviderMobileDto.title) && t.c(this.temporaryInterruption, externalQualifiedSignatureProviderMobileDto.temporaryInterruption);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.icon.hashCode() * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.pushAuthorizationEnabled)) * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode()) * 31;
        ExternalQualifiedSignatureProviderTemporaryInterruptionDto externalQualifiedSignatureProviderTemporaryInterruptionDto = this.temporaryInterruption;
        return iHashCode + (externalQualifiedSignatureProviderTemporaryInterruptionDto == null ? 0 : externalQualifiedSignatureProviderTemporaryInterruptionDto.hashCode());
    }

    public String toString() {
        return "ExternalQualifiedSignatureProviderMobileDto(icon=" + this.icon + ", id=" + this.id + ", pushAuthorizationEnabled=" + this.pushAuthorizationEnabled + ", subtitle=" + this.subtitle + ", title=" + this.title + ", temporaryInterruption=" + this.temporaryInterruption + ')';
    }
}
