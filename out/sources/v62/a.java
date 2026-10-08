package v62;

import fr.t;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import u62.d;
import w62.TicketsFaqSection;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv62/a;", "Lxw/f;", "Lv62/a$a;", "Lu62/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lv62/a$a;)Lu62/d$a;", "a", "Lmx/c;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: v62.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lv62/a$a;", "", "Lu62/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Lu62/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu62/c;", "getState", "()Lu62/c;", "b", "Ler/a;", "()Ler/a;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final u62.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(u62.c cVar, er.a<i0> aVar) {
            this.state = cVar;
            this.onClose = aVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        return new d.Data(v.q(new TicketsFaqSection(this.labelProvider.c(o62.a.S), this.labelProvider.c(o62.a.K), null, 4, null), new TicketsFaqSection(this.labelProvider.c(o62.a.V), this.labelProvider.c(o62.a.P), null, 4, null), new TicketsFaqSection(this.labelProvider.c(o62.a.U), this.labelProvider.c(o62.a.M), v.q(this.labelProvider.c(o62.a.N), this.labelProvider.c(o62.a.O))), new TicketsFaqSection(this.labelProvider.c(o62.a.R), this.labelProvider.c(o62.a.H), v.q(this.labelProvider.c(o62.a.I), this.labelProvider.c(o62.a.J))), new TicketsFaqSection(this.labelProvider.c(o62.a.Q), this.labelProvider.c(o62.a.G), null, 4, null), new TicketsFaqSection(this.labelProvider.c(o62.a.T), this.labelProvider.c(o62.a.L), null, 4, null)), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(o62.a.f142744b), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
