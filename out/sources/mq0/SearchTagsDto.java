package mq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mq0.e0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Lmq0/e0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "checksum", "", "Lmq0/a0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "tagsByDashboardTypes", "Lmq0/b0;", "c", "tagsByDocumentTypes", "Lmq0/d0;", "d", "tagsByMobileAppMenuSearchTagTypes", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchTagsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("checksum")
    private final String checksum;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tagsByDashboardTypes")
    private final List<SearchTagsByDashboardServiceType> tagsByDashboardTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tagsByDocumentTypes")
    private final List<SearchTagsByDocumentType> tagsByDocumentTypes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("tagsByMobileAppMenuSearchTagTypes")
    private final List<SearchTagsByMobileAppMenuSearchTagType> tagsByMobileAppMenuSearchTagTypes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    public final List<SearchTagsByDashboardServiceType> b() {
        return this.tagsByDashboardTypes;
    }

    public final List<SearchTagsByDocumentType> c() {
        return this.tagsByDocumentTypes;
    }

    public final List<SearchTagsByMobileAppMenuSearchTagType> d() {
        return this.tagsByMobileAppMenuSearchTagTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTagsDto)) {
            return false;
        }
        SearchTagsDto searchTagsDto = (SearchTagsDto) other;
        return fr.t.c(this.checksum, searchTagsDto.checksum) && fr.t.c(this.tagsByDashboardTypes, searchTagsDto.tagsByDashboardTypes) && fr.t.c(this.tagsByDocumentTypes, searchTagsDto.tagsByDocumentTypes) && fr.t.c(this.tagsByMobileAppMenuSearchTagTypes, searchTagsDto.tagsByMobileAppMenuSearchTagTypes);
    }

    public int hashCode() {
        return (((((this.checksum.hashCode() * 31) + this.tagsByDashboardTypes.hashCode()) * 31) + this.tagsByDocumentTypes.hashCode()) * 31) + this.tagsByMobileAppMenuSearchTagTypes.hashCode();
    }

    public String toString() {
        return "SearchTagsDto(checksum=" + this.checksum + ", tagsByDashboardTypes=" + this.tagsByDashboardTypes + ", tagsByDocumentTypes=" + this.tagsByDocumentTypes + ", tagsByMobileAppMenuSearchTagTypes=" + this.tagsByMobileAppMenuSearchTagTypes + ')';
    }
}
