package rz0;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListAccessibilityData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.d;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p108qz0.State;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lrz0/b;", "Lxw/f;", "Lrz0/b$a;", "Lqz0/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Llz0/a;", "params", "Ln50/g;", "f", "(Llz0/a;Lrz0/b$a;)Ln50/g;", "e", "(Lrz0/b$a;)Lqz0/f$a;", "a", "Lmx/c;", "appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, p108qz0.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: rz0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"Lrz0/b$a;", "", "Lqz0/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Llz0/a;", "setChosenThemeAction", "onThemeFocusRestorationHandled", "<init>", "(Lqz0/e;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqz0/e;", "d", "()Lqz0/e;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "appearance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<lz0.a, i0> setChosenThemeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onThemeFocusRestorationHandled;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super lz0.a, i0> lVar, er.a<i0> aVar2) {
            this.state = state;
            this.onBackAction = aVar;
            this.setChosenThemeAction = lVar;
            this.onThemeFocusRestorationHandled = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onThemeFocusRestorationHandled;
        }

        public final l<lz0.a, i0> c() {
            return this.setChosenThemeAction;
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.setChosenThemeAction, params.setChosenThemeAction) && t.c(this.onThemeFocusRestorationHandled, params.onThemeFocusRestorationHandled);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.setChosenThemeAction.hashCode()) * 31) + this.onThemeFocusRestorationHandled.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", setChosenThemeAction=" + this.setChosenThemeAction + ", onThemeFocusRestorationHandled=" + this.onThemeFocusRestorationHandled + ')';
        }
    }

    /* JADX INFO: renamed from: rz0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4518b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176929a;

        static {
            int[] iArr = new int[lz0.a.values().length];
            try {
                iArr[lz0.a.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz0.a.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz0.a.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f176929a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData f(final lz0.a aVar, final Params params) {
        BodySection bodySection;
        LeadingSection leadingSection = new LeadingSection(false, new d.RadioButton(params.getState().getChosenTheme() == aVar, false, 2, null), null, 5, null);
        int i15 = C4518b.f176929a[aVar.ordinal()];
        if (i15 == 1) {
            bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(jz0.a.f106919d), null, null, 0, 0, null, 62, null)), null, 5, null);
        } else if (i15 == 2) {
            bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(jz0.a.f106918c), null, null, 0, 0, null, 62, null)), null, 5, null);
        } else {
            if (i15 != 3) {
                throw new p();
            }
            bodySection = new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(jz0.a.f106917b), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(jz0.a.f106916a), null, null, 0, 0, null, 62, null), 1, null);
        }
        return new DefaultSingleCardData(null, new er.a() { // from class: rz0.a
            @Override // er.a
            public final Object a() {
                return b.h(params, aVar);
            }
        }, false, null, null, false, null, null, bodySection, leadingSection, null, null, 3325, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, lz0.a aVar) {
        params.c().b(aVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p108qz0.f.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(jz0.a.f106921f), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Integer focusRestorationIndex = params.getState().getFocusRestorationIndex();
        er.a<i0> aVarB = params.b();
        Label labelC = this.labelProvider.c(jz0.a.f106920e);
        List<lz0.a> listE = params.getState().e();
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(f((lz0.a) it.next(), params));
        }
        return new p108qz0.f.Data(baseScaffoldData, aVarA, focusRestorationIndex, aVarB, labelC, new CardListData(arrayList, null, false, new CardListAccessibilityData(this.labelProvider.c(jz0.a.f106920e), null, 2, null), null, 22, null));
    }
}
