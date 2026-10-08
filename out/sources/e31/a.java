package e31;

import c30.b;
import d31.Error;
import d31.e;
import d31.g;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJU\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u00020!*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u0004\u0018\u00010!*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010\u0017\u001a\u0004\u0018\u00010**\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020-0\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/¨\u00065"}, d2 = {"Le31/a;", "Lxw/f;", "Le31/a$a;", "Ld31/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ld31/f$a$a;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ln50/g;", "i", "(Ld31/f$a$a;Ler/a;)Ln50/g;", "Lmx/a;", "topBarTitle", "description", "navToFeatureButton", "", "Ld31/g$a$b$a;", "sections", "Lc30/b;", "alertData", "onClose", "Ld31/g$a$b;", "c", "(Lmx/a;Lmx/a;Ln50/g;Ljava/util/List;Lc30/b;Ler/a;)Ld31/g$a$b;", "params", "s", "(Le31/a$a;)Ld31/g$a;", "a", "Lmx/c;", "", "m", "(Ld31/f$a$a;)I", "topBarTitleResId", "h", "(Ld31/f$a$a;)Ljava/lang/Integer;", "descriptionResId", "l", "(Ld31/f$a$a;)Ljava/util/List;", "Lc30/b$c;", "e", "(Ld31/f$a$a;)Lc30/b$c;", "Lt40/a$a;", "f", "()Ljava/util/List;", "collisionBullets", "r", "vehicleBuyBulletsValidOC", "q", "vehicleBuyBulletsInvalidOC", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: e31.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Le31/a$a;", "", "Ld31/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onGoToCollision", "<init>", "(Ld31/f;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld31/f;", "c", "()Ld31/f;", "b", "Ler/a;", "()Ler/a;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d31.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToCollision;

        public Params(d31.f fVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = fVar;
            this.onClose = aVar;
            this.onGoToCollision = aVar2;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final er.a<i0> b() {
            return this.onGoToCollision;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d31.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onGoToCollision, params.onGoToCollision);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onGoToCollision.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onGoToCollision=" + this.onGoToCollision + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final g.a.Initialized c(Label topBarTitle, Label description, DefaultSingleCardData navToFeatureButton, List<g.a.Initialized.Section> sections, b alertData, er.a<i0> onClose) {
        return new g.a.Initialized(new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Large(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), onClose), topBarTitle, null, null, null, 28, null), null, null, null, null, 60, null), description, navToFeatureButton, sections, alertData);
    }

    private final b.c e(d31.f.Initialized.InterfaceC0855a interfaceC0855a) {
        d31.f.Initialized.InterfaceC0855a.Collision collision = interfaceC0855a instanceof d31.f.Initialized.InterfaceC0855a.Collision ? (d31.f.Initialized.InterfaceC0855a.Collision) interfaceC0855a : null;
        if (collision != null) {
            if (!collision.getCanShowAlert()) {
                collision = null;
            }
            if (collision != null) {
                c cVar = this.labelProvider;
                return new b.c(null, null, cVar.c(t21.a.f187161g), cVar.c(t21.a.f187159f), null, null, null, 115, null);
            }
        }
        return null;
    }

    private final List<t40.a.C4874a> f() {
        c cVar = this.labelProvider;
        return v.q(new t40.a.C4874a(cVar.c(t21.a.f187173m)), new t40.a.C4874a(cVar.c(t21.a.f187175n)));
    }

    private final Integer h(d31.f.Initialized.InterfaceC0855a interfaceC0855a) {
        d31.f.Initialized.InterfaceC0855a.Collision collision = interfaceC0855a instanceof d31.f.Initialized.InterfaceC0855a.Collision ? (d31.f.Initialized.InterfaceC0855a.Collision) interfaceC0855a : null;
        if (collision != null) {
            if (!collision.getCanNavigateToCollision()) {
                collision = null;
            }
            if (collision != null) {
                return Integer.valueOf(t21.a.f187165i);
            }
        }
        return null;
    }

    private final DefaultSingleCardData i(d31.f.Initialized.InterfaceC0855a interfaceC0855a, er.a<i0> aVar) {
        d31.f.Initialized.InterfaceC0855a.Collision collision = interfaceC0855a instanceof d31.f.Initialized.InterfaceC0855a.Collision ? (d31.f.Initialized.InterfaceC0855a.Collision) interfaceC0855a : null;
        if (collision != null) {
            if (!collision.getCanNavigateToCollision()) {
                collision = null;
            }
            if (collision != null) {
                return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(t21.a.f187163h), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.B0, null, null, null, null, 30, null), 3, null), new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
            }
        }
        return null;
    }

    private final List<g.a.Initialized.Section> l(d31.f.Initialized.InterfaceC0855a interfaceC0855a) {
        c cVar = this.labelProvider;
        if (interfaceC0855a instanceof d31.f.Initialized.InterfaceC0855a.Collision) {
            return v.q(new g.a.Initialized.Section(cVar.c(t21.a.f187171l), cVar.c(t21.a.f187169k), null, 4, null), new g.a.Initialized.Section(cVar.c(t21.a.f187179p), null, new InfoRowListData(f()), 2, null));
        }
        if (t.c(interfaceC0855a, d31.f.Initialized.InterfaceC0855a.b.f39555a)) {
            return v.q(new g.a.Initialized.Section(cVar.c(t21.a.f187155d), null, new InfoRowListData(r()), 2, null), new g.a.Initialized.Section(cVar.c(t21.a.f187179p), null, new InfoRowListData(q()), 2, null));
        }
        throw new p();
    }

    private final int m(d31.f.Initialized.InterfaceC0855a interfaceC0855a) {
        if (interfaceC0855a instanceof d31.f.Initialized.InterfaceC0855a.Collision) {
            return t21.a.f187177o;
        }
        if (t.c(interfaceC0855a, d31.f.Initialized.InterfaceC0855a.b.f39555a)) {
            return t21.a.f187157e;
        }
        throw new p();
    }

    private final List<t40.a.C4874a> q() {
        c cVar = this.labelProvider;
        return v.q(new t40.a.C4874a(cVar.c(t21.a.f187149a)), new t40.a.C4874a(cVar.c(t21.a.f187151b)));
    }

    private final List<t40.a.C4874a> r() {
        c cVar = this.labelProvider;
        return v.q(new t40.a.C4874a(cVar.c(t21.a.f187153c)), new t40.a.C4874a(cVar.c(t21.a.f187167j)));
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        Label labelC;
        d31.f state = params.getState();
        if (state instanceof Error) {
            return new g.a.Error(((Error) params.getState()).getVmsAdapter());
        }
        if (t.c(state, e.f39550a)) {
            return g.a.c.f39566a;
        }
        if (!(state instanceof d31.f.Initialized)) {
            throw new p();
        }
        d31.f.Initialized.InterfaceC0855a type = ((d31.f.Initialized) params.getState()).getType();
        Label labelC2 = this.labelProvider.c(m(type));
        Integer numH = h(type);
        if (numH != null) {
            labelC = this.labelProvider.c(numH.intValue());
        } else {
            labelC = null;
        }
        return c(labelC2, labelC, i(type, params.b()), l(type), e(type), params.a());
    }
}
