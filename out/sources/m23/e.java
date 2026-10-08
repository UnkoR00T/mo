package m23;

import fr.t;
import hz.i;
import k23.m;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lm23/e;", "Lgz/b;", "Lm23/e$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lk23/m;", "locationType", "Lhz/h;", "e", "(Lk23/m;)Lhz/h;", "params", "d", "(Lm23/e$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lhz/i;", "getValidatorTextFactory", "()Lhz/i;", "c", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123403d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: m23.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lm23/e$b;", "Lgz/b$a;", "", "text", "Lk23/m;", "locationType", "<init>", "(Ljava/lang/String;Lk23/m;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "b", "Lk23/m;", "()Lk23/m;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final m locationType;

        public Params(String str, m mVar) {
            this.text = str;
            this.locationType = mVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final m getLocationType() {
            return this.locationType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.text, params.text) && this.locationType == params.locationType;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.locationType.hashCode();
        }

        public String toString() {
            return "Params(text=" + this.text + ", locationType=" + this.locationType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f123408a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.CARRIAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f123408a = iArr;
        }
    }

    public e(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final hz.h e(m locationType) {
        Label labelC;
        hz.c.Companion companion = hz.c.INSTANCE;
        hz.h hVarY = this.validatorTextFactory.a().y(300, this.labelProvider.e(h23.b.Z, "300"));
        int i15 = c.f123408a[locationType.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(h23.b.N0);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            labelC = this.labelProvider.c(h23.b.J0);
        }
        return (hz.h) companion.a(hVarY.M(labelC), new l0(this.labelProvider.e(h23.b.f80143h0, ".,?!-:;()„\""), l23.a.a()));
    }

    public Object d(Params params, tq.e<? super hz.g> eVar) {
        return e(params.getLocationType()).a(params.getText());
    }
}
