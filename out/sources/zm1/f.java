package zm1;

import er.l;
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
import x50.NavigationButtonData;
import x50.i;
import xm1.State;
import xw.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzm1/f;", "Lxw/f;", "Lzm1/f$a;", "Lxm1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Liy/b0;", "", "tag", "Lmx/a;", "v", "(Liy/b0;Ljava/lang/String;)Lmx/a;", "params", "l", "(Lzm1/f$a;)Lxm1/c$a;", "a", "Lmx/c;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, xm1.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: zm1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b(\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b)\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b\u001e\u0010-R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b\"\u0010-R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b&\u0010-¨\u0006."}, d2 = {"Lzm1/f$a;", "", "Lxm1/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onFirstNameChanged", "onSecondNameChanged", "onSurnameChanged", "Lxw/g;", "onPeselChanged", "onIdSeriesAndNumberChanged", "Lkotlin/Function0;", "onScrolledToField", "backAction", "closeAction", "nextAction", "<init>", "(Lxm1/b;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxm1/b;", "j", "()Lxm1/b;", "b", "Ler/l;", "d", "()Ler/l;", "c", "h", "i", "e", "f", "g", "Ler/a;", "()Ler/a;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f235667k;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onFirstNameChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onSecondNameChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onSurnameChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<g, i0> onPeselChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onIdSeriesAndNumberChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        static {
            int i15 = b0.f97726c;
            int i16 = hz.b.f86845b;
            f235667k = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, l<? super g, i0> lVar4, l<? super b0, i0> lVar5, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onFirstNameChanged = lVar;
            this.onSecondNameChanged = lVar2;
            this.onSurnameChanged = lVar3;
            this.onPeselChanged = lVar4;
            this.onIdSeriesAndNumberChanged = lVar5;
            this.onScrolledToField = aVar;
            this.backAction = aVar2;
            this.closeAction = aVar3;
            this.nextAction = aVar4;
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

        public final l<b0, i0> d() {
            return this.onFirstNameChanged;
        }

        public final l<b0, i0> e() {
            return this.onIdSeriesAndNumberChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFirstNameChanged, params.onFirstNameChanged) && t.c(this.onSecondNameChanged, params.onSecondNameChanged) && t.c(this.onSurnameChanged, params.onSurnameChanged) && t.c(this.onPeselChanged, params.onPeselChanged) && t.c(this.onIdSeriesAndNumberChanged, params.onIdSeriesAndNumberChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.nextAction, params.nextAction);
        }

        public final l<g, i0> f() {
            return this.onPeselChanged;
        }

        public final er.a<i0> g() {
            return this.onScrolledToField;
        }

        public final l<b0, i0> h() {
            return this.onSecondNameChanged;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onFirstNameChanged.hashCode()) * 31) + this.onSecondNameChanged.hashCode()) * 31) + this.onSurnameChanged.hashCode()) * 31) + this.onPeselChanged.hashCode()) * 31) + this.onIdSeriesAndNumberChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public final l<b0, i0> i() {
            return this.onSurnameChanged;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFirstNameChanged=" + this.onFirstNameChanged + ", onSecondNameChanged=" + this.onSecondNameChanged + ", onSurnameChanged=" + this.onSurnameChanged + ", onPeselChanged=" + this.onPeselChanged + ", onIdSeriesAndNumberChanged=" + this.onIdSeriesAndNumberChanged + ", onScrolledToField=" + this.onScrolledToField + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f235678a;

        static {
            int[] iArr = new int[mm1.a.values().length];
            try {
                iArr[mm1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mm1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f235678a = iArr;
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.h().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, String str) {
        params.i().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, String str) {
        params.f().b(g.b(g.c(c0.g(str))));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    private final Label v(b0 b0Var, String str) {
        return mx.b.b(c0.e(b0Var), str);
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public xm1.c.Data b(final Params params) {
        int i15;
        int i16;
        mx.c cVar = this.labelProvider;
        mm1.a type = params.getState().getType();
        int[] iArr = b.f235678a;
        int i17 = iArr[type.ordinal()];
        if (i17 == 1) {
            i15 = em1.a.f51946b;
        } else {
            if (i17 != 2) {
                throw new p();
            }
            i15 = em1.a.L;
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(i15), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar2 = this.labelProvider;
        int i18 = iArr[params.getState().getType().ordinal()];
        if (i18 == 1) {
            i16 = em1.a.f51960i;
        } else {
            if (i18 != 2) {
                throw new p();
            }
            i16 = em1.a.f51962j;
        }
        Label labelC = cVar2.c(i16);
        an1.c cVar3 = an1.c.FIRST_NAME;
        Label labelC2 = this.labelProvider.c(em1.a.f51976q);
        Label labelV = v(params.getState().c().d(), "firstName");
        hz.b validationState = params.getState().c().getValidationState();
        l lVar = new l() { // from class: zm1.a
            @Override // er.l
            public final Object b(Object obj) {
                return f.m(params, (String) obj);
            }
        };
        v4.t.Companion companion = v4.t.INSTANCE;
        List listQ = v.q(new xm1.c.FieldData(cVar3, new v50.c.Text(null, labelC2, null, labelV, validationState, null, null, lVar, null, false, companion.d(), null, false, null, false, null, null, null, null, null, 1047397, null)), new xm1.c.FieldData(an1.c.SECOND_NAME, new v50.c.Text(null, this.labelProvider.c(em1.a.G), null, v(params.getState().g().d(), "secondName"), params.getState().g().getValidationState(), null, null, new l() { // from class: zm1.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.q(params, (String) obj);
            }
        }, null, false, companion.d(), null, false, null, false, null, null, null, null, null, 1047397, null)), new xm1.c.FieldData(an1.c.SURNAME, new v50.c.Text(null, this.labelProvider.c(em1.a.f51986v), null, v(params.getState().h().d(), "surname"), params.getState().h().getValidationState(), null, null, new l() { // from class: zm1.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.r(params, (String) obj);
            }
        }, null, false, companion.d(), null, false, null, false, null, null, null, null, null, 1047397, null)), new xm1.c.FieldData(an1.c.PESEL, new v50.c.Number(null, this.labelProvider.c(em1.a.B), null, v(params.getState().e().d().getValue(), "pesel"), params.getState().e().getValidationState(), null, null, new l() { // from class: zm1.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.s(params, (String) obj);
            }
        }, null, false, companion.d(), null, false, null, false, null, null, null, null, false, 1047397, null)), new xm1.c.FieldData(an1.c.ID_SERIES_AND_NUMBER, new v50.c.Text(null, this.labelProvider.c(em1.a.f51984u), null, v(params.getState().d().d(), "idSeriesAndNumber"), params.getState().d().getValidationState(), null, null, new l() { // from class: zm1.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.u(params, (String) obj);
            }
        }, null, false, companion.b(), null, false, null, false, null, null, null, null, null, 1047397, null)));
        im1.a scrollToField = params.getState().getScrollToField();
        return new xm1.c.Data(baseScaffoldData, labelC, listQ, scrollToField != null ? an1.b.a(scrollToField) : null, params.g(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(em1.a.f51988w), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
    }
}
