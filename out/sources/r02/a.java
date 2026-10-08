package r02;

import dx.i;
import eo0.y0;
import fr.t;
import fu.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\n\b\u0007\u0018\u0000 \u001c2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0002\u001c'B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u0018*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010!J\u0013\u0010#\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0011J\u001b\u0010$\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u001dJ$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lr02/a;", "Lgz/a;", "Lr02/a$b;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Ldx/b$c;", "e", "(Lr02/a$b;)Ldx/b$c;", "Leo0/y0;", "", "c", "(Leo0/y0;)I", "d", "()Ldx/b$c;", "Lwx/g;", "", "", "uploadedFileNames", "", "j", "(Lwx/g;Ljava/util/List;)Z", "messageType", "b", "(Ljava/lang/String;Leo0/y0;)Z", "", "", "h", "(Leo0/y0;)Ljava/util/Set;", "g", "k", "f", "i", "(Lr02/a$b;)Ldx/i;", "a", "Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, i<? extends dx.b, ? extends i0>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f170101c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<Character> f170102d = e1.i('\\', '/', '?', ':', '*', '<', '>', '|', '\"', '%');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<Character> f170103e = e1.i(' ', '\t', '\n');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<Character> f170104f = e1.i('~', '\"', '#', '%', '&', '*', ':', '<', '>', '?', '!', '/', '\\', '{', '|', '}');

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: r02.a$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lr02/a$b;", "Lgz/b$a;", "Leo0/y0;", "messageType", "Lwx/g;", "pickedFile", "", "", "uploadedFileNames", "<init>", "(Leo0/y0;Lwx/g;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/y0;", "()Leo0/y0;", "b", "Lwx/g;", "()Lwx/g;", "c", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 messageType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.g pickedFile;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> uploadedFileNames;

        public Params(y0 y0Var, wx.g gVar, List<String> list) {
            this.messageType = y0Var;
            this.pickedFile = gVar;
            this.uploadedFileNames = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y0 getMessageType() {
            return this.messageType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final wx.g getPickedFile() {
            return this.pickedFile;
        }

        public final List<String> c() {
            return this.uploadedFileNames;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.messageType == params.messageType && t.c(this.pickedFile, params.pickedFile) && t.c(this.uploadedFileNames, params.uploadedFileNames);
        }

        public int hashCode() {
            return (((this.messageType.hashCode() * 31) + this.pickedFile.hashCode()) * 31) + this.uploadedFileNames.hashCode();
        }

        public String toString() {
            return "Params(messageType=" + this.messageType + ", pickedFile=" + this.pickedFile + ", uploadedFileNames=" + this.uploadedFileNames + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170109a;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.E_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.E_PUAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f170109a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final boolean b(String str, y0 y0Var) {
        Set<Character> setG = g(y0Var);
        if ((setG instanceof Collection) && setG.isEmpty()) {
            return false;
        }
        Iterator<T> it = setG.iterator();
        while (it.hasNext()) {
            if (r.c0(str, ((Character) it.next()).charValue(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private final int c(y0 y0Var) {
        int i15 = c.f170109a[y0Var.ordinal()];
        if (i15 == 1) {
            return e02.a.R1;
        }
        if (i15 == 2 || i15 == 3) {
            return e02.a.S1;
        }
        throw new p();
    }

    private final dx.b.Business d() {
        return new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(e02.a.F), this.labelProvider.c(e02.a.E), null, this.labelProvider.c(e02.a.f46550j), null, 82, null);
    }

    private final dx.b.Business e(Params params) {
        return new dx.b.Business(null, null, this.labelProvider.c(e02.a.T1), this.labelProvider.e(c(params.getMessageType()), v.v0(h(params.getMessageType()), "", null, null, 0, null, null, 62, null), Integer.valueOf(k(params.getMessageType()))), null, this.labelProvider.c(e02.a.f46550j), null, 83, null);
    }

    private final boolean f(String str, y0 y0Var) {
        return str.length() > k(y0Var);
    }

    private final Set<Character> g(y0 y0Var) {
        int i15 = c.f170109a[y0Var.ordinal()];
        if (i15 == 1) {
            return e1.l(f170104f, f170103e);
        }
        if (i15 == 2) {
            return f170102d;
        }
        if (i15 == 3) {
            return e1.e();
        }
        throw new p();
    }

    private final Set<Character> h(y0 y0Var) {
        int i15 = c.f170109a[y0Var.ordinal()];
        if (i15 == 1) {
            return f170104f;
        }
        if (i15 == 2) {
            return f170102d;
        }
        if (i15 == 3) {
            return e1.e();
        }
        throw new p();
    }

    private final boolean j(wx.g gVar, List<String> list) {
        return list.contains(gVar.c());
    }

    private final int k(y0 y0Var) {
        int i15 = c.f170109a[y0Var.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return 128;
        }
        if (i15 == 3) {
            return -1;
        }
        throw new p();
    }

    public i<dx.b, i0> i(Params params) {
        if (!f(params.getPickedFile().getName(), params.getMessageType()) && !b(params.getPickedFile().getName(), params.getMessageType())) {
            return j(params.getPickedFile(), params.c()) ? new i.Left(d()) : new i.Right(i0.f148189a);
        }
        return new i.Left(e(params));
    }
}
