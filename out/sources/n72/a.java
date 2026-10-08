package n72;

import d72.HydroWarning;
import ez.e;
import fr.t;
import fz.b;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.l;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln72/a;", "Lxw/f;", "Ln72/a$a;", "Lm72/f$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "level", "Lr50/a$a;", "f", "(Ljava/lang/Integer;)Lr50/a$a;", "Ljava/time/OffsetDateTime;", "alertDate", "", "c", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "params", "e", "(Ln72/a$a;)Lm72/f$a;", "a", "Lmx/c;", "b", "Lez/e;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, m72.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: n72.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln72/a$a;", "", "Lm72/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackButtonAction", "onMoreButtonClickAction", "<init>", "(Lm72/e;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm72/e;", "c", "()Lm72/e;", "b", "Ler/a;", "()Ler/a;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m72.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackButtonAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMoreButtonClickAction;

        public Params(m72.e eVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = eVar;
            this.onBackButtonAction = aVar;
            this.onMoreButtonClickAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackButtonAction;
        }

        public final er.a<i0> b() {
            return this.onMoreButtonClickAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final m72.e getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackButtonAction, params.onBackButtonAction) && t.c(this.onMoreButtonClickAction, params.onMoreButtonClickAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackButtonAction.hashCode()) * 31) + this.onMoreButtonClickAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackButtonAction=" + this.onBackButtonAction + ", onMoreButtonClickAction=" + this.onMoreButtonClickAction + ')';
        }
    }

    public a(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final String c(OffsetDateTime alertDate) {
        if (alertDate != null) {
            return this.dateFormatter.d(new b.OffsetDateTime(alertDate), fz.c.FULL_MONTH_DATE_TIME_SEC_DOT);
        }
        return null;
    }

    private final r50.a.WithDot f(Integer level) {
        if (level != null && level.intValue() == 1) {
            return new r50.a.WithDot(null, this.labelProvider.c(a72.c.P), null, 0, r50.f.INFORMATIVE, 13, null);
        }
        if (level != null && level.intValue() == 2) {
            return new r50.a.WithDot(null, this.labelProvider.c(a72.c.Q), null, 0, r50.f.WARNING, 13, null);
        }
        return (level != null && level.intValue() == 3) ? new r50.a.WithDot(null, this.labelProvider.c(a72.c.O), null, 0, r50.f.NEGATIVE, 13, null) : new r50.a.WithDot(null, Label.INSTANCE.b(), null, 0, r50.f.POSITIVE, 13, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public m72.f.a b(Params params) {
        String string;
        Integer probability;
        List<String> listI;
        m72.e state = params.getState();
        if (t.c(state, m72.e.a.f124065a)) {
            return m72.f.a.C3041a.f124067a;
        }
        if (!(state instanceof m72.e.Initialized)) {
            throw new p();
        }
        m72.e.Initialized initialized = (m72.e.Initialized) state;
        HydroWarning alertData = initialized.getAlertData();
        Label labelD = mx.b.d(alertData != null ? alertData.getArea() : null, "description");
        Label labelC = this.labelProvider.c(a72.c.f4044l0);
        SingleCardLabel singleCardLabelB = l.b(this.labelProvider.c(a72.c.f4053q), null, null, 3, null);
        HydroWarning alertData2 = initialized.getAlertData();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB, new n50.b.Title(l.b(mx.b.d(c(alertData2 != null ? alertData2.getDateFrom() : null), "dateFrom"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabelB2 = l.b(this.labelProvider.c(a72.c.f4055r), null, null, 3, null);
        HydroWarning alertData3 = initialized.getAlertData();
        CardListData cardListData = new CardListData(v.q(defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(l.b(mx.b.d(c(alertData3 != null ? alertData3.getDateTo() : null), "dateTo"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        Label labelC2 = this.labelProvider.c(a72.c.f4021a);
        HydroWarning alertData4 = initialized.getAlertData();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(a72.c.N), null, null, 3, null), new n50.b.StatusBadge(f(alertData4 != null ? alertData4.getLevel() : null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(a72.c.f4025c), null, 2, null), d.a.f107773a, null, params.b(), 35, null)), null, 2815, null);
        HydroWarning alertData5 = initialized.getAlertData();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(a72.c.f4046m0), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.d((alertData5 == null || (listI = alertData5.i()) == null) ? null : v.v0(listI, null, null, null, 0, null, null, 63, null), "voivodeship"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        HydroWarning alertData6 = initialized.getAlertData();
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(a72.c.f4064x), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.d(alertData6 != null ? alertData6.getEventType() : null, "eventType"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        HydroWarning alertData7 = initialized.getAlertData();
        if (alertData7 == null || (probability = alertData7.getProbability()) == null) {
            string = null;
        } else {
            int iIntValue = probability.intValue();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(iIntValue);
            sb5.append('%');
            string = sb5.toString();
        }
        CardListData cardListData2 = new CardListData(v.q(defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(l.b(this.labelProvider.c(a72.c.f4038i0), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.d(string, "probability"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        Label labelC3 = this.labelProvider.c(a72.c.f4045m);
        HydroWarning alertData8 = initialized.getAlertData();
        return new m72.f.a.Initialized(labelD, labelC, cardListData, labelC2, cardListData2, labelC3, mx.b.d(alertData8 != null ? alertData8.getDescription() : null, "comment"), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(a72.c.f4057s), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
