package kb3;

import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import ib3.l;
import ib3.m;
import iy.c0;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0012\u001a\u00020\u0011*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u0016\u001a\u00020\u0011*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkb3/e;", "Lxw/f;", "Lkb3/e$a;", "Lib3/m$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lib3/l$b;", "Lkotlin/Function1;", "", "Loq/i0;", "onChecked", "", "onChanged", "Lkotlin/Function0;", "onScrolledToField", "Lr30/a;", "i", "(Lib3/l$b;Ler/l;Ler/l;Ler/a;)Lr30/a;", "Lxw/h;", "onPhoneNumberChanged", "m", "params", "u", "(Lkb3/e$a;)Lib3/m$a;", "a", "Lmx/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, m.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: kb3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010#R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b%\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b\u001c\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b \u0010*R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b&\u0010*¨\u0006+"}, d2 = {"Lkb3/e$a;", "", "Lib3/l;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onEmailChecked", "", "onEmailChanged", "onPhoneNumberChecked", "Lxw/h;", "onPhoneNumberChanged", "Lkotlin/Function0;", "onScrolledToField", "onBack", "onClose", "onNext", "<init>", "(Lib3/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lib3/l;", "i", "()Lib3/l;", "b", "Ler/l;", "d", "()Ler/l;", "c", "g", "e", "f", "Ler/a;", "h", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onEmailChecked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onEmailChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onPhoneNumberChecked;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<PhoneNumber, i0> onPhoneNumberChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(l lVar, er.l<? super Boolean, i0> lVar2, er.l<? super String, i0> lVar3, er.l<? super Boolean, i0> lVar4, er.l<? super PhoneNumber, i0> lVar5, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = lVar;
            this.onEmailChecked = lVar2;
            this.onEmailChanged = lVar3;
            this.onPhoneNumberChecked = lVar4;
            this.onPhoneNumberChanged = lVar5;
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

        public final er.l<String, i0> c() {
            return this.onEmailChanged;
        }

        public final er.l<Boolean, i0> d() {
            return this.onEmailChecked;
        }

        public final er.a<i0> e() {
            return this.onNext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEmailChecked, params.onEmailChecked) && t.c(this.onEmailChanged, params.onEmailChanged) && t.c(this.onPhoneNumberChecked, params.onPhoneNumberChecked) && t.c(this.onPhoneNumberChanged, params.onPhoneNumberChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext);
        }

        public final er.l<PhoneNumber, i0> f() {
            return this.onPhoneNumberChanged;
        }

        public final er.l<Boolean, i0> g() {
            return this.onPhoneNumberChecked;
        }

        public final er.a<i0> h() {
            return this.onScrolledToField;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onEmailChecked.hashCode()) * 31) + this.onEmailChanged.hashCode()) * 31) + this.onPhoneNumberChecked.hashCode()) * 31) + this.onPhoneNumberChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final l getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEmailChecked=" + this.onEmailChecked + ", onEmailChanged=" + this.onEmailChanged + ", onPhoneNumberChecked=" + this.onPhoneNumberChecked + ", onPhoneNumberChanged=" + this.onPhoneNumberChanged + ", onScrolledToField=" + this.onScrolledToField + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CheckBoxRowData i(final l.Initialized initialized, er.l<? super Boolean, i0> lVar, final er.l<? super String, i0> lVar2, final er.a<i0> aVar) {
        return new CheckBoxRowData(null, initialized.getEmail().getIsChecked(), lVar, this.labelProvider.c(r93.a.f172477g0), null, null, null, y2.m.b(-1705715635, true, new p() { // from class: kb3.c
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return e.l(this.f109770a, initialized, lVar2, aVar, (r) obj, ((Integer) obj2).intValue());
            }
        }), 113, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e eVar, l.Initialized initialized, er.l lVar, er.a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1705715635, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.contactdetails.mapper.TripContactDetailsMapper.getEmailField.<anonymous> (TripContactDetailsMapper.kt:107)");
            }
            ib3.b.b(new v50.c.Text(null, eVar.labelProvider.c(r93.a.f172515t), null, mx.b.b(initialized.getEmail().getValue(), "email"), initialized.getEmail().getValidationState(), null, null, lVar, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null), initialized.getScrollToField() == lb3.a.Email, aVar, rVar, v50.c.Text.P);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private final CheckBoxRowData m(final l.Initialized initialized, er.l<? super Boolean, i0> lVar, final er.l<? super PhoneNumber, i0> lVar2, final er.a<i0> aVar) {
        return new CheckBoxRowData(null, initialized.getPhoneNumber().getIsChecked(), lVar, this.labelProvider.c(r93.a.f172486j0), null, null, null, y2.m.b(-1352864142, true, new p() { // from class: kb3.d
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return e.q(this.f109774a, initialized, lVar2, aVar, (r) obj, ((Integer) obj2).intValue());
            }
        }), 113, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(e eVar, final l.Initialized initialized, final er.l lVar, er.a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1352864142, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.contactdetails.mapper.TripContactDetailsMapper.getPhoneNumberField.<anonymous> (TripContactDetailsMapper.kt:129)");
            }
            Label labelC = eVar.labelProvider.c(r93.a.L);
            Label labelB = mx.b.b(c0.e(initialized.getPhoneNumber().getValue().h()), "countryCode");
            Label labelB2 = mx.b.b(c0.e(initialized.getPhoneNumber().getValue().g()), "phoneNumber");
            hz.b prefixValidationState = initialized.getPhoneNumber().getPrefixValidationState();
            hz.b numberValidationState = initialized.getPhoneNumber().getNumberValidationState();
            boolean zW = rVar.W(lVar) | rVar.G(initialized);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: kb3.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.r(lVar, initialized, (String) obj);
                    }
                };
                rVar.v(objE);
            }
            er.l lVar2 = (er.l) objE;
            boolean zW2 = rVar.W(lVar) | rVar.G(initialized);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: kb3.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.s(lVar, initialized, (String) obj);
                    }
                };
                rVar.v(objE2);
            }
            ib3.b.b(new v50.c.PhoneNumber(null, null, labelC, 0, null, null, labelB, 0, prefixValidationState, lVar2, null, labelB2, null, numberValidationState, (er.l) objE2, null, 38075, null), initialized.getScrollToField() == lb3.a.PhoneNumber || initialized.getScrollToField() == lb3.a.PhonePrefix, aVar, rVar, v50.c.PhoneNumber.M);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(er.l lVar, l.Initialized initialized, String str) {
        lVar.b(PhoneNumber.e(initialized.getPhoneNumber().getValue(), PhoneNumber.c.c(c0.g(str)), null, 2, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(er.l lVar, l.Initialized initialized, String str) {
        lVar.b(PhoneNumber.e(initialized.getPhoneNumber().getValue(), null, PhoneNumber.b.c(c0.g(str)), 1, null));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public m.a b(Params params) {
        r30.b error;
        l state = params.getState();
        if (t.c(state, l.a.f90805a)) {
            return m.a.b.f90829a;
        }
        if (!(state instanceof l.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(r93.a.f172489k0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(r93.a.f172480h0);
        Label labelC2 = this.labelProvider.c(r93.a.f172474f0);
        List listQ = v.q(i((l.Initialized) params.getState(), params.d(), params.c(), params.h()), m((l.Initialized) params.getState(), params.g(), params.f(), params.h()));
        r30.c cVar = r30.c.CONTENT_BOX;
        hz.b groupValidationState = ((l.Initialized) params.getState()).getGroupValidationState();
        if (t.c(groupValidationState, hz.b.C2039b.f86846c) || t.c(groupValidationState, hz.b.d.f86848c)) {
            error = r30.b.a.f171263a;
        } else {
            if (!(groupValidationState instanceof hz.b.Invalid)) {
                throw new oq.p();
            }
            error = new r30.b.Error(null, ((hz.b.Invalid) groupValidationState).getMessage(), 1, null);
        }
        return new m.a.Initialized(baseScaffoldData, labelC, labelC2, new CheckBoxGroupData(listQ, null, error, cVar, false, null, 50, null), ((l.Initialized) params.getState()).getScrollToField() == lb3.a.Group, params.h(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(r93.a.E), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null));
    }
}
