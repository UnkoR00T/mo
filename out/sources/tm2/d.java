package tm2;

import androidx.compose.ui.graphics.Color;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltm2/d;", "Lxw/f;", "Ltm2/d$a;", "Ltm2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Ltm2/d$a;)Ltm2/c$a;", "a", "Lmx/c;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: tm2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltm2/d$a;", "", "Ltm2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextAction", "onBackAction", "onCloseAction", "<init>", "(Ltm2/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltm2/b;", "d", "()Ltm2/b;", "b", "Ler/a;", "c", "()Ler/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onNextAction = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onNextAction, params.onNextAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onNextAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextAction=" + this.onNextAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f190712a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1615807332);
            if (p076m2.t.k()) {
                p076m2.t.o(1615807332, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.fraud.summary.NetworkSecurityIssuesFraudSummaryMapper.invoke.<anonymous> (NetworkSecurityIssuesFraudSummaryMapper.kt:47)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q5.T), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f190712a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(q5.f219568r);
        Label labelC2 = this.labelProvider.c(q5.f219573t0);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(params.getState().getDescription(), "descriptionCard"), null, null, 0, 0, null, 62, null)), null, 5, null), null, null, null, 3839, null);
        Label labelC3 = this.labelProvider.c(q5.f219535c);
        List<lm2.b> listC = params.getState().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((lm2.b) it.next()).getCardData());
        }
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        Label labelC4 = this.labelProvider.c(q5.F);
        String emailAddress = params.getState().getEmailAddress();
        return new c.Data(baseScaffoldData, labelC, labelC2, defaultSingleCardData, labelC3, cardListData, labelC4, emailAddress != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(q5.f219546g), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(emailAddress, "emailAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(q5.f219562o), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
