package u01;

import fr.t;
import java.util.List;
import oo0.Category;
import oo0.Topic;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: u01.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lu01/b;", "", "Loo0/c$a;", "suggestionCategoryCode", "", "Loo0/u;", "topics", "<init>", "(Loo0/c$a;Ljava/util/List;)V", "a", "(Loo0/c$a;Ljava/util/List;)Lu01/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loo0/c$a;", "c", "()Loo0/c$a;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Category.a suggestionCategoryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Topic> topics;

    public State(Category.a aVar, List<Topic> list) {
        this.suggestionCategoryCode = aVar;
        this.topics = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, Category.a aVar, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.suggestionCategoryCode;
        }
        if ((i15 & 2) != 0) {
            list = state.topics;
        }
        return state.a(aVar, list);
    }

    public final State a(Category.a suggestionCategoryCode, List<Topic> topics) {
        return new State(suggestionCategoryCode, topics);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Category.a getSuggestionCategoryCode() {
        return this.suggestionCategoryCode;
    }

    public final List<Topic> d() {
        return this.topics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.suggestionCategoryCode == state.suggestionCategoryCode && t.c(this.topics, state.topics);
    }

    public int hashCode() {
        return (this.suggestionCategoryCode.hashCode() * 31) + this.topics.hashCode();
    }

    public String toString() {
        return "State(suggestionCategoryCode=" + this.suggestionCategoryCode + ", topics=" + this.topics + ')';
    }

    public /* synthetic */ State(Category.a aVar, List list, int i15, fr.k kVar) {
        this(aVar, (i15 & 2) != 0 ? v.n() : list);
    }
}
