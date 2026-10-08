package re3;

import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import qe3.State;
import qe3.d;
import sv0.Insurance;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lre3/b;", "Lxw/f;", "Lre3/b$a;", "Lqe3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lre3/b$a;)Lqe3/d$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: re3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lre3/b$a;", "", "Lqe3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function2;", "Liy/b0;", "Lmx/a;", "onCopyToClipboard", "<init>", "(Lqe3/c;Ler/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqe3/c;", "c", "()Lqe3/c;", "b", "Ler/a;", "()Ler/a;", "Ler/p;", "()Ler/p;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<b0, Label, i0> onCopyToClipboard;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, p<? super b0, ? super Label, i0> pVar) {
            this.state = state;
            this.onClose = aVar;
            this.onCopyToClipboard = pVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public final p<b0, Label, i0> b() {
            return this.onCopyToClipboard;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.onCopyToClipboard, params.onCopyToClipboard);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onCopyToClipboard.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onCopyToClipboard=" + this.onCopyToClipboard + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, b0 b0Var, c cVar) {
        params.b().B(b0Var, cVar.c(md3.b.I4));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        x0.Button button;
        int i15;
        final c cVar = this.labelProvider;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), cVar.c(md3.b.M4), null, null, null, 28, null), null, null, null, null, 61, null);
        Label subtitle = state.getInsuranceDetailsData().getSubtitle();
        List<Insurance> listB = state.getInsuranceDetailsData().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i16 = 0;
        for (Object obj : listB) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            Insurance insurance = (Insurance) obj;
            DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar.c(md3.b.L2), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(insurance.getInsurerName(), "insurerName_" + i16), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            SingleCardLabel singleCardLabel = new SingleCardLabel(cVar.c(md3.b.V2), null, null, 0, 0, null, 62, null);
            b0 insuranceNumber = insurance.getInsuranceNumber();
            BodySection bodySection = new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.d(insuranceNumber != null ? c0.e(insuranceNumber) : null, "insuranceNumber_" + i16), null, null, 0, 0, null, 62, null)), null, 4, null);
            final b0 insuranceNumber2 = insurance.getInsuranceNumber();
            if (insuranceNumber2 != null) {
                x0.Button button2 = new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(cVar.c(md3.b.f125747j), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: re3.a
                    @Override // er.a
                    public final Object a() {
                        return b.f(params, insuranceNumber2, cVar);
                    }
                }, 35, null));
                if (!state.getInsuranceDetailsData().getCopyEnabled()) {
                    button2 = null;
                }
                button = button2;
            } else {
                button = null;
            }
            DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, bodySection, null, button, null, 2815, null);
            SingleCardLabel singleCardLabel2 = new SingleCardLabel(cVar.c(md3.b.L4), null, null, 0, 0, null, 62, null);
            boolean insuranceAddedManually = insurance.getInsuranceAddedManually();
            if (insuranceAddedManually) {
                i15 = md3.b.J4;
            } else {
                if (insuranceAddedManually) {
                    throw new oq.p();
                }
                i15 = md3.b.K4;
            }
            arrayList.add(new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(cVar.c(i15), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
            i16 = i17;
        }
        return new d.Data(baseScaffoldData, subtitle, arrayList);
    }
}
