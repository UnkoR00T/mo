package tt3;

import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Ltt3/b;", "", "Lmx/a;", "titleLabel", "placeholderLabel", "", "Ltt3/e;", "items", "Ltt3/a;", "addressNoSearchResultsData", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;Ltt3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ltt3/a;", "()Ltt3/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressSearchData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label titleLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label placeholderLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AddressSearchItemData> items;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressNoSearchResultsData addressNoSearchResultsData;

    public AddressSearchData(Label label, Label label2, List<AddressSearchItemData> list, AddressNoSearchResultsData aVar) {
        this.titleLabel = label;
        this.placeholderLabel = label2;
        this.items = list;
        this.addressNoSearchResultsData = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AddressNoSearchResultsData getAddressNoSearchResultsData() {
        return this.addressNoSearchResultsData;
    }

    public final List<AddressSearchItemData> b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getPlaceholderLabel() {
        return this.placeholderLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitleLabel() {
        return this.titleLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSearchData)) {
            return false;
        }
        AddressSearchData addressSearchData = (AddressSearchData) other;
        return t.c(this.titleLabel, addressSearchData.titleLabel) && t.c(this.placeholderLabel, addressSearchData.placeholderLabel) && t.c(this.items, addressSearchData.items) && t.c(this.addressNoSearchResultsData, addressSearchData.addressNoSearchResultsData);
    }

    public int hashCode() {
        return (((((this.titleLabel.hashCode() * 31) + this.placeholderLabel.hashCode()) * 31) + this.items.hashCode()) * 31) + this.addressNoSearchResultsData.hashCode();
    }

    public String toString() {
        return "AddressSearchData(titleLabel=" + this.titleLabel + ", placeholderLabel=" + this.placeholderLabel + ", items=" + this.items + ", addressNoSearchResultsData=" + this.addressNoSearchResultsData + ")";
    }
}
