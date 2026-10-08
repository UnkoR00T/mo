package rp3;

import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oo0.IdeaVoteRound;
import oo0.IdeaVoteRoundConfiguration;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import qp3.b;
import qp3.c;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002$\"B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&¨\u0006("}, d2 = {"Lrp3/a;", "Lxw/f;", "Lrp3/a$b;", "Lqp3/c$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lu04/a;Lez/e;)V", "", "", "c", "()Ljava/util/List;", "Loo0/n;", "ideaVoteRound", "Lmx/a;", "f", "(Loo0/n;)Lmx/a;", "Ljava/time/OffsetDateTime;", "startDate", "endDate", "", "h", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Ljava/lang/String;", "index", "lastIndex", "i", "(II)Ljava/lang/String;", "params", "e", "(Lrp3/a$b;)Lqp3/c$a;", "a", "Lmx/c;", "b", "Lu04/a;", "Lez/e;", "d", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f175401e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: rp3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lrp3/a$b;", "", "Lqp3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Lkotlin/Function1;", "", "openUrlIntent", "<init>", "(Lqp3/b;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqp3/b;", "c", "()Lqp3/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrlIntent;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(b bVar, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = bVar;
            this.closeAction = aVar;
            this.openUrlIntent = lVar;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final l<String, i0> b() {
            return this.openUrlIntent;
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
            return t.c(this.state, params.state) && t.c(this.closeAction, params.closeAction) && t.c(this.openUrlIntent, params.openUrlIntent);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.openUrlIntent.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeAction=" + this.closeAction + ", openUrlIntent=" + this.openUrlIntent + ')';
        }
    }

    public a(mx.c cVar, u04.a aVar, e eVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
        this.dateFormatter = eVar;
    }

    private final List<Integer> c() {
        return v.q(Integer.valueOf(gp3.a.J), Integer.valueOf(gp3.a.K), Integer.valueOf(gp3.a.L), Integer.valueOf(gp3.a.M), Integer.valueOf(gp3.a.N), Integer.valueOf(gp3.a.O));
    }

    private final Label f(IdeaVoteRound ideaVoteRound) {
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

    private final String h(OffsetDateTime startDate, OffsetDateTime endDate) {
        return this.dateFormatter.d(new fz.b.OffsetDateTime(startDate), fz.c.MONTH_DATE_DOT) + "–" + this.dateFormatter.d(new fz.b.OffsetDateTime(endDate), fz.c.DOTTED);
    }

    private final String i(int index, int lastIndex) {
        return index == lastIndex ? "" : ", ";
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        b state = params.getState();
        if (t.c(state, b.a.f167940a)) {
            return c.a.C4240a.f167942a;
        }
        if (!(state instanceof b.Initialized)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(gp3.a.f76147q0);
        Label labelC2 = this.labelProvider.c(gp3.a.f76145p0);
        Label labelF = ((b.Initialized) params.getState()).getActiveRound() != null ? f(((b.Initialized) params.getState()).getActiveRound()) : null;
        LinkData linkData = new LinkData(null, this.labelProvider.c(gp3.a.f76151s0), this.commonEndpoints.Q(), LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null);
        Label labelC3 = this.labelProvider.c(gp3.a.f76149r0);
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(gp3.a.f76118c), null, null, false, null, 60, null), null, null, null, null, 61, null);
        Label labelC4 = this.labelProvider.c(gp3.a.P);
        List<Integer> listC = c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(this.labelProvider.c(((Number) it.next()).intValue()));
        }
        return new c.a.Initialized(baseScaffoldData, labelC4, arrayList, labelC, labelC2, labelF, labelC3, linkData);
    }
}
