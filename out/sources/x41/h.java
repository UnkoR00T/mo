package x41;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import v41.State;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lx41/h;", "Lxw/f;", "Lx41/h$a;", "Lv41/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lxw/e;", "parentGender", "Lkotlin/Function1;", "Lbl0/d;", "Loq/i0;", "onClick", "Ln30/b;", "q", "(Lxw/e;Ler/l;)Ln30/b;", "x", "(Ler/l;)Ln30/b;", "r", "", "titleResId", "descResId", "Lkotlin/Function0;", "Ln50/g;", i.f37087n, "(ILjava/lang/Integer;Ler/a;)Ln50/g;", "params", "J", "(Lx41/h$a;)Lv41/f$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements xw.f<Params, v41.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: x41.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lx41/h$a;", "", "Lv41/e;", "state", "Lkotlin/Function1;", "Lbl0/d;", "Loq/i0;", "onNextButtonClick", "Lkotlin/Function0;", "onClose", "onBack", "<init>", "(Lv41/e;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv41/e;", "d", "()Lv41/e;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<bl0.d, i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super bl0.d, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onNextButtonClick = lVar;
            this.onClose = aVar;
            this.onBack = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<bl0.d, i0> c() {
            return this.onNextButtonClick;
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
            return t.c(this.state, params.state) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f216765a;

        static {
            int[] iArr = new int[xw.e.values().length];
            try {
                iArr[xw.e.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xw.e.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f216765a = iArr;
        }
    }

    public h(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(l lVar) {
        lVar.b(bl0.d.NoMarriageAndAcceptChild);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(l lVar) {
        lVar.b(bl0.d.NoMarriageAndNoAcceptChild);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(l lVar) {
        lVar.b(bl0.d.MarriageEnded);
        return i0.f148189a;
    }

    private final DefaultSingleCardData H(int titleResId, Integer descResId, er.a<i0> onClick) {
        SingleCardLabel singleCardLabel;
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(titleResId), null, null, 0, 0, null, 62, null));
        if (descResId != null) {
            singleCardLabel = new SingleCardLabel(this.labelProvider.c(descResId.intValue()), null, null, 0, 0, null, 62, null);
        } else {
            singleCardLabel = null;
        }
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, title, singleCardLabel, 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
    }

    static /* synthetic */ DefaultSingleCardData I(h hVar, int i15, Integer num, er.a aVar, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            num = null;
        }
        return hVar.H(i15, num, aVar);
    }

    private final CardListData q(xw.e parentGender, l<? super bl0.d, i0> onClick) {
        int i15 = b.f216765a[parentGender.ordinal()];
        if (i15 == 1) {
            return x(onClick);
        }
        if (i15 == 2) {
            return r(onClick);
        }
        throw new p();
    }

    private final CardListData r(final l<? super bl0.d, i0> onClick) {
        return new CardListData(v.q(I(this, j31.a.f99164j0, null, new er.a() { // from class: x41.a
            @Override // er.a
            public final Object a() {
                return h.s(onClick);
            }
        }, 2, null), H(j31.a.f99169k0, Integer.valueOf(j31.a.f99154h0), new er.a() { // from class: x41.b
            @Override // er.a
            public final Object a() {
                return h.u(onClick);
            }
        }), H(j31.a.f99174l0, Integer.valueOf(j31.a.f99159i0), new er.a() { // from class: x41.c
            @Override // er.a
            public final Object a() {
                return h.v(onClick);
            }
        })), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(l lVar) {
        lVar.b(bl0.d.InMarriage);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(l lVar) {
        lVar.b(bl0.d.NoMarriageAndAcceptChild);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar) {
        lVar.b(bl0.d.MarriageEnded);
        return i0.f148189a;
    }

    private final CardListData x(final l<? super bl0.d, i0> onClick) {
        return new CardListData(v.q(H(j31.a.f99199q0, Integer.valueOf(j31.a.f99184n0), new er.a() { // from class: x41.d
            @Override // er.a
            public final Object a() {
                return h.z(onClick);
            }
        }), H(j31.a.f99209s0, Integer.valueOf(j31.a.f99194p0), new er.a() { // from class: x41.e
            @Override // er.a
            public final Object a() {
                return h.E(onClick);
            }
        }), I(this, j31.a.f99214t0, null, new er.a() { // from class: x41.f
            @Override // er.a
            public final Object a() {
                return h.F(onClick);
            }
        }, 2, null), H(j31.a.f99204r0, Integer.valueOf(j31.a.f99189o0), new er.a() { // from class: x41.g
            @Override // er.a
            public final Object a() {
                return h.G(onClick);
            }
        })), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(l lVar) {
        lVar.b(bl0.d.InMarriage);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public v41.f.Data b(Params params) {
        return new v41.f.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j31.a.X2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(j31.a.f99179m0), q(params.getState().getParentGender(), params.c()), params.a());
    }
}
