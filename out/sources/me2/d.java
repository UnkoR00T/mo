package me2;

import androidx.compose.ui.graphics.Color;
import cb4.i;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import le2.e;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p076m2.r;
import t50.TextAreaData;
import t50.s;
import v40.InputDateTimeData;
import vy.Coordinates;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lme2/d;", "Lxw/f;", "Lme2/d$a;", "Lle2/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lhz/b;", "Lt50/e;", "r", "(Lhz/b;)Lt50/e;", "", "stringId", "Lmx/a;", "q", "(I)Lmx/a;", "params", "h", "(Lme2/d$a;)Lle2/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: me2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b$\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\"R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b'\u0010\"¨\u0006+"}, d2 = {"Lme2/d$a;", "", "Lle2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onCloseClick", "onNextClick", "onChooseLocalizationClick", "onDateClick", "onTimeClick", "Lkotlin/Function1;", "Liy/b0;", "onDescriptionChanged", "onScrolledToField", "<init>", "(Lle2/d;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lle2/d;", "i", "()Lle2/d;", "b", "Ler/a;", "()Ler/a;", "c", "d", "f", "e", "g", "h", "Ler/l;", "()Ler/l;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final le2.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChooseLocalizationClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTimeClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onDescriptionChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(le2.d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super b0, i0> lVar, er.a<i0> aVar7) {
            this.state = dVar;
            this.onBackClick = aVar;
            this.onCloseClick = aVar2;
            this.onNextClick = aVar3;
            this.onChooseLocalizationClick = aVar4;
            this.onDateClick = aVar5;
            this.onTimeClick = aVar6;
            this.onDescriptionChanged = lVar;
            this.onScrolledToField = aVar7;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onChooseLocalizationClick;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        public final er.a<i0> d() {
            return this.onDateClick;
        }

        public final l<b0, i0> e() {
            return this.onDescriptionChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onChooseLocalizationClick, params.onChooseLocalizationClick) && t.c(this.onDateClick, params.onDateClick) && t.c(this.onTimeClick, params.onTimeClick) && t.c(this.onDescriptionChanged, params.onDescriptionChanged) && t.c(this.onScrolledToField, params.onScrolledToField);
        }

        public final er.a<i0> f() {
            return this.onNextClick;
        }

        public final er.a<i0> g() {
            return this.onScrolledToField;
        }

        public final er.a<i0> h() {
            return this.onTimeClick;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onChooseLocalizationClick.hashCode()) * 31) + this.onDateClick.hashCode()) * 31) + this.onTimeClick.hashCode()) * 31) + this.onDescriptionChanged.hashCode()) * 31) + this.onScrolledToField.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final le2.d getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ", onNextClick=" + this.onNextClick + ", onChooseLocalizationClick=" + this.onChooseLocalizationClick + ", onDateClick=" + this.onDateClick + ", onTimeClick=" + this.onTimeClick + ", onDescriptionChanged=" + this.onDescriptionChanged + ", onScrolledToField=" + this.onScrolledToField + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f126108a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1052376322);
            if (p076m2.t.k()) {
                p076m2.t.o(-1052376322, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.details.mapper.IncidentDetailsScreenMapper.invoke.<anonymous> (IncidentDetailsScreenMapper.kt:152)");
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
        public static final c f126109a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-585501220);
            if (p076m2.t.k()) {
                p076m2.t.o(-585501220, i15, -1, "pl.gov.coi.mobywatel.feature.incidentreport.presentation.newincident.details.mapper.IncidentDetailsScreenMapper.invoke.<anonymous> (IncidentDetailsScreenMapper.kt:159)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public d(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.h().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    private final Label q(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final t50.e r(hz.b bVar) {
        return bVar instanceof hz.b.Invalid ? new t50.e.Error(((hz.b.Invalid) bVar).getMessage()) : new t50.e.Default(null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:18:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:20:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:21:0x02bd  */
    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e.Data b(final Params params) {
        i dialogVMSAdapter;
        BaseScaffoldData baseScaffoldData;
        ButtonData buttonData;
        oq.r rVarA;
        hz.b locationValidationState;
        hz.b.Invalid invalid;
        Label message;
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), q(ud2.a.T), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarF = params.f();
        k30.c.WithText withText = new k30.c.WithText(q(ud2.a.f197771y), null, 2, null);
        k30.a.Large large = new k30.a.Large(false, 1, null);
        k30.d.a aVar = k30.d.a.f107773a;
        ButtonData buttonData2 = new ButtonData("goNextButton", null, large, withText, aVar, null, aVarF, 34, null);
        le2.d state = params.getState();
        if (state instanceof le2.d.Details) {
            dialogVMSAdapter = null;
        } else {
            if (!(state instanceof le2.d.Dialog)) {
                throw new oq.p();
            }
            dialogVMSAdapter = ((le2.d.Dialog) params.getState()).getDialogVMSAdapter();
        }
        Label labelQ = q(ud2.a.U);
        InputDateTimeData inputDateTimeData = new InputDateTimeData("datePickerInput", q(ud2.a.f197743k), this.dateFormatter.d(params.getState().getInitializedStateData().getIncidentDateTime(), fz.c.DOTTED), InputDateTimeData.b.C5303a.f203783c, null, null, null, null, false, null, new er.a() { // from class: me2.a
            @Override // er.a
            public final Object a() {
                return d.i(params);
            }
        }, 1008, null);
        oq.r rVarA2 = y.a(le2.a.TIME_PICKER, new InputDateTimeData("timePickerInput", q(ud2.a.f197763u), this.dateFormatter.d(params.getState().getInitializedStateData().getIncidentDateTime(), fz.c.ONLY_HOUR), InputDateTimeData.b.c.f203785c, params.getState().getInitializedStateData().getIncidentDateTimeValidationState(), null, null, null, false, null, new er.a() { // from class: me2.b
            @Override // er.a
            public final Object a() {
                return d.l(params);
            }
        }, 992, null));
        le2.a aVar2 = le2.a.DESCRIPTION;
        s.Fix fix = new s.Fix(4);
        oq.r rVarA3 = y.a(aVar2, new TextAreaData("descriptionTextArea", q(ud2.a.N), fix, null, r(params.getState().getInitializedStateData().getDescriptionValidationState()), c0.e(params.getState().getInitializedStateData().getDescription()), false, new t50.a.Visible(1000, null, 2, null), q(ud2.a.O), 0, null, null, new l() { // from class: me2.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(params, (String) obj);
            }
        }, null, 11848, null));
        Label labelQ2 = q(ud2.a.R);
        Coordinates location = params.getState().getInitializedStateData().getLocation();
        if (location != null) {
            le2.a aVar3 = le2.a.LOCATION;
            baseScaffoldData = baseScaffoldData2;
            x0.Button button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(q(ud2.a.f197729d), null, 2, null), aVar, null, params.b(), 35, null));
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(q(ud2.a.f197740i0), null, null, 0, 0, null, 62, null));
            StringBuilder sb5 = new StringBuilder();
            buttonData = buttonData2;
            sb5.append(location.getLatitude());
            sb5.append(", ");
            sb5.append(location.getLongitude());
            rVarA = y.a(aVar3, new DefaultSingleCardData("chooseLocationInput", null, false, null, null, false, null, null, new BodySection(null, title, new SingleCardLabel(mx.b.b(sb5.toString(), "address"), null, null, 0, 0, null, 62, null), 1, null), null, button, null, 2814, null));
            if (rVarA == null) {
            }
            locationValidationState = params.getState().getInitializedStateData().getLocationValidationState();
            if (locationValidationState instanceof hz.b.Invalid) {
                invalid = (hz.b.Invalid) locationValidationState;
            } else {
                invalid = null;
            }
            if (invalid != null) {
                message = invalid.getMessage();
            } else {
                message = null;
            }
            return new e.Data(baseScaffoldData, labelQ, inputDateTimeData, rVarA2, rVarA3, labelQ2, rVarA, message, buttonData, dialogVMSAdapter, params.getState().getInitializedStateData().getScrollToField(), params.g(), aVarA);
        }
        baseScaffoldData = baseScaffoldData2;
        buttonData = buttonData2;
        rVarA = y.a(le2.a.LOCATION, new DefaultSingleCardData("chooseLocationInputEmpty", params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(q(ud2.a.Q), null, c.f126109a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, b.f126108a, null, null, 26, null), 3, null), null, null, 3324, null));
        locationValidationState = params.getState().getInitializedStateData().getLocationValidationState();
        if (locationValidationState instanceof hz.b.Invalid) {
            invalid = (hz.b.Invalid) locationValidationState;
        } else {
            invalid = null;
        }
        if (invalid != null) {
            message = invalid.getMessage();
        } else {
            message = null;
        }
        return new e.Data(baseScaffoldData, labelQ, inputDateTimeData, rVarA2, rVarA3, labelQ2, rVarA, message, buttonData, dialogVMSAdapter, params.getState().getInitializedStateData().getScrollToField(), params.g(), aVarA);
    }
}
