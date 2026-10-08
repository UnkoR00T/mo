package yo3;

import a70.ShowQrcodeData;
import fr.t;
import gu.b;
import i50.BaseScaffoldData;
import mu.g;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xo3.y;
import xo3.z;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lyo3/a;", "Lxw/f;", "Lyo3/a$a;", "Lxo3/z$a;", "Lmx/c;", "labelProvider", "Luy/a;", "accelerometerManager", "<init>", "(Lmx/c;Luy/a;)V", "Lxo3/y$b;", "data", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lxo3/z$a$b;", "f", "(Lxo3/y$b;Ler/a;)Lxo3/z$a$b;", "Lgu/b;", "timeLeft", "Lmx/a;", "c", "(J)Lmx/a;", "", "maxTime", "timeToExpire", "", "h", "(JJ)F", "params", "e", "(Lyo3/a$a;)Lxo3/z$a;", "a", "Lmx/c;", "b", "Luy/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, z.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private uy.a accelerometerManager;

    /* JADX INFO: renamed from: yo3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyo3/a$a;", "", "Lxo3/y;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Lxo3/y;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxo3/y;", "b", "()Lxo3/y;", "Ler/a;", "()Ler/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Params(y yVar, er.a<i0> aVar) {
            this.state = yVar;
            this.onBackClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    public a(c cVar, uy.a aVar) {
        this.labelProvider = cVar;
        this.accelerometerManager = aVar;
    }

    private final Label c(long timeLeft) {
        long jB = b.B(timeLeft);
        int I = b.I(timeLeft);
        b.H(timeLeft);
        return this.labelProvider.e(un3.b.f199481s, Long.valueOf(jB), Integer.valueOf(I));
    }

    private final z.a.Initialized f(y.Initialized data, er.a<i0> onBackClick) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBackClick), this.labelProvider.c(un3.b.G2), null, null, false, null, 60, null), null, null, null, null, 60, null);
        Label labelC = this.labelProvider.c(un3.b.F2);
        String code = data.getCode();
        Label labelC2 = (code == null || code.length() == 0) ? this.labelProvider.c(un3.b.E2) : this.labelProvider.c(un3.b.D2);
        g<Float> gVarW = this.accelerometerManager.w();
        String code2 = data.getCode();
        return new z.a.Initialized(baseScaffoldData, labelC, labelC2, gVarW, new ShowQrcodeData(data.getQrCodeBitmap(), code2 != null ? mx.b.b(code2, "code") : null, h(b.A(data.getMaxTime()), b.A(data.getTimeLeft())), this.labelProvider.c(un3.b.C2), c(data.getTimeLeft())), onBackClick);
    }

    private final float h(long maxTime, long timeToExpire) {
        return timeToExpire / maxTime;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public z.a b(Params params) {
        y state = params.getState();
        if (state instanceof y.a) {
            return z.a.C5887a.f220405a;
        }
        if (state instanceof y.Initialized) {
            return f((y.Initialized) params.getState(), params.a());
        }
        throw new p();
    }
}
