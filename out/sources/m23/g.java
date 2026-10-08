package m23;

import fr.t;
import hz.i;
import k23.o;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lm23/g;", "Lgz/b;", "Lm23/g$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lhz/h;", "e", "()Lhz/h;", "params", "d", "(Lm23/g$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lhz/i;", "getValidatorTextFactory", "()Lhz/i;", "c", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123416d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: m23.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lm23/g$b;", "Lgz/b$a;", "", "webAddress", "Lk23/o;", "webAddressAnswer", "<init>", "(Ljava/lang/String;Lk23/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lk23/o;", "()Lk23/o;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String webAddress;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o webAddressAnswer;

        public Params(String str, o oVar) {
            this.webAddress = str;
            this.webAddressAnswer = oVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getWebAddress() {
            return this.webAddress;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o getWebAddressAnswer() {
            return this.webAddressAnswer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.webAddress, params.webAddress) && this.webAddressAnswer == params.webAddressAnswer;
        }

        public int hashCode() {
            return (this.webAddress.hashCode() * 31) + this.webAddressAnswer.hashCode();
        }

        public String toString() {
            return "Params(webAddress=" + this.webAddress + ", webAddressAnswer=" + this.webAddressAnswer + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123421a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.NO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.YES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f123421a = iArr;
        }
    }

    public g(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final hz.h e() {
        return this.validatorTextFactory.a().M(this.labelProvider.c(h23.b.f80125b0)).y(300, this.labelProvider.e(h23.b.Z, "300")).q(this.labelProvider.c(h23.b.f80128c0)).p(this.labelProvider.c(h23.b.f80128c0));
    }

    public Object d(Params params, tq.e<? super hz.g> eVar) {
        int i15 = c.f123421a[params.getWebAddressAnswer().ordinal()];
        if (i15 == 1) {
            return hz.g.b.f86853b;
        }
        if (i15 == 2) {
            return e().a(params.getWebAddress());
        }
        throw new p();
    }
}
