package tu1;

import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import ou1.DrivingLicenceData;
import p071kotlin.Metadata;
import pq.v;
import su1.State;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltu1/b;", "Lxw/f;", "Ltu1/b$a;", "Lsu1/f$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lou1/f;", "document", "", "index", "Lmx/a;", "f", "(Lou1/f;I)Lmx/a;", "Ljava/time/LocalDate;", "localDate", "", "e", "(Ljava/time/LocalDate;)Ljava/lang/String;", "params", "h", "(Ltu1/b$a;)Lsu1/f$a;", "a", "Lmx/c;", "b", "Lez/e;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, su1.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: tu1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Ltu1/b$a;", "", "Lsu1/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lkotlin/Function1;", "Lou1/f;", "documentClickAction", "<init>", "(Lsu1/e;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsu1/e;", "c", "()Lsu1/e;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<DrivingLicenceData, i0> documentClickAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super DrivingLicenceData, i0> lVar) {
            this.state = state;
            this.backAction = aVar;
            this.documentClickAction = lVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<DrivingLicenceData, i0> b() {
            return this.documentClickAction;
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.documentClickAction, params.documentClickAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.documentClickAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", documentClickAction=" + this.documentClickAction + ')';
        }
    }

    /* JADX INFO: renamed from: tu1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C5024b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(((DrivingLicenceData) t16).getScope().getData().getReleaseDate(), ((DrivingLicenceData) t15).getScope().getData().getReleaseDate());
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final String e(LocalDate localDate) {
        return this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED);
    }

    private final Label f(DrivingLicenceData document, int index) {
        if (document.getScope().getData().getReleaseDate() == null) {
            return Label.f(this.labelProvider.c(iu1.a.f97131a0), String.valueOf(index), null, 2, null);
        }
        c cVar = this.labelProvider;
        int i15 = iu1.a.Z;
        LocalDate releaseDate = document.getScope().getData().getReleaseDate();
        return Label.f(cVar.e(i15, String.valueOf(releaseDate != null ? e(releaseDate) : null)), String.valueOf(index), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, DrivingLicenceData drivingLicenceData) {
        params.b().b(drivingLicenceData);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public su1.f.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(iu1.a.f97133b0), null, null, null, 28, null), null, null, null, null, 61, null);
        List listU0 = v.U0(params.getState().a(), new C5024b());
        ArrayList arrayList = new ArrayList(v.y(listU0, 10));
        int i15 = 0;
        for (Object obj : listU0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            final DrivingLicenceData drivingLicenceData = (DrivingLicenceData) obj;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: tu1.a
                @Override // er.a
                public final Object a() {
                    return b.i(params, drivingLicenceData);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(f(drivingLicenceData, i15), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
            i15 = i16;
        }
        return new su1.f.Data(baseScaffoldData, arrayList, this.labelProvider.c(iu1.a.f97137d0));
    }
}
