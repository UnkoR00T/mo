package r82;

import androidx.compose.ui.graphics.Color;
import d82.ViolationType;
import er.l;
import er.p;
import fp0.k;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr82/e;", "Lxw/f;", "Lr82/e$a;", "Lq82/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Ld82/a;", "f", "()Ljava/util/List;", "params", "Lq82/c$a$b;", "h", "(Lr82/e$a;)Lq82/c$a$b;", "a", "Lmx/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, q82.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: r82.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lr82/e$a;", "", "Lq82/b;", "state", "Lkotlin/Function1;", "Lfp0/k;", "Loq/i0;", "itemAction", "Lkotlin/Function0;", "onBackClicked", "<init>", "(Lq82/b;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq82/b;", "getState", "()Lq82/b;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q82.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<k, i0> itemAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(q82.b bVar, l<? super k, i0> lVar, er.a<i0> aVar) {
            this.state = bVar;
            this.itemAction = lVar;
            this.onBackClicked = aVar;
        }

        public final l<k, i0> a() {
            return this.itemAction;
        }

        public final er.a<i0> b() {
            return this.onBackClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.itemAction, params.itemAction) && t.c(this.onBackClicked, params.onBackClicked);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.itemAction.hashCode()) * 31) + this.onBackClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", itemAction=" + this.itemAction + ", onBackClicked=" + this.onBackClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f172346a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1689169451);
            if (p076m2.t.k()) {
                p076m2.t.o(-1689169451, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.intro.mapper.GiosIntroMapper.invoke.<anonymous> (GiosIntroMapper.kt:43)");
            }
            long jA = ((n82.a) rVar.N(n82.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<ViolationType> f() {
        return v.q(new ViolationType(k.e.f65842a, this.labelProvider.c(v72.b.f204294s1), this.labelProvider.c(v72.b.f204297t1)), new ViolationType(k.f.f65843a, this.labelProvider.c(v72.b.f204303v1), this.labelProvider.c(v72.b.f204306w1)), new ViolationType(k.d.f65841a, this.labelProvider.c(v72.b.f204312y1), this.labelProvider.c(v72.b.f204315z1)), new ViolationType(k.b.f65839a, this.labelProvider.c(v72.b.f204300u1), null), new ViolationType(k.a.f65838a, this.labelProvider.c(v72.b.f204291r1), null), new ViolationType(new k.Others(Label.INSTANCE.c()), this.labelProvider.c(v72.b.f204309x1), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, ViolationType violationType) {
        params.a().b(violationType.getTag());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, ViolationType violationType) {
        params.a().b(violationType.getTag());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public q82.c.a.Initialized b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(v72.b.f204266j0), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.F3, null, b.f172346a, this.labelProvider.c(v72.b.f204263i0), this.labelProvider.c(v72.b.f204260h0), null, 34, null);
        Label labelC = this.labelProvider.c(v72.b.A1);
        List<ViolationType> listF = f();
        ArrayList arrayList = new ArrayList(v.y(listF, 10));
        for (final ViolationType violationType : listF) {
            arrayList.add(violationType.getSubName() == null ? new DefaultSingleCardData(null, new er.a() { // from class: r82.c
                @Override // er.a
                public final Object a() {
                    return e.i(params, violationType);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(violationType.getName(), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null) : new DefaultSingleCardData(null, new er.a() { // from class: r82.d
                @Override // er.a
                public final Object a() {
                    return e.l(params, violationType);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(violationType.getName(), null, null, 0, 0, null, 62, null)), new SingleCardLabel(violationType.getSubName(), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new q82.c.a.Initialized(baseScaffoldData, icon, labelC, arrayList, params.b());
    }
}
