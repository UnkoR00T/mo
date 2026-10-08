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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpo1/j;", "Lxw/f;", "Lpo1/j$a;", "Lpo1/c$a;", "<init>", "()V", "params", "e", "(Lpo1/j$a;)Lpo1/c$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, c.Data> {

    /* JADX INFO: renamed from: po1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lpo1/j$a;", "", "Lpo1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Loo1/p$g;", "onChooseDestination", "<init>", "(Lpo1/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpo1/b;", "getState", "()Lpo1/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final po1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<oo1.p.g, oq.i0> onChooseDestination;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(po1.b bVar, er.a<oq.i0> aVar, er.l<? super oo1.p.g, oq.i0> lVar) {
            this.state = bVar;
            this.onBack = aVar;
            this.onChooseDestination = lVar;
        }

        public final er.a<oq.i0> a() {
            return this.onBack;
        }

        public final er.l<oo1.p.g, oq.i0> b() {
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

    private static final DefaultSingleCardData f(final Params params, String str, final oo1.p.g gVar) {
        return new DefaultSingleCardData("card", new er.a() { // from class: po1.i
            @Override // er.a
            public final Object a() {
                return j.h(params, gVar);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(str, ""), null, null, 3, null)), null, 5, null), null, n50.x0.Icon.INSTANCE.b(), null, 2812, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(Params params, oo1.p.g gVar) {
        params.b().b(gVar);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        return new c.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Design System", "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null), new CardListData(pq.v.U0(pq.v.q(f(params, "Typography (1.1.0)", oo1.p.g.x0.f147664a), f(params, "Colors (1.1.9)", oo1.p.g.n.f147622a), f(params, "Controllers (1.1.0)", oo1.p.g.C3667p.f147630a), f(params, "BottomNavigation (1.1)", oo1.p.g.e.f147586a), f(params, "Small Card (1.1)", oo1.p.g.m0.f147620a), f(params, "Status Badge (1.2.0)", oo1.p.g.q0.f147636a), f(params, "Button (1.1)", oo1.p.g.h.f147598a), f(params, "TextInput (1.1.0)", oo1.p.g.t0.f147648a), f(params, "SnackBar (1.1)", oo1.p.g.o0.f147628a), f(params, "Dialog (1.1)", oo1.p.g.q.f147634a), f(params, "Badge (1.0)", oo1.p.g.c.f147578a), f(params, "ResultModal (1.0)", oo1.p.g.i0.f147604a), f(params, "Switch (1.1)", oo1.p.g.r0.f147640a), f(params, "ContentBox (1.0)", oo1.p.g.o.f147626a), f(params, "Accordion (1.1)", oo1.p.g.a.f147570a), f(params, "EmptyStateM (1.1.0)", oo1.p.g.s.f147642a), f(params, "Header (1.1)", oo1.p.g.v.f147654a), f(params, "Icons (1.1.80)", oo1.p.g.x.f147662a), f(params, "InfoRow (1.1)", oo1.p.g.z.f147670a), f(params, "Alert (1.3)", oo1.p.g.b.f147574a), f(params, "ChatBubble (1.0)", oo1.p.g.l.f147614a), f(params, "TextArea (1.1)", oo1.p.g.s0.f147644a), f(params, "Menus (1.1)", oo1.p.g.e0.f147588a), f(params, "ProgressBar (1.1.0)", oo1.p.g.g0.f147596a), f(params, "Bottom Sheet (1.1.0)", oo1.p.g.C3666g.f147594a), f(params, "Bottom Sheet 3 (1.1.0)", oo1.p.g.f.f147590a), f(params, "Custom Icon", oo1.p.g.w.f147658a), f(params, "File Picker (1.1.0)", oo1.p.g.u.f147650a), f(params, "CheckBox (1.2.0)", oo1.p.g.m.f147618a), f(params, "Input Date (1.1.0)", oo1.p.g.a0.f147572a), f(params, "RadioButton (1.1.0) (unmapped)", oo1.p.g.h0.f147600a), f(params, "Buttons (1.1.0)", oo1.p.g.i.f147602a), f(params, "Top App Bar (1.1.0) (unmapped)", oo1.p.g.w0.f147660a), f(params, "Timeline (1.1.0)", oo1.p.g.v0.f147656a), f(params, "SearchBar (1.1)", oo1.p.g.j0.f147608a), f(params, "Time Picker (1.1.0)", oo1.p.g.u0.f147652a), f(params, "Link 1.1.0", oo1.p.g.c0.f147580a), f(params, "DropDownButton (1.1.0)", oo1.p.g.r.f147638a), f(params, "Fab (1.1.0) (unmapped)", oo1.p.g.t.f147646a), f(params, "SingleCard (1.1.0)", oo1.p.g.l0.f147616a), f(params, "CardList (1.1.0)", oo1.p.g.k.f147610a), f(params, "Illustration Page (1.1.0) (unmapped)", oo1.p.g.y.f147666a), f(params, "Service Widget (1.0.0)", oo1.p.g.k0.f147612a), f(params, "Calendar (1.0.0)", oo1.p.g.j.f147606a), f(params, "Statistic Card (1.1.0)", oo1.p.g.p0.f147632a), f(params, "Banner (1.0.0)", oo1.p.g.d.f147582a), f(params, "NavIconAnimated (PoC)", oo1.p.g.f0.f147592a), f(params, "What's new (1.1.0)", oo1.p.g.y0.f147668a)), new b()), null, false, null, null, 30, null), params.a());
    }
}
