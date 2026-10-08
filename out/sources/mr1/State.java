package mr1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mr1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lmr1/e;", "", "", "", "urlList", "selectedUrl", "", "bottomSheetVisible", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "a", "(Ljava/util/List;Ljava/lang/String;Z)Lmr1/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Ljava/lang/String;", "d", "c", "Z", "()Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> urlList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bottomSheetVisible;

    public State(List<String> list, String str, boolean z15) {
        this.urlList = list;
        this.selectedUrl = str;
        this.bottomSheetVisible = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, String str, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.urlList;
        }
        if ((i15 & 2) != 0) {
            str = state.selectedUrl;
        }
        if ((i15 & 4) != 0) {
            z15 = state.bottomSheetVisible;
        }
        return state.a(list, str, z15);
    }

    public final State a(List<String> urlList, String selectedUrl, boolean bottomSheetVisible) {
        return new State(urlList, selectedUrl, bottomSheetVisible);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getBottomSheetVisible() {
        return this.bottomSheetVisible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedUrl() {
        return this.selectedUrl;
    }

    public final List<String> e() {
        return this.urlList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.urlList, state.urlList) && fr.t.c(this.selectedUrl, state.selectedUrl) && this.bottomSheetVisible == state.bottomSheetVisible;
    }

    public int hashCode() {
        return (((this.urlList.hashCode() * 31) + this.selectedUrl.hashCode()) * 31) + Boolean.hashCode(this.bottomSheetVisible);
    }

    public String toString() {
        return "State(urlList=" + this.urlList + ", selectedUrl=" + this.selectedUrl + ", bottomSheetVisible=" + this.bottomSheetVisible + ')';
    }
}
