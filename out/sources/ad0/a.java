package ad0;

import androidx.compose.ui.graphics.Color;
import bd0.h;
import bd0.i;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.Arrays;
import k30.d;
import lr.m;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import xw.f;
import zc0.LoginLockThemeColors;
import zc0.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lad0/a;", "Lxw/f;", "Lad0/a$a;", "Lbd0/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lad0/a$a;)Lbd0/i$a;", "a", "Lmx/c;", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ad0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lad0/a$a;", "", "Lbd0/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onReactiveCardAction", "<init>", "(Lbd0/h;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbd0/h;", "b", "()Lbd0/h;", "Ler/a;", "()Ler/a;", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onReactiveCardAction;

        public Params(h hVar, er.a<i0> aVar) {
            this.state = hVar;
            this.onReactiveCardAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onReactiveCardAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getState() {
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
            return t.c(this.state, params.state) && t.c(this.onReactiveCardAction, params.onReactiveCardAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onReactiveCardAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onReactiveCardAction=" + this.onReactiveCardAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5443a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2136766589);
            if (p076m2.t.k()) {
                p076m2.t.o(-2136766589, i15, -1, "pl.gov.coi.mjunior.feature.loginlock.presentation.mapper.LoginLockMapper.invoke.<anonymous> (LoginLockMapper.kt:38)");
            }
            long headerIconBackground = ((LoginLockThemeColors) rVar.N(e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        h state = params.getState();
        if (t.c(state, h.a.f18243a)) {
            return i.a.C0459a.f18248a;
        }
        if (!(state instanceof h.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.A, null, b.f5443a, this.labelProvider.c(qc0.a.f165973h), this.labelProvider.c(qc0.a.f165971f), null, 34, null);
        Label labelC = this.labelProvider.c(qc0.a.f165974i);
        h.Initialized initialized = (h.Initialized) state;
        z40.a.Bar bar = new z40.a.Bar("loginLockProgressBarTag", (int) m.l(gu.b.s(initialized.getTimerData().getTimeLeft(), initialized.getTimerData().getStartDuration()) * ((double) 100), 0.0d, 100.0d), null, 4, null);
        Label labelC2 = this.labelProvider.c(qc0.a.f165972g);
        long timeLeft = initialized.getTimerData().getTimeLeft();
        gu.b.z(timeLeft);
        int iG = gu.b.G(timeLeft);
        int I = gu.b.I(timeLeft);
        gu.b.H(timeLeft);
        return new i.a.Initialized(baseScaffoldData, icon, new Label(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iG), Integer.valueOf(I)}, 2)), "loginLockTimerTextTag"), labelC2, bar, labelC, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(qc0.a.f165968c), null, 2, null), d.a.f107773a, k30.b.c.f107768a, params.a(), 3, null));
    }
}
