package vr1;

import er.l;
import fr.t;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vr1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvr1/c;", "", "", "Lvr1/b;", "items", "selectedItem", "Lkotlin/Function1;", "Loq/i0;", "onItemSelected", "<init>", "(Ljava/util/List;Lvr1/b;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lvr1/b;", "c", "()Lvr1/b;", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropDownDocumentListData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DocumentListItem> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentListItem selectedItem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<DocumentListItem, i0> onItemSelected;

    /* JADX WARN: Multi-variable type inference failed */
    public DropDownDocumentListData(List<DocumentListItem> list, DocumentListItem documentListItem, l<? super DocumentListItem, i0> lVar) {
        this.items = list;
        this.selectedItem = documentListItem;
        this.onItemSelected = lVar;
    }

    public final List<DocumentListItem> a() {
        return this.items;
    }

    public final l<DocumentListItem, i0> b() {
        return this.onItemSelected;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DocumentListItem getSelectedItem() {
        return this.selectedItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropDownDocumentListData)) {
            return false;
        }
        DropDownDocumentListData dropDownDocumentListData = (DropDownDocumentListData) other;
        return t.c(this.items, dropDownDocumentListData.items) && t.c(this.selectedItem, dropDownDocumentListData.selectedItem) && t.c(this.onItemSelected, dropDownDocumentListData.onItemSelected);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        DocumentListItem documentListItem = this.selectedItem;
        return ((iHashCode + (documentListItem == null ? 0 : documentListItem.hashCode())) * 31) + this.onItemSelected.hashCode();
    }

    public String toString() {
        return "DropDownDocumentListData(items=" + this.items + ", selectedItem=" + this.selectedItem + ", onItemSelected=" + this.onItemSelected + ')';
    }
}
