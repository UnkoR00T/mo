package qf3;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
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
import rf3.CollisionDataFields;
import rf3.CollisionDataScreenContent;
import t50.TextAreaData;
import t50.s;
import tv0.BEVehicleCollisionDescriptionConception;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lqf3/d;", "Lxw/f;", "Lqf3/d$a;", "Lof3/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lje3/a;", "addressFormatter", "<init>", "(Lmx/c;Lez/e;Lje3/a;)V", "Lof3/b$b;", "state", "params", "Lrf3/b;", "h", "(Lof3/b$b;Lqf3/d$a;)Lrf3/b;", "Lrf3/b$a;", "m", "(Lof3/b$b;Lqf3/d$a;)Lrf3/b$a;", "Lhz/b;", "Lt50/e;", "u", "(Lhz/b;)Lt50/e;", "", "stringId", "Lmx/a;", "r", "(I)Lmx/a;", "s", "(Lqf3/d$a;)Lof3/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lje3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, of3.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final je3.a addressFormatter;

    /* JADX INFO: renamed from: qf3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b$\u0010!R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001e\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006'"}, d2 = {"Lqf3/d$a;", "", "Lof3/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGoToNextStep", "onDateClicked", "onTimeClicked", "onLocationClicked", "Lkotlin/Function1;", "Liy/b0;", "onDescriptionChanged", "onExitAction", "<init>", "(Lof3/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lof3/b;", "g", "()Lof3/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "f", "e", "Ler/l;", "()Ler/l;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final of3.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToNextStep;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTimeClicked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onLocationClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onDescriptionChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(of3.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super b0, i0> lVar, er.a<i0> aVar5) {
            this.state = bVar;
            this.onGoToNextStep = aVar;
            this.onDateClicked = aVar2;
            this.onTimeClicked = aVar3;
            this.onLocationClicked = aVar4;
            this.onDescriptionChanged = lVar;
            this.onExitAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.onDateClicked;
        }

        public final l<b0, i0> b() {
            return this.onDescriptionChanged;
        }

        public final er.a<i0> c() {
            return this.onExitAction;
        }

        public final er.a<i0> d() {
            return this.onGoToNextStep;
        }

        public final er.a<i0> e() {
            return this.onLocationClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onGoToNextStep, params.onGoToNextStep) && t.c(this.onDateClicked, params.onDateClicked) && t.c(this.onTimeClicked, params.onTimeClicked) && t.c(this.onLocationClicked, params.onLocationClicked) && t.c(this.onDescriptionChanged, params.onDescriptionChanged) && t.c(this.onExitAction, params.onExitAction);
        }

        public final er.a<i0> f() {
            return this.onTimeClicked;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final of3.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onGoToNextStep.hashCode()) * 31) + this.onDateClicked.hashCode()) * 31) + this.onTimeClicked.hashCode()) * 31) + this.onLocationClicked.hashCode()) * 31) + this.onDescriptionChanged.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGoToNextStep=" + this.onGoToNextStep + ", onDateClicked=" + this.onDateClicked + ", onTimeClicked=" + this.onTimeClicked + ", onLocationClicked=" + this.onLocationClicked + ", onDescriptionChanged=" + this.onDescriptionChanged + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f166350a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-626472253);
            if (p076m2.t.k()) {
                p076m2.t.o(-626472253, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.mapper.CollisionDataScreenMapper.createContent.<anonymous> (CollisionDataScreenMapper.kt:140)");
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
        public static final c f166351a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1100570045);
            if (p076m2.t.k()) {
                p076m2.t.o(-1100570045, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.collisiondata.mapper.CollisionDataScreenMapper.createContent.<anonymous> (CollisionDataScreenMapper.kt:147)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public d(mx.c cVar, e eVar, je3.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.addressFormatter = aVar;
    }

    private final CollisionDataScreenContent h(of3.b.Initialized state, final Params params) {
        DefaultSingleCardData defaultSingleCardData;
        Label labelR = r(md3.b.f125751j3);
        InputDateTimeData inputDateTimeData = new InputDateTimeData(null, r(md3.b.f125735h3), this.dateFormatter.d(state.getCollisionDataFields().getCrashDateField().getDateType(), fz.c.DOTTED), InputDateTimeData.b.C5303a.f203783c, null, null, null, null, false, null, new er.a() { // from class: qf3.b
            @Override // er.a
            public final Object a() {
                return d.i(params);
            }
        }, 1009, null);
        CollisionDataFields.InterfaceC4433a.DateTime crashDateField = state.getCollisionDataFields().getCrashDateField();
        InputDateTimeData inputDateTimeData2 = new InputDateTimeData(null, r(md3.b.f125743i3), this.dateFormatter.d(crashDateField.getDateType(), fz.c.ONLY_HOUR), InputDateTimeData.b.c.f203785c, state.getCollisionDataFields().getCrashDateField().getValidationState(), null, null, null, false, crashDateField.getField(), new er.a() { // from class: qf3.c
            @Override // er.a
            public final Object a() {
                return d.l(params);
            }
        }, 481, null);
        Label labelR2 = r(md3.b.K);
        Label labelR3 = r(md3.b.A3);
        CollisionDataScreenContent.DescriptionData descriptionDataM = m(state, params);
        BEVehicleCollisionDescriptionConception.LocationDetails location = state.getCollisionDataFields().getCrashLocationField().getLocation();
        if (location != null) {
            x0.Button button = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(r(md3.b.f125715f), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null));
            Label placeOfName = location.getPlaceOfName();
            if (placeOfName.getText().length() == 0) {
                placeOfName = this.labelProvider.c(md3.b.f125871y3);
            }
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(placeOfName, null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(this.addressFormatter.a(location), "address"), null, null, 0, 0, null, 62, null), 1, null), null, button, null, 2815, null);
        } else {
            defaultSingleCardData = new DefaultSingleCardData(null, params.e(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(r(md3.b.f125879z3), null, c.f166351a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106760e0, null, b.f166350a, null, null, 26, null), 3, null), null, null, 3325, null);
        }
        return new CollisionDataScreenContent(labelR, inputDateTimeData, inputDateTimeData2, labelR2, labelR3, defaultSingleCardData, state.getCollisionDataFields().getCrashLocationField().getValidationState() instanceof hz.b.Invalid ? r(md3.b.f125863x3) : null, descriptionDataM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.f().a();
        return i0.f148189a;
    }

    private final CollisionDataScreenContent.DescriptionData m(of3.b.Initialized initialized, final Params params) {
        CollisionDataFields.InterfaceC4433a.Input crashDescriptionField = initialized.getCollisionDataFields().getCrashDescriptionField();
        Label labelR = r(md3.b.f125799p3);
        Label labelR2 = r(md3.b.f125759k3);
        s.Fix fix = new s.Fix(4);
        Label labelR3 = r(md3.b.f125775m3);
        String strE = c0.e(crashDescriptionField.getValue());
        Label labelR4 = r(md3.b.f125783n3);
        return new CollisionDataScreenContent.DescriptionData(labelR, labelR2, new TextAreaData(null, labelR3, fix, null, u(crashDescriptionField.getValidationState()), strE, false, new t50.a.Visible(1000, null, 2, null), labelR4, 0, null, crashDescriptionField.getField(), new l() { // from class: qf3.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.q(params, (String) obj);
            }
        }, null, 9801, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    private final Label r(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final t50.e u(hz.b bVar) {
        return bVar instanceof hz.b.Invalid ? new t50.e.Error(((hz.b.Invalid) bVar).getMessage()) : new t50.e.Default(null, 1, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public of3.c.a b(Params params) {
        of3.b state = params.getState();
        if (t.c(state, of3.b.a.f145180a)) {
            return of3.c.a.C3607a.f145285a;
        }
        if (!(state instanceof of3.b.Initialized)) {
            throw new oq.p();
        }
        return new of3.c.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(md3.b.f125847v3), null, null, null, 28, null), null, null, null, new ScrollControllerData(((of3.b.Initialized) params.getState()).f(), false, false, 6, null), 29, null), h((of3.b.Initialized) state, params), params.d(), params.a(), params.f());
    }
}
