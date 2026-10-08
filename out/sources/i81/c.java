package i81;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import v40.InputDateTimeData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Li81/c;", "Ll00/e;", "Li81/c$a;", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: i81.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b>\u0010AR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\bC\u0010AR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010@\u001a\u0004\bD\u0010AR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010@\u001a\u0004\bB\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\b.\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\b2\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bI\u0010NR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010M\u001a\u0004\bE\u0010NR\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bG\u00103\u001a\u0004\b:\u00105R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b6\u0010QR\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bO\u0010=R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\bL\u00101¨\u0006R"}, d2 = {"Li81/c$a;", "", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lmx/a;", "title", "Lh30/a;", "nextButtonData", "", "namesFieldsVisible", "lastNameFieldVisible", "Lv50/c$g;", "firstNameInputData", "secondNameInputData", "otherNameInputData", "lastNameInputData", "Lv50/c$b;", "peselInputData", "birhtPlaceInputData", "Lv40/a;", "birthDateInputData", "Ls50/a$c;", "noNamesSwitchData", "noLastNameSwitchData", "citizenshipTitle", "Lw30/a;", "citizenshipCheckBox", "scrollToCitizenshipCheckBox", "onScrolledToCitizenshipCheckBox", "<init>", "(Li50/a;Ler/a;Lmx/a;Lh30/a;ZZLv50/c$g;Lv50/c$g;Lv50/c$g;Lv50/c$g;Lv50/c$b;Lv50/c$g;Lv40/a;Ls50/a$c;Ls50/a$c;Lmx/a;Lw30/a;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "m", "()Ler/a;", "c", "Lmx/a;", "s", "()Lmx/a;", "d", "Lh30/a;", "j", "()Lh30/a;", "e", "Z", "i", "()Z", "f", "g", "Lv50/c$g;", "()Lv50/c$g;", "h", "r", "o", "k", "Lv50/c$b;", "p", "()Lv50/c$b;", "l", "Lv40/a;", "()Lv40/a;", "n", "Ls50/a$c;", "()Ls50/a$c;", "q", "Lw30/a;", "()Lw30/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f89971t;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean namesFieldsVisible;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean lastNameFieldVisible;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text firstNameInputData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text secondNameInputData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text otherNameInputData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text lastNameInputData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Number peselInputData;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text birhtPlaceInputData;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputDateTimeData birthDateInputData;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final s50.a.c noNamesSwitchData;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final s50.a.c noLastNameSwitchData;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label citizenshipTitle;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckBoxSingleData citizenshipCheckBox;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToCitizenshipCheckBox;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onScrolledToCitizenshipCheckBox;

        static {
            int i15 = CheckBoxSingleData.f210090f | InputDateTimeData.f203769m;
            int i16 = v50.c.Text.P;
            f89971t = i15 | i16 | v50.c.Number.P | i16 | i16 | i16 | i16 | BaseScaffoldData.f89350g;
        }

        public Data(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, Label label, ButtonData buttonData, boolean z15, boolean z16, v50.c.Text text, v50.c.Text text2, v50.c.Text text3, v50.c.Text text4, v50.c.Number number, v50.c.Text text5, InputDateTimeData inputDateTimeData, s50.a.c cVar, s50.a.c cVar2, Label label2, CheckBoxSingleData checkBoxSingleData, boolean z17, er.a<oq.i0> aVar2) {
            this.baseScaffoldData = baseScaffoldData;
            this.onBackClick = aVar;
            this.title = label;
            this.nextButtonData = buttonData;
            this.namesFieldsVisible = z15;
            this.lastNameFieldVisible = z16;
            this.firstNameInputData = text;
            this.secondNameInputData = text2;
            this.otherNameInputData = text3;
            this.lastNameInputData = text4;
            this.peselInputData = number;
            this.birhtPlaceInputData = text5;
            this.birthDateInputData = inputDateTimeData;
            this.noNamesSwitchData = cVar;
            this.noLastNameSwitchData = cVar2;
            this.citizenshipTitle = label2;
            this.citizenshipCheckBox = checkBoxSingleData;
            this.scrollToCitizenshipCheckBox = z17;
            this.onScrolledToCitizenshipCheckBox = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final v50.c.Text getBirhtPlaceInputData() {
            return this.birhtPlaceInputData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InputDateTimeData getBirthDateInputData() {
            return this.birthDateInputData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final CheckBoxSingleData getCitizenshipCheckBox() {
            return this.citizenshipCheckBox;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getCitizenshipTitle() {
            return this.citizenshipTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.onBackClick, data.onBackClick) && fr.t.c(this.title, data.title) && fr.t.c(this.nextButtonData, data.nextButtonData) && this.namesFieldsVisible == data.namesFieldsVisible && this.lastNameFieldVisible == data.lastNameFieldVisible && fr.t.c(this.firstNameInputData, data.firstNameInputData) && fr.t.c(this.secondNameInputData, data.secondNameInputData) && fr.t.c(this.otherNameInputData, data.otherNameInputData) && fr.t.c(this.lastNameInputData, data.lastNameInputData) && fr.t.c(this.peselInputData, data.peselInputData) && fr.t.c(this.birhtPlaceInputData, data.birhtPlaceInputData) && fr.t.c(this.birthDateInputData, data.birthDateInputData) && fr.t.c(this.noNamesSwitchData, data.noNamesSwitchData) && fr.t.c(this.noLastNameSwitchData, data.noLastNameSwitchData) && fr.t.c(this.citizenshipTitle, data.citizenshipTitle) && fr.t.c(this.citizenshipCheckBox, data.citizenshipCheckBox) && this.scrollToCitizenshipCheckBox == data.scrollToCitizenshipCheckBox && fr.t.c(this.onScrolledToCitizenshipCheckBox, data.onScrolledToCitizenshipCheckBox);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final v50.c.Text getFirstNameInputData() {
            return this.firstNameInputData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getLastNameFieldVisible() {
            return this.lastNameFieldVisible;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final v50.c.Text getLastNameInputData() {
            return this.lastNameInputData;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.title.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + Boolean.hashCode(this.namesFieldsVisible)) * 31) + Boolean.hashCode(this.lastNameFieldVisible)) * 31) + this.firstNameInputData.hashCode()) * 31) + this.secondNameInputData.hashCode()) * 31) + this.otherNameInputData.hashCode()) * 31) + this.lastNameInputData.hashCode()) * 31) + this.peselInputData.hashCode()) * 31) + this.birhtPlaceInputData.hashCode()) * 31) + this.birthDateInputData.hashCode()) * 31) + this.noNamesSwitchData.hashCode()) * 31) + this.noLastNameSwitchData.hashCode()) * 31) + this.citizenshipTitle.hashCode()) * 31) + this.citizenshipCheckBox.hashCode()) * 31) + Boolean.hashCode(this.scrollToCitizenshipCheckBox)) * 31) + this.onScrolledToCitizenshipCheckBox.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getNamesFieldsVisible() {
            return this.namesFieldsVisible;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final s50.a.c getNoLastNameSwitchData() {
            return this.noLastNameSwitchData;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final s50.a.c getNoNamesSwitchData() {
            return this.noNamesSwitchData;
        }

        public final er.a<oq.i0> m() {
            return this.onBackClick;
        }

        public final er.a<oq.i0> n() {
            return this.onScrolledToCitizenshipCheckBox;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final v50.c.Text getOtherNameInputData() {
            return this.otherNameInputData;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final v50.c.Number getPeselInputData() {
            return this.peselInputData;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getScrollToCitizenshipCheckBox() {
            return this.scrollToCitizenshipCheckBox;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final v50.c.Text getSecondNameInputData() {
            return this.secondNameInputData;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", title=" + this.title + ", nextButtonData=" + this.nextButtonData + ", namesFieldsVisible=" + this.namesFieldsVisible + ", lastNameFieldVisible=" + this.lastNameFieldVisible + ", firstNameInputData=" + this.firstNameInputData + ", secondNameInputData=" + this.secondNameInputData + ", otherNameInputData=" + this.otherNameInputData + ", lastNameInputData=" + this.lastNameInputData + ", peselInputData=" + this.peselInputData + ", birhtPlaceInputData=" + this.birhtPlaceInputData + ", birthDateInputData=" + this.birthDateInputData + ", noNamesSwitchData=" + this.noNamesSwitchData + ", noLastNameSwitchData=" + this.noLastNameSwitchData + ", citizenshipTitle=" + this.citizenshipTitle + ", citizenshipCheckBox=" + this.citizenshipCheckBox + ", scrollToCitizenshipCheckBox=" + this.scrollToCitizenshipCheckBox + ", onScrolledToCitizenshipCheckBox=" + this.onScrolledToCitizenshipCheckBox + ')';
        }
    }
}
