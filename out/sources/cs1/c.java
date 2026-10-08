package cs1;

import bs1.State;
import er.l;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcs1/c;", "Lxw/f;", "Lcs1/c$a;", "Lbs1/c$a;", "<init>", "()V", "params", "f", "(Lcs1/c$a;)Lbs1/c$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, bs1.c.Data> {

    /* JADX INFO: renamed from: cs1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006!"}, d2 = {"Lcs1/c$a;", "", "Lbs1/b;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onSearchText", "Lkotlin/Function0;", "onBackPressed", "onDistanceChanged", "<init>", "(Lbs1/b;Ler/l;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbs1/b;", "c", "()Lbs1/b;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "getOnBackPressed", "()Ler/a;", "d", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSearchText;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onDistanceChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, er.a<i0> aVar, l<? super String, i0> lVar2) {
            this.state = state;
            this.onSearchText = lVar;
            this.onBackPressed = aVar;
            this.onDistanceChanged = lVar2;
        }

        public final l<String, i0> a() {
            return this.onDistanceChanged;
        }

        public final l<String, i0> b() {
            return this.onSearchText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onSearchText, params.onSearchText) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.onDistanceChanged, params.onDistanceChanged);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onSearchText.hashCode()) * 31) + this.onBackPressed.hashCode()) * 31) + this.onDistanceChanged.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSearchText=" + this.onSearchText + ", onBackPressed=" + this.onBackPressed + ", onDistanceChanged=" + this.onDistanceChanged + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.b().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.a().b(str);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public bs1.c.Data b(final Params params) {
        return new bs1.c.Data(new v50.c.Text(null, mx.b.b("Co szukasz? ", ""), null, mx.b.b(params.getState().getSearchText(), ""), null, null, null, new l() { // from class: cs1.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048437, null), new v50.c.Number(null, mx.b.b("Odległość od środka warszawy w Km", ""), null, mx.b.b(params.getState().getDistance(), ""), null, null, null, new l() { // from class: cs1.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, false, 1048437, null), params.getState().e());
    }
}
