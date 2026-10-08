package rd2;

import fr.t;
import i50.BaseScaffoldData;
import ll0.IdVerificationData;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageData;
import q40.j;
import qd2.State;
import qd2.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrd2/a;", "Lxw/f;", "Lrd2/a$a;", "Lqd2/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lrd2/a$a;)Lqd2/e$a;", "a", "Lmx/c;", "Lll0/a$a;", "Lq40/j$b;", "c", "(Lll0/a$a;)Lq40/j$b;", "iconSection", "idverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: rd2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lrd2/a$a;", "", "Lqd2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "nextAction", "<init>", "(Lqd2/d;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqd2/d;", "b", "()Lqd2/d;", "Ler/a;", "()Ler/a;", "c", "getNextAction", "idverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.backAction = aVar;
            this.nextAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.nextAction, params.nextAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.nextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", nextAction=" + this.nextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173255a;

        static {
            int[] iArr = new int[IdVerificationData.EnumC2884a.values().length];
            try {
                iArr[IdVerificationData.EnumC2884a.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdVerificationData.EnumC2884a.SUSPENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdVerificationData.EnumC2884a.INVALIDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173255a = iArr;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final j.b c(IdVerificationData.EnumC2884a enumC2884a) {
        int i15 = b.f173255a[enumC2884a.ordinal()];
        if (i15 == 1) {
            return j.b.c.f164688d;
        }
        if (i15 == 2 || i15 == 3) {
            return j.b.a.f164684d;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(md2.a.f125660a), null, null, null, 28, null), null, null, null, null, 61, null);
        IdVerificationData data = params.getState().getData();
        return new e.Data(baseScaffoldData, new IconPageData(c(data.getStatus()), mx.b.b(data.getTitle(), "title"), mx.b.b(data.getMessage(), "description"), null, null, null, false, 72, null));
    }
}
