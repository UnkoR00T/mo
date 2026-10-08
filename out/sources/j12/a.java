package j12;

import c30.b;
import er.l;
import fr.t;
import i12.e;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import u10.d;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001b"}, d2 = {"Lj12/a;", "Lxw/f;", "Lj12/a$a;", "Li12/e$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Lu10/d;", "markdownParser", "<init>", "(Lmx/c;Lu04/a;Lu10/d;)V", "Lkotlin/Function1;", "", "Loq/i0;", "onLinkClick", "Lc30/b$c;", "c", "(Ler/l;)Lc30/b$c;", "params", "e", "(Lj12/a$a;)Li12/e$a;", "a", "Lmx/c;", "b", "Lu04/a;", "Lu10/d;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d markdownParser;

    /* JADX INFO: renamed from: j12.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lj12/a$a;", "", "Li12/d;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onLinkClick", "Lkotlin/Function0;", "onCloseClick", "<init>", "(Li12/d;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li12/d;", "c", "()Li12/d;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i12.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i12.d dVar, l<? super String, i0> lVar, er.a<i0> aVar) {
            this.state = dVar;
            this.onLinkClick = lVar;
            this.onCloseClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        public final l<String, i0> b() {
            return this.onLinkClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final i12.d getState() {
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
            return t.c(this.state, params.state) && t.c(this.onLinkClick, params.onLinkClick) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onLinkClick.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onLinkClick=" + this.onLinkClick + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public a(c cVar, u04.a aVar, d dVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
        this.markdownParser = dVar;
    }

    private final b.c c(l<? super String, i0> onLinkClick) {
        return new b.c(null, null, null, this.labelProvider.c(e02.a.A2), null, null, new c30.a.Link(new LinkData("faqLink", this.labelProvider.c(e02.a.O), this.commonEndpoints.W(), LinkData.EnumC5775a.WEBSITE, false, onLinkClick, 16, null)), 55, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        i12.d state = params.getState();
        if (t.c(state, i12.d.a.f88309a)) {
            return e.a.C2080a.f88311a;
        }
        if (!(state instanceof i12.d.Initialized)) {
            throw new p();
        }
        return new e.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(e02.a.Q), null, null, null, 28, null), null, null, null, null, 61, null), this.markdownParser.parse(((i12.d.Initialized) params.getState()).getFaq()), c(params.b()));
    }
}
