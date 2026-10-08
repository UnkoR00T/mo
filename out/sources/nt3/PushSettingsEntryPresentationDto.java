package nt3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nt3.j, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0017"}, d2 = {"Lnt3/j;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "description", "b", "Z", "()Z", "enabled", "c", "title", "d", "type", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushSettingsEntryPresentationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final String type;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushSettingsEntryPresentationDto)) {
            return false;
        }
        PushSettingsEntryPresentationDto pushSettingsEntryPresentationDto = (PushSettingsEntryPresentationDto) other;
        return t.c(this.description, pushSettingsEntryPresentationDto.description) && this.enabled == pushSettingsEntryPresentationDto.enabled && t.c(this.title, pushSettingsEntryPresentationDto.title) && t.c(this.type, pushSettingsEntryPresentationDto.type);
    }

    public int hashCode() {
        return (((((this.description.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31) + this.title.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "PushSettingsEntryPresentationDto(description=" + this.description + ", enabled=" + this.enabled + ", title=" + this.title + ", type=" + this.type + ')';
    }
}
