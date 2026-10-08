package iq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0019"}, d2 = {"Liq0/d0;", "", "", "documentType", "", "Liq0/f0;", "tagsByLanguage", "subType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchTagsForDocumentType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SearchTagsWithLanguage> tagsByLanguage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subType;

    public SearchTagsForDocumentType(String str, List<SearchTagsWithLanguage> list, String str2) {
        this.documentType = str;
        this.tagsByLanguage = list;
        this.subType = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    public final List<SearchTagsWithLanguage> c() {
        return this.tagsByLanguage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTagsForDocumentType)) {
            return false;
        }
        SearchTagsForDocumentType searchTagsForDocumentType = (SearchTagsForDocumentType) other;
        return fr.t.c(this.documentType, searchTagsForDocumentType.documentType) && fr.t.c(this.tagsByLanguage, searchTagsForDocumentType.tagsByLanguage) && fr.t.c(this.subType, searchTagsForDocumentType.subType);
    }

    public int hashCode() {
        int iHashCode = ((this.documentType.hashCode() * 31) + this.tagsByLanguage.hashCode()) * 31;
        String str = this.subType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SearchTagsForDocumentType(documentType=" + this.documentType + ", tagsByLanguage=" + this.tagsByLanguage + ", subType=" + this.subType + ")";
    }
}
