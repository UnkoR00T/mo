package kp3;

import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import oo0.Idea;
import oo0.IdeaStatus;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lkp3/a;", "", "Loo0/i;", "idea", "<init>", "(Loo0/i;)V", "a", "Loo0/i;", "()Loo0/i;", "b", "Lkp3/a$a;", "Lkp3/a$b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Idea idea;

    /* JADX INFO: renamed from: kp3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkp3/a$a;", "Lkp3/a;", "Loo0/i;", "ideaData", "Ljava/time/OffsetDateTime;", "activeRoundEndDate", "<init>", "(Loo0/i;Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Loo0/i;", "c", "()Loo0/i;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveRoundIdea extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Idea ideaData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime activeRoundEndDate;

        public ActiveRoundIdea(Idea idea, OffsetDateTime offsetDateTime) {
            super(idea, null);
            this.ideaData = idea;
            this.activeRoundEndDate = offsetDateTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OffsetDateTime getActiveRoundEndDate() {
            return this.activeRoundEndDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Idea getIdeaData() {
            return this.ideaData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveRoundIdea)) {
                return false;
            }
            ActiveRoundIdea activeRoundIdea = (ActiveRoundIdea) other;
            return t.c(this.ideaData, activeRoundIdea.ideaData) && t.c(this.activeRoundEndDate, activeRoundIdea.activeRoundEndDate);
        }

        public int hashCode() {
            return (this.ideaData.hashCode() * 31) + this.activeRoundEndDate.hashCode();
        }

        public String toString() {
            return "ActiveRoundIdea(ideaData=" + this.ideaData + ", activeRoundEndDate=" + this.activeRoundEndDate + ')';
        }
    }

    /* JADX INFO: renamed from: kp3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkp3/a$b;", "Lkp3/a;", "Loo0/i;", "ideaData", "Loo0/l;", "status", "<init>", "(Loo0/i;Loo0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Loo0/i;", "()Loo0/i;", "c", "Loo0/l;", "()Loo0/l;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EndedRoundIdea extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Idea ideaData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdeaStatus status;

        public EndedRoundIdea(Idea idea, IdeaStatus ideaStatus) {
            super(idea, null);
            this.ideaData = idea;
            this.status = ideaStatus;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Idea getIdeaData() {
            return this.ideaData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final IdeaStatus getStatus() {
            return this.status;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EndedRoundIdea)) {
                return false;
            }
            EndedRoundIdea endedRoundIdea = (EndedRoundIdea) other;
            return t.c(this.ideaData, endedRoundIdea.ideaData) && t.c(this.status, endedRoundIdea.status);
        }

        public int hashCode() {
            return (this.ideaData.hashCode() * 31) + this.status.hashCode();
        }

        public String toString() {
            return "EndedRoundIdea(ideaData=" + this.ideaData + ", status=" + this.status + ')';
        }
    }

    public /* synthetic */ a(Idea idea, k kVar) {
        this(idea);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Idea getIdea() {
        return this.idea;
    }

    private a(Idea idea) {
        this.idea = idea;
    }
}
