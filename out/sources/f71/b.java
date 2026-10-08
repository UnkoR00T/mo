package f71;

import cl0.PassportChildApplicationGetChildData;
import e71.c;
import er.l;
import ez.e;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import k30.d;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0017B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf71/b;", "Lxw/f;", "Lf71/b$a;", "Le71/c$a;", "Lu04/a;", "commonEndpoints", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lu04/a;Lmx/c;Lez/e;)V", "Lcl0/k0;", "childData", "", "Lf71/b$b;", "e", "(Lcl0/k0;)Ljava/util/List;", "params", "f", "(Lf71/b$a;)Le71/c$a;", "a", "Lu04/a;", "b", "Lmx/c;", "c", "Lez/e;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: f71.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001e\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010&R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010 R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lf71/b$a;", "", "Le71/b;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "birthPlaceInputChanged", "openUrl", "Lkotlin/Function0;", "onNext", "onBack", "onClose", "", "onCitizenshipCheckBoxChanged", "onScrolledToCitizenshipCheckBox", "<init>", "(Le71/b;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Le71/b;", "h", "()Le71/b;", "b", "Ler/l;", "()Ler/l;", "c", "g", "d", "Ler/a;", "e", "()Ler/a;", "f", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e71.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> birthPlaceInputChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onCitizenshipCheckBoxChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToCitizenshipCheckBox;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e71.b bVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Boolean, i0> lVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.birthPlaceInputChanged = lVar;
            this.openUrl = lVar2;
            this.onNext = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
            this.onCitizenshipCheckBoxChanged = lVar3;
            this.onScrolledToCitizenshipCheckBox = aVar4;
        }

        public final l<String, i0> a() {
            return this.birthPlaceInputChanged;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final l<Boolean, i0> c() {
            return this.onCitizenshipCheckBoxChanged;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final er.a<i0> e() {
            return this.onNext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.birthPlaceInputChanged, params.birthPlaceInputChanged) && t.c(this.openUrl, params.openUrl) && t.c(this.onNext, params.onNext) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onCitizenshipCheckBoxChanged, params.onCitizenshipCheckBoxChanged) && t.c(this.onScrolledToCitizenshipCheckBox, params.onScrolledToCitizenshipCheckBox);
        }

        public final er.a<i0> f() {
            return this.onScrolledToCitizenshipCheckBox;
        }

        public final l<String, i0> g() {
            return this.openUrl;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final e71.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.birthPlaceInputChanged.hashCode()) * 31) + this.openUrl.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onCitizenshipCheckBoxChanged.hashCode()) * 31) + this.onScrolledToCitizenshipCheckBox.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", birthPlaceInputChanged=" + this.birthPlaceInputChanged + ", openUrl=" + this.openUrl + ", onNext=" + this.onNext + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onCitizenshipCheckBoxChanged=" + this.onCitizenshipCheckBoxChanged + ", onScrolledToCitizenshipCheckBox=" + this.onScrolledToCitizenshipCheckBox + ')';
        }
    }

    public b(u04.a aVar, mx.c cVar, e eVar) {
        this.commonEndpoints = aVar;
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<PassportChildCardData> e(PassportChildApplicationGetChildData childData) {
        PassportChildCardData passportChildCardData;
        PassportChildCardData passportChildCardData2;
        PassportChildCardData passportChildCardData3;
        PassportChildCardData passportChildCardData4;
        PassportChildCardData passportChildCardData5;
        b0 firstName = childData.getFirstName();
        if (firstName != null) {
            passportChildCardData = new PassportChildCardData(this.labelProvider.c(w51.a.f210337g4), mx.b.b(c0.e(firstName), "firstName"), null, 4, null);
        } else {
            passportChildCardData = null;
        }
        b0 secondName = childData.getSecondName();
        if (secondName != null) {
            passportChildCardData2 = new PassportChildCardData(this.labelProvider.c(w51.a.f210468z4), mx.b.b(c0.e(secondName), "secondName"), null, 4, null);
        } else {
            passportChildCardData2 = null;
        }
        b0 otherName = childData.getOtherName();
        if (otherName != null) {
            passportChildCardData3 = new PassportChildCardData(this.labelProvider.c(w51.a.f210372l4), mx.b.b(c0.e(otherName), "otherName"), null, 4, null);
        } else {
            passportChildCardData3 = null;
        }
        b0 lastName = childData.getLastName();
        if (lastName != null) {
            passportChildCardData4 = new PassportChildCardData(this.labelProvider.c(w51.a.f210358j4), mx.b.b(c0.e(lastName), "lastName"), null, 4, null);
        } else {
            passportChildCardData4 = null;
        }
        PassportChildCardData passportChildCardData6 = new PassportChildCardData(this.labelProvider.c(w51.a.f210421s4), mx.b.b(c0.e(childData.getPesel()), "pesel"), j70.a.LETTER_BY_LETTER);
        PassportChildCardData passportChildCardData7 = new PassportChildCardData(this.labelProvider.c(w51.a.G3), mx.b.b(this.dateFormatter.d(childData.getBirthDate(), fz.c.DOTTED), "birthDate"), null, 4, null);
        b0 birthPlace = childData.getBirthPlace();
        if (birthPlace != null) {
            passportChildCardData5 = new PassportChildCardData(this.labelProvider.c(w51.a.H3), mx.b.b(c0.e(birthPlace), "placeOfBirth"), null, 4, null);
        } else {
            passportChildCardData5 = null;
        }
        return v.s(passportChildCardData, passportChildCardData2, passportChildCardData3, passportChildCardData4, passportChildCardData6, passportChildCardData7, passportChildCardData5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, boolean z15) {
        params.c().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        r30.b error;
        e71.b state = params.getState();
        if (t.c(state, e71.b.C1114b.f47936a)) {
            return c.a.b.f47944a;
        }
        if (!(state instanceof e71.b.Initialized)) {
            if (state instanceof e71.b.Error) {
                return new c.a.Error(((e71.b.Error) state).getErrorVMS());
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(w51.a.f210331f5), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(w51.a.f210324e5);
        e71.b.Initialized initialized = (e71.b.Initialized) state;
        List<PassportChildCardData> listE = e(initialized.getChildData());
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        for (PassportChildCardData passportChildCardData : listE) {
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(passportChildCardData.getTitle(), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(passportChildCardData.getValue(), null, null, 0, 0, passportChildCardData.getAccessibilityReadMode(), 30, null)), null, 4, null), null, null, null, 3839, null));
        }
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        Label labelC2 = this.labelProvider.c(w51.a.I3);
        String birthPlaceInput = initialized.getBirthPlaceInput();
        if (birthPlaceInput == null) {
            birthPlaceInput = "";
        }
        v50.c.Text text = new v50.c.Text("birthDateInput", labelC2, null, mx.b.b(birthPlaceInput, "birthPlaceInputValue"), initialized.getBirthPlaceValidationState(), null, null, params.a(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048420, null);
        if (initialized.getChildData().getBirthPlace() != null) {
            text = null;
        }
        c30.b.e eVar = new c30.b.e(null, null, null, this.labelProvider.c(w51.a.D3), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(w51.a.f210317d5), this.commonEndpoints.d(), LinkData.EnumC5775a.WEBSITE, false, params.g(), 17, null)), 55, null);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), d.a.f107773a, null, params.e(), 35, null);
        er.a<i0> aVarB = params.b();
        Label labelC3 = this.labelProvider.c(w51.a.O3);
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData("citizenshipCheckBox", ((e71.b.Initialized) params.getState()).f().d().booleanValue(), new l() { // from class: f71.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.h(params, ((Boolean) obj).booleanValue());
            }
        }, this.labelProvider.c(w51.a.f210318e), null, null, null, null, 240, null);
        r30.c cVar = r30.c.CONTENT_BOX;
        hz.b validationState = ((e71.b.Initialized) params.getState()).f().getValidationState();
        if (t.c(validationState, hz.b.d.f86848c) || t.c(validationState, hz.b.C2039b.f86846c)) {
            error = r30.b.a.f171263a;
        } else {
            if (!(validationState instanceof hz.b.Invalid)) {
                throw new p();
            }
            error = new r30.b.Error(null, this.labelProvider.c(w51.a.f210311d), 1, null);
        }
        return new c.a.Initialized(baseScaffoldData, labelC, cardListData, text, eVar, buttonData, aVarB, labelC3, new CheckBoxSingleData(checkBoxRowData, error, cVar, false, null, 24, null), ((e71.b.Initialized) params.getState()).getScrollToCitizenshipCheckBox(), params.f());
    }

    /* JADX INFO: renamed from: f71.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lf71/b$b;", "", "Lmx/a;", "title", "value", "Lj70/a;", "accessibilityReadMode", "<init>", "(Lmx/a;Lmx/a;Lj70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "c", "Lj70/a;", "()Lj70/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class PassportChildCardData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        public PassportChildCardData(Label label, Label label2, j70.a aVar) {
            this.title = label;
            this.value = label2;
            this.accessibilityReadMode = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final j70.a getAccessibilityReadMode() {
            return this.accessibilityReadMode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassportChildCardData)) {
                return false;
            }
            PassportChildCardData passportChildCardData = (PassportChildCardData) other;
            return t.c(this.title, passportChildCardData.title) && t.c(this.value, passportChildCardData.value) && this.accessibilityReadMode == passportChildCardData.accessibilityReadMode;
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.value.hashCode()) * 31) + this.accessibilityReadMode.hashCode();
        }

        public String toString() {
            return "PassportChildCardData(title=" + this.title + ", value=" + this.value + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
        }

        public /* synthetic */ PassportChildCardData(Label label, Label label2, j70.a aVar, int i15, k kVar) {
            this(label, label2, (i15 & 4) != 0 ? j70.a.LOWER_CASE : aVar);
        }
    }
}
