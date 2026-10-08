package s22;

import eo0.EpuapApplicationType;
import fr.t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import m02.SearchModel;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls22/b;", "Lxw/f;", "Ls22/b$a;", "Lm02/h;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Ls22/b$a;)Lm02/h;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, SearchModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: s22.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Ls22/b$a;", "", "Leo0/a0$a;", "selectedCode", "", "Leo0/a0;", "items", "Lkotlin/Function1;", "Loq/i0;", "onChange", "<init>", "(Leo0/a0$a;Ljava/util/Set;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/a0$a;", "c", "()Leo0/a0$a;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "Ler/l;", "()Ler/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EpuapApplicationType.a selectedCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<EpuapApplicationType> items;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<EpuapApplicationType, i0> onChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(EpuapApplicationType.a aVar, Set<EpuapApplicationType> set, er.l<? super EpuapApplicationType, i0> lVar) {
            this.selectedCode = aVar;
            this.items = set;
            this.onChange = lVar;
        }

        public final Set<EpuapApplicationType> a() {
            return this.items;
        }

        public final er.l<EpuapApplicationType, i0> b() {
            return this.onChange;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EpuapApplicationType.a getSelectedCode() {
            return this.selectedCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.selectedCode == params.selectedCode && t.c(this.items, params.items) && t.c(this.onChange, params.onChange);
        }

        public int hashCode() {
            EpuapApplicationType.a aVar = this.selectedCode;
            return ((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.items.hashCode()) * 31) + this.onChange.hashCode();
        }

        public String toString() {
            return "Params(selectedCode=" + this.selectedCode + ", items=" + this.items + ", onChange=" + this.onChange + ')';
        }
    }

    /* JADX INFO: renamed from: s22.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C4532b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((SearchModel.Item) t16).getIsSelected()), Boolean.valueOf(((SearchModel.Item) t15).getIsSelected()));
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, EpuapApplicationType epuapApplicationType) {
        params.b().b(epuapApplicationType);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SearchModel b(final Params params) {
        Label labelC = this.labelProvider.c(e02.a.M3);
        Set<EpuapApplicationType> setA = params.a();
        ArrayList arrayList = new ArrayList(v.y(setA, 10));
        int i15 = 0;
        for (Object obj : setA) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final EpuapApplicationType epuapApplicationType = (EpuapApplicationType) obj;
            arrayList.add(new SearchModel.Item(mx.b.b(epuapApplicationType.getDescription(), "item" + i15), null, epuapApplicationType.getCode() == params.getSelectedCode(), new er.a() { // from class: s22.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, epuapApplicationType);
                }
            }, 2, null));
            i15 = i16;
        }
        return new SearchModel(labelC, v.U0(arrayList, new C4532b()));
    }
}
