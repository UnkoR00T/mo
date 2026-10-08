package td2;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import l3.o;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p079n1.k3;
import p079n1.l3;
import sd2.State;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltd2/d;", "Lxw/f;", "Ltd2/d$a;", "Lsd2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Ltd2/d$a;)Lsd2/c$a;", "a", "Lmx/c;", "idverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, sd2.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: td2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u0018\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"Ltd2/d$a;", "", "Lsd2/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onFieldChanged", "Lkotlin/Function0;", "onScrolledToField", "backAction", "nextAction", "<init>", "(Lsd2/b;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsd2/b;", "e", "()Lsd2/b;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "d", "()Ler/a;", "idverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f189756f = hz.b.f86845b | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onFieldChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super b0, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onFieldChanged = lVar;
            this.onScrolledToField = aVar;
            this.backAction = aVar2;
            this.nextAction = aVar3;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final l<b0, i0> c() {
            return this.onFieldChanged;
        }

        public final er.a<i0> d() {
            return this.onScrolledToField;
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
            return t.c(this.state, params.state) && t.c(this.onFieldChanged, params.onFieldChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.backAction, params.backAction) && t.c(this.nextAction, params.nextAction);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onFieldChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFieldChanged=" + this.onFieldChanged + ", onScrolledToField=" + this.onScrolledToField + ", backAction=" + this.backAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f189762a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-237735827);
            if (p076m2.t.k()) {
                p076m2.t.o(-237735827, i15, -1, "pl.gov.coi.mobywatel.feature.idverification.presentation.welcome.mapper.WelcomeMapper.invoke.<anonymous> (WelcomeMapper.kt:51)");
            }
            long jA = ((od2.a) rVar.N(od2.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.c().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l3 l(final Params params, final o oVar) {
        return new l3(new l() { // from class: td2.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(oVar, params, (k3) obj);
            }
        }, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(o oVar, Params params, k3 k3Var) {
        o.g(oVar, false, 1, null);
        params.b().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public sd2.c.Data b(final Params params) {
        return new sd2.c.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(md2.a.f125660a), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106764e4, null, b.f189762a, this.labelProvider.c(md2.a.f125663d), this.labelProvider.c(md2.a.f125661b), null, 34, null), new v50.c.Text(null, this.labelProvider.c(md2.a.f125662c), null, mx.b.b(c0.e(params.getState().getSeriesAndNumber()), "seriesAndNumber"), params.getState().getValidationState(), null, null, new l() { // from class: td2.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(params, (String) obj);
            }
        }, null, false, v4.t.INSTANCE.b(), new l() { // from class: td2.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (o) obj);
            }
        }, false, null, false, null, null, null, null, null, 1045349, null), params.getState().getScrollToField(), params.d(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(md2.a.f125660a), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
    }
}
