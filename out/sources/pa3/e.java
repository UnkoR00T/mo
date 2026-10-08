package pa3;

import fr.t;
import fz.FormattedRangeDate;
import ga3.Stage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.CustomSingleCardData;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import z93.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0017B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006 "}, d2 = {"Lpa3/e;", "Lxw/f;", "Lpa3/e$b;", "Ln50/f;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lzw/a;", "accessibilityFormatter", "<init>", "(Lmx/c;Lez/e;Lzw/a;)V", "", "", "e", "(Ljava/util/List;)Ljava/util/List;", "Lz93/r;", "Lmx/a;", "f", "(Lz93/r;)Lmx/a;", "params", "c", "(Lpa3/e$b;)Ln50/f;", "a", "Lmx/c;", "b", "Lez/e;", "Lzw/a;", "d", "Ljava/lang/String;", "unknownCountryText", "unknownCountriesText", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, CustomSingleCardData> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f153914f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f153915g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zw.a accessibilityFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String unknownCountryText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String unknownCountriesText;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpa3/e$a;", "", "<init>", "()V", "", "COUNTRIES_SEPARATOR", "Ljava/lang/String;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153923a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.PLANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f153923a = iArr;
        }
    }

    public e(mx.c cVar, ez.e eVar, zw.a aVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.accessibilityFormatter = aVar;
        this.unknownCountryText = cVar.c(r93.a.A1).getText();
        this.unknownCountriesText = cVar.c(r93.a.f172535z1).getText();
    }

    private final List<String> e(List<String> list) {
        List<String> listN = v.n();
        for (String str : list) {
            String str2 = (String) v.z0(listN);
            if (!t.c(str2, str) || t.c(str, this.unknownCountryText)) {
                if (!t.c(str, this.unknownCountryText) || !t.c(str2, this.unknownCountriesText)) {
                    listN = (t.c(str, this.unknownCountryText) && t.c(str2, this.unknownCountryText)) ? v.M0(v.g0(listN, 1), this.unknownCountriesText) : v.M0(listN, str);
                }
            }
        }
        return listN;
    }

    private final Label f(r rVar) {
        int i15 = rVar == null ? -1 : c.f153923a[rVar.ordinal()];
        if (i15 == -1) {
            return null;
        }
        if (i15 == 1) {
            return this.labelProvider.c(r93.a.Z0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(r93.a.Y0);
        }
        if (i15 == 3) {
            return this.labelProvider.c(r93.a.X0);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public CustomSingleCardData b(Params params) {
        Label labelF = f(params.getTravelType());
        List<Stage> listA = params.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            String countryName = ((Stage) it.next()).getPlace().getCountryName();
            if (countryName == null) {
                countryName = this.unknownCountryText;
            }
            arrayList.add(countryName);
        }
        Label labelB = mx.b.b(v.v0(e(arrayList), " · ", null, null, 0, null, null, 62, null), "mainCardTitle");
        List<Stage> listA2 = params.a();
        return new CustomSingleCardData("mainCard", new la3.b(labelF, labelB, new la3.b.DescriptionLabel(mx.b.b(FormattedRangeDate.b(this.dateFormatter.a(new fz.e.LocalDate(((Stage) v.l0(listA2)).getDateRange().getStart(), ((Stage) v.x0(listA2)).getDateRange().getEnd())), null, 1, null), "mainCardDescription"), this.accessibilityFormatter.a(((Stage) v.l0(listA2)).getDateRange().getStart(), ((Stage) v.x0(listA2)).getDateRange().getEnd()))), null, false, null, null, false, null, 252, null);
    }

    /* JADX INFO: renamed from: pa3.e$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lpa3/e$b;", "", "Lz93/r;", "travelType", "", "Lga3/c;", "stages", "<init>", "(Lz93/r;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz93/r;", "b", "()Lz93/r;", "Ljava/util/List;", "()Ljava/util/List;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r travelType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Stage> stages;

        public Params(r rVar, List<Stage> list) {
            this.travelType = rVar;
            this.stages = list;
        }

        public final List<Stage> a() {
            return this.stages;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final r getTravelType() {
            return this.travelType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.travelType == params.travelType && t.c(this.stages, params.stages);
        }

        public int hashCode() {
            r rVar = this.travelType;
            return ((rVar == null ? 0 : rVar.hashCode()) * 31) + this.stages.hashCode();
        }

        public String toString() {
            return "Params(travelType=" + this.travelType + ", stages=" + this.stages + ')';
        }

        public /* synthetic */ Params(r rVar, List list, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : rVar, list);
        }
    }
}
