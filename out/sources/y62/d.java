package y62;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import oq.y;
import p071kotlin.Metadata;
import p076m2.r;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import x62.e;
import xw.f;
import y30.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly62/d;", "Lxw/f;", "Ly62/d$a;", "Lx62/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lou0/a;", "paymentStatus", "Ly30/n$b$b;", "h", "(Lou0/a;)Ly30/n$b$b;", "Lmx/a;", "e", "(Lou0/a;)Lmx/a;", "Lq40/g;", "Loq/i0;", "c", "(Lou0/a;)Lq40/g;", "params", "f", "(Ly62/d$a;)Lx62/e$a;", "a", "Lmx/c;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: y62.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Ly62/d$a;", "", "Lx62/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "navigateBack", "navigateToFaq", "Lkotlin/Function1;", "Ly30/n$b$b;", "onSwitchItemChanged", "<init>", "(Lx62/d;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx62/d;", "d", "()Lx62/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final x62.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateToFaq;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onSwitchItemChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(x62.d dVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super n.Switch.EnumC5973b, i0> lVar) {
            this.state = dVar;
            this.navigateBack = aVar;
            this.navigateToFaq = aVar2;
            this.onSwitchItemChanged = lVar;
        }

        public final er.a<i0> a() {
            return this.navigateBack;
        }

        public final er.a<i0> b() {
            return this.navigateToFaq;
        }

        public final l<n.Switch.EnumC5973b, i0> c() {
            return this.onSwitchItemChanged;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final x62.d getState() {
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
            return t.c(this.state, params.state) && t.c(this.navigateBack, params.navigateBack) && t.c(this.navigateToFaq, params.navigateToFaq) && t.c(this.onSwitchItemChanged, params.onSwitchItemChanged);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.navigateBack.hashCode()) * 31) + this.navigateToFaq.hashCode()) * 31) + this.onSwitchItemChanged.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", navigateBack=" + this.navigateBack + ", navigateToFaq=" + this.navigateToFaq + ", onSwitchItemChanged=" + this.onSwitchItemChanged + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f224659a;

        static {
            int[] iArr = new int[ou0.a.values().length];
            try {
                iArr[ou0.a.NOT_PAID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ou0.a.PAID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f224659a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f224660a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1353728230);
            if (p076m2.t.k()) {
                p076m2.t.o(-1353728230, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.mapper.TicketsListMapper.invoke.<anonymous> (TicketsListMapper.kt:60)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final IconPageData<i0, i0> c(ou0.a paymentStatus) {
        oq.r rVarA;
        int i15 = b.f224659a[paymentStatus.ordinal()];
        if (i15 == 1) {
            rVarA = y.a(Integer.valueOf(o62.a.D), Integer.valueOf(o62.a.C));
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            rVarA = y.a(Integer.valueOf(o62.a.F), Integer.valueOf(o62.a.E));
        }
        return new IconPageData<>(new j.a(jz.a.f106754d2), this.labelProvider.c(((Number) rVarA.c()).intValue()), this.labelProvider.c(((Number) rVarA.d()).intValue()), null, null, null, true, 8, null);
    }

    private final Label e(ou0.a paymentStatus) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = b.f224659a[paymentStatus.ordinal()];
        if (i16 == 1) {
            i15 = o62.a.Z;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = o62.a.f142743a0;
        }
        return cVar.c(i15);
    }

    private final n.Switch.EnumC5973b h(ou0.a paymentStatus) {
        int i15 = b.f224659a[paymentStatus.ordinal()];
        if (i15 == 1) {
            return n.Switch.EnumC5973b.LEFT;
        }
        if (i15 == 2) {
            return n.Switch.EnumC5973b.RIGHT;
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        x62.d state = params.getState();
        if (t.c(state, x62.d.b.f217007a)) {
            return e.a.b.f217014a;
        }
        if (state instanceof x62.d.Initialized) {
            x62.d.Initialized initialized = (x62.d.Initialized) state;
            return new e.a.Initialized(params.a(), new n.Switch(new n.Switch.TabItem(this.labelProvider.c(o62.a.f142752i), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(o62.a.f142753j), n.Switch.EnumC5973b.RIGHT), h(initialized.getPaymentStatus()), false, params.c(), 8, null), new c30.b.c(null, null, null, e(initialized.getPaymentStatus()), null, null, null, 119, null), c(initialized.getPaymentStatus()), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(o62.a.Y), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, c.f224660a, null, params.b(), 4, null)), null, 20, null), null, null, null, null, 61, null));
        }
        if (t.c(state, x62.d.a.f217006a)) {
            return new e.a.InformalTaxPayer(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(o62.a.Y), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), this.labelProvider.c(o62.a.X), this.labelProvider.c(o62.a.W));
        }
        throw new oq.p();
    }
}
