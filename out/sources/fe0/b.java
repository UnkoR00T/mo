package fe0;

import ee0.State;
import ee0.e;
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
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.d;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfe0/b;", "Lxw/f;", "Lfe0/b$a;", "Lee0/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lxg0/a;", "", "h", "(Lxg0/a;)I", "params", "e", "(Lfe0/b$a;)Lee0/e$a;", "a", "Lmx/c;", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: fe0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lfe0/b$a;", "", "Lee0/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Lxg0/a;", "changeTheme", "<init>", "(Lee0/d;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lee0/d;", "c", "()Lee0/d;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<xg0.a, i0> changeTheme;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super xg0.a, i0> lVar) {
            this.state = state;
            this.backAction = aVar;
            this.changeTheme = lVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<xg0.a, i0> b() {
            return this.changeTheme;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.changeTheme, params.changeTheme);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.changeTheme.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", changeTheme=" + this.changeTheme + ')';
        }
    }

    /* JADX INFO: renamed from: fe0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1401b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61727a;

        static {
            int[] iArr = new int[xg0.a.values().length];
            try {
                iArr[xg0.a.ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg0.a.GEOMETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg0.a.COSMOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61727a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, xg0.a aVar) {
        params.b().b(aVar);
        return i0.f148189a;
    }

    private final int h(xg0.a aVar) {
        int i15 = C1401b.f61727a[aVar.ordinal()];
        if (i15 == 1) {
            return yd0.b.f226502d;
        }
        if (i15 == 2) {
            return yd0.b.f226503e;
        }
        if (i15 == 3) {
            return yd0.b.f226501c;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(yd0.b.f226500b), null, null, false, null, 60, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(yd0.b.f226499a);
        wq.a<xg0.a> aVarE = xg0.a.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        Iterator<xg0.a> it = aVarE.iterator();
        while (it.hasNext()) {
            final xg0.a next = it.next();
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: fe0.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, next);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(h(next)), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, new d.RadioButton(params.getState().getCurrentTheme() == next, false, 2, null), null, 5, null), null, null, 3325, null));
        }
        return new e.a.WelcomeData(baseScaffoldData, labelC, new CardListData(arrayList, null, false, null, null, 30, null), params.a());
    }
}
