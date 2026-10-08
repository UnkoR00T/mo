package il3;

import er.l;
import fr.t;
import gl3.e;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import mx.Label;
import mx.c;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0014*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lil3/b;", "Lxw/f;", "Lil3/b$a;", "Lgl3/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Llk3/a;", "Lkotlin/Function1;", "Loq/i0;", "onNext", "Ln50/g;", "i", "(Llk3/a;Ler/l;)Ln50/g;", "params", "h", "(Lil3/b$a;)Lgl3/f$a;", "a", "Lmx/c;", "", "f", "(Llk3/a;)I", "titleRes", "e", "descriptionRes", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, gl3.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: il3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lil3/b$a;", "", "Lgl3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onClose", "Lkotlin/Function1;", "Llk3/a;", "onNext", "<init>", "(Lgl3/e;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgl3/e;", "getState", "()Lgl3/e;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<lk3.a, i0> onNext;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super lk3.a, i0> lVar) {
            this.state = eVar;
            this.onBack = aVar;
            this.onClose = aVar2;
            this.onNext = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<lk3.a, i0> c() {
            return this.onNext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onNext, params.onNext);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onNext=" + this.onNext + ')';
        }
    }

    /* JADX INFO: renamed from: il3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2201b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93287a;

        static {
            int[] iArr = new int[lk3.a.values().length];
            try {
                iArr[lk3.a.SELF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lk3.a.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93287a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final int e(lk3.a aVar) {
        int i15 = C2201b.f93287a[aVar.ordinal()];
        if (i15 == 1) {
            return fk3.a.F;
        }
        if (i15 == 2) {
            return fk3.a.D;
        }
        throw new p();
    }

    private final int f(lk3.a aVar) {
        int i15 = C2201b.f93287a[aVar.ordinal()];
        if (i15 == 1) {
            return fk3.a.G;
        }
        if (i15 == 2) {
            return fk3.a.E;
        }
        throw new p();
    }

    private final DefaultSingleCardData i(final lk3.a aVar, final l<? super lk3.a, i0> lVar) {
        return new DefaultSingleCardData(null, new er.a() { // from class: il3.a
            @Override // er.a
            public final Object a() {
                return b.l(lVar, aVar);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(f(aVar)), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(e(aVar)), null, null, 0, 0, null, 62, null), 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l lVar, lk3.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public gl3.f.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(fk3.a.J), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(fk3.a.I);
        wq.a<lk3.a> aVarE = lk3.a.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        Iterator<lk3.a> it = aVarE.iterator();
        while (it.hasNext()) {
            arrayList.add(i(it.next(), params.c()));
        }
        return new gl3.f.Data(baseScaffoldData, labelC, new CardListData(arrayList, null, false, null, null, 30, null), new c30.b.c(null, null, null, this.labelProvider.c(fk3.a.H), null, null, null, 119, null), new c30.b.c(null, null, null, this.labelProvider.c(fk3.a.C), null, null, null, 119, null));
    }
}
