package d71;

import c71.Error;
import c71.b;
import c71.d;
import c71.e;
import c71.g;
import c71.h;
import c71.i;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld71/a;", "Lxw/f;", "Ld71/a$a;", "Lc71/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Ld71/a$a;)Lc71/i$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: d71.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ld71/a$a;", "", "Lc71/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Lc71/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc71/b;", "b", "()Lc71/b;", "Ler/a;", "()Ler/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(b bVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        b state = params.getState();
        if (t.c(state, b.a.f23851a) || t.c(state, e.f23856a) || t.c(state, h.f23860a)) {
            return i.a.C0637a.f23862a;
        }
        if (t.c(state, d.f23853a)) {
            return new i.a.NoTrustedProfile(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.d.f164690d, this.labelProvider.c(w51.a.f210396p0), this.labelProvider.c(w51.a.f210389o0), null, i0.f148189a, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.Q3), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), true, 8, null), params.a());
        }
        if (!t.c(state, g.f23858a)) {
            if (state instanceof Error) {
                return new i.a.Error(((Error) state).getErrorVMS());
            }
            if (state instanceof c71.Error) {
                return new i.a.Error(((c71.Error) state).getErrorVMS());
            }
            throw new p();
        }
        return new i.a.Underage(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(new j.a(jz.a.f106807k2), this.labelProvider.c(w51.a.f210296a5), null, null, i0.f148189a, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.Q3), null, 2, null), k30.d.a.f107773a, null, params.a(), 35, null), true, 12, null), params.a());
    }
}
