package c81;

import androidx.compose.ui.graphics.Color;
import b81.State;
import d81.EditSplitSection;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i61.DataSplit;
import i61.DataSplitData;
import iy.b0;
import iy.c0;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc81/b;", "Lxw/f;", "Lc81/b$a;", "Lb81/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Li61/j;", "Ld81/b;", "type", "Lkotlin/Function1;", "Loq/i0;", "onEditClick", "Ld81/c;", "e", "(Li61/j;Ld81/b;Ler/l;)Ld81/c;", "params", "h", "(Lc81/b$a;)Lb81/d$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, b81.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c81.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lc81/b$a;", "", "Lb81/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onBackAction", "Lkotlin/Function1;", "Ld81/b;", "onEditSplitAction", "onNextAction", "<init>", "(Lb81/c;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb81/c;", "e", "()Lb81/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f24554f = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<d81.b, i0> onEditSplitAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super d81.b, i0> lVar, er.a<i0> aVar3) {
            this.state = state;
            this.onCloseAction = aVar;
            this.onBackAction = aVar2;
            this.onEditSplitAction = lVar;
            this.onNextAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final l<d81.b, i0> c() {
            return this.onEditSplitAction;
        }

        public final er.a<i0> d() {
            return this.onNextAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
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
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onEditSplitAction, params.onEditSplitAction) && t.c(this.onNextAction, params.onNextAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onEditSplitAction.hashCode()) * 31) + this.onNextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onBackAction=" + this.onBackAction + ", onEditSplitAction=" + this.onEditSplitAction + ", onNextAction=" + this.onNextAction + ')';
        }
    }

    /* JADX INFO: renamed from: c81.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0649b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24560a;

        static {
            int[] iArr = new int[d81.b.values().length];
            try {
                iArr[d81.b.NAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d81.b.SURNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d81.b.BIRTH_PLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24560a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f24561a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(253222602);
            if (p076m2.t.k()) {
                p076m2.t.o(253222602, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.datasplit.display.mapper.CPADataSplitDisplayMapper.convertToSplitSection.<anonymous> (CPADataSplitDisplayMapper.kt:147)");
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
        public static final d f24562a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1950256774);
            if (p076m2.t.k()) {
                p076m2.t.o(1950256774, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.datasplit.display.mapper.CPADataSplitDisplayMapper.convertToSplitSection.<anonymous> (CPADataSplitDisplayMapper.kt:156)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final EditSplitSection e(DataSplit dataSplit, final d81.b bVar, final l<? super d81.b, i0> lVar) {
        int i15;
        int i16;
        int i17;
        mx.c cVar = this.labelProvider;
        int[] iArr = C0649b.f24560a;
        int i18 = iArr[bVar.ordinal()];
        if (i18 == 1) {
            i15 = w51.a.V1;
        } else if (i18 == 2) {
            i15 = w51.a.Z1;
        } else {
            if (i18 != 3) {
                throw new oq.p();
            }
            i15 = w51.a.R1;
        }
        Label labelC = cVar.c(i15);
        String str = bVar.name() + "FirstLineCard";
        mx.c cVar2 = this.labelProvider;
        int i19 = iArr[bVar.ordinal()];
        if (i19 == 1) {
            i16 = w51.a.W1;
        } else if (i19 == 2) {
            i16 = w51.a.f210293a2;
        } else {
            if (i19 != 3) {
                throw new oq.p();
            }
            i16 = w51.a.S1;
        }
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(str, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar2.c(i16), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(dataSplit.getFirstLine()), bVar.name() + "FirstLineTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        String str2 = bVar.name() + "SecondLineCard";
        mx.c cVar3 = this.labelProvider;
        int i25 = iArr[bVar.ordinal()];
        if (i25 == 1) {
            i17 = w51.a.X1;
        } else if (i25 == 2) {
            i17 = w51.a.f210300b2;
        } else {
            if (i25 != 3) {
                throw new oq.p();
            }
            i17 = w51.a.T1;
        }
        return new EditSplitSection(labelC, defaultSingleCardData, new DefaultSingleCardData(str2, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar3.c(i17), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(dataSplit.getSecondLine()), bVar.name() + "SecondLineTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData(bVar.name() + "EditSplitCard", new er.a() { // from class: c81.a
            @Override // er.a
            public final Object a() {
                return b.f(lVar, bVar);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(w51.a.U1), null, d.f24562a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106768f0, null, c.f24561a, null, null, 26, null), 3, null), null, null, 3324, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, d81.b bVar) {
        lVar.b(bVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b81.d.Data b(Params params) {
        DataSplit birthPlace;
        DataSplit surname;
        DataSplit names;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.f210460y2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(w51.a.Y1);
        Label labelC2 = this.labelProvider.c(w51.a.f210454x2);
        DataSplitData dataSplitData = params.getState().getDataSplitData();
        EditSplitSection editSplitSectionE = (dataSplitData == null || (names = dataSplitData.getNames()) == null) ? null : e(names, d81.b.NAMES, params.c());
        DataSplitData dataSplitData2 = params.getState().getDataSplitData();
        EditSplitSection editSplitSectionE2 = (dataSplitData2 == null || (surname = dataSplitData2.getSurname()) == null) ? null : e(surname, d81.b.SURNAME, params.c());
        DataSplitData dataSplitData3 = params.getState().getDataSplitData();
        return new b81.d.Data(aVarA, baseScaffoldData, labelC, labelC2, v.s(editSplitSectionE, editSplitSectionE2, (dataSplitData3 == null || (birthPlace = dataSplitData3.getBirthPlace()) == null) ? null : e(birthPlace, d81.b.BIRTH_PLACE, params.c())), new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210365k4), null, 2, null), k30.d.a.f107773a, null, params.d(), 34, null));
    }
}
