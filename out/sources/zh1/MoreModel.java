package zh1;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zh1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzh1/a;", "", "", "Lzh1/b;", "moreSections", "Ln50/k;", "logoutItem", "Li50/a;", "scaffoldData", "<init>", "(Ljava/util/List;Ln50/k;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ln50/k;", "()Ln50/k;", "c", "Li50/a;", "()Li50/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoreModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MoreSection> moreSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final k logoutItem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    public MoreModel(List<MoreSection> list, k kVar, BaseScaffoldData baseScaffoldData) {
        this.moreSections = list;
        this.logoutItem = kVar;
        this.scaffoldData = baseScaffoldData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getLogoutItem() {
        return this.logoutItem;
    }

    public final List<MoreSection> b() {
        return this.moreSections;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoreModel)) {
            return false;
        }
        MoreModel moreModel = (MoreModel) other;
        return t.c(this.moreSections, moreModel.moreSections) && t.c(this.logoutItem, moreModel.logoutItem) && t.c(this.scaffoldData, moreModel.scaffoldData);
    }

    public int hashCode() {
        return (((this.moreSections.hashCode() * 31) + this.logoutItem.hashCode()) * 31) + this.scaffoldData.hashCode();
    }

    public String toString() {
        return "MoreModel(moreSections=" + this.moreSections + ", logoutItem=" + this.logoutItem + ", scaffoldData=" + this.scaffoldData + ')';
    }
}
