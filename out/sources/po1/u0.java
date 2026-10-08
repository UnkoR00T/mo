package po1;

import i50.BaseScaffoldData;
import java.util.Comparator;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpo1/u0;", "Lxw/f;", "Lpo1/u0$a;", "Lpo1/n0$a;", "<init>", "()V", "params", "e", "(Lpo1/u0$a;)Lpo1/n0$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 implements xw.f<Params, n0.Data> {

    /* JADX INFO: renamed from: po1.u0$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lpo1/u0$a;", "", "Lpo1/m0;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Loo1/p$i;", "onChooseDestination", "<init>", "(Lpo1/m0;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpo1/m0;", "getState", "()Lpo1/m0;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m0 state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<oo1.p.i, oq.i0> onChooseDestination;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(m0 m0Var, er.a<oq.i0> aVar, er.l<? super oo1.p.i, oq.i0> lVar) {
            this.state = m0Var;
            this.onBack = aVar;
            this.onChooseDestination = lVar;
        }

        public final er.a<oq.i0> a() {
            return this.onBack;
        }

        public final er.l<oo1.p.i, oq.i0> b() {
            return this.onChooseDestination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBack, params.onBack) && fr.t.c(this.onChooseDestination, params.onChooseDestination);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onChooseDestination.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onChooseDestination=" + this.onChooseDestination + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            SingleCardLabel singleCardLabel;
            Label label;
            SingleCardLabel singleCardLabel2;
            Label label2;
            n50.b title = ((DefaultSingleCardData) t15).getBodySection().getTitle();
            String text = null;
            n50.b.Title title2 = title instanceof n50.b.Title ? (n50.b.Title) title : null;
            String text2 = (title2 == null || (singleCardLabel2 = title2.getSingleCardLabel()) == null || (label2 = singleCardLabel2.getLabel()) == null) ? null : label2.getText();
            n50.b title3 = ((DefaultSingleCardData) t16).getBodySection().getTitle();
            n50.b.Title title4 = title3 instanceof n50.b.Title ? (n50.b.Title) title3 : null;
            if (title4 != null && (singleCardLabel = title4.getSingleCardLabel()) != null && (label = singleCardLabel.getLabel()) != null) {
                text = label.getText();
            }
            return sq.a.e(text2, text);
        }
    }

    private static final DefaultSingleCardData f(final Params params, String str, final oo1.p.i iVar) {
        return new DefaultSingleCardData("card", new er.a() { // from class: po1.t0
            @Override // er.a
            public final Object a() {
                return u0.h(params, iVar);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(str, ""), null, null, 3, null)), null, 5, null), null, n50.x0.Icon.INSTANCE.b(), null, 2812, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(Params params, oo1.p.i iVar) {
        params.b().b(iVar);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n0.Data b(Params params) {
        return new n0.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Designer (Custom Components)", "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null), new CardListData(pq.v.U0(pq.v.q(f(params, "Heading", oo1.p.i.c.f147682a), f(params, "Hologram Background", oo1.p.i.d.f147684a), f(params, "Hologram Emblem", oo1.p.i.e.f147686a), f(params, "Snackbar (Old)", oo1.p.i.j.f147696a), f(params, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37074a, oo1.p.i.a.f147678a), f(params, "Shortcuts row", oo1.p.i.h.f147692a), f(params, "Loader (Fullscreen)", oo1.p.i.f.f147688a), f(params, "Pin Input Screen", oo1.p.i.g.f147690a), f(params, "Document Card Segment", oo1.p.i.b.f147680a)), new b()), null, false, null, null, 30, null), params.a());
    }
}
