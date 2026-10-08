package cr1;

import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcr1/a;", "Lxw/f;", "Lcr1/a$a;", "Lcr1/f$a;", "Lez/e;", "dateFormatter", "<init>", "(Lez/e;)V", "params", "c", "(Lcr1/a$a;)Lcr1/f$a;", "a", "Lez/e;", "getDateFormatter", "()Lez/e;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: cr1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcr1/a$a;", "", "Lcr1/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onTimeInputClicked", "onCloseClick", "<init>", "(Lcr1/e;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcr1/e;", "c", "()Lcr1/e;", "b", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f37303d = fz.b.OffsetTime.f68867b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTimeInputClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onTimeInputClicked = aVar;
            this.onCloseClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        public final er.a<i0> b() {
            return this.onTimeInputClicked;
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
            return t.c(this.state, params.state) && t.c(this.onTimeInputClicked, params.onTimeInputClicked) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onTimeInputClicked.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTimeInputClicked=" + this.onTimeInputClicked + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    public a(ez.e eVar) {
        this.dateFormatter = eVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f.Data b(Params params) {
        String strD;
        Label labelB = mx.b.b("Label", "");
        fz.b.OffsetTime selectedTime = params.getState().getSelectedTime();
        return new f.Data(new InputDateTimeData(null, labelB, (selectedTime == null || (strD = this.dateFormatter.d(selectedTime, fz.c.ONLY_HOUR)) == null) ? "" : strD, InputDateTimeData.b.c.f203785c, null, null, null, mx.b.b("Helper text.", ""), false, null, params.b(), 881, null), params.a());
    }
}
