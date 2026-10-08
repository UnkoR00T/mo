package rl2;

import dz.e;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.l;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ql2.b;
import ql2.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrl2/a;", "Lxw/f;", "Lrl2/a$a;", "Lql2/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lrl2/a$a;)Lql2/c$a;", "a", "Lmx/c;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: rl2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lrl2/a$a;", "", "Lql2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClickNotifications", "onClickDownload", "<init>", "(Lql2/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lql2/b;", "d", "()Lql2/b;", "b", "Ler/a;", "()Ler/a;", "c", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClickNotifications;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClickDownload;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = bVar;
            this.onBack = aVar;
            this.onClickNotifications = aVar2;
            this.onClickDownload = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClickDownload;
        }

        public final er.a<i0> c() {
            return this.onClickNotifications;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClickNotifications, params.onClickNotifications) && t.c(this.onClickDownload, params.onClickDownload);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClickNotifications.hashCode()) * 31) + this.onClickDownload.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClickNotifications=" + this.onClickNotifications + ", onClickDownload=" + this.onClickDownload + ')';
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        b state = params.getState();
        if ((state instanceof b.Download) || (state instanceof b.Content) || (state instanceof b.Dialog)) {
            b.Dialog dialog = state instanceof b.Dialog ? (b.Dialog) state : null;
            return new c.a.Content(params.a(), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(hl2.a.f85272q), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(hl2.a.f85270o), new CardListData(v.q(new DefaultSingleCardData("number", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hl2.a.f85280y), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getEntry().getEntry().getNumber(), ""), mx.b.b(e.h(state.getEntry().getEntry().getNumber(), 1, Label.INSTANCE.d()), ""), null, 0, 0, null, 60, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("name", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hl2.a.f85265j), null, null, 0, 0, null, 62, null), new n50.b.Title(l.b(mx.b.b(state.getEntry().getEntry().getName(), "name"), null, null, 3, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("office", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(hl2.a.f85264i), null, null, 0, 0, null, 62, null), new n50.b.Title(l.b(mx.b.b(state.getEntry().getEntry().getOffice(), "office"), null, null, 3, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null), new DefaultSingleCardData("notificationsCard", params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(this.labelProvider.c(hl2.a.f85266k), null, null, 3, null)), l.b(this.labelProvider.c(hl2.a.f85271p), null, null, 3, null), 1, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106736b0, null, null, null, null, 30, null), 3, null), x0.Icon.INSTANCE.b(), null, 2300, null), new DefaultSingleCardData("downloadCard", params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(l.b(this.labelProvider.c(hl2.a.f85269n), null, null, 3, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106751d, null, null, null, null, 30, null), 3, null), null, null, 3324, null), dialog != null ? dialog.getDialogVMS() : null);
        }
        if (state instanceof b.Error) {
            return new c.a.Error(((b.Error) state).getError());
        }
        throw new p();
    }
}
