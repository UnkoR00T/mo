package pp3;

import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oo0.m;
import op3.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u00182\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lpp3/a;", "Lxw/f;", "Lpp3/a$a;", "Lop3/g$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lop3/f;", "Lkotlin/Function0;", "Loq/i0;", "onVoteClick", "Lh30/a;", "h", "(Lop3/f;Ler/a;)Lh30/a;", "onSeeMore", "Lc30/b;", "c", "(Lop3/f;Ler/a;)Lc30/b;", "Lop3/f$b;", "f", "(Lop3/f$b;)Lc30/b;", "Lop3/f$a;", "Lc30/b$d;", "i", "(Lop3/f$a;Ler/a;)Lc30/b$d;", "", "Ln50/g;", "e", "(Lop3/f;)Ljava/util/List;", "params", "l", "(Lpp3/a$a;)Lop3/g$a;", "a", "Lmx/c;", "b", "Lez/e;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: pp3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lpp3/a$a;", "", "Lop3/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onVoteClick", "onSeeMore", "<init>", "(Lop3/f;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lop3/f;", "d", "()Lop3/f;", "b", "Ler/a;", "()Ler/a;", "c", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final op3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onVoteClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSeeMore;

        public Params(op3.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = fVar;
            this.onBackClick = aVar;
            this.onVoteClick = aVar2;
            this.onSeeMore = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onSeeMore;
        }

        public final er.a<i0> c() {
            return this.onVoteClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final op3.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onVoteClick, params.onVoteClick) && t.c(this.onSeeMore, params.onSeeMore);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onVoteClick.hashCode()) * 31) + this.onSeeMore.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onVoteClick=" + this.onVoteClick + ", onSeeMore=" + this.onSeeMore + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161675a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.IN_ANALYSIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f161675a = iArr;
        }
    }

    public a(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final c30.b c(op3.f fVar, er.a<i0> aVar) {
        if (fVar instanceof op3.f.ActiveRoundIdeaDetails) {
            return i((op3.f.ActiveRoundIdeaDetails) fVar, aVar);
        }
        if (fVar instanceof op3.f.EndedRoundIdeaDetails) {
            return f((op3.f.EndedRoundIdeaDetails) fVar);
        }
        throw new p();
    }

    private final List<DefaultSingleCardData> e(op3.f fVar) {
        return v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gp3.a.f76136l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(new Label(fVar.getIdea().getCategory().getDescription(), "ideaCategory"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(gp3.a.f76152t), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(new Label(String.valueOf(fVar.getIdea().getVotes()), "ideaVotesNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
    }

    private final c30.b f(op3.f.EndedRoundIdeaDetails endedRoundIdeaDetails) {
        int i15 = b.f161675a[endedRoundIdeaDetails.getIdeaDetailsData().getStatus().getIdeaStatusCode().ordinal()];
        if (i15 == 1) {
            return new c30.b.c(null, null, mx.b.b(endedRoundIdeaDetails.getIdeaDetailsData().getStatus().getDescription(), "ideaStatus"), this.labelProvider.c(gp3.a.f76160x), null, null, null, 115, null);
        }
        if (i15 == 2) {
            return new c30.b.d(null, null, mx.b.b(endedRoundIdeaDetails.getIdeaDetailsData().getStatus().getDescription(), "ideaStatus"), this.labelProvider.c(gp3.a.f76158w), null, null, null, 115, null);
        }
        if (i15 != 3) {
            return null;
        }
        return new c30.b.C0606b(null, null, mx.b.b(endedRoundIdeaDetails.getIdeaDetailsData().getStatus().getDescription(), "ideaStatus"), this.labelProvider.c(gp3.a.f76162y), null, null, null, 115, null);
    }

    private final ButtonData h(op3.f fVar, er.a<i0> aVar) {
        if (!(fVar instanceof op3.f.ActiveRoundIdeaDetails)) {
            if (fVar instanceof op3.f.EndedRoundIdeaDetails) {
                return null;
            }
            throw new p();
        }
        if (((op3.f.ActiveRoundIdeaDetails) fVar).getIdeaDetailsData().getIdea().getVotedByUser()) {
            return null;
        }
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.f76134k), null, 2, null), d.a.f107773a, null, aVar, 35, null);
    }

    private final c30.b.d i(op3.f.ActiveRoundIdeaDetails activeRoundIdeaDetails, er.a<i0> aVar) {
        if (!activeRoundIdeaDetails.getIdeaDetailsData().getIdea().getVotedByUser()) {
            return null;
        }
        String strD = this.dateFormatter.d(new fz.b.OffsetDateTime(activeRoundIdeaDetails.getIdeaDetailsData().getActiveRoundEndDate()), fz.c.DOTTED);
        return new c30.b.d(null, null, this.labelProvider.c(gp3.a.f76150s), this.labelProvider.e(gp3.a.f76148r, strD), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(gp3.a.f76144p), k30.b.c.f107768a, null, aVar, 9, null)), 51, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gp3.a.f76146q), null, null, null, 28, null), null, null, null, null, 61, null);
        Label label = new Label(params.getState().getIdea().getTopic(), "ideaTopic");
        Label labelC = this.labelProvider.c(gp3.a.f76142o);
        ButtonData buttonDataH = h(params.getState(), params.c());
        return new g.Data(baseScaffoldData, label, labelC, mx.b.b(params.getState().getIdea().getDescription(), "ideaDescription"), c(params.getState(), params.b()), new CardListData(e(params.getState()), null, false, null, null, 30, null), buttonDataH);
    }
}
