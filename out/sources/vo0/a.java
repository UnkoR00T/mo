package vo0;

import dx.i;
import java.util.List;
import oo0.EndedIdeaVoteRound;
import oo0.EndedRoundVotingResult;
import oo0.IdeaVoteRound;
import oo0.IdeaVoteRounds;
import oo0.IdeasRoundDetails;
import oo0.RoundSummaryModel;
import oo0.k;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H¦@¢\u0006\u0004\b\r\u0010\u0006J4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0006J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u0017\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0019\u0010\u000bJ\"\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0002H¦@¢\u0006\u0004\b\u001c\u0010\u0006J\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u0002H¦@¢\u0006\u0004\b\u001e\u0010\u0006¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lvo0/a;", "", "Ldx/i;", "Ldx/b;", "Loo0/r;", "e", "(Ltq/e;)Ljava/lang/Object;", "", "ideaId", "Loq/i0;", "f", "(JLtq/e;)Ljava/lang/Object;", "Loo0/t;", "d", "", "topic", "description", "Loo0/k;", "category", "h", "(Ljava/lang/String;Ljava/lang/String;Loo0/k;Ltq/e;)Ljava/lang/Object;", "Loo0/q;", "c", "roundId", "Loo0/f;", "b", "", "Loo0/e;", "a", "Loo0/n;", "g", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i<? extends dx.b, ? extends List<EndedIdeaVoteRound>>> eVar);

    Object b(long j15, e<? super i<? extends dx.b, EndedRoundVotingResult>> eVar);

    Object c(e<? super i<? extends dx.b, IdeaVoteRounds>> eVar);

    Object d(e<? super i<? extends dx.b, RoundSummaryModel>> eVar);

    Object e(e<? super i<? extends dx.b, IdeasRoundDetails>> eVar);

    Object f(long j15, e<? super i<? extends dx.b, i0>> eVar);

    Object g(e<? super i<? extends dx.b, IdeaVoteRound>> eVar);

    Object h(String str, String str2, k kVar, e<? super i<? extends dx.b, i0>> eVar);
}
