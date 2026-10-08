package eb1;

import androidx.compose.ui.graphics.Color;
import db1.g;
import db1.h;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Leb1/b;", "Lxw/f;", "Leb1/b$a;", "Ldb1/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Leb1/b$a;)Ldb1/h$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: eb1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b#\u0010\u001e¨\u0006$"}, d2 = {"Leb1/b$a;", "", "Ldb1/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCheckDataToSubmitClick", "onCloseClick", "Lkotlin/Function1;", "", "onGoToCeidgClick", "onInformationCloseClick", "onSubmitClick", "<init>", "(Ldb1/g;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldb1/g;", "f", "()Ldb1/g;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCheckDataToSubmitClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onGoToCeidgClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInformationCloseClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSubmitClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super String, i0> lVar, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = gVar;
            this.onCheckDataToSubmitClick = aVar;
            this.onCloseClick = aVar2;
            this.onGoToCeidgClick = lVar;
            this.onInformationCloseClick = aVar3;
            this.onSubmitClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onCheckDataToSubmitClick;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final l<String, i0> c() {
            return this.onGoToCeidgClick;
        }

        public final er.a<i0> d() {
            return this.onInformationCloseClick;
        }

        public final er.a<i0> e() {
            return this.onSubmitClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCheckDataToSubmitClick, params.onCheckDataToSubmitClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onGoToCeidgClick, params.onGoToCeidgClick) && t.c(this.onInformationCloseClick, params.onInformationCloseClick) && t.c(this.onSubmitClick, params.onSubmitClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onCheckDataToSubmitClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onGoToCeidgClick.hashCode()) * 31) + this.onInformationCloseClick.hashCode()) * 31) + this.onSubmitClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCheckDataToSubmitClick=" + this.onCheckDataToSubmitClick + ", onCloseClick=" + this.onCloseClick + ", onGoToCeidgClick=" + this.onGoToCeidgClick + ", onInformationCloseClick=" + this.onInformationCloseClick + ", onSubmitClick=" + this.onSubmitClick + ')';
        }
    }

    /* JADX INFO: renamed from: eb1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1160b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1160b f49192a = new C1160b();

        C1160b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1273987734);
            if (p076m2.t.k()) {
                p076m2.t.o(-1273987734, i15, -1, "pl.gov.coi.mobywatel.feature.company.presentation.welcomepage.mapper.CompanyWelcomePageMapper.invoke.<anonymous> (CompanyWelcomePageMapper.kt:92)");
            }
            long jA = ((ra1.a) rVar.N(ra1.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, String str) {
        params.a().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h.a b(final Params params) {
        g state = params.getState();
        if (state instanceof g.WelcomePageDataInformationInitialized) {
            return new h.a.DataInformationInitialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.d()), this.labelProvider.c(ha1.a.G), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(ha1.a.Q4), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.L4)), new t40.a.C4874a(this.labelProvider.c(ha1.a.O4)), new t40.a.C4874a(this.labelProvider.c(ha1.a.R4)), new t40.a.C4874a(this.labelProvider.c(ha1.a.M4)), new t40.a.C4874a(this.labelProvider.c(ha1.a.K4)), new t40.a.C4874a(this.labelProvider.c(ha1.a.P4)))), this.labelProvider.c(ha1.a.N4), new LinkData(null, this.labelProvider.c(ha1.a.J4), ((g.WelcomePageDataInformationInitialized) params.getState()).getCeidgUrl(), LinkData.EnumC5775a.WEBSITE, false, params.c(), 17, null), params.d());
        }
        if (!(state instanceof g.WelcomePageInitialized)) {
            throw new oq.p();
        }
        return new h.a.WelcomePageInitialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(ha1.a.f82408g5), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.A3, null, C1160b.f49192a, this.labelProvider.c(ha1.a.f82425i6), this.labelProvider.c(ha1.a.f82401f6), null, 34, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.f82385d6), null, 2, null), d.a.f107773a, null, params.e(), 35, null), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.f82409g6)), new t40.a.C4874a(this.labelProvider.c(ha1.a.f82417h6)), new t40.a.C4874a(this.labelProvider.c(ha1.a.f82433j6)))), new LinkData(null, this.labelProvider.c(ha1.a.f82393e6), ((g.WelcomePageInitialized) params.getState()).getCeidgUrl(), LinkData.EnumC5775a.WEBSITE, false, new l() { // from class: eb1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (String) obj);
            }
        }, 17, null));
    }
}
