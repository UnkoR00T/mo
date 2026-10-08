package ic3;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import hc3.d;
import hc3.e;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lic3/b;", "Lxw/f;", "Lic3/b$a;", "Lhc3/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ljc3/a;", "Lkotlin/Function1;", "Loq/i0;", "onClick", "Ln50/g;", "f", "(Ljc3/a;Ler/l;)Ln50/g;", "params", "e", "(Lic3/b$a;)Lhc3/e$a;", "a", "Lmx/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ic3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Lic3/b$a;", "", "Lhc3/d;", "state", "Lkotlin/Function1;", "Ljc3/a;", "Loq/i0;", "onCardClick", "Lkotlin/Function0;", "onBack", "<init>", "(Lhc3/d;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhc3/d;", "getState", "()Lhc3/d;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<jc3.a, i0> onCardClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, l<? super jc3.a, i0> lVar, er.a<i0> aVar) {
            this.state = dVar;
            this.onCardClick = lVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<jc3.a, i0> b() {
            return this.onCardClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCardClick, params.onCardClick) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onCardClick.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCardClick=" + this.onCardClick + ", onBack=" + this.onBack + ')';
        }
    }

    /* JADX INFO: renamed from: ic3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2165b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2165b f90923a = new C2165b();

        C2165b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1298143391);
            if (p076m2.t.k()) {
                p076m2.t.o(-1298143391, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.welcome.mapper.WelcomeMapper.invoke.<anonymous>.<anonymous> (WelcomeMapper.kt:45)");
            }
            long jA = ((ja3.a) rVar.N(ja3.c.c())).a();
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

    private final DefaultSingleCardData f(final jc3.a aVar, final l<? super jc3.a, i0> lVar) {
        LeadingSection leadingSection = new LeadingSection(false, null, new i.Icon(aVar.getIconResId(), null, null, null, null, 30, null), 3, null);
        return new DefaultSingleCardData(null, new er.a() { // from class: ic3.a
            @Override // er.a
            public final Object a() {
                return b.h(lVar, aVar);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(this.labelProvider.c(aVar.getTitleResId()), null, null, 3, null)), n50.l.b(this.labelProvider.c(aVar.getDescriptionResId()), null, null, 3, null), 1, null), leadingSection, x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, jc3.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(r93.a.F1), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.R3, null, C2165b.f90923a, cVar.c(r93.a.E1), cVar.c(r93.a.D1), null, 34, null);
        wq.a<jc3.a> aVarG = jc3.a.g();
        ArrayList arrayList = new ArrayList(v.y(aVarG, 10));
        Iterator<jc3.a> it = aVarG.iterator();
        while (it.hasNext()) {
            arrayList.add(f(it.next(), params.b()));
        }
        return new e.Data(baseScaffoldData, icon, arrayList);
    }
}
