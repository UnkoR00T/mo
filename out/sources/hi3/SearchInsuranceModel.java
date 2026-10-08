package hi3;

import fr.t;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hi3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhi3/b;", "", "Lmx/a;", "titleLabel", "placeholderLabel", "", "Lhi3/a;", "items", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchInsuranceModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label titleLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label placeholderLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SearchInsuranceItem> items;

    public SearchInsuranceModel(Label label, Label label2, List<SearchInsuranceItem> list) {
        this.titleLabel = label;
        this.placeholderLabel = label2;
        this.items = list;
    }

    public final List<SearchInsuranceItem> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getPlaceholderLabel() {
        return this.placeholderLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getTitleLabel() {
        return this.titleLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchInsuranceModel)) {
            return false;
        }
        SearchInsuranceModel searchInsuranceModel = (SearchInsuranceModel) other;
        return t.c(this.titleLabel, searchInsuranceModel.titleLabel) && t.c(this.placeholderLabel, searchInsuranceModel.placeholderLabel) && t.c(this.items, searchInsuranceModel.items);
    }

    public int hashCode() {
        return (((this.titleLabel.hashCode() * 31) + this.placeholderLabel.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "SearchInsuranceModel(titleLabel=" + this.titleLabel + ", placeholderLabel=" + this.placeholderLabel + ", items=" + this.items + ')';
    }
}
