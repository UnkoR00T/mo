package lf2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import k30.d;
import kf2.h;
import kf2.i;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llf2/a;", "Lxw/f;", "Llf2/a$a;", "Lkf2/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Llf2/a$a;)Lkf2/i$a;", "a", "Lmx/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: lf2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001d\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006&"}, d2 = {"Llf2/a$a;", "", "Lkf2/h;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onEMailChanged", "onPhoneNumberChanged", "onCountryCodeChanged", "Lkotlin/Function0;", "onCloseWithDialogAction", "nextAction", "backAction", "<init>", "(Lkf2/h;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkf2/h;", "g", "()Lkf2/h;", "b", "Ler/l;", "e", "()Ler/l;", "c", "f", "d", "Ler/a;", "()Ler/a;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEMailChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onPhoneNumberChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCountryCodeChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseWithDialogAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = hVar;
            this.onEMailChanged = lVar;
            this.onPhoneNumberChanged = lVar2;
            this.onCountryCodeChanged = lVar3;
            this.onCloseWithDialogAction = aVar;
            this.nextAction = aVar2;
            this.backAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final er.a<i0> c() {
            return this.onCloseWithDialogAction;
        }

        public final l<String, i0> d() {
            return this.onCountryCodeChanged;
        }

        public final l<String, i0> e() {
            return this.onEMailChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEMailChanged, params.onEMailChanged) && t.c(this.onPhoneNumberChanged, params.onPhoneNumberChanged) && t.c(this.onCountryCodeChanged, params.onCountryCodeChanged) && t.c(this.onCloseWithDialogAction, params.onCloseWithDialogAction) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        public final l<String, i0> f() {
            return this.onPhoneNumberChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final h getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onEMailChanged.hashCode()) * 31) + this.onPhoneNumberChanged.hashCode()) * 31) + this.onCountryCodeChanged.hashCode()) * 31) + this.onCloseWithDialogAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEMailChanged=" + this.onEMailChanged + ", onPhoneNumberChanged=" + this.onPhoneNumberChanged + ", onCountryCodeChanged=" + this.onCountryCodeChanged + ", onCloseWithDialogAction=" + this.onCloseWithDialogAction + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f118183a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1713321303);
            if (p076m2.t.k()) {
                p076m2.t.o(-1713321303, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.contactinfo.mapper.InternetContactInfoMapper.invoke.<anonymous> (InternetContactInfoMapper.kt:51)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        h state = params.getState();
        if (!(state instanceof h.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(df2.a.f41384i), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f118183a, null, params.c(), 4, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(df2.a.L);
        Label labelC2 = this.labelProvider.c(df2.a.J);
        er.a<i0> aVarA = params.a();
        Label labelC3 = this.labelProvider.c(df2.a.f41388k);
        v4.t.Companion companion = v4.t.INSTANCE;
        int iD = companion.d();
        h.Initialized initialized = (h.Initialized) state;
        v50.c.Text text = new v50.c.Text(null, labelC3, null, mx.b.b(c0.e(initialized.getEmail().getValue()), "email"), initialized.getContactValidation() instanceof hz.b.Invalid ? initialized.getContactValidation() : initialized.getEmail().getValidationState(), null, null, params.e(), null, false, iD, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 916325, null);
        int iB = companion.b();
        Label labelC4 = this.labelProvider.c(df2.a.f41406t);
        Label labelB = mx.b.b(c0.e(initialized.getCountryCode().getValue()), "countryCode");
        Label labelB2 = mx.b.b(c0.e(initialized.getPhoneNumber().getValue()), "phoneNumber");
        return new i.a.Initialized(baseScaffoldData, labelC, labelC2, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(df2.a.f41402r), null, 2, null), d.a.f107773a, null, params.b(), 35, null), text, new v50.c.PhoneNumber(null, null, labelC4, iB, null, null, labelB, 0, initialized.getCountryCode().getValidationState(), params.d(), null, labelB2, null, initialized.getContactValidation() instanceof hz.b.Invalid ? initialized.getContactValidation() : initialized.getPhoneNumber().getValidationState(), params.f(), null, 38067, null), aVarA);
    }
}
