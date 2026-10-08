package ns3;

import cj0.ZusEVisitTopic;
import er.l;
import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ms3.e;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lns3/d;", "Lxw/f;", "Lns3/d$a;", "Lms3/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "Lcj0/n;", "", "groupIndex", "Lkotlin/Function1;", "Loq/i0;", "onTopicClick", "Ln50/k;", "f", "(Ljava/util/List;ILer/l;)Ljava/util/List;", "params", "e", "(Lns3/d$a;)Lms3/e$a;", "a", "Lmx/c;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ns3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lns3/d$a;", "", "Lms3/d;", "state", "Lkotlin/Function1;", "Lcj0/n;", "Loq/i0;", "onTopicClick", "<init>", "(Lms3/d;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lms3/d;", "b", "()Lms3/d;", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ms3.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ZusEVisitTopic, i0> onTopicClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(ms3.d dVar, l<? super ZusEVisitTopic, i0> lVar) {
            this.state = dVar;
            this.onTopicClick = lVar;
        }

        public final l<ZusEVisitTopic, i0> a() {
            return this.onTopicClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ms3.d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onTopicClick, params.onTopicClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onTopicClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTopicClick=" + this.onTopicClick + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<k> f(List<ZusEVisitTopic> list, int i15, final l<? super ZusEVisitTopic, i0> lVar) {
        List<ZusEVisitTopic> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i16 = 0;
        for (Object obj : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            final ZusEVisitTopic zusEVisitTopic = (ZusEVisitTopic) obj;
            x0.Icon iconB = x0.Icon.INSTANCE.b();
            String title = zusEVisitTopic.getTitle();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i15);
            sb5.append('_');
            sb5.append(i16);
            n50.b.Title title2 = new n50.b.Title(new SingleCardLabel(mx.b.b(title, sb5.toString()), null, null, 0, 0, null, 62, null));
            SingleCardLabel singleCardLabel = new SingleCardLabel(mx.b.b(zusEVisitTopic.getDescription(), i15 + "_desc" + i16), null, null, 0, 0, null, 62, null);
            if (r.t0(zusEVisitTopic.getDescription())) {
                singleCardLabel = null;
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: ns3.c
                @Override // er.a
                public final Object a() {
                    return d.h(lVar, zusEVisitTopic);
                }
            }, false, null, null, false, null, null, new BodySection(null, title2, singleCardLabel, 1, null), null, iconB, null, 2813, null));
            i16 = i17;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, ZusEVisitTopic zusEVisitTopic) {
        lVar.b(zusEVisitTopic);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        if (!(params.getState() instanceof ms3.d.Initialized)) {
            return e.a.b.f128080a;
        }
        List<ZusEVisitTopic> listA = ((ms3.d.Initialized) params.getState()).a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!r.d0(((ZusEVisitTopic) next).getCode().getValue(), "PJM_", false, 2, null)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        os3.a aVar = arrayList != null ? new os3.a(this.labelProvider.c(ir3.a.K1), f(arrayList, 0, params.a())) : null;
        List<ZusEVisitTopic> listA2 = ((ms3.d.Initialized) params.getState()).a();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listA2) {
            if (r.d0(((ZusEVisitTopic) obj).getCode().getValue(), "PJM_", false, 2, null)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        return new e.a.Displayed(aVar, arrayList2 != null ? new os3.a(this.labelProvider.c(ir3.a.N1), f(arrayList2, 1, params.a())) : null);
    }
}
