package cd2;

import al0.e0;
import bd2.State;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcd2/a;", "Lxw/f;", "Lcd2/a$a;", "Lbd2/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lcd2/a$a;)Lbd2/f$a;", "a", "Lmx/c;", "Lal0/e0;", "Lmx/a;", "f", "(Lal0/e0;)Lmx/a;", "titleResId", "c", "descriptionFirst", "e", "descriptionSecond", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, bd2.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: cd2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcd2/a$a;", "", "Lbd2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Lbd2/e;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbd2/e;", "b", "()Lbd2/e;", "Ler/a;", "()Ler/a;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onCloseClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25475a;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.SUSPENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.UNSUSPENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.UNSUSPENDED_WITH_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25475a = iArr;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(e0 e0Var) {
        Integer numValueOf;
        int i15 = b.f25475a[e0Var.ordinal()];
        if (i15 != 1) {
            numValueOf = i15 != 3 ? null : Integer.valueOf(uc2.a.f197481o);
        } else {
            numValueOf = Integer.valueOf(uc2.a.f197476j);
        }
        if (numValueOf != null) {
            return this.labelProvider.c(numValueOf.intValue());
        }
        return null;
    }

    private final Label e(e0 e0Var) {
        Integer numValueOf;
        int i15 = b.f25475a[e0Var.ordinal()];
        if (i15 != 1) {
            numValueOf = i15 != 3 ? null : Integer.valueOf(uc2.a.f197480n);
        } else {
            numValueOf = Integer.valueOf(uc2.a.f197477k);
        }
        if (numValueOf != null) {
            return this.labelProvider.c(numValueOf.intValue());
        }
        return null;
    }

    private final Label f(e0 e0Var) {
        int i15;
        int i16 = b.f25475a[e0Var.ordinal()];
        if (i16 == 1) {
            i15 = uc2.a.f197478l;
        } else if (i16 == 2) {
            i15 = uc2.a.f197490x;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            i15 = uc2.a.f197479m;
        }
        return this.labelProvider.c(i15);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public bd2.f.Data b(Params params) {
        return new bd2.f.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.c.f164688d, f(params.getState().getIdCardSuspensionResult()), c(params.getState().getIdCardSuspensionResult()), e(params.getState().getIdCardSuspensionResult()), null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(uc2.a.f197467a), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), true));
    }
}
