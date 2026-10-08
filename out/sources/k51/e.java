package k51;

import bl0.g;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import i51.State;
import iy.c0;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk51/e;", "Lxw/f;", "Lk51/e$a;", "Li51/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lbl0/g;", "Li51/b;", "state", "Lkotlin/Function1;", "Loq/i0;", "onGoToNextStep", "Ln30/b;", "l", "(Ljava/util/List;Li51/b;Ler/l;)Ln30/b;", "params", "i", "(Lk51/e$a;)Li51/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, i51.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k51.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006#"}, d2 = {"Lk51/e$a;", "", "Li51/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onShowDocumentsToReceiveInfo", "Lkotlin/Function1;", "Lbl0/g;", "onGoToNextStep", "onBack", "onExit", "<init>", "(Li51/b;Ler/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li51/b;", "e", "()Li51/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowDocumentsToReceiveInfo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<g, i0> onGoToNextStep;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExit;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super g, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onShowDocumentsToReceiveInfo = aVar;
            this.onGoToNextStep = lVar;
            this.onBack = aVar2;
            this.onExit = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onExit;
        }

        public final l<g, i0> c() {
            return this.onGoToNextStep;
        }

        public final er.a<i0> d() {
            return this.onShowDocumentsToReceiveInfo;
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
            return t.c(this.state, params.state) && t.c(this.onShowDocumentsToReceiveInfo, params.onShowDocumentsToReceiveInfo) && t.c(this.onGoToNextStep, params.onGoToNextStep) && t.c(this.onBack, params.onBack) && t.c(this.onExit, params.onExit);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onShowDocumentsToReceiveInfo.hashCode()) * 31) + this.onGoToNextStep.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onExit.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onShowDocumentsToReceiveInfo=" + this.onShowDocumentsToReceiveInfo + ", onGoToNextStep=" + this.onGoToNextStep + ", onBack=" + this.onBack + ", onExit=" + this.onExit + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108601a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.MyEdorBox.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.InOffice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.MyRegisteredAddress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.SpecifiedAddress.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f108601a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData l(List<? extends g> list, State state, final l<? super g, i0> lVar) {
        DefaultSingleCardData defaultSingleCardData;
        String strE = c0.e(state.getEdorAddress());
        String office = state.getOffice();
        List<? extends g> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i15 = b.f108601a[((g) it.next()).ordinal()];
            if (i15 == 1) {
                n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j31.a.P0), null, null, 0, 0, null, 62, null));
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.labelProvider.c(j31.a.T1).getText());
                Label.Companion companion = Label.INSTANCE;
                sb5.append(companion.a().getText());
                sb5.append(companion.d().getText());
                sb5.append(strE);
                sb5.append('\n');
                sb5.append(this.labelProvider.c(j31.a.O0).getText());
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: k51.a
                    @Override // er.a
                    public final Object a() {
                        return e.m(lVar);
                    }
                }, false, null, null, false, null, null, new BodySection(null, title, new SingleCardLabel(mx.b.b(sb5.toString(), "receive_documents_method_option_epuap_value"), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
            } else if (i15 == 2) {
                n50.b.Title title2 = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j31.a.R0), null, null, 0, 0, null, 62, null));
                StringBuilder sb6 = new StringBuilder();
                sb6.append(this.labelProvider.c(j31.a.Q0).getText());
                Label.Companion companion2 = Label.INSTANCE;
                sb6.append(companion2.a().getText());
                sb6.append(companion2.d().getText());
                sb6.append(office);
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: k51.b
                    @Override // er.a
                    public final Object a() {
                        return e.q(lVar);
                    }
                }, false, null, null, false, null, null, new BodySection(null, title2, new SingleCardLabel(mx.b.b(sb6.toString(), "receive_documents_method_option_office_value"), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
            } else if (i15 == 3) {
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: k51.c
                    @Override // er.a
                    public final Object a() {
                        return e.r(lVar);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j31.a.S0), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
            } else {
                if (i15 != 4) {
                    throw new p();
                }
                defaultSingleCardData = new DefaultSingleCardData(null, new er.a() { // from class: k51.d
                    @Override // er.a
                    public final Object a() {
                        return e.s(lVar);
                    }
                }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j31.a.U0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(j31.a.T0), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
            }
            arrayList.add(defaultSingleCardData);
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar) {
        lVar.b(g.MyEdorBox);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar) {
        lVar.b(g.InOffice);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(l lVar) {
        lVar.b(g.MyRegisteredAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar) {
        lVar.b(g.SpecifiedAddress);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public i51.c.Data b(Params params) {
        Label labelC;
        mx.c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j31.a.M0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        boolean areMultipleChildren = params.getState().getAreMultipleChildren();
        if (areMultipleChildren) {
            labelC = cVar.c(j31.a.W0);
        } else {
            if (areMultipleChildren) {
                throw new p();
            }
            labelC = cVar.c(j31.a.V0);
        }
        return new i51.c.Data(baseScaffoldData, labelC.n("ScreenTitle"), new ButtonTextData("ShowDocumentsToReceiveInfoButton", cVar.c(j31.a.N0), null, null, params.d(), 12, null), l(params.getState().b(), params.getState(), params.c()), params.a());
    }
}
