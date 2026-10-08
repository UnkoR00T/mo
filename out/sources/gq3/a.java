package gq3;

import b30.AccordionData;
import b30.AccordionElement;
import eq3.b;
import eq3.c;
import er.l;
import ez.e;
import fr.t;
import fu.r;
import hq3.VoteIdeaRoundsAccordionElement;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import oo0.IdeaVoteRound;
import oo0.IdeaVoteRoundConfiguration;
import oo0.IdeaVoteRoundWithPromotedIdeas;
import oo0.PromotedIdea;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002(&B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010!J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*¨\u0006,"}, d2 = {"Lgq3/a;", "Lxw/f;", "Lgq3/a$b;", "Leq3/c$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lu04/a;Lez/e;)V", "Loo0/n;", "ideaVoteRound", "Lmx/a;", "e", "(Loo0/n;)Lmx/a;", "Ljava/time/OffsetDateTime;", "startDate", "endDate", "", "h", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Ljava/lang/String;", "", "Loo0/p;", "endedIdeaVoteRounds", "Lhq3/a;", "f", "(Ljava/util/List;)Ljava/util/List;", "", "index", "lastIndex", "l", "(II)Ljava/lang/String;", "i", "params", "c", "(Lgq3/a$b;)Leq3/c$a;", "a", "Lmx/c;", "b", "Lu04/a;", "Lez/e;", "d", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76245e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: gq3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgq3/a$b;", "", "Leq3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function1;", "", "openUrl", "<init>", "(Leq3/b;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leq3/b;", "c", "()Leq3/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(b bVar, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = bVar;
            this.closeAction = aVar;
            this.openUrl = lVar;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final l<String, i0> b() {
            return this.openUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.closeAction, params.closeAction) && t.c(this.openUrl, params.openUrl);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", openUrl=" + this.openUrl + ')';
        }
    }

    public a(mx.c cVar, u04.a aVar, e eVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
        this.dateFormatter = eVar;
    }

    private final Label e(IdeaVoteRound ideaVoteRound) {
        String strH = h(ideaVoteRound.getStartDate(), ideaVoteRound.getEndDate());
        StringBuilder sb5 = new StringBuilder();
        List<IdeaVoteRoundConfiguration> listB = ideaVoteRound.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            IdeaVoteRoundConfiguration ideaVoteRoundConfiguration = (IdeaVoteRoundConfiguration) obj;
            sb5.append(this.labelProvider.e(gp3.a.f76143o0, String.valueOf(ideaVoteRoundConfiguration.getPromotedIdeas()), ideaVoteRoundConfiguration.getCategory().getDescription() + i(i15, v.p(ideaVoteRound.b()))).getText());
            arrayList.add(sb5);
            i15 = i16;
        }
        return this.labelProvider.e(gp3.a.f76141n0, strH, sb5.toString());
    }

    private final List<VoteIdeaRoundsAccordionElement> f(List<IdeaVoteRoundWithPromotedIdeas> endedIdeaVoteRounds) {
        List<IdeaVoteRoundWithPromotedIdeas> list = endedIdeaVoteRounds;
        int i15 = 10;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            IdeaVoteRoundWithPromotedIdeas ideaVoteRoundWithPromotedIdeas = (IdeaVoteRoundWithPromotedIdeas) obj;
            Label labelE = this.labelProvider.e(gp3.a.f76137l0, h(ideaVoteRoundWithPromotedIdeas.getStartDate(), ideaVoteRoundWithPromotedIdeas.getEndDate()));
            Label labelC = this.labelProvider.c(gp3.a.f76135k0);
            Label labelB = mx.b.b(ideaVoteRoundWithPromotedIdeas.getMobileName(), "Name_" + i16);
            List<PromotedIdea> listC = ideaVoteRoundWithPromotedIdeas.c();
            ArrayList arrayList2 = new ArrayList(v.y(listC, i15));
            int i18 = 0;
            for (Object obj2 : listC) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                arrayList2.add(new t40.a.C4874a(mx.b.b(((PromotedIdea) obj2).getTopic() + l(i18, v.p(ideaVoteRoundWithPromotedIdeas.c())), "Topic_" + i18)));
                i18 = i19;
            }
            arrayList.add(new VoteIdeaRoundsAccordionElement(labelB, labelE, labelC, new InfoRowListData(arrayList2)));
            i16 = i17;
            i15 = 10;
        }
        return arrayList;
    }

    private final String h(OffsetDateTime startDate, OffsetDateTime endDate) {
        e eVar = this.dateFormatter;
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(startDate);
        fz.c cVar = fz.c.DOTTED;
        return r.B1(eVar.d(offsetDateTime, cVar), 5) + "-" + this.dateFormatter.d(new fz.b.OffsetDateTime(endDate), cVar);
    }

    private final String i(int index, int lastIndex) {
        return index == lastIndex ? "" : ", ";
    }

    private final String l(int index, int lastIndex) {
        return index == lastIndex ? "." : ",";
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        Label label;
        BaseScaffoldData baseScaffoldData;
        AccordionData accordionData;
        b state = params.getState();
        if (t.c(state, b.a.f52820a)) {
            return c.a.C1246a.f52822a;
        }
        if (!(state instanceof b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(gp3.a.f76118c), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(gp3.a.Q0);
        Label labelC2 = this.labelProvider.c(gp3.a.f76147q0);
        Label labelC3 = this.labelProvider.c(gp3.a.f76145p0);
        IdeaVoteRound activeIdeaVoteRounds = ((b.Initialized) params.getState()).getIdeaVoteRounds().getActiveIdeaVoteRounds();
        Label labelE = activeIdeaVoteRounds != null ? e(activeIdeaVoteRounds) : null;
        Label labelC4 = this.labelProvider.c(gp3.a.f76139m0);
        Label labelC5 = this.labelProvider.c(gp3.a.f76155u0);
        Label labelC6 = this.labelProvider.c(gp3.a.f76153t0);
        LinkData linkData = new LinkData(null, this.labelProvider.c(gp3.a.f76151s0), this.commonEndpoints.Q(), LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null);
        Label labelC7 = this.labelProvider.c(gp3.a.f76149r0);
        List<VoteIdeaRoundsAccordionElement> listF = f(((b.Initialized) params.getState()).getIdeaVoteRounds().b());
        if (listF.isEmpty()) {
            listF = null;
        }
        if (listF != null) {
            List<VoteIdeaRoundsAccordionElement> list = listF;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (VoteIdeaRoundsAccordionElement voteIdeaRoundsAccordionElement : list) {
                arrayList.add(new AccordionElement(null, voteIdeaRoundsAccordionElement.getHeader(), null, false, null, false, new fq3.b(voteIdeaRoundsAccordionElement.getContentTitle(), voteIdeaRoundsAccordionElement.getContentDescription(), voteIdeaRoundsAccordionElement.getInfoRowListData()), 61, null));
                labelC7 = labelC7;
                baseScaffoldData2 = baseScaffoldData2;
            }
            label = labelC7;
            baseScaffoldData = baseScaffoldData2;
            accordionData = new AccordionData(arrayList);
        } else {
            label = labelC7;
            baseScaffoldData = baseScaffoldData2;
            accordionData = null;
        }
        return new c.a.Initialized(baseScaffoldData, aVarA, labelC, labelC2, labelC3, labelE, labelC4, accordionData, labelC5, labelC6, label, linkData);
    }
}
