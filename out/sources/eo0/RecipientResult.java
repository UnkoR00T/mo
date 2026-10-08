package eo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.n0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006!"}, d2 = {"Leo0/n0;", "", "", "Leo0/t0;", "addressList", "", "fullName", "Leo0/r0;", "referenceRegistryList", "Leo0/m0;", "recipientInfo", "nextPageId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Leo0/m0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "e", "d", "Leo0/m0;", "()Leo0/m0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SearchAddressResult> addressList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<r0> referenceRegistryList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final RecipientInfo recipientInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPageId;

    /* JADX WARN: Multi-variable type inference failed */
    public RecipientResult(List<SearchAddressResult> list, String str, List<? extends r0> list2, RecipientInfo recipientInfo, String str2) {
        this.addressList = list;
        this.fullName = str;
        this.referenceRegistryList = list2;
        this.recipientInfo = recipientInfo;
        this.nextPageId = str2;
    }

    public final List<SearchAddressResult> a() {
        return this.addressList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final RecipientInfo getRecipientInfo() {
        return this.recipientInfo;
    }

    public final List<r0> e() {
        return this.referenceRegistryList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecipientResult)) {
            return false;
        }
        RecipientResult recipientResult = (RecipientResult) other;
        return fr.t.c(this.addressList, recipientResult.addressList) && fr.t.c(this.fullName, recipientResult.fullName) && fr.t.c(this.referenceRegistryList, recipientResult.referenceRegistryList) && fr.t.c(this.recipientInfo, recipientResult.recipientInfo) && fr.t.c(this.nextPageId, recipientResult.nextPageId);
    }

    public int hashCode() {
        List<SearchAddressResult> list = this.addressList;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.fullName.hashCode()) * 31;
        List<r0> list2 = this.referenceRegistryList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        RecipientInfo recipientInfo = this.recipientInfo;
        int iHashCode3 = (iHashCode2 + (recipientInfo == null ? 0 : recipientInfo.hashCode())) * 31;
        String str = this.nextPageId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RecipientResult(addressList=" + this.addressList + ", fullName=" + this.fullName + ", referenceRegistryList=" + this.referenceRegistryList + ", recipientInfo=" + this.recipientInfo + ", nextPageId=" + this.nextPageId + ")";
    }
}
