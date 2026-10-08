package o31;

import fr.k;
import fr.t;
import hz.i;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.p;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo31/g;", "Lgz/b;", "Lo31/g$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lo31/g$a;", "nameType", "Lhz/h;", "d", "(Lo31/g$a;)Lhz/h;", "params", "e", "(Lo31/g$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lhz/i;", "getValidatorTextFactory", "()Lhz/i;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lo31/g$a;", "", "<init>", "(Ljava/lang/String;I)V", "", "e", "()I", "a", "b", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        NAME,
        NEXT_NAMES;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f141912d = wq.b.a(b());

        /* JADX INFO: renamed from: o31.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3496a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f141913a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.NEXT_NAMES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f141913a = iArr;
            }
        }

        public final int e() {
            int i15 = C3496a.f141913a[ordinal()];
            if (i15 == 1) {
                return 30;
            }
            if (i15 == 2) {
                return DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
            }
            throw new p();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141918a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NEXT_NAMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f141918a = iArr;
        }
    }

    public g(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final hz.h d(a nameType) {
        String str;
        int iE = nameType.e();
        hz.c.Companion companion = hz.c.INSTANCE;
        hz.c cVarA = companion.a(this.validatorTextFactory.a().y(iE, this.labelProvider.e(j31.a.f99172k3, String.valueOf(iE))).M(this.labelProvider.c(j31.a.f99152g3)), new m31.d.C3018d(this.labelProvider.c(j31.a.f99187n3)));
        Label labelC = this.labelProvider.c(j31.a.f99187n3);
        int i15 = c.f141918a[nameType.ordinal()];
        if (i15 == 1) {
            str = "^[^{}\\[\\]:,'_/\\\\@#$%^&*()?!+=<>|~`]*$";
        } else {
            if (i15 != 2) {
                throw new p();
            }
            str = "^[^{}\\[\\]:'_/\\\\@#$%^&*()?!+=<>|~`]*$";
        }
        hz.h hVarF = ((hz.h) companion.a(cVarA, new m31.d.c(labelC, str))).F(this.labelProvider.c(j31.a.f99187n3));
        if (nameType == a.NEXT_NAMES) {
            hVarF.g(new m31.d.b(this.labelProvider.c(j31.a.f99187n3)));
        }
        return hVarF.o(this.labelProvider.c(j31.a.f99187n3));
    }

    public Object e(Params params, tq.e<? super hz.g> eVar) {
        String strE = c0.e(params.getText());
        return (params.getIsRequired() || strE.length() != 0) ? d(params.getNameType()).a(strE) : hz.g.b.f86853b;
    }

    /* JADX INFO: renamed from: o31.g$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lo31/g$b;", "Lgz/b$a;", "Liy/b0;", "text", "", "isRequired", "Lo31/g$a;", "nameType", "<init>", "(Liy/b0;ZLo31/g$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Z", "c", "()Z", "Lo31/g$a;", "()Lo31/g$a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f141914d = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a nameType;

        public Params(b0 b0Var, boolean z15, a aVar) {
            this.text = b0Var;
            this.isRequired = z15;
            this.nameType = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getNameType() {
            return this.nameType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.text, params.text) && this.isRequired == params.isRequired && this.nameType == params.nameType;
        }

        public int hashCode() {
            return (((this.text.hashCode() * 31) + Boolean.hashCode(this.isRequired)) * 31) + this.nameType.hashCode();
        }

        public String toString() {
            return "Params(text=" + this.text + ", isRequired=" + this.isRequired + ", nameType=" + this.nameType + ')';
        }

        public /* synthetic */ Params(b0 b0Var, boolean z15, a aVar, int i15, k kVar) {
            this(b0Var, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? a.NAME : aVar);
        }
    }
}
