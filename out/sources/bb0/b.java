package bb0;

import androidx.compose.ui.graphics.Color;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbb0/b;", "Lxw/f;", "Lbb0/b$a;", "Lab0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lbb0/b$a;)Lab0/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onDeactivate", "onCancelAction", "Lcb4/d;", "h", "(Ler/a;Ler/a;)Lcb4/d;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, ab0.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: bb0.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0019\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b$\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006&"}, d2 = {"Lbb0/b$a;", "", "Lab0/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "logoutAction", "deactivateAction", "changeThemeAction", "goToAboutApp", "goToResetPin", "goToNotifications", "goToBiometrics", "<init>", "(Lab0/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lab0/b;", "getState", "()Lab0/b;", "b", "Ler/a;", "g", "()Ler/a;", "c", "d", "e", "f", "h", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ab0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> logoutAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> deactivateAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> changeThemeAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToAboutApp;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToResetPin;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToNotifications;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToBiometrics;

        public Params(ab0.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, er.a<i0> aVar7) {
            this.state = bVar;
            this.logoutAction = aVar;
            this.deactivateAction = aVar2;
            this.changeThemeAction = aVar3;
            this.goToAboutApp = aVar4;
            this.goToResetPin = aVar5;
            this.goToNotifications = aVar6;
            this.goToBiometrics = aVar7;
        }

        public final er.a<i0> a() {
            return this.changeThemeAction;
        }

        public final er.a<i0> b() {
            return this.deactivateAction;
        }

        public final er.a<i0> c() {
            return this.goToAboutApp;
        }

        public final er.a<i0> d() {
            return this.goToBiometrics;
        }

        public final er.a<i0> e() {
            return this.goToNotifications;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.logoutAction, params.logoutAction) && t.c(this.deactivateAction, params.deactivateAction) && t.c(this.changeThemeAction, params.changeThemeAction) && t.c(this.goToAboutApp, params.goToAboutApp) && t.c(this.goToResetPin, params.goToResetPin) && t.c(this.goToNotifications, params.goToNotifications) && t.c(this.goToBiometrics, params.goToBiometrics);
        }

        public final er.a<i0> f() {
            return this.goToResetPin;
        }

        public final er.a<i0> g() {
            return this.logoutAction;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.logoutAction.hashCode()) * 31) + this.deactivateAction.hashCode()) * 31) + this.changeThemeAction.hashCode()) * 31) + this.goToAboutApp.hashCode()) * 31) + this.goToResetPin.hashCode()) * 31) + this.goToNotifications.hashCode()) * 31) + this.goToBiometrics.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", logoutAction=" + this.logoutAction + ", deactivateAction=" + this.deactivateAction + ", changeThemeAction=" + this.changeThemeAction + ", goToAboutApp=" + this.goToAboutApp + ", goToResetPin=" + this.goToResetPin + ", goToNotifications=" + this.goToNotifications + ", goToBiometrics=" + this.goToBiometrics + ')';
        }
    }

    /* JADX INFO: renamed from: bb0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0444b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0444b f18005a = new C0444b();

        C0444b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1815742163);
            if (p076m2.t.k()) {
                p076m2.t.o(-1815742163, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.settings.mapper.SettingsMapper.invoke.<anonymous> (SettingsMapper.kt:58)");
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
        public static final c f18006a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1473001549);
            if (p076m2.t.k()) {
                p076m2.t.o(1473001549, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.settings.mapper.SettingsMapper.invoke.<anonymous> (SettingsMapper.kt:65)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ab0.c.a b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: bb0.a
            @Override // er.a
            public final Object a() {
                return b.f();
            }
        }), this.labelProvider.c(ia0.a.f90630l), null, null, false, null, 60, null), null, null, null, null, 60, null);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.g(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.f90625i0), null, C0444b.f18005a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106784h0, null, c.f18006a, null, null, 26, null), 3, null), null, null, 3325, null);
        LeadingSection leadingSection = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106790i, null, null, null, null, 30, null), 3, null);
        BodySection bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.f90613c0), null, null, 0, 0, null, 62, null)), null, 5, null);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, params.f(), false, null, null, false, null, null, bodySection, leadingSection, companion.b(), null, 2301, null);
        LeadingSection leadingSection2 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106775g, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, params.d(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.Z), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection2, companion.b(), null, 2301, null);
        LeadingSection leadingSection3 = new LeadingSection(false, null, new n50.i.Icon(jz.a.f106736b0, null, null, null, null, 30, null), 3, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, params.e(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.f90626j), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection3, companion.b(), null, 2301, null);
        LeadingSection leadingSection4 = new LeadingSection(false, null, new n50.i.Icon(jz.a.M, null, null, null, null, 30, null), 3, null);
        return new ab0.c.a.SettingsData(baseScaffoldData, new CardListData(v.s(defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.f90615d0), null, null, 0, 0, null, 62, null)), null, 5, null), leadingSection4, companion.b(), null, 2301, null), new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.N), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.H1, null, null, null, null, 30, null), 3, null), companion.b(), null, 2301, null), new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ia0.a.f90623h0), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106860s, null, null, null, null, 30, null), 3, null), companion.b(), null, 2301, null)), null, false, null, null, 30, null), defaultSingleCardData);
    }

    public final DialogData h(er.a<i0> onDeactivate, er.a<i0> onCancelAction) {
        return new DialogData(h.b.f24985a, this.labelProvider.c(ia0.a.f90621g0), this.labelProvider.c(ia0.a.f90619f0), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90617e0), null, onDeactivate, 2, null), new DialogButtonTextData(this.labelProvider.c(ia0.a.f90628k), null, onCancelAction, 2, null), null, null, 96, null);
    }
}
