package q21;

import er.l;
import er.p;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p21.d;
import p21.e;
import pq.v;
import t50.TextAreaData;
import t50.s;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u00020\u0013*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00020\u0013*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u00020\u0013*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lq21/b;", "Lxw/f;", "Lq21/b$b;", "Lp21/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lg21/f;", "Lg21/f$b$a;", "ratingOption", "Lmx/a;", "e", "(Lg21/f;Lg21/f$b$a;)Lmx/a;", "params", "l", "(Lq21/b$b;)Lp21/e$a;", "a", "Lmx/c;", "", "f", "(Lg21/f$b$a;)I", "labelResId", "h", "selectedDrawable", "i", "unSelectedDrawable", "b", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f163864b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f163865c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq21/b$a;", "", "<init>", "()V", "", "DESCRIPTION_MAX_LENGTH", "I", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: q21.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010!R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\u001a\u0010'¨\u0006("}, d2 = {"Lq21/b$b;", "", "Lp21/d;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onDescriptionChanged", "", "onCharsLimitReached", "Lkotlin/Function2;", "Lg21/f;", "onRatingSelected", "Lkotlin/Function0;", "onSendClick", "onBackAction", "<init>", "(Lp21/d;Ler/l;Ler/l;Ler/p;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lp21/d;", "f", "()Lp21/d;", "b", "Ler/l;", "c", "()Ler/l;", "d", "Ler/p;", "()Ler/p;", "e", "Ler/a;", "()Ler/a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onDescriptionChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onCharsLimitReached;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<g21.f, String, i0> onRatingSelected;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, l<? super String, i0> lVar, l<? super Boolean, i0> lVar2, p<? super g21.f, ? super String, i0> pVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = dVar;
            this.onDescriptionChanged = lVar;
            this.onCharsLimitReached = lVar2;
            this.onRatingSelected = pVar;
            this.onSendClick = aVar;
            this.onBackAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<Boolean, i0> b() {
            return this.onCharsLimitReached;
        }

        public final l<String, i0> c() {
            return this.onDescriptionChanged;
        }

        public final p<g21.f, String, i0> d() {
            return this.onRatingSelected;
        }

        public final er.a<i0> e() {
            return this.onSendClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onDescriptionChanged, params.onDescriptionChanged) && t.c(this.onCharsLimitReached, params.onCharsLimitReached) && t.c(this.onRatingSelected, params.onRatingSelected) && t.c(this.onSendClick, params.onSendClick) && t.c(this.onBackAction, params.onBackAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onDescriptionChanged.hashCode()) * 31) + this.onCharsLimitReached.hashCode()) * 31) + this.onRatingSelected.hashCode()) * 31) + this.onSendClick.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDescriptionChanged=" + this.onDescriptionChanged + ", onCharsLimitReached=" + this.onCharsLimitReached + ", onRatingSelected=" + this.onRatingSelected + ", onSendClick=" + this.onSendClick + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163873a;

        static {
            int[] iArr = new int[g21.f.Selected.a.values().length];
            try {
                iArr[g21.f.Selected.a.LOWEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g21.f.Selected.a.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g21.f.Selected.a.MID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g21.f.Selected.a.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g21.f.Selected.a.HIGHEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f163873a = iArr;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(g21.f fVar, g21.f.Selected.a aVar) {
        int i15;
        Label labelO = this.labelProvider.c(f(aVar)).o(mx.b.b(".", "comma"));
        mx.c cVar = this.labelProvider;
        if ((fVar instanceof g21.f.Selected ? (g21.f.Selected) fVar : null) != null) {
            boolean z15 = ((g21.f.Selected) fVar).getOption() == aVar;
            if (z15) {
                i15 = a21.a.f2098k0;
            } else {
                if (z15) {
                    throw new oq.p();
                }
                i15 = a21.a.f2102m0;
            }
        } else {
            i15 = a21.a.f2102m0;
        }
        return labelO.o(cVar.c(i15));
    }

    private final int f(g21.f.Selected.a aVar) {
        int i15 = c.f163873a[aVar.ordinal()];
        if (i15 == 1) {
            return a21.a.S;
        }
        if (i15 == 2) {
            return a21.a.R;
        }
        if (i15 == 3) {
            return a21.a.T;
        }
        if (i15 == 4) {
            return a21.a.P;
        }
        if (i15 == 5) {
            return a21.a.Q;
        }
        throw new oq.p();
    }

    private final int h(g21.f.Selected.a aVar) {
        int i15 = c.f163873a[aVar.ordinal()];
        if (i15 == 1) {
            return jz.a.O1;
        }
        if (i15 == 2) {
            return jz.a.P1;
        }
        if (i15 == 3) {
            return jz.a.N1;
        }
        if (i15 == 4) {
            return jz.a.M1;
        }
        if (i15 == 5) {
            return jz.a.L1;
        }
        throw new oq.p();
    }

    private final int i(g21.f.Selected.a aVar) {
        int i15 = c.f163873a[aVar.ordinal()];
        if (i15 == 1) {
            return jz.a.f106882v0;
        }
        if (i15 == 2) {
            return jz.a.f106889w0;
        }
        if (i15 == 3) {
            return jz.a.f106875u0;
        }
        if (i15 == 4) {
            return jz.a.f106868t0;
        }
        if (i15 == 5) {
            return jz.a.f106861s0;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, g21.f.Selected.a aVar, b bVar) {
        params.d().B(new g21.f.Selected(aVar), bVar.labelProvider.c(a21.a.f2077a).getText());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e.Data b(final Params params) {
        int i15;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.d(NavigationButtonData.a.Icon.INSTANCE.b(), 0, this.labelProvider.c(a21.a.f2078a0), 1, null), params.a()), this.labelProvider.c(a21.a.Y), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(a21.a.U);
        l<Boolean, i0> lVarB = params.b();
        wq.a<g21.f.Selected.a> aVarE = g21.f.Selected.a.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        Iterator<g21.f.Selected.a> it = aVarE.iterator();
        while (it.hasNext()) {
            final g21.f.Selected.a next = it.next();
            Label labelC2 = this.labelProvider.c(f(next));
            g21.f ratingScale = params.getState().getData().getRatingScale();
            g21.f.Selected selected = ratingScale instanceof g21.f.Selected ? (g21.f.Selected) ratingScale : null;
            boolean z15 = (selected != null ? selected.getOption() : null) == next;
            if (z15) {
                i15 = h(next);
            } else {
                if (z15) {
                    throw new oq.p();
                }
                i15 = i(next);
            }
            arrayList.add(new e.Data.RatingScaleItem(labelC2, e(params.getState().getData().getRatingScale(), next), i15, new er.a() { // from class: q21.a
                @Override // er.a
                public final Object a() {
                    return b.m(params, next, this);
                }
            }));
        }
        Label labelC3 = this.labelProvider.c(a21.a.X);
        TextAreaData textAreaData = new TextAreaData(null, null, new s.Fix(4), null, params.getState().getData().getCharsLimitReached() ? new t50.e.Error(this.labelProvider.c(a21.a.f2089g)) : new t50.e.Default(this.labelProvider.c(a21.a.W)), params.getState().getData().getDescription(), false, new t50.a.Visible(500, params.b()), labelC3, 0, null, null, params.c(), null, 11851, null);
        er.a<i0> aVarA = params.a();
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(params.getState().getData().g() ? a21.a.Z : a21.a.f2125z), null, 2, null), k30.d.a.f107773a, !params.getState().getData().getCharsLimitReached() ? k30.b.c.f107768a : k30.b.C2562b.f107767a, params.e(), 3, null);
        ButtonData buttonData2 = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(a21.a.f2078a0), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.a(), 35, null);
        d state = params.getState();
        d.Dialog dialog = state instanceof d.Dialog ? (d.Dialog) state : null;
        return new e.Data(baseScaffoldData, labelC, null, lVarB, arrayList, textAreaData, aVarA, buttonData, buttonData2, dialog != null ? dialog.getVmsAdapter() : null, 4, null);
    }
}
