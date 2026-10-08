package fh3;

import df3.VehicleDetailsData;
import dh3.State;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.List;
import java.util.Locale;
import ki3.ShowLocalizationModel;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import se3.InsuranceDetailsData;
import sv0.StatementVehicleDetails;
import sv0.v0;
import ve3.PersonalDetailsData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lfh3/l;", "Lxw/f;", "Lfh3/l$a;", "Ldh3/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lje3/b;", "localizationFormatter", "<init>", "(Lmx/c;Lez/e;Lje3/b;)V", "", "Lsv0/v0;", "", "v", "(Ljava/util/List;)Ljava/lang/String;", "params", "z", "(Lfh3/l$a;)Ldh3/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lje3/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, dh3.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final je3.b localizationFormatter;

    /* JADX INFO: renamed from: fh3.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\b\u0012\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b&\u0010/R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b,\u0010/R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b*\u0010/R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b\"\u0010/R)\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b1\u0010/R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b0\u0010)¨\u00062"}, d2 = {"Lfh3/l$a;", "", "Ldh3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onConfirmAndSign", "onShowRejectDataDialog", "Lkotlin/Function1;", "", "onCheckboxValueChanged", "Lse3/a;", "goToInsuranceDetails", "Ldf3/a;", "goToVehicleDetails", "Lve3/a;", "goToPersonalDetails", "Lki3/a;", "goMapDetails", "", "Lsv0/j0$a;", "onImagesClicked", "onExitAction", "<init>", "(Ldh3/b;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ldh3/b;", "j", "()Ldh3/b;", "b", "Ler/a;", "f", "()Ler/a;", "c", "i", "d", "Ler/l;", "e", "()Ler/l;", "g", "h", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmAndSign;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowRejectDataDialog;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onCheckboxValueChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<InsuranceDetailsData, i0> goToInsuranceDetails;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<VehicleDetailsData, i0> goToVehicleDetails;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<PersonalDetailsData, i0> goToPersonalDetails;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ShowLocalizationModel, i0> goMapDetails;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<List<StatementVehicleDetails.Image>, i0> onImagesClicked;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super Boolean, i0> lVar, er.l<? super InsuranceDetailsData, i0> lVar2, er.l<? super VehicleDetailsData, i0> lVar3, er.l<? super PersonalDetailsData, i0> lVar4, er.l<? super ShowLocalizationModel, i0> lVar5, er.l<? super List<StatementVehicleDetails.Image>, i0> lVar6, er.a<i0> aVar3) {
            this.state = state;
            this.onConfirmAndSign = aVar;
            this.onShowRejectDataDialog = aVar2;
            this.onCheckboxValueChanged = lVar;
            this.goToInsuranceDetails = lVar2;
            this.goToVehicleDetails = lVar3;
            this.goToPersonalDetails = lVar4;
            this.goMapDetails = lVar5;
            this.onImagesClicked = lVar6;
            this.onExitAction = aVar3;
        }

        public final er.l<ShowLocalizationModel, i0> a() {
            return this.goMapDetails;
        }

        public final er.l<InsuranceDetailsData, i0> b() {
            return this.goToInsuranceDetails;
        }

        public final er.l<PersonalDetailsData, i0> c() {
            return this.goToPersonalDetails;
        }

        public final er.l<VehicleDetailsData, i0> d() {
            return this.goToVehicleDetails;
        }

        public final er.l<Boolean, i0> e() {
            return this.onCheckboxValueChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onConfirmAndSign, params.onConfirmAndSign) && t.c(this.onShowRejectDataDialog, params.onShowRejectDataDialog) && t.c(this.onCheckboxValueChanged, params.onCheckboxValueChanged) && t.c(this.goToInsuranceDetails, params.goToInsuranceDetails) && t.c(this.goToVehicleDetails, params.goToVehicleDetails) && t.c(this.goToPersonalDetails, params.goToPersonalDetails) && t.c(this.goMapDetails, params.goMapDetails) && t.c(this.onImagesClicked, params.onImagesClicked) && t.c(this.onExitAction, params.onExitAction);
        }

        public final er.a<i0> f() {
            return this.onConfirmAndSign;
        }

        public final er.a<i0> g() {
            return this.onExitAction;
        }

        public final er.l<List<StatementVehicleDetails.Image>, i0> h() {
            return this.onImagesClicked;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onConfirmAndSign.hashCode()) * 31) + this.onShowRejectDataDialog.hashCode()) * 31) + this.onCheckboxValueChanged.hashCode()) * 31) + this.goToInsuranceDetails.hashCode()) * 31) + this.goToVehicleDetails.hashCode()) * 31) + this.goToPersonalDetails.hashCode()) * 31) + this.goMapDetails.hashCode()) * 31) + this.onImagesClicked.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.onShowRejectDataDialog;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onConfirmAndSign=" + this.onConfirmAndSign + ", onShowRejectDataDialog=" + this.onShowRejectDataDialog + ", onCheckboxValueChanged=" + this.onCheckboxValueChanged + ", goToInsuranceDetails=" + this.goToInsuranceDetails + ", goToVehicleDetails=" + this.goToVehicleDetails + ", goToPersonalDetails=" + this.goToPersonalDetails + ", goMapDetails=" + this.goMapDetails + ", onImagesClicked=" + this.onImagesClicked + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    public l(mx.c cVar, ez.e eVar, je3.b bVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.localizationFormatter = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, State state) {
        params.a().b(new ShowLocalizationModel(state.getReadyToSignStatement().getCollisionCircumstances().getCoordinates(), state.getReadyToSignStatement().getCollisionCircumstances().getLocalizationDescription()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, mx.c cVar, State state) {
        params.b().b(new InsuranceDetailsData(cVar.c(md3.b.N2), state.getReadyToSignStatement().getVictim().c(), false));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(State state, Params params) {
        List<StatementVehicleDetails.Image> listF = state.getReadyToSignStatement().getVictim().getVehicleData().f();
        if (listF != null) {
            params.h().b(listF);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params, boolean z15) {
        params.e().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params params, State state) {
        params.c().b(new PersonalDetailsData(sv0.l.PERPETRATOR, state.getReadyToSignStatement().getPerpetrator().getPersonalData()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params params, State state) {
        params.d().b(new VehicleDetailsData(sv0.l.PERPETRATOR, state.getReadyToSignStatement().getPerpetrator().getVehicleData(), false));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(Params params, mx.c cVar, State state) {
        params.b().b(new InsuranceDetailsData(cVar.c(md3.b.M2), state.getReadyToSignStatement().getPerpetrator().c(), false));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(State state, Params params) {
        List<StatementVehicleDetails.Image> listF = state.getReadyToSignStatement().getPerpetrator().getVehicleData().f();
        if (listF != null) {
            params.h().b(listF);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params, State state) {
        params.c().b(new PersonalDetailsData(sv0.l.VICTIM, state.getReadyToSignStatement().getVictim().getPersonalData()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params, State state) {
        params.d().b(new VehicleDetailsData(sv0.l.VICTIM, state.getReadyToSignStatement().getVictim().getVehicleData(), false));
        return i0.f148189a;
    }

    private final String v(List<? extends v0> list) {
        return dz.e.b(v.v0(list, ", ", null, null, 0, null, new er.l() { // from class: fh3.a
            @Override // er.l
            public final Object b(Object obj) {
                return l.x(this.f63964a, (v0) obj);
            }
        }, 30, null).toLowerCase(Locale.ROOT), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence x(l lVar, v0 v0Var) {
        return lVar.labelProvider.c(ie3.a.e(v0Var)).getText();
    }

    @Override // er.l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public dh3.c.Data b(final Params params) {
        final mx.c cVar = this.labelProvider;
        final State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.g()), this.labelProvider.c(md3.b.f125847v3), null, null, null, 28, null), null, null, null, null, 61, null);
        c30.b.e eVar = new c30.b.e(null, null, null, cVar.c(md3.b.H4), null, null, null, 119, null);
        c30.b.c cVar2 = new c30.b.c(null, null, null, cVar.c(md3.b.F4), null, null, null, 119, null);
        Label labelC = cVar.c(md3.b.f125681a5);
        Label labelC2 = cVar.c(md3.b.G4);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.f125763l), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(ie3.a.a(this.dateFormatter, state.getReadyToSignStatement().getCollisionCircumstances().getDate()), "date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        BodySection bodySection = new BodySection(new SingleCardLabel(cVar.c(md3.b.V4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.localizationFormatter.a(state.getReadyToSignStatement().getCollisionCircumstances().getLocalizationDescription(), state.getReadyToSignStatement().getCollisionCircumstances().getCoordinates()), "localization"), null, null, 0, 0, null, 62, null)), null, 4, null);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar = k30.d.a.f107773a;
        CardListData cardListData = new CardListData(v.q(defaultSingleCardData, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.I), cVar.c(md3.b.O0)), aVar, null, new er.a() { // from class: fh3.c
            @Override // er.a
            public final Object a() {
                return l.E(params, state);
            }
        }, 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.f125779n), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getReadyToSignStatement().getCollisionCircumstances().getCollisionDescription()), "collisionDescription"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        Label labelC3 = cVar.c(md3.b.N4);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.Q4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getReadyToSignStatement().getPerpetrator().getPersonalData().a()), "perpetratorNames"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.d
            @Override // er.a
            public final Object a() {
                return l.I(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.X5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getReadyToSignStatement().getPerpetrator().getVehicleData().e()), "perpetratorVehicleData"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.e
            @Override // er.a
            public final Object a() {
                return l.J(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.M2), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(ie3.a.b(state.getReadyToSignStatement().getPerpetrator().c(), "perpetratorInsurance"), null, null, 0, 0, null, 62, null)), null, 4, null), null, !state.getReadyToSignStatement().getPerpetrator().c().isEmpty() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.f
            @Override // er.a
            public final Object a() {
                return l.K(params, cVar, state);
            }
        }, 35, null)) : null, null, 2815, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.f125697c5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(v(state.getReadyToSignStatement().getPerpetrator().getVehicleData().d()), "perpetratorVehicleDataDamages"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(cVar.c(md3.b.U4), null, null, 0, 0, null, 62, null);
        List<StatementVehicleDetails.Image> listF = state.getReadyToSignStatement().getPerpetrator().getVehicleData().f();
        BodySection bodySection2 = new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(listF != null ? String.valueOf(listF.size()) : null, "perpetrator_number_of_images"), null, null, 0, 0, null, 62, null)), null, 4, null);
        x0.Button button = new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.g
            @Override // er.a
            public final Object a() {
                return l.L(state, params);
            }
        }, 35, null));
        List<StatementVehicleDetails.Image> listF2 = state.getReadyToSignStatement().getPerpetrator().getVehicleData().f();
        CardListData cardListData2 = new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection2, null, (listF2 == null || !(listF2.isEmpty() ^ true)) ? null : button, null, 2815, null)), null, false, null, null, 30, null);
        Label labelC4 = cVar.c(md3.b.f125841u5);
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.Q4), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getReadyToSignStatement().getVictim().getPersonalData().a()), "victimNames"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.h
            @Override // er.a
            public final Object a() {
                return l.M(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.Z5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getReadyToSignStatement().getVictim().getVehicleData().e()), "victimVehicleData"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.i
            @Override // er.a
            public final Object a() {
                return l.N(params, state);
            }
        }, 35, null)), null, 2815, null);
        DefaultSingleCardData defaultSingleCardData8 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.N2), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(ie3.a.b(state.getReadyToSignStatement().getVictim().c(), "victimInsurance"), null, null, 0, 0, null, 62, null)), null, 4, null), null, !state.getReadyToSignStatement().getVictim().c().isEmpty() ? new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.j
            @Override // er.a
            public final Object a() {
                return l.F(params, cVar, state);
            }
        }, 35, null)) : null, null, 2815, null);
        DefaultSingleCardData defaultSingleCardData9 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.f125697c5), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(v(state.getReadyToSignStatement().getVictim().getVehicleData().d()), "victimVehicleDataDamages"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(cVar.c(md3.b.U4), null, null, 0, 0, null, 62, null);
        List<StatementVehicleDetails.Image> listF3 = state.getReadyToSignStatement().getVictim().getVehicleData().f();
        BodySection bodySection3 = new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.d(listF3 != null ? String.valueOf(listF3.size()) : null, "victim_number_of_images"), null, null, 0, 0, null, 62, null)), null, 4, null);
        x0.Button button2 = new x0.Button(new ButtonData(null, null, bVar, new k30.c.WithText(cVar.c(md3.b.J), null, 2, null), aVar, null, new er.a() { // from class: fh3.k
            @Override // er.a
            public final Object a() {
                return l.G(state, params);
            }
        }, 35, null));
        List<StatementVehicleDetails.Image> listF4 = state.getReadyToSignStatement().getVictim().getVehicleData().f();
        return new dh3.c.Data(baseScaffoldData, eVar, cVar2, labelC, labelC2, cardListData, labelC3, cardListData2, labelC4, new CardListData(v.s(defaultSingleCardData6, defaultSingleCardData7, defaultSingleCardData8, defaultSingleCardData9, new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection3, null, (listF4 == null || !(listF4.isEmpty() ^ true)) ? null : button2, null, 2815, null)), null, false, null, null, 30, null), cVar.c(md3.b.f125685b1), new CheckBoxSingleData(new CheckBoxRowData(null, state.getCheckboxChecked(), new er.l() { // from class: fh3.b
            @Override // er.l
            public final Object b(Object obj) {
                return l.H(params, ((Boolean) obj).booleanValue());
            }
        }, cVar.c(md3.b.f125689b5), null, null, null, null, 241, null), state.getStatementShowError() ? new r30.b.Error(null, cVar.c(md3.b.f125703d3), 1, null) : r30.b.a.f171263a, r30.c.CONTENT_BOX, false, null, 24, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(md3.b.E4), null, 2, null), aVar, null, params.f(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(md3.b.T), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.i(), 35, null), params.getState().getScrollToStatement());
    }
}
