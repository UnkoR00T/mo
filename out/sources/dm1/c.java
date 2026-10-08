package dm1;

import bm1.Loading;
import bm1.d;
import bm1.i;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ldm1/c;", "Lxw/f;", "Ldm1/c$a;", "Lbm1/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Ldm1/c$a;)Lbm1/i$a;", "a", "Lmx/c;", "Lkk1/a;", "", "f", "(Lkk1/a;)I", "headerResId", "c", "alertResId", "", "e", "(Lkk1/a;)Ljava/util/List;", "bulletResIds", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: dm1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ldm1/c$a;", "", "Lbm1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "nextAction", "<init>", "(Lbm1/d;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm1/d;", "c", "()Lbm1/d;", "b", "Ler/a;", "()Ler/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = dVar;
            this.backAction = aVar;
            this.nextAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.nextAction, params.nextAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43473a;

        static {
            int[] iArr = new int[kk1.a.values().length];
            try {
                iArr[kk1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kk1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43473a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final int c(kk1.a aVar) {
        int i15 = b.f43473a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.G0;
        }
        if (i15 == 2) {
            return gk1.a.K0;
        }
        throw new p();
    }

    private final List<Integer> e(kk1.a aVar) {
        int i15 = b.f43473a[aVar.ordinal()];
        if (i15 == 1) {
            return v.q(Integer.valueOf(gk1.a.H0), Integer.valueOf(gk1.a.F0));
        }
        if (i15 == 2) {
            return v.q(Integer.valueOf(gk1.a.L0), Integer.valueOf(gk1.a.F0));
        }
        throw new p();
    }

    private final int f(kk1.a aVar) {
        int i15 = b.f43473a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.I0;
        }
        if (i15 == 2) {
            return gk1.a.M0;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        d state = params.getState();
        if (state instanceof d.a) {
            return new i.a.Error(((d.a) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof Loading) && !(state instanceof d.Initialized) && !(state instanceof bm1.Loading) && !(state instanceof d.InitializedWithTrustedProfile)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gk1.a.J0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(f(params.getState().getType()));
        List<Integer> listE = e(params.getState().getType());
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new t40.a.C4874a(this.labelProvider.c(((Number) it.next()).intValue())));
        }
        return new i.a.Screen(baseScaffoldData, labelC, new InfoRowListData(arrayList), new c30.b.c(null, null, null, this.labelProvider.c(c(params.getState().getType())), null, null, null, 119, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gk1.a.S), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
    }
}
