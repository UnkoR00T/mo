package fa1;

import er.l;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j40.DropDownButtonData;
import j40.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0014\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lfa1/e;", "Lxw/f;", "Lfa1/e$c;", "Lea1/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lcl0/d;", "documentType", "Lmx/a;", "i", "(Lcl0/d;)Lmx/a;", "params", "l", "(Lfa1/e$c;)Lea1/d$a;", "Lhz/b;", "Lj40/m;", "u", "(Lhz/b;)Lj40/m;", "a", "Lmx/c;", "b", "c", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, ea1.d.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60415c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: fa1.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R%\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b'\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001c\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b \u0010*¨\u0006+"}, d2 = {"Lfa1/e$c;", "", "Lea1/c;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "setIdCardSeriesAndNumberStateValue", "setIdCardNameFieldValue", "setBirthPlaceStateText", "Lcl0/d;", "toDocumentTypePicker", "openWebsiteAction", "Lkotlin/Function0;", "toNextScreenAction", "onBackAction", "onCloseAction", "<init>", "(Lea1/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lea1/c;", "g", "()Lea1/c;", "b", "Ler/l;", "f", "()Ler/l;", "c", "e", "d", "h", "Ler/a;", "i", "()Ler/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ea1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> setIdCardSeriesAndNumberStateValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> setIdCardNameFieldValue;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> setBirthPlaceStateText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<cl0.d, i0> toDocumentTypePicker;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openWebsiteAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toNextScreenAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ea1.c cVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, l<? super cl0.d, i0> lVar4, l<? super String, i0> lVar5, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.setIdCardSeriesAndNumberStateValue = lVar;
            this.setIdCardNameFieldValue = lVar2;
            this.setBirthPlaceStateText = lVar3;
            this.toDocumentTypePicker = lVar4;
            this.openWebsiteAction = lVar5;
            this.toNextScreenAction = aVar;
            this.onBackAction = aVar2;
            this.onCloseAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final l<String, i0> c() {
            return this.openWebsiteAction;
        }

        public final l<String, i0> d() {
            return this.setBirthPlaceStateText;
        }

        public final l<String, i0> e() {
            return this.setIdCardNameFieldValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.setIdCardSeriesAndNumberStateValue, params.setIdCardSeriesAndNumberStateValue) && t.c(this.setIdCardNameFieldValue, params.setIdCardNameFieldValue) && t.c(this.setBirthPlaceStateText, params.setBirthPlaceStateText) && t.c(this.toDocumentTypePicker, params.toDocumentTypePicker) && t.c(this.openWebsiteAction, params.openWebsiteAction) && t.c(this.toNextScreenAction, params.toNextScreenAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public final l<String, i0> f() {
            return this.setIdCardSeriesAndNumberStateValue;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ea1.c getState() {
            return this.state;
        }

        public final l<cl0.d, i0> h() {
            return this.toDocumentTypePicker;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.setIdCardSeriesAndNumberStateValue.hashCode()) * 31) + this.setIdCardNameFieldValue.hashCode()) * 31) + this.setBirthPlaceStateText.hashCode()) * 31) + this.toDocumentTypePicker.hashCode()) * 31) + this.openWebsiteAction.hashCode()) * 31) + this.toNextScreenAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.toNextScreenAction;
        }

        public String toString() {
            return "Params(state=" + this.state + ", setIdCardSeriesAndNumberStateValue=" + this.setIdCardSeriesAndNumberStateValue + ", setIdCardNameFieldValue=" + this.setIdCardNameFieldValue + ", setBirthPlaceStateText=" + this.setBirthPlaceStateText + ", toDocumentTypePicker=" + this.toDocumentTypePicker + ", openWebsiteAction=" + this.openWebsiteAction + ", toNextScreenAction=" + this.toNextScreenAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60430a;

        static {
            int[] iArr = new int[cl0.d.values().length];
            try {
                iArr[cl0.d.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cl0.d.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cl0.d.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60430a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label i(cl0.d documentType) {
        int i15 = d.f60430a[documentType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.f210351i4);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210393o4);
        }
        if (i15 == 3) {
            return this.labelProvider.c(w51.a.f210359j5);
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, DropDownButtonData dropDownButtonData) {
        cl0.d dVar;
        l<cl0.d, i0> lVarH = params.h();
        Integer initialPick = ((ea1.c.Initialized) params.getState()).getDocumentTypeDropDownState().getInitialPick();
        if (initialPick != null) {
            dVar = (cl0.d) v.o0(cl0.d.e(), initialPick.intValue());
        } else {
            dVar = null;
        }
        lVarH.b(dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.f().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, String str) {
        params.d().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, String str) {
        params.e().b(str);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ea1.d.a b(final Params params) {
        ChildPassportApplicationCards childPassportApplicationCards;
        ChildPassportApplicationCards childPassportApplicationCards2;
        ChildPassportApplicationCards childPassportApplicationCards3;
        ChildPassportApplicationCards childPassportApplicationCards4;
        ea1.c state = params.getState();
        if (state instanceof ea1.c.a.b) {
            return new ea1.d.a.Initial(params.a());
        }
        if (state instanceof ea1.c.a.Error) {
            return new ea1.d.a.Error(params.a(), ((ea1.c.a.Error) params.getState()).getErrorVMS());
        }
        if (!(state instanceof ea1.c.Initialized)) {
            throw new p();
        }
        ChildPassportApplicationCards childPassportApplicationCards5 = new ChildPassportApplicationCards("firstNameCard", this.labelProvider.c(w51.a.f210337g4), mx.b.b(c0.e(((ea1.c.Initialized) params.getState()).getParentData().getFirstName()), "firstNameTitle"), null, 8, null);
        b0 secondName = ((ea1.c.Initialized) params.getState()).getParentData().getSecondName();
        if (secondName != null) {
            childPassportApplicationCards = new ChildPassportApplicationCards("secondNameCard", this.labelProvider.c(w51.a.f210468z4), mx.b.b(c0.e(secondName), "secondNameLabel"), null, 8, null);
        } else {
            childPassportApplicationCards = null;
        }
        ChildPassportApplicationCards childPassportApplicationCards6 = new ChildPassportApplicationCards("lastNameCard", this.labelProvider.c(w51.a.f210358j4), mx.b.b(c0.e(((ea1.c.Initialized) params.getState()).getParentData().getSurname()), "surnameTitle"), null, 8, null);
        ChildPassportApplicationCards childPassportApplicationCards7 = new ChildPassportApplicationCards("peselNumberCard", this.labelProvider.c(w51.a.f210421s4), mx.b.b(c0.e(((ea1.c.Initialized) params.getState()).getParentData().getPesel()), "peselTitle"), j70.a.LETTER_BY_LETTER);
        b0 placeOfBirth = ((ea1.c.Initialized) params.getState()).getParentData().getPlaceOfBirth();
        if (placeOfBirth != null) {
            childPassportApplicationCards2 = new ChildPassportApplicationCards("placeOfBirthCard", this.labelProvider.c(w51.a.H3), mx.b.b(c0.e(placeOfBirth), "placeOfBirthTitle"), null, 8, null);
        } else {
            childPassportApplicationCards2 = null;
        }
        if (((ea1.c.Initialized) params.getState()).getParentData().getIdCardSeriesAndNumber() != null) {
            childPassportApplicationCards3 = new ChildPassportApplicationCards("documentTypeCard", this.labelProvider.c(w51.a.f210408q5), this.labelProvider.c(w51.a.f210351i4).n("documentTypeTitle"), null, 8, null);
        } else {
            childPassportApplicationCards3 = null;
        }
        b0 idCardSeriesAndNumber = ((ea1.c.Initialized) params.getState()).getParentData().getIdCardSeriesAndNumber();
        if (idCardSeriesAndNumber != null) {
            childPassportApplicationCards4 = new ChildPassportApplicationCards("idCardSeriesAndNumberCard", this.labelProvider.c(w51.a.f210401p5), mx.b.b(c0.e(idCardSeriesAndNumber), "idCardSeriesAndNumberTitle"), null, 8, null);
        } else {
            childPassportApplicationCards4 = null;
        }
        List listS = v.s(childPassportApplicationCards5, childPassportApplicationCards, childPassportApplicationCards6, childPassportApplicationCards7, childPassportApplicationCards2, childPassportApplicationCards3, childPassportApplicationCards4);
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.Z4), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(w51.a.f210415r5);
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        v50.c.Text text = ((ea1.c.Initialized) params.getState()).getParentData().getIdCardSeriesAndNumber() == null ? new v50.c.Text("noDocumentNumberField", this.labelProvider.c(w51.a.f210401p5), null, mx.b.b(((ea1.c.Initialized) params.getState()).getIdCardSeriesAndNumberFieldState().getValue(), "noDocumentNumberText"), ((ea1.c.Initialized) params.getState()).getIdCardSeriesAndNumberFieldState().getValidationState(), null, null, new l() { // from class: fa1.a
            @Override // er.l
            public final Object b(Object obj) {
                return e.q(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048420, null) : null;
        v50.c.Text text2 = ((ea1.c.Initialized) params.getState()).getParentData().getPlaceOfBirth() == null ? new v50.c.Text("noBirthPlaceField", this.labelProvider.c(w51.a.I3), null, mx.b.b(((ea1.c.Initialized) params.getState()).getBirthPlaceFieldState().getValue(), "noBirthPlaceText"), ((ea1.c.Initialized) params.getState()).getBirthPlaceFieldState().getValidationState(), null, null, new l() { // from class: fa1.b
            @Override // er.l
            public final Object b(Object obj) {
                return e.r(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048420, null) : null;
        v50.c.Text text3 = new v50.c.Text("identityCardNameField", this.labelProvider.c(w51.a.f210436u5), null, mx.b.b(((ea1.c.Initialized) params.getState()).getIdCardNameFieldState().getValue(), "identityCardNameText"), ((ea1.c.Initialized) params.getState()).getIdCardNameFieldState().getValidationState(), null, null, new l() { // from class: fa1.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.s(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048420, null);
        Integer initialPick = ((ea1.c.Initialized) params.getState()).getDocumentTypeDropDownState().getInitialPick();
        v50.c.Text text4 = (initialPick != null && initialPick.intValue() == cl0.d.OTHER.ordinal()) ? text3 : null;
        Label labelC2 = this.labelProvider.c(w51.a.f210408q5);
        wq.a<cl0.d> aVarE = cl0.d.e();
        ArrayList arrayList2 = new ArrayList(v.y(aVarE, 10));
        Iterator<cl0.d> it4 = aVarE.iterator();
        while (it4.hasNext()) {
            arrayList2.add(i(it4.next()));
        }
        return new ea1.d.a.Initialized(aVarA, baseScaffoldData, labelC, cardListData, ((ea1.c.Initialized) params.getState()).getParentData().getIdCardSeriesAndNumber() == null ? new DropDownButtonData(labelC2, arrayList2, ((ea1.c.Initialized) params.getState()).getDocumentTypeDropDownState().getInitialPick(), u(((ea1.c.Initialized) params.getState()).getDocumentTypeDropDownState().getValidationState()), this.labelProvider.c(w51.a.M3), false, null, new l() { // from class: fa1.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.m(params, (DropDownButtonData) obj);
            }
        }, 96, null) : null, text, text4, text2, new c30.b.e("bottomAlert", null, null, this.labelProvider.c(w51.a.D3), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(w51.a.f210373l5), "https://epuap.gov.pl/wps/portal/strefa-klienta/katalog-spraw/sprawy-./ewidencja-ludnosci/wnioskowanie-o-sprawdzenie-danych-zawartych-w-rejestrze-pesel-i-rejestrach-mieszkancow-i", LinkData.EnumC5775a.WEBSITE, false, params.c(), 17, null)), 54, null), new ButtonData("nextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), k30.d.a.f107773a, null, params.i(), 34, null));
    }

    public final m u(hz.b bVar) {
        if (t.c(bVar, hz.b.C2039b.f86846c) || t.c(bVar, hz.b.d.f86848c)) {
            return new m.Enabled(null, 1, null);
        }
        if (bVar instanceof hz.b.Invalid) {
            return new m.Error(this.labelProvider.c(w51.a.N3));
        }
        throw new p();
    }

    /* JADX INFO: renamed from: fa1.e$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lfa1/e$a;", "", "", "testTag", "Lmx/a;", "infoLabel", "titleLabel", "Lj70/a;", "accessibilityReadMode", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lj70/a;)V", "Ln50/g;", "a", "()Ln50/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestTag", "b", "Lmx/a;", "getInfoLabel", "()Lmx/a;", "c", "getTitleLabel", "d", "Lj70/a;", "getAccessibilityReadMode", "()Lj70/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildPassportApplicationCards {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label infoLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label titleLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        public ChildPassportApplicationCards(String str, Label label, Label label2, j70.a aVar) {
            this.testTag = str;
            this.infoLabel = label;
            this.titleLabel = label2;
            this.accessibilityReadMode = aVar;
        }

        public final DefaultSingleCardData a() {
            return new DefaultSingleCardData(this.testTag, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.infoLabel, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(this.titleLabel, null, null, 0, 0, this.accessibilityReadMode, 30, null)), null, 4, null), null, null, null, 3838, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildPassportApplicationCards)) {
                return false;
            }
            ChildPassportApplicationCards childPassportApplicationCards = (ChildPassportApplicationCards) other;
            return t.c(this.testTag, childPassportApplicationCards.testTag) && t.c(this.infoLabel, childPassportApplicationCards.infoLabel) && t.c(this.titleLabel, childPassportApplicationCards.titleLabel) && this.accessibilityReadMode == childPassportApplicationCards.accessibilityReadMode;
        }

        public int hashCode() {
            return (((((this.testTag.hashCode() * 31) + this.infoLabel.hashCode()) * 31) + this.titleLabel.hashCode()) * 31) + this.accessibilityReadMode.hashCode();
        }

        public String toString() {
            return "ChildPassportApplicationCards(testTag=" + this.testTag + ", infoLabel=" + this.infoLabel + ", titleLabel=" + this.titleLabel + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
        }

        public /* synthetic */ ChildPassportApplicationCards(String str, Label label, Label label2, j70.a aVar, int i15, k kVar) {
            this(str, label, label2, (i15 & 8) != 0 ? j70.a.LOWER_CASE : aVar);
        }
    }
}
