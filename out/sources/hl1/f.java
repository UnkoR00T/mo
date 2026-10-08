package hl1;

import er.l;
import fl1.State;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lhl1/f;", "Lxw/f;", "Lhl1/f$a;", "Lfl1/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "z", "(Lhl1/f$a;)Lfl1/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "Lkk1/a;", "", "x", "(Lkk1/a;)I", "titleResId", "v", "headerResId", "", "Lfl1/c$a$a;", "u", "(Lhl1/f$a;)Ljava/util/List;", "fields", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, fl1.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: hl1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b+\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b)\u0010.R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b/\u0010&R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b0\u0010.R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b\u001f\u0010.R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b#\u0010.R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b'\u0010.¨\u00061"}, d2 = {"Lhl1/f$a;", "", "Lfl1/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onFirstNameChanged", "onSecondNameChanged", "onLastNameChanged", "onFamilyNameChanged", "", "onBirthPlaceChanged", "Lkotlin/Function0;", "onBirthDateClicked", "onIdSeriesAndNumberChanged", "onScrolledToField", "backAction", "closeAction", "nextAction", "<init>", "(Lfl1/b;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfl1/b;", "l", "()Lfl1/b;", "b", "Ler/l;", "g", "()Ler/l;", "c", "k", "d", "i", "e", "f", "Ler/a;", "()Ler/a;", "h", "j", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f85242m;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onFirstNameChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onSecondNameChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onLastNameChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onFamilyNameChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onBirthPlaceChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBirthDateClicked;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onIdSeriesAndNumberChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        static {
            int i15 = hz.b.f86845b;
            int i16 = b0.f97726c;
            f85242m = i15 | i15 | i16 | i15 | fz.b.LocalDate.f68860b | i15 | i15 | i16 | i15 | i16 | i15 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, l<? super b0, i0> lVar4, l<? super String, i0> lVar5, er.a<i0> aVar, l<? super b0, i0> lVar6, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onFirstNameChanged = lVar;
            this.onSecondNameChanged = lVar2;
            this.onLastNameChanged = lVar3;
            this.onFamilyNameChanged = lVar4;
            this.onBirthPlaceChanged = lVar5;
            this.onBirthDateClicked = aVar;
            this.onIdSeriesAndNumberChanged = lVar6;
            this.onScrolledToField = aVar2;
            this.backAction = aVar3;
            this.closeAction = aVar4;
            this.nextAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.nextAction;
        }

        public final er.a<i0> d() {
            return this.onBirthDateClicked;
        }

        public final l<String, i0> e() {
            return this.onBirthPlaceChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFirstNameChanged, params.onFirstNameChanged) && t.c(this.onSecondNameChanged, params.onSecondNameChanged) && t.c(this.onLastNameChanged, params.onLastNameChanged) && t.c(this.onFamilyNameChanged, params.onFamilyNameChanged) && t.c(this.onBirthPlaceChanged, params.onBirthPlaceChanged) && t.c(this.onBirthDateClicked, params.onBirthDateClicked) && t.c(this.onIdSeriesAndNumberChanged, params.onIdSeriesAndNumberChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.nextAction, params.nextAction);
        }

        public final l<b0, i0> f() {
            return this.onFamilyNameChanged;
        }

        public final l<b0, i0> g() {
            return this.onFirstNameChanged;
        }

        public final l<b0, i0> h() {
            return this.onIdSeriesAndNumberChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.onFirstNameChanged.hashCode()) * 31) + this.onSecondNameChanged.hashCode()) * 31) + this.onLastNameChanged.hashCode()) * 31) + this.onFamilyNameChanged.hashCode()) * 31) + this.onBirthPlaceChanged.hashCode()) * 31) + this.onBirthDateClicked.hashCode()) * 31) + this.onIdSeriesAndNumberChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public final l<b0, i0> i() {
            return this.onLastNameChanged;
        }

        public final er.a<i0> j() {
            return this.onScrolledToField;
        }

        public final l<b0, i0> k() {
            return this.onSecondNameChanged;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFirstNameChanged=" + this.onFirstNameChanged + ", onSecondNameChanged=" + this.onSecondNameChanged + ", onLastNameChanged=" + this.onLastNameChanged + ", onFamilyNameChanged=" + this.onFamilyNameChanged + ", onBirthPlaceChanged=" + this.onBirthPlaceChanged + ", onBirthDateClicked=" + this.onBirthDateClicked + ", onIdSeriesAndNumberChanged=" + this.onIdSeriesAndNumberChanged + ", onScrolledToField=" + this.onScrolledToField + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85255a;

        static {
            int[] iArr = new int[kk1.a.values().length];
            try {
                iArr[kk1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kk1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85255a = iArr;
        }
    }

    public f(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.g().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.k().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.i().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, String str) {
        params.f().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, String str) {
        params.h().b(c0.g(str));
        return i0.f148189a;
    }

    private final List<fl1.c.Data.Field> u(final Params params) {
        fl1.c.Data.Field field = new fl1.c.Data.Field(il1.a.FIRST_NAME, new fl1.c.Data.Field.InterfaceC1442a.Text(new v50.c.Text(null, this.labelProvider.c(gk1.a.F), null, mx.b.b(c0.e(params.getState().f().d()), "firstName"), params.getState().f().getValidationState(), null, null, new l() { // from class: hl1.a
            @Override // er.l
            public final Object b(Object obj) {
                return f.l(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)));
        fl1.c.Data.Field field2 = new fl1.c.Data.Field(il1.a.SECOND_NAME, new fl1.c.Data.Field.InterfaceC1442a.Text(new v50.c.Text(null, this.labelProvider.c(gk1.a.f73422b0), null, mx.b.b(c0.e(params.getState().j().d()), "secondName"), params.getState().j().getValidationState(), null, null, new l() { // from class: hl1.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.m(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)));
        fl1.c.Data.Field field3 = new fl1.c.Data.Field(il1.a.LAST_NAME, new fl1.c.Data.Field.InterfaceC1442a.Text(new v50.c.Text(null, this.labelProvider.c(gk1.a.P), null, mx.b.b(c0.e(params.getState().h().d()), "lastName"), params.getState().h().getValidationState(), null, null, new l() { // from class: hl1.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.q(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)));
        fl1.c.Data.Field field4 = new fl1.c.Data.Field(il1.a.FAMILY_NAME, new fl1.c.Data.Field.InterfaceC1442a.Text(new v50.c.Text(null, this.labelProvider.c(gk1.a.D), null, mx.b.b(c0.e(params.getState().e().d()), "familyName"), params.getState().e().getValidationState(), null, null, new l() { // from class: hl1.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.r(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)));
        fl1.c.Data.Field field5 = new fl1.c.Data.Field(il1.a.BIRTH_PLACE, new fl1.c.Data.Field.InterfaceC1442a.Text(new v50.c.Text(null, this.labelProvider.c(gk1.a.f73421b), null, mx.b.b(params.getState().d().d(), "birthPlace"), params.getState().d().getValidationState(), null, null, params.e(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)));
        il1.a aVar = il1.a.BIRTH_DATE;
        Label labelC = this.labelProvider.c(gk1.a.f73419a);
        InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
        fz.b.LocalDate localDateD = params.getState().c().d();
        return v.q(field, field2, field3, field4, field5, new fl1.c.Data.Field(aVar, new fl1.c.Data.Field.InterfaceC1442a.DateTime(new InputDateTimeData(null, labelC, localDateD != null ? this.dateFormatter.d(localDateD, fz.c.DOTTED) : null, c5303a, params.getState().c().getValidationState(), null, null, null, false, null, params.d(), 993, null))), new fl1.c.Data.Field(il1.a.ID_SERIES_AND_NUMBER, new fl1.c.Data.Field.InterfaceC1442a.Text(new v50.c.Text(null, this.labelProvider.c(gk1.a.N), null, mx.b.b(c0.e(params.getState().g().d()), "idSeriesAndNumber"), params.getState().g().getValidationState(), null, null, new l() { // from class: hl1.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.s(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null))));
    }

    private final int v(kk1.a aVar) {
        int i15 = b.f85255a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.f73457t;
        }
        if (i15 == 2) {
            return gk1.a.f73461v;
        }
        throw new p();
    }

    private final int x(kk1.a aVar) {
        int i15 = b.f85255a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.f73429f;
        }
        if (i15 == 2) {
            return gk1.a.f73440k0;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public fl1.c.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(x(params.getState().getType())), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(v(params.getState().getType()));
        List<fl1.c.Data.Field> listU = u(params);
        lk1.a scrollToField = params.getState().getScrollToField();
        return new fl1.c.Data(baseScaffoldData, labelC, listU, scrollToField != null ? il1.b.a(scrollToField) : null, params.j(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gk1.a.S), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
