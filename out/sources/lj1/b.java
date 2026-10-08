package lj1;

import d60.ScrollControllerData;
import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import kj1.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.j0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zi1.OccupancyInfoCardCustomContent;
import zi1.OccupancyRadioCardCustomContent;
import zp0.AvailableDefenceTrainings;
import zp0.BEDefenceTrainingType;
import zp0.DefenceTraining;
import zp0.DefenceTrainingDay;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020\u001d*\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u001d*\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020'2\b\b\u0001\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Llj1/b;", "Lxw/f;", "Llj1/b$a;", "Lkj1/d$a;", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "<init>", "(Lez/e;Lmx/c;)V", "params", "Li50/a;", "e", "(Llj1/b$a;)Li50/a;", "Lh30/a;", "f", "(Llj1/b$a;)Lh30/a;", "", "index", "Lzp0/v;", "defenceTraining", "Lkotlin/Function0;", "Loq/i0;", "onClick", "", "isSelected", "Ln50/f;", "h", "(ILzp0/v;Ler/a;Z)Ln50/f;", "", "i", "(Lzp0/v;)Ljava/lang/String;", "Lzp0/w;", "l", "(Lzp0/w;)Ljava/lang/String;", "Lzp0/a;", "m", "(Lzp0/a;)Ljava/lang/String;", "stringId", "Lmx/a;", "s", "(I)Lmx/a;", "q", "(Llj1/b$a;)Lkj1/d$a;", "a", "Lez/e;", "b", "Lmx/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: lj1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Llj1/b$a;", "", "Lkj1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onSignUpClick", "onCloseProcess", "Lkotlin/Function1;", "Lzp0/v;", "selectDate", "<init>", "(Lkj1/c;Ler/a;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkj1/c;", "e", "()Lkj1/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kj1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSignUpClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseProcess;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DefenceTraining, i0> selectDate;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(kj1.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super DefenceTraining, i0> lVar) {
            this.state = cVar;
            this.onBackClick = aVar;
            this.onSignUpClick = aVar2;
            this.onCloseProcess = aVar3;
            this.selectDate = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCloseProcess;
        }

        public final er.a<i0> c() {
            return this.onSignUpClick;
        }

        public final l<DefenceTraining, i0> d() {
            return this.selectDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final kj1.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onSignUpClick, params.onSignUpClick) && t.c(this.onCloseProcess, params.onCloseProcess) && t.c(this.selectDate, params.selectDate);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onSignUpClick.hashCode()) * 31) + this.onCloseProcess.hashCode()) * 31) + this.selectDate.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onSignUpClick=" + this.onSignUpClick + ", onCloseProcess=" + this.onCloseProcess + ", selectDate=" + this.selectDate + ')';
        }
    }

    public b(e eVar, c cVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData e(Params params) {
        i.Small small = new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), s(ri1.b.Y), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null);
        kj1.c state = params.getState();
        kj1.c.Content content = state instanceof kj1.c.Content ? (kj1.c.Content) state : null;
        return new BaseScaffoldData(null, small, null, null, null, new ScrollControllerData(content != null ? content.c() : null, false, false, 6, null), 29, null);
    }

    private final ButtonData f(Params params) {
        er.a<i0> aVarC = params.c();
        return new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(s(ri1.b.f174410t), null, 2, null), k30.d.a.f107773a, null, aVarC, 35, null);
    }

    private final CustomSingleCardData h(int index, DefenceTraining defenceTraining, er.a<i0> onClick, boolean isSelected) {
        return new CustomSingleCardData("Date_" + index, new OccupancyRadioCardCustomContent("Date_" + index, i(defenceTraining), s(ej1.a.b(defenceTraining.getOccupancy())).getText(), ej1.a.a(defenceTraining.getOccupancy()), isSelected), onClick, false, null, null, false, null, 248, null);
    }

    private final String i(DefenceTraining defenceTraining) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : defenceTraining.a()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            sb5.append(l((DefenceTrainingDay) obj));
            if (i15 != defenceTraining.a().size() - 1) {
                sb5.append("\n");
            }
            i15 = i16;
        }
        return sb5.toString();
    }

    private final String l(DefenceTrainingDay defenceTrainingDay) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(dz.e.b(this.dateFormatter.d(defenceTrainingDay.getStartDate(), fz.c.DAY_ONLY), null, 1, null));
        sb5.append(' ');
        sb5.append(this.dateFormatter.d(defenceTrainingDay.getStartDate(), fz.c.DOTTED));
        sb5.append(", ");
        e eVar = this.dateFormatter;
        fz.b.OffsetDateTime startDate = defenceTrainingDay.getStartDate();
        fz.c cVar = fz.c.ONLY_HOUR;
        sb5.append(eVar.d(startDate, cVar));
        sb5.append('-');
        sb5.append(this.dateFormatter.d(defenceTrainingDay.getEndDate(), cVar));
        return sb5.toString();
    }

    private final String m(AvailableDefenceTrainings availableDefenceTrainings) {
        BEDefenceTrainingType type;
        String description;
        DefenceTraining defenceTraining = (DefenceTraining) v.n0(availableDefenceTrainings.a());
        return (defenceTraining == null || (type = defenceTraining.getType()) == null || (description = type.getDescription()) == null) ? "" : description;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, DefenceTraining defenceTraining) {
        params.d().b(defenceTraining);
        return i0.f148189a;
    }

    private final Label s(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public d.a b(final Params params) {
        j0 error;
        kj1.c state = params.getState();
        if (t.c(state, kj1.c.C2675c.f111143a)) {
            return d.a.c.f111159a;
        }
        if (state instanceof kj1.c.Error) {
            return new d.a.Error(((kj1.c.Error) state).getErrorVMSAdapter());
        }
        if (!(state instanceof kj1.c.Content)) {
            throw new p();
        }
        kj1.c.Content content = (kj1.c.Content) state;
        DefenceTraining defenceTraining = (DefenceTraining) v.o0(content.getTrainingPlace().a(), 0);
        if (content.getTrainingPlace().a().size() == 1 && defenceTraining != null) {
            return new d.a.InterfaceC2676a.OneDate(params.a(), e(params), s(ri1.b.X), f(params), new CardListData(v.q(new CustomSingleCardData("OccupancyCard", new OccupancyInfoCardCustomContent("OccupancyCard", s(ri1.b.Q0).getText(), s(ej1.a.b(defenceTraining.getOccupancy())).getText(), ej1.a.a(defenceTraining.getOccupancy())), null, false, null, null, false, null, 252, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(s(ri1.b.f174351b0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(m(content.getTrainingPlace()), "trainingName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(s(ri1.b.f174359d0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(content.getTrainingPlace().getUnit().getName(), "unit"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(s(ri1.b.f174355c0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(content.getTrainingPlace().getUnit().getAddress(), "address"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(s(ri1.b.C1), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(i(defenceTraining), "date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldDataE = e(params);
        Label labelS = s(ri1.b.X);
        CardListData cardListData = new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(s(ri1.b.f174351b0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(m(content.getTrainingPlace()), "trainingName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(s(ri1.b.f174359d0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(content.getTrainingPlace().getUnit().getName(), "unit"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(s(ri1.b.f174355c0), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(content.getTrainingPlace().getUnit().getAddress(), "address"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null);
        ButtonData buttonDataF = f(params);
        Label labelS2 = s(ri1.b.Z);
        hz.b selectedDateValidationState = content.getSelectedDateValidationState();
        if (t.c(selectedDateValidationState, hz.b.C2039b.f86846c)) {
            error = j0.a.f132074a;
        } else if (selectedDateValidationState instanceof hz.b.Invalid) {
            error = new j0.Error(((hz.b.Invalid) content.getSelectedDateValidationState()).getMessage());
        } else {
            if (!t.c(selectedDateValidationState, hz.b.d.f86848c)) {
                throw new p();
            }
            error = j0.a.f132074a;
        }
        j0 j0Var = error;
        List<DefenceTraining> listA = content.getTrainingPlace().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        for (Object obj : listA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final DefenceTraining defenceTraining2 = (DefenceTraining) obj;
            arrayList.add(h(i15, defenceTraining2, new er.a() { // from class: lj1.a
                @Override // er.a
                public final Object a() {
                    return b.r(params, defenceTraining2);
                }
            }, t.c(defenceTraining2, content.getSelectedDate())));
            i15 = i16;
            content = content;
        }
        return new d.a.InterfaceC2676a.MoreDates(aVarA, baseScaffoldDataE, labelS, buttonDataF, cardListData, labelS2, new CardListData(arrayList, j0Var, false, null, kj1.b.DateSelection, 12, null));
    }
}
