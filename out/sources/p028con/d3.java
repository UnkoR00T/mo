package p028con;

import wq.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c3 f37100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z2 f37101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a3 f37102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b3 f37103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d3[] f37104f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37105a;

    static {
        c3 c3Var = new c3();
        f37100b = c3Var;
        z2 z2Var = new z2();
        f37101c = z2Var;
        a3 a3Var = new a3();
        f37102d = a3Var;
        b3 b3Var = new b3();
        f37103e = b3Var;
        d3[] d3VarArr = {c3Var, z2Var, a3Var, b3Var};
        f37104f = d3VarArr;
        b.a(d3VarArr);
    }

    public d3(String str, int i15, int i16) {
        super(str, i15);
        this.f37105a = i16;
    }

    public static d3 valueOf(String str) {
        return (d3) Enum.valueOf(d3.class, str);
    }

    public static d3[] values() {
        return (d3[]) f37104f.clone();
    }

    public abstract int b();
}
