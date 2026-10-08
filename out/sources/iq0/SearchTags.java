package iq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.b0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, d2 = {"Liq0/b0;", "", "", "checksum", "", "Liq0/e0;", "tagsByServiceTypes", "Liq0/d0;", "tagsByDocumentTypes", "Liq0/c0;", "tagsByAppMenuTypes", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchTags {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String checksum;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SearchTagsForServiceType> tagsByServiceTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SearchTagsForDocumentType> tagsByDocumentTypes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SearchTagsForAppMenuType> tagsByAppMenuTypes;

    public SearchTags(String str, List<SearchTagsForServiceType> list, List<SearchTagsForDocumentType> list2, List<SearchTagsForAppMenuType> list3) {
        this.checksum = str;
        this.tagsByServiceTypes = list;
        this.tagsByDocumentTypes = list2;
        this.tagsByAppMenuTypes = list3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    public final List<SearchTagsForAppMenuType> b() {
        return this.tagsByAppMenuTypes;
    }

    public final List<SearchTagsForDocumentType> c() {
        return this.tagsByDocumentTypes;
    }

    public final List<SearchTagsForServiceType> d() {
        return this.tagsByServiceTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTags)) {
            return false;
        }
        SearchTags searchTags = (SearchTags) other;
        return fr.t.c(this.checksum, searchTags.checksum) && fr.t.c(this.tagsByServiceTypes, searchTags.tagsByServiceTypes) && fr.t.c(this.tagsByDocumentTypes, searchTags.tagsByDocumentTypes) && fr.t.c(this.tagsByAppMenuTypes, searchTags.tagsByAppMenuTypes);
    }

    public int hashCode() {
        return (((((this.checksum.hashCode() * 31) + this.tagsByServiceTypes.hashCode()) * 31) + this.tagsByDocumentTypes.hashCode()) * 31) + this.tagsByAppMenuTypes.hashCode();
    }

    public String toString() {
        return "SearchTags(checksum=" + this.checksum + ", tagsByServiceTypes=" + this.tagsByServiceTypes + ", tagsByDocumentTypes=" + this.tagsByDocumentTypes + ", tagsByAppMenuTypes=" + this.tagsByAppMenuTypes + ")";
    }
}
