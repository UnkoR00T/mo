package z71;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import y71.State;
import y71.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lz71/c;", "Lxw/f;", "Lz71/c$a;", "Ly71/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ld81/b;", "splitType", "Lmx/a;", "f", "(Ld81/b;)Lmx/a;", "c", "e", "h", "params", "i", "(Lz71/c$a;)Ly71/d$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: z71.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006!"}, d2 = {"Lz71/c$a;", "", "Ly71/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCutAction", "onRevertAction", "onSaveAction", "onBackAction", "onCloseAction", "<init>", "(Ly71/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly71/c;", "f", "()Ly71/c;", "b", "Ler/a;", "c", "()Ler/a;", "d", "e", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f233285g = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCutAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRevertAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSaveAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onCutAction = aVar;
            this.onRevertAction = aVar2;
            this.onSaveAction = aVar3;
            this.onBackAction = aVar4;
            this.onCloseAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onCutAction;
        }

        public final er.a<i0> d() {
            return this.onRevertAction;
        }

        public final er.a<i0> e() {
            return this.onSaveAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCutAction, params.onCutAction) && t.c(this.onRevertAction, params.onRevertAction) && t.c(this.onSaveAction, params.onSaveAction) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onCutAction.hashCode()) * 31) + this.onRevertAction.hashCode()) * 31) + this.onSaveAction.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCutAction=" + this.onCutAction + ", onRevertAction=" + this.onRevertAction + ", onSaveAction=" + this.onSaveAction + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f233292a;

        static {
            int[] iArr = new int[d81.b.values().length];
            try {
                iArr[d81.b.NAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d81.b.SURNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d81.b.BIRTH_PLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f233292a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(d81.b splitType) {
        int i15 = b.f233292a[splitType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.f210356j2);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210370l2);
        }
        if (i15 == 3) {
            return this.labelProvider.c(w51.a.f210328f2);
        }
        throw new p();
    }

    private final Label e(d81.b splitType) {
        int i15 = b.f233292a[splitType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.W1);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210293a2);
        }
        if (i15 == 3) {
            return this.labelProvider.c(w51.a.S1);
        }
        throw new p();
    }

    private final Label f(d81.b splitType) {
        int i15 = b.f233292a[splitType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.f210349i2);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210363k2);
        }
        if (i15 == 3) {
            return this.labelProvider.c(w51.a.f210321e2);
        }
        throw new p();
    }

    private final Label h(d81.b splitType) {
        int i15 = b.f233292a[splitType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.X1);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210300b2);
        }
        if (i15 == 3) {
            return this.labelProvider.c(w51.a.T1);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d.Data b(Params params) {
        return new d.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.f210377m2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), f(params.getState().getSplitType()), c(params.getState().getSplitType()), new CardListData(v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(e(params.getState().getSplitType()), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(params.getState().getTopLine()), "topLine"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.e(w51.a.f210419s2, Integer.valueOf(params.getState().getTopLine().q()), 63), null, null, 0, 0, null, 62, null)), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(h(params.getState().getSplitType()), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(params.getState().getModifiedBottomLine()), "bottomLine"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.e(w51.a.f210419s2, Integer.valueOf(params.getState().getModifiedBottomLine().q()), 63), null, null, 0, 0, null, 62, null)), null, null, null, 3839, null)), null, false, null, null, 30, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210335g2), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.c(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210342h2), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.d(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.f210456x4), null, 2, null), k30.d.a.f107773a, null, params.e(), 35, null), params.a());
    }
}
