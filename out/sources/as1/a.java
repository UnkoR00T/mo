package as1;

import er.l;
import fr.t;
import fu.r;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import v50.c;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zr1.State;
import zr1.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Las1/a;", "Lxw/f;", "Las1/a$a;", "Lzr1/e$a;", "<init>", "()V", "params", "c", "(Las1/a$a;)Lzr1/e$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, e.Data> {

    /* JADX INFO: renamed from: as1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"Las1/a$a;", "", "Lzr1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "", "onUrlChanged", "onSend", "<init>", "(Lzr1/d;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzr1/d;", "d", "()Lzr1/d;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSend;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super String, i0> lVar, er.a<i0> aVar2) {
            this.state = state;
            this.onBack = aVar;
            this.onUrlChanged = lVar;
            this.onSend = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onSend;
        }

        public final l<String, i0> c() {
            return this.onUrlChanged;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onUrlChanged, params.onUrlChanged) && t.c(this.onSend, params.onSend);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onUrlChanged.hashCode()) * 31) + this.onSend.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onUrlChanged=" + this.onUrlChanged + ", onSend=" + this.onSend + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), b.b("Request", "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null), new c.Text("developerRequestUrlInput", b.b("Endpoint URL", ""), b.b("https://example.com/api", ""), b.b(params.getState().getUrl(), ""), null, null, null, params.c(), null, !params.getState().getIsSending(), 0, null, false, null, false, null, null, null, null, null, 1047920, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(b.b(params.getState().getIsSending() ? "Sending..." : "Send", ""), null, 2, null), d.a.f107773a, (params.getState().getIsSending() || r.t0(params.getState().getUrl())) ? k30.b.C2562b.f107767a : k30.b.c.f107768a, params.b(), 3, null), params.getState().getResult(), params.getState().getIsSending(), params.a());
    }
}
