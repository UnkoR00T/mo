package kr2;

import al0.o0;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import ir2.State;
import ir2.g;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import t40.InfoRowListData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkr2/a;", "Lxw/f;", "Lkr2/a$a;", "Lir2/g$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "Lyq2/a;", "location", "Lal0/o0;", "reason", "Lir2/g$b;", "e", "(Lyq2/a;Lal0/o0;)Lir2/g$b;", "", "stringRes", "", "value", "valueTag", "Lmx/a;", "f", "(ILjava/lang/String;Ljava/lang/String;)Lmx/a;", "message", "Lt40/a$a;", "c", "(I)Lt40/a$a;", "params", "h", "(Lkr2/a$a;)Lir2/g$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/c;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: kr2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkr2/a$a;", "", "Lir2/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Lir2/f;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lir2/f;", "b", "()Lir2/f;", "Ler/a;", "()Ler/a;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onClose = aVar;
        }

        public final er.a<i0> a() {
            return this.onClose;
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
            return t.c(this.state, params.state) && t.c(this.onClose, params.onClose);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112297a;

        static {
            int[] iArr = new int[yq2.a.values().length];
            try {
                iArr[yq2.a.Poland.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yq2.a.Aboard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112297a = iArr;
        }
    }

    public a(c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    private final t40.a.C4874a c(int message) {
        return new t40.a.C4874a(this.labelProvider.c(message));
    }

    private final g.IconPageContentData e(yq2.a location, o0 reason) {
        List listS;
        int i15 = b.f112297a[location.ordinal()];
        if (i15 == 1) {
            listS = v.s(c(qq2.a.Y), reason == o0.Damage ? c(qq2.a.W) : null);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            listS = v.s(c(qq2.a.U), reason == o0.Damage ? c(qq2.a.V) : null);
        }
        return new g.IconPageContentData(new InfoRowListData(listS));
    }

    private final Label f(int stringRes, String value, String valueTag) {
        return this.labelProvider.c(stringRes).o(Label.INSTANCE.d()).o(mx.b.b(value, valueTag));
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        return new g.Data(new BaseScaffoldData(null, null, null, null, null, null, 63, null), new IconPageData(j.b.c.f164688d, this.labelProvider.c(qq2.a.f168104a0), f(qq2.a.Z, params.getState().getSuccessData().getInvalidateData().getInvalidatedPassportResponse().getNumber(), "PassportNumber"), f(qq2.a.X, this.dateConverter.a(params.getState().getSuccessData().getInvalidateData().getInvalidatedPassportResponse().getInvalidationDate().getDate()), "InvalidationDate"), e(params.getState().getSuccessData().getLocationData().getLocation(), params.getState().getSuccessData().getReasonData().getPassportInvalidationReason()), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(qq2.a.f168113f), null, 2, null), d.a.f107773a, null, params.a(), 35, null), null, null, 6, null), false, 64, null));
    }
}
