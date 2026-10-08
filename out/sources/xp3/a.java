package xp3;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import k30.b;
import k30.d;
import mx.Label;
import oo0.PromotedIdea;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import t40.InfoRowListData;
import wp3.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lxp3/a;", "Lxw/f;", "Lxp3/a$b;", "Lwp3/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "isVoteIdeaDevFFEnabled", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onHelpClick", "Li50/a;", "e", "(ZLer/a;Ler/a;)Li50/a;", "goToAdditionalInfo", "goToVoteIdeaList", "showResults", "Lq40/f;", "c", "(Ler/a;Ler/a;Ler/a;Z)Lq40/f;", "params", "f", "(Lxp3/a$b;)Lwp3/g$a;", "a", "Lmx/c;", "b", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f220489c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xp3.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxp3/a$b;", "", "Lwp3/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "goToVoteIdeaList", "goToAdditionalInfo", "closeAction", "showResults", "<init>", "(Lwp3/f;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwp3/f;", "e", "()Lwp3/f;", "b", "Ler/a;", "c", "()Ler/a;", "d", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wp3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToVoteIdeaList;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToAdditionalInfo;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showResults;

        public Params(wp3.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = fVar;
            this.goToVoteIdeaList = aVar;
            this.goToAdditionalInfo = aVar2;
            this.closeAction = aVar3;
            this.showResults = aVar4;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        public final er.a<i0> b() {
            return this.goToAdditionalInfo;
        }

        public final er.a<i0> c() {
            return this.goToVoteIdeaList;
        }

        public final er.a<i0> d() {
            return this.showResults;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final wp3.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.goToVoteIdeaList, params.goToVoteIdeaList) && t.c(this.goToAdditionalInfo, params.goToAdditionalInfo) && t.c(this.closeAction, params.closeAction) && t.c(this.showResults, params.showResults);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.goToVoteIdeaList.hashCode()) * 31) + this.goToAdditionalInfo.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.showResults.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", goToVoteIdeaList=" + this.goToVoteIdeaList + ", goToAdditionalInfo=" + this.goToAdditionalInfo + ", closeAction=" + this.closeAction + ", showResults=" + this.showResults + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f220496a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-360928759);
            if (p076m2.t.k()) {
                p076m2.t.o(-360928759, i15, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.roundsummary.mapper.RoundSummaryMapper.getScaffoldData.<anonymous> (RoundSummaryMapper.kt:85)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final IconPageBottomContentData c(er.a<i0> goToAdditionalInfo, er.a<i0> goToVoteIdeaList, er.a<i0> showResults, boolean isVoteIdeaDevFFEnabled) {
        if (isVoteIdeaDevFFEnabled) {
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(gp3.a.f76123e0), null, 2, null);
            d.a aVar = d.a.f107773a;
            b.c cVar = b.c.f107768a;
            return new IconPageBottomContentData(new ButtonData(null, null, large, withText, aVar, cVar, showResults, 3, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.H), null, 2, null), new d.Secondary(null, 1, null), cVar, goToVoteIdeaList, 3, null), null, 4, null);
        }
        k30.a.Large large2 = new k30.a.Large(false, 1, null);
        k30.c.WithText withText2 = new k30.c.WithText(this.labelProvider.c(gp3.a.f76114a), null, 2, null);
        d.a aVar2 = d.a.f107773a;
        b.c cVar2 = b.c.f107768a;
        return new IconPageBottomContentData(new ButtonData(null, null, large2, withText2, aVar2, cVar2, goToVoteIdeaList, 3, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gp3.a.f76127g0), null, 2, null), new d.Secondary(null, 1, null), cVar2, goToAdditionalInfo, 3, null), null, 4, null);
    }

    private final BaseScaffoldData e(boolean isVoteIdeaDevFFEnabled, er.a<i0> onClose, er.a<i0> onHelpClick) {
        if (!isVoteIdeaDevFFEnabled) {
            return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onClose), null, null, null, null, 30, null), null, null, null, null, 61, null);
        }
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onClose), this.labelProvider.c(gp3.a.Q0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, c.f220496a, null, onHelpClick, 4, null)), null, 20, null), null, null, null, null, 61, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        wp3.f state = params.getState();
        if (t.c(state, wp3.f.a.f214329a)) {
            return g.a.C5682a.f214332a;
        }
        if (!(state instanceof wp3.f.Initialized)) {
            throw new oq.p();
        }
        j.b.C4090b c4090b = j.b.C4090b.f164686d;
        Label labelE = this.labelProvider.e(gp3.a.f76133j0, ((wp3.f.Initialized) params.getState()).getRoundSummary().getMobileName());
        Label labelC = this.labelProvider.c(gp3.a.f76129h0);
        Label labelC2 = this.labelProvider.c(gp3.a.f76131i0);
        List<PromotedIdea> listB = ((wp3.f.Initialized) params.getState()).getRoundSummary().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList.add(new t40.a.C4874a(mx.b.b(((PromotedIdea) obj).getTopic(), i15 + ": topic")));
            i15 = i16;
        }
        return new g.a.Initialized(new IconPageData(c4090b, labelE, labelC, labelC2, new InfoRowListData(arrayList), c(params.b(), params.c(), params.d(), ((wp3.f.Initialized) params.getState()).getIsVoteIdeaDevFFEnabled()), false, 64, null), e(((wp3.f.Initialized) params.getState()).getIsVoteIdeaDevFFEnabled(), params.a(), params.b()), params.a());
    }
}
