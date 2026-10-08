package m41;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import k41.ChildDataWithValidation;
import k41.State;
import mx.Label;
import n41.ChildDataScreenModel;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\n*\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lm41/f;", "Lxw/f;", "Lm41/f$b;", "Lk41/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lmx/a;", "", "index", "l", "(Lmx/a;I)Lmx/a;", "Liy/b0;", "x", "(Liy/b0;)Lmx/a;", "params", "m", "(Lm41/f$b;)Lk41/d$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "c", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, k41.d.Data> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123733d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: m41.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\"\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b\u001e\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b(\u0010/R)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b)\u0010/R)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b*\u0010/R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b&\u0010-¨\u00060"}, d2 = {"Lm41/f$b;", "", "Lk41/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "onClose", "onBack", "onAddChildSection", "Lkotlin/Function1;", "", "onRemoveChildSection", "Lkotlin/Function2;", "Liy/b0;", "onChangeName", "onChangeSecondName", "onChangeSurname", "onChangeBirthDate", "<init>", "(Lk41/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/p;Ler/p;Ler/p;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk41/c;", "j", "()Lk41/c;", "b", "Ler/a;", "h", "()Ler/a;", "c", "g", "d", "e", "f", "Ler/l;", "i", "()Ler/l;", "Ler/p;", "()Ler/p;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddChildSection;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> onRemoveChildSection;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Integer, b0, i0> onChangeName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Integer, b0, i0> onChangeSecondName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<Integer, b0, i0> onChangeSurname;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> onChangeBirthDate;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super Integer, i0> lVar, p<? super Integer, ? super b0, i0> pVar, p<? super Integer, ? super b0, i0> pVar2, p<? super Integer, ? super b0, i0> pVar3, l<? super Integer, i0> lVar2) {
            this.state = state;
            this.onNextButtonClick = aVar;
            this.onClose = aVar2;
            this.onBack = aVar3;
            this.onAddChildSection = aVar4;
            this.onRemoveChildSection = lVar;
            this.onChangeName = pVar;
            this.onChangeSecondName = pVar2;
            this.onChangeSurname = pVar3;
            this.onChangeBirthDate = lVar2;
        }

        public final er.a<i0> a() {
            return this.onAddChildSection;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final l<Integer, i0> c() {
            return this.onChangeBirthDate;
        }

        public final p<Integer, b0, i0> d() {
            return this.onChangeName;
        }

        public final p<Integer, b0, i0> e() {
            return this.onChangeSecondName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack) && t.c(this.onAddChildSection, params.onAddChildSection) && t.c(this.onRemoveChildSection, params.onRemoveChildSection) && t.c(this.onChangeName, params.onChangeName) && t.c(this.onChangeSecondName, params.onChangeSecondName) && t.c(this.onChangeSurname, params.onChangeSurname) && t.c(this.onChangeBirthDate, params.onChangeBirthDate);
        }

        public final p<Integer, b0, i0> f() {
            return this.onChangeSurname;
        }

        public final er.a<i0> g() {
            return this.onClose;
        }

        public final er.a<i0> h() {
            return this.onNextButtonClick;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onAddChildSection.hashCode()) * 31) + this.onRemoveChildSection.hashCode()) * 31) + this.onChangeName.hashCode()) * 31) + this.onChangeSecondName.hashCode()) * 31) + this.onChangeSurname.hashCode()) * 31) + this.onChangeBirthDate.hashCode();
        }

        public final l<Integer, i0> i() {
            return this.onRemoveChildSection;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ", onAddChildSection=" + this.onAddChildSection + ", onRemoveChildSection=" + this.onRemoveChildSection + ", onChangeName=" + this.onChangeName + ", onChangeSecondName=" + this.onChangeSecondName + ", onChangeSurname=" + this.onChangeSurname + ", onChangeBirthDate=" + this.onChangeBirthDate + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f123746a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-405461236);
            if (p076m2.t.k()) {
                p076m2.t.o(-405461236, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.childdata.mapper.ChildDataScreenMapper.invoke.<anonymous>.<anonymous>.<anonymous> (ChildDataScreenMapper.kt:175)");
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
        public static final d f123747a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1016260688);
            if (p076m2.t.k()) {
                p076m2.t.o(1016260688, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.screens.wizardsteps.childdata.mapper.ChildDataScreenMapper.invoke.<anonymous>.<anonymous>.<anonymous> (ChildDataScreenMapper.kt:184)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public f(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final Label l(Label label, int i15) {
        return new Label(this.labelProvider.e(j31.a.f99118a, Integer.valueOf(i15 + 1)).getText() + ", " + label.getText(), label.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, int i15) {
        params.i().b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, int i15, String str) {
        params.d().B(Integer.valueOf(i15), c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, int i15, String str) {
        params.e().B(Integer.valueOf(i15), c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, int i15, String str) {
        params.f().B(Integer.valueOf(i15), c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, int i15) {
        params.c().b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    private final Label x(b0 b0Var) {
        String strE;
        if (b0Var == null || (strE = c0.e(b0Var)) == null) {
            strE = "";
        }
        return new Label(strE, "");
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public k41.d.Data b(final Params params) {
        mx.c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(j31.a.f99136d2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.g(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        ButtonData buttonData = new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99235x2), null, 2, null), k30.d.a.f107773a, null, params.h(), 34, null);
        c30.b.c cVar2 = new c30.b.c("InfoAlert", null, null, cVar.c(j31.a.f99173l), null, null, null, 118, null);
        List listC = v.c();
        List<ChildDataWithValidation> listB = params.getState().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        final int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            ChildDataWithValidation childDataWithValidation = (ChildDataWithValidation) obj;
            ButtonTextData buttonTextData = i15 != 0 ? new ButtonTextData("RemoveChildSectionButton" + i15, cVar.c(j31.a.f99191o2), null, new Label(l(cVar.c(j31.a.f99191o2), i15).getText() + " - " + cVar.c(j31.a.f99136d2).getText(), "RemoveChildSectionButton" + i15), new er.a() { // from class: m41.a
                @Override // er.a
                public final Object a() {
                    return f.q(params, i15);
                }
            }, 4, null) : null;
            Label labelF = Label.f(cVar.c(j31.a.f99178m), String.valueOf(i15), null, 2, null);
            v50.c.Text text = new v50.c.Text("NameInput" + i15, cVar.c(j31.a.f99221u2), null, x(childDataWithValidation.getChildData().getName()), childDataWithValidation.getValidations().getName(), null, null, new l() { // from class: m41.b
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.r(params, i15, (String) obj2);
                }
            }, null, false, 0, null, false, null, false, null, l(cVar.c(j31.a.f99221u2), i15), null, null, null, 982884, null);
            v50.c.Text text2 = new v50.c.Text("SecondNameInput" + i15, cVar.c(j31.a.U2), null, x(childDataWithValidation.getChildData().getSecondName()), childDataWithValidation.getValidations().getSecondName(), null, null, new l() { // from class: m41.c
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.s(params, i15, (String) obj2);
                }
            }, null, false, 0, null, false, null, false, null, l(cVar.c(j31.a.U2), i15), null, null, null, 982884, null);
            v50.c.Text text3 = new v50.c.Text("SurnameInput" + i15, cVar.c(j31.a.f99231w2), null, x(childDataWithValidation.getChildData().getSurname()), childDataWithValidation.getValidations().getSurname(), null, null, new l() { // from class: m41.d
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.u(params, i15, (String) obj2);
                }
            }, null, false, 0, null, false, null, false, null, l(cVar.c(j31.a.f99231w2), i15), null, null, null, 982884, null);
            String str = "BirthDateInput" + i15;
            Label labelC = cVar.c(j31.a.V1);
            fz.b.LocalDate birthDate = childDataWithValidation.getChildData().getBirthDate();
            arrayList.add(new ChildDataScreenModel.InterfaceC3259a.Expanded(buttonTextData, labelF, text, text2, text3, new InputDateTimeData(str, labelC, birthDate != null ? this.dateFormatter.d(birthDate, fz.c.DOTTED) : null, InputDateTimeData.b.C5303a.f203783c, childDataWithValidation.getValidations().getBirthDate(), l(cVar.c(j31.a.V1), i15), null, null, false, null, new er.a() { // from class: m41.e
                @Override // er.a
                public final Object a() {
                    return f.v(params, i15);
                }
            }, 960, null), new DefaultSingleCardData("NationalityCard" + i15, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(j31.a.f99156h2), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(childDataWithValidation.getChildData().getNationality()), "nationality"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)));
            i15 = i16;
        }
        listC.addAll(arrayList);
        if (params.getState().b().size() < 5) {
            listC.add(new ChildDataScreenModel.InterfaceC3259a.Folded(new DefaultSingleCardData("AddChildCard", params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(cVar.c(j31.a.f99168k), null, d.f123747a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, c.f123746a, null, null, 26, null), 3, null), null, null, 3324, null)));
        }
        return new k41.d.Data(baseScaffoldData, buttonData, params.b(), cVar2, new ChildDataScreenModel(v.a(listC)));
    }
}
