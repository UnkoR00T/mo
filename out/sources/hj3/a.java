package hj3;

import b30.AccordionData;
import b30.AccordionElement;
import er.l;
import fj3.State;
import fr.t;
import gj3.d;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import m70.TimelineData;
import m70.TimelineItemData;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import uv0.AbroadBasicData;
import uv0.Risk;
import uv0.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lhj3/a;", "Lxw/f;", "Lhj3/a$a;", "Lfj3/f$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "params", "c", "(Lhj3/a$a;)Lfj3/f$a;", "a", "Lmx/c;", "b", "Lez/c;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, fj3.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: hj3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lhj3/a$a;", "", "Lfj3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "", "technicalDataExpandedChangeAction", "odometersExpandedChangeAction", "<init>", "(Lfj3/e;Ler/a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfj3/e;", "c", "()Lfj3/e;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "d", "()Ler/l;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> technicalDataExpandedChangeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> odometersExpandedChangeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super Boolean, i0> lVar, l<? super Boolean, i0> lVar2) {
            this.state = state;
            this.backAction = aVar;
            this.technicalDataExpandedChangeAction = lVar;
            this.odometersExpandedChangeAction = lVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<Boolean, i0> b() {
            return this.odometersExpandedChangeAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final l<Boolean, i0> d() {
            return this.technicalDataExpandedChangeAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.technicalDataExpandedChangeAction, params.technicalDataExpandedChangeAction) && t.c(this.odometersExpandedChangeAction, params.odometersExpandedChangeAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.technicalDataExpandedChangeAction.hashCode()) * 31) + this.odometersExpandedChangeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", technicalDataExpandedChangeAction=" + this.technicalDataExpandedChangeAction + ", odometersExpandedChangeAction=" + this.odometersExpandedChangeAction + ')';
        }
    }

    public a(c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fj3.f.Data b(Params params) {
        fj3.f.Data.ScreenTechnicalData screenTechnicalData;
        int i15;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.e(yi3.a.C, state.getAbroadDetailsPayload().getServiceName()), null, null, null, 28, null), null, null, null, null, 61, null);
        AbroadBasicData technicalData = state.getAbroadDetailsPayload().getTechnicalData();
        AccordionData accordionData = null;
        if (technicalData != null) {
            DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227271w), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getDescription(), "description"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227273x), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getVin(), "vin"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            Integer yearOfProduction = technicalData.getYearOfProduction();
            CardListData cardListData = new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227275y), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(yearOfProduction != null ? String.valueOf(yearOfProduction.intValue()) : null, "yearOfProduction"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
            Label labelC = this.labelProvider.c(yi3.a.f227267u);
            boolean isTechnicalDataExpanded = state.getIsTechnicalDataExpanded();
            l<Boolean, i0> lVarD = params.d();
            DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227257q), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getEngineCapacity(), "engineCapacity"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227269v), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getTransmissionType(), "transmissionType"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227265t), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getFuelType(), "fuelType"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            Integer enginePowerPs = technicalData.getEnginePowerPs();
            DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227263s), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(enginePowerPs != null ? String.valueOf(enginePowerPs.intValue()) : null, "enginePowerPs"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            Integer enginePower = technicalData.getEnginePower();
            screenTechnicalData = new fj3.f.Data.ScreenTechnicalData(cardListData, new AccordionData(v.e(new AccordionElement(null, labelC, null, isTechnicalDataExpanded, lVarD, false, new gj3.b(new CardListData(v.q(defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227260r), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(enginePower != null ? String.valueOf(enginePower.intValue()) : null, "enginePower"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227254p), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getEmissionLevelCO2(), "emissionLevelCO2"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227248n), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getColour(), "colour"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(yi3.a.f227251o), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(technicalData.getDrive(), "drive"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null)), 5, null))));
        } else {
            screenTechnicalData = null;
        }
        List<j> listC = state.getAbroadDetailsPayload().c();
        if (listC != null) {
            Label labelC2 = this.labelProvider.c(yi3.a.A);
            boolean isOdometerDataExpanded = state.getIsOdometerDataExpanded();
            l<Boolean, i0> lVarB = params.b();
            List<j> list = listC;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (j jVar : list) {
                Label labelD = mx.b.d(this.dateConverter.a(jVar.getDate()), "date");
                Label labelD2 = mx.b.d(jVar.getState(), "state");
                String country = jVar.getCountry();
                arrayList.add(new TimelineItemData(labelD, labelD2, country != null ? mx.b.b(country, "country") : null));
            }
            accordionData = new AccordionData(v.e(new AccordionElement(null, labelC2, null, isOdometerDataExpanded, lVarB, false, new d(new TimelineData(arrayList)), 37, null)));
        }
        fj3.f.Data.ScreenOdometerData screenOdometerData = new fj3.f.Data.ScreenOdometerData(accordionData, state.getIsOdometerDataExpanded());
        Label labelC3 = this.labelProvider.c(yi3.a.B);
        List<Risk> listA = state.getAbroadDetailsPayload().a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        for (Risk risk : listA) {
            boolean isRisk = risk.getIsRisk();
            if (isRisk) {
                i15 = yi3.a.f227245m;
            } else {
                if (isRisk) {
                    throw new p();
                }
                i15 = yi3.a.f227277z;
            }
            arrayList2.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(risk.getTitle(), "title"), null, null, 0, 0, null, 62, null), new b.StatusBadge(new r50.a.WithIcon(null, this.labelProvider.c(i15), null, 0, false, risk.getIsRisk() ? g.NEGATIVE : g.POSITIVE, 13, null)), null, 4, null), null, null, null, 3839, null));
        }
        return new fj3.f.Data(baseScaffoldData, screenTechnicalData, screenOdometerData, labelC3, new CardListData(arrayList2, null, false, null, null, 30, null));
    }
}
