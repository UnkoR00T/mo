package sr;

import java.util.Set;
import pq.e1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 sr.m, still in use, count: 1, list:
  (r4v0 sr.m) from 0x0074: FILLED_NEW_ARRAY (r4v0 sr.m), (r5v0 sr.m), (r6v0 sr.m), (r7v0 sr.m), (r8v0 sr.m), (r9v0 sr.m), (r10v0 sr.m) A[WRAPPED] elemType: sr.m
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class m {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37037x0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.f f183585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs.f f183586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oq.k f183587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oq.k f183588d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ wq.a f183584r = wq.b.a(b());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f183573e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<m> f183574f = e1.i(new m("Char"), new m("Byte"), new m("Short"), new m("Int"), new m("Float"), new m("Long"), new m(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37037x0));

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
    }

    private m(String str) {
        super(str, i);
        this.f183585a = zs.f.l(str);
        this.f183586b = zs.f.l(str + "Array");
        oq.o oVar = oq.o.PUBLICATION;
        this.f183587c = oq.l.b(oVar, new k(this));
        this.f183588d = oq.l.b(oVar, new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zs.c j(m mVar) {
        return p.B.b(mVar.f183586b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zs.c r(m mVar) {
        return p.B.b(mVar.f183585a);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f183583q.clone();
    }

    public final zs.c k() {
        return (zs.c) this.f183588d.getValue();
    }

    public final zs.f n() {
        return this.f183586b;
    }

    public final zs.c o() {
        return (zs.c) this.f183587c.getValue();
    }

    public final zs.f p() {
        return this.f183585a;
    }
}
