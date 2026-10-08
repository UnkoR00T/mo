package jk0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jk0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Ljk0/o;", "", "", "icon", "id", "subtitle", "title", "", "pushAuthorizationEnabled", "Ljk0/i;", "temporaryInterruption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjk0/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "f", "e", "Z", "()Z", "Ljk0/i;", "()Ljk0/i;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QualifiedSignatureProviderMobile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pushAuthorizationEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ExternalQualifiedSignatureProviderTemporaryInterruption temporaryInterruption;

    public QualifiedSignatureProviderMobile(String str, String str2, String str3, String str4, boolean z15, ExternalQualifiedSignatureProviderTemporaryInterruption externalQualifiedSignatureProviderTemporaryInterruption) {
        this.icon = str;
        this.id = str2;
        this.subtitle = str3;
        this.title = str4;
        this.pushAuthorizationEnabled = z15;
        this.temporaryInterruption = externalQualifiedSignatureProviderTemporaryInterruption;
    }

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
    public final ExternalQualifiedSignatureProviderTemporaryInterruption getTemporaryInterruption() {
        return this.temporaryInterruption;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualifiedSignatureProviderMobile)) {
            return false;
        }
        QualifiedSignatureProviderMobile qualifiedSignatureProviderMobile = (QualifiedSignatureProviderMobile) other;
        return t.c(this.icon, qualifiedSignatureProviderMobile.icon) && t.c(this.id, qualifiedSignatureProviderMobile.id) && t.c(this.subtitle, qualifiedSignatureProviderMobile.subtitle) && t.c(this.title, qualifiedSignatureProviderMobile.title) && this.pushAuthorizationEnabled == qualifiedSignatureProviderMobile.pushAuthorizationEnabled && t.c(this.temporaryInterruption, qualifiedSignatureProviderMobile.temporaryInterruption);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.icon.hashCode() * 31) + this.id.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.pushAuthorizationEnabled)) * 31;
        ExternalQualifiedSignatureProviderTemporaryInterruption externalQualifiedSignatureProviderTemporaryInterruption = this.temporaryInterruption;
        return iHashCode + (externalQualifiedSignatureProviderTemporaryInterruption == null ? 0 : externalQualifiedSignatureProviderTemporaryInterruption.hashCode());
    }

    public String toString() {
        return "QualifiedSignatureProviderMobile(icon=" + this.icon + ", id=" + this.id + ", subtitle=" + this.subtitle + ", title=" + this.title + ", pushAuthorizationEnabled=" + this.pushAuthorizationEnabled + ", temporaryInterruption=" + this.temporaryInterruption + ")";
    }
}
