package ky2;

import al0.g;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jy2.State;
import jy2.h;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lky2/a;", "Lxw/f;", "Lky2/a$a;", "Ljy2/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lky2/a$a;)Ljy2/h$a;", "Lal0/g;", "", "", "c", "(Lal0/g;)Ljava/util/List;", "a", "Lmx/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ky2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lky2/a$a;", "", "Ljy2/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCheckAction", "onCloseAction", "<init>", "(Ljy2/g;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljy2/g;", "c", "()Ljy2/g;", "b", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCheckAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onCheckAction = aVar;
            this.onCloseAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onCheckAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
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
            return t.c(this.state, params.state) && t.c(this.onCheckAction, params.onCheckAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onCheckAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCheckAction=" + this.onCheckAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    public final List<Integer> c(g gVar) {
        List listC = v.c();
        listC.add(Integer.valueOf(gv2.a.D2));
        if (gVar instanceof g.b) {
            listC.add(Integer.valueOf(gv2.a.f77325w2));
            listC.add(Integer.valueOf(gv2.a.f77329x2));
        } else {
            boolean z15 = gVar instanceof g.Child;
            if (z15 && !((g.Child) gVar).getIsFingerprintAndSignatureRequired()) {
                listC.add(Integer.valueOf(gv2.a.B2));
                listC.add(Integer.valueOf(gv2.a.C2));
            } else if (z15) {
                listC.add(Integer.valueOf(gv2.a.f77337z2));
                listC.add(Integer.valueOf(gv2.a.C2));
                listC.add(Integer.valueOf(gv2.a.A2));
            } else if (!(gVar instanceof g.Ward) || ((g.Ward) gVar).getIsFingerprintAndSignatureRequired()) {
                listC.add(Integer.valueOf(gv2.a.F2));
                listC.add(Integer.valueOf(gv2.a.I2));
                listC.add(Integer.valueOf(gv2.a.G2));
            } else {
                listC.add(Integer.valueOf(gv2.a.H2));
                listC.add(Integer.valueOf(gv2.a.I2));
            }
        }
        return v.a(listC);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        j.b.c cVar = j.b.c.f164688d;
        Label labelC = this.labelProvider.c(gv2.a.E2);
        List<Integer> listC = c(params.getState().getApplicationOwnerWithAge());
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new t40.a.C4874a(this.labelProvider.c(((Number) it.next()).intValue())));
        }
        return new h.Data(baseScaffoldData, new IconPageData(cVar, labelC, null, null, new InfoRowListData(arrayList), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.f77333y2), null, 2, null), d.a.f107773a, null, params.a(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.f77286n), null, 2, null), new d.Secondary(null, 1, null), null, params.b(), 35, null), null, 4, null), false, 76, null), params.b());
    }
}
