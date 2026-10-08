package p028con;

import ic.l;
import ic.q;
import ic.s;
import wq.b;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f37106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f3 f37107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h3[] f37108c;

    /* JADX INFO: Fake field, exist only in values array */
    h3 EF0;

    static {
        h3 h3Var = new h3() { // from class: con.g3
            @Override // p028con.h3
            public final q b() {
                return new l();
            }

            @Override // p028con.h3
            public final q e() {
                return new s();
            }

            @Override // p028con.h3
            public final int g() {
                return 136;
            }

            @Override // p028con.h3
            public final int j() {
                return 152;
            }

            @Override // p028con.h3
            public final int k() {
                return 3;
            }

            @Override // p028con.h3
            public final int n() {
                return 4;
            }

            @Override // p028con.h3
            public final k3 o() {
                return k3.Presence;
            }
        };
        e3 e3Var = new e3();
        f37106a = e3Var;
        f3 f3Var = new f3();
        f37107b = f3Var;
        h3[] h3VarArr = {h3Var, e3Var, f3Var};
        f37108c = h3VarArr;
        b.a(h3VarArr);
    }

    public h3(String str, int i15) {
        super(str, i15);
    }

    public static h3 valueOf(String str) {
        return (h3) Enum.valueOf(h3.class, str);
    }

    public static h3[] values() {
        return (h3[]) f37108c.clone();
    }

    public abstract q b();

    public abstract q e();

    public abstract int g();

    public abstract int j();

    public abstract int k();

    public abstract int n();

    public abstract k3 o();
}
