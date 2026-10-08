package gi1;

import fr.t;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gi1.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgi1/c;", "", "Lmx/a;", "userServiceListHeader", "emptyFavouritesLabel", "emptyAllServicesLabel", "", "Ln50/g;", "userServiceList", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserServiceSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label userServiceListHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label emptyFavouritesLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label emptyAllServicesLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DefaultSingleCardData> userServiceList;

    public UserServiceSection(Label label, Label label2, Label label3, List<DefaultSingleCardData> list) {
        this.userServiceListHeader = label;
        this.emptyFavouritesLabel = label2;
        this.emptyAllServicesLabel = label3;
        this.userServiceList = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getEmptyAllServicesLabel() {
        return this.emptyAllServicesLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getEmptyFavouritesLabel() {
        return this.emptyFavouritesLabel;
    }

    public final List<DefaultSingleCardData> c() {
        return this.userServiceList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getUserServiceListHeader() {
        return this.userServiceListHeader;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserServiceSection)) {
            return false;
        }
        UserServiceSection userServiceSection = (UserServiceSection) other;
        return t.c(this.userServiceListHeader, userServiceSection.userServiceListHeader) && t.c(this.emptyFavouritesLabel, userServiceSection.emptyFavouritesLabel) && t.c(this.emptyAllServicesLabel, userServiceSection.emptyAllServicesLabel) && t.c(this.userServiceList, userServiceSection.userServiceList);
    }

    public int hashCode() {
        return (((((this.userServiceListHeader.hashCode() * 31) + this.emptyFavouritesLabel.hashCode()) * 31) + this.emptyAllServicesLabel.hashCode()) * 31) + this.userServiceList.hashCode();
    }

    public String toString() {
        return "UserServiceSection(userServiceListHeader=" + this.userServiceListHeader + ", emptyFavouritesLabel=" + this.emptyFavouritesLabel + ", emptyAllServicesLabel=" + this.emptyAllServicesLabel + ", userServiceList=" + this.userServiceList + ')';
    }
}
