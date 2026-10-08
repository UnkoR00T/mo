package jj1;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import ij1.ChooseChildrenFields;
import ij1.State;
import ij1.d;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListAccessibilityData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.j0;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r30.CheckBoxRowData;
import vi1.ChildParticipant;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljj1/b;", "Lxw/f;", "Ljj1/b$a;", "Lij1/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lvi1/a;", "Lkotlin/Function1;", "", "Loq/i0;", "onClickChild", "Ln50/g;", "e", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "stringId", "Lmx/a;", "i", "(I)Lmx/a;", "params", "h", "(Ljj1/b$a;)Lij1/d$a;", "a", "Lmx/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: jj1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010#R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Ljj1/b$a;", "", "Lij1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onSaveClick", "onAddOther", "Lkotlin/Function1;", "", "onClickChild", "", "onStatementCheckedChange", "<init>", "(Lij1/c;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lij1/c;", "f", "()Lij1/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "()Ler/l;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSaveClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddOther;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> onClickChild;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onStatementCheckedChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Integer, i0> lVar, l<? super Boolean, i0> lVar2) {
            this.state = state;
            this.onBackClick = aVar;
            this.onSaveClick = aVar2;
            this.onAddOther = aVar3;
            this.onClickChild = lVar;
            this.onStatementCheckedChange = lVar2;
        }

        public final er.a<i0> a() {
            return this.onAddOther;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        public final l<Integer, i0> c() {
            return this.onClickChild;
        }

        public final er.a<i0> d() {
            return this.onSaveClick;
        }

        public final l<Boolean, i0> e() {
            return this.onStatementCheckedChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onSaveClick, params.onSaveClick) && t.c(this.onAddOther, params.onAddOther) && t.c(this.onClickChild, params.onClickChild) && t.c(this.onStatementCheckedChange, params.onStatementCheckedChange);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onSaveClick.hashCode()) * 31) + this.onAddOther.hashCode()) * 31) + this.onClickChild.hashCode()) * 31) + this.onStatementCheckedChange.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onSaveClick=" + this.onSaveClick + ", onAddOther=" + this.onAddOther + ", onClickChild=" + this.onClickChild + ", onStatementCheckedChange=" + this.onStatementCheckedChange + ')';
        }
    }

    /* JADX INFO: renamed from: jj1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2444b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2444b f103432a = new C2444b();

        C2444b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-356599469);
            if (p076m2.t.k()) {
                p076m2.t.o(-356599469, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.choosechildren.mapper.ChooseChildrenScreenMapper.createCheckBoxCards.<anonymous>.<anonymous> (ChooseChildrenScreenMapper.kt:145)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> e(List<ChildParticipant> list, final l<? super Integer, i0> lVar) {
        List<ChildParticipant> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        final int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            ChildParticipant childParticipant = (ChildParticipant) obj;
            arrayList.add(new DefaultSingleCardData("ChildParticipant" + i15, new er.a() { // from class: jj1.a
                @Override // er.a
                public final Object a() {
                    return b.f(lVar, i15);
                }
            }, childParticipant.getIsAgeValidForTraining(), null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(childParticipant.d(), ""), null, null, 3, null)), !childParticipant.getIsAgeValidForTraining() ? new SingleCardLabel(i(ri1.b.K), null, C2444b.f103432a, 0, 0, null, 58, null) : null, 1, null), new LeadingSection(false, new n50.d.CheckBox(childParticipant.getIsSelected()), null, 5, null), null, null, 3320, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, int i15) {
        lVar.b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    private final Label i(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        Label labelI;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), i(ri1.b.M), null, null, null, 28, null), null, null, null, new ScrollControllerData(params.getState().d(), false, false, 6, null), 29, null);
        Label labelI2 = i(ri1.b.J);
        ChooseChildrenFields.a.Children children = params.getState().getFields().getChildren();
        CardListData cardListData = new CardListData(e(children.e(), params.c()), children.getValidationState() instanceof hz.b.Invalid ? new j0.Error(((hz.b.Invalid) children.getValidationState()).getMessage()) : j0.a.f132074a, false, new CardListAccessibilityData(i(ri1.b.J), null, 2, null), ChooseChildrenFields.b.Children, 4, null);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("AddOtherCard", params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(i(ri1.b.L), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2812, null);
        Label labelI3 = i(ri1.b.f174428z);
        ChooseChildrenFields.a.Statement statement = params.getState().getFields().getStatement();
        CheckBoxSingleData checkBoxSingleData = new CheckBoxSingleData(new CheckBoxRowData("StatementCheckBox", statement.getIsChecked(), params.e(), i(ri1.b.N), null, null, null, null, 240, null), statement.getValidationState() instanceof hz.b.Invalid ? new r30.b.Error(null, ((hz.b.Invalid) statement.getValidationState()).getMessage(), 1, null) : r30.b.a.f171263a, null, false, ChooseChildrenFields.b.Statement, 12, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        boolean zE = params.getState().e();
        if (zE) {
            labelI = i(ri1.b.f174374h);
        } else {
            if (zE) {
                throw new oq.p();
            }
            labelI = i(ri1.b.f174425y);
        }
        return new d.Data(baseScaffoldData, labelI2, cardListData, defaultSingleCardData, labelI3, checkBoxSingleData, new ButtonData("BottomButton", null, large, new k30.c.WithText(labelI, null, 2, null), k30.d.a.f107773a, null, params.d(), 34, null), params.b());
    }
}
