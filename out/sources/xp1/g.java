package xp1;

import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxp1/g;", "Lxw/f;", "Lxp1/g$a;", "Lxp1/f$a;", "<init>", "()V", "params", "c", "(Lxp1/g$a;)Lxp1/f$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, f.Data> {

    /* JADX INFO: renamed from: xp1.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lxp1/g$a;", "", "Lxp1/e;", "state", "Lkotlin/Function1;", "Ly30/n$b$b;", "Loq/i0;", "onItemTabClick", "", "onItemFilterClick", "Lkotlin/Function0;", "onCloseClick", "<init>", "(Lxp1/e;Ler/l;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxp1/e;", "d", "()Lxp1/e;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<y30.n.Switch.EnumC5973b, i0> onItemTabClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Integer, i0> onItemFilterClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super y30.n.Switch.EnumC5973b, i0> lVar, er.l<? super Integer, i0> lVar2, er.a<i0> aVar) {
            this.state = state;
            this.onItemTabClick = lVar;
            this.onItemFilterClick = lVar2;
            this.onCloseClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        public final er.l<Integer, i0> b() {
            return this.onItemFilterClick;
        }

        public final er.l<y30.n.Switch.EnumC5973b, i0> c() {
            return this.onItemTabClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onItemTabClick, params.onItemTabClick) && t.c(this.onItemFilterClick, params.onItemFilterClick) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onItemTabClick.hashCode()) * 31) + this.onItemFilterClick.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onItemTabClick=" + this.onItemTabClick + ", onItemFilterClick=" + this.onItemFilterClick + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f.Data b(Params params) {
        y30.n.Switch r15 = new y30.n.Switch(new y30.n.Switch.TabItem(mx.b.b("Left", ""), y30.n.Switch.EnumC5973b.LEFT), new y30.n.Switch.TabItem(mx.b.b("Right", ""), y30.n.Switch.EnumC5973b.RIGHT), params.getState().getSelectedTabItem(), false, params.c(), 8, null);
        List listQ = v.q("Główne", "Tymczasowe", "Niezdeklarowane", "Nieważne");
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(mx.b.b((String) it.next(), ""));
        }
        return new f.Data(r15, new y30.n.Filter(arrayList, params.getState().getSelectedFilterItemIndex(), params.b()), params.a());
    }
}
