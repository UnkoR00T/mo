package pm3;

import er.l;
import fr.t;
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
import om3.d;
import om3.e;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lpm3/b;", "Lxw/f;", "Lpm3/b$a;", "Lom3/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmk3/a;", "Lkotlin/Function1;", "Loq/i0;", "onCardClick", "Ln50/g;", "h", "(Lmk3/a;Ler/l;)Ln50/g;", "params", "f", "(Lpm3/b$a;)Lom3/e$a;", "a", "Lmx/c;", "", "e", "(Lmk3/a;)I", "cardTitleRes", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: pm3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lpm3/b$a;", "", "Lom3/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lmk3/a;", "onCardClick", "<init>", "(Lom3/d;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lom3/d;", "getState", "()Lom3/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<mk3.a, i0> onCardClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, l<? super mk3.a, i0> lVar) {
            this.state = dVar;
            this.onBack = aVar;
            this.onCardClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<mk3.a, i0> b() {
            return this.onCardClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onCardClick, params.onCardClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onCardClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onCardClick=" + this.onCardClick + ')';
        }
    }

    /* JADX INFO: renamed from: pm3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3964b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161104a;

        static {
            int[] iArr = new int[mk3.a.values().length];
            try {
                iArr[mk3.a.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mk3.a.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f161104a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final int e(mk3.a aVar) {
        int i15 = C3964b.f161104a[aVar.ordinal()];
        if (i15 == 1) {
            return fk3.a.f64737y;
        }
        if (i15 == 2) {
            return fk3.a.f64738z;
        }
        throw new p();
    }

    private final DefaultSingleCardData h(final mk3.a aVar, final l<? super mk3.a, i0> lVar) {
        return new DefaultSingleCardData(null, new er.a() { // from class: pm3.a
            @Override // er.a
            public final Object a() {
                return b.i(lVar, aVar);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(e(aVar)), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, mk3.a aVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(fk3.a.B), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(fk3.a.A);
        wq.a<mk3.a> aVarE = mk3.a.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        Iterator<mk3.a> it = aVarE.iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next(), params.b()));
        }
        return new e.Data(baseScaffoldData, labelC, new CardListData(arrayList, null, false, null, null, 30, null));
    }
}
