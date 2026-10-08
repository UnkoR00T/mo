package b70;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b70.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb70/b;", "", "", "isError", "requirementsVisible", "", "Lb70/a;", "requirementItems", "<init>", "(ZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RequirementListData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16989d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isError;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requirementsVisible;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RequirementItem> requirementItems;

    public RequirementListData(boolean z15, boolean z16, List<RequirementItem> list) {
        this.isError = z15;
        this.requirementsVisible = z16;
        this.requirementItems = list;
    }

    public final List<RequirementItem> a() {
        return this.requirementItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRequirementsVisible() {
        return this.requirementsVisible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequirementListData)) {
            return false;
        }
        RequirementListData requirementListData = (RequirementListData) other;
        return this.isError == requirementListData.isError && this.requirementsVisible == requirementListData.requirementsVisible && t.c(this.requirementItems, requirementListData.requirementItems);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isError) * 31) + Boolean.hashCode(this.requirementsVisible)) * 31) + this.requirementItems.hashCode();
    }

    public String toString() {
        return "RequirementListData(isError=" + this.isError + ", requirementsVisible=" + this.requirementsVisible + ", requirementItems=" + this.requirementItems + ')';
    }
}
