package xr2;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import wr2.d;
import wr2.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxr2/b;", "Lxw/f;", "Lxr2/b$a;", "Lwr2/e$a;", "Lmx/c;", "labelProvider", "Lpr2/a;", "passportPickupEndpoints", "<init>", "(Lmx/c;Lpr2/a;)V", "Lkl0/a;", "status", "Lkotlin/Function1;", "", "Loq/i0;", "openUrl", "Lq40/g;", "Lq40/f;", "e", "(Lkl0/a;Ler/l;)Lq40/g;", "params", "h", "(Lxr2/b$a;)Lwr2/e$a;", "a", "Lmx/c;", "b", "Lpr2/a;", "passportpickup_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pr2.a passportPickupEndpoints;

    /* JADX INFO: renamed from: xr2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lxr2/b$a;", "", "Lwr2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "openUrl", "<init>", "(Lwr2/d;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwr2/d;", "c", "()Lwr2/d;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "passportpickup_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> openUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, l<? super String, i0> lVar) {
            this.state = dVar;
            this.onBackAction = aVar;
            this.openUrl = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<String, i0> b() {
            return this.openUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.openUrl, params.openUrl);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.openUrl.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", openUrl=" + this.openUrl + ')';
        }
    }

    /* JADX INFO: renamed from: xr2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5899b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220608a;

        static {
            int[] iArr = new int[kl0.a.values().length];
            try {
                iArr[kl0.a.APPLICATION_IN_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl0.a.APPLICATION_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kl0.a.APPLICATION_REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kl0.a.PASSPORT_IN_PRODUCTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kl0.a.PASSPORT_READY_TO_DISPATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kl0.a.PASSPORT_DISPATCHED_BY_COURIER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kl0.a.PASSPORT_READY_FOR_PICKUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kl0.a.APPLICATION_NOT_FOUND_OR_COMPLETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[kl0.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f220608a = iArr;
        }
    }

    public b(c cVar, pr2.a aVar) {
        this.labelProvider = cVar;
        this.passportPickupEndpoints = aVar;
    }

    private final IconPageData<i0, IconPageBottomContentData> e(kl0.a status, final l<? super String, i0> openUrl) {
        switch (C5899b.f220608a[status.ordinal()]) {
            case 1:
                return new IconPageData<>(j.b.C4090b.f164686d, this.labelProvider.c(or2.a.f148598h), null, null, null, null, false, 76, null);
            case 2:
                return new IconPageData<>(j.b.a.f164684d, this.labelProvider.c(or2.a.f148597g), null, null, null, null, false, 76, null);
            case 3:
                return new IconPageData<>(j.b.a.f164684d, this.labelProvider.c(or2.a.f148601k), this.labelProvider.c(or2.a.f148602l), null, null, null, false, 72, null);
            case 4:
                return new IconPageData<>(j.b.C4090b.f164686d, this.labelProvider.c(or2.a.f148607q), this.labelProvider.c(or2.a.f148606p), null, null, null, false, 72, null);
            case 5:
                return new IconPageData<>(j.b.C4090b.f164686d, this.labelProvider.c(or2.a.f148611u), this.labelProvider.c(or2.a.f148610t), null, null, null, false, 72, null);
            case 6:
                return new IconPageData<>(j.b.c.f164688d, this.labelProvider.c(or2.a.f148605o), this.labelProvider.c(or2.a.f148604n), null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(or2.a.f148603m), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: xr2.a
                    @Override // er.a
                    public final Object a() {
                        return b.f(openUrl, this);
                    }
                }, 35, null), null, null, 6, null), false, 72, null);
            case 7:
                return new IconPageData<>(j.b.c.f164688d, this.labelProvider.c(or2.a.f148609s), this.labelProvider.c(or2.a.f148608r), null, null, null, false, 72, null);
            case 8:
            case 9:
                return new IconPageData<>(j.b.C4090b.f164686d, this.labelProvider.c(or2.a.f148600j), this.labelProvider.c(or2.a.f148599i), null, null, null, false, 72, null);
            default:
                throw new p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(l lVar, b bVar) {
        lVar.b(bVar.passportPickupEndpoints.c0());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (state instanceof d.GetApplicationStatus) {
            return e.a.b.f214639a;
        }
        if (state instanceof d.Initialized) {
            return new e.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(or2.a.f148612v), null, null, null, 28, null), null, null, null, null, 61, null), e(((d.Initialized) params.getState()).getStatus(), params.b()), params.a());
        }
        if (state instanceof d.Error) {
            return new e.a.Error(((d.Error) params.getState()).getErrorVMS());
        }
        throw new p();
    }
}
