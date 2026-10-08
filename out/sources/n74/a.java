package n74;

import fr.t;
import gu.d;
import gu.e;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p077m74.TimerData;
import p077m74.c;
import p077m74.g0;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ln74/a;", "Lxw/f;", "Ln74/a$a;", "Lm74/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Ln74/a$a;)Lm74/c$a;", "a", "Lmx/c;", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n74.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln74/a$a;", "", "Lm74/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onTimerEnd", "navigateToInfoDialog", "<init>", "(Lm74/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm74/b;", "c", "()Lm74/b;", "b", "Ler/a;", "()Ler/a;", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p077m74.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTimerEnd;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> navigateToInfoDialog;

        public Params(p077m74.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = bVar;
            this.onTimerEnd = aVar;
            this.navigateToInfoDialog = aVar2;
        }

        public final er.a<i0> a() {
            return this.navigateToInfoDialog;
        }

        public final er.a<i0> b() {
            return this.onTimerEnd;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final p077m74.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onTimerEnd, params.onTimerEnd) && t.c(this.navigateToInfoDialog, params.navigateToInfoDialog);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onTimerEnd.hashCode()) * 31) + this.navigateToInfoDialog.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTimerEnd=" + this.onTimerEnd + ", navigateToInfoDialog=" + this.navigateToInfoDialog + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133486a;

        static {
            int[] iArr = new int[l74.b.values().length];
            try {
                iArr[l74.b.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l74.b.INSTITUTION_PIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f133486a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.a b(Params params) {
        int i15;
        p077m74.b state = params.getState();
        if (state instanceof p077m74.b.Empty) {
            return c.a.C3048a.f124145a;
        }
        if (!(state instanceof p077m74.b.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(null, null, null, null, null, 31, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(k74.b.f109045j);
        mx.c cVar = this.labelProvider;
        int i16 = b.f133486a[((p077m74.b.Initialized) params.getState()).getLockOrigin().ordinal()];
        if (i16 == 1) {
            i15 = k74.b.f109041f;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = k74.b.f109042g;
        }
        Label labelC2 = cVar.c(i15);
        Label labelC3 = this.labelProvider.c(k74.b.f109040e);
        gu.b.Companion companion = gu.b.INSTANCE;
        TimerData timerData = new TimerData(d.q(5, e.MINUTES), ((p077m74.b.Initialized) params.getState()).getTimeLeft(), g0.b.f124171b, params.b(), null);
        Label labelC4 = this.labelProvider.c(k74.b.f109039d);
        l74.b lockOrigin = ((p077m74.b.Initialized) params.getState()).getLockOrigin();
        l74.b bVar = l74.b.LOGIN;
        if (lockOrigin != bVar) {
            labelC4 = null;
        }
        return new c.a.Initialized(baseScaffoldData, labelC, labelC2, labelC3, timerData, labelC4, ((p077m74.b.Initialized) params.getState()).getLockOrigin() == bVar ? new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(k74.b.f109037b), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null) : null);
    }
}
