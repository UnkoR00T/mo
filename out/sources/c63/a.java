package c63;

import androidx.compose.ui.graphics.Color;
import b63.State;
import d63.SelectLoginMethodScreenData;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.d;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lc63/a;", "Lxw/f;", "Lc63/a$a;", "Ld63/c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "description", "Lkotlin/Function0;", "Loq/i0;", "onClick", "", "isSelected", "Ln50/g;", "c", "(Lmx/a;Lmx/a;Ler/a;Z)Ln50/g;", "params", "e", "(Lc63/a$a;)Ld63/c;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, SelectLoginMethodScreenData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c63.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lc63/a$a;", "", "Lb63/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "showProcessTerminationDialog", "biometricWithoutPinOnSelect", "biometricWithPinOnSelect", "nextButtonOnClick", "<init>", "(Lb63/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb63/b;", "e", "()Lb63/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f23758f = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showProcessTerminationDialog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> biometricWithoutPinOnSelect;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> biometricWithPinOnSelect;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextButtonOnClick;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.showProcessTerminationDialog = aVar;
            this.biometricWithoutPinOnSelect = aVar2;
            this.biometricWithPinOnSelect = aVar3;
            this.nextButtonOnClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.biometricWithPinOnSelect;
        }

        public final er.a<i0> b() {
            return this.biometricWithoutPinOnSelect;
        }

        public final er.a<i0> c() {
            return this.nextButtonOnClick;
        }

        public final er.a<i0> d() {
            return this.showProcessTerminationDialog;
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
            return t.c(this.state, params.state) && t.c(this.showProcessTerminationDialog, params.showProcessTerminationDialog) && t.c(this.biometricWithoutPinOnSelect, params.biometricWithoutPinOnSelect) && t.c(this.biometricWithPinOnSelect, params.biometricWithPinOnSelect) && t.c(this.nextButtonOnClick, params.nextButtonOnClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.showProcessTerminationDialog.hashCode()) * 31) + this.biometricWithoutPinOnSelect.hashCode()) * 31) + this.biometricWithPinOnSelect.hashCode()) * 31) + this.nextButtonOnClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", showProcessTerminationDialog=" + this.showProcessTerminationDialog + ", biometricWithoutPinOnSelect=" + this.biometricWithoutPinOnSelect + ", biometricWithPinOnSelect=" + this.biometricWithPinOnSelect + ", nextButtonOnClick=" + this.nextButtonOnClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f23764a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1847805260);
            if (p076m2.t.k()) {
                p076m2.t.o(-1847805260, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.turnon.selectloginmethod.mapper.SelectLoginMethodMapper.invoke.<anonymous> (SelectLoginMethodMapper.kt:53)");
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
        public static final c f23765a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(99925173);
            if (p076m2.t.k()) {
                p076m2.t.o(99925173, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.biometriclogin.turnon.selectloginmethod.mapper.SelectLoginMethodMapper.invoke.<anonymous> (SelectLoginMethodMapper.kt:54)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData c(Label title, Label description, er.a<i0> onClick, boolean isSelected) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(title, null, null, 0, 0, null, 62, null)), new SingleCardLabel(description, null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, new d.RadioButton(isSelected, false, 2, null), null, 5, null), null, null, 3325, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SelectLoginMethodScreenData b(Params params) {
        return new SelectLoginMethodScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.d()), this.labelProvider.c(c53.a.M0), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106775g, b.f23764a, c.f23765a, this.labelProvider.c(c53.a.H0), null, null, 32, null), new CardListData(v.q(c(this.labelProvider.c(c53.a.G0), this.labelProvider.c(c53.a.F0), params.b(), params.getState().getSelectLoginMethodType() == d63.d.BIOMETRIC_WITHOUT_PIN), c(this.labelProvider.c(c53.a.E0), this.labelProvider.c(c53.a.D0), params.a(), params.getState().getSelectLoginMethodType() == d63.d.BIOMETRIC_WITH_PIN)), null, false, null, null, 30, null), params.getState().getSelectLoginMethodType(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23699j), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), params.d());
    }
}
