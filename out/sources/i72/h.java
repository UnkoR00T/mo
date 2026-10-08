package i72;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li72/h;", "Lxw/f;", "Li72/h$a;", "Li72/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Li72/h$a;)Li72/f$a;", "", "e", "()Ljava/lang/String;", "a", "Lmx/c;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: i72.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Li72/h$a;", "", "Li72/e;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onVoivodeshipChosen", "Lkotlin/Function0;", "onCloseButtonAction", "<init>", "(Li72/e;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li72/e;", "c", "()Li72/e;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onVoivodeshipChosen;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseButtonAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super String, i0> lVar, er.a<i0> aVar) {
            this.state = state;
            this.onVoivodeshipChosen = lVar;
            this.onCloseButtonAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseButtonAction;
        }

        public final er.l<String, i0> b() {
            return this.onVoivodeshipChosen;
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
            return t.c(this.state, params.state) && t.c(this.onVoivodeshipChosen, params.onVoivodeshipChosen) && t.c(this.onCloseButtonAction, params.onCloseButtonAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onVoivodeshipChosen.hashCode()) * 31) + this.onCloseButtonAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onVoivodeshipChosen=" + this.onVoivodeshipChosen + ", onCloseButtonAction=" + this.onCloseButtonAction + ')';
        }
    }

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, Label label) {
        params.b().b(label.getText());
        return i0.f148189a;
    }

    public final String e() {
        return this.labelProvider.c(a72.c.f4043l).getText();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f.Data b(final Params params) {
        List<Label> listD = this.labelProvider.d(a72.a.f4014a);
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        for (final Label label : listD) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: i72.g
                @Override // er.a
                public final Object a() {
                    return h.h(params, label);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(label, null, null, 3, null)), null, 5, null), null, t.c(params.getState().getSelectedVoivodeship(), label.getText()) ? x0.Icon.INSTANCE.a() : null, null, 2813, null));
        }
        return new f.Data(new CardListData(arrayList, null, false, null, null, 30, null), new BaseScaffoldData(null, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(a72.c.f4046m0), null, null, false, null, 60, null), null, null, null, null, 61, null));
    }
}
