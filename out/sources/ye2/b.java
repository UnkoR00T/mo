package ye2;

import cb4.i;
import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;
import x50.NavigationButtonData;
import xe2.d;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lye2/b;", "Lxw/f;", "Lye2/b$a;", "Lxe2/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "Lxe2/c$b;", "state", "Lxe2/d$a$b;", "f", "(Lye2/b$a;Lxe2/c$b;)Lxe2/d$a$b;", "Lvy/c;", "Lmx/a;", "e", "(Lvy/c;)Lmx/a;", "", "stringId", "l", "(I)Lmx/a;", "i", "(Lye2/b$a;)Lxe2/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: ye2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\"\u0010\u001f¨\u0006%"}, d2 = {"Lye2/b$a;", "", "Lxe2/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onCloseClick", "onNextClick", "Lkotlin/Function1;", "Lvy/c;", "onMapDetailsClick", "onPhotosDetailsClick", "<init>", "(Lxe2/c;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/c;", "f", "()Lxe2/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final xe2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Coordinates, i0> onMapDetailsClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPhotosDetailsClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(xe2.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Coordinates, i0> lVar, er.a<i0> aVar4) {
            this.state = cVar;
            this.onBackClick = aVar;
            this.onCloseClick = aVar2;
            this.onNextClick = aVar3;
            this.onMapDetailsClick = lVar;
            this.onPhotosDetailsClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final l<Coordinates, i0> c() {
            return this.onMapDetailsClick;
        }

        public final er.a<i0> d() {
            return this.onNextClick;
        }

        public final er.a<i0> e() {
            return this.onPhotosDetailsClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onMapDetailsClick, params.onMapDetailsClick) && t.c(this.onPhotosDetailsClick, params.onPhotosDetailsClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final xe2.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onMapDetailsClick.hashCode()) * 31) + this.onPhotosDetailsClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ", onNextClick=" + this.onNextClick + ", onMapDetailsClick=" + this.onMapDetailsClick + ", onPhotosDetailsClick=" + this.onPhotosDetailsClick + ')';
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label e(Coordinates coordinates) {
        return mx.b.b(coordinates.getLatitude() + ", " + coordinates.getLongitude(), "coordinatesValue");
    }

    private final d.a.Initialized f(final Params params, final xe2.c.b state) {
        i dialogVMSAdapter;
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), l(ud2.a.J), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarD = params.d();
        k30.c.WithText withText = new k30.c.WithText(l(ud2.a.H), null, 2, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        ButtonData buttonData = new ButtonData("SendButton", null, large, withText, aVar, null, aVarD, 34, null);
        if ((state instanceof xe2.c.b.Summary) || (state instanceof xe2.c.b.SendIncidentReport) || (state instanceof xe2.c.b.Error)) {
            dialogVMSAdapter = null;
        } else {
            if (!(state instanceof xe2.c.b.Dialog)) {
                throw new p();
            }
            dialogVMSAdapter = ((xe2.c.b.Dialog) state).getDialogVMSAdapter();
        }
        Label labelL = l(ud2.a.f197731e);
        Label labelL2 = l(ud2.a.f197760s0);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("categoryCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(ud2.a.f197750n0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getInitializedStateData().getIncidentData().getReportName(), "categoryValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(l(ud2.a.f197747m), null, null, 0, 0, null, 62, null);
        b0 description = state.getInitializedStateData().getIncidentData().getDescription();
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("descriptionCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(description != null ? c0.e(description) : null, "descriptionValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData("incidentDateTimeCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(ud2.a.f197745l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.dateFormatter.d(state.getInitializedStateData().getIncidentData().getIncidentDate(), fz.c.FULL_MONTH_DATE_TIME_COMMA), "incidentDateTimeValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        BodySection bodySection = new BodySection(new SingleCardLabel(l(ud2.a.C), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(e(state.getInitializedStateData().getIncidentData().getSelectedIncidentLocalization()), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        CardListData cardListData = new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, new DefaultSingleCardData("coordinatesCard", null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(l(ud2.a.f197767w), null, 2, null), aVar, null, new er.a() { // from class: ye2.a
            @Override // er.a
            public final Object a() {
                return b.h(params, state);
            }
        }, 35, null)), null, 2814, null), new DefaultSingleCardData("attachedPhotosNumberCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(l(ud2.a.B), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(String.valueOf(state.getInitializedStateData().getIncidentData().a().size()), "attachedPhotosNumberValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, !state.getInitializedStateData().getIncidentData().a().isEmpty() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(l(ud2.a.f197769x), null, 2, null), aVar, null, params.e(), 35, null)) : null, null, 2814, null)), null, false, null, null, 30, null);
        Label labelL3 = l(ud2.a.f197758r0);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(l(ud2.a.f197773z), null, null, 0, 0, null, 62, null);
        PhoneNumber phoneNumber = state.getInitializedStateData().getIncidentData().getPhoneNumber();
        return new d.a.Initialized(baseScaffoldData, labelL, labelL2, cardListData, labelL3, new DefaultSingleCardData("phoneNumberCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(phoneNumber != null ? phoneNumber.f() : null, "phoneNumberValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), buttonData, dialogVMSAdapter, aVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, xe2.c.b bVar) {
        params.c().b(bVar.getInitializedStateData().getIncidentData().getSelectedIncidentLocalization());
        return i0.f148189a;
    }

    private final Label l(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        xe2.c state = params.getState();
        if (!(state instanceof xe2.c.b.Summary) && !(state instanceof xe2.c.b.SendIncidentReport) && !(state instanceof xe2.c.b.Dialog)) {
            if (state instanceof xe2.c.ErrorInit) {
                return new d.a.Error(params.a(), ((xe2.c.ErrorInit) state).getError());
            }
            if (!(state instanceof xe2.c.b.Error)) {
                throw new p();
            }
            return new d.a.Error(params.a(), ((xe2.c.b.Error) state).getError());
        }
        return f(params, (xe2.c.b) state);
    }
}
