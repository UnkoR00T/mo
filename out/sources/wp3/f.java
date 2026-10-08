package wp3;

import oo0.RoundSummaryModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwp3/f;", "", "a", "b", "Lwp3/f$a;", "Lwp3/f$b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwp3/f$a;", "Lwp3/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f214329a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1747430232;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: wp3.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwp3/f$b;", "Lwp3/f;", "Loo0/t;", "roundSummary", "", "isVoteIdeaDevFFEnabled", "<init>", "(Loo0/t;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loo0/t;", "()Loo0/t;", "b", "Z", "()Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RoundSummaryModel roundSummary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isVoteIdeaDevFFEnabled;

        public Initialized(RoundSummaryModel roundSummaryModel, boolean z15) {
            this.roundSummary = roundSummaryModel;
            this.isVoteIdeaDevFFEnabled = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RoundSummaryModel getRoundSummary() {
            return this.roundSummary;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsVoteIdeaDevFFEnabled() {
            return this.isVoteIdeaDevFFEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.roundSummary, initialized.roundSummary) && this.isVoteIdeaDevFFEnabled == initialized.isVoteIdeaDevFFEnabled;
        }

        public int hashCode() {
            return (this.roundSummary.hashCode() * 31) + Boolean.hashCode(this.isVoteIdeaDevFFEnabled);
        }

        public String toString() {
            return "Initialized(roundSummary=" + this.roundSummary + ", isVoteIdeaDevFFEnabled=" + this.isVoteIdeaDevFFEnabled + ')';
        }
    }
}
