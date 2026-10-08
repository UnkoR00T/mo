package s12;

import fr.t;
import i50.BaseScaffoldData;
import java.util.Locale;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import r70.BaseFloatingActionButtonData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ls12/g;", "Lxw/f;", "Ls12/g$a;", "Lr12/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lr70/a;", "h", "(Ler/a;)Lr70/a;", "", "title", "Leo0/t;", "type", "Lx50/a;", "menuType", "onClose", "onWriteNewMessage", "Li50/a;", "e", "(Ljava/lang/String;Leo0/t;Lx50/a;Ler/a;Ler/a;)Li50/a;", "params", "c", "(Ls12/g$a;)Lr12/d$a;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, r12.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: s12.g$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Ls12/g$a;", "", "Lr12/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "writeMessageAction", "<init>", "(Lr12/c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr12/c;", "b", "()Lr12/c;", "Ler/a;", "()Ler/a;", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r12.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> writeMessageAction;

        public Params(r12.c cVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onClose = aVar;
            this.writeMessageAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onClose;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final r12.c getState() {
            return this.state;
        }

        public final er.a<i0> c() {
            return this.writeMessageAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose) && t.c(this.writeMessageAction, params.writeMessageAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.writeMessageAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", writeMessageAction=" + this.writeMessageAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177462a;

        static {
            int[] iArr = new int[eo0.t.values().length];
            try {
                iArr[eo0.t.OUTBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f177462a = iArr;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final BaseScaffoldData e(String title, eo0.t type, x50.a menuType, er.a<i0> onClose, er.a<i0> onWriteNewMessage) {
        i0 i0Var = i0.f148189a;
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onClose), mx.b.d(title, dz.e.b(type.name().toLowerCase(Locale.ROOT), null, 1, null) + "Title"), null, menuType, null, 20, null), v.e(h(onWriteNewMessage)), null, null, null, 57, null);
    }

    static /* synthetic */ BaseScaffoldData f(g gVar, String str, eo0.t tVar, x50.a aVar, er.a aVar2, er.a aVar3, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            aVar = null;
        }
        return gVar.e(str, tVar, aVar, aVar2, aVar3);
    }

    private final BaseFloatingActionButtonData h(er.a<i0> onClick) {
        return new BaseFloatingActionButtonData(jz.a.f106768f0, new BaseFloatingActionButtonData.InterfaceC4389a.Extended(this.labelProvider.c(e02.a.X1)), onClick);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public r12.d.a b(Params params) {
        r12.c state = params.getState();
        if (state instanceof r12.c.Error) {
            return new r12.d.a.Error(((r12.c.Error) params.getState()).getErrorVMS());
        }
        if (state instanceof r12.c.Empty) {
            return new r12.d.a.b.Empty(f(this, ((r12.c.Empty) params.getState()).getData().getTitle(), ((r12.c.Empty) params.getState()).getData().getType(), null, params.a(), params.c(), 4, null), params.a(), new IconPageData(new j.a(jz.a.f106754d2), this.labelProvider.c(e02.a.f46541h2), null, null, null, null, false, 76, null));
        }
        if ((state instanceof r12.c.Initial) || (state instanceof r12.c.RetryingFetchingMessages)) {
            return r12.d.a.c.f170541a;
        }
        if ((state instanceof r12.c.Displaying) || (state instanceof r12.c.SigningMessage)) {
            return new r12.d.a.b.Displaying(f(this, params.getState().getData().getTitle(), params.getState().getData().getType(), null, params.a(), params.c(), 4, null), params.a(), b.f177462a[params.getState().getData().getType().ordinal()] == 1 ? new c30.b.c(null, null, null, this.labelProvider.c(e02.a.V3), null, null, null, 119, null) : null);
        }
        throw new p();
    }
}
