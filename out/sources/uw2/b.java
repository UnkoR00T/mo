package uw2;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import sw2.State;
import sw2.d;
import sw2.e;
import sw2.e0;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import xw.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Luw2/b;", "Lxw/f;", "Luw2/b$a;", "Lsw2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Luw2/b$a;)Lsw2/d$a;", "a", "Lmx/c;", "Lsw2/e;", "", "e", "(Lsw2/e;)I", "titleResId", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: uw2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b(\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b\"\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b+\u0010.R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b\u001e\u0010.R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b&\u0010.¨\u0006/"}, d2 = {"Luw2/b$a;", "", "Lsw2/c;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onFirstNameChanged", "onSecondNameChanged", "onLastNameChanged", "onFamilyNameChanged", "Lxw/g;", "onPeselChanged", "onBirthPlaceChanged", "Lkotlin/Function0;", "onScrolledToField", "onNextButtonClick", "onBack", "onClose", "<init>", "(Lsw2/c;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsw2/c;", "k", "()Lsw2/c;", "b", "Ler/l;", "e", "()Ler/l;", "c", "j", "d", "f", "h", "g", "Ler/a;", "i", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f201988l;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onFirstNameChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSecondNameChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLastNameChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onFamilyNameChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<g, i0> onPeselChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onBirthPlaceChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        static {
            int i15 = hz.b.f86845b;
            f201988l = i15 | b0.f97726c | i15 | i15 | i15 | i15 | i15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, l<? super String, i0> lVar4, l<? super g, i0> lVar5, l<? super String, i0> lVar6, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onFirstNameChanged = lVar;
            this.onSecondNameChanged = lVar2;
            this.onLastNameChanged = lVar3;
            this.onFamilyNameChanged = lVar4;
            this.onPeselChanged = lVar5;
            this.onBirthPlaceChanged = lVar6;
            this.onScrolledToField = aVar;
            this.onNextButtonClick = aVar2;
            this.onBack = aVar3;
            this.onClose = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<String, i0> b() {
            return this.onBirthPlaceChanged;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final l<String, i0> d() {
            return this.onFamilyNameChanged;
        }

        public final l<String, i0> e() {
            return this.onFirstNameChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFirstNameChanged, params.onFirstNameChanged) && t.c(this.onSecondNameChanged, params.onSecondNameChanged) && t.c(this.onLastNameChanged, params.onLastNameChanged) && t.c(this.onFamilyNameChanged, params.onFamilyNameChanged) && t.c(this.onPeselChanged, params.onPeselChanged) && t.c(this.onBirthPlaceChanged, params.onBirthPlaceChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final l<String, i0> f() {
            return this.onLastNameChanged;
        }

        public final er.a<i0> g() {
            return this.onNextButtonClick;
        }

        public final l<g, i0> h() {
            return this.onPeselChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.onFirstNameChanged.hashCode()) * 31) + this.onSecondNameChanged.hashCode()) * 31) + this.onLastNameChanged.hashCode()) * 31) + this.onFamilyNameChanged.hashCode()) * 31) + this.onPeselChanged.hashCode()) * 31) + this.onBirthPlaceChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public final er.a<i0> i() {
            return this.onScrolledToField;
        }

        public final l<String, i0> j() {
            return this.onSecondNameChanged;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFirstNameChanged=" + this.onFirstNameChanged + ", onSecondNameChanged=" + this.onSecondNameChanged + ", onLastNameChanged=" + this.onLastNameChanged + ", onFamilyNameChanged=" + this.onFamilyNameChanged + ", onPeselChanged=" + this.onPeselChanged + ", onBirthPlaceChanged=" + this.onBirthPlaceChanged + ", onScrolledToField=" + this.onScrolledToField + ", onNextButtonClick=" + this.onNextButtonClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    /* JADX INFO: renamed from: uw2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5250b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f202000a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.GUARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f202000a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final int e(e eVar) {
        int i15 = C5250b.f202000a[eVar.ordinal()];
        if (i15 == 1) {
            return gv2.a.C0;
        }
        if (i15 == 2) {
            return gv2.a.U2;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.h().b(g.b(g.c(c0.g(str))));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        int i15;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e(params.getState().getChildDataRequester())), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        c cVar = this.labelProvider;
        int i16 = C5250b.f202000a[params.getState().getChildDataRequester().ordinal()];
        if (i16 == 1) {
            i15 = gv2.a.E0;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = gv2.a.V2;
        }
        return new d.Data(baseScaffoldData, cVar.c(i15), v.q(new d.FieldData(e0.FIRST_NAME, new v50.c.Text(null, this.labelProvider.c(gv2.a.F), null, mx.b.b(params.getState().f().d(), "name"), params.getState().f().getValidationState(), null, null, params.e(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new d.FieldData(e0.SECOND_NAME, new v50.c.Text(null, this.labelProvider.c(gv2.a.f77231b0), null, mx.b.b(params.getState().j().d(), "secondName"), params.getState().j().getValidationState(), null, null, params.j(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new d.FieldData(e0.LAST_NAME, new v50.c.Text(null, this.labelProvider.c(gv2.a.L), null, mx.b.b(params.getState().g().d(), "surname"), params.getState().g().getValidationState(), null, null, params.f(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new d.FieldData(e0.FAMILY_NAME, new v50.c.Text(null, this.labelProvider.c(gv2.a.f77318v), null, mx.b.b(params.getState().e().d(), "familyName"), params.getState().e().getValidationState(), null, null, params.d(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new d.FieldData(e0.PESEL, new v50.c.Text(null, this.labelProvider.c(gv2.a.T), null, mx.b.b(c0.e(params.getState().h().d().getValue()), "pesel"), params.getState().h().getValidationState(), null, null, new l() { // from class: uw2.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.h(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new d.FieldData(e0.BIRTH_PLACE, new v50.c.Text(null, this.labelProvider.c(gv2.a.f77245e), null, mx.b.b(params.getState().c().d(), "birthPlace"), params.getState().c().getValidationState(), null, null, params.b(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null))), params.getState().getScrollToField(), params.i(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.I), null, 2, null), k30.d.a.f107773a, null, params.g(), 35, null));
    }
}
