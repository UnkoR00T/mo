package i31;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import h31.d;
import h31.e;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListAccessibilityData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00020\u0017*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Li31/c;", "Lxw/f;", "Li31/c$a;", "Lh31/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "m", "(Li31/c$a;)Lh31/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "", "Ln50/g;", "i", "(Li31/c$a;)Ljava/util/List;", "typeCards", "Lw21/a;", "", "l", "(Lw21/a;)I", "typeLabelResId", "h", "fieldLabelResId", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: i31.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001f\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u001b\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Li31/c$a;", "", "Lh31/d;", "state", "Lkotlin/Function1;", "Lw21/a;", "Loq/i0;", "onTypeChanged", "Liy/b0;", "onInputChanged", "Lkotlin/Function0;", "onDateClick", "onScrolledToField", "onClose", "onNext", "<init>", "(Lh31/d;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh31/d;", "g", "()Lh31/d;", "b", "Ler/l;", "f", "()Ler/l;", "c", "d", "Ler/a;", "()Ler/a;", "e", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<w21.a, i0> onTypeChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onInputChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, l<? super w21.a, i0> lVar, l<? super b0, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = dVar;
            this.onTypeChanged = lVar;
            this.onInputChanged = lVar2;
            this.onDateClick = aVar;
            this.onScrolledToField = aVar2;
            this.onClose = aVar3;
            this.onNext = aVar4;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final er.a<i0> b() {
            return this.onDateClick;
        }

        public final l<b0, i0> c() {
            return this.onInputChanged;
        }

        public final er.a<i0> d() {
            return this.onNext;
        }

        public final er.a<i0> e() {
            return this.onScrolledToField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onTypeChanged, params.onTypeChanged) && t.c(this.onInputChanged, params.onInputChanged) && t.c(this.onDateClick, params.onDateClick) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext);
        }

        public final l<w21.a, i0> f() {
            return this.onTypeChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onTypeChanged.hashCode()) * 31) + this.onInputChanged.hashCode()) * 31) + this.onDateClick.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTypeChanged=" + this.onTypeChanged + ", onInputChanged=" + this.onInputChanged + ", onDateClick=" + this.onDateClick + ", onScrolledToField=" + this.onScrolledToField + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88970a;

        static {
            int[] iArr = new int[w21.a.values().length];
            try {
                iArr[w21.a.PLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w21.a.VIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w21.a.INSURANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f88970a = iArr;
        }
    }

    /* JADX INFO: renamed from: i31.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2092c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2092c f88971a = new C2092c();

        C2092c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1928005774);
            if (p076m2.t.k()) {
                p076m2.t.o(-1928005774, i15, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.welcome.mapper.WelcomeMapper.invoke.<anonymous> (WelcomeMapper.kt:69)");
            }
            long jA = ((y21.a) rVar.N(y21.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public c(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, w21.a aVar) {
        params.f().b(aVar);
        return i0.f148189a;
    }

    private final int h(w21.a aVar) {
        int i15 = b.f88970a[aVar.ordinal()];
        if (i15 == 1) {
            return t21.a.P;
        }
        if (i15 == 2) {
            return t21.a.T;
        }
        if (i15 == 3) {
            return t21.a.M;
        }
        throw new oq.p();
    }

    private final List<DefaultSingleCardData> i(final Params params) {
        wq.a<w21.a> aVarE = w21.a.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        Iterator<w21.a> it = aVarE.iterator();
        while (it.hasNext()) {
            final w21.a next = it.next();
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: i31.b
                @Override // er.a
                public final Object a() {
                    return c.f(params, next);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(l(next)), null, null, 0, 0, j70.a.NORMAL, 30, null)), null, 5, null), new LeadingSection(false, new n50.d.RadioButton(params.getState().getData().getInput().getType() == next, false, 2, null), null, 5, null), null, null, 3325, null));
        }
        return arrayList;
    }

    private final int l(w21.a aVar) {
        int i15 = b.f88970a[aVar.ordinal()];
        if (i15 == 1) {
            return t21.a.Y;
        }
        if (i15 == 2) {
            return t21.a.f187150a0;
        }
        if (i15 == 3) {
            return t21.a.X;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.c().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        d state = params.getState();
        if (state instanceof d.Error) {
            return new e.a.Error(((d.Error) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof d.Screen) && !(state instanceof d.CheckVehicleInsurance)) {
            throw new oq.p();
        }
        Label labelC = this.labelProvider.c(t21.a.W);
        NavigationButtonData navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a());
        j70.a aVar = j70.a.NORMAL;
        return new e.a.Screen(new BaseScaffoldData(null, new i.Small(navigationButtonData, labelC, aVar, null, null, 24, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106780g4, null, C2092c.f88971a, this.labelProvider.c(t21.a.V), this.labelProvider.c(t21.a.U), aVar, 2, null), new e.a.Screen.TypeSection(this.labelProvider.c(t21.a.Z), new CardListData(i(params), null, false, new CardListAccessibilityData(this.labelProvider.c(t21.a.Z), null, 2, null), null, 22, null)), new e.a.Screen.DataSection(this.labelProvider.c(t21.a.Q), new v50.c.Text(null, this.labelProvider.c(h(params.getState().getData().getInput().getType())), null, mx.b.b(c0.e(params.getState().getData().getInput().getValue()), "fieldValue"), params.getState().getData().getInput().getValidationState(), null, null, new l() { // from class: i31.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.q(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null), new InputDateTimeData(null, this.labelProvider.c(t21.a.K), this.dateFormatter.d(params.getState().getData().getDate(), fz.c.DOTTED), InputDateTimeData.b.C5303a.f203783c, null, null, null, null, false, null, params.b(), 1009, null)), params.getState().getData().getScrollToField(), params.e(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(t21.a.f187156d0), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
