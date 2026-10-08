package af2;

import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import ze2.State;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Laf2/b;", "Lxw/f;", "Laf2/b$a;", "Lze2/f$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lvy/c;", "Lmx/a;", "e", "(Lvy/c;)Lmx/a;", "", "stringId", "i", "(I)Lmx/a;", "params", "f", "(Laf2/b$a;)Lze2/f$a;", "a", "Lmx/c;", "b", "Lez/e;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, ze2.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: af2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Laf2/b$a;", "", "Lze2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "Lvy/c;", "onMapDetailsClick", "<init>", "(Lze2/e;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lze2/e;", "c", "()Lze2/e;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Coordinates, i0> onMapDetailsClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super Coordinates, i0> lVar) {
            this.state = state;
            this.onBackClick = aVar;
            this.onMapDetailsClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<Coordinates, i0> b() {
            return this.onMapDetailsClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onMapDetailsClick, params.onMapDetailsClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onMapDetailsClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onMapDetailsClick=" + this.onMapDetailsClick + ')';
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label e(Coordinates coordinates) {
        return mx.b.b(coordinates.getLatitude() + ", " + coordinates.getLongitude(), "coordinatesValue");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.b().b(params.getState().getIncident().getLocation());
        return i0.f148189a;
    }

    private final Label i(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ze2.f.Data b(final Params params) {
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), i(ud2.a.f197754p0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelN = i(ud2.a.D).n("IncidentReportReportedDetailsScreenTitle");
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("statusCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ud2.a.I), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(fe2.a.a(params.getState().getIncident().getState(), this.labelProvider, false)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("numberCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ud2.a.f197752o0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(params.getState().getIncident().getId(), "numberValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData("categoryCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ud2.a.f197750n0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(params.getState().getIncident().getType().getName(), "categoryValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData("descriptionCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ud2.a.f197747m), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(params.getState().getIncident().getDescription(), "descriptionValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData("incidentDateTimeCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ud2.a.f197748m0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.dateFormatter.d(params.getState().getIncident().getIncidentDate(), fz.c.FULL_MONTH_DATE_TIME_COMMA), "incidentDateTimeValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData("coordinatesCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(i(ud2.a.C), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(e(params.getState().getIncident().getLocation()), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(i(ud2.a.f197767w), null, 2, null), d.a.f107773a, null, new er.a() { // from class: af2.a
            @Override // er.a
            public final Object a() {
                return b.h(params);
            }
        }, 35, null)), null, 2814, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(i(ud2.a.B), null, null, 0, 0, null, 62, null);
        Integer attachmentsNumber = params.getState().getIncident().getAttachmentsNumber();
        return new ze2.f.Data(baseScaffoldData, labelN, new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, new DefaultSingleCardData("attachedPhotosNumberCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(String.valueOf(attachmentsNumber != null ? attachmentsNumber.intValue() : 0), "attachedPhotosNumberValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null), aVarA);
    }
}
