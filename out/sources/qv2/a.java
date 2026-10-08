package qv2;

import fr.k;
import fr.t;
import hz.d;
import hz.g;
import oq.p;
import p071kotlin.Metadata;
import sw2.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqv2/a;", "Lgz/b;", "Lqv2/a$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/d;", "conditionValidator", "<init>", "(Lmx/c;Lhz/d;)V", "params", "d", "(Lqv2/a$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/d;", "c", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C4270a f169081c = new C4270a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f169082d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d conditionValidator;

    /* JADX INFO: renamed from: qv2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqv2/a$a;", "", "<init>", "()V", "", "CHILD_MAX_AGE", "I", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C4270a {
        public /* synthetic */ C4270a(k kVar) {
            this();
        }

        private C4270a() {
        }
    }

    /* JADX INFO: renamed from: qv2.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqv2/a$b;", "Lgz/b$a;", "Lsw2/e;", "dataRequester", "Lg14/a$b;", "peselInfo", "<init>", "(Lsw2/e;Lg14/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsw2/e;", "()Lsw2/e;", "b", "Lg14/a$b;", "()Lg14/a$b;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e dataRequester;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g14.a.b peselInfo;

        public Params(e eVar, g14.a.b bVar) {
            this.dataRequester = eVar;
            this.peselInfo = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getDataRequester() {
            return this.dataRequester;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g14.a.b getPeselInfo() {
            return this.peselInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.dataRequester == params.dataRequester && t.c(this.peselInfo, params.peselInfo);
        }

        public int hashCode() {
            return (this.dataRequester.hashCode() * 31) + this.peselInfo.hashCode();
        }

        public String toString() {
            return "Params(dataRequester=" + this.dataRequester + ", peselInfo=" + this.peselInfo + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169087a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.GUARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f169087a = iArr;
        }
    }

    public a(mx.c cVar, d dVar) {
        this.labelProvider = cVar;
        this.conditionValidator = dVar;
    }

    public Object d(Params params, tq.e<? super g> eVar) {
        int i15 = c.f169087a[params.getDataRequester().ordinal()];
        if (i15 == 1) {
            return this.conditionValidator.e(this.labelProvider.c(gv2.a.D0)).a(vq.b.a((params.getPeselInfo() instanceof g14.a.b.Success) && ((g14.a.b.Success) params.getPeselInfo()).getAge() < 18));
        }
        if (i15 == 2) {
            return this.conditionValidator.e(this.labelProvider.c(gv2.a.f77283m0)).a(vq.b.a(params.getPeselInfo() instanceof g14.a.b.Success));
        }
        throw new p();
    }
}
