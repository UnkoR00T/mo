package j41;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import d60.j;
import er.p;
import fr.t;
import h30.ButtonData;
import h41.BirthPlaceOfficeFields;
import h41.Form;
import i50.BaseScaffoldData;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.l;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lj41/a;", "Lxw/f;", "Lj41/a$a;", "Lh41/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lh41/b;", "form", "params", "Ld60/j;", "Lh41/f$b;", "scrollInstance", "Lh41/e$a$b;", "e", "(Lh41/b;Lj41/a$a;Ld60/j;)Lh41/e$a$b;", "", "testTag", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ln50/g;", "c", "(Ljava/lang/String;Ler/a;)Ln50/g;", "h", "(Lj41/a$a;)Lh41/e$a;", "a", "Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h41.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j41.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"Lj41/a$a;", "", "Lh41/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "onGoNext", "onChangeMunicipalOffice", "onChangeCivilRegistryOffice", "<init>", "(Lh41/d;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh41/d;", "f", "()Lh41/d;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h41.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoNext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeMunicipalOffice;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeCivilRegistryOffice;

        public Params(h41.d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = dVar;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onGoNext = aVar3;
            this.onChangeMunicipalOffice = aVar4;
            this.onChangeCivilRegistryOffice = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onChangeCivilRegistryOffice;
        }

        public final er.a<i0> c() {
            return this.onChangeMunicipalOffice;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final er.a<i0> e() {
            return this.onGoNext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onGoNext, params.onGoNext) && t.c(this.onChangeMunicipalOffice, params.onChangeMunicipalOffice) && t.c(this.onChangeCivilRegistryOffice, params.onChangeCivilRegistryOffice);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final h41.d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onGoNext.hashCode()) * 31) + this.onChangeMunicipalOffice.hashCode()) * 31) + this.onChangeCivilRegistryOffice.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onGoNext=" + this.onGoNext + ", onChangeMunicipalOffice=" + this.onChangeMunicipalOffice + ", onChangeCivilRegistryOffice=" + this.onChangeCivilRegistryOffice + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f99399a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(814260973);
            if (p076m2.t.k()) {
                p076m2.t.o(814260973, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.mapper.BirthPlaceOfficeScreenMapper.createEmptyAddOfficeCard.<anonymous> (BirthPlaceOfficeScreenMapper.kt:219)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f99400a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(876209713);
            if (p076m2.t.k()) {
                p076m2.t.o(876209713, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.mapper.BirthPlaceOfficeScreenMapper.createEmptyAddOfficeCard.<anonymous> (BirthPlaceOfficeScreenMapper.kt:226)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f99401a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-86769452);
            if (p076m2.t.k()) {
                p076m2.t.o(-86769452, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.mapper.BirthPlaceOfficeScreenMapper.createInitializedState.<anonymous>.<anonymous> (BirthPlaceOfficeScreenMapper.kt:125)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jI;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f99402a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(887429619);
            if (p076m2.t.k()) {
                p076m2.t.o(887429619, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.birthplaceoffice.mapper.BirthPlaceOfficeScreenMapper.createInitializedState.<anonymous>.<anonymous> (BirthPlaceOfficeScreenMapper.kt:168)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jI;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData c(String testTag, er.a<i0> onClick) {
        return new DefaultSingleCardData(testTag, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j31.a.f99146f2), null, c.f99400a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106760e0, null, b.f99399a, null, null, 26, null), 3, null), null, null, 3324, null);
    }

    private final h41.e.a.Initialized e(Form form, Params params, j<BirthPlaceOfficeFields.b> scrollInstance) {
        int i15;
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        int i16;
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j31.a.C2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(scrollInstance, false, false, 6, null), 29, null);
        Label labelC = this.labelProvider.c(j31.a.f99150g1);
        mx.c cVar = this.labelProvider;
        boolean areMultipleChildren = form.getAreMultipleChildren();
        if (areMultipleChildren) {
            i15 = j31.a.f99160i1;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i15 = j31.a.f99155h1;
        }
        Label labelC2 = cVar.c(i15);
        BirthPlaceOfficeFields.a.MunicipalOffice chosenMunicipalOffice = form.getFields().getChosenMunicipalOffice();
        if (chosenMunicipalOffice.getValue() == null) {
            defaultSingleCardData = c("MunicipalOfficeCard", params.c());
        } else {
            defaultSingleCardData = new DefaultSingleCardData("MunicipalOfficeCard", null, false, null, null, false, chosenMunicipalOffice.a(), null, new BodySection(l.b(this.labelProvider.c(j31.a.Z0), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(chosenMunicipalOffice.getValue().getName(), ""), null, d.f99401a, 0, 0, null, 58, null)), null, 4, null), null, form.e().size() > 1 ? new x0.Button(new ButtonData("MunicipalOfficeCardButton", null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(j31.a.f99126b2), new Label(this.labelProvider.c(j31.a.f99126b2).getText() + " - " + this.labelProvider.c(j31.a.f99155h1).getText(), "MunicipalOfficeCardButton")), k30.d.a.f107773a, null, params.c(), 34, null)) : null, null, 2750, null);
        }
        BirthPlaceOfficeFields.a.CivilRegistryOffice chosenCivilRegistryOffice = form.getFields().getChosenCivilRegistryOffice();
        if (chosenCivilRegistryOffice.getValue() == null) {
            defaultSingleCardData2 = c("CivilRegistryOfficeCard", params.b());
        } else {
            defaultSingleCardData2 = new DefaultSingleCardData("CivilRegistryOfficeCard", null, false, null, null, false, chosenCivilRegistryOffice.a(), null, new BodySection(l.b(this.labelProvider.c(j31.a.f99166j2), null, null, 3, null), new n50.b.Title(new SingleCardLabel(mx.b.b(chosenCivilRegistryOffice.getValue().getName(), ""), null, e.f99402a, 0, 0, null, 58, null)), null, 4, null), null, form.getAvailableCivilRegistryOffices() != null ? new x0.Button(new ButtonData("CivilRegistryOfficeCardButton", null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(j31.a.f99126b2), null, 2, null), k30.d.a.f107773a, null, params.b(), 34, null)) : null, null, 2750, null);
        }
        mx.c cVar2 = this.labelProvider;
        boolean areMultipleChildren2 = form.getAreMultipleChildren();
        if (areMultipleChildren2) {
            i16 = j31.a.f99140e1;
        } else {
            if (areMultipleChildren2) {
                throw new oq.p();
            }
            i16 = j31.a.f99135d1;
        }
        c30.b.c cVar3 = new c30.b.c("InfoAlert", null, null, cVar2.c(i16), null, null, null, 118, null);
        hz.b validationState = form.getFields().getChosenMunicipalOffice().getValidationState();
        hz.b.Invalid invalid = validationState instanceof hz.b.Invalid ? (hz.b.Invalid) validationState : null;
        Label message = invalid != null ? invalid.getMessage() : null;
        hz.b validationState2 = form.getFields().getChosenCivilRegistryOffice().getValidationState();
        hz.b.Invalid invalid2 = validationState2 instanceof hz.b.Invalid ? (hz.b.Invalid) validationState2 : null;
        return new h41.e.a.Initialized(aVarA, baseScaffoldData, labelC, labelC2, defaultSingleCardData, defaultSingleCardData2, message, invalid2 != null ? invalid2.getMessage() : null, cVar3, new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j31.a.f99235x2), null, 2, null), k30.d.a.f107773a, null, params.e(), 34, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ h41.e.a.Initialized f(a aVar, Form form, Params params, j jVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            jVar = null;
        }
        return aVar.e(form, params, jVar);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public h41.e.a b(Params params) {
        h41.d state = params.getState();
        if (t.c(state, h41.d.e.f80843a)) {
            return new h41.e.a.Loading(params.a());
        }
        if (state instanceof h41.d.ErrorFetchingMunicipalOffices) {
            return new h41.e.a.Error(params.a(), ((h41.d.ErrorFetchingMunicipalOffices) state).getErrorVMS());
        }
        if (state instanceof h41.d.ErrorFetchingCivilRegistryOffices) {
            return new h41.e.a.Error(params.a(), ((h41.d.ErrorFetchingCivilRegistryOffices) state).getErrorVMS());
        }
        if (state instanceof h41.d.FetchingCivilRegistryOffices) {
            return f(this, ((h41.d.FetchingCivilRegistryOffices) state).getForm(), params, null, 4, null);
        }
        if (state instanceof h41.d.ChoosingOffices) {
            h41.d.ChoosingOffices choosingOffices = (h41.d.ChoosingOffices) state;
            return e(choosingOffices.getForm(), params, choosingOffices.d());
        }
        if (state instanceof h41.d.NoEdor) {
            return new h41.e.a.Error(params.a(), ((h41.d.NoEdor) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
