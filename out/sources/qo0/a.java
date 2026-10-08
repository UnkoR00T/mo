package qo0;

import ge4.x;
import ie4.f;
import ie4.o;
import ie4.s;
import oq.i0;
import p071kotlin.Metadata;
import so0.AddIdeaRequestDto;
import so0.EndedIdeaVoteRoundResponseDto;
import so0.EndedIdeaVoteRoundVotingResultResponseDto;
import so0.IdeaVoteRoundDtoDto;
import so0.IdeaVoteRoundResponseDto;
import so0.IdeaVoteRoundSummaryDtoDto;
import so0.IdeasResponseDto;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H§@¢\u0006\u0004\b\u0011\u0010\nJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H§@¢\u0006\u0004\b\u0013\u0010\nJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H§@¢\u0006\u0004\b\u0015\u0010\nJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H§@¢\u0006\u0004\b\u0017\u0010\nJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0019\u0010\u000f¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lqo0/a;", "", "Lso0/a;", "addIdeaRequestDto", "Lge4/x;", "Loq/i0;", "d", "(Lso0/a;Ltq/e;)Ljava/lang/Object;", "Lso0/r;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "roundId", "Lso0/k;", "b", "(JLtq/e;)Ljava/lang/Object;", "Lso0/h;", "a", "Lso0/t;", "f", "Lso0/s;", "h", "Lso0/v;", "e", "ideaId", "g", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("feedback/mobile/api/ideas/idea-vote-rounds/ended")
    Object a(e<? super x<EndedIdeaVoteRoundResponseDto>> eVar);

    @f("feedback/mobile/api/ideas/idea-vote-rounds/ended/{roundId}")
    Object b(@s("roundId") long j15, e<? super x<EndedIdeaVoteRoundVotingResultResponseDto>> eVar);

    @f("feedback/mobile/api/ideas/idea-vote-rounds/active")
    Object c(e<? super x<IdeaVoteRoundDtoDto>> eVar);

    @o("feedback/mobile/api/ideas")
    Object d(@ie4.a AddIdeaRequestDto addIdeaRequestDto, e<? super x<i0>> eVar);

    @f("feedback/mobile/api/ideas")
    Object e(e<? super x<IdeasResponseDto>> eVar);

    @f("feedback/mobile/api/ideas/idea-vote-rounds/summary")
    Object f(e<? super x<IdeaVoteRoundSummaryDtoDto>> eVar);

    @o("feedback/mobile/api/ideas/{ideaId}/vote")
    Object g(@s("ideaId") long j15, e<? super x<i0>> eVar);

    @f("feedback/mobile/api/ideas/idea-vote-rounds")
    @oq.a
    Object h(e<? super x<IdeaVoteRoundResponseDto>> eVar);
}
