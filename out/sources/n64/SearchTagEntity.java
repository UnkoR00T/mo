package n64;

import fr.k;
import fr.t;
import iq0.a0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n64.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u000fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001d\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\u000f¨\u0006$"}, d2 = {"Ln64/d;", "", "", "id", "", "tag", "Liq0/a0;", "language", "type", "Lo64/c;", "mainType", "subType", "<init>", "(JLjava/lang/String;Liq0/a0;Ljava/lang/String;Lo64/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "e", "c", "Liq0/a0;", "()Liq0/a0;", "d", "f", "Lo64/c;", "()Lo64/c;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchTagEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 language;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final o64.c mainType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subType;

    public SearchTagEntity(long j15, String str, a0 a0Var, String str2, o64.c cVar, String str3) {
        this.id = j15;
        this.tag = str;
        this.language = a0Var;
        this.type = str2;
        this.mainType = cVar;
        this.subType = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0 getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o64.c getMainType() {
        return this.mainType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTagEntity)) {
            return false;
        }
        SearchTagEntity searchTagEntity = (SearchTagEntity) other;
        return this.id == searchTagEntity.id && t.c(this.tag, searchTagEntity.tag) && this.language == searchTagEntity.language && t.c(this.type, searchTagEntity.type) && this.mainType == searchTagEntity.mainType && t.c(this.subType, searchTagEntity.subType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.id) * 31) + this.tag.hashCode()) * 31) + this.language.hashCode()) * 31) + this.type.hashCode()) * 31) + this.mainType.hashCode()) * 31;
        String str = this.subType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SearchTagEntity(id=" + this.id + ", tag=" + this.tag + ", language=" + this.language + ", type=" + this.type + ", mainType=" + this.mainType + ", subType=" + this.subType + ')';
    }

    public /* synthetic */ SearchTagEntity(long j15, String str, a0 a0Var, String str2, o64.c cVar, String str3, int i15, k kVar) {
        this((i15 & 1) != 0 ? 0L : j15, str, a0Var, str2, cVar, str3);
    }
}
