package oo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Loo0/d;", "", "Loo0/c;", "category", "", "Loo0/u;", "topics", "<init>", "(Loo0/c;Ljava/util/List;)V", "a", "(Loo0/c;Ljava/util/List;)Loo0/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loo0/c;", "c", "()Loo0/c;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryTopics {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Category category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Topic> topics;

    public CategoryTopics(Category category, List<Topic> list) {
        this.category = category;
        this.topics = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryTopics b(CategoryTopics categoryTopics, Category category, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            category = categoryTopics.category;
        }
        if ((i15 & 2) != 0) {
            list = categoryTopics.topics;
        }
        return categoryTopics.a(category, list);
    }

    public final CategoryTopics a(Category category, List<Topic> topics) {
        return new CategoryTopics(category, topics);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    public final List<Topic> d() {
        return this.topics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryTopics)) {
            return false;
        }
        CategoryTopics categoryTopics = (CategoryTopics) other;
        return fr.t.c(this.category, categoryTopics.category) && fr.t.c(this.topics, categoryTopics.topics);
    }

    public int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        List<Topic> list = this.topics;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "CategoryTopics(category=" + this.category + ", topics=" + this.topics + ")";
    }
}
