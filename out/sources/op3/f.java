package op3;

import fr.t;
import oo0.Idea;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lop3/f;", "", "Loo0/i;", "idea", "<init>", "(Loo0/i;)V", "a", "Loo0/i;", "()Loo0/i;", "b", "Lop3/f$a;", "Lop3/f$b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Idea idea;

    /* JADX INFO: renamed from: op3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lop3/f$a;", "Lop3/f;", "Lkp3/a$a;", "ideaDetailsData", "<init>", "(Lkp3/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkp3/a$a;", "()Lkp3/a$a;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveRoundIdeaDetails extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final kp3.a.ActiveRoundIdea ideaDetailsData;

        public ActiveRoundIdeaDetails(kp3.a.ActiveRoundIdea activeRoundIdea) {
            super(activeRoundIdea.getIdea(), null);
            this.ideaDetailsData = activeRoundIdea;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final kp3.a.ActiveRoundIdea getIdeaDetailsData() {
            return this.ideaDetailsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActiveRoundIdeaDetails) && t.c(this.ideaDetailsData, ((ActiveRoundIdeaDetails) other).ideaDetailsData);
        }

        public int hashCode() {
            return this.ideaDetailsData.hashCode();
        }

        public String toString() {
            return "ActiveRoundIdeaDetails(ideaDetailsData=" + this.ideaDetailsData + ')';
        }
    }

    /* JADX INFO: renamed from: op3.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lop3/f$b;", "Lop3/f;", "Lkp3/a$b;", "ideaDetailsData", "<init>", "(Lkp3/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lkp3/a$b;", "()Lkp3/a$b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EndedRoundIdeaDetails extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final kp3.a.EndedRoundIdea ideaDetailsData;

        public EndedRoundIdeaDetails(kp3.a.EndedRoundIdea endedRoundIdea) {
            super(endedRoundIdea.getIdeaData(), null);
            this.ideaDetailsData = endedRoundIdea;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final kp3.a.EndedRoundIdea getIdeaDetailsData() {
            return this.ideaDetailsData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EndedRoundIdeaDetails) && t.c(this.ideaDetailsData, ((EndedRoundIdeaDetails) other).ideaDetailsData);
        }

        public int hashCode() {
            return this.ideaDetailsData.hashCode();
        }

        public String toString() {
            return "EndedRoundIdeaDetails(ideaDetailsData=" + this.ideaDetailsData + ')';
        }
    }

    public /* synthetic */ f(Idea idea, fr.k kVar) {
        this(idea);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Idea getIdea() {
        return this.idea;
    }

    private f(Idea idea) {
        this.idea = idea;
    }
}
