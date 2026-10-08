package wi3;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.k;
import fr.t;
import h30.ButtonData;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r30.CheckBoxRowData;
import sv0.InsuranceProviderData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xi3.InsuranceFieldsData;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lwi3/c;", "Lxw/f;", "Lwi3/c$b;", "Lvi3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "Lj40/m;", "l", "(Lhz/b;)Lj40/m;", "params", "f", "(Lwi3/c$b;)Lvi3/c$a;", "a", "Lmx/c;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, vi3.c.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f213708b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f213709c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwi3/c$a;", "", "<init>", "()V", "", "INSURANCE_NUMBER_VALUE_TAG", "Ljava/lang/String;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: wi3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006'"}, d2 = {"Lwi3/c$b;", "", "Lvi3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onChooseInsuranceCompany", "Lkotlin/Function1;", "Liy/b0;", "onInsuranceNumberChanged", "", "onStatementCheckChanged", "onAddInsurance", "onBackAction", "onDeleteInsurance", "<init>", "(Lvi3/b;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvi3/b;", "g", "()Lvi3/b;", "b", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "e", "()Ler/l;", "d", "f", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vi3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChooseInsuranceCompany;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onInsuranceNumberChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementCheckChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddInsurance;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteInsurance;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(vi3.b bVar, er.a<i0> aVar, l<? super b0, i0> lVar, l<? super Boolean, i0> lVar2, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onChooseInsuranceCompany = aVar;
            this.onInsuranceNumberChanged = lVar;
            this.onStatementCheckChanged = lVar2;
            this.onAddInsurance = aVar2;
            this.onBackAction = aVar3;
            this.onDeleteInsurance = aVar4;
        }

        public final er.a<i0> a() {
            return this.onAddInsurance;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.a<i0> c() {
            return this.onChooseInsuranceCompany;
        }

        public final er.a<i0> d() {
            return this.onDeleteInsurance;
        }

        public final l<b0, i0> e() {
            return this.onInsuranceNumberChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onChooseInsuranceCompany, params.onChooseInsuranceCompany) && t.c(this.onInsuranceNumberChanged, params.onInsuranceNumberChanged) && t.c(this.onStatementCheckChanged, params.onStatementCheckChanged) && t.c(this.onAddInsurance, params.onAddInsurance) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onDeleteInsurance, params.onDeleteInsurance);
        }

        public final l<Boolean, i0> f() {
            return this.onStatementCheckChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final vi3.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onChooseInsuranceCompany.hashCode()) * 31) + this.onInsuranceNumberChanged.hashCode()) * 31) + this.onStatementCheckChanged.hashCode()) * 31) + this.onAddInsurance.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onDeleteInsurance.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onChooseInsuranceCompany=" + this.onChooseInsuranceCompany + ", onInsuranceNumberChanged=" + this.onInsuranceNumberChanged + ", onStatementCheckChanged=" + this.onStatementCheckChanged + ", onAddInsurance=" + this.onAddInsurance + ", onBackAction=" + this.onBackAction + ", onDeleteInsurance=" + this.onDeleteInsurance + ')';
        }
    }

    /* JADX INFO: renamed from: wi3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5649c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5649c f213718a = new C5649c();

        C5649c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-184362828);
            if (p076m2.t.k()) {
                p076m2.t.o(-184362828, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.writeinsurance.mapper.WriteInsuranceScreenMapper.invoke.<anonymous>.<anonymous> (WriteInsuranceScreenMapper.kt:146)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f213719a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(392832885);
            if (p076m2.t.k()) {
                p076m2.t.o(392832885, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.writeinsurance.mapper.WriteInsuranceScreenMapper.invoke.<anonymous>.<anonymous> (WriteInsuranceScreenMapper.kt:154)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, DropDownButtonData dropDownButtonData) {
        params.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    private final m l(hz.b bVar) {
        if (t.c(bVar, hz.b.C2039b.f86846c) || t.c(bVar, hz.b.d.f86848c)) {
            return new m.Enabled(null, 1, null);
        }
        if (bVar instanceof hz.b.Invalid) {
            return new m.Error(((hz.b.Invalid) bVar).getMessage());
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public vi3.c.a b(final Params params) {
        int i15;
        Integer numValueOf;
        r30.b error;
        Label labelC;
        mx.c cVar = this.labelProvider;
        vi3.b state = params.getState();
        if (t.c(state, vi3.b.a.f207001a)) {
            return vi3.c.a.C5420a.f207007a;
        }
        if (!(state instanceof vi3.b.Initialized)) {
            throw new oq.p();
        }
        vi3.b.Initialized initialized = (vi3.b.Initialized) state;
        xi3.b mode = initialized.getMode();
        if (mode instanceof xi3.b.a) {
            i15 = md3.b.V0;
        } else {
            if (!(mode instanceof xi3.b.Edit)) {
                throw new oq.p();
            }
            i15 = md3.b.A2;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), cVar.c(i15), null, null, null, 28, null), null, null, null, new ScrollControllerData(((vi3.b.Initialized) params.getState()).f(), false, false, 6, null), 29, null);
        Label labelC2 = cVar.c(md3.b.W0);
        Label labelC3 = cVar.c(md3.b.f125685b1);
        InsuranceFieldsData.InterfaceC5853a.DropDown insuranceCompanyDropDownField = initialized.getInsuranceFieldsData().getInsuranceCompanyDropDownField();
        Label labelC4 = cVar.c(md3.b.R0);
        Label labelC5 = cVar.c(md3.b.P0);
        m mVarL = l(insuranceCompanyDropDownField.getValidationState());
        List<InsuranceProviderData> listD = initialized.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        int i16 = 0;
        for (Object obj : listD) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            arrayList.add(mx.b.b(((InsuranceProviderData) obj).getInsurerName(), "insurerName_" + i16));
            i16 = i17;
        }
        InsuranceProviderData selectedInsuranceProvider = initialized.getSelectedInsuranceProvider();
        if (selectedInsuranceProvider != null) {
            List<InsuranceProviderData> listD2 = initialized.d();
            ArrayList arrayList2 = new ArrayList(v.y(listD2, 10));
            Iterator<T> it = listD2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InsuranceProviderData) it.next()).getInsurerId());
            }
            numValueOf = Integer.valueOf(arrayList2.indexOf(selectedInsuranceProvider.getInsurerId()));
        } else {
            numValueOf = null;
        }
        DropDownButtonData dropDownButtonData = new DropDownButtonData(labelC4, arrayList, numValueOf, mVarL, labelC5, false, insuranceCompanyDropDownField.getField(), new l() { // from class: wi3.a
            @Override // er.l
            public final Object b(Object obj2) {
                return c.h(params, (DropDownButtonData) obj2);
            }
        }, 32, null);
        InsuranceFieldsData.InterfaceC5853a.Input insuranceNumberField = initialized.getInsuranceFieldsData().getInsuranceNumberField();
        v50.c.Text text = new v50.c.Text(null, cVar.c(md3.b.T0), null, mx.b.b(c0.e(insuranceNumberField.getValue()), "insuranceNumberValue"), insuranceNumberField.getValidationState(), null, null, new l() { // from class: wi3.b
            @Override // er.l
            public final Object b(Object obj2) {
                return c.i(params, (String) obj2);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, insuranceNumberField.getField(), 524133, null);
        InsuranceFieldsData.InterfaceC5853a.CheckBox statementCheckBoxField = initialized.getInsuranceFieldsData().getStatementCheckBoxField();
        InsuranceFieldsData.b field = statementCheckBoxField.getField();
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData(null, statementCheckBoxField.getIsChecked(), params.f(), cVar.c(md3.b.f125677a1), null, null, null, null, 241, null);
        hz.b validationState = statementCheckBoxField.getValidationState();
        boolean z15 = validationState instanceof hz.b.Invalid;
        if (z15) {
            error = new r30.b.Error(null, ((hz.b.Invalid) validationState).getMessage(), 1, null);
        } else {
            if (z15) {
                throw new oq.p();
            }
            error = r30.b.a.f171263a;
        }
        CheckBoxSingleData checkBoxSingleData = new CheckBoxSingleData(checkBoxRowData, error, r30.c.DEFAULT, false, field, 8, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        xi3.b mode2 = initialized.getMode();
        if (mode2 instanceof xi3.b.a) {
            labelC = cVar.c(md3.b.f125675a);
        } else {
            if (!(mode2 instanceof xi3.b.Edit)) {
                throw new oq.p();
            }
            labelC = cVar.c(md3.b.U);
        }
        ButtonData buttonData = new ButtonData(null, null, large, new k30.c.WithText(labelC, null, 2, null), aVar, null, params.a(), 35, null);
        er.a<i0> aVarB = params.b();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(cVar.c(md3.b.f125870y2), null, C5649c.f213718a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, new n50.d.IconButton(new ButtonIconData(null, jz.a.f106727a, d.f213719a, null, null, params.d(), 25, null)), null, 5, null), null, null, 3325, null);
        if (!(initialized.getMode() instanceof xi3.b.Edit)) {
            defaultSingleCardData = null;
        }
        return new vi3.c.a.Initialized(baseScaffoldData, labelC2, labelC3, dropDownButtonData, text, checkBoxSingleData, buttonData, aVarB, defaultSingleCardData);
    }
}
