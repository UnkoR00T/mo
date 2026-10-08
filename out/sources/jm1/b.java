package jm1;

import fr.k;
import fr.t;
import hz.d;
import hz.g;
import iy.b0;
import iy.c0;
import j14.m;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0017B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ljm1/b;", "Lgz/a;", "Ljm1/b$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lg14/a;", "getInfoFromPeselUC", "Lj14/m;", "checkPeselNumberCorrectUC", "Lhz/d;", "conditionValidator", "<init>", "(Lmx/c;Lg14/a;Lj14/m;Lhz/d;)V", "Lmm1/a;", "type", "Lxw/g;", "pesel", "c", "(Lmm1/a;Liy/b0;)Lhz/g;", "params", "b", "(Ljm1/b$b;)Lhz/g;", "a", "Lmx/c;", "Lg14/a;", "Lj14/m;", "d", "Lhz/d;", "e", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.a<Params, g> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f103750e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f103751f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d conditionValidator;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljm1/b$a;", "", "<init>", "()V", "", "CHILD_MAX_AGE", "I", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: jm1.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljm1/b$b;", "Lgz/b$a;", "Lmm1/a;", "type", "Lxw/g;", "pesel", "<init>", "(Lmm1/a;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmm1/a;", "b", "()Lmm1/a;", "Liy/b0;", "()Liy/b0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f103756c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mm1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pesel;

        public /* synthetic */ Params(mm1.a aVar, b0 b0Var, k kVar) {
            this(aVar, b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getPesel() {
            return this.pesel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final mm1.a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.type == params.type && xw.g.f(this.pesel, params.pesel);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + xw.g.h(this.pesel);
        }

        public String toString() {
            return "Params(type=" + this.type + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ')';
        }

        private Params(mm1.a aVar, b0 b0Var) {
            this.type = aVar;
            this.pesel = b0Var;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103759a;

        static {
            int[] iArr = new int[mm1.a.values().length];
            try {
                iArr[mm1.a.WARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mm1.a.CHILD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103759a = iArr;
        }
    }

    public b(mx.c cVar, g14.a aVar, m mVar, d dVar) {
        this.labelProvider = cVar;
        this.getInfoFromPeselUC = aVar;
        this.checkPeselNumberCorrectUC = mVar;
        this.conditionValidator = dVar;
    }

    private final g c(mm1.a type, b0 pesel) {
        int i15 = c.f103759a[type.ordinal()];
        if (i15 == 1) {
            return g.b.f86853b;
        }
        if (i15 != 2) {
            throw new p();
        }
        g14.a.b bVarA = this.getInfoFromPeselUC.a(new g14.a.Params(pesel, null));
        return this.conditionValidator.e(this.labelProvider.c(em1.a.P)).a(Boolean.valueOf((bVarA instanceof g14.a.b.Success) && ((g14.a.b.Success) bVarA).getAge() < 18));
    }

    public g b(Params params) {
        g gVarA = this.checkPeselNumberCorrectUC.a(new m.Params(c0.e(params.getPesel()), false, 2, null));
        if (gVarA instanceof g.Invalid) {
            return gVarA;
        }
        if (t.c(gVarA, g.b.f86853b)) {
            return c(params.getType(), params.getPesel());
        }
        throw new p();
    }
}
