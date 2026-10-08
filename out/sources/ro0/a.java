package ro0;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oo0.EndedIdeaVoteRound;
import oo0.EndedRoundVotingResult;
import oo0.Idea;
import oo0.IdeaCategory;
import oo0.IdeaStatus;
import oo0.IdeaVoteRound;
import oo0.IdeaVoteRoundConfiguration;
import oo0.IdeaVoteRoundWithPromotedIdeas;
import oo0.IdeaVoteRounds;
import oo0.IdeasRoundDetails;
import oo0.PromotedIdea;
import oo0.RoundSummaryModel;
import oo0.g;
import oo0.h;
import oo0.k;
import oo0.m;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import so0.AddIdeaRequestDto;
import so0.EndedIdeaVoteRoundDtoDto;
import so0.EndedIdeaVoteRoundResponseDto;
import so0.EndedIdeaVoteRoundVotingResultDtoDto;
import so0.EndedIdeaVoteRoundVotingResultPromotedIdeaDtoDto;
import so0.EndedIdeaVoteRoundVotingResultResponseDto;
import so0.IdeaCategoryDtoDto;
import so0.IdeaDtoDto;
import so0.IdeaStatusDtoDto;
import so0.IdeaVoteRoundConfigurationDtoDto;
import so0.IdeaVoteRoundDtoDto;
import so0.IdeaVoteRoundResponseDto;
import so0.IdeaVoteRoundSummaryDtoDto;
import so0.IdeaVoteRoundWithPromotedIdeasDtoDto;
import so0.IdeasResponseDto;
import so0.PromotedIdeaDtoDto;
import so0.l;
import so0.o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0019\u001a\u00020\u0018*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010-\u001a\u00020,*\u00020+¢\u0006\u0004\b-\u0010.\u001a\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002010/*\b\u0012\u0004\u0012\u0002000/H\u0007¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0/*\b\u0012\u0004\u0012\u00020<0/H\u0007¢\u0006\u0004\b>\u00103\u001a\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020@0/*\u00020?¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lso0/v;", "Loo0/r;", "n", "(Lso0/v;)Loo0/r;", "Lso0/n;", "Loo0/i;", "f", "(Lso0/n;)Loo0/i;", "Lso0/m;", "Loo0/j;", "g", "(Lso0/m;)Loo0/j;", "Lso0/t;", "Loo0/t;", "p", "(Lso0/t;)Loo0/t;", "Lso0/w;", "Loo0/s;", "o", "(Lso0/w;)Loo0/s;", "Loo0/k;", "", "topic", "description", "Lso0/a;", "c", "(Loo0/k;Ljava/lang/String;Ljava/lang/String;)Lso0/a;", "Lso0/s;", "Loo0/q;", "m", "(Lso0/s;)Loo0/q;", "Lso0/u;", "Loo0/p;", "l", "(Lso0/u;)Loo0/p;", "Lso0/r;", "Loo0/n;", "j", "(Lso0/r;)Loo0/n;", "Lso0/q;", "Loo0/o;", "k", "(Lso0/q;)Loo0/o;", "Lso0/k;", "Loo0/f;", "e", "(Lso0/k;)Loo0/f;", "", "Lso0/j;", "Loo0/h;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lso0/p;", "Loo0/l;", "h", "(Lso0/p;)Loo0/l;", "Lso0/o;", "Loo0/m;", "i", "(Lso0/o;)Loo0/m;", "Lso0/i;", "Loo0/g;", "a", "Lso0/h;", "Loo0/e;", "d", "(Lso0/h;)Ljava/util/List;", "feedbackservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ro0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4470a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f175351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f175352c;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f175350a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[k.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[k.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f175351b = iArr2;
            int[] iArr3 = new int[o.values().length];
            try {
                iArr3[o.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[o.READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[o.READY_FOR_PUBLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[o.PUBLISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[o.IN_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[o.ACCEPTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[o.REJECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[o.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            f175352c = iArr3;
        }
    }

    public static final List<g> a(List<EndedIdeaVoteRoundVotingResultDtoDto> list) {
        List<EndedIdeaVoteRoundVotingResultDtoDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (EndedIdeaVoteRoundVotingResultDtoDto endedIdeaVoteRoundVotingResultDtoDto : list2) {
            arrayList.add(new g(g(endedIdeaVoteRoundVotingResultDtoDto.getCategory()), endedIdeaVoteRoundVotingResultDtoDto.getId(), endedIdeaVoteRoundVotingResultDtoDto.getTopic(), endedIdeaVoteRoundVotingResultDtoDto.getVotes()));
        }
        return arrayList;
    }

    public static final List<h> b(List<EndedIdeaVoteRoundVotingResultPromotedIdeaDtoDto> list) {
        List<EndedIdeaVoteRoundVotingResultPromotedIdeaDtoDto> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (EndedIdeaVoteRoundVotingResultPromotedIdeaDtoDto endedIdeaVoteRoundVotingResultPromotedIdeaDtoDto : list2) {
            arrayList.add(new h(g(endedIdeaVoteRoundVotingResultPromotedIdeaDtoDto.getCategory()), endedIdeaVoteRoundVotingResultPromotedIdeaDtoDto.getDescription(), endedIdeaVoteRoundVotingResultPromotedIdeaDtoDto.getId(), h(endedIdeaVoteRoundVotingResultPromotedIdeaDtoDto.getStatus()), endedIdeaVoteRoundVotingResultPromotedIdeaDtoDto.getTopic(), endedIdeaVoteRoundVotingResultPromotedIdeaDtoDto.getVotes()));
        }
        return arrayList;
    }

    public static final AddIdeaRequestDto c(k kVar, String str, String str2) {
        l lVar;
        int i15 = C4470a.f175351b[kVar.ordinal()];
        if (i15 == 1) {
            lVar = l.DOCUMENTS;
        } else if (i15 == 2) {
            lVar = l.SERVICES;
        } else if (i15 == 3) {
            lVar = l.OTHER;
        } else {
            if (i15 != 4) {
                throw new p();
            }
            lVar = l.UNKNOWN;
        }
        return new AddIdeaRequestDto(lVar, str2, str);
    }

    public static final List<EndedIdeaVoteRound> d(EndedIdeaVoteRoundResponseDto endedIdeaVoteRoundResponseDto) {
        List<EndedIdeaVoteRoundDtoDto> listA = endedIdeaVoteRoundResponseDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (EndedIdeaVoteRoundDtoDto endedIdeaVoteRoundDtoDto : listA) {
            String mobileName = endedIdeaVoteRoundDtoDto.getMobileName();
            OffsetDateTime endDate = endedIdeaVoteRoundDtoDto.getEndDate();
            arrayList.add(new EndedIdeaVoteRound(endedIdeaVoteRoundDtoDto.getId(), endedIdeaVoteRoundDtoDto.getStartDate(), endDate, mobileName));
        }
        return arrayList;
    }

    public static final EndedRoundVotingResult e(EndedIdeaVoteRoundVotingResultResponseDto endedIdeaVoteRoundVotingResultResponseDto) {
        return new EndedRoundVotingResult(b(endedIdeaVoteRoundVotingResultResponseDto.b()), a(endedIdeaVoteRoundVotingResultResponseDto.a()));
    }

    public static final Idea f(IdeaDtoDto ideaDtoDto) {
        return new Idea(ideaDtoDto.getId(), ideaDtoDto.getDescription(), g(ideaDtoDto.getCategory()), ideaDtoDto.getVotes(), ideaDtoDto.getTopic(), ideaDtoDto.getCreatedAt(), ideaDtoDto.getVotedByUser(), ideaDtoDto.getSentByUser());
    }

    public static final IdeaCategory g(IdeaCategoryDtoDto ideaCategoryDtoDto) {
        k kVar;
        int i15 = C4470a.f175350a[ideaCategoryDtoDto.getCode().ordinal()];
        if (i15 == 1) {
            kVar = k.DOCUMENTS;
        } else if (i15 == 2) {
            kVar = k.SERVICES;
        } else if (i15 == 3) {
            kVar = k.OTHER;
        } else {
            if (i15 != 4) {
                throw new p();
            }
            kVar = k.UNKNOWN;
        }
        return new IdeaCategory(kVar, ideaCategoryDtoDto.getDescription());
    }

    public static final IdeaStatus h(IdeaStatusDtoDto ideaStatusDtoDto) {
        return new IdeaStatus(ideaStatusDtoDto.getDescription(), i(ideaStatusDtoDto.getCode()));
    }

    public static final m i(o oVar) {
        switch (C4470a.f175352c[oVar.ordinal()]) {
            case 1:
                return m.NEW;
            case 2:
                return m.READY;
            case 3:
                return m.READY_FOR_PUBLICATION;
            case 4:
                return m.PUBLISHED;
            case 5:
                return m.IN_ANALYSIS;
            case 6:
                return m.ACCEPTED;
            case 7:
                return m.REJECTED;
            case 8:
                return m.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final IdeaVoteRound j(IdeaVoteRoundDtoDto ideaVoteRoundDtoDto) {
        long id5 = ideaVoteRoundDtoDto.getId();
        OffsetDateTime startDate = ideaVoteRoundDtoDto.getStartDate();
        OffsetDateTime endDate = ideaVoteRoundDtoDto.getEndDate();
        List<IdeaVoteRoundConfigurationDtoDto> listC = ideaVoteRoundDtoDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(k((IdeaVoteRoundConfigurationDtoDto) it.next()));
        }
        return new IdeaVoteRound(id5, startDate, endDate, arrayList);
    }

    public static final IdeaVoteRoundConfiguration k(IdeaVoteRoundConfigurationDtoDto ideaVoteRoundConfigurationDtoDto) {
        return new IdeaVoteRoundConfiguration(g(ideaVoteRoundConfigurationDtoDto.getCategory()), ideaVoteRoundConfigurationDtoDto.getPromotedIdeas());
    }

    public static final IdeaVoteRoundWithPromotedIdeas l(IdeaVoteRoundWithPromotedIdeasDtoDto ideaVoteRoundWithPromotedIdeasDtoDto) {
        long id5 = ideaVoteRoundWithPromotedIdeasDtoDto.getId();
        String mobileName = ideaVoteRoundWithPromotedIdeasDtoDto.getMobileName();
        OffsetDateTime startDate = ideaVoteRoundWithPromotedIdeasDtoDto.getStartDate();
        OffsetDateTime endDate = ideaVoteRoundWithPromotedIdeasDtoDto.getEndDate();
        List<PromotedIdeaDtoDto> listD = ideaVoteRoundWithPromotedIdeasDtoDto.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(o((PromotedIdeaDtoDto) it.next()));
        }
        return new IdeaVoteRoundWithPromotedIdeas(id5, mobileName, startDate, endDate, arrayList);
    }

    public static final IdeaVoteRounds m(IdeaVoteRoundResponseDto ideaVoteRoundResponseDto) {
        List<IdeaVoteRoundWithPromotedIdeasDtoDto> listB = ideaVoteRoundResponseDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(l((IdeaVoteRoundWithPromotedIdeasDtoDto) it.next()));
        }
        IdeaVoteRoundDtoDto activeIdeaVoteRounds = ideaVoteRoundResponseDto.getActiveIdeaVoteRounds();
        return new IdeaVoteRounds(arrayList, activeIdeaVoteRounds != null ? j(activeIdeaVoteRounds) : null);
    }

    public static final IdeasRoundDetails n(IdeasResponseDto ideasResponseDto) {
        List<IdeaDtoDto> listD = ideasResponseDto.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(f((IdeaDtoDto) it.next()));
        }
        return new IdeasRoundDetails(arrayList, ideasResponseDto.getActiveRoundEndDate(), ideasResponseDto.getActiveRoundMobileName(), ideasResponseDto.getActiveRoundEndDaysCounter());
    }

    public static final PromotedIdea o(PromotedIdeaDtoDto promotedIdeaDtoDto) {
        return new PromotedIdea(promotedIdeaDtoDto.getId(), promotedIdeaDtoDto.getTopic());
    }

    public static final RoundSummaryModel p(IdeaVoteRoundSummaryDtoDto ideaVoteRoundSummaryDtoDto) {
        long id5 = ideaVoteRoundSummaryDtoDto.getId();
        String mobileName = ideaVoteRoundSummaryDtoDto.getMobileName();
        List<PromotedIdeaDtoDto> listC = ideaVoteRoundSummaryDtoDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(o((PromotedIdeaDtoDto) it.next()));
        }
        return new RoundSummaryModel(id5, mobileName, arrayList);
    }
}
