package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lgm0/g;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "description", "b", "link", "c", "linkLabel", "Lgm0/h;", "d", "Lgm0/h;", "()Lgm0/h;", "type", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicationReasonInfoTipDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("link")
    private final String link;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("linkLabel")
    private final String linkLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final h type;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLinkLabel() {
        return this.linkLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationReasonInfoTipDto)) {
            return false;
        }
        ApplicationReasonInfoTipDto applicationReasonInfoTipDto = (ApplicationReasonInfoTipDto) other;
        return fr.t.c(this.description, applicationReasonInfoTipDto.description) && fr.t.c(this.link, applicationReasonInfoTipDto.link) && fr.t.c(this.linkLabel, applicationReasonInfoTipDto.linkLabel) && this.type == applicationReasonInfoTipDto.type;
    }

    public int hashCode() {
        return (((((this.description.hashCode() * 31) + this.link.hashCode()) * 31) + this.linkLabel.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "ApplicationReasonInfoTipDto(description=" + this.description + ", link=" + this.link + ", linkLabel=" + this.linkLabel + ", type=" + this.type + ')';
    }
}
