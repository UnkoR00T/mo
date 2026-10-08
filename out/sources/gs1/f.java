package gs1;

import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgs1/f;", "Lxw/f;", "Lgs1/f$a;", "Lgs1/e$a;", "<init>", "()V", "params", "c", "(Lgs1/f$a;)Lgs1/e$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, e.Data> {

    /* JADX INFO: renamed from: gs1.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgs1/f$a;", "", "Lgs1/d;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onInputChanged", "Lkotlin/Function0;", "onNext", "<init>", "(Lgs1/d;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgs1/d;", "c", "()Lgs1/d;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onInputChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNext;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super String, i0> lVar, er.a<i0> aVar) {
            this.state = state;
            this.onInputChanged = lVar;
            this.onNext = aVar;
        }

        public final er.l<String, i0> a() {
            return this.onInputChanged;
        }

        public final er.a<i0> b() {
            return this.onNext;
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onInputChanged, params.onInputChanged) && fr.t.c(this.onNext, params.onNext);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onInputChanged.hashCode()) * 31) + this.onNext.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onInputChanged=" + this.onInputChanged + ", onNext=" + this.onNext + ')';
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.Data b(Params params) {
        return new e.Data(new v50.c.Text(null, mx.b.b("First step data", ""), mx.b.b("Input data for the first step", ""), mx.b.b(params.getState().getFirstStepData().getFoo(), ""), params.getState().getIsInputValid() ? hz.b.d.f86848c : new hz.b.Invalid(mx.b.b("Field is required", "")), null, null, params.a(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048417, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Go to second screen", ""), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
    }
}
