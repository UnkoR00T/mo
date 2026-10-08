package kv3;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkv3/e;", "Lxw/f;", "Lkv3/e$a;", "Ljv3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lkv3/e$a;)Ljv3/d$a;", "a", "Lmx/c;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, jv3.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: kv3.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkv3/e$a;", "", "Ljv3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onInterruptClick", "onBackClick", "<init>", "(Ljv3/c;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljv3/c;", "c", "()Ljv3/c;", "b", "Ler/a;", "()Ler/a;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final jv3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInterruptClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Params(jv3.c cVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = cVar;
            this.onInterruptClick = aVar;
            this.onBackClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onInterruptClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jv3.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onInterruptClick, params.onInterruptClick) && t.c(this.onBackClick, params.onBackClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onInterruptClick.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onInterruptClick=" + this.onInterruptClick + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public jv3.d.a b(Params params) {
        jv3.c state = params.getState();
        if (t.c(state, jv3.c.a.f106103a)) {
            return jv3.d.a.C2518a.f106108a;
        }
        if (!(state instanceof jv3.c.Loader)) {
            throw new p();
        }
        er.a<i0> aVarA = params.a();
        String documentName = ((jv3.c.Loader) params.getState()).getDocumentName();
        return new jv3.d.a.Loader(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), documentName != null ? mx.b.b(documentName, "documentName") : null, null, null, null, 28, null), null, null, null, null, 61, null), new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(fv3.a.f67639b), null, 2, null), k30.d.c.f107775a, k30.b.c.f107768a, params.b(), 3, null), this.labelProvider.c(fv3.a.f67640c), this.labelProvider.c(fv3.a.f67643f), this.labelProvider.c(fv3.a.f67641d), ((jv3.c.Loader) params.getState()).getShowTakesTooLong(), aVarA);
    }
}
