package h11;

import ez.e;
import fr.t;
import g11.d;
import i50.BaseScaffoldData;
import java.time.OffsetDateTime;
import java.util.List;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import vi0.MyCase;
import vi0.MyCaseAdditionalData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lh11/a;", "Lxw/f;", "Lh11/a$a;", "Lg11/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lvi0/b;", "case", "Lvi0/c;", "additionalData", "", "Ln50/g;", "f", "(Lvi0/b;Lvi0/c;)Ljava/util/List;", "Lr50/g;", "c", "(Lvi0/b;)Lr50/g;", "params", "e", "(Lh11/a$a;)Lg11/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: h11.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lh11/a$a;", "", "Lg11/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lg11/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg11/c;", "b", "()Lg11/c;", "Ler/a;", "()Ler/a;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g11.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(g11.c cVar, er.a<i0> aVar) {
            this.state = cVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g11.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79636a;

        static {
            int[] iArr = new int[MyCase.a.values().length];
            try {
                iArr[MyCase.a.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyCase.a.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MyCase.a.ORANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MyCase.a.YELLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MyCase.a.RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MyCase.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f79636a = iArr;
        }
    }

    public a(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final g c(MyCase myCase) {
        switch (b.f79636a[myCase.getLabelColor().ordinal()]) {
            case 1:
                return g.POSITIVE;
            case 2:
                return g.INFORMATIVE;
            case 3:
                return g.NOTICE;
            case 4:
                return g.NOTICE;
            case 5:
                return g.NEGATIVE;
            case 6:
                return g.NEGATIVE;
            default:
                throw new p();
        }
    }

    private final List<DefaultSingleCardData> f(MyCase myCase, MyCaseAdditionalData additionalData) {
        String receiverOrganizationName;
        String statusDescription;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(d11.a.f39420e), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, mx.b.d(myCase.getStatus(), "status"), null, 0, false, c(myCase), 13, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData2 = (additionalData == null || (statusDescription = additionalData.getStatusDescription()) == null) ? null : new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(d11.a.f39416a), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(statusDescription, "additionalDataStatusDescription"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        OffsetDateTime creationDate = myCase.getCreationDate();
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(d11.a.f39417b), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(creationDate != null ? this.dateFormatter.d(new fz.b.OffsetDateTime(creationDate), fz.c.DOTTED) : null, "caseCreationDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        OffsetDateTime lastModificationDate = myCase.getLastModificationDate();
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(d11.a.f39418c), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(lastModificationDate != null ? this.dateFormatter.d(new fz.b.OffsetDateTime(lastModificationDate), fz.c.DOTTED) : null, "caseLastModificationDate"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        if (additionalData == null || (receiverOrganizationName = additionalData.getCaseContentDescription()) == null) {
            receiverOrganizationName = myCase.getReceiverOrganizationName();
        }
        return v.s(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(d11.a.f39419d), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(receiverOrganizationName, "receiverOrganizationName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        g11.c state = params.getState();
        if (state instanceof g11.c.a) {
            return d.a.C1559a.f69553a;
        }
        if (!(state instanceof g11.c.Initialized)) {
            throw new p();
        }
        return new d.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(d11.a.f39421f), null, null, null, 28, null), null, null, null, null, 61, null), mx.b.b(((g11.c.Initialized) params.getState()).getCase().getName(), "caseName"), new CardListData(f(((g11.c.Initialized) params.getState()).getCase(), ((g11.c.Initialized) params.getState()).getAdditionalData()), null, false, null, null, 30, null));
    }
}
