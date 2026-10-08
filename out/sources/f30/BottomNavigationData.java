package f30;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, d2 = {"Lf30/a;", "", "", "Lf30/b;", "items", "", "selectedItemIndex", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomNavigationData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58833c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BottomNavigationItem> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int selectedItemIndex;

    public BottomNavigationData(List<BottomNavigationItem> list, int i15) {
        this.items = list;
        this.selectedItemIndex = i15;
    }

    public final List<BottomNavigationItem> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSelectedItemIndex() {
        return this.selectedItemIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomNavigationData)) {
            return false;
        }
        BottomNavigationData bottomNavigationData = (BottomNavigationData) other;
        return t.c(this.items, bottomNavigationData.items) && this.selectedItemIndex == bottomNavigationData.selectedItemIndex;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Integer.hashCode(this.selectedItemIndex);
    }

    public String toString() {
        return "BottomNavigationData(items=" + this.items + ", selectedItemIndex=" + this.selectedItemIndex + ')';
    }
}
