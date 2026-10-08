package b23;

import a23.d;
import androidx.compose.ui.graphics.Color;
import c23.SafetyGuideNumbersSection;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lb23/b;", "Lxw/f;", "Lb23/b$b;", "La23/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Loq/r;", "", "Lmx/a;", "pair", "", "iconResId", "Lkotlin/Function1;", "Loq/i0;", "dialAction", "Ln50/g;", "f", "(Loq/r;Ljava/lang/Integer;Ler/l;)Ln50/g;", "params", "e", "(Lb23/b$b;)La23/d$a;", "a", "Lmx/c;", "b", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16284c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b23.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lb23/b$b;", "", "La23/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "onDial", "<init>", "(La23/c;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La23/c;", "getState", "()La23/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a23.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onDial;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(a23.c cVar, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = cVar;
            this.onBackAction = aVar;
            this.onDial = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<String, i0> b() {
            return this.onDial;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onDial, params.onDial);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onDial.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onDial=" + this.onDial + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16289a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-499534843);
            if (p076m2.t.k()) {
                p076m2.t.o(-499534843, i15, -1, "pl.gov.coi.mobywatel.feature.safetyguide.presentation.numbers.mapper.SafetyGuideNumbersMapper.toSection.<anonymous>.<anonymous> (SafetyGuideNumbersMapper.kt:131)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData f(final oq.r<String, Label> pair, Integer iconResId, final l<? super String, i0> dialAction) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(pair.c(), "number info " + pair.c()), mx.b.b(fu.r.P(pair.c(), " ", "-", false, 4, null), ""), null, 0, 0, null, 60, null), new n50.b.Title(new SingleCardLabel(pair.d(), null, null, 0, 0, null, 62, null)), null, 4, null), iconResId != null ? new LeadingSection(false, null, new i.Icon(iconResId.intValue(), null, c.f16289a, null, null, 26, null), 3, null) : null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(g13.c.f69687a), c70.a.f23835a.a().y0(pair.d().getText())), k30.d.a.f107773a, null, new er.a() { // from class: b23.a
            @Override // er.a
            public final Object a() {
                return b.h(dialAction, pair);
            }
        }, 35, null)), null, 2303, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, oq.r rVar) {
        lVar.b(rVar.c());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(g13.c.f69719k1), null, null, false, null, 60, null), null, null, null, null, 60, null);
        Label labelC = this.labelProvider.c(g13.c.f69725m1);
        List listE = v.e(y.a("112", this.labelProvider.c(g13.c.f69722l1)));
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(f((oq.r) it.next(), Integer.valueOf(g13.a.f69680a), params.b()));
        }
        SafetyGuideNumbersSection safetyGuideNumbersSection = new SafetyGuideNumbersSection(labelC, null, arrayList);
        Label labelC2 = this.labelProvider.c(g13.c.f69710h1);
        List listQ = v.q(y.a("994", this.labelProvider.c(g13.c.f69731o1)), y.a("993", this.labelProvider.c(g13.c.f69704f1)), y.a("992", this.labelProvider.c(g13.c.f69701e1)), y.a("991", this.labelProvider.c(g13.c.f69698d1)), y.a("987", this.labelProvider.c(g13.c.f69728n1)), y.a("986", this.labelProvider.c(g13.c.f69695c1)));
        ArrayList arrayList2 = new ArrayList(v.y(listQ, 10));
        Iterator it4 = listQ.iterator();
        while (it4.hasNext()) {
            arrayList2.add(f((oq.r) it4.next(), null, params.b()));
        }
        SafetyGuideNumbersSection safetyGuideNumbersSection2 = new SafetyGuideNumbersSection(labelC2, null, arrayList2);
        Label labelC3 = this.labelProvider.c(g13.c.f69716j1);
        Label labelC4 = this.labelProvider.c(g13.c.f69713i1);
        List listQ2 = v.q(y.a("800 702 222", this.labelProvider.c(g13.c.f69707g1)), y.a("116 111", this.labelProvider.c(g13.c.f69689a1)), y.a("116 123", this.labelProvider.c(g13.c.Z0)), y.a("800 121 121", this.labelProvider.c(g13.c.f69692b1)));
        ArrayList arrayList3 = new ArrayList(v.y(listQ2, 10));
        Iterator it5 = listQ2.iterator();
        while (it5.hasNext()) {
            arrayList3.add(f((oq.r) it5.next(), null, params.b()));
        }
        return new d.Data(baseScaffoldData, v.q(safetyGuideNumbersSection, safetyGuideNumbersSection2, new SafetyGuideNumbersSection(labelC3, labelC4, arrayList3)));
    }
}
