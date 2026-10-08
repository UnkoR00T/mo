package hu3;

import er.l;
import fr.t;
import gu3.State;
import gu3.e;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lhu3/b;", "Lxw/f;", "Lhu3/b$a;", "Lgu3/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Leu3/a;", "model", "Lmx/a;", "h", "(Lhu3/b$a;Leu3/a;)Lmx/a;", "params", "l", "(Lhu3/b$a;)Lgu3/e$a;", "a", "Lmx/c;", "", "Ln50/g;", "f", "(Lhu3/b$a;)Ljava/util/List;", "cards", "", "i", "(Leu3/a;)I", "titleResId", "certreceivemethod_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: hu3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lhu3/b$a;", "", "Lgu3/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "closeAction", "Lkotlin/Function1;", "Leu3/a;", "nextAction", "<init>", "(Lgu3/d;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgu3/d;", "d", "()Lgu3/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "certreceivemethod_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<eu3.a, i0> nextAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super eu3.a, i0> lVar) {
            this.state = state;
            this.backAction = aVar;
            this.closeAction = aVar2;
            this.nextAction = lVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final l<eu3.a, i0> c() {
            return this.nextAction;
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.nextAction, params.nextAction);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    /* JADX INFO: renamed from: hu3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2029b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86695a;

        static {
            int[] iArr = new int[eu3.a.values().length];
            try {
                iArr[eu3.a.EDOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eu3.a.OFFICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eu3.a.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86695a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Params params, eu3.a aVar) {
        params.c().b(aVar);
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> f(final Params params) {
        wq.a<eu3.a> aVarE = eu3.a.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        for (final eu3.a aVar : aVarE) {
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(i(aVar)), null, null, 0, 0, null, 62, null));
            Label labelH = h(params, aVar);
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: hu3.a
                @Override // er.a
                public final Object a() {
                    return b.e(params, aVar);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, labelH != null ? new SingleCardLabel(labelH, null, null, 0, 0, null, 62, null) : null, 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return arrayList;
    }

    private final Label h(Params params, eu3.a aVar) {
        c cVar = this.labelProvider;
        int i15 = C2029b.f86695a[aVar.ordinal()];
        if (i15 == 1) {
            return cVar.e(du3.a.f44607a, c0.e(params.getState().getData().getEdorAddress()));
        }
        if (i15 == 2) {
            return mx.b.b(params.getState().getData().getOfficeName(), "officeName");
        }
        if (i15 == 3) {
            return null;
        }
        throw new p();
    }

    private final int i(eu3.a aVar) {
        int i15 = C2029b.f86695a[aVar.ordinal()];
        if (i15 == 1) {
            return du3.a.f44608b;
        }
        if (i15 == 2) {
            return du3.a.f44609c;
        }
        if (i15 == 3) {
            return du3.a.f44610d;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(du3.a.f44611e), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), params.getState().getData().getHeader(), f(params));
    }
}
