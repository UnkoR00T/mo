package vj1;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import uj1.d;
import uj1.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zp0.BEUnitDefenceTrainingsByType;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvj1/b;", "Lxw/f;", "Lvj1/b$a;", "Luj1/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Li50/a;", "e", "(Lvj1/b$a;)Li50/a;", "", "Lzp0/s;", "Lkotlin/Function1;", "", "Loq/i0;", "onSelectType", "Ln50/k;", "i", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "", "stringId", "Lmx/a;", "h", "(I)Lmx/a;", "Luj1/e$a$a;", "f", "(Lvj1/b$a;)Luj1/e$a$a;", "a", "Lmx/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: vj1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvj1/b$a;", "", "Luj1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "", "onSelectType", "<init>", "(Luj1/d;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luj1/d;", "c", "()Luj1/d;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSelectType;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = dVar;
            this.onBackClick = aVar;
            this.onSelectType = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<String, i0> b() {
            return this.onSelectType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onSelectType, params.onSelectType);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onSelectType.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onSelectType=" + this.onSelectType + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData e(Params params) {
        return new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), h(ri1.b.H), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.a(), 6, null)), null, 20, null), null, null, null, null, 61, null);
    }

    private final Label h(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final List<k> i(List<BEUnitDefenceTrainingsByType> list, final l<? super String, i0> lVar) {
        List<BEUnitDefenceTrainingsByType> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (final BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType : list2) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: vj1.a
                @Override // er.a
                public final Object a() {
                    return b.l(lVar, bEUnitDefenceTrainingsByType);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(bEUnitDefenceTrainingsByType.getType().getDescription(), "trainingType"), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType) {
        lVar.b(bEUnitDefenceTrainingsByType.getType().getCode());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.a.Types b(Params params) {
        if (params.getState() instanceof d.Types) {
            return new e.a.Types(e(params), h(ri1.b.G), new CardListData(i(((d.Types) params.getState()).a(), params.b()), null, false, null, null, 30, null), params.a());
        }
        throw new p();
    }
}
