package nx2;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.d;
import b50.e;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import lx2.State;
import lx2.h;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnx2/c;", "Lxw/f;", "Lnx2/c$a;", "Llx2/h$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "params", "h", "(Lnx2/c$a;)Llx2/h$a;", "a", "Lmx/c;", "b", "Lu04/a;", "Llv2/a;", "", "f", "(Llv2/a;)I", "descriptionResId", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: nx2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001c\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Lnx2/c$a;", "", "Llx2/g;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onAnswerSelected", "", "onUrlClick", "Lkotlin/Function0;", "onNextClick", "onBack", "onClose", "<init>", "(Llx2/g;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llx2/g;", "f", "()Llx2/g;", "b", "Ler/l;", "()Ler/l;", "c", "e", "d", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> onAnswerSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super Boolean, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onAnswerSelected = lVar;
            this.onUrlClick = lVar2;
            this.onNextClick = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
        }

        public final l<Boolean, i0> a() {
            return this.onAnswerSelected;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onClose;
        }

        public final er.a<i0> d() {
            return this.onNextClick;
        }

        public final l<String, i0> e() {
            return this.onUrlClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onAnswerSelected, params.onAnswerSelected) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onAnswerSelected.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAnswerSelected=" + this.onAnswerSelected + ", onUrlClick=" + this.onUrlClick + ", onNextClick=" + this.onNextClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139467a;

        static {
            int[] iArr = new int[lv2.a.values().length];
            try {
                iArr[lv2.a.MYSELF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lv2.a.CHILD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lv2.a.WARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f139467a = iArr;
        }
    }

    public c(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final int f(lv2.a aVar) {
        int i15 = b.f139467a[aVar.ordinal()];
        if (i15 == 1) {
            return gv2.a.W1;
        }
        if (i15 == 2) {
            return gv2.a.V1;
        }
        if (i15 == 3) {
            return gv2.a.f77238c2;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.a().b(Boolean.TRUE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.a().b(Boolean.FALSE);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public h.Data b(final Params params) {
        return new h.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(gv2.a.f77228a2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(gv2.a.f77233b2), this.labelProvider.c(f(params.getState().getApplicationOwner())), new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedAnswer(), false, 5, null), new er.a() { // from class: nx2.a
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, this.labelProvider.c(gv2.a.U1), this.labelProvider.c(gv2.a.T1), null, 16, null), new RadioButtonRow(new RadioButtonItemData(false, !params.getState().getSelectedAnswer(), false, 5, null), new er.a() { // from class: nx2.b
            @Override // er.a
            public final Object a() {
                return c.l(params);
            }
        }, this.labelProvider.c(gv2.a.Y1), this.labelProvider.c(gv2.a.X1), null, 16, null)), e.a.f16684a, d.c.f16683a, null, null, null, null, 120, null), new c30.b.c(null, null, null, this.labelProvider.c(gv2.a.Z1), null, null, new c30.a.Link(new LinkData(null, this.labelProvider.c(gv2.a.H), this.commonEndpoints.O(), LinkData.EnumC5775a.WEBSITE, false, params.e(), 17, null)), 55, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.P), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
