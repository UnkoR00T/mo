package et2;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import er.l;
import fr.t;
import ft2.FilterScreenBottomBarData;
import ft2.FilterScreenData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Let2/e;", "Lxw/f;", "Let2/e$a;", "Lct2/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Ljava/time/LocalDate;", "", "s", "(Ljava/time/LocalDate;)Ljava/lang/String;", "params", "i", "(Let2/e$a;)Lct2/c$a;", "a", "Lmx/c;", "b", "Lez/e;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, ct2.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: et2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Let2/e$a;", "", "Lct2/b;", "state", "Lkotlin/Function1;", "Lft2/b;", "Loq/i0;", "onRadioButtonClick", "Lkotlin/Function0;", "onApplyButtonClick", "onCloseButtonClick", "Lft2/a;", "onDateFieldClicked", "<init>", "(Lct2/b;Ler/l;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lct2/b;", "e", "()Lct2/b;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ct2.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ft2.b, i0> onRadioButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onApplyButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ft2.a, i0> onDateFieldClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ct2.b bVar, l<? super ft2.b, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super ft2.a, i0> lVar2) {
            this.state = bVar;
            this.onRadioButtonClick = lVar;
            this.onApplyButtonClick = aVar;
            this.onCloseButtonClick = aVar2;
            this.onDateFieldClicked = lVar2;
        }

        public final er.a<i0> a() {
            return this.onApplyButtonClick;
        }

        public final er.a<i0> b() {
            return this.onCloseButtonClick;
        }

        public final l<ft2.a, i0> c() {
            return this.onDateFieldClicked;
        }

        public final l<ft2.b, i0> d() {
            return this.onRadioButtonClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ct2.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onRadioButtonClick, params.onRadioButtonClick) && t.c(this.onApplyButtonClick, params.onApplyButtonClick) && t.c(this.onCloseButtonClick, params.onCloseButtonClick) && t.c(this.onDateFieldClicked, params.onDateFieldClicked);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onRadioButtonClick.hashCode()) * 31) + this.onApplyButtonClick.hashCode()) * 31) + this.onCloseButtonClick.hashCode()) * 31) + this.onDateFieldClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onRadioButtonClick=" + this.onRadioButtonClick + ", onApplyButtonClick=" + this.onApplyButtonClick + ", onCloseButtonClick=" + this.onCloseButtonClick + ", onDateFieldClicked=" + this.onDateFieldClicked + ')';
        }
    }

    public e(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.d().b(ft2.b.a.f67009a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params) {
        params.c().b(ft2.a.b.f67008a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.c().b(ft2.a.C1502a.f67007a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.d().b(ft2.b.C1503b.f67010a);
        return i0.f148189a;
    }

    private final String s(LocalDate localDate) {
        if (localDate != null) {
            return this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED);
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ct2.c.a b(final Params params) {
        ct2.b state = params.getState();
        if (t.c(state, ct2.b.a.f37763a)) {
            return ct2.c.a.C0801a.f37771a;
        }
        if (!(state instanceof ct2.b.Initialized)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(rs2.a.E);
        Label labelC2 = this.labelProvider.c(rs2.a.F);
        l<ft2.b, i0> lVarD = params.d();
        FilterScreenBottomBarData filterScreenBottomBarData = new FilterScreenBottomBarData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(rs2.a.f175886a), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null));
        ft2.b id5 = ((ct2.b.Initialized) params.getState()).getId();
        RadioButtonRow radioButtonRow = new RadioButtonRow(new RadioButtonItemData(false, t.c(((ct2.b.Initialized) params.getState()).getId(), ft2.b.a.f67009a), false, 5, null), new er.a() { // from class: et2.a
            @Override // er.a
            public final Object a() {
                return e.l(params);
            }
        }, this.labelProvider.c(rs2.a.E), null, null, 24, null);
        Label labelC3 = this.labelProvider.c(rs2.a.I);
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, t.c(((ct2.b.Initialized) params.getState()).getId(), ft2.b.C1503b.f67010a), false, 5, null);
        Label labelC4 = this.labelProvider.c(rs2.a.H);
        String strS = s(((ct2.b.Initialized) params.getState()).getToDate());
        InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
        return new ct2.c.a.Initialized(new FilterScreenData(labelC, labelC2, new RadioButtonData(v.q(radioButtonRow, new RadioButtonRow(radioButtonItemData, new er.a() { // from class: et2.d
            @Override // er.a
            public final Object a() {
                return e.r(params);
            }
        }, labelC3, null, new dt2.b(new InputDateTimeData(null, this.labelProvider.c(rs2.a.G), s(((ct2.b.Initialized) params.getState()).getFromDate()), c5303a, ((ct2.b.Initialized) params.getState()).getFromDateValidationState(), null, null, null, false, null, new er.a() { // from class: et2.c
            @Override // er.a
            public final Object a() {
                return e.q(params);
            }
        }, 993, null), new InputDateTimeData(null, labelC4, strS, c5303a, ((ct2.b.Initialized) params.getState()).getToDateValidationState(), null, null, null, false, null, new er.a() { // from class: et2.b
            @Override // er.a
            public final Object a() {
                return e.m(params);
            }
        }, 993, null)), 8, null)), b50.e.a.f16684a, null, null, null, this.labelProvider.c(rs2.a.F), null, 92, null), lVarD, filterScreenBottomBarData, id5, new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(rs2.a.F), null, null, null, 28, null), null, null, null, null, 61, null)));
    }
}
