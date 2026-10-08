package c93;

import fr.t;
import java.util.List;
import oo0.CategoryTopics;
import oo0.Topic;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: c93.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc93/a;", "", "", "Loo0/d;", "categories", "Loo0/u$b;", "selectedTopic", "<init>", "(Ljava/util/List;Loo0/u$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Loo0/u$b;", "()Loo0/u$b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopicListSetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CategoryTopics> categories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Topic.b selectedTopic;

    public TopicListSetupData(List<CategoryTopics> list, Topic.b bVar) {
        this.categories = list;
        this.selectedTopic = bVar;
    }

    public final List<CategoryTopics> a() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Topic.b getSelectedTopic() {
        return this.selectedTopic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicListSetupData)) {
            return false;
        }
        TopicListSetupData topicListSetupData = (TopicListSetupData) other;
        return t.c(this.categories, topicListSetupData.categories) && this.selectedTopic == topicListSetupData.selectedTopic;
    }

    public int hashCode() {
        int iHashCode = this.categories.hashCode() * 31;
        Topic.b bVar = this.selectedTopic;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "TopicListSetupData(categories=" + this.categories + ", selectedTopic=" + this.selectedTopic + ')';
    }
}
