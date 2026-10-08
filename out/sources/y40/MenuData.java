package y40;

import fr.t;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y40.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Ly40/a;", "", "", "isMenuVisible", "Lkotlin/Function0;", "Loq/i0;", "onMenuClose", "", "Ly40/b;", "items", "<init>", "(ZLer/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ler/a;", "()Ler/a;", "Ljava/util/List;", "()Ljava/util/List;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MenuData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMenuVisible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onMenuClose;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<b> items;

    public MenuData(boolean z15, er.a<i0> aVar, List<b> list) {
        this.isMenuVisible = z15;
        this.onMenuClose = aVar;
        this.items = list;
    }

    public final List<b> a() {
        return this.items;
    }

    public final er.a<i0> b() {
        return this.onMenuClose;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsMenuVisible() {
        return this.isMenuVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuData)) {
            return false;
        }
        MenuData menuData = (MenuData) other;
        return this.isMenuVisible == menuData.isMenuVisible && t.c(this.onMenuClose, menuData.onMenuClose) && t.c(this.items, menuData.items);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isMenuVisible) * 31) + this.onMenuClose.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "MenuData(isMenuVisible=" + this.isMenuVisible + ", onMenuClose=" + this.onMenuClose + ", items=" + this.items + ')';
    }
}
