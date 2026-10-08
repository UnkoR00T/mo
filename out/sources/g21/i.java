package g21;

import fr.t;
import iy.b0;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@p071kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lg21/i;", "", "a", "b", "Lg21/i$a;", "Lg21/i$b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: g21.i$a, reason: from toString */
    @p071kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lg21/i$a;", "Lg21/i;", "", "content", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String content;

        public Content(String str) {
            this.content = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && t.c(this.content, ((Content) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "Content(content=" + this.content + ')';
        }
    }

    /* JADX INFO: renamed from: g21.i$b, reason: from toString */
    @p071kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u001d\u0010\u0014¨\u0006&"}, d2 = {"Lg21/i$b;", "Lg21/i;", "Liy/b0;", "responseId", "", "Lg21/g;", "sources", "Lg21/a;", "actions", "", "suggestions", "", "showRating", "", "currentMessages", "<init>", "(Liy/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "f", "Z", "()Z", "I", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Metadata implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 responseId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Source> sources;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Action> actions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> suggestions;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showRating;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int currentMessages;

        public Metadata(b0 b0Var, List<Source> list, List<Action> list2, List<String> list3, boolean z15, int i15) {
            this.responseId = b0Var;
            this.sources = list;
            this.actions = list2;
            this.suggestions = list3;
            this.showRating = z15;
            this.currentMessages = i15;
        }

        public final List<Action> a() {
            return this.actions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCurrentMessages() {
            return this.currentMessages;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getResponseId() {
            return this.responseId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowRating() {
            return this.showRating;
        }

        public final List<Source> e() {
            return this.sources;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return t.c(this.responseId, metadata.responseId) && t.c(this.sources, metadata.sources) && t.c(this.actions, metadata.actions) && t.c(this.suggestions, metadata.suggestions) && this.showRating == metadata.showRating && this.currentMessages == metadata.currentMessages;
        }

        public final List<String> f() {
            return this.suggestions;
        }

        public int hashCode() {
            return (((((((((this.responseId.hashCode() * 31) + this.sources.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.suggestions.hashCode()) * 31) + Boolean.hashCode(this.showRating)) * 31) + Integer.hashCode(this.currentMessages);
        }

        public String toString() {
            return "Metadata(responseId=" + this.responseId + ", sources=" + this.sources + ", actions=" + this.actions + ", suggestions=" + this.suggestions + ", showRating=" + this.showRating + ", currentMessages=" + this.currentMessages + ')';
        }
    }
}
