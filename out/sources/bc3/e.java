package bc3;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import fz.FormattedRangeDate;
import ga3.StageField;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import xw.f;
import yb3.k;
import yb3.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJc\u0010\u001b\u001a\u00020\u001a*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lbc3/e;", "Lxw/f;", "Lbc3/e$a;", "Lyb3/l$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lda3/a;", "addressFormatter", "Lzw/a;", "accessibilityFormatter", "<init>", "(Lmx/c;Lez/e;Lda3/a;Lzw/a;)V", "Lga3/d;", "", "index", "Lkotlin/Function0;", "Loq/i0;", "onRemoveClick", "", "canBeRemoved", "onSelectDateRangeClick", "canShowAddNextButton", "onAddNextClick", "onSelectPlaceClick", "Lyb3/l$a$a$a;", "u", "(Lga3/d;ILer/a;ZLer/a;ZLer/a;Ler/a;)Lyb3/l$a$a$a;", "Lhz/b;", "validationState", "Lyb3/l$a$a$a$a;", "i", "(Lga3/d;ILer/a;Lhz/b;)Lyb3/l$a$a$a$a;", "params", "l", "(Lbc3/e$a;)Lyb3/l$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lda3/a;", "d", "Lzw/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, l.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final da3.a addressFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zw.a accessibilityFormatter;

    /* JADX INFO: renamed from: bc3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u0019\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b!\u0010$¨\u0006%"}, d2 = {"Lbc3/e$a;", "", "Lyb3/k;", "state", "Lkotlin/Function1;", "Lcc3/b;", "Loq/i0;", "onStageModified", "Lkotlin/Function0;", "onScrolledToField", "onBack", "onClose", "onNext", "<init>", "(Lyb3/k;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyb3/k;", "f", "()Lyb3/k;", "b", "Ler/l;", "e", "()Ler/l;", "c", "Ler/a;", "d", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<cc3.b, i0> onStageModified;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(k kVar, er.l<? super cc3.b, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = kVar;
            this.onStageModified = lVar;
            this.onScrolledToField = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
            this.onNext = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onNext;
        }

        public final er.a<i0> d() {
            return this.onScrolledToField;
        }

        public final er.l<cc3.b, i0> e() {
            return this.onStageModified;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onStageModified, params.onStageModified) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final k getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onStageModified.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onStageModified=" + this.onStageModified + ", onScrolledToField=" + this.onScrolledToField + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18168a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1535426941);
            if (p076m2.t.k()) {
                p076m2.t.o(1535426941, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.mapper.TripStagesMapper.getPlaceCardData.<anonymous> (TripStagesMapper.kt:195)");
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
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18169a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(443193153);
            if (p076m2.t.k()) {
                p076m2.t.o(443193153, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.mapper.TripStagesMapper.getPlaceCardData.<anonymous> (TripStagesMapper.kt:204)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public e(mx.c cVar, ez.e eVar, da3.a aVar, zw.a aVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.addressFormatter = aVar;
        this.accessibilityFormatter = aVar2;
    }

    private final l.a.Initialized.StageData.PlaceData i(StageField stageField, int i15, er.a<i0> aVar, hz.b bVar) {
        DefaultSingleCardData defaultSingleCardData;
        boolean z15 = stageField.f().d() != null;
        if (z15) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(r93.a.f172526w1).n("selectedPlace#" + i15), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.addressFormatter.b(stageField.f().d()), "place#" + i15), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(r93.a.f172473f).n("changePlace#" + i15), null, 2, null), k30.d.a.f107773a, null, aVar, 35, null)), null, 2815, null);
        } else {
            if (z15) {
                throw new oq.p();
            }
            defaultSingleCardData = new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(r93.a.f172523v1).n("selectPlace" + i15), null, c.f18169a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106760e0, null, b.f18168a, null, null, 26, null), 3, null), null, null, 3325, null);
        }
        hz.b.Invalid invalid = bVar instanceof hz.b.Invalid ? (hz.b.Invalid) bVar : null;
        return new l.a.Initialized.StageData.PlaceData(defaultSingleCardData, invalid != null ? invalid.getMessage() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, StageField stageField) {
        params.e().b(new cc3.b.Delete(stageField.getId()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, StageField stageField) {
        params.e().b(new cc3.b.SelectDateRange(stageField.getId()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, StageField stageField) {
        params.e().b(new cc3.b.AddNextAfter(stageField.getId()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, StageField stageField) {
        params.e().b(new cc3.b.SelectPlace(stageField.getId()));
        return i0.f148189a;
    }

    private final l.a.Initialized.StageData u(StageField stageField, int i15, er.a<i0> aVar, boolean z15, er.a<i0> aVar2, boolean z16, er.a<i0> aVar3, er.a<i0> aVar4) {
        ButtonTextData buttonTextData;
        ButtonData buttonData;
        FormattedRangeDate formattedRangeDateA;
        mx.c cVar = this.labelProvider;
        String id5 = stageField.getId();
        Label labelE = cVar.e(r93.a.f172520u1, Integer.valueOf(i15));
        Boolean boolValueOf = Boolean.valueOf(z15);
        Label labelN = null;
        if (!z15) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            buttonTextData = new ButtonTextData(null, cVar.c(r93.a.f172490k1).n("deleteStage#" + i15), k30.b.a.f107766a, null, aVar, 9, null);
        } else {
            buttonTextData = null;
        }
        Label labelN2 = cVar.c(r93.a.f172517t1).n("inputLabel#" + i15);
        fz.e.LocalDate localDateD = stageField.c().d();
        String strB = (localDateD == null || (formattedRangeDateA = this.dateFormatter.a(localDateD)) == null) ? null : FormattedRangeDate.b(formattedRangeDateA, null, 1, null);
        if (strB == null) {
            strB = "";
        }
        String str = strB;
        fz.e.LocalDate localDateD2 = stageField.c().d();
        InputDateTimeData inputDateTimeData = new InputDateTimeData(null, labelN2, str, new InputDateTimeData.b.DateRange(null, 1, null), stageField.c().getValidationState(), null, localDateD2 != null ? this.accessibilityFormatter.a(localDateD2.getStart(), localDateD2.getEnd()) : null, null, false, null, aVar2, 929, null);
        l.a.Initialized.StageData.PlaceData placeDataI = i(stageField, i15, aVar4, stageField.f().getValidationState());
        Boolean boolValueOf2 = Boolean.valueOf(z16);
        if (!z16 || !stageField.getIsDateRangeSelected() || !stageField.getIsPlaceSelected()) {
            boolValueOf2 = null;
        }
        if (boolValueOf2 != null) {
            buttonData = new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(cVar.c(r93.a.f172487j1).n("addStage#" + i15), null, 2, null), k30.d.a.f107773a, null, aVar3, 35, null);
        } else {
            buttonData = null;
        }
        if ((!stageField.getIsPlaceSelected() ? cVar : null) != null) {
            labelN = cVar.c(r93.a.f172514s1).n("helperText#" + i15);
        }
        return new l.a.Initialized.StageData(id5, labelE, buttonTextData, inputDateTimeData, placeDataI, buttonData, labelN);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l.a b(final Params params) {
        k state = params.getState();
        if (t.c(state, k.b.f226243a)) {
            return l.a.b.f226262a;
        }
        if (!(state instanceof k.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.f172529x1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(r93.a.f172484i1);
        Label labelC2 = this.labelProvider.c(r93.a.f172481h1);
        List<StageField> listG = ((k.Initialized) params.getState()).g();
        ArrayList arrayList = new ArrayList(v.y(listG, 10));
        int i15 = 0;
        for (Object obj : listG) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final StageField stageField = (StageField) obj;
            arrayList.add(u(stageField, i16, new er.a() { // from class: bc3.a
                @Override // er.a
                public final Object a() {
                    return e.m(params, stageField);
                }
            }, ((k.Initialized) params.getState()).getCanDelete(), new er.a() { // from class: bc3.b
                @Override // er.a
                public final Object a() {
                    return e.q(params, stageField);
                }
            }, ((k.Initialized) params.getState()).getCanAddNext(), new er.a() { // from class: bc3.c
                @Override // er.a
                public final Object a() {
                    return e.r(params, stageField);
                }
            }, new er.a() { // from class: bc3.d
                @Override // er.a
                public final Object a() {
                    return e.s(params, stageField);
                }
            }));
            i15 = i16;
        }
        return new l.a.Initialized(baseScaffoldData, labelC, labelC2, arrayList, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(r93.a.E), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), ((k.Initialized) params.getState()).getScrollToField(), params.d());
    }
}
