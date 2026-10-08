package j81;

import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i81.State;
import iy.b0;
import iy.c0;
import k30.d;
import k81.FieldItem;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import v40.InputDateTimeData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import xw.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lj81/c;", "Lxw/f;", "Lj81/c$a;", "Li81/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "f", "(Lj81/c$a;)Li81/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i81.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: j81.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010(R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b1\u0010.R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b/\u0010.R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010.R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b&\u0010.R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b3\u0010.R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b2\u0010.R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b6\u0010(R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b)\u0010.R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b5\u0010(¨\u00067"}, d2 = {"Lj81/c$a;", "", "Li81/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "onNext", "Lkotlin/Function1;", "", "onFirstNameChanged", "onSecondNameChanged", "onOtherNameChanged", "onLastNameChanged", "Lxw/g;", "onPeselNumberChanged", "onBirthPlaceChanged", "", "onNoNameSwitchChanged", "onNoLastNameSwitchChanged", "toDatePicker", "onCitizenshipCheckBoxChanged", "onScrolledToCitizenshipCheckBox", "<init>", "(Li81/b;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li81/b;", "n", "()Li81/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "g", "e", "Ler/l;", "()Ler/l;", "f", "m", "j", "h", "i", "k", "l", "o", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f100161p;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onFirstNameChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSecondNameChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOtherNameChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLastNameChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<g, i0> onPeselNumberChanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onBirthPlaceChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onNoNameSwitchChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onNoLastNameSwitchChanged;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toDatePicker;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onCitizenshipCheckBoxChanged;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToCitizenshipCheckBox;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f100161p = i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, l<? super String, i0> lVar4, l<? super g, i0> lVar5, l<? super String, i0> lVar6, l<? super Boolean, i0> lVar7, l<? super Boolean, i0> lVar8, er.a<i0> aVar4, l<? super Boolean, i0> lVar9, er.a<i0> aVar5) {
            this.state = state;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onNext = aVar3;
            this.onFirstNameChanged = lVar;
            this.onSecondNameChanged = lVar2;
            this.onOtherNameChanged = lVar3;
            this.onLastNameChanged = lVar4;
            this.onPeselNumberChanged = lVar5;
            this.onBirthPlaceChanged = lVar6;
            this.onNoNameSwitchChanged = lVar7;
            this.onNoLastNameSwitchChanged = lVar8;
            this.toDatePicker = aVar4;
            this.onCitizenshipCheckBoxChanged = lVar9;
            this.onScrolledToCitizenshipCheckBox = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<String, i0> b() {
            return this.onBirthPlaceChanged;
        }

        public final l<Boolean, i0> c() {
            return this.onCitizenshipCheckBoxChanged;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final l<String, i0> e() {
            return this.onFirstNameChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext) && t.c(this.onFirstNameChanged, params.onFirstNameChanged) && t.c(this.onSecondNameChanged, params.onSecondNameChanged) && t.c(this.onOtherNameChanged, params.onOtherNameChanged) && t.c(this.onLastNameChanged, params.onLastNameChanged) && t.c(this.onPeselNumberChanged, params.onPeselNumberChanged) && t.c(this.onBirthPlaceChanged, params.onBirthPlaceChanged) && t.c(this.onNoNameSwitchChanged, params.onNoNameSwitchChanged) && t.c(this.onNoLastNameSwitchChanged, params.onNoLastNameSwitchChanged) && t.c(this.toDatePicker, params.toDatePicker) && t.c(this.onCitizenshipCheckBoxChanged, params.onCitizenshipCheckBoxChanged) && t.c(this.onScrolledToCitizenshipCheckBox, params.onScrolledToCitizenshipCheckBox);
        }

        public final l<String, i0> f() {
            return this.onLastNameChanged;
        }

        public final er.a<i0> g() {
            return this.onNext;
        }

        public final l<Boolean, i0> h() {
            return this.onNoLastNameSwitchChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onFirstNameChanged.hashCode()) * 31) + this.onSecondNameChanged.hashCode()) * 31) + this.onOtherNameChanged.hashCode()) * 31) + this.onLastNameChanged.hashCode()) * 31) + this.onPeselNumberChanged.hashCode()) * 31) + this.onBirthPlaceChanged.hashCode()) * 31) + this.onNoNameSwitchChanged.hashCode()) * 31) + this.onNoLastNameSwitchChanged.hashCode()) * 31) + this.toDatePicker.hashCode()) * 31) + this.onCitizenshipCheckBoxChanged.hashCode()) * 31) + this.onScrolledToCitizenshipCheckBox.hashCode();
        }

        public final l<Boolean, i0> i() {
            return this.onNoNameSwitchChanged;
        }

        public final l<String, i0> j() {
            return this.onOtherNameChanged;
        }

        public final l<g, i0> k() {
            return this.onPeselNumberChanged;
        }

        public final er.a<i0> l() {
            return this.onScrolledToCitizenshipCheckBox;
        }

        public final l<String, i0> m() {
            return this.onSecondNameChanged;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public final er.a<i0> o() {
            return this.toDatePicker;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ", onFirstNameChanged=" + this.onFirstNameChanged + ", onSecondNameChanged=" + this.onSecondNameChanged + ", onOtherNameChanged=" + this.onOtherNameChanged + ", onLastNameChanged=" + this.onLastNameChanged + ", onPeselNumberChanged=" + this.onPeselNumberChanged + ", onBirthPlaceChanged=" + this.onBirthPlaceChanged + ", onNoNameSwitchChanged=" + this.onNoNameSwitchChanged + ", onNoLastNameSwitchChanged=" + this.onNoLastNameSwitchChanged + ", toDatePicker=" + this.toDatePicker + ", onCitizenshipCheckBoxChanged=" + this.onCitizenshipCheckBoxChanged + ", onScrolledToCitizenshipCheckBox=" + this.onScrolledToCitizenshipCheckBox + ')';
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.k().b(g.b(g.c(c0.g(str))));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, boolean z15) {
        params.c().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i81.c.Data b(final Params params) {
        String strE;
        hz.b validationState;
        r30.b error;
        b0 b0VarD;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.f210331f5), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(w51.a.V3);
        v50.c.Text text = new v50.c.Text(null, this.labelProvider.c(w51.a.f210337g4), null, mx.b.b(c0.e(params.getState().g().d()), "firstName"), params.getState().g().getValidationState(), null, null, params.e(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Text text2 = new v50.c.Text(null, this.labelProvider.c(w51.a.A4), null, mx.b.b(c0.e(params.getState().n().d()), "secondName"), params.getState().n().getValidationState(), null, null, params.m(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Text text3 = new v50.c.Text(null, this.labelProvider.c(w51.a.f210379m4), null, mx.b.b(c0.e(params.getState().k().d()), "otherName"), params.getState().k().getValidationState(), null, null, params.j(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Text text4 = new v50.c.Text(null, this.labelProvider.c(w51.a.f210358j4), null, mx.b.b(c0.e(params.getState().h().d()), "lastName"), params.getState().h().getValidationState(), null, null, params.f(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        v50.c.Number number = new v50.c.Number(null, this.labelProvider.c(w51.a.f210421s4), null, mx.b.b(c0.e(params.getState().l().d().getValue()), "pesel"), params.getState().l().getValidationState(), null, null, new l() { // from class: j81.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, false, 1048421, null);
        Label labelC2 = this.labelProvider.c(w51.a.G3);
        e eVar = this.dateFormatter;
        FieldItem<b0> fieldItemC = params.getState().c();
        if (fieldItemC == null || (b0VarD = fieldItemC.d()) == null || (strE = c0.e(b0VarD)) == null) {
            strE = "";
        }
        String str = strE;
        fz.c cVar = fz.c.DOTTED;
        String strD = eVar.d(new fz.b.String(str, cVar, false, 4, null), cVar);
        InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
        FieldItem<b0> fieldItemC2 = params.getState().c();
        if (fieldItemC2 == null || (validationState = fieldItemC2.getValidationState()) == null) {
            validationState = hz.b.C2039b.f86846c;
        }
        InputDateTimeData inputDateTimeData = new InputDateTimeData(null, labelC2, strD, c5303a, validationState, null, null, null, params.getState().getDatePickerEnabled(), null, params.o(), 737, null);
        v50.c.Text text5 = new v50.c.Text(null, this.labelProvider.c(w51.a.I3), null, mx.b.b(c0.e(params.getState().d().d()), "birthPlace"), params.getState().d().getValidationState(), null, null, params.b(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        s50.a.c cVar2 = new s50.a.c(null, params.getState().getNoNameSwitchChecked(), this.labelProvider.c(w51.a.U4), null, false, null, params.i(), null, 185, null);
        s50.a.c cVar3 = new s50.a.c(null, params.getState().getNoLastNameSwitchChecked(), this.labelProvider.c(w51.a.f210352i5), null, false, null, params.h(), null, 185, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210344h4), null, 2, null), d.a.f107773a, null, params.g(), 35, null);
        boolean z15 = !params.getState().getNoNameSwitchChecked();
        boolean z16 = !params.getState().getNoLastNameSwitchChecked();
        Label labelC3 = this.labelProvider.c(w51.a.O3);
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData("citizenshipCheckBox", params.getState().e().d().booleanValue(), new l() { // from class: j81.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, ((Boolean) obj).booleanValue());
            }
        }, this.labelProvider.c(w51.a.f210318e), null, null, null, null, 240, null);
        r30.c cVar4 = r30.c.CONTENT_BOX;
        hz.b validationState2 = params.getState().e().getValidationState();
        if (t.c(validationState2, hz.b.d.f86848c) || t.c(validationState2, hz.b.C2039b.f86846c)) {
            error = r30.b.a.f171263a;
        } else {
            if (!(validationState2 instanceof hz.b.Invalid)) {
                throw new p();
            }
            error = new r30.b.Error(null, this.labelProvider.c(w51.a.f210311d), 1, null);
        }
        return new i81.c.Data(baseScaffoldData, aVarA, labelC, buttonData, z15, z16, text, text2, text3, text4, number, text5, inputDateTimeData, cVar2, cVar3, labelC3, new CheckBoxSingleData(checkBoxRowData, error, cVar4, false, null, 24, null), params.getState().getScrollToCitizenshipCheckBox(), params.l());
    }
}
