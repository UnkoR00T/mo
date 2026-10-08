package eo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.w0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\"\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Leo0/w0;", "", "Leo0/v0;", "category", "", "Leo0/r0;", "referenceRegistryList", "", "name", "entityName", "surname", "Leo0/s0;", "address", "<init>", "(Leo0/v0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leo0/s0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/v0;", "b", "()Leo0/v0;", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Ljava/lang/String;", "d", "f", "Leo0/s0;", "()Leo0/s0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final v0 category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<r0> referenceRegistryList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String entityName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surname;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final SearchAddressRequest address;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchRequest(v0 v0Var, List<? extends r0> list, String str, String str2, String str3, SearchAddressRequest searchAddressRequest) {
        this.category = v0Var;
        this.referenceRegistryList = list;
        this.name = str;
        this.entityName = str2;
        this.surname = str3;
        this.address = searchAddressRequest;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SearchAddressRequest getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v0 getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEntityName() {
        return this.entityName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<r0> e() {
        return this.referenceRegistryList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRequest)) {
            return false;
        }
        SearchRequest searchRequest = (SearchRequest) other;
        return this.category == searchRequest.category && fr.t.c(this.referenceRegistryList, searchRequest.referenceRegistryList) && fr.t.c(this.name, searchRequest.name) && fr.t.c(this.entityName, searchRequest.entityName) && fr.t.c(this.surname, searchRequest.surname) && fr.t.c(this.address, searchRequest.address);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        List<r0> list = this.referenceRegistryList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entityName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SearchAddressRequest searchAddressRequest = this.address;
        return iHashCode5 + (searchAddressRequest != null ? searchAddressRequest.hashCode() : 0);
    }

    public String toString() {
        return "SearchRequest(category=" + this.category + ", referenceRegistryList=" + this.referenceRegistryList + ", name=" + this.name + ", entityName=" + this.entityName + ", surname=" + this.surname + ", address=" + this.address + ")";
    }
}
