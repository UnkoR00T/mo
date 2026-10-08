package np2;

import al0.PassportChildApplicationChildData;
import er.l;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mp2.d;
import mp2.e;
import mx.Label;
import mx.b;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0017B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnp2/a;", "Lxw/f;", "Lnp2/a$a;", "Lmp2/e$a;", "Lu04/a;", "commonEndpoints", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lu04/a;Lmx/c;Lez/e;)V", "Lal0/l0;", "childData", "", "Lnp2/a$b;", "c", "(Lal0/l0;)Ljava/util/List;", "params", "e", "(Lnp2/a$a;)Lmp2/e$a;", "a", "Lu04/a;", "b", "Lmx/c;", "Lez/e;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: np2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\u001d\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b \u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\"\u0010%¨\u0006&"}, d2 = {"Lnp2/a$a;", "", "Lmp2/d;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "birthPlaceInputChanged", "openUrl", "Lkotlin/Function0;", "onNext", "onBack", "onClose", "onCloseWithoutDialog", "<init>", "(Lmp2/d;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmp2/d;", "g", "()Lmp2/d;", "b", "Ler/l;", "()Ler/l;", "c", "f", "d", "Ler/a;", "e", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

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
        private final er.a<i0> onCloseWithoutDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = dVar;
            this.birthPlaceInputChanged = lVar;
            this.openUrl = lVar2;
            this.onNext = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
            this.onCloseWithoutDialog = aVar4;
        }

        public final l<String, i0> a() {
            return this.birthPlaceInputChanged;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final er.a<i0> d() {
            return this.onCloseWithoutDialog;
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
            return t.c(this.state, params.state) && t.c(this.birthPlaceInputChanged, params.birthPlaceInputChanged) && t.c(this.openUrl, params.openUrl) && t.c(this.onNext, params.onNext) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onCloseWithoutDialog, params.onCloseWithoutDialog);
        }

        public final l<String, i0> f() {
            return this.openUrl;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.birthPlaceInputChanged.hashCode()) * 31) + this.openUrl.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onCloseWithoutDialog.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", birthPlaceInputChanged=" + this.birthPlaceInputChanged + ", openUrl=" + this.openUrl + ", onNext=" + this.onNext + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onCloseWithoutDialog=" + this.onCloseWithoutDialog + ')';
        }
    }

    public a(u04.a aVar, c cVar, ez.e eVar) {
        this.commonEndpoints = aVar;
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<PassportChildCardData> c(PassportChildApplicationChildData childData) {
        PassportChildCardData passportChildCardData;
        PassportChildCardData passportChildCardData2;
        PassportChildCardData passportChildCardData3;
        PassportChildCardData passportChildCardData4 = new PassportChildCardData(this.labelProvider.c(bp2.a.f21088q), b.b(c0.e(childData.getFirstName()), "firstName"), null, 4, null);
        b0 secondName = childData.getSecondName();
        if (secondName != null) {
            passportChildCardData = new PassportChildCardData(this.labelProvider.c(bp2.a.B), b.b(c0.e(secondName), "secondName"), null, 4, null);
        } else {
            passportChildCardData = null;
        }
        b0 anotherNames = childData.getAnotherNames();
        if (anotherNames != null) {
            passportChildCardData2 = new PassportChildCardData(this.labelProvider.c(bp2.a.f21098v), b.b(c0.e(anotherNames), "anotherNames"), null, 4, null);
        } else {
            passportChildCardData2 = null;
        }
        PassportChildCardData passportChildCardData5 = new PassportChildCardData(this.labelProvider.c(bp2.a.f21094t), b.b(c0.e(childData.getSurname()), "surname"), null, 4, null);
        PassportChildCardData passportChildCardData6 = passportChildCardData2;
        PassportChildCardData passportChildCardData7 = new PassportChildCardData(this.labelProvider.c(bp2.a.f21104y), b.b(c0.e(childData.getPesel()), "pesel"), j70.a.LETTER_BY_LETTER);
        PassportChildCardData passportChildCardData8 = new PassportChildCardData(this.labelProvider.c(bp2.a.f21054b), b.b(this.dateFormatter.d(childData.getDateOfBirth(), fz.c.DOTTED), "birthDate"), null, 4, null);
        b0 placeOfBirth = childData.getPlaceOfBirth();
        if (placeOfBirth != null) {
            passportChildCardData3 = new PassportChildCardData(this.labelProvider.c(bp2.a.f21057c), b.b(c0.e(placeOfBirth), "placeOfBirth"), null, 4, null);
        } else {
            passportChildCardData3 = null;
        }
        return v.s(passportChildCardData4, passportChildCardData, passportChildCardData6, passportChildCardData5, passportChildCardData7, passportChildCardData8, passportChildCardData3);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (t.c(state, d.c.f127498a)) {
            return e.a.c.f127507a;
        }
        if (!(state instanceof d.Initialized)) {
            if (!(state instanceof d.a)) {
                if (state instanceof d.Error) {
                    return new e.a.Error(((d.Error) state).getErrorVMS());
                }
                throw new p();
            }
            return new e.a.AgreementExists(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.d()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.d.f164690d, this.labelProvider.c(bp2.a.C0), this.labelProvider.c(bp2.a.B0), null, i0.f148189a, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21072i), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null), false, 72, null), params.b());
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(bp2.a.f21055b0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(bp2.a.f21052a0);
        d.Initialized initialized = (d.Initialized) state;
        List<PassportChildCardData> listC = c(initialized.getChildData());
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        for (PassportChildCardData passportChildCardData : listC) {
            arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(passportChildCardData.getTitle(), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(passportChildCardData.getValue(), null, null, 0, 0, passportChildCardData.getAccessibilityReadMode(), 30, null)), null, 4, null), null, null, null, 3839, null));
        }
        CardListData cardListData = new CardListData(arrayList, null, false, null, null, 30, null);
        Label labelC2 = this.labelProvider.c(bp2.a.f21060d);
        String birthPlaceInput = initialized.getBirthPlaceInput();
        if (birthPlaceInput == null) {
            birthPlaceInput = "";
        }
        v50.c.Text text = new v50.c.Text("birthDateInput", labelC2, null, b.b(birthPlaceInput, "birthPlaceInputValue"), initialized.getBirthPlaceValidationState(), null, null, params.a(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048420, null);
        if (initialized.getChildData().getPlaceOfBirth() != null) {
            text = null;
        }
        return new e.a.Initialized(baseScaffoldData, labelC, cardListData, text, new c30.b.e(null, null, null, this.labelProvider.c(bp2.a.Z), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(bp2.a.Y), this.commonEndpoints.d(), LinkData.EnumC5775a.WEBSITE, false, params.f(), 17, null)), 55, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21096u), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null), params.b());
    }

    /* JADX INFO: renamed from: np2.a$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnp2/a$b;", "", "Lmx/a;", "title", "value", "Lj70/a;", "accessibilityReadMode", "<init>", "(Lmx/a;Lmx/a;Lj70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "c", "Lj70/a;", "()Lj70/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
