package xz1;

import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import un0.ElectionSupportsHistoryGrantedSupportsByAction;
import wz1.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxz1/b;", "Lxw/f;", "Lxz1/b$a;", "Lwz1/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lun0/m;", "Lkotlin/Function1;", "Loq/i0;", "onItemClick", "Ln50/g;", "e", "(Lun0/m;Ler/l;)Ln50/g;", "params", "h", "(Lxz1/b$a;)Lwz1/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: xz1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lxz1/b$a;", "", "Lwz1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Lun0/m;", "onHistorySupportSelectAction", "onInfoAction", "<init>", "(Lwz1/c;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwz1/c;", "d", "()Lwz1/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wz1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ElectionSupportsHistoryGrantedSupportsByAction, i0> onHistorySupportSelectAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInfoAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(wz1.c cVar, er.a<i0> aVar, l<? super ElectionSupportsHistoryGrantedSupportsByAction, i0> lVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onBackAction = aVar;
            this.onHistorySupportSelectAction = lVar;
            this.onInfoAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<ElectionSupportsHistoryGrantedSupportsByAction, i0> b() {
            return this.onHistorySupportSelectAction;
        }

        public final er.a<i0> c() {
            return this.onInfoAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final wz1.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onHistorySupportSelectAction, params.onHistorySupportSelectAction) && t.c(this.onInfoAction, params.onInfoAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onHistorySupportSelectAction.hashCode()) * 31) + this.onInfoAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onHistorySupportSelectAction=" + this.onHistorySupportSelectAction + ", onInfoAction=" + this.onInfoAction + ')';
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final DefaultSingleCardData e(final ElectionSupportsHistoryGrantedSupportsByAction electionSupportsHistoryGrantedSupportsByAction, final l<? super ElectionSupportsHistoryGrantedSupportsByAction, i0> lVar) {
        return new DefaultSingleCardData(null, new er.a() { // from class: xz1.a
            @Override // er.a
            public final Object a() {
                return b.f(lVar, electionSupportsHistoryGrantedSupportsByAction);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(electionSupportsHistoryGrantedSupportsByAction.getActionName(), ""), j70.a.NORMAL, null, 2, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, ElectionSupportsHistoryGrantedSupportsByAction electionSupportsHistoryGrantedSupportsByAction) {
        lVar.b(electionSupportsHistoryGrantedSupportsByAction);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        wz1.c state = params.getState();
        if (state instanceof wz1.c.b) {
            return d.a.b.f216024a;
        }
        if (state instanceof wz1.c.Error) {
            return new d.a.Error(((wz1.c.Error) params.getState()).getErrorVMS());
        }
        if (!(state instanceof wz1.c.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(fz1.a.Q), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.c(), 6, null)), false, null, 52, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(fz1.a.J);
        Label labelC2 = this.labelProvider.c(fz1.a.O);
        Label labelB = mx.b.b(this.dateFormatter.d(new fz.b.OffsetDateTime(((wz1.c.Initialized) params.getState()).getElectionSupportsHistory().getLastUpdatedAt()), fz.c.DOTTED_PLUS_HOUR), "lastUpdateValue");
        List<ElectionSupportsHistoryGrantedSupportsByAction> listA = ((wz1.c.Initialized) params.getState()).getElectionSupportsHistory().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((ElectionSupportsHistoryGrantedSupportsByAction) it.next(), params.b()));
        }
        return new d.a.Initialized(baseScaffoldData, labelC, labelC2, labelB, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
