package wy1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import x40.LinkData;
import x50.NavigationButtonData;
import xy1.ElectoralEventDetailsScreenData;
import yi0.CitizenAddress;
import yi0.ElectionsArea;
import yi0.ResidenceAddress;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020#*\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020#*\u00020\u001fH\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lwy1/j;", "Lxw/f;", "Lwy1/j$a;", "Lwy1/g$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Ldz/c;", "postCodeFormatter", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lez/c;Ldz/c;Lu04/a;)V", "Lyi0/e;", "address", "Lmx/a;", "r", "(Lyi0/e;)Lmx/a;", "electionsArea", "Lkotlin/Function1;", "", "Loq/i0;", "copyAddressClick", "Ln30/b;", "s", "(Lyi0/e;Ler/l;)Ln30/b;", "h", "Ln50/g;", "i", "(Lyi0/e;)Ln50/g;", "Lyi0/g;", "residenceAddress", "q", "(Lyi0/e;Lyi0/g;)Ln30/b;", "", "v", "(Lyi0/g;Lyi0/e;)Z", "f", "(Lyi0/g;)Z", "params", "l", "(Lwy1/j$a;)Lwy1/g$a;", "a", "Lmx/c;", "b", "Lez/c;", "c", "Ldz/c;", "d", "Lu04/a;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dz.c postCodeFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: wy1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lwy1/j$a;", "", "Lwy1/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onUrlClickAction", "copyAddressAction", "Lyi0/e;", "addEventToCalendarAction", "Lkotlin/Function0;", "onBackClickAction", "<init>", "(Lwy1/f;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwy1/f;", "e", "()Lwy1/f;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onUrlClickAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> copyAddressAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ElectionsArea, i0> addEventToCalendarAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClickAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super String, i0> lVar, er.l<? super String, i0> lVar2, er.l<? super ElectionsArea, i0> lVar3, er.a<i0> aVar) {
            this.state = state;
            this.onUrlClickAction = lVar;
            this.copyAddressAction = lVar2;
            this.addEventToCalendarAction = lVar3;
            this.onBackClickAction = aVar;
        }

        public final er.l<ElectionsArea, i0> a() {
            return this.addEventToCalendarAction;
        }

        public final er.l<String, i0> b() {
            return this.copyAddressAction;
        }

        public final er.a<i0> c() {
            return this.onBackClickAction;
        }

        public final er.l<String, i0> d() {
            return this.onUrlClickAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onUrlClickAction, params.onUrlClickAction) && fr.t.c(this.copyAddressAction, params.copyAddressAction) && fr.t.c(this.addEventToCalendarAction, params.addEventToCalendarAction) && fr.t.c(this.onBackClickAction, params.onBackClickAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onUrlClickAction.hashCode()) * 31) + this.copyAddressAction.hashCode()) * 31) + this.addEventToCalendarAction.hashCode()) * 31) + this.onBackClickAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUrlClickAction=" + this.onUrlClickAction + ", copyAddressAction=" + this.copyAddressAction + ", addEventToCalendarAction=" + this.addEventToCalendarAction + ", onBackClickAction=" + this.onBackClickAction + ')';
        }
    }

    public j(mx.c cVar, ez.c cVar2, dz.c cVar3, u04.a aVar) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.postCodeFormatter = cVar3;
        this.commonEndpoints = aVar;
    }

    private final boolean f(ResidenceAddress residenceAddress) {
        String city;
        String postalCode = residenceAddress.getPostalCode();
        if (postalCode == null || fu.r.t0(postalCode) || (city = residenceAddress.getCity()) == null || fu.r.t0(city)) {
            return true;
        }
        b0 street = residenceAddress.getStreet();
        String strE = street != null ? c0.e(street) : null;
        if (strE == null || fu.r.t0(strE)) {
            return true;
        }
        b0 buildingNumber = residenceAddress.getBuildingNumber();
        String strE2 = buildingNumber != null ? c0.e(buildingNumber) : null;
        return strE2 == null || fu.r.t0(strE2);
    }

    private final Label h(ElectionsArea electionsArea) {
        CitizenAddress temporaryOkwAddress = electionsArea.getTemporaryOkwAddress();
        String temporaryOkwName = electionsArea.getTemporaryOkwName();
        if (temporaryOkwName == null || temporaryOkwName.length() == 0) {
            temporaryOkwAddress = null;
        }
        if (temporaryOkwAddress == null) {
            temporaryOkwAddress = electionsArea.getOkwAddress();
        }
        return ez1.a.a(temporaryOkwAddress.getPostalCode(), temporaryOkwAddress.getCity(), temporaryOkwAddress.getStreet(), temporaryOkwAddress.getBuildingNumber(), temporaryOkwAddress.getApartmentNumber());
    }

    private final DefaultSingleCardData i(ElectionsArea electionsArea) {
        String temporaryOkwName = electionsArea.getTemporaryOkwName();
        boolean z15 = temporaryOkwName == null || temporaryOkwName.length() == 0;
        if (z15) {
            return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169515m), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(electionsArea.getOkwName(), "okwName"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
        }
        if (z15) {
            throw new oq.p();
        }
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169520r), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(temporaryOkwName, "temporaryOkwName"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.a().b(params.getState().getElectoralEventDetailsModel().getElectionsArea());
        return i0.f148189a;
    }

    private final CardListData q(ElectionsArea electionsArea, ResidenceAddress residenceAddress) {
        SingleCardLabel singleCardLabelB;
        String strE;
        Label labelB;
        if (residenceAddress != null) {
            SingleCardLabel singleCardLabelB2 = n50.l.b(this.labelProvider.c(qy1.a.f169518p), null, null, 3, null);
            b0 foreignAddress = residenceAddress.getForeignAddress();
            if (foreignAddress == null || (strE = c0.e(foreignAddress)) == null || (labelB = mx.b.b(strE, "foreignAddress")) == null || (singleCardLabelB = n50.l.b(labelB, null, null, 3, null)) == null) {
                String postalCode = residenceAddress.getPostalCode();
                singleCardLabelB = n50.l.b(ez1.a.a(postalCode != null ? this.postCodeFormatter.a(postalCode) : null, residenceAddress.getCity(), residenceAddress.getStreet(), residenceAddress.getBuildingNumber(), residenceAddress.getApartmentNumber()), null, null, 3, null);
            }
            CardListData cardListData = new CardListData(pq.v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabelB2, new n50.b.Title(singleCardLabelB), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
            if (v(residenceAddress, electionsArea)) {
                return cardListData;
            }
        }
        return null;
    }

    private final Label r(ElectionsArea address) {
        String temporaryOkwName;
        return (address.getOkwName().length() == 0 && ((temporaryOkwName = address.getTemporaryOkwName()) == null || temporaryOkwName.length() == 0)) ? this.labelProvider.c(qy1.a.f169517o) : this.labelProvider.c(qy1.a.f169512j);
    }

    private final CardListData s(ElectionsArea electionsArea, final er.l<? super String, i0> copyAddressClick) {
        final Label labelH = h(electionsArea);
        return new CardListData(pq.v.q(i(electionsArea), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169510i), null, null, 3, null), new n50.b.Title(n50.l.b(labelH, null, null, 3, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(qy1.a.f169500d), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: wy1.i
            @Override // er.a
            public final Object a() {
                return j.u(copyAddressClick, labelH);
            }
        }, 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169514l), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(electionsArea.getCommune(), "comune"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169516n), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(electionsArea.getNumber(), "area_number"), null, null, 3, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.l lVar, Label label) {
        lVar.b(label.getText());
        return i0.f148189a;
    }

    private final boolean v(ResidenceAddress residenceAddress, ElectionsArea electionsArea) {
        b0 foreignAddress = residenceAddress.getForeignAddress();
        String strE = foreignAddress != null ? c0.e(foreignAddress) : null;
        return !((strE == null || fu.r.t0(strE)) && f(residenceAddress)) && fr.t.c(residenceAddress.getElectionsName(), electionsArea.getElectionsName());
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g.Data b(final Params params) {
        Label labelB = mx.b.b(params.getState().getElectoralEventDetailsModel().getElectionsArea().getElectionsName(), "electionDateTitle");
        CardListData cardListData = new CardListData(pq.v.e(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(qy1.a.f169522t), null, null, 3, null), new n50.b.Title(n50.l.b(mx.b.b(this.dateConverter.a(params.getState().getElectoralEventDetailsModel().getElectionsArea().getElectionsDate()), "electionDate"), null, null, 3, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(qy1.a.f169494a), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: wy1.h
            @Override // er.a
            public final Object a() {
                return j.m(params);
            }
        }, 35, null)), null, 2815, null)), null, false, null, null, 30, null);
        Label labelC = this.labelProvider.c(qy1.a.f169523u);
        CardListData cardListDataS = s(params.getState().getElectoralEventDetailsModel().getElectionsArea(), params.b());
        Label labelC2 = this.labelProvider.c(qy1.a.f169519q);
        CardListData cardListDataQ = q(params.getState().getElectoralEventDetailsModel().getElectionsArea(), params.getState().getElectoralEventDetailsModel().getResidenceAddress());
        c30.b.c cVar = new c30.b.c(null, null, null, r(params.getState().getElectoralEventDetailsModel().getElectionsArea()), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(qy1.a.f169513k), this.commonEndpoints.a(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null)), 55, null);
        if (!params.getState().getElectoralEventDetailsModel().getElectionsArea().getChangeVoteAreaAvailability()) {
            cVar = null;
        }
        return new g.Data(new ElectoralEventDetailsScreenData(labelB, cardListData, labelC, cardListDataS, labelC2, cardListDataQ, cVar), new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(qy1.a.f169521s), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
