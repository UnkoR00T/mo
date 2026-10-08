package us3;

import androidx.compose.ui.graphics.Color;
import fr.t;
import h30.ButtonData;
import iy.b0;
import iy.c0;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import vs3.PersonalDataScreenData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J³\u0001\u0010\u0017\u001a\u00020\u0016*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lus3/r;", "Lxw/f;", "Lus3/r$a;", "Lts3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lts3/c$b;", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onCaregiverNameChange", "onEmailChange", "onPhoneNumberChange", "onCaregiverSurnameChange", "onTranslatorNameChange", "onTranslatorSurnameChange", "", "onPeselSwitchChange", "Lts3/a;", "dispatchAction", "Lts3/d$a$b;", "I", "(Lts3/c$b;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)Lts3/d$a$b;", "params", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lus3/r$a;)Lts3/d$a;", "a", "Lmx/c;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements xw.f<Params, ts3.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: us3.r$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\"R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b#\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b'\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\"R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b&\u0010\"R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006)"}, d2 = {"Lus3/r$a;", "", "Lts3/c;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onCaregiverNameChange", "onEmailChange", "onPhoneNumberChange", "onCaregiverSurnameChange", "onTranslatorNameChange", "onTranslatorSurnameChange", "", "onPeselSwitchChange", "Lts3/a;", "dispatchAction", "<init>", "(Lts3/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lts3/c;", "i", "()Lts3/c;", "b", "Ler/l;", "()Ler/l;", "c", "d", "f", "e", "g", "h", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ts3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onCaregiverNameChange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onEmailChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onPhoneNumberChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onCaregiverSurnameChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onTranslatorNameChange;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<b0, i0> onTranslatorSurnameChange;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onPeselSwitchChange;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ts3.a, i0> dispatchAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ts3.c cVar, er.l<? super b0, i0> lVar, er.l<? super b0, i0> lVar2, er.l<? super b0, i0> lVar3, er.l<? super b0, i0> lVar4, er.l<? super b0, i0> lVar5, er.l<? super b0, i0> lVar6, er.l<? super Boolean, i0> lVar7, er.l<? super ts3.a, i0> lVar8) {
            this.state = cVar;
            this.onCaregiverNameChange = lVar;
            this.onEmailChange = lVar2;
            this.onPhoneNumberChange = lVar3;
            this.onCaregiverSurnameChange = lVar4;
            this.onTranslatorNameChange = lVar5;
            this.onTranslatorSurnameChange = lVar6;
            this.onPeselSwitchChange = lVar7;
            this.dispatchAction = lVar8;
        }

        public final er.l<ts3.a, i0> a() {
            return this.dispatchAction;
        }

        public final er.l<b0, i0> b() {
            return this.onCaregiverNameChange;
        }

        public final er.l<b0, i0> c() {
            return this.onCaregiverSurnameChange;
        }

        public final er.l<b0, i0> d() {
            return this.onEmailChange;
        }

        public final er.l<Boolean, i0> e() {
            return this.onPeselSwitchChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCaregiverNameChange, params.onCaregiverNameChange) && t.c(this.onEmailChange, params.onEmailChange) && t.c(this.onPhoneNumberChange, params.onPhoneNumberChange) && t.c(this.onCaregiverSurnameChange, params.onCaregiverSurnameChange) && t.c(this.onTranslatorNameChange, params.onTranslatorNameChange) && t.c(this.onTranslatorSurnameChange, params.onTranslatorSurnameChange) && t.c(this.onPeselSwitchChange, params.onPeselSwitchChange) && t.c(this.dispatchAction, params.dispatchAction);
        }

        public final er.l<b0, i0> f() {
            return this.onPhoneNumberChange;
        }

        public final er.l<b0, i0> g() {
            return this.onTranslatorNameChange;
        }

        public final er.l<b0, i0> h() {
            return this.onTranslatorSurnameChange;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onCaregiverNameChange.hashCode()) * 31) + this.onEmailChange.hashCode()) * 31) + this.onPhoneNumberChange.hashCode()) * 31) + this.onCaregiverSurnameChange.hashCode()) * 31) + this.onTranslatorNameChange.hashCode()) * 31) + this.onTranslatorSurnameChange.hashCode()) * 31) + this.onPeselSwitchChange.hashCode()) * 31) + this.dispatchAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ts3.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCaregiverNameChange=" + this.onCaregiverNameChange + ", onEmailChange=" + this.onEmailChange + ", onPhoneNumberChange=" + this.onPhoneNumberChange + ", onCaregiverSurnameChange=" + this.onCaregiverSurnameChange + ", onTranslatorNameChange=" + this.onTranslatorNameChange + ", onTranslatorSurnameChange=" + this.onTranslatorSurnameChange + ", onPeselSwitchChange=" + this.onPeselSwitchChange + ", dispatchAction=" + this.dispatchAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f201240a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-440620978);
            if (p076m2.t.k()) {
                p076m2.t.o(-440620978, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.mapper.PersonalDataScreenMapper.map.<anonymous> (PersonalDataScreenMapper.kt:218)");
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
    static final class c implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f201241a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(705873538);
            if (p076m2.t.k()) {
                p076m2.t.o(705873538, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.mapper.PersonalDataScreenMapper.map.<anonymous> (PersonalDataScreenMapper.kt:225)");
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
    static final class d implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f201242a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1063576695);
            if (p076m2.t.k()) {
                p076m2.t.o(1063576695, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.mapper.PersonalDataScreenMapper.map.<anonymous> (PersonalDataScreenMapper.kt:235)");
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
    static final class e implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f201243a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1862510335);
            if (p076m2.t.k()) {
                p076m2.t.o(1862510335, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitwizard.personaldata.mapper.PersonalDataScreenMapper.map.<anonymous> (PersonalDataScreenMapper.kt:242)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public r(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final ts3.d.a.Initialized I(final ts3.c.Initialized initialized, final er.l<? super b0, i0> lVar, final er.l<? super b0, i0> lVar2, final er.l<? super b0, i0> lVar3, final er.l<? super b0, i0> lVar4, final er.l<? super b0, i0> lVar5, final er.l<? super b0, i0> lVar6, er.l<? super Boolean, i0> lVar7, final er.l<? super ts3.a, i0> lVar8) {
        PersonalDataScreenData.PeselSegmentData peselSegmentData;
        Label labelC = this.labelProvider.c(ir3.a.f96788h0);
        Label labelC2 = this.labelProvider.c(ir3.a.f96779e0);
        Label labelC3 = this.labelProvider.c(ir3.a.f96785g0);
        k30.a.b bVar = k30.a.b.f107765a;
        k30.d.a aVar = k30.d.a.f107773a;
        ButtonData buttonData = new ButtonData(null, null, bVar, new k30.c.WithText(Label.f(this.labelProvider.c(ir3.a.f96793j), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1, null, 2, null), null, 2, null), aVar, null, new er.a() { // from class: us3.a
            @Override // er.a
            public final Object a() {
                return r.J(lVar8, lVar, lVar4);
            }
        }, 35, null);
        boolean caregiverCardExpanded = initialized.getCaregiverCardExpanded();
        Label labelC4 = this.labelProvider.c(ir3.a.f96803m0);
        Label labelC5 = this.labelProvider.c(ir3.a.f96809o0);
        ButtonData buttonData2 = new ButtonData(null, null, bVar, new k30.c.WithText(Label.f(this.labelProvider.c(ir3.a.f96793j), "1", null, 2, null), null, 2, null), aVar, null, new er.a() { // from class: us3.p
            @Override // er.a
            public final Object a() {
                return r.K(lVar8, lVar5, lVar6);
            }
        }, 35, null);
        boolean translatorCardExpanded = initialized.getTranslatorCardExpanded();
        ButtonData buttonData3 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ir3.a.f96838y), null, 2, null), aVar, null, new er.a() { // from class: us3.q
            @Override // er.a
            public final Object a() {
                return r.T(lVar8);
            }
        }, 35, null);
        if (initialized.getPesel() != null) {
            peselSegmentData = new PersonalDataScreenData.PeselSegmentData(this.labelProvider.c(ir3.a.f96794j0), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.f96791i0), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Switch(new s50.a.C4550a(null, initialized.getSharePesel(), false, lVar7, null, null, null, false, 245, null)), null, 2815, null));
        } else {
            peselSegmentData = null;
        }
        Label labelC6 = this.labelProvider.c(ir3.a.f96799l);
        Label labelC7 = this.labelProvider.c(ir3.a.S0);
        Label.Companion companion = Label.INSTANCE;
        v50.c.Text text = new v50.c.Text(null, labelC6, companion.c(), mx.b.b(c0.e(initialized.getEmail()), "email"), initialized.getEmailValidationStateOnChecked(), labelC7, null, new er.l() { // from class: us3.b
            @Override // er.l
            public final Object b(Object obj) {
                return r.U(lVar2, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 0, null, v50.c.Text.a.EMAIL, null, null, 884545, null);
        Label labelC8 = this.labelProvider.c(ir3.a.f96800l0);
        Label labelC9 = this.labelProvider.c(ir3.a.f96797k0);
        return new ts3.d.a.Initialized(new PersonalDataScreenData(labelC, text, new v50.c.Masked(null, labelC8, mx.b.b(c0.e(initialized.getPhoneNumber()), "phoneNumber"), companion.c(), initialized.getPhoneValidationStateOnChecked(), labelC9, null, new er.l() { // from class: us3.c
            @Override // er.l
            public final Object b(Object obj) {
                return r.V(lVar3, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 1, null, 0, null, w50.a.PHONE_COUNTRY_CODE, 491329, null), new v50.c.Text(null, this.labelProvider.c(ir3.a.f96817r), null, mx.b.b(c0.e(initialized.getCaregiverName()), "caregiverName"), initialized.getCaregiverNameValidationStateOnChecked(), null, null, new er.l() { // from class: us3.d
            @Override // er.l
            public final Object b(Object obj) {
                return r.W(lVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 2, null, null, null, null, 1015653, null), new v50.c.Text(null, this.labelProvider.c(ir3.a.f96835x), null, mx.b.b(c0.e(initialized.getCaregiverSurname()), "caregiverSurname"), initialized.getCaregiverSurnameValidationState(), null, null, new er.l() { // from class: us3.e
            @Override // er.l
            public final Object b(Object obj) {
                return r.X(lVar4, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 3, null, null, null, null, 1015653, null), new v50.c.Text(null, this.labelProvider.c(ir3.a.f96817r), null, mx.b.b(c0.e(initialized.getTranslatorName()), "translatorName"), initialized.getTranslatorNameValidationState(), null, null, new er.l() { // from class: us3.f
            @Override // er.l
            public final Object b(Object obj) {
                return r.Y(lVar5, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 4, null, null, null, null, 1015653, null), new v50.c.Text(null, this.labelProvider.c(ir3.a.f96835x), null, mx.b.b(c0.e(initialized.getTranslatorSurname()), "translatorSurname"), initialized.getTranslatorSurnameValidationState(), null, null, new er.l() { // from class: us3.g
            @Override // er.l
            public final Object b(Object obj) {
                return r.Z(lVar6, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 5, null, null, null, null, 1015653, null), labelC3, labelC2, buttonData, caregiverCardExpanded, labelC4, labelC5, buttonData2, translatorCardExpanded, buttonData3, peselSegmentData, new DefaultSingleCardData(null, new er.a() { // from class: us3.h
            @Override // er.a
            public final Object a() {
                return r.L(lVar8);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.f96782f0), null, c.f201241a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, b.f201240a, null, null, 26, null), 3, null), null, null, 3325, null), new DefaultSingleCardData(null, new er.a() { // from class: us3.i
            @Override // er.a
            public final Object a() {
                return r.M(lVar8);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.f96806n0), null, e.f201243a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, d.f201242a, null, null, 26, null), 3, null), null, null, 3325, null), new er.l() { // from class: us3.j
            @Override // er.l
            public final Object b(Object obj) {
                return r.N(initialized, lVar8, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: us3.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.O(lVar8, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: us3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.P(initialized, lVar8, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: us3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.Q(initialized, lVar8, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: us3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.R(initialized, lVar8, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: us3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.S(initialized, lVar8, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(er.l lVar, er.l lVar2, er.l lVar3) {
        lVar.b(new ts3.a.SetCaregiverCardExpanded(false));
        b0.Companion companion = b0.INSTANCE;
        lVar2.b(companion.a());
        lVar3.b(companion.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(er.l lVar, er.l lVar2, er.l lVar3) {
        lVar.b(new ts3.a.SetTranslatorCardExpanded(false));
        b0.Companion companion = b0.INSTANCE;
        lVar2.b(companion.a());
        lVar3.b(companion.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(er.l lVar) {
        lVar.b(new ts3.a.SetCaregiverCardExpanded(true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(er.l lVar) {
        lVar.b(new ts3.a.SetTranslatorCardExpanded(true));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(ts3.c.Initialized initialized, er.l lVar, boolean z15) {
        if (!z15 && c0.e(initialized.getEmail()).length() > 0) {
            lVar.b(ts3.a.r.f191903a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(er.l lVar, boolean z15) {
        if (!z15) {
            lVar.b(ts3.a.s.f191904a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(ts3.c.Initialized initialized, er.l lVar, boolean z15) {
        if (!z15 && c0.e(initialized.getCaregiverName()).length() > 0) {
            lVar.b(ts3.a.p.f191901a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(ts3.c.Initialized initialized, er.l lVar, boolean z15) {
        if (!z15 && c0.e(initialized.getCaregiverSurname()).length() > 0) {
            lVar.b(ts3.a.q.f191902a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(ts3.c.Initialized initialized, er.l lVar, boolean z15) {
        if (!z15 && c0.e(initialized.getTranslatorName()).length() > 0) {
            lVar.b(ts3.a.t.f191905a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(ts3.c.Initialized initialized, er.l lVar, boolean z15) {
        if (!z15 && c0.e(initialized.getTranslatorSurname()).length() > 0) {
            lVar.b(ts3.a.u.f191906a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(er.l lVar) {
        lVar.b(ts3.a.l.f191897a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(er.l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(er.l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(er.l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(er.l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(er.l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(er.l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public ts3.d.a b(Params params) {
        ts3.c state = params.getState();
        if (!(state instanceof ts3.c.Initialized)) {
            if (state instanceof ts3.c.a) {
                return ts3.d.a.C5014a.f191932a;
            }
            throw new oq.p();
        }
        ts3.c.Initialized initialized = (ts3.c.Initialized) params.getState();
        er.l<b0, i0> lVarB = params.b();
        er.l<b0, i0> lVarC = params.c();
        return I(initialized, lVarB, params.d(), params.f(), lVarC, params.g(), params.h(), params.e(), params.a());
    }
}
