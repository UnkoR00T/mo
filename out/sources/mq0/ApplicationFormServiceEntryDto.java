package mq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001d\u0010\u0004¨\u0006\u001f"}, d2 = {"Lmq0/g;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "description", "b", "name", "Lmq0/j;", "c", "Lmq0/j;", "e", "()Lmq0/j;", "type", "Lmq0/i;", "d", "Lmq0/i;", "()Lmq0/i;", "nativeType", "supplementOrigin", "f", "webUrl", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicationFormServiceEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final j type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nativeType")
    private final i nativeType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("supplementOrigin")
    private final String supplementOrigin;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("webUrl")
    private final String webUrl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getNativeType() {
        return this.nativeType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSupplementOrigin() {
        return this.supplementOrigin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationFormServiceEntryDto)) {
            return false;
        }
        ApplicationFormServiceEntryDto applicationFormServiceEntryDto = (ApplicationFormServiceEntryDto) other;
        return fr.t.c(this.description, applicationFormServiceEntryDto.description) && fr.t.c(this.name, applicationFormServiceEntryDto.name) && this.type == applicationFormServiceEntryDto.type && this.nativeType == applicationFormServiceEntryDto.nativeType && fr.t.c(this.supplementOrigin, applicationFormServiceEntryDto.supplementOrigin) && fr.t.c(this.webUrl, applicationFormServiceEntryDto.webUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        int iHashCode = ((((this.description.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31;
        i iVar = this.nativeType;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.supplementOrigin;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webUrl;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationFormServiceEntryDto(description=" + this.description + ", name=" + this.name + ", type=" + this.type + ", nativeType=" + this.nativeType + ", supplementOrigin=" + this.supplementOrigin + ", webUrl=" + this.webUrl + ')';
    }
}
